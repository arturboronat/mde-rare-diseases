package sd_to_vf

import cafev.vform.vFormDsl.EnumOption
import cafev.vform.vFormDsl.FormInputBasic
import cafev.vform.vFormDsl.FormInputRange
import cafev.vform.vFormDsl.FormInputSearch
import cafev.vform.vFormDsl.FormInputSelect
import cafev.vform.vFormDsl.FormLayout
import cafev.vform.vFormDsl.Model
import cafev.vform.vFormDsl.StringOptionItem
import cafev.vform.vFormDsl.VFormDslPackage
import com.fasterxml.jackson.databind.ObjectMapper
import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.DataDescriptionFactory
import dataDescription.FrequencyEntry
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import dataDescription.StatsDataType
import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import java.util.Map
import yamtl.core.YAMTLModule
import static yamtl.dsl.Rule.*
import java.io.File
import cafev.vform.vFormDsl.FormInput
import cafev.vform.vFormDsl.VFormDslFactory
import java.util.regex.Pattern
import cafev.vform.vFormDsl.FormInputGroup
import java.util.ArrayList

/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
class sd2vf extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val DE = DataDescriptionFactory.eINSTANCE 
	val VF = VFormDslPackage.eINSTANCE
	val VE = VFormDslFactory.eINSTANCE
		
		
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			rule('Init')
				.in('sd', DD.statsDataModel)
				.out('m', VF.model) [
					m.formLayout = fl
				]
				.out('fl', VF.formLayout) [
					fl.layout = "\"horizontal\""
				],
			rule('Checkbox')
				.in('ct', DD.categoricalType).filter[
					isType(ct,'checkbox')
				]
				.out('fib', VF.formInputBasic) [	
					val fin = ((ct.eContainer() as StatsDataModel).fetch('m') as Model).formInput as List<FormInput>
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					fib.name = displayName(ct)
					fib.id = ct.name
					fib.QC = 'true'
					fib.type = "\"checkbox\""
					
					val gpN =fin.filter[it.name == ct.name.groupByName]
					if(gpN.size==0){
						val fig  = VE.createFormInputGroup as FormInputGroup
						fig.name = ct.name.groupByName
						fig.id = ct.name.groupByName
						fig.QC = 'true'
						fig.groupInputs+=fib
						fin+=fig
						
					}else{
						
						fin.forEach[if(it.name === ct.name.groupByName){
							val idx = fin.indexOf(it)
							val fig = gpN.get(0)
							if(fig instanceof FormInputGroup)
							fig.groupInputs+=fib
							fin.set(idx,fig)
						}]
						
					}
//					m.formInput.add(fib)
				],
				
			rule('Text')
				.in('ct', DD.categoricalType).filter[
					isType(ct,'text')
				]
				.out('fib', VF.formInputBasic) [	
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					fib.name = displayName(ct)
					fib.id = ct.name
					fib.QC = 'true'
					fib.type = "\"text\""
					m.formInput.add(fib)
				],
