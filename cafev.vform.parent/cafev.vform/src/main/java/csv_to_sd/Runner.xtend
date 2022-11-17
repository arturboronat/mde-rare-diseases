package csv_to_sd

import csv_to_sd.CSV_to_SD

class Runner {
	def public static void main(String[] args) {
		var String inputCsvPath = '''src/main/resources/datasets/Mock_data.csv'''
//		var String inputCsvPath = '''src/main/resources/datasets/Rett_Datacleaned.csv'''
		
		val xform = new CSV_to_SD

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.parseCsvTable('csv', inputCsvPath)
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/csv_to_sd/mockData_stats.xmi'''
//		var String outputModelPath = '''src/main/java/csv_to_sd/rettData_stats.xmi'''
		xform.saveOutputModels(#{'dd' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
		
		// GENERATE BOlIERPLATE CODE
		// println(xform.generateBoilerplateCode())
	}
}