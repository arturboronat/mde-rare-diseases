package cafev.vform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cafev.vform.services.VFormDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVFormDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LAYOUT", "RULE_STRING", "RULE_BOOLEAN", "RULE_BASICINPUT", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"formLayout\":'", "','", "'\"formInputs\":'", "'['", "']'", "'}'", "'\"inputName\"'", "':'", "'\"id\"'", "'\"queryClause\"'", "'\"inputType\"'", "'\"range\"'", "'\"min\"'", "'\"max\"'", "'\"select\"'", "'\"options\"'", "'\"optionType\"'", "'\"data\"'", "'\"enum\"'", "'\"number\"'", "'\"search\"'", "'\"group\"'", "'\"groupInputs\"'", "'label:'", "'value:'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=5;
    public static final int RULE_LAYOUT=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_BASICINPUT=7;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

        public InternalVFormDslParser(TokenStream input, VFormDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VFormDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVFormDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVFormDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalVFormDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalVFormDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"formLayout\":' ( (lv_formLayout_2_0= ruleFormLayout ) ) otherlv_3= ',' otherlv_4= '\"formInputs\":' otherlv_5= '[' ( (lv_formInput_6_0= ruleFormInput ) ) (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )* otherlv_9= ']' otherlv_10= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_formLayout_2_0 = null;

        EObject lv_formInput_6_0 = null;

        EObject lv_formInput_8_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:77:2: ( (otherlv_0= '{' otherlv_1= '\"formLayout\":' ( (lv_formLayout_2_0= ruleFormLayout ) ) otherlv_3= ',' otherlv_4= '\"formInputs\":' otherlv_5= '[' ( (lv_formInput_6_0= ruleFormInput ) ) (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )* otherlv_9= ']' otherlv_10= '}' ) )
            // InternalVFormDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"formLayout\":' ( (lv_formLayout_2_0= ruleFormLayout ) ) otherlv_3= ',' otherlv_4= '\"formInputs\":' otherlv_5= '[' ( (lv_formInput_6_0= ruleFormInput ) ) (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )* otherlv_9= ']' otherlv_10= '}' )
            {
            // InternalVFormDsl.g:78:2: (otherlv_0= '{' otherlv_1= '\"formLayout\":' ( (lv_formLayout_2_0= ruleFormLayout ) ) otherlv_3= ',' otherlv_4= '\"formInputs\":' otherlv_5= '[' ( (lv_formInput_6_0= ruleFormInput ) ) (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )* otherlv_9= ']' otherlv_10= '}' )
            // InternalVFormDsl.g:79:3: otherlv_0= '{' otherlv_1= '\"formLayout\":' ( (lv_formLayout_2_0= ruleFormLayout ) ) otherlv_3= ',' otherlv_4= '\"formInputs\":' otherlv_5= '[' ( (lv_formInput_6_0= ruleFormInput ) ) (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )* otherlv_9= ']' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFormLayoutKeyword_1());
            		
            // InternalVFormDsl.g:87:3: ( (lv_formLayout_2_0= ruleFormLayout ) )
            // InternalVFormDsl.g:88:4: (lv_formLayout_2_0= ruleFormLayout )
            {
            // InternalVFormDsl.g:88:4: (lv_formLayout_2_0= ruleFormLayout )
            // InternalVFormDsl.g:89:5: lv_formLayout_2_0= ruleFormLayout
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFormLayoutFormLayoutParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_formLayout_2_0=ruleFormLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"formLayout",
            						lv_formLayout_2_0,
            						"cafev.vform.VFormDsl.FormLayout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFormInputsKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalVFormDsl.g:118:3: ( (lv_formInput_6_0= ruleFormInput ) )
            // InternalVFormDsl.g:119:4: (lv_formInput_6_0= ruleFormInput )
            {
            // InternalVFormDsl.g:119:4: (lv_formInput_6_0= ruleFormInput )
            // InternalVFormDsl.g:120:5: lv_formInput_6_0= ruleFormInput
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_formInput_6_0=ruleFormInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"formInput",
            						lv_formInput_6_0,
            						"cafev.vform.VFormDsl.FormInput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:137:3: (otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVFormDsl.g:138:4: otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalVFormDsl.g:142:4: ( (lv_formInput_8_0= ruleFormInput ) )
            	    // InternalVFormDsl.g:143:5: (lv_formInput_8_0= ruleFormInput )
            	    {
            	    // InternalVFormDsl.g:143:5: (lv_formInput_8_0= ruleFormInput )
            	    // InternalVFormDsl.g:144:6: lv_formInput_8_0= ruleFormInput
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFormInputFormInputParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_formInput_8_0=ruleFormInput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formInput",
            	    							lv_formInput_8_0,
            	    							"cafev.vform.VFormDsl.FormInput");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalVFormDsl.g:174:1: entryRuleFormLayout returns [EObject current=null] : iv_ruleFormLayout= ruleFormLayout EOF ;
    public final EObject entryRuleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormLayout = null;


        try {
            // InternalVFormDsl.g:174:51: (iv_ruleFormLayout= ruleFormLayout EOF )
            // InternalVFormDsl.g:175:2: iv_ruleFormLayout= ruleFormLayout EOF
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
    // InternalVFormDsl.g:181:1: ruleFormLayout returns [EObject current=null] : ( (lv_layout_0_0= RULE_LAYOUT ) ) ;
    public final EObject ruleFormLayout() throws RecognitionException {
        EObject current = null;

        Token lv_layout_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:187:2: ( ( (lv_layout_0_0= RULE_LAYOUT ) ) )
            // InternalVFormDsl.g:188:2: ( (lv_layout_0_0= RULE_LAYOUT ) )
            {
            // InternalVFormDsl.g:188:2: ( (lv_layout_0_0= RULE_LAYOUT ) )
            // InternalVFormDsl.g:189:3: (lv_layout_0_0= RULE_LAYOUT )
            {
            // InternalVFormDsl.g:189:3: (lv_layout_0_0= RULE_LAYOUT )
            // InternalVFormDsl.g:190:4: lv_layout_0_0= RULE_LAYOUT
            {
            lv_layout_0_0=(Token)match(input,RULE_LAYOUT,FOLLOW_2); 

            				newLeafNode(lv_layout_0_0, grammarAccess.getFormLayoutAccess().getLayoutLAYOUTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFormLayoutRule());
            				}
            				setWithLastConsumed(
            					current,
            					"layout",
            					lv_layout_0_0,
            					"cafev.vform.VFormDsl.LAYOUT");
            			

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
    // InternalVFormDsl.g:209:1: entryRuleFormInput returns [EObject current=null] : iv_ruleFormInput= ruleFormInput EOF ;
    public final EObject entryRuleFormInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInput = null;


        try {
            // InternalVFormDsl.g:209:50: (iv_ruleFormInput= ruleFormInput EOF )
            // InternalVFormDsl.g:210:2: iv_ruleFormInput= ruleFormInput EOF
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
    // InternalVFormDsl.g:216:1: ruleFormInput returns [EObject current=null] : (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup ) ;
    public final EObject ruleFormInput() throws RecognitionException {
        EObject current = null;

        EObject this_FormInputBasic_0 = null;

        EObject this_FormInputRange_1 = null;

        EObject this_FormInputSelect_2 = null;

        EObject this_FormInputSearch_3 = null;

        EObject this_FormInputGroup_4 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:222:2: ( (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup ) )
            // InternalVFormDsl.g:223:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )
            {
            // InternalVFormDsl.g:223:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalVFormDsl.g:224:3: this_FormInputBasic_0= ruleFormInputBasic
                    {

                    			newCompositeNode(grammarAccess.getFormInputAccess().getFormInputBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormInputBasic_0=ruleFormInputBasic();

                    state._fsp--;


                    			current = this_FormInputBasic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:233:3: this_FormInputRange_1= ruleFormInputRange
                    {

                    			newCompositeNode(grammarAccess.getFormInputAccess().getFormInputRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormInputRange_1=ruleFormInputRange();

                    state._fsp--;


                    			current = this_FormInputRange_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:242:3: this_FormInputSelect_2= ruleFormInputSelect
                    {

                    			newCompositeNode(grammarAccess.getFormInputAccess().getFormInputSelectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormInputSelect_2=ruleFormInputSelect();

                    state._fsp--;


                    			current = this_FormInputSelect_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVFormDsl.g:251:3: this_FormInputSearch_3= ruleFormInputSearch
                    {

                    			newCompositeNode(grammarAccess.getFormInputAccess().getFormInputSearchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormInputSearch_3=ruleFormInputSearch();

                    state._fsp--;


                    			current = this_FormInputSearch_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVFormDsl.g:260:3: this_FormInputGroup_4= ruleFormInputGroup
                    {

                    			newCompositeNode(grammarAccess.getFormInputAccess().getFormInputGroupParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormInputGroup_4=ruleFormInputGroup();

                    state._fsp--;


                    			current = this_FormInputGroup_4;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleFormInputBasic"
    // InternalVFormDsl.g:272:1: entryRuleFormInputBasic returns [EObject current=null] : iv_ruleFormInputBasic= ruleFormInputBasic EOF ;
    public final EObject entryRuleFormInputBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputBasic = null;


        try {
            // InternalVFormDsl.g:272:55: (iv_ruleFormInputBasic= ruleFormInputBasic EOF )
            // InternalVFormDsl.g:273:2: iv_ruleFormInputBasic= ruleFormInputBasic EOF
            {
             newCompositeNode(grammarAccess.getFormInputBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInputBasic=ruleFormInputBasic();

            state._fsp--;

             current =iv_ruleFormInputBasic; 
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
    // $ANTLR end "entryRuleFormInputBasic"


    // $ANTLR start "ruleFormInputBasic"
    // InternalVFormDsl.g:279:1: ruleFormInputBasic returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' ( (lv_type_15_0= RULE_BASICINPUT ) ) otherlv_16= '}' ) ;
    public final EObject ruleFormInputBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_qC_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_type_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:285:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' ( (lv_type_15_0= RULE_BASICINPUT ) ) otherlv_16= '}' ) )
            // InternalVFormDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' ( (lv_type_15_0= RULE_BASICINPUT ) ) otherlv_16= '}' )
            {
            // InternalVFormDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' ( (lv_type_15_0= RULE_BASICINPUT ) ) otherlv_16= '}' )
            // InternalVFormDsl.g:287:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' ( (lv_type_15_0= RULE_BASICINPUT ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputBasicAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputBasicAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputBasicAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:299:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:300:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:300:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:301:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFormInputBasicAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputBasicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputBasicAccess().getCommaKeyword_4());
            		
            // InternalVFormDsl.g:321:3: (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVFormDsl.g:322:4: otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormInputBasicAccess().getIdKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormInputBasicAccess().getColonKeyword_5_1());
                    			
                    // InternalVFormDsl.g:330:4: ( (lv_id_7_0= RULE_STRING ) )
                    // InternalVFormDsl.g:331:5: (lv_id_7_0= RULE_STRING )
                    {
                    // InternalVFormDsl.g:331:5: (lv_id_7_0= RULE_STRING )
                    // InternalVFormDsl.g:332:6: lv_id_7_0= RULE_STRING
                    {
                    lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_id_7_0, grammarAccess.getFormInputBasicAccess().getIdSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormInputBasicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormInputBasicAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputBasicAccess().getQueryClauseKeyword_6());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputBasicAccess().getColonKeyword_7());
            		
            // InternalVFormDsl.g:361:3: ( (lv_qC_11_0= RULE_BOOLEAN ) )
            // InternalVFormDsl.g:362:4: (lv_qC_11_0= RULE_BOOLEAN )
            {
            // InternalVFormDsl.g:362:4: (lv_qC_11_0= RULE_BOOLEAN )
            // InternalVFormDsl.g:363:5: lv_qC_11_0= RULE_BOOLEAN
            {
            lv_qC_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_5); 

            					newLeafNode(lv_qC_11_0, grammarAccess.getFormInputBasicAccess().getQCBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputBasicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qC",
            						lv_qC_11_0,
            						"cafev.vform.VFormDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputBasicAccess().getCommaKeyword_9());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputBasicAccess().getInputTypeKeyword_10());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputBasicAccess().getColonKeyword_11());
            		
            // InternalVFormDsl.g:391:3: ( (lv_type_15_0= RULE_BASICINPUT ) )
            // InternalVFormDsl.g:392:4: (lv_type_15_0= RULE_BASICINPUT )
            {
            // InternalVFormDsl.g:392:4: (lv_type_15_0= RULE_BASICINPUT )
            // InternalVFormDsl.g:393:5: lv_type_15_0= RULE_BASICINPUT
            {
            lv_type_15_0=(Token)match(input,RULE_BASICINPUT,FOLLOW_10); 

            					newLeafNode(lv_type_15_0, grammarAccess.getFormInputBasicAccess().getTypeBASICINPUTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputBasicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_15_0,
            						"cafev.vform.VFormDsl.BASICINPUT");
            				

            }


            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputBasicAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleFormInputBasic"


    // $ANTLR start "entryRuleFormInputRange"
    // InternalVFormDsl.g:417:1: entryRuleFormInputRange returns [EObject current=null] : iv_ruleFormInputRange= ruleFormInputRange EOF ;
    public final EObject entryRuleFormInputRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputRange = null;


        try {
            // InternalVFormDsl.g:417:55: (iv_ruleFormInputRange= ruleFormInputRange EOF )
            // InternalVFormDsl.g:418:2: iv_ruleFormInputRange= ruleFormInputRange EOF
            {
             newCompositeNode(grammarAccess.getFormInputRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInputRange=ruleFormInputRange();

            state._fsp--;

             current =iv_ruleFormInputRange; 
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
    // $ANTLR end "entryRuleFormInputRange"


    // $ANTLR start "ruleFormInputRange"
    // InternalVFormDsl.g:424:1: ruleFormInputRange returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"range\"' otherlv_16= ',' otherlv_17= '\"min\"' otherlv_18= ':' ( (lv_min_19_0= RULE_INT ) ) otherlv_20= ',' otherlv_21= '\"max\"' otherlv_22= ':' ( (lv_max_23_0= RULE_INT ) ) otherlv_24= '}' ) ;
    public final EObject ruleFormInputRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_qC_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_min_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_max_23_0=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:430:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"range\"' otherlv_16= ',' otherlv_17= '\"min\"' otherlv_18= ':' ( (lv_min_19_0= RULE_INT ) ) otherlv_20= ',' otherlv_21= '\"max\"' otherlv_22= ':' ( (lv_max_23_0= RULE_INT ) ) otherlv_24= '}' ) )
            // InternalVFormDsl.g:431:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"range\"' otherlv_16= ',' otherlv_17= '\"min\"' otherlv_18= ':' ( (lv_min_19_0= RULE_INT ) ) otherlv_20= ',' otherlv_21= '\"max\"' otherlv_22= ':' ( (lv_max_23_0= RULE_INT ) ) otherlv_24= '}' )
            {
            // InternalVFormDsl.g:431:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"range\"' otherlv_16= ',' otherlv_17= '\"min\"' otherlv_18= ':' ( (lv_min_19_0= RULE_INT ) ) otherlv_20= ',' otherlv_21= '\"max\"' otherlv_22= ':' ( (lv_max_23_0= RULE_INT ) ) otherlv_24= '}' )
            // InternalVFormDsl.g:432:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"range\"' otherlv_16= ',' otherlv_17= '\"min\"' otherlv_18= ':' ( (lv_min_19_0= RULE_INT ) ) otherlv_20= ',' otherlv_21= '\"max\"' otherlv_22= ':' ( (lv_max_23_0= RULE_INT ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputRangeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputRangeAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputRangeAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:444:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:445:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:445:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:446:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFormInputRangeAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputRangeAccess().getCommaKeyword_4());
            		
            // InternalVFormDsl.g:466:3: (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVFormDsl.g:467:4: otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormInputRangeAccess().getIdKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormInputRangeAccess().getColonKeyword_5_1());
                    			
                    // InternalVFormDsl.g:475:4: ( (lv_id_7_0= RULE_STRING ) )
                    // InternalVFormDsl.g:476:5: (lv_id_7_0= RULE_STRING )
                    {
                    // InternalVFormDsl.g:476:5: (lv_id_7_0= RULE_STRING )
                    // InternalVFormDsl.g:477:6: lv_id_7_0= RULE_STRING
                    {
                    lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_id_7_0, grammarAccess.getFormInputRangeAccess().getIdSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormInputRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormInputRangeAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputRangeAccess().getQueryClauseKeyword_6());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputRangeAccess().getColonKeyword_7());
            		
            // InternalVFormDsl.g:506:3: ( (lv_qC_11_0= RULE_BOOLEAN ) )
            // InternalVFormDsl.g:507:4: (lv_qC_11_0= RULE_BOOLEAN )
            {
            // InternalVFormDsl.g:507:4: (lv_qC_11_0= RULE_BOOLEAN )
            // InternalVFormDsl.g:508:5: lv_qC_11_0= RULE_BOOLEAN
            {
            lv_qC_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_5); 

            					newLeafNode(lv_qC_11_0, grammarAccess.getFormInputRangeAccess().getQCBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qC",
            						lv_qC_11_0,
            						"cafev.vform.VFormDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputRangeAccess().getCommaKeyword_9());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputRangeAccess().getInputTypeKeyword_10());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputRangeAccess().getColonKeyword_11());
            		
            otherlv_15=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getFormInputRangeAccess().getRangeKeyword_12());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputRangeAccess().getCommaKeyword_13());
            		
            otherlv_17=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getFormInputRangeAccess().getMinKeyword_14());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_18, grammarAccess.getFormInputRangeAccess().getColonKeyword_15());
            		
            // InternalVFormDsl.g:552:3: ( (lv_min_19_0= RULE_INT ) )
            // InternalVFormDsl.g:553:4: (lv_min_19_0= RULE_INT )
            {
            // InternalVFormDsl.g:553:4: (lv_min_19_0= RULE_INT )
            // InternalVFormDsl.g:554:5: lv_min_19_0= RULE_INT
            {
            lv_min_19_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_min_19_0, grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_19_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_20=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_20, grammarAccess.getFormInputRangeAccess().getCommaKeyword_17());
            		
            otherlv_21=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_21, grammarAccess.getFormInputRangeAccess().getMaxKeyword_18());
            		
            otherlv_22=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_22, grammarAccess.getFormInputRangeAccess().getColonKeyword_19());
            		
            // InternalVFormDsl.g:582:3: ( (lv_max_23_0= RULE_INT ) )
            // InternalVFormDsl.g:583:4: (lv_max_23_0= RULE_INT )
            {
            // InternalVFormDsl.g:583:4: (lv_max_23_0= RULE_INT )
            // InternalVFormDsl.g:584:5: lv_max_23_0= RULE_INT
            {
            lv_max_23_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_max_23_0, grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_23_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFormInputRangeAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleFormInputRange"


    // $ANTLR start "entryRuleFormInputSelect"
    // InternalVFormDsl.g:608:1: entryRuleFormInputSelect returns [EObject current=null] : iv_ruleFormInputSelect= ruleFormInputSelect EOF ;
    public final EObject entryRuleFormInputSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSelect = null;


        try {
            // InternalVFormDsl.g:608:56: (iv_ruleFormInputSelect= ruleFormInputSelect EOF )
            // InternalVFormDsl.g:609:2: iv_ruleFormInputSelect= ruleFormInputSelect EOF
            {
             newCompositeNode(grammarAccess.getFormInputSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInputSelect=ruleFormInputSelect();

            state._fsp--;

             current =iv_ruleFormInputSelect; 
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
    // $ANTLR end "entryRuleFormInputSelect"


    // $ANTLR start "ruleFormInputSelect"
    // InternalVFormDsl.g:615:1: ruleFormInputSelect returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"select\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' ( (lv_option_19_0= ruleOption ) ) otherlv_20= '}' ) ;
    public final EObject ruleFormInputSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_qC_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_option_19_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:621:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"select\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' ( (lv_option_19_0= ruleOption ) ) otherlv_20= '}' ) )
            // InternalVFormDsl.g:622:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"select\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' ( (lv_option_19_0= ruleOption ) ) otherlv_20= '}' )
            {
            // InternalVFormDsl.g:622:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"select\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' ( (lv_option_19_0= ruleOption ) ) otherlv_20= '}' )
            // InternalVFormDsl.g:623:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"select\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' ( (lv_option_19_0= ruleOption ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSelectAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSelectAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputSelectAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:635:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:636:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:636:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:637:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFormInputSelectAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSelectAccess().getCommaKeyword_4());
            		
            // InternalVFormDsl.g:657:3: (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVFormDsl.g:658:4: otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormInputSelectAccess().getIdKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormInputSelectAccess().getColonKeyword_5_1());
                    			
                    // InternalVFormDsl.g:666:4: ( (lv_id_7_0= RULE_STRING ) )
                    // InternalVFormDsl.g:667:5: (lv_id_7_0= RULE_STRING )
                    {
                    // InternalVFormDsl.g:667:5: (lv_id_7_0= RULE_STRING )
                    // InternalVFormDsl.g:668:6: lv_id_7_0= RULE_STRING
                    {
                    lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_id_7_0, grammarAccess.getFormInputSelectAccess().getIdSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormInputSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormInputSelectAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSelectAccess().getQueryClauseKeyword_6());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputSelectAccess().getColonKeyword_7());
            		
            // InternalVFormDsl.g:697:3: ( (lv_qC_11_0= RULE_BOOLEAN ) )
            // InternalVFormDsl.g:698:4: (lv_qC_11_0= RULE_BOOLEAN )
            {
            // InternalVFormDsl.g:698:4: (lv_qC_11_0= RULE_BOOLEAN )
            // InternalVFormDsl.g:699:5: lv_qC_11_0= RULE_BOOLEAN
            {
            lv_qC_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_5); 

            					newLeafNode(lv_qC_11_0, grammarAccess.getFormInputSelectAccess().getQCBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qC",
            						lv_qC_11_0,
            						"cafev.vform.VFormDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputSelectAccess().getCommaKeyword_9());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputSelectAccess().getInputTypeKeyword_10());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputSelectAccess().getColonKeyword_11());
            		
            otherlv_15=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getFormInputSelectAccess().getSelectKeyword_12());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputSelectAccess().getCommaKeyword_13());
            		
            otherlv_17=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getFormInputSelectAccess().getOptionsKeyword_14());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getFormInputSelectAccess().getColonKeyword_15());
            		
            // InternalVFormDsl.g:743:3: ( (lv_option_19_0= ruleOption ) )
            // InternalVFormDsl.g:744:4: (lv_option_19_0= ruleOption )
            {
            // InternalVFormDsl.g:744:4: (lv_option_19_0= ruleOption )
            // InternalVFormDsl.g:745:5: lv_option_19_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_10);
            lv_option_19_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSelectRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_19_0,
            						"cafev.vform.VFormDsl.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getFormInputSelectAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleFormInputSelect"


    // $ANTLR start "entryRuleOption"
    // InternalVFormDsl.g:770:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalVFormDsl.g:770:47: (iv_ruleOption= ruleOption EOF )
            // InternalVFormDsl.g:771:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalVFormDsl.g:777:1: ruleOption returns [EObject current=null] : (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_DataOption_0 = null;

        EObject this_EnumOption_1 = null;

        EObject this_NumberOption_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:783:2: ( (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) )
            // InternalVFormDsl.g:784:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            {
            // InternalVFormDsl.g:784:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==31) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==22) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            alt6=1;
                            }
                            break;
                        case 33:
                            {
                            alt6=2;
                            }
                            break;
                        case 34:
                            {
                            alt6=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVFormDsl.g:785:3: this_DataOption_0= ruleDataOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDataOptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataOption_0=ruleDataOption();

                    state._fsp--;


                    			current = this_DataOption_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:794:3: this_EnumOption_1= ruleEnumOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getEnumOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumOption_1=ruleEnumOption();

                    state._fsp--;


                    			current = this_EnumOption_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:803:3: this_NumberOption_2= ruleNumberOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getNumberOptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberOption_2=ruleNumberOption();

                    state._fsp--;


                    			current = this_NumberOption_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalVFormDsl.g:815:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalVFormDsl.g:815:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalVFormDsl.g:816:2: iv_ruleDataOption= ruleDataOption EOF
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
    // InternalVFormDsl.g:822:1: ruleDataOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_data_8_0 = null;

        EObject lv_data_10_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:828:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalVFormDsl.g:829:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalVFormDsl.g:829:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalVFormDsl.g:830:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDataOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDataOptionAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getDataOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDataOptionAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataOptionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalVFormDsl.g:862:3: ( (lv_data_8_0= ruleData ) )
            // InternalVFormDsl.g:863:4: (lv_data_8_0= ruleData )
            {
            // InternalVFormDsl.g:863:4: (lv_data_8_0= ruleData )
            // InternalVFormDsl.g:864:5: lv_data_8_0= ruleData
            {

            					newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_8_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataOptionRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_8_0,
            						"cafev.vform.VFormDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:881:3: (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVFormDsl.g:882:4: otherlv_9= ',' ( (lv_data_10_0= ruleData ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDataOptionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVFormDsl.g:886:4: ( (lv_data_10_0= ruleData ) )
            	    // InternalVFormDsl.g:887:5: (lv_data_10_0= ruleData )
            	    {
            	    // InternalVFormDsl.g:887:5: (lv_data_10_0= ruleData )
            	    // InternalVFormDsl.g:888:6: lv_data_10_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_10_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataOptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_10_0,
            	    							"cafev.vform.VFormDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDataOptionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalVFormDsl.g:918:1: entryRuleEnumOption returns [EObject current=null] : iv_ruleEnumOption= ruleEnumOption EOF ;
    public final EObject entryRuleEnumOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOption = null;


        try {
            // InternalVFormDsl.g:918:51: (iv_ruleEnumOption= ruleEnumOption EOF )
            // InternalVFormDsl.g:919:2: iv_ruleEnumOption= ruleEnumOption EOF
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
    // InternalVFormDsl.g:925:1: ruleEnumOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
    public final EObject ruleEnumOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_data_8_0 = null;

        EObject lv_data_10_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:931:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalVFormDsl.g:932:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalVFormDsl.g:932:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalVFormDsl.g:933:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumOptionAccess().getEnumKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumOptionAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumOptionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalVFormDsl.g:965:3: ( (lv_data_8_0= ruleOptionItem ) )
            // InternalVFormDsl.g:966:4: (lv_data_8_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:966:4: (lv_data_8_0= ruleOptionItem )
            // InternalVFormDsl.g:967:5: lv_data_8_0= ruleOptionItem
            {

            					newCompositeNode(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_8_0=ruleOptionItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumOptionRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_8_0,
            						"cafev.vform.VFormDsl.OptionItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:984:3: (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVFormDsl.g:985:4: otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_28); 

            	    				newLeafNode(otherlv_9, grammarAccess.getEnumOptionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVFormDsl.g:989:4: ( (lv_data_10_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:990:5: (lv_data_10_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:990:5: (lv_data_10_0= ruleOptionItem )
            	    // InternalVFormDsl.g:991:6: lv_data_10_0= ruleOptionItem
            	    {

            	    						newCompositeNode(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_10_0=ruleOptionItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumOptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_10_0,
            	    							"cafev.vform.VFormDsl.OptionItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEnumOptionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalVFormDsl.g:1021:1: entryRuleNumberOption returns [EObject current=null] : iv_ruleNumberOption= ruleNumberOption EOF ;
    public final EObject entryRuleNumberOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOption = null;


        try {
            // InternalVFormDsl.g:1021:53: (iv_ruleNumberOption= ruleNumberOption EOF )
            // InternalVFormDsl.g:1022:2: iv_ruleNumberOption= ruleNumberOption EOF
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
    // InternalVFormDsl.g:1028:1: ruleNumberOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' ) ;
    public final EObject ruleNumberOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_min_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_max_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_range_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1034:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' ) )
            // InternalVFormDsl.g:1035:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' )
            {
            // InternalVFormDsl.g:1035:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' )
            // InternalVFormDsl.g:1036:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberOptionAccess().getNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getNumberOptionAccess().getMinKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberOptionAccess().getColonKeyword_6());
            		
            // InternalVFormDsl.g:1064:3: ( (lv_min_7_0= RULE_INT ) )
            // InternalVFormDsl.g:1065:4: (lv_min_7_0= RULE_INT )
            {
            // InternalVFormDsl.g:1065:4: (lv_min_7_0= RULE_INT )
            // InternalVFormDsl.g:1066:5: lv_min_7_0= RULE_INT
            {
            lv_min_7_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_min_7_0, grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getNumberOptionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getNumberOptionAccess().getMaxKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getNumberOptionAccess().getColonKeyword_10());
            		
            // InternalVFormDsl.g:1094:3: ( (lv_max_11_0= RULE_INT ) )
            // InternalVFormDsl.g:1095:4: (lv_max_11_0= RULE_INT )
            {
            // InternalVFormDsl.g:1095:4: (lv_max_11_0= RULE_INT )
            // InternalVFormDsl.g:1096:5: lv_max_11_0= RULE_INT
            {
            lv_max_11_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_max_11_0, grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getNumberOptionAccess().getRangeKeyword_12());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getNumberOptionAccess().getColonKeyword_13());
            		
            // InternalVFormDsl.g:1120:3: ( (lv_range_14_0= RULE_INT ) )
            // InternalVFormDsl.g:1121:4: (lv_range_14_0= RULE_INT )
            {
            // InternalVFormDsl.g:1121:4: (lv_range_14_0= RULE_INT )
            // InternalVFormDsl.g:1122:5: lv_range_14_0= RULE_INT
            {
            lv_range_14_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_range_14_0, grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getNumberOptionAccess().getRightCurlyBracketKeyword_15());
            		

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


    // $ANTLR start "entryRuleFormInputSearch"
    // InternalVFormDsl.g:1146:1: entryRuleFormInputSearch returns [EObject current=null] : iv_ruleFormInputSearch= ruleFormInputSearch EOF ;
    public final EObject entryRuleFormInputSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSearch = null;


        try {
            // InternalVFormDsl.g:1146:56: (iv_ruleFormInputSearch= ruleFormInputSearch EOF )
            // InternalVFormDsl.g:1147:2: iv_ruleFormInputSearch= ruleFormInputSearch EOF
            {
             newCompositeNode(grammarAccess.getFormInputSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInputSearch=ruleFormInputSearch();

            state._fsp--;

             current =iv_ruleFormInputSearch; 
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
    // $ANTLR end "entryRuleFormInputSearch"


    // $ANTLR start "ruleFormInputSearch"
    // InternalVFormDsl.g:1153:1: ruleFormInputSearch returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"search\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' otherlv_19= '[' ( (lv_data_20_0= ruleOptionItem ) ) (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )* otherlv_23= ']' otherlv_24= '}' ) ;
    public final EObject ruleFormInputSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_qC_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_data_20_0 = null;

        EObject lv_data_22_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1159:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"search\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' otherlv_19= '[' ( (lv_data_20_0= ruleOptionItem ) ) (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )* otherlv_23= ']' otherlv_24= '}' ) )
            // InternalVFormDsl.g:1160:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"search\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' otherlv_19= '[' ( (lv_data_20_0= ruleOptionItem ) ) (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )* otherlv_23= ']' otherlv_24= '}' )
            {
            // InternalVFormDsl.g:1160:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"search\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' otherlv_19= '[' ( (lv_data_20_0= ruleOptionItem ) ) (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )* otherlv_23= ']' otherlv_24= '}' )
            // InternalVFormDsl.g:1161:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"search\"' otherlv_16= ',' otherlv_17= '\"options\"' otherlv_18= ':' otherlv_19= '[' ( (lv_data_20_0= ruleOptionItem ) ) (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )* otherlv_23= ']' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSearchAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSearchAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputSearchAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:1173:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:1174:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1174:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:1175:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFormInputSearchAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSearchAccess().getCommaKeyword_4());
            		
            // InternalVFormDsl.g:1195:3: (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVFormDsl.g:1196:4: otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormInputSearchAccess().getIdKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormInputSearchAccess().getColonKeyword_5_1());
                    			
                    // InternalVFormDsl.g:1204:4: ( (lv_id_7_0= RULE_STRING ) )
                    // InternalVFormDsl.g:1205:5: (lv_id_7_0= RULE_STRING )
                    {
                    // InternalVFormDsl.g:1205:5: (lv_id_7_0= RULE_STRING )
                    // InternalVFormDsl.g:1206:6: lv_id_7_0= RULE_STRING
                    {
                    lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_id_7_0, grammarAccess.getFormInputSearchAccess().getIdSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormInputSearchRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormInputSearchAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSearchAccess().getQueryClauseKeyword_6());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputSearchAccess().getColonKeyword_7());
            		
            // InternalVFormDsl.g:1235:3: ( (lv_qC_11_0= RULE_BOOLEAN ) )
            // InternalVFormDsl.g:1236:4: (lv_qC_11_0= RULE_BOOLEAN )
            {
            // InternalVFormDsl.g:1236:4: (lv_qC_11_0= RULE_BOOLEAN )
            // InternalVFormDsl.g:1237:5: lv_qC_11_0= RULE_BOOLEAN
            {
            lv_qC_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_5); 

            					newLeafNode(lv_qC_11_0, grammarAccess.getFormInputSearchAccess().getQCBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qC",
            						lv_qC_11_0,
            						"cafev.vform.VFormDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputSearchAccess().getCommaKeyword_9());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputSearchAccess().getInputTypeKeyword_10());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputSearchAccess().getColonKeyword_11());
            		
            otherlv_15=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getFormInputSearchAccess().getSearchKeyword_12());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputSearchAccess().getCommaKeyword_13());
            		
            otherlv_17=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getFormInputSearchAccess().getOptionsKeyword_14());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getFormInputSearchAccess().getColonKeyword_15());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_19, grammarAccess.getFormInputSearchAccess().getLeftSquareBracketKeyword_16());
            		
            // InternalVFormDsl.g:1285:3: ( (lv_data_20_0= ruleOptionItem ) )
            // InternalVFormDsl.g:1286:4: (lv_data_20_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:1286:4: (lv_data_20_0= ruleOptionItem )
            // InternalVFormDsl.g:1287:5: lv_data_20_0= ruleOptionItem
            {

            					newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_20_0=ruleOptionItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSearchRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_20_0,
            						"cafev.vform.VFormDsl.OptionItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:1304:3: (otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVFormDsl.g:1305:4: otherlv_21= ',' ( (lv_data_22_0= ruleOptionItem ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_28); 

            	    				newLeafNode(otherlv_21, grammarAccess.getFormInputSearchAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalVFormDsl.g:1309:4: ( (lv_data_22_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:1310:5: (lv_data_22_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:1310:5: (lv_data_22_0= ruleOptionItem )
            	    // InternalVFormDsl.g:1311:6: lv_data_22_0= ruleOptionItem
            	    {

            	    						newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_22_0=ruleOptionItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormInputSearchRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_22_0,
            	    							"cafev.vform.VFormDsl.OptionItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_23=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_23, grammarAccess.getFormInputSearchAccess().getRightSquareBracketKeyword_19());
            		
            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFormInputSearchAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleFormInputSearch"


    // $ANTLR start "entryRuleOptionItem"
    // InternalVFormDsl.g:1341:1: entryRuleOptionItem returns [EObject current=null] : iv_ruleOptionItem= ruleOptionItem EOF ;
    public final EObject entryRuleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionItem = null;


        try {
            // InternalVFormDsl.g:1341:51: (iv_ruleOptionItem= ruleOptionItem EOF )
            // InternalVFormDsl.g:1342:2: iv_ruleOptionItem= ruleOptionItem EOF
            {
             newCompositeNode(grammarAccess.getOptionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionItem=ruleOptionItem();

            state._fsp--;

             current =iv_ruleOptionItem; 
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
    // $ANTLR end "entryRuleOptionItem"


    // $ANTLR start "ruleOptionItem"
    // InternalVFormDsl.g:1348:1: ruleOptionItem returns [EObject current=null] : (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) ;
    public final EObject ruleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject this_StringOptionItem_0 = null;

        EObject this_IntOptionItem_1 = null;

        EObject this_DataOptionItem_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1354:2: ( (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) )
            // InternalVFormDsl.g:1355:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
            {
            // InternalVFormDsl.g:1355:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case 14:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVFormDsl.g:1356:3: this_StringOptionItem_0= ruleStringOptionItem
                    {

                    			newCompositeNode(grammarAccess.getOptionItemAccess().getStringOptionItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringOptionItem_0=ruleStringOptionItem();

                    state._fsp--;


                    			current = this_StringOptionItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1365:3: this_IntOptionItem_1= ruleIntOptionItem
                    {

                    			newCompositeNode(grammarAccess.getOptionItemAccess().getIntOptionItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntOptionItem_1=ruleIntOptionItem();

                    state._fsp--;


                    			current = this_IntOptionItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:1374:3: this_DataOptionItem_2= ruleDataOptionItem
                    {

                    			newCompositeNode(grammarAccess.getOptionItemAccess().getDataOptionItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataOptionItem_2=ruleDataOptionItem();

                    state._fsp--;


                    			current = this_DataOptionItem_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOptionItem"


    // $ANTLR start "entryRuleStringOptionItem"
    // InternalVFormDsl.g:1386:1: entryRuleStringOptionItem returns [EObject current=null] : iv_ruleStringOptionItem= ruleStringOptionItem EOF ;
    public final EObject entryRuleStringOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOptionItem = null;


        try {
            // InternalVFormDsl.g:1386:57: (iv_ruleStringOptionItem= ruleStringOptionItem EOF )
            // InternalVFormDsl.g:1387:2: iv_ruleStringOptionItem= ruleStringOptionItem EOF
            {
             newCompositeNode(grammarAccess.getStringOptionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOptionItem=ruleStringOptionItem();

            state._fsp--;

             current =iv_ruleStringOptionItem; 
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
    // $ANTLR end "entryRuleStringOptionItem"


    // $ANTLR start "ruleStringOptionItem"
    // InternalVFormDsl.g:1393:1: ruleStringOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1399:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalVFormDsl.g:1400:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalVFormDsl.g:1400:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalVFormDsl.g:1401:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1401:3: (lv_value_0_0= RULE_STRING )
            // InternalVFormDsl.g:1402:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringOptionItemAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringOptionItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringOptionItem"


    // $ANTLR start "entryRuleIntOptionItem"
    // InternalVFormDsl.g:1421:1: entryRuleIntOptionItem returns [EObject current=null] : iv_ruleIntOptionItem= ruleIntOptionItem EOF ;
    public final EObject entryRuleIntOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOptionItem = null;


        try {
            // InternalVFormDsl.g:1421:54: (iv_ruleIntOptionItem= ruleIntOptionItem EOF )
            // InternalVFormDsl.g:1422:2: iv_ruleIntOptionItem= ruleIntOptionItem EOF
            {
             newCompositeNode(grammarAccess.getIntOptionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOptionItem=ruleIntOptionItem();

            state._fsp--;

             current =iv_ruleIntOptionItem; 
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
    // $ANTLR end "entryRuleIntOptionItem"


    // $ANTLR start "ruleIntOptionItem"
    // InternalVFormDsl.g:1428:1: ruleIntOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1434:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalVFormDsl.g:1435:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalVFormDsl.g:1435:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalVFormDsl.g:1436:3: (lv_value_0_0= RULE_INT )
            {
            // InternalVFormDsl.g:1436:3: (lv_value_0_0= RULE_INT )
            // InternalVFormDsl.g:1437:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntOptionItemAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntOptionItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntOptionItem"


    // $ANTLR start "entryRuleDataOptionItem"
    // InternalVFormDsl.g:1456:1: entryRuleDataOptionItem returns [EObject current=null] : iv_ruleDataOptionItem= ruleDataOptionItem EOF ;
    public final EObject entryRuleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOptionItem = null;


        try {
            // InternalVFormDsl.g:1456:55: (iv_ruleDataOptionItem= ruleDataOptionItem EOF )
            // InternalVFormDsl.g:1457:2: iv_ruleDataOptionItem= ruleDataOptionItem EOF
            {
             newCompositeNode(grammarAccess.getDataOptionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataOptionItem=ruleDataOptionItem();

            state._fsp--;

             current =iv_ruleDataOptionItem; 
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
    // $ANTLR end "entryRuleDataOptionItem"


    // $ANTLR start "ruleDataOptionItem"
    // InternalVFormDsl.g:1463:1: ruleDataOptionItem returns [EObject current=null] : ( (lv_value_0_0= ruleData ) ) ;
    public final EObject ruleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1469:2: ( ( (lv_value_0_0= ruleData ) ) )
            // InternalVFormDsl.g:1470:2: ( (lv_value_0_0= ruleData ) )
            {
            // InternalVFormDsl.g:1470:2: ( (lv_value_0_0= ruleData ) )
            // InternalVFormDsl.g:1471:3: (lv_value_0_0= ruleData )
            {
            // InternalVFormDsl.g:1471:3: (lv_value_0_0= ruleData )
            // InternalVFormDsl.g:1472:4: lv_value_0_0= ruleData
            {

            				newCompositeNode(grammarAccess.getDataOptionItemAccess().getValueDataParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleData();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDataOptionItemRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"cafev.vform.VFormDsl.Data");
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
    // $ANTLR end "ruleDataOptionItem"


    // $ANTLR start "entryRuleFormInputGroup"
    // InternalVFormDsl.g:1492:1: entryRuleFormInputGroup returns [EObject current=null] : iv_ruleFormInputGroup= ruleFormInputGroup EOF ;
    public final EObject entryRuleFormInputGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputGroup = null;


        try {
            // InternalVFormDsl.g:1492:55: (iv_ruleFormInputGroup= ruleFormInputGroup EOF )
            // InternalVFormDsl.g:1493:2: iv_ruleFormInputGroup= ruleFormInputGroup EOF
            {
             newCompositeNode(grammarAccess.getFormInputGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormInputGroup=ruleFormInputGroup();

            state._fsp--;

             current =iv_ruleFormInputGroup; 
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
    // $ANTLR end "entryRuleFormInputGroup"


    // $ANTLR start "ruleFormInputGroup"
    // InternalVFormDsl.g:1499:1: ruleFormInputGroup returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"group\"' otherlv_16= ',' otherlv_17= '\"groupInputs\"' otherlv_18= ':' otherlv_19= '[' ( (lv_groupInputs_20_0= ruleFormInput ) )? (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )* otherlv_23= ']' otherlv_24= '}' ) ;
    public final EObject ruleFormInputGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_qC_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_groupInputs_20_0 = null;

        EObject lv_groupInputs_22_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1505:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"group\"' otherlv_16= ',' otherlv_17= '\"groupInputs\"' otherlv_18= ':' otherlv_19= '[' ( (lv_groupInputs_20_0= ruleFormInput ) )? (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )* otherlv_23= ']' otherlv_24= '}' ) )
            // InternalVFormDsl.g:1506:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"group\"' otherlv_16= ',' otherlv_17= '\"groupInputs\"' otherlv_18= ':' otherlv_19= '[' ( (lv_groupInputs_20_0= ruleFormInput ) )? (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )* otherlv_23= ']' otherlv_24= '}' )
            {
            // InternalVFormDsl.g:1506:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"group\"' otherlv_16= ',' otherlv_17= '\"groupInputs\"' otherlv_18= ':' otherlv_19= '[' ( (lv_groupInputs_20_0= ruleFormInput ) )? (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )* otherlv_23= ']' otherlv_24= '}' )
            // InternalVFormDsl.g:1507:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= '\"queryClause\"' otherlv_10= ':' ( (lv_qC_11_0= RULE_BOOLEAN ) ) otherlv_12= ',' otherlv_13= '\"inputType\"' otherlv_14= ':' otherlv_15= '\"group\"' otherlv_16= ',' otherlv_17= '\"groupInputs\"' otherlv_18= ':' otherlv_19= '[' ( (lv_groupInputs_20_0= ruleFormInput ) )? (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )* otherlv_23= ']' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputGroupAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputGroupAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputGroupAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:1519:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:1520:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1520:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:1521:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFormInputGroupAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputGroupAccess().getCommaKeyword_4());
            		
            // InternalVFormDsl.g:1541:3: (otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVFormDsl.g:1542:4: otherlv_5= '\"id\"' otherlv_6= ':' ( (lv_id_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormInputGroupAccess().getIdKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormInputGroupAccess().getColonKeyword_5_1());
                    			
                    // InternalVFormDsl.g:1550:4: ( (lv_id_7_0= RULE_STRING ) )
                    // InternalVFormDsl.g:1551:5: (lv_id_7_0= RULE_STRING )
                    {
                    // InternalVFormDsl.g:1551:5: (lv_id_7_0= RULE_STRING )
                    // InternalVFormDsl.g:1552:6: lv_id_7_0= RULE_STRING
                    {
                    lv_id_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_id_7_0, grammarAccess.getFormInputGroupAccess().getIdSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormInputGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormInputGroupAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputGroupAccess().getQueryClauseKeyword_6());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputGroupAccess().getColonKeyword_7());
            		
            // InternalVFormDsl.g:1581:3: ( (lv_qC_11_0= RULE_BOOLEAN ) )
            // InternalVFormDsl.g:1582:4: (lv_qC_11_0= RULE_BOOLEAN )
            {
            // InternalVFormDsl.g:1582:4: (lv_qC_11_0= RULE_BOOLEAN )
            // InternalVFormDsl.g:1583:5: lv_qC_11_0= RULE_BOOLEAN
            {
            lv_qC_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_5); 

            					newLeafNode(lv_qC_11_0, grammarAccess.getFormInputGroupAccess().getQCBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qC",
            						lv_qC_11_0,
            						"cafev.vform.VFormDsl.BOOLEAN");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputGroupAccess().getCommaKeyword_9());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputGroupAccess().getInputTypeKeyword_10());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputGroupAccess().getColonKeyword_11());
            		
            otherlv_15=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getFormInputGroupAccess().getGroupKeyword_12());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputGroupAccess().getCommaKeyword_13());
            		
            otherlv_17=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getFormInputGroupAccess().getGroupInputsKeyword_14());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getFormInputGroupAccess().getColonKeyword_15());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_19, grammarAccess.getFormInputGroupAccess().getLeftSquareBracketKeyword_16());
            		
            // InternalVFormDsl.g:1631:3: ( (lv_groupInputs_20_0= ruleFormInput ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVFormDsl.g:1632:4: (lv_groupInputs_20_0= ruleFormInput )
                    {
                    // InternalVFormDsl.g:1632:4: (lv_groupInputs_20_0= ruleFormInput )
                    // InternalVFormDsl.g:1633:5: lv_groupInputs_20_0= ruleFormInput
                    {

                    					newCompositeNode(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputParserRuleCall_17_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_groupInputs_20_0=ruleFormInput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormInputGroupRule());
                    					}
                    					add(
                    						current,
                    						"groupInputs",
                    						lv_groupInputs_20_0,
                    						"cafev.vform.VFormDsl.FormInput");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVFormDsl.g:1650:3: (otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVFormDsl.g:1651:4: otherlv_21= ',' ( (lv_groupInputs_22_0= ruleFormInput ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_21, grammarAccess.getFormInputGroupAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalVFormDsl.g:1655:4: ( (lv_groupInputs_22_0= ruleFormInput ) )
            	    // InternalVFormDsl.g:1656:5: (lv_groupInputs_22_0= ruleFormInput )
            	    {
            	    // InternalVFormDsl.g:1656:5: (lv_groupInputs_22_0= ruleFormInput )
            	    // InternalVFormDsl.g:1657:6: lv_groupInputs_22_0= ruleFormInput
            	    {

            	    						newCompositeNode(grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_groupInputs_22_0=ruleFormInput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormInputGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groupInputs",
            	    							lv_groupInputs_22_0,
            	    							"cafev.vform.VFormDsl.FormInput");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_23=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_23, grammarAccess.getFormInputGroupAccess().getRightSquareBracketKeyword_19());
            		
            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFormInputGroupAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleFormInputGroup"


    // $ANTLR start "entryRuleData"
    // InternalVFormDsl.g:1687:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalVFormDsl.g:1687:45: (iv_ruleData= ruleData EOF )
            // InternalVFormDsl.g:1688:2: iv_ruleData= ruleData EOF
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
    // InternalVFormDsl.g:1694:1: ruleData returns [EObject current=null] : (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_StringData_0 = null;

        EObject this_IntData_1 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1700:2: ( (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) )
            // InternalVFormDsl.g:1701:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            {
            // InternalVFormDsl.g:1701:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==38) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==16) ) {
                            int LA15_4 = input.LA(5);

                            if ( (LA15_4==39) ) {
                                int LA15_5 = input.LA(6);

                                if ( (LA15_5==RULE_INT) ) {
                                    alt15=2;
                                }
                                else if ( (LA15_5==RULE_STRING) ) {
                                    alt15=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVFormDsl.g:1702:3: this_StringData_0= ruleStringData
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getStringDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringData_0=ruleStringData();

                    state._fsp--;


                    			current = this_StringData_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1711:3: this_IntData_1= ruleIntData
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getIntDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntData_1=ruleIntData();

                    state._fsp--;


                    			current = this_IntData_1;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleStringData"
    // InternalVFormDsl.g:1723:1: entryRuleStringData returns [EObject current=null] : iv_ruleStringData= ruleStringData EOF ;
    public final EObject entryRuleStringData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringData = null;


        try {
            // InternalVFormDsl.g:1723:51: (iv_ruleStringData= ruleStringData EOF )
            // InternalVFormDsl.g:1724:2: iv_ruleStringData= ruleStringData EOF
            {
             newCompositeNode(grammarAccess.getStringDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringData=ruleStringData();

            state._fsp--;

             current =iv_ruleStringData; 
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
    // $ANTLR end "entryRuleStringData"


    // $ANTLR start "ruleStringData"
    // InternalVFormDsl.g:1730:1: ruleStringData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleStringData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1736:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1737:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1737:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1738:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getStringDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStringDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1746:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1747:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1747:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1748:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_label_2_0, grammarAccess.getStringDataAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getStringDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getStringDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1772:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalVFormDsl.g:1773:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1773:4: (lv_value_5_0= RULE_STRING )
            // InternalVFormDsl.g:1774:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_5_0, grammarAccess.getStringDataAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStringDataAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStringData"


    // $ANTLR start "entryRuleIntData"
    // InternalVFormDsl.g:1798:1: entryRuleIntData returns [EObject current=null] : iv_ruleIntData= ruleIntData EOF ;
    public final EObject entryRuleIntData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntData = null;


        try {
            // InternalVFormDsl.g:1798:48: (iv_ruleIntData= ruleIntData EOF )
            // InternalVFormDsl.g:1799:2: iv_ruleIntData= ruleIntData EOF
            {
             newCompositeNode(grammarAccess.getIntDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntData=ruleIntData();

            state._fsp--;

             current =iv_ruleIntData; 
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
    // $ANTLR end "entryRuleIntData"


    // $ANTLR start "ruleIntData"
    // InternalVFormDsl.g:1805:1: ruleIntData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleIntData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1811:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1812:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1812:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1813:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1821:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1822:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1822:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1823:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_label_2_0, grammarAccess.getIntDataAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getIntDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getIntDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1847:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalVFormDsl.g:1848:4: (lv_value_5_0= RULE_INT )
            {
            // InternalVFormDsl.g:1848:4: (lv_value_5_0= RULE_INT )
            // InternalVFormDsl.g:1849:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_value_5_0, grammarAccess.getIntDataAccess().getValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntDataAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleIntData"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\16\1\25\1\26\1\5\1\20\1\27\2\26\1\5\1\6\2\20\1\30\1\31\1\26\1\7\5\uffff";
    static final String dfa_3s = "\1\16\1\25\1\26\1\5\1\20\1\30\2\26\1\5\1\6\2\20\1\30\1\31\1\26\1\44\5\uffff";
    static final String dfa_4s = "\20\uffff\1\4\1\3\1\2\1\1\1\5";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\7",
            "\1\16",
            "\1\17",
            "\1\23\22\uffff\1\22\2\uffff\1\21\5\uffff\1\20\1\24",
            "",
            "",
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
            return "223:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004120L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});

}