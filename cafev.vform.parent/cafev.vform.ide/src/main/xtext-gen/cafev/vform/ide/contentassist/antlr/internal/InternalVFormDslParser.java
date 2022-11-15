package cafev.vform.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import cafev.vform.services.VFormDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVFormDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TEXT'", "'CHECKBOX'", "'NUMBER'", "'DATE'", "'RANGE'", "'SELECT'", "'SEARCH'", "'GROUP'", "'horizontal'", "'vertical'", "'formLayout:'", "','", "'formInputs:'", "'['", "']'", "'name'", "':'", "'type'", "'min:'", "'max:'", "'options:'", "'{'", "'}'", "'optionType:'", "'data'", "'data:'", "'enum'", "'number'", "'range:'", "'type:'", "'groupInputs:'", "'label:'", "'value:'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVFormDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVFormDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVFormDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVFormDsl.g"; }


    	private VFormDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(VFormDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalVFormDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalVFormDsl.g:54:1: ( ruleModel EOF )
            // InternalVFormDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVFormDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalVFormDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalVFormDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalVFormDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalVFormDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalVFormDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFormLayout"
    // InternalVFormDsl.g:78:1: entryRuleFormLayout : ruleFormLayout EOF ;
    public final void entryRuleFormLayout() throws RecognitionException {
        try {
            // InternalVFormDsl.g:79:1: ( ruleFormLayout EOF )
            // InternalVFormDsl.g:80:1: ruleFormLayout EOF
            {
             before(grammarAccess.getFormLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleFormLayout();

            state._fsp--;

             after(grammarAccess.getFormLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormLayout"


    // $ANTLR start "ruleFormLayout"
    // InternalVFormDsl.g:87:1: ruleFormLayout : ( ( rule__FormLayout__LayoutAssignment ) ) ;
    public final void ruleFormLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:91:2: ( ( ( rule__FormLayout__LayoutAssignment ) ) )
            // InternalVFormDsl.g:92:2: ( ( rule__FormLayout__LayoutAssignment ) )
            {
            // InternalVFormDsl.g:92:2: ( ( rule__FormLayout__LayoutAssignment ) )
            // InternalVFormDsl.g:93:3: ( rule__FormLayout__LayoutAssignment )
            {
             before(grammarAccess.getFormLayoutAccess().getLayoutAssignment()); 
            // InternalVFormDsl.g:94:3: ( rule__FormLayout__LayoutAssignment )
            // InternalVFormDsl.g:94:4: rule__FormLayout__LayoutAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FormLayout__LayoutAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFormLayoutAccess().getLayoutAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormLayout"


    // $ANTLR start "entryRuleFormInput"
    // InternalVFormDsl.g:103:1: entryRuleFormInput : ruleFormInput EOF ;
    public final void entryRuleFormInput() throws RecognitionException {
        try {
            // InternalVFormDsl.g:104:1: ( ruleFormInput EOF )
            // InternalVFormDsl.g:105:1: ruleFormInput EOF
            {
             before(grammarAccess.getFormInputRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInput();

            state._fsp--;

             after(grammarAccess.getFormInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInput"


    // $ANTLR start "ruleFormInput"
    // InternalVFormDsl.g:112:1: ruleFormInput : ( ( rule__FormInput__Alternatives ) ) ;
    public final void ruleFormInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:116:2: ( ( ( rule__FormInput__Alternatives ) ) )
            // InternalVFormDsl.g:117:2: ( ( rule__FormInput__Alternatives ) )
            {
            // InternalVFormDsl.g:117:2: ( ( rule__FormInput__Alternatives ) )
            // InternalVFormDsl.g:118:3: ( rule__FormInput__Alternatives )
            {
             before(grammarAccess.getFormInputAccess().getAlternatives()); 
            // InternalVFormDsl.g:119:3: ( rule__FormInput__Alternatives )
            // InternalVFormDsl.g:119:4: rule__FormInput__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormInputAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInput"


    // $ANTLR start "entryRuleFormInputBasic"
    // InternalVFormDsl.g:128:1: entryRuleFormInputBasic : ruleFormInputBasic EOF ;
    public final void entryRuleFormInputBasic() throws RecognitionException {
        try {
            // InternalVFormDsl.g:129:1: ( ruleFormInputBasic EOF )
            // InternalVFormDsl.g:130:1: ruleFormInputBasic EOF
            {
             before(grammarAccess.getFormInputBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInputBasic();

            state._fsp--;

             after(grammarAccess.getFormInputBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInputBasic"


    // $ANTLR start "ruleFormInputBasic"
    // InternalVFormDsl.g:137:1: ruleFormInputBasic : ( ( rule__FormInputBasic__Group__0 ) ) ;
    public final void ruleFormInputBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:141:2: ( ( ( rule__FormInputBasic__Group__0 ) ) )
            // InternalVFormDsl.g:142:2: ( ( rule__FormInputBasic__Group__0 ) )
            {
            // InternalVFormDsl.g:142:2: ( ( rule__FormInputBasic__Group__0 ) )
            // InternalVFormDsl.g:143:3: ( rule__FormInputBasic__Group__0 )
            {
             before(grammarAccess.getFormInputBasicAccess().getGroup()); 
            // InternalVFormDsl.g:144:3: ( rule__FormInputBasic__Group__0 )
            // InternalVFormDsl.g:144:4: rule__FormInputBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormInputBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInputBasic"


    // $ANTLR start "entryRuleFormInputRange"
    // InternalVFormDsl.g:153:1: entryRuleFormInputRange : ruleFormInputRange EOF ;
    public final void entryRuleFormInputRange() throws RecognitionException {
        try {
            // InternalVFormDsl.g:154:1: ( ruleFormInputRange EOF )
            // InternalVFormDsl.g:155:1: ruleFormInputRange EOF
            {
             before(grammarAccess.getFormInputRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInputRange();

            state._fsp--;

             after(grammarAccess.getFormInputRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInputRange"


    // $ANTLR start "ruleFormInputRange"
    // InternalVFormDsl.g:162:1: ruleFormInputRange : ( ( rule__FormInputRange__Group__0 ) ) ;
    public final void ruleFormInputRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:166:2: ( ( ( rule__FormInputRange__Group__0 ) ) )
            // InternalVFormDsl.g:167:2: ( ( rule__FormInputRange__Group__0 ) )
            {
            // InternalVFormDsl.g:167:2: ( ( rule__FormInputRange__Group__0 ) )
            // InternalVFormDsl.g:168:3: ( rule__FormInputRange__Group__0 )
            {
             before(grammarAccess.getFormInputRangeAccess().getGroup()); 
            // InternalVFormDsl.g:169:3: ( rule__FormInputRange__Group__0 )
            // InternalVFormDsl.g:169:4: rule__FormInputRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormInputRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInputRange"


    // $ANTLR start "entryRuleFormInputSelect"
    // InternalVFormDsl.g:178:1: entryRuleFormInputSelect : ruleFormInputSelect EOF ;
    public final void entryRuleFormInputSelect() throws RecognitionException {
        try {
            // InternalVFormDsl.g:179:1: ( ruleFormInputSelect EOF )
            // InternalVFormDsl.g:180:1: ruleFormInputSelect EOF
            {
             before(grammarAccess.getFormInputSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInputSelect();

            state._fsp--;

             after(grammarAccess.getFormInputSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInputSelect"


    // $ANTLR start "ruleFormInputSelect"
    // InternalVFormDsl.g:187:1: ruleFormInputSelect : ( ( rule__FormInputSelect__Group__0 ) ) ;
    public final void ruleFormInputSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:191:2: ( ( ( rule__FormInputSelect__Group__0 ) ) )
            // InternalVFormDsl.g:192:2: ( ( rule__FormInputSelect__Group__0 ) )
            {
            // InternalVFormDsl.g:192:2: ( ( rule__FormInputSelect__Group__0 ) )
            // InternalVFormDsl.g:193:3: ( rule__FormInputSelect__Group__0 )
            {
             before(grammarAccess.getFormInputSelectAccess().getGroup()); 
            // InternalVFormDsl.g:194:3: ( rule__FormInputSelect__Group__0 )
            // InternalVFormDsl.g:194:4: rule__FormInputSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInputSelect"


    // $ANTLR start "entryRuleOption"
    // InternalVFormDsl.g:203:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalVFormDsl.g:204:1: ( ruleOption EOF )
            // InternalVFormDsl.g:205:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalVFormDsl.g:212:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:216:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalVFormDsl.g:217:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalVFormDsl.g:217:2: ( ( rule__Option__Alternatives ) )
            // InternalVFormDsl.g:218:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalVFormDsl.g:219:3: ( rule__Option__Alternatives )
            // InternalVFormDsl.g:219:4: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalVFormDsl.g:228:1: entryRuleDataOption : ruleDataOption EOF ;
    public final void entryRuleDataOption() throws RecognitionException {
        try {
            // InternalVFormDsl.g:229:1: ( ruleDataOption EOF )
            // InternalVFormDsl.g:230:1: ruleDataOption EOF
            {
             before(grammarAccess.getDataOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataOption"


    // $ANTLR start "ruleDataOption"
    // InternalVFormDsl.g:237:1: ruleDataOption : ( ( rule__DataOption__Group__0 ) ) ;
    public final void ruleDataOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:241:2: ( ( ( rule__DataOption__Group__0 ) ) )
            // InternalVFormDsl.g:242:2: ( ( rule__DataOption__Group__0 ) )
            {
            // InternalVFormDsl.g:242:2: ( ( rule__DataOption__Group__0 ) )
            // InternalVFormDsl.g:243:3: ( rule__DataOption__Group__0 )
            {
             before(grammarAccess.getDataOptionAccess().getGroup()); 
            // InternalVFormDsl.g:244:3: ( rule__DataOption__Group__0 )
            // InternalVFormDsl.g:244:4: rule__DataOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOption"


    // $ANTLR start "entryRuleEnumOption"
    // InternalVFormDsl.g:253:1: entryRuleEnumOption : ruleEnumOption EOF ;
    public final void entryRuleEnumOption() throws RecognitionException {
        try {
            // InternalVFormDsl.g:254:1: ( ruleEnumOption EOF )
            // InternalVFormDsl.g:255:1: ruleEnumOption EOF
            {
             before(grammarAccess.getEnumOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumOption();

            state._fsp--;

             after(grammarAccess.getEnumOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumOption"


    // $ANTLR start "ruleEnumOption"
    // InternalVFormDsl.g:262:1: ruleEnumOption : ( ( rule__EnumOption__Group__0 ) ) ;
    public final void ruleEnumOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:266:2: ( ( ( rule__EnumOption__Group__0 ) ) )
            // InternalVFormDsl.g:267:2: ( ( rule__EnumOption__Group__0 ) )
            {
            // InternalVFormDsl.g:267:2: ( ( rule__EnumOption__Group__0 ) )
            // InternalVFormDsl.g:268:3: ( rule__EnumOption__Group__0 )
            {
             before(grammarAccess.getEnumOptionAccess().getGroup()); 
            // InternalVFormDsl.g:269:3: ( rule__EnumOption__Group__0 )
            // InternalVFormDsl.g:269:4: rule__EnumOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumOption"


    // $ANTLR start "entryRuleNumberOption"
    // InternalVFormDsl.g:278:1: entryRuleNumberOption : ruleNumberOption EOF ;
    public final void entryRuleNumberOption() throws RecognitionException {
        try {
            // InternalVFormDsl.g:279:1: ( ruleNumberOption EOF )
            // InternalVFormDsl.g:280:1: ruleNumberOption EOF
            {
             before(grammarAccess.getNumberOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberOption();

            state._fsp--;

             after(grammarAccess.getNumberOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberOption"


    // $ANTLR start "ruleNumberOption"
    // InternalVFormDsl.g:287:1: ruleNumberOption : ( ( rule__NumberOption__Group__0 ) ) ;
    public final void ruleNumberOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:291:2: ( ( ( rule__NumberOption__Group__0 ) ) )
            // InternalVFormDsl.g:292:2: ( ( rule__NumberOption__Group__0 ) )
            {
            // InternalVFormDsl.g:292:2: ( ( rule__NumberOption__Group__0 ) )
            // InternalVFormDsl.g:293:3: ( rule__NumberOption__Group__0 )
            {
             before(grammarAccess.getNumberOptionAccess().getGroup()); 
            // InternalVFormDsl.g:294:3: ( rule__NumberOption__Group__0 )
            // InternalVFormDsl.g:294:4: rule__NumberOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberOption"


    // $ANTLR start "entryRuleFormInputSearch"
    // InternalVFormDsl.g:303:1: entryRuleFormInputSearch : ruleFormInputSearch EOF ;
    public final void entryRuleFormInputSearch() throws RecognitionException {
        try {
            // InternalVFormDsl.g:304:1: ( ruleFormInputSearch EOF )
            // InternalVFormDsl.g:305:1: ruleFormInputSearch EOF
            {
             before(grammarAccess.getFormInputSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInputSearch();

            state._fsp--;

             after(grammarAccess.getFormInputSearchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInputSearch"


    // $ANTLR start "ruleFormInputSearch"
    // InternalVFormDsl.g:312:1: ruleFormInputSearch : ( ( rule__FormInputSearch__Group__0 ) ) ;
    public final void ruleFormInputSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:316:2: ( ( ( rule__FormInputSearch__Group__0 ) ) )
            // InternalVFormDsl.g:317:2: ( ( rule__FormInputSearch__Group__0 ) )
            {
            // InternalVFormDsl.g:317:2: ( ( rule__FormInputSearch__Group__0 ) )
            // InternalVFormDsl.g:318:3: ( rule__FormInputSearch__Group__0 )
            {
             before(grammarAccess.getFormInputSearchAccess().getGroup()); 
            // InternalVFormDsl.g:319:3: ( rule__FormInputSearch__Group__0 )
            // InternalVFormDsl.g:319:4: rule__FormInputSearch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSearchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInputSearch"


    // $ANTLR start "entryRuleOptionItem"
    // InternalVFormDsl.g:328:1: entryRuleOptionItem : ruleOptionItem EOF ;
    public final void entryRuleOptionItem() throws RecognitionException {
        try {
            // InternalVFormDsl.g:329:1: ( ruleOptionItem EOF )
            // InternalVFormDsl.g:330:1: ruleOptionItem EOF
            {
             before(grammarAccess.getOptionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionItem();

            state._fsp--;

             after(grammarAccess.getOptionItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionItem"


    // $ANTLR start "ruleOptionItem"
    // InternalVFormDsl.g:337:1: ruleOptionItem : ( ( rule__OptionItem__Alternatives ) ) ;
    public final void ruleOptionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:341:2: ( ( ( rule__OptionItem__Alternatives ) ) )
            // InternalVFormDsl.g:342:2: ( ( rule__OptionItem__Alternatives ) )
            {
            // InternalVFormDsl.g:342:2: ( ( rule__OptionItem__Alternatives ) )
            // InternalVFormDsl.g:343:3: ( rule__OptionItem__Alternatives )
            {
             before(grammarAccess.getOptionItemAccess().getAlternatives()); 
            // InternalVFormDsl.g:344:3: ( rule__OptionItem__Alternatives )
            // InternalVFormDsl.g:344:4: rule__OptionItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionItem"


    // $ANTLR start "entryRuleStringOptionItem"
    // InternalVFormDsl.g:353:1: entryRuleStringOptionItem : ruleStringOptionItem EOF ;
    public final void entryRuleStringOptionItem() throws RecognitionException {
        try {
            // InternalVFormDsl.g:354:1: ( ruleStringOptionItem EOF )
            // InternalVFormDsl.g:355:1: ruleStringOptionItem EOF
            {
             before(grammarAccess.getStringOptionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOptionItem();

            state._fsp--;

             after(grammarAccess.getStringOptionItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringOptionItem"


    // $ANTLR start "ruleStringOptionItem"
    // InternalVFormDsl.g:362:1: ruleStringOptionItem : ( ( rule__StringOptionItem__ValueAssignment ) ) ;
    public final void ruleStringOptionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:366:2: ( ( ( rule__StringOptionItem__ValueAssignment ) ) )
            // InternalVFormDsl.g:367:2: ( ( rule__StringOptionItem__ValueAssignment ) )
            {
            // InternalVFormDsl.g:367:2: ( ( rule__StringOptionItem__ValueAssignment ) )
            // InternalVFormDsl.g:368:3: ( rule__StringOptionItem__ValueAssignment )
            {
             before(grammarAccess.getStringOptionItemAccess().getValueAssignment()); 
            // InternalVFormDsl.g:369:3: ( rule__StringOptionItem__ValueAssignment )
            // InternalVFormDsl.g:369:4: rule__StringOptionItem__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringOptionItem__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringOptionItemAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOptionItem"


    // $ANTLR start "entryRuleIntOptionItem"
    // InternalVFormDsl.g:378:1: entryRuleIntOptionItem : ruleIntOptionItem EOF ;
    public final void entryRuleIntOptionItem() throws RecognitionException {
        try {
            // InternalVFormDsl.g:379:1: ( ruleIntOptionItem EOF )
            // InternalVFormDsl.g:380:1: ruleIntOptionItem EOF
            {
             before(grammarAccess.getIntOptionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleIntOptionItem();

            state._fsp--;

             after(grammarAccess.getIntOptionItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntOptionItem"


    // $ANTLR start "ruleIntOptionItem"
    // InternalVFormDsl.g:387:1: ruleIntOptionItem : ( ( rule__IntOptionItem__ValueAssignment ) ) ;
    public final void ruleIntOptionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:391:2: ( ( ( rule__IntOptionItem__ValueAssignment ) ) )
            // InternalVFormDsl.g:392:2: ( ( rule__IntOptionItem__ValueAssignment ) )
            {
            // InternalVFormDsl.g:392:2: ( ( rule__IntOptionItem__ValueAssignment ) )
            // InternalVFormDsl.g:393:3: ( rule__IntOptionItem__ValueAssignment )
            {
             before(grammarAccess.getIntOptionItemAccess().getValueAssignment()); 
            // InternalVFormDsl.g:394:3: ( rule__IntOptionItem__ValueAssignment )
            // InternalVFormDsl.g:394:4: rule__IntOptionItem__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntOptionItem__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionItemAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntOptionItem"


    // $ANTLR start "entryRuleDataOptionItem"
    // InternalVFormDsl.g:403:1: entryRuleDataOptionItem : ruleDataOptionItem EOF ;
    public final void entryRuleDataOptionItem() throws RecognitionException {
        try {
            // InternalVFormDsl.g:404:1: ( ruleDataOptionItem EOF )
            // InternalVFormDsl.g:405:1: ruleDataOptionItem EOF
            {
             before(grammarAccess.getDataOptionItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOptionItem();

            state._fsp--;

             after(grammarAccess.getDataOptionItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataOptionItem"


    // $ANTLR start "ruleDataOptionItem"
    // InternalVFormDsl.g:412:1: ruleDataOptionItem : ( ( rule__DataOptionItem__ValueAssignment ) ) ;
    public final void ruleDataOptionItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:416:2: ( ( ( rule__DataOptionItem__ValueAssignment ) ) )
            // InternalVFormDsl.g:417:2: ( ( rule__DataOptionItem__ValueAssignment ) )
            {
            // InternalVFormDsl.g:417:2: ( ( rule__DataOptionItem__ValueAssignment ) )
            // InternalVFormDsl.g:418:3: ( rule__DataOptionItem__ValueAssignment )
            {
             before(grammarAccess.getDataOptionItemAccess().getValueAssignment()); 
            // InternalVFormDsl.g:419:3: ( rule__DataOptionItem__ValueAssignment )
            // InternalVFormDsl.g:419:4: rule__DataOptionItem__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DataOptionItem__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionItemAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOptionItem"


    // $ANTLR start "entryRuleFormInputGroup"
    // InternalVFormDsl.g:428:1: entryRuleFormInputGroup : ruleFormInputGroup EOF ;
    public final void entryRuleFormInputGroup() throws RecognitionException {
        try {
            // InternalVFormDsl.g:429:1: ( ruleFormInputGroup EOF )
            // InternalVFormDsl.g:430:1: ruleFormInputGroup EOF
            {
             before(grammarAccess.getFormInputGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleFormInputGroup();

            state._fsp--;

             after(grammarAccess.getFormInputGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormInputGroup"


    // $ANTLR start "ruleFormInputGroup"
    // InternalVFormDsl.g:437:1: ruleFormInputGroup : ( ( rule__FormInputGroup__Group__0 ) ) ;
    public final void ruleFormInputGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:441:2: ( ( ( rule__FormInputGroup__Group__0 ) ) )
            // InternalVFormDsl.g:442:2: ( ( rule__FormInputGroup__Group__0 ) )
            {
            // InternalVFormDsl.g:442:2: ( ( rule__FormInputGroup__Group__0 ) )
            // InternalVFormDsl.g:443:3: ( rule__FormInputGroup__Group__0 )
            {
             before(grammarAccess.getFormInputGroupAccess().getGroup()); 
            // InternalVFormDsl.g:444:3: ( rule__FormInputGroup__Group__0 )
            // InternalVFormDsl.g:444:4: rule__FormInputGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormInputGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormInputGroup"


    // $ANTLR start "entryRuleData"
    // InternalVFormDsl.g:453:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalVFormDsl.g:454:1: ( ruleData EOF )
            // InternalVFormDsl.g:455:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalVFormDsl.g:462:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:466:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalVFormDsl.g:467:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalVFormDsl.g:467:2: ( ( rule__Data__Alternatives ) )
            // InternalVFormDsl.g:468:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalVFormDsl.g:469:3: ( rule__Data__Alternatives )
            // InternalVFormDsl.g:469:4: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleStringData"
    // InternalVFormDsl.g:478:1: entryRuleStringData : ruleStringData EOF ;
    public final void entryRuleStringData() throws RecognitionException {
        try {
            // InternalVFormDsl.g:479:1: ( ruleStringData EOF )
            // InternalVFormDsl.g:480:1: ruleStringData EOF
            {
             before(grammarAccess.getStringDataRule()); 
            pushFollow(FOLLOW_1);
            ruleStringData();

            state._fsp--;

             after(grammarAccess.getStringDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringData"


    // $ANTLR start "ruleStringData"
    // InternalVFormDsl.g:487:1: ruleStringData : ( ( rule__StringData__Group__0 ) ) ;
    public final void ruleStringData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:491:2: ( ( ( rule__StringData__Group__0 ) ) )
            // InternalVFormDsl.g:492:2: ( ( rule__StringData__Group__0 ) )
            {
            // InternalVFormDsl.g:492:2: ( ( rule__StringData__Group__0 ) )
            // InternalVFormDsl.g:493:3: ( rule__StringData__Group__0 )
            {
             before(grammarAccess.getStringDataAccess().getGroup()); 
            // InternalVFormDsl.g:494:3: ( rule__StringData__Group__0 )
            // InternalVFormDsl.g:494:4: rule__StringData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringData"


    // $ANTLR start "entryRuleIntData"
    // InternalVFormDsl.g:503:1: entryRuleIntData : ruleIntData EOF ;
    public final void entryRuleIntData() throws RecognitionException {
        try {
            // InternalVFormDsl.g:504:1: ( ruleIntData EOF )
            // InternalVFormDsl.g:505:1: ruleIntData EOF
            {
             before(grammarAccess.getIntDataRule()); 
            pushFollow(FOLLOW_1);
            ruleIntData();

            state._fsp--;

             after(grammarAccess.getIntDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntData"


    // $ANTLR start "ruleIntData"
    // InternalVFormDsl.g:512:1: ruleIntData : ( ( rule__IntData__Group__0 ) ) ;
    public final void ruleIntData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:516:2: ( ( ( rule__IntData__Group__0 ) ) )
            // InternalVFormDsl.g:517:2: ( ( rule__IntData__Group__0 ) )
            {
            // InternalVFormDsl.g:517:2: ( ( rule__IntData__Group__0 ) )
            // InternalVFormDsl.g:518:3: ( rule__IntData__Group__0 )
            {
             before(grammarAccess.getIntDataAccess().getGroup()); 
            // InternalVFormDsl.g:519:3: ( rule__IntData__Group__0 )
            // InternalVFormDsl.g:519:4: rule__IntData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntData"


    // $ANTLR start "ruleInputType"
    // InternalVFormDsl.g:528:1: ruleInputType : ( ( rule__InputType__Alternatives ) ) ;
    public final void ruleInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:532:1: ( ( ( rule__InputType__Alternatives ) ) )
            // InternalVFormDsl.g:533:2: ( ( rule__InputType__Alternatives ) )
            {
            // InternalVFormDsl.g:533:2: ( ( rule__InputType__Alternatives ) )
            // InternalVFormDsl.g:534:3: ( rule__InputType__Alternatives )
            {
             before(grammarAccess.getInputTypeAccess().getAlternatives()); 
            // InternalVFormDsl.g:535:3: ( rule__InputType__Alternatives )
            // InternalVFormDsl.g:535:4: rule__InputType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputType"


    // $ANTLR start "ruleLayout"
    // InternalVFormDsl.g:544:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:548:1: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalVFormDsl.g:549:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalVFormDsl.g:549:2: ( ( rule__Layout__Alternatives ) )
            // InternalVFormDsl.g:550:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalVFormDsl.g:551:3: ( rule__Layout__Alternatives )
            // InternalVFormDsl.g:551:4: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "rule__FormInput__Alternatives"
    // InternalVFormDsl.g:559:1: rule__FormInput__Alternatives : ( ( ruleFormInputBasic ) | ( ruleFormInputRange ) | ( ruleFormInputSelect ) | ( ruleFormInputSearch ) | ( ruleFormInputGroup ) );
    public final void rule__FormInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:563:1: ( ( ruleFormInputBasic ) | ( ruleFormInputRange ) | ( ruleFormInputSelect ) | ( ruleFormInputSearch ) | ( ruleFormInputGroup ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalVFormDsl.g:564:2: ( ruleFormInputBasic )
                    {
                    // InternalVFormDsl.g:564:2: ( ruleFormInputBasic )
                    // InternalVFormDsl.g:565:3: ruleFormInputBasic
                    {
                     before(grammarAccess.getFormInputAccess().getFormInputBasicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFormInputBasic();

                    state._fsp--;

                     after(grammarAccess.getFormInputAccess().getFormInputBasicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:570:2: ( ruleFormInputRange )
                    {
                    // InternalVFormDsl.g:570:2: ( ruleFormInputRange )
                    // InternalVFormDsl.g:571:3: ruleFormInputRange
                    {
                     before(grammarAccess.getFormInputAccess().getFormInputRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFormInputRange();

                    state._fsp--;

                     after(grammarAccess.getFormInputAccess().getFormInputRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:576:2: ( ruleFormInputSelect )
                    {
                    // InternalVFormDsl.g:576:2: ( ruleFormInputSelect )
                    // InternalVFormDsl.g:577:3: ruleFormInputSelect
                    {
                     before(grammarAccess.getFormInputAccess().getFormInputSelectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFormInputSelect();

                    state._fsp--;

                     after(grammarAccess.getFormInputAccess().getFormInputSelectParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVFormDsl.g:582:2: ( ruleFormInputSearch )
                    {
                    // InternalVFormDsl.g:582:2: ( ruleFormInputSearch )
                    // InternalVFormDsl.g:583:3: ruleFormInputSearch
                    {
                     before(grammarAccess.getFormInputAccess().getFormInputSearchParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFormInputSearch();

                    state._fsp--;

                     after(grammarAccess.getFormInputAccess().getFormInputSearchParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVFormDsl.g:588:2: ( ruleFormInputGroup )
                    {
                    // InternalVFormDsl.g:588:2: ( ruleFormInputGroup )
                    // InternalVFormDsl.g:589:3: ruleFormInputGroup
                    {
                     before(grammarAccess.getFormInputAccess().getFormInputGroupParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFormInputGroup();

                    state._fsp--;

                     after(grammarAccess.getFormInputAccess().getFormInputGroupParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInput__Alternatives"


    // $ANTLR start "rule__Option__Alternatives"
    // InternalVFormDsl.g:598:1: rule__Option__Alternatives : ( ( ruleDataOption ) | ( ruleEnumOption ) | ( ruleNumberOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:602:1: ( ( ruleDataOption ) | ( ruleEnumOption ) | ( ruleNumberOption ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                case 35:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVFormDsl.g:603:2: ( ruleDataOption )
                    {
                    // InternalVFormDsl.g:603:2: ( ruleDataOption )
                    // InternalVFormDsl.g:604:3: ruleDataOption
                    {
                     before(grammarAccess.getOptionAccess().getDataOptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getDataOptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:609:2: ( ruleEnumOption )
                    {
                    // InternalVFormDsl.g:609:2: ( ruleEnumOption )
                    // InternalVFormDsl.g:610:3: ruleEnumOption
                    {
                     before(grammarAccess.getOptionAccess().getEnumOptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getEnumOptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:615:2: ( ruleNumberOption )
                    {
                    // InternalVFormDsl.g:615:2: ( ruleNumberOption )
                    // InternalVFormDsl.g:616:3: ruleNumberOption
                    {
                     before(grammarAccess.getOptionAccess().getNumberOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getNumberOptionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__OptionItem__Alternatives"
    // InternalVFormDsl.g:625:1: rule__OptionItem__Alternatives : ( ( ruleStringOptionItem ) | ( ruleIntOptionItem ) | ( ruleDataOptionItem ) );
    public final void rule__OptionItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:629:1: ( ( ruleStringOptionItem ) | ( ruleIntOptionItem ) | ( ruleDataOptionItem ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVFormDsl.g:630:2: ( ruleStringOptionItem )
                    {
                    // InternalVFormDsl.g:630:2: ( ruleStringOptionItem )
                    // InternalVFormDsl.g:631:3: ruleStringOptionItem
                    {
                     before(grammarAccess.getOptionItemAccess().getStringOptionItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringOptionItem();

                    state._fsp--;

                     after(grammarAccess.getOptionItemAccess().getStringOptionItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:636:2: ( ruleIntOptionItem )
                    {
                    // InternalVFormDsl.g:636:2: ( ruleIntOptionItem )
                    // InternalVFormDsl.g:637:3: ruleIntOptionItem
                    {
                     before(grammarAccess.getOptionItemAccess().getIntOptionItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntOptionItem();

                    state._fsp--;

                     after(grammarAccess.getOptionItemAccess().getIntOptionItemParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:642:2: ( ruleDataOptionItem )
                    {
                    // InternalVFormDsl.g:642:2: ( ruleDataOptionItem )
                    // InternalVFormDsl.g:643:3: ruleDataOptionItem
                    {
                     before(grammarAccess.getOptionItemAccess().getDataOptionItemParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataOptionItem();

                    state._fsp--;

                     after(grammarAccess.getOptionItemAccess().getDataOptionItemParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionItem__Alternatives"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalVFormDsl.g:652:1: rule__Data__Alternatives : ( ( ruleStringData ) | ( ruleIntData ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:656:1: ( ( ruleStringData ) | ( ruleIntData ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==42) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_STRING) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==22) ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4==43) ) {
                                int LA4_5 = input.LA(6);

                                if ( (LA4_5==RULE_INT) ) {
                                    alt4=2;
                                }
                                else if ( (LA4_5==RULE_STRING) ) {
                                    alt4=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVFormDsl.g:657:2: ( ruleStringData )
                    {
                    // InternalVFormDsl.g:657:2: ( ruleStringData )
                    // InternalVFormDsl.g:658:3: ruleStringData
                    {
                     before(grammarAccess.getDataAccess().getStringDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getStringDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:663:2: ( ruleIntData )
                    {
                    // InternalVFormDsl.g:663:2: ( ruleIntData )
                    // InternalVFormDsl.g:664:3: ruleIntData
                    {
                     before(grammarAccess.getDataAccess().getIntDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getIntDataParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__InputType__Alternatives"
    // InternalVFormDsl.g:673:1: rule__InputType__Alternatives : ( ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) | ( ( 'RANGE' ) ) | ( ( 'SELECT' ) ) | ( ( 'SEARCH' ) ) | ( ( 'GROUP' ) ) );
    public final void rule__InputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:677:1: ( ( ( 'TEXT' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) | ( ( 'RANGE' ) ) | ( ( 'SELECT' ) ) | ( ( 'SEARCH' ) ) | ( ( 'GROUP' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVFormDsl.g:678:2: ( ( 'TEXT' ) )
                    {
                    // InternalVFormDsl.g:678:2: ( ( 'TEXT' ) )
                    // InternalVFormDsl.g:679:3: ( 'TEXT' )
                    {
                     before(grammarAccess.getInputTypeAccess().getTEXTEnumLiteralDeclaration_0()); 
                    // InternalVFormDsl.g:680:3: ( 'TEXT' )
                    // InternalVFormDsl.g:680:4: 'TEXT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getTEXTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:684:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalVFormDsl.g:684:2: ( ( 'CHECKBOX' ) )
                    // InternalVFormDsl.g:685:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getInputTypeAccess().getCHECKBOXEnumLiteralDeclaration_1()); 
                    // InternalVFormDsl.g:686:3: ( 'CHECKBOX' )
                    // InternalVFormDsl.g:686:4: 'CHECKBOX'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getCHECKBOXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:690:2: ( ( 'NUMBER' ) )
                    {
                    // InternalVFormDsl.g:690:2: ( ( 'NUMBER' ) )
                    // InternalVFormDsl.g:691:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getInputTypeAccess().getNUMBEREnumLiteralDeclaration_2()); 
                    // InternalVFormDsl.g:692:3: ( 'NUMBER' )
                    // InternalVFormDsl.g:692:4: 'NUMBER'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getNUMBEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVFormDsl.g:696:2: ( ( 'DATE' ) )
                    {
                    // InternalVFormDsl.g:696:2: ( ( 'DATE' ) )
                    // InternalVFormDsl.g:697:3: ( 'DATE' )
                    {
                     before(grammarAccess.getInputTypeAccess().getDATEEnumLiteralDeclaration_3()); 
                    // InternalVFormDsl.g:698:3: ( 'DATE' )
                    // InternalVFormDsl.g:698:4: 'DATE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getDATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVFormDsl.g:702:2: ( ( 'RANGE' ) )
                    {
                    // InternalVFormDsl.g:702:2: ( ( 'RANGE' ) )
                    // InternalVFormDsl.g:703:3: ( 'RANGE' )
                    {
                     before(grammarAccess.getInputTypeAccess().getRANGEEnumLiteralDeclaration_4()); 
                    // InternalVFormDsl.g:704:3: ( 'RANGE' )
                    // InternalVFormDsl.g:704:4: 'RANGE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getRANGEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVFormDsl.g:708:2: ( ( 'SELECT' ) )
                    {
                    // InternalVFormDsl.g:708:2: ( ( 'SELECT' ) )
                    // InternalVFormDsl.g:709:3: ( 'SELECT' )
                    {
                     before(grammarAccess.getInputTypeAccess().getSELECTEnumLiteralDeclaration_5()); 
                    // InternalVFormDsl.g:710:3: ( 'SELECT' )
                    // InternalVFormDsl.g:710:4: 'SELECT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getSELECTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVFormDsl.g:714:2: ( ( 'SEARCH' ) )
                    {
                    // InternalVFormDsl.g:714:2: ( ( 'SEARCH' ) )
                    // InternalVFormDsl.g:715:3: ( 'SEARCH' )
                    {
                     before(grammarAccess.getInputTypeAccess().getSEARCHEnumLiteralDeclaration_6()); 
                    // InternalVFormDsl.g:716:3: ( 'SEARCH' )
                    // InternalVFormDsl.g:716:4: 'SEARCH'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getSEARCHEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVFormDsl.g:720:2: ( ( 'GROUP' ) )
                    {
                    // InternalVFormDsl.g:720:2: ( ( 'GROUP' ) )
                    // InternalVFormDsl.g:721:3: ( 'GROUP' )
                    {
                     before(grammarAccess.getInputTypeAccess().getGROUPEnumLiteralDeclaration_7()); 
                    // InternalVFormDsl.g:722:3: ( 'GROUP' )
                    // InternalVFormDsl.g:722:4: 'GROUP'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputTypeAccess().getGROUPEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Alternatives"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalVFormDsl.g:730:1: rule__Layout__Alternatives : ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:734:1: ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVFormDsl.g:735:2: ( ( 'horizontal' ) )
                    {
                    // InternalVFormDsl.g:735:2: ( ( 'horizontal' ) )
                    // InternalVFormDsl.g:736:3: ( 'horizontal' )
                    {
                     before(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 
                    // InternalVFormDsl.g:737:3: ( 'horizontal' )
                    // InternalVFormDsl.g:737:4: 'horizontal'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:741:2: ( ( 'vertical' ) )
                    {
                    // InternalVFormDsl.g:741:2: ( ( 'vertical' ) )
                    // InternalVFormDsl.g:742:3: ( 'vertical' )
                    {
                     before(grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1()); 
                    // InternalVFormDsl.g:743:3: ( 'vertical' )
                    // InternalVFormDsl.g:743:4: 'vertical'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalVFormDsl.g:751:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:755:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalVFormDsl.g:756:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalVFormDsl.g:763:1: rule__Model__Group__0__Impl : ( 'formLayout:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:767:1: ( ( 'formLayout:' ) )
            // InternalVFormDsl.g:768:1: ( 'formLayout:' )
            {
            // InternalVFormDsl.g:768:1: ( 'formLayout:' )
            // InternalVFormDsl.g:769:2: 'formLayout:'
            {
             before(grammarAccess.getModelAccess().getFormLayoutKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFormLayoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalVFormDsl.g:778:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:782:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalVFormDsl.g:783:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalVFormDsl.g:790:1: rule__Model__Group__1__Impl : ( ( rule__Model__FormLayoutAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:794:1: ( ( ( rule__Model__FormLayoutAssignment_1 ) ) )
            // InternalVFormDsl.g:795:1: ( ( rule__Model__FormLayoutAssignment_1 ) )
            {
            // InternalVFormDsl.g:795:1: ( ( rule__Model__FormLayoutAssignment_1 ) )
            // InternalVFormDsl.g:796:2: ( rule__Model__FormLayoutAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getFormLayoutAssignment_1()); 
            // InternalVFormDsl.g:797:2: ( rule__Model__FormLayoutAssignment_1 )
            // InternalVFormDsl.g:797:3: rule__Model__FormLayoutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormLayoutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormLayoutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalVFormDsl.g:805:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:809:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalVFormDsl.g:810:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalVFormDsl.g:817:1: rule__Model__Group__2__Impl : ( ',' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:821:1: ( ( ',' ) )
            // InternalVFormDsl.g:822:1: ( ',' )
            {
            // InternalVFormDsl.g:822:1: ( ',' )
            // InternalVFormDsl.g:823:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalVFormDsl.g:832:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:836:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalVFormDsl.g:837:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalVFormDsl.g:844:1: rule__Model__Group__3__Impl : ( 'formInputs:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:848:1: ( ( 'formInputs:' ) )
            // InternalVFormDsl.g:849:1: ( 'formInputs:' )
            {
            // InternalVFormDsl.g:849:1: ( 'formInputs:' )
            // InternalVFormDsl.g:850:2: 'formInputs:'
            {
             before(grammarAccess.getModelAccess().getFormInputsKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFormInputsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalVFormDsl.g:859:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:863:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalVFormDsl.g:864:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalVFormDsl.g:871:1: rule__Model__Group__4__Impl : ( '[' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:875:1: ( ( '[' ) )
            // InternalVFormDsl.g:876:1: ( '[' )
            {
            // InternalVFormDsl.g:876:1: ( '[' )
            // InternalVFormDsl.g:877:2: '['
            {
             before(grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalVFormDsl.g:886:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:890:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalVFormDsl.g:891:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalVFormDsl.g:898:1: rule__Model__Group__5__Impl : ( ( rule__Model__FormInputAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:902:1: ( ( ( rule__Model__FormInputAssignment_5 )* ) )
            // InternalVFormDsl.g:903:1: ( ( rule__Model__FormInputAssignment_5 )* )
            {
            // InternalVFormDsl.g:903:1: ( ( rule__Model__FormInputAssignment_5 )* )
            // InternalVFormDsl.g:904:2: ( rule__Model__FormInputAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getFormInputAssignment_5()); 
            // InternalVFormDsl.g:905:2: ( rule__Model__FormInputAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVFormDsl.g:905:3: rule__Model__FormInputAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__FormInputAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFormInputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalVFormDsl.g:913:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:917:1: ( rule__Model__Group__6__Impl )
            // InternalVFormDsl.g:918:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalVFormDsl.g:924:1: rule__Model__Group__6__Impl : ( ']' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:928:1: ( ( ']' ) )
            // InternalVFormDsl.g:929:1: ( ']' )
            {
            // InternalVFormDsl.g:929:1: ( ']' )
            // InternalVFormDsl.g:930:2: ']'
            {
             before(grammarAccess.getModelAccess().getRightSquareBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__0"
    // InternalVFormDsl.g:940:1: rule__FormInputBasic__Group__0 : rule__FormInputBasic__Group__0__Impl rule__FormInputBasic__Group__1 ;
    public final void rule__FormInputBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:944:1: ( rule__FormInputBasic__Group__0__Impl rule__FormInputBasic__Group__1 )
            // InternalVFormDsl.g:945:2: rule__FormInputBasic__Group__0__Impl rule__FormInputBasic__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormInputBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__0"


    // $ANTLR start "rule__FormInputBasic__Group__0__Impl"
    // InternalVFormDsl.g:952:1: rule__FormInputBasic__Group__0__Impl : ( 'name' ) ;
    public final void rule__FormInputBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:956:1: ( ( 'name' ) )
            // InternalVFormDsl.g:957:1: ( 'name' )
            {
            // InternalVFormDsl.g:957:1: ( 'name' )
            // InternalVFormDsl.g:958:2: 'name'
            {
             before(grammarAccess.getFormInputBasicAccess().getNameKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormInputBasicAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__0__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__1"
    // InternalVFormDsl.g:967:1: rule__FormInputBasic__Group__1 : rule__FormInputBasic__Group__1__Impl rule__FormInputBasic__Group__2 ;
    public final void rule__FormInputBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:971:1: ( rule__FormInputBasic__Group__1__Impl rule__FormInputBasic__Group__2 )
            // InternalVFormDsl.g:972:2: rule__FormInputBasic__Group__1__Impl rule__FormInputBasic__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FormInputBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__1"


    // $ANTLR start "rule__FormInputBasic__Group__1__Impl"
    // InternalVFormDsl.g:979:1: rule__FormInputBasic__Group__1__Impl : ( ':' ) ;
    public final void rule__FormInputBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:983:1: ( ( ':' ) )
            // InternalVFormDsl.g:984:1: ( ':' )
            {
            // InternalVFormDsl.g:984:1: ( ':' )
            // InternalVFormDsl.g:985:2: ':'
            {
             before(grammarAccess.getFormInputBasicAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputBasicAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__1__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__2"
    // InternalVFormDsl.g:994:1: rule__FormInputBasic__Group__2 : rule__FormInputBasic__Group__2__Impl rule__FormInputBasic__Group__3 ;
    public final void rule__FormInputBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:998:1: ( rule__FormInputBasic__Group__2__Impl rule__FormInputBasic__Group__3 )
            // InternalVFormDsl.g:999:2: rule__FormInputBasic__Group__2__Impl rule__FormInputBasic__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FormInputBasic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__2"


    // $ANTLR start "rule__FormInputBasic__Group__2__Impl"
    // InternalVFormDsl.g:1006:1: rule__FormInputBasic__Group__2__Impl : ( ( rule__FormInputBasic__NameAssignment_2 ) ) ;
    public final void rule__FormInputBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1010:1: ( ( ( rule__FormInputBasic__NameAssignment_2 ) ) )
            // InternalVFormDsl.g:1011:1: ( ( rule__FormInputBasic__NameAssignment_2 ) )
            {
            // InternalVFormDsl.g:1011:1: ( ( rule__FormInputBasic__NameAssignment_2 ) )
            // InternalVFormDsl.g:1012:2: ( rule__FormInputBasic__NameAssignment_2 )
            {
             before(grammarAccess.getFormInputBasicAccess().getNameAssignment_2()); 
            // InternalVFormDsl.g:1013:2: ( rule__FormInputBasic__NameAssignment_2 )
            // InternalVFormDsl.g:1013:3: rule__FormInputBasic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormInputBasic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormInputBasicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__2__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__3"
    // InternalVFormDsl.g:1021:1: rule__FormInputBasic__Group__3 : rule__FormInputBasic__Group__3__Impl rule__FormInputBasic__Group__4 ;
    public final void rule__FormInputBasic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1025:1: ( rule__FormInputBasic__Group__3__Impl rule__FormInputBasic__Group__4 )
            // InternalVFormDsl.g:1026:2: rule__FormInputBasic__Group__3__Impl rule__FormInputBasic__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FormInputBasic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__3"


    // $ANTLR start "rule__FormInputBasic__Group__3__Impl"
    // InternalVFormDsl.g:1033:1: rule__FormInputBasic__Group__3__Impl : ( 'type' ) ;
    public final void rule__FormInputBasic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1037:1: ( ( 'type' ) )
            // InternalVFormDsl.g:1038:1: ( 'type' )
            {
            // InternalVFormDsl.g:1038:1: ( 'type' )
            // InternalVFormDsl.g:1039:2: 'type'
            {
             before(grammarAccess.getFormInputBasicAccess().getTypeKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormInputBasicAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__3__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__4"
    // InternalVFormDsl.g:1048:1: rule__FormInputBasic__Group__4 : rule__FormInputBasic__Group__4__Impl rule__FormInputBasic__Group__5 ;
    public final void rule__FormInputBasic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1052:1: ( rule__FormInputBasic__Group__4__Impl rule__FormInputBasic__Group__5 )
            // InternalVFormDsl.g:1053:2: rule__FormInputBasic__Group__4__Impl rule__FormInputBasic__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__FormInputBasic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__4"


    // $ANTLR start "rule__FormInputBasic__Group__4__Impl"
    // InternalVFormDsl.g:1060:1: rule__FormInputBasic__Group__4__Impl : ( ':' ) ;
    public final void rule__FormInputBasic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1064:1: ( ( ':' ) )
            // InternalVFormDsl.g:1065:1: ( ':' )
            {
            // InternalVFormDsl.g:1065:1: ( ':' )
            // InternalVFormDsl.g:1066:2: ':'
            {
             before(grammarAccess.getFormInputBasicAccess().getColonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputBasicAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__4__Impl"


    // $ANTLR start "rule__FormInputBasic__Group__5"
    // InternalVFormDsl.g:1075:1: rule__FormInputBasic__Group__5 : rule__FormInputBasic__Group__5__Impl ;
    public final void rule__FormInputBasic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1079:1: ( rule__FormInputBasic__Group__5__Impl )
            // InternalVFormDsl.g:1080:2: rule__FormInputBasic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputBasic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__5"


    // $ANTLR start "rule__FormInputBasic__Group__5__Impl"
    // InternalVFormDsl.g:1086:1: rule__FormInputBasic__Group__5__Impl : ( ( rule__FormInputBasic__TypeAssignment_5 ) ) ;
    public final void rule__FormInputBasic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1090:1: ( ( ( rule__FormInputBasic__TypeAssignment_5 ) ) )
            // InternalVFormDsl.g:1091:1: ( ( rule__FormInputBasic__TypeAssignment_5 ) )
            {
            // InternalVFormDsl.g:1091:1: ( ( rule__FormInputBasic__TypeAssignment_5 ) )
            // InternalVFormDsl.g:1092:2: ( rule__FormInputBasic__TypeAssignment_5 )
            {
             before(grammarAccess.getFormInputBasicAccess().getTypeAssignment_5()); 
            // InternalVFormDsl.g:1093:2: ( rule__FormInputBasic__TypeAssignment_5 )
            // InternalVFormDsl.g:1093:3: rule__FormInputBasic__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FormInputBasic__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFormInputBasicAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__Group__5__Impl"


    // $ANTLR start "rule__FormInputRange__Group__0"
    // InternalVFormDsl.g:1102:1: rule__FormInputRange__Group__0 : rule__FormInputRange__Group__0__Impl rule__FormInputRange__Group__1 ;
    public final void rule__FormInputRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1106:1: ( rule__FormInputRange__Group__0__Impl rule__FormInputRange__Group__1 )
            // InternalVFormDsl.g:1107:2: rule__FormInputRange__Group__0__Impl rule__FormInputRange__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormInputRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__0"


    // $ANTLR start "rule__FormInputRange__Group__0__Impl"
    // InternalVFormDsl.g:1114:1: rule__FormInputRange__Group__0__Impl : ( 'name' ) ;
    public final void rule__FormInputRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1118:1: ( ( 'name' ) )
            // InternalVFormDsl.g:1119:1: ( 'name' )
            {
            // InternalVFormDsl.g:1119:1: ( 'name' )
            // InternalVFormDsl.g:1120:2: 'name'
            {
             before(grammarAccess.getFormInputRangeAccess().getNameKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__0__Impl"


    // $ANTLR start "rule__FormInputRange__Group__1"
    // InternalVFormDsl.g:1129:1: rule__FormInputRange__Group__1 : rule__FormInputRange__Group__1__Impl rule__FormInputRange__Group__2 ;
    public final void rule__FormInputRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1133:1: ( rule__FormInputRange__Group__1__Impl rule__FormInputRange__Group__2 )
            // InternalVFormDsl.g:1134:2: rule__FormInputRange__Group__1__Impl rule__FormInputRange__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FormInputRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__1"


    // $ANTLR start "rule__FormInputRange__Group__1__Impl"
    // InternalVFormDsl.g:1141:1: rule__FormInputRange__Group__1__Impl : ( ':' ) ;
    public final void rule__FormInputRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1145:1: ( ( ':' ) )
            // InternalVFormDsl.g:1146:1: ( ':' )
            {
            // InternalVFormDsl.g:1146:1: ( ':' )
            // InternalVFormDsl.g:1147:2: ':'
            {
             before(grammarAccess.getFormInputRangeAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__1__Impl"


    // $ANTLR start "rule__FormInputRange__Group__2"
    // InternalVFormDsl.g:1156:1: rule__FormInputRange__Group__2 : rule__FormInputRange__Group__2__Impl rule__FormInputRange__Group__3 ;
    public final void rule__FormInputRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1160:1: ( rule__FormInputRange__Group__2__Impl rule__FormInputRange__Group__3 )
            // InternalVFormDsl.g:1161:2: rule__FormInputRange__Group__2__Impl rule__FormInputRange__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FormInputRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__2"


    // $ANTLR start "rule__FormInputRange__Group__2__Impl"
    // InternalVFormDsl.g:1168:1: rule__FormInputRange__Group__2__Impl : ( ( rule__FormInputRange__NameAssignment_2 ) ) ;
    public final void rule__FormInputRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1172:1: ( ( ( rule__FormInputRange__NameAssignment_2 ) ) )
            // InternalVFormDsl.g:1173:1: ( ( rule__FormInputRange__NameAssignment_2 ) )
            {
            // InternalVFormDsl.g:1173:1: ( ( rule__FormInputRange__NameAssignment_2 ) )
            // InternalVFormDsl.g:1174:2: ( rule__FormInputRange__NameAssignment_2 )
            {
             before(grammarAccess.getFormInputRangeAccess().getNameAssignment_2()); 
            // InternalVFormDsl.g:1175:2: ( rule__FormInputRange__NameAssignment_2 )
            // InternalVFormDsl.g:1175:3: rule__FormInputRange__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormInputRange__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormInputRangeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__2__Impl"


    // $ANTLR start "rule__FormInputRange__Group__3"
    // InternalVFormDsl.g:1183:1: rule__FormInputRange__Group__3 : rule__FormInputRange__Group__3__Impl rule__FormInputRange__Group__4 ;
    public final void rule__FormInputRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1187:1: ( rule__FormInputRange__Group__3__Impl rule__FormInputRange__Group__4 )
            // InternalVFormDsl.g:1188:2: rule__FormInputRange__Group__3__Impl rule__FormInputRange__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FormInputRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__3"


    // $ANTLR start "rule__FormInputRange__Group__3__Impl"
    // InternalVFormDsl.g:1195:1: rule__FormInputRange__Group__3__Impl : ( ',' ) ;
    public final void rule__FormInputRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1199:1: ( ( ',' ) )
            // InternalVFormDsl.g:1200:1: ( ',' )
            {
            // InternalVFormDsl.g:1200:1: ( ',' )
            // InternalVFormDsl.g:1201:2: ','
            {
             before(grammarAccess.getFormInputRangeAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__3__Impl"


    // $ANTLR start "rule__FormInputRange__Group__4"
    // InternalVFormDsl.g:1210:1: rule__FormInputRange__Group__4 : rule__FormInputRange__Group__4__Impl rule__FormInputRange__Group__5 ;
    public final void rule__FormInputRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1214:1: ( rule__FormInputRange__Group__4__Impl rule__FormInputRange__Group__5 )
            // InternalVFormDsl.g:1215:2: rule__FormInputRange__Group__4__Impl rule__FormInputRange__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FormInputRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__4"


    // $ANTLR start "rule__FormInputRange__Group__4__Impl"
    // InternalVFormDsl.g:1222:1: rule__FormInputRange__Group__4__Impl : ( 'type' ) ;
    public final void rule__FormInputRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1226:1: ( ( 'type' ) )
            // InternalVFormDsl.g:1227:1: ( 'type' )
            {
            // InternalVFormDsl.g:1227:1: ( 'type' )
            // InternalVFormDsl.g:1228:2: 'type'
            {
             before(grammarAccess.getFormInputRangeAccess().getTypeKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__4__Impl"


    // $ANTLR start "rule__FormInputRange__Group__5"
    // InternalVFormDsl.g:1237:1: rule__FormInputRange__Group__5 : rule__FormInputRange__Group__5__Impl rule__FormInputRange__Group__6 ;
    public final void rule__FormInputRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1241:1: ( rule__FormInputRange__Group__5__Impl rule__FormInputRange__Group__6 )
            // InternalVFormDsl.g:1242:2: rule__FormInputRange__Group__5__Impl rule__FormInputRange__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__FormInputRange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__5"


    // $ANTLR start "rule__FormInputRange__Group__5__Impl"
    // InternalVFormDsl.g:1249:1: rule__FormInputRange__Group__5__Impl : ( ':' ) ;
    public final void rule__FormInputRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1253:1: ( ( ':' ) )
            // InternalVFormDsl.g:1254:1: ( ':' )
            {
            // InternalVFormDsl.g:1254:1: ( ':' )
            // InternalVFormDsl.g:1255:2: ':'
            {
             before(grammarAccess.getFormInputRangeAccess().getColonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__5__Impl"


    // $ANTLR start "rule__FormInputRange__Group__6"
    // InternalVFormDsl.g:1264:1: rule__FormInputRange__Group__6 : rule__FormInputRange__Group__6__Impl rule__FormInputRange__Group__7 ;
    public final void rule__FormInputRange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1268:1: ( rule__FormInputRange__Group__6__Impl rule__FormInputRange__Group__7 )
            // InternalVFormDsl.g:1269:2: rule__FormInputRange__Group__6__Impl rule__FormInputRange__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__FormInputRange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__6"


    // $ANTLR start "rule__FormInputRange__Group__6__Impl"
    // InternalVFormDsl.g:1276:1: rule__FormInputRange__Group__6__Impl : ( 'RANGE' ) ;
    public final void rule__FormInputRange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1280:1: ( ( 'RANGE' ) )
            // InternalVFormDsl.g:1281:1: ( 'RANGE' )
            {
            // InternalVFormDsl.g:1281:1: ( 'RANGE' )
            // InternalVFormDsl.g:1282:2: 'RANGE'
            {
             before(grammarAccess.getFormInputRangeAccess().getRANGEKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getRANGEKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__6__Impl"


    // $ANTLR start "rule__FormInputRange__Group__7"
    // InternalVFormDsl.g:1291:1: rule__FormInputRange__Group__7 : rule__FormInputRange__Group__7__Impl rule__FormInputRange__Group__8 ;
    public final void rule__FormInputRange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1295:1: ( rule__FormInputRange__Group__7__Impl rule__FormInputRange__Group__8 )
            // InternalVFormDsl.g:1296:2: rule__FormInputRange__Group__7__Impl rule__FormInputRange__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__FormInputRange__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__7"


    // $ANTLR start "rule__FormInputRange__Group__7__Impl"
    // InternalVFormDsl.g:1303:1: rule__FormInputRange__Group__7__Impl : ( ',' ) ;
    public final void rule__FormInputRange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1307:1: ( ( ',' ) )
            // InternalVFormDsl.g:1308:1: ( ',' )
            {
            // InternalVFormDsl.g:1308:1: ( ',' )
            // InternalVFormDsl.g:1309:2: ','
            {
             before(grammarAccess.getFormInputRangeAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__7__Impl"


    // $ANTLR start "rule__FormInputRange__Group__8"
    // InternalVFormDsl.g:1318:1: rule__FormInputRange__Group__8 : rule__FormInputRange__Group__8__Impl rule__FormInputRange__Group__9 ;
    public final void rule__FormInputRange__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1322:1: ( rule__FormInputRange__Group__8__Impl rule__FormInputRange__Group__9 )
            // InternalVFormDsl.g:1323:2: rule__FormInputRange__Group__8__Impl rule__FormInputRange__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__FormInputRange__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__8"


    // $ANTLR start "rule__FormInputRange__Group__8__Impl"
    // InternalVFormDsl.g:1330:1: rule__FormInputRange__Group__8__Impl : ( 'min:' ) ;
    public final void rule__FormInputRange__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1334:1: ( ( 'min:' ) )
            // InternalVFormDsl.g:1335:1: ( 'min:' )
            {
            // InternalVFormDsl.g:1335:1: ( 'min:' )
            // InternalVFormDsl.g:1336:2: 'min:'
            {
             before(grammarAccess.getFormInputRangeAccess().getMinKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getMinKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__8__Impl"


    // $ANTLR start "rule__FormInputRange__Group__9"
    // InternalVFormDsl.g:1345:1: rule__FormInputRange__Group__9 : rule__FormInputRange__Group__9__Impl rule__FormInputRange__Group__10 ;
    public final void rule__FormInputRange__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1349:1: ( rule__FormInputRange__Group__9__Impl rule__FormInputRange__Group__10 )
            // InternalVFormDsl.g:1350:2: rule__FormInputRange__Group__9__Impl rule__FormInputRange__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__FormInputRange__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__9"


    // $ANTLR start "rule__FormInputRange__Group__9__Impl"
    // InternalVFormDsl.g:1357:1: rule__FormInputRange__Group__9__Impl : ( ( rule__FormInputRange__MinAssignment_9 ) ) ;
    public final void rule__FormInputRange__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1361:1: ( ( ( rule__FormInputRange__MinAssignment_9 ) ) )
            // InternalVFormDsl.g:1362:1: ( ( rule__FormInputRange__MinAssignment_9 ) )
            {
            // InternalVFormDsl.g:1362:1: ( ( rule__FormInputRange__MinAssignment_9 ) )
            // InternalVFormDsl.g:1363:2: ( rule__FormInputRange__MinAssignment_9 )
            {
             before(grammarAccess.getFormInputRangeAccess().getMinAssignment_9()); 
            // InternalVFormDsl.g:1364:2: ( rule__FormInputRange__MinAssignment_9 )
            // InternalVFormDsl.g:1364:3: rule__FormInputRange__MinAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FormInputRange__MinAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFormInputRangeAccess().getMinAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__9__Impl"


    // $ANTLR start "rule__FormInputRange__Group__10"
    // InternalVFormDsl.g:1372:1: rule__FormInputRange__Group__10 : rule__FormInputRange__Group__10__Impl rule__FormInputRange__Group__11 ;
    public final void rule__FormInputRange__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1376:1: ( rule__FormInputRange__Group__10__Impl rule__FormInputRange__Group__11 )
            // InternalVFormDsl.g:1377:2: rule__FormInputRange__Group__10__Impl rule__FormInputRange__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__FormInputRange__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__10"


    // $ANTLR start "rule__FormInputRange__Group__10__Impl"
    // InternalVFormDsl.g:1384:1: rule__FormInputRange__Group__10__Impl : ( ',' ) ;
    public final void rule__FormInputRange__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1388:1: ( ( ',' ) )
            // InternalVFormDsl.g:1389:1: ( ',' )
            {
            // InternalVFormDsl.g:1389:1: ( ',' )
            // InternalVFormDsl.g:1390:2: ','
            {
             before(grammarAccess.getFormInputRangeAccess().getCommaKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__10__Impl"


    // $ANTLR start "rule__FormInputRange__Group__11"
    // InternalVFormDsl.g:1399:1: rule__FormInputRange__Group__11 : rule__FormInputRange__Group__11__Impl rule__FormInputRange__Group__12 ;
    public final void rule__FormInputRange__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1403:1: ( rule__FormInputRange__Group__11__Impl rule__FormInputRange__Group__12 )
            // InternalVFormDsl.g:1404:2: rule__FormInputRange__Group__11__Impl rule__FormInputRange__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__FormInputRange__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__11"


    // $ANTLR start "rule__FormInputRange__Group__11__Impl"
    // InternalVFormDsl.g:1411:1: rule__FormInputRange__Group__11__Impl : ( 'max:' ) ;
    public final void rule__FormInputRange__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1415:1: ( ( 'max:' ) )
            // InternalVFormDsl.g:1416:1: ( 'max:' )
            {
            // InternalVFormDsl.g:1416:1: ( 'max:' )
            // InternalVFormDsl.g:1417:2: 'max:'
            {
             before(grammarAccess.getFormInputRangeAccess().getMaxKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getMaxKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__11__Impl"


    // $ANTLR start "rule__FormInputRange__Group__12"
    // InternalVFormDsl.g:1426:1: rule__FormInputRange__Group__12 : rule__FormInputRange__Group__12__Impl ;
    public final void rule__FormInputRange__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1430:1: ( rule__FormInputRange__Group__12__Impl )
            // InternalVFormDsl.g:1431:2: rule__FormInputRange__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputRange__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__12"


    // $ANTLR start "rule__FormInputRange__Group__12__Impl"
    // InternalVFormDsl.g:1437:1: rule__FormInputRange__Group__12__Impl : ( ( rule__FormInputRange__MaxAssignment_12 ) ) ;
    public final void rule__FormInputRange__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1441:1: ( ( ( rule__FormInputRange__MaxAssignment_12 ) ) )
            // InternalVFormDsl.g:1442:1: ( ( rule__FormInputRange__MaxAssignment_12 ) )
            {
            // InternalVFormDsl.g:1442:1: ( ( rule__FormInputRange__MaxAssignment_12 ) )
            // InternalVFormDsl.g:1443:2: ( rule__FormInputRange__MaxAssignment_12 )
            {
             before(grammarAccess.getFormInputRangeAccess().getMaxAssignment_12()); 
            // InternalVFormDsl.g:1444:2: ( rule__FormInputRange__MaxAssignment_12 )
            // InternalVFormDsl.g:1444:3: rule__FormInputRange__MaxAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__FormInputRange__MaxAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getFormInputRangeAccess().getMaxAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__Group__12__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__0"
    // InternalVFormDsl.g:1453:1: rule__FormInputSelect__Group__0 : rule__FormInputSelect__Group__0__Impl rule__FormInputSelect__Group__1 ;
    public final void rule__FormInputSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1457:1: ( rule__FormInputSelect__Group__0__Impl rule__FormInputSelect__Group__1 )
            // InternalVFormDsl.g:1458:2: rule__FormInputSelect__Group__0__Impl rule__FormInputSelect__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormInputSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__0"


    // $ANTLR start "rule__FormInputSelect__Group__0__Impl"
    // InternalVFormDsl.g:1465:1: rule__FormInputSelect__Group__0__Impl : ( 'name' ) ;
    public final void rule__FormInputSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1469:1: ( ( 'name' ) )
            // InternalVFormDsl.g:1470:1: ( 'name' )
            {
            // InternalVFormDsl.g:1470:1: ( 'name' )
            // InternalVFormDsl.g:1471:2: 'name'
            {
             before(grammarAccess.getFormInputSelectAccess().getNameKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__0__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__1"
    // InternalVFormDsl.g:1480:1: rule__FormInputSelect__Group__1 : rule__FormInputSelect__Group__1__Impl rule__FormInputSelect__Group__2 ;
    public final void rule__FormInputSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1484:1: ( rule__FormInputSelect__Group__1__Impl rule__FormInputSelect__Group__2 )
            // InternalVFormDsl.g:1485:2: rule__FormInputSelect__Group__1__Impl rule__FormInputSelect__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FormInputSelect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__1"


    // $ANTLR start "rule__FormInputSelect__Group__1__Impl"
    // InternalVFormDsl.g:1492:1: rule__FormInputSelect__Group__1__Impl : ( ':' ) ;
    public final void rule__FormInputSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1496:1: ( ( ':' ) )
            // InternalVFormDsl.g:1497:1: ( ':' )
            {
            // InternalVFormDsl.g:1497:1: ( ':' )
            // InternalVFormDsl.g:1498:2: ':'
            {
             before(grammarAccess.getFormInputSelectAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__1__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__2"
    // InternalVFormDsl.g:1507:1: rule__FormInputSelect__Group__2 : rule__FormInputSelect__Group__2__Impl rule__FormInputSelect__Group__3 ;
    public final void rule__FormInputSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1511:1: ( rule__FormInputSelect__Group__2__Impl rule__FormInputSelect__Group__3 )
            // InternalVFormDsl.g:1512:2: rule__FormInputSelect__Group__2__Impl rule__FormInputSelect__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FormInputSelect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__2"


    // $ANTLR start "rule__FormInputSelect__Group__2__Impl"
    // InternalVFormDsl.g:1519:1: rule__FormInputSelect__Group__2__Impl : ( ( rule__FormInputSelect__NameAssignment_2 ) ) ;
    public final void rule__FormInputSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1523:1: ( ( ( rule__FormInputSelect__NameAssignment_2 ) ) )
            // InternalVFormDsl.g:1524:1: ( ( rule__FormInputSelect__NameAssignment_2 ) )
            {
            // InternalVFormDsl.g:1524:1: ( ( rule__FormInputSelect__NameAssignment_2 ) )
            // InternalVFormDsl.g:1525:2: ( rule__FormInputSelect__NameAssignment_2 )
            {
             before(grammarAccess.getFormInputSelectAccess().getNameAssignment_2()); 
            // InternalVFormDsl.g:1526:2: ( rule__FormInputSelect__NameAssignment_2 )
            // InternalVFormDsl.g:1526:3: rule__FormInputSelect__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSelect__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSelectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__2__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__3"
    // InternalVFormDsl.g:1534:1: rule__FormInputSelect__Group__3 : rule__FormInputSelect__Group__3__Impl rule__FormInputSelect__Group__4 ;
    public final void rule__FormInputSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1538:1: ( rule__FormInputSelect__Group__3__Impl rule__FormInputSelect__Group__4 )
            // InternalVFormDsl.g:1539:2: rule__FormInputSelect__Group__3__Impl rule__FormInputSelect__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FormInputSelect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__3"


    // $ANTLR start "rule__FormInputSelect__Group__3__Impl"
    // InternalVFormDsl.g:1546:1: rule__FormInputSelect__Group__3__Impl : ( ',' ) ;
    public final void rule__FormInputSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1550:1: ( ( ',' ) )
            // InternalVFormDsl.g:1551:1: ( ',' )
            {
            // InternalVFormDsl.g:1551:1: ( ',' )
            // InternalVFormDsl.g:1552:2: ','
            {
             before(grammarAccess.getFormInputSelectAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__3__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__4"
    // InternalVFormDsl.g:1561:1: rule__FormInputSelect__Group__4 : rule__FormInputSelect__Group__4__Impl rule__FormInputSelect__Group__5 ;
    public final void rule__FormInputSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1565:1: ( rule__FormInputSelect__Group__4__Impl rule__FormInputSelect__Group__5 )
            // InternalVFormDsl.g:1566:2: rule__FormInputSelect__Group__4__Impl rule__FormInputSelect__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FormInputSelect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__4"


    // $ANTLR start "rule__FormInputSelect__Group__4__Impl"
    // InternalVFormDsl.g:1573:1: rule__FormInputSelect__Group__4__Impl : ( 'type' ) ;
    public final void rule__FormInputSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1577:1: ( ( 'type' ) )
            // InternalVFormDsl.g:1578:1: ( 'type' )
            {
            // InternalVFormDsl.g:1578:1: ( 'type' )
            // InternalVFormDsl.g:1579:2: 'type'
            {
             before(grammarAccess.getFormInputSelectAccess().getTypeKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__4__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__5"
    // InternalVFormDsl.g:1588:1: rule__FormInputSelect__Group__5 : rule__FormInputSelect__Group__5__Impl rule__FormInputSelect__Group__6 ;
    public final void rule__FormInputSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1592:1: ( rule__FormInputSelect__Group__5__Impl rule__FormInputSelect__Group__6 )
            // InternalVFormDsl.g:1593:2: rule__FormInputSelect__Group__5__Impl rule__FormInputSelect__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__FormInputSelect__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__5"


    // $ANTLR start "rule__FormInputSelect__Group__5__Impl"
    // InternalVFormDsl.g:1600:1: rule__FormInputSelect__Group__5__Impl : ( ':' ) ;
    public final void rule__FormInputSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1604:1: ( ( ':' ) )
            // InternalVFormDsl.g:1605:1: ( ':' )
            {
            // InternalVFormDsl.g:1605:1: ( ':' )
            // InternalVFormDsl.g:1606:2: ':'
            {
             before(grammarAccess.getFormInputSelectAccess().getColonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__5__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__6"
    // InternalVFormDsl.g:1615:1: rule__FormInputSelect__Group__6 : rule__FormInputSelect__Group__6__Impl rule__FormInputSelect__Group__7 ;
    public final void rule__FormInputSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1619:1: ( rule__FormInputSelect__Group__6__Impl rule__FormInputSelect__Group__7 )
            // InternalVFormDsl.g:1620:2: rule__FormInputSelect__Group__6__Impl rule__FormInputSelect__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__FormInputSelect__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__6"


    // $ANTLR start "rule__FormInputSelect__Group__6__Impl"
    // InternalVFormDsl.g:1627:1: rule__FormInputSelect__Group__6__Impl : ( 'SELECT' ) ;
    public final void rule__FormInputSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1631:1: ( ( 'SELECT' ) )
            // InternalVFormDsl.g:1632:1: ( 'SELECT' )
            {
            // InternalVFormDsl.g:1632:1: ( 'SELECT' )
            // InternalVFormDsl.g:1633:2: 'SELECT'
            {
             before(grammarAccess.getFormInputSelectAccess().getSELECTKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getSELECTKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__6__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__7"
    // InternalVFormDsl.g:1642:1: rule__FormInputSelect__Group__7 : rule__FormInputSelect__Group__7__Impl rule__FormInputSelect__Group__8 ;
    public final void rule__FormInputSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1646:1: ( rule__FormInputSelect__Group__7__Impl rule__FormInputSelect__Group__8 )
            // InternalVFormDsl.g:1647:2: rule__FormInputSelect__Group__7__Impl rule__FormInputSelect__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__FormInputSelect__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__7"


    // $ANTLR start "rule__FormInputSelect__Group__7__Impl"
    // InternalVFormDsl.g:1654:1: rule__FormInputSelect__Group__7__Impl : ( ',' ) ;
    public final void rule__FormInputSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1658:1: ( ( ',' ) )
            // InternalVFormDsl.g:1659:1: ( ',' )
            {
            // InternalVFormDsl.g:1659:1: ( ',' )
            // InternalVFormDsl.g:1660:2: ','
            {
             before(grammarAccess.getFormInputSelectAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__7__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__8"
    // InternalVFormDsl.g:1669:1: rule__FormInputSelect__Group__8 : rule__FormInputSelect__Group__8__Impl rule__FormInputSelect__Group__9 ;
    public final void rule__FormInputSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1673:1: ( rule__FormInputSelect__Group__8__Impl rule__FormInputSelect__Group__9 )
            // InternalVFormDsl.g:1674:2: rule__FormInputSelect__Group__8__Impl rule__FormInputSelect__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__FormInputSelect__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__8"


    // $ANTLR start "rule__FormInputSelect__Group__8__Impl"
    // InternalVFormDsl.g:1681:1: rule__FormInputSelect__Group__8__Impl : ( 'options:' ) ;
    public final void rule__FormInputSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1685:1: ( ( 'options:' ) )
            // InternalVFormDsl.g:1686:1: ( 'options:' )
            {
            // InternalVFormDsl.g:1686:1: ( 'options:' )
            // InternalVFormDsl.g:1687:2: 'options:'
            {
             before(grammarAccess.getFormInputSelectAccess().getOptionsKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getOptionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__8__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__9"
    // InternalVFormDsl.g:1696:1: rule__FormInputSelect__Group__9 : rule__FormInputSelect__Group__9__Impl rule__FormInputSelect__Group__10 ;
    public final void rule__FormInputSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1700:1: ( rule__FormInputSelect__Group__9__Impl rule__FormInputSelect__Group__10 )
            // InternalVFormDsl.g:1701:2: rule__FormInputSelect__Group__9__Impl rule__FormInputSelect__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__FormInputSelect__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__9"


    // $ANTLR start "rule__FormInputSelect__Group__9__Impl"
    // InternalVFormDsl.g:1708:1: rule__FormInputSelect__Group__9__Impl : ( '{' ) ;
    public final void rule__FormInputSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1712:1: ( ( '{' ) )
            // InternalVFormDsl.g:1713:1: ( '{' )
            {
            // InternalVFormDsl.g:1713:1: ( '{' )
            // InternalVFormDsl.g:1714:2: '{'
            {
             before(grammarAccess.getFormInputSelectAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__9__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__10"
    // InternalVFormDsl.g:1723:1: rule__FormInputSelect__Group__10 : rule__FormInputSelect__Group__10__Impl rule__FormInputSelect__Group__11 ;
    public final void rule__FormInputSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1727:1: ( rule__FormInputSelect__Group__10__Impl rule__FormInputSelect__Group__11 )
            // InternalVFormDsl.g:1728:2: rule__FormInputSelect__Group__10__Impl rule__FormInputSelect__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__FormInputSelect__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__10"


    // $ANTLR start "rule__FormInputSelect__Group__10__Impl"
    // InternalVFormDsl.g:1735:1: rule__FormInputSelect__Group__10__Impl : ( ( rule__FormInputSelect__OptionAssignment_10 ) ) ;
    public final void rule__FormInputSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1739:1: ( ( ( rule__FormInputSelect__OptionAssignment_10 ) ) )
            // InternalVFormDsl.g:1740:1: ( ( rule__FormInputSelect__OptionAssignment_10 ) )
            {
            // InternalVFormDsl.g:1740:1: ( ( rule__FormInputSelect__OptionAssignment_10 ) )
            // InternalVFormDsl.g:1741:2: ( rule__FormInputSelect__OptionAssignment_10 )
            {
             before(grammarAccess.getFormInputSelectAccess().getOptionAssignment_10()); 
            // InternalVFormDsl.g:1742:2: ( rule__FormInputSelect__OptionAssignment_10 )
            // InternalVFormDsl.g:1742:3: rule__FormInputSelect__OptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSelect__OptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSelectAccess().getOptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__10__Impl"


    // $ANTLR start "rule__FormInputSelect__Group__11"
    // InternalVFormDsl.g:1750:1: rule__FormInputSelect__Group__11 : rule__FormInputSelect__Group__11__Impl ;
    public final void rule__FormInputSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1754:1: ( rule__FormInputSelect__Group__11__Impl )
            // InternalVFormDsl.g:1755:2: rule__FormInputSelect__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSelect__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__11"


    // $ANTLR start "rule__FormInputSelect__Group__11__Impl"
    // InternalVFormDsl.g:1761:1: rule__FormInputSelect__Group__11__Impl : ( '}' ) ;
    public final void rule__FormInputSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1765:1: ( ( '}' ) )
            // InternalVFormDsl.g:1766:1: ( '}' )
            {
            // InternalVFormDsl.g:1766:1: ( '}' )
            // InternalVFormDsl.g:1767:2: '}'
            {
             before(grammarAccess.getFormInputSelectAccess().getRightCurlyBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__Group__11__Impl"


    // $ANTLR start "rule__DataOption__Group__0"
    // InternalVFormDsl.g:1777:1: rule__DataOption__Group__0 : rule__DataOption__Group__0__Impl rule__DataOption__Group__1 ;
    public final void rule__DataOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1781:1: ( rule__DataOption__Group__0__Impl rule__DataOption__Group__1 )
            // InternalVFormDsl.g:1782:2: rule__DataOption__Group__0__Impl rule__DataOption__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DataOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__0"


    // $ANTLR start "rule__DataOption__Group__0__Impl"
    // InternalVFormDsl.g:1789:1: rule__DataOption__Group__0__Impl : ( 'optionType:' ) ;
    public final void rule__DataOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1793:1: ( ( 'optionType:' ) )
            // InternalVFormDsl.g:1794:1: ( 'optionType:' )
            {
            // InternalVFormDsl.g:1794:1: ( 'optionType:' )
            // InternalVFormDsl.g:1795:2: 'optionType:'
            {
             before(grammarAccess.getDataOptionAccess().getOptionTypeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getOptionTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__0__Impl"


    // $ANTLR start "rule__DataOption__Group__1"
    // InternalVFormDsl.g:1804:1: rule__DataOption__Group__1 : rule__DataOption__Group__1__Impl rule__DataOption__Group__2 ;
    public final void rule__DataOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1808:1: ( rule__DataOption__Group__1__Impl rule__DataOption__Group__2 )
            // InternalVFormDsl.g:1809:2: rule__DataOption__Group__1__Impl rule__DataOption__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__1"


    // $ANTLR start "rule__DataOption__Group__1__Impl"
    // InternalVFormDsl.g:1816:1: rule__DataOption__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1820:1: ( ( 'data' ) )
            // InternalVFormDsl.g:1821:1: ( 'data' )
            {
            // InternalVFormDsl.g:1821:1: ( 'data' )
            // InternalVFormDsl.g:1822:2: 'data'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__1__Impl"


    // $ANTLR start "rule__DataOption__Group__2"
    // InternalVFormDsl.g:1831:1: rule__DataOption__Group__2 : rule__DataOption__Group__2__Impl rule__DataOption__Group__3 ;
    public final void rule__DataOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1835:1: ( rule__DataOption__Group__2__Impl rule__DataOption__Group__3 )
            // InternalVFormDsl.g:1836:2: rule__DataOption__Group__2__Impl rule__DataOption__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__DataOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__2"


    // $ANTLR start "rule__DataOption__Group__2__Impl"
    // InternalVFormDsl.g:1843:1: rule__DataOption__Group__2__Impl : ( ',' ) ;
    public final void rule__DataOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1847:1: ( ( ',' ) )
            // InternalVFormDsl.g:1848:1: ( ',' )
            {
            // InternalVFormDsl.g:1848:1: ( ',' )
            // InternalVFormDsl.g:1849:2: ','
            {
             before(grammarAccess.getDataOptionAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__2__Impl"


    // $ANTLR start "rule__DataOption__Group__3"
    // InternalVFormDsl.g:1858:1: rule__DataOption__Group__3 : rule__DataOption__Group__3__Impl rule__DataOption__Group__4 ;
    public final void rule__DataOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1862:1: ( rule__DataOption__Group__3__Impl rule__DataOption__Group__4 )
            // InternalVFormDsl.g:1863:2: rule__DataOption__Group__3__Impl rule__DataOption__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__3"


    // $ANTLR start "rule__DataOption__Group__3__Impl"
    // InternalVFormDsl.g:1870:1: rule__DataOption__Group__3__Impl : ( 'data:' ) ;
    public final void rule__DataOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1874:1: ( ( 'data:' ) )
            // InternalVFormDsl.g:1875:1: ( 'data:' )
            {
            // InternalVFormDsl.g:1875:1: ( 'data:' )
            // InternalVFormDsl.g:1876:2: 'data:'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getDataKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__3__Impl"


    // $ANTLR start "rule__DataOption__Group__4"
    // InternalVFormDsl.g:1885:1: rule__DataOption__Group__4 : rule__DataOption__Group__4__Impl rule__DataOption__Group__5 ;
    public final void rule__DataOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1889:1: ( rule__DataOption__Group__4__Impl rule__DataOption__Group__5 )
            // InternalVFormDsl.g:1890:2: rule__DataOption__Group__4__Impl rule__DataOption__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DataOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__4"


    // $ANTLR start "rule__DataOption__Group__4__Impl"
    // InternalVFormDsl.g:1897:1: rule__DataOption__Group__4__Impl : ( '[' ) ;
    public final void rule__DataOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1901:1: ( ( '[' ) )
            // InternalVFormDsl.g:1902:1: ( '[' )
            {
            // InternalVFormDsl.g:1902:1: ( '[' )
            // InternalVFormDsl.g:1903:2: '['
            {
             before(grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__4__Impl"


    // $ANTLR start "rule__DataOption__Group__5"
    // InternalVFormDsl.g:1912:1: rule__DataOption__Group__5 : rule__DataOption__Group__5__Impl rule__DataOption__Group__6 ;
    public final void rule__DataOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1916:1: ( rule__DataOption__Group__5__Impl rule__DataOption__Group__6 )
            // InternalVFormDsl.g:1917:2: rule__DataOption__Group__5__Impl rule__DataOption__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__DataOption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__5"


    // $ANTLR start "rule__DataOption__Group__5__Impl"
    // InternalVFormDsl.g:1924:1: rule__DataOption__Group__5__Impl : ( ( rule__DataOption__DataAssignment_5 ) ) ;
    public final void rule__DataOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1928:1: ( ( ( rule__DataOption__DataAssignment_5 ) ) )
            // InternalVFormDsl.g:1929:1: ( ( rule__DataOption__DataAssignment_5 ) )
            {
            // InternalVFormDsl.g:1929:1: ( ( rule__DataOption__DataAssignment_5 ) )
            // InternalVFormDsl.g:1930:2: ( rule__DataOption__DataAssignment_5 )
            {
             before(grammarAccess.getDataOptionAccess().getDataAssignment_5()); 
            // InternalVFormDsl.g:1931:2: ( rule__DataOption__DataAssignment_5 )
            // InternalVFormDsl.g:1931:3: rule__DataOption__DataAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__DataAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getDataAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__5__Impl"


    // $ANTLR start "rule__DataOption__Group__6"
    // InternalVFormDsl.g:1939:1: rule__DataOption__Group__6 : rule__DataOption__Group__6__Impl rule__DataOption__Group__7 ;
    public final void rule__DataOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1943:1: ( rule__DataOption__Group__6__Impl rule__DataOption__Group__7 )
            // InternalVFormDsl.g:1944:2: rule__DataOption__Group__6__Impl rule__DataOption__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__DataOption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__6"


    // $ANTLR start "rule__DataOption__Group__6__Impl"
    // InternalVFormDsl.g:1951:1: rule__DataOption__Group__6__Impl : ( ( rule__DataOption__Group_6__0 )* ) ;
    public final void rule__DataOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1955:1: ( ( ( rule__DataOption__Group_6__0 )* ) )
            // InternalVFormDsl.g:1956:1: ( ( rule__DataOption__Group_6__0 )* )
            {
            // InternalVFormDsl.g:1956:1: ( ( rule__DataOption__Group_6__0 )* )
            // InternalVFormDsl.g:1957:2: ( rule__DataOption__Group_6__0 )*
            {
             before(grammarAccess.getDataOptionAccess().getGroup_6()); 
            // InternalVFormDsl.g:1958:2: ( rule__DataOption__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVFormDsl.g:1958:3: rule__DataOption__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DataOption__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataOptionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__6__Impl"


    // $ANTLR start "rule__DataOption__Group__7"
    // InternalVFormDsl.g:1966:1: rule__DataOption__Group__7 : rule__DataOption__Group__7__Impl ;
    public final void rule__DataOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1970:1: ( rule__DataOption__Group__7__Impl )
            // InternalVFormDsl.g:1971:2: rule__DataOption__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__7"


    // $ANTLR start "rule__DataOption__Group__7__Impl"
    // InternalVFormDsl.g:1977:1: rule__DataOption__Group__7__Impl : ( ']' ) ;
    public final void rule__DataOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1981:1: ( ( ']' ) )
            // InternalVFormDsl.g:1982:1: ( ']' )
            {
            // InternalVFormDsl.g:1982:1: ( ']' )
            // InternalVFormDsl.g:1983:2: ']'
            {
             before(grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__7__Impl"


    // $ANTLR start "rule__DataOption__Group_6__0"
    // InternalVFormDsl.g:1993:1: rule__DataOption__Group_6__0 : rule__DataOption__Group_6__0__Impl rule__DataOption__Group_6__1 ;
    public final void rule__DataOption__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:1997:1: ( rule__DataOption__Group_6__0__Impl rule__DataOption__Group_6__1 )
            // InternalVFormDsl.g:1998:2: rule__DataOption__Group_6__0__Impl rule__DataOption__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__DataOption__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group_6__0"


    // $ANTLR start "rule__DataOption__Group_6__0__Impl"
    // InternalVFormDsl.g:2005:1: rule__DataOption__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DataOption__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2009:1: ( ( ',' ) )
            // InternalVFormDsl.g:2010:1: ( ',' )
            {
            // InternalVFormDsl.g:2010:1: ( ',' )
            // InternalVFormDsl.g:2011:2: ','
            {
             before(grammarAccess.getDataOptionAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group_6__0__Impl"


    // $ANTLR start "rule__DataOption__Group_6__1"
    // InternalVFormDsl.g:2020:1: rule__DataOption__Group_6__1 : rule__DataOption__Group_6__1__Impl ;
    public final void rule__DataOption__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2024:1: ( rule__DataOption__Group_6__1__Impl )
            // InternalVFormDsl.g:2025:2: rule__DataOption__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group_6__1"


    // $ANTLR start "rule__DataOption__Group_6__1__Impl"
    // InternalVFormDsl.g:2031:1: rule__DataOption__Group_6__1__Impl : ( ( rule__DataOption__DataAssignment_6_1 ) ) ;
    public final void rule__DataOption__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2035:1: ( ( ( rule__DataOption__DataAssignment_6_1 ) ) )
            // InternalVFormDsl.g:2036:1: ( ( rule__DataOption__DataAssignment_6_1 ) )
            {
            // InternalVFormDsl.g:2036:1: ( ( rule__DataOption__DataAssignment_6_1 ) )
            // InternalVFormDsl.g:2037:2: ( rule__DataOption__DataAssignment_6_1 )
            {
             before(grammarAccess.getDataOptionAccess().getDataAssignment_6_1()); 
            // InternalVFormDsl.g:2038:2: ( rule__DataOption__DataAssignment_6_1 )
            // InternalVFormDsl.g:2038:3: rule__DataOption__DataAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__DataAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getDataAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group_6__1__Impl"


    // $ANTLR start "rule__EnumOption__Group__0"
    // InternalVFormDsl.g:2047:1: rule__EnumOption__Group__0 : rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1 ;
    public final void rule__EnumOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2051:1: ( rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1 )
            // InternalVFormDsl.g:2052:2: rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EnumOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__0"


    // $ANTLR start "rule__EnumOption__Group__0__Impl"
    // InternalVFormDsl.g:2059:1: rule__EnumOption__Group__0__Impl : ( 'optionType:' ) ;
    public final void rule__EnumOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2063:1: ( ( 'optionType:' ) )
            // InternalVFormDsl.g:2064:1: ( 'optionType:' )
            {
            // InternalVFormDsl.g:2064:1: ( 'optionType:' )
            // InternalVFormDsl.g:2065:2: 'optionType:'
            {
             before(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__0__Impl"


    // $ANTLR start "rule__EnumOption__Group__1"
    // InternalVFormDsl.g:2074:1: rule__EnumOption__Group__1 : rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2 ;
    public final void rule__EnumOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2078:1: ( rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2 )
            // InternalVFormDsl.g:2079:2: rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EnumOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__1"


    // $ANTLR start "rule__EnumOption__Group__1__Impl"
    // InternalVFormDsl.g:2086:1: rule__EnumOption__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2090:1: ( ( 'enum' ) )
            // InternalVFormDsl.g:2091:1: ( 'enum' )
            {
            // InternalVFormDsl.g:2091:1: ( 'enum' )
            // InternalVFormDsl.g:2092:2: 'enum'
            {
             before(grammarAccess.getEnumOptionAccess().getEnumKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__1__Impl"


    // $ANTLR start "rule__EnumOption__Group__2"
    // InternalVFormDsl.g:2101:1: rule__EnumOption__Group__2 : rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3 ;
    public final void rule__EnumOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2105:1: ( rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3 )
            // InternalVFormDsl.g:2106:2: rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EnumOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__2"


    // $ANTLR start "rule__EnumOption__Group__2__Impl"
    // InternalVFormDsl.g:2113:1: rule__EnumOption__Group__2__Impl : ( ',' ) ;
    public final void rule__EnumOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2117:1: ( ( ',' ) )
            // InternalVFormDsl.g:2118:1: ( ',' )
            {
            // InternalVFormDsl.g:2118:1: ( ',' )
            // InternalVFormDsl.g:2119:2: ','
            {
             before(grammarAccess.getEnumOptionAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__2__Impl"


    // $ANTLR start "rule__EnumOption__Group__3"
    // InternalVFormDsl.g:2128:1: rule__EnumOption__Group__3 : rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4 ;
    public final void rule__EnumOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2132:1: ( rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4 )
            // InternalVFormDsl.g:2133:2: rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EnumOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__3"


    // $ANTLR start "rule__EnumOption__Group__3__Impl"
    // InternalVFormDsl.g:2140:1: rule__EnumOption__Group__3__Impl : ( 'data:' ) ;
    public final void rule__EnumOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2144:1: ( ( 'data:' ) )
            // InternalVFormDsl.g:2145:1: ( 'data:' )
            {
            // InternalVFormDsl.g:2145:1: ( 'data:' )
            // InternalVFormDsl.g:2146:2: 'data:'
            {
             before(grammarAccess.getEnumOptionAccess().getDataKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getDataKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__3__Impl"


    // $ANTLR start "rule__EnumOption__Group__4"
    // InternalVFormDsl.g:2155:1: rule__EnumOption__Group__4 : rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5 ;
    public final void rule__EnumOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2159:1: ( rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5 )
            // InternalVFormDsl.g:2160:2: rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__EnumOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__4"


    // $ANTLR start "rule__EnumOption__Group__4__Impl"
    // InternalVFormDsl.g:2167:1: rule__EnumOption__Group__4__Impl : ( '[' ) ;
    public final void rule__EnumOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2171:1: ( ( '[' ) )
            // InternalVFormDsl.g:2172:1: ( '[' )
            {
            // InternalVFormDsl.g:2172:1: ( '[' )
            // InternalVFormDsl.g:2173:2: '['
            {
             before(grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__4__Impl"


    // $ANTLR start "rule__EnumOption__Group__5"
    // InternalVFormDsl.g:2182:1: rule__EnumOption__Group__5 : rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6 ;
    public final void rule__EnumOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2186:1: ( rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6 )
            // InternalVFormDsl.g:2187:2: rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__EnumOption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__5"


    // $ANTLR start "rule__EnumOption__Group__5__Impl"
    // InternalVFormDsl.g:2194:1: rule__EnumOption__Group__5__Impl : ( ( rule__EnumOption__DataAssignment_5 ) ) ;
    public final void rule__EnumOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2198:1: ( ( ( rule__EnumOption__DataAssignment_5 ) ) )
            // InternalVFormDsl.g:2199:1: ( ( rule__EnumOption__DataAssignment_5 ) )
            {
            // InternalVFormDsl.g:2199:1: ( ( rule__EnumOption__DataAssignment_5 ) )
            // InternalVFormDsl.g:2200:2: ( rule__EnumOption__DataAssignment_5 )
            {
             before(grammarAccess.getEnumOptionAccess().getDataAssignment_5()); 
            // InternalVFormDsl.g:2201:2: ( rule__EnumOption__DataAssignment_5 )
            // InternalVFormDsl.g:2201:3: rule__EnumOption__DataAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__DataAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumOptionAccess().getDataAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__5__Impl"


    // $ANTLR start "rule__EnumOption__Group__6"
    // InternalVFormDsl.g:2209:1: rule__EnumOption__Group__6 : rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7 ;
    public final void rule__EnumOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2213:1: ( rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7 )
            // InternalVFormDsl.g:2214:2: rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__EnumOption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__6"


    // $ANTLR start "rule__EnumOption__Group__6__Impl"
    // InternalVFormDsl.g:2221:1: rule__EnumOption__Group__6__Impl : ( ( rule__EnumOption__Group_6__0 )* ) ;
    public final void rule__EnumOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2225:1: ( ( ( rule__EnumOption__Group_6__0 )* ) )
            // InternalVFormDsl.g:2226:1: ( ( rule__EnumOption__Group_6__0 )* )
            {
            // InternalVFormDsl.g:2226:1: ( ( rule__EnumOption__Group_6__0 )* )
            // InternalVFormDsl.g:2227:2: ( rule__EnumOption__Group_6__0 )*
            {
             before(grammarAccess.getEnumOptionAccess().getGroup_6()); 
            // InternalVFormDsl.g:2228:2: ( rule__EnumOption__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVFormDsl.g:2228:3: rule__EnumOption__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__EnumOption__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumOptionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__6__Impl"


    // $ANTLR start "rule__EnumOption__Group__7"
    // InternalVFormDsl.g:2236:1: rule__EnumOption__Group__7 : rule__EnumOption__Group__7__Impl ;
    public final void rule__EnumOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2240:1: ( rule__EnumOption__Group__7__Impl )
            // InternalVFormDsl.g:2241:2: rule__EnumOption__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__7"


    // $ANTLR start "rule__EnumOption__Group__7__Impl"
    // InternalVFormDsl.g:2247:1: rule__EnumOption__Group__7__Impl : ( ']' ) ;
    public final void rule__EnumOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2251:1: ( ( ']' ) )
            // InternalVFormDsl.g:2252:1: ( ']' )
            {
            // InternalVFormDsl.g:2252:1: ( ']' )
            // InternalVFormDsl.g:2253:2: ']'
            {
             before(grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group__7__Impl"


    // $ANTLR start "rule__EnumOption__Group_6__0"
    // InternalVFormDsl.g:2263:1: rule__EnumOption__Group_6__0 : rule__EnumOption__Group_6__0__Impl rule__EnumOption__Group_6__1 ;
    public final void rule__EnumOption__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2267:1: ( rule__EnumOption__Group_6__0__Impl rule__EnumOption__Group_6__1 )
            // InternalVFormDsl.g:2268:2: rule__EnumOption__Group_6__0__Impl rule__EnumOption__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__EnumOption__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group_6__0"


    // $ANTLR start "rule__EnumOption__Group_6__0__Impl"
    // InternalVFormDsl.g:2275:1: rule__EnumOption__Group_6__0__Impl : ( ',' ) ;
    public final void rule__EnumOption__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2279:1: ( ( ',' ) )
            // InternalVFormDsl.g:2280:1: ( ',' )
            {
            // InternalVFormDsl.g:2280:1: ( ',' )
            // InternalVFormDsl.g:2281:2: ','
            {
             before(grammarAccess.getEnumOptionAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group_6__0__Impl"


    // $ANTLR start "rule__EnumOption__Group_6__1"
    // InternalVFormDsl.g:2290:1: rule__EnumOption__Group_6__1 : rule__EnumOption__Group_6__1__Impl ;
    public final void rule__EnumOption__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2294:1: ( rule__EnumOption__Group_6__1__Impl )
            // InternalVFormDsl.g:2295:2: rule__EnumOption__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group_6__1"


    // $ANTLR start "rule__EnumOption__Group_6__1__Impl"
    // InternalVFormDsl.g:2301:1: rule__EnumOption__Group_6__1__Impl : ( ( rule__EnumOption__DataAssignment_6_1 ) ) ;
    public final void rule__EnumOption__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2305:1: ( ( ( rule__EnumOption__DataAssignment_6_1 ) ) )
            // InternalVFormDsl.g:2306:1: ( ( rule__EnumOption__DataAssignment_6_1 ) )
            {
            // InternalVFormDsl.g:2306:1: ( ( rule__EnumOption__DataAssignment_6_1 ) )
            // InternalVFormDsl.g:2307:2: ( rule__EnumOption__DataAssignment_6_1 )
            {
             before(grammarAccess.getEnumOptionAccess().getDataAssignment_6_1()); 
            // InternalVFormDsl.g:2308:2: ( rule__EnumOption__DataAssignment_6_1 )
            // InternalVFormDsl.g:2308:3: rule__EnumOption__DataAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__DataAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumOptionAccess().getDataAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__Group_6__1__Impl"


    // $ANTLR start "rule__NumberOption__Group__0"
    // InternalVFormDsl.g:2317:1: rule__NumberOption__Group__0 : rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 ;
    public final void rule__NumberOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2321:1: ( rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 )
            // InternalVFormDsl.g:2322:2: rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__NumberOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__0"


    // $ANTLR start "rule__NumberOption__Group__0__Impl"
    // InternalVFormDsl.g:2329:1: rule__NumberOption__Group__0__Impl : ( 'optionType:' ) ;
    public final void rule__NumberOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2333:1: ( ( 'optionType:' ) )
            // InternalVFormDsl.g:2334:1: ( 'optionType:' )
            {
            // InternalVFormDsl.g:2334:1: ( 'optionType:' )
            // InternalVFormDsl.g:2335:2: 'optionType:'
            {
             before(grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__0__Impl"


    // $ANTLR start "rule__NumberOption__Group__1"
    // InternalVFormDsl.g:2344:1: rule__NumberOption__Group__1 : rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 ;
    public final void rule__NumberOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2348:1: ( rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 )
            // InternalVFormDsl.g:2349:2: rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NumberOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__1"


    // $ANTLR start "rule__NumberOption__Group__1__Impl"
    // InternalVFormDsl.g:2356:1: rule__NumberOption__Group__1__Impl : ( 'number' ) ;
    public final void rule__NumberOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2360:1: ( ( 'number' ) )
            // InternalVFormDsl.g:2361:1: ( 'number' )
            {
            // InternalVFormDsl.g:2361:1: ( 'number' )
            // InternalVFormDsl.g:2362:2: 'number'
            {
             before(grammarAccess.getNumberOptionAccess().getNumberKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getNumberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__1__Impl"


    // $ANTLR start "rule__NumberOption__Group__2"
    // InternalVFormDsl.g:2371:1: rule__NumberOption__Group__2 : rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 ;
    public final void rule__NumberOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2375:1: ( rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 )
            // InternalVFormDsl.g:2376:2: rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__NumberOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__2"


    // $ANTLR start "rule__NumberOption__Group__2__Impl"
    // InternalVFormDsl.g:2383:1: rule__NumberOption__Group__2__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2387:1: ( ( ',' ) )
            // InternalVFormDsl.g:2388:1: ( ',' )
            {
            // InternalVFormDsl.g:2388:1: ( ',' )
            // InternalVFormDsl.g:2389:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__2__Impl"


    // $ANTLR start "rule__NumberOption__Group__3"
    // InternalVFormDsl.g:2398:1: rule__NumberOption__Group__3 : rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 ;
    public final void rule__NumberOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2402:1: ( rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 )
            // InternalVFormDsl.g:2403:2: rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__NumberOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__3"


    // $ANTLR start "rule__NumberOption__Group__3__Impl"
    // InternalVFormDsl.g:2410:1: rule__NumberOption__Group__3__Impl : ( 'min:' ) ;
    public final void rule__NumberOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2414:1: ( ( 'min:' ) )
            // InternalVFormDsl.g:2415:1: ( 'min:' )
            {
            // InternalVFormDsl.g:2415:1: ( 'min:' )
            // InternalVFormDsl.g:2416:2: 'min:'
            {
             before(grammarAccess.getNumberOptionAccess().getMinKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__3__Impl"


    // $ANTLR start "rule__NumberOption__Group__4"
    // InternalVFormDsl.g:2425:1: rule__NumberOption__Group__4 : rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 ;
    public final void rule__NumberOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2429:1: ( rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 )
            // InternalVFormDsl.g:2430:2: rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__NumberOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__4"


    // $ANTLR start "rule__NumberOption__Group__4__Impl"
    // InternalVFormDsl.g:2437:1: rule__NumberOption__Group__4__Impl : ( ( rule__NumberOption__MinAssignment_4 ) ) ;
    public final void rule__NumberOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2441:1: ( ( ( rule__NumberOption__MinAssignment_4 ) ) )
            // InternalVFormDsl.g:2442:1: ( ( rule__NumberOption__MinAssignment_4 ) )
            {
            // InternalVFormDsl.g:2442:1: ( ( rule__NumberOption__MinAssignment_4 ) )
            // InternalVFormDsl.g:2443:2: ( rule__NumberOption__MinAssignment_4 )
            {
             before(grammarAccess.getNumberOptionAccess().getMinAssignment_4()); 
            // InternalVFormDsl.g:2444:2: ( rule__NumberOption__MinAssignment_4 )
            // InternalVFormDsl.g:2444:3: rule__NumberOption__MinAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMinAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__4__Impl"


    // $ANTLR start "rule__NumberOption__Group__5"
    // InternalVFormDsl.g:2452:1: rule__NumberOption__Group__5 : rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 ;
    public final void rule__NumberOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2456:1: ( rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 )
            // InternalVFormDsl.g:2457:2: rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__NumberOption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__5"


    // $ANTLR start "rule__NumberOption__Group__5__Impl"
    // InternalVFormDsl.g:2464:1: rule__NumberOption__Group__5__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2468:1: ( ( ',' ) )
            // InternalVFormDsl.g:2469:1: ( ',' )
            {
            // InternalVFormDsl.g:2469:1: ( ',' )
            // InternalVFormDsl.g:2470:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__5__Impl"


    // $ANTLR start "rule__NumberOption__Group__6"
    // InternalVFormDsl.g:2479:1: rule__NumberOption__Group__6 : rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 ;
    public final void rule__NumberOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2483:1: ( rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 )
            // InternalVFormDsl.g:2484:2: rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__NumberOption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__6"


    // $ANTLR start "rule__NumberOption__Group__6__Impl"
    // InternalVFormDsl.g:2491:1: rule__NumberOption__Group__6__Impl : ( 'max:' ) ;
    public final void rule__NumberOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2495:1: ( ( 'max:' ) )
            // InternalVFormDsl.g:2496:1: ( 'max:' )
            {
            // InternalVFormDsl.g:2496:1: ( 'max:' )
            // InternalVFormDsl.g:2497:2: 'max:'
            {
             before(grammarAccess.getNumberOptionAccess().getMaxKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__6__Impl"


    // $ANTLR start "rule__NumberOption__Group__7"
    // InternalVFormDsl.g:2506:1: rule__NumberOption__Group__7 : rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8 ;
    public final void rule__NumberOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2510:1: ( rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8 )
            // InternalVFormDsl.g:2511:2: rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__NumberOption__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__7"


    // $ANTLR start "rule__NumberOption__Group__7__Impl"
    // InternalVFormDsl.g:2518:1: rule__NumberOption__Group__7__Impl : ( ( rule__NumberOption__MaxAssignment_7 ) ) ;
    public final void rule__NumberOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2522:1: ( ( ( rule__NumberOption__MaxAssignment_7 ) ) )
            // InternalVFormDsl.g:2523:1: ( ( rule__NumberOption__MaxAssignment_7 ) )
            {
            // InternalVFormDsl.g:2523:1: ( ( rule__NumberOption__MaxAssignment_7 ) )
            // InternalVFormDsl.g:2524:2: ( rule__NumberOption__MaxAssignment_7 )
            {
             before(grammarAccess.getNumberOptionAccess().getMaxAssignment_7()); 
            // InternalVFormDsl.g:2525:2: ( rule__NumberOption__MaxAssignment_7 )
            // InternalVFormDsl.g:2525:3: rule__NumberOption__MaxAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MaxAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMaxAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__7__Impl"


    // $ANTLR start "rule__NumberOption__Group__8"
    // InternalVFormDsl.g:2533:1: rule__NumberOption__Group__8 : rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9 ;
    public final void rule__NumberOption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2537:1: ( rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9 )
            // InternalVFormDsl.g:2538:2: rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__NumberOption__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__8"


    // $ANTLR start "rule__NumberOption__Group__8__Impl"
    // InternalVFormDsl.g:2545:1: rule__NumberOption__Group__8__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2549:1: ( ( ',' ) )
            // InternalVFormDsl.g:2550:1: ( ',' )
            {
            // InternalVFormDsl.g:2550:1: ( ',' )
            // InternalVFormDsl.g:2551:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__8__Impl"


    // $ANTLR start "rule__NumberOption__Group__9"
    // InternalVFormDsl.g:2560:1: rule__NumberOption__Group__9 : rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10 ;
    public final void rule__NumberOption__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2564:1: ( rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10 )
            // InternalVFormDsl.g:2565:2: rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__NumberOption__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__9"


    // $ANTLR start "rule__NumberOption__Group__9__Impl"
    // InternalVFormDsl.g:2572:1: rule__NumberOption__Group__9__Impl : ( 'range:' ) ;
    public final void rule__NumberOption__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2576:1: ( ( 'range:' ) )
            // InternalVFormDsl.g:2577:1: ( 'range:' )
            {
            // InternalVFormDsl.g:2577:1: ( 'range:' )
            // InternalVFormDsl.g:2578:2: 'range:'
            {
             before(grammarAccess.getNumberOptionAccess().getRangeKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__9__Impl"


    // $ANTLR start "rule__NumberOption__Group__10"
    // InternalVFormDsl.g:2587:1: rule__NumberOption__Group__10 : rule__NumberOption__Group__10__Impl ;
    public final void rule__NumberOption__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2591:1: ( rule__NumberOption__Group__10__Impl )
            // InternalVFormDsl.g:2592:2: rule__NumberOption__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__10"


    // $ANTLR start "rule__NumberOption__Group__10__Impl"
    // InternalVFormDsl.g:2598:1: rule__NumberOption__Group__10__Impl : ( ( rule__NumberOption__RangeAssignment_10 ) ) ;
    public final void rule__NumberOption__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2602:1: ( ( ( rule__NumberOption__RangeAssignment_10 ) ) )
            // InternalVFormDsl.g:2603:1: ( ( rule__NumberOption__RangeAssignment_10 ) )
            {
            // InternalVFormDsl.g:2603:1: ( ( rule__NumberOption__RangeAssignment_10 ) )
            // InternalVFormDsl.g:2604:2: ( rule__NumberOption__RangeAssignment_10 )
            {
             before(grammarAccess.getNumberOptionAccess().getRangeAssignment_10()); 
            // InternalVFormDsl.g:2605:2: ( rule__NumberOption__RangeAssignment_10 )
            // InternalVFormDsl.g:2605:3: rule__NumberOption__RangeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__RangeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getRangeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__Group__10__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__0"
    // InternalVFormDsl.g:2614:1: rule__FormInputSearch__Group__0 : rule__FormInputSearch__Group__0__Impl rule__FormInputSearch__Group__1 ;
    public final void rule__FormInputSearch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2618:1: ( rule__FormInputSearch__Group__0__Impl rule__FormInputSearch__Group__1 )
            // InternalVFormDsl.g:2619:2: rule__FormInputSearch__Group__0__Impl rule__FormInputSearch__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormInputSearch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__0"


    // $ANTLR start "rule__FormInputSearch__Group__0__Impl"
    // InternalVFormDsl.g:2626:1: rule__FormInputSearch__Group__0__Impl : ( 'name' ) ;
    public final void rule__FormInputSearch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2630:1: ( ( 'name' ) )
            // InternalVFormDsl.g:2631:1: ( 'name' )
            {
            // InternalVFormDsl.g:2631:1: ( 'name' )
            // InternalVFormDsl.g:2632:2: 'name'
            {
             before(grammarAccess.getFormInputSearchAccess().getNameKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__0__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__1"
    // InternalVFormDsl.g:2641:1: rule__FormInputSearch__Group__1 : rule__FormInputSearch__Group__1__Impl rule__FormInputSearch__Group__2 ;
    public final void rule__FormInputSearch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2645:1: ( rule__FormInputSearch__Group__1__Impl rule__FormInputSearch__Group__2 )
            // InternalVFormDsl.g:2646:2: rule__FormInputSearch__Group__1__Impl rule__FormInputSearch__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FormInputSearch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__1"


    // $ANTLR start "rule__FormInputSearch__Group__1__Impl"
    // InternalVFormDsl.g:2653:1: rule__FormInputSearch__Group__1__Impl : ( ':' ) ;
    public final void rule__FormInputSearch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2657:1: ( ( ':' ) )
            // InternalVFormDsl.g:2658:1: ( ':' )
            {
            // InternalVFormDsl.g:2658:1: ( ':' )
            // InternalVFormDsl.g:2659:2: ':'
            {
             before(grammarAccess.getFormInputSearchAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__1__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__2"
    // InternalVFormDsl.g:2668:1: rule__FormInputSearch__Group__2 : rule__FormInputSearch__Group__2__Impl rule__FormInputSearch__Group__3 ;
    public final void rule__FormInputSearch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2672:1: ( rule__FormInputSearch__Group__2__Impl rule__FormInputSearch__Group__3 )
            // InternalVFormDsl.g:2673:2: rule__FormInputSearch__Group__2__Impl rule__FormInputSearch__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FormInputSearch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__2"


    // $ANTLR start "rule__FormInputSearch__Group__2__Impl"
    // InternalVFormDsl.g:2680:1: rule__FormInputSearch__Group__2__Impl : ( ( rule__FormInputSearch__NameAssignment_2 ) ) ;
    public final void rule__FormInputSearch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2684:1: ( ( ( rule__FormInputSearch__NameAssignment_2 ) ) )
            // InternalVFormDsl.g:2685:1: ( ( rule__FormInputSearch__NameAssignment_2 ) )
            {
            // InternalVFormDsl.g:2685:1: ( ( rule__FormInputSearch__NameAssignment_2 ) )
            // InternalVFormDsl.g:2686:2: ( rule__FormInputSearch__NameAssignment_2 )
            {
             before(grammarAccess.getFormInputSearchAccess().getNameAssignment_2()); 
            // InternalVFormDsl.g:2687:2: ( rule__FormInputSearch__NameAssignment_2 )
            // InternalVFormDsl.g:2687:3: rule__FormInputSearch__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSearchAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__2__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__3"
    // InternalVFormDsl.g:2695:1: rule__FormInputSearch__Group__3 : rule__FormInputSearch__Group__3__Impl rule__FormInputSearch__Group__4 ;
    public final void rule__FormInputSearch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2699:1: ( rule__FormInputSearch__Group__3__Impl rule__FormInputSearch__Group__4 )
            // InternalVFormDsl.g:2700:2: rule__FormInputSearch__Group__3__Impl rule__FormInputSearch__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FormInputSearch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__3"


    // $ANTLR start "rule__FormInputSearch__Group__3__Impl"
    // InternalVFormDsl.g:2707:1: rule__FormInputSearch__Group__3__Impl : ( ',' ) ;
    public final void rule__FormInputSearch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2711:1: ( ( ',' ) )
            // InternalVFormDsl.g:2712:1: ( ',' )
            {
            // InternalVFormDsl.g:2712:1: ( ',' )
            // InternalVFormDsl.g:2713:2: ','
            {
             before(grammarAccess.getFormInputSearchAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__3__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__4"
    // InternalVFormDsl.g:2722:1: rule__FormInputSearch__Group__4 : rule__FormInputSearch__Group__4__Impl rule__FormInputSearch__Group__5 ;
    public final void rule__FormInputSearch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2726:1: ( rule__FormInputSearch__Group__4__Impl rule__FormInputSearch__Group__5 )
            // InternalVFormDsl.g:2727:2: rule__FormInputSearch__Group__4__Impl rule__FormInputSearch__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FormInputSearch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__4"


    // $ANTLR start "rule__FormInputSearch__Group__4__Impl"
    // InternalVFormDsl.g:2734:1: rule__FormInputSearch__Group__4__Impl : ( 'type' ) ;
    public final void rule__FormInputSearch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2738:1: ( ( 'type' ) )
            // InternalVFormDsl.g:2739:1: ( 'type' )
            {
            // InternalVFormDsl.g:2739:1: ( 'type' )
            // InternalVFormDsl.g:2740:2: 'type'
            {
             before(grammarAccess.getFormInputSearchAccess().getTypeKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__4__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__5"
    // InternalVFormDsl.g:2749:1: rule__FormInputSearch__Group__5 : rule__FormInputSearch__Group__5__Impl rule__FormInputSearch__Group__6 ;
    public final void rule__FormInputSearch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2753:1: ( rule__FormInputSearch__Group__5__Impl rule__FormInputSearch__Group__6 )
            // InternalVFormDsl.g:2754:2: rule__FormInputSearch__Group__5__Impl rule__FormInputSearch__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__FormInputSearch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__5"


    // $ANTLR start "rule__FormInputSearch__Group__5__Impl"
    // InternalVFormDsl.g:2761:1: rule__FormInputSearch__Group__5__Impl : ( ':' ) ;
    public final void rule__FormInputSearch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2765:1: ( ( ':' ) )
            // InternalVFormDsl.g:2766:1: ( ':' )
            {
            // InternalVFormDsl.g:2766:1: ( ':' )
            // InternalVFormDsl.g:2767:2: ':'
            {
             before(grammarAccess.getFormInputSearchAccess().getColonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__5__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__6"
    // InternalVFormDsl.g:2776:1: rule__FormInputSearch__Group__6 : rule__FormInputSearch__Group__6__Impl rule__FormInputSearch__Group__7 ;
    public final void rule__FormInputSearch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2780:1: ( rule__FormInputSearch__Group__6__Impl rule__FormInputSearch__Group__7 )
            // InternalVFormDsl.g:2781:2: rule__FormInputSearch__Group__6__Impl rule__FormInputSearch__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__FormInputSearch__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__6"


    // $ANTLR start "rule__FormInputSearch__Group__6__Impl"
    // InternalVFormDsl.g:2788:1: rule__FormInputSearch__Group__6__Impl : ( 'SEARCH' ) ;
    public final void rule__FormInputSearch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2792:1: ( ( 'SEARCH' ) )
            // InternalVFormDsl.g:2793:1: ( 'SEARCH' )
            {
            // InternalVFormDsl.g:2793:1: ( 'SEARCH' )
            // InternalVFormDsl.g:2794:2: 'SEARCH'
            {
             before(grammarAccess.getFormInputSearchAccess().getSEARCHKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getSEARCHKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__6__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__7"
    // InternalVFormDsl.g:2803:1: rule__FormInputSearch__Group__7 : rule__FormInputSearch__Group__7__Impl rule__FormInputSearch__Group__8 ;
    public final void rule__FormInputSearch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2807:1: ( rule__FormInputSearch__Group__7__Impl rule__FormInputSearch__Group__8 )
            // InternalVFormDsl.g:2808:2: rule__FormInputSearch__Group__7__Impl rule__FormInputSearch__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__FormInputSearch__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__7"


    // $ANTLR start "rule__FormInputSearch__Group__7__Impl"
    // InternalVFormDsl.g:2815:1: rule__FormInputSearch__Group__7__Impl : ( ',' ) ;
    public final void rule__FormInputSearch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2819:1: ( ( ',' ) )
            // InternalVFormDsl.g:2820:1: ( ',' )
            {
            // InternalVFormDsl.g:2820:1: ( ',' )
            // InternalVFormDsl.g:2821:2: ','
            {
             before(grammarAccess.getFormInputSearchAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__7__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__8"
    // InternalVFormDsl.g:2830:1: rule__FormInputSearch__Group__8 : rule__FormInputSearch__Group__8__Impl rule__FormInputSearch__Group__9 ;
    public final void rule__FormInputSearch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2834:1: ( rule__FormInputSearch__Group__8__Impl rule__FormInputSearch__Group__9 )
            // InternalVFormDsl.g:2835:2: rule__FormInputSearch__Group__8__Impl rule__FormInputSearch__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__FormInputSearch__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__8"


    // $ANTLR start "rule__FormInputSearch__Group__8__Impl"
    // InternalVFormDsl.g:2842:1: rule__FormInputSearch__Group__8__Impl : ( 'options:' ) ;
    public final void rule__FormInputSearch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2846:1: ( ( 'options:' ) )
            // InternalVFormDsl.g:2847:1: ( 'options:' )
            {
            // InternalVFormDsl.g:2847:1: ( 'options:' )
            // InternalVFormDsl.g:2848:2: 'options:'
            {
             before(grammarAccess.getFormInputSearchAccess().getOptionsKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getOptionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__8__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__9"
    // InternalVFormDsl.g:2857:1: rule__FormInputSearch__Group__9 : rule__FormInputSearch__Group__9__Impl rule__FormInputSearch__Group__10 ;
    public final void rule__FormInputSearch__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2861:1: ( rule__FormInputSearch__Group__9__Impl rule__FormInputSearch__Group__10 )
            // InternalVFormDsl.g:2862:2: rule__FormInputSearch__Group__9__Impl rule__FormInputSearch__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__FormInputSearch__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__9"


    // $ANTLR start "rule__FormInputSearch__Group__9__Impl"
    // InternalVFormDsl.g:2869:1: rule__FormInputSearch__Group__9__Impl : ( '[' ) ;
    public final void rule__FormInputSearch__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2873:1: ( ( '[' ) )
            // InternalVFormDsl.g:2874:1: ( '[' )
            {
            // InternalVFormDsl.g:2874:1: ( '[' )
            // InternalVFormDsl.g:2875:2: '['
            {
             before(grammarAccess.getFormInputSearchAccess().getLeftSquareBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getLeftSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__9__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__10"
    // InternalVFormDsl.g:2884:1: rule__FormInputSearch__Group__10 : rule__FormInputSearch__Group__10__Impl rule__FormInputSearch__Group__11 ;
    public final void rule__FormInputSearch__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2888:1: ( rule__FormInputSearch__Group__10__Impl rule__FormInputSearch__Group__11 )
            // InternalVFormDsl.g:2889:2: rule__FormInputSearch__Group__10__Impl rule__FormInputSearch__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__FormInputSearch__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__10"


    // $ANTLR start "rule__FormInputSearch__Group__10__Impl"
    // InternalVFormDsl.g:2896:1: rule__FormInputSearch__Group__10__Impl : ( ( rule__FormInputSearch__DataAssignment_10 ) ) ;
    public final void rule__FormInputSearch__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2900:1: ( ( ( rule__FormInputSearch__DataAssignment_10 ) ) )
            // InternalVFormDsl.g:2901:1: ( ( rule__FormInputSearch__DataAssignment_10 ) )
            {
            // InternalVFormDsl.g:2901:1: ( ( rule__FormInputSearch__DataAssignment_10 ) )
            // InternalVFormDsl.g:2902:2: ( rule__FormInputSearch__DataAssignment_10 )
            {
             before(grammarAccess.getFormInputSearchAccess().getDataAssignment_10()); 
            // InternalVFormDsl.g:2903:2: ( rule__FormInputSearch__DataAssignment_10 )
            // InternalVFormDsl.g:2903:3: rule__FormInputSearch__DataAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__DataAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSearchAccess().getDataAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__10__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__11"
    // InternalVFormDsl.g:2911:1: rule__FormInputSearch__Group__11 : rule__FormInputSearch__Group__11__Impl rule__FormInputSearch__Group__12 ;
    public final void rule__FormInputSearch__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2915:1: ( rule__FormInputSearch__Group__11__Impl rule__FormInputSearch__Group__12 )
            // InternalVFormDsl.g:2916:2: rule__FormInputSearch__Group__11__Impl rule__FormInputSearch__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__FormInputSearch__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__11"


    // $ANTLR start "rule__FormInputSearch__Group__11__Impl"
    // InternalVFormDsl.g:2923:1: rule__FormInputSearch__Group__11__Impl : ( ( rule__FormInputSearch__Group_11__0 )* ) ;
    public final void rule__FormInputSearch__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2927:1: ( ( ( rule__FormInputSearch__Group_11__0 )* ) )
            // InternalVFormDsl.g:2928:1: ( ( rule__FormInputSearch__Group_11__0 )* )
            {
            // InternalVFormDsl.g:2928:1: ( ( rule__FormInputSearch__Group_11__0 )* )
            // InternalVFormDsl.g:2929:2: ( rule__FormInputSearch__Group_11__0 )*
            {
             before(grammarAccess.getFormInputSearchAccess().getGroup_11()); 
            // InternalVFormDsl.g:2930:2: ( rule__FormInputSearch__Group_11__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVFormDsl.g:2930:3: rule__FormInputSearch__Group_11__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__FormInputSearch__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFormInputSearchAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__11__Impl"


    // $ANTLR start "rule__FormInputSearch__Group__12"
    // InternalVFormDsl.g:2938:1: rule__FormInputSearch__Group__12 : rule__FormInputSearch__Group__12__Impl ;
    public final void rule__FormInputSearch__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2942:1: ( rule__FormInputSearch__Group__12__Impl )
            // InternalVFormDsl.g:2943:2: rule__FormInputSearch__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__12"


    // $ANTLR start "rule__FormInputSearch__Group__12__Impl"
    // InternalVFormDsl.g:2949:1: rule__FormInputSearch__Group__12__Impl : ( ']' ) ;
    public final void rule__FormInputSearch__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2953:1: ( ( ']' ) )
            // InternalVFormDsl.g:2954:1: ( ']' )
            {
            // InternalVFormDsl.g:2954:1: ( ']' )
            // InternalVFormDsl.g:2955:2: ']'
            {
             before(grammarAccess.getFormInputSearchAccess().getRightSquareBracketKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getRightSquareBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group__12__Impl"


    // $ANTLR start "rule__FormInputSearch__Group_11__0"
    // InternalVFormDsl.g:2965:1: rule__FormInputSearch__Group_11__0 : rule__FormInputSearch__Group_11__0__Impl rule__FormInputSearch__Group_11__1 ;
    public final void rule__FormInputSearch__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2969:1: ( rule__FormInputSearch__Group_11__0__Impl rule__FormInputSearch__Group_11__1 )
            // InternalVFormDsl.g:2970:2: rule__FormInputSearch__Group_11__0__Impl rule__FormInputSearch__Group_11__1
            {
            pushFollow(FOLLOW_27);
            rule__FormInputSearch__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group_11__0"


    // $ANTLR start "rule__FormInputSearch__Group_11__0__Impl"
    // InternalVFormDsl.g:2977:1: rule__FormInputSearch__Group_11__0__Impl : ( ',' ) ;
    public final void rule__FormInputSearch__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2981:1: ( ( ',' ) )
            // InternalVFormDsl.g:2982:1: ( ',' )
            {
            // InternalVFormDsl.g:2982:1: ( ',' )
            // InternalVFormDsl.g:2983:2: ','
            {
             before(grammarAccess.getFormInputSearchAccess().getCommaKeyword_11_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group_11__0__Impl"


    // $ANTLR start "rule__FormInputSearch__Group_11__1"
    // InternalVFormDsl.g:2992:1: rule__FormInputSearch__Group_11__1 : rule__FormInputSearch__Group_11__1__Impl ;
    public final void rule__FormInputSearch__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:2996:1: ( rule__FormInputSearch__Group_11__1__Impl )
            // InternalVFormDsl.g:2997:2: rule__FormInputSearch__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group_11__1"


    // $ANTLR start "rule__FormInputSearch__Group_11__1__Impl"
    // InternalVFormDsl.g:3003:1: rule__FormInputSearch__Group_11__1__Impl : ( ( rule__FormInputSearch__DataAssignment_11_1 ) ) ;
    public final void rule__FormInputSearch__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3007:1: ( ( ( rule__FormInputSearch__DataAssignment_11_1 ) ) )
            // InternalVFormDsl.g:3008:1: ( ( rule__FormInputSearch__DataAssignment_11_1 ) )
            {
            // InternalVFormDsl.g:3008:1: ( ( rule__FormInputSearch__DataAssignment_11_1 ) )
            // InternalVFormDsl.g:3009:2: ( rule__FormInputSearch__DataAssignment_11_1 )
            {
             before(grammarAccess.getFormInputSearchAccess().getDataAssignment_11_1()); 
            // InternalVFormDsl.g:3010:2: ( rule__FormInputSearch__DataAssignment_11_1 )
            // InternalVFormDsl.g:3010:3: rule__FormInputSearch__DataAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__FormInputSearch__DataAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFormInputSearchAccess().getDataAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__Group_11__1__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__0"
    // InternalVFormDsl.g:3019:1: rule__FormInputGroup__Group__0 : rule__FormInputGroup__Group__0__Impl rule__FormInputGroup__Group__1 ;
    public final void rule__FormInputGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3023:1: ( rule__FormInputGroup__Group__0__Impl rule__FormInputGroup__Group__1 )
            // InternalVFormDsl.g:3024:2: rule__FormInputGroup__Group__0__Impl rule__FormInputGroup__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormInputGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__0"


    // $ANTLR start "rule__FormInputGroup__Group__0__Impl"
    // InternalVFormDsl.g:3031:1: rule__FormInputGroup__Group__0__Impl : ( 'name' ) ;
    public final void rule__FormInputGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3035:1: ( ( 'name' ) )
            // InternalVFormDsl.g:3036:1: ( 'name' )
            {
            // InternalVFormDsl.g:3036:1: ( 'name' )
            // InternalVFormDsl.g:3037:2: 'name'
            {
             before(grammarAccess.getFormInputGroupAccess().getNameKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__0__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__1"
    // InternalVFormDsl.g:3046:1: rule__FormInputGroup__Group__1 : rule__FormInputGroup__Group__1__Impl rule__FormInputGroup__Group__2 ;
    public final void rule__FormInputGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3050:1: ( rule__FormInputGroup__Group__1__Impl rule__FormInputGroup__Group__2 )
            // InternalVFormDsl.g:3051:2: rule__FormInputGroup__Group__1__Impl rule__FormInputGroup__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FormInputGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__1"


    // $ANTLR start "rule__FormInputGroup__Group__1__Impl"
    // InternalVFormDsl.g:3058:1: rule__FormInputGroup__Group__1__Impl : ( ':' ) ;
    public final void rule__FormInputGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3062:1: ( ( ':' ) )
            // InternalVFormDsl.g:3063:1: ( ':' )
            {
            // InternalVFormDsl.g:3063:1: ( ':' )
            // InternalVFormDsl.g:3064:2: ':'
            {
             before(grammarAccess.getFormInputGroupAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__1__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__2"
    // InternalVFormDsl.g:3073:1: rule__FormInputGroup__Group__2 : rule__FormInputGroup__Group__2__Impl rule__FormInputGroup__Group__3 ;
    public final void rule__FormInputGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3077:1: ( rule__FormInputGroup__Group__2__Impl rule__FormInputGroup__Group__3 )
            // InternalVFormDsl.g:3078:2: rule__FormInputGroup__Group__2__Impl rule__FormInputGroup__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FormInputGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__2"


    // $ANTLR start "rule__FormInputGroup__Group__2__Impl"
    // InternalVFormDsl.g:3085:1: rule__FormInputGroup__Group__2__Impl : ( ( rule__FormInputGroup__NameAssignment_2 ) ) ;
    public final void rule__FormInputGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3089:1: ( ( ( rule__FormInputGroup__NameAssignment_2 ) ) )
            // InternalVFormDsl.g:3090:1: ( ( rule__FormInputGroup__NameAssignment_2 ) )
            {
            // InternalVFormDsl.g:3090:1: ( ( rule__FormInputGroup__NameAssignment_2 ) )
            // InternalVFormDsl.g:3091:2: ( rule__FormInputGroup__NameAssignment_2 )
            {
             before(grammarAccess.getFormInputGroupAccess().getNameAssignment_2()); 
            // InternalVFormDsl.g:3092:2: ( rule__FormInputGroup__NameAssignment_2 )
            // InternalVFormDsl.g:3092:3: rule__FormInputGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormInputGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormInputGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__2__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__3"
    // InternalVFormDsl.g:3100:1: rule__FormInputGroup__Group__3 : rule__FormInputGroup__Group__3__Impl rule__FormInputGroup__Group__4 ;
    public final void rule__FormInputGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3104:1: ( rule__FormInputGroup__Group__3__Impl rule__FormInputGroup__Group__4 )
            // InternalVFormDsl.g:3105:2: rule__FormInputGroup__Group__3__Impl rule__FormInputGroup__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__FormInputGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__3"


    // $ANTLR start "rule__FormInputGroup__Group__3__Impl"
    // InternalVFormDsl.g:3112:1: rule__FormInputGroup__Group__3__Impl : ( ',' ) ;
    public final void rule__FormInputGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3116:1: ( ( ',' ) )
            // InternalVFormDsl.g:3117:1: ( ',' )
            {
            // InternalVFormDsl.g:3117:1: ( ',' )
            // InternalVFormDsl.g:3118:2: ','
            {
             before(grammarAccess.getFormInputGroupAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__3__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__4"
    // InternalVFormDsl.g:3127:1: rule__FormInputGroup__Group__4 : rule__FormInputGroup__Group__4__Impl rule__FormInputGroup__Group__5 ;
    public final void rule__FormInputGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3131:1: ( rule__FormInputGroup__Group__4__Impl rule__FormInputGroup__Group__5 )
            // InternalVFormDsl.g:3132:2: rule__FormInputGroup__Group__4__Impl rule__FormInputGroup__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__FormInputGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__4"


    // $ANTLR start "rule__FormInputGroup__Group__4__Impl"
    // InternalVFormDsl.g:3139:1: rule__FormInputGroup__Group__4__Impl : ( 'type:' ) ;
    public final void rule__FormInputGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3143:1: ( ( 'type:' ) )
            // InternalVFormDsl.g:3144:1: ( 'type:' )
            {
            // InternalVFormDsl.g:3144:1: ( 'type:' )
            // InternalVFormDsl.g:3145:2: 'type:'
            {
             before(grammarAccess.getFormInputGroupAccess().getTypeKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__4__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__5"
    // InternalVFormDsl.g:3154:1: rule__FormInputGroup__Group__5 : rule__FormInputGroup__Group__5__Impl rule__FormInputGroup__Group__6 ;
    public final void rule__FormInputGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3158:1: ( rule__FormInputGroup__Group__5__Impl rule__FormInputGroup__Group__6 )
            // InternalVFormDsl.g:3159:2: rule__FormInputGroup__Group__5__Impl rule__FormInputGroup__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__FormInputGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__5"


    // $ANTLR start "rule__FormInputGroup__Group__5__Impl"
    // InternalVFormDsl.g:3166:1: rule__FormInputGroup__Group__5__Impl : ( 'GROUP' ) ;
    public final void rule__FormInputGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3170:1: ( ( 'GROUP' ) )
            // InternalVFormDsl.g:3171:1: ( 'GROUP' )
            {
            // InternalVFormDsl.g:3171:1: ( 'GROUP' )
            // InternalVFormDsl.g:3172:2: 'GROUP'
            {
             before(grammarAccess.getFormInputGroupAccess().getGROUPKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getGROUPKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__5__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__6"
    // InternalVFormDsl.g:3181:1: rule__FormInputGroup__Group__6 : rule__FormInputGroup__Group__6__Impl rule__FormInputGroup__Group__7 ;
    public final void rule__FormInputGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3185:1: ( rule__FormInputGroup__Group__6__Impl rule__FormInputGroup__Group__7 )
            // InternalVFormDsl.g:3186:2: rule__FormInputGroup__Group__6__Impl rule__FormInputGroup__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__FormInputGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__6"


    // $ANTLR start "rule__FormInputGroup__Group__6__Impl"
    // InternalVFormDsl.g:3193:1: rule__FormInputGroup__Group__6__Impl : ( ',' ) ;
    public final void rule__FormInputGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3197:1: ( ( ',' ) )
            // InternalVFormDsl.g:3198:1: ( ',' )
            {
            // InternalVFormDsl.g:3198:1: ( ',' )
            // InternalVFormDsl.g:3199:2: ','
            {
             before(grammarAccess.getFormInputGroupAccess().getCommaKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__6__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__7"
    // InternalVFormDsl.g:3208:1: rule__FormInputGroup__Group__7 : rule__FormInputGroup__Group__7__Impl rule__FormInputGroup__Group__8 ;
    public final void rule__FormInputGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3212:1: ( rule__FormInputGroup__Group__7__Impl rule__FormInputGroup__Group__8 )
            // InternalVFormDsl.g:3213:2: rule__FormInputGroup__Group__7__Impl rule__FormInputGroup__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__FormInputGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__7"


    // $ANTLR start "rule__FormInputGroup__Group__7__Impl"
    // InternalVFormDsl.g:3220:1: rule__FormInputGroup__Group__7__Impl : ( 'groupInputs:' ) ;
    public final void rule__FormInputGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3224:1: ( ( 'groupInputs:' ) )
            // InternalVFormDsl.g:3225:1: ( 'groupInputs:' )
            {
            // InternalVFormDsl.g:3225:1: ( 'groupInputs:' )
            // InternalVFormDsl.g:3226:2: 'groupInputs:'
            {
             before(grammarAccess.getFormInputGroupAccess().getGroupInputsKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getGroupInputsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__7__Impl"


    // $ANTLR start "rule__FormInputGroup__Group__8"
    // InternalVFormDsl.g:3235:1: rule__FormInputGroup__Group__8 : rule__FormInputGroup__Group__8__Impl ;
    public final void rule__FormInputGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3239:1: ( rule__FormInputGroup__Group__8__Impl )
            // InternalVFormDsl.g:3240:2: rule__FormInputGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormInputGroup__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__8"


    // $ANTLR start "rule__FormInputGroup__Group__8__Impl"
    // InternalVFormDsl.g:3246:1: rule__FormInputGroup__Group__8__Impl : ( ( rule__FormInputGroup__GroupInputsAssignment_8 ) ) ;
    public final void rule__FormInputGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3250:1: ( ( ( rule__FormInputGroup__GroupInputsAssignment_8 ) ) )
            // InternalVFormDsl.g:3251:1: ( ( rule__FormInputGroup__GroupInputsAssignment_8 ) )
            {
            // InternalVFormDsl.g:3251:1: ( ( rule__FormInputGroup__GroupInputsAssignment_8 ) )
            // InternalVFormDsl.g:3252:2: ( rule__FormInputGroup__GroupInputsAssignment_8 )
            {
             before(grammarAccess.getFormInputGroupAccess().getGroupInputsAssignment_8()); 
            // InternalVFormDsl.g:3253:2: ( rule__FormInputGroup__GroupInputsAssignment_8 )
            // InternalVFormDsl.g:3253:3: rule__FormInputGroup__GroupInputsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FormInputGroup__GroupInputsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFormInputGroupAccess().getGroupInputsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__Group__8__Impl"


    // $ANTLR start "rule__StringData__Group__0"
    // InternalVFormDsl.g:3262:1: rule__StringData__Group__0 : rule__StringData__Group__0__Impl rule__StringData__Group__1 ;
    public final void rule__StringData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3266:1: ( rule__StringData__Group__0__Impl rule__StringData__Group__1 )
            // InternalVFormDsl.g:3267:2: rule__StringData__Group__0__Impl rule__StringData__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__StringData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__0"


    // $ANTLR start "rule__StringData__Group__0__Impl"
    // InternalVFormDsl.g:3274:1: rule__StringData__Group__0__Impl : ( '{' ) ;
    public final void rule__StringData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3278:1: ( ( '{' ) )
            // InternalVFormDsl.g:3279:1: ( '{' )
            {
            // InternalVFormDsl.g:3279:1: ( '{' )
            // InternalVFormDsl.g:3280:2: '{'
            {
             before(grammarAccess.getStringDataAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__0__Impl"


    // $ANTLR start "rule__StringData__Group__1"
    // InternalVFormDsl.g:3289:1: rule__StringData__Group__1 : rule__StringData__Group__1__Impl rule__StringData__Group__2 ;
    public final void rule__StringData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3293:1: ( rule__StringData__Group__1__Impl rule__StringData__Group__2 )
            // InternalVFormDsl.g:3294:2: rule__StringData__Group__1__Impl rule__StringData__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StringData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__1"


    // $ANTLR start "rule__StringData__Group__1__Impl"
    // InternalVFormDsl.g:3301:1: rule__StringData__Group__1__Impl : ( 'label:' ) ;
    public final void rule__StringData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3305:1: ( ( 'label:' ) )
            // InternalVFormDsl.g:3306:1: ( 'label:' )
            {
            // InternalVFormDsl.g:3306:1: ( 'label:' )
            // InternalVFormDsl.g:3307:2: 'label:'
            {
             before(grammarAccess.getStringDataAccess().getLabelKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getLabelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__1__Impl"


    // $ANTLR start "rule__StringData__Group__2"
    // InternalVFormDsl.g:3316:1: rule__StringData__Group__2 : rule__StringData__Group__2__Impl rule__StringData__Group__3 ;
    public final void rule__StringData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3320:1: ( rule__StringData__Group__2__Impl rule__StringData__Group__3 )
            // InternalVFormDsl.g:3321:2: rule__StringData__Group__2__Impl rule__StringData__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StringData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__2"


    // $ANTLR start "rule__StringData__Group__2__Impl"
    // InternalVFormDsl.g:3328:1: rule__StringData__Group__2__Impl : ( ( rule__StringData__LabelAssignment_2 ) ) ;
    public final void rule__StringData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3332:1: ( ( ( rule__StringData__LabelAssignment_2 ) ) )
            // InternalVFormDsl.g:3333:1: ( ( rule__StringData__LabelAssignment_2 ) )
            {
            // InternalVFormDsl.g:3333:1: ( ( rule__StringData__LabelAssignment_2 ) )
            // InternalVFormDsl.g:3334:2: ( rule__StringData__LabelAssignment_2 )
            {
             before(grammarAccess.getStringDataAccess().getLabelAssignment_2()); 
            // InternalVFormDsl.g:3335:2: ( rule__StringData__LabelAssignment_2 )
            // InternalVFormDsl.g:3335:3: rule__StringData__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringData__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringDataAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__2__Impl"


    // $ANTLR start "rule__StringData__Group__3"
    // InternalVFormDsl.g:3343:1: rule__StringData__Group__3 : rule__StringData__Group__3__Impl rule__StringData__Group__4 ;
    public final void rule__StringData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3347:1: ( rule__StringData__Group__3__Impl rule__StringData__Group__4 )
            // InternalVFormDsl.g:3348:2: rule__StringData__Group__3__Impl rule__StringData__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__StringData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__3"


    // $ANTLR start "rule__StringData__Group__3__Impl"
    // InternalVFormDsl.g:3355:1: rule__StringData__Group__3__Impl : ( ',' ) ;
    public final void rule__StringData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3359:1: ( ( ',' ) )
            // InternalVFormDsl.g:3360:1: ( ',' )
            {
            // InternalVFormDsl.g:3360:1: ( ',' )
            // InternalVFormDsl.g:3361:2: ','
            {
             before(grammarAccess.getStringDataAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__3__Impl"


    // $ANTLR start "rule__StringData__Group__4"
    // InternalVFormDsl.g:3370:1: rule__StringData__Group__4 : rule__StringData__Group__4__Impl rule__StringData__Group__5 ;
    public final void rule__StringData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3374:1: ( rule__StringData__Group__4__Impl rule__StringData__Group__5 )
            // InternalVFormDsl.g:3375:2: rule__StringData__Group__4__Impl rule__StringData__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__StringData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__4"


    // $ANTLR start "rule__StringData__Group__4__Impl"
    // InternalVFormDsl.g:3382:1: rule__StringData__Group__4__Impl : ( 'value:' ) ;
    public final void rule__StringData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3386:1: ( ( 'value:' ) )
            // InternalVFormDsl.g:3387:1: ( 'value:' )
            {
            // InternalVFormDsl.g:3387:1: ( 'value:' )
            // InternalVFormDsl.g:3388:2: 'value:'
            {
             before(grammarAccess.getStringDataAccess().getValueKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__4__Impl"


    // $ANTLR start "rule__StringData__Group__5"
    // InternalVFormDsl.g:3397:1: rule__StringData__Group__5 : rule__StringData__Group__5__Impl rule__StringData__Group__6 ;
    public final void rule__StringData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3401:1: ( rule__StringData__Group__5__Impl rule__StringData__Group__6 )
            // InternalVFormDsl.g:3402:2: rule__StringData__Group__5__Impl rule__StringData__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__StringData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__5"


    // $ANTLR start "rule__StringData__Group__5__Impl"
    // InternalVFormDsl.g:3409:1: rule__StringData__Group__5__Impl : ( ( rule__StringData__ValueAssignment_5 ) ) ;
    public final void rule__StringData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3413:1: ( ( ( rule__StringData__ValueAssignment_5 ) ) )
            // InternalVFormDsl.g:3414:1: ( ( rule__StringData__ValueAssignment_5 ) )
            {
            // InternalVFormDsl.g:3414:1: ( ( rule__StringData__ValueAssignment_5 ) )
            // InternalVFormDsl.g:3415:2: ( rule__StringData__ValueAssignment_5 )
            {
             before(grammarAccess.getStringDataAccess().getValueAssignment_5()); 
            // InternalVFormDsl.g:3416:2: ( rule__StringData__ValueAssignment_5 )
            // InternalVFormDsl.g:3416:3: rule__StringData__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StringData__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStringDataAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__5__Impl"


    // $ANTLR start "rule__StringData__Group__6"
    // InternalVFormDsl.g:3424:1: rule__StringData__Group__6 : rule__StringData__Group__6__Impl ;
    public final void rule__StringData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3428:1: ( rule__StringData__Group__6__Impl )
            // InternalVFormDsl.g:3429:2: rule__StringData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__6"


    // $ANTLR start "rule__StringData__Group__6__Impl"
    // InternalVFormDsl.g:3435:1: rule__StringData__Group__6__Impl : ( '}' ) ;
    public final void rule__StringData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3439:1: ( ( '}' ) )
            // InternalVFormDsl.g:3440:1: ( '}' )
            {
            // InternalVFormDsl.g:3440:1: ( '}' )
            // InternalVFormDsl.g:3441:2: '}'
            {
             before(grammarAccess.getStringDataAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__Group__6__Impl"


    // $ANTLR start "rule__IntData__Group__0"
    // InternalVFormDsl.g:3451:1: rule__IntData__Group__0 : rule__IntData__Group__0__Impl rule__IntData__Group__1 ;
    public final void rule__IntData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3455:1: ( rule__IntData__Group__0__Impl rule__IntData__Group__1 )
            // InternalVFormDsl.g:3456:2: rule__IntData__Group__0__Impl rule__IntData__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__IntData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__0"


    // $ANTLR start "rule__IntData__Group__0__Impl"
    // InternalVFormDsl.g:3463:1: rule__IntData__Group__0__Impl : ( '{' ) ;
    public final void rule__IntData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3467:1: ( ( '{' ) )
            // InternalVFormDsl.g:3468:1: ( '{' )
            {
            // InternalVFormDsl.g:3468:1: ( '{' )
            // InternalVFormDsl.g:3469:2: '{'
            {
             before(grammarAccess.getIntDataAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__0__Impl"


    // $ANTLR start "rule__IntData__Group__1"
    // InternalVFormDsl.g:3478:1: rule__IntData__Group__1 : rule__IntData__Group__1__Impl rule__IntData__Group__2 ;
    public final void rule__IntData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3482:1: ( rule__IntData__Group__1__Impl rule__IntData__Group__2 )
            // InternalVFormDsl.g:3483:2: rule__IntData__Group__1__Impl rule__IntData__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__IntData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__1"


    // $ANTLR start "rule__IntData__Group__1__Impl"
    // InternalVFormDsl.g:3490:1: rule__IntData__Group__1__Impl : ( 'label:' ) ;
    public final void rule__IntData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3494:1: ( ( 'label:' ) )
            // InternalVFormDsl.g:3495:1: ( 'label:' )
            {
            // InternalVFormDsl.g:3495:1: ( 'label:' )
            // InternalVFormDsl.g:3496:2: 'label:'
            {
             before(grammarAccess.getIntDataAccess().getLabelKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getLabelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__1__Impl"


    // $ANTLR start "rule__IntData__Group__2"
    // InternalVFormDsl.g:3505:1: rule__IntData__Group__2 : rule__IntData__Group__2__Impl rule__IntData__Group__3 ;
    public final void rule__IntData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3509:1: ( rule__IntData__Group__2__Impl rule__IntData__Group__3 )
            // InternalVFormDsl.g:3510:2: rule__IntData__Group__2__Impl rule__IntData__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__IntData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__2"


    // $ANTLR start "rule__IntData__Group__2__Impl"
    // InternalVFormDsl.g:3517:1: rule__IntData__Group__2__Impl : ( ( rule__IntData__LabelAssignment_2 ) ) ;
    public final void rule__IntData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3521:1: ( ( ( rule__IntData__LabelAssignment_2 ) ) )
            // InternalVFormDsl.g:3522:1: ( ( rule__IntData__LabelAssignment_2 ) )
            {
            // InternalVFormDsl.g:3522:1: ( ( rule__IntData__LabelAssignment_2 ) )
            // InternalVFormDsl.g:3523:2: ( rule__IntData__LabelAssignment_2 )
            {
             before(grammarAccess.getIntDataAccess().getLabelAssignment_2()); 
            // InternalVFormDsl.g:3524:2: ( rule__IntData__LabelAssignment_2 )
            // InternalVFormDsl.g:3524:3: rule__IntData__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntData__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntDataAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__2__Impl"


    // $ANTLR start "rule__IntData__Group__3"
    // InternalVFormDsl.g:3532:1: rule__IntData__Group__3 : rule__IntData__Group__3__Impl rule__IntData__Group__4 ;
    public final void rule__IntData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3536:1: ( rule__IntData__Group__3__Impl rule__IntData__Group__4 )
            // InternalVFormDsl.g:3537:2: rule__IntData__Group__3__Impl rule__IntData__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__IntData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__3"


    // $ANTLR start "rule__IntData__Group__3__Impl"
    // InternalVFormDsl.g:3544:1: rule__IntData__Group__3__Impl : ( ',' ) ;
    public final void rule__IntData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3548:1: ( ( ',' ) )
            // InternalVFormDsl.g:3549:1: ( ',' )
            {
            // InternalVFormDsl.g:3549:1: ( ',' )
            // InternalVFormDsl.g:3550:2: ','
            {
             before(grammarAccess.getIntDataAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__3__Impl"


    // $ANTLR start "rule__IntData__Group__4"
    // InternalVFormDsl.g:3559:1: rule__IntData__Group__4 : rule__IntData__Group__4__Impl rule__IntData__Group__5 ;
    public final void rule__IntData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3563:1: ( rule__IntData__Group__4__Impl rule__IntData__Group__5 )
            // InternalVFormDsl.g:3564:2: rule__IntData__Group__4__Impl rule__IntData__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__IntData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__4"


    // $ANTLR start "rule__IntData__Group__4__Impl"
    // InternalVFormDsl.g:3571:1: rule__IntData__Group__4__Impl : ( 'value:' ) ;
    public final void rule__IntData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3575:1: ( ( 'value:' ) )
            // InternalVFormDsl.g:3576:1: ( 'value:' )
            {
            // InternalVFormDsl.g:3576:1: ( 'value:' )
            // InternalVFormDsl.g:3577:2: 'value:'
            {
             before(grammarAccess.getIntDataAccess().getValueKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__4__Impl"


    // $ANTLR start "rule__IntData__Group__5"
    // InternalVFormDsl.g:3586:1: rule__IntData__Group__5 : rule__IntData__Group__5__Impl rule__IntData__Group__6 ;
    public final void rule__IntData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3590:1: ( rule__IntData__Group__5__Impl rule__IntData__Group__6 )
            // InternalVFormDsl.g:3591:2: rule__IntData__Group__5__Impl rule__IntData__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__IntData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__5"


    // $ANTLR start "rule__IntData__Group__5__Impl"
    // InternalVFormDsl.g:3598:1: rule__IntData__Group__5__Impl : ( ( rule__IntData__ValueAssignment_5 ) ) ;
    public final void rule__IntData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3602:1: ( ( ( rule__IntData__ValueAssignment_5 ) ) )
            // InternalVFormDsl.g:3603:1: ( ( rule__IntData__ValueAssignment_5 ) )
            {
            // InternalVFormDsl.g:3603:1: ( ( rule__IntData__ValueAssignment_5 ) )
            // InternalVFormDsl.g:3604:2: ( rule__IntData__ValueAssignment_5 )
            {
             before(grammarAccess.getIntDataAccess().getValueAssignment_5()); 
            // InternalVFormDsl.g:3605:2: ( rule__IntData__ValueAssignment_5 )
            // InternalVFormDsl.g:3605:3: rule__IntData__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IntData__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntDataAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__5__Impl"


    // $ANTLR start "rule__IntData__Group__6"
    // InternalVFormDsl.g:3613:1: rule__IntData__Group__6 : rule__IntData__Group__6__Impl ;
    public final void rule__IntData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3617:1: ( rule__IntData__Group__6__Impl )
            // InternalVFormDsl.g:3618:2: rule__IntData__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__6"


    // $ANTLR start "rule__IntData__Group__6__Impl"
    // InternalVFormDsl.g:3624:1: rule__IntData__Group__6__Impl : ( '}' ) ;
    public final void rule__IntData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3628:1: ( ( '}' ) )
            // InternalVFormDsl.g:3629:1: ( '}' )
            {
            // InternalVFormDsl.g:3629:1: ( '}' )
            // InternalVFormDsl.g:3630:2: '}'
            {
             before(grammarAccess.getIntDataAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__Group__6__Impl"


    // $ANTLR start "rule__Model__FormLayoutAssignment_1"
    // InternalVFormDsl.g:3640:1: rule__Model__FormLayoutAssignment_1 : ( ruleFormLayout ) ;
    public final void rule__Model__FormLayoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3644:1: ( ( ruleFormLayout ) )
            // InternalVFormDsl.g:3645:2: ( ruleFormLayout )
            {
            // InternalVFormDsl.g:3645:2: ( ruleFormLayout )
            // InternalVFormDsl.g:3646:3: ruleFormLayout
            {
             before(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormLayout();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormLayoutAssignment_1"


    // $ANTLR start "rule__Model__FormInputAssignment_5"
    // InternalVFormDsl.g:3655:1: rule__Model__FormInputAssignment_5 : ( ruleFormInput ) ;
    public final void rule__Model__FormInputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3659:1: ( ( ruleFormInput ) )
            // InternalVFormDsl.g:3660:2: ( ruleFormInput )
            {
            // InternalVFormDsl.g:3660:2: ( ruleFormInput )
            // InternalVFormDsl.g:3661:3: ruleFormInput
            {
             before(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFormInput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormInputAssignment_5"


    // $ANTLR start "rule__FormLayout__LayoutAssignment"
    // InternalVFormDsl.g:3670:1: rule__FormLayout__LayoutAssignment : ( ruleLayout ) ;
    public final void rule__FormLayout__LayoutAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3674:1: ( ( ruleLayout ) )
            // InternalVFormDsl.g:3675:2: ( ruleLayout )
            {
            // InternalVFormDsl.g:3675:2: ( ruleLayout )
            // InternalVFormDsl.g:3676:3: ruleLayout
            {
             before(grammarAccess.getFormLayoutAccess().getLayoutLayoutEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormLayoutAccess().getLayoutLayoutEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormLayout__LayoutAssignment"


    // $ANTLR start "rule__FormInputBasic__NameAssignment_2"
    // InternalVFormDsl.g:3685:1: rule__FormInputBasic__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormInputBasic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3689:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3690:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3690:2: ( RULE_STRING )
            // InternalVFormDsl.g:3691:3: RULE_STRING
            {
             before(grammarAccess.getFormInputBasicAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormInputBasicAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__NameAssignment_2"


    // $ANTLR start "rule__FormInputBasic__TypeAssignment_5"
    // InternalVFormDsl.g:3700:1: rule__FormInputBasic__TypeAssignment_5 : ( ruleInputType ) ;
    public final void rule__FormInputBasic__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3704:1: ( ( ruleInputType ) )
            // InternalVFormDsl.g:3705:2: ( ruleInputType )
            {
            // InternalVFormDsl.g:3705:2: ( ruleInputType )
            // InternalVFormDsl.g:3706:3: ruleInputType
            {
             before(grammarAccess.getFormInputBasicAccess().getTypeInputTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getFormInputBasicAccess().getTypeInputTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputBasic__TypeAssignment_5"


    // $ANTLR start "rule__FormInputRange__NameAssignment_2"
    // InternalVFormDsl.g:3715:1: rule__FormInputRange__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormInputRange__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3719:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3720:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3720:2: ( RULE_STRING )
            // InternalVFormDsl.g:3721:3: RULE_STRING
            {
             before(grammarAccess.getFormInputRangeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__NameAssignment_2"


    // $ANTLR start "rule__FormInputRange__MinAssignment_9"
    // InternalVFormDsl.g:3730:1: rule__FormInputRange__MinAssignment_9 : ( RULE_INT ) ;
    public final void rule__FormInputRange__MinAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3734:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3735:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3735:2: ( RULE_INT )
            // InternalVFormDsl.g:3736:3: RULE_INT
            {
             before(grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__MinAssignment_9"


    // $ANTLR start "rule__FormInputRange__MaxAssignment_12"
    // InternalVFormDsl.g:3745:1: rule__FormInputRange__MaxAssignment_12 : ( RULE_INT ) ;
    public final void rule__FormInputRange__MaxAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3749:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3750:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3750:2: ( RULE_INT )
            // InternalVFormDsl.g:3751:3: RULE_INT
            {
             before(grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputRange__MaxAssignment_12"


    // $ANTLR start "rule__FormInputSelect__NameAssignment_2"
    // InternalVFormDsl.g:3760:1: rule__FormInputSelect__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormInputSelect__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3764:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3765:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3765:2: ( RULE_STRING )
            // InternalVFormDsl.g:3766:3: RULE_STRING
            {
             before(grammarAccess.getFormInputSelectAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormInputSelectAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__NameAssignment_2"


    // $ANTLR start "rule__FormInputSelect__OptionAssignment_10"
    // InternalVFormDsl.g:3775:1: rule__FormInputSelect__OptionAssignment_10 : ( ruleOption ) ;
    public final void rule__FormInputSelect__OptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3779:1: ( ( ruleOption ) )
            // InternalVFormDsl.g:3780:2: ( ruleOption )
            {
            // InternalVFormDsl.g:3780:2: ( ruleOption )
            // InternalVFormDsl.g:3781:3: ruleOption
            {
             before(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSelect__OptionAssignment_10"


    // $ANTLR start "rule__DataOption__DataAssignment_5"
    // InternalVFormDsl.g:3790:1: rule__DataOption__DataAssignment_5 : ( ruleData ) ;
    public final void rule__DataOption__DataAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3794:1: ( ( ruleData ) )
            // InternalVFormDsl.g:3795:2: ( ruleData )
            {
            // InternalVFormDsl.g:3795:2: ( ruleData )
            // InternalVFormDsl.g:3796:3: ruleData
            {
             before(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__DataAssignment_5"


    // $ANTLR start "rule__DataOption__DataAssignment_6_1"
    // InternalVFormDsl.g:3805:1: rule__DataOption__DataAssignment_6_1 : ( ruleData ) ;
    public final void rule__DataOption__DataAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3809:1: ( ( ruleData ) )
            // InternalVFormDsl.g:3810:2: ( ruleData )
            {
            // InternalVFormDsl.g:3810:2: ( ruleData )
            // InternalVFormDsl.g:3811:3: ruleData
            {
             before(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__DataAssignment_6_1"


    // $ANTLR start "rule__EnumOption__DataAssignment_5"
    // InternalVFormDsl.g:3820:1: rule__EnumOption__DataAssignment_5 : ( ruleOptionItem ) ;
    public final void rule__EnumOption__DataAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3824:1: ( ( ruleOptionItem ) )
            // InternalVFormDsl.g:3825:2: ( ruleOptionItem )
            {
            // InternalVFormDsl.g:3825:2: ( ruleOptionItem )
            // InternalVFormDsl.g:3826:3: ruleOptionItem
            {
             before(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionItem();

            state._fsp--;

             after(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__DataAssignment_5"


    // $ANTLR start "rule__EnumOption__DataAssignment_6_1"
    // InternalVFormDsl.g:3835:1: rule__EnumOption__DataAssignment_6_1 : ( ruleOptionItem ) ;
    public final void rule__EnumOption__DataAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3839:1: ( ( ruleOptionItem ) )
            // InternalVFormDsl.g:3840:2: ( ruleOptionItem )
            {
            // InternalVFormDsl.g:3840:2: ( ruleOptionItem )
            // InternalVFormDsl.g:3841:3: ruleOptionItem
            {
             before(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionItem();

            state._fsp--;

             after(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOption__DataAssignment_6_1"


    // $ANTLR start "rule__NumberOption__MinAssignment_4"
    // InternalVFormDsl.g:3850:1: rule__NumberOption__MinAssignment_4 : ( RULE_INT ) ;
    public final void rule__NumberOption__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3854:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3855:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3855:2: ( RULE_INT )
            // InternalVFormDsl.g:3856:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__MinAssignment_4"


    // $ANTLR start "rule__NumberOption__MaxAssignment_7"
    // InternalVFormDsl.g:3865:1: rule__NumberOption__MaxAssignment_7 : ( RULE_INT ) ;
    public final void rule__NumberOption__MaxAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3869:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3870:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3870:2: ( RULE_INT )
            // InternalVFormDsl.g:3871:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__MaxAssignment_7"


    // $ANTLR start "rule__NumberOption__RangeAssignment_10"
    // InternalVFormDsl.g:3880:1: rule__NumberOption__RangeAssignment_10 : ( RULE_INT ) ;
    public final void rule__NumberOption__RangeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3884:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3885:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3885:2: ( RULE_INT )
            // InternalVFormDsl.g:3886:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberOption__RangeAssignment_10"


    // $ANTLR start "rule__FormInputSearch__NameAssignment_2"
    // InternalVFormDsl.g:3895:1: rule__FormInputSearch__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormInputSearch__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3899:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3900:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3900:2: ( RULE_STRING )
            // InternalVFormDsl.g:3901:3: RULE_STRING
            {
             before(grammarAccess.getFormInputSearchAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormInputSearchAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__NameAssignment_2"


    // $ANTLR start "rule__FormInputSearch__DataAssignment_10"
    // InternalVFormDsl.g:3910:1: rule__FormInputSearch__DataAssignment_10 : ( ruleOptionItem ) ;
    public final void rule__FormInputSearch__DataAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3914:1: ( ( ruleOptionItem ) )
            // InternalVFormDsl.g:3915:2: ( ruleOptionItem )
            {
            // InternalVFormDsl.g:3915:2: ( ruleOptionItem )
            // InternalVFormDsl.g:3916:3: ruleOptionItem
            {
             before(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionItem();

            state._fsp--;

             after(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__DataAssignment_10"


    // $ANTLR start "rule__FormInputSearch__DataAssignment_11_1"
    // InternalVFormDsl.g:3925:1: rule__FormInputSearch__DataAssignment_11_1 : ( ruleOptionItem ) ;
    public final void rule__FormInputSearch__DataAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3929:1: ( ( ruleOptionItem ) )
            // InternalVFormDsl.g:3930:2: ( ruleOptionItem )
            {
            // InternalVFormDsl.g:3930:2: ( ruleOptionItem )
            // InternalVFormDsl.g:3931:3: ruleOptionItem
            {
             before(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionItem();

            state._fsp--;

             after(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputSearch__DataAssignment_11_1"


    // $ANTLR start "rule__StringOptionItem__ValueAssignment"
    // InternalVFormDsl.g:3940:1: rule__StringOptionItem__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringOptionItem__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3944:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3945:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3945:2: ( RULE_STRING )
            // InternalVFormDsl.g:3946:3: RULE_STRING
            {
             before(grammarAccess.getStringOptionItemAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringOptionItemAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOptionItem__ValueAssignment"


    // $ANTLR start "rule__IntOptionItem__ValueAssignment"
    // InternalVFormDsl.g:3955:1: rule__IntOptionItem__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntOptionItem__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3959:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:3960:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:3960:2: ( RULE_INT )
            // InternalVFormDsl.g:3961:3: RULE_INT
            {
             before(grammarAccess.getIntOptionItemAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntOptionItemAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOptionItem__ValueAssignment"


    // $ANTLR start "rule__DataOptionItem__ValueAssignment"
    // InternalVFormDsl.g:3970:1: rule__DataOptionItem__ValueAssignment : ( ruleData ) ;
    public final void rule__DataOptionItem__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3974:1: ( ( ruleData ) )
            // InternalVFormDsl.g:3975:2: ( ruleData )
            {
            // InternalVFormDsl.g:3975:2: ( ruleData )
            // InternalVFormDsl.g:3976:3: ruleData
            {
             before(grammarAccess.getDataOptionItemAccess().getValueDataParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataOptionItemAccess().getValueDataParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOptionItem__ValueAssignment"


    // $ANTLR start "rule__FormInputGroup__NameAssignment_2"
    // InternalVFormDsl.g:3985:1: rule__FormInputGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormInputGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:3989:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:3990:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:3990:2: ( RULE_STRING )
            // InternalVFormDsl.g:3991:3: RULE_STRING
            {
             before(grammarAccess.getFormInputGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__NameAssignment_2"


    // $ANTLR start "rule__FormInputGroup__GroupInputsAssignment_8"
    // InternalVFormDsl.g:4000:1: rule__FormInputGroup__GroupInputsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FormInputGroup__GroupInputsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:4004:1: ( ( ( RULE_ID ) ) )
            // InternalVFormDsl.g:4005:2: ( ( RULE_ID ) )
            {
            // InternalVFormDsl.g:4005:2: ( ( RULE_ID ) )
            // InternalVFormDsl.g:4006:3: ( RULE_ID )
            {
             before(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputCrossReference_8_0()); 
            // InternalVFormDsl.g:4007:3: ( RULE_ID )
            // InternalVFormDsl.g:4008:4: RULE_ID
            {
             before(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormInputGroup__GroupInputsAssignment_8"


    // $ANTLR start "rule__StringData__LabelAssignment_2"
    // InternalVFormDsl.g:4019:1: rule__StringData__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringData__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:4023:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:4024:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:4024:2: ( RULE_STRING )
            // InternalVFormDsl.g:4025:3: RULE_STRING
            {
             before(grammarAccess.getStringDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__LabelAssignment_2"


    // $ANTLR start "rule__StringData__ValueAssignment_5"
    // InternalVFormDsl.g:4034:1: rule__StringData__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__StringData__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:4038:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:4039:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:4039:2: ( RULE_STRING )
            // InternalVFormDsl.g:4040:3: RULE_STRING
            {
             before(grammarAccess.getStringDataAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDataAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringData__ValueAssignment_5"


    // $ANTLR start "rule__IntData__LabelAssignment_2"
    // InternalVFormDsl.g:4049:1: rule__IntData__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IntData__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:4053:1: ( ( RULE_STRING ) )
            // InternalVFormDsl.g:4054:2: ( RULE_STRING )
            {
            // InternalVFormDsl.g:4054:2: ( RULE_STRING )
            // InternalVFormDsl.g:4055:3: RULE_STRING
            {
             before(grammarAccess.getIntDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__LabelAssignment_2"


    // $ANTLR start "rule__IntData__ValueAssignment_5"
    // InternalVFormDsl.g:4064:1: rule__IntData__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntData__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVFormDsl.g:4068:1: ( ( RULE_INT ) )
            // InternalVFormDsl.g:4069:2: ( RULE_INT )
            {
            // InternalVFormDsl.g:4069:2: ( RULE_INT )
            // InternalVFormDsl.g:4070:3: RULE_INT
            {
             before(grammarAccess.getIntDataAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntDataAccess().getValueINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntData__ValueAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\32\1\33\1\4\1\26\1\34\1\uffff\1\33\1\uffff\1\17\3\uffff";
    static final String dfa_3s = "\1\32\1\33\1\4\1\34\1\50\1\uffff\1\33\1\uffff\1\21\3\uffff";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\5\1\uffff\1\2\1\4\1\3";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\5\uffff\1\5",
            "\1\6\13\uffff\1\7",
            "",
            "\1\10",
            "",
            "\1\11\1\13\1\12",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "559:1: rule__FormInput__Alternatives : ( ( ruleFormInputBasic ) | ( ruleFormInputRange ) | ( ruleFormInputSelect ) | ( ruleFormInputSearch ) | ( ruleFormInputGroup ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});

}