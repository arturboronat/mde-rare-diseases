package csv_to_props


class PropsCompiler {
	def static compile(String filePath) {
		var String inputCsvPath = filePath

		
		val xform = new CSV_to_PROPS

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.importUntypedModelFromCsvFile('in', inputCsvPath, true)
		
		// EXECUTE TRAFO 
		xform.execute()
		xform.saveOutputModels(#{'out'-> filePath+'_props.json'})
	
		xform.exportUntypedModelToJson('out')
	}
	
	def static void main(String... args) {
		var datasetPath = 'src/main/resources/datasets/Mock_data.csv'
		println(compile(datasetPath))
		
	}
}