//			rule('Number')
//				.in('nt', DD.numericalType)
//				.out('fib', VF.formInputBasic) [	
//					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
//					fib.name = nt.name
//					fib.id = nt.name
//					fib.QC = 'true'
//					fib.type = "\"number\""
//					m.formInput.add(fib)
//				],
			rule('Search')
				.in('ct', DD.categoricalType).filter [
					isType(ct,'search')
				]
				.out("sch", VF.formInputSearch) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					val fin = ((ct.eContainer() as StatsDataModel).fetch('m') as Model).formInput as List<FormInput>
					//bindings
					sch.name = displayName(ct)
					sch.id = ct.name
					sch.QC = 'true'
					sch.data += ct.frequencyTable.fetch("stringOptionItem") as List<StringOptionItem>
					val gpN =fin.filter[it.name == ct.name.groupByName]
					if(gpN.size==0){
						val fig  = VE.createFormInputGroup as FormInputGroup
						fig.name = ct.name.groupByName
						fig.id = ct.name.groupByName
						fig.QC = 'true'
						fig.groupInputs+=sch
						fin+=fig
						
					}else{
						
						fin.forEach[if(it.name === ct.name.groupByName){
							val idx = fin.indexOf(it)
							val fig = gpN.get(0)
							if(fig instanceof FormInputGroup)
							fig.groupInputs+=sch
							fin.set(idx,fig)
						}]
						
					}
		//			m.formInput.add(sch)
				],
			rule('Categorical Select')
				.in('ct', DD.categoricalType).filter [
					isType(ct,'select')
				]
				.out("slt", VF.formInputSelect) [
					val fin = ((ct.eContainer() as StatsDataModel).fetch('m') as Model).formInput as List<FormInput>
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = displayName(ct)	
					slt.id = ct.name	
					slt.QC = 'true'		
					slt.option = opt
					val gpN =fin.filter[it.name == ct.name.groupByName]
					if(gpN.size==0){
						val fig  = VE.createFormInputGroup as FormInputGroup
						fig.name = ct.name.groupByName
						fig.id = ct.name.groupByName
						fig.QC = 'true'
						fig.groupInputs+=slt
						fin+=fig
						
					}else{
						
						fin.forEach[if(it.name === ct.name.groupByName){
							val idx = fin.indexOf(it)
							val fig = gpN.get(0)
							if(fig instanceof FormInputGroup)
							fig.groupInputs+=slt
							fin.set(idx,fig)
						}]
						
					}
//					m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					opt.data += ct.frequencyTable.fetch("stringOptionItem") as List<StringOptionItem>
				],
			rule('Range')
				.in('nt', DD.numericalType).filter[
					isType(nt,'range')
				]
				.out('rg', VF.formInputRange) [
					val fin = ((nt.eContainer() as StatsDataModel).fetch('m') as Model).formInput as List<FormInput>
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					rg.name = displayName(nt)
					rg.id = nt.name
					rg.QC = 'true'
					rg.min = Math.toIntExact(Math.round(nt.min)) 
					rg.max = Math.toIntExact(Math.round(nt.max)) 
					
					
					val gpN =fin.filter[it.name == nt.name.groupByName]
					if(gpN.size==0){
						val fig  = VE.createFormInputGroup as FormInputGroup
						fig.name = nt.name.groupByName
						fig.id = nt.name.groupByName
						fig.QC = 'true'
						fig.groupInputs+=rg
						fin+=fig
						
					}else{
						
						fin.forEach[if(it.name === nt.name.groupByName){
							val idx = fin.indexOf(it)
							val fig = gpN.get(0)
							if(fig instanceof FormInputGroup)
							fig.groupInputs+=rg
							fin.set(idx,fig)
						}]
						
					}
//					m.formInput.add(rg)
				]
				
//				rule('Date')
//				.in('sdt', DD.statsDataType).
//				out('dt', VF.dat) [
//					// environment vbles 
//					val pattern = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")
//					val sdt = 'sdt'.fetch as StatsDataType
//					val dt = 'dt'.fetch as Dat
//					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
//					dt.inputName = sdt.name
//					
//					sdt.frequencyTable.forEach[i|
//						
//						if(!pattern.matcher(i.name).matches()){
//							fi.dat.add(dt)
//						}
//					]
//					
//				],
			
