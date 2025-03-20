package mde.pauline.metaheres.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mde.pauline.metaheres.services.MetaheresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaheresParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'ferme-les-jours-feries'", "'inventaire-public'", "'charte-d-utilisation-visible'", "'compte-en-jours-ouvrables'", "'pays'", "','", "'paiements-proposes'", "'('", "')'", "'langues'", "'configuration-reservations'", "'configuration-ressources'", "'lotsconfig'", "'etat-des-lieux-sortie'", "'etat-des-lieux-retour'", "'avance-minimum-et-maximum-reservation'", "'statuts-des-demandes'", "'tarification'", "'avec-illustration'", "'un-stock-par-ouverture'", "'type-consommable'", "'emprunt-avec-retour'", "'payant'", "'devise'", "'systeme-comptable'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalMetaheresParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetaheresParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetaheresParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMetaheres.g"; }



     	private MetaheresGrammarAccess grammarAccess;

        public InternalMetaheresParser(TokenStream input, MetaheresGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ServiceName";
       	}

       	@Override
       	protected MetaheresGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleServiceName"
    // InternalMetaheres.g:64:1: entryRuleServiceName returns [EObject current=null] : iv_ruleServiceName= ruleServiceName EOF ;
    public final EObject entryRuleServiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceName = null;


        try {
            // InternalMetaheres.g:64:52: (iv_ruleServiceName= ruleServiceName EOF )
            // InternalMetaheres.g:65:2: iv_ruleServiceName= ruleServiceName EOF
            {
             newCompositeNode(grammarAccess.getServiceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceName=ruleServiceName();

            state._fsp--;

             current =iv_ruleServiceName; 
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
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalMetaheres.g:71:1: ruleServiceName returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_serviceconfig_2_0= ruleServiceConfig ) ) ) ;
    public final EObject ruleServiceName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_serviceconfig_2_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:77:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_serviceconfig_2_0= ruleServiceConfig ) ) ) )
            // InternalMetaheres.g:78:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_serviceconfig_2_0= ruleServiceConfig ) ) )
            {
            // InternalMetaheres.g:78:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_serviceconfig_2_0= ruleServiceConfig ) ) )
            // InternalMetaheres.g:79:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_serviceconfig_2_0= ruleServiceConfig ) )
            {
            // InternalMetaheres.g:79:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMetaheres.g:80:4: (lv_name_0_0= ruleEString )
            {
            // InternalMetaheres.g:80:4: (lv_name_0_0= ruleEString )
            // InternalMetaheres.g:81:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceNameAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mde.pauline.metaheres.Metaheres.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceNameAccess().getColonKeyword_1());
            		
            // InternalMetaheres.g:102:3: ( (lv_serviceconfig_2_0= ruleServiceConfig ) )
            // InternalMetaheres.g:103:4: (lv_serviceconfig_2_0= ruleServiceConfig )
            {
            // InternalMetaheres.g:103:4: (lv_serviceconfig_2_0= ruleServiceConfig )
            // InternalMetaheres.g:104:5: lv_serviceconfig_2_0= ruleServiceConfig
            {

            					newCompositeNode(grammarAccess.getServiceNameAccess().getServiceconfigServiceConfigParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_serviceconfig_2_0=ruleServiceConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceNameRule());
            					}
            					set(
            						current,
            						"serviceconfig",
            						lv_serviceconfig_2_0,
            						"mde.pauline.metaheres.Metaheres.ServiceConfig");
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
    // $ANTLR end "ruleServiceName"


    // $ANTLR start "entryRuleEString"
    // InternalMetaheres.g:125:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMetaheres.g:125:47: (iv_ruleEString= ruleEString EOF )
            // InternalMetaheres.g:126:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMetaheres.g:132:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMetaheres.g:138:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMetaheres.g:139:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMetaheres.g:139:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMetaheres.g:140:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMetaheres.g:148:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleServiceConfig"
    // InternalMetaheres.g:159:1: entryRuleServiceConfig returns [EObject current=null] : iv_ruleServiceConfig= ruleServiceConfig EOF ;
    public final EObject entryRuleServiceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConfig = null;


        try {
            // InternalMetaheres.g:159:54: (iv_ruleServiceConfig= ruleServiceConfig EOF )
            // InternalMetaheres.g:160:2: iv_ruleServiceConfig= ruleServiceConfig EOF
            {
             newCompositeNode(grammarAccess.getServiceConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConfig=ruleServiceConfig();

            state._fsp--;

             current =iv_ruleServiceConfig; 
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
    // $ANTLR end "entryRuleServiceConfig"


    // $ANTLR start "ruleServiceConfig"
    // InternalMetaheres.g:166:1: ruleServiceConfig returns [EObject current=null] : ( ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )? ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )? ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )? ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )? otherlv_4= 'pays' otherlv_5= ':' ( (lv_country_6_0= ruleCountry ) ) (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )* (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' otherlv_16= 'langues' otherlv_17= ':' otherlv_18= '(' ( (lv_language_19_0= ruleLanguage ) ) (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )* otherlv_22= ')' otherlv_23= 'configuration-reservations' otherlv_24= ':' ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) ) otherlv_26= 'configuration-ressources' otherlv_27= ':' ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) ) (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )* (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )? ) ;
    public final EObject ruleServiceConfig() throws RecognitionException {
        EObject current = null;

        Token lv_closesOnPublicHolidays_0_0=null;
        Token lv_inventoryIsPublic_1_0=null;
        Token lv_hasChart_2_0=null;
        Token lv_countInBusinessDays_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_country_6_0 = null;

        EObject lv_country_8_0 = null;

        EObject lv_language_19_0 = null;

        EObject lv_language_21_0 = null;

        EObject lv_reservationsconfig_25_0 = null;

        EObject lv_resourcesconfig_28_0 = null;

        EObject lv_resourcesconfig_30_0 = null;

        EObject lv_lotsconfig_33_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:172:2: ( ( ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )? ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )? ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )? ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )? otherlv_4= 'pays' otherlv_5= ':' ( (lv_country_6_0= ruleCountry ) ) (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )* (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' otherlv_16= 'langues' otherlv_17= ':' otherlv_18= '(' ( (lv_language_19_0= ruleLanguage ) ) (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )* otherlv_22= ')' otherlv_23= 'configuration-reservations' otherlv_24= ':' ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) ) otherlv_26= 'configuration-ressources' otherlv_27= ':' ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) ) (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )* (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )? ) )
            // InternalMetaheres.g:173:2: ( ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )? ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )? ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )? ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )? otherlv_4= 'pays' otherlv_5= ':' ( (lv_country_6_0= ruleCountry ) ) (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )* (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' otherlv_16= 'langues' otherlv_17= ':' otherlv_18= '(' ( (lv_language_19_0= ruleLanguage ) ) (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )* otherlv_22= ')' otherlv_23= 'configuration-reservations' otherlv_24= ':' ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) ) otherlv_26= 'configuration-ressources' otherlv_27= ':' ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) ) (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )* (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )? )
            {
            // InternalMetaheres.g:173:2: ( ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )? ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )? ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )? ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )? otherlv_4= 'pays' otherlv_5= ':' ( (lv_country_6_0= ruleCountry ) ) (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )* (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' otherlv_16= 'langues' otherlv_17= ':' otherlv_18= '(' ( (lv_language_19_0= ruleLanguage ) ) (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )* otherlv_22= ')' otherlv_23= 'configuration-reservations' otherlv_24= ':' ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) ) otherlv_26= 'configuration-ressources' otherlv_27= ':' ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) ) (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )* (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )? )
            // InternalMetaheres.g:174:3: ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )? ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )? ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )? ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )? otherlv_4= 'pays' otherlv_5= ':' ( (lv_country_6_0= ruleCountry ) ) (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )* (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= ')' otherlv_16= 'langues' otherlv_17= ':' otherlv_18= '(' ( (lv_language_19_0= ruleLanguage ) ) (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )* otherlv_22= ')' otherlv_23= 'configuration-reservations' otherlv_24= ':' ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) ) otherlv_26= 'configuration-ressources' otherlv_27= ':' ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) ) (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )* (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )?
            {
            // InternalMetaheres.g:174:3: ( (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMetaheres.g:175:4: (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' )
                    {
                    // InternalMetaheres.g:175:4: (lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries' )
                    // InternalMetaheres.g:176:5: lv_closesOnPublicHolidays_0_0= 'ferme-les-jours-feries'
                    {
                    lv_closesOnPublicHolidays_0_0=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(lv_closesOnPublicHolidays_0_0, grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysFermeLesJoursFeriesKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceConfigRule());
                    					}
                    					setWithLastConsumed(current, "closesOnPublicHolidays", lv_closesOnPublicHolidays_0_0 != null, "ferme-les-jours-feries");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:188:3: ( (lv_inventoryIsPublic_1_0= 'inventaire-public' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMetaheres.g:189:4: (lv_inventoryIsPublic_1_0= 'inventaire-public' )
                    {
                    // InternalMetaheres.g:189:4: (lv_inventoryIsPublic_1_0= 'inventaire-public' )
                    // InternalMetaheres.g:190:5: lv_inventoryIsPublic_1_0= 'inventaire-public'
                    {
                    lv_inventoryIsPublic_1_0=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(lv_inventoryIsPublic_1_0, grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventairePublicKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceConfigRule());
                    					}
                    					setWithLastConsumed(current, "inventoryIsPublic", lv_inventoryIsPublic_1_0 != null, "inventaire-public");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:202:3: ( (lv_hasChart_2_0= 'charte-d-utilisation-visible' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaheres.g:203:4: (lv_hasChart_2_0= 'charte-d-utilisation-visible' )
                    {
                    // InternalMetaheres.g:203:4: (lv_hasChart_2_0= 'charte-d-utilisation-visible' )
                    // InternalMetaheres.g:204:5: lv_hasChart_2_0= 'charte-d-utilisation-visible'
                    {
                    lv_hasChart_2_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_hasChart_2_0, grammarAccess.getServiceConfigAccess().getHasChartCharteDUtilisationVisibleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasChart", lv_hasChart_2_0 != null, "charte-d-utilisation-visible");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:216:3: ( (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaheres.g:217:4: (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' )
                    {
                    // InternalMetaheres.g:217:4: (lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables' )
                    // InternalMetaheres.g:218:5: lv_countInBusinessDays_3_0= 'compte-en-jours-ouvrables'
                    {
                    lv_countInBusinessDays_3_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_countInBusinessDays_3_0, grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCompteEnJoursOuvrablesKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceConfigRule());
                    					}
                    					setWithLastConsumed(current, "countInBusinessDays", lv_countInBusinessDays_3_0 != null, "compte-en-jours-ouvrables");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConfigAccess().getPaysKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceConfigAccess().getColonKeyword_5());
            		
            // InternalMetaheres.g:238:3: ( (lv_country_6_0= ruleCountry ) )
            // InternalMetaheres.g:239:4: (lv_country_6_0= ruleCountry )
            {
            // InternalMetaheres.g:239:4: (lv_country_6_0= ruleCountry )
            // InternalMetaheres.g:240:5: lv_country_6_0= ruleCountry
            {

            					newCompositeNode(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_country_6_0=ruleCountry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            					}
            					add(
            						current,
            						"country",
            						lv_country_6_0,
            						"mde.pauline.metaheres.Metaheres.Country");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaheres.g:257:3: (otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMetaheres.g:258:4: otherlv_7= ',' ( (lv_country_8_0= ruleCountry ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_7, grammarAccess.getServiceConfigAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMetaheres.g:262:4: ( (lv_country_8_0= ruleCountry ) )
            	    // InternalMetaheres.g:263:5: (lv_country_8_0= ruleCountry )
            	    {
            	    // InternalMetaheres.g:263:5: (lv_country_8_0= ruleCountry )
            	    // InternalMetaheres.g:264:6: lv_country_8_0= ruleCountry
            	    {

            	    						newCompositeNode(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_country_8_0=ruleCountry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"country",
            	    							lv_country_8_0,
            	    							"mde.pauline.metaheres.Metaheres.Country");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMetaheres.g:282:3: (otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMetaheres.g:283:4: otherlv_9= 'paiements-proposes' otherlv_10= ':' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceConfigAccess().getPaiementsProposesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getServiceConfigAccess().getColonKeyword_8_1());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_8_2());
                    			
                    // InternalMetaheres.g:295:4: ( ( ruleEString ) )
                    // InternalMetaheres.g:296:5: ( ruleEString )
                    {
                    // InternalMetaheres.g:296:5: ( ruleEString )
                    // InternalMetaheres.g:297:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceConfigRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMetaheres.g:311:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMetaheres.g:312:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getServiceConfigAccess().getCommaKeyword_8_4_0());
                    	    				
                    	    // InternalMetaheres.g:316:5: ( ( ruleEString ) )
                    	    // InternalMetaheres.g:317:6: ( ruleEString )
                    	    {
                    	    // InternalMetaheres.g:317:6: ( ruleEString )
                    	    // InternalMetaheres.g:318:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServiceConfigRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_9());
            		
            otherlv_16=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getServiceConfigAccess().getLanguesKeyword_10());
            		
            otherlv_17=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getServiceConfigAccess().getColonKeyword_11());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_18, grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_12());
            		
            // InternalMetaheres.g:350:3: ( (lv_language_19_0= ruleLanguage ) )
            // InternalMetaheres.g:351:4: (lv_language_19_0= ruleLanguage )
            {
            // InternalMetaheres.g:351:4: (lv_language_19_0= ruleLanguage )
            // InternalMetaheres.g:352:5: lv_language_19_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_language_19_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            					}
            					add(
            						current,
            						"language",
            						lv_language_19_0,
            						"mde.pauline.metaheres.Metaheres.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaheres.g:369:3: (otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaheres.g:370:4: otherlv_20= ',' ( (lv_language_21_0= ruleLanguage ) )
            	    {
            	    otherlv_20=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_20, grammarAccess.getServiceConfigAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalMetaheres.g:374:4: ( (lv_language_21_0= ruleLanguage ) )
            	    // InternalMetaheres.g:375:5: (lv_language_21_0= ruleLanguage )
            	    {
            	    // InternalMetaheres.g:375:5: (lv_language_21_0= ruleLanguage )
            	    // InternalMetaheres.g:376:6: lv_language_21_0= ruleLanguage
            	    {

            	    						newCompositeNode(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_language_21_0=ruleLanguage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"language",
            	    							lv_language_21_0,
            	    							"mde.pauline.metaheres.Metaheres.Language");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_22, grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_15());
            		
            otherlv_23=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getServiceConfigAccess().getConfigurationReservationsKeyword_16());
            		
            otherlv_24=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_24, grammarAccess.getServiceConfigAccess().getColonKeyword_17());
            		
            // InternalMetaheres.g:406:3: ( (lv_reservationsconfig_25_0= ruleReservationsConfig ) )
            // InternalMetaheres.g:407:4: (lv_reservationsconfig_25_0= ruleReservationsConfig )
            {
            // InternalMetaheres.g:407:4: (lv_reservationsconfig_25_0= ruleReservationsConfig )
            // InternalMetaheres.g:408:5: lv_reservationsconfig_25_0= ruleReservationsConfig
            {

            					newCompositeNode(grammarAccess.getServiceConfigAccess().getReservationsconfigReservationsConfigParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_16);
            lv_reservationsconfig_25_0=ruleReservationsConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            					}
            					set(
            						current,
            						"reservationsconfig",
            						lv_reservationsconfig_25_0,
            						"mde.pauline.metaheres.Metaheres.ReservationsConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_26, grammarAccess.getServiceConfigAccess().getConfigurationRessourcesKeyword_19());
            		
            otherlv_27=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_27, grammarAccess.getServiceConfigAccess().getColonKeyword_20());
            		
            // InternalMetaheres.g:433:3: ( (lv_resourcesconfig_28_0= ruleResourcesConfig ) )
            // InternalMetaheres.g:434:4: (lv_resourcesconfig_28_0= ruleResourcesConfig )
            {
            // InternalMetaheres.g:434:4: (lv_resourcesconfig_28_0= ruleResourcesConfig )
            // InternalMetaheres.g:435:5: lv_resourcesconfig_28_0= ruleResourcesConfig
            {

            					newCompositeNode(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_17);
            lv_resourcesconfig_28_0=ruleResourcesConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            					}
            					add(
            						current,
            						"resourcesconfig",
            						lv_resourcesconfig_28_0,
            						"mde.pauline.metaheres.Metaheres.ResourcesConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaheres.g:452:3: (otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaheres.g:453:4: otherlv_29= ',' ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) )
            	    {
            	    otherlv_29=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_29, grammarAccess.getServiceConfigAccess().getCommaKeyword_22_0());
            	    			
            	    // InternalMetaheres.g:457:4: ( (lv_resourcesconfig_30_0= ruleResourcesConfig ) )
            	    // InternalMetaheres.g:458:5: (lv_resourcesconfig_30_0= ruleResourcesConfig )
            	    {
            	    // InternalMetaheres.g:458:5: (lv_resourcesconfig_30_0= ruleResourcesConfig )
            	    // InternalMetaheres.g:459:6: lv_resourcesconfig_30_0= ruleResourcesConfig
            	    {

            	    						newCompositeNode(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_22_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_resourcesconfig_30_0=ruleResourcesConfig();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"resourcesconfig",
            	    							lv_resourcesconfig_30_0,
            	    							"mde.pauline.metaheres.Metaheres.ResourcesConfig");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMetaheres.g:477:3: (otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaheres.g:478:4: otherlv_31= 'lotsconfig' otherlv_32= ':' ( (lv_lotsconfig_33_0= ruleLotsConfig ) )
                    {
                    otherlv_31=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getServiceConfigAccess().getLotsconfigKeyword_23_0());
                    			
                    otherlv_32=(Token)match(input,11,FOLLOW_11); 

                    				newLeafNode(otherlv_32, grammarAccess.getServiceConfigAccess().getColonKeyword_23_1());
                    			
                    // InternalMetaheres.g:486:4: ( (lv_lotsconfig_33_0= ruleLotsConfig ) )
                    // InternalMetaheres.g:487:5: (lv_lotsconfig_33_0= ruleLotsConfig )
                    {
                    // InternalMetaheres.g:487:5: (lv_lotsconfig_33_0= ruleLotsConfig )
                    // InternalMetaheres.g:488:6: lv_lotsconfig_33_0= ruleLotsConfig
                    {

                    						newCompositeNode(grammarAccess.getServiceConfigAccess().getLotsconfigLotsConfigParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lotsconfig_33_0=ruleLotsConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceConfigRule());
                    						}
                    						set(
                    							current,
                    							"lotsconfig",
                    							lv_lotsconfig_33_0,
                    							"mde.pauline.metaheres.Metaheres.LotsConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleServiceConfig"


    // $ANTLR start "entryRuleLanguage"
    // InternalMetaheres.g:510:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalMetaheres.g:510:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalMetaheres.g:511:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMetaheres.g:517:1: ruleLanguage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:523:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMetaheres.g:524:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMetaheres.g:524:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMetaheres.g:525:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMetaheres.g:525:3: ()
            // InternalMetaheres.g:526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLanguageAccess().getLanguageAction_0(),
            					current);
            			

            }

            // InternalMetaheres.g:532:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMetaheres.g:533:4: (lv_name_1_0= ruleEString )
            {
            // InternalMetaheres.g:533:4: (lv_name_1_0= ruleEString )
            // InternalMetaheres.g:534:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLanguageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"mde.pauline.metaheres.Metaheres.EString");
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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleReservationsConfig"
    // InternalMetaheres.g:555:1: entryRuleReservationsConfig returns [EObject current=null] : iv_ruleReservationsConfig= ruleReservationsConfig EOF ;
    public final EObject entryRuleReservationsConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReservationsConfig = null;


        try {
            // InternalMetaheres.g:555:59: (iv_ruleReservationsConfig= ruleReservationsConfig EOF )
            // InternalMetaheres.g:556:2: iv_ruleReservationsConfig= ruleReservationsConfig EOF
            {
             newCompositeNode(grammarAccess.getReservationsConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReservationsConfig=ruleReservationsConfig();

            state._fsp--;

             current =iv_ruleReservationsConfig; 
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
    // $ANTLR end "entryRuleReservationsConfig"


    // $ANTLR start "ruleReservationsConfig"
    // InternalMetaheres.g:562:1: ruleReservationsConfig returns [EObject current=null] : ( ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) ) ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )? otherlv_2= 'avance-minimum-et-maximum-reservation' otherlv_3= ':' ( (lv_minRequestAdvance_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_maxRequestAdvance_6_0= ruleEInt ) ) otherlv_7= 'statuts-des-demandes' otherlv_8= ':' ( (lv_statuslist_9_0= ruleStatusList ) ) ) ;
    public final EObject ruleReservationsConfig() throws RecognitionException {
        EObject current = null;

        Token lv_hasMoveOutCheck_0_0=null;
        Token lv_hasMoveInCheck_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_minRequestAdvance_4_0 = null;

        AntlrDatatypeRuleToken lv_maxRequestAdvance_6_0 = null;

        EObject lv_statuslist_9_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:568:2: ( ( ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) ) ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )? otherlv_2= 'avance-minimum-et-maximum-reservation' otherlv_3= ':' ( (lv_minRequestAdvance_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_maxRequestAdvance_6_0= ruleEInt ) ) otherlv_7= 'statuts-des-demandes' otherlv_8= ':' ( (lv_statuslist_9_0= ruleStatusList ) ) ) )
            // InternalMetaheres.g:569:2: ( ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) ) ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )? otherlv_2= 'avance-minimum-et-maximum-reservation' otherlv_3= ':' ( (lv_minRequestAdvance_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_maxRequestAdvance_6_0= ruleEInt ) ) otherlv_7= 'statuts-des-demandes' otherlv_8= ':' ( (lv_statuslist_9_0= ruleStatusList ) ) )
            {
            // InternalMetaheres.g:569:2: ( ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) ) ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )? otherlv_2= 'avance-minimum-et-maximum-reservation' otherlv_3= ':' ( (lv_minRequestAdvance_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_maxRequestAdvance_6_0= ruleEInt ) ) otherlv_7= 'statuts-des-demandes' otherlv_8= ':' ( (lv_statuslist_9_0= ruleStatusList ) ) )
            // InternalMetaheres.g:570:3: ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) ) ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )? otherlv_2= 'avance-minimum-et-maximum-reservation' otherlv_3= ':' ( (lv_minRequestAdvance_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_maxRequestAdvance_6_0= ruleEInt ) ) otherlv_7= 'statuts-des-demandes' otherlv_8= ':' ( (lv_statuslist_9_0= ruleStatusList ) )
            {
            // InternalMetaheres.g:570:3: ( (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' ) )
            // InternalMetaheres.g:571:4: (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' )
            {
            // InternalMetaheres.g:571:4: (lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie' )
            // InternalMetaheres.g:572:5: lv_hasMoveOutCheck_0_0= 'etat-des-lieux-sortie'
            {
            lv_hasMoveOutCheck_0_0=(Token)match(input,25,FOLLOW_18); 

            					newLeafNode(lv_hasMoveOutCheck_0_0, grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckEtatDesLieuxSortieKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReservationsConfigRule());
            					}
            					setWithLastConsumed(current, "hasMoveOutCheck", lv_hasMoveOutCheck_0_0 != null, "etat-des-lieux-sortie");
            				

            }


            }

            // InternalMetaheres.g:584:3: ( (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaheres.g:585:4: (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' )
                    {
                    // InternalMetaheres.g:585:4: (lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour' )
                    // InternalMetaheres.g:586:5: lv_hasMoveInCheck_1_0= 'etat-des-lieux-retour'
                    {
                    lv_hasMoveInCheck_1_0=(Token)match(input,26,FOLLOW_19); 

                    					newLeafNode(lv_hasMoveInCheck_1_0, grammarAccess.getReservationsConfigAccess().getHasMoveInCheckEtatDesLieuxRetourKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReservationsConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasMoveInCheck", lv_hasMoveInCheck_1_0 != null, "etat-des-lieux-retour");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReservationsConfigAccess().getAvanceMinimumEtMaximumReservationKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getReservationsConfigAccess().getColonKeyword_3());
            		
            // InternalMetaheres.g:606:3: ( (lv_minRequestAdvance_4_0= ruleEInt ) )
            // InternalMetaheres.g:607:4: (lv_minRequestAdvance_4_0= ruleEInt )
            {
            // InternalMetaheres.g:607:4: (lv_minRequestAdvance_4_0= ruleEInt )
            // InternalMetaheres.g:608:5: lv_minRequestAdvance_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_minRequestAdvance_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReservationsConfigRule());
            					}
            					set(
            						current,
            						"minRequestAdvance",
            						lv_minRequestAdvance_4_0,
            						"mde.pauline.metaheres.Metaheres.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getReservationsConfigAccess().getCommaKeyword_5());
            		
            // InternalMetaheres.g:629:3: ( (lv_maxRequestAdvance_6_0= ruleEInt ) )
            // InternalMetaheres.g:630:4: (lv_maxRequestAdvance_6_0= ruleEInt )
            {
            // InternalMetaheres.g:630:4: (lv_maxRequestAdvance_6_0= ruleEInt )
            // InternalMetaheres.g:631:5: lv_maxRequestAdvance_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_maxRequestAdvance_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReservationsConfigRule());
            					}
            					set(
            						current,
            						"maxRequestAdvance",
            						lv_maxRequestAdvance_6_0,
            						"mde.pauline.metaheres.Metaheres.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getReservationsConfigAccess().getStatutsDesDemandesKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getReservationsConfigAccess().getColonKeyword_8());
            		
            // InternalMetaheres.g:656:3: ( (lv_statuslist_9_0= ruleStatusList ) )
            // InternalMetaheres.g:657:4: (lv_statuslist_9_0= ruleStatusList )
            {
            // InternalMetaheres.g:657:4: (lv_statuslist_9_0= ruleStatusList )
            // InternalMetaheres.g:658:5: lv_statuslist_9_0= ruleStatusList
            {

            					newCompositeNode(grammarAccess.getReservationsConfigAccess().getStatuslistStatusListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_statuslist_9_0=ruleStatusList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReservationsConfigRule());
            					}
            					set(
            						current,
            						"statuslist",
            						lv_statuslist_9_0,
            						"mde.pauline.metaheres.Metaheres.StatusList");
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
    // $ANTLR end "ruleReservationsConfig"


    // $ANTLR start "entryRuleCountry"
    // InternalMetaheres.g:679:1: entryRuleCountry returns [EObject current=null] : iv_ruleCountry= ruleCountry EOF ;
    public final EObject entryRuleCountry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountry = null;


        try {
            // InternalMetaheres.g:679:48: (iv_ruleCountry= ruleCountry EOF )
            // InternalMetaheres.g:680:2: iv_ruleCountry= ruleCountry EOF
            {
             newCompositeNode(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountry=ruleCountry();

            state._fsp--;

             current =iv_ruleCountry; 
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
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalMetaheres.g:686:1: ruleCountry returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_language_2_0= ruleLanguage ) ) otherlv_3= ',' otherlv_4= 'tarification' otherlv_5= ':' ( (lv_pricingsystem_6_0= rulePricingSystem ) ) ) ;
    public final EObject ruleCountry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_language_2_0 = null;

        EObject lv_pricingsystem_6_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:692:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_language_2_0= ruleLanguage ) ) otherlv_3= ',' otherlv_4= 'tarification' otherlv_5= ':' ( (lv_pricingsystem_6_0= rulePricingSystem ) ) ) )
            // InternalMetaheres.g:693:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_language_2_0= ruleLanguage ) ) otherlv_3= ',' otherlv_4= 'tarification' otherlv_5= ':' ( (lv_pricingsystem_6_0= rulePricingSystem ) ) )
            {
            // InternalMetaheres.g:693:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_language_2_0= ruleLanguage ) ) otherlv_3= ',' otherlv_4= 'tarification' otherlv_5= ':' ( (lv_pricingsystem_6_0= rulePricingSystem ) ) )
            // InternalMetaheres.g:694:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_language_2_0= ruleLanguage ) ) otherlv_3= ',' otherlv_4= 'tarification' otherlv_5= ':' ( (lv_pricingsystem_6_0= rulePricingSystem ) )
            {
            // InternalMetaheres.g:694:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMetaheres.g:695:4: (lv_name_0_0= ruleEString )
            {
            // InternalMetaheres.g:695:4: (lv_name_0_0= ruleEString )
            // InternalMetaheres.g:696:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mde.pauline.metaheres.Metaheres.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCountryAccess().getColonKeyword_1());
            		
            // InternalMetaheres.g:717:3: ( (lv_language_2_0= ruleLanguage ) )
            // InternalMetaheres.g:718:4: (lv_language_2_0= ruleLanguage )
            {
            // InternalMetaheres.g:718:4: (lv_language_2_0= ruleLanguage )
            // InternalMetaheres.g:719:5: lv_language_2_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getLanguageLanguageParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_language_2_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_2_0,
            						"mde.pauline.metaheres.Metaheres.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCountryAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCountryAccess().getTarificationKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getCountryAccess().getColonKeyword_5());
            		
            // InternalMetaheres.g:748:3: ( (lv_pricingsystem_6_0= rulePricingSystem ) )
            // InternalMetaheres.g:749:4: (lv_pricingsystem_6_0= rulePricingSystem )
            {
            // InternalMetaheres.g:749:4: (lv_pricingsystem_6_0= rulePricingSystem )
            // InternalMetaheres.g:750:5: lv_pricingsystem_6_0= rulePricingSystem
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getPricingsystemPricingSystemParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_pricingsystem_6_0=rulePricingSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					set(
            						current,
            						"pricingsystem",
            						lv_pricingsystem_6_0,
            						"mde.pauline.metaheres.Metaheres.PricingSystem");
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
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleResourcesConfig"
    // InternalMetaheres.g:771:1: entryRuleResourcesConfig returns [EObject current=null] : iv_ruleResourcesConfig= ruleResourcesConfig EOF ;
    public final EObject entryRuleResourcesConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourcesConfig = null;


        try {
            // InternalMetaheres.g:771:56: (iv_ruleResourcesConfig= ruleResourcesConfig EOF )
            // InternalMetaheres.g:772:2: iv_ruleResourcesConfig= ruleResourcesConfig EOF
            {
             newCompositeNode(grammarAccess.getResourcesConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourcesConfig=ruleResourcesConfig();

            state._fsp--;

             current =iv_ruleResourcesConfig; 
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
    // $ANTLR end "entryRuleResourcesConfig"


    // $ANTLR start "ruleResourcesConfig"
    // InternalMetaheres.g:778:1: ruleResourcesConfig returns [EObject current=null] : (otherlv_0= '(' ( (lv_hasImage_1_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )? ( (lv_isConsumable_3_0= 'type-consommable' ) )? ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )? ( (lv_isCharged_5_0= 'payant' ) )? otherlv_6= ')' ) ;
    public final EObject ruleResourcesConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hasImage_1_0=null;
        Token lv_hasOneStockPerSlot_2_0=null;
        Token lv_isConsumable_3_0=null;
        Token lv_isLoan_4_0=null;
        Token lv_isCharged_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMetaheres.g:784:2: ( (otherlv_0= '(' ( (lv_hasImage_1_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )? ( (lv_isConsumable_3_0= 'type-consommable' ) )? ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )? ( (lv_isCharged_5_0= 'payant' ) )? otherlv_6= ')' ) )
            // InternalMetaheres.g:785:2: (otherlv_0= '(' ( (lv_hasImage_1_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )? ( (lv_isConsumable_3_0= 'type-consommable' ) )? ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )? ( (lv_isCharged_5_0= 'payant' ) )? otherlv_6= ')' )
            {
            // InternalMetaheres.g:785:2: (otherlv_0= '(' ( (lv_hasImage_1_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )? ( (lv_isConsumable_3_0= 'type-consommable' ) )? ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )? ( (lv_isCharged_5_0= 'payant' ) )? otherlv_6= ')' )
            // InternalMetaheres.g:786:3: otherlv_0= '(' ( (lv_hasImage_1_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )? ( (lv_isConsumable_3_0= 'type-consommable' ) )? ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )? ( (lv_isCharged_5_0= 'payant' ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesConfigAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMetaheres.g:790:3: ( (lv_hasImage_1_0= 'avec-illustration' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaheres.g:791:4: (lv_hasImage_1_0= 'avec-illustration' )
                    {
                    // InternalMetaheres.g:791:4: (lv_hasImage_1_0= 'avec-illustration' )
                    // InternalMetaheres.g:792:5: lv_hasImage_1_0= 'avec-illustration'
                    {
                    lv_hasImage_1_0=(Token)match(input,30,FOLLOW_25); 

                    					newLeafNode(lv_hasImage_1_0, grammarAccess.getResourcesConfigAccess().getHasImageAvecIllustrationKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourcesConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasImage", lv_hasImage_1_0 != null, "avec-illustration");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:804:3: ( (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaheres.g:805:4: (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' )
                    {
                    // InternalMetaheres.g:805:4: (lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture' )
                    // InternalMetaheres.g:806:5: lv_hasOneStockPerSlot_2_0= 'un-stock-par-ouverture'
                    {
                    lv_hasOneStockPerSlot_2_0=(Token)match(input,31,FOLLOW_26); 

                    					newLeafNode(lv_hasOneStockPerSlot_2_0, grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourcesConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasOneStockPerSlot", lv_hasOneStockPerSlot_2_0 != null, "un-stock-par-ouverture");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:818:3: ( (lv_isConsumable_3_0= 'type-consommable' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMetaheres.g:819:4: (lv_isConsumable_3_0= 'type-consommable' )
                    {
                    // InternalMetaheres.g:819:4: (lv_isConsumable_3_0= 'type-consommable' )
                    // InternalMetaheres.g:820:5: lv_isConsumable_3_0= 'type-consommable'
                    {
                    lv_isConsumable_3_0=(Token)match(input,32,FOLLOW_27); 

                    					newLeafNode(lv_isConsumable_3_0, grammarAccess.getResourcesConfigAccess().getIsConsumableTypeConsommableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourcesConfigRule());
                    					}
                    					setWithLastConsumed(current, "isConsumable", lv_isConsumable_3_0 != null, "type-consommable");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:832:3: ( (lv_isLoan_4_0= 'emprunt-avec-retour' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaheres.g:833:4: (lv_isLoan_4_0= 'emprunt-avec-retour' )
                    {
                    // InternalMetaheres.g:833:4: (lv_isLoan_4_0= 'emprunt-avec-retour' )
                    // InternalMetaheres.g:834:5: lv_isLoan_4_0= 'emprunt-avec-retour'
                    {
                    lv_isLoan_4_0=(Token)match(input,33,FOLLOW_28); 

                    					newLeafNode(lv_isLoan_4_0, grammarAccess.getResourcesConfigAccess().getIsLoanEmpruntAvecRetourKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourcesConfigRule());
                    					}
                    					setWithLastConsumed(current, "isLoan", lv_isLoan_4_0 != null, "emprunt-avec-retour");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:846:3: ( (lv_isCharged_5_0= 'payant' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaheres.g:847:4: (lv_isCharged_5_0= 'payant' )
                    {
                    // InternalMetaheres.g:847:4: (lv_isCharged_5_0= 'payant' )
                    // InternalMetaheres.g:848:5: lv_isCharged_5_0= 'payant'
                    {
                    lv_isCharged_5_0=(Token)match(input,34,FOLLOW_29); 

                    					newLeafNode(lv_isCharged_5_0, grammarAccess.getResourcesConfigAccess().getIsChargedPayantKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourcesConfigRule());
                    					}
                    					setWithLastConsumed(current, "isCharged", lv_isCharged_5_0 != null, "payant");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResourcesConfigAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleResourcesConfig"


    // $ANTLR start "entryRuleLotsConfig"
    // InternalMetaheres.g:868:1: entryRuleLotsConfig returns [EObject current=null] : iv_ruleLotsConfig= ruleLotsConfig EOF ;
    public final EObject entryRuleLotsConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLotsConfig = null;


        try {
            // InternalMetaheres.g:868:51: (iv_ruleLotsConfig= ruleLotsConfig EOF )
            // InternalMetaheres.g:869:2: iv_ruleLotsConfig= ruleLotsConfig EOF
            {
             newCompositeNode(grammarAccess.getLotsConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLotsConfig=ruleLotsConfig();

            state._fsp--;

             current =iv_ruleLotsConfig; 
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
    // $ANTLR end "entryRuleLotsConfig"


    // $ANTLR start "ruleLotsConfig"
    // InternalMetaheres.g:875:1: ruleLotsConfig returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_hasImage_2_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )? otherlv_4= ')' ) ;
    public final EObject ruleLotsConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasImage_2_0=null;
        Token lv_hasOneStockPerSlot_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMetaheres.g:881:2: ( ( () otherlv_1= '(' ( (lv_hasImage_2_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )? otherlv_4= ')' ) )
            // InternalMetaheres.g:882:2: ( () otherlv_1= '(' ( (lv_hasImage_2_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )? otherlv_4= ')' )
            {
            // InternalMetaheres.g:882:2: ( () otherlv_1= '(' ( (lv_hasImage_2_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )? otherlv_4= ')' )
            // InternalMetaheres.g:883:3: () otherlv_1= '(' ( (lv_hasImage_2_0= 'avec-illustration' ) )? ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )? otherlv_4= ')'
            {
            // InternalMetaheres.g:883:3: ()
            // InternalMetaheres.g:884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLotsConfigAccess().getLotsConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getLotsConfigAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMetaheres.g:894:3: ( (lv_hasImage_2_0= 'avec-illustration' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMetaheres.g:895:4: (lv_hasImage_2_0= 'avec-illustration' )
                    {
                    // InternalMetaheres.g:895:4: (lv_hasImage_2_0= 'avec-illustration' )
                    // InternalMetaheres.g:896:5: lv_hasImage_2_0= 'avec-illustration'
                    {
                    lv_hasImage_2_0=(Token)match(input,30,FOLLOW_31); 

                    					newLeafNode(lv_hasImage_2_0, grammarAccess.getLotsConfigAccess().getHasImageAvecIllustrationKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLotsConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasImage", lv_hasImage_2_0 != null, "avec-illustration");
                    				

                    }


                    }
                    break;

            }

            // InternalMetaheres.g:908:3: ( (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMetaheres.g:909:4: (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' )
                    {
                    // InternalMetaheres.g:909:4: (lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture' )
                    // InternalMetaheres.g:910:5: lv_hasOneStockPerSlot_3_0= 'un-stock-par-ouverture'
                    {
                    lv_hasOneStockPerSlot_3_0=(Token)match(input,31,FOLLOW_29); 

                    					newLeafNode(lv_hasOneStockPerSlot_3_0, grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLotsConfigRule());
                    					}
                    					setWithLastConsumed(current, "hasOneStockPerSlot", lv_hasOneStockPerSlot_3_0 != null, "un-stock-par-ouverture");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLotsConfigAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLotsConfig"


    // $ANTLR start "entryRulePricingSystem"
    // InternalMetaheres.g:930:1: entryRulePricingSystem returns [EObject current=null] : iv_rulePricingSystem= rulePricingSystem EOF ;
    public final EObject entryRulePricingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePricingSystem = null;


        try {
            // InternalMetaheres.g:930:54: (iv_rulePricingSystem= rulePricingSystem EOF )
            // InternalMetaheres.g:931:2: iv_rulePricingSystem= rulePricingSystem EOF
            {
             newCompositeNode(grammarAccess.getPricingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePricingSystem=rulePricingSystem();

            state._fsp--;

             current =iv_rulePricingSystem; 
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
    // $ANTLR end "entryRulePricingSystem"


    // $ANTLR start "rulePricingSystem"
    // InternalMetaheres.g:937:1: rulePricingSystem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' otherlv_2= 'devise' otherlv_3= ':' ( (lv_currency_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'systeme-comptable' otherlv_7= ':' ( (lv_taxSystem_8_0= ruleEString ) ) otherlv_9= ')' ) ;
    public final EObject rulePricingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_currency_4_0 = null;

        AntlrDatatypeRuleToken lv_taxSystem_8_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:943:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' otherlv_2= 'devise' otherlv_3= ':' ( (lv_currency_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'systeme-comptable' otherlv_7= ':' ( (lv_taxSystem_8_0= ruleEString ) ) otherlv_9= ')' ) )
            // InternalMetaheres.g:944:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' otherlv_2= 'devise' otherlv_3= ':' ( (lv_currency_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'systeme-comptable' otherlv_7= ':' ( (lv_taxSystem_8_0= ruleEString ) ) otherlv_9= ')' )
            {
            // InternalMetaheres.g:944:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' otherlv_2= 'devise' otherlv_3= ':' ( (lv_currency_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'systeme-comptable' otherlv_7= ':' ( (lv_taxSystem_8_0= ruleEString ) ) otherlv_9= ')' )
            // InternalMetaheres.g:945:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' otherlv_2= 'devise' otherlv_3= ':' ( (lv_currency_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'systeme-comptable' otherlv_7= ':' ( (lv_taxSystem_8_0= ruleEString ) ) otherlv_9= ')'
            {
            // InternalMetaheres.g:945:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMetaheres.g:946:4: (lv_name_0_0= ruleEString )
            {
            // InternalMetaheres.g:946:4: (lv_name_0_0= ruleEString )
            // InternalMetaheres.g:947:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPricingSystemAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPricingSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mde.pauline.metaheres.Metaheres.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPricingSystemAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPricingSystemAccess().getDeviseKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPricingSystemAccess().getColonKeyword_3());
            		
            // InternalMetaheres.g:976:3: ( (lv_currency_4_0= ruleEString ) )
            // InternalMetaheres.g:977:4: (lv_currency_4_0= ruleEString )
            {
            // InternalMetaheres.g:977:4: (lv_currency_4_0= ruleEString )
            // InternalMetaheres.g:978:5: lv_currency_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPricingSystemAccess().getCurrencyEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_currency_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPricingSystemRule());
            					}
            					set(
            						current,
            						"currency",
            						lv_currency_4_0,
            						"mde.pauline.metaheres.Metaheres.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getPricingSystemAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPricingSystemAccess().getSystemeComptableKeyword_6());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getPricingSystemAccess().getColonKeyword_7());
            		
            // InternalMetaheres.g:1007:3: ( (lv_taxSystem_8_0= ruleEString ) )
            // InternalMetaheres.g:1008:4: (lv_taxSystem_8_0= ruleEString )
            {
            // InternalMetaheres.g:1008:4: (lv_taxSystem_8_0= ruleEString )
            // InternalMetaheres.g:1009:5: lv_taxSystem_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPricingSystemAccess().getTaxSystemEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_29);
            lv_taxSystem_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPricingSystemRule());
            					}
            					set(
            						current,
            						"taxSystem",
            						lv_taxSystem_8_0,
            						"mde.pauline.metaheres.Metaheres.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPricingSystemAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "rulePricingSystem"


    // $ANTLR start "entryRuleEInt"
    // InternalMetaheres.g:1034:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMetaheres.g:1034:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMetaheres.g:1035:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMetaheres.g:1041:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMetaheres.g:1047:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMetaheres.g:1048:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMetaheres.g:1048:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMetaheres.g:1049:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMetaheres.g:1049:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMetaheres.g:1050:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleStatusList"
    // InternalMetaheres.g:1067:1: entryRuleStatusList returns [EObject current=null] : iv_ruleStatusList= ruleStatusList EOF ;
    public final EObject entryRuleStatusList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatusList = null;


        try {
            // InternalMetaheres.g:1067:51: (iv_ruleStatusList= ruleStatusList EOF )
            // InternalMetaheres.g:1068:2: iv_ruleStatusList= ruleStatusList EOF
            {
             newCompositeNode(grammarAccess.getStatusListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatusList=ruleStatusList();

            state._fsp--;

             current =iv_ruleStatusList; 
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
    // $ANTLR end "entryRuleStatusList"


    // $ANTLR start "ruleStatusList"
    // InternalMetaheres.g:1074:1: ruleStatusList returns [EObject current=null] : (otherlv_0= '(' ( (lv_status_1_0= ruleStatus ) ) (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleStatusList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_status_1_0 = null;

        EObject lv_status_3_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:1080:2: ( (otherlv_0= '(' ( (lv_status_1_0= ruleStatus ) ) (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )* otherlv_4= ')' ) )
            // InternalMetaheres.g:1081:2: (otherlv_0= '(' ( (lv_status_1_0= ruleStatus ) ) (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )* otherlv_4= ')' )
            {
            // InternalMetaheres.g:1081:2: (otherlv_0= '(' ( (lv_status_1_0= ruleStatus ) ) (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )* otherlv_4= ')' )
            // InternalMetaheres.g:1082:3: otherlv_0= '(' ( (lv_status_1_0= ruleStatus ) ) (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStatusListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMetaheres.g:1086:3: ( (lv_status_1_0= ruleStatus ) )
            // InternalMetaheres.g:1087:4: (lv_status_1_0= ruleStatus )
            {
            // InternalMetaheres.g:1087:4: (lv_status_1_0= ruleStatus )
            // InternalMetaheres.g:1088:5: lv_status_1_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_status_1_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatusListRule());
            					}
            					add(
            						current,
            						"status",
            						lv_status_1_0,
            						"mde.pauline.metaheres.Metaheres.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMetaheres.g:1105:3: (otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMetaheres.g:1106:4: otherlv_2= ',' ( (lv_status_3_0= ruleStatus ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStatusListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMetaheres.g:1110:4: ( (lv_status_3_0= ruleStatus ) )
            	    // InternalMetaheres.g:1111:5: (lv_status_3_0= ruleStatus )
            	    {
            	    // InternalMetaheres.g:1111:5: (lv_status_3_0= ruleStatus )
            	    // InternalMetaheres.g:1112:6: lv_status_3_0= ruleStatus
            	    {

            	    						newCompositeNode(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_status_3_0=ruleStatus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatusListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"status",
            	    							lv_status_3_0,
            	    							"mde.pauline.metaheres.Metaheres.Status");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStatusListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleStatusList"


    // $ANTLR start "entryRuleStatus"
    // InternalMetaheres.g:1138:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalMetaheres.g:1138:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalMetaheres.g:1139:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMetaheres.g:1145:1: ruleStatus returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMetaheres.g:1151:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMetaheres.g:1152:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMetaheres.g:1152:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMetaheres.g:1153:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMetaheres.g:1153:3: ()
            // InternalMetaheres.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatusAccess().getStatusAction_0(),
            					current);
            			

            }

            // InternalMetaheres.g:1160:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMetaheres.g:1161:4: (lv_name_1_0= ruleEString )
            {
            // InternalMetaheres.g:1161:4: (lv_name_1_0= ruleEString )
            // InternalMetaheres.g:1162:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStatusAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatusRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"mde.pauline.metaheres.Metaheres.EString");
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
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000007C0100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000780100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000700100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});

}