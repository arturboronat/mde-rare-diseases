package sd_to_vf

import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.FrequencyEntry
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import dataDescription.StatsDataType
import java.util.List
import yamtl.core.YAMTLModule
import yamtl.vforms.vFormsDsl.EnumOption
import yamtl.vforms.vFormsDsl.FormInput
import yamtl.vforms.vFormsDsl.FormInputBasic
import yamtl.vforms.vFormsDsl.FormInputGroup
import yamtl.vforms.vFormsDsl.FormInputRange
import yamtl.vforms.vFormsDsl.FormInputSearch
import yamtl.vforms.vFormsDsl.FormInputSelect
import yamtl.vforms.vFormsDsl.FormLayout
import yamtl.vforms.vFormsDsl.Model
import yamtl.vforms.vFormsDsl.StringOptionItem
import yamtl.vforms.vFormsDsl.VFormsDslPackage

import static yamtl.dsl.Rule.*
import untypedModel.UntypedModelPackage
import untypedModel.UntypedModel

class sd2vf extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VFormsDslPackage.eINSTANCE
		
	val EDIT = UntypedModelPackage.eINSTANCE
	
	new () {
		header().in('dd', DD).in('edit',EDIT).out('vf', VF)
		ruleStore( #[
rule('Init')
	.in('sd', DD.statsDataModel)
	.out('m', VF.model) [
		m.formLayout = fl
		sd.types.groupBy[it.group].forEach[ groupName, list |
			val formInputGroup = sd.fetch('fig', 'Groups', 
				#{"groupName" -> groupName, "inputList" -> list}
			) as FormInputGroup
			m.formInput += formInputGroup
		] 
	]
	.out('fl', VF.formLayout) [
		fl.layout = "\"horizontal\""
	],
	
rule('Groups')
	.lazy
	.in('sd', DD.statsDataModel)
	.out('fig', VF.formInputGroup) [	
		val groupName = 'groupName'.fetch as String
		val inputList = 'inputList'.fetch as List<FormInput>

		fig.name = groupName
		fig.id = groupName
		fig.QC = 'true'
		val groupList = sd.types.filter[inputList.contains(it)]
		fig.groupInputs += groupList.fetch as List<FormInput>
	],
	
rule('Search')
	.in('ct', DD.categoricalType).filter [
		ct.frequencyTable.size()>10 && (ct.dataType != "Date")
		&& !ct.hasAlternativeType
	]
	.out("sch", VF.formInputSearch) [
		sch.initCommonAttributes(ct)
		sch.data += ct.frequencyTable.fetch("soi", "Data") as List<StringOptionItem>
	],
	
rule('Select-Numerical')
	.in('nt', DD.numericalType).filter [
		(nt.max-nt.min) >100 
		&& !nt.hasAlternativeType
	]
	.out("slt", VF.formInputSelect) [
		slt.initCommonAttributes(nt)
		slt.option = opt
	].
	out("opt", VF.enumOption) [
		opt.data += nt.frequencyTable.fetch("soi", "Data") as List<StringOptionItem>
	],
	
rule('Select-Categorical')
	.in('ct', DD.categoricalType).filter [
		ct.frequencyTable.size()<=10 
		&& (ct.dataType != "Date")
		&& !ct.hasAlternativeType
	]
	.out("slt", VF.formInputSelect) [
		slt.initCommonAttributes(ct)
		slt.option = opt
	].
	out("opt", VF.enumOption) [
		opt.data += ct.frequencyTable.fetch("soi", "Data") as List<StringOptionItem>
	],
	
rule('Range')
	.in('nt', DD.numericalType).filter[
		(nt.max-nt.min)<=100
		&& !nt.hasAlternativeType
	]
	.out('rg', VF.formInputRange) [
		rg.initCommonAttributes(nt)
		rg.min = Math.round(nt.min) as int
		rg.max = Math.round(nt.max) as int
	],	
						
rule('Date')
	.in('ct', DD.categoricalType).filter [
		ct.dataType == "Date"
		&& !ct.hasAlternativeType
	]
	.out("fib", VF.formInputBasic) [
		fib.initCommonAttributes(ct)
		fib.type = "\"date\""
	],		
	
rule('Checkbox')
	.in('sdt', DD.statsDataType).filter[
		hasAlternativeType(sdt,'checkbox')
	]
	.out('fib', VF.formInputBasic)[	
		fib.initCommonAttributes(sdt)
		fib.type = "\"checkbox\""
	],
	
rule('Number')
	.in('sdt', DD.statsDataType).filter[
		hasAlternativeType(sdt,'digit')
	]
	.out('fib', VF.formInputBasic)[
			fib.initCommonAttributes(sdt)
			fib.type = "\"digit\""
		],
	
rule('Data').uniqueLazy
	.in('fe', DD.frequencyEntry)
	.out("soi", VF.stringOptionItem) [
		soi.value = fe.name
	]
		])				
				
	}
	
	/**
	 * HELPERS
	 */
def initCommonAttributes(FormInput fi, StatsDataType sdt) {
	fi.name = displayName(sdt)
	fi.id = sdt.name
	fi.QC = 'true'
}

def getEditEntry(StatsDataType datatype) { 
	val editModel = this.getModelResource("edit").contents.head as UntypedModel
	editModel.__children.filter[r | 
		r.getString("id") == datatype.name
	].head
}	

def String displayName(StatsDataType datatype) {
	var displayName = datatype.editEntry?.getString("name")
	if (displayName === null || displayName == "") 
		displayName = datatype.name
	displayName
}

def boolean hasAlternativeType(StatsDataType datatype, String typeName) {
	datatype.editEntry?.getString("type") == typeName
}

def boolean hasAlternativeType(StatsDataType datatype) {
	datatype.editEntry?.getString("type") !== null && datatype.editEntry?.getString("type") != ""
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
	
	

}