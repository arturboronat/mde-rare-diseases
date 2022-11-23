package csv_to_props


class Runner {
	def public static void main(String[] args) {
		var String inputCsvPath = '''src/main/resources/datasets/Mock_data.csv'''
//		var String inputCsvPath = '''src/main/resources/datasets/Rett_Datacleaned.csv'''
		
		val xform = new CSV_to_PROPS

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.parseCsvTable('in', inputCsvPath)
		
		// EXECUTE TRAFO 
		xform.execute()
		xform.saveOutputModels(#{'out'->'src/main/java/csv_to_json/mock_data.json'})
	
		println(xform.toJson('out'))
		
	}
}