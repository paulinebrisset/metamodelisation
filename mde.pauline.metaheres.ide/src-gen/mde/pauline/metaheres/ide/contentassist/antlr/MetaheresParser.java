/*
 * generated by Xtext 2.27.0
 */
package mde.pauline.metaheres.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import mde.pauline.metaheres.ide.contentassist.antlr.internal.InternalMetaheresParser;
import mde.pauline.metaheres.services.MetaheresGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MetaheresParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MetaheresGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MetaheresGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getServiceNameAccess().getGroup(), "rule__ServiceName__Group__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup(), "rule__ServiceConfig__Group__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_7(), "rule__ServiceConfig__Group_7__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_8(), "rule__ServiceConfig__Group_8__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_8_4(), "rule__ServiceConfig__Group_8_4__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_14(), "rule__ServiceConfig__Group_14__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_22(), "rule__ServiceConfig__Group_22__0");
			builder.put(grammarAccess.getServiceConfigAccess().getGroup_23(), "rule__ServiceConfig__Group_23__0");
			builder.put(grammarAccess.getLanguageAccess().getGroup(), "rule__Language__Group__0");
			builder.put(grammarAccess.getReservationsConfigAccess().getGroup(), "rule__ReservationsConfig__Group__0");
			builder.put(grammarAccess.getCountryAccess().getGroup(), "rule__Country__Group__0");
			builder.put(grammarAccess.getResourcesConfigAccess().getGroup(), "rule__ResourcesConfig__Group__0");
			builder.put(grammarAccess.getLotsConfigAccess().getGroup(), "rule__LotsConfig__Group__0");
			builder.put(grammarAccess.getPricingSystemAccess().getGroup(), "rule__PricingSystem__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getStatusListAccess().getGroup(), "rule__StatusList__Group__0");
			builder.put(grammarAccess.getStatusListAccess().getGroup_2(), "rule__StatusList__Group_2__0");
			builder.put(grammarAccess.getStatusAccess().getGroup(), "rule__Status__Group__0");
			builder.put(grammarAccess.getServiceNameAccess().getNameAssignment_0(), "rule__ServiceName__NameAssignment_0");
			builder.put(grammarAccess.getServiceNameAccess().getServiceconfigAssignment_2(), "rule__ServiceName__ServiceconfigAssignment_2");
			builder.put(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysAssignment_0(), "rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0");
			builder.put(grammarAccess.getServiceConfigAccess().getInventoryIsPublicAssignment_1(), "rule__ServiceConfig__InventoryIsPublicAssignment_1");
			builder.put(grammarAccess.getServiceConfigAccess().getHasChartAssignment_2(), "rule__ServiceConfig__HasChartAssignment_2");
			builder.put(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysAssignment_3(), "rule__ServiceConfig__CountInBusinessDaysAssignment_3");
			builder.put(grammarAccess.getServiceConfigAccess().getCountryAssignment_6(), "rule__ServiceConfig__CountryAssignment_6");
			builder.put(grammarAccess.getServiceConfigAccess().getCountryAssignment_7_1(), "rule__ServiceConfig__CountryAssignment_7_1");
			builder.put(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_3(), "rule__ServiceConfig__PricingsystemAssignment_8_3");
			builder.put(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_4_1(), "rule__ServiceConfig__PricingsystemAssignment_8_4_1");
			builder.put(grammarAccess.getServiceConfigAccess().getLanguageAssignment_13(), "rule__ServiceConfig__LanguageAssignment_13");
			builder.put(grammarAccess.getServiceConfigAccess().getLanguageAssignment_14_1(), "rule__ServiceConfig__LanguageAssignment_14_1");
			builder.put(grammarAccess.getServiceConfigAccess().getReservationsconfigAssignment_18(), "rule__ServiceConfig__ReservationsconfigAssignment_18");
			builder.put(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_21(), "rule__ServiceConfig__ResourcesconfigAssignment_21");
			builder.put(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_22_1(), "rule__ServiceConfig__ResourcesconfigAssignment_22_1");
			builder.put(grammarAccess.getServiceConfigAccess().getLotsconfigAssignment_23_2(), "rule__ServiceConfig__LotsconfigAssignment_23_2");
			builder.put(grammarAccess.getLanguageAccess().getNameAssignment_1(), "rule__Language__NameAssignment_1");
			builder.put(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckAssignment_0(), "rule__ReservationsConfig__HasMoveOutCheckAssignment_0");
			builder.put(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckAssignment_1(), "rule__ReservationsConfig__HasMoveInCheckAssignment_1");
			builder.put(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceAssignment_4(), "rule__ReservationsConfig__MinRequestAdvanceAssignment_4");
			builder.put(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceAssignment_6(), "rule__ReservationsConfig__MaxRequestAdvanceAssignment_6");
			builder.put(grammarAccess.getReservationsConfigAccess().getStatuslistAssignment_9(), "rule__ReservationsConfig__StatuslistAssignment_9");
			builder.put(grammarAccess.getCountryAccess().getNameAssignment_0(), "rule__Country__NameAssignment_0");
			builder.put(grammarAccess.getCountryAccess().getLanguageAssignment_2(), "rule__Country__LanguageAssignment_2");
			builder.put(grammarAccess.getCountryAccess().getPricingsystemAssignment_6(), "rule__Country__PricingsystemAssignment_6");
			builder.put(grammarAccess.getResourcesConfigAccess().getHasImageAssignment_1(), "rule__ResourcesConfig__HasImageAssignment_1");
			builder.put(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotAssignment_2(), "rule__ResourcesConfig__HasOneStockPerSlotAssignment_2");
			builder.put(grammarAccess.getResourcesConfigAccess().getIsConsumableAssignment_3(), "rule__ResourcesConfig__IsConsumableAssignment_3");
			builder.put(grammarAccess.getResourcesConfigAccess().getIsLoanAssignment_4(), "rule__ResourcesConfig__IsLoanAssignment_4");
			builder.put(grammarAccess.getResourcesConfigAccess().getIsChargedAssignment_5(), "rule__ResourcesConfig__IsChargedAssignment_5");
			builder.put(grammarAccess.getLotsConfigAccess().getHasImageAssignment_2(), "rule__LotsConfig__HasImageAssignment_2");
			builder.put(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotAssignment_3(), "rule__LotsConfig__HasOneStockPerSlotAssignment_3");
			builder.put(grammarAccess.getPricingSystemAccess().getNameAssignment_0(), "rule__PricingSystem__NameAssignment_0");
			builder.put(grammarAccess.getPricingSystemAccess().getCurrencyAssignment_4(), "rule__PricingSystem__CurrencyAssignment_4");
			builder.put(grammarAccess.getPricingSystemAccess().getTaxSystemAssignment_8(), "rule__PricingSystem__TaxSystemAssignment_8");
			builder.put(grammarAccess.getStatusListAccess().getStatusAssignment_1(), "rule__StatusList__StatusAssignment_1");
			builder.put(grammarAccess.getStatusListAccess().getStatusAssignment_2_1(), "rule__StatusList__StatusAssignment_2_1");
			builder.put(grammarAccess.getStatusAccess().getNameAssignment_1(), "rule__Status__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MetaheresGrammarAccess grammarAccess;

	@Override
	protected InternalMetaheresParser createParser() {
		InternalMetaheresParser result = new InternalMetaheresParser(null);
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

	public MetaheresGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MetaheresGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
