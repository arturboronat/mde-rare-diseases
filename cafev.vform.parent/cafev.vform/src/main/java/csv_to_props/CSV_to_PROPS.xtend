package csv_to_props

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
import org.eclipse.emf.ecore.EcorePackage
import runtimeModel.AttributeValue
import runtimeModel.DynamicEObject
import runtimeModel.DynamicEObjectType
import runtimeModel.FeatureType
import runtimeModel.RuntimeModel
import runtimeModel.RuntimeModelPackage
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*

class CSV_to_PROPS extends YAMTLModule {
	val CSV = RuntimeModelPackage.eINSTANCE  
	val ECORE = EcorePackage.eINSTANCE 
	val JSON =  RuntimeModelPackage.eINSTANCE 
	
	new () {
		header().in('in', CSV).out('out', JSON)
		ruleStore( #[
			
			rule('root')
				.in('inModel', CSV.runtimeModel)
				.out('outModel', JSON.runtimeModel),

			rule('Object')
				.in('inOt', CSV.dynamicEObjectType)
				.out('outOt', JSON.dynamicEObjectType)[
					outOt.owningModel = inOt.owningModel.fetch as RuntimeModel
				],

			rule('attributeType')
				.in('inFt', CSV.featureType)

				.out('outObject', JSON.dynamicEObject)[
					outObject.type = inFt.owningObjectType.fetch as DynamicEObjectType
					
					outObject.owningModel = inFt.owningObjectType.owningModel.fetch as RuntimeModel
					
					outObject.set("name", inFt.name)
					
					val list = inFt.featureValues.map[it as AttributeValue].map[value].toList
					outObject.set("data", list)
					
					val types = newArrayList
					if(!inFt.isNumeric){
						if(list.size()>2 && list.size()<=10){
							types.add("select")
							types.add("search")
						}
						else if (list.size()<=2){
							types.add("select")
							types.add("checkbox")
						} else {
							types.add("search")
							types.add("select")
						}
					} else {
						types.add("select")
						types.add("range")
						types.add("number")
					}
					outObject.set("types", types)
					
					if (inFt.isNumeric) {
						val d = new DescriptiveStatistics()
						list.forEach[fv | d.addValue(fv.toDouble)]
						outObject.set("mean", d.mean)
						outObject.set("std", d.standardDeviation)
						outObject.set("min", d.min)
						outObject.set("max", d.max)
					}
				]
			
		])
		
	}
	
	
	
	def isNumeric(FeatureType inFt) {
		inFt.emfType == ECORE.EDouble || inFt.emfType == ECORE.EInt
		&& 
		inFt.featureValues.map[(it as AttributeValue).value].toSet.size > 1	
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def inFt() {
	  'inFt'.fetch() as FeatureType
	}
	def inOt() {
	  'inOt'.fetch() as DynamicEObjectType
	}
	def outOt() {
	  'outOt'.fetch() as DynamicEObjectType
	}
	def outObject() {
	  'outObject'.fetch() as DynamicEObject
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
