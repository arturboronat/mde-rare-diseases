package csv_to_props

import csv_to_props.csv2props

class Runner {
	def public static void main(String[] args) {
		var String inputCsvPath = '''src/main/resources/datasets/Mock_data.csv'''
//		var String inputCsvPath = '''src/main/resources/datasets/Rett_Datacleaned.csv'''
		
		val xform = new csv2props

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.parseCsvTable('csv', inputCsvPath)
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/csv_to_props/mockData_props.xmi'''
//		var String outputModelPath = '''src/main/java/csv_to_props/rettData_props.xmi'''
		xform.saveOutputModels(#{'up' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
		
		// GENERATE BOlIERPLATE CODE
		// println(xform.generateBoilerplateCode())
	}
}