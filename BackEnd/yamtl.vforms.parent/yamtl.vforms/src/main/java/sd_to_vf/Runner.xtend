package sd_to_vf

import yamtl.vforms.VFormsDslStandaloneSetup
import yamtl.vforms.vFormsDsl.Model
import com.google.inject.Injector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class Runner {
	def static void main(String[] args) {
		var String inputModelPath = '''src/main/java/sd_to_vf/rettData_stats.xmi'''
		
//		val xform = new statsModel2VForm
		val xform = new sd2vf

		// PREPARE MODELS
		xform.loadInputModels(#{'dd' -> inputModelPath})
		xform.importUntypedModelFromJsonFile('edit', '''src/main/java/sd_to_vf/edit.json''')
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/sd_to_vf/rettData_vform.xmi'''
		xform.saveOutputModels(#{'vf' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
		
//		// GENERATE BOlIERPLATE CODE
//		 println(xform.generateBoilerplateCode())

		
		
		val Injector injector = new VFormsDslStandaloneSetup().
		createInjectorAndDoEMFRegistration();
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption
		 (XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		val Resource resource = resourceSet.getResource
//		 (URI.createURI("/path/to/my.entities"), true);
//		Model model = (Model) resource.getContents().get(0);
		val Resource resource = resourceSet.createResource(URI.createURI("src/main/java/sd_to_vf/test.vform"));
//		Model model = (Model) resource.getContents().get(0);
		val modelRes = xform.getOutputModel('vf')
		resource.contents.addAll(modelRes.contents)
		resource.save(null)
	}
}