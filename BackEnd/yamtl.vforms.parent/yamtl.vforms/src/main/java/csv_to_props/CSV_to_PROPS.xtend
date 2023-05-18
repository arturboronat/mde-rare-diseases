package csv_to_props

import csv_to_vform.VFormUtil
import untypedModel.ERecord
import untypedModel.FeatureType
import untypedModel.UntypedModel
import untypedModel.UntypedModelPackage
import yamtl.core.YAMTLModule

import static yamtl.dsl.Rule.*

class CSV_to_PROPS extends YAMTLModule {
	val CSV = UntypedModelPackage.eINSTANCE  
	val JSON =  UntypedModelPackage.eINSTANCE 
	
	val extension VFormUtil util = new VFormUtil()
	
	new () {
		header().in('in', CSV).out('out', JSON)
		ruleStore( #[
			
			rule('root')
				.in('inModel', CSV.untypedModel)
				.out('outModel', JSON.untypedModel),

			rule('numerical-feature')
				.in('inFt', CSV.featureType).filter[
					inFt.name!="<group_end>" // TODO: do we need this?
					&&
					inFt.isNumeric
				]

				.out('outObj', JSON.ERecord)[
					outObj.__parent = inFt.owner.owner.fetch as UntypedModel
					
					outObj.set("name", inFt.name)
					outObj.set("data", inFt.fieldValues.toList) 
					outObj.set("Mean", inFt.stats.mean)
					outObj.set("Max", inFt.stats.max.toString)
					outObj.set("Min", inFt.stats.min.toString)
					outObj.set("Std", inFt.stats.standardDeviation.toString)
					outObj.set("types", #["range", "select", "digit"])
					
				],
									
			rule('non-numerical-feature')
				.in('inFt', CSV.featureType).filter[
					inFt.name!="<group_end>"
					&&
					!inFt.isNumeric
				]

				.out('outObj', JSON.ERecord)[
					outObj.__parent = inFt.owner.owner.fetch as UntypedModel
					
					outObj.set("name", inFt.name)
					outObj.set("data", inFt.fieldValues.toList)
					if (inFt.fieldValues.toSet.size <= 2)
						outObj.set("types", #["select", "checkbox"])
					else
						outObj.set("types", #["select", "search"])

				]	
									
		])
		
	}
	

	
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def outObj() {
	  'outObj'.fetch() as ERecord
	}
	def inFt() {
	  'inFt'.fetch() as FeatureType
	}
	
	
}
