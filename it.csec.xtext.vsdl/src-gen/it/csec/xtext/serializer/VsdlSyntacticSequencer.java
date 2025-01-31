/*
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.serializer;

import com.google.inject.Inject;
import it.csec.xtext.services.VsdlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VsdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VsdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_TimeExprA_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_TimeExprA_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VsdlGrammarAccess) access;
		match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getSimpleNetworkConstraintAAccess().getLeftParenthesisKeyword_0_0());
		match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getSimpleNetworkConstraintAAccess().getLeftParenthesisKeyword_0_0());
		match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getSimpleNodeConstraintAAccess().getLeftParenthesisKeyword_0_0());
		match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getSimpleNodeConstraintAAccess().getLeftParenthesisKeyword_0_0());
		match_TimeExprA_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getTimeExprAAccess().getLeftParenthesisKeyword_0_0());
		match_TimeExprA_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getTimeExprAAccess().getLeftParenthesisKeyword_0_0());
		match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getUpdateTriggerConstraintAAccess().getLeftParenthesisKeyword_0_0());
		match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getUpdateTriggerConstraintAAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TimeExprA_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_TimeExprA_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TimeExprA_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_TimeExprA_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'addresses' 'range' 'is' range=IPRangeA
	 *     (rule start) (ambiguity) 'gateway' 'has' 'direct' 'access' 'to' 'the' internet?='Internet'
	 *     (rule start) (ambiguity) 'node' id=[ScenElem|ID]
	 *     (rule start) (ambiguity) 'not' constraint=SimpleNetworkConstraintA
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'not' constraint=SimpleNetworkConstraintA
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_SimpleNetworkConstraintA_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'cpu' 'speed' op='equal'
	 *     (rule start) (ambiguity) 'cpu' 'speed' sameas?='of'
	 *     (rule start) (ambiguity) 'cpu' op='faster'
	 *     (rule start) (ambiguity) 'cpu' op='slower'
	 *     (rule start) (ambiguity) 'disk' 'size' op='equal'
	 *     (rule start) (ambiguity) 'disk' 'size' sameas?='of'
	 *     (rule start) (ambiguity) 'disk' op='larger'
	 *     (rule start) (ambiguity) 'disk' op='smaller'
	 *     (rule start) (ambiguity) 'flavour' profile=HardwareProfile
	 *     (rule start) (ambiguity) 'mounts' 'software' software=SoftwareInstallation
	 *     (rule start) (ambiguity) 'node' 'OS' 'family' 'is' family=OSFamilyE
	 *     (rule start) (ambiguity) 'node' 'OS' 'is' version=OSVersionE
	 *     (rule start) (ambiguity) 'not' constraint=SimpleNodeConstraintA
	 *     (rule start) (ambiguity) 'ram' 'size' op='equal'
	 *     (rule start) (ambiguity) 'ram' 'size' sameas?='of'
	 *     (rule start) (ambiguity) 'ram' op='larger'
	 *     (rule start) (ambiguity) 'ram' op='smaller'
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'not' constraint=SimpleNodeConstraintA
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_SimpleNodeConstraintA_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) interval=TimeInterval
	 *     (rule start) (ambiguity) variable=ID
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {PlusMinus.left=}
	 
	 * </pre>
	 */
	protected void emit_TimeExprA_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {PlusMinus.left=}
	 
	 * </pre>
	 */
	protected void emit_TimeExprA_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'at' op='least'
	 *     (rule start) (ambiguity) 'at' op='most'
	 *     (rule start) (ambiguity) 'not' constraint=UpdateTriggerConstraintA
	 *     (rule start) (ambiguity) 'switch' 'after' variable=ID
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'not' constraint=UpdateTriggerConstraintA
	 *     (rule start) (ambiguity) {AndOr.left=}
	 
	 * </pre>
	 */
	protected void emit_UpdateTriggerConstraintA_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
