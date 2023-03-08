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
import java.util.regex.Pattern
import java.util.ArrayList
import java.util.List
import java.util.Arrays
import dataDescription.FrequencyEntry

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
					isCategoricalType(ft)
				]
				.out('ct', DD.categoricalType) [
					m.types.add(ct)
					ct.name = ft.name
					ct.dataType = ft.getDataType
					ct.group = ft.groupEntities
					ct.frequencyTable+=ft.generateFrequencyTable
				],

			rule('NumericalType')
				.in('ft', CSV.featureType).filter[
					isNumericalType(ft)
				]
				.out('nt', DD.numericalType) [
					m.types.add(nt)
					nt.name = ft.name
					nt.group = ft.groupEntities
					nt.min = ft.stats.min
					nt.max = ft.stats.max
					nt.mean = ft.stats.mean
					nt.std = ft.stats.standardDeviation
					nt.frequencyTable += ft.generateFrequencyTable
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
			default: throw new Exception("Undefined")
		}
		
	}
	
	def groupEntities (FeatureType ft){
		
	val dnaSequence = Pattern.compile("[A-z]+[0-9]*[.][0-9]+[A-z]*([>]|[_])[A-z]+[0-9]*")
	val ontologies = Pattern.compile("[A-z]+[:][0-9]+[;]?")
	val demographics = Pattern.compile("sex|gender|height|weight|age|birth|Subject|patient|Gender")
					if(isNumericalType(ft)){
						if(demographics.matcher(ft.name).find()){
								return "DEMOGRAPHICS"
							}
							else{
								return "UNCLASSIFIED"
							}
					}else{
						val List<Integer> groups = Arrays.asList(0,0,0)
						val group = ft.featureValues.map[it as AttributeValue].groupBy[it.value]
						
						group.entrySet.forEach[  
			  
							if(dnaSequence.matcher(it.key.toString).find()){
								groups.set(0,groups.get(0)+1)
								
							}
							else if(ontologies.matcher(it.key.toString).find()){
								groups.set(1,groups.get(1)+1)
							}
							else {
								groups.set(2,groups.get(2)+1)
							}
							
						]
						
						if(groups.get(0)==0 && groups.get(1)==0){
							if(demographics.matcher(ft.name).find()){
								return "DEMOGRAPHICS"
							}
							else{
								return "UNCLASSIFIED"
							}
						}
						else{
							if(groups.get(0)>=groups.get(1)){
								return "DNA SEQUENCE"
							}
							else{
								return  "ONTOLOGIES"
							}
						}
					}
					
	}
	
	def isCategoricalType(FeatureType ft){
		ft.emfType == ECORE.EString||
					(
						(ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt) 
						&& 
						(
							ft.featureValues.map[(it as AttributeValue).value].toSet.size <= 1	
						)
					)
	}
	
	def isNumericalType(FeatureType ft){
		ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt
					&& 
					ft.featureValues.map[(it as AttributeValue).value].toSet.size > 1
	}

	def generateFrequencyTable(FeatureType ft){
		
		val table = new ArrayList<FrequencyEntry> 
		
		if(isNumericalType(ft)){
			val d = ft.stats
			var count = d.mean
			while(count<d.max) {
				count += d.standardDeviation
				val upperBound = count
				val lowerBound = count - d.standardDeviation
				val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
				entry.name = Double.toString(lowerBound)+" - "+Double.toString(upperBound)
				if(upperBound>= d.max){
					entry.name = "<"+Double.toString(lowerBound)
				}
				entry.frequency = ft.featureValues.map[it as AttributeValue].filter[ it.value.toDouble <= lowerBound || it.value.toDouble > upperBound ].size
				table += entry
			}
			
			count = d.mean
			var r = 1
			while(count>d.min) {
				count -= d.standardDeviation
				val upperBound = count + d.standardDeviation
				val lowerBound = count						
				val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
				if(lowerBound<=d.min) {
					r = 0;
				}
				entry.name = Double.toString(lowerBound*r)+" - "+Double.toString(upperBound)
				entry.frequency = ft.featureValues.map[it as AttributeValue].filter[ it.value.toDouble <= lowerBound || it.value.toDouble > upperBound ].size
				table.add(0,entry)
			}
			return table
		}
		else{
			val group = ft.featureValues.map[it as AttributeValue].groupBy[it.value]
			group.entrySet.forEach[  
							val entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry
							entry.name = it.key.toString
							entry.frequency = it.value.size
							table += entry 
							
						]
					return table
			}
		
	}
	
	def stats(FeatureType ft){
		val d = new DescriptiveStatistics()
		for (fv: ft.featureValues) {
			d.addValue((fv as AttributeValue).value.toDouble)
		}
		return d
	}
	
	def getDataType(FeatureType ft){
		val data = ft.featureValues.map[it as AttributeValue].groupBy[it.value]
		val date = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])([/]|[-])(0?[1-9]|1[012])([/]|[-])[0-9]{4}$")
		
						val  dateMatch = Arrays.asList(0)
						data.entrySet.forEach[
							if(date.matcher(it.key.toString).find()){
								dateMatch.set(0,dateMatch.get(0)+1)
							}
						]
						
						if(dateMatch.get(0)>0){
							return "Date"
						}
						else{
							return "String"
						}
	
	}
}