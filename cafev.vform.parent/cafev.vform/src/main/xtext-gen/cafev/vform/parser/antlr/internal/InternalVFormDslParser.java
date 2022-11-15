package cafev.vform.parser.antlr.internal;

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
import cafev.vform.services.VFormDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVFormDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'formLayout:'", "','", "'formInputs:'", "'['", "']'", "'name'", "':'", "'type'", "'RANGE'", "'min:'", "'max:'", "'SELECT'", "'options:'", "'{'", "'}'", "'optionType:'", "'data'", "'data:'", "'enum'", "'number'", "'range:'", "'SEARCH'", "'type:'", "'GROUP'", "'groupInputs:'", "'label:'", "'value:'", "'TEXT'", "'CHECKBOX'", "'NUMBER'", "'DATE'", "'horizontal'", "'vertical'"
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
    // InternalVFormDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVFormDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalVFormDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalVFormDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' ) ;
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
            // InternalVFormDsl.g:78:2: ( (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' ) )
            // InternalVFormDsl.g:79:2: (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' )
            {
            // InternalVFormDsl.g:79:2: (otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']' )
            // InternalVFormDsl.g:80:3: otherlv_0= 'formLayout:' ( (lv_formLayout_1_0= ruleFormLayout ) ) otherlv_2= ',' otherlv_3= 'formInputs:' otherlv_4= '[' ( (lv_formInput_5_0= ruleFormInput ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFormLayoutKeyword_0());
            		
            // InternalVFormDsl.g:84:3: ( (lv_formLayout_1_0= ruleFormLayout ) )
            // InternalVFormDsl.g:85:4: (lv_formLayout_1_0= ruleFormLayout )
            {
            // InternalVFormDsl.g:85:4: (lv_formLayout_1_0= ruleFormLayout )
            // InternalVFormDsl.g:86:5: lv_formLayout_1_0= ruleFormLayout
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
            						"cafev.vform.VFormDsl.FormLayout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getFormInputsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalVFormDsl.g:115:3: ( (lv_formInput_5_0= ruleFormInput ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVFormDsl.g:116:4: (lv_formInput_5_0= ruleFormInput )
            	    {
            	    // InternalVFormDsl.g:116:4: (lv_formInput_5_0= ruleFormInput )
            	    // InternalVFormDsl.g:117:5: lv_formInput_5_0= ruleFormInput
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
            	    						"cafev.vform.VFormDsl.FormInput");
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
    // InternalVFormDsl.g:142:1: entryRuleFormLayout returns [EObject current=null] : iv_ruleFormLayout= ruleFormLayout EOF ;
    public final EObject entryRuleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormLayout = null;


        try {
            // InternalVFormDsl.g:142:51: (iv_ruleFormLayout= ruleFormLayout EOF )
            // InternalVFormDsl.g:143:2: iv_ruleFormLayout= ruleFormLayout EOF
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
    // InternalVFormDsl.g:149:1: ruleFormLayout returns [EObject current=null] : ( (lv_layout_0_0= ruleLayout ) ) ;
    public final EObject ruleFormLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_layout_0_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:155:2: ( ( (lv_layout_0_0= ruleLayout ) ) )
            // InternalVFormDsl.g:156:2: ( (lv_layout_0_0= ruleLayout ) )
            {
            // InternalVFormDsl.g:156:2: ( (lv_layout_0_0= ruleLayout ) )
            // InternalVFormDsl.g:157:3: (lv_layout_0_0= ruleLayout )
            {
            // InternalVFormDsl.g:157:3: (lv_layout_0_0= ruleLayout )
            // InternalVFormDsl.g:158:4: lv_layout_0_0= ruleLayout
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
            					"cafev.vform.VFormDsl.Layout");
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
    // InternalVFormDsl.g:178:1: entryRuleFormInput returns [EObject current=null] : iv_ruleFormInput= ruleFormInput EOF ;
    public final EObject entryRuleFormInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInput = null;


        try {
            // InternalVFormDsl.g:178:50: (iv_ruleFormInput= ruleFormInput EOF )
            // InternalVFormDsl.g:179:2: iv_ruleFormInput= ruleFormInput EOF
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
    // InternalVFormDsl.g:185:1: ruleFormInput returns [EObject current=null] : (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup ) ;
    public final EObject ruleFormInput() throws RecognitionException {
        EObject current = null;

        EObject this_FormInputBasic_0 = null;

        EObject this_FormInputRange_1 = null;

        EObject this_FormInputSelect_2 = null;

        EObject this_FormInputSearch_3 = null;

        EObject this_FormInputGroup_4 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:191:2: ( (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup ) )
            // InternalVFormDsl.g:192:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )
            {
            // InternalVFormDsl.g:192:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalVFormDsl.g:193:3: this_FormInputBasic_0= ruleFormInputBasic
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
                    // InternalVFormDsl.g:202:3: this_FormInputRange_1= ruleFormInputRange
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
                    // InternalVFormDsl.g:211:3: this_FormInputSelect_2= ruleFormInputSelect
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
                    // InternalVFormDsl.g:220:3: this_FormInputSearch_3= ruleFormInputSearch
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
                    // InternalVFormDsl.g:229:3: this_FormInputGroup_4= ruleFormInputGroup
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
    // InternalVFormDsl.g:241:1: entryRuleFormInputBasic returns [EObject current=null] : iv_ruleFormInputBasic= ruleFormInputBasic EOF ;
    public final EObject entryRuleFormInputBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputBasic = null;


        try {
            // InternalVFormDsl.g:241:55: (iv_ruleFormInputBasic= ruleFormInputBasic EOF )
            // InternalVFormDsl.g:242:2: iv_ruleFormInputBasic= ruleFormInputBasic EOF
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
    // InternalVFormDsl.g:248:1: ruleFormInputBasic returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleInputType ) ) ) ;
    public final EObject ruleFormInputBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:254:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleInputType ) ) ) )
            // InternalVFormDsl.g:255:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleInputType ) ) )
            {
            // InternalVFormDsl.g:255:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleInputType ) ) )
            // InternalVFormDsl.g:256:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleInputType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputBasicAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputBasicAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:264:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:265:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:265:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:266:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormInputBasicAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputBasicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputBasicAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputBasicAccess().getColonKeyword_4());
            		
            // InternalVFormDsl.g:290:3: ( (lv_type_5_0= ruleInputType ) )
            // InternalVFormDsl.g:291:4: (lv_type_5_0= ruleInputType )
            {
            // InternalVFormDsl.g:291:4: (lv_type_5_0= ruleInputType )
            // InternalVFormDsl.g:292:5: lv_type_5_0= ruleInputType
            {

            					newCompositeNode(grammarAccess.getFormInputBasicAccess().getTypeInputTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleInputType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputBasicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"cafev.vform.VFormDsl.InputType");
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
    // $ANTLR end "ruleFormInputBasic"


    // $ANTLR start "entryRuleFormInputRange"
    // InternalVFormDsl.g:313:1: entryRuleFormInputRange returns [EObject current=null] : iv_ruleFormInputRange= ruleFormInputRange EOF ;
    public final EObject entryRuleFormInputRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputRange = null;


        try {
            // InternalVFormDsl.g:313:55: (iv_ruleFormInputRange= ruleFormInputRange EOF )
            // InternalVFormDsl.g:314:2: iv_ruleFormInputRange= ruleFormInputRange EOF
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
    // InternalVFormDsl.g:320:1: ruleFormInputRange returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'RANGE' otherlv_7= ',' otherlv_8= 'min:' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' otherlv_11= 'max:' ( (lv_max_12_0= RULE_INT ) ) ) ;
    public final EObject ruleFormInputRange() throws RecognitionException {
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
        Token lv_min_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_max_12_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:326:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'RANGE' otherlv_7= ',' otherlv_8= 'min:' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' otherlv_11= 'max:' ( (lv_max_12_0= RULE_INT ) ) ) )
            // InternalVFormDsl.g:327:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'RANGE' otherlv_7= ',' otherlv_8= 'min:' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' otherlv_11= 'max:' ( (lv_max_12_0= RULE_INT ) ) )
            {
            // InternalVFormDsl.g:327:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'RANGE' otherlv_7= ',' otherlv_8= 'min:' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' otherlv_11= 'max:' ( (lv_max_12_0= RULE_INT ) ) )
            // InternalVFormDsl.g:328:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'RANGE' otherlv_7= ',' otherlv_8= 'min:' ( (lv_min_9_0= RULE_INT ) ) otherlv_10= ',' otherlv_11= 'max:' ( (lv_max_12_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputRangeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputRangeAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:336:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:337:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:337:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:338:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormInputRangeAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputRangeAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputRangeAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputRangeAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputRangeAccess().getRANGEKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputRangeAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputRangeAccess().getMinKeyword_8());
            		
            // InternalVFormDsl.g:378:3: ( (lv_min_9_0= RULE_INT ) )
            // InternalVFormDsl.g:379:4: (lv_min_9_0= RULE_INT )
            {
            // InternalVFormDsl.g:379:4: (lv_min_9_0= RULE_INT )
            // InternalVFormDsl.g:380:5: lv_min_9_0= RULE_INT
            {
            lv_min_9_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_min_9_0, grammarAccess.getFormInputRangeAccess().getMinINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getFormInputRangeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getFormInputRangeAccess().getMaxKeyword_11());
            		
            // InternalVFormDsl.g:404:3: ( (lv_max_12_0= RULE_INT ) )
            // InternalVFormDsl.g:405:4: (lv_max_12_0= RULE_INT )
            {
            // InternalVFormDsl.g:405:4: (lv_max_12_0= RULE_INT )
            // InternalVFormDsl.g:406:5: lv_max_12_0= RULE_INT
            {
            lv_max_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_max_12_0, grammarAccess.getFormInputRangeAccess().getMaxINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_12_0,
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
    // $ANTLR end "ruleFormInputRange"


    // $ANTLR start "entryRuleFormInputSelect"
    // InternalVFormDsl.g:426:1: entryRuleFormInputSelect returns [EObject current=null] : iv_ruleFormInputSelect= ruleFormInputSelect EOF ;
    public final EObject entryRuleFormInputSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSelect = null;


        try {
            // InternalVFormDsl.g:426:56: (iv_ruleFormInputSelect= ruleFormInputSelect EOF )
            // InternalVFormDsl.g:427:2: iv_ruleFormInputSelect= ruleFormInputSelect EOF
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
    // InternalVFormDsl.g:433:1: ruleFormInputSelect returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SELECT' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '{' ( (lv_option_10_0= ruleOption ) ) otherlv_11= '}' ) ;
    public final EObject ruleFormInputSelect() throws RecognitionException {
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
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_option_10_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:439:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SELECT' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '{' ( (lv_option_10_0= ruleOption ) ) otherlv_11= '}' ) )
            // InternalVFormDsl.g:440:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SELECT' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '{' ( (lv_option_10_0= ruleOption ) ) otherlv_11= '}' )
            {
            // InternalVFormDsl.g:440:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SELECT' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '{' ( (lv_option_10_0= ruleOption ) ) otherlv_11= '}' )
            // InternalVFormDsl.g:441:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SELECT' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '{' ( (lv_option_10_0= ruleOption ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSelectAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSelectAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:449:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:450:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:450:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:451:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormInputSelectAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputSelectAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSelectAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputSelectAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputSelectAccess().getSELECTKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputSelectAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputSelectAccess().getOptionsKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSelectAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalVFormDsl.g:495:3: ( (lv_option_10_0= ruleOption ) )
            // InternalVFormDsl.g:496:4: (lv_option_10_0= ruleOption )
            {
            // InternalVFormDsl.g:496:4: (lv_option_10_0= ruleOption )
            // InternalVFormDsl.g:497:5: lv_option_10_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getFormInputSelectAccess().getOptionOptionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
            lv_option_10_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSelectRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_10_0,
            						"cafev.vform.VFormDsl.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFormInputSelectAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalVFormDsl.g:522:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalVFormDsl.g:522:47: (iv_ruleOption= ruleOption EOF )
            // InternalVFormDsl.g:523:2: iv_ruleOption= ruleOption EOF
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
    // InternalVFormDsl.g:529:1: ruleOption returns [EObject current=null] : (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_DataOption_0 = null;

        EObject this_EnumOption_1 = null;

        EObject this_NumberOption_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:535:2: ( (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption ) )
            // InternalVFormDsl.g:536:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            {
            // InternalVFormDsl.g:536:2: (this_DataOption_0= ruleDataOption | this_EnumOption_1= ruleEnumOption | this_NumberOption_2= ruleNumberOption )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt3=3;
                    }
                    break;
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                    {
                    alt3=2;
                    }
                    break;
                default:
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
                    // InternalVFormDsl.g:537:3: this_DataOption_0= ruleDataOption
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
                    // InternalVFormDsl.g:546:3: this_EnumOption_1= ruleEnumOption
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
                    // InternalVFormDsl.g:555:3: this_NumberOption_2= ruleNumberOption
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
    // InternalVFormDsl.g:567:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalVFormDsl.g:567:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalVFormDsl.g:568:2: iv_ruleDataOption= ruleDataOption EOF
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
    // InternalVFormDsl.g:574:1: ruleDataOption returns [EObject current=null] : (otherlv_0= 'optionType:' otherlv_1= 'data' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleData ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_5_0 = null;

        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:580:2: ( (otherlv_0= 'optionType:' otherlv_1= 'data' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleData ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )* otherlv_8= ']' ) )
            // InternalVFormDsl.g:581:2: (otherlv_0= 'optionType:' otherlv_1= 'data' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleData ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )* otherlv_8= ']' )
            {
            // InternalVFormDsl.g:581:2: (otherlv_0= 'optionType:' otherlv_1= 'data' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleData ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )* otherlv_8= ']' )
            // InternalVFormDsl.g:582:3: otherlv_0= 'optionType:' otherlv_1= 'data' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleData ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOptionAccess().getOptionTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getDataKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDataOptionAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDataOptionAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getDataOptionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalVFormDsl.g:602:3: ( (lv_data_5_0= ruleData ) )
            // InternalVFormDsl.g:603:4: (lv_data_5_0= ruleData )
            {
            // InternalVFormDsl.g:603:4: (lv_data_5_0= ruleData )
            // InternalVFormDsl.g:604:5: lv_data_5_0= ruleData
            {

            					newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_data_5_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataOptionRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_5_0,
            						"cafev.vform.VFormDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:621:3: (otherlv_6= ',' ( (lv_data_7_0= ruleData ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVFormDsl.g:622:4: otherlv_6= ',' ( (lv_data_7_0= ruleData ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_18); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDataOptionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVFormDsl.g:626:4: ( (lv_data_7_0= ruleData ) )
            	    // InternalVFormDsl.g:627:5: (lv_data_7_0= ruleData )
            	    {
            	    // InternalVFormDsl.g:627:5: (lv_data_7_0= ruleData )
            	    // InternalVFormDsl.g:628:6: lv_data_7_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getDataOptionAccess().getDataDataParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_data_7_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataOptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_7_0,
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataOptionAccess().getRightSquareBracketKeyword_7());
            		

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
    // InternalVFormDsl.g:654:1: entryRuleEnumOption returns [EObject current=null] : iv_ruleEnumOption= ruleEnumOption EOF ;
    public final EObject entryRuleEnumOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOption = null;


        try {
            // InternalVFormDsl.g:654:51: (iv_ruleEnumOption= ruleEnumOption EOF )
            // InternalVFormDsl.g:655:2: iv_ruleEnumOption= ruleEnumOption EOF
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
    // InternalVFormDsl.g:661:1: ruleEnumOption returns [EObject current=null] : (otherlv_0= 'optionType:' otherlv_1= 'enum' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleOptionItem ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleEnumOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_5_0 = null;

        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:667:2: ( (otherlv_0= 'optionType:' otherlv_1= 'enum' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleOptionItem ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )* otherlv_8= ']' ) )
            // InternalVFormDsl.g:668:2: (otherlv_0= 'optionType:' otherlv_1= 'enum' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleOptionItem ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )* otherlv_8= ']' )
            {
            // InternalVFormDsl.g:668:2: (otherlv_0= 'optionType:' otherlv_1= 'enum' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleOptionItem ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )* otherlv_8= ']' )
            // InternalVFormDsl.g:669:3: otherlv_0= 'optionType:' otherlv_1= 'enum' otherlv_2= ',' otherlv_3= 'data:' otherlv_4= '[' ( (lv_data_5_0= ruleOptionItem ) ) (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumOptionAccess().getOptionTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumOptionAccess().getEnumKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumOptionAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumOptionAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumOptionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalVFormDsl.g:689:3: ( (lv_data_5_0= ruleOptionItem ) )
            // InternalVFormDsl.g:690:4: (lv_data_5_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:690:4: (lv_data_5_0= ruleOptionItem )
            // InternalVFormDsl.g:691:5: lv_data_5_0= ruleOptionItem
            {

            					newCompositeNode(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_data_5_0=ruleOptionItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumOptionRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_5_0,
            						"cafev.vform.VFormDsl.OptionItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:708:3: (otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVFormDsl.g:709:4: otherlv_6= ',' ( (lv_data_7_0= ruleOptionItem ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_25); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumOptionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVFormDsl.g:713:4: ( (lv_data_7_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:714:5: (lv_data_7_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:714:5: (lv_data_7_0= ruleOptionItem )
            	    // InternalVFormDsl.g:715:6: lv_data_7_0= ruleOptionItem
            	    {

            	    						newCompositeNode(grammarAccess.getEnumOptionAccess().getDataOptionItemParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_data_7_0=ruleOptionItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumOptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_7_0,
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumOptionAccess().getRightSquareBracketKeyword_7());
            		

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
    // InternalVFormDsl.g:741:1: entryRuleNumberOption returns [EObject current=null] : iv_ruleNumberOption= ruleNumberOption EOF ;
    public final EObject entryRuleNumberOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOption = null;


        try {
            // InternalVFormDsl.g:741:53: (iv_ruleNumberOption= ruleNumberOption EOF )
            // InternalVFormDsl.g:742:2: iv_ruleNumberOption= ruleNumberOption EOF
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
    // InternalVFormDsl.g:748:1: ruleNumberOption returns [EObject current=null] : (otherlv_0= 'optionType:' otherlv_1= 'number' otherlv_2= ',' otherlv_3= 'min:' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'max:' ( (lv_max_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'range:' ( (lv_range_10_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_min_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_max_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_range_10_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:754:2: ( (otherlv_0= 'optionType:' otherlv_1= 'number' otherlv_2= ',' otherlv_3= 'min:' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'max:' ( (lv_max_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'range:' ( (lv_range_10_0= RULE_INT ) ) ) )
            // InternalVFormDsl.g:755:2: (otherlv_0= 'optionType:' otherlv_1= 'number' otherlv_2= ',' otherlv_3= 'min:' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'max:' ( (lv_max_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'range:' ( (lv_range_10_0= RULE_INT ) ) )
            {
            // InternalVFormDsl.g:755:2: (otherlv_0= 'optionType:' otherlv_1= 'number' otherlv_2= ',' otherlv_3= 'min:' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'max:' ( (lv_max_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'range:' ( (lv_range_10_0= RULE_INT ) ) )
            // InternalVFormDsl.g:756:3: otherlv_0= 'optionType:' otherlv_1= 'number' otherlv_2= ',' otherlv_3= 'min:' ( (lv_min_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'max:' ( (lv_max_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'range:' ( (lv_range_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberOptionAccess().getOptionTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOptionAccess().getNumberKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberOptionAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberOptionAccess().getMinKeyword_3());
            		
            // InternalVFormDsl.g:772:3: ( (lv_min_4_0= RULE_INT ) )
            // InternalVFormDsl.g:773:4: (lv_min_4_0= RULE_INT )
            {
            // InternalVFormDsl.g:773:4: (lv_min_4_0= RULE_INT )
            // InternalVFormDsl.g:774:5: lv_min_4_0= RULE_INT
            {
            lv_min_4_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_min_4_0, grammarAccess.getNumberOptionAccess().getMinINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getNumberOptionAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getNumberOptionAccess().getMaxKeyword_6());
            		
            // InternalVFormDsl.g:798:3: ( (lv_max_7_0= RULE_INT ) )
            // InternalVFormDsl.g:799:4: (lv_max_7_0= RULE_INT )
            {
            // InternalVFormDsl.g:799:4: (lv_max_7_0= RULE_INT )
            // InternalVFormDsl.g:800:5: lv_max_7_0= RULE_INT
            {
            lv_max_7_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_max_7_0, grammarAccess.getNumberOptionAccess().getMaxINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getNumberOptionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getNumberOptionAccess().getRangeKeyword_9());
            		
            // InternalVFormDsl.g:824:3: ( (lv_range_10_0= RULE_INT ) )
            // InternalVFormDsl.g:825:4: (lv_range_10_0= RULE_INT )
            {
            // InternalVFormDsl.g:825:4: (lv_range_10_0= RULE_INT )
            // InternalVFormDsl.g:826:5: lv_range_10_0= RULE_INT
            {
            lv_range_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_range_10_0, grammarAccess.getNumberOptionAccess().getRangeINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"range",
            						lv_range_10_0,
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


    // $ANTLR start "entryRuleFormInputSearch"
    // InternalVFormDsl.g:846:1: entryRuleFormInputSearch returns [EObject current=null] : iv_ruleFormInputSearch= ruleFormInputSearch EOF ;
    public final EObject entryRuleFormInputSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputSearch = null;


        try {
            // InternalVFormDsl.g:846:56: (iv_ruleFormInputSearch= ruleFormInputSearch EOF )
            // InternalVFormDsl.g:847:2: iv_ruleFormInputSearch= ruleFormInputSearch EOF
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
    // InternalVFormDsl.g:853:1: ruleFormInputSearch returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SEARCH' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '[' ( (lv_data_10_0= ruleOptionItem ) ) (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )* otherlv_13= ']' ) ;
    public final EObject ruleFormInputSearch() throws RecognitionException {
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
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_data_10_0 = null;

        EObject lv_data_12_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:859:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SEARCH' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '[' ( (lv_data_10_0= ruleOptionItem ) ) (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )* otherlv_13= ']' ) )
            // InternalVFormDsl.g:860:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SEARCH' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '[' ( (lv_data_10_0= ruleOptionItem ) ) (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )* otherlv_13= ']' )
            {
            // InternalVFormDsl.g:860:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SEARCH' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '[' ( (lv_data_10_0= ruleOptionItem ) ) (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )* otherlv_13= ']' )
            // InternalVFormDsl.g:861:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type' otherlv_5= ':' otherlv_6= 'SEARCH' otherlv_7= ',' otherlv_8= 'options:' otherlv_9= '[' ( (lv_data_10_0= ruleOptionItem ) ) (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )* otherlv_13= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputSearchAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputSearchAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:869:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:870:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:870:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:871:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormInputSearchAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormInputSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputSearchAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputSearchAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputSearchAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputSearchAccess().getSEARCHKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputSearchAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getFormInputSearchAccess().getOptionsKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getFormInputSearchAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalVFormDsl.g:915:3: ( (lv_data_10_0= ruleOptionItem ) )
            // InternalVFormDsl.g:916:4: (lv_data_10_0= ruleOptionItem )
            {
            // InternalVFormDsl.g:916:4: (lv_data_10_0= ruleOptionItem )
            // InternalVFormDsl.g:917:5: lv_data_10_0= ruleOptionItem
            {

            					newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_23);
            lv_data_10_0=ruleOptionItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormInputSearchRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_10_0,
            						"cafev.vform.VFormDsl.OptionItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVFormDsl.g:934:3: (otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVFormDsl.g:935:4: otherlv_11= ',' ( (lv_data_12_0= ruleOptionItem ) )
            	    {
            	    otherlv_11=(Token)match(input,12,FOLLOW_25); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFormInputSearchAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalVFormDsl.g:939:4: ( (lv_data_12_0= ruleOptionItem ) )
            	    // InternalVFormDsl.g:940:5: (lv_data_12_0= ruleOptionItem )
            	    {
            	    // InternalVFormDsl.g:940:5: (lv_data_12_0= ruleOptionItem )
            	    // InternalVFormDsl.g:941:6: lv_data_12_0= ruleOptionItem
            	    {

            	    						newCompositeNode(grammarAccess.getFormInputSearchAccess().getDataOptionItemParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFormInputSearchAccess().getRightSquareBracketKeyword_12());
            		

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
    // InternalVFormDsl.g:967:1: entryRuleOptionItem returns [EObject current=null] : iv_ruleOptionItem= ruleOptionItem EOF ;
    public final EObject entryRuleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionItem = null;


        try {
            // InternalVFormDsl.g:967:51: (iv_ruleOptionItem= ruleOptionItem EOF )
            // InternalVFormDsl.g:968:2: iv_ruleOptionItem= ruleOptionItem EOF
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
    // InternalVFormDsl.g:974:1: ruleOptionItem returns [EObject current=null] : (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) ;
    public final EObject ruleOptionItem() throws RecognitionException {
        EObject current = null;

        EObject this_StringOptionItem_0 = null;

        EObject this_IntOptionItem_1 = null;

        EObject this_DataOptionItem_2 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:980:2: ( (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem ) )
            // InternalVFormDsl.g:981:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
            {
            // InternalVFormDsl.g:981:2: (this_StringOptionItem_0= ruleStringOptionItem | this_IntOptionItem_1= ruleIntOptionItem | this_DataOptionItem_2= ruleDataOptionItem )
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
            case 24:
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
                    // InternalVFormDsl.g:982:3: this_StringOptionItem_0= ruleStringOptionItem
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
                    // InternalVFormDsl.g:991:3: this_IntOptionItem_1= ruleIntOptionItem
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
                    // InternalVFormDsl.g:1000:3: this_DataOptionItem_2= ruleDataOptionItem
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
    // InternalVFormDsl.g:1012:1: entryRuleStringOptionItem returns [EObject current=null] : iv_ruleStringOptionItem= ruleStringOptionItem EOF ;
    public final EObject entryRuleStringOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOptionItem = null;


        try {
            // InternalVFormDsl.g:1012:57: (iv_ruleStringOptionItem= ruleStringOptionItem EOF )
            // InternalVFormDsl.g:1013:2: iv_ruleStringOptionItem= ruleStringOptionItem EOF
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
    // InternalVFormDsl.g:1019:1: ruleStringOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1025:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalVFormDsl.g:1026:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalVFormDsl.g:1026:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalVFormDsl.g:1027:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1027:3: (lv_value_0_0= RULE_STRING )
            // InternalVFormDsl.g:1028:4: lv_value_0_0= RULE_STRING
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
    // InternalVFormDsl.g:1047:1: entryRuleIntOptionItem returns [EObject current=null] : iv_ruleIntOptionItem= ruleIntOptionItem EOF ;
    public final EObject entryRuleIntOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOptionItem = null;


        try {
            // InternalVFormDsl.g:1047:54: (iv_ruleIntOptionItem= ruleIntOptionItem EOF )
            // InternalVFormDsl.g:1048:2: iv_ruleIntOptionItem= ruleIntOptionItem EOF
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
    // InternalVFormDsl.g:1054:1: ruleIntOptionItem returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntOptionItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1060:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalVFormDsl.g:1061:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalVFormDsl.g:1061:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalVFormDsl.g:1062:3: (lv_value_0_0= RULE_INT )
            {
            // InternalVFormDsl.g:1062:3: (lv_value_0_0= RULE_INT )
            // InternalVFormDsl.g:1063:4: lv_value_0_0= RULE_INT
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
    // InternalVFormDsl.g:1082:1: entryRuleDataOptionItem returns [EObject current=null] : iv_ruleDataOptionItem= ruleDataOptionItem EOF ;
    public final EObject entryRuleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOptionItem = null;


        try {
            // InternalVFormDsl.g:1082:55: (iv_ruleDataOptionItem= ruleDataOptionItem EOF )
            // InternalVFormDsl.g:1083:2: iv_ruleDataOptionItem= ruleDataOptionItem EOF
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
    // InternalVFormDsl.g:1089:1: ruleDataOptionItem returns [EObject current=null] : ( (lv_value_0_0= ruleData ) ) ;
    public final EObject ruleDataOptionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1095:2: ( ( (lv_value_0_0= ruleData ) ) )
            // InternalVFormDsl.g:1096:2: ( (lv_value_0_0= ruleData ) )
            {
            // InternalVFormDsl.g:1096:2: ( (lv_value_0_0= ruleData ) )
            // InternalVFormDsl.g:1097:3: (lv_value_0_0= ruleData )
            {
            // InternalVFormDsl.g:1097:3: (lv_value_0_0= ruleData )
            // InternalVFormDsl.g:1098:4: lv_value_0_0= ruleData
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
    // InternalVFormDsl.g:1118:1: entryRuleFormInputGroup returns [EObject current=null] : iv_ruleFormInputGroup= ruleFormInputGroup EOF ;
    public final EObject entryRuleFormInputGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormInputGroup = null;


        try {
            // InternalVFormDsl.g:1118:55: (iv_ruleFormInputGroup= ruleFormInputGroup EOF )
            // InternalVFormDsl.g:1119:2: iv_ruleFormInputGroup= ruleFormInputGroup EOF
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
    // InternalVFormDsl.g:1125:1: ruleFormInputGroup returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) ) ;
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
            // InternalVFormDsl.g:1131:2: ( (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalVFormDsl.g:1132:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalVFormDsl.g:1132:2: (otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) ) )
            // InternalVFormDsl.g:1133:3: otherlv_0= 'name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'type:' otherlv_5= 'GROUP' otherlv_6= ',' otherlv_7= 'groupInputs:' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFormInputGroupAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormInputGroupAccess().getColonKeyword_1());
            		
            // InternalVFormDsl.g:1141:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1142:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1142:4: (lv_name_2_0= RULE_STRING )
            // InternalVFormDsl.g:1143:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getFormInputGroupAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getFormInputGroupAccess().getTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFormInputGroupAccess().getGROUPKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getFormInputGroupAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getFormInputGroupAccess().getGroupInputsKeyword_7());
            		
            // InternalVFormDsl.g:1179:3: ( (otherlv_8= RULE_ID ) )
            // InternalVFormDsl.g:1180:4: (otherlv_8= RULE_ID )
            {
            // InternalVFormDsl.g:1180:4: (otherlv_8= RULE_ID )
            // InternalVFormDsl.g:1181:5: otherlv_8= RULE_ID
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
    // InternalVFormDsl.g:1196:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalVFormDsl.g:1196:45: (iv_ruleData= ruleData EOF )
            // InternalVFormDsl.g:1197:2: iv_ruleData= ruleData EOF
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
    // InternalVFormDsl.g:1203:1: ruleData returns [EObject current=null] : (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_StringData_0 = null;

        EObject this_IntData_1 = null;



        	enterRule();

        try {
            // InternalVFormDsl.g:1209:2: ( (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData ) )
            // InternalVFormDsl.g:1210:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            {
            // InternalVFormDsl.g:1210:2: (this_StringData_0= ruleStringData | this_IntData_1= ruleIntData )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==36) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_STRING) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==12) ) {
                            int LA8_4 = input.LA(5);

                            if ( (LA8_4==37) ) {
                                int LA8_5 = input.LA(6);

                                if ( (LA8_5==RULE_STRING) ) {
                                    alt8=1;
                                }
                                else if ( (LA8_5==RULE_INT) ) {
                                    alt8=2;
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
                    // InternalVFormDsl.g:1211:3: this_StringData_0= ruleStringData
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
                    // InternalVFormDsl.g:1220:3: this_IntData_1= ruleIntData
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
    // InternalVFormDsl.g:1232:1: entryRuleStringData returns [EObject current=null] : iv_ruleStringData= ruleStringData EOF ;
    public final EObject entryRuleStringData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringData = null;


        try {
            // InternalVFormDsl.g:1232:51: (iv_ruleStringData= ruleStringData EOF )
            // InternalVFormDsl.g:1233:2: iv_ruleStringData= ruleStringData EOF
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
    // InternalVFormDsl.g:1239:1: ruleStringData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalVFormDsl.g:1245:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1246:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1246:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1247:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getStringDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStringDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1255:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1256:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1256:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1257:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getStringDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getStringDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1281:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalVFormDsl.g:1282:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1282:4: (lv_value_5_0= RULE_STRING )
            // InternalVFormDsl.g:1283:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalVFormDsl.g:1307:1: entryRuleIntData returns [EObject current=null] : iv_ruleIntData= ruleIntData EOF ;
    public final EObject entryRuleIntData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntData = null;


        try {
            // InternalVFormDsl.g:1307:48: (iv_ruleIntData= ruleIntData EOF )
            // InternalVFormDsl.g:1308:2: iv_ruleIntData= ruleIntData EOF
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
    // InternalVFormDsl.g:1314:1: ruleIntData returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // InternalVFormDsl.g:1320:2: ( (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalVFormDsl.g:1321:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalVFormDsl.g:1321:2: (otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalVFormDsl.g:1322:3: otherlv_0= '{' otherlv_1= 'label:' ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'value:' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDataAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIntDataAccess().getLabelKeyword_1());
            		
            // InternalVFormDsl.g:1330:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalVFormDsl.g:1331:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalVFormDsl.g:1331:4: (lv_label_2_0= RULE_STRING )
            // InternalVFormDsl.g:1332:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getIntDataAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getIntDataAccess().getValueKeyword_4());
            		
            // InternalVFormDsl.g:1356:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalVFormDsl.g:1357:4: (lv_value_5_0= RULE_INT )
            {
            // InternalVFormDsl.g:1357:4: (lv_value_5_0= RULE_INT )
            // InternalVFormDsl.g:1358:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "ruleInputType"
    // InternalVFormDsl.g:1382:1: ruleInputType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'CHECKBOX' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'RANGE' ) | (enumLiteral_5= 'SELECT' ) | (enumLiteral_6= 'SEARCH' ) | (enumLiteral_7= 'GROUP' ) ) ;
    public final Enumerator ruleInputType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1388:2: ( ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'CHECKBOX' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'RANGE' ) | (enumLiteral_5= 'SELECT' ) | (enumLiteral_6= 'SEARCH' ) | (enumLiteral_7= 'GROUP' ) ) )
            // InternalVFormDsl.g:1389:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'CHECKBOX' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'RANGE' ) | (enumLiteral_5= 'SELECT' ) | (enumLiteral_6= 'SEARCH' ) | (enumLiteral_7= 'GROUP' ) )
            {
            // InternalVFormDsl.g:1389:2: ( (enumLiteral_0= 'TEXT' ) | (enumLiteral_1= 'CHECKBOX' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'RANGE' ) | (enumLiteral_5= 'SELECT' ) | (enumLiteral_6= 'SEARCH' ) | (enumLiteral_7= 'GROUP' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            case 41:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 22:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 34:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVFormDsl.g:1390:3: (enumLiteral_0= 'TEXT' )
                    {
                    // InternalVFormDsl.g:1390:3: (enumLiteral_0= 'TEXT' )
                    // InternalVFormDsl.g:1391:4: enumLiteral_0= 'TEXT'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInputTypeAccess().getTEXTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1398:3: (enumLiteral_1= 'CHECKBOX' )
                    {
                    // InternalVFormDsl.g:1398:3: (enumLiteral_1= 'CHECKBOX' )
                    // InternalVFormDsl.g:1399:4: enumLiteral_1= 'CHECKBOX'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getCHECKBOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInputTypeAccess().getCHECKBOXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:1406:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalVFormDsl.g:1406:3: (enumLiteral_2= 'NUMBER' )
                    // InternalVFormDsl.g:1407:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInputTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVFormDsl.g:1414:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalVFormDsl.g:1414:3: (enumLiteral_3= 'DATE' )
                    // InternalVFormDsl.g:1415:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getInputTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVFormDsl.g:1422:3: (enumLiteral_4= 'RANGE' )
                    {
                    // InternalVFormDsl.g:1422:3: (enumLiteral_4= 'RANGE' )
                    // InternalVFormDsl.g:1423:4: enumLiteral_4= 'RANGE'
                    {
                    enumLiteral_4=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getRANGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getInputTypeAccess().getRANGEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVFormDsl.g:1430:3: (enumLiteral_5= 'SELECT' )
                    {
                    // InternalVFormDsl.g:1430:3: (enumLiteral_5= 'SELECT' )
                    // InternalVFormDsl.g:1431:4: enumLiteral_5= 'SELECT'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getSELECTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getInputTypeAccess().getSELECTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVFormDsl.g:1438:3: (enumLiteral_6= 'SEARCH' )
                    {
                    // InternalVFormDsl.g:1438:3: (enumLiteral_6= 'SEARCH' )
                    // InternalVFormDsl.g:1439:4: enumLiteral_6= 'SEARCH'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getSEARCHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getInputTypeAccess().getSEARCHEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVFormDsl.g:1446:3: (enumLiteral_7= 'GROUP' )
                    {
                    // InternalVFormDsl.g:1446:3: (enumLiteral_7= 'GROUP' )
                    // InternalVFormDsl.g:1447:4: enumLiteral_7= 'GROUP'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getInputTypeAccess().getGROUPEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getInputTypeAccess().getGROUPEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleInputType"


    // $ANTLR start "ruleLayout"
    // InternalVFormDsl.g:1457:1: ruleLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) ;
    public final Enumerator ruleLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVFormDsl.g:1463:2: ( ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) )
            // InternalVFormDsl.g:1464:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            {
            // InternalVFormDsl.g:1464:2: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVFormDsl.g:1465:3: (enumLiteral_0= 'horizontal' )
                    {
                    // InternalVFormDsl.g:1465:3: (enumLiteral_0= 'horizontal' )
                    // InternalVFormDsl.g:1466:4: enumLiteral_0= 'horizontal'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayoutAccess().getHorizontalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1473:3: (enumLiteral_1= 'vertical' )
                    {
                    // InternalVFormDsl.g:1473:3: (enumLiteral_1= 'vertical' )
                    // InternalVFormDsl.g:1474:4: enumLiteral_1= 'vertical'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\1\21\1\4\1\14\1\22\1\uffff\1\21\1\uffff\1\23\3\uffff";
    static final String dfa_3s = "\1\20\1\21\1\4\1\22\1\41\1\uffff\1\21\1\uffff\1\40\3\uffff";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\5\1\uffff\1\4\1\2\1\3";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\5\uffff\1\5",
            "\1\6\16\uffff\1\7",
            "",
            "\1\10",
            "",
            "\1\12\2\uffff\1\13\11\uffff\1\11",
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
            return "192:2: (this_FormInputBasic_0= ruleFormInputBasic | this_FormInputRange_1= ruleFormInputRange | this_FormInputSelect_2= ruleFormInputSelect | this_FormInputSearch_3= ruleFormInputSearch | this_FormInputGroup_4= ruleFormInputGroup )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003C500480000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});

}