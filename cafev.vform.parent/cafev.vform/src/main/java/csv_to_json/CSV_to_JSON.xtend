package csv_to_json
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
import java.util.ArrayList
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics

class CSV_to_JSON extends YAMTLModule {
	val CSV = RuntimeModelPackage.eINSTANCE  
	val ECORE = EcorePackage.eINSTANCE 
	val JSON =  RuntimeModelPackage.eINSTANCE 
	
	new () {
		header().in('in', CSV).out('out', JSON)
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
	def outFtN() {
	  'outFtN'.fetch() as FeatureType
	}
	def outFtT() {
	  'outFtT'.fetch() as FeatureType
	}
	def outFtD() {
	  'outFtD'.fetch() as FeatureType
	}
	def outFtMe() {
	  'outFtMe'.fetch() as FeatureType
	}
	def outFtMx() {
	  'outFtMx'.fetch() as FeatureType
	}
	def outFtMn() {
	  'outFtMn'.fetch() as FeatureType
	}
	def outFtSd() {
	  'outFtSd'.fetch() as FeatureType
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
