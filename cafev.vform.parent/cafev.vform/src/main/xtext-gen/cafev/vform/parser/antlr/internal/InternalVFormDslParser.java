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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LAYOUT", "RULE_STRING", "RULE_BASICINPUT", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"formLayout\":'", "','", "'\"formInputs\":'", "'['", "']'", "'}'", "'\"inputName\"'", "':'", "'\"inputType\"'", "'\"range\"'", "'\"min\"'", "'\"max\"'", "'\"select\"'", "'\"options\"'", "'\"optionType\"'", "'\"data\"'", "'\"enum\"'", "'\"number\"'", "'\"search\"'", "'name'", "'type:'", "'GROUP'", "'groupInputs:'", "'label:'", "'value:'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_LAYOUT=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_BASICINPUT=6;
    public static final int RULE_ML_COMMENT=9;
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
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFormInputsKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_8); 

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

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVFormDsl.g:138:4: otherlv_7= ',' ( (lv_formInput_8_0= ruleFormInput ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

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

            otherlv_9=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalVFormDsl.g:279:1: ruleFormInputBasic returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' ( (lv_type_7_0= RULE_BASICINPUT ) ) otherlv_8= '}' ) ;
    public final EObject ruleFormInputBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:285:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' ( (lv_type_7_0= RULE_BASICINPUT ) ) otherlv_8= '}' ) )
            // InternalVFormDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' ( (lv_type_7_0= RULE_BASICINPUT ) ) otherlv_8= '}' )
            {
            // InternalVFormDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' ( (lv_type_7_0= RULE_BASICINPUT ) ) otherlv_8= '}' )
            // InternalVFormDsl.g:287:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' ( (lv_type_7_0= RULE_BASICINPUT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputBasicAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputBasicAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_13); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputBasicAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputBasicAccess().getInputTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputBasicAccess().getColonKeyword_6());
            		
            // InternalVFormDsl.g:329:3: ( (lv_type_7_0= RULE_BASICINPUT ) )
            // InternalVFormDsl.g:330:4: (lv_type_7_0= RULE_BASICINPUT )
            {
            // InternalVFormDsl.g:330:4: (lv_type_7_0= RULE_BASICINPUT )
            // InternalVFormDsl.g:331:5: lv_type_7_0= RULE_BASICINPUT
            {
            lv_type_7_0=(Token)match(input,RULE_BASICINPUT,FOLLOW_10); 

            					newLeafNode(lv_type_7_0, grammarAccess.getFormInputBasicAccess().getTypeBASICINPUTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputBasicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_7_0,
            						"cafev.vform.VFormDsl.BASICINPUT");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputBasicAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVFormDsl.g:355:1: entryRuleFormInputRange returns [EObject current=null] : iv_ruleFormInputRange= ruleFormInputRange EOF ;
    public final EObject entryRuleFormInputRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputRange = null;


        try {
            // InternalVFormDsl.g:355:55: (iv_ruleFormInputRange= ruleFormInputRange EOF )
            // InternalVFormDsl.g:356:2: iv_ruleFormInputRange= ruleFormInputRange EOF
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
    // InternalVFormDsl.g:362:1: ruleFormInputRange returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"range\"' otherlv_8= ',' otherlv_9= '\"min\"' otherlv_10= ':' ( (lv_min_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= '\"max\"' otherlv_14= ':' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '}' ) ;
    public final EObject ruleFormInputRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_min_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_max_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:368:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"range\"' otherlv_8= ',' otherlv_9= '\"min\"' otherlv_10= ':' ( (lv_min_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= '\"max\"' otherlv_14= ':' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '}' ) )
            // InternalVFormDsl.g:369:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"range\"' otherlv_8= ',' otherlv_9= '\"min\"' otherlv_10= ':' ( (lv_min_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= '\"max\"' otherlv_14= ':' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '}' )
            {
            // InternalVFormDsl.g:369:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"range\"' otherlv_8= ',' otherlv_9= '\"min\"' otherlv_10= ':' ( (lv_min_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= '\"max\"' otherlv_14= ':' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '}' )
            // InternalVFormDsl.g:370:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"range\"' otherlv_8= ',' otherlv_9= '\"min\"' otherlv_10= ':' ( (lv_min_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= '\"max\"' otherlv_14= ':' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputRangeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputRangeAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputRangeAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:382:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:383:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:383:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:384:5: lv_name_3_0= RULE_STRING
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

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputRangeAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputRangeAccess().getInputTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputRangeAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputRangeAccess().getRangeKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputRangeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputRangeAccess().getMinKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputRangeAccess().getColonKeyword_10());
            		
            // InternalVFormDsl.g:428:3: ( (lv_min_11_0= RULE_INT ) )
            // InternalVFormDsl.g:429:4: (lv_min_11_0= RULE_INT )
            {
            // InternalVFormDsl.g:429:4: (lv_min_11_0= RULE_INT )
            // InternalVFormDsl.g:430:5: lv_min_11_0= RULE_INT
            {
            lv_min_11_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_min_11_0, grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputRangeAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputRangeAccess().getMaxKeyword_13());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getFormInputRangeAccess().getColonKeyword_14());
            		
            // InternalVFormDsl.g:458:3: ( (lv_max_15_0= RULE_INT ) )
            // InternalVFormDsl.g:459:4: (lv_max_15_0= RULE_INT )
            {
            // InternalVFormDsl.g:459:4: (lv_max_15_0= RULE_INT )
            // InternalVFormDsl.g:460:5: lv_max_15_0= RULE_INT
            {
            lv_max_15_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_max_15_0, grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputRangeAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalVFormDsl.g:484:1: entryRuleFormInputSelect returns [EObject current=null] : iv_ruleFormInputSelect= ruleFormInputSelect EOF ;
    public final EObject entryRuleFormInputSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSelect = null;


        try {
            // InternalVFormDsl.g:484:56: (iv_ruleFormInputSelect= ruleFormInputSelect EOF )
            // InternalVFormDsl.g:485:2: iv_ruleFormInputSelect= ruleFormInputSelect EOF
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
    // InternalVFormDsl.g:491:1: ruleFormInputSelect returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"select\"' otherlv_8= ',' otherlv_9= '\"options\"' otherlv_10= ':' ( (lv_option_11_0= ruleOption ) ) otherlv_12= '}' ) ;
    public final EObject ruleFormInputSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_option_11_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:497:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"select\"' otherlv_8= ',' otherlv_9= '\"options\"' otherlv_10= ':' ( (lv_option_11_0= ruleOption ) ) otherlv_12= '}' ) )
            // InternalVFormDsl.g:498:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"select\"' otherlv_8= ',' otherlv_9= '\"options\"' otherlv_10= ':' ( (lv_option_11_0= ruleOption ) ) otherlv_12= '}' )
            {
            // InternalVFormDsl.g:498:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"select\"' otherlv_8= ',' otherlv_9= '\"options\"' otherlv_10= ':' ( (lv_option_11_0= ruleOption ) ) otherlv_12= '}' )
            // InternalVFormDsl.g:499:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"select\"' otherlv_8= ',' otherlv_9= '\"options\"' otherlv_10= ':' ( (lv_option_11_0= ruleOption ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSelectAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSelectAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputSelectAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:511:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:512:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:512:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:513:5: lv_name_3_0= RULE_STRING
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

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSelectAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputSelectAccess().getInputTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputSelectAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputSelectAccess().getSelectKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputSelectAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSelectAccess().getOptionsKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputSelectAccess().getColonKeyword_10());
            		
            // InternalVFormDsl.g:557:3: ( (lv_option_11_0= ruleOption ) )
            // InternalVFormDsl.g:558:4: (lv_option_11_0= ruleOption )
            {
            // InternalVFormDsl.g:558:4: (lv_option_11_0= ruleOption )
            // InternalVFormDsl.g:559:5: lv_option_11_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_option_11_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSelectRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_11_0,
            						"cafev.vform.VFormDsl.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFormInputSelectAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalVFormDsl.g:584:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalVFormDsl.g:584:47: (iv_ruleOption= ruleOption EOF )
            // InternalVFormDsl.g:585:2: iv_ruleOption= ruleOption EOF
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
    // InternalVFormDsl.g:591:1: ruleOption returns [EObject current=null] : (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_DataOption_0 = null;

        EObject this_EnumOption_1 = null;

        EObject this_NumberOption_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:597:2: ( (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) )
            // InternalVFormDsl.g:598:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            {
            // InternalVFormDsl.g:598:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==21) ) {
                        switch ( input.LA(4) ) {
                        case 29:
                            {
                            alt3=1;
                            }
                            break;
                        case 30:
                            {
                            alt3=2;
                            }
                            break;
                        case 31:
                            {
                            alt3=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }

                    }
                    else {
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
                    // InternalVFormDsl.g:599:3: this_DataOption_0= ruleDataOption
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
                    // InternalVFormDsl.g:608:3: this_EnumOption_1= ruleEnumOption
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
                    // InternalVFormDsl.g:617:3: this_NumberOption_2= ruleNumberOption
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
    // InternalVFormDsl.g:629:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalVFormDsl.g:629:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalVFormDsl.g:630:2: iv_ruleDataOption= ruleDataOption EOF
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
    // InternalVFormDsl.g:636:1: ruleDataOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
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
            // InternalVFormDsl.g:642:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalVFormDsl.g:643:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalVFormDsl.g:643:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalVFormDsl.g:644:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"data\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDataOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDataOptionAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getDataOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDataOptionAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDataOptionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalVFormDsl.g:676:3: ( (lv_data_8_0= ruleData ) )
            // InternalVFormDsl.g:677:4: (lv_data_8_0= ruleData )
            {
            // InternalVFormDsl.g:677:4: (lv_data_8_0= ruleData )
            // InternalVFormDsl.g:678:5: lv_data_8_0= ruleData
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

            // InternalVFormDsl.g:695:3: (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVFormDsl.g:696:4: otherlv_9= ',' ( (lv_data_10_0= ruleData ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_22); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDataOptionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVFormDsl.g:700:4: ( (lv_data_10_0= ruleData ) )
            	    // InternalVFormDsl.g:701:5: (lv_data_10_0= ruleData )
            	    {
            	    // InternalVFormDsl.g:701:5: (lv_data_10_0= ruleData )
            	    // InternalVFormDsl.g:702:6: lv_data_10_0= ruleData
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
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalVFormDsl.g:732:1: entryRuleEnumOption returns [EObject current=null] : iv_ruleEnumOption= ruleEnumOption EOF ;
    public final EObject entryRuleEnumOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOption = null;


        try {
            // InternalVFormDsl.g:732:51: (iv_ruleEnumOption= ruleEnumOption EOF )
            // InternalVFormDsl.g:733:2: iv_ruleEnumOption= ruleEnumOption EOF
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
    // InternalVFormDsl.g:739:1: ruleEnumOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' ) ;
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
            // InternalVFormDsl.g:745:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' ) )
            // InternalVFormDsl.g:746:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' )
            {
            // InternalVFormDsl.g:746:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}' )
            // InternalVFormDsl.g:747:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"enum\"' otherlv_4= ',' otherlv_5= '\"data\"' otherlv_6= ':' otherlv_7= '[' ( (lv_data_8_0= ruleOptionItem ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )* otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumOptionAccess().getEnumKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumOptionAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumOptionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalVFormDsl.g:779:3: ( (lv_data_8_0= ruleOptionItem ) )
            // InternalVFormDsl.g:780:4: (lv_data_8_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:780:4: (lv_data_8_0= ruleOptionItem )
            // InternalVFormDsl.g:781:5: lv_data_8_0= ruleOptionItem
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

            // InternalVFormDsl.g:798:3: (otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVFormDsl.g:799:4: otherlv_9= ',' ( (lv_data_10_0= ruleOptionItem ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_26); 

            	    				newLeafNode(otherlv_9, grammarAccess.getEnumOptionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVFormDsl.g:803:4: ( (lv_data_10_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:804:5: (lv_data_10_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:804:5: (lv_data_10_0= ruleOptionItem )
            	    // InternalVFormDsl.g:805:6: lv_data_10_0= ruleOptionItem
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
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalVFormDsl.g:835:1: entryRuleNumberOption returns [EObject current=null] : iv_ruleNumberOption= ruleNumberOption EOF ;
    public final EObject entryRuleNumberOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOption = null;


        try {
            // InternalVFormDsl.g:835:53: (iv_ruleNumberOption= ruleNumberOption EOF )
            // InternalVFormDsl.g:836:2: iv_ruleNumberOption= ruleNumberOption EOF
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
    // InternalVFormDsl.g:842:1: ruleNumberOption returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' ) ;
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
            // InternalVFormDsl.g:848:2: ( (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' ) )
            // InternalVFormDsl.g:849:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' )
            {
            // InternalVFormDsl.g:849:2: (otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}' )
            // InternalVFormDsl.g:850:3: otherlv_0= '{' otherlv_1= '\"optionType\"' otherlv_2= ':' otherlv_3= '\"number\"' otherlv_4= ',' otherlv_5= '\"min\"' otherlv_6= ':' ( (lv_min_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= '\"max\"' otherlv_10= ':' ( (lv_max_11_0= RULE_INT ) ) otherlv_12= '\"range\"' otherlv_13= ':' ( (lv_range_14_0= RULE_INT ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOptionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberOptionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberOptionAccess().getNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberOptionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getNumberOptionAccess().getMinKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberOptionAccess().getColonKeyword_6());
            		
            // InternalVFormDsl.g:878:3: ( (lv_min_7_0= RULE_INT ) )
            // InternalVFormDsl.g:879:4: (lv_min_7_0= RULE_INT )
            {
            // InternalVFormDsl.g:879:4: (lv_min_7_0= RULE_INT )
            // InternalVFormDsl.g:880:5: lv_min_7_0= RULE_INT
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

            otherlv_8=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getNumberOptionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getNumberOptionAccess().getMaxKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getNumberOptionAccess().getColonKeyword_10());
            		
            // InternalVFormDsl.g:908:3: ( (lv_max_11_0= RULE_INT ) )
            // InternalVFormDsl.g:909:4: (lv_max_11_0= RULE_INT )
            {
            // InternalVFormDsl.g:909:4: (lv_max_11_0= RULE_INT )
            // InternalVFormDsl.g:910:5: lv_max_11_0= RULE_INT
            {
            lv_max_11_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_12=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getNumberOptionAccess().getRangeKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getNumberOptionAccess().getColonKeyword_13());
            		
            // InternalVFormDsl.g:934:3: ( (lv_range_14_0= RULE_INT ) )
            // InternalVFormDsl.g:935:4: (lv_range_14_0= RULE_INT )
            {
            // InternalVFormDsl.g:935:4: (lv_range_14_0= RULE_INT )
            // InternalVFormDsl.g:936:5: lv_range_14_0= RULE_INT
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

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

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
    // InternalVFormDsl.g:960:1: entryRuleFormInputSearch returns [EObject current=null] : iv_ruleFormInputSearch= ruleFormInputSearch EOF ;
    public final EObject entryRuleFormInputSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSearch = null;


        try {
            // InternalVFormDsl.g:960:56: (iv_ruleFormInputSearch= ruleFormInputSearch EOF )
            // InternalVFormDsl.g:961:2: iv_ruleFormInputSearch= ruleFormInputSearch EOF
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
    // InternalVFormDsl.g:967:1: ruleFormInputSearch returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"search\"' otherlv_8= ',' otherlv_9= '\"data\"' otherlv_10= ':' otherlv_11= '[' ( (lv_data_12_0= ruleOptionItem ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )* otherlv_15= ']' otherlv_16= '}' ) ;
    public final EObject ruleFormInputSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_data_12_0 = null;

        EObject lv_data_14_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:973:2: ( (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"search\"' otherlv_8= ',' otherlv_9= '\"data\"' otherlv_10= ':' otherlv_11= '[' ( (lv_data_12_0= ruleOptionItem ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )* otherlv_15= ']' otherlv_16= '}' ) )
            // InternalVFormDsl.g:974:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"search\"' otherlv_8= ',' otherlv_9= '\"data\"' otherlv_10= ':' otherlv_11= '[' ( (lv_data_12_0= ruleOptionItem ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )* otherlv_15= ']' otherlv_16= '}' )
            {
            // InternalVFormDsl.g:974:2: (otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"search\"' otherlv_8= ',' otherlv_9= '\"data\"' otherlv_10= ':' otherlv_11= '[' ( (lv_data_12_0= ruleOptionItem ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )* otherlv_15= ']' otherlv_16= '}' )
            // InternalVFormDsl.g:975:3: otherlv_0= '{' otherlv_1= '\"inputName\"' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '\"inputType\"' otherlv_6= ':' otherlv_7= '\"search\"' otherlv_8= ',' otherlv_9= '\"data\"' otherlv_10= ':' otherlv_11= '[' ( (lv_data_12_0= ruleOptionItem ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )* otherlv_15= ']' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSearchAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSearchAccess().getInputNameKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFormInputSearchAccess().getColonKeyword_2());
            		
            // InternalVFormDsl.g:987:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalVFormDsl.g:988:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalVFormDsl.g:988:4: (lv_name_3_0= RULE_STRING )
            // InternalVFormDsl.g:989:5: lv_name_3_0= RULE_STRING
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

            otherlv_4=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSearchAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputSearchAccess().getInputTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputSearchAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputSearchAccess().getSearchKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputSearchAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSearchAccess().getDataKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputSearchAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getFormInputSearchAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalVFormDsl.g:1037:3: ( (lv_data_12_0= ruleOptionItem ) )
            // InternalVFormDsl.g:1038:4: (lv_data_12_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:1038:4: (lv_data_12_0= ruleOptionItem )
            // InternalVFormDsl.g:1039:5: lv_data_12_0= ruleOptionItem
            {

            					newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_12_0=ruleOptionItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSearchRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_12_0,
            						"cafev.vform.VFormDsl.OptionItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:1056:3: (otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVFormDsl.g:1057:4: otherlv_13= ',' ( (lv_data_14_0= ruleOptionItem ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_26); 

            	    				newLeafNode(otherlv_13, grammarAccess.getFormInputSearchAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalVFormDsl.g:1061:4: ( (lv_data_14_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:1062:5: (lv_data_14_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:1062:5: (lv_data_14_0= ruleOptionItem )
            	    // InternalVFormDsl.g:1063:6: lv_data_14_0= ruleOptionItem
            	    {

            	    						newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_14_0=ruleOptionItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormInputSearchRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_14_0,
            	    							"cafev.vform.VFormDsl.OptionItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getFormInputSearchAccess().getRightSquareBracketKeyword_14());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFormInputSearchAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalVFormDsl.g:1093:1: entryRuleOptionItem returns [EObject current=null] : iv_ruleOptionItem= ruleOptionItem EOF ;
    public final EObject entryRuleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionItem = null;


        try {
            // InternalVFormDsl.g:1093:51: (iv_ruleOptionItem= ruleOptionItem EOF )
            // InternalVFormDsl.g:1094:2: iv_ruleOptionItem= ruleOptionItem EOF
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
    // InternalVFormDsl.g:1100:1: ruleOptionItem returns [EObject current=null] : (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) ;
    public final EObject ruleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject this_StringOptionItem_0 = null;

        EObject this_IntOptionItem_1 = null;

        EObject this_DataOptionItem_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1106:2: ( (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) )
            // InternalVFormDsl.g:1107:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
            {
            // InternalVFormDsl.g:1107:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 13:
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
                    // InternalVFormDsl.g:1108:3: this_StringOptionItem_0= ruleStringOptionItem
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
                    // InternalVFormDsl.g:1117:3: this_IntOptionItem_1= ruleIntOptionItem
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
                    // InternalVFormDsl.g:1126:3: this_DataOptionItem_2= ruleDataOptionItem
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
    // InternalVFormDsl.g:1138:1: entryRuleStringOptionItem returns [EObject current=null] : iv_ruleStringOptionItem= ruleStringOptionItem EOF ;
    public final EObject entryRuleStringOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOptionItem = null;


        try {
            // InternalVFormDsl.g:1138:57: (iv_ruleStringOptionItem= ruleStringOptionItem EOF )
            // InternalVFormDsl.g:1139:2: iv_ruleStringOptionItem= ruleStringOptionItem EOF
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
    // InternalVFormDsl.g:1145:1: ruleStringOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1151:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalVFormDsl.g:1152:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalVFormDsl.g:1152:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalVFormDsl.g:1153:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1153:3: (lv_value_0_0= RULE_STRING )
            // InternalVFormDsl.g:1154:4: lv_value_0_0= RULE_STRING
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
    // InternalVFormDsl.g:1173:1: entryRuleIntOptionItem returns [EObject current=null] : iv_ruleIntOptionItem= ruleIntOptionItem EOF ;
    public final EObject entryRuleIntOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOptionItem = null;


        try {
            // InternalVFormDsl.g:1173:54: (iv_ruleIntOptionItem= ruleIntOptionItem EOF )
            // InternalVFormDsl.g:1174:2: iv_ruleIntOptionItem= ruleIntOptionItem EOF
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
    // InternalVFormDsl.g:1180:1: ruleIntOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1186:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalVFormDsl.g:1187:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalVFormDsl.g:1187:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalVFormDsl.g:1188:3: (lv_value_0_0= RULE_INT )
            {
            // InternalVFormDsl.g:1188:3: (lv_value_0_0= RULE_INT )
            // InternalVFormDsl.g:1189:4: lv_value_0_0= RULE_INT
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
    // InternalVFormDsl.g:1208:1: entryRuleDataOptionItem returns [EObject current=null] : iv_ruleDataOptionItem= ruleDataOptionItem EOF ;
    public final EObject entryRuleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOptionItem = null;


        try {
            // InternalVFormDsl.g:1208:55: (iv_ruleDataOptionItem= ruleDataOptionItem EOF )
            // InternalVFormDsl.g:1209:2: iv_ruleDataOptionItem= ruleDataOptionItem EOF
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
    // InternalVFormDsl.g:1215:1: ruleDataOptionItem returns [EObject current=null] : ( (lv_value_0_0= ruleData ) ) ;
    public final EObject ruleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1221:2: ( ( (lv_value_0_0= ruleData ) ) )
            // InternalVFormDsl.g:1222:2: ( (lv_value_0_0= ruleData ) )
            {
            // InternalVFormDsl.g:1222:2: ( (lv_value_0_0= ruleData ) )
            // InternalVFormDsl.g:1223:3: (lv_value_0_0= ruleData )
            {
            // InternalVFormDsl.g:1223:3: (lv_value_0_0= ruleData )
            // InternalVFormDsl.g:1224:4: lv_value_0_0= ruleData
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
    // InternalVFormDsl.g:1244:1: entryRuleFormInputGroup returns [EObject current=null] : iv_ruleFormInputGroup= ruleFormInputGroup EOF ;
    public final EObject entryRuleFormInputGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputGroup = null;


        try {
            // InternalVFormDsl.g:1244:55: (iv_ruleFormInputGroup= ruleFormInputGroup EOF )
            // InternalVFormDsl.g:1245:2: iv_ruleFormInputGroup= ruleFormInputGroup EOF
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
    // InternalVFormDsl.g:1251:1: ruleFormInputGroup returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleFormInputGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1257:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalVFormDsl.g:1258:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalVFormDsl.g:1258:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) )
            // InternalVFormDsl.g:1259:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputGroupAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputGroupAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:1267:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1268:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1268:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:1269:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormInputGroupAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputGroupAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputGroupAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputGroupAccess().getGROUPKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputGroupAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputGroupAccess().getGroupInputsKeyword_7());
            		
            // InternalVFormDsl.g:1305:3: ( (otherlv_8= RULE_ID ) )
            // InternalVFormDsl.g:1306:4: (otherlv_8= RULE_ID )
            {
            // InternalVFormDsl.g:1306:4: (otherlv_8= RULE_ID )
            // InternalVFormDsl.g:1307:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputGroupRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getFormInputGroupAccess().getGroupInputsFormInputCrossReference_8_0());
            				

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
    // $ANTLR end "ruleFormInputGroup"


    // $ANTLR start "entryRuleData"
    // InternalVFormDsl.g:1322:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalVFormDsl.g:1322:45: (iv_ruleData= ruleData EOF )
            // InternalVFormDsl.g:1323:2: iv_ruleData= ruleData EOF
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
    // InternalVFormDsl.g:1329:1: ruleData returns [EObject current=null] : (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_StringData_0 = null;

        EObject this_IntData_1 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1335:2: ( (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) )
            // InternalVFormDsl.g:1336:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            {
            // InternalVFormDsl.g:1336:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==37) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_STRING) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==15) ) {
                            int LA8_4 = input.LA(5);

                            if ( (LA8_4==38) ) {
                                int LA8_5 = input.LA(6);

                                if ( (LA8_5==RULE_INT) ) {
                                    alt8=2;
                                }
                                else if ( (LA8_5==RULE_STRING) ) {
                                    alt8=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVFormDsl.g:1337:3: this_StringData_0= ruleStringData
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
                    // InternalVFormDsl.g:1346:3: this_IntData_1= ruleIntData
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
    // InternalVFormDsl.g:1358:1: entryRuleStringData returns [EObject current=null] : iv_ruleStringData= ruleStringData EOF ;
    public final EObject entryRuleStringData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringData = null;


        try {
            // InternalVFormDsl.g:1358:51: (iv_ruleStringData= ruleStringData EOF )
            // InternalVFormDsl.g:1359:2: iv_ruleStringData= ruleStringData EOF
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
    // InternalVFormDsl.g:1365:1: ruleStringData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalVFormDsl.g:1371:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1372:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1372:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1373:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getStringDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStringDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1381:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1382:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1382:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1383:5: lv_label_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getStringDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getStringDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1407:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalVFormDsl.g:1408:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1408:4: (lv_value_5_0= RULE_STRING )
            // InternalVFormDsl.g:1409:5: lv_value_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalVFormDsl.g:1433:1: entryRuleIntData returns [EObject current=null] : iv_ruleIntData= ruleIntData EOF ;
    public final EObject entryRuleIntData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntData = null;


        try {
            // InternalVFormDsl.g:1433:48: (iv_ruleIntData= ruleIntData EOF )
            // InternalVFormDsl.g:1434:2: iv_ruleIntData= ruleIntData EOF
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
    // InternalVFormDsl.g:1440:1: ruleIntData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // InternalVFormDsl.g:1446:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1447:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1447:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1448:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1456:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1457:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1457:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1458:5: lv_label_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getIntDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getIntDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1482:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalVFormDsl.g:1483:4: (lv_value_5_0= RULE_INT )
            {
            // InternalVFormDsl.g:1483:4: (lv_value_5_0= RULE_INT )
            // InternalVFormDsl.g:1484:5: lv_value_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\15\1\24\1\uffff\1\25\1\5\1\17\1\26\1\25\1\6\4\uffff";
    static final String dfa_3s = "\1\41\1\24\1\uffff\1\25\1\5\1\17\1\26\1\25\1\40\4\uffff";
    static final String dfa_4s = "\2\uffff\1\5\6\uffff\1\1\1\3\1\4\1\2";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\23\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\20\uffff\1\14\2\uffff\1\12\5\uffff\1\13",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000020A0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});

}