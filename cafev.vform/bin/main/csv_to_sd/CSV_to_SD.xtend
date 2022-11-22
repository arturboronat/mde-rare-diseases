package csv_to_sd

import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
import org.eclipse.emf.ecore.EcorePackage
import runtimeModel.AttributeValue
import runtimeModel.FeatureType
import runtimeModel.RuntimeModelPackage
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*
import dataDescription.DataDescriptionFactory

class CSV_to_SD extends YAMTLModule {
	val ECORE = EcorePackage.eINSTANCE  
	val CSV = RuntimeModelPackage.eINSTANCE  
	val DD = DataDescriptionPackage.eINSTANCE  
	new () {
		header().in('csv', CSV).out('dd', DD)
		ruleStore( #[
			
			rule('StatsDataModel')
				.in('m', CSV.runtimeModel)
				.out('dm', DD.statsDataModel),
				
			rule('CategoricalType')
				.in('ft', CSV.featureType).filter[
					ft.emfType == ECORE.EString 
					||
					(
						(ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt) 
						&& 
						(
							ft.featureValues.map[(it as AttributeValue).value].toSet.size <= 1	
						)
					)
				]
				.out('ct', DD.categoricalType) [
					m.types.add(ct)
					ct.name = ft.name
					ct.dataType = ECORE.EString
					val group = ft.featureValues.map[it as AttributeValue].groupBy[it.value]
					group.entrySet.forEach[  
						val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
						entry.name = it.key.toString
						entry.frequency = it.value.size
						ct.frequencyTable += entry 
					]
				],

			rule('NumericalType')
				.in('ft', CSV.featureType).filter[
					ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt
					&& 
					ft.featureValues.map[(it as AttributeValue).value].toSet.size > 1	
				]
				.out('nt', DD.numericalType) [
					m.types.add(nt)
					nt.name = ft.name

					// compute stats					
					val d = new DescriptiveStatistics()
					for (fv: ft.featureValues) {
						d.addValue((fv as AttributeValue).value.toDouble)
					}
					nt.min = d.min
					nt.max = d.max
					nt.mean = d.mean
					nt.std = d.standardDeviation
					
					var lowerBound_ = d.mean
					var upperBound_ = d.mean + d.standardDeviation
					while(lowerBound_ < d.max) {
						lowerBound_ += d.standardDeviation
						upperBound_ += d.standardDeviation
						
						val lowerBound = lowerBound_
						val upperBound = upperBound_
						
						val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
						entry.name = ''']«lowerBound», «upperBound»]'''
						entry.frequency = ft.featureValues.map[it as AttributeValue].filter[ it.value.toDouble >= lowerBound || it.value.toDouble < upperBound ].size
						nt.frequencyTable += entry
					}
					
					lowerBound_ = d.mean - d.standardDeviation
					upperBound_ = d.mean
					while(upperBound_ > d.min) {
						lowerBound_ -= d.standardDeviation
						upperBound_ -= d.standardDeviation
						
						val lowerBound = lowerBound_
						val upperBound = upperBound_

						val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
						entry.name = ''']«lowerBound», «upperBound»]'''
						entry.frequency = ft.featureValues.map[it as AttributeValue].filter[ it.value.toDouble >= lowerBound || it.value.toDouble < upperBound ].size
						nt.frequencyTable += entry
					}
				]
				
		])
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def att() {
	  'att'.fetch() as AttributeValue
	}
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
		ft.owningObjectType.owningModel.fetch as StatsDataModel
	}
	
	def toDouble(Object i) {
		switch(i) {
			Integer: return Double.valueOf(i)
			Double: return i
			default: {
				throw new Exception("Undefined: " + i.toString)
			}
		}
		
	}
}
