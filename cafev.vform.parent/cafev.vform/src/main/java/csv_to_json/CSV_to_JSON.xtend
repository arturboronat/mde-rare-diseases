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
				.out('outModel', JSON.runtimeModel),

				rule('Object')
				.in('inFt', CSV.featureType).filter[inFt.name!="<group_end>"]
				.out('outOt', JSON.dynamicEObjectType)[
				val obj =RuntimeModelFactory.eINSTANCE.createDynamicEObject
					obj.owningModel = inFt.owningObjectType.owningModel.fetch as RuntimeModel
					obj.type = outOt
					outOt.owningModel = inFt.owningObjectType.owningModel.fetch as RuntimeModel
				
				],

				rule('attributeType')
				.in('inFt', CSV.featureType).filter[inFt.name!="<group_end>"]
				
				.out('outFtN', JSON.featureType) [				
					outFtN.name = "name"
					outFtN.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtN.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = new ArrayList<String>()
					list.add(inFt.name)
					att.value = list
					
				].out('outFtD', JSON.featureType) [				
					outFtD.name = "data"
					outFtD.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtD.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
						
						if(!inFt.isNumeric){
							
							att.value = list.toSet
						}else{
							att.value = list
						
						}
						
					
				].out('outFtT', JSON.featureType) [				
					outFtT.name = "types"
					outFtT.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtT.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val types = new ArrayList<String>()
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					
					if(!inFt.isNumeric){
						val l = list.toSet
						if(l.size()>2&&l.size()<=10){
						types.add("select")
						types.add("search")
						}
						else if(l.size()<=2){
							types.add("select")
							types.add("checkbox")
						}
						else{
							types.add("search")
							types.add("select")
						}
					}else{
						val d = new DescriptiveStatistics()
						for (fv: list) {
						d.addValue(fv.toDouble)
						}
						if((d.max-d.min)<100){
							types.add("range")
							types.add("select")
							types.add("number")
						}
						else{
							types.add("select")
							types.add("range")
							types.add("number")
						}	
						
					}
					
					att.value = types	
					
				]
				
				.out('outFtMe', JSON.featureType) [				
					if(inFt.isNumeric){
					outFtMe.name = "Mean"
					outFtMe.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtMe.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					val d = new DescriptiveStatistics()
					for (fv: list) {
						d.addValue(fv.toDouble)
						}
					val mean = new ArrayList<String>()
					mean.add(d.mean.toString)
					att.value = mean	
						
						
					}
				]
				
				.out('outFtMx', JSON.featureType) [				
					if(inFt.isNumeric){
					outFtMx.name = "Max"
					outFtMx.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtMx.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					val d = new DescriptiveStatistics()
					for (fv: list) {
						d.addValue(fv.toDouble)
						}
					val max = new ArrayList<String>()
					max.add(d.max.toString)
					att.value = max	
						
					
					}
				]
				
				.out('outFtMn', JSON.featureType) [				
					if(inFt.isNumeric){
					outFtMn.name = "Min"
					outFtMn.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtMn.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					val d = new DescriptiveStatistics()
					for (fv: list) {
						d.addValue(fv.toDouble)
						}
					val min = new ArrayList<String>()
					min.add(d.min.toString)
					att.value = min
						
					
					}
				]
				
				.out('outFtSd', JSON.featureType) [				
					if(inFt.isNumeric){
					outFtSd.name = "Std"
					outFtSd.owningObjectType = inFt.fetch as DynamicEObjectType
					val att = RuntimeModelFactory.eINSTANCE.createAttributeValue
					outFtSd.featureValues += att
					att.containingDynamicEObject = (inFt.fetch as DynamicEObjectType).instances.get(0)
					val list = inFt.featureValues.map[it as AttributeValue].map[value]
					val d = new DescriptiveStatistics()
					for (fv: list) {
						d.addValue(fv.toDouble)
						}
					val std = new ArrayList<String>()
					std.add(d.standardDeviation.toString)
					att.value = std
						
					
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
