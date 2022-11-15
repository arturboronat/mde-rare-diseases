/*
 * generated by Xtext 2.28.0
 */
package cafev.vform.serializer;

import cafev.vform.services.VFormDslGrammarAccess;
import cafev.vform.vFormDsl.DataOption;
import cafev.vform.vFormDsl.DataOptionItem;
import cafev.vform.vFormDsl.EnumOption;
import cafev.vform.vFormDsl.FormInputBasic;
import cafev.vform.vFormDsl.FormInputGroup;
import cafev.vform.vFormDsl.FormInputRange;
import cafev.vform.vFormDsl.FormInputSearch;
import cafev.vform.vFormDsl.FormInputSelect;
import cafev.vform.vFormDsl.FormLayout;
import cafev.vform.vFormDsl.IntData;
import cafev.vform.vFormDsl.IntOptionItem;
import cafev.vform.vFormDsl.Model;
import cafev.vform.vFormDsl.NumberOption;
import cafev.vform.vFormDsl.StringData;
import cafev.vform.vFormDsl.StringOptionItem;
import cafev.vform.vFormDsl.VFormDslPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class VFormDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VFormDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VFormDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VFormDslPackage.DATA_OPTION:
				sequence_DataOption(context, (DataOption) semanticObject); 
				return; 
			case VFormDslPackage.DATA_OPTION_ITEM:
				sequence_DataOptionItem(context, (DataOptionItem) semanticObject); 
				return; 
			case VFormDslPackage.ENUM_OPTION:
				sequence_EnumOption(context, (EnumOption) semanticObject); 
				return; 
			case VFormDslPackage.FORM_INPUT_BASIC:
				sequence_FormInputBasic(context, (FormInputBasic) semanticObject); 
				return; 
			case VFormDslPackage.FORM_INPUT_GROUP:
				sequence_FormInputGroup(context, (FormInputGroup) semanticObject); 
				return; 
			case VFormDslPackage.FORM_INPUT_RANGE:
				sequence_FormInputRange(context, (FormInputRange) semanticObject); 
				return; 
			case VFormDslPackage.FORM_INPUT_SEARCH:
				sequence_FormInputSearch(context, (FormInputSearch) semanticObject); 
				return; 
			case VFormDslPackage.FORM_INPUT_SELECT:
				sequence_FormInputSelect(context, (FormInputSelect) semanticObject); 
				return; 
			case VFormDslPackage.FORM_LAYOUT:
				sequence_FormLayout(context, (FormLayout) semanticObject); 
				return; 
			case VFormDslPackage.INT_DATA:
				sequence_IntData(context, (IntData) semanticObject); 
				return; 
			case VFormDslPackage.INT_OPTION_ITEM:
				sequence_IntOptionItem(context, (IntOptionItem) semanticObject); 
				return; 
			case VFormDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case VFormDslPackage.NUMBER_OPTION:
				sequence_NumberOption(context, (NumberOption) semanticObject); 
				return; 
			case VFormDslPackage.STRING_DATA:
				sequence_StringData(context, (StringData) semanticObject); 
				return; 
			case VFormDslPackage.STRING_OPTION_ITEM:
				sequence_StringOptionItem(context, (StringOptionItem) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     OptionItem returns DataOptionItem
	 *     DataOptionItem returns DataOptionItem
	 *
	 * Constraint:
	 *     value=Data
	 * </pre>
	 */
	protected void sequence_DataOptionItem(ISerializationContext context, DataOptionItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.DATA_OPTION_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.DATA_OPTION_ITEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataOptionItemAccess().getValueDataParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Option returns DataOption
	 *     DataOption returns DataOption
	 *
	 * Constraint:
	 *     (data+=Data data+=Data*)
	 * </pre>
	 */
	protected void sequence_DataOption(ISerializationContext context, DataOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Option returns EnumOption
	 *     EnumOption returns EnumOption
	 *
	 * Constraint:
	 *     (data+=OptionItem data+=OptionItem*)
	 * </pre>
	 */
	protected void sequence_EnumOption(ISerializationContext context, EnumOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormInput returns FormInputBasic
	 *     FormInputBasic returns FormInputBasic
	 *
	 * Constraint:
	 *     (name=STRING type=InputType)
	 * </pre>
	 */
	protected void sequence_FormInputBasic(ISerializationContext context, FormInputBasic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT_BASIC__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT_BASIC__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormInputBasicAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormInputBasicAccess().getTypeInputTypeEnumRuleCall_5_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormInput returns FormInputGroup
	 *     FormInputGroup returns FormInputGroup
	 *
	 * Constraint:
	 *     (name=STRING groupInputs=[FormInput|ID])
	 * </pre>
	 */
	protected void sequence_FormInputGroup(ISerializationContext context, FormInputGroup semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT_GROUP__GROUP_INPUTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT_GROUP__GROUP_INPUTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormInputGroupAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputIDTerminalRuleCall_8_0_1(), semanticObject.eGet(VFormDslPackage.Literals.FORM_INPUT_GROUP__GROUP_INPUTS, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormInput returns FormInputRange
	 *     FormInputRange returns FormInputRange
	 *
	 * Constraint:
	 *     (name=STRING min=INT max=INT)
	 * </pre>
	 */
	protected void sequence_FormInputRange(ISerializationContext context, FormInputRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT_RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT_RANGE__MIN));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT_RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT_RANGE__MAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormInputRangeAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_9_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_12_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormInput returns FormInputSearch
	 *     FormInputSearch returns FormInputSearch
	 *
	 * Constraint:
	 *     (name=STRING data+=OptionItem data+=OptionItem*)
	 * </pre>
	 */
	protected void sequence_FormInputSearch(ISerializationContext context, FormInputSearch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormInput returns FormInputSelect
	 *     FormInputSelect returns FormInputSelect
	 *
	 * Constraint:
	 *     (name=STRING option=Option)
	 * </pre>
	 */
	protected void sequence_FormInputSelect(ISerializationContext context, FormInputSelect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_INPUT_SELECT__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_INPUT_SELECT__OPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormInputSelectAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_10_0(), semanticObject.getOption());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FormLayout returns FormLayout
	 *
	 * Constraint:
	 *     layout=Layout
	 * </pre>
	 */
	protected void sequence_FormLayout(ISerializationContext context, FormLayout semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.FORM_LAYOUT__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.FORM_LAYOUT__LAYOUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormLayoutAccess().getLayoutLayoutEnumRuleCall_0(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Data returns IntData
	 *     IntData returns IntData
	 *
	 * Constraint:
	 *     (label=STRING value=INT)
	 * </pre>
	 */
	protected void sequence_IntData(ISerializationContext context, IntData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.DATA__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.DATA__LABEL));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.INT_DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.INT_DATA__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntDataAccess().getLabelSTRINGTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getIntDataAccess().getValueINTTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OptionItem returns IntOptionItem
	 *     IntOptionItem returns IntOptionItem
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_IntOptionItem(ISerializationContext context, IntOptionItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.INT_OPTION_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.INT_OPTION_ITEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntOptionItemAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (formLayout=FormLayout formInput+=FormInput*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Option returns NumberOption
	 *     NumberOption returns NumberOption
	 *
	 * Constraint:
	 *     (min=INT max=INT range=INT)
	 * </pre>
	 */
	protected void sequence_NumberOption(ISerializationContext context, NumberOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__MIN));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__MAX));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.NUMBER_OPTION__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_4_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_7_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_10_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Data returns StringData
	 *     StringData returns StringData
	 *
	 * Constraint:
	 *     (label=STRING value=STRING)
	 * </pre>
	 */
	protected void sequence_StringData(ISerializationContext context, StringData semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.DATA__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.DATA__LABEL));
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.STRING_DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.STRING_DATA__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringDataAccess().getLabelSTRINGTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getStringDataAccess().getValueSTRINGTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OptionItem returns StringOptionItem
	 *     StringOptionItem returns StringOptionItem
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_StringOptionItem(ISerializationContext context, StringOptionItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VFormDslPackage.Literals.STRING_OPTION_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VFormDslPackage.Literals.STRING_OPTION_ITEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringOptionItemAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
