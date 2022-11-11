package sd2vf

class Runner {
	def public static void main(String[] args) {
		var String inputModelPath = '''src/main/resources/metamodels/StatsDataModel.xmi'''
		
//		val xform = new statsModel2VForm
		val xform = new sd2vf

		// PREPARE MODELS
		xform.loadInputModels(#{'dd' -> inputModelPath})
		
		// EXECUTE TRAFO 
		xform.execute()
		
		// STORE MODELS
		var String outputModelPath = '''src/main/java/sd2vf/targetInitial.xmi'''
		xform.saveOutputModels(#{'vf' -> outputModelPath})
		
		// PRINT STATS
		println(xform.toStringStats)
		
		// GENERATE BOlIERPLATE CODE
		// println(xform.generateBoilerplateCode())
	}
}