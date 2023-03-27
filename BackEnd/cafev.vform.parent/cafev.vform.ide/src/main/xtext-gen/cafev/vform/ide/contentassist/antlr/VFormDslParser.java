/*
 * generated by Xtext 2.30.0
 */
package cafev.vform.ide.contentassist.antlr;

import cafev.vform.ide.contentassist.antlr.internal.InternalVFormDslParser;
import cafev.vform.services.VFormDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VFormDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VFormDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VFormDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFormInputAccess().getAlternatives(), "rule__FormInput__Alternatives");
			builder.put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
			builder.put(grammarAccess.getOptionItemAccess().getAlternatives(), "rule__OptionItem__Alternatives");
			builder.put(grammarAccess.getDataAccess().getAlternatives(), "rule__Data__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_7(), "rule__Model__Group_7__0");
			builder.put(grammarAccess.getFormInputBasicAccess().getGroup(), "rule__FormInputBasic__Group__0");
			builder.put(grammarAccess.getFormInputBasicAccess().getGroup_5(), "rule__FormInputBasic__Group_5__0");
			builder.put(grammarAccess.getFormInputRangeAccess().getGroup(), "rule__FormInputRange__Group__0");
			builder.put(grammarAccess.getFormInputRangeAccess().getGroup_5(), "rule__FormInputRange__Group_5__0");
			builder.put(grammarAccess.getFormInputSelectAccess().getGroup(), "rule__FormInputSelect__Group__0");
			builder.put(grammarAccess.getFormInputSelectAccess().getGroup_5(), "rule__FormInputSelect__Group_5__0");
			builder.put(grammarAccess.getDataOptionAccess().getGroup(), "rule__DataOption__Group__0");
			builder.put(grammarAccess.getDataOptionAccess().getGroup_9(), "rule__DataOption__Group_9__0");
			builder.put(grammarAccess.getEnumOptionAccess().getGroup(), "rule__EnumOption__Group__0");
			builder.put(grammarAccess.getEnumOptionAccess().getGroup_9(), "rule__EnumOption__Group_9__0");
			builder.put(grammarAccess.getNumberOptionAccess().getGroup(), "rule__NumberOption__Group__0");
			builder.put(grammarAccess.getFormInputSearchAccess().getGroup(), "rule__FormInputSearch__Group__0");
			builder.put(grammarAccess.getFormInputSearchAccess().getGroup_5(), "rule__FormInputSearch__Group_5__0");
			builder.put(grammarAccess.getFormInputSearchAccess().getGroup_18(), "rule__FormInputSearch__Group_18__0");
			builder.put(grammarAccess.getFormInputGroupAccess().getGroup(), "rule__FormInputGroup__Group__0");
			builder.put(grammarAccess.getFormInputGroupAccess().getGroup_5(), "rule__FormInputGroup__Group_5__0");
			builder.put(grammarAccess.getFormInputGroupAccess().getGroup_18(), "rule__FormInputGroup__Group_18__0");
			builder.put(grammarAccess.getStringDataAccess().getGroup(), "rule__StringData__Group__0");
			builder.put(grammarAccess.getIntDataAccess().getGroup(), "rule__IntData__Group__0");
			builder.put(grammarAccess.getModelAccess().getFormLayoutAssignment_2(), "rule__Model__FormLayoutAssignment_2");
			builder.put(grammarAccess.getModelAccess().getFormInputAssignment_6(), "rule__Model__FormInputAssignment_6");
			builder.put(grammarAccess.getModelAccess().getFormInputAssignment_7_1(), "rule__Model__FormInputAssignment_7_1");
			builder.put(grammarAccess.getFormLayoutAccess().getLayoutAssignment(), "rule__FormLayout__LayoutAssignment");
			builder.put(grammarAccess.getFormInputBasicAccess().getNameAssignment_3(), "rule__FormInputBasic__NameAssignment_3");
			builder.put(grammarAccess.getFormInputBasicAccess().getIdAssignment_5_2(), "rule__FormInputBasic__IdAssignment_5_2");
			builder.put(grammarAccess.getFormInputBasicAccess().getQCAssignment_8(), "rule__FormInputBasic__QCAssignment_8");
			builder.put(grammarAccess.getFormInputBasicAccess().getTypeAssignment_12(), "rule__FormInputBasic__TypeAssignment_12");
			builder.put(grammarAccess.getFormInputRangeAccess().getNameAssignment_3(), "rule__FormInputRange__NameAssignment_3");
			builder.put(grammarAccess.getFormInputRangeAccess().getIdAssignment_5_2(), "rule__FormInputRange__IdAssignment_5_2");
			builder.put(grammarAccess.getFormInputRangeAccess().getQCAssignment_8(), "rule__FormInputRange__QCAssignment_8");
			builder.put(grammarAccess.getFormInputRangeAccess().getMinAssignment_16(), "rule__FormInputRange__MinAssignment_16");
			builder.put(grammarAccess.getFormInputRangeAccess().getMaxAssignment_20(), "rule__FormInputRange__MaxAssignment_20");
			builder.put(grammarAccess.getFormInputSelectAccess().getNameAssignment_3(), "rule__FormInputSelect__NameAssignment_3");
			builder.put(grammarAccess.getFormInputSelectAccess().getIdAssignment_5_2(), "rule__FormInputSelect__IdAssignment_5_2");
			builder.put(grammarAccess.getFormInputSelectAccess().getQCAssignment_8(), "rule__FormInputSelect__QCAssignment_8");
			builder.put(grammarAccess.getFormInputSelectAccess().getOptionAssignment_16(), "rule__FormInputSelect__OptionAssignment_16");
			builder.put(grammarAccess.getDataOptionAccess().getDataAssignment_8(), "rule__DataOption__DataAssignment_8");
			builder.put(grammarAccess.getDataOptionAccess().getDataAssignment_9_1(), "rule__DataOption__DataAssignment_9_1");
			builder.put(grammarAccess.getEnumOptionAccess().getDataAssignment_8(), "rule__EnumOption__DataAssignment_8");
			builder.put(grammarAccess.getEnumOptionAccess().getDataAssignment_9_1(), "rule__EnumOption__DataAssignment_9_1");
			builder.put(grammarAccess.getNumberOptionAccess().getMinAssignment_7(), "rule__NumberOption__MinAssignment_7");
			builder.put(grammarAccess.getNumberOptionAccess().getMaxAssignment_11(), "rule__NumberOption__MaxAssignment_11");
			builder.put(grammarAccess.getNumberOptionAccess().getRangeAssignment_14(), "rule__NumberOption__RangeAssignment_14");
			builder.put(grammarAccess.getFormInputSearchAccess().getNameAssignment_3(), "rule__FormInputSearch__NameAssignment_3");
			builder.put(grammarAccess.getFormInputSearchAccess().getIdAssignment_5_2(), "rule__FormInputSearch__IdAssignment_5_2");
			builder.put(grammarAccess.getFormInputSearchAccess().getQCAssignment_8(), "rule__FormInputSearch__QCAssignment_8");
			builder.put(grammarAccess.getFormInputSearchAccess().getDataAssignment_17(), "rule__FormInputSearch__DataAssignment_17");
			builder.put(grammarAccess.getFormInputSearchAccess().getDataAssignment_18_1(), "rule__FormInputSearch__DataAssignment_18_1");
			builder.put(grammarAccess.getStringOptionItemAccess().getValueAssignment(), "rule__StringOptionItem__ValueAssignment");
			builder.put(grammarAccess.getIntOptionItemAccess().getValueAssignment(), "rule__IntOptionItem__ValueAssignment");
			builder.put(grammarAccess.getDataOptionItemAccess().getValueAssignment(), "rule__DataOptionItem__ValueAssignment");
			builder.put(grammarAccess.getFormInputGroupAccess().getNameAssignment_3(), "rule__FormInputGroup__NameAssignment_3");
			builder.put(grammarAccess.getFormInputGroupAccess().getIdAssignment_5_2(), "rule__FormInputGroup__IdAssignment_5_2");
			builder.put(grammarAccess.getFormInputGroupAccess().getQCAssignment_8(), "rule__FormInputGroup__QCAssignment_8");
			builder.put(grammarAccess.getFormInputGroupAccess().getGroupInputsAssignment_17(), "rule__FormInputGroup__GroupInputsAssignment_17");
			builder.put(grammarAccess.getFormInputGroupAccess().getGroupInputsAssignment_18_1(), "rule__FormInputGroup__GroupInputsAssignment_18_1");
			builder.put(grammarAccess.getStringDataAccess().getLabelAssignment_2(), "rule__StringData__LabelAssignment_2");
			builder.put(grammarAccess.getStringDataAccess().getValueAssignment_5(), "rule__StringData__ValueAssignment_5");
			builder.put(grammarAccess.getIntDataAccess().getLabelAssignment_2(), "rule__IntData__LabelAssignment_2");
			builder.put(grammarAccess.getIntDataAccess().getValueAssignment_5(), "rule__IntData__ValueAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VFormDslGrammarAccess grammarAccess;

	@Override
	protected InternalVFormDslParser createParser() {
		InternalVFormDslParser result = new InternalVFormDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VFormDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VFormDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
