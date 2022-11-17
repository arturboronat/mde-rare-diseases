package sd_to_vf
import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import yamtl.core.YAMTLModule
import static yamtl.dsl.Rule.*
import vFormDsl.VFormDslPackage
import vFormDsl.FormLayout
import vFormDsl.Layout
import vFormDsl.FormInputSearch
import vFormDsl.FormInputSelect
import vFormDsl.FormInputRange
import vFormDsl.EnumOption
import vFormDsl.FormInputBasic
import vFormDsl.BasicInputType
import vFormDsl.StringOptionItem
import vFormDsl.Model
import dataDescription.FrequencyEntry

/** 
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
class sd2vf extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VFormDslPackage.eINSTANCE  
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			rule('Init')
				.in('sd', DD.statsDataModel)
				.out('m', VF.model)
				.out('fl', VF.formLayout) [
					fl.layout = Layout.HORIZONTAL
				],
			rule('Checkbox')
				.in('ct', DD.categoricalType).filter[
					ct.frequencyTable.size()<=2
				]
				.out('fib', VF.formInputBasic) [	
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					fib.name = ct.name
					fib.type = BasicInputType.CHECKBOX
					m.formInput.add(fib)
				],
				
			rule('Text')
				.in('ct', DD.categoricalType)
				.out('fib', VF.formInputBasic) [	
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					fib.name = ct.name
					fib.type = BasicInputType.TEXT
					m.formInput.add(fib)
				],
			rule('Number')
				.in('nt', DD.numericalType)
				.out('fib', VF.formInputBasic) [	
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					fib.name = nt.name
					fib.type = BasicInputType.NUMBER
					m.formInput.add(fib)
				],
			rule('Range')
				.in('nt', DD.numericalType)
				.out('rg', VF.formInputRange) [
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					rg.name = nt.name
					rg.min = Math.toIntExact(Math.round(nt.min)) 
					rg.max = Math.toIntExact(Math.round(nt.max)) 
					m.formInput.add(rg)
				],
				
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
			
			rule('Search')
				.in('ct', DD.categoricalType).filter [
					val ct = 'ct'.fetch as CategoricalType
					ct.frequencyTable.size() > 10
				]
				.out("sch", VF.formInputSearch) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					
					//bindings
					sch.name = ct.name
					ct.frequencyTable.forEach[j|
						sch.data.add((j as FrequencyEntry).fetch("stringOptionItem") as StringOptionItem)
						]
					m.formInput.add(sch)
				],
			rule('Categorical Select')
				.in('ct', DD.categoricalType).filter [
					val ct = 'ct'.fetch as CategoricalType
					ct.frequencyTable.size() <= 10
				]
				.out("slt", VF.formInputSelect) [
					val m = (ct.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = ct.name					
					m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					ct.frequencyTable.forEach[j|
						opt.data.add((j as FrequencyEntry).fetch("stringOptionItem") as StringOptionItem)
						]
						slt.option = opt
				],
			rule('Numerical Select')
				.in('nt', DD.numericalType).filter [
					val nt = 'nt'.fetch as NumericalType
					nt.frequencyTable.size() <= 10
				]
				.out("slt", VF.formInputSelect) [
					val m = (nt.eContainer() as StatsDataModel).fetch('m') as Model
					//bindings
					slt.name = nt.name					
					m.formInput.add(slt)
				].
				out("opt", VF.enumOption) [
					nt.frequencyTable.forEach[j|
						opt.data.add((j as FrequencyEntry).fetch("stringOptionItem") as StringOptionItem)
						]
						slt.option = opt
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
}