package csv_to_props


class PropsCompiler {
	def compile(String DATASET) {
		var String inputCsvPath = DATASET+".csv"

		
		val xform = new CSV_to_PROPS

		// PREPARE MODELS
		// Parses a CSV file and stores it as a runtime model in the YAMTL registry
		xform.parseCsvTable('in', inputCsvPath)
		
		// EXECUTE TRAFO 
		xform.execute()
		xform.saveOutputModels(#{'out'->DATASET+'_props.json'})
	
		//println(xform.toJson('out'))
		
	}
}