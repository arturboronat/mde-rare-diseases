package cafeV.dsl.vforms.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cafeV.dsl.vforms.services.VformDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVformDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'formLayout'", "'formInputs'", "'inputType'", "'text'", "'inputName'", "'checkbox'", "'number'", "'date'", "'range'", "'min'", "'max'", "'select'", "'options'", "'optionType'", "'data'", "'label'", "'value'", "'enum'", "'horizontal'", "'vertical'"
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

        public InternalVformDSLParser(TokenStream input, VformDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VformDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVformDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVformDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalVformDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVformDSL.g:72:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) ) otherlv_2= 'formInputs' ( (lv_formInput_3_0= ruleFormInput ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_formLayout_1_0 = null;

        EObject lv_formInput_3_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:78:2: ( ( (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) ) otherlv_2= 'formInputs' ( (lv_formInput_3_0= ruleFormInput ) ) ) )
            // InternalVformDSL.g:79:2: ( (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) ) otherlv_2= 'formInputs' ( (lv_formInput_3_0= ruleFormInput ) ) )
            {
            // InternalVformDSL.g:79:2: ( (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) ) otherlv_2= 'formInputs' ( (lv_formInput_3_0= ruleFormInput ) ) )
            // InternalVformDSL.g:80:3: (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) ) otherlv_2= 'formInputs' ( (lv_formInput_3_0= ruleFormInput ) )
            {
            // InternalVformDSL.g:80:3: (otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) ) )
            // InternalVformDSL.g:81:4: otherlv_0= 'formLayout' ( (lv_formLayout_1_0= ruleFormLayout ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFormLayoutKeyword_0_0());
            			
            // InternalVformDSL.g:85:4: ( (lv_formLayout_1_0= ruleFormLayout ) )
            // InternalVformDSL.g:86:5: (lv_formLayout_1_0= ruleFormLayout )
            {
            // InternalVformDSL.g:86:5: (lv_formLayout_1_0= ruleFormLayout )
            // InternalVformDSL.g:87:6: lv_formLayout_1_0= ruleFormLayout
            {

            						newCompositeNode(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_formLayout_1_0=ruleFormLayout();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getModelRule());
            						}
            						set(
            							current,
            							"formLayout",
            							lv_formLayout_1_0,
            							"cafeV.dsl.vforms.VformDSL.FormLayout");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFormInputsKeyword_1());
            		
            // InternalVformDSL.g:109:3: ( (lv_formInput_3_0= ruleFormInput ) )
            // InternalVformDSL.g:110:4: (lv_formInput_3_0= ruleFormInput )
            {
            // InternalVformDSL.g:110:4: (lv_formInput_3_0= ruleFormInput )
            // InternalVformDSL.g:111:5: lv_formInput_3_0= ruleFormInput
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_formInput_3_0=ruleFormInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"formInput",
            						lv_formInput_3_0,
            						"cafeV.dsl.vforms.VformDSL.FormInput");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFormInput"
    // InternalVformDSL.g:132:1: entryRuleFormInput returns [EObject current=null] : iv_ruleFormInput= ruleFormInput EOF ;
    public final EObject entryRuleFormInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInput = null;


        try {
            // InternalVformDSL.g:132:50: (iv_ruleFormInput= ruleFormInput EOF )
            // InternalVformDSL.g:133:2: iv_ruleFormInput= ruleFormInput EOF
            {
             newCompositeNode(grammarAccess.getFormInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInput=ruleFormInput();

            state._fsp--;

             current =iv_ruleFormInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormInput"


    // $ANTLR start "ruleFormInput"
    // InternalVformDSL.g:139:1: ruleFormInput returns [EObject current=null] : ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) )* ;
    public final EObject ruleFormInput() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;

        EObject lv_checkbox_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_dat_3_0 = null;

        EObject lv_range_4_0 = null;

        EObject lv_select_5_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:145:2: ( ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) )* )
            // InternalVformDSL.g:146:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) )*
            {
            // InternalVformDSL.g:146:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) )*
            loop1:
            do {
                int alt1=7;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt1=1;
                        }
                        break;
                    case 17:
                        {
                        alt1=3;
                        }
                        break;
                    case 19:
                        {
                        alt1=5;
                        }
                        break;
                    case 22:
                        {
                        alt1=6;
                        }
                        break;
                    case 16:
                        {
                        alt1=2;
                        }
                        break;
                    case 18:
                        {
                        alt1=4;
                        }
                        break;

                    }

                }


                switch (alt1) {
            	case 1 :
            	    // InternalVformDSL.g:147:3: ( (lv_text_0_0= ruleText ) )
            	    {
            	    // InternalVformDSL.g:147:3: ( (lv_text_0_0= ruleText ) )
            	    // InternalVformDSL.g:148:4: (lv_text_0_0= ruleText )
            	    {
            	    // InternalVformDSL.g:148:4: (lv_text_0_0= ruleText )
            	    // InternalVformDSL.g:149:5: lv_text_0_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getTextTextParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_text_0_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"text",
            	    						lv_text_0_0,
            	    						"cafeV.dsl.vforms.VformDSL.Text");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVformDSL.g:167:3: ( (lv_checkbox_1_0= ruleCheckbox ) )
            	    {
            	    // InternalVformDSL.g:167:3: ( (lv_checkbox_1_0= ruleCheckbox ) )
            	    // InternalVformDSL.g:168:4: (lv_checkbox_1_0= ruleCheckbox )
            	    {
            	    // InternalVformDSL.g:168:4: (lv_checkbox_1_0= ruleCheckbox )
            	    // InternalVformDSL.g:169:5: lv_checkbox_1_0= ruleCheckbox
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getCheckboxCheckboxParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_checkbox_1_0=ruleCheckbox();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"checkbox",
            	    						lv_checkbox_1_0,
            	    						"cafeV.dsl.vforms.VformDSL.Checkbox");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVformDSL.g:187:3: ( (lv_number_2_0= ruleNumber ) )
            	    {
            	    // InternalVformDSL.g:187:3: ( (lv_number_2_0= ruleNumber ) )
            	    // InternalVformDSL.g:188:4: (lv_number_2_0= ruleNumber )
            	    {
            	    // InternalVformDSL.g:188:4: (lv_number_2_0= ruleNumber )
            	    // InternalVformDSL.g:189:5: lv_number_2_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getNumberNumberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_number_2_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"number",
            	    						lv_number_2_0,
            	    						"cafeV.dsl.vforms.VformDSL.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVformDSL.g:207:3: ( (lv_dat_3_0= ruleDat ) )
            	    {
            	    // InternalVformDSL.g:207:3: ( (lv_dat_3_0= ruleDat ) )
            	    // InternalVformDSL.g:208:4: (lv_dat_3_0= ruleDat )
            	    {
            	    // InternalVformDSL.g:208:4: (lv_dat_3_0= ruleDat )
            	    // InternalVformDSL.g:209:5: lv_dat_3_0= ruleDat
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getDatDatParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_dat_3_0=ruleDat();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dat",
            	    						lv_dat_3_0,
            	    						"cafeV.dsl.vforms.VformDSL.Dat");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVformDSL.g:227:3: ( (lv_range_4_0= ruleRange ) )
            	    {
            	    // InternalVformDSL.g:227:3: ( (lv_range_4_0= ruleRange ) )
            	    // InternalVformDSL.g:228:4: (lv_range_4_0= ruleRange )
            	    {
            	    // InternalVformDSL.g:228:4: (lv_range_4_0= ruleRange )
            	    // InternalVformDSL.g:229:5: lv_range_4_0= ruleRange
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getRangeRangeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_range_4_0=ruleRange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"range",
            	    						lv_range_4_0,
            	    						"cafeV.dsl.vforms.VformDSL.Range");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVformDSL.g:247:3: ( (lv_select_5_0= ruleSelect ) )
            	    {
            	    // InternalVformDSL.g:247:3: ( (lv_select_5_0= ruleSelect ) )
            	    // InternalVformDSL.g:248:4: (lv_select_5_0= ruleSelect )
            	    {
            	    // InternalVformDSL.g:248:4: (lv_select_5_0= ruleSelect )
            	    // InternalVformDSL.g:249:5: lv_select_5_0= ruleSelect
            	    {

            	    					newCompositeNode(grammarAccess.getFormInputAccess().getSelectSelectParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_select_5_0=ruleSelect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"select",
            	    						lv_select_5_0,
            	    						"cafeV.dsl.vforms.VformDSL.Select");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormInput"


    // $ANTLR start "entryRuleFormLayout"
    // InternalVformDSL.g:270:1: entryRuleFormLayout returns [EObject current=null] : iv_ruleFormLayout= ruleFormLayout EOF ;
    public final EObject entryRuleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormLayout = null;


        try {
            // InternalVformDSL.g:270:51: (iv_ruleFormLayout= ruleFormLayout EOF )
            // InternalVformDSL.g:271:2: iv_ruleFormLayout= ruleFormLayout EOF
            {
             newCompositeNode(grammarAccess.getFormLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormLayout=ruleFormLayout();

            state._fsp--;

             current =iv_ruleFormLayout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormLayout"


    // $ANTLR start "ruleFormLayout"
    // InternalVformDSL.g:277:1: ruleFormLayout returns [EObject current=null] : ( (lv_layout_0_0= ruleLayout ) ) ;
    public final EObject ruleFormLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_layout_0_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:283:2: ( ( (lv_layout_0_0= ruleLayout ) ) )
            // InternalVformDSL.g:284:2: ( (lv_layout_0_0= ruleLayout ) )
            {
            // InternalVformDSL.g:284:2: ( (lv_layout_0_0= ruleLayout ) )
            // InternalVformDSL.g:285:3: (lv_layout_0_0= ruleLayout )
            {
            // InternalVformDSL.g:285:3: (lv_layout_0_0= ruleLayout )
            // InternalVformDSL.g:286:4: lv_layout_0_0= ruleLayout
            {

            				newCompositeNode(grammarAccess.getFormLayoutAccess().getLayoutLayoutEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_layout_0_0=ruleLayout();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFormLayoutRule());
            				}
            				set(
            					current,
            					"layout",
            					lv_layout_0_0,
            					"cafeV.dsl.vforms.VformDSL.Layout");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormLayout"


    // $ANTLR start "entryRuleText"
    // InternalVformDSL.g:306:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalVformDSL.g:306:45: (iv_ruleText= ruleText EOF )
            // InternalVformDSL.g:307:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalVformDSL.g:313:1: ruleText returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'text' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:319:2: ( (otherlv_0= 'inputType' otherlv_1= 'text' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) )
            // InternalVformDSL.g:320:2: (otherlv_0= 'inputType' otherlv_1= 'text' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            {
            // InternalVformDSL.g:320:2: (otherlv_0= 'inputType' otherlv_1= 'text' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            // InternalVformDSL.g:321:3: otherlv_0= 'inputType' otherlv_1= 'text' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:333:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:334:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:334:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:335:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCheckbox"
    // InternalVformDSL.g:355:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalVformDSL.g:355:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalVformDSL.g:356:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalVformDSL.g:362:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'checkbox' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:368:2: ( (otherlv_0= 'inputType' otherlv_1= 'checkbox' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) )
            // InternalVformDSL.g:369:2: (otherlv_0= 'inputType' otherlv_1= 'checkbox' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            {
            // InternalVformDSL.g:369:2: (otherlv_0= 'inputType' otherlv_1= 'checkbox' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            // InternalVformDSL.g:370:3: otherlv_0= 'inputType' otherlv_1= 'checkbox' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckboxAccess().getCheckboxKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:382:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:383:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:383:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:384:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleNumber"
    // InternalVformDSL.g:404:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVformDSL.g:404:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVformDSL.g:405:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalVformDSL.g:411:1: ruleNumber returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'number' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:417:2: ( (otherlv_0= 'inputType' otherlv_1= 'number' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) )
            // InternalVformDSL.g:418:2: (otherlv_0= 'inputType' otherlv_1= 'number' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            {
            // InternalVformDSL.g:418:2: (otherlv_0= 'inputType' otherlv_1= 'number' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            // InternalVformDSL.g:419:3: otherlv_0= 'inputType' otherlv_1= 'number' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:431:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:432:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:432:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:433:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleDat"
    // InternalVformDSL.g:453:1: entryRuleDat returns [EObject current=null] : iv_ruleDat= ruleDat EOF ;
    public final EObject entryRuleDat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDat = null;


        try {
            // InternalVformDSL.g:453:44: (iv_ruleDat= ruleDat EOF )
            // InternalVformDSL.g:454:2: iv_ruleDat= ruleDat EOF
            {
             newCompositeNode(grammarAccess.getDatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDat=ruleDat();

            state._fsp--;

             current =iv_ruleDat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDat"


    // $ANTLR start "ruleDat"
    // InternalVformDSL.g:460:1: ruleDat returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'date' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:466:2: ( (otherlv_0= 'inputType' otherlv_1= 'date' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) ) )
            // InternalVformDSL.g:467:2: (otherlv_0= 'inputType' otherlv_1= 'date' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            {
            // InternalVformDSL.g:467:2: (otherlv_0= 'inputType' otherlv_1= 'date' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) )
            // InternalVformDSL.g:468:3: otherlv_0= 'inputType' otherlv_1= 'date' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDatAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDatAccess().getDateKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDatAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:480:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:481:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:481:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:482:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDat"


    // $ANTLR start "entryRuleRange"
    // InternalVformDSL.g:502:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalVformDSL.g:502:46: (iv_ruleRange= ruleRange EOF )
            // InternalVformDSL.g:503:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalVformDSL.g:509:1: ruleRange returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'range' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'min' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= 'max' ( (lv_max_7_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;
        Token otherlv_4=null;
        Token lv_min_5_0=null;
        Token otherlv_6=null;
        Token lv_max_7_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:515:2: ( (otherlv_0= 'inputType' otherlv_1= 'range' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'min' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= 'max' ( (lv_max_7_0= RULE_INT ) ) ) )
            // InternalVformDSL.g:516:2: (otherlv_0= 'inputType' otherlv_1= 'range' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'min' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= 'max' ( (lv_max_7_0= RULE_INT ) ) )
            {
            // InternalVformDSL.g:516:2: (otherlv_0= 'inputType' otherlv_1= 'range' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'min' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= 'max' ( (lv_max_7_0= RULE_INT ) ) )
            // InternalVformDSL.g:517:3: otherlv_0= 'inputType' otherlv_1= 'range' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'min' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= 'max' ( (lv_max_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getRangeKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:529:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:530:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:530:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:531:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getMinKeyword_4());
            		
            // InternalVformDSL.g:551:3: ( (lv_min_5_0= RULE_INT ) )
            // InternalVformDSL.g:552:4: (lv_min_5_0= RULE_INT )
            {
            // InternalVformDSL.g:552:4: (lv_min_5_0= RULE_INT )
            // InternalVformDSL.g:553:5: lv_min_5_0= RULE_INT
            {
            lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_min_5_0, grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getMaxKeyword_6());
            		
            // InternalVformDSL.g:573:3: ( (lv_max_7_0= RULE_INT ) )
            // InternalVformDSL.g:574:4: (lv_max_7_0= RULE_INT )
            {
            // InternalVformDSL.g:574:4: (lv_max_7_0= RULE_INT )
            // InternalVformDSL.g:575:5: lv_max_7_0= RULE_INT
            {
            lv_max_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_max_7_0, grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleSelect"
    // InternalVformDSL.g:595:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalVformDSL.g:595:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalVformDSL.g:596:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalVformDSL.g:602:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'inputType' otherlv_1= 'select' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'options' ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_inputName_3_0=null;
        Token otherlv_4=null;
        EObject lv_dataOption_5_0 = null;

        EObject lv_numberOption_6_0 = null;

        EObject lv_enumOption_7_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:608:2: ( (otherlv_0= 'inputType' otherlv_1= 'select' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'options' ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) ) ) )
            // InternalVformDSL.g:609:2: (otherlv_0= 'inputType' otherlv_1= 'select' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'options' ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) ) )
            {
            // InternalVformDSL.g:609:2: (otherlv_0= 'inputType' otherlv_1= 'select' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'options' ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) ) )
            // InternalVformDSL.g:610:3: otherlv_0= 'inputType' otherlv_1= 'select' otherlv_2= 'inputName' ( (lv_inputName_3_0= RULE_STRING ) ) otherlv_4= 'options' ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getInputTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getSelectKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getInputNameKeyword_2());
            		
            // InternalVformDSL.g:622:3: ( (lv_inputName_3_0= RULE_STRING ) )
            // InternalVformDSL.g:623:4: (lv_inputName_3_0= RULE_STRING )
            {
            // InternalVformDSL.g:623:4: (lv_inputName_3_0= RULE_STRING )
            // InternalVformDSL.g:624:5: lv_inputName_3_0= RULE_STRING
            {
            lv_inputName_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_inputName_3_0, grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getOptionsKeyword_4());
            		
            // InternalVformDSL.g:644:3: ( ( (lv_dataOption_5_0= ruleDataOption ) ) | ( (lv_numberOption_6_0= ruleNumberOption ) ) | ( (lv_enumOption_7_0= ruleEnumOption ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt2=1;
                    }
                    break;
                case 17:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==EOF||LA2_0==RULE_STRING||LA2_0==13) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVformDSL.g:645:4: ( (lv_dataOption_5_0= ruleDataOption ) )
                    {
                    // InternalVformDSL.g:645:4: ( (lv_dataOption_5_0= ruleDataOption ) )
                    // InternalVformDSL.g:646:5: (lv_dataOption_5_0= ruleDataOption )
                    {
                    // InternalVformDSL.g:646:5: (lv_dataOption_5_0= ruleDataOption )
                    // InternalVformDSL.g:647:6: lv_dataOption_5_0= ruleDataOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dataOption_5_0=ruleDataOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"dataOption",
                    							lv_dataOption_5_0,
                    							"cafeV.dsl.vforms.VformDSL.DataOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:665:4: ( (lv_numberOption_6_0= ruleNumberOption ) )
                    {
                    // InternalVformDSL.g:665:4: ( (lv_numberOption_6_0= ruleNumberOption ) )
                    // InternalVformDSL.g:666:5: (lv_numberOption_6_0= ruleNumberOption )
                    {
                    // InternalVformDSL.g:666:5: (lv_numberOption_6_0= ruleNumberOption )
                    // InternalVformDSL.g:667:6: lv_numberOption_6_0= ruleNumberOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_numberOption_6_0=ruleNumberOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"numberOption",
                    							lv_numberOption_6_0,
                    							"cafeV.dsl.vforms.VformDSL.NumberOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:685:4: ( (lv_enumOption_7_0= ruleEnumOption ) )
                    {
                    // InternalVformDSL.g:685:4: ( (lv_enumOption_7_0= ruleEnumOption ) )
                    // InternalVformDSL.g:686:5: (lv_enumOption_7_0= ruleEnumOption )
                    {
                    // InternalVformDSL.g:686:5: (lv_enumOption_7_0= ruleEnumOption )
                    // InternalVformDSL.g:687:6: lv_enumOption_7_0= ruleEnumOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_enumOption_7_0=ruleEnumOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"enumOption",
                    							lv_enumOption_7_0,
                    							"cafeV.dsl.vforms.VformDSL.EnumOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDataOption"
    // InternalVformDSL.g:709:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalVformDSL.g:709:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalVformDSL.g:710:2: iv_ruleDataOption= ruleDataOption EOF
            {
             newCompositeNode(grammarAccess.getDataOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataOption=ruleDataOption();

            state._fsp--;

             current =iv_ruleDataOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataOption"


    // $ANTLR start "ruleDataOption"
    // InternalVformDSL.g:716:1: ruleDataOption returns [EObject current=null] : (otherlv_0= 'optionType' otherlv_1= 'data' otherlv_2= 'data' ( (lv_data_3_0= ruleData ) )* ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_data_3_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:722:2: ( (otherlv_0= 'optionType' otherlv_1= 'data' otherlv_2= 'data' ( (lv_data_3_0= ruleData ) )* ) )
            // InternalVformDSL.g:723:2: (otherlv_0= 'optionType' otherlv_1= 'data' otherlv_2= 'data' ( (lv_data_3_0= ruleData ) )* )
            {
            // InternalVformDSL.g:723:2: (otherlv_0= 'optionType' otherlv_1= 'data' otherlv_2= 'data' ( (lv_data_3_0= ruleData ) )* )
            // InternalVformDSL.g:724:3: otherlv_0= 'optionType' otherlv_1= 'data' otherlv_2= 'data' ( (lv_data_3_0= ruleData ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOptionAccess().getOptionTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getDataKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDataOptionAccess().getDataKeyword_2());
            		
            // InternalVformDSL.g:736:3: ( (lv_data_3_0= ruleData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVformDSL.g:737:4: (lv_data_3_0= ruleData )
            	    {
            	    // InternalVformDSL.g:737:4: (lv_data_3_0= ruleData )
            	    // InternalVformDSL.g:738:5: lv_data_3_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_data_3_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataOptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_3_0,
            	    						"cafeV.dsl.vforms.VformDSL.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataOption"


    // $ANTLR start "entryRuleData"
    // InternalVformDSL.g:759:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalVformDSL.g:759:45: (iv_ruleData= ruleData EOF )
            // InternalVformDSL.g:760:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalVformDSL.g:766:1: ruleData returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) ) | ( (lv_intVal_4_0= RULE_INT ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_strVal_3_0=null;
        Token lv_intVal_4_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:772:2: ( ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) ) | ( (lv_intVal_4_0= RULE_INT ) ) ) )
            // InternalVformDSL.g:773:2: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) ) | ( (lv_intVal_4_0= RULE_INT ) ) )
            {
            // InternalVformDSL.g:773:2: ( (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) ) | ( (lv_intVal_4_0= RULE_INT ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
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
                    // InternalVformDSL.g:774:3: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) )
                    {
                    // InternalVformDSL.g:774:3: (otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) ) )
                    // InternalVformDSL.g:775:4: otherlv_0= 'label' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_strVal_3_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataAccess().getLabelKeyword_0_0());
                    			
                    // InternalVformDSL.g:779:4: ( (lv_label_1_0= RULE_STRING ) )
                    // InternalVformDSL.g:780:5: (lv_label_1_0= RULE_STRING )
                    {
                    // InternalVformDSL.g:780:5: (lv_label_1_0= RULE_STRING )
                    // InternalVformDSL.g:781:6: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_label_1_0, grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataAccess().getValueKeyword_0_2());
                    			
                    // InternalVformDSL.g:801:4: ( (lv_strVal_3_0= RULE_STRING ) )
                    // InternalVformDSL.g:802:5: (lv_strVal_3_0= RULE_STRING )
                    {
                    // InternalVformDSL.g:802:5: (lv_strVal_3_0= RULE_STRING )
                    // InternalVformDSL.g:803:6: lv_strVal_3_0= RULE_STRING
                    {
                    lv_strVal_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_strVal_3_0, grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strVal",
                    							lv_strVal_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:821:3: ( (lv_intVal_4_0= RULE_INT ) )
                    {
                    // InternalVformDSL.g:821:3: ( (lv_intVal_4_0= RULE_INT ) )
                    // InternalVformDSL.g:822:4: (lv_intVal_4_0= RULE_INT )
                    {
                    // InternalVformDSL.g:822:4: (lv_intVal_4_0= RULE_INT )
                    // InternalVformDSL.g:823:5: lv_intVal_4_0= RULE_INT
                    {
                    lv_intVal_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intVal_4_0, grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intVal",
                    						lv_intVal_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleNumberOption"
    // InternalVformDSL.g:843:1: entryRuleNumberOption returns [EObject current=null] : iv_ruleNumberOption= ruleNumberOption EOF ;
    public final EObject entryRuleNumberOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOption = null;


        try {
            // InternalVformDSL.g:843:53: (iv_ruleNumberOption= ruleNumberOption EOF )
            // InternalVformDSL.g:844:2: iv_ruleNumberOption= ruleNumberOption EOF
            {
             newCompositeNode(grammarAccess.getNumberOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberOption=ruleNumberOption();

            state._fsp--;

             current =iv_ruleNumberOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberOption"


    // $ANTLR start "ruleNumberOption"
    // InternalVformDSL.g:850:1: ruleNumberOption returns [EObject current=null] : (otherlv_0= 'optionType' otherlv_1= 'number' otherlv_2= 'min' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= 'max' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= 'range' ( (lv_range_7_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        Token lv_range_7_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:856:2: ( (otherlv_0= 'optionType' otherlv_1= 'number' otherlv_2= 'min' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= 'max' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= 'range' ( (lv_range_7_0= RULE_INT ) ) ) )
            // InternalVformDSL.g:857:2: (otherlv_0= 'optionType' otherlv_1= 'number' otherlv_2= 'min' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= 'max' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= 'range' ( (lv_range_7_0= RULE_INT ) ) )
            {
            // InternalVformDSL.g:857:2: (otherlv_0= 'optionType' otherlv_1= 'number' otherlv_2= 'min' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= 'max' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= 'range' ( (lv_range_7_0= RULE_INT ) ) )
            // InternalVformDSL.g:858:3: otherlv_0= 'optionType' otherlv_1= 'number' otherlv_2= 'min' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= 'max' ( (lv_max_5_0= RULE_INT ) ) otherlv_6= 'range' ( (lv_range_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOptionAccess().getNumberKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberOptionAccess().getMinKeyword_2());
            		
            // InternalVformDSL.g:870:3: ( (lv_min_3_0= RULE_INT ) )
            // InternalVformDSL.g:871:4: (lv_min_3_0= RULE_INT )
            {
            // InternalVformDSL.g:871:4: (lv_min_3_0= RULE_INT )
            // InternalVformDSL.g:872:5: lv_min_3_0= RULE_INT
            {
            lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_min_3_0, grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberOptionAccess().getMaxKeyword_4());
            		
            // InternalVformDSL.g:892:3: ( (lv_max_5_0= RULE_INT ) )
            // InternalVformDSL.g:893:4: (lv_max_5_0= RULE_INT )
            {
            // InternalVformDSL.g:893:4: (lv_max_5_0= RULE_INT )
            // InternalVformDSL.g:894:5: lv_max_5_0= RULE_INT
            {
            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_max_5_0, grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberOptionAccess().getRangeKeyword_6());
            		
            // InternalVformDSL.g:914:3: ( (lv_range_7_0= RULE_INT ) )
            // InternalVformDSL.g:915:4: (lv_range_7_0= RULE_INT )
            {
            // InternalVformDSL.g:915:4: (lv_range_7_0= RULE_INT )
            // InternalVformDSL.g:916:5: lv_range_7_0= RULE_INT
            {
            lv_range_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_range_7_0, grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberOption"


    // $ANTLR start "entryRuleEnumOption"
    // InternalVformDSL.g:936:1: entryRuleEnumOption returns [EObject current=null] : iv_ruleEnumOption= ruleEnumOption EOF ;
    public final EObject entryRuleEnumOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOption = null;


        try {
            // InternalVformDSL.g:936:51: (iv_ruleEnumOption= ruleEnumOption EOF )
            // InternalVformDSL.g:937:2: iv_ruleEnumOption= ruleEnumOption EOF
            {
             newCompositeNode(grammarAccess.getEnumOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumOption=ruleEnumOption();

            state._fsp--;

             current =iv_ruleEnumOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumOption"


    // $ANTLR start "ruleEnumOption"
    // InternalVformDSL.g:943:1: ruleEnumOption returns [EObject current=null] : ( (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* ) | ( (lv_numberData_4_0= RULE_STRING ) )* ) ;
    public final EObject ruleEnumOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_stringData_3_0=null;
        Token lv_numberData_4_0=null;


        	enterRule();

        try {
            // InternalVformDSL.g:949:2: ( ( (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* ) | ( (lv_numberData_4_0= RULE_STRING ) )* ) )
            // InternalVformDSL.g:950:2: ( (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* ) | ( (lv_numberData_4_0= RULE_STRING ) )* )
            {
            // InternalVformDSL.g:950:2: ( (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* ) | ( (lv_numberData_4_0= RULE_STRING ) )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==RULE_STRING||LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVformDSL.g:951:3: (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* )
                    {
                    // InternalVformDSL.g:951:3: (otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )* )
                    // InternalVformDSL.g:952:4: otherlv_0= 'optionType' otherlv_1= 'enum' otherlv_2= 'data' ( (lv_stringData_3_0= RULE_STRING ) )*
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumOptionAccess().getEnumKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumOptionAccess().getDataKeyword_0_2());
                    			
                    // InternalVformDSL.g:964:4: ( (lv_stringData_3_0= RULE_STRING ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVformDSL.g:965:5: (lv_stringData_3_0= RULE_STRING )
                    	    {
                    	    // InternalVformDSL.g:965:5: (lv_stringData_3_0= RULE_STRING )
                    	    // InternalVformDSL.g:966:6: lv_stringData_3_0= RULE_STRING
                    	    {
                    	    lv_stringData_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    						newLeafNode(lv_stringData_3_0, grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_0_3_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEnumOptionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"stringData",
                    	    							lv_stringData_3_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:984:3: ( (lv_numberData_4_0= RULE_STRING ) )*
                    {
                    // InternalVformDSL.g:984:3: ( (lv_numberData_4_0= RULE_STRING ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVformDSL.g:985:4: (lv_numberData_4_0= RULE_STRING )
                    	    {
                    	    // InternalVformDSL.g:985:4: (lv_numberData_4_0= RULE_STRING )
                    	    // InternalVformDSL.g:986:5: lv_numberData_4_0= RULE_STRING
                    	    {
                    	    lv_numberData_4_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    					newLeafNode(lv_numberData_4_0, grammarAccess.getEnumOptionAccess().getNumberDataSTRINGTerminalRuleCall_1_0());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getEnumOptionRule());
                    	    					}
                    	    					addWithLastConsumed(
                    	    						current,
                    	    						"numberData",
                    	    						lv_numberData_4_0,
                    	    						"org.eclipse.xtext.common.Terminals.STRING");
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumOption"


    // $ANTLR start "ruleLayout"
    // InternalVformDSL.g:1006:1: ruleLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) ;
    public final Enumerator ruleLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVformDSL.g:1012:2: ( ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) )
            // InternalVformDSL.g:1013:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            {
            // InternalVformDSL.g:1013:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVformDSL.g:1014:3: (enumLiteral_0= 'horizontal' )
                    {
                    // InternalVformDSL.g:1014:3: (enumLiteral_0= 'horizontal' )
                    // InternalVformDSL.g:1015:4: enumLiteral_0= 'horizontal'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:1022:3: (enumLiteral_1= 'vertical' )
                    {
                    // InternalVformDSL.g:1022:3: (enumLiteral_1= 'vertical' )
                    // InternalVformDSL.g:1023:4: enumLiteral_1= 'vertical'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLayoutAccess().getVerticalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000012L});

}