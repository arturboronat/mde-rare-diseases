package cafeV.dsl.vforms.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector
import cafeV.dsl.vforms.VformDSLStandaloneSetup
import cafeV.dsl.vforms.vformDSL.Model
import cafeV.dsl.vforms.vformDSL.Text
import cafeV.dsl.vforms.vformDSL.Checkbox
import cafeV.dsl.vforms.vformDSL.Number
import cafeV.dsl.vforms.vformDSL.Select
import cafeV.dsl.vforms.vformDSL.Dat
import cafeV.dsl.vforms.vformDSL.DataOption
import cafeV.dsl.vforms.vformDSL.NumberOption
import cafeV.dsl.vforms.vformDSL.EnumOption
import cafeV.dsl.vforms.vformDSL.Data
import cafeV.dsl.vforms.vformDSL.Range
import cafeV.dsl.vforms.vformDSL.Layout
import cafeV.dsl.vforms.vformDSL.FormInput
import cafeV.dsl.vforms.vformDSL.FormLayout
import cafeV.dsl.vforms.vformDSL.Group



class VformDSLGroovyGenerator {

	def static void main(String[] args) {
		
		
		// do this only once per application
		Injector injector = new VformDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/vforms1.vform"), true);
		
		Model model = resource.getContents().get(0)
		/**
		 * TODO: call your code generator
		 */
		String text = ''
		text += """
			<!doctype html>
			<html lang="en">
			  <head>
			    <meta charset="utf-8">
			    <meta name="viewport" content="width=device-width, initial-scale=1">
			    <title>VForms</title>
			    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
			  </head>
			  <body>
			<form>
			<div class="container">
			<div class="form-group row mt-5">
"""
           
		text += traverse(model)
		
		text+="""
		</div>		 
		</div>
		</form>
		 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
		  </body>
		</html>
		"""
		
		File output = new File("src/main/resources/output.html")
		if(output.exists()) {
			output.delete()
		}
		output.createNewFile()
		output << text
	}


	
	def static String traverse(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += traverse(obj)
		}
		text
	}
	
	
	def static String traverse(EObject obj) {
		String text = ''
		switch(obj) {
			
			case Model :
				if(obj.formLayout.layout ==Layout["horizontal"]){
				
					text += """"""
				}
				else {
					text += """"""
				}

				text+= traverse(obj.formInput)
				break
			
			case FormInput :
				 
				 if(obj.text!=null){
					 text+= traverse(obj.text)
					
				 }
				 
				 if(obj.checkbox!=null){
					 text+= traverse(obj.checkbox)
					
				 }
				 
				 if(obj.number!=null){
					 text+= traverse(obj.number)
					
				 }
				 
				 if(obj.dat!=null){
					 text+= traverse(obj.dat)
					
				 }
				 
				 if(obj.range!=null){
					 text+= traverse(obj.range)
					
				 }
				 
				 if(obj.select!=null){
					 text+= traverse(obj.select)
					
				 }
				 break
			
				 case Text :
				text += """
						<div class="col-sm-3 mb-2">
						    <input type="text" class="form-control" id="${obj.inputName}"  placeholder="Enter ${obj.inputName}">
				 	 	</div>
						"""
				break
				
				case Checkbox :
				text += """
						  <div class="col-sm-3 mb-2">
						    <input type="checkbox"  id="${obj.inputName}">
						    <label  for="${obj.inputName}">${obj.inputName}</label>
						  </div>
						"""
				break
				
				case Number :
				text += """
						<div class="col-sm-3 mb-2">
					  	<label for="${obj.inputName}">${obj.inputName}</label>  
						<input type="number" id="${obj.inputName}">
						  </div>
						"""
				break
				
				case Dat :
				text += """
						<div class=" col-sm-3  my-auto ">
						    <input type="date"" id="${obj.inputName}">
						    <label for="${obj.inputName}">${obj.inputName}</label>
						  </div>
						"""
				break
				
				case Range :
				text += """
						  <div class="col-sm-4 mb-2">
						    <label for="${obj.inputName}">${obj.inputName}</label>
						    <input type="range" class="form-control-range" id="${obj.inputName}">
						  </div>
						"""
				break
				
				case Select :
				text += """
				  <div class="col-sm-2 mb-2">
				    <label for="${obj.inputName}">${obj.inputName}</label>
				    <select class="form-control" id="${obj.inputName}">
				"""
				
				if(obj.dataOption!=null){
					text+= traverse(obj.dataOption)
				   
				}
				
				if(obj.enumOption!=null){
					text+= traverse(obj.enumOption)
				   
				}
				
				if(obj.numberOption!=null){
					text+= traverse(obj.numberOption)
				   
				}
				
				text+= """
				    </select>
				</div>
						"""
				break
				
				case DataOption :
		
				for(it in obj.data){
					if(it.strVal!=null) {
					text+= """ <option>${it.strVal}</option>"""
					}
					else {
						text+= """ <option>${it.intVal}</option>"""
					}
					
				}
				break
			
				case EnumOption:
				if(obj.numberData!=null) {
					for(it in obj.numberData){
						text+= """ <option>${it}</option>"""
					}
				}
				else {
					for(it in obj.stringData){
						text+= """ <option>${it}</option>"""
				
						}
				}
				break
				
				case NumberOption:
				for(int i=0; i<obj.max; i+=obj.range) {
					text+= """ <option>${i}</option>"""
					}

				break
				
				case Group:
					text+= """<div> 
							<h1 class="py-3 border-2 border-primary">${obj.inputName}</h1>
						"""
						text+=traverse(obj.groupInputs)
					
					text+="""</div>"""
			
					}
			text
	}

	
	
	
}

