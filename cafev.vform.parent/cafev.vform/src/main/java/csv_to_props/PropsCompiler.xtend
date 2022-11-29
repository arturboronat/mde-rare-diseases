package csv_to_props


class PropsCompiler {
	def static void main(String[] args) {
		val DATASET = "Mock_data"
		var String inputCsvPath = "src/main/resources/datasets/"+DATASET+".csv"

		
		val xform = new CSV_to_PROPS

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.parseCsvTable('in', inputCsvPath)
		
		// EXECUTE TRAFO 
		xform.execute()
		xform.saveOutputModels(#{'out'-> "src/main/java/csv_to_props/"+DATASET+'_props.json'})
	
		//println(xform.toJson('out'))
		
	}
}