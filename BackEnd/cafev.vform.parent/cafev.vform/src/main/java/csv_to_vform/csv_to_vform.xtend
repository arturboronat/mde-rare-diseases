package csv_to_vform

import cafev.vform.VFormDslStandaloneSetup
import com.google.inject.Injector
import csv_to_sd.CSV_to_SD
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import sd_to_vf.sd2vf
import java.io.File

class csv_to_vform {
	def compile(String DATASET) {
//		var DATASET = "Mock_data"
//		var DATASET = "Rett_Datacleaned"
		var String inputCsvPath = DATASET+".csv"
		
		/*
		 * CSV to DataDescription 
		 */
		val csv2sdModule = new CSV_to_SD
		csv2sdModule.parseCsvTable('csv', inputCsvPath)
		csv2sdModule.execute()
		var String outputModelPath = DATASET+".xmi"
		csv2sdModule.saveOutputModels(#{'dd' -> outputModelPath})
		
		
		/*
		 * DataDescription TO VFormDsl
		 */
		val sd2vfModule = new sd2vf
		val editFile  = new File (DATASET+"_edit.json")
		val createFile  = new File (DATASET+"_create.json")
		if(editFile.exists()){
			sd2vfModule.loadEditProperties(DATASET+"_edit.json") // edit properties
		}
		else{
			sd2vfModule.loadEditProperties("noFile") // edit properties
		}
		if(createFile.exists()){
			sd2vfModule.loadCreateProperties(DATASET+"_create.json") // edit properties
		}
		else{
			sd2vfModule.loadCreateProperties("noFile") // edit properties
		}
		sd2vfModule.loadInputModels(#{'dd' -> outputModelPath})
		sd2vfModule.execute()
		var String outputVFormPath = DATASET+"_vform.xmi"
		sd2vfModule.saveOutputModels(#{'vf' -> outputVFormPath})
		
		/*
		 * SERIALIZE MODEL
		 */
		val Injector injector = new VFormDslStandaloneSetup().
		createInjectorAndDoEMFRegistration();
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val Resource resource = resourceSet.createResource(URI.createURI(DATASET+".vform"));
		val modelRes = sd2vfModule.getOutputModel('vf')
		resource.contents.addAll(modelRes.contents)
		resource.save(null)
	}

	def static void main(String[]  args) {
		var DATASET = "Mock_data"
//		var DATASET = "Rett_Datacleaned"
		var String inputCsvPath = "src/main/resources/datasets/"+DATASET+".csv"
		
		/*
		 * CSV to DataDescription 
		 */
		val csv2sdModule = new CSV_to_SD
		csv2sdModule.parseCsvTable('csv', inputCsvPath)
		csv2sdModule.execute()
		var String outputModelPath = "src/main/resources/datasets/"+DATASET+".xmi"
		csv2sdModule.saveOutputModels(#{'dd' -> outputModelPath})
		
		
		/*
		 * DataDescription TO VFormDsl
		 */
		val sd2vfModule = new sd2vf
		val editFile  = new File (DATASET+"_edit.json")
		val createFile  = new File (DATASET+"_create.json")
		if(editFile.exists()){
			sd2vfModule.loadEditProperties(DATASET+"_edit.json") // edit properties
		}
		else{
			sd2vfModule.loadEditProperties("noFile") // edit properties
		}
		if(createFile.exists()){
			sd2vfModule.loadCreateProperties(DATASET+"_create.json") // edit properties
		}
		else{
			sd2vfModule.loadCreateProperties("noFile") // edit properties
		}
		sd2vfModule.loadInputModels(#{'dd' -> outputModelPath})
		sd2vfModule.execute()
		var String outputVFormPath = "src/main/resources/datasets/"+DATASET+"_vform.xmi"
		sd2vfModule.saveOutputModels(#{'vf' -> outputVFormPath})
		
		/*
		 * SERIALIZE MODEL
		 */
		val Injector injector = new VFormDslStandaloneSetup().
		createInjectorAndDoEMFRegistration();
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val Resource resource = resourceSet.createResource(URI.createURI("src/main/resources/datasets/"+DATASET+".vform"));
		val modelRes = sd2vfModule.getOutputModel('vf')
		resource.contents.addAll(modelRes.contents)
		resource.save(null)
	}
}