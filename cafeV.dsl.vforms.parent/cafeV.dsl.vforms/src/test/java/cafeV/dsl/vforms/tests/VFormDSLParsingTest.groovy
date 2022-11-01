package cafeV.dsl.vforms.tests

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtendWith
import com.google.inject.Inject
import cafeV.dsl.vforms.vformDSL.Model

@ExtendWith(InjectionExtension)
@InjectWith(VformDSLInjectorProvider)

class VFormDSLParsingTest {
	
	@Inject
	ParseHelper<Model> parseHelper
	@Test
	void testFormLayout() {
		def result = parseHelper.parse('''

		formLayout: vertical,
		formInputs: [
						{
							inputType: text,		
							inputName: "name"

						}	

				] 
		
		''')
		
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}
	
	@Test
	void testFormInputBasic() {
		def result = parseHelper.parse('''

		formLayout: horizontal,
		formInputs:[
				{
					inputType: text ,		
					inputName: "name"
				}
	
				{
					inputType: checkbox ,	
					inputName: "male"
				}
	
				{
					inputType: number ,		
					inputName: "Age"
				}
				
				{
					inputType: date ,		
					inputName: "date of Birth"
				}		

			]
		
		''')
		
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}
	
	@Test
	void testFormInputIntermediate() {
		def result = parseHelper.parse('''

		formLayout: horizontal,
		formInputs: [
		
			
			{
				inputType: select,
				inputName: "Age Group",
				options: {
					optionType: number,
						min: 0,
						max: 100,
						range: 10
				}
					
			}

			{
				inputType: select,
				inputName: "sex",
				options: {
					optionType: enum,
						data:[1 2]
				}
					
			} 	
			{
				inputType: select,
				inputName: "Gender",
				options: {
					optionType: data,
					data:[
							{
								label: "Girl",
								value: "girl"
							}
						
							{
								label: "Boy",
								value: "boy"
							}
						
						]
				}
							
			}
			
		
		]
		''')
		
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}
	
//	@Test
//	void testGroupInput() {
//		def result = parseHelper.parse('''
//
//		formLayout: horizontal,
//		formInputs:[
//
//				{
//					inputType: group ,
//					inputName: "demographics" ,
//					groupInputs: 
//						
//						{
//							inputType: text ,		
//							inputName: "name"
//						}
//							{
//							inputType: checkbox ,	
//							inputName: "male"
//						}
//			
//						{
//							inputType: number ,		
//							inputName: "Age"
//						}
//					
//								
//					
//				}	
//
//				
//
//			]
//			
//		''')
//		
//		Assertions.assertNotNull(result)
//		def errors = result.eResource().errors
//		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
//	}

}
