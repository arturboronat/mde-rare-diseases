package csv_to_sd

import csv_to_vform.VFormUtil
import dataDescription.CategoricalType
import dataDescription.DataDescriptionFactory
import dataDescription.DataDescriptionPackage
import dataDescription.FrequencyEntry
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EcorePackage
import untypedModel.FeatureType
import untypedModel.UntypedModelPackage
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*
import java.util.Map
import java.util.Collections

class CSV_to_SD extends YAMTLModule {
	val ECORE = EcorePackage.eINSTANCE
	val CSV = UntypedModelPackage.eINSTANCE
	val DD = DataDescriptionPackage.eINSTANCE

	val extension VFormUtil util = new VFormUtil()

	new() {
		header().in('csv', CSV).out('dd', DD)
		ruleStore(#[
			rule('StatsDataModel').in('m', CSV.untypedModel).out('dm', DD.statsDataModel),
			rule('CategoricalType').in('ft', CSV.featureType).filter [
				!isNumeric(ft) && ft.name!="<group_end>" 
			].out('ct', DD.categoricalType) [
				m.types.add(ct)
				ct.name = ft.name
				ct.dataType = ft.emfType.name
				ct.group = ft.groupEntities
				val group = ft.fieldValues.groupBy[it] 
				group.entrySet.forEach[e | 
					ct.frequencyTable += ft.fetch("fe", "Category_FrequencyTable", 
						#{"name" -> e.key.toString, "frequency" -> e.value.size}
					) as FrequencyEntry
				]
			],
			rule('NumericalType').in('ft', CSV.featureType).filter [
				isNumeric(ft)
			].out('nt', DD.numericalType) [
				m.types.add(nt)
				nt.name = ft.name
				nt.group = ft.groupEntities
				nt.min = ft.stats.min
				nt.max = ft.stats.max
				nt.mean = ft.stats.mean
				nt.std = ft.stats.standardDeviation
				
				val d = ft.stats
				var count = (((d.max - d.mean)/d.standardDeviation) + 1) as int
				(1..count).forEach[
					nt.frequencyTable += ft.fetch("fe", "FrequencyTable_upper", #{"count" -> it}) as FrequencyEntry
				]  
				count = (((d.mean - d.min)/d.standardDeviation) + 1) as int
				(1..count).forEach[
					nt.frequencyTable += ft.fetch("fe", "FrequencyTable_lower", #{"count" -> it}) as FrequencyEntry
				]
			],
			
			
			rule('FrequencyTable_upper').lazy
				.in('ft', CSV.featureType)
				.out('fe', DD.frequencyEntry) [
					val count = 'count'.fetch as Integer
					val upperBound = (ft.stats.mean + ft.stats.standardDeviation * count)
					val lowerBound = (ft.stats.mean + ft.stats.standardDeviation * (count-1))
					fe.name = Double.toString(lowerBound) + " - " + Double.toString(upperBound)
					if (upperBound >= ft.stats.max) {
						fe.name = Double.toString(lowerBound) + " (>)"
					}
					fe.frequency = ft.fieldValues.filter [
						val value = Double.parseDouble(it.toString)
						value <= lowerBound || value > upperBound
					].size
					
				],
			
			rule('FrequencyTable_lower').lazy
				.in('ft', CSV.featureType)
				.out('fe', DD.frequencyEntry) [
					val count = 'count'.fetch as Integer
					val lowerBound = (ft.stats.mean - ft.stats.standardDeviation * count)
					val upperBound = (ft.stats.mean - ft.stats.standardDeviation * (count-1))
					fe.name = Double.toString(lowerBound) + " - " + Double.toString(upperBound)
					if (lowerBound < ft.stats.min) {
						fe.name = Double.toString(upperBound) + " (<)"
					}
					fe.frequency = ft.fieldValues.filter [
						val value = Double.parseDouble(it.toString)
						value <= lowerBound || value > upperBound
					].size

				],
				
			rule('Category_FrequencyTable').lazy
				.in('ft', CSV.featureType)
				.out('fe', DD.frequencyEntry) [
					fe.name = "name".fetch as String
					fe.frequency = "frequency".fetch as Integer
				]
			
			
		])
	}

	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */

	def ft() {
		'ft'.fetch() as FeatureType
	}

	def ct() {
		'ct'.fetch() as CategoricalType
	}

	def nt() {
		'nt'.fetch() as NumericalType
	}

	def m() {
		ft.owner.owner.fetch as StatsDataModel
	}

	def fe() {
		'fe'.fetch as FrequencyEntry
	}

	def groupEntities(FeatureType ft) {

		val dnaSequence = Pattern.compile("[A-z]+[0-9]*[.][0-9]+[A-z]*([>]|[_])[A-z]+[0-9]*")
		val ontologies = Pattern.compile("[A-z]+[:][0-9]+[;]?")
		val demographics = Pattern.compile("sex|gender|height|weight|age|birth|Subject|patient|Gender")
		if (isNumeric(ft)) {
			if (demographics.matcher(ft.name).find()) {
				return "DEMOGRAPHICS"
			} else {
				return "UNCLASSIFIED"
			}
		} else {
			val List<Integer> groups = Arrays.asList(0, 0, 0)
			val group = ft.fieldValues.groupBy[it]

			group.entrySet.forEach [

				if (dnaSequence.matcher(it.key.toString).find()) {
					groups.set(0, groups.get(0) + 1)

				} else if (ontologies.matcher(it.key.toString).find()) {
					groups.set(1, groups.get(1) + 1)
				} else {
					groups.set(2, groups.get(2) + 1)
				}

			]

			if (groups.get(0) == 0 && groups.get(1) == 0) {
				if (demographics.matcher(ft.name).find()) {
					return "DEMOGRAPHICS"
				} else {
					return "UNCLASSIFIED"
				}
			} else {
				if (groups.get(0) >= groups.get(1)) {
					return "DNA SEQUENCE"
				} else {
					return "ONTOLOGIES"
				}
			}
		}

	}

}
