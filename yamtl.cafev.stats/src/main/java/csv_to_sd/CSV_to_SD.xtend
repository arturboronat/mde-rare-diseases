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
				]
				.out('ct', DD.categoricalType) [
					m.types.add(ct)
					ct.name = ft.name
					ct.dataType = ECORE.EString
				],

			rule('NumericalType')
				.in('ft', CSV.featureType).filter[
					ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt
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
		}
		
	}
}
