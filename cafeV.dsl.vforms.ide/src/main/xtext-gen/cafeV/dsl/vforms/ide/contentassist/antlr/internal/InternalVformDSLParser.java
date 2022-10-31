package cafeV.dsl.vforms.ide.contentassist.antlr.internal;

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
import cafeV.dsl.vforms.services.VformDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVformDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'horizontal'", "'vertical'", "'formInputs'", "'formLayout'", "'inputType'", "'text'", "'inputName'", "'checkbox'", "'number'", "'date'", "'range'", "'min'", "'max'", "'select'", "'options'", "'optionType'", "'data'", "'label'", "'value'", "'enum'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalVformDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVformDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVformDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVformDSL.g"; }


    	private VformDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(VformDSLGrammarAccess grammarAccess) {
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
    // InternalVformDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalVformDSL.g:54:1: ( ruleModel EOF )
            // InternalVformDSL.g:55:1: ruleModel EOF
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
    // InternalVformDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalVformDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalVformDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalVformDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalVformDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalVformDSL.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleFormInput"
    // InternalVformDSL.g:78:1: entryRuleFormInput : ruleFormInput EOF ;
    public final void entryRuleFormInput() throws RecognitionException {
        try {
            // InternalVformDSL.g:79:1: ( ruleFormInput EOF )
            // InternalVformDSL.g:80:1: ruleFormInput EOF
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
    // InternalVformDSL.g:87:1: ruleFormInput : ( ( rule__FormInput__Alternatives )* ) ;
    public final void ruleFormInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:91:2: ( ( ( rule__FormInput__Alternatives )* ) )
            // InternalVformDSL.g:92:2: ( ( rule__FormInput__Alternatives )* )
            {
            // InternalVformDSL.g:92:2: ( ( rule__FormInput__Alternatives )* )
            // InternalVformDSL.g:93:3: ( rule__FormInput__Alternatives )*
            {
             before(grammarAccess.getFormInputAccess().getAlternatives()); 
            // InternalVformDSL.g:94:3: ( rule__FormInput__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVformDSL.g:94:4: rule__FormInput__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__FormInput__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

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


    // $ANTLR start "entryRuleFormLayout"
    // InternalVformDSL.g:103:1: entryRuleFormLayout : ruleFormLayout EOF ;
    public final void entryRuleFormLayout() throws RecognitionException {
        try {
            // InternalVformDSL.g:104:1: ( ruleFormLayout EOF )
            // InternalVformDSL.g:105:1: ruleFormLayout EOF
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
    // InternalVformDSL.g:112:1: ruleFormLayout : ( ( rule__FormLayout__LayoutAssignment ) ) ;
    public final void ruleFormLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:116:2: ( ( ( rule__FormLayout__LayoutAssignment ) ) )
            // InternalVformDSL.g:117:2: ( ( rule__FormLayout__LayoutAssignment ) )
            {
            // InternalVformDSL.g:117:2: ( ( rule__FormLayout__LayoutAssignment ) )
            // InternalVformDSL.g:118:3: ( rule__FormLayout__LayoutAssignment )
            {
             before(grammarAccess.getFormLayoutAccess().getLayoutAssignment()); 
            // InternalVformDSL.g:119:3: ( rule__FormLayout__LayoutAssignment )
            // InternalVformDSL.g:119:4: rule__FormLayout__LayoutAssignment
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


    // $ANTLR start "entryRuleText"
    // InternalVformDSL.g:128:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalVformDSL.g:129:1: ( ruleText EOF )
            // InternalVformDSL.g:130:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalVformDSL.g:137:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:141:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalVformDSL.g:142:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalVformDSL.g:142:2: ( ( rule__Text__Group__0 ) )
            // InternalVformDSL.g:143:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalVformDSL.g:144:3: ( rule__Text__Group__0 )
            // InternalVformDSL.g:144:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCheckbox"
    // InternalVformDSL.g:153:1: entryRuleCheckbox : ruleCheckbox EOF ;
    public final void entryRuleCheckbox() throws RecognitionException {
        try {
            // InternalVformDSL.g:154:1: ( ruleCheckbox EOF )
            // InternalVformDSL.g:155:1: ruleCheckbox EOF
            {
             before(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getCheckboxRule()); 
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
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalVformDSL.g:162:1: ruleCheckbox : ( ( rule__Checkbox__Group__0 ) ) ;
    public final void ruleCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:166:2: ( ( ( rule__Checkbox__Group__0 ) ) )
            // InternalVformDSL.g:167:2: ( ( rule__Checkbox__Group__0 ) )
            {
            // InternalVformDSL.g:167:2: ( ( rule__Checkbox__Group__0 ) )
            // InternalVformDSL.g:168:3: ( rule__Checkbox__Group__0 )
            {
             before(grammarAccess.getCheckboxAccess().getGroup()); 
            // InternalVformDSL.g:169:3: ( rule__Checkbox__Group__0 )
            // InternalVformDSL.g:169:4: rule__Checkbox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleNumber"
    // InternalVformDSL.g:178:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalVformDSL.g:179:1: ( ruleNumber EOF )
            // InternalVformDSL.g:180:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalVformDSL.g:187:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:191:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalVformDSL.g:192:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalVformDSL.g:192:2: ( ( rule__Number__Group__0 ) )
            // InternalVformDSL.g:193:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalVformDSL.g:194:3: ( rule__Number__Group__0 )
            // InternalVformDSL.g:194:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleDat"
    // InternalVformDSL.g:203:1: entryRuleDat : ruleDat EOF ;
    public final void entryRuleDat() throws RecognitionException {
        try {
            // InternalVformDSL.g:204:1: ( ruleDat EOF )
            // InternalVformDSL.g:205:1: ruleDat EOF
            {
             before(grammarAccess.getDatRule()); 
            pushFollow(FOLLOW_1);
            ruleDat();

            state._fsp--;

             after(grammarAccess.getDatRule()); 
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
    // $ANTLR end "entryRuleDat"


    // $ANTLR start "ruleDat"
    // InternalVformDSL.g:212:1: ruleDat : ( ( rule__Dat__Group__0 ) ) ;
    public final void ruleDat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:216:2: ( ( ( rule__Dat__Group__0 ) ) )
            // InternalVformDSL.g:217:2: ( ( rule__Dat__Group__0 ) )
            {
            // InternalVformDSL.g:217:2: ( ( rule__Dat__Group__0 ) )
            // InternalVformDSL.g:218:3: ( rule__Dat__Group__0 )
            {
             before(grammarAccess.getDatAccess().getGroup()); 
            // InternalVformDSL.g:219:3: ( rule__Dat__Group__0 )
            // InternalVformDSL.g:219:4: rule__Dat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatAccess().getGroup()); 

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
    // $ANTLR end "ruleDat"


    // $ANTLR start "entryRuleRange"
    // InternalVformDSL.g:228:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalVformDSL.g:229:1: ( ruleRange EOF )
            // InternalVformDSL.g:230:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalVformDSL.g:237:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:241:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalVformDSL.g:242:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalVformDSL.g:242:2: ( ( rule__Range__Group__0 ) )
            // InternalVformDSL.g:243:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalVformDSL.g:244:3: ( rule__Range__Group__0 )
            // InternalVformDSL.g:244:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleSelect"
    // InternalVformDSL.g:253:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalVformDSL.g:254:1: ( ruleSelect EOF )
            // InternalVformDSL.g:255:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalVformDSL.g:262:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:266:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalVformDSL.g:267:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalVformDSL.g:267:2: ( ( rule__Select__Group__0 ) )
            // InternalVformDSL.g:268:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalVformDSL.g:269:3: ( rule__Select__Group__0 )
            // InternalVformDSL.g:269:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDataOption"
    // InternalVformDSL.g:278:1: entryRuleDataOption : ruleDataOption EOF ;
    public final void entryRuleDataOption() throws RecognitionException {
        try {
            // InternalVformDSL.g:279:1: ( ruleDataOption EOF )
            // InternalVformDSL.g:280:1: ruleDataOption EOF
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
    // InternalVformDSL.g:287:1: ruleDataOption : ( ( rule__DataOption__Group__0 ) ) ;
    public final void ruleDataOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:291:2: ( ( ( rule__DataOption__Group__0 ) ) )
            // InternalVformDSL.g:292:2: ( ( rule__DataOption__Group__0 ) )
            {
            // InternalVformDSL.g:292:2: ( ( rule__DataOption__Group__0 ) )
            // InternalVformDSL.g:293:3: ( rule__DataOption__Group__0 )
            {
             before(grammarAccess.getDataOptionAccess().getGroup()); 
            // InternalVformDSL.g:294:3: ( rule__DataOption__Group__0 )
            // InternalVformDSL.g:294:4: rule__DataOption__Group__0
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


    // $ANTLR start "entryRuleData"
    // InternalVformDSL.g:303:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalVformDSL.g:304:1: ( ruleData EOF )
            // InternalVformDSL.g:305:1: ruleData EOF
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
    // InternalVformDSL.g:312:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:316:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalVformDSL.g:317:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalVformDSL.g:317:2: ( ( rule__Data__Alternatives ) )
            // InternalVformDSL.g:318:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalVformDSL.g:319:3: ( rule__Data__Alternatives )
            // InternalVformDSL.g:319:4: rule__Data__Alternatives
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


    // $ANTLR start "entryRuleNumberOption"
    // InternalVformDSL.g:328:1: entryRuleNumberOption : ruleNumberOption EOF ;
    public final void entryRuleNumberOption() throws RecognitionException {
        try {
            // InternalVformDSL.g:329:1: ( ruleNumberOption EOF )
            // InternalVformDSL.g:330:1: ruleNumberOption EOF
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
    // InternalVformDSL.g:337:1: ruleNumberOption : ( ( rule__NumberOption__Group__0 ) ) ;
    public final void ruleNumberOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:341:2: ( ( ( rule__NumberOption__Group__0 ) ) )
            // InternalVformDSL.g:342:2: ( ( rule__NumberOption__Group__0 ) )
            {
            // InternalVformDSL.g:342:2: ( ( rule__NumberOption__Group__0 ) )
            // InternalVformDSL.g:343:3: ( rule__NumberOption__Group__0 )
            {
             before(grammarAccess.getNumberOptionAccess().getGroup()); 
            // InternalVformDSL.g:344:3: ( rule__NumberOption__Group__0 )
            // InternalVformDSL.g:344:4: rule__NumberOption__Group__0
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


    // $ANTLR start "entryRuleEnumOption"
    // InternalVformDSL.g:353:1: entryRuleEnumOption : ruleEnumOption EOF ;
    public final void entryRuleEnumOption() throws RecognitionException {
        try {
            // InternalVformDSL.g:354:1: ( ruleEnumOption EOF )
            // InternalVformDSL.g:355:1: ruleEnumOption EOF
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
    // InternalVformDSL.g:362:1: ruleEnumOption : ( ( rule__EnumOption__Alternatives ) ) ;
    public final void ruleEnumOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:366:2: ( ( ( rule__EnumOption__Alternatives ) ) )
            // InternalVformDSL.g:367:2: ( ( rule__EnumOption__Alternatives ) )
            {
            // InternalVformDSL.g:367:2: ( ( rule__EnumOption__Alternatives ) )
            // InternalVformDSL.g:368:3: ( rule__EnumOption__Alternatives )
            {
             before(grammarAccess.getEnumOptionAccess().getAlternatives()); 
            // InternalVformDSL.g:369:3: ( rule__EnumOption__Alternatives )
            // InternalVformDSL.g:369:4: rule__EnumOption__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumOptionAccess().getAlternatives()); 

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


    // $ANTLR start "ruleLayout"
    // InternalVformDSL.g:378:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:382:1: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalVformDSL.g:383:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalVformDSL.g:383:2: ( ( rule__Layout__Alternatives ) )
            // InternalVformDSL.g:384:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalVformDSL.g:385:3: ( rule__Layout__Alternatives )
            // InternalVformDSL.g:385:4: rule__Layout__Alternatives
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
    // InternalVformDSL.g:393:1: rule__FormInput__Alternatives : ( ( ( rule__FormInput__TextAssignment_0 ) ) | ( ( rule__FormInput__CheckboxAssignment_1 ) ) | ( ( rule__FormInput__NumberAssignment_2 ) ) | ( ( rule__FormInput__DatAssignment_3 ) ) | ( ( rule__FormInput__RangeAssignment_4 ) ) | ( ( rule__FormInput__SelectAssignment_5 ) ) );
    public final void rule__FormInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:397:1: ( ( ( rule__FormInput__TextAssignment_0 ) ) | ( ( rule__FormInput__CheckboxAssignment_1 ) ) | ( ( rule__FormInput__NumberAssignment_2 ) ) | ( ( rule__FormInput__DatAssignment_3 ) ) | ( ( rule__FormInput__RangeAssignment_4 ) ) | ( ( rule__FormInput__SelectAssignment_5 ) ) )
            int alt2=6;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                case 21:
                    {
                    alt2=5;
                    }
                    break;
                case 18:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
                    {
                    alt2=4;
                    }
                    break;
                case 24:
                    {
                    alt2=6;
                    }
                    break;
                case 16:
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
                    // InternalVformDSL.g:398:2: ( ( rule__FormInput__TextAssignment_0 ) )
                    {
                    // InternalVformDSL.g:398:2: ( ( rule__FormInput__TextAssignment_0 ) )
                    // InternalVformDSL.g:399:3: ( rule__FormInput__TextAssignment_0 )
                    {
                     before(grammarAccess.getFormInputAccess().getTextAssignment_0()); 
                    // InternalVformDSL.g:400:3: ( rule__FormInput__TextAssignment_0 )
                    // InternalVformDSL.g:400:4: rule__FormInput__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:404:2: ( ( rule__FormInput__CheckboxAssignment_1 ) )
                    {
                    // InternalVformDSL.g:404:2: ( ( rule__FormInput__CheckboxAssignment_1 ) )
                    // InternalVformDSL.g:405:3: ( rule__FormInput__CheckboxAssignment_1 )
                    {
                     before(grammarAccess.getFormInputAccess().getCheckboxAssignment_1()); 
                    // InternalVformDSL.g:406:3: ( rule__FormInput__CheckboxAssignment_1 )
                    // InternalVformDSL.g:406:4: rule__FormInput__CheckboxAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__CheckboxAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getCheckboxAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:410:2: ( ( rule__FormInput__NumberAssignment_2 ) )
                    {
                    // InternalVformDSL.g:410:2: ( ( rule__FormInput__NumberAssignment_2 ) )
                    // InternalVformDSL.g:411:3: ( rule__FormInput__NumberAssignment_2 )
                    {
                     before(grammarAccess.getFormInputAccess().getNumberAssignment_2()); 
                    // InternalVformDSL.g:412:3: ( rule__FormInput__NumberAssignment_2 )
                    // InternalVformDSL.g:412:4: rule__FormInput__NumberAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__NumberAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getNumberAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVformDSL.g:416:2: ( ( rule__FormInput__DatAssignment_3 ) )
                    {
                    // InternalVformDSL.g:416:2: ( ( rule__FormInput__DatAssignment_3 ) )
                    // InternalVformDSL.g:417:3: ( rule__FormInput__DatAssignment_3 )
                    {
                     before(grammarAccess.getFormInputAccess().getDatAssignment_3()); 
                    // InternalVformDSL.g:418:3: ( rule__FormInput__DatAssignment_3 )
                    // InternalVformDSL.g:418:4: rule__FormInput__DatAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__DatAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getDatAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVformDSL.g:422:2: ( ( rule__FormInput__RangeAssignment_4 ) )
                    {
                    // InternalVformDSL.g:422:2: ( ( rule__FormInput__RangeAssignment_4 ) )
                    // InternalVformDSL.g:423:3: ( rule__FormInput__RangeAssignment_4 )
                    {
                     before(grammarAccess.getFormInputAccess().getRangeAssignment_4()); 
                    // InternalVformDSL.g:424:3: ( rule__FormInput__RangeAssignment_4 )
                    // InternalVformDSL.g:424:4: rule__FormInput__RangeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__RangeAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getRangeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVformDSL.g:428:2: ( ( rule__FormInput__SelectAssignment_5 ) )
                    {
                    // InternalVformDSL.g:428:2: ( ( rule__FormInput__SelectAssignment_5 ) )
                    // InternalVformDSL.g:429:3: ( rule__FormInput__SelectAssignment_5 )
                    {
                     before(grammarAccess.getFormInputAccess().getSelectAssignment_5()); 
                    // InternalVformDSL.g:430:3: ( rule__FormInput__SelectAssignment_5 )
                    // InternalVformDSL.g:430:4: rule__FormInput__SelectAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__SelectAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getSelectAssignment_5()); 

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


    // $ANTLR start "rule__Select__Alternatives_5"
    // InternalVformDSL.g:438:1: rule__Select__Alternatives_5 : ( ( ( rule__Select__DataOptionAssignment_5_0 ) ) | ( ( rule__Select__NumberOptionAssignment_5_1 ) ) | ( ( rule__Select__EnumOptionAssignment_5_2 ) ) );
    public final void rule__Select__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:442:1: ( ( ( rule__Select__DataOptionAssignment_5_0 ) ) | ( ( rule__Select__NumberOptionAssignment_5_1 ) ) | ( ( rule__Select__EnumOptionAssignment_5_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 30:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==EOF||LA3_0==RULE_STRING||LA3_0==15) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVformDSL.g:443:2: ( ( rule__Select__DataOptionAssignment_5_0 ) )
                    {
                    // InternalVformDSL.g:443:2: ( ( rule__Select__DataOptionAssignment_5_0 ) )
                    // InternalVformDSL.g:444:3: ( rule__Select__DataOptionAssignment_5_0 )
                    {
                     before(grammarAccess.getSelectAccess().getDataOptionAssignment_5_0()); 
                    // InternalVformDSL.g:445:3: ( rule__Select__DataOptionAssignment_5_0 )
                    // InternalVformDSL.g:445:4: rule__Select__DataOptionAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__DataOptionAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getDataOptionAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:449:2: ( ( rule__Select__NumberOptionAssignment_5_1 ) )
                    {
                    // InternalVformDSL.g:449:2: ( ( rule__Select__NumberOptionAssignment_5_1 ) )
                    // InternalVformDSL.g:450:3: ( rule__Select__NumberOptionAssignment_5_1 )
                    {
                     before(grammarAccess.getSelectAccess().getNumberOptionAssignment_5_1()); 
                    // InternalVformDSL.g:451:3: ( rule__Select__NumberOptionAssignment_5_1 )
                    // InternalVformDSL.g:451:4: rule__Select__NumberOptionAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__NumberOptionAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getNumberOptionAssignment_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:455:2: ( ( rule__Select__EnumOptionAssignment_5_2 ) )
                    {
                    // InternalVformDSL.g:455:2: ( ( rule__Select__EnumOptionAssignment_5_2 ) )
                    // InternalVformDSL.g:456:3: ( rule__Select__EnumOptionAssignment_5_2 )
                    {
                     before(grammarAccess.getSelectAccess().getEnumOptionAssignment_5_2()); 
                    // InternalVformDSL.g:457:3: ( rule__Select__EnumOptionAssignment_5_2 )
                    // InternalVformDSL.g:457:4: rule__Select__EnumOptionAssignment_5_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__EnumOptionAssignment_5_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getEnumOptionAssignment_5_2()); 

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
    // $ANTLR end "rule__Select__Alternatives_5"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalVformDSL.g:465:1: rule__Data__Alternatives : ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__IntValAssignment_1 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:469:1: ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__IntValAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVformDSL.g:470:2: ( ( rule__Data__Group_0__0 ) )
                    {
                    // InternalVformDSL.g:470:2: ( ( rule__Data__Group_0__0 ) )
                    // InternalVformDSL.g:471:3: ( rule__Data__Group_0__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_0()); 
                    // InternalVformDSL.g:472:3: ( rule__Data__Group_0__0 )
                    // InternalVformDSL.g:472:4: rule__Data__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:476:2: ( ( rule__Data__IntValAssignment_1 ) )
                    {
                    // InternalVformDSL.g:476:2: ( ( rule__Data__IntValAssignment_1 ) )
                    // InternalVformDSL.g:477:3: ( rule__Data__IntValAssignment_1 )
                    {
                     before(grammarAccess.getDataAccess().getIntValAssignment_1()); 
                    // InternalVformDSL.g:478:3: ( rule__Data__IntValAssignment_1 )
                    // InternalVformDSL.g:478:4: rule__Data__IntValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__IntValAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getIntValAssignment_1()); 

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


    // $ANTLR start "rule__EnumOption__Alternatives"
    // InternalVformDSL.g:486:1: rule__EnumOption__Alternatives : ( ( ( rule__EnumOption__Group_0__0 ) ) | ( ( rule__EnumOption__NumberDataAssignment_1 )* ) );
    public final void rule__EnumOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:490:1: ( ( ( rule__EnumOption__Group_0__0 ) ) | ( ( rule__EnumOption__NumberDataAssignment_1 )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==RULE_STRING||LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVformDSL.g:491:2: ( ( rule__EnumOption__Group_0__0 ) )
                    {
                    // InternalVformDSL.g:491:2: ( ( rule__EnumOption__Group_0__0 ) )
                    // InternalVformDSL.g:492:3: ( rule__EnumOption__Group_0__0 )
                    {
                     before(grammarAccess.getEnumOptionAccess().getGroup_0()); 
                    // InternalVformDSL.g:493:3: ( rule__EnumOption__Group_0__0 )
                    // InternalVformDSL.g:493:4: rule__EnumOption__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumOption__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumOptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:497:2: ( ( rule__EnumOption__NumberDataAssignment_1 )* )
                    {
                    // InternalVformDSL.g:497:2: ( ( rule__EnumOption__NumberDataAssignment_1 )* )
                    // InternalVformDSL.g:498:3: ( rule__EnumOption__NumberDataAssignment_1 )*
                    {
                     before(grammarAccess.getEnumOptionAccess().getNumberDataAssignment_1()); 
                    // InternalVformDSL.g:499:3: ( rule__EnumOption__NumberDataAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVformDSL.g:499:4: rule__EnumOption__NumberDataAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__EnumOption__NumberDataAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getEnumOptionAccess().getNumberDataAssignment_1()); 

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
    // $ANTLR end "rule__EnumOption__Alternatives"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalVformDSL.g:507:1: rule__Layout__Alternatives : ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:511:1: ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVformDSL.g:512:2: ( ( 'horizontal' ) )
                    {
                    // InternalVformDSL.g:512:2: ( ( 'horizontal' ) )
                    // InternalVformDSL.g:513:3: ( 'horizontal' )
                    {
                     before(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 
                    // InternalVformDSL.g:514:3: ( 'horizontal' )
                    // InternalVformDSL.g:514:4: 'horizontal'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:518:2: ( ( 'vertical' ) )
                    {
                    // InternalVformDSL.g:518:2: ( ( 'vertical' ) )
                    // InternalVformDSL.g:519:3: ( 'vertical' )
                    {
                     before(grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1()); 
                    // InternalVformDSL.g:520:3: ( 'vertical' )
                    // InternalVformDSL.g:520:4: 'vertical'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalVformDSL.g:528:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:532:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalVformDSL.g:533:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalVformDSL.g:540:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:544:1: ( ( ( rule__Model__Group_0__0 ) ) )
            // InternalVformDSL.g:545:1: ( ( rule__Model__Group_0__0 ) )
            {
            // InternalVformDSL.g:545:1: ( ( rule__Model__Group_0__0 ) )
            // InternalVformDSL.g:546:2: ( rule__Model__Group_0__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // InternalVformDSL.g:547:2: ( rule__Model__Group_0__0 )
            // InternalVformDSL.g:547:3: rule__Model__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

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
    // InternalVformDSL.g:555:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:559:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalVformDSL.g:560:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalVformDSL.g:567:1: rule__Model__Group__1__Impl : ( 'formInputs' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:571:1: ( ( 'formInputs' ) )
            // InternalVformDSL.g:572:1: ( 'formInputs' )
            {
            // InternalVformDSL.g:572:1: ( 'formInputs' )
            // InternalVformDSL.g:573:2: 'formInputs'
            {
             before(grammarAccess.getModelAccess().getFormInputsKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFormInputsKeyword_1()); 

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
    // InternalVformDSL.g:582:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:586:1: ( rule__Model__Group__2__Impl )
            // InternalVformDSL.g:587:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // InternalVformDSL.g:593:1: rule__Model__Group__2__Impl : ( ( rule__Model__FormInputAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:597:1: ( ( ( rule__Model__FormInputAssignment_2 ) ) )
            // InternalVformDSL.g:598:1: ( ( rule__Model__FormInputAssignment_2 ) )
            {
            // InternalVformDSL.g:598:1: ( ( rule__Model__FormInputAssignment_2 ) )
            // InternalVformDSL.g:599:2: ( rule__Model__FormInputAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getFormInputAssignment_2()); 
            // InternalVformDSL.g:600:2: ( rule__Model__FormInputAssignment_2 )
            // InternalVformDSL.g:600:3: rule__Model__FormInputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormInputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormInputAssignment_2()); 

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


    // $ANTLR start "rule__Model__Group_0__0"
    // InternalVformDSL.g:609:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:613:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalVformDSL.g:614:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1();

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
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // InternalVformDSL.g:621:1: rule__Model__Group_0__0__Impl : ( 'formLayout' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:625:1: ( ( 'formLayout' ) )
            // InternalVformDSL.g:626:1: ( 'formLayout' )
            {
            // InternalVformDSL.g:626:1: ( 'formLayout' )
            // InternalVformDSL.g:627:2: 'formLayout'
            {
             before(grammarAccess.getModelAccess().getFormLayoutKeyword_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFormLayoutKeyword_0_0()); 

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
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // InternalVformDSL.g:636:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:640:1: ( rule__Model__Group_0__1__Impl )
            // InternalVformDSL.g:641:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1__Impl();

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
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // InternalVformDSL.g:647:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__FormLayoutAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:651:1: ( ( ( rule__Model__FormLayoutAssignment_0_1 ) ) )
            // InternalVformDSL.g:652:1: ( ( rule__Model__FormLayoutAssignment_0_1 ) )
            {
            // InternalVformDSL.g:652:1: ( ( rule__Model__FormLayoutAssignment_0_1 ) )
            // InternalVformDSL.g:653:2: ( rule__Model__FormLayoutAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getFormLayoutAssignment_0_1()); 
            // InternalVformDSL.g:654:2: ( rule__Model__FormLayoutAssignment_0_1 )
            // InternalVformDSL.g:654:3: rule__Model__FormLayoutAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormLayoutAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormLayoutAssignment_0_1()); 

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
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalVformDSL.g:663:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:667:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalVformDSL.g:668:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalVformDSL.g:675:1: rule__Text__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:679:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:680:1: ( 'inputType' )
            {
            // InternalVformDSL.g:680:1: ( 'inputType' )
            // InternalVformDSL.g:681:2: 'inputType'
            {
             before(grammarAccess.getTextAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalVformDSL.g:690:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:694:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalVformDSL.g:695:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalVformDSL.g:702:1: rule__Text__Group__1__Impl : ( 'text' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:706:1: ( ( 'text' ) )
            // InternalVformDSL.g:707:1: ( 'text' )
            {
            // InternalVformDSL.g:707:1: ( 'text' )
            // InternalVformDSL.g:708:2: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalVformDSL.g:717:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:721:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalVformDSL.g:722:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

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
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalVformDSL.g:729:1: rule__Text__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:733:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:734:1: ( 'inputName' )
            {
            // InternalVformDSL.g:734:1: ( 'inputName' )
            // InternalVformDSL.g:735:2: 'inputName'
            {
             before(grammarAccess.getTextAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalVformDSL.g:744:1: rule__Text__Group__3 : rule__Text__Group__3__Impl ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:748:1: ( rule__Text__Group__3__Impl )
            // InternalVformDSL.g:749:2: rule__Text__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__3__Impl();

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
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalVformDSL.g:755:1: rule__Text__Group__3__Impl : ( ( rule__Text__InputNameAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:759:1: ( ( ( rule__Text__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:760:1: ( ( rule__Text__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:760:1: ( ( rule__Text__InputNameAssignment_3 ) )
            // InternalVformDSL.g:761:2: ( rule__Text__InputNameAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:762:2: ( rule__Text__InputNameAssignment_3 )
            // InternalVformDSL.g:762:3: rule__Text__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Text__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalVformDSL.g:771:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:775:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalVformDSL.g:776:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Checkbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__1();

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
    // $ANTLR end "rule__Checkbox__Group__0"


    // $ANTLR start "rule__Checkbox__Group__0__Impl"
    // InternalVformDSL.g:783:1: rule__Checkbox__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:787:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:788:1: ( 'inputType' )
            {
            // InternalVformDSL.g:788:1: ( 'inputType' )
            // InternalVformDSL.g:789:2: 'inputType'
            {
             before(grammarAccess.getCheckboxAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Checkbox__Group__0__Impl"


    // $ANTLR start "rule__Checkbox__Group__1"
    // InternalVformDSL.g:798:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:802:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalVformDSL.g:803:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Checkbox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__2();

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
    // $ANTLR end "rule__Checkbox__Group__1"


    // $ANTLR start "rule__Checkbox__Group__1__Impl"
    // InternalVformDSL.g:810:1: rule__Checkbox__Group__1__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:814:1: ( ( 'checkbox' ) )
            // InternalVformDSL.g:815:1: ( 'checkbox' )
            {
            // InternalVformDSL.g:815:1: ( 'checkbox' )
            // InternalVformDSL.g:816:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_1()); 

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
    // $ANTLR end "rule__Checkbox__Group__1__Impl"


    // $ANTLR start "rule__Checkbox__Group__2"
    // InternalVformDSL.g:825:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:829:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalVformDSL.g:830:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Checkbox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3();

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
    // $ANTLR end "rule__Checkbox__Group__2"


    // $ANTLR start "rule__Checkbox__Group__2__Impl"
    // InternalVformDSL.g:837:1: rule__Checkbox__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:841:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:842:1: ( 'inputName' )
            {
            // InternalVformDSL.g:842:1: ( 'inputName' )
            // InternalVformDSL.g:843:2: 'inputName'
            {
             before(grammarAccess.getCheckboxAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Checkbox__Group__2__Impl"


    // $ANTLR start "rule__Checkbox__Group__3"
    // InternalVformDSL.g:852:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:856:1: ( rule__Checkbox__Group__3__Impl )
            // InternalVformDSL.g:857:2: rule__Checkbox__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__3__Impl();

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
    // $ANTLR end "rule__Checkbox__Group__3"


    // $ANTLR start "rule__Checkbox__Group__3__Impl"
    // InternalVformDSL.g:863:1: rule__Checkbox__Group__3__Impl : ( ( rule__Checkbox__InputNameAssignment_3 ) ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:867:1: ( ( ( rule__Checkbox__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:868:1: ( ( rule__Checkbox__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:868:1: ( ( rule__Checkbox__InputNameAssignment_3 ) )
            // InternalVformDSL.g:869:2: ( rule__Checkbox__InputNameAssignment_3 )
            {
             before(grammarAccess.getCheckboxAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:870:2: ( rule__Checkbox__InputNameAssignment_3 )
            // InternalVformDSL.g:870:3: rule__Checkbox__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Checkbox__Group__3__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalVformDSL.g:879:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:883:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalVformDSL.g:884:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalVformDSL.g:891:1: rule__Number__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:895:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:896:1: ( 'inputType' )
            {
            // InternalVformDSL.g:896:1: ( 'inputType' )
            // InternalVformDSL.g:897:2: 'inputType'
            {
             before(grammarAccess.getNumberAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalVformDSL.g:906:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:910:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalVformDSL.g:911:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__2();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalVformDSL.g:918:1: rule__Number__Group__1__Impl : ( 'number' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:922:1: ( ( 'number' ) )
            // InternalVformDSL.g:923:1: ( 'number' )
            {
            // InternalVformDSL.g:923:1: ( 'number' )
            // InternalVformDSL.g:924:2: 'number'
            {
             before(grammarAccess.getNumberAccess().getNumberKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumberKeyword_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // InternalVformDSL.g:933:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:937:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalVformDSL.g:938:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__3();

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
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // InternalVformDSL.g:945:1: rule__Number__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:949:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:950:1: ( 'inputName' )
            {
            // InternalVformDSL.g:950:1: ( 'inputName' )
            // InternalVformDSL.g:951:2: 'inputName'
            {
             before(grammarAccess.getNumberAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // InternalVformDSL.g:960:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:964:1: ( rule__Number__Group__3__Impl )
            // InternalVformDSL.g:965:2: rule__Number__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__3__Impl();

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
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // InternalVformDSL.g:971:1: rule__Number__Group__3__Impl : ( ( rule__Number__InputNameAssignment_3 ) ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:975:1: ( ( ( rule__Number__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:976:1: ( ( rule__Number__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:976:1: ( ( rule__Number__InputNameAssignment_3 ) )
            // InternalVformDSL.g:977:2: ( rule__Number__InputNameAssignment_3 )
            {
             before(grammarAccess.getNumberAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:978:2: ( rule__Number__InputNameAssignment_3 )
            // InternalVformDSL.g:978:3: rule__Number__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Number__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Dat__Group__0"
    // InternalVformDSL.g:987:1: rule__Dat__Group__0 : rule__Dat__Group__0__Impl rule__Dat__Group__1 ;
    public final void rule__Dat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:991:1: ( rule__Dat__Group__0__Impl rule__Dat__Group__1 )
            // InternalVformDSL.g:992:2: rule__Dat__Group__0__Impl rule__Dat__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Dat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__1();

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
    // $ANTLR end "rule__Dat__Group__0"


    // $ANTLR start "rule__Dat__Group__0__Impl"
    // InternalVformDSL.g:999:1: rule__Dat__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Dat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1003:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:1004:1: ( 'inputType' )
            {
            // InternalVformDSL.g:1004:1: ( 'inputType' )
            // InternalVformDSL.g:1005:2: 'inputType'
            {
             before(grammarAccess.getDatAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Dat__Group__0__Impl"


    // $ANTLR start "rule__Dat__Group__1"
    // InternalVformDSL.g:1014:1: rule__Dat__Group__1 : rule__Dat__Group__1__Impl rule__Dat__Group__2 ;
    public final void rule__Dat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1018:1: ( rule__Dat__Group__1__Impl rule__Dat__Group__2 )
            // InternalVformDSL.g:1019:2: rule__Dat__Group__1__Impl rule__Dat__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Dat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__2();

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
    // $ANTLR end "rule__Dat__Group__1"


    // $ANTLR start "rule__Dat__Group__1__Impl"
    // InternalVformDSL.g:1026:1: rule__Dat__Group__1__Impl : ( 'date' ) ;
    public final void rule__Dat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1030:1: ( ( 'date' ) )
            // InternalVformDSL.g:1031:1: ( 'date' )
            {
            // InternalVformDSL.g:1031:1: ( 'date' )
            // InternalVformDSL.g:1032:2: 'date'
            {
             before(grammarAccess.getDatAccess().getDateKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getDateKeyword_1()); 

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
    // $ANTLR end "rule__Dat__Group__1__Impl"


    // $ANTLR start "rule__Dat__Group__2"
    // InternalVformDSL.g:1041:1: rule__Dat__Group__2 : rule__Dat__Group__2__Impl rule__Dat__Group__3 ;
    public final void rule__Dat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1045:1: ( rule__Dat__Group__2__Impl rule__Dat__Group__3 )
            // InternalVformDSL.g:1046:2: rule__Dat__Group__2__Impl rule__Dat__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Dat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__3();

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
    // $ANTLR end "rule__Dat__Group__2"


    // $ANTLR start "rule__Dat__Group__2__Impl"
    // InternalVformDSL.g:1053:1: rule__Dat__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Dat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1057:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:1058:1: ( 'inputName' )
            {
            // InternalVformDSL.g:1058:1: ( 'inputName' )
            // InternalVformDSL.g:1059:2: 'inputName'
            {
             before(grammarAccess.getDatAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Dat__Group__2__Impl"


    // $ANTLR start "rule__Dat__Group__3"
    // InternalVformDSL.g:1068:1: rule__Dat__Group__3 : rule__Dat__Group__3__Impl ;
    public final void rule__Dat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1072:1: ( rule__Dat__Group__3__Impl )
            // InternalVformDSL.g:1073:2: rule__Dat__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dat__Group__3__Impl();

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
    // $ANTLR end "rule__Dat__Group__3"


    // $ANTLR start "rule__Dat__Group__3__Impl"
    // InternalVformDSL.g:1079:1: rule__Dat__Group__3__Impl : ( ( rule__Dat__InputNameAssignment_3 ) ) ;
    public final void rule__Dat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1083:1: ( ( ( rule__Dat__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:1084:1: ( ( rule__Dat__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:1084:1: ( ( rule__Dat__InputNameAssignment_3 ) )
            // InternalVformDSL.g:1085:2: ( rule__Dat__InputNameAssignment_3 )
            {
             before(grammarAccess.getDatAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:1086:2: ( rule__Dat__InputNameAssignment_3 )
            // InternalVformDSL.g:1086:3: rule__Dat__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Dat__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Dat__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalVformDSL.g:1095:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1099:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalVformDSL.g:1100:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

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
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalVformDSL.g:1107:1: rule__Range__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1111:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:1112:1: ( 'inputType' )
            {
            // InternalVformDSL.g:1112:1: ( 'inputType' )
            // InternalVformDSL.g:1113:2: 'inputType'
            {
             before(grammarAccess.getRangeAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalVformDSL.g:1122:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1126:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalVformDSL.g:1127:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

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
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalVformDSL.g:1134:1: rule__Range__Group__1__Impl : ( 'range' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1138:1: ( ( 'range' ) )
            // InternalVformDSL.g:1139:1: ( 'range' )
            {
            // InternalVformDSL.g:1139:1: ( 'range' )
            // InternalVformDSL.g:1140:2: 'range'
            {
             before(grammarAccess.getRangeAccess().getRangeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRangeKeyword_1()); 

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
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalVformDSL.g:1149:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1153:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalVformDSL.g:1154:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__3();

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
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalVformDSL.g:1161:1: rule__Range__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1165:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:1166:1: ( 'inputName' )
            {
            // InternalVformDSL.g:1166:1: ( 'inputName' )
            // InternalVformDSL.g:1167:2: 'inputName'
            {
             before(grammarAccess.getRangeAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalVformDSL.g:1176:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1180:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalVformDSL.g:1181:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__4();

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
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalVformDSL.g:1188:1: rule__Range__Group__3__Impl : ( ( rule__Range__InputNameAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1192:1: ( ( ( rule__Range__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:1193:1: ( ( rule__Range__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:1193:1: ( ( rule__Range__InputNameAssignment_3 ) )
            // InternalVformDSL.g:1194:2: ( rule__Range__InputNameAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:1195:2: ( rule__Range__InputNameAssignment_3 )
            // InternalVformDSL.g:1195:3: rule__Range__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Range__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalVformDSL.g:1203:1: rule__Range__Group__4 : rule__Range__Group__4__Impl rule__Range__Group__5 ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1207:1: ( rule__Range__Group__4__Impl rule__Range__Group__5 )
            // InternalVformDSL.g:1208:2: rule__Range__Group__4__Impl rule__Range__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Range__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__5();

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
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalVformDSL.g:1215:1: rule__Range__Group__4__Impl : ( 'min' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1219:1: ( ( 'min' ) )
            // InternalVformDSL.g:1220:1: ( 'min' )
            {
            // InternalVformDSL.g:1220:1: ( 'min' )
            // InternalVformDSL.g:1221:2: 'min'
            {
             before(grammarAccess.getRangeAccess().getMinKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMinKeyword_4()); 

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
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Range__Group__5"
    // InternalVformDSL.g:1230:1: rule__Range__Group__5 : rule__Range__Group__5__Impl rule__Range__Group__6 ;
    public final void rule__Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1234:1: ( rule__Range__Group__5__Impl rule__Range__Group__6 )
            // InternalVformDSL.g:1235:2: rule__Range__Group__5__Impl rule__Range__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Range__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__6();

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
    // $ANTLR end "rule__Range__Group__5"


    // $ANTLR start "rule__Range__Group__5__Impl"
    // InternalVformDSL.g:1242:1: rule__Range__Group__5__Impl : ( ( rule__Range__MinAssignment_5 ) ) ;
    public final void rule__Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1246:1: ( ( ( rule__Range__MinAssignment_5 ) ) )
            // InternalVformDSL.g:1247:1: ( ( rule__Range__MinAssignment_5 ) )
            {
            // InternalVformDSL.g:1247:1: ( ( rule__Range__MinAssignment_5 ) )
            // InternalVformDSL.g:1248:2: ( rule__Range__MinAssignment_5 )
            {
             before(grammarAccess.getRangeAccess().getMinAssignment_5()); 
            // InternalVformDSL.g:1249:2: ( rule__Range__MinAssignment_5 )
            // InternalVformDSL.g:1249:3: rule__Range__MinAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Range__MinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMinAssignment_5()); 

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
    // $ANTLR end "rule__Range__Group__5__Impl"


    // $ANTLR start "rule__Range__Group__6"
    // InternalVformDSL.g:1257:1: rule__Range__Group__6 : rule__Range__Group__6__Impl rule__Range__Group__7 ;
    public final void rule__Range__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1261:1: ( rule__Range__Group__6__Impl rule__Range__Group__7 )
            // InternalVformDSL.g:1262:2: rule__Range__Group__6__Impl rule__Range__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Range__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__7();

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
    // $ANTLR end "rule__Range__Group__6"


    // $ANTLR start "rule__Range__Group__6__Impl"
    // InternalVformDSL.g:1269:1: rule__Range__Group__6__Impl : ( 'max' ) ;
    public final void rule__Range__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1273:1: ( ( 'max' ) )
            // InternalVformDSL.g:1274:1: ( 'max' )
            {
            // InternalVformDSL.g:1274:1: ( 'max' )
            // InternalVformDSL.g:1275:2: 'max'
            {
             before(grammarAccess.getRangeAccess().getMaxKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMaxKeyword_6()); 

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
    // $ANTLR end "rule__Range__Group__6__Impl"


    // $ANTLR start "rule__Range__Group__7"
    // InternalVformDSL.g:1284:1: rule__Range__Group__7 : rule__Range__Group__7__Impl ;
    public final void rule__Range__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1288:1: ( rule__Range__Group__7__Impl )
            // InternalVformDSL.g:1289:2: rule__Range__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__7__Impl();

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
    // $ANTLR end "rule__Range__Group__7"


    // $ANTLR start "rule__Range__Group__7__Impl"
    // InternalVformDSL.g:1295:1: rule__Range__Group__7__Impl : ( ( rule__Range__MaxAssignment_7 ) ) ;
    public final void rule__Range__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1299:1: ( ( ( rule__Range__MaxAssignment_7 ) ) )
            // InternalVformDSL.g:1300:1: ( ( rule__Range__MaxAssignment_7 ) )
            {
            // InternalVformDSL.g:1300:1: ( ( rule__Range__MaxAssignment_7 ) )
            // InternalVformDSL.g:1301:2: ( rule__Range__MaxAssignment_7 )
            {
             before(grammarAccess.getRangeAccess().getMaxAssignment_7()); 
            // InternalVformDSL.g:1302:2: ( rule__Range__MaxAssignment_7 )
            // InternalVformDSL.g:1302:3: rule__Range__MaxAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Range__MaxAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMaxAssignment_7()); 

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
    // $ANTLR end "rule__Range__Group__7__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalVformDSL.g:1311:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1315:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalVformDSL.g:1316:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalVformDSL.g:1323:1: rule__Select__Group__0__Impl : ( 'inputType' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1327:1: ( ( 'inputType' ) )
            // InternalVformDSL.g:1328:1: ( 'inputType' )
            {
            // InternalVformDSL.g:1328:1: ( 'inputType' )
            // InternalVformDSL.g:1329:2: 'inputType'
            {
             before(grammarAccess.getSelectAccess().getInputTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputTypeKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalVformDSL.g:1338:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1342:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalVformDSL.g:1343:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalVformDSL.g:1350:1: rule__Select__Group__1__Impl : ( 'select' ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1354:1: ( ( 'select' ) )
            // InternalVformDSL.g:1355:1: ( 'select' )
            {
            // InternalVformDSL.g:1355:1: ( 'select' )
            // InternalVformDSL.g:1356:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalVformDSL.g:1365:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1369:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalVformDSL.g:1370:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

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
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalVformDSL.g:1377:1: rule__Select__Group__2__Impl : ( 'inputName' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1381:1: ( ( 'inputName' ) )
            // InternalVformDSL.g:1382:1: ( 'inputName' )
            {
            // InternalVformDSL.g:1382:1: ( 'inputName' )
            // InternalVformDSL.g:1383:2: 'inputName'
            {
             before(grammarAccess.getSelectAccess().getInputNameKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputNameKeyword_2()); 

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
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalVformDSL.g:1392:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1396:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalVformDSL.g:1397:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__4();

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
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalVformDSL.g:1404:1: rule__Select__Group__3__Impl : ( ( rule__Select__InputNameAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1408:1: ( ( ( rule__Select__InputNameAssignment_3 ) ) )
            // InternalVformDSL.g:1409:1: ( ( rule__Select__InputNameAssignment_3 ) )
            {
            // InternalVformDSL.g:1409:1: ( ( rule__Select__InputNameAssignment_3 ) )
            // InternalVformDSL.g:1410:2: ( rule__Select__InputNameAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getInputNameAssignment_3()); 
            // InternalVformDSL.g:1411:2: ( rule__Select__InputNameAssignment_3 )
            // InternalVformDSL.g:1411:3: rule__Select__InputNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Select__InputNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getInputNameAssignment_3()); 

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
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // InternalVformDSL.g:1419:1: rule__Select__Group__4 : rule__Select__Group__4__Impl rule__Select__Group__5 ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1423:1: ( rule__Select__Group__4__Impl rule__Select__Group__5 )
            // InternalVformDSL.g:1424:2: rule__Select__Group__4__Impl rule__Select__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Select__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__5();

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
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // InternalVformDSL.g:1431:1: rule__Select__Group__4__Impl : ( 'options' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1435:1: ( ( 'options' ) )
            // InternalVformDSL.g:1436:1: ( 'options' )
            {
            // InternalVformDSL.g:1436:1: ( 'options' )
            // InternalVformDSL.g:1437:2: 'options'
            {
             before(grammarAccess.getSelectAccess().getOptionsKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getOptionsKeyword_4()); 

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
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Select__Group__5"
    // InternalVformDSL.g:1446:1: rule__Select__Group__5 : rule__Select__Group__5__Impl ;
    public final void rule__Select__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1450:1: ( rule__Select__Group__5__Impl )
            // InternalVformDSL.g:1451:2: rule__Select__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__5__Impl();

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
    // $ANTLR end "rule__Select__Group__5"


    // $ANTLR start "rule__Select__Group__5__Impl"
    // InternalVformDSL.g:1457:1: rule__Select__Group__5__Impl : ( ( rule__Select__Alternatives_5 ) ) ;
    public final void rule__Select__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1461:1: ( ( ( rule__Select__Alternatives_5 ) ) )
            // InternalVformDSL.g:1462:1: ( ( rule__Select__Alternatives_5 ) )
            {
            // InternalVformDSL.g:1462:1: ( ( rule__Select__Alternatives_5 ) )
            // InternalVformDSL.g:1463:2: ( rule__Select__Alternatives_5 )
            {
             before(grammarAccess.getSelectAccess().getAlternatives_5()); 
            // InternalVformDSL.g:1464:2: ( rule__Select__Alternatives_5 )
            // InternalVformDSL.g:1464:3: rule__Select__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Select__Group__5__Impl"


    // $ANTLR start "rule__DataOption__Group__0"
    // InternalVformDSL.g:1473:1: rule__DataOption__Group__0 : rule__DataOption__Group__0__Impl rule__DataOption__Group__1 ;
    public final void rule__DataOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1477:1: ( rule__DataOption__Group__0__Impl rule__DataOption__Group__1 )
            // InternalVformDSL.g:1478:2: rule__DataOption__Group__0__Impl rule__DataOption__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalVformDSL.g:1485:1: rule__DataOption__Group__0__Impl : ( 'optionType' ) ;
    public final void rule__DataOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1489:1: ( ( 'optionType' ) )
            // InternalVformDSL.g:1490:1: ( 'optionType' )
            {
            // InternalVformDSL.g:1490:1: ( 'optionType' )
            // InternalVformDSL.g:1491:2: 'optionType'
            {
             before(grammarAccess.getDataOptionAccess().getOptionTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVformDSL.g:1500:1: rule__DataOption__Group__1 : rule__DataOption__Group__1__Impl rule__DataOption__Group__2 ;
    public final void rule__DataOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1504:1: ( rule__DataOption__Group__1__Impl rule__DataOption__Group__2 )
            // InternalVformDSL.g:1505:2: rule__DataOption__Group__1__Impl rule__DataOption__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalVformDSL.g:1512:1: rule__DataOption__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1516:1: ( ( 'data' ) )
            // InternalVformDSL.g:1517:1: ( 'data' )
            {
            // InternalVformDSL.g:1517:1: ( 'data' )
            // InternalVformDSL.g:1518:2: 'data'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVformDSL.g:1527:1: rule__DataOption__Group__2 : rule__DataOption__Group__2__Impl rule__DataOption__Group__3 ;
    public final void rule__DataOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1531:1: ( rule__DataOption__Group__2__Impl rule__DataOption__Group__3 )
            // InternalVformDSL.g:1532:2: rule__DataOption__Group__2__Impl rule__DataOption__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalVformDSL.g:1539:1: rule__DataOption__Group__2__Impl : ( 'data' ) ;
    public final void rule__DataOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1543:1: ( ( 'data' ) )
            // InternalVformDSL.g:1544:1: ( 'data' )
            {
            // InternalVformDSL.g:1544:1: ( 'data' )
            // InternalVformDSL.g:1545:2: 'data'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getDataKeyword_2()); 

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
    // InternalVformDSL.g:1554:1: rule__DataOption__Group__3 : rule__DataOption__Group__3__Impl ;
    public final void rule__DataOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1558:1: ( rule__DataOption__Group__3__Impl )
            // InternalVformDSL.g:1559:2: rule__DataOption__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__3__Impl();

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
    // InternalVformDSL.g:1565:1: rule__DataOption__Group__3__Impl : ( ( rule__DataOption__DataAssignment_3 )* ) ;
    public final void rule__DataOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1569:1: ( ( ( rule__DataOption__DataAssignment_3 )* ) )
            // InternalVformDSL.g:1570:1: ( ( rule__DataOption__DataAssignment_3 )* )
            {
            // InternalVformDSL.g:1570:1: ( ( rule__DataOption__DataAssignment_3 )* )
            // InternalVformDSL.g:1571:2: ( rule__DataOption__DataAssignment_3 )*
            {
             before(grammarAccess.getDataOptionAccess().getDataAssignment_3()); 
            // InternalVformDSL.g:1572:2: ( rule__DataOption__DataAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVformDSL.g:1572:3: rule__DataOption__DataAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataOption__DataAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataOptionAccess().getDataAssignment_3()); 

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


    // $ANTLR start "rule__Data__Group_0__0"
    // InternalVformDSL.g:1581:1: rule__Data__Group_0__0 : rule__Data__Group_0__0__Impl rule__Data__Group_0__1 ;
    public final void rule__Data__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1585:1: ( rule__Data__Group_0__0__Impl rule__Data__Group_0__1 )
            // InternalVformDSL.g:1586:2: rule__Data__Group_0__0__Impl rule__Data__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Data__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0__1();

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
    // $ANTLR end "rule__Data__Group_0__0"


    // $ANTLR start "rule__Data__Group_0__0__Impl"
    // InternalVformDSL.g:1593:1: rule__Data__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__Data__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1597:1: ( ( 'label' ) )
            // InternalVformDSL.g:1598:1: ( 'label' )
            {
            // InternalVformDSL.g:1598:1: ( 'label' )
            // InternalVformDSL.g:1599:2: 'label'
            {
             before(grammarAccess.getDataAccess().getLabelKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLabelKeyword_0_0()); 

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
    // $ANTLR end "rule__Data__Group_0__0__Impl"


    // $ANTLR start "rule__Data__Group_0__1"
    // InternalVformDSL.g:1608:1: rule__Data__Group_0__1 : rule__Data__Group_0__1__Impl rule__Data__Group_0__2 ;
    public final void rule__Data__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1612:1: ( rule__Data__Group_0__1__Impl rule__Data__Group_0__2 )
            // InternalVformDSL.g:1613:2: rule__Data__Group_0__1__Impl rule__Data__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Data__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0__2();

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
    // $ANTLR end "rule__Data__Group_0__1"


    // $ANTLR start "rule__Data__Group_0__1__Impl"
    // InternalVformDSL.g:1620:1: rule__Data__Group_0__1__Impl : ( ( rule__Data__LabelAssignment_0_1 ) ) ;
    public final void rule__Data__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1624:1: ( ( ( rule__Data__LabelAssignment_0_1 ) ) )
            // InternalVformDSL.g:1625:1: ( ( rule__Data__LabelAssignment_0_1 ) )
            {
            // InternalVformDSL.g:1625:1: ( ( rule__Data__LabelAssignment_0_1 ) )
            // InternalVformDSL.g:1626:2: ( rule__Data__LabelAssignment_0_1 )
            {
             before(grammarAccess.getDataAccess().getLabelAssignment_0_1()); 
            // InternalVformDSL.g:1627:2: ( rule__Data__LabelAssignment_0_1 )
            // InternalVformDSL.g:1627:3: rule__Data__LabelAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__LabelAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getLabelAssignment_0_1()); 

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
    // $ANTLR end "rule__Data__Group_0__1__Impl"


    // $ANTLR start "rule__Data__Group_0__2"
    // InternalVformDSL.g:1635:1: rule__Data__Group_0__2 : rule__Data__Group_0__2__Impl rule__Data__Group_0__3 ;
    public final void rule__Data__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1639:1: ( rule__Data__Group_0__2__Impl rule__Data__Group_0__3 )
            // InternalVformDSL.g:1640:2: rule__Data__Group_0__2__Impl rule__Data__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Data__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0__3();

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
    // $ANTLR end "rule__Data__Group_0__2"


    // $ANTLR start "rule__Data__Group_0__2__Impl"
    // InternalVformDSL.g:1647:1: rule__Data__Group_0__2__Impl : ( 'value' ) ;
    public final void rule__Data__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1651:1: ( ( 'value' ) )
            // InternalVformDSL.g:1652:1: ( 'value' )
            {
            // InternalVformDSL.g:1652:1: ( 'value' )
            // InternalVformDSL.g:1653:2: 'value'
            {
             before(grammarAccess.getDataAccess().getValueKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getValueKeyword_0_2()); 

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
    // $ANTLR end "rule__Data__Group_0__2__Impl"


    // $ANTLR start "rule__Data__Group_0__3"
    // InternalVformDSL.g:1662:1: rule__Data__Group_0__3 : rule__Data__Group_0__3__Impl ;
    public final void rule__Data__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1666:1: ( rule__Data__Group_0__3__Impl )
            // InternalVformDSL.g:1667:2: rule__Data__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_0__3__Impl();

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
    // $ANTLR end "rule__Data__Group_0__3"


    // $ANTLR start "rule__Data__Group_0__3__Impl"
    // InternalVformDSL.g:1673:1: rule__Data__Group_0__3__Impl : ( ( rule__Data__StrValAssignment_0_3 ) ) ;
    public final void rule__Data__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1677:1: ( ( ( rule__Data__StrValAssignment_0_3 ) ) )
            // InternalVformDSL.g:1678:1: ( ( rule__Data__StrValAssignment_0_3 ) )
            {
            // InternalVformDSL.g:1678:1: ( ( rule__Data__StrValAssignment_0_3 ) )
            // InternalVformDSL.g:1679:2: ( rule__Data__StrValAssignment_0_3 )
            {
             before(grammarAccess.getDataAccess().getStrValAssignment_0_3()); 
            // InternalVformDSL.g:1680:2: ( rule__Data__StrValAssignment_0_3 )
            // InternalVformDSL.g:1680:3: rule__Data__StrValAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Data__StrValAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getStrValAssignment_0_3()); 

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
    // $ANTLR end "rule__Data__Group_0__3__Impl"


    // $ANTLR start "rule__NumberOption__Group__0"
    // InternalVformDSL.g:1689:1: rule__NumberOption__Group__0 : rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 ;
    public final void rule__NumberOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1693:1: ( rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 )
            // InternalVformDSL.g:1694:2: rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalVformDSL.g:1701:1: rule__NumberOption__Group__0__Impl : ( 'optionType' ) ;
    public final void rule__NumberOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1705:1: ( ( 'optionType' ) )
            // InternalVformDSL.g:1706:1: ( 'optionType' )
            {
            // InternalVformDSL.g:1706:1: ( 'optionType' )
            // InternalVformDSL.g:1707:2: 'optionType'
            {
             before(grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVformDSL.g:1716:1: rule__NumberOption__Group__1 : rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 ;
    public final void rule__NumberOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1720:1: ( rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 )
            // InternalVformDSL.g:1721:2: rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalVformDSL.g:1728:1: rule__NumberOption__Group__1__Impl : ( 'number' ) ;
    public final void rule__NumberOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1732:1: ( ( 'number' ) )
            // InternalVformDSL.g:1733:1: ( 'number' )
            {
            // InternalVformDSL.g:1733:1: ( 'number' )
            // InternalVformDSL.g:1734:2: 'number'
            {
             before(grammarAccess.getNumberOptionAccess().getNumberKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalVformDSL.g:1743:1: rule__NumberOption__Group__2 : rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 ;
    public final void rule__NumberOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1747:1: ( rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 )
            // InternalVformDSL.g:1748:2: rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalVformDSL.g:1755:1: rule__NumberOption__Group__2__Impl : ( 'min' ) ;
    public final void rule__NumberOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1759:1: ( ( 'min' ) )
            // InternalVformDSL.g:1760:1: ( 'min' )
            {
            // InternalVformDSL.g:1760:1: ( 'min' )
            // InternalVformDSL.g:1761:2: 'min'
            {
             before(grammarAccess.getNumberOptionAccess().getMinKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinKeyword_2()); 

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
    // InternalVformDSL.g:1770:1: rule__NumberOption__Group__3 : rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 ;
    public final void rule__NumberOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1774:1: ( rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 )
            // InternalVformDSL.g:1775:2: rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalVformDSL.g:1782:1: rule__NumberOption__Group__3__Impl : ( ( rule__NumberOption__MinAssignment_3 ) ) ;
    public final void rule__NumberOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1786:1: ( ( ( rule__NumberOption__MinAssignment_3 ) ) )
            // InternalVformDSL.g:1787:1: ( ( rule__NumberOption__MinAssignment_3 ) )
            {
            // InternalVformDSL.g:1787:1: ( ( rule__NumberOption__MinAssignment_3 ) )
            // InternalVformDSL.g:1788:2: ( rule__NumberOption__MinAssignment_3 )
            {
             before(grammarAccess.getNumberOptionAccess().getMinAssignment_3()); 
            // InternalVformDSL.g:1789:2: ( rule__NumberOption__MinAssignment_3 )
            // InternalVformDSL.g:1789:3: rule__NumberOption__MinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMinAssignment_3()); 

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
    // InternalVformDSL.g:1797:1: rule__NumberOption__Group__4 : rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 ;
    public final void rule__NumberOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1801:1: ( rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 )
            // InternalVformDSL.g:1802:2: rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalVformDSL.g:1809:1: rule__NumberOption__Group__4__Impl : ( 'max' ) ;
    public final void rule__NumberOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1813:1: ( ( 'max' ) )
            // InternalVformDSL.g:1814:1: ( 'max' )
            {
            // InternalVformDSL.g:1814:1: ( 'max' )
            // InternalVformDSL.g:1815:2: 'max'
            {
             before(grammarAccess.getNumberOptionAccess().getMaxKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxKeyword_4()); 

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
    // InternalVformDSL.g:1824:1: rule__NumberOption__Group__5 : rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 ;
    public final void rule__NumberOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1828:1: ( rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 )
            // InternalVformDSL.g:1829:2: rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalVformDSL.g:1836:1: rule__NumberOption__Group__5__Impl : ( ( rule__NumberOption__MaxAssignment_5 ) ) ;
    public final void rule__NumberOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1840:1: ( ( ( rule__NumberOption__MaxAssignment_5 ) ) )
            // InternalVformDSL.g:1841:1: ( ( rule__NumberOption__MaxAssignment_5 ) )
            {
            // InternalVformDSL.g:1841:1: ( ( rule__NumberOption__MaxAssignment_5 ) )
            // InternalVformDSL.g:1842:2: ( rule__NumberOption__MaxAssignment_5 )
            {
             before(grammarAccess.getNumberOptionAccess().getMaxAssignment_5()); 
            // InternalVformDSL.g:1843:2: ( rule__NumberOption__MaxAssignment_5 )
            // InternalVformDSL.g:1843:3: rule__NumberOption__MaxAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MaxAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMaxAssignment_5()); 

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
    // InternalVformDSL.g:1851:1: rule__NumberOption__Group__6 : rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 ;
    public final void rule__NumberOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1855:1: ( rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 )
            // InternalVformDSL.g:1856:2: rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalVformDSL.g:1863:1: rule__NumberOption__Group__6__Impl : ( 'range' ) ;
    public final void rule__NumberOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1867:1: ( ( 'range' ) )
            // InternalVformDSL.g:1868:1: ( 'range' )
            {
            // InternalVformDSL.g:1868:1: ( 'range' )
            // InternalVformDSL.g:1869:2: 'range'
            {
             before(grammarAccess.getNumberOptionAccess().getRangeKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeKeyword_6()); 

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
    // InternalVformDSL.g:1878:1: rule__NumberOption__Group__7 : rule__NumberOption__Group__7__Impl ;
    public final void rule__NumberOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1882:1: ( rule__NumberOption__Group__7__Impl )
            // InternalVformDSL.g:1883:2: rule__NumberOption__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__7__Impl();

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
    // InternalVformDSL.g:1889:1: rule__NumberOption__Group__7__Impl : ( ( rule__NumberOption__RangeAssignment_7 ) ) ;
    public final void rule__NumberOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1893:1: ( ( ( rule__NumberOption__RangeAssignment_7 ) ) )
            // InternalVformDSL.g:1894:1: ( ( rule__NumberOption__RangeAssignment_7 ) )
            {
            // InternalVformDSL.g:1894:1: ( ( rule__NumberOption__RangeAssignment_7 ) )
            // InternalVformDSL.g:1895:2: ( rule__NumberOption__RangeAssignment_7 )
            {
             before(grammarAccess.getNumberOptionAccess().getRangeAssignment_7()); 
            // InternalVformDSL.g:1896:2: ( rule__NumberOption__RangeAssignment_7 )
            // InternalVformDSL.g:1896:3: rule__NumberOption__RangeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__RangeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getRangeAssignment_7()); 

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


    // $ANTLR start "rule__EnumOption__Group_0__0"
    // InternalVformDSL.g:1905:1: rule__EnumOption__Group_0__0 : rule__EnumOption__Group_0__0__Impl rule__EnumOption__Group_0__1 ;
    public final void rule__EnumOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1909:1: ( rule__EnumOption__Group_0__0__Impl rule__EnumOption__Group_0__1 )
            // InternalVformDSL.g:1910:2: rule__EnumOption__Group_0__0__Impl rule__EnumOption__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__EnumOption__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_0__1();

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
    // $ANTLR end "rule__EnumOption__Group_0__0"


    // $ANTLR start "rule__EnumOption__Group_0__0__Impl"
    // InternalVformDSL.g:1917:1: rule__EnumOption__Group_0__0__Impl : ( 'optionType' ) ;
    public final void rule__EnumOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1921:1: ( ( 'optionType' ) )
            // InternalVformDSL.g:1922:1: ( 'optionType' )
            {
            // InternalVformDSL.g:1922:1: ( 'optionType' )
            // InternalVformDSL.g:1923:2: 'optionType'
            {
             before(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0_0()); 

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
    // $ANTLR end "rule__EnumOption__Group_0__0__Impl"


    // $ANTLR start "rule__EnumOption__Group_0__1"
    // InternalVformDSL.g:1932:1: rule__EnumOption__Group_0__1 : rule__EnumOption__Group_0__1__Impl rule__EnumOption__Group_0__2 ;
    public final void rule__EnumOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1936:1: ( rule__EnumOption__Group_0__1__Impl rule__EnumOption__Group_0__2 )
            // InternalVformDSL.g:1937:2: rule__EnumOption__Group_0__1__Impl rule__EnumOption__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__EnumOption__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_0__2();

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
    // $ANTLR end "rule__EnumOption__Group_0__1"


    // $ANTLR start "rule__EnumOption__Group_0__1__Impl"
    // InternalVformDSL.g:1944:1: rule__EnumOption__Group_0__1__Impl : ( 'enum' ) ;
    public final void rule__EnumOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1948:1: ( ( 'enum' ) )
            // InternalVformDSL.g:1949:1: ( 'enum' )
            {
            // InternalVformDSL.g:1949:1: ( 'enum' )
            // InternalVformDSL.g:1950:2: 'enum'
            {
             before(grammarAccess.getEnumOptionAccess().getEnumKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getEnumKeyword_0_1()); 

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
    // $ANTLR end "rule__EnumOption__Group_0__1__Impl"


    // $ANTLR start "rule__EnumOption__Group_0__2"
    // InternalVformDSL.g:1959:1: rule__EnumOption__Group_0__2 : rule__EnumOption__Group_0__2__Impl rule__EnumOption__Group_0__3 ;
    public final void rule__EnumOption__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1963:1: ( rule__EnumOption__Group_0__2__Impl rule__EnumOption__Group_0__3 )
            // InternalVformDSL.g:1964:2: rule__EnumOption__Group_0__2__Impl rule__EnumOption__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__EnumOption__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_0__3();

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
    // $ANTLR end "rule__EnumOption__Group_0__2"


    // $ANTLR start "rule__EnumOption__Group_0__2__Impl"
    // InternalVformDSL.g:1971:1: rule__EnumOption__Group_0__2__Impl : ( 'data' ) ;
    public final void rule__EnumOption__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1975:1: ( ( 'data' ) )
            // InternalVformDSL.g:1976:1: ( 'data' )
            {
            // InternalVformDSL.g:1976:1: ( 'data' )
            // InternalVformDSL.g:1977:2: 'data'
            {
             before(grammarAccess.getEnumOptionAccess().getDataKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getDataKeyword_0_2()); 

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
    // $ANTLR end "rule__EnumOption__Group_0__2__Impl"


    // $ANTLR start "rule__EnumOption__Group_0__3"
    // InternalVformDSL.g:1986:1: rule__EnumOption__Group_0__3 : rule__EnumOption__Group_0__3__Impl ;
    public final void rule__EnumOption__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1990:1: ( rule__EnumOption__Group_0__3__Impl )
            // InternalVformDSL.g:1991:2: rule__EnumOption__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Group_0__3__Impl();

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
    // $ANTLR end "rule__EnumOption__Group_0__3"


    // $ANTLR start "rule__EnumOption__Group_0__3__Impl"
    // InternalVformDSL.g:1997:1: rule__EnumOption__Group_0__3__Impl : ( ( rule__EnumOption__StringDataAssignment_0_3 )* ) ;
    public final void rule__EnumOption__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2001:1: ( ( ( rule__EnumOption__StringDataAssignment_0_3 )* ) )
            // InternalVformDSL.g:2002:1: ( ( rule__EnumOption__StringDataAssignment_0_3 )* )
            {
            // InternalVformDSL.g:2002:1: ( ( rule__EnumOption__StringDataAssignment_0_3 )* )
            // InternalVformDSL.g:2003:2: ( rule__EnumOption__StringDataAssignment_0_3 )*
            {
             before(grammarAccess.getEnumOptionAccess().getStringDataAssignment_0_3()); 
            // InternalVformDSL.g:2004:2: ( rule__EnumOption__StringDataAssignment_0_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVformDSL.g:2004:3: rule__EnumOption__StringDataAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EnumOption__StringDataAssignment_0_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumOptionAccess().getStringDataAssignment_0_3()); 

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
    // $ANTLR end "rule__EnumOption__Group_0__3__Impl"


    // $ANTLR start "rule__Model__FormLayoutAssignment_0_1"
    // InternalVformDSL.g:2013:1: rule__Model__FormLayoutAssignment_0_1 : ( ruleFormLayout ) ;
    public final void rule__Model__FormLayoutAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2017:1: ( ( ruleFormLayout ) )
            // InternalVformDSL.g:2018:2: ( ruleFormLayout )
            {
            // InternalVformDSL.g:2018:2: ( ruleFormLayout )
            // InternalVformDSL.g:2019:3: ruleFormLayout
            {
             before(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormLayout();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Model__FormLayoutAssignment_0_1"


    // $ANTLR start "rule__Model__FormInputAssignment_2"
    // InternalVformDSL.g:2028:1: rule__Model__FormInputAssignment_2 : ( ruleFormInput ) ;
    public final void rule__Model__FormInputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2032:1: ( ( ruleFormInput ) )
            // InternalVformDSL.g:2033:2: ( ruleFormInput )
            {
            // InternalVformDSL.g:2033:2: ( ruleFormInput )
            // InternalVformDSL.g:2034:3: ruleFormInput
            {
             before(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormInput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__FormInputAssignment_2"


    // $ANTLR start "rule__FormInput__TextAssignment_0"
    // InternalVformDSL.g:2043:1: rule__FormInput__TextAssignment_0 : ( ruleText ) ;
    public final void rule__FormInput__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2047:1: ( ( ruleText ) )
            // InternalVformDSL.g:2048:2: ( ruleText )
            {
            // InternalVformDSL.g:2048:2: ( ruleText )
            // InternalVformDSL.g:2049:3: ruleText
            {
             before(grammarAccess.getFormInputAccess().getTextTextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getTextTextParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormInput__TextAssignment_0"


    // $ANTLR start "rule__FormInput__CheckboxAssignment_1"
    // InternalVformDSL.g:2058:1: rule__FormInput__CheckboxAssignment_1 : ( ruleCheckbox ) ;
    public final void rule__FormInput__CheckboxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2062:1: ( ( ruleCheckbox ) )
            // InternalVformDSL.g:2063:2: ( ruleCheckbox )
            {
            // InternalVformDSL.g:2063:2: ( ruleCheckbox )
            // InternalVformDSL.g:2064:3: ruleCheckbox
            {
             before(grammarAccess.getFormInputAccess().getCheckboxCheckboxParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckbox();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getCheckboxCheckboxParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FormInput__CheckboxAssignment_1"


    // $ANTLR start "rule__FormInput__NumberAssignment_2"
    // InternalVformDSL.g:2073:1: rule__FormInput__NumberAssignment_2 : ( ruleNumber ) ;
    public final void rule__FormInput__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2077:1: ( ( ruleNumber ) )
            // InternalVformDSL.g:2078:2: ( ruleNumber )
            {
            // InternalVformDSL.g:2078:2: ( ruleNumber )
            // InternalVformDSL.g:2079:3: ruleNumber
            {
             before(grammarAccess.getFormInputAccess().getNumberNumberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getNumberNumberParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FormInput__NumberAssignment_2"


    // $ANTLR start "rule__FormInput__DatAssignment_3"
    // InternalVformDSL.g:2088:1: rule__FormInput__DatAssignment_3 : ( ruleDat ) ;
    public final void rule__FormInput__DatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2092:1: ( ( ruleDat ) )
            // InternalVformDSL.g:2093:2: ( ruleDat )
            {
            // InternalVformDSL.g:2093:2: ( ruleDat )
            // InternalVformDSL.g:2094:3: ruleDat
            {
             before(grammarAccess.getFormInputAccess().getDatDatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDat();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getDatDatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FormInput__DatAssignment_3"


    // $ANTLR start "rule__FormInput__RangeAssignment_4"
    // InternalVformDSL.g:2103:1: rule__FormInput__RangeAssignment_4 : ( ruleRange ) ;
    public final void rule__FormInput__RangeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2107:1: ( ( ruleRange ) )
            // InternalVformDSL.g:2108:2: ( ruleRange )
            {
            // InternalVformDSL.g:2108:2: ( ruleRange )
            // InternalVformDSL.g:2109:3: ruleRange
            {
             before(grammarAccess.getFormInputAccess().getRangeRangeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getRangeRangeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FormInput__RangeAssignment_4"


    // $ANTLR start "rule__FormInput__SelectAssignment_5"
    // InternalVformDSL.g:2118:1: rule__FormInput__SelectAssignment_5 : ( ruleSelect ) ;
    public final void rule__FormInput__SelectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2122:1: ( ( ruleSelect ) )
            // InternalVformDSL.g:2123:2: ( ruleSelect )
            {
            // InternalVformDSL.g:2123:2: ( ruleSelect )
            // InternalVformDSL.g:2124:3: ruleSelect
            {
             before(grammarAccess.getFormInputAccess().getSelectSelectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getSelectSelectParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FormInput__SelectAssignment_5"


    // $ANTLR start "rule__FormLayout__LayoutAssignment"
    // InternalVformDSL.g:2133:1: rule__FormLayout__LayoutAssignment : ( ruleLayout ) ;
    public final void rule__FormLayout__LayoutAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2137:1: ( ( ruleLayout ) )
            // InternalVformDSL.g:2138:2: ( ruleLayout )
            {
            // InternalVformDSL.g:2138:2: ( ruleLayout )
            // InternalVformDSL.g:2139:3: ruleLayout
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


    // $ANTLR start "rule__Text__InputNameAssignment_3"
    // InternalVformDSL.g:2148:1: rule__Text__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Text__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2152:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2153:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2153:2: ( RULE_STRING )
            // InternalVformDSL.g:2154:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Text__InputNameAssignment_3"


    // $ANTLR start "rule__Checkbox__InputNameAssignment_3"
    // InternalVformDSL.g:2163:1: rule__Checkbox__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Checkbox__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2167:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2168:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2168:2: ( RULE_STRING )
            // InternalVformDSL.g:2169:3: RULE_STRING
            {
             before(grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Checkbox__InputNameAssignment_3"


    // $ANTLR start "rule__Number__InputNameAssignment_3"
    // InternalVformDSL.g:2178:1: rule__Number__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Number__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2182:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2183:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2183:2: ( RULE_STRING )
            // InternalVformDSL.g:2184:3: RULE_STRING
            {
             before(grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Number__InputNameAssignment_3"


    // $ANTLR start "rule__Dat__InputNameAssignment_3"
    // InternalVformDSL.g:2193:1: rule__Dat__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Dat__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2197:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2198:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2198:2: ( RULE_STRING )
            // InternalVformDSL.g:2199:3: RULE_STRING
            {
             before(grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dat__InputNameAssignment_3"


    // $ANTLR start "rule__Range__InputNameAssignment_3"
    // InternalVformDSL.g:2208:1: rule__Range__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Range__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2212:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2213:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2213:2: ( RULE_STRING )
            // InternalVformDSL.g:2214:3: RULE_STRING
            {
             before(grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Range__InputNameAssignment_3"


    // $ANTLR start "rule__Range__MinAssignment_5"
    // InternalVformDSL.g:2223:1: rule__Range__MinAssignment_5 : ( RULE_INT ) ;
    public final void rule__Range__MinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2227:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2228:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2228:2: ( RULE_INT )
            // InternalVformDSL.g:2229:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Range__MinAssignment_5"


    // $ANTLR start "rule__Range__MaxAssignment_7"
    // InternalVformDSL.g:2238:1: rule__Range__MaxAssignment_7 : ( RULE_INT ) ;
    public final void rule__Range__MaxAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2242:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2243:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2243:2: ( RULE_INT )
            // InternalVformDSL.g:2244:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Range__MaxAssignment_7"


    // $ANTLR start "rule__Select__InputNameAssignment_3"
    // InternalVformDSL.g:2253:1: rule__Select__InputNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__InputNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2257:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2258:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2258:2: ( RULE_STRING )
            // InternalVformDSL.g:2259:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Select__InputNameAssignment_3"


    // $ANTLR start "rule__Select__DataOptionAssignment_5_0"
    // InternalVformDSL.g:2268:1: rule__Select__DataOptionAssignment_5_0 : ( ruleDataOption ) ;
    public final void rule__Select__DataOptionAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2272:1: ( ( ruleDataOption ) )
            // InternalVformDSL.g:2273:2: ( ruleDataOption )
            {
            // InternalVformDSL.g:2273:2: ( ruleDataOption )
            // InternalVformDSL.g:2274:3: ruleDataOption
            {
             before(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Select__DataOptionAssignment_5_0"


    // $ANTLR start "rule__Select__NumberOptionAssignment_5_1"
    // InternalVformDSL.g:2283:1: rule__Select__NumberOptionAssignment_5_1 : ( ruleNumberOption ) ;
    public final void rule__Select__NumberOptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2287:1: ( ( ruleNumberOption ) )
            // InternalVformDSL.g:2288:2: ( ruleNumberOption )
            {
            // InternalVformDSL.g:2288:2: ( ruleNumberOption )
            // InternalVformDSL.g:2289:3: ruleNumberOption
            {
             before(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Select__NumberOptionAssignment_5_1"


    // $ANTLR start "rule__Select__EnumOptionAssignment_5_2"
    // InternalVformDSL.g:2298:1: rule__Select__EnumOptionAssignment_5_2 : ( ruleEnumOption ) ;
    public final void rule__Select__EnumOptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2302:1: ( ( ruleEnumOption ) )
            // InternalVformDSL.g:2303:2: ( ruleEnumOption )
            {
            // InternalVformDSL.g:2303:2: ( ruleEnumOption )
            // InternalVformDSL.g:2304:3: ruleEnumOption
            {
             before(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Select__EnumOptionAssignment_5_2"


    // $ANTLR start "rule__DataOption__DataAssignment_3"
    // InternalVformDSL.g:2313:1: rule__DataOption__DataAssignment_3 : ( ruleData ) ;
    public final void rule__DataOption__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2317:1: ( ( ruleData ) )
            // InternalVformDSL.g:2318:2: ( ruleData )
            {
            // InternalVformDSL.g:2318:2: ( ruleData )
            // InternalVformDSL.g:2319:3: ruleData
            {
             before(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataOption__DataAssignment_3"


    // $ANTLR start "rule__Data__LabelAssignment_0_1"
    // InternalVformDSL.g:2328:1: rule__Data__LabelAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Data__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2332:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2333:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2333:2: ( RULE_STRING )
            // InternalVformDSL.g:2334:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Data__LabelAssignment_0_1"


    // $ANTLR start "rule__Data__StrValAssignment_0_3"
    // InternalVformDSL.g:2343:1: rule__Data__StrValAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Data__StrValAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2347:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2348:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2348:2: ( RULE_STRING )
            // InternalVformDSL.g:2349:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Data__StrValAssignment_0_3"


    // $ANTLR start "rule__Data__IntValAssignment_1"
    // InternalVformDSL.g:2358:1: rule__Data__IntValAssignment_1 : ( RULE_INT ) ;
    public final void rule__Data__IntValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2362:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2363:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2363:2: ( RULE_INT )
            // InternalVformDSL.g:2364:3: RULE_INT
            {
             before(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Data__IntValAssignment_1"


    // $ANTLR start "rule__NumberOption__MinAssignment_3"
    // InternalVformDSL.g:2373:1: rule__NumberOption__MinAssignment_3 : ( RULE_INT ) ;
    public final void rule__NumberOption__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2377:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2378:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2378:2: ( RULE_INT )
            // InternalVformDSL.g:2379:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__NumberOption__MinAssignment_3"


    // $ANTLR start "rule__NumberOption__MaxAssignment_5"
    // InternalVformDSL.g:2388:1: rule__NumberOption__MaxAssignment_5 : ( RULE_INT ) ;
    public final void rule__NumberOption__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2392:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2393:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2393:2: ( RULE_INT )
            // InternalVformDSL.g:2394:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__NumberOption__MaxAssignment_5"


    // $ANTLR start "rule__NumberOption__RangeAssignment_7"
    // InternalVformDSL.g:2403:1: rule__NumberOption__RangeAssignment_7 : ( RULE_INT ) ;
    public final void rule__NumberOption__RangeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2407:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:2408:2: ( RULE_INT )
            {
            // InternalVformDSL.g:2408:2: ( RULE_INT )
            // InternalVformDSL.g:2409:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__NumberOption__RangeAssignment_7"


    // $ANTLR start "rule__EnumOption__StringDataAssignment_0_3"
    // InternalVformDSL.g:2418:1: rule__EnumOption__StringDataAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__EnumOption__StringDataAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2422:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2423:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2423:2: ( RULE_STRING )
            // InternalVformDSL.g:2424:3: RULE_STRING
            {
             before(grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__EnumOption__StringDataAssignment_0_3"


    // $ANTLR start "rule__EnumOption__NumberDataAssignment_1"
    // InternalVformDSL.g:2433:1: rule__EnumOption__NumberDataAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EnumOption__NumberDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2437:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:2438:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:2438:2: ( RULE_STRING )
            // InternalVformDSL.g:2439:3: RULE_STRING
            {
             before(grammarAccess.getEnumOptionAccess().getNumberDataSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getNumberDataSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumOption__NumberDataAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});

}