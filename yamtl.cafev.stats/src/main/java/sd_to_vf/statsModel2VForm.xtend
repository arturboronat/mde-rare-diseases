package sd_to_vf

import dataDescription.CategoricalType
import dataDescription.DataDescriptionPackage
import dataDescription.NumericalType
import dataDescription.StatsDataModel
import dataDescription.StatsDataType
import vformDSL.Checkbox
import vformDSL.EnumOption
import vformDSL.FormInput
import vformDSL.FormLayout
import vformDSL.Layout
import vformDSL.Range
import vformDSL.Search
import vformDSL.Select
import vformDSL.Text
import vformDSL.Number
import vformDSL.VformDSLPackage
import yamtl.core.YAMTLModule
import yamtl.dsl.Rule

import java.util.regex.Pattern

/**
 * LONGER VERSION TO EXPERIMENT WITH NEW RULES
 */
class statsModel2VForm extends YAMTLModule {
	val DD = DataDescriptionPackage.eINSTANCE  
	val VF = VformDSLPackage.eINSTANCE  
	new () {
		header().in('dd', DD).out('vf', VF)
		ruleStore( #[
			new Rule('Init')
				.in('sd', DD.statsDataModel)
				.out('fi', VF.formInput) [
					// environment vbles 
					val sd = 'sd'.fetch as StatsDataModel
					val fi = 'fi'.fetch as FormInput
				]
				.out('fl', VF.formLayout) [
					// environment vbles 
					val sd = 'sd'.fetch as StatsDataModel
					val fl = 'fl'.fetch as FormLayout
					// bindings
					fl.layout = Layout.HORIZONTAL
				],
			new Rule('CheckBox')
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() <= 2
				]
				.out('ck', VF.checkbox) [
					// environment vbles 
					val sdt = 'sdt'.fetch as StatsDataType
					val ck = 'ck'.fetch as Checkbox
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					ck.inputName = sdt.name
					fi.checkbox.add(ck)
				],
				
				
			new Rule('Text')
				.in('ct', DD.categoricalType)
				.out('txt', VF.text) [
					// environment vbles 
					val ct = 'ct'.fetch as CategoricalType
					val txt = 'txt'.fetch as Text
					val fi = (ct.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					txt.inputName = ct.name
					fi.text.add(txt)
				],
			new Rule('Number')
				.in('nt', DD.numericalType)
				.out('nb', VF.number) [
					// environment vbles 
					val nt = 'nt'.fetch as NumericalType
					val nb = 'nb'.fetch as Number
					val fi = (nt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					nb.inputName = nt.name
					fi.number.add(nb)
				],
			new Rule('Range')
				.in('nt', DD.numericalType)
				.out('rg', VF.range) [
					// environment vbles 
					val nt = 'nt'.fetch as NumericalType
					val rg = 'rg'.fetch as Range
					val fi = (nt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					rg.inputName = nt.name
					rg.min = Math.toIntExact(Math.round(nt.min)) 
					rg.max = Math.toIntExact(Math.round(nt.max)) 
					fi.range.add(rg)
				],
//				new Rule('Date')
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
			
			new Rule('Search')
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() > 10
				]
				.out("sch", VF.search)[
					// environment vbles 
					val sdt = 'sdt'.fetch as StatsDataType
					val sch = 'sch'.fetch as Search
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					sdt.frequencyTable.forEach[i|sch.stringData.add(i.name)]
					sch.inputName = sdt.name
					fi.search.add(sch)
				],
				
			new Rule('select')
				.in('sdt', DD.statsDataType).filter [
					val sdt = 'sdt'.fetch as StatsDataType
					sdt.frequencyTable.size() <= 10
				]
				.out("slt", VF.select)[
					// environment vbles 
					val sdt = 'sdt'.fetch as StatsDataType
					val slt = 'slt'.fetch as Select
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					//bindings
					slt.inputName = sdt.name					
					fi.select.add(slt)
				]
				.out("opt", VF.enumOption)[
					val sdt = 'sdt'.fetch as StatsDataType
					val opt  = "opt".fetch as EnumOption
					val fi = (sdt.eContainer() as StatsDataModel).fetch('fi') as FormInput
					
					
					//bindings 
					fi.select.forEach[i|
						if(i.inputName == sdt.name){
							sdt.frequencyTable.forEach[j|opt.stringData.add(j.name)]
						}
					]
						// i should use an efficient uniquelazy reference here
						fi.select.forEach[i|
							if(i.inputName == sdt.name){
								i.setEnumOption(opt)
							}
						]
						
					]				
		])
	}
}
