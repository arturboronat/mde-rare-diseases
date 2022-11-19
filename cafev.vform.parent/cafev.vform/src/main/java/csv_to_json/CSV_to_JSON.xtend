package csv_to_json

import java.util.List
import org.eclipse.emf.ecore.EcorePackage
import runtimeModel.AttributeValue
import runtimeModel.ContainmentValue
import runtimeModel.DynamicEObject
import runtimeModel.DynamicEObjectType
import runtimeModel.FeatureType
import runtimeModel.RuntimeModel
import runtimeModel.RuntimeModelPackage
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*
import runtimeModel.RuntimeModelFactory

class CSV_to_JSON extends YAMTLModule {
	val CSV = RuntimeModelPackage.eINSTANCE  
	val ECORE = EcorePackage.eINSTANCE  
	
	new () {
		header().in('in', CSV).out('out', CSV)
		ruleStore( #[
			
			rule('root')
				.in('inModel', CSV.runtimeModel)
				.out('outModel', CSV.runtimeModel),
				
			rule('ObjectType')
				.in('inOt', CSV.dynamicEObjectType)
				.out('outOt', CSV.dynamicEObjectType)[
					val obj = RuntimeModelFactory.eINSTANCE.createDynamicEObject
					obj.owningModel = inOt.owningModel.fetch as RuntimeModel
					obj.type = outOt
					outOt.owningModel = inOt.owningModel.fetch as RuntimeModel
				],
				
			rule('FeatureType')
				.in('inFt', CSV.featureType).filter[
					inFt.isNumeric
				]
				.out('outFt', CSV.featureType) [
					outFt.name = inFt.name
					outFt.owningObjectType = inFt.owningObjectType.fetch as DynamicEObjectType
					
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFt.featureValues += att
					att.containingDynamicEObject = (inFt.owningObjectType.fetch as DynamicEObjectType).instances.get(0)
					
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					att.value = list
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
	def att() {
	  'att'.fetch() as AttributeValue
	}
	def inObj() {
	  'inObj'.fetch() as DynamicEObject
	}
	def outObj() {
	  'outObj'.fetch() as DynamicEObject
	}
	def inFt() {
	  'inFt'.fetch() as FeatureType
	}
	def outFt() {
	  'outFt'.fetch() as FeatureType
	}
	def inOt() {
	  'inOt'.fetch() as DynamicEObjectType
	}
	def outOt() {
	  'outOt'.fetch() as DynamicEObjectType
	}
	def inAtt() {
	  'inAtt'.fetch() as AttributeValue
	}
	def outAtt() {
	  'outAtt'.fetch() as AttributeValue
	}
	def inCont() {
	  'inCont'.fetch() as ContainmentValue
	}
	def outCont() {
	  'outCont'.fetch() as ContainmentValue
	}
	def inModel() {
		'inModel'.fetch() as RuntimeModel
	}
	def outModel() {
		'outModel'.fetch() as RuntimeModel
	}
}
