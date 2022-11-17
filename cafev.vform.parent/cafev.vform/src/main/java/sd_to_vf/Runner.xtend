package sd_to_vf

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.serializer.impl.Serializer

class Runner {
	def static void main(String[] args) {
		var String inputModelPath = '''src/main/java/csv_to_sd/rettData_stats.xmi'''
		
//		val xform = new statsModel2VForm
		val xform = new sd2vf

		// PREPARE MODELS
		xform.loadInputModels(#{'dd' -> inputModelPath})
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/sd_to_vf/rettData_vform.xmi'''
		xform.saveOutputModels(#{'vf' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
		
//		// GENERATE BOlIERPLATE CODE
//		 println(xform.generateBoilerplateCode())

	}
}