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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'formLayout:'", "','", "'formInputs:'", "'['", "']'", "'{'", "'inputType:'", "'text'", "'inputName:'", "'}'", "'checkbox'", "'number'", "'date'", "'range'", "'min:'", "'max:'", "'select'", "'options:'", "'group'", "'groupInputs:'", "'optionType:'", "'data'", "'data:'", "'enum'", "'range:'", "'label:'", "'value:'", "'horizontal'", "'vertical'"
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
    // InternalVformDSL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_formLayout_1_0 = null;

        EObject lv_formInput_5_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:78:2: ( (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' ) )
            // InternalVformDSL.g:79:2: (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' )
            {
            // InternalVformDSL.g:79:2: (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' )
            // InternalVformDSL.g:80:3: otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFormLayoutKeyword_0());
            		
            // InternalVformDSL.g:84:3: ( (lv_formLayout_1_0= ruleFormLayout ) )
            // InternalVformDSL.g:85:4: (lv_formLayout_1_0= ruleFormLayout )
            {
            // InternalVformDSL.g:85:4: (lv_formLayout_1_0= ruleFormLayout )
            // InternalVformDSL.g:86:5: lv_formLayout_1_0= ruleFormLayout
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_1_0());
            				
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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getFormInputsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalVformDSL.g:115:3: ( (lv_formInput_5_0= ruleFormInput ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVformDSL.g:116:4: (lv_formInput_5_0= ruleFormInput )
            	    {
            	    // InternalVformDSL.g:116:4: (lv_formInput_5_0= ruleFormInput )
            	    // InternalVformDSL.g:117:5: lv_formInput_5_0= ruleFormInput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_formInput_5_0=ruleFormInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"formInput",
            	    						lv_formInput_5_0,
            	    						"cafeV.dsl.vforms.VformDSL.FormInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightSquareBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleFormLayout"
    // InternalVformDSL.g:142:1: entryRuleFormLayout returns [EObject current=null] : iv_ruleFormLayout= ruleFormLayout EOF ;
    public final EObject entryRuleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormLayout = null;


        try {
            // InternalVformDSL.g:142:51: (iv_ruleFormLayout= ruleFormLayout EOF )
            // InternalVformDSL.g:143:2: iv_ruleFormLayout= ruleFormLayout EOF
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
    // InternalVformDSL.g:149:1: ruleFormLayout returns [EObject current=null] : ( (lv_layout_0_0= ruleLayout ) ) ;
    public final EObject ruleFormLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_layout_0_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:155:2: ( ( (lv_layout_0_0= ruleLayout ) ) )
            // InternalVformDSL.g:156:2: ( (lv_layout_0_0= ruleLayout ) )
            {
            // InternalVformDSL.g:156:2: ( (lv_layout_0_0= ruleLayout ) )
            // InternalVformDSL.g:157:3: (lv_layout_0_0= ruleLayout )
            {
            // InternalVformDSL.g:157:3: (lv_layout_0_0= ruleLayout )
            // InternalVformDSL.g:158:4: lv_layout_0_0= ruleLayout
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


    // $ANTLR start "entryRuleFormInput"
    // InternalVformDSL.g:178:1: entryRuleFormInput returns [EObject current=null] : iv_ruleFormInput= ruleFormInput EOF ;
    public final EObject entryRuleFormInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInput = null;


        try {
            // InternalVformDSL.g:178:50: (iv_ruleFormInput= ruleFormInput EOF )
            // InternalVformDSL.g:179:2: iv_ruleFormInput= ruleFormInput EOF
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
    // InternalVformDSL.g:185:1: ruleFormInput returns [EObject current=null] : ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) | ( (lv_search_6_0= ruleSearch ) ) | ( (lv_group_7_0= ruleGroup ) ) ) ;
    public final EObject ruleFormInput() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;

        EObject lv_checkbox_1_0 = null;

        EObject lv_number_2_0 = null;

        EObject lv_dat_3_0 = null;

        EObject lv_range_4_0 = null;

        EObject lv_select_5_0 = null;

        EObject lv_search_6_0 = null;

        EObject lv_group_7_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:191:2: ( ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) | ( (lv_search_6_0= ruleSearch ) ) | ( (lv_group_7_0= ruleGroup ) ) ) )
            // InternalVformDSL.g:192:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) | ( (lv_search_6_0= ruleSearch ) ) | ( (lv_group_7_0= ruleGroup ) ) )
            {
            // InternalVformDSL.g:192:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) | ( (lv_search_6_0= ruleSearch ) ) | ( (lv_group_7_0= ruleGroup ) ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalVformDSL.g:193:3: ( (lv_text_0_0= ruleText ) )
                    {
                    // InternalVformDSL.g:193:3: ( (lv_text_0_0= ruleText ) )
                    // InternalVformDSL.g:194:4: (lv_text_0_0= ruleText )
                    {
                    // InternalVformDSL.g:194:4: (lv_text_0_0= ruleText )
                    // InternalVformDSL.g:195:5: lv_text_0_0= ruleText
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getTextTextParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
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
                    // InternalVformDSL.g:213:3: ( (lv_checkbox_1_0= ruleCheckbox ) )
                    {
                    // InternalVformDSL.g:213:3: ( (lv_checkbox_1_0= ruleCheckbox ) )
                    // InternalVformDSL.g:214:4: (lv_checkbox_1_0= ruleCheckbox )
                    {
                    // InternalVformDSL.g:214:4: (lv_checkbox_1_0= ruleCheckbox )
                    // InternalVformDSL.g:215:5: lv_checkbox_1_0= ruleCheckbox
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getCheckboxCheckboxParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
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
                    // InternalVformDSL.g:233:3: ( (lv_number_2_0= ruleNumber ) )
                    {
                    // InternalVformDSL.g:233:3: ( (lv_number_2_0= ruleNumber ) )
                    // InternalVformDSL.g:234:4: (lv_number_2_0= ruleNumber )
                    {
                    // InternalVformDSL.g:234:4: (lv_number_2_0= ruleNumber )
                    // InternalVformDSL.g:235:5: lv_number_2_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getNumberNumberParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
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
                    // InternalVformDSL.g:253:3: ( (lv_dat_3_0= ruleDat ) )
                    {
                    // InternalVformDSL.g:253:3: ( (lv_dat_3_0= ruleDat ) )
                    // InternalVformDSL.g:254:4: (lv_dat_3_0= ruleDat )
                    {
                    // InternalVformDSL.g:254:4: (lv_dat_3_0= ruleDat )
                    // InternalVformDSL.g:255:5: lv_dat_3_0= ruleDat
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getDatDatParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
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
                    // InternalVformDSL.g:273:3: ( (lv_range_4_0= ruleRange ) )
                    {
                    // InternalVformDSL.g:273:3: ( (lv_range_4_0= ruleRange ) )
                    // InternalVformDSL.g:274:4: (lv_range_4_0= ruleRange )
                    {
                    // InternalVformDSL.g:274:4: (lv_range_4_0= ruleRange )
                    // InternalVformDSL.g:275:5: lv_range_4_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getRangeRangeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
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
                    // InternalVformDSL.g:293:3: ( (lv_select_5_0= ruleSelect ) )
                    {
                    // InternalVformDSL.g:293:3: ( (lv_select_5_0= ruleSelect ) )
                    // InternalVformDSL.g:294:4: (lv_select_5_0= ruleSelect )
                    {
                    // InternalVformDSL.g:294:4: (lv_select_5_0= ruleSelect )
                    // InternalVformDSL.g:295:5: lv_select_5_0= ruleSelect
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getSelectSelectParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
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
                case 7 :
                    // InternalVformDSL.g:313:3: ( (lv_search_6_0= ruleSearch ) )
                    {
                    // InternalVformDSL.g:313:3: ( (lv_search_6_0= ruleSearch ) )
                    // InternalVformDSL.g:314:4: (lv_search_6_0= ruleSearch )
                    {
                    // InternalVformDSL.g:314:4: (lv_search_6_0= ruleSearch )
                    // InternalVformDSL.g:315:5: lv_search_6_0= ruleSearch
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getSearchSearchParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_search_6_0=ruleSearch();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormInputRule());
                    					}
                    					add(
                    						current,
                    						"search",
                    						lv_search_6_0,
                    						"cafeV.dsl.vforms.VformDSL.Search");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalVformDSL.g:333:3: ( (lv_group_7_0= ruleGroup ) )
                    {
                    // InternalVformDSL.g:333:3: ( (lv_group_7_0= ruleGroup ) )
                    // InternalVformDSL.g:334:4: (lv_group_7_0= ruleGroup )
                    {
                    // InternalVformDSL.g:334:4: (lv_group_7_0= ruleGroup )
                    // InternalVformDSL.g:335:5: lv_group_7_0= ruleGroup
                    {

                    					newCompositeNode(grammarAccess.getFormInputAccess().getGroupGroupParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_group_7_0=ruleGroup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormInputRule());
                    					}
                    					add(
                    						current,
                    						"group",
                    						lv_group_7_0,
                    						"cafeV.dsl.vforms.VformDSL.Group");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFormInput"


    // $ANTLR start "entryRuleText"
    // InternalVformDSL.g:356:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalVformDSL.g:356:45: (iv_ruleText= ruleText EOF )
            // InternalVformDSL.g:357:2: iv_ruleText= ruleText EOF
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
    // InternalVformDSL.g:363:1: ruleText returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'text' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVformDSL.g:369:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'text' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVformDSL.g:370:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'text' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVformDSL.g:370:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'text' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVformDSL.g:371:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'text' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getTextKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTextAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:391:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:392:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:392:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:393:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getTextAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVformDSL.g:417:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalVformDSL.g:417:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalVformDSL.g:418:2: iv_ruleCheckbox= ruleCheckbox EOF
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
    // InternalVformDSL.g:424:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'checkbox' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVformDSL.g:430:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'checkbox' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVformDSL.g:431:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'checkbox' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVformDSL.g:431:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'checkbox' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVformDSL.g:432:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'checkbox' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckboxAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getCheckboxKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCheckboxAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getCheckboxAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:452:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:453:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:453:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:454:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getCheckboxAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVformDSL.g:478:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVformDSL.g:478:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVformDSL.g:479:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalVformDSL.g:485:1: ruleNumber returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVformDSL.g:491:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVformDSL.g:492:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVformDSL.g:492:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVformDSL.g:493:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getNumberKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:513:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:514:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:514:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:515:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getNumberAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVformDSL.g:539:1: entryRuleDat returns [EObject current=null] : iv_ruleDat= ruleDat EOF ;
    public final EObject entryRuleDat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDat = null;


        try {
            // InternalVformDSL.g:539:44: (iv_ruleDat= ruleDat EOF )
            // InternalVformDSL.g:540:2: iv_ruleDat= ruleDat EOF
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
    // InternalVformDSL.g:546:1: ruleDat returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'date' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleDat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVformDSL.g:552:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'date' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVformDSL.g:553:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'date' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVformDSL.g:553:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'date' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVformDSL.g:554:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'date' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDatAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDatAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDatAccess().getDateKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDatAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getDatAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:574:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:575:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:575:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:576:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getDatAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDatAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVformDSL.g:600:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalVformDSL.g:600:46: (iv_ruleRange= ruleRange EOF )
            // InternalVformDSL.g:601:2: iv_ruleRange= ruleRange EOF
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
    // InternalVformDSL.g:607:1: ruleRange returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'range' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'min:' ( (lv_min_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'max:' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_min_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_max_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalVformDSL.g:613:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'range' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'min:' ( (lv_min_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'max:' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalVformDSL.g:614:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'range' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'min:' ( (lv_min_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'max:' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalVformDSL.g:614:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'range' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'min:' ( (lv_min_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'max:' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalVformDSL.g:615:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'range' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'min:' ( (lv_min_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'max:' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:635:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:636:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:636:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:637:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getRangeAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getRangeAccess().getMinKeyword_7());
            		
            // InternalVformDSL.g:661:3: ( (lv_min_8_0= RULE_INT ) )
            // InternalVformDSL.g:662:4: (lv_min_8_0= RULE_INT )
            {
            // InternalVformDSL.g:662:4: (lv_min_8_0= RULE_INT )
            // InternalVformDSL.g:663:5: lv_min_8_0= RULE_INT
            {
            lv_min_8_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_min_8_0, grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getRangeAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getRangeAccess().getMaxKeyword_10());
            		
            // InternalVformDSL.g:687:3: ( (lv_max_11_0= RULE_INT ) )
            // InternalVformDSL.g:688:4: (lv_max_11_0= RULE_INT )
            {
            // InternalVformDSL.g:688:4: (lv_max_11_0= RULE_INT )
            // InternalVformDSL.g:689:5: lv_max_11_0= RULE_INT
            {
            lv_max_11_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_max_11_0, grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalVformDSL.g:713:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalVformDSL.g:713:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalVformDSL.g:714:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalVformDSL.g:720:1: ruleSelect returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_dataOption_8_0 = null;

        EObject lv_enumOption_9_0 = null;

        EObject lv_numberOption_10_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:726:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) ) otherlv_11= '}' ) )
            // InternalVformDSL.g:727:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) ) otherlv_11= '}' )
            {
            // InternalVformDSL.g:727:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) ) otherlv_11= '}' )
            // InternalVformDSL.g:728:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getSelectKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:748:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:749:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:749:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:750:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getSelectAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getOptionsKeyword_7());
            		
            // InternalVformDSL.g:774:3: ( ( (lv_dataOption_8_0= ruleDataOption ) ) | ( (lv_enumOption_9_0= ruleEnumOption ) ) | ( (lv_numberOption_10_0= ruleNumberOption ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==31) ) {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        alt3=3;
                        }
                        break;
                    case 32:
                        {
                        alt3=1;
                        }
                        break;
                    case 34:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVformDSL.g:775:4: ( (lv_dataOption_8_0= ruleDataOption ) )
                    {
                    // InternalVformDSL.g:775:4: ( (lv_dataOption_8_0= ruleDataOption ) )
                    // InternalVformDSL.g:776:5: (lv_dataOption_8_0= ruleDataOption )
                    {
                    // InternalVformDSL.g:776:5: (lv_dataOption_8_0= ruleDataOption )
                    // InternalVformDSL.g:777:6: lv_dataOption_8_0= ruleDataOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getDataOptionDataOptionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dataOption_8_0=ruleDataOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"dataOption",
                    							lv_dataOption_8_0,
                    							"cafeV.dsl.vforms.VformDSL.DataOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:795:4: ( (lv_enumOption_9_0= ruleEnumOption ) )
                    {
                    // InternalVformDSL.g:795:4: ( (lv_enumOption_9_0= ruleEnumOption ) )
                    // InternalVformDSL.g:796:5: (lv_enumOption_9_0= ruleEnumOption )
                    {
                    // InternalVformDSL.g:796:5: (lv_enumOption_9_0= ruleEnumOption )
                    // InternalVformDSL.g:797:6: lv_enumOption_9_0= ruleEnumOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getEnumOptionEnumOptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_enumOption_9_0=ruleEnumOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"enumOption",
                    							lv_enumOption_9_0,
                    							"cafeV.dsl.vforms.VformDSL.EnumOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:815:4: ( (lv_numberOption_10_0= ruleNumberOption ) )
                    {
                    // InternalVformDSL.g:815:4: ( (lv_numberOption_10_0= ruleNumberOption ) )
                    // InternalVformDSL.g:816:5: (lv_numberOption_10_0= ruleNumberOption )
                    {
                    // InternalVformDSL.g:816:5: (lv_numberOption_10_0= ruleNumberOption )
                    // InternalVformDSL.g:817:6: lv_numberOption_10_0= ruleNumberOption
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getNumberOptionNumberOptionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_numberOption_10_0=ruleNumberOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"numberOption",
                    							lv_numberOption_10_0,
                    							"cafeV.dsl.vforms.VformDSL.NumberOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleSearch"
    // InternalVformDSL.g:843:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalVformDSL.g:843:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalVformDSL.g:844:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalVformDSL.g:850:1: ruleSearch returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' otherlv_8= '[' ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* ) otherlv_12= ']' otherlv_13= '}' ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_stringData_9_0=null;
        Token lv_numberData_10_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_data_11_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:856:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' otherlv_8= '[' ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* ) otherlv_12= ']' otherlv_13= '}' ) )
            // InternalVformDSL.g:857:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' otherlv_8= '[' ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* ) otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalVformDSL.g:857:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' otherlv_8= '[' ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* ) otherlv_12= ']' otherlv_13= '}' )
            // InternalVformDSL.g:858:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'select' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'options:' otherlv_8= '[' ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* ) otherlv_12= ']' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getSelectKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSearchAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getSearchAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:878:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:879:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:879:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:880:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getSearchAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getSearchAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getSearchAccess().getOptionsKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getSearchAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalVformDSL.g:908:3: ( ( (lv_stringData_9_0= RULE_STRING ) )* | ( (lv_numberData_10_0= RULE_INT ) )* | ( (lv_data_11_0= ruleData ) )* )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVformDSL.g:909:4: ( (lv_stringData_9_0= RULE_STRING ) )*
                    {
                    // InternalVformDSL.g:909:4: ( (lv_stringData_9_0= RULE_STRING ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVformDSL.g:910:5: (lv_stringData_9_0= RULE_STRING )
                    	    {
                    	    // InternalVformDSL.g:910:5: (lv_stringData_9_0= RULE_STRING )
                    	    // InternalVformDSL.g:911:6: lv_stringData_9_0= RULE_STRING
                    	    {
                    	    lv_stringData_9_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    						newLeafNode(lv_stringData_9_0, grammarAccess.getSearchAccess().getStringDataSTRINGTerminalRuleCall_9_0_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSearchRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"stringData",
                    	    							lv_stringData_9_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:928:4: ( (lv_numberData_10_0= RULE_INT ) )*
                    {
                    // InternalVformDSL.g:928:4: ( (lv_numberData_10_0= RULE_INT ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVformDSL.g:929:5: (lv_numberData_10_0= RULE_INT )
                    	    {
                    	    // InternalVformDSL.g:929:5: (lv_numberData_10_0= RULE_INT )
                    	    // InternalVformDSL.g:930:6: lv_numberData_10_0= RULE_INT
                    	    {
                    	    lv_numberData_10_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    	    						newLeafNode(lv_numberData_10_0, grammarAccess.getSearchAccess().getNumberDataINTTerminalRuleCall_9_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSearchRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"numberData",
                    	    							lv_numberData_10_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalVformDSL.g:947:4: ( (lv_data_11_0= ruleData ) )*
                    {
                    // InternalVformDSL.g:947:4: ( (lv_data_11_0= ruleData ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVformDSL.g:948:5: (lv_data_11_0= ruleData )
                    	    {
                    	    // InternalVformDSL.g:948:5: (lv_data_11_0= ruleData )
                    	    // InternalVformDSL.g:949:6: lv_data_11_0= ruleData
                    	    {

                    	    						newCompositeNode(grammarAccess.getSearchAccess().getDataDataParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_data_11_0=ruleData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSearchRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"data",
                    	    							lv_data_11_0,
                    	    							"cafeV.dsl.vforms.VformDSL.Data");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_12=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getSearchAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSearchAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleGroup"
    // InternalVformDSL.g:979:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalVformDSL.g:979:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalVformDSL.g:980:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalVformDSL.g:986:1: ruleGroup returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'group' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalVformDSL.g:992:2: ( (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'group' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' ) )
            // InternalVformDSL.g:993:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'group' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' )
            {
            // InternalVformDSL.g:993:2: (otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'group' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}' )
            // InternalVformDSL.g:994:3: otherlv_0= '{' otherlv_1= 'inputType:' otherlv_2= 'group' otherlv_3= ',' otherlv_4= 'inputName:' ( (lv_inputName_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getInputTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getGroupKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getInputNameKeyword_4());
            		
            // InternalVformDSL.g:1014:3: ( (lv_inputName_5_0= RULE_STRING ) )
            // InternalVformDSL.g:1015:4: (lv_inputName_5_0= RULE_STRING )
            {
            // InternalVformDSL.g:1015:4: (lv_inputName_5_0= RULE_STRING )
            // InternalVformDSL.g:1016:5: lv_inputName_5_0= RULE_STRING
            {
            lv_inputName_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_inputName_5_0, grammarAccess.getGroupAccess().getInputNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inputName",
            						lv_inputName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getGroupInputsKeyword_7());
            		
            // InternalVformDSL.g:1040:3: ( (otherlv_8= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVformDSL.g:1041:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalVformDSL.g:1041:4: (otherlv_8= RULE_ID )
            	    // InternalVformDSL.g:1042:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getGroupRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    					newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getGroupInputsFormInputCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleDataOption"
    // InternalVformDSL.g:1061:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalVformDSL.g:1061:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalVformDSL.g:1062:2: iv_ruleDataOption= ruleDataOption EOF
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
    // InternalVformDSL.g:1068:1: ruleDataOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'data' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( (lv_data_6_0= ruleData ) )* otherlv_7= ']' otherlv_8= '}' ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_data_6_0 = null;



        	enterRule();

        try {
            // InternalVformDSL.g:1074:2: ( (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'data' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( (lv_data_6_0= ruleData ) )* otherlv_7= ']' otherlv_8= '}' ) )
            // InternalVformDSL.g:1075:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'data' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( (lv_data_6_0= ruleData ) )* otherlv_7= ']' otherlv_8= '}' )
            {
            // InternalVformDSL.g:1075:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'data' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( (lv_data_6_0= ruleData ) )* otherlv_7= ']' otherlv_8= '}' )
            // InternalVformDSL.g:1076:3: otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'data' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( (lv_data_6_0= ruleData ) )* otherlv_7= ']' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDataOptionAccess().getDataKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getDataOptionAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDataOptionAccess().getDataKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalVformDSL.g:1100:3: ( (lv_data_6_0= ruleData ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVformDSL.g:1101:4: (lv_data_6_0= ruleData )
            	    {
            	    // InternalVformDSL.g:1101:4: (lv_data_6_0= ruleData )
            	    // InternalVformDSL.g:1102:5: lv_data_6_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_data_6_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataOptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_6_0,
            	    						"cafeV.dsl.vforms.VformDSL.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataOptionAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEnumOption"
    // InternalVformDSL.g:1131:1: entryRuleEnumOption returns [EObject current=null] : iv_ruleEnumOption= ruleEnumOption EOF ;
    public final EObject entryRuleEnumOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOption = null;


        try {
            // InternalVformDSL.g:1131:51: (iv_ruleEnumOption= ruleEnumOption EOF )
            // InternalVformDSL.g:1132:2: iv_ruleEnumOption= ruleEnumOption EOF
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
    // InternalVformDSL.g:1138:1: ruleEnumOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'enum' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* ) otherlv_8= ']' otherlv_9= '}' ) ;
    public final EObject ruleEnumOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_stringData_6_0=null;
        Token lv_numberData_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalVformDSL.g:1144:2: ( (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'enum' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* ) otherlv_8= ']' otherlv_9= '}' ) )
            // InternalVformDSL.g:1145:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'enum' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* ) otherlv_8= ']' otherlv_9= '}' )
            {
            // InternalVformDSL.g:1145:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'enum' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* ) otherlv_8= ']' otherlv_9= '}' )
            // InternalVformDSL.g:1146:3: otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'enum' otherlv_3= ',' otherlv_4= 'data:' otherlv_5= '[' ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* ) otherlv_8= ']' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumOptionAccess().getEnumKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumOptionAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumOptionAccess().getDataKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalVformDSL.g:1170:3: ( ( (lv_stringData_6_0= RULE_STRING ) )* | ( (lv_numberData_7_0= RULE_INT ) )* )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalVformDSL.g:1171:4: ( (lv_stringData_6_0= RULE_STRING ) )*
                    {
                    // InternalVformDSL.g:1171:4: ( (lv_stringData_6_0= RULE_STRING ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_STRING) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVformDSL.g:1172:5: (lv_stringData_6_0= RULE_STRING )
                    	    {
                    	    // InternalVformDSL.g:1172:5: (lv_stringData_6_0= RULE_STRING )
                    	    // InternalVformDSL.g:1173:6: lv_stringData_6_0= RULE_STRING
                    	    {
                    	    lv_stringData_6_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    						newLeafNode(lv_stringData_6_0, grammarAccess.getEnumOptionAccess().getStringDataSTRINGTerminalRuleCall_6_0_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEnumOptionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"stringData",
                    	    							lv_stringData_6_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:1190:4: ( (lv_numberData_7_0= RULE_INT ) )*
                    {
                    // InternalVformDSL.g:1190:4: ( (lv_numberData_7_0= RULE_INT ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_INT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVformDSL.g:1191:5: (lv_numberData_7_0= RULE_INT )
                    	    {
                    	    // InternalVformDSL.g:1191:5: (lv_numberData_7_0= RULE_INT )
                    	    // InternalVformDSL.g:1192:6: lv_numberData_7_0= RULE_INT
                    	    {
                    	    lv_numberData_7_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    	    						newLeafNode(lv_numberData_7_0, grammarAccess.getEnumOptionAccess().getNumberDataINTTerminalRuleCall_6_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEnumOptionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"numberData",
                    	    							lv_numberData_7_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumOptionAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleNumberOption"
    // InternalVformDSL.g:1221:1: entryRuleNumberOption returns [EObject current=null] : iv_ruleNumberOption= ruleNumberOption EOF ;
    public final EObject entryRuleNumberOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOption = null;


        try {
            // InternalVformDSL.g:1221:53: (iv_ruleNumberOption= ruleNumberOption EOF )
            // InternalVformDSL.g:1222:2: iv_ruleNumberOption= ruleNumberOption EOF
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
    // InternalVformDSL.g:1228:1: ruleNumberOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'min:' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'max:' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'range:' ( (lv_range_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleNumberOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_min_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_max_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_range_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalVformDSL.g:1234:2: ( (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'min:' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'max:' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'range:' ( (lv_range_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalVformDSL.g:1235:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'min:' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'max:' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'range:' ( (lv_range_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalVformDSL.g:1235:2: (otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'min:' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'max:' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'range:' ( (lv_range_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalVformDSL.g:1236:3: otherlv_0= '{' otherlv_1= 'optionType:' otherlv_2= 'number' otherlv_3= ',' otherlv_4= 'min:' ( (lv_min_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'max:' ( (lv_max_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'range:' ( (lv_range_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberOptionAccess().getNumberKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberOptionAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberOptionAccess().getMinKeyword_4());
            		
            // InternalVformDSL.g:1256:3: ( (lv_min_5_0= RULE_INT ) )
            // InternalVformDSL.g:1257:4: (lv_min_5_0= RULE_INT )
            {
            // InternalVformDSL.g:1257:4: (lv_min_5_0= RULE_INT )
            // InternalVformDSL.g:1258:5: lv_min_5_0= RULE_INT
            {
            lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_min_5_0, grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberOptionAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getNumberOptionAccess().getMaxKeyword_7());
            		
            // InternalVformDSL.g:1282:3: ( (lv_max_8_0= RULE_INT ) )
            // InternalVformDSL.g:1283:4: (lv_max_8_0= RULE_INT )
            {
            // InternalVformDSL.g:1283:4: (lv_max_8_0= RULE_INT )
            // InternalVformDSL.g:1284:5: lv_max_8_0= RULE_INT
            {
            lv_max_8_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_max_8_0, grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getNumberOptionAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getNumberOptionAccess().getRangeKeyword_10());
            		
            // InternalVformDSL.g:1308:3: ( (lv_range_11_0= RULE_INT ) )
            // InternalVformDSL.g:1309:4: (lv_range_11_0= RULE_INT )
            {
            // InternalVformDSL.g:1309:4: (lv_range_11_0= RULE_INT )
            // InternalVformDSL.g:1310:5: lv_range_11_0= RULE_INT
            {
            lv_range_11_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_range_11_0, grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNumberOptionAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleData"
    // InternalVformDSL.g:1334:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalVformDSL.g:1334:45: (iv_ruleData= ruleData EOF )
            // InternalVformDSL.g:1335:2: iv_ruleData= ruleData EOF
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
    // InternalVformDSL.g:1341:1: ruleData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_strVal_5_0=null;
        Token lv_intVal_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalVformDSL.g:1347:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) ) otherlv_7= '}' ) )
            // InternalVformDSL.g:1348:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) ) otherlv_7= '}' )
            {
            // InternalVformDSL.g:1348:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) ) otherlv_7= '}' )
            // InternalVformDSL.g:1349:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getLabelKeyword_1());
            		
            // InternalVformDSL.g:1357:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVformDSL.g:1358:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVformDSL.g:1358:4: (lv_label_2_0= RULE_STRING )
            // InternalVformDSL.g:1359:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_label_2_0, grammarAccess.getDataAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getValueKeyword_4());
            		
            // InternalVformDSL.g:1383:3: ( ( (lv_strVal_5_0= RULE_STRING ) ) | ( (lv_intVal_6_0= RULE_INT ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalVformDSL.g:1384:4: ( (lv_strVal_5_0= RULE_STRING ) )
                    {
                    // InternalVformDSL.g:1384:4: ( (lv_strVal_5_0= RULE_STRING ) )
                    // InternalVformDSL.g:1385:5: (lv_strVal_5_0= RULE_STRING )
                    {
                    // InternalVformDSL.g:1385:5: (lv_strVal_5_0= RULE_STRING )
                    // InternalVformDSL.g:1386:6: lv_strVal_5_0= RULE_STRING
                    {
                    lv_strVal_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_strVal_5_0, grammarAccess.getDataAccess().getStrValSTRINGTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strVal",
                    							lv_strVal_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:1403:4: ( (lv_intVal_6_0= RULE_INT ) )
                    {
                    // InternalVformDSL.g:1403:4: ( (lv_intVal_6_0= RULE_INT ) )
                    // InternalVformDSL.g:1404:5: (lv_intVal_6_0= RULE_INT )
                    {
                    // InternalVformDSL.g:1404:5: (lv_intVal_6_0= RULE_INT )
                    // InternalVformDSL.g:1405:6: lv_intVal_6_0= RULE_INT
                    {
                    lv_intVal_6_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_intVal_6_0, grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intVal",
                    							lv_intVal_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "ruleLayout"
    // InternalVformDSL.g:1430:1: ruleLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) ;
    public final Enumerator ruleLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVformDSL.g:1436:2: ( ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) )
            // InternalVformDSL.g:1437:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            {
            // InternalVformDSL.g:1437:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalVformDSL.g:1438:3: (enumLiteral_0= 'horizontal' )
                    {
                    // InternalVformDSL.g:1438:3: (enumLiteral_0= 'horizontal' )
                    // InternalVformDSL.g:1439:4: enumLiteral_0= 'horizontal'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVformDSL.g:1446:3: (enumLiteral_1= 'vertical' )
                    {
                    // InternalVformDSL.g:1446:3: (enumLiteral_1= 'vertical' )
                    // InternalVformDSL.g:1447:4: enumLiteral_1= 'vertical'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\20\1\21\1\22\3\uffff\1\14\3\uffff\1\23\1\4\1\14\1\34\1\16\2\uffff";
    static final String dfa_3s = "\1\20\1\21\1\35\3\uffff\1\14\3\uffff\1\23\1\4\1\14\1\34\1\20\2\uffff";
    static final String dfa_4s = "\3\uffff\1\10\1\4\1\1\1\uffff\1\5\1\2\1\3\5\uffff\1\7\1\6";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\5\2\uffff\1\10\1\11\1\4\1\7\2\uffff\1\6\1\uffff\1\3",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\1\uffff\1\20",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "192:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_checkbox_1_0= ruleCheckbox ) ) | ( (lv_number_2_0= ruleNumber ) ) | ( (lv_dat_3_0= ruleDat ) ) | ( (lv_range_4_0= ruleRange ) ) | ( (lv_select_5_0= ruleSelect ) ) | ( (lv_search_6_0= ruleSearch ) ) | ( (lv_group_7_0= ruleGroup ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});

}