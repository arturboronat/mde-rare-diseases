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
import java.util.Arrays
import java.util.Set

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
					m.formInput+= sd.fetchInputs
				]
				.out('fl', VF.formLayout) [
					fl.layout = "\"horizontal\""
				],
			rule('Groups')
				.uniqueLazy
				.in('sd', DD.statsDataModel)
				.out('fig', VF.formInputGroup) [	
					//bindings
					fig.name = sd.name
					fig.id = sd.name
					fig.QC = 'true'
					fig.groupInputs += sd.fetchGroupInputs
				],
			rule('Checkbox')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter[
					isType(sdt,'checkbox')
				]
				.out('fib', VF.formInputBasic)[	
					fib.name = displayName(sdt)
					fib.id = sdt.name
					fib.QC = 'true'
					fib.type = "\"checkbox\""
				],
			rule('Number')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter[
					isType(sdt,'digit')
				]
				.out('fib', VF.formInputBasic)[
						fib.name = sdt.name
						fib.id = sdt.name
						fib.QC = 'true'
						fib.type = "\"digit\""
					],
			rule('Search')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter [
					isType(sdt,'search')
				]
				.out("sch", VF.formInputSearch) [
					//bindings
					sch.name = displayName(sdt)
					sch.id = sdt.name
					sch.QC = 'true'
					sch.data += sdt.fetchData
				],
			rule('Select')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter [
					isType(sdt,'select')
				]
				.out("slt", VF.formInputSelect) [
					//bindings
					slt.name = displayName(sdt)	
					slt.id = sdt.name	
					slt.QC = 'true'		
					slt.option = opt
				].
				out("opt", VF.enumOption) [
					opt.data += sdt.fetchData
				],
			rule('Range')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter[
					isType(sdt,'range')
				]
				.out('rg', VF.formInputRange) [
					//bindings
					rg.name = displayName(sdt)
					rg.id = sdt.name
					rg.QC = 'true'
					rg.min = sdt.fetchRange.get('min') 
					rg.max = sdt.fetchRange.get('max') 
				],						
			rule('Date')
				.uniqueLazy
				.in('sdt', DD.statsDataType).filter [
					isType(sdt,'date')
				]
				.out("fib", VF.formInputBasic) [
					//bindings
					fib.name = displayName(sdt)	
					fib.id = sdt.name	
					fib.type = "\"date\""
					fib.QC = 'true'		
				],		
			rule('Data')
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
	def fig() {
	  'fig'.fetch() as FormInputGroup
	}
	def fl() {
	  'fl'.fetch() as FormLayout
	}
	def sdt() {
	  'sdt'.fetch() as StatsDataType
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
		val date = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])([/]|[-])(0?[1-9]|1[012])([/]|[-])[0-9]{4}$")
		var value = editMap.get(datatype.name) as Map
		val createValue = createMap.get(datatype.name) as Map
		if(createMap.size()>0){
			value = createValue
		}
		
		if (createMap.size()<1&&((value!==null &&value.get("type")===null)||value===null)) {
				
				switch(typeValue){
				case "search":
					if(datatype instanceof CategoricalType){
					val ct = datatype as CategoricalType
					datatype.frequencyTable.size()>10 && (ct.dataType != "Date")
					}
					else{
						false
					}
				
				case "select":
				
					if(datatype instanceof NumericalType){
						(datatype.max-datatype.min)>100 
					}
					else{
						val ct = datatype as CategoricalType
						datatype instanceof CategoricalType &&
						datatype.frequencyTable.size()<=10 && (ct.dataType != "Date")
					}
					
				case "range":
					if(datatype instanceof NumericalType){
						(datatype.max-datatype.min)<=100
					}
					else{
						false
					}
					
				case "date":
					if(datatype instanceof CategoricalType){
					val ct = datatype as CategoricalType
						ct.dataType == "Date"
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
	
	def fetchNumericData(StatsDataType datatype) {
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
	
	def getGroup(StatsDataModel sd){
		val grps = newHashMap
		val dg = new ArrayList<StatsDataType>()
		val ug = new ArrayList<StatsDataType>()
		val og = new ArrayList<StatsDataType>()
		val dng =  new ArrayList<StatsDataType>()
		sd.types.forEach[
			switch(it.group){
				case "DEMOGRAPHICS":
					dg+=it
				case "ONTOLOGIES":
					og+=it
				case "DNA SEQUENCE":
					dng+=it
				default:
					ug+=it
				
			}

			
		]
		grps.put("DEMOGRAPHICS", dg)
		grps.put("UNCLASSIFIED", ug)
		grps.put("ONTOLOGIES", og)
		grps.put("DNA SEQUENCE", dng)
		grps.put("ONTOLOGIES", og)
		grps
	}
	
	def fetchGroupInputs(StatsDataModel sd){
		val fin = new ArrayList<FormInput>()
		fin+=sd.types.fetch("Search") as List<FormInput>
		fin+=sd.types.fetch("Select") as List<FormInput>
		fin+=sd.types.fetch("Date") as List<FormInput>
		fin+=sd.types.fetch("Checkbox") as List<FormInput>
		fin+=sd.types.fetch("Range") as List<FormInput>
		fin+=sd.types.fetch("Number") as List<FormInput>
		fin
	}
	
	def fetchInputs(StatsDataModel sd){
					val grpMap = sd.getGroup
					val groups = grpMap.keySet().groupList
					val sdmA = newArrayList
					groups.forEach[
						val sdtm = DE.createStatsDataModel
						sdtm.name = it
						sdtm.types+=grpMap.get(it)
						if(sdtm.types.size!=0){
							sdmA+=sdtm
						}
							
					]
					sdmA.fetch('Groups') as List<FormInputGroup>
	}
	
	def fetchData(StatsDataType sdt){
		if(sdt instanceof NumericalType){

			sdt.fetchNumericData
		}
		else{
			sdt.frequencyTable.fetch("Data") as List<StringOptionItem>
		}
		
	}
	
	def groupList(Set<String> list){
		val grpKeys = list
					val groups = newArrayList
					grpKeys.forEach[
						if(it!="DEMOGRAPHICS" && it!="UNCLASSIFIED"){
							groups+=it
						}
					]
					grpKeys.forEach[
						
						if(it=="DEMOGRAPHICS"){
							groups.add(0,it)
						}
						else if(it=="UNCLASSIFIED"){
							groups+=it
						}
					]
		groups
	}
	
	def fetchRange(StatsDataType sdt){
		val range = newHashMap
		val nt = sdt as NumericalType
		range.put('min',Math.toIntExact(Math.round(nt.min)))
		range.put('max',Math.toIntExact(Math.round(nt.max)))
		range
	}
}