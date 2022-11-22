package csv_to_props

import cafev.vform.uiProps.PropsModel
import cafev.vform.uiProps.CategoricalProps
import cafev.vform.uiProps.NumericalProps
import cafev.vform.uiProps.UiPropsPackage
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
import org.eclipse.emf.ecore.EcorePackage
import runtimeModel.AttributeValue
import runtimeModel.FeatureType
import runtimeModel.RuntimeModelPackage
import yamtl.core.YAMTLModule
import static yamtl.dsl.Rule.*
import java.util.ArrayList
import java.util.regex.Pattern

/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
class csv2props extends YAMTLModule {
	val ECORE = EcorePackage.eINSTANCE  
	val CSV = RuntimeModelPackage.eINSTANCE  
	val UP = UiPropsPackage.eINSTANCE   
	new () {
		header().in('csv', CSV).out('up', UP)
		ruleStore( #[
			
			rule('PropsModel')
				.in('m', CSV.runtimeModel)
				.out('up', UP.propsModel),
				
			rule('CategoricalProps')
				.in('ft', CSV.featureType).filter[
					ft.emfType == ECORE.EString 
					||
					(
						(ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt) 
						&& 
						(
							ft.featureValues.map[(it as AttributeValue).value].toSet.size <= 1	
						)
					)
				]
				.out('cp', UP.categoricalProps) [
					
//					Environmental Variable
					val dnaPattern = "[A-z]+[.][0-9]+[A-z]*[>][A-z]+|[A-z]+[:][0-9]+[;]?"
					val datePattern ="^(0?[1-9]|[12][0-9]|3[01])[//\\-](0?[1-9]|1[012])[//\\-]\\d{4}$"
					val types = new ArrayList<String>();
					val  data = ft.featureValues.map[(it as AttributeValue).value.toString].toSet
//					binding
					cp.name = ft.name
					cp.groupName = ft.name.groupByName	
					

					if(data.size()>2&&data.size()<=10){
						types.add("select")
						types.add("search")
					}
					else if(data.size()<=2){
						types.add("select")
						types.add("checkbox")
					}
					else{
						types.add("search")
						types.add("select")
					}
	
						
					data.forEach[cp.data+=it 
						if(it.matches(datePattern)&&!types.contains("date")){
							if(types.contains("search")){types.remove(String.valueOf("search"))}
								types.add(0,"date")
							}
							if(it.matches(dnaPattern)&&(cp.groupName!="DNA SEQUENCE")){
								cp.groupName = "DNA SEQUENCE"
							}	
					]
					cp.types.addAll(types)
				],

			rule('NumericalProps')
				.in('ft', CSV.featureType).filter[
					ft.emfType == ECORE.EDouble || ft.emfType == ECORE.EInt
					&& 
					ft.featureValues.map[(it as AttributeValue).value].toSet.size > 1	
				]
				.out('np', UP.numericalProps) [

//					Envirometer Variable
					val d = new DescriptiveStatistics()
					val types = new ArrayList<String>();
					
					// compute stats										
					for (fv: ft.featureValues) {
						d.addValue((fv as AttributeValue).value.toDouble)
					}

//					bindings
					np.min = d.min
					np.max = d.max
					np.mean = d.mean
					np.std = d.standardDeviation
					np.name = ft.name
					np.groupName = ft.name.groupByName
					if((d.max-d.min)<100){
						types.add("range")
						types.add("select")
						types.add("number")
					}
					else{
						types.add("select")
						types.add("range")
						types.add("number")
					}
				
					val data = ft.featureValues.map[(it as AttributeValue).value.toDouble]
					data.forEach[np.data+=it]
					
					np.types.addAll(types)
					
				]
				
		])
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def att() {
	  'att'.fetch() as AttributeValue
	}
	def ft() {
	  'ft'.fetch() as FeatureType
	}
	def cp() {
	  'cp'.fetch() as CategoricalProps
	}
	def np() {
	  'np'.fetch() as NumericalProps
	}
	def up() {
		ft.owningObjectType.owningModel.fetch as PropsModel
	}
	
	
	def groupByName(String name){
		val pattern = Pattern.compile("sex|gender|height|weight|age|birth|subject|patient")
		
		if(pattern.matcher(name).find()){
			return "DEMOGRAPHICS"
		}
		else{
			
			return "UNCLASSIFIED"
		}
		
	}
	def toDouble(Object i) {
		switch(i) {
			Integer: return Double.valueOf(i)
			Double: return i
			default: {
				throw new Exception("Undefined: " + i.toString)
			}
		}
		
	}
}

