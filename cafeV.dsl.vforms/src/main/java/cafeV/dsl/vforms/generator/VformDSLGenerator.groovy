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
		text+=""" module.exports =  function getModel(){
        return { """
           
		text += traverse(model)
		
		text+="""
	       		}
		    }"""		
		
		File output = new File("src/main/resources/output.txt")
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
				
					text += """ formLayout: 'horizontal' """
				}
				else {
					text += """ formLayout: 'vertical' """
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
				 
				 text+="""]"""
				 break
			
				 case Text :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'text'
						},
						"""
				break
				
				case Checkbox :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'checkbox'
						},
						"""
				break
				
				case Number :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'number'
						},
						"""
				break
				
				case Dat :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'date'
						},
						"""
				break
				
				case Range :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'range',
							min: '${obj.min}',
							max: '${obj.max}'
						},
						"""
				break
				
				case Select :
				text += """
						{
							inputName:'${obj.inputName}',
							inputType: 'select'
							options:{
								
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
					}
				},"""
				break
				
				case DataOption :
				text += """
							optionType:'data',
							data:["""
				for(it in obj.data){
					text+= """{
						label:${it},
						value:${it}
						},"""
				}
				
				text+= """]"""
				break
			
					case EnumOption:
					text += """
								optionType:'enum',
								data:["""
					for(it in obj.data){
						text+= """'${it}'"""
					}
					
					text+= """]"""
				break
				
				case NumberOption:
					text += """
					optionType:'number',
					min: ${obj.min},
					max: ${obj.max},
					range: ${obj.range}
					"""
				break
			
					}
			text
	}

	
	
	
}

