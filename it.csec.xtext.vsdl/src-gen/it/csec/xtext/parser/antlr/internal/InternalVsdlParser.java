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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'duration'", "'{'", "'}'", "'node'", "';'", "'['", "']'", "'->'", "'and'", "'or'", "'not'", "'('", "')'", "'cpu'", "'speed'", "'equal'", "'to'", "'faster'", "'than'", "'slower'", "'of'", "'disk'", "'size'", "'larger'", "'smaller'", "'ram'", "'flavour'", "'OS'", "'is'", "'family'", "'mounts'", "'software'", "'version'", "'with'", "','", "'config'", "'.'", "'='", "'network'", "'addresses'", "'range'", "'gateway'", "'has'", "'direct'", "'access'", "'the'", "'Internet'", "'connected'", "'IP'", "'at'", "'least'", "'after'", "'most'", "'before'", "'switch'", "'+'", "'-'", "'*'", "'MHz'", "'GHz'", "'THz'", "'MB'", "'GB'", "'TB'", "'/'", "'WindowsXP'", "'Windows7'", "'Windows8'", "'Windows10'", "'Ubuntu14'", "'Ubuntu16'", "'Android-21'", "'Android-19'", "'Microsoft'", "'Linux'", "'OSx'", "'iOS'", "'Android'", "'tiny'", "'medium'", "'large'", "'mobile'", "'wearable'", "'sensor'", "'server'"
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
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
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

                if ( (LA2_0==15||LA2_0==50) ) {
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
            else if ( (LA3_0==50) ) {
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

                if ( (LA4_0==15||LA4_0==17||(LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==33||(LA4_0>=37 && LA4_0<=38)||LA4_0==42) ) {
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
            else if ( (LA5_0==15||(LA5_0>=22 && LA5_0<=23)||LA5_0==25||LA5_0==33||(LA5_0>=37 && LA5_0<=38)||LA5_0==42) ) {
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
            else if ( (LA8_0==15||LA8_0==23||LA8_0==25||LA8_0==33||(LA8_0>=37 && LA8_0<=38)||LA8_0==42) ) {
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
    // InternalVsdl.g:558:1: ruleSimpleNodeConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA ) ;
    public final EObject ruleSimpleNodeConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SimpleNodeConstraint_1 = null;

        EObject this_NodeHardwareConstraintA_3 = null;

        EObject this_NodeSoftwareConstraintA_4 = null;



        	enterRule();

        try {
            // InternalVsdl.g:564:2: ( ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA ) )
            // InternalVsdl.g:565:2: ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA )
            {
            // InternalVsdl.g:565:2: ( (otherlv_0= '(' this_SimpleNodeConstraint_1= ruleSimpleNodeConstraint otherlv_2= ')' ) | this_NodeHardwareConstraintA_3= ruleNodeHardwareConstraintA | this_NodeSoftwareConstraintA_4= ruleNodeSoftwareConstraintA )
            int alt9=3;
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
            case 42:
                {
                alt9=3;
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
    // InternalVsdl.g:606:1: entryRuleNodeHardwareConstraintA returns [EObject current=null] : iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF ;
    public final EObject entryRuleNodeHardwareConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeHardwareConstraintA = null;


        try {
            // InternalVsdl.g:606:64: (iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF )
            // InternalVsdl.g:607:2: iv_ruleNodeHardwareConstraintA= ruleNodeHardwareConstraintA EOF
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
    // InternalVsdl.g:613:1: ruleNodeHardwareConstraintA returns [EObject current=null] : ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) ) ;
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
            // InternalVsdl.g:619:2: ( ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) ) )
            // InternalVsdl.g:620:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )
            {
            // InternalVsdl.g:620:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )
            int alt10=13;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalVsdl.g:621:3: ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:621:3: ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:622:4: () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:622:4: ()
                    // InternalVsdl.g:623:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:629:4: ( ( 'cpu' )=>otherlv_1= 'cpu' )
                    // InternalVsdl.g:630:5: ( 'cpu' )=>otherlv_1= 'cpu'
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
                    // InternalVsdl.g:640:4: ( (lv_op_3_0= 'equal' ) )
                    // InternalVsdl.g:641:5: (lv_op_3_0= 'equal' )
                    {
                    // InternalVsdl.g:641:5: (lv_op_3_0= 'equal' )
                    // InternalVsdl.g:642:6: lv_op_3_0= 'equal'
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
                    // InternalVsdl.g:658:4: ( (lv_value_5_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:659:5: (lv_value_5_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:659:5: (lv_value_5_0= ruleCPUFrequency )
                    // InternalVsdl.g:660:6: lv_value_5_0= ruleCPUFrequency
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
                    // InternalVsdl.g:679:3: ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:679:3: ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:680:4: () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:680:4: ()
                    // InternalVsdl.g:681:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:687:4: ( ( 'cpu' )=>otherlv_7= 'cpu' )
                    // InternalVsdl.g:688:5: ( 'cpu' )=>otherlv_7= 'cpu'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_1_1());
                      				
                    }

                    }

                    // InternalVsdl.g:694:4: ( (lv_op_8_0= 'faster' ) )
                    // InternalVsdl.g:695:5: (lv_op_8_0= 'faster' )
                    {
                    // InternalVsdl.g:695:5: (lv_op_8_0= 'faster' )
                    // InternalVsdl.g:696:6: lv_op_8_0= 'faster'
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
                    // InternalVsdl.g:712:4: ( (lv_value_10_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:713:5: (lv_value_10_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:713:5: (lv_value_10_0= ruleCPUFrequency )
                    // InternalVsdl.g:714:6: lv_value_10_0= ruleCPUFrequency
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
                    // InternalVsdl.g:733:3: ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) )
                    {
                    // InternalVsdl.g:733:3: ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) )
                    // InternalVsdl.g:734:4: () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) )
                    {
                    // InternalVsdl.g:734:4: ()
                    // InternalVsdl.g:735:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:741:4: ( ( 'cpu' )=>otherlv_12= 'cpu' )
                    // InternalVsdl.g:742:5: ( 'cpu' )=>otherlv_12= 'cpu'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getNodeHardwareConstraintAAccess().getCpuKeyword_2_1());
                      				
                    }

                    }

                    // InternalVsdl.g:748:4: ( (lv_op_13_0= 'slower' ) )
                    // InternalVsdl.g:749:5: (lv_op_13_0= 'slower' )
                    {
                    // InternalVsdl.g:749:5: (lv_op_13_0= 'slower' )
                    // InternalVsdl.g:750:6: lv_op_13_0= 'slower'
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
                    // InternalVsdl.g:766:4: ( (lv_value_15_0= ruleCPUFrequency ) )
                    // InternalVsdl.g:767:5: (lv_value_15_0= ruleCPUFrequency )
                    {
                    // InternalVsdl.g:767:5: (lv_value_15_0= ruleCPUFrequency )
                    // InternalVsdl.g:768:6: lv_value_15_0= ruleCPUFrequency
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
                    // InternalVsdl.g:787:3: ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:787:3: ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) )
                    // InternalVsdl.g:788:4: () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) )
                    {
                    // InternalVsdl.g:788:4: ()
                    // InternalVsdl.g:789:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getCPUAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:795:4: ( ( 'cpu' )=>otherlv_17= 'cpu' )
                    // InternalVsdl.g:796:5: ( 'cpu' )=>otherlv_17= 'cpu'
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
                    // InternalVsdl.g:806:4: ( (lv_sameas_19_0= 'of' ) )
                    // InternalVsdl.g:807:5: (lv_sameas_19_0= 'of' )
                    {
                    // InternalVsdl.g:807:5: (lv_sameas_19_0= 'of' )
                    // InternalVsdl.g:808:6: lv_sameas_19_0= 'of'
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

                    // InternalVsdl.g:820:4: ( (otherlv_20= RULE_ID ) )
                    // InternalVsdl.g:821:5: (otherlv_20= RULE_ID )
                    {
                    // InternalVsdl.g:821:5: (otherlv_20= RULE_ID )
                    // InternalVsdl.g:822:6: otherlv_20= RULE_ID
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
                    // InternalVsdl.g:835:3: ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:835:3: ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:836:4: () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:836:4: ()
                    // InternalVsdl.g:837:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:843:4: ( ( 'disk' )=>otherlv_22= 'disk' )
                    // InternalVsdl.g:844:5: ( 'disk' )=>otherlv_22= 'disk'
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
                    // InternalVsdl.g:854:4: ( (lv_op_24_0= 'equal' ) )
                    // InternalVsdl.g:855:5: (lv_op_24_0= 'equal' )
                    {
                    // InternalVsdl.g:855:5: (lv_op_24_0= 'equal' )
                    // InternalVsdl.g:856:6: lv_op_24_0= 'equal'
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
                    // InternalVsdl.g:872:4: ( (lv_value_26_0= ruleDiskSize ) )
                    // InternalVsdl.g:873:5: (lv_value_26_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:873:5: (lv_value_26_0= ruleDiskSize )
                    // InternalVsdl.g:874:6: lv_value_26_0= ruleDiskSize
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
                    // InternalVsdl.g:893:3: ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:893:3: ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:894:4: () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:894:4: ()
                    // InternalVsdl.g:895:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:901:4: ( ( 'disk' )=>otherlv_28= 'disk' )
                    // InternalVsdl.g:902:5: ( 'disk' )=>otherlv_28= 'disk'
                    {
                    otherlv_28=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_5_1());
                      				
                    }

                    }

                    // InternalVsdl.g:908:4: ( (lv_op_29_0= 'larger' ) )
                    // InternalVsdl.g:909:5: (lv_op_29_0= 'larger' )
                    {
                    // InternalVsdl.g:909:5: (lv_op_29_0= 'larger' )
                    // InternalVsdl.g:910:6: lv_op_29_0= 'larger'
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
                    // InternalVsdl.g:926:4: ( (lv_value_31_0= ruleDiskSize ) )
                    // InternalVsdl.g:927:5: (lv_value_31_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:927:5: (lv_value_31_0= ruleDiskSize )
                    // InternalVsdl.g:928:6: lv_value_31_0= ruleDiskSize
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
                    // InternalVsdl.g:947:3: ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) )
                    {
                    // InternalVsdl.g:947:3: ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) )
                    // InternalVsdl.g:948:4: () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) )
                    {
                    // InternalVsdl.g:948:4: ()
                    // InternalVsdl.g:949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:955:4: ( ( 'disk' )=>otherlv_33= 'disk' )
                    // InternalVsdl.g:956:5: ( 'disk' )=>otherlv_33= 'disk'
                    {
                    otherlv_33=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_33, grammarAccess.getNodeHardwareConstraintAAccess().getDiskKeyword_6_1());
                      				
                    }

                    }

                    // InternalVsdl.g:962:4: ( (lv_op_34_0= 'smaller' ) )
                    // InternalVsdl.g:963:5: (lv_op_34_0= 'smaller' )
                    {
                    // InternalVsdl.g:963:5: (lv_op_34_0= 'smaller' )
                    // InternalVsdl.g:964:6: lv_op_34_0= 'smaller'
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
                    // InternalVsdl.g:980:4: ( (lv_value_36_0= ruleDiskSize ) )
                    // InternalVsdl.g:981:5: (lv_value_36_0= ruleDiskSize )
                    {
                    // InternalVsdl.g:981:5: (lv_value_36_0= ruleDiskSize )
                    // InternalVsdl.g:982:6: lv_value_36_0= ruleDiskSize
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
                    // InternalVsdl.g:1001:3: ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:1001:3: ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) )
                    // InternalVsdl.g:1002:4: () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) )
                    {
                    // InternalVsdl.g:1002:4: ()
                    // InternalVsdl.g:1003:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getDiskAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1009:4: ( ( 'disk' )=>otherlv_38= 'disk' )
                    // InternalVsdl.g:1010:5: ( 'disk' )=>otherlv_38= 'disk'
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
                    // InternalVsdl.g:1020:4: ( (lv_sameas_40_0= 'of' ) )
                    // InternalVsdl.g:1021:5: (lv_sameas_40_0= 'of' )
                    {
                    // InternalVsdl.g:1021:5: (lv_sameas_40_0= 'of' )
                    // InternalVsdl.g:1022:6: lv_sameas_40_0= 'of'
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

                    // InternalVsdl.g:1034:4: ( (otherlv_41= RULE_ID ) )
                    // InternalVsdl.g:1035:5: (otherlv_41= RULE_ID )
                    {
                    // InternalVsdl.g:1035:5: (otherlv_41= RULE_ID )
                    // InternalVsdl.g:1036:6: otherlv_41= RULE_ID
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
                    // InternalVsdl.g:1049:3: ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1049:3: ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1050:4: () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1050:4: ()
                    // InternalVsdl.g:1051:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1057:4: ( ( 'ram' )=>otherlv_43= 'ram' )
                    // InternalVsdl.g:1058:5: ( 'ram' )=>otherlv_43= 'ram'
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
                    // InternalVsdl.g:1068:4: ( (lv_op_45_0= 'equal' ) )
                    // InternalVsdl.g:1069:5: (lv_op_45_0= 'equal' )
                    {
                    // InternalVsdl.g:1069:5: (lv_op_45_0= 'equal' )
                    // InternalVsdl.g:1070:6: lv_op_45_0= 'equal'
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
                    // InternalVsdl.g:1086:4: ( (lv_value_47_0= ruleRamSize ) )
                    // InternalVsdl.g:1087:5: (lv_value_47_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1087:5: (lv_value_47_0= ruleRamSize )
                    // InternalVsdl.g:1088:6: lv_value_47_0= ruleRamSize
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
                    // InternalVsdl.g:1107:3: ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1107:3: ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1108:4: () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1108:4: ()
                    // InternalVsdl.g:1109:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1115:4: ( ( 'ram' )=>otherlv_49= 'ram' )
                    // InternalVsdl.g:1116:5: ( 'ram' )=>otherlv_49= 'ram'
                    {
                    otherlv_49=(Token)match(input,37,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_49, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_9_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1122:4: ( (lv_op_50_0= 'larger' ) )
                    // InternalVsdl.g:1123:5: (lv_op_50_0= 'larger' )
                    {
                    // InternalVsdl.g:1123:5: (lv_op_50_0= 'larger' )
                    // InternalVsdl.g:1124:6: lv_op_50_0= 'larger'
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
                    // InternalVsdl.g:1140:4: ( (lv_value_52_0= ruleRamSize ) )
                    // InternalVsdl.g:1141:5: (lv_value_52_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1141:5: (lv_value_52_0= ruleRamSize )
                    // InternalVsdl.g:1142:6: lv_value_52_0= ruleRamSize
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
                    // InternalVsdl.g:1161:3: ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) )
                    {
                    // InternalVsdl.g:1161:3: ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) )
                    // InternalVsdl.g:1162:4: () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) )
                    {
                    // InternalVsdl.g:1162:4: ()
                    // InternalVsdl.g:1163:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1169:4: ( ( 'ram' )=>otherlv_54= 'ram' )
                    // InternalVsdl.g:1170:5: ( 'ram' )=>otherlv_54= 'ram'
                    {
                    otherlv_54=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_54, grammarAccess.getNodeHardwareConstraintAAccess().getRamKeyword_10_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1176:4: ( (lv_op_55_0= 'smaller' ) )
                    // InternalVsdl.g:1177:5: (lv_op_55_0= 'smaller' )
                    {
                    // InternalVsdl.g:1177:5: (lv_op_55_0= 'smaller' )
                    // InternalVsdl.g:1178:6: lv_op_55_0= 'smaller'
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
                    // InternalVsdl.g:1194:4: ( (lv_value_57_0= ruleRamSize ) )
                    // InternalVsdl.g:1195:5: (lv_value_57_0= ruleRamSize )
                    {
                    // InternalVsdl.g:1195:5: (lv_value_57_0= ruleRamSize )
                    // InternalVsdl.g:1196:6: lv_value_57_0= ruleRamSize
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
                    // InternalVsdl.g:1215:3: ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) )
                    {
                    // InternalVsdl.g:1215:3: ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) )
                    // InternalVsdl.g:1216:4: () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) )
                    {
                    // InternalVsdl.g:1216:4: ()
                    // InternalVsdl.g:1217:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getRamAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1223:4: ( ( 'ram' )=>otherlv_59= 'ram' )
                    // InternalVsdl.g:1224:5: ( 'ram' )=>otherlv_59= 'ram'
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
                    // InternalVsdl.g:1234:4: ( (lv_sameas_61_0= 'of' ) )
                    // InternalVsdl.g:1235:5: (lv_sameas_61_0= 'of' )
                    {
                    // InternalVsdl.g:1235:5: (lv_sameas_61_0= 'of' )
                    // InternalVsdl.g:1236:6: lv_sameas_61_0= 'of'
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

                    // InternalVsdl.g:1248:4: ( (otherlv_62= RULE_ID ) )
                    // InternalVsdl.g:1249:5: (otherlv_62= RULE_ID )
                    {
                    // InternalVsdl.g:1249:5: (otherlv_62= RULE_ID )
                    // InternalVsdl.g:1250:6: otherlv_62= RULE_ID
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
                    // InternalVsdl.g:1263:3: ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) )
                    {
                    // InternalVsdl.g:1263:3: ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) )
                    // InternalVsdl.g:1264:4: () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) )
                    {
                    // InternalVsdl.g:1264:4: ()
                    // InternalVsdl.g:1265:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeHardwareConstraintAAccess().getFlavourAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1271:4: ( ( 'flavour' )=>otherlv_64= 'flavour' )
                    // InternalVsdl.g:1272:5: ( 'flavour' )=>otherlv_64= 'flavour'
                    {
                    otherlv_64=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_64, grammarAccess.getNodeHardwareConstraintAAccess().getFlavourKeyword_12_1());
                      				
                    }

                    }

                    // InternalVsdl.g:1278:4: ( (lv_profile_65_0= ruleHardwareProfile ) )
                    // InternalVsdl.g:1279:5: (lv_profile_65_0= ruleHardwareProfile )
                    {
                    // InternalVsdl.g:1279:5: (lv_profile_65_0= ruleHardwareProfile )
                    // InternalVsdl.g:1280:6: lv_profile_65_0= ruleHardwareProfile
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


    // $ANTLR start "entryRuleNodeSoftwareConstraintA"
    // InternalVsdl.g:1302:1: entryRuleNodeSoftwareConstraintA returns [EObject current=null] : iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF ;
    public final EObject entryRuleNodeSoftwareConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSoftwareConstraintA = null;


        try {
            // InternalVsdl.g:1302:64: (iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF )
            // InternalVsdl.g:1303:2: iv_ruleNodeSoftwareConstraintA= ruleNodeSoftwareConstraintA EOF
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
    // InternalVsdl.g:1309:1: ruleNodeSoftwareConstraintA returns [EObject current=null] : ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) ) ;
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
            // InternalVsdl.g:1315:2: ( ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) ) )
            // InternalVsdl.g:1316:2: ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) )
            {
            // InternalVsdl.g:1316:2: ( (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) ) | (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) ) | (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==39) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==40) ) {
                        alt11=1;
                    }
                    else if ( (LA11_3==41) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==42) ) {
                alt11=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVsdl.g:1317:3: (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) )
                    {
                    // InternalVsdl.g:1317:3: (otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) ) )
                    // InternalVsdl.g:1318:4: otherlv_0= 'node' () ( ( 'OS' )=>otherlv_2= 'OS' ) otherlv_3= 'is' ( (lv_version_4_0= ruleOSVersionE ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getNodeSoftwareConstraintAAccess().getNodeKeyword_0_0());
                      			
                    }
                    // InternalVsdl.g:1322:4: ()
                    // InternalVsdl.g:1323:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeSoftwareConstraintAAccess().getOSAction_0_1(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1329:4: ( ( 'OS' )=>otherlv_2= 'OS' )
                    // InternalVsdl.g:1330:5: ( 'OS' )=>otherlv_2= 'OS'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNodeSoftwareConstraintAAccess().getOSKeyword_0_2());
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNodeSoftwareConstraintAAccess().getIsKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:1340:4: ( (lv_version_4_0= ruleOSVersionE ) )
                    // InternalVsdl.g:1341:5: (lv_version_4_0= ruleOSVersionE )
                    {
                    // InternalVsdl.g:1341:5: (lv_version_4_0= ruleOSVersionE )
                    // InternalVsdl.g:1342:6: lv_version_4_0= ruleOSVersionE
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
                    // InternalVsdl.g:1361:3: (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) )
                    {
                    // InternalVsdl.g:1361:3: (otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) ) )
                    // InternalVsdl.g:1362:4: otherlv_5= 'node' otherlv_6= 'OS' () ( ( 'family' )=>otherlv_8= 'family' ) otherlv_9= 'is' ( (lv_family_10_0= ruleOSFamilyE ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNodeSoftwareConstraintAAccess().getNodeKeyword_1_0());
                      			
                    }
                    otherlv_6=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getNodeSoftwareConstraintAAccess().getOSKeyword_1_1());
                      			
                    }
                    // InternalVsdl.g:1370:4: ()
                    // InternalVsdl.g:1371:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNodeSoftwareConstraintAAccess().getOSFamilyAction_1_2(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:1377:4: ( ( 'family' )=>otherlv_8= 'family' )
                    // InternalVsdl.g:1378:5: ( 'family' )=>otherlv_8= 'family'
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getNodeSoftwareConstraintAAccess().getFamilyKeyword_1_3());
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNodeSoftwareConstraintAAccess().getIsKeyword_1_4());
                      			
                    }
                    // InternalVsdl.g:1388:4: ( (lv_family_10_0= ruleOSFamilyE ) )
                    // InternalVsdl.g:1389:5: (lv_family_10_0= ruleOSFamilyE )
                    {
                    // InternalVsdl.g:1389:5: (lv_family_10_0= ruleOSFamilyE )
                    // InternalVsdl.g:1390:6: lv_family_10_0= ruleOSFamilyE
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
                    // InternalVsdl.g:1409:3: (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) )
                    {
                    // InternalVsdl.g:1409:3: (otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) ) )
                    // InternalVsdl.g:1410:4: otherlv_11= 'mounts' otherlv_12= 'software' ( (lv_software_13_0= ruleSoftwareInstallation ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getNodeSoftwareConstraintAAccess().getMountsKeyword_2_0());
                      			
                    }
                    otherlv_12=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getNodeSoftwareConstraintAAccess().getSoftwareKeyword_2_1());
                      			
                    }
                    // InternalVsdl.g:1418:4: ( (lv_software_13_0= ruleSoftwareInstallation ) )
                    // InternalVsdl.g:1419:5: (lv_software_13_0= ruleSoftwareInstallation )
                    {
                    // InternalVsdl.g:1419:5: (lv_software_13_0= ruleSoftwareInstallation )
                    // InternalVsdl.g:1420:6: lv_software_13_0= ruleSoftwareInstallation
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
    // InternalVsdl.g:1442:1: entryRuleSoftwareInstallation returns [EObject current=null] : iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF ;
    public final EObject entryRuleSoftwareInstallation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareInstallation = null;


        try {
            // InternalVsdl.g:1442:61: (iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF )
            // InternalVsdl.g:1443:2: iv_ruleSoftwareInstallation= ruleSoftwareInstallation EOF
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
    // InternalVsdl.g:1449:1: ruleSoftwareInstallation returns [EObject current=null] : ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? ) ;
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
            // InternalVsdl.g:1455:2: ( ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? ) )
            // InternalVsdl.g:1456:2: ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? )
            {
            // InternalVsdl.g:1456:2: ( ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )? )
            // InternalVsdl.g:1457:3: ( (lv_softwareID_0_0= RULE_ID ) ) (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )? (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )? (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )?
            {
            // InternalVsdl.g:1457:3: ( (lv_softwareID_0_0= RULE_ID ) )
            // InternalVsdl.g:1458:4: (lv_softwareID_0_0= RULE_ID )
            {
            // InternalVsdl.g:1458:4: (lv_softwareID_0_0= RULE_ID )
            // InternalVsdl.g:1459:5: lv_softwareID_0_0= RULE_ID
            {
            lv_softwareID_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
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

            // InternalVsdl.g:1475:3: (otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVsdl.g:1476:4: otherlv_1= 'version' ( (lv_version_2_0= ruleVersionNumber ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSoftwareInstallationAccess().getVersionKeyword_1_0());
                      			
                    }
                    // InternalVsdl.g:1480:4: ( (lv_version_2_0= ruleVersionNumber ) )
                    // InternalVsdl.g:1481:5: (lv_version_2_0= ruleVersionNumber )
                    {
                    // InternalVsdl.g:1481:5: (lv_version_2_0= ruleVersionNumber )
                    // InternalVsdl.g:1482:6: lv_version_2_0= ruleVersionNumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getVersionVersionNumberParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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

            // InternalVsdl.g:1500:3: (otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVsdl.g:1501:4: otherlv_3= 'with' ( (lv_dependencies_4_0= ruleSoftwareDependency ) ) (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )*
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSoftwareInstallationAccess().getWithKeyword_2_0());
                      			
                    }
                    // InternalVsdl.g:1505:4: ( (lv_dependencies_4_0= ruleSoftwareDependency ) )
                    // InternalVsdl.g:1506:5: (lv_dependencies_4_0= ruleSoftwareDependency )
                    {
                    // InternalVsdl.g:1506:5: (lv_dependencies_4_0= ruleSoftwareDependency )
                    // InternalVsdl.g:1507:6: lv_dependencies_4_0= ruleSoftwareDependency
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getDependenciesSoftwareDependencyParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    // InternalVsdl.g:1524:4: (otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==46) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalVsdl.g:1525:5: otherlv_5= ',' ( (lv_dependencies_6_0= ruleSoftwareDependency ) )
                    	    {
                    	    otherlv_5=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getSoftwareInstallationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalVsdl.g:1529:5: ( (lv_dependencies_6_0= ruleSoftwareDependency ) )
                    	    // InternalVsdl.g:1530:6: (lv_dependencies_6_0= ruleSoftwareDependency )
                    	    {
                    	    // InternalVsdl.g:1530:6: (lv_dependencies_6_0= ruleSoftwareDependency )
                    	    // InternalVsdl.g:1531:7: lv_dependencies_6_0= ruleSoftwareDependency
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSoftwareInstallationAccess().getDependenciesSoftwareDependencyParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVsdl.g:1550:3: (otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVsdl.g:1551:4: otherlv_7= 'config' ( (lv_config_8_0= ruleConfigOptions ) )
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSoftwareInstallationAccess().getConfigKeyword_3_0());
                      			
                    }
                    // InternalVsdl.g:1555:4: ( (lv_config_8_0= ruleConfigOptions ) )
                    // InternalVsdl.g:1556:5: (lv_config_8_0= ruleConfigOptions )
                    {
                    // InternalVsdl.g:1556:5: (lv_config_8_0= ruleConfigOptions )
                    // InternalVsdl.g:1557:6: lv_config_8_0= ruleConfigOptions
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
    // InternalVsdl.g:1579:1: entryRuleVersionNumber returns [String current=null] : iv_ruleVersionNumber= ruleVersionNumber EOF ;
    public final String entryRuleVersionNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionNumber = null;


        try {
            // InternalVsdl.g:1579:53: (iv_ruleVersionNumber= ruleVersionNumber EOF )
            // InternalVsdl.g:1580:2: iv_ruleVersionNumber= ruleVersionNumber EOF
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
    // InternalVsdl.g:1586:1: ruleVersionNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalVsdl.g:1592:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // InternalVsdl.g:1593:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // InternalVsdl.g:1593:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // InternalVsdl.g:1594:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getVersionNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalVsdl.g:1601:3: (kw= '.' this_INT_2= RULE_INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVsdl.g:1602:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionNumberAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_INT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_INT_2, grammarAccess.getVersionNumberAccess().getINTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalVsdl.g:1619:1: entryRuleSoftwareDependency returns [EObject current=null] : iv_ruleSoftwareDependency= ruleSoftwareDependency EOF ;
    public final EObject entryRuleSoftwareDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareDependency = null;


        try {
            // InternalVsdl.g:1619:59: (iv_ruleSoftwareDependency= ruleSoftwareDependency EOF )
            // InternalVsdl.g:1620:2: iv_ruleSoftwareDependency= ruleSoftwareDependency EOF
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
    // InternalVsdl.g:1626:1: ruleSoftwareDependency returns [EObject current=null] : ( (lv_dependencyID_0_0= RULE_ID ) ) ;
    public final EObject ruleSoftwareDependency() throws RecognitionException {
        EObject current = null;

        Token lv_dependencyID_0_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:1632:2: ( ( (lv_dependencyID_0_0= RULE_ID ) ) )
            // InternalVsdl.g:1633:2: ( (lv_dependencyID_0_0= RULE_ID ) )
            {
            // InternalVsdl.g:1633:2: ( (lv_dependencyID_0_0= RULE_ID ) )
            // InternalVsdl.g:1634:3: (lv_dependencyID_0_0= RULE_ID )
            {
            // InternalVsdl.g:1634:3: (lv_dependencyID_0_0= RULE_ID )
            // InternalVsdl.g:1635:4: lv_dependencyID_0_0= RULE_ID
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
    // InternalVsdl.g:1654:1: entryRuleConfigOptions returns [EObject current=null] : iv_ruleConfigOptions= ruleConfigOptions EOF ;
    public final EObject entryRuleConfigOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigOptions = null;


        try {
            // InternalVsdl.g:1654:54: (iv_ruleConfigOptions= ruleConfigOptions EOF )
            // InternalVsdl.g:1655:2: iv_ruleConfigOptions= ruleConfigOptions EOF
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
    // InternalVsdl.g:1661:1: ruleConfigOptions returns [EObject current=null] : (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleConfigOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_configPairs_1_0 = null;

        EObject lv_configPairs_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1667:2: ( (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' ) )
            // InternalVsdl.g:1668:2: (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' )
            {
            // InternalVsdl.g:1668:2: (otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}' )
            // InternalVsdl.g:1669:3: otherlv_0= '{' ( (lv_configPairs_1_0= ruleConfigPair ) ) (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigOptionsAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalVsdl.g:1673:3: ( (lv_configPairs_1_0= ruleConfigPair ) )
            // InternalVsdl.g:1674:4: (lv_configPairs_1_0= ruleConfigPair )
            {
            // InternalVsdl.g:1674:4: (lv_configPairs_1_0= ruleConfigPair )
            // InternalVsdl.g:1675:5: lv_configPairs_1_0= ruleConfigPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigOptionsAccess().getConfigPairsConfigPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalVsdl.g:1692:3: (otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVsdl.g:1693:4: otherlv_2= ',' ( (lv_configPairs_3_0= ruleConfigPair ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConfigOptionsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalVsdl.g:1697:4: ( (lv_configPairs_3_0= ruleConfigPair ) )
            	    // InternalVsdl.g:1698:5: (lv_configPairs_3_0= ruleConfigPair )
            	    {
            	    // InternalVsdl.g:1698:5: (lv_configPairs_3_0= ruleConfigPair )
            	    // InternalVsdl.g:1699:6: lv_configPairs_3_0= ruleConfigPair
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConfigOptionsAccess().getConfigPairsConfigPairParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop17;
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
    // InternalVsdl.g:1725:1: entryRuleConfigPair returns [EObject current=null] : iv_ruleConfigPair= ruleConfigPair EOF ;
    public final EObject entryRuleConfigPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigPair = null;


        try {
            // InternalVsdl.g:1725:51: (iv_ruleConfigPair= ruleConfigPair EOF )
            // InternalVsdl.g:1726:2: iv_ruleConfigPair= ruleConfigPair EOF
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
    // InternalVsdl.g:1732:1: ruleConfigPair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigPair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:1738:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalVsdl.g:1739:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalVsdl.g:1739:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalVsdl.g:1740:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalVsdl.g:1740:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalVsdl.g:1741:4: (lv_key_0_0= RULE_ID )
            {
            // InternalVsdl.g:1741:4: (lv_key_0_0= RULE_ID )
            // InternalVsdl.g:1742:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,49,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigPairAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalVsdl.g:1762:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalVsdl.g:1763:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalVsdl.g:1763:4: (lv_value_2_0= RULE_STRING )
            // InternalVsdl.g:1764:5: lv_value_2_0= RULE_STRING
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
    // InternalVsdl.g:1784:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalVsdl.g:1784:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalVsdl.g:1785:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalVsdl.g:1791:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1797:2: ( (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' ) )
            // InternalVsdl.g:1798:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' )
            {
            // InternalVsdl.g:1798:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}' )
            // InternalVsdl.g:1799:3: otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_constraints_3_0= ruleNetworkConstraint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
              		
            }
            // InternalVsdl.g:1803:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVsdl.g:1804:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVsdl.g:1804:4: (lv_name_1_0= RULE_ID )
            // InternalVsdl.g:1805:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalVsdl.g:1825:3: ( (lv_constraints_3_0= ruleNetworkConstraint ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15||LA18_0==17||(LA18_0>=22 && LA18_0<=23)||LA18_0==51||LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVsdl.g:1826:4: (lv_constraints_3_0= ruleNetworkConstraint )
            	    {
            	    // InternalVsdl.g:1826:4: (lv_constraints_3_0= ruleNetworkConstraint )
            	    // InternalVsdl.g:1827:5: lv_constraints_3_0= ruleNetworkConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNetworkAccess().getConstraintsNetworkConstraintParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop18;
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
    // InternalVsdl.g:1852:1: entryRuleNetworkConstraint returns [EObject current=null] : iv_ruleNetworkConstraint= ruleNetworkConstraint EOF ;
    public final EObject entryRuleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConstraint = null;


        try {
            // InternalVsdl.g:1852:58: (iv_ruleNetworkConstraint= ruleNetworkConstraint EOF )
            // InternalVsdl.g:1853:2: iv_ruleNetworkConstraint= ruleNetworkConstraint EOF
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
    // InternalVsdl.g:1859:1: ruleNetworkConstraint returns [EObject current=null] : ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) ) ;
    public final EObject ruleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_GuardedNetworkConstraint_0 = null;

        EObject this_SimpleNetworkConstraint_2 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1865:2: ( ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) ) )
            // InternalVsdl.g:1866:2: ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) )
            {
            // InternalVsdl.g:1866:2: ( (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' ) | (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==15||(LA19_0>=22 && LA19_0<=23)||LA19_0==51||LA19_0==53) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalVsdl.g:1867:3: (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' )
                    {
                    // InternalVsdl.g:1867:3: (this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';' )
                    // InternalVsdl.g:1868:4: this_GuardedNetworkConstraint_0= ruleGuardedNetworkConstraint otherlv_1= ';'
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
                    // InternalVsdl.g:1882:3: (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' )
                    {
                    // InternalVsdl.g:1882:3: (this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';' )
                    // InternalVsdl.g:1883:4: this_SimpleNetworkConstraint_2= ruleSimpleNetworkConstraint otherlv_3= ';'
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
    // InternalVsdl.g:1900:1: entryRuleGuardedNetworkConstraint returns [EObject current=null] : iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF ;
    public final EObject entryRuleGuardedNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedNetworkConstraint = null;


        try {
            // InternalVsdl.g:1900:65: (iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF )
            // InternalVsdl.g:1901:2: iv_ruleGuardedNetworkConstraint= ruleGuardedNetworkConstraint EOF
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
    // InternalVsdl.g:1907:1: ruleGuardedNetworkConstraint returns [EObject current=null] : (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) ) ;
    public final EObject ruleGuardedNetworkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_networktriggerconstraint_1_0 = null;

        EObject lv_networkconstraint_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1913:2: ( (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) ) )
            // InternalVsdl.g:1914:2: (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) )
            {
            // InternalVsdl.g:1914:2: (otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) ) )
            // InternalVsdl.g:1915:3: otherlv_0= '[' ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) ) otherlv_2= ']' otherlv_3= '->' ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuardedNetworkConstraintAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalVsdl.g:1919:3: ( (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint ) )
            // InternalVsdl.g:1920:4: (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint )
            {
            // InternalVsdl.g:1920:4: (lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint )
            // InternalVsdl.g:1921:5: lv_networktriggerconstraint_1_0= ruleUpdateTriggerConstraint
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
            otherlv_3=(Token)match(input,19,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuardedNetworkConstraintAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalVsdl.g:1946:3: ( (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint ) )
            // InternalVsdl.g:1947:4: (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint )
            {
            // InternalVsdl.g:1947:4: (lv_networkconstraint_4_0= ruleSimpleNetworkConstraint )
            // InternalVsdl.g:1948:5: lv_networkconstraint_4_0= ruleSimpleNetworkConstraint
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
    // InternalVsdl.g:1969:1: entryRuleSimpleNetworkConstraint returns [EObject current=null] : iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF ;
    public final EObject entryRuleSimpleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraint = null;


        try {
            // InternalVsdl.g:1969:64: (iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF )
            // InternalVsdl.g:1970:2: iv_ruleSimpleNetworkConstraint= ruleSimpleNetworkConstraint EOF
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
    // InternalVsdl.g:1976:1: ruleSimpleNetworkConstraint returns [EObject current=null] : this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr ;
    public final EObject ruleSimpleNetworkConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleNetworkConstraintAndOr_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:1982:2: (this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr )
            // InternalVsdl.g:1983:2: this_SimpleNetworkConstraintAndOr_0= ruleSimpleNetworkConstraintAndOr
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
    // InternalVsdl.g:1994:1: entryRuleSimpleNetworkConstraintAndOr returns [EObject current=null] : iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF ;
    public final EObject entryRuleSimpleNetworkConstraintAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintAndOr = null;


        try {
            // InternalVsdl.g:1994:69: (iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF )
            // InternalVsdl.g:1995:2: iv_ruleSimpleNetworkConstraintAndOr= ruleSimpleNetworkConstraintAndOr EOF
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
    // InternalVsdl.g:2001:1: ruleSimpleNetworkConstraintAndOr returns [EObject current=null] : (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* ) ;
    public final EObject ruleSimpleNetworkConstraintAndOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SimpleNetworkConstraintNot_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2007:2: ( (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* ) )
            // InternalVsdl.g:2008:2: (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* )
            {
            // InternalVsdl.g:2008:2: (this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )* )
            // InternalVsdl.g:2009:3: this_SimpleNetworkConstraintNot_0= ruleSimpleNetworkConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )*
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
            // InternalVsdl.g:2017:3: ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=20 && LA21_0<=21)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVsdl.g:2018:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) )
            	    {
            	    // InternalVsdl.g:2018:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) )
            	    // InternalVsdl.g:2019:5: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    {
            	    // InternalVsdl.g:2019:5: ()
            	    // InternalVsdl.g:2020:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSimpleNetworkConstraintAndOrAccess().getAndOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:2026:5: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // InternalVsdl.g:2027:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // InternalVsdl.g:2027:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // InternalVsdl.g:2028:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // InternalVsdl.g:2028:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==20) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==21) ) {
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
            	            // InternalVsdl.g:2029:8: lv_op_2_1= 'and'
            	            {
            	            lv_op_2_1=(Token)match(input,20,FOLLOW_41); if (state.failed) return current;
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
            	            // InternalVsdl.g:2040:8: lv_op_2_2= 'or'
            	            {
            	            lv_op_2_2=(Token)match(input,21,FOLLOW_41); if (state.failed) return current;
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

            	    // InternalVsdl.g:2054:4: ( (lv_right_3_0= ruleSimpleNetworkConstraintNot ) )
            	    // InternalVsdl.g:2055:5: (lv_right_3_0= ruleSimpleNetworkConstraintNot )
            	    {
            	    // InternalVsdl.g:2055:5: (lv_right_3_0= ruleSimpleNetworkConstraintNot )
            	    // InternalVsdl.g:2056:6: lv_right_3_0= ruleSimpleNetworkConstraintNot
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
            	    break loop21;
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
    // InternalVsdl.g:2078:1: entryRuleSimpleNetworkConstraintNot returns [EObject current=null] : iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF ;
    public final EObject entryRuleSimpleNetworkConstraintNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintNot = null;


        try {
            // InternalVsdl.g:2078:67: (iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF )
            // InternalVsdl.g:2079:2: iv_ruleSimpleNetworkConstraintNot= ruleSimpleNetworkConstraintNot EOF
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
    // InternalVsdl.g:2085:1: ruleSimpleNetworkConstraintNot returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA ) ;
    public final EObject ruleSimpleNetworkConstraintNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraint_2_0 = null;

        EObject this_SimpleNetworkConstraintA_3 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2091:2: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA ) )
            // InternalVsdl.g:2092:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA )
            {
            // InternalVsdl.g:2092:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) ) | this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            else if ( (LA22_0==15||LA22_0==23||LA22_0==51||LA22_0==53) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalVsdl.g:2093:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) )
                    {
                    // InternalVsdl.g:2093:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) ) )
                    // InternalVsdl.g:2094:4: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) )
                    {
                    // InternalVsdl.g:2094:4: ()
                    // InternalVsdl.g:2095:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleNetworkConstraintNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2101:4: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalVsdl.g:2102:5: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSimpleNetworkConstraintNotAccess().getNotKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2108:4: ( (lv_constraint_2_0= ruleSimpleNetworkConstraintA ) )
                    // InternalVsdl.g:2109:5: (lv_constraint_2_0= ruleSimpleNetworkConstraintA )
                    {
                    // InternalVsdl.g:2109:5: (lv_constraint_2_0= ruleSimpleNetworkConstraintA )
                    // InternalVsdl.g:2110:6: lv_constraint_2_0= ruleSimpleNetworkConstraintA
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
                    // InternalVsdl.g:2129:3: this_SimpleNetworkConstraintA_3= ruleSimpleNetworkConstraintA
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
    // InternalVsdl.g:2141:1: entryRuleSimpleNetworkConstraintA returns [EObject current=null] : iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF ;
    public final EObject entryRuleSimpleNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNetworkConstraintA = null;


        try {
            // InternalVsdl.g:2141:65: (iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF )
            // InternalVsdl.g:2142:2: iv_ruleSimpleNetworkConstraintA= ruleSimpleNetworkConstraintA EOF
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
    // InternalVsdl.g:2148:1: ruleSimpleNetworkConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint ) ;
    public final EObject ruleSimpleNetworkConstraintA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SimpleNetworkConstraint_1 = null;

        EObject this_NetworkGatewayConstraint_3 = null;

        EObject this_NetworkParticipantsConstraint_4 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2154:2: ( ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint ) )
            // InternalVsdl.g:2155:2: ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint )
            {
            // InternalVsdl.g:2155:2: ( (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' ) | this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint | this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt23=1;
                }
                break;
            case 51:
            case 53:
                {
                alt23=2;
                }
                break;
            case 15:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalVsdl.g:2156:3: (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' )
                    {
                    // InternalVsdl.g:2156:3: (otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')' )
                    // InternalVsdl.g:2157:4: otherlv_0= '(' this_SimpleNetworkConstraint_1= ruleSimpleNetworkConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
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
                    // InternalVsdl.g:2175:3: this_NetworkGatewayConstraint_3= ruleNetworkGatewayConstraint
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
                    // InternalVsdl.g:2184:3: this_NetworkParticipantsConstraint_4= ruleNetworkParticipantsConstraint
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
    // InternalVsdl.g:2196:1: entryRuleNetworkGatewayConstraint returns [EObject current=null] : iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF ;
    public final EObject entryRuleNetworkGatewayConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkGatewayConstraint = null;


        try {
            // InternalVsdl.g:2196:65: (iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF )
            // InternalVsdl.g:2197:2: iv_ruleNetworkGatewayConstraint= ruleNetworkGatewayConstraint EOF
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
    // InternalVsdl.g:2203:1: ruleNetworkGatewayConstraint returns [EObject current=null] : ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) ) ;
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
            // InternalVsdl.g:2209:2: ( ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) ) )
            // InternalVsdl.g:2210:2: ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) )
            {
            // InternalVsdl.g:2210:2: ( ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) ) | ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            else if ( (LA24_0==53) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalVsdl.g:2211:3: ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) )
                    {
                    // InternalVsdl.g:2211:3: ( () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) ) )
                    // InternalVsdl.g:2212:4: () ( ( 'addresses' )=>otherlv_1= 'addresses' ) otherlv_2= 'range' otherlv_3= 'is' ( (lv_range_4_0= ruleIPRangeA ) )
                    {
                    // InternalVsdl.g:2212:4: ()
                    // InternalVsdl.g:2213:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkGatewayConstraintAccess().getIPRangeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2219:4: ( ( 'addresses' )=>otherlv_1= 'addresses' )
                    // InternalVsdl.g:2220:5: ( 'addresses' )=>otherlv_1= 'addresses'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getNetworkGatewayConstraintAccess().getAddressesKeyword_0_1());
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,52,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNetworkGatewayConstraintAccess().getRangeKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNetworkGatewayConstraintAccess().getIsKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:2234:4: ( (lv_range_4_0= ruleIPRangeA ) )
                    // InternalVsdl.g:2235:5: (lv_range_4_0= ruleIPRangeA )
                    {
                    // InternalVsdl.g:2235:5: (lv_range_4_0= ruleIPRangeA )
                    // InternalVsdl.g:2236:6: lv_range_4_0= ruleIPRangeA
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
                    // InternalVsdl.g:2255:3: ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) )
                    {
                    // InternalVsdl.g:2255:3: ( () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) ) )
                    // InternalVsdl.g:2256:4: () ( ( 'gateway' )=>otherlv_6= 'gateway' ) otherlv_7= 'has' otherlv_8= 'direct' otherlv_9= 'access' otherlv_10= 'to' otherlv_11= 'the' ( (lv_internet_12_0= 'Internet' ) )
                    {
                    // InternalVsdl.g:2256:4: ()
                    // InternalVsdl.g:2257:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkGatewayConstraintAccess().getGatewayAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2263:4: ( ( 'gateway' )=>otherlv_6= 'gateway' )
                    // InternalVsdl.g:2264:5: ( 'gateway' )=>otherlv_6= 'gateway'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNetworkGatewayConstraintAccess().getGatewayKeyword_1_1());
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,54,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getNetworkGatewayConstraintAccess().getHasKeyword_1_2());
                      			
                    }
                    otherlv_8=(Token)match(input,55,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getNetworkGatewayConstraintAccess().getDirectKeyword_1_3());
                      			
                    }
                    otherlv_9=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNetworkGatewayConstraintAccess().getAccessKeyword_1_4());
                      			
                    }
                    otherlv_10=(Token)match(input,28,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getNetworkGatewayConstraintAccess().getToKeyword_1_5());
                      			
                    }
                    otherlv_11=(Token)match(input,57,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getNetworkGatewayConstraintAccess().getTheKeyword_1_6());
                      			
                    }
                    // InternalVsdl.g:2290:4: ( (lv_internet_12_0= 'Internet' ) )
                    // InternalVsdl.g:2291:5: (lv_internet_12_0= 'Internet' )
                    {
                    // InternalVsdl.g:2291:5: (lv_internet_12_0= 'Internet' )
                    // InternalVsdl.g:2292:6: lv_internet_12_0= 'Internet'
                    {
                    lv_internet_12_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:2309:1: entryRuleNetworkParticipantsConstraint returns [EObject current=null] : iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF ;
    public final EObject entryRuleNetworkParticipantsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkParticipantsConstraint = null;


        try {
            // InternalVsdl.g:2309:70: (iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF )
            // InternalVsdl.g:2310:2: iv_ruleNetworkParticipantsConstraint= ruleNetworkParticipantsConstraint EOF
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
    // InternalVsdl.g:2316:1: ruleNetworkParticipantsConstraint returns [EObject current=null] : ( ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) ) | ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) ) ) ;
    public final EObject ruleNetworkParticipantsConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_op_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_op_9_0=null;
        EObject lv_address_10_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2322:2: ( ( ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) ) | ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) ) ) )
            // InternalVsdl.g:2323:2: ( ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) ) | ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) ) )
            {
            // InternalVsdl.g:2323:2: ( ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) ) | ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==40) ) {
                        alt25=1;
                    }
                    else if ( (LA25_2==54) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalVsdl.g:2324:3: ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) )
                    {
                    // InternalVsdl.g:2324:3: ( () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) ) )
                    // InternalVsdl.g:2325:4: () ( ( 'node' )=>otherlv_1= 'node' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (lv_op_4_0= 'connected' ) )
                    {
                    // InternalVsdl.g:2325:4: ()
                    // InternalVsdl.g:2326:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkParticipantsConstraintAccess().getIPAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2332:4: ( ( 'node' )=>otherlv_1= 'node' )
                    // InternalVsdl.g:2333:5: ( 'node' )=>otherlv_1= 'node'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getNetworkParticipantsConstraintAccess().getNodeKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2339:4: ( (otherlv_2= RULE_ID ) )
                    // InternalVsdl.g:2340:5: (otherlv_2= RULE_ID )
                    {
                    // InternalVsdl.g:2340:5: (otherlv_2= RULE_ID )
                    // InternalVsdl.g:2341:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getNetworkParticipantsConstraintAccess().getIdScenElemCrossReference_0_2_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNetworkParticipantsConstraintAccess().getIsKeyword_0_3());
                      			
                    }
                    // InternalVsdl.g:2356:4: ( (lv_op_4_0= 'connected' ) )
                    // InternalVsdl.g:2357:5: (lv_op_4_0= 'connected' )
                    {
                    // InternalVsdl.g:2357:5: (lv_op_4_0= 'connected' )
                    // InternalVsdl.g:2358:6: lv_op_4_0= 'connected'
                    {
                    lv_op_4_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_4_0, grammarAccess.getNetworkParticipantsConstraintAccess().getOpConnectedKeyword_0_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_4_0, "connected");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:2372:3: ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) )
                    {
                    // InternalVsdl.g:2372:3: ( () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) ) )
                    // InternalVsdl.g:2373:4: () ( ( 'node' )=>otherlv_6= 'node' ) ( (otherlv_7= RULE_ID ) ) otherlv_8= 'has' ( (lv_op_9_0= 'IP' ) ) ( (lv_address_10_0= ruleIPAddress ) )
                    {
                    // InternalVsdl.g:2373:4: ()
                    // InternalVsdl.g:2374:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNetworkParticipantsConstraintAccess().getIPAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2380:4: ( ( 'node' )=>otherlv_6= 'node' )
                    // InternalVsdl.g:2381:5: ( 'node' )=>otherlv_6= 'node'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNetworkParticipantsConstraintAccess().getNodeKeyword_1_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2387:4: ( (otherlv_7= RULE_ID ) )
                    // InternalVsdl.g:2388:5: (otherlv_7= RULE_ID )
                    {
                    // InternalVsdl.g:2388:5: (otherlv_7= RULE_ID )
                    // InternalVsdl.g:2389:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getNetworkParticipantsConstraintAccess().getIdScenElemCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,54,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getNetworkParticipantsConstraintAccess().getHasKeyword_1_3());
                      			
                    }
                    // InternalVsdl.g:2404:4: ( (lv_op_9_0= 'IP' ) )
                    // InternalVsdl.g:2405:5: (lv_op_9_0= 'IP' )
                    {
                    // InternalVsdl.g:2405:5: (lv_op_9_0= 'IP' )
                    // InternalVsdl.g:2406:6: lv_op_9_0= 'IP'
                    {
                    lv_op_9_0=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_9_0, grammarAccess.getNetworkParticipantsConstraintAccess().getOpIPKeyword_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_9_0, "IP");
                      					
                    }

                    }


                    }

                    // InternalVsdl.g:2418:4: ( (lv_address_10_0= ruleIPAddress ) )
                    // InternalVsdl.g:2419:5: (lv_address_10_0= ruleIPAddress )
                    {
                    // InternalVsdl.g:2419:5: (lv_address_10_0= ruleIPAddress )
                    // InternalVsdl.g:2420:6: lv_address_10_0= ruleIPAddress
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNetworkParticipantsConstraintAccess().getAddressIPAddressParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_address_10_0=ruleIPAddress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNetworkParticipantsConstraintRule());
                      						}
                      						set(
                      							current,
                      							"address",
                      							lv_address_10_0,
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
    // InternalVsdl.g:2442:1: entryRuleUpdateTriggerConstraint returns [EObject current=null] : iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF ;
    public final EObject entryRuleUpdateTriggerConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraint = null;


        try {
            // InternalVsdl.g:2442:64: (iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF )
            // InternalVsdl.g:2443:2: iv_ruleUpdateTriggerConstraint= ruleUpdateTriggerConstraint EOF
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
    // InternalVsdl.g:2449:1: ruleUpdateTriggerConstraint returns [EObject current=null] : this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr ;
    public final EObject ruleUpdateTriggerConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateTriggerConstraintAndOr_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2455:2: (this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr )
            // InternalVsdl.g:2456:2: this_UpdateTriggerConstraintAndOr_0= ruleUpdateTriggerConstraintAndOr
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
    // InternalVsdl.g:2467:1: entryRuleUpdateTriggerConstraintAndOr returns [EObject current=null] : iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF ;
    public final EObject entryRuleUpdateTriggerConstraintAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintAndOr = null;


        try {
            // InternalVsdl.g:2467:69: (iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF )
            // InternalVsdl.g:2468:2: iv_ruleUpdateTriggerConstraintAndOr= ruleUpdateTriggerConstraintAndOr EOF
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
    // InternalVsdl.g:2474:1: ruleUpdateTriggerConstraintAndOr returns [EObject current=null] : (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* ) ;
    public final EObject ruleUpdateTriggerConstraintAndOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_UpdateTriggerConstraintNot_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2480:2: ( (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* ) )
            // InternalVsdl.g:2481:2: (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* )
            {
            // InternalVsdl.g:2481:2: (this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )* )
            // InternalVsdl.g:2482:3: this_UpdateTriggerConstraintNot_0= ruleUpdateTriggerConstraintNot ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )*
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
            // InternalVsdl.g:2490:3: ( ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=20 && LA27_0<=21)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalVsdl.g:2491:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ) ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) )
            	    {
            	    // InternalVsdl.g:2491:4: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) )
            	    // InternalVsdl.g:2492:5: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    {
            	    // InternalVsdl.g:2492:5: ()
            	    // InternalVsdl.g:2493:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getUpdateTriggerConstraintAndOrAccess().getAndOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:2499:5: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // InternalVsdl.g:2500:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // InternalVsdl.g:2500:6: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // InternalVsdl.g:2501:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // InternalVsdl.g:2501:7: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==20) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==21) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalVsdl.g:2502:8: lv_op_2_1= 'and'
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
            	            // InternalVsdl.g:2513:8: lv_op_2_2= 'or'
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

            	    // InternalVsdl.g:2527:4: ( (lv_right_3_0= ruleUpdateTriggerConstraintNot ) )
            	    // InternalVsdl.g:2528:5: (lv_right_3_0= ruleUpdateTriggerConstraintNot )
            	    {
            	    // InternalVsdl.g:2528:5: (lv_right_3_0= ruleUpdateTriggerConstraintNot )
            	    // InternalVsdl.g:2529:6: lv_right_3_0= ruleUpdateTriggerConstraintNot
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
            	    break loop27;
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
    // InternalVsdl.g:2551:1: entryRuleUpdateTriggerConstraintNot returns [EObject current=null] : iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF ;
    public final EObject entryRuleUpdateTriggerConstraintNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintNot = null;


        try {
            // InternalVsdl.g:2551:67: (iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF )
            // InternalVsdl.g:2552:2: iv_ruleUpdateTriggerConstraintNot= ruleUpdateTriggerConstraintNot EOF
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
    // InternalVsdl.g:2558:1: ruleUpdateTriggerConstraintNot returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA ) ;
    public final EObject ruleUpdateTriggerConstraintNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraint_2_0 = null;

        EObject this_UpdateTriggerConstraintA_3 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2564:2: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA ) )
            // InternalVsdl.g:2565:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA )
            {
            // InternalVsdl.g:2565:2: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) ) | this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            else if ( (LA28_0==23||LA28_0==61||LA28_0==66) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalVsdl.g:2566:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) )
                    {
                    // InternalVsdl.g:2566:3: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) ) )
                    // InternalVsdl.g:2567:4: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) )
                    {
                    // InternalVsdl.g:2567:4: ()
                    // InternalVsdl.g:2568:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintNotAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2574:4: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalVsdl.g:2575:5: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUpdateTriggerConstraintNotAccess().getNotKeyword_0_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2581:4: ( (lv_constraint_2_0= ruleUpdateTriggerConstraintA ) )
                    // InternalVsdl.g:2582:5: (lv_constraint_2_0= ruleUpdateTriggerConstraintA )
                    {
                    // InternalVsdl.g:2582:5: (lv_constraint_2_0= ruleUpdateTriggerConstraintA )
                    // InternalVsdl.g:2583:6: lv_constraint_2_0= ruleUpdateTriggerConstraintA
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
                    // InternalVsdl.g:2602:3: this_UpdateTriggerConstraintA_3= ruleUpdateTriggerConstraintA
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
    // InternalVsdl.g:2614:1: entryRuleUpdateTriggerConstraintA returns [EObject current=null] : iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF ;
    public final EObject entryRuleUpdateTriggerConstraintA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTriggerConstraintA = null;


        try {
            // InternalVsdl.g:2614:65: (iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF )
            // InternalVsdl.g:2615:2: iv_ruleUpdateTriggerConstraintA= ruleUpdateTriggerConstraintA EOF
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
    // InternalVsdl.g:2621:1: ruleUpdateTriggerConstraintA returns [EObject current=null] : ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) ) ;
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
            // InternalVsdl.g:2627:2: ( ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) ) )
            // InternalVsdl.g:2628:2: ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) )
            {
            // InternalVsdl.g:2628:2: ( (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' ) | ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) ) | ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) ) | ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt29=1;
                }
                break;
            case 61:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==64) ) {
                    alt29=3;
                }
                else if ( (LA29_2==62) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalVsdl.g:2629:3: (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' )
                    {
                    // InternalVsdl.g:2629:3: (otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')' )
                    // InternalVsdl.g:2630:4: otherlv_0= '(' this_UpdateTriggerConstraint_1= ruleUpdateTriggerConstraint otherlv_2= ')'
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
                    // InternalVsdl.g:2648:3: ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:2648:3: ( () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:2649:4: () ( ( 'at' )=>otherlv_4= 'at' ) ( (lv_op_5_0= 'least' ) ) otherlv_6= 'after' ( (lv_variable_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_texp_9_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:2649:4: ()
                    // InternalVsdl.g:2650:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getAtAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2656:4: ( ( 'at' )=>otherlv_4= 'at' )
                    // InternalVsdl.g:2657:5: ( 'at' )=>otherlv_4= 'at'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getUpdateTriggerConstraintAAccess().getAtKeyword_1_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2663:4: ( (lv_op_5_0= 'least' ) )
                    // InternalVsdl.g:2664:5: (lv_op_5_0= 'least' )
                    {
                    // InternalVsdl.g:2664:5: (lv_op_5_0= 'least' )
                    // InternalVsdl.g:2665:6: lv_op_5_0= 'least'
                    {
                    lv_op_5_0=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getUpdateTriggerConstraintAAccess().getAfterKeyword_1_3());
                      			
                    }
                    // InternalVsdl.g:2681:4: ( (lv_variable_7_0= RULE_ID ) )
                    // InternalVsdl.g:2682:5: (lv_variable_7_0= RULE_ID )
                    {
                    // InternalVsdl.g:2682:5: (lv_variable_7_0= RULE_ID )
                    // InternalVsdl.g:2683:6: lv_variable_7_0= RULE_ID
                    {
                    lv_variable_7_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,49,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_1_5());
                      			
                    }
                    // InternalVsdl.g:2703:4: ( (lv_texp_9_0= ruleTimeExpr ) )
                    // InternalVsdl.g:2704:5: (lv_texp_9_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:2704:5: (lv_texp_9_0= ruleTimeExpr )
                    // InternalVsdl.g:2705:6: lv_texp_9_0= ruleTimeExpr
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
                    // InternalVsdl.g:2724:3: ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:2724:3: ( () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:2725:4: () ( ( 'at' )=>otherlv_11= 'at' ) ( (lv_op_12_0= 'most' ) ) otherlv_13= 'before' ( (lv_variable_14_0= RULE_ID ) ) otherlv_15= '=' ( (lv_texp_16_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:2725:4: ()
                    // InternalVsdl.g:2726:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getAtAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2732:4: ( ( 'at' )=>otherlv_11= 'at' )
                    // InternalVsdl.g:2733:5: ( 'at' )=>otherlv_11= 'at'
                    {
                    otherlv_11=(Token)match(input,61,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getUpdateTriggerConstraintAAccess().getAtKeyword_2_1());
                      				
                    }

                    }

                    // InternalVsdl.g:2739:4: ( (lv_op_12_0= 'most' ) )
                    // InternalVsdl.g:2740:5: (lv_op_12_0= 'most' )
                    {
                    // InternalVsdl.g:2740:5: (lv_op_12_0= 'most' )
                    // InternalVsdl.g:2741:6: lv_op_12_0= 'most'
                    {
                    lv_op_12_0=(Token)match(input,64,FOLLOW_54); if (state.failed) return current;
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

                    otherlv_13=(Token)match(input,65,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getUpdateTriggerConstraintAAccess().getBeforeKeyword_2_3());
                      			
                    }
                    // InternalVsdl.g:2757:4: ( (lv_variable_14_0= RULE_ID ) )
                    // InternalVsdl.g:2758:5: (lv_variable_14_0= RULE_ID )
                    {
                    // InternalVsdl.g:2758:5: (lv_variable_14_0= RULE_ID )
                    // InternalVsdl.g:2759:6: lv_variable_14_0= RULE_ID
                    {
                    lv_variable_14_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

                    otherlv_15=(Token)match(input,49,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_2_5());
                      			
                    }
                    // InternalVsdl.g:2779:4: ( (lv_texp_16_0= ruleTimeExpr ) )
                    // InternalVsdl.g:2780:5: (lv_texp_16_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:2780:5: (lv_texp_16_0= ruleTimeExpr )
                    // InternalVsdl.g:2781:6: lv_texp_16_0= ruleTimeExpr
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
                    // InternalVsdl.g:2800:3: ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) )
                    {
                    // InternalVsdl.g:2800:3: ( () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) ) )
                    // InternalVsdl.g:2801:4: () ( ( 'switch' )=>otherlv_18= 'switch' ) otherlv_19= 'after' ( (lv_variable_20_0= RULE_ID ) ) otherlv_21= '=' ( (lv_texp_22_0= ruleTimeExpr ) )
                    {
                    // InternalVsdl.g:2801:4: ()
                    // InternalVsdl.g:2802:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUpdateTriggerConstraintAAccess().getSwitchAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVsdl.g:2808:4: ( ( 'switch' )=>otherlv_18= 'switch' )
                    // InternalVsdl.g:2809:5: ( 'switch' )=>otherlv_18= 'switch'
                    {
                    otherlv_18=(Token)match(input,66,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getUpdateTriggerConstraintAAccess().getSwitchKeyword_3_1());
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getUpdateTriggerConstraintAAccess().getAfterKeyword_3_2());
                      			
                    }
                    // InternalVsdl.g:2819:4: ( (lv_variable_20_0= RULE_ID ) )
                    // InternalVsdl.g:2820:5: (lv_variable_20_0= RULE_ID )
                    {
                    // InternalVsdl.g:2820:5: (lv_variable_20_0= RULE_ID )
                    // InternalVsdl.g:2821:6: lv_variable_20_0= RULE_ID
                    {
                    lv_variable_20_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
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

                    otherlv_21=(Token)match(input,49,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getUpdateTriggerConstraintAAccess().getEqualsSignKeyword_3_4());
                      			
                    }
                    // InternalVsdl.g:2841:4: ( (lv_texp_22_0= ruleTimeExpr ) )
                    // InternalVsdl.g:2842:5: (lv_texp_22_0= ruleTimeExpr )
                    {
                    // InternalVsdl.g:2842:5: (lv_texp_22_0= ruleTimeExpr )
                    // InternalVsdl.g:2843:6: lv_texp_22_0= ruleTimeExpr
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
    // InternalVsdl.g:2865:1: entryRuleTimeExpr returns [EObject current=null] : iv_ruleTimeExpr= ruleTimeExpr EOF ;
    public final EObject entryRuleTimeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExpr = null;


        try {
            // InternalVsdl.g:2865:49: (iv_ruleTimeExpr= ruleTimeExpr EOF )
            // InternalVsdl.g:2866:2: iv_ruleTimeExpr= ruleTimeExpr EOF
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
    // InternalVsdl.g:2872:1: ruleTimeExpr returns [EObject current=null] : this_TimeExprAddition_0= ruleTimeExprAddition ;
    public final EObject ruleTimeExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TimeExprAddition_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2878:2: (this_TimeExprAddition_0= ruleTimeExprAddition )
            // InternalVsdl.g:2879:2: this_TimeExprAddition_0= ruleTimeExprAddition
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
    // InternalVsdl.g:2890:1: entryRuleTimeExprAddition returns [EObject current=null] : iv_ruleTimeExprAddition= ruleTimeExprAddition EOF ;
    public final EObject entryRuleTimeExprAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprAddition = null;


        try {
            // InternalVsdl.g:2890:57: (iv_ruleTimeExprAddition= ruleTimeExprAddition EOF )
            // InternalVsdl.g:2891:2: iv_ruleTimeExprAddition= ruleTimeExprAddition EOF
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
    // InternalVsdl.g:2897:1: ruleTimeExprAddition returns [EObject current=null] : (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* ) ;
    public final EObject ruleTimeExprAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimeExprMultiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2903:2: ( (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* ) )
            // InternalVsdl.g:2904:2: (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* )
            {
            // InternalVsdl.g:2904:2: (this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )* )
            // InternalVsdl.g:2905:3: this_TimeExprMultiplication_0= ruleTimeExprMultiplication ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTimeExprAdditionAccess().getTimeExprMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_TimeExprMultiplication_0=ruleTimeExprMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TimeExprMultiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:2913:3: ( ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=67 && LA31_0<=68)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalVsdl.g:2914:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleTimeExprMultiplication ) )
            	    {
            	    // InternalVsdl.g:2914:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // InternalVsdl.g:2915:5: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // InternalVsdl.g:2915:5: ()
            	    // InternalVsdl.g:2916:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getTimeExprAdditionAccess().getPlusMinusLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:2922:5: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalVsdl.g:2923:6: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalVsdl.g:2923:6: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalVsdl.g:2924:7: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalVsdl.g:2924:7: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==67) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==68) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalVsdl.g:2925:8: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,67,FOLLOW_52); if (state.failed) return current;
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
            	            // InternalVsdl.g:2936:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,68,FOLLOW_52); if (state.failed) return current;
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

            	    // InternalVsdl.g:2950:4: ( (lv_right_3_0= ruleTimeExprMultiplication ) )
            	    // InternalVsdl.g:2951:5: (lv_right_3_0= ruleTimeExprMultiplication )
            	    {
            	    // InternalVsdl.g:2951:5: (lv_right_3_0= ruleTimeExprMultiplication )
            	    // InternalVsdl.g:2952:6: lv_right_3_0= ruleTimeExprMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTimeExprAdditionAccess().getRightTimeExprMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop31;
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
    // InternalVsdl.g:2974:1: entryRuleTimeExprMultiplication returns [EObject current=null] : iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF ;
    public final EObject entryRuleTimeExprMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprMultiplication = null;


        try {
            // InternalVsdl.g:2974:63: (iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF )
            // InternalVsdl.g:2975:2: iv_ruleTimeExprMultiplication= ruleTimeExprMultiplication EOF
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
    // InternalVsdl.g:2981:1: ruleTimeExprMultiplication returns [EObject current=null] : (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* ) ;
    public final EObject ruleTimeExprMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TimeExprA_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:2987:2: ( (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* ) )
            // InternalVsdl.g:2988:2: (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* )
            {
            // InternalVsdl.g:2988:2: (this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )* )
            // InternalVsdl.g:2989:3: this_TimeExprA_0= ruleTimeExprA ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTimeExprMultiplicationAccess().getTimeExprAParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_TimeExprA_0=ruleTimeExprA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TimeExprA_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVsdl.g:2997:3: ( ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==69) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVsdl.g:2998:4: ( () ( (lv_op_2_0= '*' ) ) ) ( (lv_right_3_0= ruleTimeExprA ) )
            	    {
            	    // InternalVsdl.g:2998:4: ( () ( (lv_op_2_0= '*' ) ) )
            	    // InternalVsdl.g:2999:5: () ( (lv_op_2_0= '*' ) )
            	    {
            	    // InternalVsdl.g:2999:5: ()
            	    // InternalVsdl.g:3000:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getTimeExprMultiplicationAccess().getMultiplicationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalVsdl.g:3006:5: ( (lv_op_2_0= '*' ) )
            	    // InternalVsdl.g:3007:6: (lv_op_2_0= '*' )
            	    {
            	    // InternalVsdl.g:3007:6: (lv_op_2_0= '*' )
            	    // InternalVsdl.g:3008:7: lv_op_2_0= '*'
            	    {
            	    lv_op_2_0=(Token)match(input,69,FOLLOW_52); if (state.failed) return current;
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

            	    // InternalVsdl.g:3021:4: ( (lv_right_3_0= ruleTimeExprA ) )
            	    // InternalVsdl.g:3022:5: (lv_right_3_0= ruleTimeExprA )
            	    {
            	    // InternalVsdl.g:3022:5: (lv_right_3_0= ruleTimeExprA )
            	    // InternalVsdl.g:3023:6: lv_right_3_0= ruleTimeExprA
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTimeExprMultiplicationAccess().getRightTimeExprAParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
    // $ANTLR end "ruleTimeExprMultiplication"


    // $ANTLR start "entryRuleTimeExprA"
    // InternalVsdl.g:3045:1: entryRuleTimeExprA returns [EObject current=null] : iv_ruleTimeExprA= ruleTimeExprA EOF ;
    public final EObject entryRuleTimeExprA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeExprA = null;


        try {
            // InternalVsdl.g:3045:50: (iv_ruleTimeExprA= ruleTimeExprA EOF )
            // InternalVsdl.g:3046:2: iv_ruleTimeExprA= ruleTimeExprA EOF
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
    // InternalVsdl.g:3052:1: ruleTimeExprA returns [EObject current=null] : ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) ) ;
    public final EObject ruleTimeExprA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;
        EObject this_TimeExpr_1 = null;

        EObject lv_interval_4_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3058:2: ( ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) ) )
            // InternalVsdl.g:3059:2: ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) )
            {
            // InternalVsdl.g:3059:2: ( (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' ) | ( (lv_variable_3_0= RULE_ID ) ) | ( (lv_interval_4_0= ruleTimeInterval ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                alt33=2;
                }
                break;
            case RULE_INT:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalVsdl.g:3060:3: (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' )
                    {
                    // InternalVsdl.g:3060:3: (otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')' )
                    // InternalVsdl.g:3061:4: otherlv_0= '(' this_TimeExpr_1= ruleTimeExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_52); if (state.failed) return current;
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
                    // InternalVsdl.g:3079:3: ( (lv_variable_3_0= RULE_ID ) )
                    {
                    // InternalVsdl.g:3079:3: ( (lv_variable_3_0= RULE_ID ) )
                    // InternalVsdl.g:3080:4: (lv_variable_3_0= RULE_ID )
                    {
                    // InternalVsdl.g:3080:4: (lv_variable_3_0= RULE_ID )
                    // InternalVsdl.g:3081:5: lv_variable_3_0= RULE_ID
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
                    // InternalVsdl.g:3098:3: ( (lv_interval_4_0= ruleTimeInterval ) )
                    {
                    // InternalVsdl.g:3098:3: ( (lv_interval_4_0= ruleTimeInterval ) )
                    // InternalVsdl.g:3099:4: (lv_interval_4_0= ruleTimeInterval )
                    {
                    // InternalVsdl.g:3099:4: (lv_interval_4_0= ruleTimeInterval )
                    // InternalVsdl.g:3100:5: lv_interval_4_0= ruleTimeInterval
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
    // InternalVsdl.g:3121:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalVsdl.g:3121:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalVsdl.g:3122:2: iv_ruleTimeInterval= ruleTimeInterval EOF
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
    // InternalVsdl.g:3128:1: ruleTimeInterval returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalVsdl.g:3134:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalVsdl.g:3135:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalVsdl.g:3135:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3136:3: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3136:3: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3137:4: lv_value_0_0= RULE_INT
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
    // InternalVsdl.g:3156:1: entryRuleCPUFrequency returns [EObject current=null] : iv_ruleCPUFrequency= ruleCPUFrequency EOF ;
    public final EObject entryRuleCPUFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPUFrequency = null;


        try {
            // InternalVsdl.g:3156:53: (iv_ruleCPUFrequency= ruleCPUFrequency EOF )
            // InternalVsdl.g:3157:2: iv_ruleCPUFrequency= ruleCPUFrequency EOF
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
    // InternalVsdl.g:3163:1: ruleCPUFrequency returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) ) ;
    public final EObject ruleCPUFrequency() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3169:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) ) )
            // InternalVsdl.g:3170:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) )
            {
            // InternalVsdl.g:3170:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) ) )
            // InternalVsdl.g:3171:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) )
            {
            // InternalVsdl.g:3171:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3172:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3172:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3173:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_57); if (state.failed) return current;
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

            // InternalVsdl.g:3189:3: ( ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) ) )
            // InternalVsdl.g:3190:4: ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) )
            {
            // InternalVsdl.g:3190:4: ( (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' ) )
            // InternalVsdl.g:3191:5: (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' )
            {
            // InternalVsdl.g:3191:5: (lv_unit_1_1= 'MHz' | lv_unit_1_2= 'GHz' | lv_unit_1_3= 'THz' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt34=1;
                }
                break;
            case 71:
                {
                alt34=2;
                }
                break;
            case 72:
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
                    // InternalVsdl.g:3192:6: lv_unit_1_1= 'MHz'
                    {
                    lv_unit_1_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3203:6: lv_unit_1_2= 'GHz'
                    {
                    lv_unit_1_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3214:6: lv_unit_1_3= 'THz'
                    {
                    lv_unit_1_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:3231:1: entryRuleDiskSize returns [EObject current=null] : iv_ruleDiskSize= ruleDiskSize EOF ;
    public final EObject entryRuleDiskSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiskSize = null;


        try {
            // InternalVsdl.g:3231:49: (iv_ruleDiskSize= ruleDiskSize EOF )
            // InternalVsdl.g:3232:2: iv_ruleDiskSize= ruleDiskSize EOF
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
    // InternalVsdl.g:3238:1: ruleDiskSize returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) ;
    public final EObject ruleDiskSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3244:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) )
            // InternalVsdl.g:3245:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            {
            // InternalVsdl.g:3245:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            // InternalVsdl.g:3246:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            {
            // InternalVsdl.g:3246:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3247:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3247:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3248:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_58); if (state.failed) return current;
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

            // InternalVsdl.g:3264:3: ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            // InternalVsdl.g:3265:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            {
            // InternalVsdl.g:3265:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            // InternalVsdl.g:3266:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            {
            // InternalVsdl.g:3266:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt35=1;
                }
                break;
            case 74:
                {
                alt35=2;
                }
                break;
            case 75:
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
                    // InternalVsdl.g:3267:6: lv_unit_1_1= 'MB'
                    {
                    lv_unit_1_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3278:6: lv_unit_1_2= 'GB'
                    {
                    lv_unit_1_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3289:6: lv_unit_1_3= 'TB'
                    {
                    lv_unit_1_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:3306:1: entryRuleRamSize returns [EObject current=null] : iv_ruleRamSize= ruleRamSize EOF ;
    public final EObject entryRuleRamSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamSize = null;


        try {
            // InternalVsdl.g:3306:48: (iv_ruleRamSize= ruleRamSize EOF )
            // InternalVsdl.g:3307:2: iv_ruleRamSize= ruleRamSize EOF
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
    // InternalVsdl.g:3313:1: ruleRamSize returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) ;
    public final EObject ruleRamSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;


        	enterRule();

        try {
            // InternalVsdl.g:3319:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) ) )
            // InternalVsdl.g:3320:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            {
            // InternalVsdl.g:3320:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) ) )
            // InternalVsdl.g:3321:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            {
            // InternalVsdl.g:3321:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalVsdl.g:3322:4: (lv_value_0_0= RULE_INT )
            {
            // InternalVsdl.g:3322:4: (lv_value_0_0= RULE_INT )
            // InternalVsdl.g:3323:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_58); if (state.failed) return current;
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

            // InternalVsdl.g:3339:3: ( ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) ) )
            // InternalVsdl.g:3340:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            {
            // InternalVsdl.g:3340:4: ( (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' ) )
            // InternalVsdl.g:3341:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            {
            // InternalVsdl.g:3341:5: (lv_unit_1_1= 'MB' | lv_unit_1_2= 'GB' | lv_unit_1_3= 'TB' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt36=1;
                }
                break;
            case 74:
                {
                alt36=2;
                }
                break;
            case 75:
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
                    // InternalVsdl.g:3342:6: lv_unit_1_1= 'MB'
                    {
                    lv_unit_1_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3353:6: lv_unit_1_2= 'GB'
                    {
                    lv_unit_1_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVsdl.g:3364:6: lv_unit_1_3= 'TB'
                    {
                    lv_unit_1_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:3381:1: entryRuleIPAddress returns [EObject current=null] : iv_ruleIPAddress= ruleIPAddress EOF ;
    public final EObject entryRuleIPAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAddress = null;


        try {
            // InternalVsdl.g:3381:50: (iv_ruleIPAddress= ruleIPAddress EOF )
            // InternalVsdl.g:3382:2: iv_ruleIPAddress= ruleIPAddress EOF
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
    // InternalVsdl.g:3388:1: ruleIPAddress returns [EObject current=null] : ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) ) ;
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
            // InternalVsdl.g:3394:2: ( ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) ) )
            // InternalVsdl.g:3395:2: ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) )
            {
            // InternalVsdl.g:3395:2: ( ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) ) )
            // InternalVsdl.g:3396:3: ( (lv_octet1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_octet2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_octet3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_octet4_6_0= RULE_INT ) )
            {
            // InternalVsdl.g:3396:3: ( (lv_octet1_0_0= RULE_INT ) )
            // InternalVsdl.g:3397:4: (lv_octet1_0_0= RULE_INT )
            {
            // InternalVsdl.g:3397:4: (lv_octet1_0_0= RULE_INT )
            // InternalVsdl.g:3398:5: lv_octet1_0_0= RULE_INT
            {
            lv_octet1_0_0=(Token)match(input,RULE_INT,FOLLOW_59); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIPAddressAccess().getFullStopKeyword_1());
              		
            }
            // InternalVsdl.g:3418:3: ( (lv_octet2_2_0= RULE_INT ) )
            // InternalVsdl.g:3419:4: (lv_octet2_2_0= RULE_INT )
            {
            // InternalVsdl.g:3419:4: (lv_octet2_2_0= RULE_INT )
            // InternalVsdl.g:3420:5: lv_octet2_2_0= RULE_INT
            {
            lv_octet2_2_0=(Token)match(input,RULE_INT,FOLLOW_59); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIPAddressAccess().getFullStopKeyword_3());
              		
            }
            // InternalVsdl.g:3440:3: ( (lv_octet3_4_0= RULE_INT ) )
            // InternalVsdl.g:3441:4: (lv_octet3_4_0= RULE_INT )
            {
            // InternalVsdl.g:3441:4: (lv_octet3_4_0= RULE_INT )
            // InternalVsdl.g:3442:5: lv_octet3_4_0= RULE_INT
            {
            lv_octet3_4_0=(Token)match(input,RULE_INT,FOLLOW_59); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIPAddressAccess().getFullStopKeyword_5());
              		
            }
            // InternalVsdl.g:3462:3: ( (lv_octet4_6_0= RULE_INT ) )
            // InternalVsdl.g:3463:4: (lv_octet4_6_0= RULE_INT )
            {
            // InternalVsdl.g:3463:4: (lv_octet4_6_0= RULE_INT )
            // InternalVsdl.g:3464:5: lv_octet4_6_0= RULE_INT
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
    // InternalVsdl.g:3484:1: entryRuleIPRangeA returns [EObject current=null] : iv_ruleIPRangeA= ruleIPRangeA EOF ;
    public final EObject entryRuleIPRangeA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPRangeA = null;


        try {
            // InternalVsdl.g:3484:49: (iv_ruleIPRangeA= ruleIPRangeA EOF )
            // InternalVsdl.g:3485:2: iv_ruleIPRangeA= ruleIPRangeA EOF
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
    // InternalVsdl.g:3491:1: ruleIPRangeA returns [EObject current=null] : ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIPRangeA() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_bitmask_2_0=null;
        EObject lv_address_0_0 = null;



        	enterRule();

        try {
            // InternalVsdl.g:3497:2: ( ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) ) )
            // InternalVsdl.g:3498:2: ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) )
            {
            // InternalVsdl.g:3498:2: ( ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) ) )
            // InternalVsdl.g:3499:3: ( (lv_address_0_0= ruleIPAddress ) ) otherlv_1= '/' ( (lv_bitmask_2_0= RULE_INT ) )
            {
            // InternalVsdl.g:3499:3: ( (lv_address_0_0= ruleIPAddress ) )
            // InternalVsdl.g:3500:4: (lv_address_0_0= ruleIPAddress )
            {
            // InternalVsdl.g:3500:4: (lv_address_0_0= ruleIPAddress )
            // InternalVsdl.g:3501:5: lv_address_0_0= ruleIPAddress
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIPRangeAAccess().getAddressIPAddressParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            otherlv_1=(Token)match(input,76,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIPRangeAAccess().getSolidusKeyword_1());
              		
            }
            // InternalVsdl.g:3522:3: ( (lv_bitmask_2_0= RULE_INT ) )
            // InternalVsdl.g:3523:4: (lv_bitmask_2_0= RULE_INT )
            {
            // InternalVsdl.g:3523:4: (lv_bitmask_2_0= RULE_INT )
            // InternalVsdl.g:3524:5: lv_bitmask_2_0= RULE_INT
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
    // InternalVsdl.g:3544:1: entryRuleOSVersionE returns [String current=null] : iv_ruleOSVersionE= ruleOSVersionE EOF ;
    public final String entryRuleOSVersionE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOSVersionE = null;


        try {
            // InternalVsdl.g:3544:50: (iv_ruleOSVersionE= ruleOSVersionE EOF )
            // InternalVsdl.g:3545:2: iv_ruleOSVersionE= ruleOSVersionE EOF
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
    // InternalVsdl.g:3551:1: ruleOSVersionE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' ) ;
    public final AntlrDatatypeRuleToken ruleOSVersionE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVsdl.g:3557:2: ( (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' ) )
            // InternalVsdl.g:3558:2: (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' )
            {
            // InternalVsdl.g:3558:2: (kw= 'WindowsXP' | kw= 'Windows7' | kw= 'Windows8' | kw= 'Windows10' | kw= 'Ubuntu14' | kw= 'Ubuntu16' | kw= 'Android-21' | kw= 'Android-19' )
            int alt37=8;
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
            case 80:
                {
                alt37=4;
                }
                break;
            case 81:
                {
                alt37=5;
                }
                break;
            case 82:
                {
                alt37=6;
                }
                break;
            case 83:
                {
                alt37=7;
                }
                break;
            case 84:
                {
                alt37=8;
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
                    // InternalVsdl.g:3559:3: kw= 'WindowsXP'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindowsXPKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3565:3: kw= 'Windows7'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows7Keyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3571:3: kw= 'Windows8'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows8Keyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3577:3: kw= 'Windows10'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getWindows10Keyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVsdl.g:3583:3: kw= 'Ubuntu14'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getUbuntu14Keyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVsdl.g:3589:3: kw= 'Ubuntu16'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getUbuntu16Keyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVsdl.g:3595:3: kw= 'Android-21'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSVersionEAccess().getAndroid21Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVsdl.g:3601:3: kw= 'Android-19'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:3610:1: entryRuleOSFamilyE returns [String current=null] : iv_ruleOSFamilyE= ruleOSFamilyE EOF ;
    public final String entryRuleOSFamilyE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOSFamilyE = null;


        try {
            // InternalVsdl.g:3610:49: (iv_ruleOSFamilyE= ruleOSFamilyE EOF )
            // InternalVsdl.g:3611:2: iv_ruleOSFamilyE= ruleOSFamilyE EOF
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
    // InternalVsdl.g:3617:1: ruleOSFamilyE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' ) ;
    public final AntlrDatatypeRuleToken ruleOSFamilyE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVsdl.g:3623:2: ( (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' ) )
            // InternalVsdl.g:3624:2: (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' )
            {
            // InternalVsdl.g:3624:2: (kw= 'Microsoft' | kw= 'Linux' | kw= 'OSx' | kw= 'iOS' | kw= 'Android' )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt38=1;
                }
                break;
            case 86:
                {
                alt38=2;
                }
                break;
            case 87:
                {
                alt38=3;
                }
                break;
            case 88:
                {
                alt38=4;
                }
                break;
            case 89:
                {
                alt38=5;
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
                    // InternalVsdl.g:3625:3: kw= 'Microsoft'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getMicrosoftKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3631:3: kw= 'Linux'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getLinuxKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3637:3: kw= 'OSx'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getOSxKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3643:3: kw= 'iOS'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOSFamilyEAccess().getIOSKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVsdl.g:3649:3: kw= 'Android'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalVsdl.g:3658:1: ruleHardwareProfile returns [Enumerator current=null] : ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) ) ;
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
            // InternalVsdl.g:3664:2: ( ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) ) )
            // InternalVsdl.g:3665:2: ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) )
            {
            // InternalVsdl.g:3665:2: ( (enumLiteral_0= 'tiny' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'large' ) | (enumLiteral_3= 'mobile' ) | (enumLiteral_4= 'wearable' ) | (enumLiteral_5= 'sensor' ) | (enumLiteral_6= 'server' ) )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt39=1;
                }
                break;
            case 91:
                {
                alt39=2;
                }
                break;
            case 92:
                {
                alt39=3;
                }
                break;
            case 93:
                {
                alt39=4;
                }
                break;
            case 94:
                {
                alt39=5;
                }
                break;
            case 95:
                {
                alt39=6;
                }
                break;
            case 96:
                {
                alt39=7;
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
                    // InternalVsdl.g:3666:3: (enumLiteral_0= 'tiny' )
                    {
                    // InternalVsdl.g:3666:3: (enumLiteral_0= 'tiny' )
                    // InternalVsdl.g:3667:4: enumLiteral_0= 'tiny'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getTinyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getHardwareProfileAccess().getTinyEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVsdl.g:3674:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalVsdl.g:3674:3: (enumLiteral_1= 'medium' )
                    // InternalVsdl.g:3675:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getMediumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getHardwareProfileAccess().getMediumEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVsdl.g:3682:3: (enumLiteral_2= 'large' )
                    {
                    // InternalVsdl.g:3682:3: (enumLiteral_2= 'large' )
                    // InternalVsdl.g:3683:4: enumLiteral_2= 'large'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getLargeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getHardwareProfileAccess().getLargeEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVsdl.g:3690:3: (enumLiteral_3= 'mobile' )
                    {
                    // InternalVsdl.g:3690:3: (enumLiteral_3= 'mobile' )
                    // InternalVsdl.g:3691:4: enumLiteral_3= 'mobile'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getMobileEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getHardwareProfileAccess().getMobileEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVsdl.g:3698:3: (enumLiteral_4= 'wearable' )
                    {
                    // InternalVsdl.g:3698:3: (enumLiteral_4= 'wearable' )
                    // InternalVsdl.g:3699:4: enumLiteral_4= 'wearable'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getWearableEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getHardwareProfileAccess().getWearableEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVsdl.g:3706:3: (enumLiteral_5= 'sensor' )
                    {
                    // InternalVsdl.g:3706:3: (enumLiteral_5= 'sensor' )
                    // InternalVsdl.g:3707:4: enumLiteral_5= 'sensor'
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getHardwareProfileAccess().getSensorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getHardwareProfileAccess().getSensorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVsdl.g:3714:3: (enumLiteral_6= 'server' )
                    {
                    // InternalVsdl.g:3714:3: (enumLiteral_6= 'server' )
                    // InternalVsdl.g:3715:4: enumLiteral_6= 'server'
                    {
                    enumLiteral_6=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    static final String dfa_2s = "\1\31\1\32\2\42\3\uffff\2\33\2\uffff\1\33\10\uffff";
    static final String dfa_3s = "\1\46\1\37\2\44\3\uffff\2\40\2\uffff\1\40\10\uffff";
    static final String dfa_4s = "\4\uffff\1\15\1\2\1\3\2\uffff\1\6\1\7\1\uffff\1\12\1\13\1\1\1\4\1\5\1\10\1\14\1\11";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2\3\uffff\1\3\1\4",
            "\1\7\2\uffff\1\5\1\uffff\1\6",
            "\1\10\1\11\1\12",
            "\1\13\1\14\1\15",
            "",
            "",
            "",
            "\1\16\4\uffff\1\17",
            "\1\20\4\uffff\1\21",
            "",
            "",
            "\1\23\4\uffff\1\22",
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
            return "620:2: ( ( () ( ( 'cpu' )=>otherlv_1= 'cpu' ) otherlv_2= 'speed' ( (lv_op_3_0= 'equal' ) ) otherlv_4= 'to' ( (lv_value_5_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_7= 'cpu' ) ( (lv_op_8_0= 'faster' ) ) otherlv_9= 'than' ( (lv_value_10_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_12= 'cpu' ) ( (lv_op_13_0= 'slower' ) ) otherlv_14= 'than' ( (lv_value_15_0= ruleCPUFrequency ) ) ) | ( () ( ( 'cpu' )=>otherlv_17= 'cpu' ) otherlv_18= 'speed' ( (lv_sameas_19_0= 'of' ) ) ( (otherlv_20= RULE_ID ) ) ) | ( () ( ( 'disk' )=>otherlv_22= 'disk' ) otherlv_23= 'size' ( (lv_op_24_0= 'equal' ) ) otherlv_25= 'to' ( (lv_value_26_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_28= 'disk' ) ( (lv_op_29_0= 'larger' ) ) otherlv_30= 'than' ( (lv_value_31_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_33= 'disk' ) ( (lv_op_34_0= 'smaller' ) ) otherlv_35= 'than' ( (lv_value_36_0= ruleDiskSize ) ) ) | ( () ( ( 'disk' )=>otherlv_38= 'disk' ) otherlv_39= 'size' ( (lv_sameas_40_0= 'of' ) ) ( (otherlv_41= RULE_ID ) ) ) | ( () ( ( 'ram' )=>otherlv_43= 'ram' ) otherlv_44= 'size' ( (lv_op_45_0= 'equal' ) ) otherlv_46= 'to' ( (lv_value_47_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_49= 'ram' ) ( (lv_op_50_0= 'larger' ) ) otherlv_51= 'than' ( (lv_value_52_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_54= 'ram' ) ( (lv_op_55_0= 'smaller' ) ) otherlv_56= 'than' ( (lv_value_57_0= ruleRamSize ) ) ) | ( () ( ( 'ram' )=>otherlv_59= 'ram' ) otherlv_60= 'size' ( (lv_sameas_61_0= 'of' ) ) ( (otherlv_62= RULE_ID ) ) ) | ( () ( ( 'flavour' )=>otherlv_64= 'flavour' ) ( (lv_profile_65_0= ruleHardwareProfile ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000400000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000046202C2C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000046202C28000L});
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x00000001FC000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x00000000001FE000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000B00000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0028000000C2C000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0028000000C28000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}