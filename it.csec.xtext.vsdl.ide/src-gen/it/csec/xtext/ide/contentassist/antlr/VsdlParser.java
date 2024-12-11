/*
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import it.csec.xtext.ide.contentassist.antlr.internal.InternalVsdlParser;
import it.csec.xtext.services.VsdlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VsdlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VsdlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VsdlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getScenElemAccess().getAlternatives(), "rule__ScenElem__Alternatives");
			builder.put(grammarAccess.getNodeConstraintAccess().getAlternatives(), "rule__NodeConstraint__Alternatives");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getOpAlternatives_1_0_1_0(), "rule__SimpleNodeConstraintAndOr__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getSimpleNodeConstraintNotAccess().getAlternatives(), "rule__SimpleNodeConstraintNot__Alternatives");
			builder.put(grammarAccess.getSimpleNodeConstraintAAccess().getAlternatives(), "rule__SimpleNodeConstraintA__Alternatives");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getAlternatives(), "rule__NodeHardwareConstraintA__Alternatives");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getAlternatives(), "rule__NodeNetworkConstraintA__Alternatives");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getAlternatives(), "rule__NodeSoftwareConstraintA__Alternatives");
			builder.put(grammarAccess.getNetworkConstraintAccess().getAlternatives(), "rule__NetworkConstraint__Alternatives");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getOpAlternatives_1_0_1_0(), "rule__SimpleNetworkConstraintAndOr__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getSimpleNetworkConstraintNotAccess().getAlternatives(), "rule__SimpleNetworkConstraintNot__Alternatives");
			builder.put(grammarAccess.getSimpleNetworkConstraintAAccess().getAlternatives(), "rule__SimpleNetworkConstraintA__Alternatives");
			builder.put(grammarAccess.getNetworkGatewayConstraintAccess().getAlternatives(), "rule__NetworkGatewayConstraint__Alternatives");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getAlternatives(), "rule__NetworkParticipantsConstraint__Alternatives");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getOpAlternatives_1_0_1_0(), "rule__UpdateTriggerConstraintAndOr__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getUpdateTriggerConstraintNotAccess().getAlternatives(), "rule__UpdateTriggerConstraintNot__Alternatives");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getAlternatives(), "rule__UpdateTriggerConstraintA__Alternatives");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getOpAlternatives_1_0_1_0(), "rule__TimeExprAddition__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getTimeExprAAccess().getAlternatives(), "rule__TimeExprA__Alternatives");
			builder.put(grammarAccess.getCPUFrequencyAccess().getUnitAlternatives_1_0(), "rule__CPUFrequency__UnitAlternatives_1_0");
			builder.put(grammarAccess.getDiskSizeAccess().getUnitAlternatives_1_0(), "rule__DiskSize__UnitAlternatives_1_0");
			builder.put(grammarAccess.getRamSizeAccess().getUnitAlternatives_1_0(), "rule__RamSize__UnitAlternatives_1_0");
			builder.put(grammarAccess.getOSVersionEAccess().getAlternatives(), "rule__OSVersionE__Alternatives");
			builder.put(grammarAccess.getOSFamilyEAccess().getAlternatives(), "rule__OSFamilyE__Alternatives");
			builder.put(grammarAccess.getIPOperationAccess().getAlternatives(), "rule__IPOperation__Alternatives");
			builder.put(grammarAccess.getHardwareProfileAccess().getAlternatives(), "rule__HardwareProfile__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_2(), "rule__Model__Group_2__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeConstraintAccess().getGroup_0(), "rule__NodeConstraint__Group_0__0");
			builder.put(grammarAccess.getNodeConstraintAccess().getGroup_1(), "rule__NodeConstraint__Group_1__0");
			builder.put(grammarAccess.getGuardedNodeConstraintAccess().getGroup(), "rule__GuardedNodeConstraint__Group__0");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getGroup(), "rule__SimpleNodeConstraintAndOr__Group__0");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getGroup_1(), "rule__SimpleNodeConstraintAndOr__Group_1__0");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getGroup_1_0(), "rule__SimpleNodeConstraintAndOr__Group_1_0__0");
			builder.put(grammarAccess.getSimpleNodeConstraintNotAccess().getGroup_0(), "rule__SimpleNodeConstraintNot__Group_0__0");
			builder.put(grammarAccess.getSimpleNodeConstraintAAccess().getGroup_0(), "rule__SimpleNodeConstraintA__Group_0__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_0(), "rule__NodeHardwareConstraintA__Group_0__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_1(), "rule__NodeHardwareConstraintA__Group_1__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_2(), "rule__NodeHardwareConstraintA__Group_2__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_3(), "rule__NodeHardwareConstraintA__Group_3__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_4(), "rule__NodeHardwareConstraintA__Group_4__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_5(), "rule__NodeHardwareConstraintA__Group_5__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_6(), "rule__NodeHardwareConstraintA__Group_6__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_7(), "rule__NodeHardwareConstraintA__Group_7__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_8(), "rule__NodeHardwareConstraintA__Group_8__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_9(), "rule__NodeHardwareConstraintA__Group_9__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_10(), "rule__NodeHardwareConstraintA__Group_10__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_11(), "rule__NodeHardwareConstraintA__Group_11__0");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getGroup_12(), "rule__NodeHardwareConstraintA__Group_12__0");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGroup_0(), "rule__NodeNetworkConstraintA__Group_0__0");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGroup_1(), "rule__NodeNetworkConstraintA__Group_1__0");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGroup_2(), "rule__NodeNetworkConstraintA__Group_2__0");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGroup_3(), "rule__NodeNetworkConstraintA__Group_3__0");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGroup_4(), "rule__NodeNetworkConstraintA__Group_4__0");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getGroup_0(), "rule__NodeSoftwareConstraintA__Group_0__0");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getGroup_1(), "rule__NodeSoftwareConstraintA__Group_1__0");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getGroup_2(), "rule__NodeSoftwareConstraintA__Group_2__0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getGroup(), "rule__SoftwareInstallation__Group__0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getGroup_1(), "rule__SoftwareInstallation__Group_1__0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getGroup_2(), "rule__SoftwareInstallation__Group_2__0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getGroup_2_2(), "rule__SoftwareInstallation__Group_2_2__0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getGroup_3(), "rule__SoftwareInstallation__Group_3__0");
			builder.put(grammarAccess.getVersionNumberAccess().getGroup(), "rule__VersionNumber__Group__0");
			builder.put(grammarAccess.getVersionNumberAccess().getGroup_1(), "rule__VersionNumber__Group_1__0");
			builder.put(grammarAccess.getConfigOptionsAccess().getGroup(), "rule__ConfigOptions__Group__0");
			builder.put(grammarAccess.getConfigOptionsAccess().getGroup_2(), "rule__ConfigOptions__Group_2__0");
			builder.put(grammarAccess.getConfigPairAccess().getGroup(), "rule__ConfigPair__Group__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup(), "rule__Network__Group__0");
			builder.put(grammarAccess.getNetworkConstraintAccess().getGroup_0(), "rule__NetworkConstraint__Group_0__0");
			builder.put(grammarAccess.getNetworkConstraintAccess().getGroup_1(), "rule__NetworkConstraint__Group_1__0");
			builder.put(grammarAccess.getGuardedNetworkConstraintAccess().getGroup(), "rule__GuardedNetworkConstraint__Group__0");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getGroup(), "rule__SimpleNetworkConstraintAndOr__Group__0");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getGroup_1(), "rule__SimpleNetworkConstraintAndOr__Group_1__0");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getGroup_1_0(), "rule__SimpleNetworkConstraintAndOr__Group_1_0__0");
			builder.put(grammarAccess.getSimpleNetworkConstraintNotAccess().getGroup_0(), "rule__SimpleNetworkConstraintNot__Group_0__0");
			builder.put(grammarAccess.getSimpleNetworkConstraintAAccess().getGroup_0(), "rule__SimpleNetworkConstraintA__Group_0__0");
			builder.put(grammarAccess.getNetworkGatewayConstraintAccess().getGroup_0(), "rule__NetworkGatewayConstraint__Group_0__0");
			builder.put(grammarAccess.getNetworkGatewayConstraintAccess().getGroup_1(), "rule__NetworkGatewayConstraint__Group_1__0");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getGroup_0(), "rule__NetworkParticipantsConstraint__Group_0__0");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getGroup_1(), "rule__NetworkParticipantsConstraint__Group_1__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getGroup(), "rule__UpdateTriggerConstraintAndOr__Group__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getGroup_1(), "rule__UpdateTriggerConstraintAndOr__Group_1__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getGroup_1_0(), "rule__UpdateTriggerConstraintAndOr__Group_1_0__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintNotAccess().getGroup_0(), "rule__UpdateTriggerConstraintNot__Group_0__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getGroup_0(), "rule__UpdateTriggerConstraintA__Group_0__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getGroup_1(), "rule__UpdateTriggerConstraintA__Group_1__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getGroup_2(), "rule__UpdateTriggerConstraintA__Group_2__0");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getGroup_3(), "rule__UpdateTriggerConstraintA__Group_3__0");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getGroup(), "rule__TimeExprAddition__Group__0");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getGroup_1(), "rule__TimeExprAddition__Group_1__0");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getGroup_1_0(), "rule__TimeExprAddition__Group_1_0__0");
			builder.put(grammarAccess.getTimeExprMultiplicationAccess().getGroup(), "rule__TimeExprMultiplication__Group__0");
			builder.put(grammarAccess.getTimeExprMultiplicationAccess().getGroup_1(), "rule__TimeExprMultiplication__Group_1__0");
			builder.put(grammarAccess.getTimeExprMultiplicationAccess().getGroup_1_0(), "rule__TimeExprMultiplication__Group_1_0__0");
			builder.put(grammarAccess.getTimeExprAAccess().getGroup_0(), "rule__TimeExprA__Group_0__0");
			builder.put(grammarAccess.getCPUFrequencyAccess().getGroup(), "rule__CPUFrequency__Group__0");
			builder.put(grammarAccess.getDiskSizeAccess().getGroup(), "rule__DiskSize__Group__0");
			builder.put(grammarAccess.getRamSizeAccess().getGroup(), "rule__RamSize__Group__0");
			builder.put(grammarAccess.getIPAddressAccess().getGroup(), "rule__IPAddress__Group__0");
			builder.put(grammarAccess.getIPRangeAAccess().getGroup(), "rule__IPRangeA__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getTimeToUseAssignment_2_1(), "rule__Model__TimeToUseAssignment_2_1");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_4(), "rule__Model__ElementsAssignment_4");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
			builder.put(grammarAccess.getNodeAccess().getConstraintsAssignment_3(), "rule__Node__ConstraintsAssignment_3");
			builder.put(grammarAccess.getGuardedNodeConstraintAccess().getTriggerconstraintAssignment_1(), "rule__GuardedNodeConstraint__TriggerconstraintAssignment_1");
			builder.put(grammarAccess.getGuardedNodeConstraintAccess().getNodeconstraintAssignment_4(), "rule__GuardedNodeConstraint__NodeconstraintAssignment_4");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getOpAssignment_1_0_1(), "rule__SimpleNodeConstraintAndOr__OpAssignment_1_0_1");
			builder.put(grammarAccess.getSimpleNodeConstraintAndOrAccess().getRightAssignment_1_1(), "rule__SimpleNodeConstraintAndOr__RightAssignment_1_1");
			builder.put(grammarAccess.getSimpleNodeConstraintNotAccess().getConstraintAssignment_0_2(), "rule__SimpleNodeConstraintNot__ConstraintAssignment_0_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_0_3(), "rule__NodeHardwareConstraintA__OpAssignment_0_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_0_5(), "rule__NodeHardwareConstraintA__ValueAssignment_0_5");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_1_2(), "rule__NodeHardwareConstraintA__OpAssignment_1_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_1_4(), "rule__NodeHardwareConstraintA__ValueAssignment_1_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_2_2(), "rule__NodeHardwareConstraintA__OpAssignment_2_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_2_4(), "rule__NodeHardwareConstraintA__ValueAssignment_2_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getSameasAssignment_3_3(), "rule__NodeHardwareConstraintA__SameasAssignment_3_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getIdAssignment_3_4(), "rule__NodeHardwareConstraintA__IdAssignment_3_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_4_3(), "rule__NodeHardwareConstraintA__OpAssignment_4_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_4_5(), "rule__NodeHardwareConstraintA__ValueAssignment_4_5");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_5_2(), "rule__NodeHardwareConstraintA__OpAssignment_5_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_5_4(), "rule__NodeHardwareConstraintA__ValueAssignment_5_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_6_2(), "rule__NodeHardwareConstraintA__OpAssignment_6_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_6_4(), "rule__NodeHardwareConstraintA__ValueAssignment_6_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getSameasAssignment_7_3(), "rule__NodeHardwareConstraintA__SameasAssignment_7_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getIdAssignment_7_4(), "rule__NodeHardwareConstraintA__IdAssignment_7_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_8_3(), "rule__NodeHardwareConstraintA__OpAssignment_8_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_8_5(), "rule__NodeHardwareConstraintA__ValueAssignment_8_5");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_9_2(), "rule__NodeHardwareConstraintA__OpAssignment_9_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_9_4(), "rule__NodeHardwareConstraintA__ValueAssignment_9_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getOpAssignment_10_2(), "rule__NodeHardwareConstraintA__OpAssignment_10_2");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getValueAssignment_10_4(), "rule__NodeHardwareConstraintA__ValueAssignment_10_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getSameasAssignment_11_3(), "rule__NodeHardwareConstraintA__SameasAssignment_11_3");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getIdAssignment_11_4(), "rule__NodeHardwareConstraintA__IdAssignment_11_4");
			builder.put(grammarAccess.getNodeHardwareConstraintAAccess().getProfileAssignment_12_2(), "rule__NodeHardwareConstraintA__ProfileAssignment_12_2");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getOpAssignment_0_3(), "rule__NodeNetworkConstraintA__OpAssignment_0_3");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getIpAddressAssignment_0_5(), "rule__NodeNetworkConstraintA__IpAddressAssignment_0_5");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getOpAssignment_1_3(), "rule__NodeNetworkConstraintA__OpAssignment_1_3");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getIpRangeAssignment_1_5(), "rule__NodeNetworkConstraintA__IpRangeAssignment_1_5");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getOpAssignment_2_4(), "rule__NodeNetworkConstraintA__OpAssignment_2_4");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getNodeAssignment_2_6(), "rule__NodeNetworkConstraintA__NodeAssignment_2_6");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getGatewayIPAssignment_3_3(), "rule__NodeNetworkConstraintA__GatewayIPAssignment_3_3");
			builder.put(grammarAccess.getNodeNetworkConstraintAAccess().getDNSIPAssignment_4_3(), "rule__NodeNetworkConstraintA__DNSIPAssignment_4_3");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getVersionAssignment_0_4(), "rule__NodeSoftwareConstraintA__VersionAssignment_0_4");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getFamilyAssignment_1_5(), "rule__NodeSoftwareConstraintA__FamilyAssignment_1_5");
			builder.put(grammarAccess.getNodeSoftwareConstraintAAccess().getSoftwareAssignment_2_2(), "rule__NodeSoftwareConstraintA__SoftwareAssignment_2_2");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getSoftwareIDAssignment_0(), "rule__SoftwareInstallation__SoftwareIDAssignment_0");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getVersionAssignment_1_1(), "rule__SoftwareInstallation__VersionAssignment_1_1");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getDependenciesAssignment_2_1(), "rule__SoftwareInstallation__DependenciesAssignment_2_1");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getDependenciesAssignment_2_2_1(), "rule__SoftwareInstallation__DependenciesAssignment_2_2_1");
			builder.put(grammarAccess.getSoftwareInstallationAccess().getConfigAssignment_3_1(), "rule__SoftwareInstallation__ConfigAssignment_3_1");
			builder.put(grammarAccess.getSoftwareDependencyAccess().getDependencyIDAssignment(), "rule__SoftwareDependency__DependencyIDAssignment");
			builder.put(grammarAccess.getConfigOptionsAccess().getConfigPairsAssignment_1(), "rule__ConfigOptions__ConfigPairsAssignment_1");
			builder.put(grammarAccess.getConfigOptionsAccess().getConfigPairsAssignment_2_1(), "rule__ConfigOptions__ConfigPairsAssignment_2_1");
			builder.put(grammarAccess.getConfigPairAccess().getKeyAssignment_0(), "rule__ConfigPair__KeyAssignment_0");
			builder.put(grammarAccess.getConfigPairAccess().getValueAssignment_2(), "rule__ConfigPair__ValueAssignment_2");
			builder.put(grammarAccess.getNetworkAccess().getNameAssignment_1(), "rule__Network__NameAssignment_1");
			builder.put(grammarAccess.getNetworkAccess().getConstraintsAssignment_3(), "rule__Network__ConstraintsAssignment_3");
			builder.put(grammarAccess.getGuardedNetworkConstraintAccess().getNetworktriggerconstraintAssignment_1(), "rule__GuardedNetworkConstraint__NetworktriggerconstraintAssignment_1");
			builder.put(grammarAccess.getGuardedNetworkConstraintAccess().getNetworkconstraintAssignment_4(), "rule__GuardedNetworkConstraint__NetworkconstraintAssignment_4");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getOpAssignment_1_0_1(), "rule__SimpleNetworkConstraintAndOr__OpAssignment_1_0_1");
			builder.put(grammarAccess.getSimpleNetworkConstraintAndOrAccess().getRightAssignment_1_1(), "rule__SimpleNetworkConstraintAndOr__RightAssignment_1_1");
			builder.put(grammarAccess.getSimpleNetworkConstraintNotAccess().getConstraintAssignment_0_2(), "rule__SimpleNetworkConstraintNot__ConstraintAssignment_0_2");
			builder.put(grammarAccess.getNetworkGatewayConstraintAccess().getRangeAssignment_0_4(), "rule__NetworkGatewayConstraint__RangeAssignment_0_4");
			builder.put(grammarAccess.getNetworkGatewayConstraintAccess().getInternetAssignment_1_7(), "rule__NetworkGatewayConstraint__InternetAssignment_1_7");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getIdAssignment_0_1(), "rule__NetworkParticipantsConstraint__IdAssignment_0_1");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getOpAssignment_0_3(), "rule__NetworkParticipantsConstraint__OpAssignment_0_3");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getIdAssignment_1_1(), "rule__NetworkParticipantsConstraint__IdAssignment_1_1");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getOpAssignment_1_3(), "rule__NetworkParticipantsConstraint__OpAssignment_1_3");
			builder.put(grammarAccess.getNetworkParticipantsConstraintAccess().getIpAssignment_1_4(), "rule__NetworkParticipantsConstraint__IpAssignment_1_4");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getOpAssignment_1_0_1(), "rule__UpdateTriggerConstraintAndOr__OpAssignment_1_0_1");
			builder.put(grammarAccess.getUpdateTriggerConstraintAndOrAccess().getRightAssignment_1_1(), "rule__UpdateTriggerConstraintAndOr__RightAssignment_1_1");
			builder.put(grammarAccess.getUpdateTriggerConstraintNotAccess().getConstraintAssignment_0_2(), "rule__UpdateTriggerConstraintNot__ConstraintAssignment_0_2");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getOpAssignment_1_2(), "rule__UpdateTriggerConstraintA__OpAssignment_1_2");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getVariableAssignment_1_4(), "rule__UpdateTriggerConstraintA__VariableAssignment_1_4");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpAssignment_1_6(), "rule__UpdateTriggerConstraintA__TexpAssignment_1_6");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getOpAssignment_2_2(), "rule__UpdateTriggerConstraintA__OpAssignment_2_2");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getVariableAssignment_2_4(), "rule__UpdateTriggerConstraintA__VariableAssignment_2_4");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpAssignment_2_6(), "rule__UpdateTriggerConstraintA__TexpAssignment_2_6");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getVariableAssignment_3_3(), "rule__UpdateTriggerConstraintA__VariableAssignment_3_3");
			builder.put(grammarAccess.getUpdateTriggerConstraintAAccess().getTexpAssignment_3_5(), "rule__UpdateTriggerConstraintA__TexpAssignment_3_5");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getOpAssignment_1_0_1(), "rule__TimeExprAddition__OpAssignment_1_0_1");
			builder.put(grammarAccess.getTimeExprAdditionAccess().getRightAssignment_1_1(), "rule__TimeExprAddition__RightAssignment_1_1");
			builder.put(grammarAccess.getTimeExprMultiplicationAccess().getOpAssignment_1_0_1(), "rule__TimeExprMultiplication__OpAssignment_1_0_1");
			builder.put(grammarAccess.getTimeExprMultiplicationAccess().getRightAssignment_1_1(), "rule__TimeExprMultiplication__RightAssignment_1_1");
			builder.put(grammarAccess.getTimeExprAAccess().getVariableAssignment_1(), "rule__TimeExprA__VariableAssignment_1");
			builder.put(grammarAccess.getTimeExprAAccess().getIntervalAssignment_2(), "rule__TimeExprA__IntervalAssignment_2");
			builder.put(grammarAccess.getTimeIntervalAccess().getValueAssignment(), "rule__TimeInterval__ValueAssignment");
			builder.put(grammarAccess.getCPUFrequencyAccess().getValueAssignment_0(), "rule__CPUFrequency__ValueAssignment_0");
			builder.put(grammarAccess.getCPUFrequencyAccess().getUnitAssignment_1(), "rule__CPUFrequency__UnitAssignment_1");
			builder.put(grammarAccess.getDiskSizeAccess().getValueAssignment_0(), "rule__DiskSize__ValueAssignment_0");
			builder.put(grammarAccess.getDiskSizeAccess().getUnitAssignment_1(), "rule__DiskSize__UnitAssignment_1");
			builder.put(grammarAccess.getRamSizeAccess().getValueAssignment_0(), "rule__RamSize__ValueAssignment_0");
			builder.put(grammarAccess.getRamSizeAccess().getUnitAssignment_1(), "rule__RamSize__UnitAssignment_1");
			builder.put(grammarAccess.getIPAddressAccess().getOctet1Assignment_0(), "rule__IPAddress__Octet1Assignment_0");
			builder.put(grammarAccess.getIPAddressAccess().getOctet2Assignment_2(), "rule__IPAddress__Octet2Assignment_2");
			builder.put(grammarAccess.getIPAddressAccess().getOctet3Assignment_4(), "rule__IPAddress__Octet3Assignment_4");
			builder.put(grammarAccess.getIPAddressAccess().getOctet4Assignment_6(), "rule__IPAddress__Octet4Assignment_6");
			builder.put(grammarAccess.getIPRangeAAccess().getAddressAssignment_0(), "rule__IPRangeA__AddressAssignment_0");
			builder.put(grammarAccess.getIPRangeAAccess().getBitmaskAssignment_2(), "rule__IPRangeA__BitmaskAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VsdlGrammarAccess grammarAccess;

	@Override
	protected InternalVsdlParser createParser() {
		InternalVsdlParser result = new InternalVsdlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VsdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VsdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
