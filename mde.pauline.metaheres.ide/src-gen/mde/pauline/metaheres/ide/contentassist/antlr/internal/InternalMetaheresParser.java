package mde.pauline.metaheres.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mde.pauline.metaheres.services.MetaheresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaheresParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'pays'", "')'", "'langues'", "'('", "'configuration-reservations'", "'configuration-ressources'", "','", "'paiements-proposes'", "'lotsconfig'", "'avance-minimum-et-maximum-reservation'", "'statuts-des-demandes'", "'tarification'", "'devise'", "'systeme-comptable'", "'-'", "'ferme-les-jours-feries'", "'inventaire-public'", "'charte-d-utilisation-visible'", "'compte-en-jours-ouvrables'", "'etat-des-lieux-sortie'", "'etat-des-lieux-retour'", "'avec-illustration'", "'un-stock-par-ouverture'", "'type-consommable'", "'emprunt-avec-retour'", "'payant'"
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

    	public void setGrammarAccess(MetaheresGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleServiceName"
    // InternalMetaheres.g:53:1: entryRuleServiceName : ruleServiceName EOF ;
    public final void entryRuleServiceName() throws RecognitionException {
        try {
            // InternalMetaheres.g:54:1: ( ruleServiceName EOF )
            // InternalMetaheres.g:55:1: ruleServiceName EOF
            {
             before(grammarAccess.getServiceNameRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceName();

            state._fsp--;

             after(grammarAccess.getServiceNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalMetaheres.g:62:1: ruleServiceName : ( ( rule__ServiceName__Group__0 ) ) ;
    public final void ruleServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:66:2: ( ( ( rule__ServiceName__Group__0 ) ) )
            // InternalMetaheres.g:67:2: ( ( rule__ServiceName__Group__0 ) )
            {
            // InternalMetaheres.g:67:2: ( ( rule__ServiceName__Group__0 ) )
            // InternalMetaheres.g:68:3: ( rule__ServiceName__Group__0 )
            {
             before(grammarAccess.getServiceNameAccess().getGroup()); 
            // InternalMetaheres.g:69:3: ( rule__ServiceName__Group__0 )
            // InternalMetaheres.g:69:4: rule__ServiceName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceName"


    // $ANTLR start "entryRuleEString"
    // InternalMetaheres.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMetaheres.g:79:1: ( ruleEString EOF )
            // InternalMetaheres.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMetaheres.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMetaheres.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMetaheres.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMetaheres.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMetaheres.g:94:3: ( rule__EString__Alternatives )
            // InternalMetaheres.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleServiceConfig"
    // InternalMetaheres.g:103:1: entryRuleServiceConfig : ruleServiceConfig EOF ;
    public final void entryRuleServiceConfig() throws RecognitionException {
        try {
            // InternalMetaheres.g:104:1: ( ruleServiceConfig EOF )
            // InternalMetaheres.g:105:1: ruleServiceConfig EOF
            {
             before(grammarAccess.getServiceConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceConfig"


    // $ANTLR start "ruleServiceConfig"
    // InternalMetaheres.g:112:1: ruleServiceConfig : ( ( rule__ServiceConfig__Group__0 ) ) ;
    public final void ruleServiceConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:116:2: ( ( ( rule__ServiceConfig__Group__0 ) ) )
            // InternalMetaheres.g:117:2: ( ( rule__ServiceConfig__Group__0 ) )
            {
            // InternalMetaheres.g:117:2: ( ( rule__ServiceConfig__Group__0 ) )
            // InternalMetaheres.g:118:3: ( rule__ServiceConfig__Group__0 )
            {
             before(grammarAccess.getServiceConfigAccess().getGroup()); 
            // InternalMetaheres.g:119:3: ( rule__ServiceConfig__Group__0 )
            // InternalMetaheres.g:119:4: rule__ServiceConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConfig"


    // $ANTLR start "entryRuleLanguage"
    // InternalMetaheres.g:128:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalMetaheres.g:129:1: ( ruleLanguage EOF )
            // InternalMetaheres.g:130:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMetaheres.g:137:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:141:2: ( ( ( rule__Language__Group__0 ) ) )
            // InternalMetaheres.g:142:2: ( ( rule__Language__Group__0 ) )
            {
            // InternalMetaheres.g:142:2: ( ( rule__Language__Group__0 ) )
            // InternalMetaheres.g:143:3: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // InternalMetaheres.g:144:3: ( rule__Language__Group__0 )
            // InternalMetaheres.g:144:4: rule__Language__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleReservationsConfig"
    // InternalMetaheres.g:153:1: entryRuleReservationsConfig : ruleReservationsConfig EOF ;
    public final void entryRuleReservationsConfig() throws RecognitionException {
        try {
            // InternalMetaheres.g:154:1: ( ruleReservationsConfig EOF )
            // InternalMetaheres.g:155:1: ruleReservationsConfig EOF
            {
             before(grammarAccess.getReservationsConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleReservationsConfig();

            state._fsp--;

             after(grammarAccess.getReservationsConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReservationsConfig"


    // $ANTLR start "ruleReservationsConfig"
    // InternalMetaheres.g:162:1: ruleReservationsConfig : ( ( rule__ReservationsConfig__Group__0 ) ) ;
    public final void ruleReservationsConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:166:2: ( ( ( rule__ReservationsConfig__Group__0 ) ) )
            // InternalMetaheres.g:167:2: ( ( rule__ReservationsConfig__Group__0 ) )
            {
            // InternalMetaheres.g:167:2: ( ( rule__ReservationsConfig__Group__0 ) )
            // InternalMetaheres.g:168:3: ( rule__ReservationsConfig__Group__0 )
            {
             before(grammarAccess.getReservationsConfigAccess().getGroup()); 
            // InternalMetaheres.g:169:3: ( rule__ReservationsConfig__Group__0 )
            // InternalMetaheres.g:169:4: rule__ReservationsConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReservationsConfig"


    // $ANTLR start "entryRuleCountry"
    // InternalMetaheres.g:178:1: entryRuleCountry : ruleCountry EOF ;
    public final void entryRuleCountry() throws RecognitionException {
        try {
            // InternalMetaheres.g:179:1: ( ruleCountry EOF )
            // InternalMetaheres.g:180:1: ruleCountry EOF
            {
             before(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalMetaheres.g:187:1: ruleCountry : ( ( rule__Country__Group__0 ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:191:2: ( ( ( rule__Country__Group__0 ) ) )
            // InternalMetaheres.g:192:2: ( ( rule__Country__Group__0 ) )
            {
            // InternalMetaheres.g:192:2: ( ( rule__Country__Group__0 ) )
            // InternalMetaheres.g:193:3: ( rule__Country__Group__0 )
            {
             before(grammarAccess.getCountryAccess().getGroup()); 
            // InternalMetaheres.g:194:3: ( rule__Country__Group__0 )
            // InternalMetaheres.g:194:4: rule__Country__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleResourcesConfig"
    // InternalMetaheres.g:203:1: entryRuleResourcesConfig : ruleResourcesConfig EOF ;
    public final void entryRuleResourcesConfig() throws RecognitionException {
        try {
            // InternalMetaheres.g:204:1: ( ruleResourcesConfig EOF )
            // InternalMetaheres.g:205:1: ruleResourcesConfig EOF
            {
             before(grammarAccess.getResourcesConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleResourcesConfig();

            state._fsp--;

             after(grammarAccess.getResourcesConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourcesConfig"


    // $ANTLR start "ruleResourcesConfig"
    // InternalMetaheres.g:212:1: ruleResourcesConfig : ( ( rule__ResourcesConfig__Group__0 ) ) ;
    public final void ruleResourcesConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:216:2: ( ( ( rule__ResourcesConfig__Group__0 ) ) )
            // InternalMetaheres.g:217:2: ( ( rule__ResourcesConfig__Group__0 ) )
            {
            // InternalMetaheres.g:217:2: ( ( rule__ResourcesConfig__Group__0 ) )
            // InternalMetaheres.g:218:3: ( rule__ResourcesConfig__Group__0 )
            {
             before(grammarAccess.getResourcesConfigAccess().getGroup()); 
            // InternalMetaheres.g:219:3: ( rule__ResourcesConfig__Group__0 )
            // InternalMetaheres.g:219:4: rule__ResourcesConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourcesConfig"


    // $ANTLR start "entryRuleLotsConfig"
    // InternalMetaheres.g:228:1: entryRuleLotsConfig : ruleLotsConfig EOF ;
    public final void entryRuleLotsConfig() throws RecognitionException {
        try {
            // InternalMetaheres.g:229:1: ( ruleLotsConfig EOF )
            // InternalMetaheres.g:230:1: ruleLotsConfig EOF
            {
             before(grammarAccess.getLotsConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleLotsConfig();

            state._fsp--;

             after(grammarAccess.getLotsConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLotsConfig"


    // $ANTLR start "ruleLotsConfig"
    // InternalMetaheres.g:237:1: ruleLotsConfig : ( ( rule__LotsConfig__Group__0 ) ) ;
    public final void ruleLotsConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:241:2: ( ( ( rule__LotsConfig__Group__0 ) ) )
            // InternalMetaheres.g:242:2: ( ( rule__LotsConfig__Group__0 ) )
            {
            // InternalMetaheres.g:242:2: ( ( rule__LotsConfig__Group__0 ) )
            // InternalMetaheres.g:243:3: ( rule__LotsConfig__Group__0 )
            {
             before(grammarAccess.getLotsConfigAccess().getGroup()); 
            // InternalMetaheres.g:244:3: ( rule__LotsConfig__Group__0 )
            // InternalMetaheres.g:244:4: rule__LotsConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLotsConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLotsConfig"


    // $ANTLR start "entryRulePricingSystem"
    // InternalMetaheres.g:253:1: entryRulePricingSystem : rulePricingSystem EOF ;
    public final void entryRulePricingSystem() throws RecognitionException {
        try {
            // InternalMetaheres.g:254:1: ( rulePricingSystem EOF )
            // InternalMetaheres.g:255:1: rulePricingSystem EOF
            {
             before(grammarAccess.getPricingSystemRule()); 
            pushFollow(FOLLOW_1);
            rulePricingSystem();

            state._fsp--;

             after(grammarAccess.getPricingSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePricingSystem"


    // $ANTLR start "rulePricingSystem"
    // InternalMetaheres.g:262:1: rulePricingSystem : ( ( rule__PricingSystem__Group__0 ) ) ;
    public final void rulePricingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:266:2: ( ( ( rule__PricingSystem__Group__0 ) ) )
            // InternalMetaheres.g:267:2: ( ( rule__PricingSystem__Group__0 ) )
            {
            // InternalMetaheres.g:267:2: ( ( rule__PricingSystem__Group__0 ) )
            // InternalMetaheres.g:268:3: ( rule__PricingSystem__Group__0 )
            {
             before(grammarAccess.getPricingSystemAccess().getGroup()); 
            // InternalMetaheres.g:269:3: ( rule__PricingSystem__Group__0 )
            // InternalMetaheres.g:269:4: rule__PricingSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePricingSystem"


    // $ANTLR start "entryRuleEInt"
    // InternalMetaheres.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMetaheres.g:279:1: ( ruleEInt EOF )
            // InternalMetaheres.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMetaheres.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMetaheres.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMetaheres.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalMetaheres.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMetaheres.g:294:3: ( rule__EInt__Group__0 )
            // InternalMetaheres.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleStatusList"
    // InternalMetaheres.g:303:1: entryRuleStatusList : ruleStatusList EOF ;
    public final void entryRuleStatusList() throws RecognitionException {
        try {
            // InternalMetaheres.g:304:1: ( ruleStatusList EOF )
            // InternalMetaheres.g:305:1: ruleStatusList EOF
            {
             before(grammarAccess.getStatusListRule()); 
            pushFollow(FOLLOW_1);
            ruleStatusList();

            state._fsp--;

             after(grammarAccess.getStatusListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatusList"


    // $ANTLR start "ruleStatusList"
    // InternalMetaheres.g:312:1: ruleStatusList : ( ( rule__StatusList__Group__0 ) ) ;
    public final void ruleStatusList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:316:2: ( ( ( rule__StatusList__Group__0 ) ) )
            // InternalMetaheres.g:317:2: ( ( rule__StatusList__Group__0 ) )
            {
            // InternalMetaheres.g:317:2: ( ( rule__StatusList__Group__0 ) )
            // InternalMetaheres.g:318:3: ( rule__StatusList__Group__0 )
            {
             before(grammarAccess.getStatusListAccess().getGroup()); 
            // InternalMetaheres.g:319:3: ( rule__StatusList__Group__0 )
            // InternalMetaheres.g:319:4: rule__StatusList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatusList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatusListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatusList"


    // $ANTLR start "entryRuleStatus"
    // InternalMetaheres.g:328:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalMetaheres.g:329:1: ( ruleStatus EOF )
            // InternalMetaheres.g:330:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMetaheres.g:337:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:341:2: ( ( ( rule__Status__Group__0 ) ) )
            // InternalMetaheres.g:342:2: ( ( rule__Status__Group__0 ) )
            {
            // InternalMetaheres.g:342:2: ( ( rule__Status__Group__0 ) )
            // InternalMetaheres.g:343:3: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // InternalMetaheres.g:344:3: ( rule__Status__Group__0 )
            // InternalMetaheres.g:344:4: rule__Status__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMetaheres.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMetaheres.g:357:2: ( RULE_STRING )
                    {
                    // InternalMetaheres.g:357:2: ( RULE_STRING )
                    // InternalMetaheres.g:358:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaheres.g:363:2: ( RULE_ID )
                    {
                    // InternalMetaheres.g:363:2: ( RULE_ID )
                    // InternalMetaheres.g:364:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ServiceName__Group__0"
    // InternalMetaheres.g:373:1: rule__ServiceName__Group__0 : rule__ServiceName__Group__0__Impl rule__ServiceName__Group__1 ;
    public final void rule__ServiceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:377:1: ( rule__ServiceName__Group__0__Impl rule__ServiceName__Group__1 )
            // InternalMetaheres.g:378:2: rule__ServiceName__Group__0__Impl rule__ServiceName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__0"


    // $ANTLR start "rule__ServiceName__Group__0__Impl"
    // InternalMetaheres.g:385:1: rule__ServiceName__Group__0__Impl : ( ( rule__ServiceName__NameAssignment_0 ) ) ;
    public final void rule__ServiceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:389:1: ( ( ( rule__ServiceName__NameAssignment_0 ) ) )
            // InternalMetaheres.g:390:1: ( ( rule__ServiceName__NameAssignment_0 ) )
            {
            // InternalMetaheres.g:390:1: ( ( rule__ServiceName__NameAssignment_0 ) )
            // InternalMetaheres.g:391:2: ( rule__ServiceName__NameAssignment_0 )
            {
             before(grammarAccess.getServiceNameAccess().getNameAssignment_0()); 
            // InternalMetaheres.g:392:2: ( rule__ServiceName__NameAssignment_0 )
            // InternalMetaheres.g:392:3: rule__ServiceName__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceNameAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__0__Impl"


    // $ANTLR start "rule__ServiceName__Group__1"
    // InternalMetaheres.g:400:1: rule__ServiceName__Group__1 : rule__ServiceName__Group__1__Impl rule__ServiceName__Group__2 ;
    public final void rule__ServiceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:404:1: ( rule__ServiceName__Group__1__Impl rule__ServiceName__Group__2 )
            // InternalMetaheres.g:405:2: rule__ServiceName__Group__1__Impl rule__ServiceName__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__1"


    // $ANTLR start "rule__ServiceName__Group__1__Impl"
    // InternalMetaheres.g:412:1: rule__ServiceName__Group__1__Impl : ( ':' ) ;
    public final void rule__ServiceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:416:1: ( ( ':' ) )
            // InternalMetaheres.g:417:1: ( ':' )
            {
            // InternalMetaheres.g:417:1: ( ':' )
            // InternalMetaheres.g:418:2: ':'
            {
             before(grammarAccess.getServiceNameAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceNameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__1__Impl"


    // $ANTLR start "rule__ServiceName__Group__2"
    // InternalMetaheres.g:427:1: rule__ServiceName__Group__2 : rule__ServiceName__Group__2__Impl ;
    public final void rule__ServiceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:431:1: ( rule__ServiceName__Group__2__Impl )
            // InternalMetaheres.g:432:2: rule__ServiceName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__2"


    // $ANTLR start "rule__ServiceName__Group__2__Impl"
    // InternalMetaheres.g:438:1: rule__ServiceName__Group__2__Impl : ( ( rule__ServiceName__ServiceconfigAssignment_2 ) ) ;
    public final void rule__ServiceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:442:1: ( ( ( rule__ServiceName__ServiceconfigAssignment_2 ) ) )
            // InternalMetaheres.g:443:1: ( ( rule__ServiceName__ServiceconfigAssignment_2 ) )
            {
            // InternalMetaheres.g:443:1: ( ( rule__ServiceName__ServiceconfigAssignment_2 ) )
            // InternalMetaheres.g:444:2: ( rule__ServiceName__ServiceconfigAssignment_2 )
            {
             before(grammarAccess.getServiceNameAccess().getServiceconfigAssignment_2()); 
            // InternalMetaheres.g:445:2: ( rule__ServiceName__ServiceconfigAssignment_2 )
            // InternalMetaheres.g:445:3: rule__ServiceName__ServiceconfigAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__ServiceconfigAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceNameAccess().getServiceconfigAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__Group__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__0"
    // InternalMetaheres.g:454:1: rule__ServiceConfig__Group__0 : rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 ;
    public final void rule__ServiceConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:458:1: ( rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 )
            // InternalMetaheres.g:459:2: rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__0"


    // $ANTLR start "rule__ServiceConfig__Group__0__Impl"
    // InternalMetaheres.g:466:1: rule__ServiceConfig__Group__0__Impl : ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? ) ;
    public final void rule__ServiceConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:470:1: ( ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? ) )
            // InternalMetaheres.g:471:1: ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? )
            {
            // InternalMetaheres.g:471:1: ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? )
            // InternalMetaheres.g:472:2: ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysAssignment_0()); 
            // InternalMetaheres.g:473:2: ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMetaheres.g:473:3: rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__1"
    // InternalMetaheres.g:481:1: rule__ServiceConfig__Group__1 : rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 ;
    public final void rule__ServiceConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:485:1: ( rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 )
            // InternalMetaheres.g:486:2: rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__1"


    // $ANTLR start "rule__ServiceConfig__Group__1__Impl"
    // InternalMetaheres.g:493:1: rule__ServiceConfig__Group__1__Impl : ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? ) ;
    public final void rule__ServiceConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:497:1: ( ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? ) )
            // InternalMetaheres.g:498:1: ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? )
            {
            // InternalMetaheres.g:498:1: ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? )
            // InternalMetaheres.g:499:2: ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )?
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicAssignment_1()); 
            // InternalMetaheres.g:500:2: ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMetaheres.g:500:3: rule__ServiceConfig__InventoryIsPublicAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__InventoryIsPublicAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getInventoryIsPublicAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__2"
    // InternalMetaheres.g:508:1: rule__ServiceConfig__Group__2 : rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 ;
    public final void rule__ServiceConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:512:1: ( rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 )
            // InternalMetaheres.g:513:2: rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__2"


    // $ANTLR start "rule__ServiceConfig__Group__2__Impl"
    // InternalMetaheres.g:520:1: rule__ServiceConfig__Group__2__Impl : ( ( rule__ServiceConfig__HasChartAssignment_2 )? ) ;
    public final void rule__ServiceConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:524:1: ( ( ( rule__ServiceConfig__HasChartAssignment_2 )? ) )
            // InternalMetaheres.g:525:1: ( ( rule__ServiceConfig__HasChartAssignment_2 )? )
            {
            // InternalMetaheres.g:525:1: ( ( rule__ServiceConfig__HasChartAssignment_2 )? )
            // InternalMetaheres.g:526:2: ( rule__ServiceConfig__HasChartAssignment_2 )?
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartAssignment_2()); 
            // InternalMetaheres.g:527:2: ( rule__ServiceConfig__HasChartAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaheres.g:527:3: rule__ServiceConfig__HasChartAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__HasChartAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getHasChartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__3"
    // InternalMetaheres.g:535:1: rule__ServiceConfig__Group__3 : rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4 ;
    public final void rule__ServiceConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:539:1: ( rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4 )
            // InternalMetaheres.g:540:2: rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__3"


    // $ANTLR start "rule__ServiceConfig__Group__3__Impl"
    // InternalMetaheres.g:547:1: rule__ServiceConfig__Group__3__Impl : ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? ) ;
    public final void rule__ServiceConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:551:1: ( ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? ) )
            // InternalMetaheres.g:552:1: ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? )
            {
            // InternalMetaheres.g:552:1: ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? )
            // InternalMetaheres.g:553:2: ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )?
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysAssignment_3()); 
            // InternalMetaheres.g:554:2: ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaheres.g:554:3: rule__ServiceConfig__CountInBusinessDaysAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__CountInBusinessDaysAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__3__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__4"
    // InternalMetaheres.g:562:1: rule__ServiceConfig__Group__4 : rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5 ;
    public final void rule__ServiceConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:566:1: ( rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5 )
            // InternalMetaheres.g:567:2: rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__4"


    // $ANTLR start "rule__ServiceConfig__Group__4__Impl"
    // InternalMetaheres.g:574:1: rule__ServiceConfig__Group__4__Impl : ( 'pays' ) ;
    public final void rule__ServiceConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:578:1: ( ( 'pays' ) )
            // InternalMetaheres.g:579:1: ( 'pays' )
            {
            // InternalMetaheres.g:579:1: ( 'pays' )
            // InternalMetaheres.g:580:2: 'pays'
            {
             before(grammarAccess.getServiceConfigAccess().getPaysKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getPaysKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__4__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__5"
    // InternalMetaheres.g:589:1: rule__ServiceConfig__Group__5 : rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6 ;
    public final void rule__ServiceConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:593:1: ( rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6 )
            // InternalMetaheres.g:594:2: rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__5"


    // $ANTLR start "rule__ServiceConfig__Group__5__Impl"
    // InternalMetaheres.g:601:1: rule__ServiceConfig__Group__5__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:605:1: ( ( ':' ) )
            // InternalMetaheres.g:606:1: ( ':' )
            {
            // InternalMetaheres.g:606:1: ( ':' )
            // InternalMetaheres.g:607:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__5__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__6"
    // InternalMetaheres.g:616:1: rule__ServiceConfig__Group__6 : rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7 ;
    public final void rule__ServiceConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:620:1: ( rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7 )
            // InternalMetaheres.g:621:2: rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__6"


    // $ANTLR start "rule__ServiceConfig__Group__6__Impl"
    // InternalMetaheres.g:628:1: rule__ServiceConfig__Group__6__Impl : ( ( rule__ServiceConfig__CountryAssignment_6 ) ) ;
    public final void rule__ServiceConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:632:1: ( ( ( rule__ServiceConfig__CountryAssignment_6 ) ) )
            // InternalMetaheres.g:633:1: ( ( rule__ServiceConfig__CountryAssignment_6 ) )
            {
            // InternalMetaheres.g:633:1: ( ( rule__ServiceConfig__CountryAssignment_6 ) )
            // InternalMetaheres.g:634:2: ( rule__ServiceConfig__CountryAssignment_6 )
            {
             before(grammarAccess.getServiceConfigAccess().getCountryAssignment_6()); 
            // InternalMetaheres.g:635:2: ( rule__ServiceConfig__CountryAssignment_6 )
            // InternalMetaheres.g:635:3: rule__ServiceConfig__CountryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__CountryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getCountryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__6__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__7"
    // InternalMetaheres.g:643:1: rule__ServiceConfig__Group__7 : rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8 ;
    public final void rule__ServiceConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:647:1: ( rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8 )
            // InternalMetaheres.g:648:2: rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__7"


    // $ANTLR start "rule__ServiceConfig__Group__7__Impl"
    // InternalMetaheres.g:655:1: rule__ServiceConfig__Group__7__Impl : ( ( rule__ServiceConfig__Group_7__0 )* ) ;
    public final void rule__ServiceConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:659:1: ( ( ( rule__ServiceConfig__Group_7__0 )* ) )
            // InternalMetaheres.g:660:1: ( ( rule__ServiceConfig__Group_7__0 )* )
            {
            // InternalMetaheres.g:660:1: ( ( rule__ServiceConfig__Group_7__0 )* )
            // InternalMetaheres.g:661:2: ( rule__ServiceConfig__Group_7__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_7()); 
            // InternalMetaheres.g:662:2: ( rule__ServiceConfig__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMetaheres.g:662:3: rule__ServiceConfig__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__7__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__8"
    // InternalMetaheres.g:670:1: rule__ServiceConfig__Group__8 : rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9 ;
    public final void rule__ServiceConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:674:1: ( rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9 )
            // InternalMetaheres.g:675:2: rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConfig__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__8"


    // $ANTLR start "rule__ServiceConfig__Group__8__Impl"
    // InternalMetaheres.g:682:1: rule__ServiceConfig__Group__8__Impl : ( ( rule__ServiceConfig__Group_8__0 )? ) ;
    public final void rule__ServiceConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:686:1: ( ( ( rule__ServiceConfig__Group_8__0 )? ) )
            // InternalMetaheres.g:687:1: ( ( rule__ServiceConfig__Group_8__0 )? )
            {
            // InternalMetaheres.g:687:1: ( ( rule__ServiceConfig__Group_8__0 )? )
            // InternalMetaheres.g:688:2: ( rule__ServiceConfig__Group_8__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_8()); 
            // InternalMetaheres.g:689:2: ( rule__ServiceConfig__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMetaheres.g:689:3: rule__ServiceConfig__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__8__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__9"
    // InternalMetaheres.g:697:1: rule__ServiceConfig__Group__9 : rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10 ;
    public final void rule__ServiceConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:701:1: ( rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10 )
            // InternalMetaheres.g:702:2: rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__ServiceConfig__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__9"


    // $ANTLR start "rule__ServiceConfig__Group__9__Impl"
    // InternalMetaheres.g:709:1: rule__ServiceConfig__Group__9__Impl : ( ')' ) ;
    public final void rule__ServiceConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:713:1: ( ( ')' ) )
            // InternalMetaheres.g:714:1: ( ')' )
            {
            // InternalMetaheres.g:714:1: ( ')' )
            // InternalMetaheres.g:715:2: ')'
            {
             before(grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__9__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__10"
    // InternalMetaheres.g:724:1: rule__ServiceConfig__Group__10 : rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11 ;
    public final void rule__ServiceConfig__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:728:1: ( rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11 )
            // InternalMetaheres.g:729:2: rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__10"


    // $ANTLR start "rule__ServiceConfig__Group__10__Impl"
    // InternalMetaheres.g:736:1: rule__ServiceConfig__Group__10__Impl : ( 'langues' ) ;
    public final void rule__ServiceConfig__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:740:1: ( ( 'langues' ) )
            // InternalMetaheres.g:741:1: ( 'langues' )
            {
            // InternalMetaheres.g:741:1: ( 'langues' )
            // InternalMetaheres.g:742:2: 'langues'
            {
             before(grammarAccess.getServiceConfigAccess().getLanguesKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLanguesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__10__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__11"
    // InternalMetaheres.g:751:1: rule__ServiceConfig__Group__11 : rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12 ;
    public final void rule__ServiceConfig__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:755:1: ( rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12 )
            // InternalMetaheres.g:756:2: rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__ServiceConfig__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__11"


    // $ANTLR start "rule__ServiceConfig__Group__11__Impl"
    // InternalMetaheres.g:763:1: rule__ServiceConfig__Group__11__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:767:1: ( ( ':' ) )
            // InternalMetaheres.g:768:1: ( ':' )
            {
            // InternalMetaheres.g:768:1: ( ':' )
            // InternalMetaheres.g:769:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_11()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__11__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__12"
    // InternalMetaheres.g:778:1: rule__ServiceConfig__Group__12 : rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13 ;
    public final void rule__ServiceConfig__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:782:1: ( rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13 )
            // InternalMetaheres.g:783:2: rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__12"


    // $ANTLR start "rule__ServiceConfig__Group__12__Impl"
    // InternalMetaheres.g:790:1: rule__ServiceConfig__Group__12__Impl : ( '(' ) ;
    public final void rule__ServiceConfig__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:794:1: ( ( '(' ) )
            // InternalMetaheres.g:795:1: ( '(' )
            {
            // InternalMetaheres.g:795:1: ( '(' )
            // InternalMetaheres.g:796:2: '('
            {
             before(grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__12__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__13"
    // InternalMetaheres.g:805:1: rule__ServiceConfig__Group__13 : rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14 ;
    public final void rule__ServiceConfig__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:809:1: ( rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14 )
            // InternalMetaheres.g:810:2: rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__ServiceConfig__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__13"


    // $ANTLR start "rule__ServiceConfig__Group__13__Impl"
    // InternalMetaheres.g:817:1: rule__ServiceConfig__Group__13__Impl : ( ( rule__ServiceConfig__LanguageAssignment_13 ) ) ;
    public final void rule__ServiceConfig__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:821:1: ( ( ( rule__ServiceConfig__LanguageAssignment_13 ) ) )
            // InternalMetaheres.g:822:1: ( ( rule__ServiceConfig__LanguageAssignment_13 ) )
            {
            // InternalMetaheres.g:822:1: ( ( rule__ServiceConfig__LanguageAssignment_13 ) )
            // InternalMetaheres.g:823:2: ( rule__ServiceConfig__LanguageAssignment_13 )
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageAssignment_13()); 
            // InternalMetaheres.g:824:2: ( rule__ServiceConfig__LanguageAssignment_13 )
            // InternalMetaheres.g:824:3: rule__ServiceConfig__LanguageAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LanguageAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLanguageAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__13__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__14"
    // InternalMetaheres.g:832:1: rule__ServiceConfig__Group__14 : rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15 ;
    public final void rule__ServiceConfig__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:836:1: ( rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15 )
            // InternalMetaheres.g:837:2: rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15
            {
            pushFollow(FOLLOW_10);
            rule__ServiceConfig__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__14"


    // $ANTLR start "rule__ServiceConfig__Group__14__Impl"
    // InternalMetaheres.g:844:1: rule__ServiceConfig__Group__14__Impl : ( ( rule__ServiceConfig__Group_14__0 )* ) ;
    public final void rule__ServiceConfig__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:848:1: ( ( ( rule__ServiceConfig__Group_14__0 )* ) )
            // InternalMetaheres.g:849:1: ( ( rule__ServiceConfig__Group_14__0 )* )
            {
            // InternalMetaheres.g:849:1: ( ( rule__ServiceConfig__Group_14__0 )* )
            // InternalMetaheres.g:850:2: ( rule__ServiceConfig__Group_14__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_14()); 
            // InternalMetaheres.g:851:2: ( rule__ServiceConfig__Group_14__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMetaheres.g:851:3: rule__ServiceConfig__Group_14__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__14__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__15"
    // InternalMetaheres.g:859:1: rule__ServiceConfig__Group__15 : rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16 ;
    public final void rule__ServiceConfig__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:863:1: ( rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16 )
            // InternalMetaheres.g:864:2: rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__ServiceConfig__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__15"


    // $ANTLR start "rule__ServiceConfig__Group__15__Impl"
    // InternalMetaheres.g:871:1: rule__ServiceConfig__Group__15__Impl : ( ')' ) ;
    public final void rule__ServiceConfig__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:875:1: ( ( ')' ) )
            // InternalMetaheres.g:876:1: ( ')' )
            {
            // InternalMetaheres.g:876:1: ( ')' )
            // InternalMetaheres.g:877:2: ')'
            {
             before(grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_15()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__15__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__16"
    // InternalMetaheres.g:886:1: rule__ServiceConfig__Group__16 : rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17 ;
    public final void rule__ServiceConfig__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:890:1: ( rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17 )
            // InternalMetaheres.g:891:2: rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__16"


    // $ANTLR start "rule__ServiceConfig__Group__16__Impl"
    // InternalMetaheres.g:898:1: rule__ServiceConfig__Group__16__Impl : ( 'configuration-reservations' ) ;
    public final void rule__ServiceConfig__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:902:1: ( ( 'configuration-reservations' ) )
            // InternalMetaheres.g:903:1: ( 'configuration-reservations' )
            {
            // InternalMetaheres.g:903:1: ( 'configuration-reservations' )
            // InternalMetaheres.g:904:2: 'configuration-reservations'
            {
             before(grammarAccess.getServiceConfigAccess().getConfigurationReservationsKeyword_16()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getConfigurationReservationsKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__16__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__17"
    // InternalMetaheres.g:913:1: rule__ServiceConfig__Group__17 : rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18 ;
    public final void rule__ServiceConfig__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:917:1: ( rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18 )
            // InternalMetaheres.g:918:2: rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__ServiceConfig__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__17"


    // $ANTLR start "rule__ServiceConfig__Group__17__Impl"
    // InternalMetaheres.g:925:1: rule__ServiceConfig__Group__17__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:929:1: ( ( ':' ) )
            // InternalMetaheres.g:930:1: ( ':' )
            {
            // InternalMetaheres.g:930:1: ( ':' )
            // InternalMetaheres.g:931:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_17()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__17__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__18"
    // InternalMetaheres.g:940:1: rule__ServiceConfig__Group__18 : rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19 ;
    public final void rule__ServiceConfig__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:944:1: ( rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19 )
            // InternalMetaheres.g:945:2: rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__ServiceConfig__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__18"


    // $ANTLR start "rule__ServiceConfig__Group__18__Impl"
    // InternalMetaheres.g:952:1: rule__ServiceConfig__Group__18__Impl : ( ( rule__ServiceConfig__ReservationsconfigAssignment_18 ) ) ;
    public final void rule__ServiceConfig__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:956:1: ( ( ( rule__ServiceConfig__ReservationsconfigAssignment_18 ) ) )
            // InternalMetaheres.g:957:1: ( ( rule__ServiceConfig__ReservationsconfigAssignment_18 ) )
            {
            // InternalMetaheres.g:957:1: ( ( rule__ServiceConfig__ReservationsconfigAssignment_18 ) )
            // InternalMetaheres.g:958:2: ( rule__ServiceConfig__ReservationsconfigAssignment_18 )
            {
             before(grammarAccess.getServiceConfigAccess().getReservationsconfigAssignment_18()); 
            // InternalMetaheres.g:959:2: ( rule__ServiceConfig__ReservationsconfigAssignment_18 )
            // InternalMetaheres.g:959:3: rule__ServiceConfig__ReservationsconfigAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ReservationsconfigAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getReservationsconfigAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__18__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__19"
    // InternalMetaheres.g:967:1: rule__ServiceConfig__Group__19 : rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20 ;
    public final void rule__ServiceConfig__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:971:1: ( rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20 )
            // InternalMetaheres.g:972:2: rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__19"


    // $ANTLR start "rule__ServiceConfig__Group__19__Impl"
    // InternalMetaheres.g:979:1: rule__ServiceConfig__Group__19__Impl : ( 'configuration-ressources' ) ;
    public final void rule__ServiceConfig__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:983:1: ( ( 'configuration-ressources' ) )
            // InternalMetaheres.g:984:1: ( 'configuration-ressources' )
            {
            // InternalMetaheres.g:984:1: ( 'configuration-ressources' )
            // InternalMetaheres.g:985:2: 'configuration-ressources'
            {
             before(grammarAccess.getServiceConfigAccess().getConfigurationRessourcesKeyword_19()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getConfigurationRessourcesKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__19__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__20"
    // InternalMetaheres.g:994:1: rule__ServiceConfig__Group__20 : rule__ServiceConfig__Group__20__Impl rule__ServiceConfig__Group__21 ;
    public final void rule__ServiceConfig__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:998:1: ( rule__ServiceConfig__Group__20__Impl rule__ServiceConfig__Group__21 )
            // InternalMetaheres.g:999:2: rule__ServiceConfig__Group__20__Impl rule__ServiceConfig__Group__21
            {
            pushFollow(FOLLOW_9);
            rule__ServiceConfig__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__20"


    // $ANTLR start "rule__ServiceConfig__Group__20__Impl"
    // InternalMetaheres.g:1006:1: rule__ServiceConfig__Group__20__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1010:1: ( ( ':' ) )
            // InternalMetaheres.g:1011:1: ( ':' )
            {
            // InternalMetaheres.g:1011:1: ( ':' )
            // InternalMetaheres.g:1012:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_20()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__20__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__21"
    // InternalMetaheres.g:1021:1: rule__ServiceConfig__Group__21 : rule__ServiceConfig__Group__21__Impl rule__ServiceConfig__Group__22 ;
    public final void rule__ServiceConfig__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1025:1: ( rule__ServiceConfig__Group__21__Impl rule__ServiceConfig__Group__22 )
            // InternalMetaheres.g:1026:2: rule__ServiceConfig__Group__21__Impl rule__ServiceConfig__Group__22
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__21"


    // $ANTLR start "rule__ServiceConfig__Group__21__Impl"
    // InternalMetaheres.g:1033:1: rule__ServiceConfig__Group__21__Impl : ( ( rule__ServiceConfig__ResourcesconfigAssignment_21 ) ) ;
    public final void rule__ServiceConfig__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1037:1: ( ( ( rule__ServiceConfig__ResourcesconfigAssignment_21 ) ) )
            // InternalMetaheres.g:1038:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_21 ) )
            {
            // InternalMetaheres.g:1038:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_21 ) )
            // InternalMetaheres.g:1039:2: ( rule__ServiceConfig__ResourcesconfigAssignment_21 )
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_21()); 
            // InternalMetaheres.g:1040:2: ( rule__ServiceConfig__ResourcesconfigAssignment_21 )
            // InternalMetaheres.g:1040:3: rule__ServiceConfig__ResourcesconfigAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ResourcesconfigAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__21__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__22"
    // InternalMetaheres.g:1048:1: rule__ServiceConfig__Group__22 : rule__ServiceConfig__Group__22__Impl rule__ServiceConfig__Group__23 ;
    public final void rule__ServiceConfig__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1052:1: ( rule__ServiceConfig__Group__22__Impl rule__ServiceConfig__Group__23 )
            // InternalMetaheres.g:1053:2: rule__ServiceConfig__Group__22__Impl rule__ServiceConfig__Group__23
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__22"


    // $ANTLR start "rule__ServiceConfig__Group__22__Impl"
    // InternalMetaheres.g:1060:1: rule__ServiceConfig__Group__22__Impl : ( ( rule__ServiceConfig__Group_22__0 )* ) ;
    public final void rule__ServiceConfig__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1064:1: ( ( ( rule__ServiceConfig__Group_22__0 )* ) )
            // InternalMetaheres.g:1065:1: ( ( rule__ServiceConfig__Group_22__0 )* )
            {
            // InternalMetaheres.g:1065:1: ( ( rule__ServiceConfig__Group_22__0 )* )
            // InternalMetaheres.g:1066:2: ( rule__ServiceConfig__Group_22__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_22()); 
            // InternalMetaheres.g:1067:2: ( rule__ServiceConfig__Group_22__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMetaheres.g:1067:3: rule__ServiceConfig__Group_22__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_22__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__22__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__23"
    // InternalMetaheres.g:1075:1: rule__ServiceConfig__Group__23 : rule__ServiceConfig__Group__23__Impl ;
    public final void rule__ServiceConfig__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1079:1: ( rule__ServiceConfig__Group__23__Impl )
            // InternalMetaheres.g:1080:2: rule__ServiceConfig__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__23"


    // $ANTLR start "rule__ServiceConfig__Group__23__Impl"
    // InternalMetaheres.g:1086:1: rule__ServiceConfig__Group__23__Impl : ( ( rule__ServiceConfig__Group_23__0 )? ) ;
    public final void rule__ServiceConfig__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1090:1: ( ( ( rule__ServiceConfig__Group_23__0 )? ) )
            // InternalMetaheres.g:1091:1: ( ( rule__ServiceConfig__Group_23__0 )? )
            {
            // InternalMetaheres.g:1091:1: ( ( rule__ServiceConfig__Group_23__0 )? )
            // InternalMetaheres.g:1092:2: ( rule__ServiceConfig__Group_23__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_23()); 
            // InternalMetaheres.g:1093:2: ( rule__ServiceConfig__Group_23__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMetaheres.g:1093:3: rule__ServiceConfig__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__23__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_7__0"
    // InternalMetaheres.g:1102:1: rule__ServiceConfig__Group_7__0 : rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1 ;
    public final void rule__ServiceConfig__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1106:1: ( rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1 )
            // InternalMetaheres.g:1107:2: rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_7__0"


    // $ANTLR start "rule__ServiceConfig__Group_7__0__Impl"
    // InternalMetaheres.g:1114:1: rule__ServiceConfig__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1118:1: ( ( ',' ) )
            // InternalMetaheres.g:1119:1: ( ',' )
            {
            // InternalMetaheres.g:1119:1: ( ',' )
            // InternalMetaheres.g:1120:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_7__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_7__1"
    // InternalMetaheres.g:1129:1: rule__ServiceConfig__Group_7__1 : rule__ServiceConfig__Group_7__1__Impl ;
    public final void rule__ServiceConfig__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1133:1: ( rule__ServiceConfig__Group_7__1__Impl )
            // InternalMetaheres.g:1134:2: rule__ServiceConfig__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_7__1"


    // $ANTLR start "rule__ServiceConfig__Group_7__1__Impl"
    // InternalMetaheres.g:1140:1: rule__ServiceConfig__Group_7__1__Impl : ( ( rule__ServiceConfig__CountryAssignment_7_1 ) ) ;
    public final void rule__ServiceConfig__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1144:1: ( ( ( rule__ServiceConfig__CountryAssignment_7_1 ) ) )
            // InternalMetaheres.g:1145:1: ( ( rule__ServiceConfig__CountryAssignment_7_1 ) )
            {
            // InternalMetaheres.g:1145:1: ( ( rule__ServiceConfig__CountryAssignment_7_1 ) )
            // InternalMetaheres.g:1146:2: ( rule__ServiceConfig__CountryAssignment_7_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getCountryAssignment_7_1()); 
            // InternalMetaheres.g:1147:2: ( rule__ServiceConfig__CountryAssignment_7_1 )
            // InternalMetaheres.g:1147:3: rule__ServiceConfig__CountryAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__CountryAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getCountryAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_7__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8__0"
    // InternalMetaheres.g:1156:1: rule__ServiceConfig__Group_8__0 : rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1 ;
    public final void rule__ServiceConfig__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1160:1: ( rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1 )
            // InternalMetaheres.g:1161:2: rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__0"


    // $ANTLR start "rule__ServiceConfig__Group_8__0__Impl"
    // InternalMetaheres.g:1168:1: rule__ServiceConfig__Group_8__0__Impl : ( 'paiements-proposes' ) ;
    public final void rule__ServiceConfig__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1172:1: ( ( 'paiements-proposes' ) )
            // InternalMetaheres.g:1173:1: ( 'paiements-proposes' )
            {
            // InternalMetaheres.g:1173:1: ( 'paiements-proposes' )
            // InternalMetaheres.g:1174:2: 'paiements-proposes'
            {
             before(grammarAccess.getServiceConfigAccess().getPaiementsProposesKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getPaiementsProposesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8__1"
    // InternalMetaheres.g:1183:1: rule__ServiceConfig__Group_8__1 : rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2 ;
    public final void rule__ServiceConfig__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1187:1: ( rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2 )
            // InternalMetaheres.g:1188:2: rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__ServiceConfig__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__1"


    // $ANTLR start "rule__ServiceConfig__Group_8__1__Impl"
    // InternalMetaheres.g:1195:1: rule__ServiceConfig__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1199:1: ( ( ':' ) )
            // InternalMetaheres.g:1200:1: ( ':' )
            {
            // InternalMetaheres.g:1200:1: ( ':' )
            // InternalMetaheres.g:1201:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_8_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8__2"
    // InternalMetaheres.g:1210:1: rule__ServiceConfig__Group_8__2 : rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3 ;
    public final void rule__ServiceConfig__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1214:1: ( rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3 )
            // InternalMetaheres.g:1215:2: rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__2"


    // $ANTLR start "rule__ServiceConfig__Group_8__2__Impl"
    // InternalMetaheres.g:1222:1: rule__ServiceConfig__Group_8__2__Impl : ( '(' ) ;
    public final void rule__ServiceConfig__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1226:1: ( ( '(' ) )
            // InternalMetaheres.g:1227:1: ( '(' )
            {
            // InternalMetaheres.g:1227:1: ( '(' )
            // InternalMetaheres.g:1228:2: '('
            {
             before(grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_8_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLeftParenthesisKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8__3"
    // InternalMetaheres.g:1237:1: rule__ServiceConfig__Group_8__3 : rule__ServiceConfig__Group_8__3__Impl rule__ServiceConfig__Group_8__4 ;
    public final void rule__ServiceConfig__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1241:1: ( rule__ServiceConfig__Group_8__3__Impl rule__ServiceConfig__Group_8__4 )
            // InternalMetaheres.g:1242:2: rule__ServiceConfig__Group_8__3__Impl rule__ServiceConfig__Group_8__4
            {
            pushFollow(FOLLOW_15);
            rule__ServiceConfig__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__3"


    // $ANTLR start "rule__ServiceConfig__Group_8__3__Impl"
    // InternalMetaheres.g:1249:1: rule__ServiceConfig__Group_8__3__Impl : ( ( rule__ServiceConfig__PricingsystemAssignment_8_3 ) ) ;
    public final void rule__ServiceConfig__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1253:1: ( ( ( rule__ServiceConfig__PricingsystemAssignment_8_3 ) ) )
            // InternalMetaheres.g:1254:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_3 ) )
            {
            // InternalMetaheres.g:1254:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_3 ) )
            // InternalMetaheres.g:1255:2: ( rule__ServiceConfig__PricingsystemAssignment_8_3 )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_3()); 
            // InternalMetaheres.g:1256:2: ( rule__ServiceConfig__PricingsystemAssignment_8_3 )
            // InternalMetaheres.g:1256:3: rule__ServiceConfig__PricingsystemAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__PricingsystemAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__3__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8__4"
    // InternalMetaheres.g:1264:1: rule__ServiceConfig__Group_8__4 : rule__ServiceConfig__Group_8__4__Impl ;
    public final void rule__ServiceConfig__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1268:1: ( rule__ServiceConfig__Group_8__4__Impl )
            // InternalMetaheres.g:1269:2: rule__ServiceConfig__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__4"


    // $ANTLR start "rule__ServiceConfig__Group_8__4__Impl"
    // InternalMetaheres.g:1275:1: rule__ServiceConfig__Group_8__4__Impl : ( ( rule__ServiceConfig__Group_8_4__0 )* ) ;
    public final void rule__ServiceConfig__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1279:1: ( ( ( rule__ServiceConfig__Group_8_4__0 )* ) )
            // InternalMetaheres.g:1280:1: ( ( rule__ServiceConfig__Group_8_4__0 )* )
            {
            // InternalMetaheres.g:1280:1: ( ( rule__ServiceConfig__Group_8_4__0 )* )
            // InternalMetaheres.g:1281:2: ( rule__ServiceConfig__Group_8_4__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_8_4()); 
            // InternalMetaheres.g:1282:2: ( rule__ServiceConfig__Group_8_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMetaheres.g:1282:3: rule__ServiceConfig__Group_8_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_8_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8__4__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8_4__0"
    // InternalMetaheres.g:1291:1: rule__ServiceConfig__Group_8_4__0 : rule__ServiceConfig__Group_8_4__0__Impl rule__ServiceConfig__Group_8_4__1 ;
    public final void rule__ServiceConfig__Group_8_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1295:1: ( rule__ServiceConfig__Group_8_4__0__Impl rule__ServiceConfig__Group_8_4__1 )
            // InternalMetaheres.g:1296:2: rule__ServiceConfig__Group_8_4__0__Impl rule__ServiceConfig__Group_8_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_8_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8_4__0"


    // $ANTLR start "rule__ServiceConfig__Group_8_4__0__Impl"
    // InternalMetaheres.g:1303:1: rule__ServiceConfig__Group_8_4__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_8_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1307:1: ( ( ',' ) )
            // InternalMetaheres.g:1308:1: ( ',' )
            {
            // InternalMetaheres.g:1308:1: ( ',' )
            // InternalMetaheres.g:1309:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_8_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8_4__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8_4__1"
    // InternalMetaheres.g:1318:1: rule__ServiceConfig__Group_8_4__1 : rule__ServiceConfig__Group_8_4__1__Impl ;
    public final void rule__ServiceConfig__Group_8_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1322:1: ( rule__ServiceConfig__Group_8_4__1__Impl )
            // InternalMetaheres.g:1323:2: rule__ServiceConfig__Group_8_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8_4__1"


    // $ANTLR start "rule__ServiceConfig__Group_8_4__1__Impl"
    // InternalMetaheres.g:1329:1: rule__ServiceConfig__Group_8_4__1__Impl : ( ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 ) ) ;
    public final void rule__ServiceConfig__Group_8_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1333:1: ( ( ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 ) ) )
            // InternalMetaheres.g:1334:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 ) )
            {
            // InternalMetaheres.g:1334:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 ) )
            // InternalMetaheres.g:1335:2: ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_4_1()); 
            // InternalMetaheres.g:1336:2: ( rule__ServiceConfig__PricingsystemAssignment_8_4_1 )
            // InternalMetaheres.g:1336:3: rule__ServiceConfig__PricingsystemAssignment_8_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__PricingsystemAssignment_8_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_8_4__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_14__0"
    // InternalMetaheres.g:1345:1: rule__ServiceConfig__Group_14__0 : rule__ServiceConfig__Group_14__0__Impl rule__ServiceConfig__Group_14__1 ;
    public final void rule__ServiceConfig__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1349:1: ( rule__ServiceConfig__Group_14__0__Impl rule__ServiceConfig__Group_14__1 )
            // InternalMetaheres.g:1350:2: rule__ServiceConfig__Group_14__0__Impl rule__ServiceConfig__Group_14__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_14__0"


    // $ANTLR start "rule__ServiceConfig__Group_14__0__Impl"
    // InternalMetaheres.g:1357:1: rule__ServiceConfig__Group_14__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1361:1: ( ( ',' ) )
            // InternalMetaheres.g:1362:1: ( ',' )
            {
            // InternalMetaheres.g:1362:1: ( ',' )
            // InternalMetaheres.g:1363:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_14_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_14__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_14__1"
    // InternalMetaheres.g:1372:1: rule__ServiceConfig__Group_14__1 : rule__ServiceConfig__Group_14__1__Impl ;
    public final void rule__ServiceConfig__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1376:1: ( rule__ServiceConfig__Group_14__1__Impl )
            // InternalMetaheres.g:1377:2: rule__ServiceConfig__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_14__1"


    // $ANTLR start "rule__ServiceConfig__Group_14__1__Impl"
    // InternalMetaheres.g:1383:1: rule__ServiceConfig__Group_14__1__Impl : ( ( rule__ServiceConfig__LanguageAssignment_14_1 ) ) ;
    public final void rule__ServiceConfig__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1387:1: ( ( ( rule__ServiceConfig__LanguageAssignment_14_1 ) ) )
            // InternalMetaheres.g:1388:1: ( ( rule__ServiceConfig__LanguageAssignment_14_1 ) )
            {
            // InternalMetaheres.g:1388:1: ( ( rule__ServiceConfig__LanguageAssignment_14_1 ) )
            // InternalMetaheres.g:1389:2: ( rule__ServiceConfig__LanguageAssignment_14_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageAssignment_14_1()); 
            // InternalMetaheres.g:1390:2: ( rule__ServiceConfig__LanguageAssignment_14_1 )
            // InternalMetaheres.g:1390:3: rule__ServiceConfig__LanguageAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LanguageAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLanguageAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_14__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_22__0"
    // InternalMetaheres.g:1399:1: rule__ServiceConfig__Group_22__0 : rule__ServiceConfig__Group_22__0__Impl rule__ServiceConfig__Group_22__1 ;
    public final void rule__ServiceConfig__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1403:1: ( rule__ServiceConfig__Group_22__0__Impl rule__ServiceConfig__Group_22__1 )
            // InternalMetaheres.g:1404:2: rule__ServiceConfig__Group_22__0__Impl rule__ServiceConfig__Group_22__1
            {
            pushFollow(FOLLOW_9);
            rule__ServiceConfig__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_22__0"


    // $ANTLR start "rule__ServiceConfig__Group_22__0__Impl"
    // InternalMetaheres.g:1411:1: rule__ServiceConfig__Group_22__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1415:1: ( ( ',' ) )
            // InternalMetaheres.g:1416:1: ( ',' )
            {
            // InternalMetaheres.g:1416:1: ( ',' )
            // InternalMetaheres.g:1417:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_22_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_22__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_22__1"
    // InternalMetaheres.g:1426:1: rule__ServiceConfig__Group_22__1 : rule__ServiceConfig__Group_22__1__Impl ;
    public final void rule__ServiceConfig__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1430:1: ( rule__ServiceConfig__Group_22__1__Impl )
            // InternalMetaheres.g:1431:2: rule__ServiceConfig__Group_22__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_22__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_22__1"


    // $ANTLR start "rule__ServiceConfig__Group_22__1__Impl"
    // InternalMetaheres.g:1437:1: rule__ServiceConfig__Group_22__1__Impl : ( ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 ) ) ;
    public final void rule__ServiceConfig__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1441:1: ( ( ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 ) ) )
            // InternalMetaheres.g:1442:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 ) )
            {
            // InternalMetaheres.g:1442:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 ) )
            // InternalMetaheres.g:1443:2: ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_22_1()); 
            // InternalMetaheres.g:1444:2: ( rule__ServiceConfig__ResourcesconfigAssignment_22_1 )
            // InternalMetaheres.g:1444:3: rule__ServiceConfig__ResourcesconfigAssignment_22_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ResourcesconfigAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_22__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_23__0"
    // InternalMetaheres.g:1453:1: rule__ServiceConfig__Group_23__0 : rule__ServiceConfig__Group_23__0__Impl rule__ServiceConfig__Group_23__1 ;
    public final void rule__ServiceConfig__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1457:1: ( rule__ServiceConfig__Group_23__0__Impl rule__ServiceConfig__Group_23__1 )
            // InternalMetaheres.g:1458:2: rule__ServiceConfig__Group_23__0__Impl rule__ServiceConfig__Group_23__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__0"


    // $ANTLR start "rule__ServiceConfig__Group_23__0__Impl"
    // InternalMetaheres.g:1465:1: rule__ServiceConfig__Group_23__0__Impl : ( 'lotsconfig' ) ;
    public final void rule__ServiceConfig__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1469:1: ( ( 'lotsconfig' ) )
            // InternalMetaheres.g:1470:1: ( 'lotsconfig' )
            {
            // InternalMetaheres.g:1470:1: ( 'lotsconfig' )
            // InternalMetaheres.g:1471:2: 'lotsconfig'
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigKeyword_23_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLotsconfigKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_23__1"
    // InternalMetaheres.g:1480:1: rule__ServiceConfig__Group_23__1 : rule__ServiceConfig__Group_23__1__Impl rule__ServiceConfig__Group_23__2 ;
    public final void rule__ServiceConfig__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1484:1: ( rule__ServiceConfig__Group_23__1__Impl rule__ServiceConfig__Group_23__2 )
            // InternalMetaheres.g:1485:2: rule__ServiceConfig__Group_23__1__Impl rule__ServiceConfig__Group_23__2
            {
            pushFollow(FOLLOW_9);
            rule__ServiceConfig__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__1"


    // $ANTLR start "rule__ServiceConfig__Group_23__1__Impl"
    // InternalMetaheres.g:1492:1: rule__ServiceConfig__Group_23__1__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1496:1: ( ( ':' ) )
            // InternalMetaheres.g:1497:1: ( ':' )
            {
            // InternalMetaheres.g:1497:1: ( ':' )
            // InternalMetaheres.g:1498:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_23_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_23__2"
    // InternalMetaheres.g:1507:1: rule__ServiceConfig__Group_23__2 : rule__ServiceConfig__Group_23__2__Impl ;
    public final void rule__ServiceConfig__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1511:1: ( rule__ServiceConfig__Group_23__2__Impl )
            // InternalMetaheres.g:1512:2: rule__ServiceConfig__Group_23__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_23__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__2"


    // $ANTLR start "rule__ServiceConfig__Group_23__2__Impl"
    // InternalMetaheres.g:1518:1: rule__ServiceConfig__Group_23__2__Impl : ( ( rule__ServiceConfig__LotsconfigAssignment_23_2 ) ) ;
    public final void rule__ServiceConfig__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1522:1: ( ( ( rule__ServiceConfig__LotsconfigAssignment_23_2 ) ) )
            // InternalMetaheres.g:1523:1: ( ( rule__ServiceConfig__LotsconfigAssignment_23_2 ) )
            {
            // InternalMetaheres.g:1523:1: ( ( rule__ServiceConfig__LotsconfigAssignment_23_2 ) )
            // InternalMetaheres.g:1524:2: ( rule__ServiceConfig__LotsconfigAssignment_23_2 )
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigAssignment_23_2()); 
            // InternalMetaheres.g:1525:2: ( rule__ServiceConfig__LotsconfigAssignment_23_2 )
            // InternalMetaheres.g:1525:3: rule__ServiceConfig__LotsconfigAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LotsconfigAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLotsconfigAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_23__2__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // InternalMetaheres.g:1534:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1538:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // InternalMetaheres.g:1539:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // InternalMetaheres.g:1546:1: rule__Language__Group__0__Impl : ( () ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1550:1: ( ( () ) )
            // InternalMetaheres.g:1551:1: ( () )
            {
            // InternalMetaheres.g:1551:1: ( () )
            // InternalMetaheres.g:1552:2: ()
            {
             before(grammarAccess.getLanguageAccess().getLanguageAction_0()); 
            // InternalMetaheres.g:1553:2: ()
            // InternalMetaheres.g:1553:3: 
            {
            }

             after(grammarAccess.getLanguageAccess().getLanguageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // InternalMetaheres.g:1561:1: rule__Language__Group__1 : rule__Language__Group__1__Impl ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1565:1: ( rule__Language__Group__1__Impl )
            // InternalMetaheres.g:1566:2: rule__Language__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // InternalMetaheres.g:1572:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1576:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // InternalMetaheres.g:1577:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // InternalMetaheres.g:1577:1: ( ( rule__Language__NameAssignment_1 ) )
            // InternalMetaheres.g:1578:2: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // InternalMetaheres.g:1579:2: ( rule__Language__NameAssignment_1 )
            // InternalMetaheres.g:1579:3: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Language__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__0"
    // InternalMetaheres.g:1588:1: rule__ReservationsConfig__Group__0 : rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1 ;
    public final void rule__ReservationsConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1592:1: ( rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1 )
            // InternalMetaheres.g:1593:2: rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ReservationsConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__0"


    // $ANTLR start "rule__ReservationsConfig__Group__0__Impl"
    // InternalMetaheres.g:1600:1: rule__ReservationsConfig__Group__0__Impl : ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) ) ;
    public final void rule__ReservationsConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1604:1: ( ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) ) )
            // InternalMetaheres.g:1605:1: ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) )
            {
            // InternalMetaheres.g:1605:1: ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) )
            // InternalMetaheres.g:1606:2: ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckAssignment_0()); 
            // InternalMetaheres.g:1607:2: ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 )
            // InternalMetaheres.g:1607:3: rule__ReservationsConfig__HasMoveOutCheckAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__HasMoveOutCheckAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__0__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__1"
    // InternalMetaheres.g:1615:1: rule__ReservationsConfig__Group__1 : rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2 ;
    public final void rule__ReservationsConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1619:1: ( rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2 )
            // InternalMetaheres.g:1620:2: rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ReservationsConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__1"


    // $ANTLR start "rule__ReservationsConfig__Group__1__Impl"
    // InternalMetaheres.g:1627:1: rule__ReservationsConfig__Group__1__Impl : ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? ) ;
    public final void rule__ReservationsConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1631:1: ( ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? ) )
            // InternalMetaheres.g:1632:1: ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? )
            {
            // InternalMetaheres.g:1632:1: ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? )
            // InternalMetaheres.g:1633:2: ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )?
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckAssignment_1()); 
            // InternalMetaheres.g:1634:2: ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaheres.g:1634:3: rule__ReservationsConfig__HasMoveInCheckAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReservationsConfig__HasMoveInCheckAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__1__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__2"
    // InternalMetaheres.g:1642:1: rule__ReservationsConfig__Group__2 : rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3 ;
    public final void rule__ReservationsConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1646:1: ( rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3 )
            // InternalMetaheres.g:1647:2: rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ReservationsConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__2"


    // $ANTLR start "rule__ReservationsConfig__Group__2__Impl"
    // InternalMetaheres.g:1654:1: rule__ReservationsConfig__Group__2__Impl : ( 'avance-minimum-et-maximum-reservation' ) ;
    public final void rule__ReservationsConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1658:1: ( ( 'avance-minimum-et-maximum-reservation' ) )
            // InternalMetaheres.g:1659:1: ( 'avance-minimum-et-maximum-reservation' )
            {
            // InternalMetaheres.g:1659:1: ( 'avance-minimum-et-maximum-reservation' )
            // InternalMetaheres.g:1660:2: 'avance-minimum-et-maximum-reservation'
            {
             before(grammarAccess.getReservationsConfigAccess().getAvanceMinimumEtMaximumReservationKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getAvanceMinimumEtMaximumReservationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__2__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__3"
    // InternalMetaheres.g:1669:1: rule__ReservationsConfig__Group__3 : rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4 ;
    public final void rule__ReservationsConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1673:1: ( rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4 )
            // InternalMetaheres.g:1674:2: rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ReservationsConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__3"


    // $ANTLR start "rule__ReservationsConfig__Group__3__Impl"
    // InternalMetaheres.g:1681:1: rule__ReservationsConfig__Group__3__Impl : ( ':' ) ;
    public final void rule__ReservationsConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1685:1: ( ( ':' ) )
            // InternalMetaheres.g:1686:1: ( ':' )
            {
            // InternalMetaheres.g:1686:1: ( ':' )
            // InternalMetaheres.g:1687:2: ':'
            {
             before(grammarAccess.getReservationsConfigAccess().getColonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__3__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__4"
    // InternalMetaheres.g:1696:1: rule__ReservationsConfig__Group__4 : rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5 ;
    public final void rule__ReservationsConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1700:1: ( rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5 )
            // InternalMetaheres.g:1701:2: rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ReservationsConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__4"


    // $ANTLR start "rule__ReservationsConfig__Group__4__Impl"
    // InternalMetaheres.g:1708:1: rule__ReservationsConfig__Group__4__Impl : ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 ) ) ;
    public final void rule__ReservationsConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1712:1: ( ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 ) ) )
            // InternalMetaheres.g:1713:1: ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 ) )
            {
            // InternalMetaheres.g:1713:1: ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 ) )
            // InternalMetaheres.g:1714:2: ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 )
            {
             before(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceAssignment_4()); 
            // InternalMetaheres.g:1715:2: ( rule__ReservationsConfig__MinRequestAdvanceAssignment_4 )
            // InternalMetaheres.g:1715:3: rule__ReservationsConfig__MinRequestAdvanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__MinRequestAdvanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__4__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__5"
    // InternalMetaheres.g:1723:1: rule__ReservationsConfig__Group__5 : rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6 ;
    public final void rule__ReservationsConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1727:1: ( rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6 )
            // InternalMetaheres.g:1728:2: rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ReservationsConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__5"


    // $ANTLR start "rule__ReservationsConfig__Group__5__Impl"
    // InternalMetaheres.g:1735:1: rule__ReservationsConfig__Group__5__Impl : ( ',' ) ;
    public final void rule__ReservationsConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1739:1: ( ( ',' ) )
            // InternalMetaheres.g:1740:1: ( ',' )
            {
            // InternalMetaheres.g:1740:1: ( ',' )
            // InternalMetaheres.g:1741:2: ','
            {
             before(grammarAccess.getReservationsConfigAccess().getCommaKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__5__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__6"
    // InternalMetaheres.g:1750:1: rule__ReservationsConfig__Group__6 : rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7 ;
    public final void rule__ReservationsConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1754:1: ( rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7 )
            // InternalMetaheres.g:1755:2: rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ReservationsConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__6"


    // $ANTLR start "rule__ReservationsConfig__Group__6__Impl"
    // InternalMetaheres.g:1762:1: rule__ReservationsConfig__Group__6__Impl : ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 ) ) ;
    public final void rule__ReservationsConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1766:1: ( ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 ) ) )
            // InternalMetaheres.g:1767:1: ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 ) )
            {
            // InternalMetaheres.g:1767:1: ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 ) )
            // InternalMetaheres.g:1768:2: ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 )
            {
             before(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceAssignment_6()); 
            // InternalMetaheres.g:1769:2: ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 )
            // InternalMetaheres.g:1769:3: rule__ReservationsConfig__MaxRequestAdvanceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__MaxRequestAdvanceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__6__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__7"
    // InternalMetaheres.g:1777:1: rule__ReservationsConfig__Group__7 : rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8 ;
    public final void rule__ReservationsConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1781:1: ( rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8 )
            // InternalMetaheres.g:1782:2: rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__ReservationsConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__7"


    // $ANTLR start "rule__ReservationsConfig__Group__7__Impl"
    // InternalMetaheres.g:1789:1: rule__ReservationsConfig__Group__7__Impl : ( 'statuts-des-demandes' ) ;
    public final void rule__ReservationsConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1793:1: ( ( 'statuts-des-demandes' ) )
            // InternalMetaheres.g:1794:1: ( 'statuts-des-demandes' )
            {
            // InternalMetaheres.g:1794:1: ( 'statuts-des-demandes' )
            // InternalMetaheres.g:1795:2: 'statuts-des-demandes'
            {
             before(grammarAccess.getReservationsConfigAccess().getStatutsDesDemandesKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getStatutsDesDemandesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__7__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__8"
    // InternalMetaheres.g:1804:1: rule__ReservationsConfig__Group__8 : rule__ReservationsConfig__Group__8__Impl rule__ReservationsConfig__Group__9 ;
    public final void rule__ReservationsConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1808:1: ( rule__ReservationsConfig__Group__8__Impl rule__ReservationsConfig__Group__9 )
            // InternalMetaheres.g:1809:2: rule__ReservationsConfig__Group__8__Impl rule__ReservationsConfig__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ReservationsConfig__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__8"


    // $ANTLR start "rule__ReservationsConfig__Group__8__Impl"
    // InternalMetaheres.g:1816:1: rule__ReservationsConfig__Group__8__Impl : ( ':' ) ;
    public final void rule__ReservationsConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1820:1: ( ( ':' ) )
            // InternalMetaheres.g:1821:1: ( ':' )
            {
            // InternalMetaheres.g:1821:1: ( ':' )
            // InternalMetaheres.g:1822:2: ':'
            {
             before(grammarAccess.getReservationsConfigAccess().getColonKeyword_8()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__8__Impl"


    // $ANTLR start "rule__ReservationsConfig__Group__9"
    // InternalMetaheres.g:1831:1: rule__ReservationsConfig__Group__9 : rule__ReservationsConfig__Group__9__Impl ;
    public final void rule__ReservationsConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1835:1: ( rule__ReservationsConfig__Group__9__Impl )
            // InternalMetaheres.g:1836:2: rule__ReservationsConfig__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__9"


    // $ANTLR start "rule__ReservationsConfig__Group__9__Impl"
    // InternalMetaheres.g:1842:1: rule__ReservationsConfig__Group__9__Impl : ( ( rule__ReservationsConfig__StatuslistAssignment_9 ) ) ;
    public final void rule__ReservationsConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1846:1: ( ( ( rule__ReservationsConfig__StatuslistAssignment_9 ) ) )
            // InternalMetaheres.g:1847:1: ( ( rule__ReservationsConfig__StatuslistAssignment_9 ) )
            {
            // InternalMetaheres.g:1847:1: ( ( rule__ReservationsConfig__StatuslistAssignment_9 ) )
            // InternalMetaheres.g:1848:2: ( rule__ReservationsConfig__StatuslistAssignment_9 )
            {
             before(grammarAccess.getReservationsConfigAccess().getStatuslistAssignment_9()); 
            // InternalMetaheres.g:1849:2: ( rule__ReservationsConfig__StatuslistAssignment_9 )
            // InternalMetaheres.g:1849:3: rule__ReservationsConfig__StatuslistAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__StatuslistAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getStatuslistAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__Group__9__Impl"


    // $ANTLR start "rule__Country__Group__0"
    // InternalMetaheres.g:1858:1: rule__Country__Group__0 : rule__Country__Group__0__Impl rule__Country__Group__1 ;
    public final void rule__Country__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1862:1: ( rule__Country__Group__0__Impl rule__Country__Group__1 )
            // InternalMetaheres.g:1863:2: rule__Country__Group__0__Impl rule__Country__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Country__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0"


    // $ANTLR start "rule__Country__Group__0__Impl"
    // InternalMetaheres.g:1870:1: rule__Country__Group__0__Impl : ( ( rule__Country__NameAssignment_0 ) ) ;
    public final void rule__Country__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1874:1: ( ( ( rule__Country__NameAssignment_0 ) ) )
            // InternalMetaheres.g:1875:1: ( ( rule__Country__NameAssignment_0 ) )
            {
            // InternalMetaheres.g:1875:1: ( ( rule__Country__NameAssignment_0 ) )
            // InternalMetaheres.g:1876:2: ( rule__Country__NameAssignment_0 )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment_0()); 
            // InternalMetaheres.g:1877:2: ( rule__Country__NameAssignment_0 )
            // InternalMetaheres.g:1877:3: rule__Country__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Country__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0__Impl"


    // $ANTLR start "rule__Country__Group__1"
    // InternalMetaheres.g:1885:1: rule__Country__Group__1 : rule__Country__Group__1__Impl rule__Country__Group__2 ;
    public final void rule__Country__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1889:1: ( rule__Country__Group__1__Impl rule__Country__Group__2 )
            // InternalMetaheres.g:1890:2: rule__Country__Group__1__Impl rule__Country__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Country__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1"


    // $ANTLR start "rule__Country__Group__1__Impl"
    // InternalMetaheres.g:1897:1: rule__Country__Group__1__Impl : ( ':' ) ;
    public final void rule__Country__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1901:1: ( ( ':' ) )
            // InternalMetaheres.g:1902:1: ( ':' )
            {
            // InternalMetaheres.g:1902:1: ( ':' )
            // InternalMetaheres.g:1903:2: ':'
            {
             before(grammarAccess.getCountryAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1__Impl"


    // $ANTLR start "rule__Country__Group__2"
    // InternalMetaheres.g:1912:1: rule__Country__Group__2 : rule__Country__Group__2__Impl rule__Country__Group__3 ;
    public final void rule__Country__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1916:1: ( rule__Country__Group__2__Impl rule__Country__Group__3 )
            // InternalMetaheres.g:1917:2: rule__Country__Group__2__Impl rule__Country__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Country__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__2"


    // $ANTLR start "rule__Country__Group__2__Impl"
    // InternalMetaheres.g:1924:1: rule__Country__Group__2__Impl : ( ( rule__Country__LanguageAssignment_2 ) ) ;
    public final void rule__Country__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1928:1: ( ( ( rule__Country__LanguageAssignment_2 ) ) )
            // InternalMetaheres.g:1929:1: ( ( rule__Country__LanguageAssignment_2 ) )
            {
            // InternalMetaheres.g:1929:1: ( ( rule__Country__LanguageAssignment_2 ) )
            // InternalMetaheres.g:1930:2: ( rule__Country__LanguageAssignment_2 )
            {
             before(grammarAccess.getCountryAccess().getLanguageAssignment_2()); 
            // InternalMetaheres.g:1931:2: ( rule__Country__LanguageAssignment_2 )
            // InternalMetaheres.g:1931:3: rule__Country__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Country__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__2__Impl"


    // $ANTLR start "rule__Country__Group__3"
    // InternalMetaheres.g:1939:1: rule__Country__Group__3 : rule__Country__Group__3__Impl rule__Country__Group__4 ;
    public final void rule__Country__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1943:1: ( rule__Country__Group__3__Impl rule__Country__Group__4 )
            // InternalMetaheres.g:1944:2: rule__Country__Group__3__Impl rule__Country__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Country__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__3"


    // $ANTLR start "rule__Country__Group__3__Impl"
    // InternalMetaheres.g:1951:1: rule__Country__Group__3__Impl : ( ',' ) ;
    public final void rule__Country__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1955:1: ( ( ',' ) )
            // InternalMetaheres.g:1956:1: ( ',' )
            {
            // InternalMetaheres.g:1956:1: ( ',' )
            // InternalMetaheres.g:1957:2: ','
            {
             before(grammarAccess.getCountryAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__3__Impl"


    // $ANTLR start "rule__Country__Group__4"
    // InternalMetaheres.g:1966:1: rule__Country__Group__4 : rule__Country__Group__4__Impl rule__Country__Group__5 ;
    public final void rule__Country__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1970:1: ( rule__Country__Group__4__Impl rule__Country__Group__5 )
            // InternalMetaheres.g:1971:2: rule__Country__Group__4__Impl rule__Country__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Country__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__4"


    // $ANTLR start "rule__Country__Group__4__Impl"
    // InternalMetaheres.g:1978:1: rule__Country__Group__4__Impl : ( 'tarification' ) ;
    public final void rule__Country__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1982:1: ( ( 'tarification' ) )
            // InternalMetaheres.g:1983:1: ( 'tarification' )
            {
            // InternalMetaheres.g:1983:1: ( 'tarification' )
            // InternalMetaheres.g:1984:2: 'tarification'
            {
             before(grammarAccess.getCountryAccess().getTarificationKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getTarificationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__4__Impl"


    // $ANTLR start "rule__Country__Group__5"
    // InternalMetaheres.g:1993:1: rule__Country__Group__5 : rule__Country__Group__5__Impl rule__Country__Group__6 ;
    public final void rule__Country__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:1997:1: ( rule__Country__Group__5__Impl rule__Country__Group__6 )
            // InternalMetaheres.g:1998:2: rule__Country__Group__5__Impl rule__Country__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Country__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__5"


    // $ANTLR start "rule__Country__Group__5__Impl"
    // InternalMetaheres.g:2005:1: rule__Country__Group__5__Impl : ( ':' ) ;
    public final void rule__Country__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2009:1: ( ( ':' ) )
            // InternalMetaheres.g:2010:1: ( ':' )
            {
            // InternalMetaheres.g:2010:1: ( ':' )
            // InternalMetaheres.g:2011:2: ':'
            {
             before(grammarAccess.getCountryAccess().getColonKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__5__Impl"


    // $ANTLR start "rule__Country__Group__6"
    // InternalMetaheres.g:2020:1: rule__Country__Group__6 : rule__Country__Group__6__Impl ;
    public final void rule__Country__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2024:1: ( rule__Country__Group__6__Impl )
            // InternalMetaheres.g:2025:2: rule__Country__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__6"


    // $ANTLR start "rule__Country__Group__6__Impl"
    // InternalMetaheres.g:2031:1: rule__Country__Group__6__Impl : ( ( rule__Country__PricingsystemAssignment_6 ) ) ;
    public final void rule__Country__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2035:1: ( ( ( rule__Country__PricingsystemAssignment_6 ) ) )
            // InternalMetaheres.g:2036:1: ( ( rule__Country__PricingsystemAssignment_6 ) )
            {
            // InternalMetaheres.g:2036:1: ( ( rule__Country__PricingsystemAssignment_6 ) )
            // InternalMetaheres.g:2037:2: ( rule__Country__PricingsystemAssignment_6 )
            {
             before(grammarAccess.getCountryAccess().getPricingsystemAssignment_6()); 
            // InternalMetaheres.g:2038:2: ( rule__Country__PricingsystemAssignment_6 )
            // InternalMetaheres.g:2038:3: rule__Country__PricingsystemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Country__PricingsystemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getPricingsystemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__6__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__0"
    // InternalMetaheres.g:2047:1: rule__ResourcesConfig__Group__0 : rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1 ;
    public final void rule__ResourcesConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2051:1: ( rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1 )
            // InternalMetaheres.g:2052:2: rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__0"


    // $ANTLR start "rule__ResourcesConfig__Group__0__Impl"
    // InternalMetaheres.g:2059:1: rule__ResourcesConfig__Group__0__Impl : ( '(' ) ;
    public final void rule__ResourcesConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2063:1: ( ( '(' ) )
            // InternalMetaheres.g:2064:1: ( '(' )
            {
            // InternalMetaheres.g:2064:1: ( '(' )
            // InternalMetaheres.g:2065:2: '('
            {
             before(grammarAccess.getResourcesConfigAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__0__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__1"
    // InternalMetaheres.g:2074:1: rule__ResourcesConfig__Group__1 : rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2 ;
    public final void rule__ResourcesConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2078:1: ( rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2 )
            // InternalMetaheres.g:2079:2: rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__1"


    // $ANTLR start "rule__ResourcesConfig__Group__1__Impl"
    // InternalMetaheres.g:2086:1: rule__ResourcesConfig__Group__1__Impl : ( ( rule__ResourcesConfig__HasImageAssignment_1 )? ) ;
    public final void rule__ResourcesConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2090:1: ( ( ( rule__ResourcesConfig__HasImageAssignment_1 )? ) )
            // InternalMetaheres.g:2091:1: ( ( rule__ResourcesConfig__HasImageAssignment_1 )? )
            {
            // InternalMetaheres.g:2091:1: ( ( rule__ResourcesConfig__HasImageAssignment_1 )? )
            // InternalMetaheres.g:2092:2: ( rule__ResourcesConfig__HasImageAssignment_1 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageAssignment_1()); 
            // InternalMetaheres.g:2093:2: ( rule__ResourcesConfig__HasImageAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaheres.g:2093:3: rule__ResourcesConfig__HasImageAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourcesConfig__HasImageAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesConfigAccess().getHasImageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__1__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__2"
    // InternalMetaheres.g:2101:1: rule__ResourcesConfig__Group__2 : rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3 ;
    public final void rule__ResourcesConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2105:1: ( rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3 )
            // InternalMetaheres.g:2106:2: rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__2"


    // $ANTLR start "rule__ResourcesConfig__Group__2__Impl"
    // InternalMetaheres.g:2113:1: rule__ResourcesConfig__Group__2__Impl : ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? ) ;
    public final void rule__ResourcesConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2117:1: ( ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? ) )
            // InternalMetaheres.g:2118:1: ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? )
            {
            // InternalMetaheres.g:2118:1: ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? )
            // InternalMetaheres.g:2119:2: ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotAssignment_2()); 
            // InternalMetaheres.g:2120:2: ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaheres.g:2120:3: rule__ResourcesConfig__HasOneStockPerSlotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourcesConfig__HasOneStockPerSlotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__2__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__3"
    // InternalMetaheres.g:2128:1: rule__ResourcesConfig__Group__3 : rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4 ;
    public final void rule__ResourcesConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2132:1: ( rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4 )
            // InternalMetaheres.g:2133:2: rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__3"


    // $ANTLR start "rule__ResourcesConfig__Group__3__Impl"
    // InternalMetaheres.g:2140:1: rule__ResourcesConfig__Group__3__Impl : ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? ) ;
    public final void rule__ResourcesConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2144:1: ( ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? ) )
            // InternalMetaheres.g:2145:1: ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? )
            {
            // InternalMetaheres.g:2145:1: ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? )
            // InternalMetaheres.g:2146:2: ( rule__ResourcesConfig__IsConsumableAssignment_3 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableAssignment_3()); 
            // InternalMetaheres.g:2147:2: ( rule__ResourcesConfig__IsConsumableAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMetaheres.g:2147:3: rule__ResourcesConfig__IsConsumableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourcesConfig__IsConsumableAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesConfigAccess().getIsConsumableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__3__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__4"
    // InternalMetaheres.g:2155:1: rule__ResourcesConfig__Group__4 : rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5 ;
    public final void rule__ResourcesConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2159:1: ( rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5 )
            // InternalMetaheres.g:2160:2: rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__4"


    // $ANTLR start "rule__ResourcesConfig__Group__4__Impl"
    // InternalMetaheres.g:2167:1: rule__ResourcesConfig__Group__4__Impl : ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? ) ;
    public final void rule__ResourcesConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2171:1: ( ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? ) )
            // InternalMetaheres.g:2172:1: ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? )
            {
            // InternalMetaheres.g:2172:1: ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? )
            // InternalMetaheres.g:2173:2: ( rule__ResourcesConfig__IsLoanAssignment_4 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanAssignment_4()); 
            // InternalMetaheres.g:2174:2: ( rule__ResourcesConfig__IsLoanAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaheres.g:2174:3: rule__ResourcesConfig__IsLoanAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourcesConfig__IsLoanAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesConfigAccess().getIsLoanAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__4__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__5"
    // InternalMetaheres.g:2182:1: rule__ResourcesConfig__Group__5 : rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6 ;
    public final void rule__ResourcesConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2186:1: ( rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6 )
            // InternalMetaheres.g:2187:2: rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ResourcesConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__5"


    // $ANTLR start "rule__ResourcesConfig__Group__5__Impl"
    // InternalMetaheres.g:2194:1: rule__ResourcesConfig__Group__5__Impl : ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? ) ;
    public final void rule__ResourcesConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2198:1: ( ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? ) )
            // InternalMetaheres.g:2199:1: ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? )
            {
            // InternalMetaheres.g:2199:1: ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? )
            // InternalMetaheres.g:2200:2: ( rule__ResourcesConfig__IsChargedAssignment_5 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedAssignment_5()); 
            // InternalMetaheres.g:2201:2: ( rule__ResourcesConfig__IsChargedAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaheres.g:2201:3: rule__ResourcesConfig__IsChargedAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResourcesConfig__IsChargedAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesConfigAccess().getIsChargedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__5__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__6"
    // InternalMetaheres.g:2209:1: rule__ResourcesConfig__Group__6 : rule__ResourcesConfig__Group__6__Impl ;
    public final void rule__ResourcesConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2213:1: ( rule__ResourcesConfig__Group__6__Impl )
            // InternalMetaheres.g:2214:2: rule__ResourcesConfig__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourcesConfig__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__6"


    // $ANTLR start "rule__ResourcesConfig__Group__6__Impl"
    // InternalMetaheres.g:2220:1: rule__ResourcesConfig__Group__6__Impl : ( ')' ) ;
    public final void rule__ResourcesConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2224:1: ( ( ')' ) )
            // InternalMetaheres.g:2225:1: ( ')' )
            {
            // InternalMetaheres.g:2225:1: ( ')' )
            // InternalMetaheres.g:2226:2: ')'
            {
             before(grammarAccess.getResourcesConfigAccess().getRightParenthesisKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__Group__6__Impl"


    // $ANTLR start "rule__LotsConfig__Group__0"
    // InternalMetaheres.g:2236:1: rule__LotsConfig__Group__0 : rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1 ;
    public final void rule__LotsConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2240:1: ( rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1 )
            // InternalMetaheres.g:2241:2: rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LotsConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__0"


    // $ANTLR start "rule__LotsConfig__Group__0__Impl"
    // InternalMetaheres.g:2248:1: rule__LotsConfig__Group__0__Impl : ( () ) ;
    public final void rule__LotsConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2252:1: ( ( () ) )
            // InternalMetaheres.g:2253:1: ( () )
            {
            // InternalMetaheres.g:2253:1: ( () )
            // InternalMetaheres.g:2254:2: ()
            {
             before(grammarAccess.getLotsConfigAccess().getLotsConfigAction_0()); 
            // InternalMetaheres.g:2255:2: ()
            // InternalMetaheres.g:2255:3: 
            {
            }

             after(grammarAccess.getLotsConfigAccess().getLotsConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__0__Impl"


    // $ANTLR start "rule__LotsConfig__Group__1"
    // InternalMetaheres.g:2263:1: rule__LotsConfig__Group__1 : rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2 ;
    public final void rule__LotsConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2267:1: ( rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2 )
            // InternalMetaheres.g:2268:2: rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__LotsConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__1"


    // $ANTLR start "rule__LotsConfig__Group__1__Impl"
    // InternalMetaheres.g:2275:1: rule__LotsConfig__Group__1__Impl : ( '(' ) ;
    public final void rule__LotsConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2279:1: ( ( '(' ) )
            // InternalMetaheres.g:2280:1: ( '(' )
            {
            // InternalMetaheres.g:2280:1: ( '(' )
            // InternalMetaheres.g:2281:2: '('
            {
             before(grammarAccess.getLotsConfigAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__1__Impl"


    // $ANTLR start "rule__LotsConfig__Group__2"
    // InternalMetaheres.g:2290:1: rule__LotsConfig__Group__2 : rule__LotsConfig__Group__2__Impl rule__LotsConfig__Group__3 ;
    public final void rule__LotsConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2294:1: ( rule__LotsConfig__Group__2__Impl rule__LotsConfig__Group__3 )
            // InternalMetaheres.g:2295:2: rule__LotsConfig__Group__2__Impl rule__LotsConfig__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__LotsConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__2"


    // $ANTLR start "rule__LotsConfig__Group__2__Impl"
    // InternalMetaheres.g:2302:1: rule__LotsConfig__Group__2__Impl : ( ( rule__LotsConfig__HasImageAssignment_2 )? ) ;
    public final void rule__LotsConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2306:1: ( ( ( rule__LotsConfig__HasImageAssignment_2 )? ) )
            // InternalMetaheres.g:2307:1: ( ( rule__LotsConfig__HasImageAssignment_2 )? )
            {
            // InternalMetaheres.g:2307:1: ( ( rule__LotsConfig__HasImageAssignment_2 )? )
            // InternalMetaheres.g:2308:2: ( rule__LotsConfig__HasImageAssignment_2 )?
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageAssignment_2()); 
            // InternalMetaheres.g:2309:2: ( rule__LotsConfig__HasImageAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMetaheres.g:2309:3: rule__LotsConfig__HasImageAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LotsConfig__HasImageAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLotsConfigAccess().getHasImageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__2__Impl"


    // $ANTLR start "rule__LotsConfig__Group__3"
    // InternalMetaheres.g:2317:1: rule__LotsConfig__Group__3 : rule__LotsConfig__Group__3__Impl rule__LotsConfig__Group__4 ;
    public final void rule__LotsConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2321:1: ( rule__LotsConfig__Group__3__Impl rule__LotsConfig__Group__4 )
            // InternalMetaheres.g:2322:2: rule__LotsConfig__Group__3__Impl rule__LotsConfig__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LotsConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__3"


    // $ANTLR start "rule__LotsConfig__Group__3__Impl"
    // InternalMetaheres.g:2329:1: rule__LotsConfig__Group__3__Impl : ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )? ) ;
    public final void rule__LotsConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2333:1: ( ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )? ) )
            // InternalMetaheres.g:2334:1: ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )? )
            {
            // InternalMetaheres.g:2334:1: ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )? )
            // InternalMetaheres.g:2335:2: ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )?
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotAssignment_3()); 
            // InternalMetaheres.g:2336:2: ( rule__LotsConfig__HasOneStockPerSlotAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMetaheres.g:2336:3: rule__LotsConfig__HasOneStockPerSlotAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LotsConfig__HasOneStockPerSlotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__3__Impl"


    // $ANTLR start "rule__LotsConfig__Group__4"
    // InternalMetaheres.g:2344:1: rule__LotsConfig__Group__4 : rule__LotsConfig__Group__4__Impl ;
    public final void rule__LotsConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2348:1: ( rule__LotsConfig__Group__4__Impl )
            // InternalMetaheres.g:2349:2: rule__LotsConfig__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__4"


    // $ANTLR start "rule__LotsConfig__Group__4__Impl"
    // InternalMetaheres.g:2355:1: rule__LotsConfig__Group__4__Impl : ( ')' ) ;
    public final void rule__LotsConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2359:1: ( ( ')' ) )
            // InternalMetaheres.g:2360:1: ( ')' )
            {
            // InternalMetaheres.g:2360:1: ( ')' )
            // InternalMetaheres.g:2361:2: ')'
            {
             before(grammarAccess.getLotsConfigAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__Group__4__Impl"


    // $ANTLR start "rule__PricingSystem__Group__0"
    // InternalMetaheres.g:2371:1: rule__PricingSystem__Group__0 : rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1 ;
    public final void rule__PricingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2375:1: ( rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1 )
            // InternalMetaheres.g:2376:2: rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PricingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__0"


    // $ANTLR start "rule__PricingSystem__Group__0__Impl"
    // InternalMetaheres.g:2383:1: rule__PricingSystem__Group__0__Impl : ( ( rule__PricingSystem__NameAssignment_0 ) ) ;
    public final void rule__PricingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2387:1: ( ( ( rule__PricingSystem__NameAssignment_0 ) ) )
            // InternalMetaheres.g:2388:1: ( ( rule__PricingSystem__NameAssignment_0 ) )
            {
            // InternalMetaheres.g:2388:1: ( ( rule__PricingSystem__NameAssignment_0 ) )
            // InternalMetaheres.g:2389:2: ( rule__PricingSystem__NameAssignment_0 )
            {
             before(grammarAccess.getPricingSystemAccess().getNameAssignment_0()); 
            // InternalMetaheres.g:2390:2: ( rule__PricingSystem__NameAssignment_0 )
            // InternalMetaheres.g:2390:3: rule__PricingSystem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__0__Impl"


    // $ANTLR start "rule__PricingSystem__Group__1"
    // InternalMetaheres.g:2398:1: rule__PricingSystem__Group__1 : rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2 ;
    public final void rule__PricingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2402:1: ( rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2 )
            // InternalMetaheres.g:2403:2: rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PricingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__1"


    // $ANTLR start "rule__PricingSystem__Group__1__Impl"
    // InternalMetaheres.g:2410:1: rule__PricingSystem__Group__1__Impl : ( '(' ) ;
    public final void rule__PricingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2414:1: ( ( '(' ) )
            // InternalMetaheres.g:2415:1: ( '(' )
            {
            // InternalMetaheres.g:2415:1: ( '(' )
            // InternalMetaheres.g:2416:2: '('
            {
             before(grammarAccess.getPricingSystemAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__1__Impl"


    // $ANTLR start "rule__PricingSystem__Group__2"
    // InternalMetaheres.g:2425:1: rule__PricingSystem__Group__2 : rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3 ;
    public final void rule__PricingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2429:1: ( rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3 )
            // InternalMetaheres.g:2430:2: rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PricingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__2"


    // $ANTLR start "rule__PricingSystem__Group__2__Impl"
    // InternalMetaheres.g:2437:1: rule__PricingSystem__Group__2__Impl : ( 'devise' ) ;
    public final void rule__PricingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2441:1: ( ( 'devise' ) )
            // InternalMetaheres.g:2442:1: ( 'devise' )
            {
            // InternalMetaheres.g:2442:1: ( 'devise' )
            // InternalMetaheres.g:2443:2: 'devise'
            {
             before(grammarAccess.getPricingSystemAccess().getDeviseKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getDeviseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__2__Impl"


    // $ANTLR start "rule__PricingSystem__Group__3"
    // InternalMetaheres.g:2452:1: rule__PricingSystem__Group__3 : rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4 ;
    public final void rule__PricingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2456:1: ( rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4 )
            // InternalMetaheres.g:2457:2: rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PricingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__3"


    // $ANTLR start "rule__PricingSystem__Group__3__Impl"
    // InternalMetaheres.g:2464:1: rule__PricingSystem__Group__3__Impl : ( ':' ) ;
    public final void rule__PricingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2468:1: ( ( ':' ) )
            // InternalMetaheres.g:2469:1: ( ':' )
            {
            // InternalMetaheres.g:2469:1: ( ':' )
            // InternalMetaheres.g:2470:2: ':'
            {
             before(grammarAccess.getPricingSystemAccess().getColonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__3__Impl"


    // $ANTLR start "rule__PricingSystem__Group__4"
    // InternalMetaheres.g:2479:1: rule__PricingSystem__Group__4 : rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5 ;
    public final void rule__PricingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2483:1: ( rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5 )
            // InternalMetaheres.g:2484:2: rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PricingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__4"


    // $ANTLR start "rule__PricingSystem__Group__4__Impl"
    // InternalMetaheres.g:2491:1: rule__PricingSystem__Group__4__Impl : ( ( rule__PricingSystem__CurrencyAssignment_4 ) ) ;
    public final void rule__PricingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2495:1: ( ( ( rule__PricingSystem__CurrencyAssignment_4 ) ) )
            // InternalMetaheres.g:2496:1: ( ( rule__PricingSystem__CurrencyAssignment_4 ) )
            {
            // InternalMetaheres.g:2496:1: ( ( rule__PricingSystem__CurrencyAssignment_4 ) )
            // InternalMetaheres.g:2497:2: ( rule__PricingSystem__CurrencyAssignment_4 )
            {
             before(grammarAccess.getPricingSystemAccess().getCurrencyAssignment_4()); 
            // InternalMetaheres.g:2498:2: ( rule__PricingSystem__CurrencyAssignment_4 )
            // InternalMetaheres.g:2498:3: rule__PricingSystem__CurrencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__CurrencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getCurrencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__4__Impl"


    // $ANTLR start "rule__PricingSystem__Group__5"
    // InternalMetaheres.g:2506:1: rule__PricingSystem__Group__5 : rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6 ;
    public final void rule__PricingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2510:1: ( rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6 )
            // InternalMetaheres.g:2511:2: rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__PricingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__5"


    // $ANTLR start "rule__PricingSystem__Group__5__Impl"
    // InternalMetaheres.g:2518:1: rule__PricingSystem__Group__5__Impl : ( ',' ) ;
    public final void rule__PricingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2522:1: ( ( ',' ) )
            // InternalMetaheres.g:2523:1: ( ',' )
            {
            // InternalMetaheres.g:2523:1: ( ',' )
            // InternalMetaheres.g:2524:2: ','
            {
             before(grammarAccess.getPricingSystemAccess().getCommaKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__5__Impl"


    // $ANTLR start "rule__PricingSystem__Group__6"
    // InternalMetaheres.g:2533:1: rule__PricingSystem__Group__6 : rule__PricingSystem__Group__6__Impl rule__PricingSystem__Group__7 ;
    public final void rule__PricingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2537:1: ( rule__PricingSystem__Group__6__Impl rule__PricingSystem__Group__7 )
            // InternalMetaheres.g:2538:2: rule__PricingSystem__Group__6__Impl rule__PricingSystem__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__PricingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__6"


    // $ANTLR start "rule__PricingSystem__Group__6__Impl"
    // InternalMetaheres.g:2545:1: rule__PricingSystem__Group__6__Impl : ( 'systeme-comptable' ) ;
    public final void rule__PricingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2549:1: ( ( 'systeme-comptable' ) )
            // InternalMetaheres.g:2550:1: ( 'systeme-comptable' )
            {
            // InternalMetaheres.g:2550:1: ( 'systeme-comptable' )
            // InternalMetaheres.g:2551:2: 'systeme-comptable'
            {
             before(grammarAccess.getPricingSystemAccess().getSystemeComptableKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getSystemeComptableKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__6__Impl"


    // $ANTLR start "rule__PricingSystem__Group__7"
    // InternalMetaheres.g:2560:1: rule__PricingSystem__Group__7 : rule__PricingSystem__Group__7__Impl rule__PricingSystem__Group__8 ;
    public final void rule__PricingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2564:1: ( rule__PricingSystem__Group__7__Impl rule__PricingSystem__Group__8 )
            // InternalMetaheres.g:2565:2: rule__PricingSystem__Group__7__Impl rule__PricingSystem__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__PricingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__7"


    // $ANTLR start "rule__PricingSystem__Group__7__Impl"
    // InternalMetaheres.g:2572:1: rule__PricingSystem__Group__7__Impl : ( ':' ) ;
    public final void rule__PricingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2576:1: ( ( ':' ) )
            // InternalMetaheres.g:2577:1: ( ':' )
            {
            // InternalMetaheres.g:2577:1: ( ':' )
            // InternalMetaheres.g:2578:2: ':'
            {
             before(grammarAccess.getPricingSystemAccess().getColonKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__7__Impl"


    // $ANTLR start "rule__PricingSystem__Group__8"
    // InternalMetaheres.g:2587:1: rule__PricingSystem__Group__8 : rule__PricingSystem__Group__8__Impl rule__PricingSystem__Group__9 ;
    public final void rule__PricingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2591:1: ( rule__PricingSystem__Group__8__Impl rule__PricingSystem__Group__9 )
            // InternalMetaheres.g:2592:2: rule__PricingSystem__Group__8__Impl rule__PricingSystem__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__PricingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__8"


    // $ANTLR start "rule__PricingSystem__Group__8__Impl"
    // InternalMetaheres.g:2599:1: rule__PricingSystem__Group__8__Impl : ( ( rule__PricingSystem__TaxSystemAssignment_8 ) ) ;
    public final void rule__PricingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2603:1: ( ( ( rule__PricingSystem__TaxSystemAssignment_8 ) ) )
            // InternalMetaheres.g:2604:1: ( ( rule__PricingSystem__TaxSystemAssignment_8 ) )
            {
            // InternalMetaheres.g:2604:1: ( ( rule__PricingSystem__TaxSystemAssignment_8 ) )
            // InternalMetaheres.g:2605:2: ( rule__PricingSystem__TaxSystemAssignment_8 )
            {
             before(grammarAccess.getPricingSystemAccess().getTaxSystemAssignment_8()); 
            // InternalMetaheres.g:2606:2: ( rule__PricingSystem__TaxSystemAssignment_8 )
            // InternalMetaheres.g:2606:3: rule__PricingSystem__TaxSystemAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__TaxSystemAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getTaxSystemAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__8__Impl"


    // $ANTLR start "rule__PricingSystem__Group__9"
    // InternalMetaheres.g:2614:1: rule__PricingSystem__Group__9 : rule__PricingSystem__Group__9__Impl ;
    public final void rule__PricingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2618:1: ( rule__PricingSystem__Group__9__Impl )
            // InternalMetaheres.g:2619:2: rule__PricingSystem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__9"


    // $ANTLR start "rule__PricingSystem__Group__9__Impl"
    // InternalMetaheres.g:2625:1: rule__PricingSystem__Group__9__Impl : ( ')' ) ;
    public final void rule__PricingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2629:1: ( ( ')' ) )
            // InternalMetaheres.g:2630:1: ( ')' )
            {
            // InternalMetaheres.g:2630:1: ( ')' )
            // InternalMetaheres.g:2631:2: ')'
            {
             before(grammarAccess.getPricingSystemAccess().getRightParenthesisKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__Group__9__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMetaheres.g:2641:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2645:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMetaheres.g:2646:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMetaheres.g:2653:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2657:1: ( ( ( '-' )? ) )
            // InternalMetaheres.g:2658:1: ( ( '-' )? )
            {
            // InternalMetaheres.g:2658:1: ( ( '-' )? )
            // InternalMetaheres.g:2659:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMetaheres.g:2660:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMetaheres.g:2660:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMetaheres.g:2668:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2672:1: ( rule__EInt__Group__1__Impl )
            // InternalMetaheres.g:2673:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMetaheres.g:2679:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2683:1: ( ( RULE_INT ) )
            // InternalMetaheres.g:2684:1: ( RULE_INT )
            {
            // InternalMetaheres.g:2684:1: ( RULE_INT )
            // InternalMetaheres.g:2685:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__StatusList__Group__0"
    // InternalMetaheres.g:2695:1: rule__StatusList__Group__0 : rule__StatusList__Group__0__Impl rule__StatusList__Group__1 ;
    public final void rule__StatusList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2699:1: ( rule__StatusList__Group__0__Impl rule__StatusList__Group__1 )
            // InternalMetaheres.g:2700:2: rule__StatusList__Group__0__Impl rule__StatusList__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StatusList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatusList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__0"


    // $ANTLR start "rule__StatusList__Group__0__Impl"
    // InternalMetaheres.g:2707:1: rule__StatusList__Group__0__Impl : ( '(' ) ;
    public final void rule__StatusList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2711:1: ( ( '(' ) )
            // InternalMetaheres.g:2712:1: ( '(' )
            {
            // InternalMetaheres.g:2712:1: ( '(' )
            // InternalMetaheres.g:2713:2: '('
            {
             before(grammarAccess.getStatusListAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStatusListAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__0__Impl"


    // $ANTLR start "rule__StatusList__Group__1"
    // InternalMetaheres.g:2722:1: rule__StatusList__Group__1 : rule__StatusList__Group__1__Impl rule__StatusList__Group__2 ;
    public final void rule__StatusList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2726:1: ( rule__StatusList__Group__1__Impl rule__StatusList__Group__2 )
            // InternalMetaheres.g:2727:2: rule__StatusList__Group__1__Impl rule__StatusList__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StatusList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatusList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__1"


    // $ANTLR start "rule__StatusList__Group__1__Impl"
    // InternalMetaheres.g:2734:1: rule__StatusList__Group__1__Impl : ( ( rule__StatusList__StatusAssignment_1 ) ) ;
    public final void rule__StatusList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2738:1: ( ( ( rule__StatusList__StatusAssignment_1 ) ) )
            // InternalMetaheres.g:2739:1: ( ( rule__StatusList__StatusAssignment_1 ) )
            {
            // InternalMetaheres.g:2739:1: ( ( rule__StatusList__StatusAssignment_1 ) )
            // InternalMetaheres.g:2740:2: ( rule__StatusList__StatusAssignment_1 )
            {
             before(grammarAccess.getStatusListAccess().getStatusAssignment_1()); 
            // InternalMetaheres.g:2741:2: ( rule__StatusList__StatusAssignment_1 )
            // InternalMetaheres.g:2741:3: rule__StatusList__StatusAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StatusList__StatusAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatusListAccess().getStatusAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__1__Impl"


    // $ANTLR start "rule__StatusList__Group__2"
    // InternalMetaheres.g:2749:1: rule__StatusList__Group__2 : rule__StatusList__Group__2__Impl rule__StatusList__Group__3 ;
    public final void rule__StatusList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2753:1: ( rule__StatusList__Group__2__Impl rule__StatusList__Group__3 )
            // InternalMetaheres.g:2754:2: rule__StatusList__Group__2__Impl rule__StatusList__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__StatusList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatusList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__2"


    // $ANTLR start "rule__StatusList__Group__2__Impl"
    // InternalMetaheres.g:2761:1: rule__StatusList__Group__2__Impl : ( ( rule__StatusList__Group_2__0 )* ) ;
    public final void rule__StatusList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2765:1: ( ( ( rule__StatusList__Group_2__0 )* ) )
            // InternalMetaheres.g:2766:1: ( ( rule__StatusList__Group_2__0 )* )
            {
            // InternalMetaheres.g:2766:1: ( ( rule__StatusList__Group_2__0 )* )
            // InternalMetaheres.g:2767:2: ( rule__StatusList__Group_2__0 )*
            {
             before(grammarAccess.getStatusListAccess().getGroup_2()); 
            // InternalMetaheres.g:2768:2: ( rule__StatusList__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMetaheres.g:2768:3: rule__StatusList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StatusList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStatusListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__2__Impl"


    // $ANTLR start "rule__StatusList__Group__3"
    // InternalMetaheres.g:2776:1: rule__StatusList__Group__3 : rule__StatusList__Group__3__Impl ;
    public final void rule__StatusList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2780:1: ( rule__StatusList__Group__3__Impl )
            // InternalMetaheres.g:2781:2: rule__StatusList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatusList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__3"


    // $ANTLR start "rule__StatusList__Group__3__Impl"
    // InternalMetaheres.g:2787:1: rule__StatusList__Group__3__Impl : ( ')' ) ;
    public final void rule__StatusList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2791:1: ( ( ')' ) )
            // InternalMetaheres.g:2792:1: ( ')' )
            {
            // InternalMetaheres.g:2792:1: ( ')' )
            // InternalMetaheres.g:2793:2: ')'
            {
             before(grammarAccess.getStatusListAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStatusListAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group__3__Impl"


    // $ANTLR start "rule__StatusList__Group_2__0"
    // InternalMetaheres.g:2803:1: rule__StatusList__Group_2__0 : rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1 ;
    public final void rule__StatusList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2807:1: ( rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1 )
            // InternalMetaheres.g:2808:2: rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__StatusList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatusList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group_2__0"


    // $ANTLR start "rule__StatusList__Group_2__0__Impl"
    // InternalMetaheres.g:2815:1: rule__StatusList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StatusList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2819:1: ( ( ',' ) )
            // InternalMetaheres.g:2820:1: ( ',' )
            {
            // InternalMetaheres.g:2820:1: ( ',' )
            // InternalMetaheres.g:2821:2: ','
            {
             before(grammarAccess.getStatusListAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatusListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group_2__0__Impl"


    // $ANTLR start "rule__StatusList__Group_2__1"
    // InternalMetaheres.g:2830:1: rule__StatusList__Group_2__1 : rule__StatusList__Group_2__1__Impl ;
    public final void rule__StatusList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2834:1: ( rule__StatusList__Group_2__1__Impl )
            // InternalMetaheres.g:2835:2: rule__StatusList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatusList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group_2__1"


    // $ANTLR start "rule__StatusList__Group_2__1__Impl"
    // InternalMetaheres.g:2841:1: rule__StatusList__Group_2__1__Impl : ( ( rule__StatusList__StatusAssignment_2_1 ) ) ;
    public final void rule__StatusList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2845:1: ( ( ( rule__StatusList__StatusAssignment_2_1 ) ) )
            // InternalMetaheres.g:2846:1: ( ( rule__StatusList__StatusAssignment_2_1 ) )
            {
            // InternalMetaheres.g:2846:1: ( ( rule__StatusList__StatusAssignment_2_1 ) )
            // InternalMetaheres.g:2847:2: ( rule__StatusList__StatusAssignment_2_1 )
            {
             before(grammarAccess.getStatusListAccess().getStatusAssignment_2_1()); 
            // InternalMetaheres.g:2848:2: ( rule__StatusList__StatusAssignment_2_1 )
            // InternalMetaheres.g:2848:3: rule__StatusList__StatusAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StatusList__StatusAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatusListAccess().getStatusAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__Group_2__1__Impl"


    // $ANTLR start "rule__Status__Group__0"
    // InternalMetaheres.g:2857:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2861:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalMetaheres.g:2862:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Status__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0"


    // $ANTLR start "rule__Status__Group__0__Impl"
    // InternalMetaheres.g:2869:1: rule__Status__Group__0__Impl : ( () ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2873:1: ( ( () ) )
            // InternalMetaheres.g:2874:1: ( () )
            {
            // InternalMetaheres.g:2874:1: ( () )
            // InternalMetaheres.g:2875:2: ()
            {
             before(grammarAccess.getStatusAccess().getStatusAction_0()); 
            // InternalMetaheres.g:2876:2: ()
            // InternalMetaheres.g:2876:3: 
            {
            }

             after(grammarAccess.getStatusAccess().getStatusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0__Impl"


    // $ANTLR start "rule__Status__Group__1"
    // InternalMetaheres.g:2884:1: rule__Status__Group__1 : rule__Status__Group__1__Impl ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2888:1: ( rule__Status__Group__1__Impl )
            // InternalMetaheres.g:2889:2: rule__Status__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__1"


    // $ANTLR start "rule__Status__Group__1__Impl"
    // InternalMetaheres.g:2895:1: rule__Status__Group__1__Impl : ( ( rule__Status__NameAssignment_1 ) ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2899:1: ( ( ( rule__Status__NameAssignment_1 ) ) )
            // InternalMetaheres.g:2900:1: ( ( rule__Status__NameAssignment_1 ) )
            {
            // InternalMetaheres.g:2900:1: ( ( rule__Status__NameAssignment_1 ) )
            // InternalMetaheres.g:2901:2: ( rule__Status__NameAssignment_1 )
            {
             before(grammarAccess.getStatusAccess().getNameAssignment_1()); 
            // InternalMetaheres.g:2902:2: ( rule__Status__NameAssignment_1 )
            // InternalMetaheres.g:2902:3: rule__Status__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Status__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__1__Impl"


    // $ANTLR start "rule__ServiceName__NameAssignment_0"
    // InternalMetaheres.g:2911:1: rule__ServiceName__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ServiceName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2915:1: ( ( ruleEString ) )
            // InternalMetaheres.g:2916:2: ( ruleEString )
            {
            // InternalMetaheres.g:2916:2: ( ruleEString )
            // InternalMetaheres.g:2917:3: ruleEString
            {
             before(grammarAccess.getServiceNameAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceNameAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__NameAssignment_0"


    // $ANTLR start "rule__ServiceName__ServiceconfigAssignment_2"
    // InternalMetaheres.g:2926:1: rule__ServiceName__ServiceconfigAssignment_2 : ( ruleServiceConfig ) ;
    public final void rule__ServiceName__ServiceconfigAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2930:1: ( ( ruleServiceConfig ) )
            // InternalMetaheres.g:2931:2: ( ruleServiceConfig )
            {
            // InternalMetaheres.g:2931:2: ( ruleServiceConfig )
            // InternalMetaheres.g:2932:3: ruleServiceConfig
            {
             before(grammarAccess.getServiceNameAccess().getServiceconfigServiceConfigParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConfig();

            state._fsp--;

             after(grammarAccess.getServiceNameAccess().getServiceconfigServiceConfigParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceName__ServiceconfigAssignment_2"


    // $ANTLR start "rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0"
    // InternalMetaheres.g:2941:1: rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 : ( ( 'ferme-les-jours-feries' ) ) ;
    public final void rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2945:1: ( ( ( 'ferme-les-jours-feries' ) ) )
            // InternalMetaheres.g:2946:2: ( ( 'ferme-les-jours-feries' ) )
            {
            // InternalMetaheres.g:2946:2: ( ( 'ferme-les-jours-feries' ) )
            // InternalMetaheres.g:2947:3: ( 'ferme-les-jours-feries' )
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysFermeLesJoursFeriesKeyword_0_0()); 
            // InternalMetaheres.g:2948:3: ( 'ferme-les-jours-feries' )
            // InternalMetaheres.g:2949:4: 'ferme-les-jours-feries'
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysFermeLesJoursFeriesKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysFermeLesJoursFeriesKeyword_0_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysFermeLesJoursFeriesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0"


    // $ANTLR start "rule__ServiceConfig__InventoryIsPublicAssignment_1"
    // InternalMetaheres.g:2960:1: rule__ServiceConfig__InventoryIsPublicAssignment_1 : ( ( 'inventaire-public' ) ) ;
    public final void rule__ServiceConfig__InventoryIsPublicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2964:1: ( ( ( 'inventaire-public' ) ) )
            // InternalMetaheres.g:2965:2: ( ( 'inventaire-public' ) )
            {
            // InternalMetaheres.g:2965:2: ( ( 'inventaire-public' ) )
            // InternalMetaheres.g:2966:3: ( 'inventaire-public' )
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventairePublicKeyword_1_0()); 
            // InternalMetaheres.g:2967:3: ( 'inventaire-public' )
            // InternalMetaheres.g:2968:4: 'inventaire-public'
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventairePublicKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventairePublicKeyword_1_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventairePublicKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__InventoryIsPublicAssignment_1"


    // $ANTLR start "rule__ServiceConfig__HasChartAssignment_2"
    // InternalMetaheres.g:2979:1: rule__ServiceConfig__HasChartAssignment_2 : ( ( 'charte-d-utilisation-visible' ) ) ;
    public final void rule__ServiceConfig__HasChartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:2983:1: ( ( ( 'charte-d-utilisation-visible' ) ) )
            // InternalMetaheres.g:2984:2: ( ( 'charte-d-utilisation-visible' ) )
            {
            // InternalMetaheres.g:2984:2: ( ( 'charte-d-utilisation-visible' ) )
            // InternalMetaheres.g:2985:3: ( 'charte-d-utilisation-visible' )
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartCharteDUtilisationVisibleKeyword_2_0()); 
            // InternalMetaheres.g:2986:3: ( 'charte-d-utilisation-visible' )
            // InternalMetaheres.g:2987:4: 'charte-d-utilisation-visible'
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartCharteDUtilisationVisibleKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getHasChartCharteDUtilisationVisibleKeyword_2_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getHasChartCharteDUtilisationVisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__HasChartAssignment_2"


    // $ANTLR start "rule__ServiceConfig__CountInBusinessDaysAssignment_3"
    // InternalMetaheres.g:2998:1: rule__ServiceConfig__CountInBusinessDaysAssignment_3 : ( ( 'compte-en-jours-ouvrables' ) ) ;
    public final void rule__ServiceConfig__CountInBusinessDaysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3002:1: ( ( ( 'compte-en-jours-ouvrables' ) ) )
            // InternalMetaheres.g:3003:2: ( ( 'compte-en-jours-ouvrables' ) )
            {
            // InternalMetaheres.g:3003:2: ( ( 'compte-en-jours-ouvrables' ) )
            // InternalMetaheres.g:3004:3: ( 'compte-en-jours-ouvrables' )
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCompteEnJoursOuvrablesKeyword_3_0()); 
            // InternalMetaheres.g:3005:3: ( 'compte-en-jours-ouvrables' )
            // InternalMetaheres.g:3006:4: 'compte-en-jours-ouvrables'
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCompteEnJoursOuvrablesKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCompteEnJoursOuvrablesKeyword_3_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCompteEnJoursOuvrablesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__CountInBusinessDaysAssignment_3"


    // $ANTLR start "rule__ServiceConfig__CountryAssignment_6"
    // InternalMetaheres.g:3017:1: rule__ServiceConfig__CountryAssignment_6 : ( ruleCountry ) ;
    public final void rule__ServiceConfig__CountryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3021:1: ( ( ruleCountry ) )
            // InternalMetaheres.g:3022:2: ( ruleCountry )
            {
            // InternalMetaheres.g:3022:2: ( ruleCountry )
            // InternalMetaheres.g:3023:3: ruleCountry
            {
             before(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__CountryAssignment_6"


    // $ANTLR start "rule__ServiceConfig__CountryAssignment_7_1"
    // InternalMetaheres.g:3032:1: rule__ServiceConfig__CountryAssignment_7_1 : ( ruleCountry ) ;
    public final void rule__ServiceConfig__CountryAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3036:1: ( ( ruleCountry ) )
            // InternalMetaheres.g:3037:2: ( ruleCountry )
            {
            // InternalMetaheres.g:3037:2: ( ruleCountry )
            // InternalMetaheres.g:3038:3: ruleCountry
            {
             before(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getCountryCountryParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__CountryAssignment_7_1"


    // $ANTLR start "rule__ServiceConfig__PricingsystemAssignment_8_3"
    // InternalMetaheres.g:3047:1: rule__ServiceConfig__PricingsystemAssignment_8_3 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConfig__PricingsystemAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3051:1: ( ( ( ruleEString ) ) )
            // InternalMetaheres.g:3052:2: ( ( ruleEString ) )
            {
            // InternalMetaheres.g:3052:2: ( ( ruleEString ) )
            // InternalMetaheres.g:3053:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_3_0()); 
            // InternalMetaheres.g:3054:3: ( ruleEString )
            // InternalMetaheres.g:3055:4: ruleEString
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_3_0_1()); 

            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__PricingsystemAssignment_8_3"


    // $ANTLR start "rule__ServiceConfig__PricingsystemAssignment_8_4_1"
    // InternalMetaheres.g:3066:1: rule__ServiceConfig__PricingsystemAssignment_8_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConfig__PricingsystemAssignment_8_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3070:1: ( ( ( ruleEString ) ) )
            // InternalMetaheres.g:3071:2: ( ( ruleEString ) )
            {
            // InternalMetaheres.g:3071:2: ( ( ruleEString ) )
            // InternalMetaheres.g:3072:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_4_1_0()); 
            // InternalMetaheres.g:3073:3: ( ruleEString )
            // InternalMetaheres.g:3074:4: ruleEString
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_4_1_0_1()); 

            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__PricingsystemAssignment_8_4_1"


    // $ANTLR start "rule__ServiceConfig__LanguageAssignment_13"
    // InternalMetaheres.g:3085:1: rule__ServiceConfig__LanguageAssignment_13 : ( ruleLanguage ) ;
    public final void rule__ServiceConfig__LanguageAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3089:1: ( ( ruleLanguage ) )
            // InternalMetaheres.g:3090:2: ( ruleLanguage )
            {
            // InternalMetaheres.g:3090:2: ( ruleLanguage )
            // InternalMetaheres.g:3091:3: ruleLanguage
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__LanguageAssignment_13"


    // $ANTLR start "rule__ServiceConfig__LanguageAssignment_14_1"
    // InternalMetaheres.g:3100:1: rule__ServiceConfig__LanguageAssignment_14_1 : ( ruleLanguage ) ;
    public final void rule__ServiceConfig__LanguageAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3104:1: ( ( ruleLanguage ) )
            // InternalMetaheres.g:3105:2: ( ruleLanguage )
            {
            // InternalMetaheres.g:3105:2: ( ruleLanguage )
            // InternalMetaheres.g:3106:3: ruleLanguage
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__LanguageAssignment_14_1"


    // $ANTLR start "rule__ServiceConfig__ReservationsconfigAssignment_18"
    // InternalMetaheres.g:3115:1: rule__ServiceConfig__ReservationsconfigAssignment_18 : ( ruleReservationsConfig ) ;
    public final void rule__ServiceConfig__ReservationsconfigAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3119:1: ( ( ruleReservationsConfig ) )
            // InternalMetaheres.g:3120:2: ( ruleReservationsConfig )
            {
            // InternalMetaheres.g:3120:2: ( ruleReservationsConfig )
            // InternalMetaheres.g:3121:3: ruleReservationsConfig
            {
             before(grammarAccess.getServiceConfigAccess().getReservationsconfigReservationsConfigParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleReservationsConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getReservationsconfigReservationsConfigParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__ReservationsconfigAssignment_18"


    // $ANTLR start "rule__ServiceConfig__ResourcesconfigAssignment_21"
    // InternalMetaheres.g:3130:1: rule__ServiceConfig__ResourcesconfigAssignment_21 : ( ruleResourcesConfig ) ;
    public final void rule__ServiceConfig__ResourcesconfigAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3134:1: ( ( ruleResourcesConfig ) )
            // InternalMetaheres.g:3135:2: ( ruleResourcesConfig )
            {
            // InternalMetaheres.g:3135:2: ( ruleResourcesConfig )
            // InternalMetaheres.g:3136:3: ruleResourcesConfig
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleResourcesConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__ResourcesconfigAssignment_21"


    // $ANTLR start "rule__ServiceConfig__ResourcesconfigAssignment_22_1"
    // InternalMetaheres.g:3145:1: rule__ServiceConfig__ResourcesconfigAssignment_22_1 : ( ruleResourcesConfig ) ;
    public final void rule__ServiceConfig__ResourcesconfigAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3149:1: ( ( ruleResourcesConfig ) )
            // InternalMetaheres.g:3150:2: ( ruleResourcesConfig )
            {
            // InternalMetaheres.g:3150:2: ( ruleResourcesConfig )
            // InternalMetaheres.g:3151:3: ruleResourcesConfig
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_22_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourcesConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__ResourcesconfigAssignment_22_1"


    // $ANTLR start "rule__ServiceConfig__LotsconfigAssignment_23_2"
    // InternalMetaheres.g:3160:1: rule__ServiceConfig__LotsconfigAssignment_23_2 : ( ruleLotsConfig ) ;
    public final void rule__ServiceConfig__LotsconfigAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3164:1: ( ( ruleLotsConfig ) )
            // InternalMetaheres.g:3165:2: ( ruleLotsConfig )
            {
            // InternalMetaheres.g:3165:2: ( ruleLotsConfig )
            // InternalMetaheres.g:3166:3: ruleLotsConfig
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigLotsConfigParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLotsConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLotsconfigLotsConfigParserRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__LotsconfigAssignment_23_2"


    // $ANTLR start "rule__Language__NameAssignment_1"
    // InternalMetaheres.g:3175:1: rule__Language__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3179:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3180:2: ( ruleEString )
            {
            // InternalMetaheres.g:3180:2: ( ruleEString )
            // InternalMetaheres.g:3181:3: ruleEString
            {
             before(grammarAccess.getLanguageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__NameAssignment_1"


    // $ANTLR start "rule__ReservationsConfig__HasMoveOutCheckAssignment_0"
    // InternalMetaheres.g:3190:1: rule__ReservationsConfig__HasMoveOutCheckAssignment_0 : ( ( 'etat-des-lieux-sortie' ) ) ;
    public final void rule__ReservationsConfig__HasMoveOutCheckAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3194:1: ( ( ( 'etat-des-lieux-sortie' ) ) )
            // InternalMetaheres.g:3195:2: ( ( 'etat-des-lieux-sortie' ) )
            {
            // InternalMetaheres.g:3195:2: ( ( 'etat-des-lieux-sortie' ) )
            // InternalMetaheres.g:3196:3: ( 'etat-des-lieux-sortie' )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckEtatDesLieuxSortieKeyword_0_0()); 
            // InternalMetaheres.g:3197:3: ( 'etat-des-lieux-sortie' )
            // InternalMetaheres.g:3198:4: 'etat-des-lieux-sortie'
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckEtatDesLieuxSortieKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckEtatDesLieuxSortieKeyword_0_0()); 

            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckEtatDesLieuxSortieKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__HasMoveOutCheckAssignment_0"


    // $ANTLR start "rule__ReservationsConfig__HasMoveInCheckAssignment_1"
    // InternalMetaheres.g:3209:1: rule__ReservationsConfig__HasMoveInCheckAssignment_1 : ( ( 'etat-des-lieux-retour' ) ) ;
    public final void rule__ReservationsConfig__HasMoveInCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3213:1: ( ( ( 'etat-des-lieux-retour' ) ) )
            // InternalMetaheres.g:3214:2: ( ( 'etat-des-lieux-retour' ) )
            {
            // InternalMetaheres.g:3214:2: ( ( 'etat-des-lieux-retour' ) )
            // InternalMetaheres.g:3215:3: ( 'etat-des-lieux-retour' )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckEtatDesLieuxRetourKeyword_1_0()); 
            // InternalMetaheres.g:3216:3: ( 'etat-des-lieux-retour' )
            // InternalMetaheres.g:3217:4: 'etat-des-lieux-retour'
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckEtatDesLieuxRetourKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckEtatDesLieuxRetourKeyword_1_0()); 

            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckEtatDesLieuxRetourKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__HasMoveInCheckAssignment_1"


    // $ANTLR start "rule__ReservationsConfig__MinRequestAdvanceAssignment_4"
    // InternalMetaheres.g:3228:1: rule__ReservationsConfig__MinRequestAdvanceAssignment_4 : ( ruleEInt ) ;
    public final void rule__ReservationsConfig__MinRequestAdvanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3232:1: ( ( ruleEInt ) )
            // InternalMetaheres.g:3233:2: ( ruleEInt )
            {
            // InternalMetaheres.g:3233:2: ( ruleEInt )
            // InternalMetaheres.g:3234:3: ruleEInt
            {
             before(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__MinRequestAdvanceAssignment_4"


    // $ANTLR start "rule__ReservationsConfig__MaxRequestAdvanceAssignment_6"
    // InternalMetaheres.g:3243:1: rule__ReservationsConfig__MaxRequestAdvanceAssignment_6 : ( ruleEInt ) ;
    public final void rule__ReservationsConfig__MaxRequestAdvanceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3247:1: ( ( ruleEInt ) )
            // InternalMetaheres.g:3248:2: ( ruleEInt )
            {
            // InternalMetaheres.g:3248:2: ( ruleEInt )
            // InternalMetaheres.g:3249:3: ruleEInt
            {
             before(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__MaxRequestAdvanceAssignment_6"


    // $ANTLR start "rule__ReservationsConfig__StatuslistAssignment_9"
    // InternalMetaheres.g:3258:1: rule__ReservationsConfig__StatuslistAssignment_9 : ( ruleStatusList ) ;
    public final void rule__ReservationsConfig__StatuslistAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3262:1: ( ( ruleStatusList ) )
            // InternalMetaheres.g:3263:2: ( ruleStatusList )
            {
            // InternalMetaheres.g:3263:2: ( ruleStatusList )
            // InternalMetaheres.g:3264:3: ruleStatusList
            {
             before(grammarAccess.getReservationsConfigAccess().getStatuslistStatusListParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStatusList();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getStatuslistStatusListParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReservationsConfig__StatuslistAssignment_9"


    // $ANTLR start "rule__Country__NameAssignment_0"
    // InternalMetaheres.g:3273:1: rule__Country__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Country__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3277:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3278:2: ( ruleEString )
            {
            // InternalMetaheres.g:3278:2: ( ruleEString )
            // InternalMetaheres.g:3279:3: ruleEString
            {
             before(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__NameAssignment_0"


    // $ANTLR start "rule__Country__LanguageAssignment_2"
    // InternalMetaheres.g:3288:1: rule__Country__LanguageAssignment_2 : ( ruleLanguage ) ;
    public final void rule__Country__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3292:1: ( ( ruleLanguage ) )
            // InternalMetaheres.g:3293:2: ( ruleLanguage )
            {
            // InternalMetaheres.g:3293:2: ( ruleLanguage )
            // InternalMetaheres.g:3294:3: ruleLanguage
            {
             before(grammarAccess.getCountryAccess().getLanguageLanguageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getCountryAccess().getLanguageLanguageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__LanguageAssignment_2"


    // $ANTLR start "rule__Country__PricingsystemAssignment_6"
    // InternalMetaheres.g:3303:1: rule__Country__PricingsystemAssignment_6 : ( rulePricingSystem ) ;
    public final void rule__Country__PricingsystemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3307:1: ( ( rulePricingSystem ) )
            // InternalMetaheres.g:3308:2: ( rulePricingSystem )
            {
            // InternalMetaheres.g:3308:2: ( rulePricingSystem )
            // InternalMetaheres.g:3309:3: rulePricingSystem
            {
             before(grammarAccess.getCountryAccess().getPricingsystemPricingSystemParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePricingSystem();

            state._fsp--;

             after(grammarAccess.getCountryAccess().getPricingsystemPricingSystemParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__PricingsystemAssignment_6"


    // $ANTLR start "rule__ResourcesConfig__HasImageAssignment_1"
    // InternalMetaheres.g:3318:1: rule__ResourcesConfig__HasImageAssignment_1 : ( ( 'avec-illustration' ) ) ;
    public final void rule__ResourcesConfig__HasImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3322:1: ( ( ( 'avec-illustration' ) ) )
            // InternalMetaheres.g:3323:2: ( ( 'avec-illustration' ) )
            {
            // InternalMetaheres.g:3323:2: ( ( 'avec-illustration' ) )
            // InternalMetaheres.g:3324:3: ( 'avec-illustration' )
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageAvecIllustrationKeyword_1_0()); 
            // InternalMetaheres.g:3325:3: ( 'avec-illustration' )
            // InternalMetaheres.g:3326:4: 'avec-illustration'
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageAvecIllustrationKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getHasImageAvecIllustrationKeyword_1_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getHasImageAvecIllustrationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__HasImageAssignment_1"


    // $ANTLR start "rule__ResourcesConfig__HasOneStockPerSlotAssignment_2"
    // InternalMetaheres.g:3337:1: rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 : ( ( 'un-stock-par-ouverture' ) ) ;
    public final void rule__ResourcesConfig__HasOneStockPerSlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3341:1: ( ( ( 'un-stock-par-ouverture' ) ) )
            // InternalMetaheres.g:3342:2: ( ( 'un-stock-par-ouverture' ) )
            {
            // InternalMetaheres.g:3342:2: ( ( 'un-stock-par-ouverture' ) )
            // InternalMetaheres.g:3343:3: ( 'un-stock-par-ouverture' )
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_2_0()); 
            // InternalMetaheres.g:3344:3: ( 'un-stock-par-ouverture' )
            // InternalMetaheres.g:3345:4: 'un-stock-par-ouverture'
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_2_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__HasOneStockPerSlotAssignment_2"


    // $ANTLR start "rule__ResourcesConfig__IsConsumableAssignment_3"
    // InternalMetaheres.g:3356:1: rule__ResourcesConfig__IsConsumableAssignment_3 : ( ( 'type-consommable' ) ) ;
    public final void rule__ResourcesConfig__IsConsumableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3360:1: ( ( ( 'type-consommable' ) ) )
            // InternalMetaheres.g:3361:2: ( ( 'type-consommable' ) )
            {
            // InternalMetaheres.g:3361:2: ( ( 'type-consommable' ) )
            // InternalMetaheres.g:3362:3: ( 'type-consommable' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableTypeConsommableKeyword_3_0()); 
            // InternalMetaheres.g:3363:3: ( 'type-consommable' )
            // InternalMetaheres.g:3364:4: 'type-consommable'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableTypeConsommableKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsConsumableTypeConsommableKeyword_3_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsConsumableTypeConsommableKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__IsConsumableAssignment_3"


    // $ANTLR start "rule__ResourcesConfig__IsLoanAssignment_4"
    // InternalMetaheres.g:3375:1: rule__ResourcesConfig__IsLoanAssignment_4 : ( ( 'emprunt-avec-retour' ) ) ;
    public final void rule__ResourcesConfig__IsLoanAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3379:1: ( ( ( 'emprunt-avec-retour' ) ) )
            // InternalMetaheres.g:3380:2: ( ( 'emprunt-avec-retour' ) )
            {
            // InternalMetaheres.g:3380:2: ( ( 'emprunt-avec-retour' ) )
            // InternalMetaheres.g:3381:3: ( 'emprunt-avec-retour' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanEmpruntAvecRetourKeyword_4_0()); 
            // InternalMetaheres.g:3382:3: ( 'emprunt-avec-retour' )
            // InternalMetaheres.g:3383:4: 'emprunt-avec-retour'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanEmpruntAvecRetourKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsLoanEmpruntAvecRetourKeyword_4_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsLoanEmpruntAvecRetourKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__IsLoanAssignment_4"


    // $ANTLR start "rule__ResourcesConfig__IsChargedAssignment_5"
    // InternalMetaheres.g:3394:1: rule__ResourcesConfig__IsChargedAssignment_5 : ( ( 'payant' ) ) ;
    public final void rule__ResourcesConfig__IsChargedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3398:1: ( ( ( 'payant' ) ) )
            // InternalMetaheres.g:3399:2: ( ( 'payant' ) )
            {
            // InternalMetaheres.g:3399:2: ( ( 'payant' ) )
            // InternalMetaheres.g:3400:3: ( 'payant' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedPayantKeyword_5_0()); 
            // InternalMetaheres.g:3401:3: ( 'payant' )
            // InternalMetaheres.g:3402:4: 'payant'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedPayantKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsChargedPayantKeyword_5_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsChargedPayantKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourcesConfig__IsChargedAssignment_5"


    // $ANTLR start "rule__LotsConfig__HasImageAssignment_2"
    // InternalMetaheres.g:3413:1: rule__LotsConfig__HasImageAssignment_2 : ( ( 'avec-illustration' ) ) ;
    public final void rule__LotsConfig__HasImageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3417:1: ( ( ( 'avec-illustration' ) ) )
            // InternalMetaheres.g:3418:2: ( ( 'avec-illustration' ) )
            {
            // InternalMetaheres.g:3418:2: ( ( 'avec-illustration' ) )
            // InternalMetaheres.g:3419:3: ( 'avec-illustration' )
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageAvecIllustrationKeyword_2_0()); 
            // InternalMetaheres.g:3420:3: ( 'avec-illustration' )
            // InternalMetaheres.g:3421:4: 'avec-illustration'
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageAvecIllustrationKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getHasImageAvecIllustrationKeyword_2_0()); 

            }

             after(grammarAccess.getLotsConfigAccess().getHasImageAvecIllustrationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__HasImageAssignment_2"


    // $ANTLR start "rule__LotsConfig__HasOneStockPerSlotAssignment_3"
    // InternalMetaheres.g:3432:1: rule__LotsConfig__HasOneStockPerSlotAssignment_3 : ( ( 'un-stock-par-ouverture' ) ) ;
    public final void rule__LotsConfig__HasOneStockPerSlotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3436:1: ( ( ( 'un-stock-par-ouverture' ) ) )
            // InternalMetaheres.g:3437:2: ( ( 'un-stock-par-ouverture' ) )
            {
            // InternalMetaheres.g:3437:2: ( ( 'un-stock-par-ouverture' ) )
            // InternalMetaheres.g:3438:3: ( 'un-stock-par-ouverture' )
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_3_0()); 
            // InternalMetaheres.g:3439:3: ( 'un-stock-par-ouverture' )
            // InternalMetaheres.g:3440:4: 'un-stock-par-ouverture'
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_3_0()); 

            }

             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotUnStockParOuvertureKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LotsConfig__HasOneStockPerSlotAssignment_3"


    // $ANTLR start "rule__PricingSystem__NameAssignment_0"
    // InternalMetaheres.g:3451:1: rule__PricingSystem__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__PricingSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3455:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3456:2: ( ruleEString )
            {
            // InternalMetaheres.g:3456:2: ( ruleEString )
            // InternalMetaheres.g:3457:3: ruleEString
            {
             before(grammarAccess.getPricingSystemAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPricingSystemAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__NameAssignment_0"


    // $ANTLR start "rule__PricingSystem__CurrencyAssignment_4"
    // InternalMetaheres.g:3466:1: rule__PricingSystem__CurrencyAssignment_4 : ( ruleEString ) ;
    public final void rule__PricingSystem__CurrencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3470:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3471:2: ( ruleEString )
            {
            // InternalMetaheres.g:3471:2: ( ruleEString )
            // InternalMetaheres.g:3472:3: ruleEString
            {
             before(grammarAccess.getPricingSystemAccess().getCurrencyEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPricingSystemAccess().getCurrencyEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__CurrencyAssignment_4"


    // $ANTLR start "rule__PricingSystem__TaxSystemAssignment_8"
    // InternalMetaheres.g:3481:1: rule__PricingSystem__TaxSystemAssignment_8 : ( ruleEString ) ;
    public final void rule__PricingSystem__TaxSystemAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3485:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3486:2: ( ruleEString )
            {
            // InternalMetaheres.g:3486:2: ( ruleEString )
            // InternalMetaheres.g:3487:3: ruleEString
            {
             before(grammarAccess.getPricingSystemAccess().getTaxSystemEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPricingSystemAccess().getTaxSystemEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PricingSystem__TaxSystemAssignment_8"


    // $ANTLR start "rule__StatusList__StatusAssignment_1"
    // InternalMetaheres.g:3496:1: rule__StatusList__StatusAssignment_1 : ( ruleStatus ) ;
    public final void rule__StatusList__StatusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3500:1: ( ( ruleStatus ) )
            // InternalMetaheres.g:3501:2: ( ruleStatus )
            {
            // InternalMetaheres.g:3501:2: ( ruleStatus )
            // InternalMetaheres.g:3502:3: ruleStatus
            {
             before(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__StatusAssignment_1"


    // $ANTLR start "rule__StatusList__StatusAssignment_2_1"
    // InternalMetaheres.g:3511:1: rule__StatusList__StatusAssignment_2_1 : ( ruleStatus ) ;
    public final void rule__StatusList__StatusAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3515:1: ( ( ruleStatus ) )
            // InternalMetaheres.g:3516:2: ( ruleStatus )
            {
            // InternalMetaheres.g:3516:2: ( ruleStatus )
            // InternalMetaheres.g:3517:3: ruleStatus
            {
             before(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusListAccess().getStatusStatusParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatusList__StatusAssignment_2_1"


    // $ANTLR start "rule__Status__NameAssignment_1"
    // InternalMetaheres.g:3526:1: rule__Status__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Status__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaheres.g:3530:1: ( ( ruleEString ) )
            // InternalMetaheres.g:3531:2: ( ruleEString )
            {
            // InternalMetaheres.g:3531:2: ( ruleEString )
            // InternalMetaheres.g:3532:3: ruleEString
            {
             before(grammarAccess.getStatusAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatusAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000078001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003E00002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});

}