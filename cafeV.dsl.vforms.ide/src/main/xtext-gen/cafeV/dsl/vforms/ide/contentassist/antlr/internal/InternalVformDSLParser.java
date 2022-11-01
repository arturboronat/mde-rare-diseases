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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'horizontal'", "'vertical'", "'formLayout:'", "','", "'formInputs:'", "'['", "']'", "'{'", "'inputType:'", "'text'", "'inputName:'", "'}'", "'checkbox'", "'number'", "'date'", "'range'", "'min:'", "'max:'", "'select'", "'options:'", "'group'", "'groupInputs:'", "'optionType:'", "'data'", "'data:'", "'enum'", "'range:'", "'label:'", "'value:'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleFormLayout"
    // InternalVformDSL.g:78:1: entryRuleFormLayout : ruleFormLayout EOF ;
    public final void entryRuleFormLayout() throws RecognitionException {
        try {
            // InternalVformDSL.g:79:1: ( ruleFormLayout EOF )
            // InternalVformDSL.g:80:1: ruleFormLayout EOF
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
    // InternalVformDSL.g:87:1: ruleFormLayout : ( ( rule__FormLayout__LayoutAssignment ) ) ;
    public final void ruleFormLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:91:2: ( ( ( rule__FormLayout__LayoutAssignment ) ) )
            // InternalVformDSL.g:92:2: ( ( rule__FormLayout__LayoutAssignment ) )
            {
            // InternalVformDSL.g:92:2: ( ( rule__FormLayout__LayoutAssignment ) )
            // InternalVformDSL.g:93:3: ( rule__FormLayout__LayoutAssignment )
            {
             before(grammarAccess.getFormLayoutAccess().getLayoutAssignment()); 
            // InternalVformDSL.g:94:3: ( rule__FormLayout__LayoutAssignment )
            // InternalVformDSL.g:94:4: rule__FormLayout__LayoutAssignment
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
    // InternalVformDSL.g:103:1: entryRuleFormInput : ruleFormInput EOF ;
    public final void entryRuleFormInput() throws RecognitionException {
        try {
            // InternalVformDSL.g:104:1: ( ruleFormInput EOF )
            // InternalVformDSL.g:105:1: ruleFormInput EOF
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
    // InternalVformDSL.g:112:1: ruleFormInput : ( ( rule__FormInput__Alternatives ) ) ;
    public final void ruleFormInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:116:2: ( ( ( rule__FormInput__Alternatives ) ) )
            // InternalVformDSL.g:117:2: ( ( rule__FormInput__Alternatives ) )
            {
            // InternalVformDSL.g:117:2: ( ( rule__FormInput__Alternatives ) )
            // InternalVformDSL.g:118:3: ( rule__FormInput__Alternatives )
            {
             before(grammarAccess.getFormInputAccess().getAlternatives()); 
            // InternalVformDSL.g:119:3: ( rule__FormInput__Alternatives )
            // InternalVformDSL.g:119:4: rule__FormInput__Alternatives
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


    // $ANTLR start "entryRuleSearch"
    // InternalVformDSL.g:278:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalVformDSL.g:279:1: ( ruleSearch EOF )
            // InternalVformDSL.g:280:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalVformDSL.g:287:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:291:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalVformDSL.g:292:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalVformDSL.g:292:2: ( ( rule__Search__Group__0 ) )
            // InternalVformDSL.g:293:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalVformDSL.g:294:3: ( rule__Search__Group__0 )
            // InternalVformDSL.g:294:4: rule__Search__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleGroup"
    // InternalVformDSL.g:303:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalVformDSL.g:304:1: ( ruleGroup EOF )
            // InternalVformDSL.g:305:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalVformDSL.g:312:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:316:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalVformDSL.g:317:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalVformDSL.g:317:2: ( ( rule__Group__Group__0 ) )
            // InternalVformDSL.g:318:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalVformDSL.g:319:3: ( rule__Group__Group__0 )
            // InternalVformDSL.g:319:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleDataOption"
    // InternalVformDSL.g:328:1: entryRuleDataOption : ruleDataOption EOF ;
    public final void entryRuleDataOption() throws RecognitionException {
        try {
            // InternalVformDSL.g:329:1: ( ruleDataOption EOF )
            // InternalVformDSL.g:330:1: ruleDataOption EOF
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
    // InternalVformDSL.g:337:1: ruleDataOption : ( ( rule__DataOption__Group__0 ) ) ;
    public final void ruleDataOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:341:2: ( ( ( rule__DataOption__Group__0 ) ) )
            // InternalVformDSL.g:342:2: ( ( rule__DataOption__Group__0 ) )
            {
            // InternalVformDSL.g:342:2: ( ( rule__DataOption__Group__0 ) )
            // InternalVformDSL.g:343:3: ( rule__DataOption__Group__0 )
            {
             before(grammarAccess.getDataOptionAccess().getGroup()); 
            // InternalVformDSL.g:344:3: ( rule__DataOption__Group__0 )
            // InternalVformDSL.g:344:4: rule__DataOption__Group__0
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
    // InternalVformDSL.g:362:1: ruleEnumOption : ( ( rule__EnumOption__Group__0 ) ) ;
    public final void ruleEnumOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:366:2: ( ( ( rule__EnumOption__Group__0 ) ) )
            // InternalVformDSL.g:367:2: ( ( rule__EnumOption__Group__0 ) )
            {
            // InternalVformDSL.g:367:2: ( ( rule__EnumOption__Group__0 ) )
            // InternalVformDSL.g:368:3: ( rule__EnumOption__Group__0 )
            {
             before(grammarAccess.getEnumOptionAccess().getGroup()); 
            // InternalVformDSL.g:369:3: ( rule__EnumOption__Group__0 )
            // InternalVformDSL.g:369:4: rule__EnumOption__Group__0
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
    // InternalVformDSL.g:378:1: entryRuleNumberOption : ruleNumberOption EOF ;
    public final void entryRuleNumberOption() throws RecognitionException {
        try {
            // InternalVformDSL.g:379:1: ( ruleNumberOption EOF )
            // InternalVformDSL.g:380:1: ruleNumberOption EOF
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
    // InternalVformDSL.g:387:1: ruleNumberOption : ( ( rule__NumberOption__Group__0 ) ) ;
    public final void ruleNumberOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:391:2: ( ( ( rule__NumberOption__Group__0 ) ) )
            // InternalVformDSL.g:392:2: ( ( rule__NumberOption__Group__0 ) )
            {
            // InternalVformDSL.g:392:2: ( ( rule__NumberOption__Group__0 ) )
            // InternalVformDSL.g:393:3: ( rule__NumberOption__Group__0 )
            {
             before(grammarAccess.getNumberOptionAccess().getGroup()); 
            // InternalVformDSL.g:394:3: ( rule__NumberOption__Group__0 )
            // InternalVformDSL.g:394:4: rule__NumberOption__Group__0
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


    // $ANTLR start "entryRuleData"
    // InternalVformDSL.g:403:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalVformDSL.g:404:1: ( ruleData EOF )
            // InternalVformDSL.g:405:1: ruleData EOF
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
    // InternalVformDSL.g:412:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:416:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalVformDSL.g:417:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalVformDSL.g:417:2: ( ( rule__Data__Group__0 ) )
            // InternalVformDSL.g:418:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalVformDSL.g:419:3: ( rule__Data__Group__0 )
            // InternalVformDSL.g:419:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

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


    // $ANTLR start "ruleLayout"
    // InternalVformDSL.g:428:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:432:1: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalVformDSL.g:433:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalVformDSL.g:433:2: ( ( rule__Layout__Alternatives ) )
            // InternalVformDSL.g:434:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalVformDSL.g:435:3: ( rule__Layout__Alternatives )
            // InternalVformDSL.g:435:4: rule__Layout__Alternatives
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
    // InternalVformDSL.g:443:1: rule__FormInput__Alternatives : ( ( ( rule__FormInput__TextAssignment_0 ) ) | ( ( rule__FormInput__CheckboxAssignment_1 ) ) | ( ( rule__FormInput__NumberAssignment_2 ) ) | ( ( rule__FormInput__DatAssignment_3 ) ) | ( ( rule__FormInput__RangeAssignment_4 ) ) | ( ( rule__FormInput__SelectAssignment_5 ) ) | ( ( rule__FormInput__SearchAssignment_6 ) ) | ( ( rule__FormInput__GroupAssignment_7 ) ) );
    public final void rule__FormInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:447:1: ( ( ( rule__FormInput__TextAssignment_0 ) ) | ( ( rule__FormInput__CheckboxAssignment_1 ) ) | ( ( rule__FormInput__NumberAssignment_2 ) ) | ( ( rule__FormInput__DatAssignment_3 ) ) | ( ( rule__FormInput__RangeAssignment_4 ) ) | ( ( rule__FormInput__SelectAssignment_5 ) ) | ( ( rule__FormInput__SearchAssignment_6 ) ) | ( ( rule__FormInput__GroupAssignment_7 ) ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalVformDSL.g:448:2: ( ( rule__FormInput__TextAssignment_0 ) )
                    {
                    // InternalVformDSL.g:448:2: ( ( rule__FormInput__TextAssignment_0 ) )
                    // InternalVformDSL.g:449:3: ( rule__FormInput__TextAssignment_0 )
                    {
                     before(grammarAccess.getFormInputAccess().getTextAssignment_0()); 
                    // InternalVformDSL.g:450:3: ( rule__FormInput__TextAssignment_0 )
                    // InternalVformDSL.g:450:4: rule__FormInput__TextAssignment_0
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
                    // InternalVformDSL.g:454:2: ( ( rule__FormInput__CheckboxAssignment_1 ) )
                    {
                    // InternalVformDSL.g:454:2: ( ( rule__FormInput__CheckboxAssignment_1 ) )
                    // InternalVformDSL.g:455:3: ( rule__FormInput__CheckboxAssignment_1 )
                    {
                     before(grammarAccess.getFormInputAccess().getCheckboxAssignment_1()); 
                    // InternalVformDSL.g:456:3: ( rule__FormInput__CheckboxAssignment_1 )
                    // InternalVformDSL.g:456:4: rule__FormInput__CheckboxAssignment_1
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
                    // InternalVformDSL.g:460:2: ( ( rule__FormInput__NumberAssignment_2 ) )
                    {
                    // InternalVformDSL.g:460:2: ( ( rule__FormInput__NumberAssignment_2 ) )
                    // InternalVformDSL.g:461:3: ( rule__FormInput__NumberAssignment_2 )
                    {
                     before(grammarAccess.getFormInputAccess().getNumberAssignment_2()); 
                    // InternalVformDSL.g:462:3: ( rule__FormInput__NumberAssignment_2 )
                    // InternalVformDSL.g:462:4: rule__FormInput__NumberAssignment_2
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
                    // InternalVformDSL.g:466:2: ( ( rule__FormInput__DatAssignment_3 ) )
                    {
                    // InternalVformDSL.g:466:2: ( ( rule__FormInput__DatAssignment_3 ) )
                    // InternalVformDSL.g:467:3: ( rule__FormInput__DatAssignment_3 )
                    {
                     before(grammarAccess.getFormInputAccess().getDatAssignment_3()); 
                    // InternalVformDSL.g:468:3: ( rule__FormInput__DatAssignment_3 )
                    // InternalVformDSL.g:468:4: rule__FormInput__DatAssignment_3
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
                    // InternalVformDSL.g:472:2: ( ( rule__FormInput__RangeAssignment_4 ) )
                    {
                    // InternalVformDSL.g:472:2: ( ( rule__FormInput__RangeAssignment_4 ) )
                    // InternalVformDSL.g:473:3: ( rule__FormInput__RangeAssignment_4 )
                    {
                     before(grammarAccess.getFormInputAccess().getRangeAssignment_4()); 
                    // InternalVformDSL.g:474:3: ( rule__FormInput__RangeAssignment_4 )
                    // InternalVformDSL.g:474:4: rule__FormInput__RangeAssignment_4
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
                    // InternalVformDSL.g:478:2: ( ( rule__FormInput__SelectAssignment_5 ) )
                    {
                    // InternalVformDSL.g:478:2: ( ( rule__FormInput__SelectAssignment_5 ) )
                    // InternalVformDSL.g:479:3: ( rule__FormInput__SelectAssignment_5 )
                    {
                     before(grammarAccess.getFormInputAccess().getSelectAssignment_5()); 
                    // InternalVformDSL.g:480:3: ( rule__FormInput__SelectAssignment_5 )
                    // InternalVformDSL.g:480:4: rule__FormInput__SelectAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__SelectAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getSelectAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVformDSL.g:484:2: ( ( rule__FormInput__SearchAssignment_6 ) )
                    {
                    // InternalVformDSL.g:484:2: ( ( rule__FormInput__SearchAssignment_6 ) )
                    // InternalVformDSL.g:485:3: ( rule__FormInput__SearchAssignment_6 )
                    {
                     before(grammarAccess.getFormInputAccess().getSearchAssignment_6()); 
                    // InternalVformDSL.g:486:3: ( rule__FormInput__SearchAssignment_6 )
                    // InternalVformDSL.g:486:4: rule__FormInput__SearchAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__SearchAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getSearchAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVformDSL.g:490:2: ( ( rule__FormInput__GroupAssignment_7 ) )
                    {
                    // InternalVformDSL.g:490:2: ( ( rule__FormInput__GroupAssignment_7 ) )
                    // InternalVformDSL.g:491:3: ( rule__FormInput__GroupAssignment_7 )
                    {
                     before(grammarAccess.getFormInputAccess().getGroupAssignment_7()); 
                    // InternalVformDSL.g:492:3: ( rule__FormInput__GroupAssignment_7 )
                    // InternalVformDSL.g:492:4: rule__FormInput__GroupAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormInput__GroupAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormInputAccess().getGroupAssignment_7()); 

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


    // $ANTLR start "rule__Select__Alternatives_8"
    // InternalVformDSL.g:500:1: rule__Select__Alternatives_8 : ( ( ( rule__Select__DataOptionAssignment_8_0 ) ) | ( ( rule__Select__EnumOptionAssignment_8_1 ) ) | ( ( rule__Select__NumberOptionAssignment_8_2 ) ) );
    public final void rule__Select__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:504:1: ( ( ( rule__Select__DataOptionAssignment_8_0 ) ) | ( ( rule__Select__EnumOptionAssignment_8_1 ) ) | ( ( rule__Select__NumberOptionAssignment_8_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==33) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt2=3;
                        }
                        break;
                    case 36:
                        {
                        alt2=2;
                        }
                        break;
                    case 34:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
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
                    // InternalVformDSL.g:505:2: ( ( rule__Select__DataOptionAssignment_8_0 ) )
                    {
                    // InternalVformDSL.g:505:2: ( ( rule__Select__DataOptionAssignment_8_0 ) )
                    // InternalVformDSL.g:506:3: ( rule__Select__DataOptionAssignment_8_0 )
                    {
                     before(grammarAccess.getSelectAccess().getDataOptionAssignment_8_0()); 
                    // InternalVformDSL.g:507:3: ( rule__Select__DataOptionAssignment_8_0 )
                    // InternalVformDSL.g:507:4: rule__Select__DataOptionAssignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__DataOptionAssignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getDataOptionAssignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:511:2: ( ( rule__Select__EnumOptionAssignment_8_1 ) )
                    {
                    // InternalVformDSL.g:511:2: ( ( rule__Select__EnumOptionAssignment_8_1 ) )
                    // InternalVformDSL.g:512:3: ( rule__Select__EnumOptionAssignment_8_1 )
                    {
                     before(grammarAccess.getSelectAccess().getEnumOptionAssignment_8_1()); 
                    // InternalVformDSL.g:513:3: ( rule__Select__EnumOptionAssignment_8_1 )
                    // InternalVformDSL.g:513:4: rule__Select__EnumOptionAssignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__EnumOptionAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getEnumOptionAssignment_8_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:517:2: ( ( rule__Select__NumberOptionAssignment_8_2 ) )
                    {
                    // InternalVformDSL.g:517:2: ( ( rule__Select__NumberOptionAssignment_8_2 ) )
                    // InternalVformDSL.g:518:3: ( rule__Select__NumberOptionAssignment_8_2 )
                    {
                     before(grammarAccess.getSelectAccess().getNumberOptionAssignment_8_2()); 
                    // InternalVformDSL.g:519:3: ( rule__Select__NumberOptionAssignment_8_2 )
                    // InternalVformDSL.g:519:4: rule__Select__NumberOptionAssignment_8_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__NumberOptionAssignment_8_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getNumberOptionAssignment_8_2()); 

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
    // $ANTLR end "rule__Select__Alternatives_8"


    // $ANTLR start "rule__Search__Alternatives_9"
    // InternalVformDSL.g:527:1: rule__Search__Alternatives_9 : ( ( ( rule__Search__StringDataAssignment_9_0 )* ) | ( ( rule__Search__NumberDataAssignment_9_1 )* ) | ( ( rule__Search__DataAssignment_9_2 )* ) );
    public final void rule__Search__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:531:1: ( ( ( rule__Search__StringDataAssignment_9_0 )* ) | ( ( rule__Search__NumberDataAssignment_9_1 )* ) | ( ( rule__Search__DataAssignment_9_2 )* ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVformDSL.g:532:2: ( ( rule__Search__StringDataAssignment_9_0 )* )
                    {
                    // InternalVformDSL.g:532:2: ( ( rule__Search__StringDataAssignment_9_0 )* )
                    // InternalVformDSL.g:533:3: ( rule__Search__StringDataAssignment_9_0 )*
                    {
                     before(grammarAccess.getSearchAccess().getStringDataAssignment_9_0()); 
                    // InternalVformDSL.g:534:3: ( rule__Search__StringDataAssignment_9_0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalVformDSL.g:534:4: rule__Search__StringDataAssignment_9_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Search__StringDataAssignment_9_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getSearchAccess().getStringDataAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:538:2: ( ( rule__Search__NumberDataAssignment_9_1 )* )
                    {
                    // InternalVformDSL.g:538:2: ( ( rule__Search__NumberDataAssignment_9_1 )* )
                    // InternalVformDSL.g:539:3: ( rule__Search__NumberDataAssignment_9_1 )*
                    {
                     before(grammarAccess.getSearchAccess().getNumberDataAssignment_9_1()); 
                    // InternalVformDSL.g:540:3: ( rule__Search__NumberDataAssignment_9_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVformDSL.g:540:4: rule__Search__NumberDataAssignment_9_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Search__NumberDataAssignment_9_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getSearchAccess().getNumberDataAssignment_9_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:544:2: ( ( rule__Search__DataAssignment_9_2 )* )
                    {
                    // InternalVformDSL.g:544:2: ( ( rule__Search__DataAssignment_9_2 )* )
                    // InternalVformDSL.g:545:3: ( rule__Search__DataAssignment_9_2 )*
                    {
                     before(grammarAccess.getSearchAccess().getDataAssignment_9_2()); 
                    // InternalVformDSL.g:546:3: ( rule__Search__DataAssignment_9_2 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVformDSL.g:546:4: rule__Search__DataAssignment_9_2
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__Search__DataAssignment_9_2();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getSearchAccess().getDataAssignment_9_2()); 

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
    // $ANTLR end "rule__Search__Alternatives_9"


    // $ANTLR start "rule__EnumOption__Alternatives_6"
    // InternalVformDSL.g:554:1: rule__EnumOption__Alternatives_6 : ( ( ( rule__EnumOption__StringDataAssignment_6_0 )* ) | ( ( rule__EnumOption__NumberDataAssignment_6_1 )* ) );
    public final void rule__EnumOption__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:558:1: ( ( ( rule__EnumOption__StringDataAssignment_6_0 )* ) | ( ( rule__EnumOption__NumberDataAssignment_6_1 )* ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVformDSL.g:559:2: ( ( rule__EnumOption__StringDataAssignment_6_0 )* )
                    {
                    // InternalVformDSL.g:559:2: ( ( rule__EnumOption__StringDataAssignment_6_0 )* )
                    // InternalVformDSL.g:560:3: ( rule__EnumOption__StringDataAssignment_6_0 )*
                    {
                     before(grammarAccess.getEnumOptionAccess().getStringDataAssignment_6_0()); 
                    // InternalVformDSL.g:561:3: ( rule__EnumOption__StringDataAssignment_6_0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVformDSL.g:561:4: rule__EnumOption__StringDataAssignment_6_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__EnumOption__StringDataAssignment_6_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     after(grammarAccess.getEnumOptionAccess().getStringDataAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:565:2: ( ( rule__EnumOption__NumberDataAssignment_6_1 )* )
                    {
                    // InternalVformDSL.g:565:2: ( ( rule__EnumOption__NumberDataAssignment_6_1 )* )
                    // InternalVformDSL.g:566:3: ( rule__EnumOption__NumberDataAssignment_6_1 )*
                    {
                     before(grammarAccess.getEnumOptionAccess().getNumberDataAssignment_6_1()); 
                    // InternalVformDSL.g:567:3: ( rule__EnumOption__NumberDataAssignment_6_1 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_INT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVformDSL.g:567:4: rule__EnumOption__NumberDataAssignment_6_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__EnumOption__NumberDataAssignment_6_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getEnumOptionAccess().getNumberDataAssignment_6_1()); 

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
    // $ANTLR end "rule__EnumOption__Alternatives_6"


    // $ANTLR start "rule__Data__Alternatives_5"
    // InternalVformDSL.g:575:1: rule__Data__Alternatives_5 : ( ( ( rule__Data__StrValAssignment_5_0 ) ) | ( ( rule__Data__IntValAssignment_5_1 ) ) );
    public final void rule__Data__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:579:1: ( ( ( rule__Data__StrValAssignment_5_0 ) ) | ( ( rule__Data__IntValAssignment_5_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVformDSL.g:580:2: ( ( rule__Data__StrValAssignment_5_0 ) )
                    {
                    // InternalVformDSL.g:580:2: ( ( rule__Data__StrValAssignment_5_0 ) )
                    // InternalVformDSL.g:581:3: ( rule__Data__StrValAssignment_5_0 )
                    {
                     before(grammarAccess.getDataAccess().getStrValAssignment_5_0()); 
                    // InternalVformDSL.g:582:3: ( rule__Data__StrValAssignment_5_0 )
                    // InternalVformDSL.g:582:4: rule__Data__StrValAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__StrValAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getStrValAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:586:2: ( ( rule__Data__IntValAssignment_5_1 ) )
                    {
                    // InternalVformDSL.g:586:2: ( ( rule__Data__IntValAssignment_5_1 ) )
                    // InternalVformDSL.g:587:3: ( rule__Data__IntValAssignment_5_1 )
                    {
                     before(grammarAccess.getDataAccess().getIntValAssignment_5_1()); 
                    // InternalVformDSL.g:588:3: ( rule__Data__IntValAssignment_5_1 )
                    // InternalVformDSL.g:588:4: rule__Data__IntValAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__IntValAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getIntValAssignment_5_1()); 

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
    // $ANTLR end "rule__Data__Alternatives_5"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalVformDSL.g:596:1: rule__Layout__Alternatives : ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:600:1: ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVformDSL.g:601:2: ( ( 'horizontal' ) )
                    {
                    // InternalVformDSL.g:601:2: ( ( 'horizontal' ) )
                    // InternalVformDSL.g:602:3: ( 'horizontal' )
                    {
                     before(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 
                    // InternalVformDSL.g:603:3: ( 'horizontal' )
                    // InternalVformDSL.g:603:4: 'horizontal'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:607:2: ( ( 'vertical' ) )
                    {
                    // InternalVformDSL.g:607:2: ( ( 'vertical' ) )
                    // InternalVformDSL.g:608:3: ( 'vertical' )
                    {
                     before(grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1()); 
                    // InternalVformDSL.g:609:3: ( 'vertical' )
                    // InternalVformDSL.g:609:4: 'vertical'
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
    // InternalVformDSL.g:617:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:621:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalVformDSL.g:622:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalVformDSL.g:629:1: rule__Model__Group__0__Impl : ( 'formLayout:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:633:1: ( ( 'formLayout:' ) )
            // InternalVformDSL.g:634:1: ( 'formLayout:' )
            {
            // InternalVformDSL.g:634:1: ( 'formLayout:' )
            // InternalVformDSL.g:635:2: 'formLayout:'
            {
             before(grammarAccess.getModelAccess().getFormLayoutKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalVformDSL.g:644:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:648:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalVformDSL.g:649:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:656:1: rule__Model__Group__1__Impl : ( ( rule__Model__FormLayoutAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:660:1: ( ( ( rule__Model__FormLayoutAssignment_1 ) ) )
            // InternalVformDSL.g:661:1: ( ( rule__Model__FormLayoutAssignment_1 ) )
            {
            // InternalVformDSL.g:661:1: ( ( rule__Model__FormLayoutAssignment_1 ) )
            // InternalVformDSL.g:662:2: ( rule__Model__FormLayoutAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getFormLayoutAssignment_1()); 
            // InternalVformDSL.g:663:2: ( rule__Model__FormLayoutAssignment_1 )
            // InternalVformDSL.g:663:3: rule__Model__FormLayoutAssignment_1
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
    // InternalVformDSL.g:671:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:675:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalVformDSL.g:676:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalVformDSL.g:683:1: rule__Model__Group__2__Impl : ( ',' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:687:1: ( ( ',' ) )
            // InternalVformDSL.g:688:1: ( ',' )
            {
            // InternalVformDSL.g:688:1: ( ',' )
            // InternalVformDSL.g:689:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalVformDSL.g:698:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:702:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalVformDSL.g:703:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalVformDSL.g:710:1: rule__Model__Group__3__Impl : ( 'formInputs:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:714:1: ( ( 'formInputs:' ) )
            // InternalVformDSL.g:715:1: ( 'formInputs:' )
            {
            // InternalVformDSL.g:715:1: ( 'formInputs:' )
            // InternalVformDSL.g:716:2: 'formInputs:'
            {
             before(grammarAccess.getModelAccess().getFormInputsKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalVformDSL.g:725:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:729:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalVformDSL.g:730:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalVformDSL.g:737:1: rule__Model__Group__4__Impl : ( '[' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:741:1: ( ( '[' ) )
            // InternalVformDSL.g:742:1: ( '[' )
            {
            // InternalVformDSL.g:742:1: ( '[' )
            // InternalVformDSL.g:743:2: '['
            {
             before(grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalVformDSL.g:752:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:756:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalVformDSL.g:757:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalVformDSL.g:764:1: rule__Model__Group__5__Impl : ( ( rule__Model__FormInputAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:768:1: ( ( ( rule__Model__FormInputAssignment_5 )* ) )
            // InternalVformDSL.g:769:1: ( ( rule__Model__FormInputAssignment_5 )* )
            {
            // InternalVformDSL.g:769:1: ( ( rule__Model__FormInputAssignment_5 )* )
            // InternalVformDSL.g:770:2: ( rule__Model__FormInputAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getFormInputAssignment_5()); 
            // InternalVformDSL.g:771:2: ( rule__Model__FormInputAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVformDSL.g:771:3: rule__Model__FormInputAssignment_5
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__FormInputAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalVformDSL.g:779:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:783:1: ( rule__Model__Group__6__Impl )
            // InternalVformDSL.g:784:2: rule__Model__Group__6__Impl
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
    // InternalVformDSL.g:790:1: rule__Model__Group__6__Impl : ( ']' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:794:1: ( ( ']' ) )
            // InternalVformDSL.g:795:1: ( ']' )
            {
            // InternalVformDSL.g:795:1: ( ']' )
            // InternalVformDSL.g:796:2: ']'
            {
             before(grammarAccess.getModelAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Text__Group__0"
    // InternalVformDSL.g:806:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:810:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalVformDSL.g:811:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVformDSL.g:818:1: rule__Text__Group__0__Impl : ( '{' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:822:1: ( ( '{' ) )
            // InternalVformDSL.g:823:1: ( '{' )
            {
            // InternalVformDSL.g:823:1: ( '{' )
            // InternalVformDSL.g:824:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:833:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:837:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalVformDSL.g:838:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVformDSL.g:845:1: rule__Text__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:849:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:850:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:850:1: ( 'inputType:' )
            // InternalVformDSL.g:851:2: 'inputType:'
            {
             before(grammarAccess.getTextAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:860:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:864:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalVformDSL.g:865:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:872:1: rule__Text__Group__2__Impl : ( 'text' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:876:1: ( ( 'text' ) )
            // InternalVformDSL.g:877:1: ( 'text' )
            {
            // InternalVformDSL.g:877:1: ( 'text' )
            // InternalVformDSL.g:878:2: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_2()); 

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
    // InternalVformDSL.g:887:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:891:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalVformDSL.g:892:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

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
    // InternalVformDSL.g:899:1: rule__Text__Group__3__Impl : ( ',' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:903:1: ( ( ',' ) )
            // InternalVformDSL.g:904:1: ( ',' )
            {
            // InternalVformDSL.g:904:1: ( ',' )
            // InternalVformDSL.g:905:2: ','
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getCommaKeyword_3()); 

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


    // $ANTLR start "rule__Text__Group__4"
    // InternalVformDSL.g:914:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:918:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalVformDSL.g:919:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Text__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__5();

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
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalVformDSL.g:926:1: rule__Text__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:930:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:931:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:931:1: ( 'inputName:' )
            // InternalVformDSL.g:932:2: 'inputName:'
            {
             before(grammarAccess.getTextAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__5"
    // InternalVformDSL.g:941:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:945:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalVformDSL.g:946:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Text__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__6();

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
    // $ANTLR end "rule__Text__Group__5"


    // $ANTLR start "rule__Text__Group__5__Impl"
    // InternalVformDSL.g:953:1: rule__Text__Group__5__Impl : ( ( rule__Text__InputNameAssignment_5 ) ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:957:1: ( ( ( rule__Text__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:958:1: ( ( rule__Text__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:958:1: ( ( rule__Text__InputNameAssignment_5 ) )
            // InternalVformDSL.g:959:2: ( rule__Text__InputNameAssignment_5 )
            {
             before(grammarAccess.getTextAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:960:2: ( rule__Text__InputNameAssignment_5 )
            // InternalVformDSL.g:960:3: rule__Text__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Text__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Text__Group__5__Impl"


    // $ANTLR start "rule__Text__Group__6"
    // InternalVformDSL.g:968:1: rule__Text__Group__6 : rule__Text__Group__6__Impl ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:972:1: ( rule__Text__Group__6__Impl )
            // InternalVformDSL.g:973:2: rule__Text__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__6__Impl();

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
    // $ANTLR end "rule__Text__Group__6"


    // $ANTLR start "rule__Text__Group__6__Impl"
    // InternalVformDSL.g:979:1: rule__Text__Group__6__Impl : ( '}' ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:983:1: ( ( '}' ) )
            // InternalVformDSL.g:984:1: ( '}' )
            {
            // InternalVformDSL.g:984:1: ( '}' )
            // InternalVformDSL.g:985:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Text__Group__6__Impl"


    // $ANTLR start "rule__Checkbox__Group__0"
    // InternalVformDSL.g:995:1: rule__Checkbox__Group__0 : rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 ;
    public final void rule__Checkbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:999:1: ( rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1 )
            // InternalVformDSL.g:1000:2: rule__Checkbox__Group__0__Impl rule__Checkbox__Group__1
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
    // InternalVformDSL.g:1007:1: rule__Checkbox__Group__0__Impl : ( '{' ) ;
    public final void rule__Checkbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1011:1: ( ( '{' ) )
            // InternalVformDSL.g:1012:1: ( '{' )
            {
            // InternalVformDSL.g:1012:1: ( '{' )
            // InternalVformDSL.g:1013:2: '{'
            {
             before(grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:1022:1: rule__Checkbox__Group__1 : rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 ;
    public final void rule__Checkbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1026:1: ( rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2 )
            // InternalVformDSL.g:1027:2: rule__Checkbox__Group__1__Impl rule__Checkbox__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVformDSL.g:1034:1: rule__Checkbox__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Checkbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1038:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:1039:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:1039:1: ( 'inputType:' )
            // InternalVformDSL.g:1040:2: 'inputType:'
            {
             before(grammarAccess.getCheckboxAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:1049:1: rule__Checkbox__Group__2 : rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 ;
    public final void rule__Checkbox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1053:1: ( rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3 )
            // InternalVformDSL.g:1054:2: rule__Checkbox__Group__2__Impl rule__Checkbox__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1061:1: rule__Checkbox__Group__2__Impl : ( 'checkbox' ) ;
    public final void rule__Checkbox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1065:1: ( ( 'checkbox' ) )
            // InternalVformDSL.g:1066:1: ( 'checkbox' )
            {
            // InternalVformDSL.g:1066:1: ( 'checkbox' )
            // InternalVformDSL.g:1067:2: 'checkbox'
            {
             before(grammarAccess.getCheckboxAccess().getCheckboxKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCheckboxKeyword_2()); 

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
    // InternalVformDSL.g:1076:1: rule__Checkbox__Group__3 : rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 ;
    public final void rule__Checkbox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1080:1: ( rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4 )
            // InternalVformDSL.g:1081:2: rule__Checkbox__Group__3__Impl rule__Checkbox__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Checkbox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__4();

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
    // InternalVformDSL.g:1088:1: rule__Checkbox__Group__3__Impl : ( ',' ) ;
    public final void rule__Checkbox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1092:1: ( ( ',' ) )
            // InternalVformDSL.g:1093:1: ( ',' )
            {
            // InternalVformDSL.g:1093:1: ( ',' )
            // InternalVformDSL.g:1094:2: ','
            {
             before(grammarAccess.getCheckboxAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getCommaKeyword_3()); 

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


    // $ANTLR start "rule__Checkbox__Group__4"
    // InternalVformDSL.g:1103:1: rule__Checkbox__Group__4 : rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 ;
    public final void rule__Checkbox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1107:1: ( rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5 )
            // InternalVformDSL.g:1108:2: rule__Checkbox__Group__4__Impl rule__Checkbox__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Checkbox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__5();

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
    // $ANTLR end "rule__Checkbox__Group__4"


    // $ANTLR start "rule__Checkbox__Group__4__Impl"
    // InternalVformDSL.g:1115:1: rule__Checkbox__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Checkbox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1119:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:1120:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:1120:1: ( 'inputName:' )
            // InternalVformDSL.g:1121:2: 'inputName:'
            {
             before(grammarAccess.getCheckboxAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Checkbox__Group__4__Impl"


    // $ANTLR start "rule__Checkbox__Group__5"
    // InternalVformDSL.g:1130:1: rule__Checkbox__Group__5 : rule__Checkbox__Group__5__Impl rule__Checkbox__Group__6 ;
    public final void rule__Checkbox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1134:1: ( rule__Checkbox__Group__5__Impl rule__Checkbox__Group__6 )
            // InternalVformDSL.g:1135:2: rule__Checkbox__Group__5__Impl rule__Checkbox__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Checkbox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__6();

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
    // $ANTLR end "rule__Checkbox__Group__5"


    // $ANTLR start "rule__Checkbox__Group__5__Impl"
    // InternalVformDSL.g:1142:1: rule__Checkbox__Group__5__Impl : ( ( rule__Checkbox__InputNameAssignment_5 ) ) ;
    public final void rule__Checkbox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1146:1: ( ( ( rule__Checkbox__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:1147:1: ( ( rule__Checkbox__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:1147:1: ( ( rule__Checkbox__InputNameAssignment_5 ) )
            // InternalVformDSL.g:1148:2: ( rule__Checkbox__InputNameAssignment_5 )
            {
             before(grammarAccess.getCheckboxAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:1149:2: ( rule__Checkbox__InputNameAssignment_5 )
            // InternalVformDSL.g:1149:3: rule__Checkbox__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Checkbox__Group__5__Impl"


    // $ANTLR start "rule__Checkbox__Group__6"
    // InternalVformDSL.g:1157:1: rule__Checkbox__Group__6 : rule__Checkbox__Group__6__Impl ;
    public final void rule__Checkbox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1161:1: ( rule__Checkbox__Group__6__Impl )
            // InternalVformDSL.g:1162:2: rule__Checkbox__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkbox__Group__6__Impl();

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
    // $ANTLR end "rule__Checkbox__Group__6"


    // $ANTLR start "rule__Checkbox__Group__6__Impl"
    // InternalVformDSL.g:1168:1: rule__Checkbox__Group__6__Impl : ( '}' ) ;
    public final void rule__Checkbox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1172:1: ( ( '}' ) )
            // InternalVformDSL.g:1173:1: ( '}' )
            {
            // InternalVformDSL.g:1173:1: ( '}' )
            // InternalVformDSL.g:1174:2: '}'
            {
             before(grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Checkbox__Group__6__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalVformDSL.g:1184:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1188:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalVformDSL.g:1189:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVformDSL.g:1196:1: rule__Number__Group__0__Impl : ( '{' ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1200:1: ( ( '{' ) )
            // InternalVformDSL.g:1201:1: ( '{' )
            {
            // InternalVformDSL.g:1201:1: ( '{' )
            // InternalVformDSL.g:1202:2: '{'
            {
             before(grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:1211:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1215:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalVformDSL.g:1216:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVformDSL.g:1223:1: rule__Number__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1227:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:1228:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:1228:1: ( 'inputType:' )
            // InternalVformDSL.g:1229:2: 'inputType:'
            {
             before(grammarAccess.getNumberAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:1238:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1242:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalVformDSL.g:1243:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1250:1: rule__Number__Group__2__Impl : ( 'number' ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1254:1: ( ( 'number' ) )
            // InternalVformDSL.g:1255:1: ( 'number' )
            {
            // InternalVformDSL.g:1255:1: ( 'number' )
            // InternalVformDSL.g:1256:2: 'number'
            {
             before(grammarAccess.getNumberAccess().getNumberKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumberKeyword_2()); 

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
    // InternalVformDSL.g:1265:1: rule__Number__Group__3 : rule__Number__Group__3__Impl rule__Number__Group__4 ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1269:1: ( rule__Number__Group__3__Impl rule__Number__Group__4 )
            // InternalVformDSL.g:1270:2: rule__Number__Group__3__Impl rule__Number__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Number__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__4();

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
    // InternalVformDSL.g:1277:1: rule__Number__Group__3__Impl : ( ',' ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1281:1: ( ( ',' ) )
            // InternalVformDSL.g:1282:1: ( ',' )
            {
            // InternalVformDSL.g:1282:1: ( ',' )
            // InternalVformDSL.g:1283:2: ','
            {
             before(grammarAccess.getNumberAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getCommaKeyword_3()); 

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


    // $ANTLR start "rule__Number__Group__4"
    // InternalVformDSL.g:1292:1: rule__Number__Group__4 : rule__Number__Group__4__Impl rule__Number__Group__5 ;
    public final void rule__Number__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1296:1: ( rule__Number__Group__4__Impl rule__Number__Group__5 )
            // InternalVformDSL.g:1297:2: rule__Number__Group__4__Impl rule__Number__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Number__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__5();

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
    // $ANTLR end "rule__Number__Group__4"


    // $ANTLR start "rule__Number__Group__4__Impl"
    // InternalVformDSL.g:1304:1: rule__Number__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Number__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1308:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:1309:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:1309:1: ( 'inputName:' )
            // InternalVformDSL.g:1310:2: 'inputName:'
            {
             before(grammarAccess.getNumberAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Number__Group__4__Impl"


    // $ANTLR start "rule__Number__Group__5"
    // InternalVformDSL.g:1319:1: rule__Number__Group__5 : rule__Number__Group__5__Impl rule__Number__Group__6 ;
    public final void rule__Number__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1323:1: ( rule__Number__Group__5__Impl rule__Number__Group__6 )
            // InternalVformDSL.g:1324:2: rule__Number__Group__5__Impl rule__Number__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Number__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__6();

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
    // $ANTLR end "rule__Number__Group__5"


    // $ANTLR start "rule__Number__Group__5__Impl"
    // InternalVformDSL.g:1331:1: rule__Number__Group__5__Impl : ( ( rule__Number__InputNameAssignment_5 ) ) ;
    public final void rule__Number__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1335:1: ( ( ( rule__Number__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:1336:1: ( ( rule__Number__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:1336:1: ( ( rule__Number__InputNameAssignment_5 ) )
            // InternalVformDSL.g:1337:2: ( rule__Number__InputNameAssignment_5 )
            {
             before(grammarAccess.getNumberAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:1338:2: ( rule__Number__InputNameAssignment_5 )
            // InternalVformDSL.g:1338:3: rule__Number__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Number__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Number__Group__5__Impl"


    // $ANTLR start "rule__Number__Group__6"
    // InternalVformDSL.g:1346:1: rule__Number__Group__6 : rule__Number__Group__6__Impl ;
    public final void rule__Number__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1350:1: ( rule__Number__Group__6__Impl )
            // InternalVformDSL.g:1351:2: rule__Number__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__6__Impl();

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
    // $ANTLR end "rule__Number__Group__6"


    // $ANTLR start "rule__Number__Group__6__Impl"
    // InternalVformDSL.g:1357:1: rule__Number__Group__6__Impl : ( '}' ) ;
    public final void rule__Number__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1361:1: ( ( '}' ) )
            // InternalVformDSL.g:1362:1: ( '}' )
            {
            // InternalVformDSL.g:1362:1: ( '}' )
            // InternalVformDSL.g:1363:2: '}'
            {
             before(grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Number__Group__6__Impl"


    // $ANTLR start "rule__Dat__Group__0"
    // InternalVformDSL.g:1373:1: rule__Dat__Group__0 : rule__Dat__Group__0__Impl rule__Dat__Group__1 ;
    public final void rule__Dat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1377:1: ( rule__Dat__Group__0__Impl rule__Dat__Group__1 )
            // InternalVformDSL.g:1378:2: rule__Dat__Group__0__Impl rule__Dat__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVformDSL.g:1385:1: rule__Dat__Group__0__Impl : ( '{' ) ;
    public final void rule__Dat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1389:1: ( ( '{' ) )
            // InternalVformDSL.g:1390:1: ( '{' )
            {
            // InternalVformDSL.g:1390:1: ( '{' )
            // InternalVformDSL.g:1391:2: '{'
            {
             before(grammarAccess.getDatAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:1400:1: rule__Dat__Group__1 : rule__Dat__Group__1__Impl rule__Dat__Group__2 ;
    public final void rule__Dat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1404:1: ( rule__Dat__Group__1__Impl rule__Dat__Group__2 )
            // InternalVformDSL.g:1405:2: rule__Dat__Group__1__Impl rule__Dat__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalVformDSL.g:1412:1: rule__Dat__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Dat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1416:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:1417:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:1417:1: ( 'inputType:' )
            // InternalVformDSL.g:1418:2: 'inputType:'
            {
             before(grammarAccess.getDatAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:1427:1: rule__Dat__Group__2 : rule__Dat__Group__2__Impl rule__Dat__Group__3 ;
    public final void rule__Dat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1431:1: ( rule__Dat__Group__2__Impl rule__Dat__Group__3 )
            // InternalVformDSL.g:1432:2: rule__Dat__Group__2__Impl rule__Dat__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1439:1: rule__Dat__Group__2__Impl : ( 'date' ) ;
    public final void rule__Dat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1443:1: ( ( 'date' ) )
            // InternalVformDSL.g:1444:1: ( 'date' )
            {
            // InternalVformDSL.g:1444:1: ( 'date' )
            // InternalVformDSL.g:1445:2: 'date'
            {
             before(grammarAccess.getDatAccess().getDateKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getDateKeyword_2()); 

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
    // InternalVformDSL.g:1454:1: rule__Dat__Group__3 : rule__Dat__Group__3__Impl rule__Dat__Group__4 ;
    public final void rule__Dat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1458:1: ( rule__Dat__Group__3__Impl rule__Dat__Group__4 )
            // InternalVformDSL.g:1459:2: rule__Dat__Group__3__Impl rule__Dat__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Dat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__4();

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
    // InternalVformDSL.g:1466:1: rule__Dat__Group__3__Impl : ( ',' ) ;
    public final void rule__Dat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1470:1: ( ( ',' ) )
            // InternalVformDSL.g:1471:1: ( ',' )
            {
            // InternalVformDSL.g:1471:1: ( ',' )
            // InternalVformDSL.g:1472:2: ','
            {
             before(grammarAccess.getDatAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getCommaKeyword_3()); 

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


    // $ANTLR start "rule__Dat__Group__4"
    // InternalVformDSL.g:1481:1: rule__Dat__Group__4 : rule__Dat__Group__4__Impl rule__Dat__Group__5 ;
    public final void rule__Dat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1485:1: ( rule__Dat__Group__4__Impl rule__Dat__Group__5 )
            // InternalVformDSL.g:1486:2: rule__Dat__Group__4__Impl rule__Dat__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Dat__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__5();

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
    // $ANTLR end "rule__Dat__Group__4"


    // $ANTLR start "rule__Dat__Group__4__Impl"
    // InternalVformDSL.g:1493:1: rule__Dat__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Dat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1497:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:1498:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:1498:1: ( 'inputName:' )
            // InternalVformDSL.g:1499:2: 'inputName:'
            {
             before(grammarAccess.getDatAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Dat__Group__4__Impl"


    // $ANTLR start "rule__Dat__Group__5"
    // InternalVformDSL.g:1508:1: rule__Dat__Group__5 : rule__Dat__Group__5__Impl rule__Dat__Group__6 ;
    public final void rule__Dat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1512:1: ( rule__Dat__Group__5__Impl rule__Dat__Group__6 )
            // InternalVformDSL.g:1513:2: rule__Dat__Group__5__Impl rule__Dat__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Dat__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dat__Group__6();

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
    // $ANTLR end "rule__Dat__Group__5"


    // $ANTLR start "rule__Dat__Group__5__Impl"
    // InternalVformDSL.g:1520:1: rule__Dat__Group__5__Impl : ( ( rule__Dat__InputNameAssignment_5 ) ) ;
    public final void rule__Dat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1524:1: ( ( ( rule__Dat__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:1525:1: ( ( rule__Dat__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:1525:1: ( ( rule__Dat__InputNameAssignment_5 ) )
            // InternalVformDSL.g:1526:2: ( rule__Dat__InputNameAssignment_5 )
            {
             before(grammarAccess.getDatAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:1527:2: ( rule__Dat__InputNameAssignment_5 )
            // InternalVformDSL.g:1527:3: rule__Dat__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Dat__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Dat__Group__5__Impl"


    // $ANTLR start "rule__Dat__Group__6"
    // InternalVformDSL.g:1535:1: rule__Dat__Group__6 : rule__Dat__Group__6__Impl ;
    public final void rule__Dat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1539:1: ( rule__Dat__Group__6__Impl )
            // InternalVformDSL.g:1540:2: rule__Dat__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dat__Group__6__Impl();

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
    // $ANTLR end "rule__Dat__Group__6"


    // $ANTLR start "rule__Dat__Group__6__Impl"
    // InternalVformDSL.g:1546:1: rule__Dat__Group__6__Impl : ( '}' ) ;
    public final void rule__Dat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1550:1: ( ( '}' ) )
            // InternalVformDSL.g:1551:1: ( '}' )
            {
            // InternalVformDSL.g:1551:1: ( '}' )
            // InternalVformDSL.g:1552:2: '}'
            {
             before(grammarAccess.getDatAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Dat__Group__6__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalVformDSL.g:1562:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1566:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalVformDSL.g:1567:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVformDSL.g:1574:1: rule__Range__Group__0__Impl : ( '{' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1578:1: ( ( '{' ) )
            // InternalVformDSL.g:1579:1: ( '{' )
            {
            // InternalVformDSL.g:1579:1: ( '{' )
            // InternalVformDSL.g:1580:2: '{'
            {
             before(grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:1589:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1593:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalVformDSL.g:1594:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalVformDSL.g:1601:1: rule__Range__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1605:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:1606:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:1606:1: ( 'inputType:' )
            // InternalVformDSL.g:1607:2: 'inputType:'
            {
             before(grammarAccess.getRangeAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:1616:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1620:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalVformDSL.g:1621:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1628:1: rule__Range__Group__2__Impl : ( 'range' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1632:1: ( ( 'range' ) )
            // InternalVformDSL.g:1633:1: ( 'range' )
            {
            // InternalVformDSL.g:1633:1: ( 'range' )
            // InternalVformDSL.g:1634:2: 'range'
            {
             before(grammarAccess.getRangeAccess().getRangeKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRangeKeyword_2()); 

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
    // InternalVformDSL.g:1643:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1647:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalVformDSL.g:1648:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalVformDSL.g:1655:1: rule__Range__Group__3__Impl : ( ',' ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1659:1: ( ( ',' ) )
            // InternalVformDSL.g:1660:1: ( ',' )
            {
            // InternalVformDSL.g:1660:1: ( ',' )
            // InternalVformDSL.g:1661:2: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_3()); 

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
    // InternalVformDSL.g:1670:1: rule__Range__Group__4 : rule__Range__Group__4__Impl rule__Range__Group__5 ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1674:1: ( rule__Range__Group__4__Impl rule__Range__Group__5 )
            // InternalVformDSL.g:1675:2: rule__Range__Group__4__Impl rule__Range__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalVformDSL.g:1682:1: rule__Range__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1686:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:1687:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:1687:1: ( 'inputName:' )
            // InternalVformDSL.g:1688:2: 'inputName:'
            {
             before(grammarAccess.getRangeAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputNameKeyword_4()); 

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
    // InternalVformDSL.g:1697:1: rule__Range__Group__5 : rule__Range__Group__5__Impl rule__Range__Group__6 ;
    public final void rule__Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1701:1: ( rule__Range__Group__5__Impl rule__Range__Group__6 )
            // InternalVformDSL.g:1702:2: rule__Range__Group__5__Impl rule__Range__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1709:1: rule__Range__Group__5__Impl : ( ( rule__Range__InputNameAssignment_5 ) ) ;
    public final void rule__Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1713:1: ( ( ( rule__Range__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:1714:1: ( ( rule__Range__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:1714:1: ( ( rule__Range__InputNameAssignment_5 ) )
            // InternalVformDSL.g:1715:2: ( rule__Range__InputNameAssignment_5 )
            {
             before(grammarAccess.getRangeAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:1716:2: ( rule__Range__InputNameAssignment_5 )
            // InternalVformDSL.g:1716:3: rule__Range__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Range__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getInputNameAssignment_5()); 

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
    // InternalVformDSL.g:1724:1: rule__Range__Group__6 : rule__Range__Group__6__Impl rule__Range__Group__7 ;
    public final void rule__Range__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1728:1: ( rule__Range__Group__6__Impl rule__Range__Group__7 )
            // InternalVformDSL.g:1729:2: rule__Range__Group__6__Impl rule__Range__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalVformDSL.g:1736:1: rule__Range__Group__6__Impl : ( ',' ) ;
    public final void rule__Range__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1740:1: ( ( ',' ) )
            // InternalVformDSL.g:1741:1: ( ',' )
            {
            // InternalVformDSL.g:1741:1: ( ',' )
            // InternalVformDSL.g:1742:2: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_6()); 

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
    // InternalVformDSL.g:1751:1: rule__Range__Group__7 : rule__Range__Group__7__Impl rule__Range__Group__8 ;
    public final void rule__Range__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1755:1: ( rule__Range__Group__7__Impl rule__Range__Group__8 )
            // InternalVformDSL.g:1756:2: rule__Range__Group__7__Impl rule__Range__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Range__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__8();

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
    // InternalVformDSL.g:1763:1: rule__Range__Group__7__Impl : ( 'min:' ) ;
    public final void rule__Range__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1767:1: ( ( 'min:' ) )
            // InternalVformDSL.g:1768:1: ( 'min:' )
            {
            // InternalVformDSL.g:1768:1: ( 'min:' )
            // InternalVformDSL.g:1769:2: 'min:'
            {
             before(grammarAccess.getRangeAccess().getMinKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMinKeyword_7()); 

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


    // $ANTLR start "rule__Range__Group__8"
    // InternalVformDSL.g:1778:1: rule__Range__Group__8 : rule__Range__Group__8__Impl rule__Range__Group__9 ;
    public final void rule__Range__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1782:1: ( rule__Range__Group__8__Impl rule__Range__Group__9 )
            // InternalVformDSL.g:1783:2: rule__Range__Group__8__Impl rule__Range__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Range__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__9();

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
    // $ANTLR end "rule__Range__Group__8"


    // $ANTLR start "rule__Range__Group__8__Impl"
    // InternalVformDSL.g:1790:1: rule__Range__Group__8__Impl : ( ( rule__Range__MinAssignment_8 ) ) ;
    public final void rule__Range__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1794:1: ( ( ( rule__Range__MinAssignment_8 ) ) )
            // InternalVformDSL.g:1795:1: ( ( rule__Range__MinAssignment_8 ) )
            {
            // InternalVformDSL.g:1795:1: ( ( rule__Range__MinAssignment_8 ) )
            // InternalVformDSL.g:1796:2: ( rule__Range__MinAssignment_8 )
            {
             before(grammarAccess.getRangeAccess().getMinAssignment_8()); 
            // InternalVformDSL.g:1797:2: ( rule__Range__MinAssignment_8 )
            // InternalVformDSL.g:1797:3: rule__Range__MinAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Range__MinAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMinAssignment_8()); 

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
    // $ANTLR end "rule__Range__Group__8__Impl"


    // $ANTLR start "rule__Range__Group__9"
    // InternalVformDSL.g:1805:1: rule__Range__Group__9 : rule__Range__Group__9__Impl rule__Range__Group__10 ;
    public final void rule__Range__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1809:1: ( rule__Range__Group__9__Impl rule__Range__Group__10 )
            // InternalVformDSL.g:1810:2: rule__Range__Group__9__Impl rule__Range__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Range__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__10();

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
    // $ANTLR end "rule__Range__Group__9"


    // $ANTLR start "rule__Range__Group__9__Impl"
    // InternalVformDSL.g:1817:1: rule__Range__Group__9__Impl : ( ',' ) ;
    public final void rule__Range__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1821:1: ( ( ',' ) )
            // InternalVformDSL.g:1822:1: ( ',' )
            {
            // InternalVformDSL.g:1822:1: ( ',' )
            // InternalVformDSL.g:1823:2: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__Range__Group__9__Impl"


    // $ANTLR start "rule__Range__Group__10"
    // InternalVformDSL.g:1832:1: rule__Range__Group__10 : rule__Range__Group__10__Impl rule__Range__Group__11 ;
    public final void rule__Range__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1836:1: ( rule__Range__Group__10__Impl rule__Range__Group__11 )
            // InternalVformDSL.g:1837:2: rule__Range__Group__10__Impl rule__Range__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Range__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__11();

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
    // $ANTLR end "rule__Range__Group__10"


    // $ANTLR start "rule__Range__Group__10__Impl"
    // InternalVformDSL.g:1844:1: rule__Range__Group__10__Impl : ( 'max:' ) ;
    public final void rule__Range__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1848:1: ( ( 'max:' ) )
            // InternalVformDSL.g:1849:1: ( 'max:' )
            {
            // InternalVformDSL.g:1849:1: ( 'max:' )
            // InternalVformDSL.g:1850:2: 'max:'
            {
             before(grammarAccess.getRangeAccess().getMaxKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMaxKeyword_10()); 

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
    // $ANTLR end "rule__Range__Group__10__Impl"


    // $ANTLR start "rule__Range__Group__11"
    // InternalVformDSL.g:1859:1: rule__Range__Group__11 : rule__Range__Group__11__Impl rule__Range__Group__12 ;
    public final void rule__Range__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1863:1: ( rule__Range__Group__11__Impl rule__Range__Group__12 )
            // InternalVformDSL.g:1864:2: rule__Range__Group__11__Impl rule__Range__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Range__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__12();

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
    // $ANTLR end "rule__Range__Group__11"


    // $ANTLR start "rule__Range__Group__11__Impl"
    // InternalVformDSL.g:1871:1: rule__Range__Group__11__Impl : ( ( rule__Range__MaxAssignment_11 ) ) ;
    public final void rule__Range__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1875:1: ( ( ( rule__Range__MaxAssignment_11 ) ) )
            // InternalVformDSL.g:1876:1: ( ( rule__Range__MaxAssignment_11 ) )
            {
            // InternalVformDSL.g:1876:1: ( ( rule__Range__MaxAssignment_11 ) )
            // InternalVformDSL.g:1877:2: ( rule__Range__MaxAssignment_11 )
            {
             before(grammarAccess.getRangeAccess().getMaxAssignment_11()); 
            // InternalVformDSL.g:1878:2: ( rule__Range__MaxAssignment_11 )
            // InternalVformDSL.g:1878:3: rule__Range__MaxAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Range__MaxAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMaxAssignment_11()); 

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
    // $ANTLR end "rule__Range__Group__11__Impl"


    // $ANTLR start "rule__Range__Group__12"
    // InternalVformDSL.g:1886:1: rule__Range__Group__12 : rule__Range__Group__12__Impl ;
    public final void rule__Range__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1890:1: ( rule__Range__Group__12__Impl )
            // InternalVformDSL.g:1891:2: rule__Range__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__12__Impl();

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
    // $ANTLR end "rule__Range__Group__12"


    // $ANTLR start "rule__Range__Group__12__Impl"
    // InternalVformDSL.g:1897:1: rule__Range__Group__12__Impl : ( '}' ) ;
    public final void rule__Range__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1901:1: ( ( '}' ) )
            // InternalVformDSL.g:1902:1: ( '}' )
            {
            // InternalVformDSL.g:1902:1: ( '}' )
            // InternalVformDSL.g:1903:2: '}'
            {
             before(grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Range__Group__12__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalVformDSL.g:1913:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1917:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalVformDSL.g:1918:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVformDSL.g:1925:1: rule__Select__Group__0__Impl : ( '{' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1929:1: ( ( '{' ) )
            // InternalVformDSL.g:1930:1: ( '{' )
            {
            // InternalVformDSL.g:1930:1: ( '{' )
            // InternalVformDSL.g:1931:2: '{'
            {
             before(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:1940:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1944:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalVformDSL.g:1945:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalVformDSL.g:1952:1: rule__Select__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1956:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:1957:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:1957:1: ( 'inputType:' )
            // InternalVformDSL.g:1958:2: 'inputType:'
            {
             before(grammarAccess.getSelectAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputTypeKeyword_1()); 

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
    // InternalVformDSL.g:1967:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1971:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalVformDSL.g:1972:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:1979:1: rule__Select__Group__2__Impl : ( 'select' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1983:1: ( ( 'select' ) )
            // InternalVformDSL.g:1984:1: ( 'select' )
            {
            // InternalVformDSL.g:1984:1: ( 'select' )
            // InternalVformDSL.g:1985:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_2()); 

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
    // InternalVformDSL.g:1994:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:1998:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalVformDSL.g:1999:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalVformDSL.g:2006:1: rule__Select__Group__3__Impl : ( ',' ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2010:1: ( ( ',' ) )
            // InternalVformDSL.g:2011:1: ( ',' )
            {
            // InternalVformDSL.g:2011:1: ( ',' )
            // InternalVformDSL.g:2012:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_3()); 

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
    // InternalVformDSL.g:2021:1: rule__Select__Group__4 : rule__Select__Group__4__Impl rule__Select__Group__5 ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2025:1: ( rule__Select__Group__4__Impl rule__Select__Group__5 )
            // InternalVformDSL.g:2026:2: rule__Select__Group__4__Impl rule__Select__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalVformDSL.g:2033:1: rule__Select__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2037:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:2038:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:2038:1: ( 'inputName:' )
            // InternalVformDSL.g:2039:2: 'inputName:'
            {
             before(grammarAccess.getSelectAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputNameKeyword_4()); 

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
    // InternalVformDSL.g:2048:1: rule__Select__Group__5 : rule__Select__Group__5__Impl rule__Select__Group__6 ;
    public final void rule__Select__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2052:1: ( rule__Select__Group__5__Impl rule__Select__Group__6 )
            // InternalVformDSL.g:2053:2: rule__Select__Group__5__Impl rule__Select__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Select__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__6();

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
    // InternalVformDSL.g:2060:1: rule__Select__Group__5__Impl : ( ( rule__Select__InputNameAssignment_5 ) ) ;
    public final void rule__Select__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2064:1: ( ( ( rule__Select__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:2065:1: ( ( rule__Select__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:2065:1: ( ( rule__Select__InputNameAssignment_5 ) )
            // InternalVformDSL.g:2066:2: ( rule__Select__InputNameAssignment_5 )
            {
             before(grammarAccess.getSelectAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:2067:2: ( rule__Select__InputNameAssignment_5 )
            // InternalVformDSL.g:2067:3: rule__Select__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Select__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getInputNameAssignment_5()); 

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


    // $ANTLR start "rule__Select__Group__6"
    // InternalVformDSL.g:2075:1: rule__Select__Group__6 : rule__Select__Group__6__Impl rule__Select__Group__7 ;
    public final void rule__Select__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2079:1: ( rule__Select__Group__6__Impl rule__Select__Group__7 )
            // InternalVformDSL.g:2080:2: rule__Select__Group__6__Impl rule__Select__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Select__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__7();

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
    // $ANTLR end "rule__Select__Group__6"


    // $ANTLR start "rule__Select__Group__6__Impl"
    // InternalVformDSL.g:2087:1: rule__Select__Group__6__Impl : ( ',' ) ;
    public final void rule__Select__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2091:1: ( ( ',' ) )
            // InternalVformDSL.g:2092:1: ( ',' )
            {
            // InternalVformDSL.g:2092:1: ( ',' )
            // InternalVformDSL.g:2093:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Select__Group__6__Impl"


    // $ANTLR start "rule__Select__Group__7"
    // InternalVformDSL.g:2102:1: rule__Select__Group__7 : rule__Select__Group__7__Impl rule__Select__Group__8 ;
    public final void rule__Select__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2106:1: ( rule__Select__Group__7__Impl rule__Select__Group__8 )
            // InternalVformDSL.g:2107:2: rule__Select__Group__7__Impl rule__Select__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Select__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__8();

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
    // $ANTLR end "rule__Select__Group__7"


    // $ANTLR start "rule__Select__Group__7__Impl"
    // InternalVformDSL.g:2114:1: rule__Select__Group__7__Impl : ( 'options:' ) ;
    public final void rule__Select__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2118:1: ( ( 'options:' ) )
            // InternalVformDSL.g:2119:1: ( 'options:' )
            {
            // InternalVformDSL.g:2119:1: ( 'options:' )
            // InternalVformDSL.g:2120:2: 'options:'
            {
             before(grammarAccess.getSelectAccess().getOptionsKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getOptionsKeyword_7()); 

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
    // $ANTLR end "rule__Select__Group__7__Impl"


    // $ANTLR start "rule__Select__Group__8"
    // InternalVformDSL.g:2129:1: rule__Select__Group__8 : rule__Select__Group__8__Impl rule__Select__Group__9 ;
    public final void rule__Select__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2133:1: ( rule__Select__Group__8__Impl rule__Select__Group__9 )
            // InternalVformDSL.g:2134:2: rule__Select__Group__8__Impl rule__Select__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__9();

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
    // $ANTLR end "rule__Select__Group__8"


    // $ANTLR start "rule__Select__Group__8__Impl"
    // InternalVformDSL.g:2141:1: rule__Select__Group__8__Impl : ( ( rule__Select__Alternatives_8 ) ) ;
    public final void rule__Select__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2145:1: ( ( ( rule__Select__Alternatives_8 ) ) )
            // InternalVformDSL.g:2146:1: ( ( rule__Select__Alternatives_8 ) )
            {
            // InternalVformDSL.g:2146:1: ( ( rule__Select__Alternatives_8 ) )
            // InternalVformDSL.g:2147:2: ( rule__Select__Alternatives_8 )
            {
             before(grammarAccess.getSelectAccess().getAlternatives_8()); 
            // InternalVformDSL.g:2148:2: ( rule__Select__Alternatives_8 )
            // InternalVformDSL.g:2148:3: rule__Select__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives_8()); 

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
    // $ANTLR end "rule__Select__Group__8__Impl"


    // $ANTLR start "rule__Select__Group__9"
    // InternalVformDSL.g:2156:1: rule__Select__Group__9 : rule__Select__Group__9__Impl ;
    public final void rule__Select__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2160:1: ( rule__Select__Group__9__Impl )
            // InternalVformDSL.g:2161:2: rule__Select__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__9__Impl();

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
    // $ANTLR end "rule__Select__Group__9"


    // $ANTLR start "rule__Select__Group__9__Impl"
    // InternalVformDSL.g:2167:1: rule__Select__Group__9__Impl : ( '}' ) ;
    public final void rule__Select__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2171:1: ( ( '}' ) )
            // InternalVformDSL.g:2172:1: ( '}' )
            {
            // InternalVformDSL.g:2172:1: ( '}' )
            // InternalVformDSL.g:2173:2: '}'
            {
             before(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Select__Group__9__Impl"


    // $ANTLR start "rule__Search__Group__0"
    // InternalVformDSL.g:2183:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2187:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalVformDSL.g:2188:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__1();

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
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // InternalVformDSL.g:2195:1: rule__Search__Group__0__Impl : ( '{' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2199:1: ( ( '{' ) )
            // InternalVformDSL.g:2200:1: ( '{' )
            {
            // InternalVformDSL.g:2200:1: ( '{' )
            // InternalVformDSL.g:2201:2: '{'
            {
             before(grammarAccess.getSearchAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // InternalVformDSL.g:2210:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2214:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalVformDSL.g:2215:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Search__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__2();

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
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // InternalVformDSL.g:2222:1: rule__Search__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2226:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:2227:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:2227:1: ( 'inputType:' )
            // InternalVformDSL.g:2228:2: 'inputType:'
            {
             before(grammarAccess.getSearchAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getInputTypeKeyword_1()); 

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
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__2"
    // InternalVformDSL.g:2237:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2241:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalVformDSL.g:2242:2: rule__Search__Group__2__Impl rule__Search__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Search__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__3();

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
    // $ANTLR end "rule__Search__Group__2"


    // $ANTLR start "rule__Search__Group__2__Impl"
    // InternalVformDSL.g:2249:1: rule__Search__Group__2__Impl : ( 'select' ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2253:1: ( ( 'select' ) )
            // InternalVformDSL.g:2254:1: ( 'select' )
            {
            // InternalVformDSL.g:2254:1: ( 'select' )
            // InternalVformDSL.g:2255:2: 'select'
            {
             before(grammarAccess.getSearchAccess().getSelectKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getSelectKeyword_2()); 

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
    // $ANTLR end "rule__Search__Group__2__Impl"


    // $ANTLR start "rule__Search__Group__3"
    // InternalVformDSL.g:2264:1: rule__Search__Group__3 : rule__Search__Group__3__Impl rule__Search__Group__4 ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2268:1: ( rule__Search__Group__3__Impl rule__Search__Group__4 )
            // InternalVformDSL.g:2269:2: rule__Search__Group__3__Impl rule__Search__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Search__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__4();

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
    // $ANTLR end "rule__Search__Group__3"


    // $ANTLR start "rule__Search__Group__3__Impl"
    // InternalVformDSL.g:2276:1: rule__Search__Group__3__Impl : ( ',' ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2280:1: ( ( ',' ) )
            // InternalVformDSL.g:2281:1: ( ',' )
            {
            // InternalVformDSL.g:2281:1: ( ',' )
            // InternalVformDSL.g:2282:2: ','
            {
             before(grammarAccess.getSearchAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Search__Group__3__Impl"


    // $ANTLR start "rule__Search__Group__4"
    // InternalVformDSL.g:2291:1: rule__Search__Group__4 : rule__Search__Group__4__Impl rule__Search__Group__5 ;
    public final void rule__Search__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2295:1: ( rule__Search__Group__4__Impl rule__Search__Group__5 )
            // InternalVformDSL.g:2296:2: rule__Search__Group__4__Impl rule__Search__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Search__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__5();

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
    // $ANTLR end "rule__Search__Group__4"


    // $ANTLR start "rule__Search__Group__4__Impl"
    // InternalVformDSL.g:2303:1: rule__Search__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Search__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2307:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:2308:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:2308:1: ( 'inputName:' )
            // InternalVformDSL.g:2309:2: 'inputName:'
            {
             before(grammarAccess.getSearchAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Search__Group__4__Impl"


    // $ANTLR start "rule__Search__Group__5"
    // InternalVformDSL.g:2318:1: rule__Search__Group__5 : rule__Search__Group__5__Impl rule__Search__Group__6 ;
    public final void rule__Search__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2322:1: ( rule__Search__Group__5__Impl rule__Search__Group__6 )
            // InternalVformDSL.g:2323:2: rule__Search__Group__5__Impl rule__Search__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Search__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__6();

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
    // $ANTLR end "rule__Search__Group__5"


    // $ANTLR start "rule__Search__Group__5__Impl"
    // InternalVformDSL.g:2330:1: rule__Search__Group__5__Impl : ( ( rule__Search__InputNameAssignment_5 ) ) ;
    public final void rule__Search__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2334:1: ( ( ( rule__Search__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:2335:1: ( ( rule__Search__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:2335:1: ( ( rule__Search__InputNameAssignment_5 ) )
            // InternalVformDSL.g:2336:2: ( rule__Search__InputNameAssignment_5 )
            {
             before(grammarAccess.getSearchAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:2337:2: ( rule__Search__InputNameAssignment_5 )
            // InternalVformDSL.g:2337:3: rule__Search__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Search__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Search__Group__5__Impl"


    // $ANTLR start "rule__Search__Group__6"
    // InternalVformDSL.g:2345:1: rule__Search__Group__6 : rule__Search__Group__6__Impl rule__Search__Group__7 ;
    public final void rule__Search__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2349:1: ( rule__Search__Group__6__Impl rule__Search__Group__7 )
            // InternalVformDSL.g:2350:2: rule__Search__Group__6__Impl rule__Search__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Search__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__7();

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
    // $ANTLR end "rule__Search__Group__6"


    // $ANTLR start "rule__Search__Group__6__Impl"
    // InternalVformDSL.g:2357:1: rule__Search__Group__6__Impl : ( ',' ) ;
    public final void rule__Search__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2361:1: ( ( ',' ) )
            // InternalVformDSL.g:2362:1: ( ',' )
            {
            // InternalVformDSL.g:2362:1: ( ',' )
            // InternalVformDSL.g:2363:2: ','
            {
             before(grammarAccess.getSearchAccess().getCommaKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Search__Group__6__Impl"


    // $ANTLR start "rule__Search__Group__7"
    // InternalVformDSL.g:2372:1: rule__Search__Group__7 : rule__Search__Group__7__Impl rule__Search__Group__8 ;
    public final void rule__Search__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2376:1: ( rule__Search__Group__7__Impl rule__Search__Group__8 )
            // InternalVformDSL.g:2377:2: rule__Search__Group__7__Impl rule__Search__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Search__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__8();

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
    // $ANTLR end "rule__Search__Group__7"


    // $ANTLR start "rule__Search__Group__7__Impl"
    // InternalVformDSL.g:2384:1: rule__Search__Group__7__Impl : ( 'options:' ) ;
    public final void rule__Search__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2388:1: ( ( 'options:' ) )
            // InternalVformDSL.g:2389:1: ( 'options:' )
            {
            // InternalVformDSL.g:2389:1: ( 'options:' )
            // InternalVformDSL.g:2390:2: 'options:'
            {
             before(grammarAccess.getSearchAccess().getOptionsKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getOptionsKeyword_7()); 

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
    // $ANTLR end "rule__Search__Group__7__Impl"


    // $ANTLR start "rule__Search__Group__8"
    // InternalVformDSL.g:2399:1: rule__Search__Group__8 : rule__Search__Group__8__Impl rule__Search__Group__9 ;
    public final void rule__Search__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2403:1: ( rule__Search__Group__8__Impl rule__Search__Group__9 )
            // InternalVformDSL.g:2404:2: rule__Search__Group__8__Impl rule__Search__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Search__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__9();

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
    // $ANTLR end "rule__Search__Group__8"


    // $ANTLR start "rule__Search__Group__8__Impl"
    // InternalVformDSL.g:2411:1: rule__Search__Group__8__Impl : ( '[' ) ;
    public final void rule__Search__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2415:1: ( ( '[' ) )
            // InternalVformDSL.g:2416:1: ( '[' )
            {
            // InternalVformDSL.g:2416:1: ( '[' )
            // InternalVformDSL.g:2417:2: '['
            {
             before(grammarAccess.getSearchAccess().getLeftSquareBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getLeftSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Search__Group__8__Impl"


    // $ANTLR start "rule__Search__Group__9"
    // InternalVformDSL.g:2426:1: rule__Search__Group__9 : rule__Search__Group__9__Impl rule__Search__Group__10 ;
    public final void rule__Search__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2430:1: ( rule__Search__Group__9__Impl rule__Search__Group__10 )
            // InternalVformDSL.g:2431:2: rule__Search__Group__9__Impl rule__Search__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Search__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__10();

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
    // $ANTLR end "rule__Search__Group__9"


    // $ANTLR start "rule__Search__Group__9__Impl"
    // InternalVformDSL.g:2438:1: rule__Search__Group__9__Impl : ( ( rule__Search__Alternatives_9 ) ) ;
    public final void rule__Search__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2442:1: ( ( ( rule__Search__Alternatives_9 ) ) )
            // InternalVformDSL.g:2443:1: ( ( rule__Search__Alternatives_9 ) )
            {
            // InternalVformDSL.g:2443:1: ( ( rule__Search__Alternatives_9 ) )
            // InternalVformDSL.g:2444:2: ( rule__Search__Alternatives_9 )
            {
             before(grammarAccess.getSearchAccess().getAlternatives_9()); 
            // InternalVformDSL.g:2445:2: ( rule__Search__Alternatives_9 )
            // InternalVformDSL.g:2445:3: rule__Search__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Search__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getAlternatives_9()); 

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
    // $ANTLR end "rule__Search__Group__9__Impl"


    // $ANTLR start "rule__Search__Group__10"
    // InternalVformDSL.g:2453:1: rule__Search__Group__10 : rule__Search__Group__10__Impl rule__Search__Group__11 ;
    public final void rule__Search__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2457:1: ( rule__Search__Group__10__Impl rule__Search__Group__11 )
            // InternalVformDSL.g:2458:2: rule__Search__Group__10__Impl rule__Search__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Search__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__11();

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
    // $ANTLR end "rule__Search__Group__10"


    // $ANTLR start "rule__Search__Group__10__Impl"
    // InternalVformDSL.g:2465:1: rule__Search__Group__10__Impl : ( ']' ) ;
    public final void rule__Search__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2469:1: ( ( ']' ) )
            // InternalVformDSL.g:2470:1: ( ']' )
            {
            // InternalVformDSL.g:2470:1: ( ']' )
            // InternalVformDSL.g:2471:2: ']'
            {
             before(grammarAccess.getSearchAccess().getRightSquareBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__Search__Group__10__Impl"


    // $ANTLR start "rule__Search__Group__11"
    // InternalVformDSL.g:2480:1: rule__Search__Group__11 : rule__Search__Group__11__Impl ;
    public final void rule__Search__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2484:1: ( rule__Search__Group__11__Impl )
            // InternalVformDSL.g:2485:2: rule__Search__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__11__Impl();

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
    // $ANTLR end "rule__Search__Group__11"


    // $ANTLR start "rule__Search__Group__11__Impl"
    // InternalVformDSL.g:2491:1: rule__Search__Group__11__Impl : ( '}' ) ;
    public final void rule__Search__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2495:1: ( ( '}' ) )
            // InternalVformDSL.g:2496:1: ( '}' )
            {
            // InternalVformDSL.g:2496:1: ( '}' )
            // InternalVformDSL.g:2497:2: '}'
            {
             before(grammarAccess.getSearchAccess().getRightCurlyBracketKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Search__Group__11__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalVformDSL.g:2507:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2511:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalVformDSL.g:2512:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalVformDSL.g:2519:1: rule__Group__Group__0__Impl : ( '{' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2523:1: ( ( '{' ) )
            // InternalVformDSL.g:2524:1: ( '{' )
            {
            // InternalVformDSL.g:2524:1: ( '{' )
            // InternalVformDSL.g:2525:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalVformDSL.g:2534:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2538:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalVformDSL.g:2539:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalVformDSL.g:2546:1: rule__Group__Group__1__Impl : ( 'inputType:' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2550:1: ( ( 'inputType:' ) )
            // InternalVformDSL.g:2551:1: ( 'inputType:' )
            {
            // InternalVformDSL.g:2551:1: ( 'inputType:' )
            // InternalVformDSL.g:2552:2: 'inputType:'
            {
             before(grammarAccess.getGroupAccess().getInputTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getInputTypeKeyword_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalVformDSL.g:2561:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2565:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalVformDSL.g:2566:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalVformDSL.g:2573:1: rule__Group__Group__2__Impl : ( 'group' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2577:1: ( ( 'group' ) )
            // InternalVformDSL.g:2578:1: ( 'group' )
            {
            // InternalVformDSL.g:2578:1: ( 'group' )
            // InternalVformDSL.g:2579:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalVformDSL.g:2588:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2592:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalVformDSL.g:2593:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

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
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalVformDSL.g:2600:1: rule__Group__Group__3__Impl : ( ',' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2604:1: ( ( ',' ) )
            // InternalVformDSL.g:2605:1: ( ',' )
            {
            // InternalVformDSL.g:2605:1: ( ',' )
            // InternalVformDSL.g:2606:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalVformDSL.g:2615:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2619:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalVformDSL.g:2620:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

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
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalVformDSL.g:2627:1: rule__Group__Group__4__Impl : ( 'inputName:' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2631:1: ( ( 'inputName:' ) )
            // InternalVformDSL.g:2632:1: ( 'inputName:' )
            {
            // InternalVformDSL.g:2632:1: ( 'inputName:' )
            // InternalVformDSL.g:2633:2: 'inputName:'
            {
             before(grammarAccess.getGroupAccess().getInputNameKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getInputNameKeyword_4()); 

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
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalVformDSL.g:2642:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2646:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // InternalVformDSL.g:2647:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__6();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalVformDSL.g:2654:1: rule__Group__Group__5__Impl : ( ( rule__Group__InputNameAssignment_5 ) ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2658:1: ( ( ( rule__Group__InputNameAssignment_5 ) ) )
            // InternalVformDSL.g:2659:1: ( ( rule__Group__InputNameAssignment_5 ) )
            {
            // InternalVformDSL.g:2659:1: ( ( rule__Group__InputNameAssignment_5 ) )
            // InternalVformDSL.g:2660:2: ( rule__Group__InputNameAssignment_5 )
            {
             before(grammarAccess.getGroupAccess().getInputNameAssignment_5()); 
            // InternalVformDSL.g:2661:2: ( rule__Group__InputNameAssignment_5 )
            // InternalVformDSL.g:2661:3: rule__Group__InputNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Group__InputNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getInputNameAssignment_5()); 

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
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // InternalVformDSL.g:2669:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2673:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // InternalVformDSL.g:2674:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Group__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__7();

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
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // InternalVformDSL.g:2681:1: rule__Group__Group__6__Impl : ( ',' ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2685:1: ( ( ',' ) )
            // InternalVformDSL.g:2686:1: ( ',' )
            {
            // InternalVformDSL.g:2686:1: ( ',' )
            // InternalVformDSL.g:2687:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // InternalVformDSL.g:2696:1: rule__Group__Group__7 : rule__Group__Group__7__Impl rule__Group__Group__8 ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2700:1: ( rule__Group__Group__7__Impl rule__Group__Group__8 )
            // InternalVformDSL.g:2701:2: rule__Group__Group__7__Impl rule__Group__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Group__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__8();

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
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // InternalVformDSL.g:2708:1: rule__Group__Group__7__Impl : ( 'groupInputs:' ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2712:1: ( ( 'groupInputs:' ) )
            // InternalVformDSL.g:2713:1: ( 'groupInputs:' )
            {
            // InternalVformDSL.g:2713:1: ( 'groupInputs:' )
            // InternalVformDSL.g:2714:2: 'groupInputs:'
            {
             before(grammarAccess.getGroupAccess().getGroupInputsKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupInputsKeyword_7()); 

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
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__Group__Group__8"
    // InternalVformDSL.g:2723:1: rule__Group__Group__8 : rule__Group__Group__8__Impl rule__Group__Group__9 ;
    public final void rule__Group__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2727:1: ( rule__Group__Group__8__Impl rule__Group__Group__9 )
            // InternalVformDSL.g:2728:2: rule__Group__Group__8__Impl rule__Group__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Group__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__9();

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
    // $ANTLR end "rule__Group__Group__8"


    // $ANTLR start "rule__Group__Group__8__Impl"
    // InternalVformDSL.g:2735:1: rule__Group__Group__8__Impl : ( ( rule__Group__GroupInputsAssignment_8 )* ) ;
    public final void rule__Group__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2739:1: ( ( ( rule__Group__GroupInputsAssignment_8 )* ) )
            // InternalVformDSL.g:2740:1: ( ( rule__Group__GroupInputsAssignment_8 )* )
            {
            // InternalVformDSL.g:2740:1: ( ( rule__Group__GroupInputsAssignment_8 )* )
            // InternalVformDSL.g:2741:2: ( rule__Group__GroupInputsAssignment_8 )*
            {
             before(grammarAccess.getGroupAccess().getGroupInputsAssignment_8()); 
            // InternalVformDSL.g:2742:2: ( rule__Group__GroupInputsAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVformDSL.g:2742:3: rule__Group__GroupInputsAssignment_8
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Group__GroupInputsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroupInputsAssignment_8()); 

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
    // $ANTLR end "rule__Group__Group__8__Impl"


    // $ANTLR start "rule__Group__Group__9"
    // InternalVformDSL.g:2750:1: rule__Group__Group__9 : rule__Group__Group__9__Impl ;
    public final void rule__Group__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2754:1: ( rule__Group__Group__9__Impl )
            // InternalVformDSL.g:2755:2: rule__Group__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__9__Impl();

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
    // $ANTLR end "rule__Group__Group__9"


    // $ANTLR start "rule__Group__Group__9__Impl"
    // InternalVformDSL.g:2761:1: rule__Group__Group__9__Impl : ( '}' ) ;
    public final void rule__Group__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2765:1: ( ( '}' ) )
            // InternalVformDSL.g:2766:1: ( '}' )
            {
            // InternalVformDSL.g:2766:1: ( '}' )
            // InternalVformDSL.g:2767:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Group__Group__9__Impl"


    // $ANTLR start "rule__DataOption__Group__0"
    // InternalVformDSL.g:2777:1: rule__DataOption__Group__0 : rule__DataOption__Group__0__Impl rule__DataOption__Group__1 ;
    public final void rule__DataOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2781:1: ( rule__DataOption__Group__0__Impl rule__DataOption__Group__1 )
            // InternalVformDSL.g:2782:2: rule__DataOption__Group__0__Impl rule__DataOption__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVformDSL.g:2789:1: rule__DataOption__Group__0__Impl : ( '{' ) ;
    public final void rule__DataOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2793:1: ( ( '{' ) )
            // InternalVformDSL.g:2794:1: ( '{' )
            {
            // InternalVformDSL.g:2794:1: ( '{' )
            // InternalVformDSL.g:2795:2: '{'
            {
             before(grammarAccess.getDataOptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:2804:1: rule__DataOption__Group__1 : rule__DataOption__Group__1__Impl rule__DataOption__Group__2 ;
    public final void rule__DataOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2808:1: ( rule__DataOption__Group__1__Impl rule__DataOption__Group__2 )
            // InternalVformDSL.g:2809:2: rule__DataOption__Group__1__Impl rule__DataOption__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVformDSL.g:2816:1: rule__DataOption__Group__1__Impl : ( 'optionType:' ) ;
    public final void rule__DataOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2820:1: ( ( 'optionType:' ) )
            // InternalVformDSL.g:2821:1: ( 'optionType:' )
            {
            // InternalVformDSL.g:2821:1: ( 'optionType:' )
            // InternalVformDSL.g:2822:2: 'optionType:'
            {
             before(grammarAccess.getDataOptionAccess().getOptionTypeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getOptionTypeKeyword_1()); 

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
    // InternalVformDSL.g:2831:1: rule__DataOption__Group__2 : rule__DataOption__Group__2__Impl rule__DataOption__Group__3 ;
    public final void rule__DataOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2835:1: ( rule__DataOption__Group__2__Impl rule__DataOption__Group__3 )
            // InternalVformDSL.g:2836:2: rule__DataOption__Group__2__Impl rule__DataOption__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:2843:1: rule__DataOption__Group__2__Impl : ( 'data' ) ;
    public final void rule__DataOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2847:1: ( ( 'data' ) )
            // InternalVformDSL.g:2848:1: ( 'data' )
            {
            // InternalVformDSL.g:2848:1: ( 'data' )
            // InternalVformDSL.g:2849:2: 'data'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVformDSL.g:2858:1: rule__DataOption__Group__3 : rule__DataOption__Group__3__Impl rule__DataOption__Group__4 ;
    public final void rule__DataOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2862:1: ( rule__DataOption__Group__3__Impl rule__DataOption__Group__4 )
            // InternalVformDSL.g:2863:2: rule__DataOption__Group__3__Impl rule__DataOption__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalVformDSL.g:2870:1: rule__DataOption__Group__3__Impl : ( ',' ) ;
    public final void rule__DataOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2874:1: ( ( ',' ) )
            // InternalVformDSL.g:2875:1: ( ',' )
            {
            // InternalVformDSL.g:2875:1: ( ',' )
            // InternalVformDSL.g:2876:2: ','
            {
             before(grammarAccess.getDataOptionAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getCommaKeyword_3()); 

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
    // InternalVformDSL.g:2885:1: rule__DataOption__Group__4 : rule__DataOption__Group__4__Impl rule__DataOption__Group__5 ;
    public final void rule__DataOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2889:1: ( rule__DataOption__Group__4__Impl rule__DataOption__Group__5 )
            // InternalVformDSL.g:2890:2: rule__DataOption__Group__4__Impl rule__DataOption__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalVformDSL.g:2897:1: rule__DataOption__Group__4__Impl : ( 'data:' ) ;
    public final void rule__DataOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2901:1: ( ( 'data:' ) )
            // InternalVformDSL.g:2902:1: ( 'data:' )
            {
            // InternalVformDSL.g:2902:1: ( 'data:' )
            // InternalVformDSL.g:2903:2: 'data:'
            {
             before(grammarAccess.getDataOptionAccess().getDataKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getDataKeyword_4()); 

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
    // InternalVformDSL.g:2912:1: rule__DataOption__Group__5 : rule__DataOption__Group__5__Impl rule__DataOption__Group__6 ;
    public final void rule__DataOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2916:1: ( rule__DataOption__Group__5__Impl rule__DataOption__Group__6 )
            // InternalVformDSL.g:2917:2: rule__DataOption__Group__5__Impl rule__DataOption__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalVformDSL.g:2924:1: rule__DataOption__Group__5__Impl : ( '[' ) ;
    public final void rule__DataOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2928:1: ( ( '[' ) )
            // InternalVformDSL.g:2929:1: ( '[' )
            {
            // InternalVformDSL.g:2929:1: ( '[' )
            // InternalVformDSL.g:2930:2: '['
            {
             before(grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_5()); 

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
    // InternalVformDSL.g:2939:1: rule__DataOption__Group__6 : rule__DataOption__Group__6__Impl rule__DataOption__Group__7 ;
    public final void rule__DataOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2943:1: ( rule__DataOption__Group__6__Impl rule__DataOption__Group__7 )
            // InternalVformDSL.g:2944:2: rule__DataOption__Group__6__Impl rule__DataOption__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalVformDSL.g:2951:1: rule__DataOption__Group__6__Impl : ( ( rule__DataOption__DataAssignment_6 )* ) ;
    public final void rule__DataOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2955:1: ( ( ( rule__DataOption__DataAssignment_6 )* ) )
            // InternalVformDSL.g:2956:1: ( ( rule__DataOption__DataAssignment_6 )* )
            {
            // InternalVformDSL.g:2956:1: ( ( rule__DataOption__DataAssignment_6 )* )
            // InternalVformDSL.g:2957:2: ( rule__DataOption__DataAssignment_6 )*
            {
             before(grammarAccess.getDataOptionAccess().getDataAssignment_6()); 
            // InternalVformDSL.g:2958:2: ( rule__DataOption__DataAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVformDSL.g:2958:3: rule__DataOption__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DataOption__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDataOptionAccess().getDataAssignment_6()); 

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
    // InternalVformDSL.g:2966:1: rule__DataOption__Group__7 : rule__DataOption__Group__7__Impl rule__DataOption__Group__8 ;
    public final void rule__DataOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2970:1: ( rule__DataOption__Group__7__Impl rule__DataOption__Group__8 )
            // InternalVformDSL.g:2971:2: rule__DataOption__Group__7__Impl rule__DataOption__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__DataOption__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__8();

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
    // InternalVformDSL.g:2978:1: rule__DataOption__Group__7__Impl : ( ']' ) ;
    public final void rule__DataOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2982:1: ( ( ']' ) )
            // InternalVformDSL.g:2983:1: ( ']' )
            {
            // InternalVformDSL.g:2983:1: ( ']' )
            // InternalVformDSL.g:2984:2: ']'
            {
             before(grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__DataOption__Group__8"
    // InternalVformDSL.g:2993:1: rule__DataOption__Group__8 : rule__DataOption__Group__8__Impl ;
    public final void rule__DataOption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:2997:1: ( rule__DataOption__Group__8__Impl )
            // InternalVformDSL.g:2998:2: rule__DataOption__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__8__Impl();

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
    // $ANTLR end "rule__DataOption__Group__8"


    // $ANTLR start "rule__DataOption__Group__8__Impl"
    // InternalVformDSL.g:3004:1: rule__DataOption__Group__8__Impl : ( '}' ) ;
    public final void rule__DataOption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3008:1: ( ( '}' ) )
            // InternalVformDSL.g:3009:1: ( '}' )
            {
            // InternalVformDSL.g:3009:1: ( '}' )
            // InternalVformDSL.g:3010:2: '}'
            {
             before(grammarAccess.getDataOptionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__DataOption__Group__8__Impl"


    // $ANTLR start "rule__EnumOption__Group__0"
    // InternalVformDSL.g:3020:1: rule__EnumOption__Group__0 : rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1 ;
    public final void rule__EnumOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3024:1: ( rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1 )
            // InternalVformDSL.g:3025:2: rule__EnumOption__Group__0__Impl rule__EnumOption__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVformDSL.g:3032:1: rule__EnumOption__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3036:1: ( ( '{' ) )
            // InternalVformDSL.g:3037:1: ( '{' )
            {
            // InternalVformDSL.g:3037:1: ( '{' )
            // InternalVformDSL.g:3038:2: '{'
            {
             before(grammarAccess.getEnumOptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:3047:1: rule__EnumOption__Group__1 : rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2 ;
    public final void rule__EnumOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3051:1: ( rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2 )
            // InternalVformDSL.g:3052:2: rule__EnumOption__Group__1__Impl rule__EnumOption__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalVformDSL.g:3059:1: rule__EnumOption__Group__1__Impl : ( 'optionType:' ) ;
    public final void rule__EnumOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3063:1: ( ( 'optionType:' ) )
            // InternalVformDSL.g:3064:1: ( 'optionType:' )
            {
            // InternalVformDSL.g:3064:1: ( 'optionType:' )
            // InternalVformDSL.g:3065:2: 'optionType:'
            {
             before(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_1()); 

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
    // InternalVformDSL.g:3074:1: rule__EnumOption__Group__2 : rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3 ;
    public final void rule__EnumOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3078:1: ( rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3 )
            // InternalVformDSL.g:3079:2: rule__EnumOption__Group__2__Impl rule__EnumOption__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:3086:1: rule__EnumOption__Group__2__Impl : ( 'enum' ) ;
    public final void rule__EnumOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3090:1: ( ( 'enum' ) )
            // InternalVformDSL.g:3091:1: ( 'enum' )
            {
            // InternalVformDSL.g:3091:1: ( 'enum' )
            // InternalVformDSL.g:3092:2: 'enum'
            {
             before(grammarAccess.getEnumOptionAccess().getEnumKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getEnumKeyword_2()); 

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
    // InternalVformDSL.g:3101:1: rule__EnumOption__Group__3 : rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4 ;
    public final void rule__EnumOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3105:1: ( rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4 )
            // InternalVformDSL.g:3106:2: rule__EnumOption__Group__3__Impl rule__EnumOption__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalVformDSL.g:3113:1: rule__EnumOption__Group__3__Impl : ( ',' ) ;
    public final void rule__EnumOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3117:1: ( ( ',' ) )
            // InternalVformDSL.g:3118:1: ( ',' )
            {
            // InternalVformDSL.g:3118:1: ( ',' )
            // InternalVformDSL.g:3119:2: ','
            {
             before(grammarAccess.getEnumOptionAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getCommaKeyword_3()); 

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
    // InternalVformDSL.g:3128:1: rule__EnumOption__Group__4 : rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5 ;
    public final void rule__EnumOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3132:1: ( rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5 )
            // InternalVformDSL.g:3133:2: rule__EnumOption__Group__4__Impl rule__EnumOption__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalVformDSL.g:3140:1: rule__EnumOption__Group__4__Impl : ( 'data:' ) ;
    public final void rule__EnumOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3144:1: ( ( 'data:' ) )
            // InternalVformDSL.g:3145:1: ( 'data:' )
            {
            // InternalVformDSL.g:3145:1: ( 'data:' )
            // InternalVformDSL.g:3146:2: 'data:'
            {
             before(grammarAccess.getEnumOptionAccess().getDataKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getDataKeyword_4()); 

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
    // InternalVformDSL.g:3155:1: rule__EnumOption__Group__5 : rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6 ;
    public final void rule__EnumOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3159:1: ( rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6 )
            // InternalVformDSL.g:3160:2: rule__EnumOption__Group__5__Impl rule__EnumOption__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalVformDSL.g:3167:1: rule__EnumOption__Group__5__Impl : ( '[' ) ;
    public final void rule__EnumOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3171:1: ( ( '[' ) )
            // InternalVformDSL.g:3172:1: ( '[' )
            {
            // InternalVformDSL.g:3172:1: ( '[' )
            // InternalVformDSL.g:3173:2: '['
            {
             before(grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_5()); 

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
    // InternalVformDSL.g:3182:1: rule__EnumOption__Group__6 : rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7 ;
    public final void rule__EnumOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3186:1: ( rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7 )
            // InternalVformDSL.g:3187:2: rule__EnumOption__Group__6__Impl rule__EnumOption__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalVformDSL.g:3194:1: rule__EnumOption__Group__6__Impl : ( ( rule__EnumOption__Alternatives_6 ) ) ;
    public final void rule__EnumOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3198:1: ( ( ( rule__EnumOption__Alternatives_6 ) ) )
            // InternalVformDSL.g:3199:1: ( ( rule__EnumOption__Alternatives_6 ) )
            {
            // InternalVformDSL.g:3199:1: ( ( rule__EnumOption__Alternatives_6 ) )
            // InternalVformDSL.g:3200:2: ( rule__EnumOption__Alternatives_6 )
            {
             before(grammarAccess.getEnumOptionAccess().getAlternatives_6()); 
            // InternalVformDSL.g:3201:2: ( rule__EnumOption__Alternatives_6 )
            // InternalVformDSL.g:3201:3: rule__EnumOption__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getEnumOptionAccess().getAlternatives_6()); 

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
    // InternalVformDSL.g:3209:1: rule__EnumOption__Group__7 : rule__EnumOption__Group__7__Impl rule__EnumOption__Group__8 ;
    public final void rule__EnumOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3213:1: ( rule__EnumOption__Group__7__Impl rule__EnumOption__Group__8 )
            // InternalVformDSL.g:3214:2: rule__EnumOption__Group__7__Impl rule__EnumOption__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__EnumOption__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__8();

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
    // InternalVformDSL.g:3221:1: rule__EnumOption__Group__7__Impl : ( ']' ) ;
    public final void rule__EnumOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3225:1: ( ( ']' ) )
            // InternalVformDSL.g:3226:1: ( ']' )
            {
            // InternalVformDSL.g:3226:1: ( ']' )
            // InternalVformDSL.g:3227:2: ']'
            {
             before(grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__EnumOption__Group__8"
    // InternalVformDSL.g:3236:1: rule__EnumOption__Group__8 : rule__EnumOption__Group__8__Impl ;
    public final void rule__EnumOption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3240:1: ( rule__EnumOption__Group__8__Impl )
            // InternalVformDSL.g:3241:2: rule__EnumOption__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumOption__Group__8__Impl();

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
    // $ANTLR end "rule__EnumOption__Group__8"


    // $ANTLR start "rule__EnumOption__Group__8__Impl"
    // InternalVformDSL.g:3247:1: rule__EnumOption__Group__8__Impl : ( '}' ) ;
    public final void rule__EnumOption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3251:1: ( ( '}' ) )
            // InternalVformDSL.g:3252:1: ( '}' )
            {
            // InternalVformDSL.g:3252:1: ( '}' )
            // InternalVformDSL.g:3253:2: '}'
            {
             before(grammarAccess.getEnumOptionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__EnumOption__Group__8__Impl"


    // $ANTLR start "rule__NumberOption__Group__0"
    // InternalVformDSL.g:3263:1: rule__NumberOption__Group__0 : rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 ;
    public final void rule__NumberOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3267:1: ( rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1 )
            // InternalVformDSL.g:3268:2: rule__NumberOption__Group__0__Impl rule__NumberOption__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVformDSL.g:3275:1: rule__NumberOption__Group__0__Impl : ( '{' ) ;
    public final void rule__NumberOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3279:1: ( ( '{' ) )
            // InternalVformDSL.g:3280:1: ( '{' )
            {
            // InternalVformDSL.g:3280:1: ( '{' )
            // InternalVformDSL.g:3281:2: '{'
            {
             before(grammarAccess.getNumberOptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getLeftCurlyBracketKeyword_0()); 

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
    // InternalVformDSL.g:3290:1: rule__NumberOption__Group__1 : rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 ;
    public final void rule__NumberOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3294:1: ( rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2 )
            // InternalVformDSL.g:3295:2: rule__NumberOption__Group__1__Impl rule__NumberOption__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVformDSL.g:3302:1: rule__NumberOption__Group__1__Impl : ( 'optionType:' ) ;
    public final void rule__NumberOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3306:1: ( ( 'optionType:' ) )
            // InternalVformDSL.g:3307:1: ( 'optionType:' )
            {
            // InternalVformDSL.g:3307:1: ( 'optionType:' )
            // InternalVformDSL.g:3308:2: 'optionType:'
            {
             before(grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_1()); 

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
    // InternalVformDSL.g:3317:1: rule__NumberOption__Group__2 : rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 ;
    public final void rule__NumberOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3321:1: ( rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3 )
            // InternalVformDSL.g:3322:2: rule__NumberOption__Group__2__Impl rule__NumberOption__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:3329:1: rule__NumberOption__Group__2__Impl : ( 'number' ) ;
    public final void rule__NumberOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3333:1: ( ( 'number' ) )
            // InternalVformDSL.g:3334:1: ( 'number' )
            {
            // InternalVformDSL.g:3334:1: ( 'number' )
            // InternalVformDSL.g:3335:2: 'number'
            {
             before(grammarAccess.getNumberOptionAccess().getNumberKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getNumberKeyword_2()); 

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
    // InternalVformDSL.g:3344:1: rule__NumberOption__Group__3 : rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 ;
    public final void rule__NumberOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3348:1: ( rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4 )
            // InternalVformDSL.g:3349:2: rule__NumberOption__Group__3__Impl rule__NumberOption__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalVformDSL.g:3356:1: rule__NumberOption__Group__3__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3360:1: ( ( ',' ) )
            // InternalVformDSL.g:3361:1: ( ',' )
            {
            // InternalVformDSL.g:3361:1: ( ',' )
            // InternalVformDSL.g:3362:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_3()); 

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
    // InternalVformDSL.g:3371:1: rule__NumberOption__Group__4 : rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 ;
    public final void rule__NumberOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3375:1: ( rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5 )
            // InternalVformDSL.g:3376:2: rule__NumberOption__Group__4__Impl rule__NumberOption__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalVformDSL.g:3383:1: rule__NumberOption__Group__4__Impl : ( 'min:' ) ;
    public final void rule__NumberOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3387:1: ( ( 'min:' ) )
            // InternalVformDSL.g:3388:1: ( 'min:' )
            {
            // InternalVformDSL.g:3388:1: ( 'min:' )
            // InternalVformDSL.g:3389:2: 'min:'
            {
             before(grammarAccess.getNumberOptionAccess().getMinKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinKeyword_4()); 

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
    // InternalVformDSL.g:3398:1: rule__NumberOption__Group__5 : rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 ;
    public final void rule__NumberOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3402:1: ( rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6 )
            // InternalVformDSL.g:3403:2: rule__NumberOption__Group__5__Impl rule__NumberOption__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:3410:1: rule__NumberOption__Group__5__Impl : ( ( rule__NumberOption__MinAssignment_5 ) ) ;
    public final void rule__NumberOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3414:1: ( ( ( rule__NumberOption__MinAssignment_5 ) ) )
            // InternalVformDSL.g:3415:1: ( ( rule__NumberOption__MinAssignment_5 ) )
            {
            // InternalVformDSL.g:3415:1: ( ( rule__NumberOption__MinAssignment_5 ) )
            // InternalVformDSL.g:3416:2: ( rule__NumberOption__MinAssignment_5 )
            {
             before(grammarAccess.getNumberOptionAccess().getMinAssignment_5()); 
            // InternalVformDSL.g:3417:2: ( rule__NumberOption__MinAssignment_5 )
            // InternalVformDSL.g:3417:3: rule__NumberOption__MinAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMinAssignment_5()); 

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
    // InternalVformDSL.g:3425:1: rule__NumberOption__Group__6 : rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 ;
    public final void rule__NumberOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3429:1: ( rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7 )
            // InternalVformDSL.g:3430:2: rule__NumberOption__Group__6__Impl rule__NumberOption__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalVformDSL.g:3437:1: rule__NumberOption__Group__6__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3441:1: ( ( ',' ) )
            // InternalVformDSL.g:3442:1: ( ',' )
            {
            // InternalVformDSL.g:3442:1: ( ',' )
            // InternalVformDSL.g:3443:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_6()); 

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
    // InternalVformDSL.g:3452:1: rule__NumberOption__Group__7 : rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8 ;
    public final void rule__NumberOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3456:1: ( rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8 )
            // InternalVformDSL.g:3457:2: rule__NumberOption__Group__7__Impl rule__NumberOption__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalVformDSL.g:3464:1: rule__NumberOption__Group__7__Impl : ( 'max:' ) ;
    public final void rule__NumberOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3468:1: ( ( 'max:' ) )
            // InternalVformDSL.g:3469:1: ( 'max:' )
            {
            // InternalVformDSL.g:3469:1: ( 'max:' )
            // InternalVformDSL.g:3470:2: 'max:'
            {
             before(grammarAccess.getNumberOptionAccess().getMaxKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxKeyword_7()); 

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
    // InternalVformDSL.g:3479:1: rule__NumberOption__Group__8 : rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9 ;
    public final void rule__NumberOption__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3483:1: ( rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9 )
            // InternalVformDSL.g:3484:2: rule__NumberOption__Group__8__Impl rule__NumberOption__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalVformDSL.g:3491:1: rule__NumberOption__Group__8__Impl : ( ( rule__NumberOption__MaxAssignment_8 ) ) ;
    public final void rule__NumberOption__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3495:1: ( ( ( rule__NumberOption__MaxAssignment_8 ) ) )
            // InternalVformDSL.g:3496:1: ( ( rule__NumberOption__MaxAssignment_8 ) )
            {
            // InternalVformDSL.g:3496:1: ( ( rule__NumberOption__MaxAssignment_8 ) )
            // InternalVformDSL.g:3497:2: ( rule__NumberOption__MaxAssignment_8 )
            {
             before(grammarAccess.getNumberOptionAccess().getMaxAssignment_8()); 
            // InternalVformDSL.g:3498:2: ( rule__NumberOption__MaxAssignment_8 )
            // InternalVformDSL.g:3498:3: rule__NumberOption__MaxAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__MaxAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getMaxAssignment_8()); 

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
    // InternalVformDSL.g:3506:1: rule__NumberOption__Group__9 : rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10 ;
    public final void rule__NumberOption__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3510:1: ( rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10 )
            // InternalVformDSL.g:3511:2: rule__NumberOption__Group__9__Impl rule__NumberOption__Group__10
            {
            pushFollow(FOLLOW_37);
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
    // InternalVformDSL.g:3518:1: rule__NumberOption__Group__9__Impl : ( ',' ) ;
    public final void rule__NumberOption__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3522:1: ( ( ',' ) )
            // InternalVformDSL.g:3523:1: ( ',' )
            {
            // InternalVformDSL.g:3523:1: ( ',' )
            // InternalVformDSL.g:3524:2: ','
            {
             before(grammarAccess.getNumberOptionAccess().getCommaKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getCommaKeyword_9()); 

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
    // InternalVformDSL.g:3533:1: rule__NumberOption__Group__10 : rule__NumberOption__Group__10__Impl rule__NumberOption__Group__11 ;
    public final void rule__NumberOption__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3537:1: ( rule__NumberOption__Group__10__Impl rule__NumberOption__Group__11 )
            // InternalVformDSL.g:3538:2: rule__NumberOption__Group__10__Impl rule__NumberOption__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__NumberOption__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__11();

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
    // InternalVformDSL.g:3545:1: rule__NumberOption__Group__10__Impl : ( 'range:' ) ;
    public final void rule__NumberOption__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3549:1: ( ( 'range:' ) )
            // InternalVformDSL.g:3550:1: ( 'range:' )
            {
            // InternalVformDSL.g:3550:1: ( 'range:' )
            // InternalVformDSL.g:3551:2: 'range:'
            {
             before(grammarAccess.getNumberOptionAccess().getRangeKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeKeyword_10()); 

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


    // $ANTLR start "rule__NumberOption__Group__11"
    // InternalVformDSL.g:3560:1: rule__NumberOption__Group__11 : rule__NumberOption__Group__11__Impl rule__NumberOption__Group__12 ;
    public final void rule__NumberOption__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3564:1: ( rule__NumberOption__Group__11__Impl rule__NumberOption__Group__12 )
            // InternalVformDSL.g:3565:2: rule__NumberOption__Group__11__Impl rule__NumberOption__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__NumberOption__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__12();

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
    // $ANTLR end "rule__NumberOption__Group__11"


    // $ANTLR start "rule__NumberOption__Group__11__Impl"
    // InternalVformDSL.g:3572:1: rule__NumberOption__Group__11__Impl : ( ( rule__NumberOption__RangeAssignment_11 ) ) ;
    public final void rule__NumberOption__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3576:1: ( ( ( rule__NumberOption__RangeAssignment_11 ) ) )
            // InternalVformDSL.g:3577:1: ( ( rule__NumberOption__RangeAssignment_11 ) )
            {
            // InternalVformDSL.g:3577:1: ( ( rule__NumberOption__RangeAssignment_11 ) )
            // InternalVformDSL.g:3578:2: ( rule__NumberOption__RangeAssignment_11 )
            {
             before(grammarAccess.getNumberOptionAccess().getRangeAssignment_11()); 
            // InternalVformDSL.g:3579:2: ( rule__NumberOption__RangeAssignment_11 )
            // InternalVformDSL.g:3579:3: rule__NumberOption__RangeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__RangeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getNumberOptionAccess().getRangeAssignment_11()); 

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
    // $ANTLR end "rule__NumberOption__Group__11__Impl"


    // $ANTLR start "rule__NumberOption__Group__12"
    // InternalVformDSL.g:3587:1: rule__NumberOption__Group__12 : rule__NumberOption__Group__12__Impl ;
    public final void rule__NumberOption__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3591:1: ( rule__NumberOption__Group__12__Impl )
            // InternalVformDSL.g:3592:2: rule__NumberOption__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberOption__Group__12__Impl();

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
    // $ANTLR end "rule__NumberOption__Group__12"


    // $ANTLR start "rule__NumberOption__Group__12__Impl"
    // InternalVformDSL.g:3598:1: rule__NumberOption__Group__12__Impl : ( '}' ) ;
    public final void rule__NumberOption__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3602:1: ( ( '}' ) )
            // InternalVformDSL.g:3603:1: ( '}' )
            {
            // InternalVformDSL.g:3603:1: ( '}' )
            // InternalVformDSL.g:3604:2: '}'
            {
             before(grammarAccess.getNumberOptionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__NumberOption__Group__12__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalVformDSL.g:3614:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3618:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalVformDSL.g:3619:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalVformDSL.g:3626:1: rule__Data__Group__0__Impl : ( '{' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3630:1: ( ( '{' ) )
            // InternalVformDSL.g:3631:1: ( '{' )
            {
            // InternalVformDSL.g:3631:1: ( '{' )
            // InternalVformDSL.g:3632:2: '{'
            {
             before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalVformDSL.g:3641:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3645:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalVformDSL.g:3646:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalVformDSL.g:3653:1: rule__Data__Group__1__Impl : ( 'label:' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3657:1: ( ( 'label:' ) )
            // InternalVformDSL.g:3658:1: ( 'label:' )
            {
            // InternalVformDSL.g:3658:1: ( 'label:' )
            // InternalVformDSL.g:3659:2: 'label:'
            {
             before(grammarAccess.getDataAccess().getLabelKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLabelKeyword_1()); 

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
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalVformDSL.g:3668:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3672:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalVformDSL.g:3673:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalVformDSL.g:3680:1: rule__Data__Group__2__Impl : ( ( rule__Data__LabelAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3684:1: ( ( ( rule__Data__LabelAssignment_2 ) ) )
            // InternalVformDSL.g:3685:1: ( ( rule__Data__LabelAssignment_2 ) )
            {
            // InternalVformDSL.g:3685:1: ( ( rule__Data__LabelAssignment_2 ) )
            // InternalVformDSL.g:3686:2: ( rule__Data__LabelAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getLabelAssignment_2()); 
            // InternalVformDSL.g:3687:2: ( rule__Data__LabelAssignment_2 )
            // InternalVformDSL.g:3687:3: rule__Data__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getLabelAssignment_2()); 

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
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalVformDSL.g:3695:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3699:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalVformDSL.g:3700:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalVformDSL.g:3707:1: rule__Data__Group__3__Impl : ( ',' ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3711:1: ( ( ',' ) )
            // InternalVformDSL.g:3712:1: ( ',' )
            {
            // InternalVformDSL.g:3712:1: ( ',' )
            // InternalVformDSL.g:3713:2: ','
            {
             before(grammarAccess.getDataAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalVformDSL.g:3722:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3726:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // InternalVformDSL.g:3727:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__5();

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
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalVformDSL.g:3734:1: rule__Data__Group__4__Impl : ( 'value:' ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3738:1: ( ( 'value:' ) )
            // InternalVformDSL.g:3739:1: ( 'value:' )
            {
            // InternalVformDSL.g:3739:1: ( 'value:' )
            // InternalVformDSL.g:3740:2: 'value:'
            {
             before(grammarAccess.getDataAccess().getValueKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getValueKeyword_4()); 

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
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__5"
    // InternalVformDSL.g:3749:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3753:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // InternalVformDSL.g:3754:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Data__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__6();

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
    // $ANTLR end "rule__Data__Group__5"


    // $ANTLR start "rule__Data__Group__5__Impl"
    // InternalVformDSL.g:3761:1: rule__Data__Group__5__Impl : ( ( rule__Data__Alternatives_5 ) ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3765:1: ( ( ( rule__Data__Alternatives_5 ) ) )
            // InternalVformDSL.g:3766:1: ( ( rule__Data__Alternatives_5 ) )
            {
            // InternalVformDSL.g:3766:1: ( ( rule__Data__Alternatives_5 ) )
            // InternalVformDSL.g:3767:2: ( rule__Data__Alternatives_5 )
            {
             before(grammarAccess.getDataAccess().getAlternatives_5()); 
            // InternalVformDSL.g:3768:2: ( rule__Data__Alternatives_5 )
            // InternalVformDSL.g:3768:3: rule__Data__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Data__Group__5__Impl"


    // $ANTLR start "rule__Data__Group__6"
    // InternalVformDSL.g:3776:1: rule__Data__Group__6 : rule__Data__Group__6__Impl ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3780:1: ( rule__Data__Group__6__Impl )
            // InternalVformDSL.g:3781:2: rule__Data__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__6__Impl();

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
    // $ANTLR end "rule__Data__Group__6"


    // $ANTLR start "rule__Data__Group__6__Impl"
    // InternalVformDSL.g:3787:1: rule__Data__Group__6__Impl : ( '}' ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3791:1: ( ( '}' ) )
            // InternalVformDSL.g:3792:1: ( '}' )
            {
            // InternalVformDSL.g:3792:1: ( '}' )
            // InternalVformDSL.g:3793:2: '}'
            {
             before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Data__Group__6__Impl"


    // $ANTLR start "rule__Model__FormLayoutAssignment_1"
    // InternalVformDSL.g:3803:1: rule__Model__FormLayoutAssignment_1 : ( ruleFormLayout ) ;
    public final void rule__Model__FormLayoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3807:1: ( ( ruleFormLayout ) )
            // InternalVformDSL.g:3808:2: ( ruleFormLayout )
            {
            // InternalVformDSL.g:3808:2: ( ruleFormLayout )
            // InternalVformDSL.g:3809:3: ruleFormLayout
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
    // InternalVformDSL.g:3818:1: rule__Model__FormInputAssignment_5 : ( ruleFormInput ) ;
    public final void rule__Model__FormInputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3822:1: ( ( ruleFormInput ) )
            // InternalVformDSL.g:3823:2: ( ruleFormInput )
            {
            // InternalVformDSL.g:3823:2: ( ruleFormInput )
            // InternalVformDSL.g:3824:3: ruleFormInput
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
    // InternalVformDSL.g:3833:1: rule__FormLayout__LayoutAssignment : ( ruleLayout ) ;
    public final void rule__FormLayout__LayoutAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3837:1: ( ( ruleLayout ) )
            // InternalVformDSL.g:3838:2: ( ruleLayout )
            {
            // InternalVformDSL.g:3838:2: ( ruleLayout )
            // InternalVformDSL.g:3839:3: ruleLayout
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


    // $ANTLR start "rule__FormInput__TextAssignment_0"
    // InternalVformDSL.g:3848:1: rule__FormInput__TextAssignment_0 : ( ruleText ) ;
    public final void rule__FormInput__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3852:1: ( ( ruleText ) )
            // InternalVformDSL.g:3853:2: ( ruleText )
            {
            // InternalVformDSL.g:3853:2: ( ruleText )
            // InternalVformDSL.g:3854:3: ruleText
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
    // InternalVformDSL.g:3863:1: rule__FormInput__CheckboxAssignment_1 : ( ruleCheckbox ) ;
    public final void rule__FormInput__CheckboxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3867:1: ( ( ruleCheckbox ) )
            // InternalVformDSL.g:3868:2: ( ruleCheckbox )
            {
            // InternalVformDSL.g:3868:2: ( ruleCheckbox )
            // InternalVformDSL.g:3869:3: ruleCheckbox
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
    // InternalVformDSL.g:3878:1: rule__FormInput__NumberAssignment_2 : ( ruleNumber ) ;
    public final void rule__FormInput__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3882:1: ( ( ruleNumber ) )
            // InternalVformDSL.g:3883:2: ( ruleNumber )
            {
            // InternalVformDSL.g:3883:2: ( ruleNumber )
            // InternalVformDSL.g:3884:3: ruleNumber
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
    // InternalVformDSL.g:3893:1: rule__FormInput__DatAssignment_3 : ( ruleDat ) ;
    public final void rule__FormInput__DatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3897:1: ( ( ruleDat ) )
            // InternalVformDSL.g:3898:2: ( ruleDat )
            {
            // InternalVformDSL.g:3898:2: ( ruleDat )
            // InternalVformDSL.g:3899:3: ruleDat
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
    // InternalVformDSL.g:3908:1: rule__FormInput__RangeAssignment_4 : ( ruleRange ) ;
    public final void rule__FormInput__RangeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3912:1: ( ( ruleRange ) )
            // InternalVformDSL.g:3913:2: ( ruleRange )
            {
            // InternalVformDSL.g:3913:2: ( ruleRange )
            // InternalVformDSL.g:3914:3: ruleRange
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
    // InternalVformDSL.g:3923:1: rule__FormInput__SelectAssignment_5 : ( ruleSelect ) ;
    public final void rule__FormInput__SelectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3927:1: ( ( ruleSelect ) )
            // InternalVformDSL.g:3928:2: ( ruleSelect )
            {
            // InternalVformDSL.g:3928:2: ( ruleSelect )
            // InternalVformDSL.g:3929:3: ruleSelect
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


    // $ANTLR start "rule__FormInput__SearchAssignment_6"
    // InternalVformDSL.g:3938:1: rule__FormInput__SearchAssignment_6 : ( ruleSearch ) ;
    public final void rule__FormInput__SearchAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3942:1: ( ( ruleSearch ) )
            // InternalVformDSL.g:3943:2: ( ruleSearch )
            {
            // InternalVformDSL.g:3943:2: ( ruleSearch )
            // InternalVformDSL.g:3944:3: ruleSearch
            {
             before(grammarAccess.getFormInputAccess().getSearchSearchParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getSearchSearchParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FormInput__SearchAssignment_6"


    // $ANTLR start "rule__FormInput__GroupAssignment_7"
    // InternalVformDSL.g:3953:1: rule__FormInput__GroupAssignment_7 : ( ruleGroup ) ;
    public final void rule__FormInput__GroupAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3957:1: ( ( ruleGroup ) )
            // InternalVformDSL.g:3958:2: ( ruleGroup )
            {
            // InternalVformDSL.g:3958:2: ( ruleGroup )
            // InternalVformDSL.g:3959:3: ruleGroup
            {
             before(grammarAccess.getFormInputAccess().getGroupGroupParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getFormInputAccess().getGroupGroupParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__FormInput__GroupAssignment_7"


    // $ANTLR start "rule__Text__InputNameAssignment_5"
    // InternalVformDSL.g:3968:1: rule__Text__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Text__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3972:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:3973:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:3973:2: ( RULE_STRING )
            // InternalVformDSL.g:3974:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Text__InputNameAssignment_5"


    // $ANTLR start "rule__Checkbox__InputNameAssignment_5"
    // InternalVformDSL.g:3983:1: rule__Checkbox__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Checkbox__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:3987:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:3988:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:3988:2: ( RULE_STRING )
            // InternalVformDSL.g:3989:3: RULE_STRING
            {
             before(grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Checkbox__InputNameAssignment_5"


    // $ANTLR start "rule__Number__InputNameAssignment_5"
    // InternalVformDSL.g:3998:1: rule__Number__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Number__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4002:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4003:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4003:2: ( RULE_STRING )
            // InternalVformDSL.g:4004:3: RULE_STRING
            {
             before(grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Number__InputNameAssignment_5"


    // $ANTLR start "rule__Dat__InputNameAssignment_5"
    // InternalVformDSL.g:4013:1: rule__Dat__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Dat__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4017:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4018:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4018:2: ( RULE_STRING )
            // InternalVformDSL.g:4019:3: RULE_STRING
            {
             before(grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Dat__InputNameAssignment_5"


    // $ANTLR start "rule__Range__InputNameAssignment_5"
    // InternalVformDSL.g:4028:1: rule__Range__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Range__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4032:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4033:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4033:2: ( RULE_STRING )
            // InternalVformDSL.g:4034:3: RULE_STRING
            {
             before(grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Range__InputNameAssignment_5"


    // $ANTLR start "rule__Range__MinAssignment_8"
    // InternalVformDSL.g:4043:1: rule__Range__MinAssignment_8 : ( RULE_INT ) ;
    public final void rule__Range__MinAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4047:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4048:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4048:2: ( RULE_INT )
            // InternalVformDSL.g:4049:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Range__MinAssignment_8"


    // $ANTLR start "rule__Range__MaxAssignment_11"
    // InternalVformDSL.g:4058:1: rule__Range__MaxAssignment_11 : ( RULE_INT ) ;
    public final void rule__Range__MaxAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4062:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4063:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4063:2: ( RULE_INT )
            // InternalVformDSL.g:4064:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Range__MaxAssignment_11"


    // $ANTLR start "rule__Select__InputNameAssignment_5"
    // InternalVformDSL.g:4073:1: rule__Select__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Select__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4077:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4078:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4078:2: ( RULE_STRING )
            // InternalVformDSL.g:4079:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Select__InputNameAssignment_5"


    // $ANTLR start "rule__Select__DataOptionAssignment_8_0"
    // InternalVformDSL.g:4088:1: rule__Select__DataOptionAssignment_8_0 : ( ruleDataOption ) ;
    public final void rule__Select__DataOptionAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4092:1: ( ( ruleDataOption ) )
            // InternalVformDSL.g:4093:2: ( ruleDataOption )
            {
            // InternalVformDSL.g:4093:2: ( ruleDataOption )
            // InternalVformDSL.g:4094:3: ruleDataOption
            {
             before(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__Select__DataOptionAssignment_8_0"


    // $ANTLR start "rule__Select__EnumOptionAssignment_8_1"
    // InternalVformDSL.g:4103:1: rule__Select__EnumOptionAssignment_8_1 : ( ruleEnumOption ) ;
    public final void rule__Select__EnumOptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4107:1: ( ( ruleEnumOption ) )
            // InternalVformDSL.g:4108:2: ( ruleEnumOption )
            {
            // InternalVformDSL.g:4108:2: ( ruleEnumOption )
            // InternalVformDSL.g:4109:3: ruleEnumOption
            {
             before(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Select__EnumOptionAssignment_8_1"


    // $ANTLR start "rule__Select__NumberOptionAssignment_8_2"
    // InternalVformDSL.g:4118:1: rule__Select__NumberOptionAssignment_8_2 : ( ruleNumberOption ) ;
    public final void rule__Select__NumberOptionAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4122:1: ( ( ruleNumberOption ) )
            // InternalVformDSL.g:4123:2: ( ruleNumberOption )
            {
            // InternalVformDSL.g:4123:2: ( ruleNumberOption )
            // InternalVformDSL.g:4124:3: ruleNumberOption
            {
             before(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberOption();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Select__NumberOptionAssignment_8_2"


    // $ANTLR start "rule__Search__InputNameAssignment_5"
    // InternalVformDSL.g:4133:1: rule__Search__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Search__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4137:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4138:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4138:2: ( RULE_STRING )
            // InternalVformDSL.g:4139:3: RULE_STRING
            {
             before(grammarAccess.getSearchAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Search__InputNameAssignment_5"


    // $ANTLR start "rule__Search__StringDataAssignment_9_0"
    // InternalVformDSL.g:4148:1: rule__Search__StringDataAssignment_9_0 : ( RULE_STRING ) ;
    public final void rule__Search__StringDataAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4152:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4153:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4153:2: ( RULE_STRING )
            // InternalVformDSL.g:4154:3: RULE_STRING
            {
             before(grammarAccess.getSearchAccess().getStringDataSTRINGTerminalRuleCall_9_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getStringDataSTRINGTerminalRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__Search__StringDataAssignment_9_0"


    // $ANTLR start "rule__Search__NumberDataAssignment_9_1"
    // InternalVformDSL.g:4163:1: rule__Search__NumberDataAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Search__NumberDataAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4167:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4168:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4168:2: ( RULE_INT )
            // InternalVformDSL.g:4169:3: RULE_INT
            {
             before(grammarAccess.getSearchAccess().getNumberDataINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getNumberDataINTTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Search__NumberDataAssignment_9_1"


    // $ANTLR start "rule__Search__DataAssignment_9_2"
    // InternalVformDSL.g:4178:1: rule__Search__DataAssignment_9_2 : ( ruleData ) ;
    public final void rule__Search__DataAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4182:1: ( ( ruleData ) )
            // InternalVformDSL.g:4183:2: ( ruleData )
            {
            // InternalVformDSL.g:4183:2: ( ruleData )
            // InternalVformDSL.g:4184:3: ruleData
            {
             before(grammarAccess.getSearchAccess().getDataDataParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getDataDataParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Search__DataAssignment_9_2"


    // $ANTLR start "rule__Group__InputNameAssignment_5"
    // InternalVformDSL.g:4193:1: rule__Group__InputNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Group__InputNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4197:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4198:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4198:2: ( RULE_STRING )
            // InternalVformDSL.g:4199:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getInputNameSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Group__InputNameAssignment_5"


    // $ANTLR start "rule__Group__GroupInputsAssignment_8"
    // InternalVformDSL.g:4208:1: rule__Group__GroupInputsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Group__GroupInputsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4212:1: ( ( ( RULE_ID ) ) )
            // InternalVformDSL.g:4213:2: ( ( RULE_ID ) )
            {
            // InternalVformDSL.g:4213:2: ( ( RULE_ID ) )
            // InternalVformDSL.g:4214:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getGroupInputsFormInputCrossReference_8_0()); 
            // InternalVformDSL.g:4215:3: ( RULE_ID )
            // InternalVformDSL.g:4216:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getGroupInputsFormInputIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupInputsFormInputIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getGroupInputsFormInputCrossReference_8_0()); 

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
    // $ANTLR end "rule__Group__GroupInputsAssignment_8"


    // $ANTLR start "rule__DataOption__DataAssignment_6"
    // InternalVformDSL.g:4227:1: rule__DataOption__DataAssignment_6 : ( ruleData ) ;
    public final void rule__DataOption__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4231:1: ( ( ruleData ) )
            // InternalVformDSL.g:4232:2: ( ruleData )
            {
            // InternalVformDSL.g:4232:2: ( ruleData )
            // InternalVformDSL.g:4233:3: ruleData
            {
             before(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DataOption__DataAssignment_6"


    // $ANTLR start "rule__EnumOption__StringDataAssignment_6_0"
    // InternalVformDSL.g:4242:1: rule__EnumOption__StringDataAssignment_6_0 : ( RULE_STRING ) ;
    public final void rule__EnumOption__StringDataAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4246:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4247:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4247:2: ( RULE_STRING )
            // InternalVformDSL.g:4248:3: RULE_STRING
            {
             before(grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_6_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__EnumOption__StringDataAssignment_6_0"


    // $ANTLR start "rule__EnumOption__NumberDataAssignment_6_1"
    // InternalVformDSL.g:4257:1: rule__EnumOption__NumberDataAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__EnumOption__NumberDataAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4261:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4262:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4262:2: ( RULE_INT )
            // InternalVformDSL.g:4263:3: RULE_INT
            {
             before(grammarAccess.getEnumOptionAccess().getNumberDataINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnumOptionAccess().getNumberDataINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__EnumOption__NumberDataAssignment_6_1"


    // $ANTLR start "rule__NumberOption__MinAssignment_5"
    // InternalVformDSL.g:4272:1: rule__NumberOption__MinAssignment_5 : ( RULE_INT ) ;
    public final void rule__NumberOption__MinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4276:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4277:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4277:2: ( RULE_INT )
            // InternalVformDSL.g:4278:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__NumberOption__MinAssignment_5"


    // $ANTLR start "rule__NumberOption__MaxAssignment_8"
    // InternalVformDSL.g:4287:1: rule__NumberOption__MaxAssignment_8 : ( RULE_INT ) ;
    public final void rule__NumberOption__MaxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4291:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4292:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4292:2: ( RULE_INT )
            // InternalVformDSL.g:4293:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__NumberOption__MaxAssignment_8"


    // $ANTLR start "rule__NumberOption__RangeAssignment_11"
    // InternalVformDSL.g:4302:1: rule__NumberOption__RangeAssignment_11 : ( RULE_INT ) ;
    public final void rule__NumberOption__RangeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4306:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4307:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4307:2: ( RULE_INT )
            // InternalVformDSL.g:4308:3: RULE_INT
            {
             before(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__NumberOption__RangeAssignment_11"


    // $ANTLR start "rule__Data__LabelAssignment_2"
    // InternalVformDSL.g:4317:1: rule__Data__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Data__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4321:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4322:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4322:2: ( RULE_STRING )
            // InternalVformDSL.g:4323:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Data__LabelAssignment_2"


    // $ANTLR start "rule__Data__StrValAssignment_5_0"
    // InternalVformDSL.g:4332:1: rule__Data__StrValAssignment_5_0 : ( RULE_STRING ) ;
    public final void rule__Data__StrValAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4336:1: ( ( RULE_STRING ) )
            // InternalVformDSL.g:4337:2: ( RULE_STRING )
            {
            // InternalVformDSL.g:4337:2: ( RULE_STRING )
            // InternalVformDSL.g:4338:3: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_5_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Data__StrValAssignment_5_0"


    // $ANTLR start "rule__Data__IntValAssignment_5_1"
    // InternalVformDSL.g:4347:1: rule__Data__IntValAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Data__IntValAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVformDSL.g:4351:1: ( ( RULE_INT ) )
            // InternalVformDSL.g:4352:2: ( RULE_INT )
            {
            // InternalVformDSL.g:4352:2: ( RULE_INT )
            // InternalVformDSL.g:4353:3: RULE_INT
            {
             before(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Data__IntValAssignment_5_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\22\1\23\1\24\1\uffff\1\16\5\uffff\1\25\1\4\1\16\1\36\1\20\2\uffff";
    static final String dfa_3s = "\1\22\1\23\1\37\1\uffff\1\16\5\uffff\1\25\1\4\1\16\1\36\1\22\2\uffff";
    static final String dfa_4s = "\3\uffff\1\3\1\uffff\1\4\1\5\1\10\1\1\1\2\5\uffff\1\6\1\7";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\10\2\uffff\1\11\1\3\1\5\1\6\2\uffff\1\4\1\uffff\1\7",
            "",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\20\1\uffff\1\17",
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
            return "443:1: rule__FormInput__Alternatives : ( ( ( rule__FormInput__TextAssignment_0 ) ) | ( ( rule__FormInput__CheckboxAssignment_1 ) ) | ( ( rule__FormInput__NumberAssignment_2 ) ) | ( ( rule__FormInput__DatAssignment_3 ) ) | ( ( rule__FormInput__RangeAssignment_4 ) ) | ( ( rule__FormInput__SelectAssignment_5 ) ) | ( ( rule__FormInput__SearchAssignment_6 ) ) | ( ( rule__FormInput__GroupAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});

}