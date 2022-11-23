package cafev.vform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVFormDslLexer extends Lexer {
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

    public InternalVFormDslLexer() {;} 
    public InternalVFormDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVFormDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVFormDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:11:7: ( '{' )
            // InternalVFormDsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:12:7: ( '\"formLayout\":' )
            // InternalVFormDsl.g:12:9: '\"formLayout\":'
            {
            match("\"formLayout\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:13:7: ( ',' )
            // InternalVFormDsl.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:14:7: ( '\"formInputs\":' )
            // InternalVFormDsl.g:14:9: '\"formInputs\":'
            {
            match("\"formInputs\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:15:7: ( '[' )
            // InternalVFormDsl.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:16:7: ( ']' )
            // InternalVFormDsl.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:17:7: ( '}' )
            // InternalVFormDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:18:7: ( '\"inputName\"' )
            // InternalVFormDsl.g:18:9: '\"inputName\"'
            {
            match("\"inputName\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:19:7: ( ':' )
            // InternalVFormDsl.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:20:7: ( '\"inputType\"' )
            // InternalVFormDsl.g:20:9: '\"inputType\"'
            {
            match("\"inputType\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:21:7: ( '\"range\"' )
            // InternalVFormDsl.g:21:9: '\"range\"'
            {
            match("\"range\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:22:7: ( '\"min\"' )
            // InternalVFormDsl.g:22:9: '\"min\"'
            {
            match("\"min\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:23:7: ( '\"max\"' )
            // InternalVFormDsl.g:23:9: '\"max\"'
            {
            match("\"max\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:24:7: ( '\"select\"' )
            // InternalVFormDsl.g:24:9: '\"select\"'
            {
            match("\"select\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:25:7: ( '\"options\"' )
            // InternalVFormDsl.g:25:9: '\"options\"'
            {
            match("\"options\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:26:7: ( '\"optionType\"' )
            // InternalVFormDsl.g:26:9: '\"optionType\"'
            {
            match("\"optionType\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:27:7: ( '\"data\"' )
            // InternalVFormDsl.g:27:9: '\"data\"'
            {
            match("\"data\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:28:7: ( '\"enum\"' )
            // InternalVFormDsl.g:28:9: '\"enum\"'
            {
            match("\"enum\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:29:7: ( '\"number\"' )
            // InternalVFormDsl.g:29:9: '\"number\"'
            {
            match("\"number\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:30:7: ( '\"search\"' )
            // InternalVFormDsl.g:30:9: '\"search\"'
            {
            match("\"search\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:31:7: ( 'name' )
            // InternalVFormDsl.g:31:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:32:7: ( 'type:' )
            // InternalVFormDsl.g:32:9: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:33:7: ( 'GROUP' )
            // InternalVFormDsl.g:33:9: 'GROUP'
            {
            match("GROUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:34:7: ( 'groupInputs:' )
            // InternalVFormDsl.g:34:9: 'groupInputs:'
            {
            match("groupInputs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:35:7: ( 'label:' )
            // InternalVFormDsl.g:35:9: 'label:'
            {
            match("label:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:36:7: ( 'value:' )
            // InternalVFormDsl.g:36:9: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_LAYOUT"
    public final void mRULE_LAYOUT() throws RecognitionException {
        try {
            int _type = RULE_LAYOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1507:13: ( ( '\"horizontal\"' | '\"vertical\"' ) )
            // InternalVFormDsl.g:1507:15: ( '\"horizontal\"' | '\"vertical\"' )
            {
            // InternalVFormDsl.g:1507:15: ( '\"horizontal\"' | '\"vertical\"' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\"') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='h') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='v') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVFormDsl.g:1507:16: '\"horizontal\"'
                    {
                    match("\"horizontal\""); 


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1507:31: '\"vertical\"'
                    {
                    match("\"vertical\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LAYOUT"

    // $ANTLR start "RULE_BASICINPUT"
    public final void mRULE_BASICINPUT() throws RecognitionException {
        try {
            int _type = RULE_BASICINPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1509:17: ( ( '\"text\"' | '\"checkbox\"' | '\"numberr\"' | '\"date\"' ) )
            // InternalVFormDsl.g:1509:19: ( '\"text\"' | '\"checkbox\"' | '\"numberr\"' | '\"date\"' )
            {
            // InternalVFormDsl.g:1509:19: ( '\"text\"' | '\"checkbox\"' | '\"numberr\"' | '\"date\"' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\"') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    alt2=1;
                    }
                    break;
                case 'c':
                    {
                    alt2=2;
                    }
                    break;
                case 'n':
                    {
                    alt2=3;
                    }
                    break;
                case 'd':
                    {
                    alt2=4;
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
                    // InternalVFormDsl.g:1509:20: '\"text\"'
                    {
                    match("\"text\""); 


                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1509:29: '\"checkbox\"'
                    {
                    match("\"checkbox\""); 


                    }
                    break;
                case 3 :
                    // InternalVFormDsl.g:1509:42: '\"numberr\"'
                    {
                    match("\"numberr\""); 


                    }
                    break;
                case 4 :
                    // InternalVFormDsl.g:1509:54: '\"date\"'
                    {
                    match("\"date\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASICINPUT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1511:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVFormDsl.g:1511:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVFormDsl.g:1511:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVFormDsl.g:1511:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVFormDsl.g:1511:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVFormDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1513:10: ( ( '0' .. '9' )+ )
            // InternalVFormDsl.g:1513:12: ( '0' .. '9' )+
            {
            // InternalVFormDsl.g:1513:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVFormDsl.g:1513:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1515:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVFormDsl.g:1515:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVFormDsl.g:1515:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVFormDsl.g:1515:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVFormDsl.g:1515:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVFormDsl.g:1515:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVFormDsl.g:1515:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVFormDsl.g:1515:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVFormDsl.g:1515:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVFormDsl.g:1515:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVFormDsl.g:1515:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1517:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVFormDsl.g:1517:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVFormDsl.g:1517:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVFormDsl.g:1517:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1519:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVFormDsl.g:1519:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVFormDsl.g:1519:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVFormDsl.g:1519:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVFormDsl.g:1519:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVFormDsl.g:1519:41: ( '\\r' )? '\\n'
                    {
                    // InternalVFormDsl.g:1519:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalVFormDsl.g:1519:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1521:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVFormDsl.g:1521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVFormDsl.g:1521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVFormDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVFormDsl.g:1523:16: ( . )
            // InternalVFormDsl.g:1523:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalVFormDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LAYOUT | RULE_BASICINPUT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=35;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalVFormDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalVFormDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalVFormDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalVFormDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalVFormDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalVFormDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalVFormDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalVFormDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalVFormDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalVFormDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalVFormDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalVFormDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalVFormDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalVFormDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalVFormDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalVFormDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalVFormDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalVFormDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalVFormDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalVFormDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalVFormDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalVFormDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalVFormDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalVFormDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalVFormDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalVFormDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalVFormDsl.g:1:166: RULE_LAYOUT
                {
                mRULE_LAYOUT(); 

                }
                break;
            case 28 :
                // InternalVFormDsl.g:1:178: RULE_BASICINPUT
                {
                mRULE_BASICINPUT(); 

                }
                break;
            case 29 :
                // InternalVFormDsl.g:1:194: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalVFormDsl.g:1:202: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalVFormDsl.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalVFormDsl.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalVFormDsl.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalVFormDsl.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalVFormDsl.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\24\5\uffff\6\52\1\24\2\uffff\2\24\26\uffff\1\52\1\uffff\5\52\22\uffff\6\52\17\uffff\1\155\5\52\22\uffff\1\u0084\3\52\22\uffff\1\52\21\uffff\1\52\16\uffff\1\52\15\uffff\1\52\11\uffff\1\52\7\uffff\1\52\2\43\10\uffff";
    static final String DFA14_eofS =
        "\u00d1\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\0\5\uffff\1\141\1\171\1\122\1\162\2\141\1\101\2\uffff\1\0\1\52\3\uffff\15\0\6\uffff\1\155\1\uffff\1\160\1\117\1\157\1\142\1\154\4\uffff\16\0\2\145\1\125\1\165\1\145\1\165\17\0\1\60\1\72\1\120\1\160\1\154\1\145\3\0\2\uffff\13\0\2\uffff\1\60\1\111\2\72\4\0\2\uffff\3\0\3\uffff\3\0\1\uffff\1\0\1\uffff\1\156\2\uffff\4\0\1\uffff\3\0\3\uffff\4\0\1\160\4\0\3\uffff\2\0\1\uffff\4\0\1\165\4\0\3\uffff\1\0\2\uffff\3\0\1\164\4\0\1\uffff\2\0\2\uffff\1\163\2\0\2\uffff\2\0\1\uffff\3\72\10\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\uffff\5\uffff\1\141\1\171\1\122\1\162\2\141\1\172\2\uffff\1\uffff\1\57\3\uffff\15\uffff\6\uffff\1\155\1\uffff\1\160\1\117\1\157\1\142\1\154\4\uffff\16\uffff\2\145\1\125\1\165\1\145\1\165\17\uffff\1\172\1\72\1\120\1\160\1\154\1\145\3\uffff\2\uffff\13\uffff\2\uffff\1\172\1\111\2\72\4\uffff\2\uffff\3\uffff\3\uffff\3\uffff\1\uffff\1\uffff\1\uffff\1\156\2\uffff\4\uffff\1\uffff\3\uffff\3\uffff\4\uffff\1\160\4\uffff\3\uffff\2\uffff\1\uffff\4\uffff\1\165\4\uffff\3\uffff\1\uffff\2\uffff\3\uffff\1\164\4\uffff\1\uffff\2\uffff\2\uffff\1\163\2\uffff\2\uffff\2\uffff\1\uffff\3\72\10\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\1\11\7\uffff\1\35\1\36\2\uffff\1\42\1\43\1\1\15\uffff\1\37\1\3\1\5\1\6\1\7\1\11\1\uffff\1\35\5\uffff\1\36\1\40\1\41\1\42\54\uffff\1\14\1\15\13\uffff\1\25\1\26\10\uffff\1\14\1\15\3\uffff\1\21\1\34\1\22\3\uffff\1\34\1\uffff\1\27\1\uffff\1\31\1\32\4\uffff\1\13\3\uffff\1\21\1\34\1\22\11\uffff\1\13\1\16\1\24\2\uffff\1\23\11\uffff\1\16\1\24\1\17\1\uffff\1\23\1\34\10\uffff\1\17\2\uffff\1\33\1\34\3\uffff\1\10\1\12\2\uffff\1\33\3\uffff\1\10\1\12\1\20\1\33\1\30\1\2\1\4\1\20";
    static final String DFA14_specialS =
        "\1\154\1\uffff\1\30\16\uffff\1\116\4\uffff\1\17\1\50\1\10\1\77\1\125\1\117\1\133\1\40\1\140\1\55\1\67\1\100\1\104\21\uffff\1\22\1\51\1\11\1\15\1\20\1\126\1\120\1\136\1\41\1\141\1\56\1\70\1\101\1\105\6\uffff\1\23\1\52\1\12\1\16\1\21\1\25\1\44\1\121\1\137\1\42\1\142\1\57\1\71\1\102\1\106\6\uffff\1\24\1\53\1\13\2\uffff\1\26\1\45\1\122\1\37\1\115\1\43\1\143\1\60\1\72\1\103\1\107\6\uffff\1\127\1\144\1\54\1\14\2\uffff\1\27\1\46\1\123\3\uffff\1\145\1\61\1\73\1\uffff\1\110\4\uffff\1\130\1\146\1\0\1\4\1\uffff\1\31\1\47\1\124\3\uffff\1\147\1\62\1\74\1\111\1\uffff\1\131\1\150\1\1\1\5\3\uffff\1\32\1\33\1\uffff\1\114\1\63\1\75\1\112\1\uffff\1\132\1\151\1\2\1\6\3\uffff\1\34\2\uffff\1\64\1\76\1\113\1\uffff\1\134\1\152\1\3\1\7\1\uffff\1\35\1\65\3\uffff\1\135\1\153\2\uffff\1\36\1\66\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\2\4\24\1\21\4\24\1\3\2\24\1\22\12\20\1\7\6\24\6\17\1\12\23\17\1\4\1\24\1\5\1\16\1\17\1\24\6\17\1\13\4\17\1\14\1\17\1\10\5\17\1\11\1\17\1\15\4\17\1\1\1\24\1\6\uff82\24",
            "",
            "\143\43\1\42\1\34\1\35\1\26\1\43\1\37\1\27\3\43\1\31\1\36\1\33\2\43\1\30\1\32\1\41\1\43\1\40\uff89\43",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\43",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "",
            "\157\43\1\64\uff90\43",
            "\156\43\1\65\uff91\43",
            "\141\43\1\66\uff9e\43",
            "\141\43\1\70\7\43\1\67\uff96\43",
            "\145\43\1\71\uff9a\43",
            "\160\43\1\72\uff8f\43",
            "\141\43\1\73\uff9e\43",
            "\156\43\1\74\uff91\43",
            "\165\43\1\75\uff8a\43",
            "\157\43\1\76\uff90\43",
            "\145\43\1\77\uff9a\43",
            "\145\43\1\100\uff9a\43",
            "\150\43\1\101\uff97\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "\162\43\1\110\uff8d\43",
            "\160\43\1\111\uff8f\43",
            "\156\43\1\112\uff91\43",
            "\156\43\1\113\uff91\43",
            "\170\43\1\114\uff87\43",
            "\141\43\1\116\12\43\1\115\uff93\43",
            "\164\43\1\117\uff8b\43",
            "\164\43\1\120\uff8b\43",
            "\165\43\1\121\uff8a\43",
            "\155\43\1\122\uff92\43",
            "\162\43\1\123\uff8d\43",
            "\162\43\1\124\uff8d\43",
            "\170\43\1\125\uff87\43",
            "\145\43\1\126\uff9a\43",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\155\43\1\135\uff92\43",
            "\165\43\1\136\uff8a\43",
            "\147\43\1\137\uff98\43",
            "\42\43\1\140\uffdd\43",
            "\42\43\1\141\uffdd\43",
            "\145\43\1\142\uff9a\43",
            "\162\43\1\143\uff8d\43",
            "\151\43\1\144\uff96\43",
            "\141\43\1\145\3\43\1\146\uff9a\43",
            "\155\43\1\147\uff92\43",
            "\142\43\1\150\uff9d\43",
            "\151\43\1\151\uff96\43",
            "\164\43\1\152\uff8b\43",
            "\164\43\1\153\uff8b\43",
            "\143\43\1\154\uff9c\43",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\111\43\1\164\2\43\1\163\uffb3\43",
            "\164\43\1\165\uff8b\43",
            "\145\43\1\166\uff9a\43",
            "",
            "",
            "\143\43\1\171\uff9c\43",
            "\143\43\1\172\uff9c\43",
            "\157\43\1\173\uff90\43",
            "\42\43\1\174\uffdd\43",
            "\42\43\1\175\uffdd\43",
            "\42\43\1\176\uffdd\43",
            "\145\43\1\177\uff9a\43",
            "\172\43\1\u0080\uff85\43",
            "\151\43\1\u0081\uff96\43",
            "\42\43\1\u0082\uffdd\43",
            "\153\43\1\u0083\uff94\43",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\141\43\1\u0088\uff9e\43",
            "\156\43\1\u0089\uff91\43",
            "\116\43\1\u008a\5\43\1\u008b\uffab\43",
            "\42\43\1\u008c\uffdd\43",
            "",
            "",
            "\164\43\1\u008d\uff8b\43",
            "\150\43\1\u008e\uff97\43",
            "\156\43\1\u008f\uff91\43",
            "",
            "",
            "",
            "\162\43\1\u0093\uff8d\43",
            "\157\43\1\u0094\uff90\43",
            "\143\43\1\u0095\uff9c\43",
            "",
            "\142\43\1\u0096\uff9d\43",
            "",
            "\1\u0097",
            "",
            "",
            "\171\43\1\u0098\uff86\43",
            "\160\43\1\u0099\uff8f\43",
            "\141\43\1\u009a\uff9e\43",
            "\171\43\1\u009b\uff86\43",
            "",
            "\42\43\1\u009d\uffdd\43",
            "\42\43\1\u009e\uffdd\43",
            "\124\43\1\u00a0\36\43\1\u009f\uff8c\43",
            "",
            "",
            "",
            "\42\43\1\u00a1\117\43\1\u00a2\uff8d\43",
            "\156\43\1\u00a3\uff91\43",
            "\141\43\1\u00a4\uff9e\43",
            "\157\43\1\u00a5\uff90\43",
            "\1\u00a6",
            "\157\43\1\u00a7\uff90\43",
            "\165\43\1\u00a8\uff8a\43",
            "\155\43\1\u00a9\uff92\43",
            "\160\43\1\u00aa\uff8f\43",
            "",
            "",
            "",
            "\42\43\1\u00ad\uffdd\43",
            "\171\43\1\u00ae\uff86\43",
            "",
            "\42\43\1\u00b0\uffdd\43",
            "\164\43\1\u00b1\uff8b\43",
            "\154\43\1\u00b2\uff93\43",
            "\170\43\1\u00b3\uff87\43",
            "\1\u00b4",
            "\165\43\1\u00b5\uff8a\43",
            "\164\43\1\u00b6\uff8b\43",
            "\145\43\1\u00b7\uff9a\43",
            "\145\43\1\u00b8\uff9a\43",
            "",
            "",
            "",
            "\160\43\1\u00ba\uff8f\43",
            "",
            "",
            "\141\43\1\u00bb\uff9e\43",
            "\42\43\1\u00bc\uffdd\43",
            "\42\43\1\u00bd\uffdd\43",
            "\1\u00be",
            "\164\43\1\u00bf\uff8b\43",
            "\163\43\1\u00c0\uff8c\43",
            "\42\43\1\u00c1\uffdd\43",
            "\42\43\1\u00c2\uffdd\43",
            "",
            "\145\43\1\u00c3\uff9a\43",
            "\154\43\1\u00c4\uff93\43",
            "",
            "",
            "\1\u00c6",
            "\42\43\1\u00c7\uffdd\43",
            "\42\43\1\u00c8\uffdd\43",
            "",
            "",
            "\42\43\1\u00cb\uffdd\43",
            "\42\43\1\u00cc\uffdd\43",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LAYOUT | RULE_BASICINPUT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_138 = input.LA(1);

                        s = -1;
                        if ( (LA14_138=='a') ) {s = 154;}

                        else if ( ((LA14_138>='\u0000' && LA14_138<='`')||(LA14_138>='b' && LA14_138<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_154 = input.LA(1);

                        s = -1;
                        if ( (LA14_154=='m') ) {s = 169;}

                        else if ( ((LA14_154>='\u0000' && LA14_154<='l')||(LA14_154>='n' && LA14_154<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_169 = input.LA(1);

                        s = -1;
                        if ( (LA14_169=='e') ) {s = 183;}

                        else if ( ((LA14_169>='\u0000' && LA14_169<='d')||(LA14_169>='f' && LA14_169<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_183 = input.LA(1);

                        s = -1;
                        if ( (LA14_183=='\"') ) {s = 193;}

                        else if ( ((LA14_183>='\u0000' && LA14_183<='!')||(LA14_183>='#' && LA14_183<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_139 = input.LA(1);

                        s = -1;
                        if ( (LA14_139=='y') ) {s = 155;}

                        else if ( ((LA14_139>='\u0000' && LA14_139<='x')||(LA14_139>='z' && LA14_139<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_155 = input.LA(1);

                        s = -1;
                        if ( (LA14_155=='p') ) {s = 170;}

                        else if ( ((LA14_155>='\u0000' && LA14_155<='o')||(LA14_155>='q' && LA14_155<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_170 = input.LA(1);

                        s = -1;
                        if ( (LA14_170=='e') ) {s = 184;}

                        else if ( ((LA14_170>='\u0000' && LA14_170<='d')||(LA14_170>='f' && LA14_170<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_184 = input.LA(1);

                        s = -1;
                        if ( (LA14_184=='\"') ) {s = 194;}

                        else if ( ((LA14_184>='\u0000' && LA14_184<='!')||(LA14_184>='#' && LA14_184<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( (LA14_24=='a') ) {s = 54;}

                        else if ( ((LA14_24>='\u0000' && LA14_24<='`')||(LA14_24>='b' && LA14_24<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_54 = input.LA(1);

                        s = -1;
                        if ( (LA14_54=='n') ) {s = 74;}

                        else if ( ((LA14_54>='\u0000' && LA14_54<='m')||(LA14_54>='o' && LA14_54<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_74 = input.LA(1);

                        s = -1;
                        if ( (LA14_74=='g') ) {s = 95;}

                        else if ( ((LA14_74>='\u0000' && LA14_74<='f')||(LA14_74>='h' && LA14_74<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_95 = input.LA(1);

                        s = -1;
                        if ( (LA14_95=='e') ) {s = 118;}

                        else if ( ((LA14_95>='\u0000' && LA14_95<='d')||(LA14_95>='f' && LA14_95<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_118 = input.LA(1);

                        s = -1;
                        if ( (LA14_118=='\"') ) {s = 140;}

                        else if ( ((LA14_118>='\u0000' && LA14_118<='!')||(LA14_118>='#' && LA14_118<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_55 = input.LA(1);

                        s = -1;
                        if ( (LA14_55=='n') ) {s = 75;}

                        else if ( ((LA14_55>='\u0000' && LA14_55<='m')||(LA14_55>='o' && LA14_55<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_75 = input.LA(1);

                        s = -1;
                        if ( (LA14_75=='\"') ) {s = 96;}

                        else if ( ((LA14_75>='\u0000' && LA14_75<='!')||(LA14_75>='#' && LA14_75<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( (LA14_22=='o') ) {s = 52;}

                        else if ( ((LA14_22>='\u0000' && LA14_22<='n')||(LA14_22>='p' && LA14_22<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( (LA14_56=='x') ) {s = 76;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='w')||(LA14_56>='y' && LA14_56<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_76 = input.LA(1);

                        s = -1;
                        if ( (LA14_76=='\"') ) {s = 97;}

                        else if ( ((LA14_76>='\u0000' && LA14_76<='!')||(LA14_76>='#' && LA14_76<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( (LA14_52=='r') ) {s = 72;}

                        else if ( ((LA14_52>='\u0000' && LA14_52<='q')||(LA14_52>='s' && LA14_52<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_72 = input.LA(1);

                        s = -1;
                        if ( (LA14_72=='m') ) {s = 93;}

                        else if ( ((LA14_72>='\u0000' && LA14_72<='l')||(LA14_72>='n' && LA14_72<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_93 = input.LA(1);

                        s = -1;
                        if ( (LA14_93=='L') ) {s = 115;}

                        else if ( (LA14_93=='I') ) {s = 116;}

                        else if ( ((LA14_93>='\u0000' && LA14_93<='H')||(LA14_93>='J' && LA14_93<='K')||(LA14_93>='M' && LA14_93<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_77 = input.LA(1);

                        s = -1;
                        if ( (LA14_77=='e') ) {s = 98;}

                        else if ( ((LA14_77>='\u0000' && LA14_77<='d')||(LA14_77>='f' && LA14_77<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_98 = input.LA(1);

                        s = -1;
                        if ( (LA14_98=='c') ) {s = 121;}

                        else if ( ((LA14_98>='\u0000' && LA14_98<='b')||(LA14_98>='d' && LA14_98<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_121 = input.LA(1);

                        s = -1;
                        if ( (LA14_121=='t') ) {s = 141;}

                        else if ( ((LA14_121>='\u0000' && LA14_121<='s')||(LA14_121>='u' && LA14_121<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_2 = input.LA(1);

                        s = -1;
                        if ( (LA14_2=='f') ) {s = 22;}

                        else if ( (LA14_2=='i') ) {s = 23;}

                        else if ( (LA14_2=='r') ) {s = 24;}

                        else if ( (LA14_2=='m') ) {s = 25;}

                        else if ( (LA14_2=='s') ) {s = 26;}

                        else if ( (LA14_2=='o') ) {s = 27;}

                        else if ( (LA14_2=='d') ) {s = 28;}

                        else if ( (LA14_2=='e') ) {s = 29;}

                        else if ( (LA14_2=='n') ) {s = 30;}

                        else if ( (LA14_2=='h') ) {s = 31;}

                        else if ( (LA14_2=='v') ) {s = 32;}

                        else if ( (LA14_2=='t') ) {s = 33;}

                        else if ( (LA14_2=='c') ) {s = 34;}

                        else if ( ((LA14_2>='\u0000' && LA14_2<='b')||LA14_2=='g'||(LA14_2>='j' && LA14_2<='l')||(LA14_2>='p' && LA14_2<='q')||LA14_2=='u'||(LA14_2>='w' && LA14_2<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_141 = input.LA(1);

                        s = -1;
                        if ( (LA14_141=='\"') ) {s = 157;}

                        else if ( ((LA14_141>='\u0000' && LA14_141<='!')||(LA14_141>='#' && LA14_141<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_159 = input.LA(1);

                        s = -1;
                        if ( (LA14_159=='\"') ) {s = 173;}

                        else if ( ((LA14_159>='\u0000' && LA14_159<='!')||(LA14_159>='#' && LA14_159<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_160 = input.LA(1);

                        s = -1;
                        if ( (LA14_160=='y') ) {s = 174;}

                        else if ( ((LA14_160>='\u0000' && LA14_160<='x')||(LA14_160>='z' && LA14_160<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_174 = input.LA(1);

                        s = -1;
                        if ( (LA14_174=='p') ) {s = 186;}

                        else if ( ((LA14_174>='\u0000' && LA14_174<='o')||(LA14_174>='q' && LA14_174<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_186 = input.LA(1);

                        s = -1;
                        if ( (LA14_186=='e') ) {s = 195;}

                        else if ( ((LA14_186>='\u0000' && LA14_186<='d')||(LA14_186>='f' && LA14_186<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA14_195 = input.LA(1);

                        s = -1;
                        if ( (LA14_195=='\"') ) {s = 203;}

                        else if ( ((LA14_195>='\u0000' && LA14_195<='!')||(LA14_195>='#' && LA14_195<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA14_101 = input.LA(1);

                        s = -1;
                        if ( (LA14_101=='\"') ) {s = 124;}

                        else if ( ((LA14_101>='\u0000' && LA14_101<='!')||(LA14_101>='#' && LA14_101<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( (LA14_29=='n') ) {s = 60;}

                        else if ( ((LA14_29>='\u0000' && LA14_29<='m')||(LA14_29>='o' && LA14_29<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA14_60 = input.LA(1);

                        s = -1;
                        if ( (LA14_60=='u') ) {s = 81;}

                        else if ( ((LA14_60>='\u0000' && LA14_60<='t')||(LA14_60>='v' && LA14_60<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA14_81 = input.LA(1);

                        s = -1;
                        if ( (LA14_81=='m') ) {s = 103;}

                        else if ( ((LA14_81>='\u0000' && LA14_81<='l')||(LA14_81>='n' && LA14_81<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA14_103 = input.LA(1);

                        s = -1;
                        if ( (LA14_103=='\"') ) {s = 126;}

                        else if ( ((LA14_103>='\u0000' && LA14_103<='!')||(LA14_103>='#' && LA14_103<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA14_78 = input.LA(1);

                        s = -1;
                        if ( (LA14_78=='r') ) {s = 99;}

                        else if ( ((LA14_78>='\u0000' && LA14_78<='q')||(LA14_78>='s' && LA14_78<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( (LA14_99=='c') ) {s = 122;}

                        else if ( ((LA14_99>='\u0000' && LA14_99<='b')||(LA14_99>='d' && LA14_99<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA14_122 = input.LA(1);

                        s = -1;
                        if ( (LA14_122=='h') ) {s = 142;}

                        else if ( ((LA14_122>='\u0000' && LA14_122<='g')||(LA14_122>='i' && LA14_122<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA14_142 = input.LA(1);

                        s = -1;
                        if ( (LA14_142=='\"') ) {s = 158;}

                        else if ( ((LA14_142>='\u0000' && LA14_142<='!')||(LA14_142>='#' && LA14_142<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( (LA14_23=='n') ) {s = 53;}

                        else if ( ((LA14_23>='\u0000' && LA14_23<='m')||(LA14_23>='o' && LA14_23<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( (LA14_53=='p') ) {s = 73;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='o')||(LA14_53>='q' && LA14_53<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA14_73 = input.LA(1);

                        s = -1;
                        if ( (LA14_73=='u') ) {s = 94;}

                        else if ( ((LA14_73>='\u0000' && LA14_73<='t')||(LA14_73>='v' && LA14_73<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA14_94 = input.LA(1);

                        s = -1;
                        if ( (LA14_94=='t') ) {s = 117;}

                        else if ( ((LA14_94>='\u0000' && LA14_94<='s')||(LA14_94>='u' && LA14_94<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA14_117 = input.LA(1);

                        s = -1;
                        if ( (LA14_117=='N') ) {s = 138;}

                        else if ( (LA14_117=='T') ) {s = 139;}

                        else if ( ((LA14_117>='\u0000' && LA14_117<='M')||(LA14_117>='O' && LA14_117<='S')||(LA14_117>='U' && LA14_117<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( (LA14_31=='o') ) {s = 62;}

                        else if ( ((LA14_31>='\u0000' && LA14_31<='n')||(LA14_31>='p' && LA14_31<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA14_62 = input.LA(1);

                        s = -1;
                        if ( (LA14_62=='r') ) {s = 83;}

                        else if ( ((LA14_62>='\u0000' && LA14_62<='q')||(LA14_62>='s' && LA14_62<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( (LA14_83=='i') ) {s = 105;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<='h')||(LA14_83>='j' && LA14_83<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA14_105 = input.LA(1);

                        s = -1;
                        if ( (LA14_105=='z') ) {s = 128;}

                        else if ( ((LA14_105>='\u0000' && LA14_105<='y')||(LA14_105>='{' && LA14_105<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA14_128 = input.LA(1);

                        s = -1;
                        if ( (LA14_128=='o') ) {s = 148;}

                        else if ( ((LA14_128>='\u0000' && LA14_128<='n')||(LA14_128>='p' && LA14_128<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA14_148 = input.LA(1);

                        s = -1;
                        if ( (LA14_148=='n') ) {s = 163;}

                        else if ( ((LA14_148>='\u0000' && LA14_148<='m')||(LA14_148>='o' && LA14_148<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA14_163 = input.LA(1);

                        s = -1;
                        if ( (LA14_163=='t') ) {s = 177;}

                        else if ( ((LA14_163>='\u0000' && LA14_163<='s')||(LA14_163>='u' && LA14_163<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA14_177 = input.LA(1);

                        s = -1;
                        if ( (LA14_177=='a') ) {s = 187;}

                        else if ( ((LA14_177>='\u0000' && LA14_177<='`')||(LA14_177>='b' && LA14_177<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA14_187 = input.LA(1);

                        s = -1;
                        if ( (LA14_187=='l') ) {s = 196;}

                        else if ( ((LA14_187>='\u0000' && LA14_187<='k')||(LA14_187>='m' && LA14_187<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA14_196 = input.LA(1);

                        s = -1;
                        if ( (LA14_196=='\"') ) {s = 204;}

                        else if ( ((LA14_196>='\u0000' && LA14_196<='!')||(LA14_196>='#' && LA14_196<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( (LA14_32=='e') ) {s = 63;}

                        else if ( ((LA14_32>='\u0000' && LA14_32<='d')||(LA14_32>='f' && LA14_32<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA14_63 = input.LA(1);

                        s = -1;
                        if ( (LA14_63=='r') ) {s = 84;}

                        else if ( ((LA14_63>='\u0000' && LA14_63<='q')||(LA14_63>='s' && LA14_63<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA14_84 = input.LA(1);

                        s = -1;
                        if ( (LA14_84=='t') ) {s = 106;}

                        else if ( ((LA14_84>='\u0000' && LA14_84<='s')||(LA14_84>='u' && LA14_84<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA14_106 = input.LA(1);

                        s = -1;
                        if ( (LA14_106=='i') ) {s = 129;}

                        else if ( ((LA14_106>='\u0000' && LA14_106<='h')||(LA14_106>='j' && LA14_106<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA14_129 = input.LA(1);

                        s = -1;
                        if ( (LA14_129=='c') ) {s = 149;}

                        else if ( ((LA14_129>='\u0000' && LA14_129<='b')||(LA14_129>='d' && LA14_129<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA14_149 = input.LA(1);

                        s = -1;
                        if ( (LA14_149=='a') ) {s = 164;}

                        else if ( ((LA14_149>='\u0000' && LA14_149<='`')||(LA14_149>='b' && LA14_149<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA14_164 = input.LA(1);

                        s = -1;
                        if ( (LA14_164=='l') ) {s = 178;}

                        else if ( ((LA14_164>='\u0000' && LA14_164<='k')||(LA14_164>='m' && LA14_164<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA14_178 = input.LA(1);

                        s = -1;
                        if ( (LA14_178=='\"') ) {s = 188;}

                        else if ( ((LA14_178>='\u0000' && LA14_178<='!')||(LA14_178>='#' && LA14_178<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( (LA14_25=='i') ) {s = 55;}

                        else if ( (LA14_25=='a') ) {s = 56;}

                        else if ( ((LA14_25>='\u0000' && LA14_25<='`')||(LA14_25>='b' && LA14_25<='h')||(LA14_25>='j' && LA14_25<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( (LA14_33=='e') ) {s = 64;}

                        else if ( ((LA14_33>='\u0000' && LA14_33<='d')||(LA14_33>='f' && LA14_33<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA14_64 = input.LA(1);

                        s = -1;
                        if ( (LA14_64=='x') ) {s = 85;}

                        else if ( ((LA14_64>='\u0000' && LA14_64<='w')||(LA14_64>='y' && LA14_64<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( (LA14_85=='t') ) {s = 107;}

                        else if ( ((LA14_85>='\u0000' && LA14_85<='s')||(LA14_85>='u' && LA14_85<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA14_107 = input.LA(1);

                        s = -1;
                        if ( (LA14_107=='\"') ) {s = 130;}

                        else if ( ((LA14_107>='\u0000' && LA14_107<='!')||(LA14_107>='#' && LA14_107<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( (LA14_34=='h') ) {s = 65;}

                        else if ( ((LA14_34>='\u0000' && LA14_34<='g')||(LA14_34>='i' && LA14_34<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA14_65 = input.LA(1);

                        s = -1;
                        if ( (LA14_65=='e') ) {s = 86;}

                        else if ( ((LA14_65>='\u0000' && LA14_65<='d')||(LA14_65>='f' && LA14_65<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( (LA14_86=='c') ) {s = 108;}

                        else if ( ((LA14_86>='\u0000' && LA14_86<='b')||(LA14_86>='d' && LA14_86<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA14_108 = input.LA(1);

                        s = -1;
                        if ( (LA14_108=='k') ) {s = 131;}

                        else if ( ((LA14_108>='\u0000' && LA14_108<='j')||(LA14_108>='l' && LA14_108<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA14_131 = input.LA(1);

                        s = -1;
                        if ( (LA14_131=='b') ) {s = 150;}

                        else if ( ((LA14_131>='\u0000' && LA14_131<='a')||(LA14_131>='c' && LA14_131<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA14_150 = input.LA(1);

                        s = -1;
                        if ( (LA14_150=='o') ) {s = 165;}

                        else if ( ((LA14_150>='\u0000' && LA14_150<='n')||(LA14_150>='p' && LA14_150<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA14_165 = input.LA(1);

                        s = -1;
                        if ( (LA14_165=='x') ) {s = 179;}

                        else if ( ((LA14_165>='\u0000' && LA14_165<='w')||(LA14_165>='y' && LA14_165<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA14_179 = input.LA(1);

                        s = -1;
                        if ( (LA14_179=='\"') ) {s = 189;}

                        else if ( ((LA14_179>='\u0000' && LA14_179<='!')||(LA14_179>='#' && LA14_179<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA14_162 = input.LA(1);

                        s = -1;
                        if ( (LA14_162=='\"') ) {s = 176;}

                        else if ( ((LA14_162>='\u0000' && LA14_162<='!')||(LA14_162>='#' && LA14_162<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA14_102 = input.LA(1);

                        s = -1;
                        if ( (LA14_102=='\"') ) {s = 125;}

                        else if ( ((LA14_102>='\u0000' && LA14_102<='!')||(LA14_102>='#' && LA14_102<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( (LA14_27=='p') ) {s = 58;}

                        else if ( ((LA14_27>='\u0000' && LA14_27<='o')||(LA14_27>='q' && LA14_27<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA14_58 = input.LA(1);

                        s = -1;
                        if ( (LA14_58=='t') ) {s = 79;}

                        else if ( ((LA14_58>='\u0000' && LA14_58<='s')||(LA14_58>='u' && LA14_58<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA14_79 = input.LA(1);

                        s = -1;
                        if ( (LA14_79=='i') ) {s = 100;}

                        else if ( ((LA14_79>='\u0000' && LA14_79<='h')||(LA14_79>='j' && LA14_79<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA14_100 = input.LA(1);

                        s = -1;
                        if ( (LA14_100=='o') ) {s = 123;}

                        else if ( ((LA14_100>='\u0000' && LA14_100<='n')||(LA14_100>='p' && LA14_100<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA14_123 = input.LA(1);

                        s = -1;
                        if ( (LA14_123=='n') ) {s = 143;}

                        else if ( ((LA14_123>='\u0000' && LA14_123<='m')||(LA14_123>='o' && LA14_123<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA14_143 = input.LA(1);

                        s = -1;
                        if ( (LA14_143=='s') ) {s = 159;}

                        else if ( (LA14_143=='T') ) {s = 160;}

                        else if ( ((LA14_143>='\u0000' && LA14_143<='S')||(LA14_143>='U' && LA14_143<='r')||(LA14_143>='t' && LA14_143<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='e') ) {s = 57;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='d')||(LA14_26>='f' && LA14_26<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA14_57 = input.LA(1);

                        s = -1;
                        if ( (LA14_57=='l') ) {s = 77;}

                        else if ( (LA14_57=='a') ) {s = 78;}

                        else if ( ((LA14_57>='\u0000' && LA14_57<='`')||(LA14_57>='b' && LA14_57<='k')||(LA14_57>='m' && LA14_57<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA14_115 = input.LA(1);

                        s = -1;
                        if ( (LA14_115=='a') ) {s = 136;}

                        else if ( ((LA14_115>='\u0000' && LA14_115<='`')||(LA14_115>='b' && LA14_115<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA14_136 = input.LA(1);

                        s = -1;
                        if ( (LA14_136=='y') ) {s = 152;}

                        else if ( ((LA14_136>='\u0000' && LA14_136<='x')||(LA14_136>='z' && LA14_136<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA14_152 = input.LA(1);

                        s = -1;
                        if ( (LA14_152=='o') ) {s = 167;}

                        else if ( ((LA14_152>='\u0000' && LA14_152<='n')||(LA14_152>='p' && LA14_152<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA14_167 = input.LA(1);

                        s = -1;
                        if ( (LA14_167=='u') ) {s = 181;}

                        else if ( ((LA14_167>='\u0000' && LA14_167<='t')||(LA14_167>='v' && LA14_167<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( (LA14_28=='a') ) {s = 59;}

                        else if ( ((LA14_28>='\u0000' && LA14_28<='`')||(LA14_28>='b' && LA14_28<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA14_181 = input.LA(1);

                        s = -1;
                        if ( (LA14_181=='t') ) {s = 191;}

                        else if ( ((LA14_181>='\u0000' && LA14_181<='s')||(LA14_181>='u' && LA14_181<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA14_191 = input.LA(1);

                        s = -1;
                        if ( (LA14_191=='\"') ) {s = 199;}

                        else if ( ((LA14_191>='\u0000' && LA14_191<='!')||(LA14_191>='#' && LA14_191<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA14_59 = input.LA(1);

                        s = -1;
                        if ( (LA14_59=='t') ) {s = 80;}

                        else if ( ((LA14_59>='\u0000' && LA14_59<='s')||(LA14_59>='u' && LA14_59<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA14_80 = input.LA(1);

                        s = -1;
                        if ( (LA14_80=='a') ) {s = 101;}

                        else if ( (LA14_80=='e') ) {s = 102;}

                        else if ( ((LA14_80>='\u0000' && LA14_80<='`')||(LA14_80>='b' && LA14_80<='d')||(LA14_80>='f' && LA14_80<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( (LA14_30=='u') ) {s = 61;}

                        else if ( ((LA14_30>='\u0000' && LA14_30<='t')||(LA14_30>='v' && LA14_30<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA14_61 = input.LA(1);

                        s = -1;
                        if ( (LA14_61=='m') ) {s = 82;}

                        else if ( ((LA14_61>='\u0000' && LA14_61<='l')||(LA14_61>='n' && LA14_61<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( (LA14_82=='b') ) {s = 104;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<='a')||(LA14_82>='c' && LA14_82<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA14_104 = input.LA(1);

                        s = -1;
                        if ( (LA14_104=='e') ) {s = 127;}

                        else if ( ((LA14_104>='\u0000' && LA14_104<='d')||(LA14_104>='f' && LA14_104<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA14_116 = input.LA(1);

                        s = -1;
                        if ( (LA14_116=='n') ) {s = 137;}

                        else if ( ((LA14_116>='\u0000' && LA14_116<='m')||(LA14_116>='o' && LA14_116<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA14_127 = input.LA(1);

                        s = -1;
                        if ( (LA14_127=='r') ) {s = 147;}

                        else if ( ((LA14_127>='\u0000' && LA14_127<='q')||(LA14_127>='s' && LA14_127<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA14_137 = input.LA(1);

                        s = -1;
                        if ( (LA14_137=='p') ) {s = 153;}

                        else if ( ((LA14_137>='\u0000' && LA14_137<='o')||(LA14_137>='q' && LA14_137<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA14_147 = input.LA(1);

                        s = -1;
                        if ( (LA14_147=='\"') ) {s = 161;}

                        else if ( (LA14_147=='r') ) {s = 162;}

                        else if ( ((LA14_147>='\u0000' && LA14_147<='!')||(LA14_147>='#' && LA14_147<='q')||(LA14_147>='s' && LA14_147<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA14_153 = input.LA(1);

                        s = -1;
                        if ( (LA14_153=='u') ) {s = 168;}

                        else if ( ((LA14_153>='\u0000' && LA14_153<='t')||(LA14_153>='v' && LA14_153<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA14_168 = input.LA(1);

                        s = -1;
                        if ( (LA14_168=='t') ) {s = 182;}

                        else if ( ((LA14_168>='\u0000' && LA14_168<='s')||(LA14_168>='u' && LA14_168<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA14_182 = input.LA(1);

                        s = -1;
                        if ( (LA14_182=='s') ) {s = 192;}

                        else if ( ((LA14_182>='\u0000' && LA14_182<='r')||(LA14_182>='t' && LA14_182<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA14_192 = input.LA(1);

                        s = -1;
                        if ( (LA14_192=='\"') ) {s = 200;}

                        else if ( ((LA14_192>='\u0000' && LA14_192<='!')||(LA14_192>='#' && LA14_192<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='{') ) {s = 1;}

                        else if ( (LA14_0=='\"') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0=='[') ) {s = 4;}

                        else if ( (LA14_0==']') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0==':') ) {s = 7;}

                        else if ( (LA14_0=='n') ) {s = 8;}

                        else if ( (LA14_0=='t') ) {s = 9;}

                        else if ( (LA14_0=='G') ) {s = 10;}

                        else if ( (LA14_0=='g') ) {s = 11;}

                        else if ( (LA14_0=='l') ) {s = 12;}

                        else if ( (LA14_0=='v') ) {s = 13;}

                        else if ( (LA14_0=='^') ) {s = 14;}

                        else if ( ((LA14_0>='A' && LA14_0<='F')||(LA14_0>='H' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='f')||(LA14_0>='h' && LA14_0<='k')||LA14_0=='m'||(LA14_0>='o' && LA14_0<='s')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='\'') ) {s = 17;}

                        else if ( (LA14_0=='/') ) {s = 18;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 19;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=';' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}