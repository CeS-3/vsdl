package it.csec.xtext.parser.antlr.internal;

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
import it.csec.xtext.services.VsdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVsdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'duration'", "'{'", "'}'", "'node'", "';'", "'['", "']'", "'->'", "'and'", "'or'", "'not'", "'('", "')'", "'cpu'", "'speed'", "'equal'", "'to'", "'faster'", "'than'", "'slower'", "'of'", "'disk'", "'size'", "'larger'", "'smaller'", "'ram'", "'flavour'", "'ip'", "'address'", "'in'", "'range'", "'is'", "'connected'", "'gateway'", "'DNS'", "'OS'", "'family'", "'mounts'", "'software'", "'version'", "'with'", "','", "'config'", "'.'", "'='", "'network'", "'addresses'", "'has'", "'direct'", "'access'", "'the'", "'Internet'", "'IP'", "'at'", "'least'", "'after'", "'most'", "'before'", "'switch'", "'+'", "'-'", "'*'", "'MHz'", "'GHz'", "'THz'", "'MB'", "'GB'", "'TB'", "'/'", "'WindowsXP'", "'Windows7'", "'Windows8'", "'Windows10'", "'Ubuntu14'", "'Ubuntu16'", "'Android-21'", "'Android-19'", "'Microsoft'", "'Linux'", "'OSx'", "'iOS'", "'Android'", "'tiny'", "'medium'", "'large'", "'mobile'", "'wearable'", "'sensor'", "'server'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalVsdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVsdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVsdlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVsdl.g"; }



     	private VsdlGrammarAccess grammarAccess;

        public InternalVsdlParser(TokenStream input, VsdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VsdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVsdl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVsdl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalVsdl.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVsdl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )? otherlv_4= '{' ( (lv_Elements_5_0= ruleScenElem ) )* otherlv_6= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_TimeToUse_3_0 = null;

        EObject lv_Elements_5_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:78:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )? otherlv_4= '{' ( (lv_Elements_5_0= ruleScenElem ) )* otherlv_6= '}' ) )
            // InternalVsdl.g:79:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )? otherlv_4= '{' ( (lv_Elements_5_0= ruleScenElem ) )* otherlv_6= '}' )
            {
            // InternalVsdl.g:79:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )? otherlv_4= '{' ( (lv_Elements_5_0= ruleScenElem ) )* otherlv_6= '}' )
            // InternalVsdl.g:80:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )? otherlv_4= '{' ( (lv_Elements_5_0= ruleScenElem ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getScenarioKeyword_0());
              		
            }
            // InternalVsdl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVsdl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVsdl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalVsdl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalVsdl.g:102:3: (otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVsdl.g:103:4: otherlv_2= 'duration' ( (lv_TimeToUse_3_0= ruleTimeInterval ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDurationKeyword_2_0());
                      			
                    }
                    // InternalVsdl.g:107:4: ( (lv_TimeToUse_3_0= ruleTimeInterval ) )
                    // InternalVsdl.g:108:5: (lv_TimeToUse_3_0= ruleTimeInterval )
                    {
                    // InternalVsdl.g:108:5: (lv_TimeToUse_3_0= ruleTimeInterval )
                    // InternalVsdl.g:109:6: lv_TimeToUse_3_0= ruleTimeInterval
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelAccess().getTimeToUseTimeIntervalParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_TimeToUse_3_0=ruleTimeInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelRule());
                      						}
                      						set(
                      							current,
                      							"TimeToUse",
                      							lv_TimeToUse_3_0,
                      							"it.csec.xtext.Vsdl.TimeInterval");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalVsdl.g:131:3: ( (lv_Elements_5_0= ruleScenElem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVsdl.g:132:4: (lv_Elements_5_0= ruleScenElem )
            	    {
            	    // InternalVsdl.g:132:4: (lv_Elements_5_0= ruleScenElem )
            	    // InternalVsdl.g:133:5: lv_Elements_5_0= ruleScenElem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getElementsScenElemParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_Elements_5_0=ruleScenElem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Elements",
            	      						lv_Elements_5_0,
            	      						"it.csec.xtext.Vsdl.ScenElem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenElem"
    // InternalVsdl.g:158:1: entryRuleScenElem returns [EObject current=null] : iv_ruleScenElem= ruleScenElem EOF ;
    public final EObject entryRuleScenElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenElem = null;


        try {
            // InternalVsdl.g:158:49: (iv_ruleScenElem= ruleScenElem EOF )
            // InternalVsdl.g:159:2: iv_ruleScenElem= ruleScenElem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenElemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScenElem=ruleScenElem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenElem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenElem"


    // $ANTLR start "ruleScenElem"
    // InternalVsdl.g:165:1: ruleScenElem returns [EObject current=null] : (this_Node_0= ruleNode | this_Network_1= ruleNetwork ) ;
    public final EObject ruleScenElem() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Network_1 = null;



        	enterRule();

        try {
            // InternalVsdl.g:171:2: ( (this_Node_0= ruleNode | this_Network_1= ruleNetwork ) )
            // InternalVsdl.g:172:2: (this_Node_0= ruleNode | this_Network_1= ruleNetwork )
            {
            // InternalVsdl.g:172:2: (this_Node_0= ruleNode | this_Network_1= ruleNetwork )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==57) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVsdl.g:173:3: this_Node_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScenElemAccess().getNodeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Node_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:182:3: this_Network_1= ruleNetwork
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScenElemAccess().getNetworkParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Network_1=ruleNetwork();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Network_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScenElem"


    // $ANTLR start "entryRuleNode"
    // InternalVsdl.g:194:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalVsdl.g:194:45: (iv_ruleNode= ruleNode EOF )
            // InternalVsdl.g:195:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalVsdl.g:201:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNodeConstraint ) )* otherlv_4= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:207:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNodeConstraint ) )* otherlv_4= '}' ) )
            // InternalVsdl.g:208:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNodeConstraint ) )* otherlv_4= '}' )
            {
            // InternalVsdl.g:208:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNodeConstraint ) )* otherlv_4= '}' )
            // InternalVsdl.g:209:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNodeConstraint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
              		
            }
            // InternalVsdl.g:213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVsdl.g:214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVsdl.g:214:4: (lv_name_1_0= RULE_ID )
            // InternalVsdl.g:215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalVsdl.g:235:3: ( (lv_constraints_3_0= ruleNodeConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==15||LA4_0==17||(LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==33||(LA4_0>=37 && LA4_0<=38)||LA4_0==45||LA4_0==49) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVsdl.g:236:4: (lv_constraints_3_0= ruleNodeConstraint )
            	    {
            	    // InternalVsdl.g:236:4: (lv_constraints_3_0= ruleNodeConstraint )
            	    // InternalVsdl.g:237:5: lv_constraints_3_0= ruleNodeConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNodeAccess().getConstraintsNodeConstraintParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_constraints_3_0=ruleNodeConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNodeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_3_0,
            	      						"it.csec.xtext.Vsdl.NodeConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeConstraint"
    // InternalVsdl.g:262:1: entryRuleNodeConstraint returns [EObject current=null] : iv_ruleNodeConstraint= ruleNodeConstraint EOF ;
    public final EObject entryRuleNodeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeConstraint = null;


        try {
            // InternalVsdl.g:262:55: (iv_ruleNodeConstraint= ruleNodeConstraint EOF )
            // InternalVsdl.g:263:2: iv_ruleNodeConstraint= ruleNodeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeConstraint=ruleNodeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeConstraint"


    // $ANTLR start "ruleNodeConstraint"
    // InternalVsdl.g:269:1: ruleNodeConstraint returns [EObject current=null] : ( (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' ) | (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' ) ) ;
    public final EObject ruleNodeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_GuardedNodeConstraint_0 = null;

        EObject this_SimpleNodeConstraint_2 = null;



        	enterRule();

        try {
            // InternalVsdl.g:275:2: ( ( (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' ) | (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' ) ) )
            // InternalVsdl.g:276:2: ( (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' ) | (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' ) )
            {
            // InternalVsdl.g:276:2: ( (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' ) | (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==15||(LA5_0>=22 && LA5_0<=23)||LA5_0==25||LA5_0==33||(LA5_0>=37 && LA5_0<=38)||LA5_0==45||LA5_0==49) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVsdl.g:277:3: (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' )
                    {
                    // InternalVsdl.g:277:3: (this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';' )
                    // InternalVsdl.g:278:4: this_GuardedNodeConstraint_0= ruleGuardedNodeConstraint otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNodeConstraintAccess().getGuardedNodeConstraintParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_GuardedNodeConstraint_0=ruleGuardedNodeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GuardedNodeConstraint_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNodeConstraintAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:292:3: (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' )
                    {
                    // InternalVsdl.g:292:3: (this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';' )
                    // InternalVsdl.g:293:4: this_SimpleNodeConstraint_2= ruleSimpleNodeConstraint otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNodeConstraintAccess().getSimpleNodeConstraintParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_SimpleNodeConstraint_2=ruleSimpleNodeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleNodeConstraint_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNodeConstraintAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeConstraint"


    // $ANTLR start "entryRuleGuardedNodeConstraint"
    // InternalVsdl.g:310:1: entryRuleGuardedNodeConstraint returns [EObject current=null] : iv_ruleGuardedNodeConstraint= ruleGuardedNodeConstraint EOF ;
    public final EObject entryRuleGuardedNodeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedNodeConstraint = null;


        try {
            // InternalVsdl.g:310:62: (iv_ruleGuardedNodeConstraint= ruleGuardedNodeConstraint EOF )
            // InternalVsdl.g:311:2: iv_ruleGuardedNodeConstraint= ruleGuardedNodeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardedNodeConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGuardedNodeConstraint=ruleGuardedNodeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuardedNodeConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGuardedNodeConstraint"


    // $ANTLR start "ruleGuardedNodeConstraint"
    // InternalVsdl.g:317:1: ruleGuardedNodeConstraint returns [EObject current=null] : (otherlv_0= '[' ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) ) ) ;
    public final EObject ruleGuardedNodeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_triggerconstraint_1_0 = null;

        EObject lv_nodeconstraint_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:323:2: ( (otherlv_0= '[' ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) ) ) )
            // InternalVsdl.g:324:2: (otherlv_0= '[' ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) ) )
            {
            // InternalVsdl.g:324:2: (otherlv_0= '[' ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) ) )
            // InternalVsdl.g:325:3: otherlv_0= '[' ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuardedNodeConstraintAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalVsdl.g:329:3: ( (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint ) )
            // InternalVsdl.g:330:4: (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint )
            {
            // InternalVsdl.g:330:4: (lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint )
            // InternalVsdl.g:331:5: lv_triggerconstraint_1_0= ruleUpdateTriggerConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuardedNodeConstraintAccess().getTriggerconstraintUpdateTriggerConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_triggerconstraint_1_0=ruleUpdateTriggerConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuardedNodeConstraintRule());
              					}
              					set(
              						current,
              						"triggerconstraint",
              						lv_triggerconstraint_1_0,
              						"it.csec.xtext.Vsdl.UpdateTriggerConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGuardedNodeConstraintAccess().getRightSquareBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuardedNodeConstraintAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVsdl.g:356:3: ( (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint ) )
            // InternalVsdl.g:357:4: (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint )
            {
            // InternalVsdl.g:357:4: (lv_nodeconstraint_4_0= ruleSimpleNodeConstraint )
            // InternalVsdl.g:358:5: lv_nodeconstraint_4_0= ruleSimpleNodeConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuardedNodeConstraintAccess().getNodeconstraintSimpleNodeConstraintParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_nodeconstraint_4_0=ruleSimpleNodeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuardedNodeConstraintRule());
              					}
              					set(
              						current,
              						"nodeconstraint",
              						lv_nodeconstraint_4_0,
              						"it.csec.xtext.Vsdl.SimpleNodeConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGuardedNodeConstraint"


    // $ANTLR start "entryRuleSimpleNodeConstraint"
    // InternalVsdl.g:379:1: entryRuleSimpleNodeConstraint returns [EObject current=null] : iv_ruleSimpleNodeConstraint= ruleSimpleNodeConstraint EOF ;
    public final EObject entryRuleSimpleNodeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNodeConstraint = null;


        try {
            // InternalVsdl.g:379:61: (iv_ruleSimpleNodeConstraint= ruleSimpleNodeConstraint EOF )
            // InternalVsdl.g:380:2: iv_ruleSimpleNodeConstraint= ruleSimpleNodeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNodeConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNodeConstraint=ruleSimpleNodeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNodeConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNodeConstraint"


    // $ANTLR start "ruleSimpleNodeConstraint"
    // InternalVsdl.g:386:1: ruleSimpleNodeConstraint returns [EObject current=null] : this_SimpleNodeConstraintAndOr_0= ruleSimpleNodeConstraintAndOr ;
    public final EObject ruleSimpleNodeConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleNodeConstraintAndOr_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:392:2: (this_SimpleNodeConstraintAndOr_0= ruleSimpleNodeConstraintAndOr )
            // InternalVsdl.g:393:2: this_SimpleNodeConstraintAndOr_0= ruleSimpleNodeConstraintAndOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSimpleNodeConstraintAccess().getSimpleNodeConstraintAndOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleNodeConstraintAndOr_0=ruleSimpleNodeConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SimpleNodeConstraintAndOr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNodeConstraint"


    // $ANTLR start "entryRuleSimpleNodeConstraintAndOr"
    // InternalVsdl.g:404:1: entryRuleSimpleNodeConstraintAndOr returns [EObject current=null] : iv_ruleSimpleNodeConstraintAndOr= ruleSimpleNodeConstraintAndOr EOF ;
    public final EObject entryRuleSimpleNodeConstraintAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNodeConstraintAndOr = null;


        try {
            // InternalVsdl.g:404:66: (iv_ruleSimpleNodeConstraintAndOr= ruleSimpleNodeConstraintAndOr EOF )
            // InternalVsdl.g:405:2: iv_ruleSimpleNodeConstraintAndOr= ruleSimpleNodeConstraintAndOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNodeConstraintAndOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNodeConstraintAndOr=ruleSimpleNodeConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNodeConstraintAndOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNodeConstraintAndOr"


    // $ANTLR start "ruleSimpleNodeConstraintAndOr"
    // InternalVsdl.g:411:1: ruleSimpleNodeConstraintAndOr returns [EObject current=null] : (this_SimpleNodeConstraintNot_0= ruleSimpleNodeConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )* ) ;
    public final EObject ruleSimpleNodeConstraintAndOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SimpleNodeConstraintNot_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:417:2: ( (this_SimpleNodeConstraintNot_0= ruleSimpleNodeConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )* ) )
            // InternalVsdl.g:418:2: (this_SimpleNodeConstraintNot_0= ruleSimpleNodeConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )* )
            {
            // InternalVsdl.g:418:2: (this_SimpleNodeConstraintNot_0= ruleSimpleNodeConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )* )
            // InternalVsdl.g:419:3: this_SimpleNodeConstraintNot_0= ruleSimpleNodeConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleNodeConstraintAndOrAccess().getSimpleNodeConstraintNotParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_SimpleNodeConstraintNot_0=ruleSimpleNodeConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleNodeConstraintNot_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:427:3: ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVsdl.g:428:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) )
            	    {
            	    // InternalVsdl.g:428:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) )
            	    // InternalVsdl.g:429:5: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    {
            	    // InternalVsdl.g:429:5: ()
            	    // InternalVsdl.g:430:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSimpleNodeConstraintAndOrAccess().getAndOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:436:5: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // InternalVsdl.g:437:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // InternalVsdl.g:437:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // InternalVsdl.g:438:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // InternalVsdl.g:438:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==21) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalVsdl.g:439:8: lv_op_2_1= 'and'
            	            {
            	            lv_op_2_1=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getSimpleNodeConstraintAndOrAccess().getOpAndKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimpleNodeConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVsdl.g:450:8: lv_op_2_2= 'or'
            	            {
            	            lv_op_2_2=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getSimpleNodeConstraintAndOrAccess().getOpOrKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimpleNodeConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalVsdl.g:464:4: ( (lv_right_3_0= ruleSimpleNodeConstraintNot ) )
            	    // InternalVsdl.g:465:5: (lv_right_3_0= ruleSimpleNodeConstraintNot )
            	    {
            	    // InternalVsdl.g:465:5: (lv_right_3_0= ruleSimpleNodeConstraintNot )
            	    // InternalVsdl.g:466:6: lv_right_3_0= ruleSimpleNodeConstraintNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimpleNodeConstraintAndOrAccess().getRightSimpleNodeConstraintNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleSimpleNodeConstraintNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimpleNodeConstraintAndOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.csec.xtext.Vsdl.SimpleNodeConstraintNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNodeConstraintAndOr"


    // $ANTLR start "entryRuleSimpleNodeConstraintNot"
    // InternalVsdl.g:488:1: entryRuleSimpleNodeConstraintNot returns [EObject current=null] : iv_ruleSimpleNodeConstraintNot= ruleSimpleNodeConstraintNot EOF ;
    public final EObject entryRuleSimpleNodeConstraintNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNodeConstraintNot = null;


        try {
            // InternalVsdl.g:488:64: (iv_ruleSimpleNodeConstraintNot= ruleSimpleNodeConstraintNot EOF )
            // InternalVsdl.g:489:2: iv_ruleSimpleNodeConstraintNot= ruleSimpleNodeConstraintNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNodeConstraintNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNodeConstraintNot=ruleSimpleNodeConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNodeConstraintNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNodeConstraintNot"


    // $ANTLR start "ruleSimpleNodeConstraintNot"
    // InternalVsdl.g:495:1: ruleSimpleNodeConstraintNot returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) ) | this_SimpleNodeConstraintA_3= ruleSimpleNodeConstraintA ) ;
    public final EObject ruleSimpleNodeConstraintNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraint_2_0 = null;

        EObject this_SimpleNodeConstraintA_3 = null;



        	enterRule();

        try {
            // InternalVsdl.g:501:2: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) ) | this_SimpleNodeConstraintA_3= ruleSimpleNodeConstraintA ) )
            // InternalVsdl.g:502:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) ) | this_SimpleNodeConstraintA_3= ruleSimpleNodeConstraintA )
            {
            // InternalVsdl.g:502:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) ) | this_SimpleNodeConstraintA_3= ruleSimpleNodeConstraintA )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==15||LA8_0==23||LA8_0==25||LA8_0==33||(LA8_0>=37 && LA8_0<=38)||LA8_0==45||LA8_0==49) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVsdl.g:503:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) )
                    {
                    // InternalVsdl.g:503:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) ) )
                    // InternalVsdl.g:504:4: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) )
                    {
                    // InternalVsdl.g:504:4: ()
                    // InternalVsdl.g:505:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleNodeConstraintNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:511:4: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalVsdl.g:512:5: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSimpleNodeConstraintNotAccess().getNotKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:518:4: ( (lv_constraint_2_0= ruleSimpleNodeConstraintA ) )
                    // InternalVsdl.g:519:5: (lv_constraint_2_0= ruleSimpleNodeConstraintA )
                    {
                    // InternalVsdl.g:519:5: (lv_constraint_2_0= ruleSimpleNodeConstraintA )
                    // InternalVsdl.g:520:6: lv_constraint_2_0= ruleSimpleNodeConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimpleNodeConstraintNotAccess().getConstraintSimpleNodeConstraintAParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleSimpleNodeConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimpleNodeConstraintNotRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_2_0,
                      							"it.csec.xtext.Vsdl.SimpleNodeConstraintA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:539:3: this_SimpleNodeConstraintA_3= ruleSimpleNodeConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNodeConstraintNotAccess().getSimpleNodeConstraintAParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleNodeConstraintA_3=ruleSimpleNodeConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleNodeConstraintA_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNodeConstraintNot"


    // $ANTLR start "entryRuleSimpleNodeConstraintA"
    // InternalVsdl.g:551:1: entryRuleSimpleNodeConstraintA returns [EObject current=null] : iv_ruleSimpleNodeConstraintA= ruleSimpleNodeConstraintA EOF ;
    public final EObject entryRuleSimpleNodeConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNodeConstraintA = null;


        try {
            // InternalVsdl.g:551:62: (iv_ruleSimpleNodeConstraintA= ruleSimpleNodeConstraintA EOF )
            // InternalVsdl.g:552:2: iv_ruleSimpleNodeConstraintA= ruleSimpleNodeConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNodeConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNodeConstraintA=ruleSimpleNodeConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNodeConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNodeConstraintA"


    // $ANTLR start "ruleSimpleNodeConstraintA"
    // InternalVsdl.g:558:1: ruleSimpleNodeConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA | this_NodeNetworkConstraintA_5= ruleNodeNetworkConstraintA ) ;
    public final EObject ruleSimpleNodeConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SimpleNodeConstraint_1 = null;

        EObject this_NodeHardwareConstraintA_3 = null;

        EObject this_NodeSoftwareConstraintA_4 = null;

        EObject this_NodeNetworkConstraintA_5 = null;



        	enterRule();

        try {
            // InternalVsdl.g:564:2: ( ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA | this_NodeNetworkConstraintA_5= ruleNodeNetworkConstraintA ) )
            // InternalVsdl.g:565:2: ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA | this_NodeNetworkConstraintA_5= ruleNodeNetworkConstraintA )
            {
            // InternalVsdl.g:565:2: ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA | this_NodeNetworkConstraintA_5= ruleNodeNetworkConstraintA )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 25:
            case 33:
            case 37:
            case 38:
                {
                alt9=2;
                }
                break;
            case 15:
            case 49:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
            case 45:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVsdl.g:566:3: (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' )
                    {
                    // InternalVsdl.g:566:3: (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' )
                    // InternalVsdl.g:567:4: otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSimpleNodeConstraintAAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleNodeConstraintAAccess().getSimpleNodeConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_SimpleNodeConstraint_1=ruleSimpleNodeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleNodeConstraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSimpleNodeConstraintAAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:585:3: this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNodeConstraintAAccess().getNodeHardwareConstraintAParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NodeHardwareConstraintA_3=ruleNodeHardwareConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NodeHardwareConstraintA_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:594:3: this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNodeConstraintAAccess().getNodeSoftwareConstraintAParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NodeSoftwareConstraintA_4=ruleNodeSoftwareConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NodeSoftwareConstraintA_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVsdl.g:603:3: this_NodeNetworkConstraintA_5= ruleNodeNetworkConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNodeConstraintAAccess().getNodeNetworkConstraintAParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NodeNetworkConstraintA_5=ruleNodeNetworkConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NodeNetworkConstraintA_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNodeConstraintA"


    // $ANTLR start "entryRuleNodeHardwareConstraintA"
    // InternalVsdl.g:615:1: entryRuleNodeHardwareConstraintA returns [EObject current=null] : iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF ;
    public final EObject entryRuleNodeHardwareConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeHardwareConstraintA = null;


        try {
            // InternalVsdl.g:615:64: (iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF )
            // InternalVsdl.g:616:2: iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeHardwareConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeHardwareConstraintA=ruleNodeHardwareConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeHardwareConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeHardwareConstraintA"


    // $ANTLR start "ruleNodeHardwareConstraintA"
    // InternalVsdl.g:622:1: ruleNodeHardwareConstraintA returns [EObject current=null] : ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) ) ;
    public final EObject ruleNodeHardwareConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_op_8_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token lv_op_13_0=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_sameas_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_op_24_0=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token lv_op_29_0=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token lv_op_34_0=null;
        Token otherlv_35=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_sameas_40_0=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token lv_op_45_0=null;
        Token otherlv_46=null;
        Token otherlv_49=null;
        Token lv_op_50_0=null;
        Token otherlv_51=null;
        Token otherlv_54=null;
        Token lv_op_55_0=null;
        Token otherlv_56=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token lv_sameas_61_0=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_value_15_0 = null;

        EObject lv_value_26_0 = null;

        EObject lv_value_31_0 = null;

        EObject lv_value_36_0 = null;

        EObject lv_value_47_0 = null;

        EObject lv_value_52_0 = null;

        EObject lv_value_57_0 = null;

        Enumerator lv_profile_65_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:628:2: ( ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) ) )
            // InternalVsdl.g:629:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )
            {
            // InternalVsdl.g:629:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )
            int alt10=13;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalVsdl.g:630:3: ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:630:3: ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:631:4: () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:631:4: ()
                    // InternalVsdl.g:632:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:638:4: ( ( 'cpu' )=>otherlv_1= 'cpu' )
                    // InternalVsdl.g:639:5: ( 'cpu' )=>otherlv_1= 'cpu'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_0_1());
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNodeHardwareConstraintAAccess().getSpeedKeyword_0_2());
                      			
                    }
                    // InternalVsdl.g:649:4: ( (lv_op_3_0= 'equal' ) )
                    // InternalVsdl.g:650:5: (lv_op_3_0= 'equal' )
                    {
                    // InternalVsdl.g:650:5: (lv_op_3_0= 'equal' )
                    // InternalVsdl.g:651:6: lv_op_3_0= 'equal'
                    {
                    lv_op_3_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_3_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpEqualKeyword_0_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_3_0, "equal");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNodeHardwareConstraintAAccess().getToKeyword_0_4());
                      			
                    }
                    // InternalVsdl.g:667:4: ( (lv_value_5_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:668:5: (lv_value_5_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:668:5: (lv_value_5_0= ruleCPUFrequency )
                    // InternalVsdl.g:669:6: lv_value_5_0= ruleCPUFrequency
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueCPUFrequencyParserRuleCall_0_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleCPUFrequency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"it.csec.xtext.Vsdl.CPUFrequency");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:688:3: ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:688:3: ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:689:4: () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:689:4: ()
                    // InternalVsdl.g:690:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:696:4: ( ( 'cpu' )=>otherlv_7= 'cpu' )
                    // InternalVsdl.g:697:5: ( 'cpu' )=>otherlv_7= 'cpu'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_1_1());
                      				
                    }

                    }

                    // InternalVsdl.g:703:4: ( (lv_op_8_0= 'faster' ) )
                    // InternalVsdl.g:704:5: (lv_op_8_0= 'faster' )
                    {
                    // InternalVsdl.g:704:5: (lv_op_8_0= 'faster' )
                    // InternalVsdl.g:705:6: lv_op_8_0= 'faster'
                    {
                    lv_op_8_0=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_8_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpFasterKeyword_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_8_0, "faster");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_1_3());
                      			
                    }
                    // InternalVsdl.g:721:4: ( (lv_value_10_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:722:5: (lv_value_10_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:722:5: (lv_value_10_0= ruleCPUFrequency )
                    // InternalVsdl.g:723:6: lv_value_10_0= ruleCPUFrequency
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueCPUFrequencyParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=ruleCPUFrequency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_10_0,
                      							"it.csec.xtext.Vsdl.CPUFrequency");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:742:3: ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:742:3: ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:743:4: () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:743:4: ()
                    // InternalVsdl.g:744:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:750:4: ( ( 'cpu' )=>otherlv_12= 'cpu' )
                    // InternalVsdl.g:751:5: ( 'cpu' )=>otherlv_12= 'cpu'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_2_1());
                      				
                    }

                    }

                    // InternalVsdl.g:757:4: ( (lv_op_13_0= 'slower' ) )
                    // InternalVsdl.g:758:5: (lv_op_13_0= 'slower' )
                    {
                    // InternalVsdl.g:758:5: (lv_op_13_0= 'slower' )
                    // InternalVsdl.g:759:6: lv_op_13_0= 'slower'
                    {
                    lv_op_13_0=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_13_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpSlowerKeyword_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_13_0, "slower");
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_2_3());
                      			
                    }
                    // InternalVsdl.g:775:4: ( (lv_value_15_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:776:5: (lv_value_15_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:776:5: (lv_value_15_0= ruleCPUFrequency )
                    // InternalVsdl.g:777:6: lv_value_15_0= ruleCPUFrequency
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueCPUFrequencyParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_15_0=ruleCPUFrequency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_15_0,
                      							"it.csec.xtext.Vsdl.CPUFrequency");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVsdl.g:796:3: ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:796:3: ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) )
                    // InternalVsdl.g:797:4: () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) )
                    {
                    // InternalVsdl.g:797:4: ()
                    // InternalVsdl.g:798:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:804:4: ( ( 'cpu' )=>otherlv_17= 'cpu' )
                    // InternalVsdl.g:805:5: ( 'cpu' )=>otherlv_17= 'cpu'
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_3_1());
                      				
                    }

                    }

                    otherlv_18=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getNodeHardwareConstraintAAccess().getSpeedKeyword_3_2());
                      			
                    }
                    // InternalVsdl.g:815:4: ( (lv_sameas_19_0= 'of' ) )
                    // InternalVsdl.g:816:5: (lv_sameas_19_0= 'of' )
                    {
                    // InternalVsdl.g:816:5: (lv_sameas_19_0= 'of' )
                    // InternalVsdl.g:817:6: lv_sameas_19_0= 'of'
                    {
                    lv_sameas_19_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sameas_19_0, grammarAccess.getNodeHardwareConstraintAAccess().getSameasOfKeyword_3_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "sameas", lv_sameas_19_0 != null, "of");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:829:4: ( (otherlv_20= RULE_ID ) )
                    // InternalVsdl.g:830:5: (otherlv_20= RULE_ID )
                    {
                    // InternalVsdl.g:830:5: (otherlv_20= RULE_ID )
                    // InternalVsdl.g:831:6: otherlv_20= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      					
                    }
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getNodeHardwareConstraintAAccess().getIdNodeCrossReference_3_4_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVsdl.g:844:3: ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:844:3: ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:845:4: () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:845:4: ()
                    // InternalVsdl.g:846:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:852:4: ( ( 'disk' )=>otherlv_22= 'disk' )
                    // InternalVsdl.g:853:5: ( 'disk' )=>otherlv_22= 'disk'
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_22, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_4_1());
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getNodeHardwareConstraintAAccess().getSizeKeyword_4_2());
                      			
                    }
                    // InternalVsdl.g:863:4: ( (lv_op_24_0= 'equal' ) )
                    // InternalVsdl.g:864:5: (lv_op_24_0= 'equal' )
                    {
                    // InternalVsdl.g:864:5: (lv_op_24_0= 'equal' )
                    // InternalVsdl.g:865:6: lv_op_24_0= 'equal'
                    {
                    lv_op_24_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_24_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpEqualKeyword_4_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_24_0, "equal");
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getNodeHardwareConstraintAAccess().getToKeyword_4_4());
                      			
                    }
                    // InternalVsdl.g:881:4: ( (lv_value_26_0= ruleDiskSize ) )
                    // InternalVsdl.g:882:5: (lv_value_26_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:882:5: (lv_value_26_0= ruleDiskSize )
                    // InternalVsdl.g:883:6: lv_value_26_0= ruleDiskSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueDiskSizeParserRuleCall_4_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_26_0=ruleDiskSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_26_0,
                      							"it.csec.xtext.Vsdl.DiskSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalVsdl.g:902:3: ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:902:3: ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:903:4: () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:903:4: ()
                    // InternalVsdl.g:904:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:910:4: ( ( 'disk' )=>otherlv_28= 'disk' )
                    // InternalVsdl.g:911:5: ( 'disk' )=>otherlv_28= 'disk'
                    {
                    otherlv_28=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_5_1());
                      				
                    }

                    }

                    // InternalVsdl.g:917:4: ( (lv_op_29_0= 'larger' ) )
                    // InternalVsdl.g:918:5: (lv_op_29_0= 'larger' )
                    {
                    // InternalVsdl.g:918:5: (lv_op_29_0= 'larger' )
                    // InternalVsdl.g:919:6: lv_op_29_0= 'larger'
                    {
                    lv_op_29_0=(Token)match(input,35,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_29_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpLargerKeyword_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_29_0, "larger");
                      					
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_5_3());
                      			
                    }
                    // InternalVsdl.g:935:4: ( (lv_value_31_0= ruleDiskSize ) )
                    // InternalVsdl.g:936:5: (lv_value_31_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:936:5: (lv_value_31_0= ruleDiskSize )
                    // InternalVsdl.g:937:6: lv_value_31_0= ruleDiskSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueDiskSizeParserRuleCall_5_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_31_0=ruleDiskSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_31_0,
                      							"it.csec.xtext.Vsdl.DiskSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalVsdl.g:956:3: ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:956:3: ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:957:4: () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:957:4: ()
                    // InternalVsdl.g:958:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:964:4: ( ( 'disk' )=>otherlv_33= 'disk' )
                    // InternalVsdl.g:965:5: ( 'disk' )=>otherlv_33= 'disk'
                    {
                    otherlv_33=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_33, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_6_1());
                      				
                    }

                    }

                    // InternalVsdl.g:971:4: ( (lv_op_34_0= 'smaller' ) )
                    // InternalVsdl.g:972:5: (lv_op_34_0= 'smaller' )
                    {
                    // InternalVsdl.g:972:5: (lv_op_34_0= 'smaller' )
                    // InternalVsdl.g:973:6: lv_op_34_0= 'smaller'
                    {
                    lv_op_34_0=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_34_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpSmallerKeyword_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_34_0, "smaller");
                      					
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_6_3());
                      			
                    }
                    // InternalVsdl.g:989:4: ( (lv_value_36_0= ruleDiskSize ) )
                    // InternalVsdl.g:990:5: (lv_value_36_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:990:5: (lv_value_36_0= ruleDiskSize )
                    // InternalVsdl.g:991:6: lv_value_36_0= ruleDiskSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueDiskSizeParserRuleCall_6_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_36_0=ruleDiskSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_36_0,
                      							"it.csec.xtext.Vsdl.DiskSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalVsdl.g:1010:3: ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:1010:3: ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) )
                    // InternalVsdl.g:1011:4: () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) )
                    {
                    // InternalVsdl.g:1011:4: ()
                    // InternalVsdl.g:1012:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1018:4: ( ( 'disk' )=>otherlv_38= 'disk' )
                    // InternalVsdl.g:1019:5: ( 'disk' )=>otherlv_38= 'disk'
                    {
                    otherlv_38=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_38, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_7_1());
                      				
                    }

                    }

                    otherlv_39=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getNodeHardwareConstraintAAccess().getSizeKeyword_7_2());
                      			
                    }
                    // InternalVsdl.g:1029:4: ( (lv_sameas_40_0= 'of' ) )
                    // InternalVsdl.g:1030:5: (lv_sameas_40_0= 'of' )
                    {
                    // InternalVsdl.g:1030:5: (lv_sameas_40_0= 'of' )
                    // InternalVsdl.g:1031:6: lv_sameas_40_0= 'of'
                    {
                    lv_sameas_40_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sameas_40_0, grammarAccess.getNodeHardwareConstraintAAccess().getSameasOfKeyword_7_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "sameas", lv_sameas_40_0 != null, "of");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:1043:4: ( (otherlv_41= RULE_ID ) )
                    // InternalVsdl.g:1044:5: (otherlv_41= RULE_ID )
                    {
                    // InternalVsdl.g:1044:5: (otherlv_41= RULE_ID )
                    // InternalVsdl.g:1045:6: otherlv_41= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      					
                    }
                    otherlv_41=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_41, grammarAccess.getNodeHardwareConstraintAAccess().getIdNodeCrossReference_7_4_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalVsdl.g:1058:3: ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1058:3: ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1059:4: () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1059:4: ()
                    // InternalVsdl.g:1060:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1066:4: ( ( 'ram' )=>otherlv_43= 'ram' )
                    // InternalVsdl.g:1067:5: ( 'ram' )=>otherlv_43= 'ram'
                    {
                    otherlv_43=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_43, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_8_1());
                      				
                    }

                    }

                    otherlv_44=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getNodeHardwareConstraintAAccess().getSizeKeyword_8_2());
                      			
                    }
                    // InternalVsdl.g:1077:4: ( (lv_op_45_0= 'equal' ) )
                    // InternalVsdl.g:1078:5: (lv_op_45_0= 'equal' )
                    {
                    // InternalVsdl.g:1078:5: (lv_op_45_0= 'equal' )
                    // InternalVsdl.g:1079:6: lv_op_45_0= 'equal'
                    {
                    lv_op_45_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_45_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpEqualKeyword_8_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_45_0, "equal");
                      					
                    }

                    }


                    }

                    otherlv_46=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getNodeHardwareConstraintAAccess().getToKeyword_8_4());
                      			
                    }
                    // InternalVsdl.g:1095:4: ( (lv_value_47_0= ruleRamSize ) )
                    // InternalVsdl.g:1096:5: (lv_value_47_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1096:5: (lv_value_47_0= ruleRamSize )
                    // InternalVsdl.g:1097:6: lv_value_47_0= ruleRamSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueRamSizeParserRuleCall_8_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_47_0=ruleRamSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_47_0,
                      							"it.csec.xtext.Vsdl.RamSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalVsdl.g:1116:3: ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1116:3: ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1117:4: () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1117:4: ()
                    // InternalVsdl.g:1118:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1124:4: ( ( 'ram' )=>otherlv_49= 'ram' )
                    // InternalVsdl.g:1125:5: ( 'ram' )=>otherlv_49= 'ram'
                    {
                    otherlv_49=(Token)match(input,37,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_49, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_9_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1131:4: ( (lv_op_50_0= 'larger' ) )
                    // InternalVsdl.g:1132:5: (lv_op_50_0= 'larger' )
                    {
                    // InternalVsdl.g:1132:5: (lv_op_50_0= 'larger' )
                    // InternalVsdl.g:1133:6: lv_op_50_0= 'larger'
                    {
                    lv_op_50_0=(Token)match(input,35,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_50_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpLargerKeyword_9_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_50_0, "larger");
                      					
                    }

                    }


                    }

                    otherlv_51=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_9_3());
                      			
                    }
                    // InternalVsdl.g:1149:4: ( (lv_value_52_0= ruleRamSize ) )
                    // InternalVsdl.g:1150:5: (lv_value_52_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1150:5: (lv_value_52_0= ruleRamSize )
                    // InternalVsdl.g:1151:6: lv_value_52_0= ruleRamSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueRamSizeParserRuleCall_9_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_52_0=ruleRamSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_52_0,
                      							"it.csec.xtext.Vsdl.RamSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalVsdl.g:1170:3: ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1170:3: ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1171:4: () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1171:4: ()
                    // InternalVsdl.g:1172:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1178:4: ( ( 'ram' )=>otherlv_54= 'ram' )
                    // InternalVsdl.g:1179:5: ( 'ram' )=>otherlv_54= 'ram'
                    {
                    otherlv_54=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_54, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_10_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1185:4: ( (lv_op_55_0= 'smaller' ) )
                    // InternalVsdl.g:1186:5: (lv_op_55_0= 'smaller' )
                    {
                    // InternalVsdl.g:1186:5: (lv_op_55_0= 'smaller' )
                    // InternalVsdl.g:1187:6: lv_op_55_0= 'smaller'
                    {
                    lv_op_55_0=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_55_0, grammarAccess.getNodeHardwareConstraintAAccess().getOpSmallerKeyword_10_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_55_0, "smaller");
                      					
                    }

                    }


                    }

                    otherlv_56=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getNodeHardwareConstraintAAccess().getThanKeyword_10_3());
                      			
                    }
                    // InternalVsdl.g:1203:4: ( (lv_value_57_0= ruleRamSize ) )
                    // InternalVsdl.g:1204:5: (lv_value_57_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1204:5: (lv_value_57_0= ruleRamSize )
                    // InternalVsdl.g:1205:6: lv_value_57_0= ruleRamSize
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getValueRamSizeParserRuleCall_10_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_57_0=ruleRamSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_57_0,
                      							"it.csec.xtext.Vsdl.RamSize");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalVsdl.g:1224:3: ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:1224:3: ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) )
                    // InternalVsdl.g:1225:4: () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) )
                    {
                    // InternalVsdl.g:1225:4: ()
                    // InternalVsdl.g:1226:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1232:4: ( ( 'ram' )=>otherlv_59= 'ram' )
                    // InternalVsdl.g:1233:5: ( 'ram' )=>otherlv_59= 'ram'
                    {
                    otherlv_59=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_59, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_11_1());
                      				
                    }

                    }

                    otherlv_60=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_60, grammarAccess.getNodeHardwareConstraintAAccess().getSizeKeyword_11_2());
                      			
                    }
                    // InternalVsdl.g:1243:4: ( (lv_sameas_61_0= 'of' ) )
                    // InternalVsdl.g:1244:5: (lv_sameas_61_0= 'of' )
                    {
                    // InternalVsdl.g:1244:5: (lv_sameas_61_0= 'of' )
                    // InternalVsdl.g:1245:6: lv_sameas_61_0= 'of'
                    {
                    lv_sameas_61_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sameas_61_0, grammarAccess.getNodeHardwareConstraintAAccess().getSameasOfKeyword_11_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						setWithLastConsumed(current, "sameas", lv_sameas_61_0 != null, "of");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:1257:4: ( (otherlv_62= RULE_ID ) )
                    // InternalVsdl.g:1258:5: (otherlv_62= RULE_ID )
                    {
                    // InternalVsdl.g:1258:5: (otherlv_62= RULE_ID )
                    // InternalVsdl.g:1259:6: otherlv_62= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      					
                    }
                    otherlv_62=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_62, grammarAccess.getNodeHardwareConstraintAAccess().getIdNodeCrossReference_11_4_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalVsdl.g:1272:3: ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) )
                    {
                    // InternalVsdl.g:1272:3: ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) )
                    // InternalVsdl.g:1273:4: () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) )
                    {
                    // InternalVsdl.g:1273:4: ()
                    // InternalVsdl.g:1274:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getFlavourAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1280:4: ( ( 'flavour' )=>otherlv_64= 'flavour' )
                    // InternalVsdl.g:1281:5: ( 'flavour' )=>otherlv_64= 'flavour'
                    {
                    otherlv_64=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_64, grammarAccess.getNodeHardwareConstraintAAccess().getFlavourKeyword_12_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1287:4: ( (lv_profile_65_0= ruleHardwareProfile ) )
                    // InternalVsdl.g:1288:5: (lv_profile_65_0= ruleHardwareProfile )
                    {
                    // InternalVsdl.g:1288:5: (lv_profile_65_0= ruleHardwareProfile )
                    // InternalVsdl.g:1289:6: lv_profile_65_0= ruleHardwareProfile
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeHardwareConstraintAAccess().getProfileHardwareProfileEnumRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_profile_65_0=ruleHardwareProfile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeHardwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"profile",
                      							lv_profile_65_0,
                      							"it.csec.xtext.Vsdl.HardwareProfile");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeHardwareConstraintA"


    // $ANTLR start "entryRuleNodeNetworkConstraintA"
    // InternalVsdl.g:1311:1: entryRuleNodeNetworkConstraintA returns [EObject current=null] : iv_ruleNodeNetworkConstraintA= ruleNodeNetworkConstraintA EOF ;
    public final EObject entryRuleNodeNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeNetworkConstraintA = null;


        try {
            // InternalVsdl.g:1311:63: (iv_ruleNodeNetworkConstraintA= ruleNodeNetworkConstraintA EOF )
            // InternalVsdl.g:1312:2: iv_ruleNodeNetworkConstraintA= ruleNodeNetworkConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeNetworkConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeNetworkConstraintA=ruleNodeNetworkConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeNetworkConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeNetworkConstraintA"


    // $ANTLR start "ruleNodeNetworkConstraintA"
    // InternalVsdl.g:1318:1: ruleNodeNetworkConstraintA returns [EObject current=null] : ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) ) | ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) ) | ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) ) | ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) ) | ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) ) ) ;
    public final EObject ruleNodeNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_op_4_0=null;
        Token otherlv_5=null;
        Token lv_id_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_op_11_0=null;
        Token otherlv_12=null;
        Token lv_id_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_op_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_id_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_ipAddress_6_0 = null;

        EObject lv_ipRange_13_0 = null;

        EObject lv_gatewayIP_25_0 = null;

        EObject lv_DNSIP_30_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1324:2: ( ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) ) | ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) ) | ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) ) | ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) ) | ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) ) ) )
            // InternalVsdl.g:1325:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) ) | ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) ) | ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) ) | ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) ) | ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) ) )
            {
            // InternalVsdl.g:1325:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) ) | ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) ) | ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) ) | ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) ) | ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) ) )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==39) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==40) ) {
                        switch ( input.LA(4) ) {
                        case 27:
                            {
                            alt11=1;
                            }
                            break;
                        case 43:
                            {
                            alt11=3;
                            }
                            break;
                        case 41:
                            {
                            alt11=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_1==46) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==45) ) {
                alt11=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVsdl.g:1326:3: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) )
                    {
                    // InternalVsdl.g:1326:3: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) ) )
                    // InternalVsdl.g:1327:4: () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'ip' otherlv_3= 'address' ( (lv_op_4_0= 'equal' ) ) otherlv_5= 'to' ( (lv_ipAddress_6_0= ruleIPAddress ) )
                    {
                    // InternalVsdl.g:1327:4: ()
                    // InternalVsdl.g:1328:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeNetworkConstraintAAccess().getIPAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1334:4: ( (lv_id_1_0= RULE_ID ) )
                    // InternalVsdl.g:1335:5: (lv_id_1_0= RULE_ID )
                    {
                    // InternalVsdl.g:1335:5: (lv_id_1_0= RULE_ID )
                    // InternalVsdl.g:1336:6: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_1_0, grammarAccess.getNodeNetworkConstraintAAccess().getIdIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"id",
                      							lv_id_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNodeNetworkConstraintAAccess().getIpKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNodeNetworkConstraintAAccess().getAddressKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:1360:4: ( (lv_op_4_0= 'equal' ) )
                    // InternalVsdl.g:1361:5: (lv_op_4_0= 'equal' )
                    {
                    // InternalVsdl.g:1361:5: (lv_op_4_0= 'equal' )
                    // InternalVsdl.g:1362:6: lv_op_4_0= 'equal'
                    {
                    lv_op_4_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_4_0, grammarAccess.getNodeNetworkConstraintAAccess().getOpEqualKeyword_0_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_4_0, "equal");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNodeNetworkConstraintAAccess().getToKeyword_0_5());
                      			
                    }
                    // InternalVsdl.g:1378:4: ( (lv_ipAddress_6_0= ruleIPAddress ) )
                    // InternalVsdl.g:1379:5: (lv_ipAddress_6_0= ruleIPAddress )
                    {
                    // InternalVsdl.g:1379:5: (lv_ipAddress_6_0= ruleIPAddress )
                    // InternalVsdl.g:1380:6: lv_ipAddress_6_0= ruleIPAddress
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeNetworkConstraintAAccess().getIpAddressIPAddressParserRuleCall_0_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ipAddress_6_0=ruleIPAddress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						set(
                      							current,
                      							"ipAddress",
                      							lv_ipAddress_6_0,
                      							"it.csec.xtext.Vsdl.IPAddress");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:1399:3: ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) )
                    {
                    // InternalVsdl.g:1399:3: ( () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) ) )
                    // InternalVsdl.g:1400:4: () ( (lv_id_8_0= RULE_ID ) ) otherlv_9= 'ip' otherlv_10= 'address' ( (lv_op_11_0= 'in' ) ) otherlv_12= 'range' ( (lv_ipRange_13_0= ruleIPRangeA ) )
                    {
                    // InternalVsdl.g:1400:4: ()
                    // InternalVsdl.g:1401:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeNetworkConstraintAAccess().getIPAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1407:4: ( (lv_id_8_0= RULE_ID ) )
                    // InternalVsdl.g:1408:5: (lv_id_8_0= RULE_ID )
                    {
                    // InternalVsdl.g:1408:5: (lv_id_8_0= RULE_ID )
                    // InternalVsdl.g:1409:6: lv_id_8_0= RULE_ID
                    {
                    lv_id_8_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_8_0, grammarAccess.getNodeNetworkConstraintAAccess().getIdIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"id",
                      							lv_id_8_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNodeNetworkConstraintAAccess().getIpKeyword_1_2());
                      			
                    }
                    otherlv_10=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getNodeNetworkConstraintAAccess().getAddressKeyword_1_3());
                      			
                    }
                    // InternalVsdl.g:1433:4: ( (lv_op_11_0= 'in' ) )
                    // InternalVsdl.g:1434:5: (lv_op_11_0= 'in' )
                    {
                    // InternalVsdl.g:1434:5: (lv_op_11_0= 'in' )
                    // InternalVsdl.g:1435:6: lv_op_11_0= 'in'
                    {
                    lv_op_11_0=(Token)match(input,41,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_11_0, grammarAccess.getNodeNetworkConstraintAAccess().getOpInKeyword_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_11_0, "in");
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getNodeNetworkConstraintAAccess().getRangeKeyword_1_5());
                      			
                    }
                    // InternalVsdl.g:1451:4: ( (lv_ipRange_13_0= ruleIPRangeA ) )
                    // InternalVsdl.g:1452:5: (lv_ipRange_13_0= ruleIPRangeA )
                    {
                    // InternalVsdl.g:1452:5: (lv_ipRange_13_0= ruleIPRangeA )
                    // InternalVsdl.g:1453:6: lv_ipRange_13_0= ruleIPRangeA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeNetworkConstraintAAccess().getIpRangeIPRangeAParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ipRange_13_0=ruleIPRangeA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						set(
                      							current,
                      							"ipRange",
                      							lv_ipRange_13_0,
                      							"it.csec.xtext.Vsdl.IPRangeA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:1472:3: ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:1472:3: ( () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) ) )
                    // InternalVsdl.g:1473:4: () ( (lv_id_15_0= RULE_ID ) ) otherlv_16= 'ip' otherlv_17= 'address' otherlv_18= 'is' ( (lv_op_19_0= 'connected' ) ) otherlv_20= 'to' ( (otherlv_21= RULE_ID ) )
                    {
                    // InternalVsdl.g:1473:4: ()
                    // InternalVsdl.g:1474:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeNetworkConstraintAAccess().getIPAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1480:4: ( (lv_id_15_0= RULE_ID ) )
                    // InternalVsdl.g:1481:5: (lv_id_15_0= RULE_ID )
                    {
                    // InternalVsdl.g:1481:5: (lv_id_15_0= RULE_ID )
                    // InternalVsdl.g:1482:6: lv_id_15_0= RULE_ID
                    {
                    lv_id_15_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_15_0, grammarAccess.getNodeNetworkConstraintAAccess().getIdIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"id",
                      							lv_id_15_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getNodeNetworkConstraintAAccess().getIpKeyword_2_2());
                      			
                    }
                    otherlv_17=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getNodeNetworkConstraintAAccess().getAddressKeyword_2_3());
                      			
                    }
                    otherlv_18=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getNodeNetworkConstraintAAccess().getIsKeyword_2_4());
                      			
                    }
                    // InternalVsdl.g:1510:4: ( (lv_op_19_0= 'connected' ) )
                    // InternalVsdl.g:1511:5: (lv_op_19_0= 'connected' )
                    {
                    // InternalVsdl.g:1511:5: (lv_op_19_0= 'connected' )
                    // InternalVsdl.g:1512:6: lv_op_19_0= 'connected'
                    {
                    lv_op_19_0=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_19_0, grammarAccess.getNodeNetworkConstraintAAccess().getOpConnectedKeyword_2_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_19_0, "connected");
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getNodeNetworkConstraintAAccess().getToKeyword_2_6());
                      			
                    }
                    // InternalVsdl.g:1528:4: ( (otherlv_21= RULE_ID ) )
                    // InternalVsdl.g:1529:5: (otherlv_21= RULE_ID )
                    {
                    // InternalVsdl.g:1529:5: (otherlv_21= RULE_ID )
                    // InternalVsdl.g:1530:6: otherlv_21= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      					
                    }
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_21, grammarAccess.getNodeNetworkConstraintAAccess().getNodeNodeCrossReference_2_7_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVsdl.g:1543:3: ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) )
                    {
                    // InternalVsdl.g:1543:3: ( () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) ) )
                    // InternalVsdl.g:1544:4: () ( ( 'gateway' )=>otherlv_23= 'gateway' ) otherlv_24= 'is' ( (lv_gatewayIP_25_0= ruleIPAddress ) )
                    {
                    // InternalVsdl.g:1544:4: ()
                    // InternalVsdl.g:1545:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeNetworkConstraintAAccess().getGatewayAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1551:4: ( ( 'gateway' )=>otherlv_23= 'gateway' )
                    // InternalVsdl.g:1552:5: ( 'gateway' )=>otherlv_23= 'gateway'
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_23, grammarAccess.getNodeNetworkConstraintAAccess().getGatewayKeyword_3_1());
                      				
                    }

                    }

                    otherlv_24=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getNodeNetworkConstraintAAccess().getIsKeyword_3_2());
                      			
                    }
                    // InternalVsdl.g:1562:4: ( (lv_gatewayIP_25_0= ruleIPAddress ) )
                    // InternalVsdl.g:1563:5: (lv_gatewayIP_25_0= ruleIPAddress )
                    {
                    // InternalVsdl.g:1563:5: (lv_gatewayIP_25_0= ruleIPAddress )
                    // InternalVsdl.g:1564:6: lv_gatewayIP_25_0= ruleIPAddress
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeNetworkConstraintAAccess().getGatewayIPIPAddressParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_gatewayIP_25_0=ruleIPAddress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						set(
                      							current,
                      							"gatewayIP",
                      							lv_gatewayIP_25_0,
                      							"it.csec.xtext.Vsdl.IPAddress");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVsdl.g:1583:3: ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) )
                    {
                    // InternalVsdl.g:1583:3: ( () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) ) )
                    // InternalVsdl.g:1584:4: () ( (lv_id_27_0= RULE_ID ) ) ( ( 'DNS' )=>otherlv_28= 'DNS' ) otherlv_29= 'is' ( (lv_DNSIP_30_0= ruleIPAddress ) )
                    {
                    // InternalVsdl.g:1584:4: ()
                    // InternalVsdl.g:1585:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeNetworkConstraintAAccess().getDNSAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1591:4: ( (lv_id_27_0= RULE_ID ) )
                    // InternalVsdl.g:1592:5: (lv_id_27_0= RULE_ID )
                    {
                    // InternalVsdl.g:1592:5: (lv_id_27_0= RULE_ID )
                    // InternalVsdl.g:1593:6: lv_id_27_0= RULE_ID
                    {
                    lv_id_27_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_27_0, grammarAccess.getNodeNetworkConstraintAAccess().getIdIDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"id",
                      							lv_id_27_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:1609:4: ( ( 'DNS' )=>otherlv_28= 'DNS' )
                    // InternalVsdl.g:1610:5: ( 'DNS' )=>otherlv_28= 'DNS'
                    {
                    otherlv_28=(Token)match(input,46,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getNodeNetworkConstraintAAccess().getDNSKeyword_4_2());
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getNodeNetworkConstraintAAccess().getIsKeyword_4_3());
                      			
                    }
                    // InternalVsdl.g:1620:4: ( (lv_DNSIP_30_0= ruleIPAddress ) )
                    // InternalVsdl.g:1621:5: (lv_DNSIP_30_0= ruleIPAddress )
                    {
                    // InternalVsdl.g:1621:5: (lv_DNSIP_30_0= ruleIPAddress )
                    // InternalVsdl.g:1622:6: lv_DNSIP_30_0= ruleIPAddress
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeNetworkConstraintAAccess().getDNSIPIPAddressParserRuleCall_4_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_DNSIP_30_0=ruleIPAddress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeNetworkConstraintARule());
                      						}
                      						set(
                      							current,
                      							"DNSIP",
                      							lv_DNSIP_30_0,
                      							"it.csec.xtext.Vsdl.IPAddress");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeNetworkConstraintA"


    // $ANTLR start "entryRuleNodeSoftwareConstraintA"
    // InternalVsdl.g:1644:1: entryRuleNodeSoftwareConstraintA returns [EObject current=null] : iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF ;
    public final EObject entryRuleNodeSoftwareConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSoftwareConstraintA = null;


        try {
            // InternalVsdl.g:1644:64: (iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF )
            // InternalVsdl.g:1645:2: iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeSoftwareConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeSoftwareConstraintA=ruleNodeSoftwareConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeSoftwareConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeSoftwareConstraintA"


    // $ANTLR start "ruleNodeSoftwareConstraintA"
    // InternalVsdl.g:1651:1: ruleNodeSoftwareConstraintA returns [EObject current=null] : ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) ) ;
    public final EObject ruleNodeSoftwareConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_version_4_0 = null;

        AntlrDatatypeRuleToken lv_family_10_0 = null;

        EObject lv_software_13_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1657:2: ( ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) ) )
            // InternalVsdl.g:1658:2: ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) )
            {
            // InternalVsdl.g:1658:2: ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==47) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==43) ) {
                        alt12=1;
                    }
                    else if ( (LA12_3==48) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==49) ) {
                alt12=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalVsdl.g:1659:3: (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) )
                    {
                    // InternalVsdl.g:1659:3: (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) )
                    // InternalVsdl.g:1660:4: otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNodeSoftwareConstraintAAccess().getNodeKeyword_0_0());
                      			
                    }
                    // InternalVsdl.g:1664:4: ()
                    // InternalVsdl.g:1665:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeSoftwareConstraintAAccess().getOSAction_0_1(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1671:4: ( ( 'OS' )=>otherlv_2= 'OS' )
                    // InternalVsdl.g:1672:5: ( 'OS' )=>otherlv_2= 'OS'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNodeSoftwareConstraintAAccess().getOSKeyword_0_2());
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,43,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNodeSoftwareConstraintAAccess().getIsKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:1682:4: ( (lv_version_4_0= ruleOSVersionE ) )
                    // InternalVsdl.g:1683:5: (lv_version_4_0= ruleOSVersionE )
                    {
                    // InternalVsdl.g:1683:5: (lv_version_4_0= ruleOSVersionE )
                    // InternalVsdl.g:1684:6: lv_version_4_0= ruleOSVersionE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeSoftwareConstraintAAccess().getVersionOSVersionEParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_version_4_0=ruleOSVersionE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeSoftwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"version",
                      							lv_version_4_0,
                      							"it.csec.xtext.Vsdl.OSVersionE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:1703:3: (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) )
                    {
                    // InternalVsdl.g:1703:3: (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) )
                    // InternalVsdl.g:1704:4: otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNodeSoftwareConstraintAAccess().getNodeKeyword_1_0());
                      			
                    }
                    otherlv_6=(Token)match(input,47,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getNodeSoftwareConstraintAAccess().getOSKeyword_1_1());
                      			
                    }
                    // InternalVsdl.g:1712:4: ()
                    // InternalVsdl.g:1713:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeSoftwareConstraintAAccess().getOSFamilyAction_1_2(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1719:4: ( ( 'family' )=>otherlv_8= 'family' )
                    // InternalVsdl.g:1720:5: ( 'family' )=>otherlv_8= 'family'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getNodeSoftwareConstraintAAccess().getFamilyKeyword_1_3());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,43,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNodeSoftwareConstraintAAccess().getIsKeyword_1_4());
                      			
                    }
                    // InternalVsdl.g:1730:4: ( (lv_family_10_0= ruleOSFamilyE ) )
                    // InternalVsdl.g:1731:5: (lv_family_10_0= ruleOSFamilyE )
                    {
                    // InternalVsdl.g:1731:5: (lv_family_10_0= ruleOSFamilyE )
                    // InternalVsdl.g:1732:6: lv_family_10_0= ruleOSFamilyE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeSoftwareConstraintAAccess().getFamilyOSFamilyEParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_family_10_0=ruleOSFamilyE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeSoftwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"family",
                      							lv_family_10_0,
                      							"it.csec.xtext.Vsdl.OSFamilyE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:1751:3: (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) )
                    {
                    // InternalVsdl.g:1751:3: (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) )
                    // InternalVsdl.g:1752:4: otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) )
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getNodeSoftwareConstraintAAccess().getMountsKeyword_2_0());
                      			
                    }
                    otherlv_12=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getNodeSoftwareConstraintAAccess().getSoftwareKeyword_2_1());
                      			
                    }
                    // InternalVsdl.g:1760:4: ( (lv_software_13_0= ruleSoftwareInstallation ) )
                    // InternalVsdl.g:1761:5: (lv_software_13_0= ruleSoftwareInstallation )
                    {
                    // InternalVsdl.g:1761:5: (lv_software_13_0= ruleSoftwareInstallation )
                    // InternalVsdl.g:1762:6: lv_software_13_0= ruleSoftwareInstallation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeSoftwareConstraintAAccess().getSoftwareSoftwareInstallationParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_software_13_0=ruleSoftwareInstallation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeSoftwareConstraintARule());
                      						}
                      						set(
                      							current,
                      							"software",
                      							lv_software_13_0,
                      							"it.csec.xtext.Vsdl.SoftwareInstallation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeSoftwareConstraintA"


    // $ANTLR start "entryRuleSoftwareInstallation"
    // InternalVsdl.g:1784:1: entryRuleSoftwareInstallation returns [EObject current=null] : iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF ;
    public final EObject entryRuleSoftwareInstallation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareInstallation = null;


        try {
            // InternalVsdl.g:1784:61: (iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF )
            // InternalVsdl.g:1785:2: iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftwareInstallationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSoftwareInstallation=ruleSoftwareInstallation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftwareInstallation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSoftwareInstallation"


    // $ANTLR start "ruleSoftwareInstallation"
    // InternalVsdl.g:1791:1: ruleSoftwareInstallation returns [EObject current=null] : ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? ) ;
    public final EObject ruleSoftwareInstallation() throws RecognitionException {
        EObject current = null;

        Token lv_softwareID_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        EObject lv_dependencies_4_0 = null;

        EObject lv_dependencies_6_0 = null;

        EObject lv_config_8_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1797:2: ( ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? ) )
            // InternalVsdl.g:1798:2: ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? )
            {
            // InternalVsdl.g:1798:2: ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? )
            // InternalVsdl.g:1799:3: ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )?
            {
            // InternalVsdl.g:1799:3: ( (lv_softwareID_0_0= RULE_ID ) )
            // InternalVsdl.g:1800:4: (lv_softwareID_0_0= RULE_ID )
            {
            // InternalVsdl.g:1800:4: (lv_softwareID_0_0= RULE_ID )
            // InternalVsdl.g:1801:5: lv_softwareID_0_0= RULE_ID
            {
            lv_softwareID_0_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_softwareID_0_0, grammarAccess.getSoftwareInstallationAccess().getSoftwareIDIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSoftwareInstallationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"softwareID",
              						lv_softwareID_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalVsdl.g:1817:3: (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVsdl.g:1818:4: otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSoftwareInstallationAccess().getVersionKeyword_1_0());
                      			
                    }
                    // InternalVsdl.g:1822:4: ( (lv_version_2_0= ruleVersionNumber ) )
                    // InternalVsdl.g:1823:5: (lv_version_2_0= ruleVersionNumber )
                    {
                    // InternalVsdl.g:1823:5: (lv_version_2_0= ruleVersionNumber )
                    // InternalVsdl.g:1824:6: lv_version_2_0= ruleVersionNumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getVersionVersionNumberParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_version_2_0=ruleVersionNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSoftwareInstallationRule());
                      						}
                      						set(
                      							current,
                      							"version",
                      							lv_version_2_0,
                      							"it.csec.xtext.Vsdl.VersionNumber");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVsdl.g:1842:3: (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==52) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVsdl.g:1843:4: otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )*
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSoftwareInstallationAccess().getWithKeyword_2_0());
                      			
                    }
                    // InternalVsdl.g:1847:4: ( (lv_dependencies_4_0= ruleSoftwareDependency ) )
                    // InternalVsdl.g:1848:5: (lv_dependencies_4_0= ruleSoftwareDependency )
                    {
                    // InternalVsdl.g:1848:5: (lv_dependencies_4_0= ruleSoftwareDependency )
                    // InternalVsdl.g:1849:6: lv_dependencies_4_0= ruleSoftwareDependency
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getDependenciesSoftwareDependencyParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_dependencies_4_0=ruleSoftwareDependency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSoftwareInstallationRule());
                      						}
                      						add(
                      							current,
                      							"dependencies",
                      							lv_dependencies_4_0,
                      							"it.csec.xtext.Vsdl.SoftwareDependency");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:1866:4: (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==53) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVsdl.g:1867:5: otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) )
                    	    {
                    	    otherlv_5=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getSoftwareInstallationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalVsdl.g:1871:5: ( (lv_dependencies_6_0= ruleSoftwareDependency ) )
                    	    // InternalVsdl.g:1872:6: (lv_dependencies_6_0= ruleSoftwareDependency )
                    	    {
                    	    // InternalVsdl.g:1872:6: (lv_dependencies_6_0= ruleSoftwareDependency )
                    	    // InternalVsdl.g:1873:7: lv_dependencies_6_0= ruleSoftwareDependency
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getDependenciesSoftwareDependencyParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_dependencies_6_0=ruleSoftwareDependency();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSoftwareInstallationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dependencies",
                    	      								lv_dependencies_6_0,
                    	      								"it.csec.xtext.Vsdl.SoftwareDependency");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVsdl.g:1892:3: (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVsdl.g:1893:4: otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSoftwareInstallationAccess().getConfigKeyword_3_0());
                      			
                    }
                    // InternalVsdl.g:1897:4: ( (lv_config_8_0= ruleConfigOptions ) )
                    // InternalVsdl.g:1898:5: (lv_config_8_0= ruleConfigOptions )
                    {
                    // InternalVsdl.g:1898:5: (lv_config_8_0= ruleConfigOptions )
                    // InternalVsdl.g:1899:6: lv_config_8_0= ruleConfigOptions
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getConfigConfigOptionsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_config_8_0=ruleConfigOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSoftwareInstallationRule());
                      						}
                      						set(
                      							current,
                      							"config",
                      							lv_config_8_0,
                      							"it.csec.xtext.Vsdl.ConfigOptions");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSoftwareInstallation"


    // $ANTLR start "entryRuleVersionNumber"
    // InternalVsdl.g:1921:1: entryRuleVersionNumber returns [String current=null] : iv_ruleVersionNumber= ruleVersionNumber EOF ;
    public final String entryRuleVersionNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionNumber = null;


        try {
            // InternalVsdl.g:1921:53: (iv_ruleVersionNumber= ruleVersionNumber EOF )
            // InternalVsdl.g:1922:2: iv_ruleVersionNumber= ruleVersionNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVersionNumber=ruleVersionNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionNumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersionNumber"


    // $ANTLR start "ruleVersionNumber"
    // InternalVsdl.g:1928:1: ruleVersionNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalVsdl.g:1934:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // InternalVsdl.g:1935:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // InternalVsdl.g:1935:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // InternalVsdl.g:1936:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getVersionNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalVsdl.g:1943:3: (kw= '.' this_INT_2= RULE_INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVsdl.g:1944:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionNumberAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_INT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_INT_2, grammarAccess.getVersionNumberAccess().getINTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVersionNumber"


    // $ANTLR start "entryRuleSoftwareDependency"
    // InternalVsdl.g:1961:1: entryRuleSoftwareDependency returns [EObject current=null] : iv_ruleSoftwareDependency= ruleSoftwareDependency EOF ;
    public final EObject entryRuleSoftwareDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareDependency = null;


        try {
            // InternalVsdl.g:1961:59: (iv_ruleSoftwareDependency= ruleSoftwareDependency EOF )
            // InternalVsdl.g:1962:2: iv_ruleSoftwareDependency= ruleSoftwareDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftwareDependencyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSoftwareDependency=ruleSoftwareDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftwareDependency; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSoftwareDependency"


    // $ANTLR start "ruleSoftwareDependency"
    // InternalVsdl.g:1968:1: ruleSoftwareDependency returns [EObject current=null] : ( (lv_dependencyID_0_0= RULE_ID ) ) ;
    public final EObject ruleSoftwareDependency() throws RecognitionException {
        EObject current = null;

        Token lv_dependencyID_0_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:1974:2: ( ( (lv_dependencyID_0_0= RULE_ID ) ) )
            // InternalVsdl.g:1975:2: ( (lv_dependencyID_0_0= RULE_ID ) )
            {
            // InternalVsdl.g:1975:2: ( (lv_dependencyID_0_0= RULE_ID ) )
            // InternalVsdl.g:1976:3: (lv_dependencyID_0_0= RULE_ID )
            {
            // InternalVsdl.g:1976:3: (lv_dependencyID_0_0= RULE_ID )
            // InternalVsdl.g:1977:4: lv_dependencyID_0_0= RULE_ID
            {
            lv_dependencyID_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_dependencyID_0_0, grammarAccess.getSoftwareDependencyAccess().getDependencyIDIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSoftwareDependencyRule());
              				}
              				setWithLastConsumed(
              					current,
              					"dependencyID",
              					lv_dependencyID_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSoftwareDependency"


    // $ANTLR start "entryRuleConfigOptions"
    // InternalVsdl.g:1996:1: entryRuleConfigOptions returns [EObject current=null] : iv_ruleConfigOptions= ruleConfigOptions EOF ;
    public final EObject entryRuleConfigOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigOptions = null;


        try {
            // InternalVsdl.g:1996:54: (iv_ruleConfigOptions= ruleConfigOptions EOF )
            // InternalVsdl.g:1997:2: iv_ruleConfigOptions= ruleConfigOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigOptionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigOptions=ruleConfigOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigOptions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigOptions"


    // $ANTLR start "ruleConfigOptions"
    // InternalVsdl.g:2003:1: ruleConfigOptions returns [EObject current=null] : (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleConfigOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_configPairs_1_0 = null;

        EObject lv_configPairs_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2009:2: ( (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' ) )
            // InternalVsdl.g:2010:2: (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' )
            {
            // InternalVsdl.g:2010:2: (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' )
            // InternalVsdl.g:2011:3: otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigOptionsAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalVsdl.g:2015:3: ( (lv_configPairs_1_0= ruleConfigPair ) )
            // InternalVsdl.g:2016:4: (lv_configPairs_1_0= ruleConfigPair )
            {
            // InternalVsdl.g:2016:4: (lv_configPairs_1_0= ruleConfigPair )
            // InternalVsdl.g:2017:5: lv_configPairs_1_0= ruleConfigPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigOptionsAccess().getConfigPairsConfigPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_configPairs_1_0=ruleConfigPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigOptionsRule());
              					}
              					add(
              						current,
              						"configPairs",
              						lv_configPairs_1_0,
              						"it.csec.xtext.Vsdl.ConfigPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVsdl.g:2034:3: (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVsdl.g:2035:4: otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) )
            	    {
            	    otherlv_2=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConfigOptionsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalVsdl.g:2039:4: ( (lv_configPairs_3_0= ruleConfigPair ) )
            	    // InternalVsdl.g:2040:5: (lv_configPairs_3_0= ruleConfigPair )
            	    {
            	    // InternalVsdl.g:2040:5: (lv_configPairs_3_0= ruleConfigPair )
            	    // InternalVsdl.g:2041:6: lv_configPairs_3_0= ruleConfigPair
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigOptionsAccess().getConfigPairsConfigPairParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_configPairs_3_0=ruleConfigPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConfigOptionsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"configPairs",
            	      							lv_configPairs_3_0,
            	      							"it.csec.xtext.Vsdl.ConfigPair");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConfigOptionsAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigOptions"


    // $ANTLR start "entryRuleConfigPair"
    // InternalVsdl.g:2067:1: entryRuleConfigPair returns [EObject current=null] : iv_ruleConfigPair= ruleConfigPair EOF ;
    public final EObject entryRuleConfigPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigPair = null;


        try {
            // InternalVsdl.g:2067:51: (iv_ruleConfigPair= ruleConfigPair EOF )
            // InternalVsdl.g:2068:2: iv_ruleConfigPair= ruleConfigPair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigPairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigPair=ruleConfigPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigPair; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConfigPair"


    // $ANTLR start "ruleConfigPair"
    // InternalVsdl.g:2074:1: ruleConfigPair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigPair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:2080:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalVsdl.g:2081:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalVsdl.g:2081:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalVsdl.g:2082:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalVsdl.g:2082:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalVsdl.g:2083:4: (lv_key_0_0= RULE_ID )
            {
            // InternalVsdl.g:2083:4: (lv_key_0_0= RULE_ID )
            // InternalVsdl.g:2084:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getConfigPairAccess().getKeyIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigPairRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigPairAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalVsdl.g:2104:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalVsdl.g:2105:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalVsdl.g:2105:4: (lv_value_2_0= RULE_STRING )
            // InternalVsdl.g:2106:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getConfigPairAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigPairRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConfigPair"


    // $ANTLR start "entryRuleNetwork"
    // InternalVsdl.g:2126:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalVsdl.g:2126:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalVsdl.g:2127:2: iv_ruleNetwork= ruleNetwork EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetwork; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalVsdl.g:2133:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2139:2: ( (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' ) )
            // InternalVsdl.g:2140:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' )
            {
            // InternalVsdl.g:2140:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' )
            // InternalVsdl.g:2141:3: otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
              		
            }
            // InternalVsdl.g:2145:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVsdl.g:2146:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVsdl.g:2146:4: (lv_name_1_0= RULE_ID )
            // InternalVsdl.g:2147:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNetworkRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalVsdl.g:2167:3: ( (lv_constraints_3_0= ruleNetworkConstraint ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15||LA19_0==17||(LA19_0>=22 && LA19_0<=23)||LA19_0==45||LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalVsdl.g:2168:4: (lv_constraints_3_0= ruleNetworkConstraint )
            	    {
            	    // InternalVsdl.g:2168:4: (lv_constraints_3_0= ruleNetworkConstraint )
            	    // InternalVsdl.g:2169:5: lv_constraints_3_0= ruleNetworkConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNetworkAccess().getConstraintsNetworkConstraintParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_constraints_3_0=ruleNetworkConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNetworkRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_3_0,
            	      						"it.csec.xtext.Vsdl.NetworkConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleNetworkConstraint"
    // InternalVsdl.g:2194:1: entryRuleNetworkConstraint returns [EObject current=null] : iv_ruleNetworkConstraint= ruleNetworkConstraint EOF ;
    public final EObject entryRuleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConstraint = null;


        try {
            // InternalVsdl.g:2194:58: (iv_ruleNetworkConstraint= ruleNetworkConstraint EOF )
            // InternalVsdl.g:2195:2: iv_ruleNetworkConstraint= ruleNetworkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConstraint=ruleNetworkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetworkConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNetworkConstraint"


    // $ANTLR start "ruleNetworkConstraint"
    // InternalVsdl.g:2201:1: ruleNetworkConstraint returns [EObject current=null] : ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) ) ;
    public final EObject ruleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_GuardedNetworkConstraint_0 = null;

        EObject this_SimpleNetworkConstraint_2 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2207:2: ( ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) ) )
            // InternalVsdl.g:2208:2: ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) )
            {
            // InternalVsdl.g:2208:2: ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            else if ( (LA20_0==15||(LA20_0>=22 && LA20_0<=23)||LA20_0==45||LA20_0==58) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalVsdl.g:2209:3: (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' )
                    {
                    // InternalVsdl.g:2209:3: (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' )
                    // InternalVsdl.g:2210:4: this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNetworkConstraintAccess().getGuardedNetworkConstraintParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_GuardedNetworkConstraint_0=ruleGuardedNetworkConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GuardedNetworkConstraint_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNetworkConstraintAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2224:3: (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' )
                    {
                    // InternalVsdl.g:2224:3: (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' )
                    // InternalVsdl.g:2225:4: this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNetworkConstraintAccess().getSimpleNetworkConstraintParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_SimpleNetworkConstraint_2=ruleSimpleNetworkConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleNetworkConstraint_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNetworkConstraintAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNetworkConstraint"


    // $ANTLR start "entryRuleGuardedNetworkConstraint"
    // InternalVsdl.g:2242:1: entryRuleGuardedNetworkConstraint returns [EObject current=null] : iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF ;
    public final EObject entryRuleGuardedNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedNetworkConstraint = null;


        try {
            // InternalVsdl.g:2242:65: (iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF )
            // InternalVsdl.g:2243:2: iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardedNetworkConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGuardedNetworkConstraint=ruleGuardedNetworkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuardedNetworkConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGuardedNetworkConstraint"


    // $ANTLR start "ruleGuardedNetworkConstraint"
    // InternalVsdl.g:2249:1: ruleGuardedNetworkConstraint returns [EObject current=null] : (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) ) ;
    public final EObject ruleGuardedNetworkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_networktriggerconstraint_1_0 = null;

        EObject lv_networkconstraint_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2255:2: ( (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) ) )
            // InternalVsdl.g:2256:2: (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) )
            {
            // InternalVsdl.g:2256:2: (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) )
            // InternalVsdl.g:2257:3: otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuardedNetworkConstraintAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalVsdl.g:2261:3: ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) )
            // InternalVsdl.g:2262:4: (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint )
            {
            // InternalVsdl.g:2262:4: (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint )
            // InternalVsdl.g:2263:5: lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuardedNetworkConstraintAccess().getNetworktriggerconstraintUpdateTriggerConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_networktriggerconstraint_1_0=ruleUpdateTriggerConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuardedNetworkConstraintRule());
              					}
              					set(
              						current,
              						"networktriggerconstraint",
              						lv_networktriggerconstraint_1_0,
              						"it.csec.xtext.Vsdl.UpdateTriggerConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGuardedNetworkConstraintAccess().getRightSquareBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuardedNetworkConstraintAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVsdl.g:2288:3: ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) )
            // InternalVsdl.g:2289:4: (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint )
            {
            // InternalVsdl.g:2289:4: (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint )
            // InternalVsdl.g:2290:5: lv_networkconstraint_4_0= ruleSimpleNetworkConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuardedNetworkConstraintAccess().getNetworkconstraintSimpleNetworkConstraintParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_networkconstraint_4_0=ruleSimpleNetworkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuardedNetworkConstraintRule());
              					}
              					set(
              						current,
              						"networkconstraint",
              						lv_networkconstraint_4_0,
              						"it.csec.xtext.Vsdl.SimpleNetworkConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGuardedNetworkConstraint"


    // $ANTLR start "entryRuleSimpleNetworkConstraint"
    // InternalVsdl.g:2311:1: entryRuleSimpleNetworkConstraint returns [EObject current=null] : iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF ;
    public final EObject entryRuleSimpleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraint = null;


        try {
            // InternalVsdl.g:2311:64: (iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF )
            // InternalVsdl.g:2312:2: iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNetworkConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNetworkConstraint=ruleSimpleNetworkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNetworkConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNetworkConstraint"


    // $ANTLR start "ruleSimpleNetworkConstraint"
    // InternalVsdl.g:2318:1: ruleSimpleNetworkConstraint returns [EObject current=null] : this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr ;
    public final EObject ruleSimpleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleNetworkConstraintAndOr_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2324:2: (this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr )
            // InternalVsdl.g:2325:2: this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSimpleNetworkConstraintAccess().getSimpleNetworkConstraintAndOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleNetworkConstraintAndOr_0=ruleSimpleNetworkConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SimpleNetworkConstraintAndOr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNetworkConstraint"


    // $ANTLR start "entryRuleSimpleNetworkConstraintAndOr"
    // InternalVsdl.g:2336:1: entryRuleSimpleNetworkConstraintAndOr returns [EObject current=null] : iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF ;
    public final EObject entryRuleSimpleNetworkConstraintAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintAndOr = null;


        try {
            // InternalVsdl.g:2336:69: (iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF )
            // InternalVsdl.g:2337:2: iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNetworkConstraintAndOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNetworkConstraintAndOr=ruleSimpleNetworkConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNetworkConstraintAndOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNetworkConstraintAndOr"


    // $ANTLR start "ruleSimpleNetworkConstraintAndOr"
    // InternalVsdl.g:2343:1: ruleSimpleNetworkConstraintAndOr returns [EObject current=null] : (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* ) ;
    public final EObject ruleSimpleNetworkConstraintAndOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SimpleNetworkConstraintNot_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2349:2: ( (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* ) )
            // InternalVsdl.g:2350:2: (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* )
            {
            // InternalVsdl.g:2350:2: (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* )
            // InternalVsdl.g:2351:3: this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getSimpleNetworkConstraintNotParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_SimpleNetworkConstraintNot_0=ruleSimpleNetworkConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleNetworkConstraintNot_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:2359:3: ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=20 && LA22_0<=21)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVsdl.g:2360:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) )
            	    {
            	    // InternalVsdl.g:2360:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) )
            	    // InternalVsdl.g:2361:5: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    {
            	    // InternalVsdl.g:2361:5: ()
            	    // InternalVsdl.g:2362:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSimpleNetworkConstraintAndOrAccess().getAndOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:2368:5: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // InternalVsdl.g:2369:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // InternalVsdl.g:2369:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // InternalVsdl.g:2370:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // InternalVsdl.g:2370:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==20) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==21) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalVsdl.g:2371:8: lv_op_2_1= 'and'
            	            {
            	            lv_op_2_1=(Token)match(input,20,FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getSimpleNetworkConstraintAndOrAccess().getOpAndKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimpleNetworkConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVsdl.g:2382:8: lv_op_2_2= 'or'
            	            {
            	            lv_op_2_2=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getSimpleNetworkConstraintAndOrAccess().getOpOrKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimpleNetworkConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalVsdl.g:2396:4: ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) )
            	    // InternalVsdl.g:2397:5: (lv_right_3_0= ruleSimpleNetworkConstraintNot )
            	    {
            	    // InternalVsdl.g:2397:5: (lv_right_3_0= ruleSimpleNetworkConstraintNot )
            	    // InternalVsdl.g:2398:6: lv_right_3_0= ruleSimpleNetworkConstraintNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getRightSimpleNetworkConstraintNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleSimpleNetworkConstraintNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimpleNetworkConstraintAndOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.csec.xtext.Vsdl.SimpleNetworkConstraintNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNetworkConstraintAndOr"


    // $ANTLR start "entryRuleSimpleNetworkConstraintNot"
    // InternalVsdl.g:2420:1: entryRuleSimpleNetworkConstraintNot returns [EObject current=null] : iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF ;
    public final EObject entryRuleSimpleNetworkConstraintNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintNot = null;


        try {
            // InternalVsdl.g:2420:67: (iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF )
            // InternalVsdl.g:2421:2: iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNetworkConstraintNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNetworkConstraintNot=ruleSimpleNetworkConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNetworkConstraintNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNetworkConstraintNot"


    // $ANTLR start "ruleSimpleNetworkConstraintNot"
    // InternalVsdl.g:2427:1: ruleSimpleNetworkConstraintNot returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA ) ;
    public final EObject ruleSimpleNetworkConstraintNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraint_2_0 = null;

        EObject this_SimpleNetworkConstraintA_3 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2433:2: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA ) )
            // InternalVsdl.g:2434:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA )
            {
            // InternalVsdl.g:2434:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==15||LA23_0==23||LA23_0==45||LA23_0==58) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalVsdl.g:2435:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) )
                    {
                    // InternalVsdl.g:2435:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) )
                    // InternalVsdl.g:2436:4: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) )
                    {
                    // InternalVsdl.g:2436:4: ()
                    // InternalVsdl.g:2437:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleNetworkConstraintNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2443:4: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalVsdl.g:2444:5: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSimpleNetworkConstraintNotAccess().getNotKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2450:4: ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) )
                    // InternalVsdl.g:2451:5: (lv_constraint_2_0= ruleSimpleNetworkConstraintA )
                    {
                    // InternalVsdl.g:2451:5: (lv_constraint_2_0= ruleSimpleNetworkConstraintA )
                    // InternalVsdl.g:2452:6: lv_constraint_2_0= ruleSimpleNetworkConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimpleNetworkConstraintNotAccess().getConstraintSimpleNetworkConstraintAParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleSimpleNetworkConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimpleNetworkConstraintNotRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_2_0,
                      							"it.csec.xtext.Vsdl.SimpleNetworkConstraintA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2471:3: this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNetworkConstraintNotAccess().getSimpleNetworkConstraintAParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleNetworkConstraintA_3=ruleSimpleNetworkConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleNetworkConstraintA_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNetworkConstraintNot"


    // $ANTLR start "entryRuleSimpleNetworkConstraintA"
    // InternalVsdl.g:2483:1: entryRuleSimpleNetworkConstraintA returns [EObject current=null] : iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF ;
    public final EObject entryRuleSimpleNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintA = null;


        try {
            // InternalVsdl.g:2483:65: (iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF )
            // InternalVsdl.g:2484:2: iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNetworkConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNetworkConstraintA=ruleSimpleNetworkConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNetworkConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNetworkConstraintA"


    // $ANTLR start "ruleSimpleNetworkConstraintA"
    // InternalVsdl.g:2490:1: ruleSimpleNetworkConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint ) ;
    public final EObject ruleSimpleNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SimpleNetworkConstraint_1 = null;

        EObject this_NetworkGatewayConstraint_3 = null;

        EObject this_NetworkParticipantsConstraint_4 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2496:2: ( ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint ) )
            // InternalVsdl.g:2497:2: ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint )
            {
            // InternalVsdl.g:2497:2: ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt24=1;
                }
                break;
            case 45:
            case 58:
                {
                alt24=2;
                }
                break;
            case 15:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalVsdl.g:2498:3: (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' )
                    {
                    // InternalVsdl.g:2498:3: (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' )
                    // InternalVsdl.g:2499:4: otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSimpleNetworkConstraintAAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleNetworkConstraintAAccess().getSimpleNetworkConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_SimpleNetworkConstraint_1=ruleSimpleNetworkConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleNetworkConstraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSimpleNetworkConstraintAAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2517:3: this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNetworkConstraintAAccess().getNetworkGatewayConstraintParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NetworkGatewayConstraint_3=ruleNetworkGatewayConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NetworkGatewayConstraint_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:2526:3: this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleNetworkConstraintAAccess().getNetworkParticipantsConstraintParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NetworkParticipantsConstraint_4=ruleNetworkParticipantsConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NetworkParticipantsConstraint_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNetworkConstraintA"


    // $ANTLR start "entryRuleNetworkGatewayConstraint"
    // InternalVsdl.g:2538:1: entryRuleNetworkGatewayConstraint returns [EObject current=null] : iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF ;
    public final EObject entryRuleNetworkGatewayConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkGatewayConstraint = null;


        try {
            // InternalVsdl.g:2538:65: (iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF )
            // InternalVsdl.g:2539:2: iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkGatewayConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNetworkGatewayConstraint=ruleNetworkGatewayConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetworkGatewayConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNetworkGatewayConstraint"


    // $ANTLR start "ruleNetworkGatewayConstraint"
    // InternalVsdl.g:2545:1: ruleNetworkGatewayConstraint returns [EObject current=null] : ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) ) ;
    public final EObject ruleNetworkGatewayConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_internet_12_0=null;
        EObject lv_range_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2551:2: ( ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) ) )
            // InternalVsdl.g:2552:2: ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) )
            {
            // InternalVsdl.g:2552:2: ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            else if ( (LA25_0==45) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalVsdl.g:2553:3: ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) )
                    {
                    // InternalVsdl.g:2553:3: ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) )
                    // InternalVsdl.g:2554:4: () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) )
                    {
                    // InternalVsdl.g:2554:4: ()
                    // InternalVsdl.g:2555:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkGatewayConstraintAccess().getIPRangeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2561:4: ( ( 'addresses' )=>otherlv_1= 'addresses' )
                    // InternalVsdl.g:2562:5: ( 'addresses' )=>otherlv_1= 'addresses'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getNetworkGatewayConstraintAccess().getAddressesKeyword_0_1());
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNetworkGatewayConstraintAccess().getRangeKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNetworkGatewayConstraintAccess().getIsKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:2576:4: ( (lv_range_4_0= ruleIPRangeA ) )
                    // InternalVsdl.g:2577:5: (lv_range_4_0= ruleIPRangeA )
                    {
                    // InternalVsdl.g:2577:5: (lv_range_4_0= ruleIPRangeA )
                    // InternalVsdl.g:2578:6: lv_range_4_0= ruleIPRangeA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNetworkGatewayConstraintAccess().getRangeIPRangeAParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_range_4_0=ruleIPRangeA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNetworkGatewayConstraintRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_4_0,
                      							"it.csec.xtext.Vsdl.IPRangeA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2597:3: ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) )
                    {
                    // InternalVsdl.g:2597:3: ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) )
                    // InternalVsdl.g:2598:4: () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) )
                    {
                    // InternalVsdl.g:2598:4: ()
                    // InternalVsdl.g:2599:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkGatewayConstraintAccess().getGatewayAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2605:4: ( ( 'gateway' )=>otherlv_6= 'gateway' )
                    // InternalVsdl.g:2606:5: ( 'gateway' )=>otherlv_6= 'gateway'
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNetworkGatewayConstraintAccess().getGatewayKeyword_1_1());
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,59,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getNetworkGatewayConstraintAccess().getHasKeyword_1_2());
                      			
                    }
                    otherlv_8=(Token)match(input,60,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getNetworkGatewayConstraintAccess().getDirectKeyword_1_3());
                      			
                    }
                    otherlv_9=(Token)match(input,61,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNetworkGatewayConstraintAccess().getAccessKeyword_1_4());
                      			
                    }
                    otherlv_10=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getNetworkGatewayConstraintAccess().getToKeyword_1_5());
                      			
                    }
                    otherlv_11=(Token)match(input,62,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getNetworkGatewayConstraintAccess().getTheKeyword_1_6());
                      			
                    }
                    // InternalVsdl.g:2632:4: ( (lv_internet_12_0= 'Internet' ) )
                    // InternalVsdl.g:2633:5: (lv_internet_12_0= 'Internet' )
                    {
                    // InternalVsdl.g:2633:5: (lv_internet_12_0= 'Internet' )
                    // InternalVsdl.g:2634:6: lv_internet_12_0= 'Internet'
                    {
                    lv_internet_12_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_internet_12_0, grammarAccess.getNetworkGatewayConstraintAccess().getInternetInternetKeyword_1_7_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkGatewayConstraintRule());
                      						}
                      						setWithLastConsumed(current, "internet", lv_internet_12_0 != null, "Internet");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNetworkGatewayConstraint"


    // $ANTLR start "entryRuleNetworkParticipantsConstraint"
    // InternalVsdl.g:2651:1: entryRuleNetworkParticipantsConstraint returns [EObject current=null] : iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF ;
    public final EObject entryRuleNetworkParticipantsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkParticipantsConstraint = null;


        try {
            // InternalVsdl.g:2651:70: (iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF )
            // InternalVsdl.g:2652:2: iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNetworkParticipantsConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNetworkParticipantsConstraint=ruleNetworkParticipantsConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNetworkParticipantsConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNetworkParticipantsConstraint"


    // $ANTLR start "ruleNetworkParticipantsConstraint"
    // InternalVsdl.g:2658:1: ruleNetworkParticipantsConstraint returns [EObject current=null] : ( (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) ) | (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) ) ) ;
    public final EObject ruleNetworkParticipantsConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_op_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_7_0=null;
        EObject lv_ip_8_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2664:2: ( ( (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) ) | (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) ) ) )
            // InternalVsdl.g:2665:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) ) | (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) ) )
            {
            // InternalVsdl.g:2665:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) ) | (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==59) ) {
                        alt26=2;
                    }
                    else if ( (LA26_2==43) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalVsdl.g:2666:3: (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) )
                    {
                    // InternalVsdl.g:2666:3: (otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) ) )
                    // InternalVsdl.g:2667:4: otherlv_0= 'node' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' ( (lv_op_3_0= 'connected' ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNetworkParticipantsConstraintAccess().getNodeKeyword_0_0());
                      			
                    }
                    // InternalVsdl.g:2671:4: ( (otherlv_1= RULE_ID ) )
                    // InternalVsdl.g:2672:5: (otherlv_1= RULE_ID )
                    {
                    // InternalVsdl.g:2672:5: (otherlv_1= RULE_ID )
                    // InternalVsdl.g:2673:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getNetworkParticipantsConstraintAccess().getIdNodeCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNetworkParticipantsConstraintAccess().getIsKeyword_0_2());
                      			
                    }
                    // InternalVsdl.g:2688:4: ( (lv_op_3_0= 'connected' ) )
                    // InternalVsdl.g:2689:5: (lv_op_3_0= 'connected' )
                    {
                    // InternalVsdl.g:2689:5: (lv_op_3_0= 'connected' )
                    // InternalVsdl.g:2690:6: lv_op_3_0= 'connected'
                    {
                    lv_op_3_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_3_0, grammarAccess.getNetworkParticipantsConstraintAccess().getOpConnectedKeyword_0_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_3_0, "connected");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2704:3: (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) )
                    {
                    // InternalVsdl.g:2704:3: (otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) ) )
                    // InternalVsdl.g:2705:4: otherlv_4= 'node' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_op_7_0= 'IP' ) ) ( (lv_ip_8_0= ruleIPAddress ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNetworkParticipantsConstraintAccess().getNodeKeyword_1_0());
                      			
                    }
                    // InternalVsdl.g:2709:4: ( (otherlv_5= RULE_ID ) )
                    // InternalVsdl.g:2710:5: (otherlv_5= RULE_ID )
                    {
                    // InternalVsdl.g:2710:5: (otherlv_5= RULE_ID )
                    // InternalVsdl.g:2711:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getNetworkParticipantsConstraintAccess().getIdNodeCrossReference_1_1_0());
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,59,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getNetworkParticipantsConstraintAccess().getHasKeyword_1_2());
                      			
                    }
                    // InternalVsdl.g:2726:4: ( (lv_op_7_0= 'IP' ) )
                    // InternalVsdl.g:2727:5: (lv_op_7_0= 'IP' )
                    {
                    // InternalVsdl.g:2727:5: (lv_op_7_0= 'IP' )
                    // InternalVsdl.g:2728:6: lv_op_7_0= 'IP'
                    {
                    lv_op_7_0=(Token)match(input,64,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_7_0, grammarAccess.getNetworkParticipantsConstraintAccess().getOpIPKeyword_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_7_0, "IP");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:2740:4: ( (lv_ip_8_0= ruleIPAddress ) )
                    // InternalVsdl.g:2741:5: (lv_ip_8_0= ruleIPAddress )
                    {
                    // InternalVsdl.g:2741:5: (lv_ip_8_0= ruleIPAddress )
                    // InternalVsdl.g:2742:6: lv_ip_8_0= ruleIPAddress
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNetworkParticipantsConstraintAccess().getIpIPAddressParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ip_8_0=ruleIPAddress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						set(
                      							current,
                      							"ip",
                      							lv_ip_8_0,
                      							"it.csec.xtext.Vsdl.IPAddress");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNetworkParticipantsConstraint"


    // $ANTLR start "entryRuleUpdateTriggerConstraint"
    // InternalVsdl.g:2764:1: entryRuleUpdateTriggerConstraint returns [EObject current=null] : iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF ;
    public final EObject entryRuleUpdateTriggerConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraint = null;


        try {
            // InternalVsdl.g:2764:64: (iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF )
            // InternalVsdl.g:2765:2: iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateTriggerConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpdateTriggerConstraint=ruleUpdateTriggerConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateTriggerConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateTriggerConstraint"


    // $ANTLR start "ruleUpdateTriggerConstraint"
    // InternalVsdl.g:2771:1: ruleUpdateTriggerConstraint returns [EObject current=null] : this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr ;
    public final EObject ruleUpdateTriggerConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateTriggerConstraintAndOr_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2777:2: (this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr )
            // InternalVsdl.g:2778:2: this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUpdateTriggerConstraintAccess().getUpdateTriggerConstraintAndOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_UpdateTriggerConstraintAndOr_0=ruleUpdateTriggerConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_UpdateTriggerConstraintAndOr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUpdateTriggerConstraint"


    // $ANTLR start "entryRuleUpdateTriggerConstraintAndOr"
    // InternalVsdl.g:2789:1: entryRuleUpdateTriggerConstraintAndOr returns [EObject current=null] : iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF ;
    public final EObject entryRuleUpdateTriggerConstraintAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintAndOr = null;


        try {
            // InternalVsdl.g:2789:69: (iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF )
            // InternalVsdl.g:2790:2: iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateTriggerConstraintAndOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpdateTriggerConstraintAndOr=ruleUpdateTriggerConstraintAndOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateTriggerConstraintAndOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateTriggerConstraintAndOr"


    // $ANTLR start "ruleUpdateTriggerConstraintAndOr"
    // InternalVsdl.g:2796:1: ruleUpdateTriggerConstraintAndOr returns [EObject current=null] : (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* ) ;
    public final EObject ruleUpdateTriggerConstraintAndOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_UpdateTriggerConstraintNot_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2802:2: ( (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* ) )
            // InternalVsdl.g:2803:2: (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* )
            {
            // InternalVsdl.g:2803:2: (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* )
            // InternalVsdl.g:2804:3: this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getUpdateTriggerConstraintNotParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_UpdateTriggerConstraintNot_0=ruleUpdateTriggerConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UpdateTriggerConstraintNot_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:2812:3: ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=20 && LA28_0<=21)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVsdl.g:2813:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) )
            	    {
            	    // InternalVsdl.g:2813:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) )
            	    // InternalVsdl.g:2814:5: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    {
            	    // InternalVsdl.g:2814:5: ()
            	    // InternalVsdl.g:2815:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getUpdateTriggerConstraintAndOrAccess().getAndOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:2821:5: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // InternalVsdl.g:2822:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // InternalVsdl.g:2822:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // InternalVsdl.g:2823:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // InternalVsdl.g:2823:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==20) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==21) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalVsdl.g:2824:8: lv_op_2_1= 'and'
            	            {
            	            lv_op_2_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getUpdateTriggerConstraintAndOrAccess().getOpAndKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getUpdateTriggerConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVsdl.g:2835:8: lv_op_2_2= 'or'
            	            {
            	            lv_op_2_2=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getUpdateTriggerConstraintAndOrAccess().getOpOrKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getUpdateTriggerConstraintAndOrRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalVsdl.g:2849:4: ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) )
            	    // InternalVsdl.g:2850:5: (lv_right_3_0= ruleUpdateTriggerConstraintNot )
            	    {
            	    // InternalVsdl.g:2850:5: (lv_right_3_0= ruleUpdateTriggerConstraintNot )
            	    // InternalVsdl.g:2851:6: lv_right_3_0= ruleUpdateTriggerConstraintNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getRightUpdateTriggerConstraintNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleUpdateTriggerConstraintNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUpdateTriggerConstraintAndOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.csec.xtext.Vsdl.UpdateTriggerConstraintNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUpdateTriggerConstraintAndOr"


    // $ANTLR start "entryRuleUpdateTriggerConstraintNot"
    // InternalVsdl.g:2873:1: entryRuleUpdateTriggerConstraintNot returns [EObject current=null] : iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF ;
    public final EObject entryRuleUpdateTriggerConstraintNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintNot = null;


        try {
            // InternalVsdl.g:2873:67: (iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF )
            // InternalVsdl.g:2874:2: iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateTriggerConstraintNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpdateTriggerConstraintNot=ruleUpdateTriggerConstraintNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateTriggerConstraintNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateTriggerConstraintNot"


    // $ANTLR start "ruleUpdateTriggerConstraintNot"
    // InternalVsdl.g:2880:1: ruleUpdateTriggerConstraintNot returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA ) ;
    public final EObject ruleUpdateTriggerConstraintNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraint_2_0 = null;

        EObject this_UpdateTriggerConstraintA_3 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2886:2: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA ) )
            // InternalVsdl.g:2887:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA )
            {
            // InternalVsdl.g:2887:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            else if ( (LA29_0==23||LA29_0==65||LA29_0==70) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalVsdl.g:2888:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) )
                    {
                    // InternalVsdl.g:2888:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) )
                    // InternalVsdl.g:2889:4: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) )
                    {
                    // InternalVsdl.g:2889:4: ()
                    // InternalVsdl.g:2890:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2896:4: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalVsdl.g:2897:5: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUpdateTriggerConstraintNotAccess().getNotKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2903:4: ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) )
                    // InternalVsdl.g:2904:5: (lv_constraint_2_0= ruleUpdateTriggerConstraintA )
                    {
                    // InternalVsdl.g:2904:5: (lv_constraint_2_0= ruleUpdateTriggerConstraintA )
                    // InternalVsdl.g:2905:6: lv_constraint_2_0= ruleUpdateTriggerConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUpdateTriggerConstraintNotAccess().getConstraintUpdateTriggerConstraintAParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_constraint_2_0=ruleUpdateTriggerConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUpdateTriggerConstraintNotRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_2_0,
                      							"it.csec.xtext.Vsdl.UpdateTriggerConstraintA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2924:3: this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUpdateTriggerConstraintNotAccess().getUpdateTriggerConstraintAParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UpdateTriggerConstraintA_3=ruleUpdateTriggerConstraintA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UpdateTriggerConstraintA_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUpdateTriggerConstraintNot"


    // $ANTLR start "entryRuleUpdateTriggerConstraintA"
    // InternalVsdl.g:2936:1: entryRuleUpdateTriggerConstraintA returns [EObject current=null] : iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF ;
    public final EObject entryRuleUpdateTriggerConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintA = null;


        try {
            // InternalVsdl.g:2936:65: (iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF )
            // InternalVsdl.g:2937:2: iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateTriggerConstraintARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpdateTriggerConstraintA=ruleUpdateTriggerConstraintA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateTriggerConstraintA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateTriggerConstraintA"


    // $ANTLR start "ruleUpdateTriggerConstraintA"
    // InternalVsdl.g:2943:1: ruleUpdateTriggerConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) ) ;
    public final EObject ruleUpdateTriggerConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token lv_variable_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_op_12_0=null;
        Token otherlv_13=null;
        Token lv_variable_14_0=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_variable_20_0=null;
        Token otherlv_21=null;
        EObject this_UpdateTriggerConstraint_1 = null;

        EObject lv_texp_9_0 = null;

        EObject lv_texp_16_0 = null;

        EObject lv_texp_22_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2949:2: ( ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) ) )
            // InternalVsdl.g:2950:2: ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) )
            {
            // InternalVsdl.g:2950:2: ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt30=1;
                }
                break;
            case 65:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==66) ) {
                    alt30=2;
                }
                else if ( (LA30_2==68) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalVsdl.g:2951:3: (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' )
                    {
                    // InternalVsdl.g:2951:3: (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' )
                    // InternalVsdl.g:2952:4: otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getUpdateTriggerConstraintAAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUpdateTriggerConstraintAAccess().getUpdateTriggerConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_UpdateTriggerConstraint_1=ruleUpdateTriggerConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UpdateTriggerConstraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUpdateTriggerConstraintAAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2970:3: ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:2970:3: ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:2971:4: () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:2971:4: ()
                    // InternalVsdl.g:2972:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getAtAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2978:4: ( ( 'at' )=>otherlv_4= 'at' )
                    // InternalVsdl.g:2979:5: ( 'at' )=>otherlv_4= 'at'
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getUpdateTriggerConstraintAAccess().getAtKeyword_1_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2985:4: ( (lv_op_5_0= 'least' ) )
                    // InternalVsdl.g:2986:5: (lv_op_5_0= 'least' )
                    {
                    // InternalVsdl.g:2986:5: (lv_op_5_0= 'least' )
                    // InternalVsdl.g:2987:6: lv_op_5_0= 'least'
                    {
                    lv_op_5_0=(Token)match(input,66,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_5_0, grammarAccess.getUpdateTriggerConstraintAAccess().getOpLeastKeyword_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_5_0, "least");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getUpdateTriggerConstraintAAccess().getAfterKeyword_1_3());
                      			
                    }
                    // InternalVsdl.g:3003:4: ( (lv_variable_7_0= RULE_ID ) )
                    // InternalVsdl.g:3004:5: (lv_variable_7_0= RULE_ID )
                    {
                    // InternalVsdl.g:3004:5: (lv_variable_7_0= RULE_ID )
                    // InternalVsdl.g:3005:6: lv_variable_7_0= RULE_ID
                    {
                    lv_variable_7_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_7_0, grammarAccess.getUpdateTriggerConstraintAAccess().getVariableIDTerminalRuleCall_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_7_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,56,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_1_5());
                      			
                    }
                    // InternalVsdl.g:3025:4: ( (lv_texp_9_0= ruleTimeExpr ) )
                    // InternalVsdl.g:3026:5: (lv_texp_9_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:3026:5: (lv_texp_9_0= ruleTimeExpr )
                    // InternalVsdl.g:3027:6: lv_texp_9_0= ruleTimeExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpTimeExprParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_texp_9_0=ruleTimeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						set(
                      							current,
                      							"texp",
                      							lv_texp_9_0,
                      							"it.csec.xtext.Vsdl.TimeExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3046:3: ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:3046:3: ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:3047:4: () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:3047:4: ()
                    // InternalVsdl.g:3048:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getAtAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:3054:4: ( ( 'at' )=>otherlv_11= 'at' )
                    // InternalVsdl.g:3055:5: ( 'at' )=>otherlv_11= 'at'
                    {
                    otherlv_11=(Token)match(input,65,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getUpdateTriggerConstraintAAccess().getAtKeyword_2_1());
                      				
                    }

                    }

                    // InternalVsdl.g:3061:4: ( (lv_op_12_0= 'most' ) )
                    // InternalVsdl.g:3062:5: (lv_op_12_0= 'most' )
                    {
                    // InternalVsdl.g:3062:5: (lv_op_12_0= 'most' )
                    // InternalVsdl.g:3063:6: lv_op_12_0= 'most'
                    {
                    lv_op_12_0=(Token)match(input,68,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_12_0, grammarAccess.getUpdateTriggerConstraintAAccess().getOpMostKeyword_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_12_0, "most");
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,69,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getUpdateTriggerConstraintAAccess().getBeforeKeyword_2_3());
                      			
                    }
                    // InternalVsdl.g:3079:4: ( (lv_variable_14_0= RULE_ID ) )
                    // InternalVsdl.g:3080:5: (lv_variable_14_0= RULE_ID )
                    {
                    // InternalVsdl.g:3080:5: (lv_variable_14_0= RULE_ID )
                    // InternalVsdl.g:3081:6: lv_variable_14_0= RULE_ID
                    {
                    lv_variable_14_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_14_0, grammarAccess.getUpdateTriggerConstraintAAccess().getVariableIDTerminalRuleCall_2_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_14_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,56,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_2_5());
                      			
                    }
                    // InternalVsdl.g:3101:4: ( (lv_texp_16_0= ruleTimeExpr ) )
                    // InternalVsdl.g:3102:5: (lv_texp_16_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:3102:5: (lv_texp_16_0= ruleTimeExpr )
                    // InternalVsdl.g:3103:6: lv_texp_16_0= ruleTimeExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpTimeExprParserRuleCall_2_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_texp_16_0=ruleTimeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						set(
                      							current,
                      							"texp",
                      							lv_texp_16_0,
                      							"it.csec.xtext.Vsdl.TimeExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3122:3: ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:3122:3: ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:3123:4: () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:3123:4: ()
                    // InternalVsdl.g:3124:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getSwitchAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:3130:4: ( ( 'switch' )=>otherlv_18= 'switch' )
                    // InternalVsdl.g:3131:5: ( 'switch' )=>otherlv_18= 'switch'
                    {
                    otherlv_18=(Token)match(input,70,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getUpdateTriggerConstraintAAccess().getSwitchKeyword_3_1());
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getUpdateTriggerConstraintAAccess().getAfterKeyword_3_2());
                      			
                    }
                    // InternalVsdl.g:3141:4: ( (lv_variable_20_0= RULE_ID ) )
                    // InternalVsdl.g:3142:5: (lv_variable_20_0= RULE_ID )
                    {
                    // InternalVsdl.g:3142:5: (lv_variable_20_0= RULE_ID )
                    // InternalVsdl.g:3143:6: lv_variable_20_0= RULE_ID
                    {
                    lv_variable_20_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_20_0, grammarAccess.getUpdateTriggerConstraintAAccess().getVariableIDTerminalRuleCall_3_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_20_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,56,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_3_4());
                      			
                    }
                    // InternalVsdl.g:3163:4: ( (lv_texp_22_0= ruleTimeExpr ) )
                    // InternalVsdl.g:3164:5: (lv_texp_22_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:3164:5: (lv_texp_22_0= ruleTimeExpr )
                    // InternalVsdl.g:3165:6: lv_texp_22_0= ruleTimeExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpTimeExprParserRuleCall_3_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_texp_22_0=ruleTimeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUpdateTriggerConstraintARule());
                      						}
                      						set(
                      							current,
                      							"texp",
                      							lv_texp_22_0,
                      							"it.csec.xtext.Vsdl.TimeExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUpdateTriggerConstraintA"


    // $ANTLR start "entryRuleTimeExpr"
    // InternalVsdl.g:3187:1: entryRuleTimeExpr returns [EObject current=null] : iv_ruleTimeExpr= ruleTimeExpr EOF ;
    public final EObject entryRuleTimeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExpr = null;


        try {
            // InternalVsdl.g:3187:49: (iv_ruleTimeExpr= ruleTimeExpr EOF )
            // InternalVsdl.g:3188:2: iv_ruleTimeExpr= ruleTimeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeExpr=ruleTimeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeExpr"


    // $ANTLR start "ruleTimeExpr"
    // InternalVsdl.g:3194:1: ruleTimeExpr returns [EObject current=null] : this_TimeExprAddition_0= ruleTimeExprAddition ;
    public final EObject ruleTimeExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TimeExprAddition_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3200:2: (this_TimeExprAddition_0= ruleTimeExprAddition )
            // InternalVsdl.g:3201:2: this_TimeExprAddition_0= ruleTimeExprAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTimeExprAccess().getTimeExprAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TimeExprAddition_0=ruleTimeExprAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TimeExprAddition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeExpr"


    // $ANTLR start "entryRuleTimeExprAddition"
    // InternalVsdl.g:3212:1: entryRuleTimeExprAddition returns [EObject current=null] : iv_ruleTimeExprAddition= ruleTimeExprAddition EOF ;
    public final EObject entryRuleTimeExprAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprAddition = null;


        try {
            // InternalVsdl.g:3212:57: (iv_ruleTimeExprAddition= ruleTimeExprAddition EOF )
            // InternalVsdl.g:3213:2: iv_ruleTimeExprAddition= ruleTimeExprAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeExprAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeExprAddition=ruleTimeExprAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeExprAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeExprAddition"


    // $ANTLR start "ruleTimeExprAddition"
    // InternalVsdl.g:3219:1: ruleTimeExprAddition returns [EObject current=null] : (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* ) ;
    public final EObject ruleTimeExprAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimeExprMultiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3225:2: ( (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* ) )
            // InternalVsdl.g:3226:2: (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* )
            {
            // InternalVsdl.g:3226:2: (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* )
            // InternalVsdl.g:3227:3: this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTimeExprAdditionAccess().getTimeExprMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_TimeExprMultiplication_0=ruleTimeExprMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TimeExprMultiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:3235:3: ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=71 && LA32_0<=72)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVsdl.g:3236:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) )
            	    {
            	    // InternalVsdl.g:3236:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // InternalVsdl.g:3237:5: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // InternalVsdl.g:3237:5: ()
            	    // InternalVsdl.g:3238:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getTimeExprAdditionAccess().getPlusMinusLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:3244:5: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalVsdl.g:3245:6: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalVsdl.g:3245:6: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalVsdl.g:3246:7: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalVsdl.g:3246:7: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==71) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==72) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalVsdl.g:3247:8: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,71,FOLLOW_56); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getTimeExprAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTimeExprAdditionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVsdl.g:3258:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,72,FOLLOW_56); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getTimeExprAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTimeExprAdditionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalVsdl.g:3272:4: ( (lv_right_3_0= ruleTimeExprMultiplication ) )
            	    // InternalVsdl.g:3273:5: (lv_right_3_0= ruleTimeExprMultiplication )
            	    {
            	    // InternalVsdl.g:3273:5: (lv_right_3_0= ruleTimeExprMultiplication )
            	    // InternalVsdl.g:3274:6: lv_right_3_0= ruleTimeExprMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTimeExprAdditionAccess().getRightTimeExprMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_right_3_0=ruleTimeExprMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTimeExprAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.csec.xtext.Vsdl.TimeExprMultiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeExprAddition"


    // $ANTLR start "entryRuleTimeExprMultiplication"
    // InternalVsdl.g:3296:1: entryRuleTimeExprMultiplication returns [EObject current=null] : iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF ;
    public final EObject entryRuleTimeExprMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprMultiplication = null;


        try {
            // InternalVsdl.g:3296:63: (iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF )
            // InternalVsdl.g:3297:2: iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeExprMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeExprMultiplication=ruleTimeExprMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeExprMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeExprMultiplication"


    // $ANTLR start "ruleTimeExprMultiplication"
    // InternalVsdl.g:3303:1: ruleTimeExprMultiplication returns [EObject current=null] : (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* ) ;
    public final EObject ruleTimeExprMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TimeExprA_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3309:2: ( (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* ) )
            // InternalVsdl.g:3310:2: (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* )
            {
            // InternalVsdl.g:3310:2: (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* )
            // InternalVsdl.g:3311:3: this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTimeExprMultiplicationAccess().getTimeExprAParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_TimeExprA_0=ruleTimeExprA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TimeExprA_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:3319:3: ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==73) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVsdl.g:3320:4: ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) )
            	    {
            	    // InternalVsdl.g:3320:4: ( () ( (lv_op_2_0= '*' ) ) )
            	    // InternalVsdl.g:3321:5: () ( (lv_op_2_0= '*' ) )
            	    {
            	    // InternalVsdl.g:3321:5: ()
            	    // InternalVsdl.g:3322:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getTimeExprMultiplicationAccess().getMultiplicationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:3328:5: ( (lv_op_2_0= '*' ) )
            	    // InternalVsdl.g:3329:6: (lv_op_2_0= '*' )
            	    {
            	    // InternalVsdl.g:3329:6: (lv_op_2_0= '*' )
            	    // InternalVsdl.g:3330:7: lv_op_2_0= '*'
            	    {
            	    lv_op_2_0=(Token)match(input,73,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_op_2_0, grammarAccess.getTimeExprMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTimeExprMultiplicationRule());
            	      							}
            	      							setWithLastConsumed(current, "op", lv_op_2_0, "*");
            	      						
            	    }

            	    }


            	    }


            	    }

            	    // InternalVsdl.g:3343:4: ( (lv_right_3_0= ruleTimeExprA ) )
            	    // InternalVsdl.g:3344:5: (lv_right_3_0= ruleTimeExprA )
            	    {
            	    // InternalVsdl.g:3344:5: (lv_right_3_0= ruleTimeExprA )
            	    // InternalVsdl.g:3345:6: lv_right_3_0= ruleTimeExprA
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTimeExprMultiplicationAccess().getRightTimeExprAParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_right_3_0=ruleTimeExprA();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTimeExprMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.csec.xtext.Vsdl.TimeExprA");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeExprMultiplication"


    // $ANTLR start "entryRuleTimeExprA"
    // InternalVsdl.g:3367:1: entryRuleTimeExprA returns [EObject current=null] : iv_ruleTimeExprA= ruleTimeExprA EOF ;
    public final EObject entryRuleTimeExprA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprA = null;


        try {
            // InternalVsdl.g:3367:50: (iv_ruleTimeExprA= ruleTimeExprA EOF )
            // InternalVsdl.g:3368:2: iv_ruleTimeExprA= ruleTimeExprA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeExprARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeExprA=ruleTimeExprA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeExprA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeExprA"


    // $ANTLR start "ruleTimeExprA"
    // InternalVsdl.g:3374:1: ruleTimeExprA returns [EObject current=null] : ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) ) ;
    public final EObject ruleTimeExprA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;
        EObject this_TimeExpr_1 = null;

        EObject lv_interval_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3380:2: ( ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) ) )
            // InternalVsdl.g:3381:2: ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) )
            {
            // InternalVsdl.g:3381:2: ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                alt34=2;
                }
                break;
            case RULE_INT:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalVsdl.g:3382:3: (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' )
                    {
                    // InternalVsdl.g:3382:3: (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' )
                    // InternalVsdl.g:3383:4: otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTimeExprAAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTimeExprAAccess().getTimeExprParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_TimeExpr_1=ruleTimeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TimeExpr_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTimeExprAAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3401:3: ( (lv_variable_3_0= RULE_ID ) )
                    {
                    // InternalVsdl.g:3401:3: ( (lv_variable_3_0= RULE_ID ) )
                    // InternalVsdl.g:3402:4: (lv_variable_3_0= RULE_ID )
                    {
                    // InternalVsdl.g:3402:4: (lv_variable_3_0= RULE_ID )
                    // InternalVsdl.g:3403:5: lv_variable_3_0= RULE_ID
                    {
                    lv_variable_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_3_0, grammarAccess.getTimeExprAAccess().getVariableIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeExprARule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_3_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3420:3: ( (lv_interval_4_0= ruleTimeInterval ) )
                    {
                    // InternalVsdl.g:3420:3: ( (lv_interval_4_0= ruleTimeInterval ) )
                    // InternalVsdl.g:3421:4: (lv_interval_4_0= ruleTimeInterval )
                    {
                    // InternalVsdl.g:3421:4: (lv_interval_4_0= ruleTimeInterval )
                    // InternalVsdl.g:3422:5: lv_interval_4_0= ruleTimeInterval
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTimeExprAAccess().getIntervalTimeIntervalParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_interval_4_0=ruleTimeInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTimeExprARule());
                      					}
                      					set(
                      						current,
                      						"interval",
                      						lv_interval_4_0,
                      						"it.csec.xtext.Vsdl.TimeInterval");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeExprA"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalVsdl.g:3443:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalVsdl.g:3443:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalVsdl.g:3444:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeInterval; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalVsdl.g:3450:1: ruleTimeInterval returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:3456:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalVsdl.g:3457:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalVsdl.g:3457:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3458:3: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3458:3: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3459:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getTimeIntervalAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTimeIntervalRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleCPUFrequency"
    // InternalVsdl.g:3478:1: entryRuleCPUFrequency returns [EObject current=null] : iv_ruleCPUFrequency= ruleCPUFrequency EOF ;
    public final EObject entryRuleCPUFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPUFrequency = null;


        try {
            // InternalVsdl.g:3478:53: (iv_ruleCPUFrequency= ruleCPUFrequency EOF )
            // InternalVsdl.g:3479:2: iv_ruleCPUFrequency= ruleCPUFrequency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCPUFrequencyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCPUFrequency=ruleCPUFrequency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCPUFrequency; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCPUFrequency"


    // $ANTLR start "ruleCPUFrequency"
    // InternalVsdl.g:3485:1: ruleCPUFrequency returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) ) ;
    public final EObject ruleCPUFrequency() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3491:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) ) )
            // InternalVsdl.g:3492:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) )
            {
            // InternalVsdl.g:3492:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) )
            // InternalVsdl.g:3493:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) )
            {
            // InternalVsdl.g:3493:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3494:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3494:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3495:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getCPUFrequencyAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCPUFrequencyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalVsdl.g:3511:3: ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) )
            // InternalVsdl.g:3512:4: ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) )
            {
            // InternalVsdl.g:3512:4: ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) )
            // InternalVsdl.g:3513:5: (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' )
            {
            // InternalVsdl.g:3513:5: (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt35=1;
                }
                break;
            case 75:
                {
                alt35=2;
                }
                break;
            case 76:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalVsdl.g:3514:6: lv_unit_1_1= 'MHz'
                    {
                    lv_unit_1_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_1, grammarAccess.getCPUFrequencyAccess().getUnitMHzKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCPUFrequencyRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3525:6: lv_unit_1_2= 'GHz'
                    {
                    lv_unit_1_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_2, grammarAccess.getCPUFrequencyAccess().getUnitGHzKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCPUFrequencyRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3536:6: lv_unit_1_3= 'THz'
                    {
                    lv_unit_1_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_3, grammarAccess.getCPUFrequencyAccess().getUnitTHzKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCPUFrequencyRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCPUFrequency"


    // $ANTLR start "entryRuleDiskSize"
    // InternalVsdl.g:3553:1: entryRuleDiskSize returns [EObject current=null] : iv_ruleDiskSize= ruleDiskSize EOF ;
    public final EObject entryRuleDiskSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSize = null;


        try {
            // InternalVsdl.g:3553:49: (iv_ruleDiskSize= ruleDiskSize EOF )
            // InternalVsdl.g:3554:2: iv_ruleDiskSize= ruleDiskSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiskSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDiskSize=ruleDiskSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiskSize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDiskSize"


    // $ANTLR start "ruleDiskSize"
    // InternalVsdl.g:3560:1: ruleDiskSize returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) ;
    public final EObject ruleDiskSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3566:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) )
            // InternalVsdl.g:3567:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            {
            // InternalVsdl.g:3567:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            // InternalVsdl.g:3568:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            {
            // InternalVsdl.g:3568:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3569:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3569:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3570:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getDiskSizeAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDiskSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalVsdl.g:3586:3: ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            // InternalVsdl.g:3587:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            {
            // InternalVsdl.g:3587:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            // InternalVsdl.g:3588:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            {
            // InternalVsdl.g:3588:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt36=1;
                }
                break;
            case 78:
                {
                alt36=2;
                }
                break;
            case 79:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalVsdl.g:3589:6: lv_unit_1_1= 'MB'
                    {
                    lv_unit_1_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_1, grammarAccess.getDiskSizeAccess().getUnitMBKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDiskSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3600:6: lv_unit_1_2= 'GB'
                    {
                    lv_unit_1_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_2, grammarAccess.getDiskSizeAccess().getUnitGBKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDiskSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3611:6: lv_unit_1_3= 'TB'
                    {
                    lv_unit_1_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_3, grammarAccess.getDiskSizeAccess().getUnitTBKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDiskSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDiskSize"


    // $ANTLR start "entryRuleRamSize"
    // InternalVsdl.g:3628:1: entryRuleRamSize returns [EObject current=null] : iv_ruleRamSize= ruleRamSize EOF ;
    public final EObject entryRuleRamSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamSize = null;


        try {
            // InternalVsdl.g:3628:48: (iv_ruleRamSize= ruleRamSize EOF )
            // InternalVsdl.g:3629:2: iv_ruleRamSize= ruleRamSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRamSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRamSize=ruleRamSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRamSize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRamSize"


    // $ANTLR start "ruleRamSize"
    // InternalVsdl.g:3635:1: ruleRamSize returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) ;
    public final EObject ruleRamSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3641:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) )
            // InternalVsdl.g:3642:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            {
            // InternalVsdl.g:3642:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            // InternalVsdl.g:3643:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            {
            // InternalVsdl.g:3643:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3644:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3644:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3645:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getRamSizeAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRamSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalVsdl.g:3661:3: ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            // InternalVsdl.g:3662:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            {
            // InternalVsdl.g:3662:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            // InternalVsdl.g:3663:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            {
            // InternalVsdl.g:3663:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt37=1;
                }
                break;
            case 78:
                {
                alt37=2;
                }
                break;
            case 79:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalVsdl.g:3664:6: lv_unit_1_1= 'MB'
                    {
                    lv_unit_1_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_1, grammarAccess.getRamSizeAccess().getUnitMBKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRamSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3675:6: lv_unit_1_2= 'GB'
                    {
                    lv_unit_1_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_2, grammarAccess.getRamSizeAccess().getUnitGBKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRamSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3686:6: lv_unit_1_3= 'TB'
                    {
                    lv_unit_1_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unit_1_3, grammarAccess.getRamSizeAccess().getUnitTBKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRamSizeRule());
                      						}
                      						setWithLastConsumed(current, "unit", lv_unit_1_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRamSize"


    // $ANTLR start "entryRuleIPAddress"
    // InternalVsdl.g:3703:1: entryRuleIPAddress returns [EObject current=null] : iv_ruleIPAddress= ruleIPAddress EOF ;
    public final EObject entryRuleIPAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAddress = null;


        try {
            // InternalVsdl.g:3703:50: (iv_ruleIPAddress= ruleIPAddress EOF )
            // InternalVsdl.g:3704:2: iv_ruleIPAddress= ruleIPAddress EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIPAddressRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIPAddress=ruleIPAddress();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIPAddress; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIPAddress"


    // $ANTLR start "ruleIPAddress"
    // InternalVsdl.g:3710:1: ruleIPAddress returns [EObject current=null] : ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) ) ;
    public final EObject ruleIPAddress() throws RecognitionException {
        EObject current = null;

        Token lv_octet1_0_0=null;
        Token otherlv_1=null;
        Token lv_octet2_2_0=null;
        Token otherlv_3=null;
        Token lv_octet3_4_0=null;
        Token otherlv_5=null;
        Token lv_octet4_6_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:3716:2: ( ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) ) )
            // InternalVsdl.g:3717:2: ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) )
            {
            // InternalVsdl.g:3717:2: ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) )
            // InternalVsdl.g:3718:3: ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) )
            {
            // InternalVsdl.g:3718:3: ( (lv_octet1_0_0= RULE_INT ) )
            // InternalVsdl.g:3719:4: (lv_octet1_0_0= RULE_INT )
            {
            // InternalVsdl.g:3719:4: (lv_octet1_0_0= RULE_INT )
            // InternalVsdl.g:3720:5: lv_octet1_0_0= RULE_INT
            {
            lv_octet1_0_0=(Token)match(input,RULE_INT,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_octet1_0_0, grammarAccess.getIPAddressAccess().getOctet1INTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIPAddressRule());
              					}
              					setWithLastConsumed(
              						current,
              						"octet1",
              						lv_octet1_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIPAddressAccess().getFullStopKeyword_1());
              		
            }
            // InternalVsdl.g:3740:3: ( (lv_octet2_2_0= RULE_INT ) )
            // InternalVsdl.g:3741:4: (lv_octet2_2_0= RULE_INT )
            {
            // InternalVsdl.g:3741:4: (lv_octet2_2_0= RULE_INT )
            // InternalVsdl.g:3742:5: lv_octet2_2_0= RULE_INT
            {
            lv_octet2_2_0=(Token)match(input,RULE_INT,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_octet2_2_0, grammarAccess.getIPAddressAccess().getOctet2INTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIPAddressRule());
              					}
              					setWithLastConsumed(
              						current,
              						"octet2",
              						lv_octet2_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIPAddressAccess().getFullStopKeyword_3());
              		
            }
            // InternalVsdl.g:3762:3: ( (lv_octet3_4_0= RULE_INT ) )
            // InternalVsdl.g:3763:4: (lv_octet3_4_0= RULE_INT )
            {
            // InternalVsdl.g:3763:4: (lv_octet3_4_0= RULE_INT )
            // InternalVsdl.g:3764:5: lv_octet3_4_0= RULE_INT
            {
            lv_octet3_4_0=(Token)match(input,RULE_INT,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_octet3_4_0, grammarAccess.getIPAddressAccess().getOctet3INTTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIPAddressRule());
              					}
              					setWithLastConsumed(
              						current,
              						"octet3",
              						lv_octet3_4_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIPAddressAccess().getFullStopKeyword_5());
              		
            }
            // InternalVsdl.g:3784:3: ( (lv_octet4_6_0= RULE_INT ) )
            // InternalVsdl.g:3785:4: (lv_octet4_6_0= RULE_INT )
            {
            // InternalVsdl.g:3785:4: (lv_octet4_6_0= RULE_INT )
            // InternalVsdl.g:3786:5: lv_octet4_6_0= RULE_INT
            {
            lv_octet4_6_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_octet4_6_0, grammarAccess.getIPAddressAccess().getOctet4INTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIPAddressRule());
              					}
              					setWithLastConsumed(
              						current,
              						"octet4",
              						lv_octet4_6_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIPAddress"


    // $ANTLR start "entryRuleIPRangeA"
    // InternalVsdl.g:3806:1: entryRuleIPRangeA returns [EObject current=null] : iv_ruleIPRangeA= ruleIPRangeA EOF ;
    public final EObject entryRuleIPRangeA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPRangeA = null;


        try {
            // InternalVsdl.g:3806:49: (iv_ruleIPRangeA= ruleIPRangeA EOF )
            // InternalVsdl.g:3807:2: iv_ruleIPRangeA= ruleIPRangeA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIPRangeARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIPRangeA=ruleIPRangeA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIPRangeA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIPRangeA"


    // $ANTLR start "ruleIPRangeA"
    // InternalVsdl.g:3813:1: ruleIPRangeA returns [EObject current=null] : ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIPRangeA() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_bitmask_2_0=null;
        EObject lv_address_0_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3819:2: ( ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) ) )
            // InternalVsdl.g:3820:2: ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) )
            {
            // InternalVsdl.g:3820:2: ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) )
            // InternalVsdl.g:3821:3: ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) )
            {
            // InternalVsdl.g:3821:3: ( (lv_address_0_0= ruleIPAddress ) )
            // InternalVsdl.g:3822:4: (lv_address_0_0= ruleIPAddress )
            {
            // InternalVsdl.g:3822:4: (lv_address_0_0= ruleIPAddress )
            // InternalVsdl.g:3823:5: lv_address_0_0= ruleIPAddress
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIPRangeAAccess().getAddressIPAddressParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_address_0_0=ruleIPAddress();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIPRangeARule());
              					}
              					set(
              						current,
              						"address",
              						lv_address_0_0,
              						"it.csec.xtext.Vsdl.IPAddress");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIPRangeAAccess().getSolidusKeyword_1());
              		
            }
            // InternalVsdl.g:3844:3: ( (lv_bitmask_2_0= RULE_INT ) )
            // InternalVsdl.g:3845:4: (lv_bitmask_2_0= RULE_INT )
            {
            // InternalVsdl.g:3845:4: (lv_bitmask_2_0= RULE_INT )
            // InternalVsdl.g:3846:5: lv_bitmask_2_0= RULE_INT
            {
            lv_bitmask_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_bitmask_2_0, grammarAccess.getIPRangeAAccess().getBitmaskINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIPRangeARule());
              					}
              					setWithLastConsumed(
              						current,
              						"bitmask",
              						lv_bitmask_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIPRangeA"


    // $ANTLR start "entryRuleOSVersionE"
    // InternalVsdl.g:3866:1: entryRuleOSVersionE returns [String current=null] : iv_ruleOSVersionE= ruleOSVersionE EOF ;
    public final String entryRuleOSVersionE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOSVersionE = null;


        try {
            // InternalVsdl.g:3866:50: (iv_ruleOSVersionE= ruleOSVersionE EOF )
            // InternalVsdl.g:3867:2: iv_ruleOSVersionE= ruleOSVersionE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOSVersionERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOSVersionE=ruleOSVersionE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOSVersionE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOSVersionE"


    // $ANTLR start "ruleOSVersionE"
    // InternalVsdl.g:3873:1: ruleOSVersionE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' ) ;
    public final AntlrDatatypeRuleToken ruleOSVersionE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVsdl.g:3879:2: ( (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' ) )
            // InternalVsdl.g:3880:2: (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' )
            {
            // InternalVsdl.g:3880:2: (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt38=1;
                }
                break;
            case 82:
                {
                alt38=2;
                }
                break;
            case 83:
                {
                alt38=3;
                }
                break;
            case 84:
                {
                alt38=4;
                }
                break;
            case 85:
                {
                alt38=5;
                }
                break;
            case 86:
                {
                alt38=6;
                }
                break;
            case 87:
                {
                alt38=7;
                }
                break;
            case 88:
                {
                alt38=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalVsdl.g:3881:3: kw= 'WindowsXP'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindowsXPKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3887:3: kw= 'Windows7'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows7Keyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3893:3: kw= 'Windows8'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows8Keyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3899:3: kw= 'Windows10'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows10Keyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVsdl.g:3905:3: kw= 'Ubuntu14'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getUbuntu14Keyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVsdl.g:3911:3: kw= 'Ubuntu16'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getUbuntu16Keyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVsdl.g:3917:3: kw= 'Android-21'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getAndroid21Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVsdl.g:3923:3: kw= 'Android-19'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getAndroid19Keyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOSVersionE"


    // $ANTLR start "entryRuleOSFamilyE"
    // InternalVsdl.g:3932:1: entryRuleOSFamilyE returns [String current=null] : iv_ruleOSFamilyE= ruleOSFamilyE EOF ;
    public final String entryRuleOSFamilyE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOSFamilyE = null;


        try {
            // InternalVsdl.g:3932:49: (iv_ruleOSFamilyE= ruleOSFamilyE EOF )
            // InternalVsdl.g:3933:2: iv_ruleOSFamilyE= ruleOSFamilyE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOSFamilyERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOSFamilyE=ruleOSFamilyE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOSFamilyE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOSFamilyE"


    // $ANTLR start "ruleOSFamilyE"
    // InternalVsdl.g:3939:1: ruleOSFamilyE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' ) ;
    public final AntlrDatatypeRuleToken ruleOSFamilyE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVsdl.g:3945:2: ( (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' ) )
            // InternalVsdl.g:3946:2: (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' )
            {
            // InternalVsdl.g:3946:2: (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt39=1;
                }
                break;
            case 90:
                {
                alt39=2;
                }
                break;
            case 91:
                {
                alt39=3;
                }
                break;
            case 92:
                {
                alt39=4;
                }
                break;
            case 93:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalVsdl.g:3947:3: kw= 'Microsoft'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getMicrosoftKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3953:3: kw= 'Linux'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getLinuxKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3959:3: kw= 'OSx'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getOSxKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3965:3: kw= 'iOS'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getIOSKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVsdl.g:3971:3: kw= 'Android'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getAndroidKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOSFamilyE"


    // $ANTLR start "ruleHardwareProfile"
    // InternalVsdl.g:3980:1: ruleHardwareProfile returns [Enumerator current=null] : ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) ) ;
    public final Enumerator ruleHardwareProfile() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalVsdl.g:3986:2: ( ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) ) )
            // InternalVsdl.g:3987:2: ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) )
            {
            // InternalVsdl.g:3987:2: ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt40=1;
                }
                break;
            case 95:
                {
                alt40=2;
                }
                break;
            case 96:
                {
                alt40=3;
                }
                break;
            case 97:
                {
                alt40=4;
                }
                break;
            case 98:
                {
                alt40=5;
                }
                break;
            case 99:
                {
                alt40=6;
                }
                break;
            case 100:
                {
                alt40=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalVsdl.g:3988:3: (enumLiteral_0= 'tiny' )
                    {
                    // InternalVsdl.g:3988:3: (enumLiteral_0= 'tiny' )
                    // InternalVsdl.g:3989:4: enumLiteral_0= 'tiny'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getTinyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getHardwareProfileAccess().getTinyEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3996:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalVsdl.g:3996:3: (enumLiteral_1= 'medium' )
                    // InternalVsdl.g:3997:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getMediumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getHardwareProfileAccess().getMediumEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:4004:3: (enumLiteral_2= 'large' )
                    {
                    // InternalVsdl.g:4004:3: (enumLiteral_2= 'large' )
                    // InternalVsdl.g:4005:4: enumLiteral_2= 'large'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getLargeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getHardwareProfileAccess().getLargeEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVsdl.g:4012:3: (enumLiteral_3= 'mobile' )
                    {
                    // InternalVsdl.g:4012:3: (enumLiteral_3= 'mobile' )
                    // InternalVsdl.g:4013:4: enumLiteral_3= 'mobile'
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getMobileEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getHardwareProfileAccess().getMobileEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVsdl.g:4020:3: (enumLiteral_4= 'wearable' )
                    {
                    // InternalVsdl.g:4020:3: (enumLiteral_4= 'wearable' )
                    // InternalVsdl.g:4021:4: enumLiteral_4= 'wearable'
                    {
                    enumLiteral_4=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getWearableEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getHardwareProfileAccess().getWearableEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVsdl.g:4028:3: (enumLiteral_5= 'sensor' )
                    {
                    // InternalVsdl.g:4028:3: (enumLiteral_5= 'sensor' )
                    // InternalVsdl.g:4029:4: enumLiteral_5= 'sensor'
                    {
                    enumLiteral_5=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getSensorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getHardwareProfileAccess().getSensorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVsdl.g:4036:3: (enumLiteral_6= 'server' )
                    {
                    // InternalVsdl.g:4036:3: (enumLiteral_6= 'server' )
                    // InternalVsdl.g:4037:4: enumLiteral_6= 'server'
                    {
                    enumLiteral_6=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getServerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getHardwareProfileAccess().getServerEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHardwareProfile"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\31\1\32\2\42\1\uffff\1\33\4\uffff\2\33\10\uffff";
    static final String dfa_3s = "\1\46\1\37\2\44\1\uffff\1\40\4\uffff\2\40\10\uffff";
    static final String dfa_4s = "\4\uffff\1\15\1\uffff\1\2\1\3\1\6\1\7\2\uffff\1\12\1\13\1\4\1\1\1\5\1\10\1\11\1\14";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2\3\uffff\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\7",
            "\1\12\1\10\1\11",
            "\1\13\1\14\1\15",
            "",
            "\1\17\4\uffff\1\16",
            "",
            "",
            "",
            "",
            "\1\20\4\uffff\1\21",
            "\1\22\4\uffff\1\23",
            "",
            "",
            "",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "629:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x020000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002206202C2C010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L,0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002206202C28010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000001FC0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000003E000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0058000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400200000C2C000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400200000C28000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}