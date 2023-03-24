//package csv_to_sd
//
//import csv_to_vform.VFormUtil
//import dataDescription.CategoricalType
//import dataDescription.DataDescriptionFactory
//import dataDescription.DataDescriptionPackage
//import dataDescription.FrequencyEntry
//import dataDescription.NumericalType
//import dataDescription.StatsDataModel
//import java.util.ArrayList
//import java.util.Arrays
//import java.util.List
//import java.util.regex.Pattern
//import org.eclipse.emf.ecore.EcorePackage
//import untypedModel.FeatureType
//import untypedModel.UntypedModelPackage
//import yamtl.core.YAMTLModule
//
//import static yamtl.dsl.Rule.*
//
//class CSV_to_SD extends YAMTLModule {
//	val ECORE = EcorePackage.eINSTANCE
//	val CSV = UntypedModelPackage.eINSTANCE
//	val DD = DataDescriptionPackage.eINSTANCE
//
//	val extension VFormUtil util = new VFormUtil()
//
//	new() {
//		header().in('csv', CSV).out('dd', DD)
//		ruleStore(#[
//			rule('StatsDataModel').in('m', CSV.untypedModel).out('dm', DD.statsDataModel),
//			rule('CategoricalType').in('ft', CSV.featureType).filter [
//				!isNumeric(ft)
//			].out('ct', DD.categoricalType) [
//				m.types.add(ct)
//				ct.name = ft.name
//				ct.dataType = ft.emfType.name
//				ct.group = ft.groupEntities
//				ct.frequencyTable += ft.generateFrequencyTable
//			],
//			rule('NumericalType').in('ft', CSV.featureType).filter [
//				isNumeric(ft)
//			].out('nt', DD.numericalType) [
//				m.types.add(nt)
//				nt.name = ft.name
//				nt.group = ft.groupEntities
//				nt.min = ft.stats.min
//				nt.max = ft.stats.max
//				nt.mean = ft.stats.mean
//				nt.std = ft.stats.standardDeviation
//				nt.frequencyTable += ft.generateFrequencyTable
//			]
//		])
//	}
//
//	/**
//	 * HELPERS: generated with runner.generateBoilerplateCode()
//	 */
//
//	def ft() {
//		'ft'.fetch() as FeatureType
//	}
//
//	def ct() {
//		'ct'.fetch() as CategoricalType
//	}
//
//	def nt() {
//		'nt'.fetch() as NumericalType
//	}
//
//	def m() {
//		ft.owner.owner.fetch as StatsDataModel
//	}
//
//
//
//	def groupEntities(FeatureType ft) {
//
//		val dnaSequence = Pattern.compile("[A-z]+[0-9]*[.][0-9]+[A-z]*([>]|[_])[A-z]+[0-9]*")
//		val ontologies = Pattern.compile("[A-z]+[:][0-9]+[;]?")
//		val demographics = Pattern.compile("sex|gender|height|weight|age|birth|Subject|patient|Gender")
//		if (isNumeric(ft)) {
//			if (demographics.matcher(ft.name).find()) {
//				return "DEMOGRAPHICS"
//			} else {
//				return "UNCLASSIFIED"
//			}
//		} else {
//			val List<Integer> groups = Arrays.asList(0, 0, 0)
//			val group = ft.fieldValues.groupBy[it]
//
//			group.entrySet.forEach [
//
//				if (dnaSequence.matcher(it.key.toString).find()) {
//					groups.set(0, groups.get(0) + 1)
//
//				} else if (ontologies.matcher(it.key.toString).find()) {
//					groups.set(1, groups.get(1) + 1)
//				} else {
//					groups.set(2, groups.get(2) + 1)
//				}
//
//			]
//
//			if (groups.get(0) == 0 && groups.get(1) == 0) {
//				if (demographics.matcher(ft.name).find()) {
//					return "DEMOGRAPHICS"
//				} else {
//					return "UNCLASSIFIED"
//				}
//			} else {
//				if (groups.get(0) >= groups.get(1)) {
//					return "DNA SEQUENCE"
//				} else {
//					return "ONTOLOGIES"
//				}
//			}
//		}
//
//	}
//	
//
//	
//
//	
//
//	def generateFrequencyTable(FeatureType ft) {
//
//		val table = new ArrayList<FrequencyEntry>
//
//		if (isNumeric(ft)) {
//			val d = ft.stats
//			var count = d.mean
//			while (count < d.max) {
//				count += d.standardDeviation
//				val upperBound = count
//				val lowerBound = count - d.standardDeviation
//				val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
//				entry.name = Double.toString(lowerBound) + " - " + Double.toString(upperBound)
//				if (upperBound >= d.max) {
//					entry.name = "<" + Double.toString(lowerBound)
//				}
//				entry.frequency = ft.fieldValues.filter [
//					val value = Double.parseDouble(it.toString)
//					value <= lowerBound || value > upperBound
//				].size
//				table += entry
//			}
//
//			count = d.mean
//			var r = 1
//			while (count > d.min) {
//				count -= d.standardDeviation
//				val upperBound = count + d.standardDeviation
//				val lowerBound = count
//				val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
//				if (lowerBound <= d.min) {
//					r = 0;
//				}
//				entry.name = Double.toString(lowerBound * r) + " - " + Double.toString(upperBound)
//				entry.frequency = ft.fieldValues.filter [ 
//					val value = Double.parseDouble(it.toString)
//					value <= lowerBound || value > upperBound
//				].size
//				table.add(0, entry)
//			}
//			return table
//		} else {
//			val group = ft.fieldValues.groupBy[it]
//			group.entrySet.forEach [
//				val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
//				entry.name = it.key.toString
//				entry.frequency = it.value.size
//				table += entry
//
//			]
//			return table
//		}
//
//	}
//
//
//}