,
			rule('Numerical Select')
				.in('nt', DD.numericalType).filter [
					isType(nt,'select')
				]
				.out("slt", VF.formInputSelect) [
					val fin = ((nt.eContainer() as StatsDataModel).fetch('m') as Model).formInput as List<FormInput>
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = displayName(nt)	
					slt.id = nt.name	
					slt.QC = 'true'				
					slt.option = opt
					
					val gpN =fin.filter[it.name == nt.name.groupByName]
					if(gpN.size==0){
						val fig  = VE.createFormInputGroup as FormInputGroup
						fig.name = nt.name.groupByName
						fig.id = nt.name.groupByName
						fig.QC = 'true'
						fig.groupInputs+=slt
						fin+=fig
						
					}else{
						
						fin.forEach[if(it.name === nt.name.groupByName){
							val idx = fin.indexOf(it)
							val fig = gpN.get(0)
							if(fig instanceof FormInputGroup)
							fig.groupInputs+=slt
							fin.set(idx,fig)
						}]
						
					}
					//m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					opt.data.addAll(numericData(nt))
				],
			rule('stringOptionItem')
				.uniqueLazy
				.in('fe', DD.frequencyEntry)
				.out("soi", VF.stringOptionItem) [
					soi.value = fe.name
				]	

		])				
				
	}
	
	/**
	 * HELPERS: generated with runner.generateBoilerplateCode()
	 */
	def sd() {
	  'sd'.fetch() as StatsDataModel
	}
	def m() {
	  'm'.fetch() as Model
	}
	def fib() {
	  'fib'.fetch() as FormInputBasic
	}
	def fl() {
	  'fl'.fetch() as FormLayout
	}

	def ct() {
	  'ct'.fetch() as CategoricalType
	}
	def nt() {
	  'nt'.fetch() as NumericalType
	}
	def rg(){
	  'rg'.fetch() as FormInputRange
	}
	def sch() {
	  'sch'.fetch() as FormInputSearch
	}
	def slt() {
	  'slt'.fetch() as FormInputSelect
	}
	def opt() {
	  'opt'.fetch() as EnumOption
	}
	def soi(){
	  'soi'.fetch() as StringOptionItem
	}
	def fe(){
	  'fe'.fetch() as FrequencyEntry
	}
	
	
	/*
	 * LOAD JSON
	 */
 	val editMap = newHashMap
 	
 	def loadEditProperties(String filePath) {
				
		if(!filePath.equals("noFile")){
			val path = Paths.get(filePath)
			val json = Files.readAllLines(path).join("\n");	
	 		val ObjectMapper mapper = new ObjectMapper();
			try {
				val list = mapper.readValue(json, List);
				list.forEach[ Map m | 
					val v = m.get("id") as String
					editMap.put(v, m)
				]
			} catch(Exception e) {
				e.printStackTrace
			}	
		}	
		
	}
	
	val createMap = newHashMap
	def loadCreateProperties(String filePath) {
				
		if(!filePath.equals("noFile")){
			val path = Paths.get(filePath)
			val json = Files.readAllLines(path).join("\n");	
	 		val ObjectMapper mapper = new ObjectMapper();
			try {
				val list = mapper.readValue(json, List);
				list.forEach[ Map m | 
					val v = m.get("id") as String
					createMap.put(v, m)
				]
			} catch(Exception e) {
				e.printStackTrace
			}	
		}	
		
	}
	
	
	def isType(StatsDataType datatype, String typeValue) {
		var value = editMap.get(datatype.name) as Map
		val createValue = createMap.get(datatype.name) as Map
		if(createMap.size()>0){
			value = createValue
		}
		
		if (createMap.size()<1&&((value!==null &&value.get("type")===null)||value===null)) {
			
				switch(typeValue){
				case "search":
				datatype instanceof CategoricalType &&
				datatype.frequencyTable.size()>10
				
				case "select":
				
					if(datatype instanceof NumericalType){
						(datatype.max-datatype.min)>100
					}
					else{
						datatype instanceof CategoricalType &&
						datatype.frequencyTable.size()<=10
					}
					
				case "range":
					if(datatype instanceof NumericalType){
						(datatype.max-datatype.min)<=100
					}
					else{
						false
					}
				
				default:
					false
			}
			}
			else {
				
				
				if (value!== null&&value.get("type")!==null) {
					val type = value.get("type")
					type == typeValue
				}
				else{
					false
				}
			}
		
	}
	
	def String displayName(StatsDataType datatype) {
		var value = editMap.get(datatype.name) as Map
		val createValue = createMap.get(datatype.name) as Map
		if(createMap.size()>0){
			value = createValue
		}
		if (value !== null) {
			val newName = value.get("name") as String
			if (newName !== null) {
				newName
			} else {
				datatype.name
			}
		} else {
			datatype.name
		}
	}
	
	def List<StringOptionItem> numericData(StatsDataType datatype) {
		var value = editMap.get(datatype.name) as Map
		val createValue = createMap.get(datatype.name) as Map
		if(createMap.size()>0){
			value = createValue
		}
		val soi = new ArrayList<StringOptionItem>
		if (value !== null) {
			val data = value.get("data") as List<String>
			if (data !== null) {
				data.forEach[i|
				val str = VE.createStringOptionItem
				str.value = i
				soi+=str	
				]
				soi
			} else {
				datatype.frequencyTable.forEach[i|
				val str = VE.createStringOptionItem
				str.value = i.name
				soi+=str
				]
				soi
			}
		} else {
			datatype.frequencyTable.forEach[i|
				val str = VE.createStringOptionItem
				str.value = i.name
				soi+=str
				]
				soi
		}
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
	
}