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
import mde.pauline.metaheres.services.MyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'country'", "'lang'", "'reservationsconfig'", "'resourcesconfig'", "','", "'pricingsystem'", "'lotsconfig'", "'minRequestAdvance'", "'maxRequestAdvance'", "'statuslist'", "'pricing'", "'('", "')'", "'currency'", "'taxSystem'", "'-'", "'closesOnPublicHolidays'", "'inventoryIsPublic'", "'hasChart'", "'countInBusinessDays'", "'hasMoveOutCheck'", "'hasMoveInCheck'", "'hasImage'", "'hasOneStockPerSlot'", "'isConsumable'", "'isLoan'", "'isCharged'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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


        public InternalMyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMy.g"; }


    	private MyGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSServiceName"
    // InternalMy.g:53:1: entryRuleSServiceName : ruleSServiceName EOF ;
    public final void entryRuleSServiceName() throws RecognitionException {
        try {
            // InternalMy.g:54:1: ( ruleSServiceName EOF )
            // InternalMy.g:55:1: ruleSServiceName EOF
            {
             before(grammarAccess.getSServiceNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSServiceName();

            state._fsp--;

             after(grammarAccess.getSServiceNameRule()); 
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
    // $ANTLR end "entryRuleSServiceName"


    // $ANTLR start "ruleSServiceName"
    // InternalMy.g:62:1: ruleSServiceName : ( ( rule__SServiceName__Group__0 ) ) ;
    public final void ruleSServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:66:2: ( ( ( rule__SServiceName__Group__0 ) ) )
            // InternalMy.g:67:2: ( ( rule__SServiceName__Group__0 ) )
            {
            // InternalMy.g:67:2: ( ( rule__SServiceName__Group__0 ) )
            // InternalMy.g:68:3: ( rule__SServiceName__Group__0 )
            {
             before(grammarAccess.getSServiceNameAccess().getGroup()); 
            // InternalMy.g:69:3: ( rule__SServiceName__Group__0 )
            // InternalMy.g:69:4: rule__SServiceName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SServiceName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSServiceNameAccess().getGroup()); 

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
    // $ANTLR end "ruleSServiceName"


    // $ANTLR start "entryRuleEString"
    // InternalMy.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMy.g:79:1: ( ruleEString EOF )
            // InternalMy.g:80:1: ruleEString EOF
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
    // InternalMy.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMy.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMy.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMy.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMy.g:94:3: ( rule__EString__Alternatives )
            // InternalMy.g:94:4: rule__EString__Alternatives
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
    // InternalMy.g:103:1: entryRuleServiceConfig : ruleServiceConfig EOF ;
    public final void entryRuleServiceConfig() throws RecognitionException {
        try {
            // InternalMy.g:104:1: ( ruleServiceConfig EOF )
            // InternalMy.g:105:1: ruleServiceConfig EOF
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
    // InternalMy.g:112:1: ruleServiceConfig : ( ( rule__ServiceConfig__Group__0 ) ) ;
    public final void ruleServiceConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:116:2: ( ( ( rule__ServiceConfig__Group__0 ) ) )
            // InternalMy.g:117:2: ( ( rule__ServiceConfig__Group__0 ) )
            {
            // InternalMy.g:117:2: ( ( rule__ServiceConfig__Group__0 ) )
            // InternalMy.g:118:3: ( rule__ServiceConfig__Group__0 )
            {
             before(grammarAccess.getServiceConfigAccess().getGroup()); 
            // InternalMy.g:119:3: ( rule__ServiceConfig__Group__0 )
            // InternalMy.g:119:4: rule__ServiceConfig__Group__0
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
    // InternalMy.g:128:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalMy.g:129:1: ( ruleLanguage EOF )
            // InternalMy.g:130:1: ruleLanguage EOF
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
    // InternalMy.g:137:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:141:2: ( ( ( rule__Language__Group__0 ) ) )
            // InternalMy.g:142:2: ( ( rule__Language__Group__0 ) )
            {
            // InternalMy.g:142:2: ( ( rule__Language__Group__0 ) )
            // InternalMy.g:143:3: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // InternalMy.g:144:3: ( rule__Language__Group__0 )
            // InternalMy.g:144:4: rule__Language__Group__0
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
    // InternalMy.g:153:1: entryRuleReservationsConfig : ruleReservationsConfig EOF ;
    public final void entryRuleReservationsConfig() throws RecognitionException {
        try {
            // InternalMy.g:154:1: ( ruleReservationsConfig EOF )
            // InternalMy.g:155:1: ruleReservationsConfig EOF
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
    // InternalMy.g:162:1: ruleReservationsConfig : ( ( rule__ReservationsConfig__Group__0 ) ) ;
    public final void ruleReservationsConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:166:2: ( ( ( rule__ReservationsConfig__Group__0 ) ) )
            // InternalMy.g:167:2: ( ( rule__ReservationsConfig__Group__0 ) )
            {
            // InternalMy.g:167:2: ( ( rule__ReservationsConfig__Group__0 ) )
            // InternalMy.g:168:3: ( rule__ReservationsConfig__Group__0 )
            {
             before(grammarAccess.getReservationsConfigAccess().getGroup()); 
            // InternalMy.g:169:3: ( rule__ReservationsConfig__Group__0 )
            // InternalMy.g:169:4: rule__ReservationsConfig__Group__0
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
    // InternalMy.g:178:1: entryRuleCountry : ruleCountry EOF ;
    public final void entryRuleCountry() throws RecognitionException {
        try {
            // InternalMy.g:179:1: ( ruleCountry EOF )
            // InternalMy.g:180:1: ruleCountry EOF
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
    // InternalMy.g:187:1: ruleCountry : ( ( rule__Country__Group__0 ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:191:2: ( ( ( rule__Country__Group__0 ) ) )
            // InternalMy.g:192:2: ( ( rule__Country__Group__0 ) )
            {
            // InternalMy.g:192:2: ( ( rule__Country__Group__0 ) )
            // InternalMy.g:193:3: ( rule__Country__Group__0 )
            {
             before(grammarAccess.getCountryAccess().getGroup()); 
            // InternalMy.g:194:3: ( rule__Country__Group__0 )
            // InternalMy.g:194:4: rule__Country__Group__0
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
    // InternalMy.g:203:1: entryRuleResourcesConfig : ruleResourcesConfig EOF ;
    public final void entryRuleResourcesConfig() throws RecognitionException {
        try {
            // InternalMy.g:204:1: ( ruleResourcesConfig EOF )
            // InternalMy.g:205:1: ruleResourcesConfig EOF
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
    // InternalMy.g:212:1: ruleResourcesConfig : ( ( rule__ResourcesConfig__Group__0 ) ) ;
    public final void ruleResourcesConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:216:2: ( ( ( rule__ResourcesConfig__Group__0 ) ) )
            // InternalMy.g:217:2: ( ( rule__ResourcesConfig__Group__0 ) )
            {
            // InternalMy.g:217:2: ( ( rule__ResourcesConfig__Group__0 ) )
            // InternalMy.g:218:3: ( rule__ResourcesConfig__Group__0 )
            {
             before(grammarAccess.getResourcesConfigAccess().getGroup()); 
            // InternalMy.g:219:3: ( rule__ResourcesConfig__Group__0 )
            // InternalMy.g:219:4: rule__ResourcesConfig__Group__0
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
    // InternalMy.g:228:1: entryRuleLotsConfig : ruleLotsConfig EOF ;
    public final void entryRuleLotsConfig() throws RecognitionException {
        try {
            // InternalMy.g:229:1: ( ruleLotsConfig EOF )
            // InternalMy.g:230:1: ruleLotsConfig EOF
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
    // InternalMy.g:237:1: ruleLotsConfig : ( ( rule__LotsConfig__Group__0 ) ) ;
    public final void ruleLotsConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:241:2: ( ( ( rule__LotsConfig__Group__0 ) ) )
            // InternalMy.g:242:2: ( ( rule__LotsConfig__Group__0 ) )
            {
            // InternalMy.g:242:2: ( ( rule__LotsConfig__Group__0 ) )
            // InternalMy.g:243:3: ( rule__LotsConfig__Group__0 )
            {
             before(grammarAccess.getLotsConfigAccess().getGroup()); 
            // InternalMy.g:244:3: ( rule__LotsConfig__Group__0 )
            // InternalMy.g:244:4: rule__LotsConfig__Group__0
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
    // InternalMy.g:253:1: entryRulePricingSystem : rulePricingSystem EOF ;
    public final void entryRulePricingSystem() throws RecognitionException {
        try {
            // InternalMy.g:254:1: ( rulePricingSystem EOF )
            // InternalMy.g:255:1: rulePricingSystem EOF
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
    // InternalMy.g:262:1: rulePricingSystem : ( ( rule__PricingSystem__Group__0 ) ) ;
    public final void rulePricingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:266:2: ( ( ( rule__PricingSystem__Group__0 ) ) )
            // InternalMy.g:267:2: ( ( rule__PricingSystem__Group__0 ) )
            {
            // InternalMy.g:267:2: ( ( rule__PricingSystem__Group__0 ) )
            // InternalMy.g:268:3: ( rule__PricingSystem__Group__0 )
            {
             before(grammarAccess.getPricingSystemAccess().getGroup()); 
            // InternalMy.g:269:3: ( rule__PricingSystem__Group__0 )
            // InternalMy.g:269:4: rule__PricingSystem__Group__0
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
    // InternalMy.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMy.g:279:1: ( ruleEInt EOF )
            // InternalMy.g:280:1: ruleEInt EOF
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
    // InternalMy.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMy.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMy.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalMy.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMy.g:294:3: ( rule__EInt__Group__0 )
            // InternalMy.g:294:4: rule__EInt__Group__0
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
    // InternalMy.g:303:1: entryRuleStatusList : ruleStatusList EOF ;
    public final void entryRuleStatusList() throws RecognitionException {
        try {
            // InternalMy.g:304:1: ( ruleStatusList EOF )
            // InternalMy.g:305:1: ruleStatusList EOF
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
    // InternalMy.g:312:1: ruleStatusList : ( ( rule__StatusList__Group__0 ) ) ;
    public final void ruleStatusList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:316:2: ( ( ( rule__StatusList__Group__0 ) ) )
            // InternalMy.g:317:2: ( ( rule__StatusList__Group__0 ) )
            {
            // InternalMy.g:317:2: ( ( rule__StatusList__Group__0 ) )
            // InternalMy.g:318:3: ( rule__StatusList__Group__0 )
            {
             before(grammarAccess.getStatusListAccess().getGroup()); 
            // InternalMy.g:319:3: ( rule__StatusList__Group__0 )
            // InternalMy.g:319:4: rule__StatusList__Group__0
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
    // InternalMy.g:328:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalMy.g:329:1: ( ruleStatus EOF )
            // InternalMy.g:330:1: ruleStatus EOF
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
    // InternalMy.g:337:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:341:2: ( ( ( rule__Status__Group__0 ) ) )
            // InternalMy.g:342:2: ( ( rule__Status__Group__0 ) )
            {
            // InternalMy.g:342:2: ( ( rule__Status__Group__0 ) )
            // InternalMy.g:343:3: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // InternalMy.g:344:3: ( rule__Status__Group__0 )
            // InternalMy.g:344:4: rule__Status__Group__0
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
    // InternalMy.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMy.g:357:2: ( RULE_STRING )
                    {
                    // InternalMy.g:357:2: ( RULE_STRING )
                    // InternalMy.g:358:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMy.g:363:2: ( RULE_ID )
                    {
                    // InternalMy.g:363:2: ( RULE_ID )
                    // InternalMy.g:364:3: RULE_ID
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


    // $ANTLR start "rule__SServiceName__Group__0"
    // InternalMy.g:373:1: rule__SServiceName__Group__0 : rule__SServiceName__Group__0__Impl rule__SServiceName__Group__1 ;
    public final void rule__SServiceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:377:1: ( rule__SServiceName__Group__0__Impl rule__SServiceName__Group__1 )
            // InternalMy.g:378:2: rule__SServiceName__Group__0__Impl rule__SServiceName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SServiceName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SServiceName__Group__1();

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
    // $ANTLR end "rule__SServiceName__Group__0"


    // $ANTLR start "rule__SServiceName__Group__0__Impl"
    // InternalMy.g:385:1: rule__SServiceName__Group__0__Impl : ( ( rule__SServiceName__NameAssignment_0 ) ) ;
    public final void rule__SServiceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:389:1: ( ( ( rule__SServiceName__NameAssignment_0 ) ) )
            // InternalMy.g:390:1: ( ( rule__SServiceName__NameAssignment_0 ) )
            {
            // InternalMy.g:390:1: ( ( rule__SServiceName__NameAssignment_0 ) )
            // InternalMy.g:391:2: ( rule__SServiceName__NameAssignment_0 )
            {
             before(grammarAccess.getSServiceNameAccess().getNameAssignment_0()); 
            // InternalMy.g:392:2: ( rule__SServiceName__NameAssignment_0 )
            // InternalMy.g:392:3: rule__SServiceName__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SServiceName__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSServiceNameAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SServiceName__Group__0__Impl"


    // $ANTLR start "rule__SServiceName__Group__1"
    // InternalMy.g:400:1: rule__SServiceName__Group__1 : rule__SServiceName__Group__1__Impl rule__SServiceName__Group__2 ;
    public final void rule__SServiceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:404:1: ( rule__SServiceName__Group__1__Impl rule__SServiceName__Group__2 )
            // InternalMy.g:405:2: rule__SServiceName__Group__1__Impl rule__SServiceName__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SServiceName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SServiceName__Group__2();

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
    // $ANTLR end "rule__SServiceName__Group__1"


    // $ANTLR start "rule__SServiceName__Group__1__Impl"
    // InternalMy.g:412:1: rule__SServiceName__Group__1__Impl : ( ':' ) ;
    public final void rule__SServiceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:416:1: ( ( ':' ) )
            // InternalMy.g:417:1: ( ':' )
            {
            // InternalMy.g:417:1: ( ':' )
            // InternalMy.g:418:2: ':'
            {
             before(grammarAccess.getSServiceNameAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSServiceNameAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__SServiceName__Group__1__Impl"


    // $ANTLR start "rule__SServiceName__Group__2"
    // InternalMy.g:427:1: rule__SServiceName__Group__2 : rule__SServiceName__Group__2__Impl ;
    public final void rule__SServiceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:431:1: ( rule__SServiceName__Group__2__Impl )
            // InternalMy.g:432:2: rule__SServiceName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SServiceName__Group__2__Impl();

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
    // $ANTLR end "rule__SServiceName__Group__2"


    // $ANTLR start "rule__SServiceName__Group__2__Impl"
    // InternalMy.g:438:1: rule__SServiceName__Group__2__Impl : ( ( rule__SServiceName__ServiceconfigAssignment_2 ) ) ;
    public final void rule__SServiceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:442:1: ( ( ( rule__SServiceName__ServiceconfigAssignment_2 ) ) )
            // InternalMy.g:443:1: ( ( rule__SServiceName__ServiceconfigAssignment_2 ) )
            {
            // InternalMy.g:443:1: ( ( rule__SServiceName__ServiceconfigAssignment_2 ) )
            // InternalMy.g:444:2: ( rule__SServiceName__ServiceconfigAssignment_2 )
            {
             before(grammarAccess.getSServiceNameAccess().getServiceconfigAssignment_2()); 
            // InternalMy.g:445:2: ( rule__SServiceName__ServiceconfigAssignment_2 )
            // InternalMy.g:445:3: rule__SServiceName__ServiceconfigAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SServiceName__ServiceconfigAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSServiceNameAccess().getServiceconfigAssignment_2()); 

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
    // $ANTLR end "rule__SServiceName__Group__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__0"
    // InternalMy.g:454:1: rule__ServiceConfig__Group__0 : rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 ;
    public final void rule__ServiceConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:458:1: ( rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 )
            // InternalMy.g:459:2: rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1
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
    // InternalMy.g:466:1: rule__ServiceConfig__Group__0__Impl : ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? ) ;
    public final void rule__ServiceConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:470:1: ( ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? ) )
            // InternalMy.g:471:1: ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? )
            {
            // InternalMy.g:471:1: ( ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )? )
            // InternalMy.g:472:2: ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysAssignment_0()); 
            // InternalMy.g:473:2: ( rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMy.g:473:3: rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0
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
    // InternalMy.g:481:1: rule__ServiceConfig__Group__1 : rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 ;
    public final void rule__ServiceConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:485:1: ( rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 )
            // InternalMy.g:486:2: rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2
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
    // InternalMy.g:493:1: rule__ServiceConfig__Group__1__Impl : ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? ) ;
    public final void rule__ServiceConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:497:1: ( ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? ) )
            // InternalMy.g:498:1: ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? )
            {
            // InternalMy.g:498:1: ( ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )? )
            // InternalMy.g:499:2: ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )?
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicAssignment_1()); 
            // InternalMy.g:500:2: ( rule__ServiceConfig__InventoryIsPublicAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMy.g:500:3: rule__ServiceConfig__InventoryIsPublicAssignment_1
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
    // InternalMy.g:508:1: rule__ServiceConfig__Group__2 : rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 ;
    public final void rule__ServiceConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:512:1: ( rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 )
            // InternalMy.g:513:2: rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3
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
    // InternalMy.g:520:1: rule__ServiceConfig__Group__2__Impl : ( ( rule__ServiceConfig__HasChartAssignment_2 )? ) ;
    public final void rule__ServiceConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:524:1: ( ( ( rule__ServiceConfig__HasChartAssignment_2 )? ) )
            // InternalMy.g:525:1: ( ( rule__ServiceConfig__HasChartAssignment_2 )? )
            {
            // InternalMy.g:525:1: ( ( rule__ServiceConfig__HasChartAssignment_2 )? )
            // InternalMy.g:526:2: ( rule__ServiceConfig__HasChartAssignment_2 )?
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartAssignment_2()); 
            // InternalMy.g:527:2: ( rule__ServiceConfig__HasChartAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMy.g:527:3: rule__ServiceConfig__HasChartAssignment_2
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
    // InternalMy.g:535:1: rule__ServiceConfig__Group__3 : rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4 ;
    public final void rule__ServiceConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:539:1: ( rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4 )
            // InternalMy.g:540:2: rule__ServiceConfig__Group__3__Impl rule__ServiceConfig__Group__4
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
    // InternalMy.g:547:1: rule__ServiceConfig__Group__3__Impl : ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? ) ;
    public final void rule__ServiceConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:551:1: ( ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? ) )
            // InternalMy.g:552:1: ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? )
            {
            // InternalMy.g:552:1: ( ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )? )
            // InternalMy.g:553:2: ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )?
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysAssignment_3()); 
            // InternalMy.g:554:2: ( rule__ServiceConfig__CountInBusinessDaysAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMy.g:554:3: rule__ServiceConfig__CountInBusinessDaysAssignment_3
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
    // InternalMy.g:562:1: rule__ServiceConfig__Group__4 : rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5 ;
    public final void rule__ServiceConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:566:1: ( rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5 )
            // InternalMy.g:567:2: rule__ServiceConfig__Group__4__Impl rule__ServiceConfig__Group__5
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
    // InternalMy.g:574:1: rule__ServiceConfig__Group__4__Impl : ( 'country' ) ;
    public final void rule__ServiceConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:578:1: ( ( 'country' ) )
            // InternalMy.g:579:1: ( 'country' )
            {
            // InternalMy.g:579:1: ( 'country' )
            // InternalMy.g:580:2: 'country'
            {
             before(grammarAccess.getServiceConfigAccess().getCountryKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCountryKeyword_4()); 

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
    // InternalMy.g:589:1: rule__ServiceConfig__Group__5 : rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6 ;
    public final void rule__ServiceConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:593:1: ( rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6 )
            // InternalMy.g:594:2: rule__ServiceConfig__Group__5__Impl rule__ServiceConfig__Group__6
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
    // InternalMy.g:601:1: rule__ServiceConfig__Group__5__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:605:1: ( ( ':' ) )
            // InternalMy.g:606:1: ( ':' )
            {
            // InternalMy.g:606:1: ( ':' )
            // InternalMy.g:607:2: ':'
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
    // InternalMy.g:616:1: rule__ServiceConfig__Group__6 : rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7 ;
    public final void rule__ServiceConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:620:1: ( rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7 )
            // InternalMy.g:621:2: rule__ServiceConfig__Group__6__Impl rule__ServiceConfig__Group__7
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
    // InternalMy.g:628:1: rule__ServiceConfig__Group__6__Impl : ( ( rule__ServiceConfig__CountryAssignment_6 ) ) ;
    public final void rule__ServiceConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:632:1: ( ( ( rule__ServiceConfig__CountryAssignment_6 ) ) )
            // InternalMy.g:633:1: ( ( rule__ServiceConfig__CountryAssignment_6 ) )
            {
            // InternalMy.g:633:1: ( ( rule__ServiceConfig__CountryAssignment_6 ) )
            // InternalMy.g:634:2: ( rule__ServiceConfig__CountryAssignment_6 )
            {
             before(grammarAccess.getServiceConfigAccess().getCountryAssignment_6()); 
            // InternalMy.g:635:2: ( rule__ServiceConfig__CountryAssignment_6 )
            // InternalMy.g:635:3: rule__ServiceConfig__CountryAssignment_6
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
    // InternalMy.g:643:1: rule__ServiceConfig__Group__7 : rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8 ;
    public final void rule__ServiceConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:647:1: ( rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8 )
            // InternalMy.g:648:2: rule__ServiceConfig__Group__7__Impl rule__ServiceConfig__Group__8
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
    // InternalMy.g:655:1: rule__ServiceConfig__Group__7__Impl : ( ( rule__ServiceConfig__Group_7__0 )* ) ;
    public final void rule__ServiceConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:659:1: ( ( ( rule__ServiceConfig__Group_7__0 )* ) )
            // InternalMy.g:660:1: ( ( rule__ServiceConfig__Group_7__0 )* )
            {
            // InternalMy.g:660:1: ( ( rule__ServiceConfig__Group_7__0 )* )
            // InternalMy.g:661:2: ( rule__ServiceConfig__Group_7__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_7()); 
            // InternalMy.g:662:2: ( rule__ServiceConfig__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMy.g:662:3: rule__ServiceConfig__Group_7__0
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
    // InternalMy.g:670:1: rule__ServiceConfig__Group__8 : rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9 ;
    public final void rule__ServiceConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:674:1: ( rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9 )
            // InternalMy.g:675:2: rule__ServiceConfig__Group__8__Impl rule__ServiceConfig__Group__9
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
    // InternalMy.g:682:1: rule__ServiceConfig__Group__8__Impl : ( ( rule__ServiceConfig__Group_8__0 )? ) ;
    public final void rule__ServiceConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:686:1: ( ( ( rule__ServiceConfig__Group_8__0 )? ) )
            // InternalMy.g:687:1: ( ( rule__ServiceConfig__Group_8__0 )? )
            {
            // InternalMy.g:687:1: ( ( rule__ServiceConfig__Group_8__0 )? )
            // InternalMy.g:688:2: ( rule__ServiceConfig__Group_8__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_8()); 
            // InternalMy.g:689:2: ( rule__ServiceConfig__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMy.g:689:3: rule__ServiceConfig__Group_8__0
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
    // InternalMy.g:697:1: rule__ServiceConfig__Group__9 : rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10 ;
    public final void rule__ServiceConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:701:1: ( rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10 )
            // InternalMy.g:702:2: rule__ServiceConfig__Group__9__Impl rule__ServiceConfig__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalMy.g:709:1: rule__ServiceConfig__Group__9__Impl : ( 'lang' ) ;
    public final void rule__ServiceConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:713:1: ( ( 'lang' ) )
            // InternalMy.g:714:1: ( 'lang' )
            {
            // InternalMy.g:714:1: ( 'lang' )
            // InternalMy.g:715:2: 'lang'
            {
             before(grammarAccess.getServiceConfigAccess().getLangKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLangKeyword_9()); 

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
    // InternalMy.g:724:1: rule__ServiceConfig__Group__10 : rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11 ;
    public final void rule__ServiceConfig__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:728:1: ( rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11 )
            // InternalMy.g:729:2: rule__ServiceConfig__Group__10__Impl rule__ServiceConfig__Group__11
            {
            pushFollow(FOLLOW_5);
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
    // InternalMy.g:736:1: rule__ServiceConfig__Group__10__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:740:1: ( ( ':' ) )
            // InternalMy.g:741:1: ( ':' )
            {
            // InternalMy.g:741:1: ( ':' )
            // InternalMy.g:742:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_10()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_10()); 

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
    // InternalMy.g:751:1: rule__ServiceConfig__Group__11 : rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12 ;
    public final void rule__ServiceConfig__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:755:1: ( rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12 )
            // InternalMy.g:756:2: rule__ServiceConfig__Group__11__Impl rule__ServiceConfig__Group__12
            {
            pushFollow(FOLLOW_8);
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
    // InternalMy.g:763:1: rule__ServiceConfig__Group__11__Impl : ( ( rule__ServiceConfig__LanguageAssignment_11 ) ) ;
    public final void rule__ServiceConfig__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:767:1: ( ( ( rule__ServiceConfig__LanguageAssignment_11 ) ) )
            // InternalMy.g:768:1: ( ( rule__ServiceConfig__LanguageAssignment_11 ) )
            {
            // InternalMy.g:768:1: ( ( rule__ServiceConfig__LanguageAssignment_11 ) )
            // InternalMy.g:769:2: ( rule__ServiceConfig__LanguageAssignment_11 )
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageAssignment_11()); 
            // InternalMy.g:770:2: ( rule__ServiceConfig__LanguageAssignment_11 )
            // InternalMy.g:770:3: rule__ServiceConfig__LanguageAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LanguageAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLanguageAssignment_11()); 

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
    // InternalMy.g:778:1: rule__ServiceConfig__Group__12 : rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13 ;
    public final void rule__ServiceConfig__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:782:1: ( rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13 )
            // InternalMy.g:783:2: rule__ServiceConfig__Group__12__Impl rule__ServiceConfig__Group__13
            {
            pushFollow(FOLLOW_8);
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
    // InternalMy.g:790:1: rule__ServiceConfig__Group__12__Impl : ( ( rule__ServiceConfig__Group_12__0 )* ) ;
    public final void rule__ServiceConfig__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:794:1: ( ( ( rule__ServiceConfig__Group_12__0 )* ) )
            // InternalMy.g:795:1: ( ( rule__ServiceConfig__Group_12__0 )* )
            {
            // InternalMy.g:795:1: ( ( rule__ServiceConfig__Group_12__0 )* )
            // InternalMy.g:796:2: ( rule__ServiceConfig__Group_12__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_12()); 
            // InternalMy.g:797:2: ( rule__ServiceConfig__Group_12__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMy.g:797:3: rule__ServiceConfig__Group_12__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_12()); 

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
    // InternalMy.g:805:1: rule__ServiceConfig__Group__13 : rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14 ;
    public final void rule__ServiceConfig__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:809:1: ( rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14 )
            // InternalMy.g:810:2: rule__ServiceConfig__Group__13__Impl rule__ServiceConfig__Group__14
            {
            pushFollow(FOLLOW_3);
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
    // InternalMy.g:817:1: rule__ServiceConfig__Group__13__Impl : ( 'reservationsconfig' ) ;
    public final void rule__ServiceConfig__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:821:1: ( ( 'reservationsconfig' ) )
            // InternalMy.g:822:1: ( 'reservationsconfig' )
            {
            // InternalMy.g:822:1: ( 'reservationsconfig' )
            // InternalMy.g:823:2: 'reservationsconfig'
            {
             before(grammarAccess.getServiceConfigAccess().getReservationsconfigKeyword_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getReservationsconfigKeyword_13()); 

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
    // InternalMy.g:832:1: rule__ServiceConfig__Group__14 : rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15 ;
    public final void rule__ServiceConfig__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:836:1: ( rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15 )
            // InternalMy.g:837:2: rule__ServiceConfig__Group__14__Impl rule__ServiceConfig__Group__15
            {
            pushFollow(FOLLOW_9);
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
    // InternalMy.g:844:1: rule__ServiceConfig__Group__14__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:848:1: ( ( ':' ) )
            // InternalMy.g:849:1: ( ':' )
            {
            // InternalMy.g:849:1: ( ':' )
            // InternalMy.g:850:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_14()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_14()); 

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
    // InternalMy.g:859:1: rule__ServiceConfig__Group__15 : rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16 ;
    public final void rule__ServiceConfig__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:863:1: ( rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16 )
            // InternalMy.g:864:2: rule__ServiceConfig__Group__15__Impl rule__ServiceConfig__Group__16
            {
            pushFollow(FOLLOW_10);
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
    // InternalMy.g:871:1: rule__ServiceConfig__Group__15__Impl : ( ( rule__ServiceConfig__ReservationsconfigAssignment_15 ) ) ;
    public final void rule__ServiceConfig__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:875:1: ( ( ( rule__ServiceConfig__ReservationsconfigAssignment_15 ) ) )
            // InternalMy.g:876:1: ( ( rule__ServiceConfig__ReservationsconfigAssignment_15 ) )
            {
            // InternalMy.g:876:1: ( ( rule__ServiceConfig__ReservationsconfigAssignment_15 ) )
            // InternalMy.g:877:2: ( rule__ServiceConfig__ReservationsconfigAssignment_15 )
            {
             before(grammarAccess.getServiceConfigAccess().getReservationsconfigAssignment_15()); 
            // InternalMy.g:878:2: ( rule__ServiceConfig__ReservationsconfigAssignment_15 )
            // InternalMy.g:878:3: rule__ServiceConfig__ReservationsconfigAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ReservationsconfigAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getReservationsconfigAssignment_15()); 

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
    // InternalMy.g:886:1: rule__ServiceConfig__Group__16 : rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17 ;
    public final void rule__ServiceConfig__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:890:1: ( rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17 )
            // InternalMy.g:891:2: rule__ServiceConfig__Group__16__Impl rule__ServiceConfig__Group__17
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
    // InternalMy.g:898:1: rule__ServiceConfig__Group__16__Impl : ( 'resourcesconfig' ) ;
    public final void rule__ServiceConfig__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:902:1: ( ( 'resourcesconfig' ) )
            // InternalMy.g:903:1: ( 'resourcesconfig' )
            {
            // InternalMy.g:903:1: ( 'resourcesconfig' )
            // InternalMy.g:904:2: 'resourcesconfig'
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigKeyword_16()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getResourcesconfigKeyword_16()); 

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
    // InternalMy.g:913:1: rule__ServiceConfig__Group__17 : rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18 ;
    public final void rule__ServiceConfig__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:917:1: ( rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18 )
            // InternalMy.g:918:2: rule__ServiceConfig__Group__17__Impl rule__ServiceConfig__Group__18
            {
            pushFollow(FOLLOW_11);
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
    // InternalMy.g:925:1: rule__ServiceConfig__Group__17__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:929:1: ( ( ':' ) )
            // InternalMy.g:930:1: ( ':' )
            {
            // InternalMy.g:930:1: ( ':' )
            // InternalMy.g:931:2: ':'
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
    // InternalMy.g:940:1: rule__ServiceConfig__Group__18 : rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19 ;
    public final void rule__ServiceConfig__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:944:1: ( rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19 )
            // InternalMy.g:945:2: rule__ServiceConfig__Group__18__Impl rule__ServiceConfig__Group__19
            {
            pushFollow(FOLLOW_12);
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
    // InternalMy.g:952:1: rule__ServiceConfig__Group__18__Impl : ( ( rule__ServiceConfig__ResourcesconfigAssignment_18 ) ) ;
    public final void rule__ServiceConfig__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:956:1: ( ( ( rule__ServiceConfig__ResourcesconfigAssignment_18 ) ) )
            // InternalMy.g:957:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_18 ) )
            {
            // InternalMy.g:957:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_18 ) )
            // InternalMy.g:958:2: ( rule__ServiceConfig__ResourcesconfigAssignment_18 )
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_18()); 
            // InternalMy.g:959:2: ( rule__ServiceConfig__ResourcesconfigAssignment_18 )
            // InternalMy.g:959:3: rule__ServiceConfig__ResourcesconfigAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ResourcesconfigAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_18()); 

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
    // InternalMy.g:967:1: rule__ServiceConfig__Group__19 : rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20 ;
    public final void rule__ServiceConfig__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:971:1: ( rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20 )
            // InternalMy.g:972:2: rule__ServiceConfig__Group__19__Impl rule__ServiceConfig__Group__20
            {
            pushFollow(FOLLOW_12);
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
    // InternalMy.g:979:1: rule__ServiceConfig__Group__19__Impl : ( ( rule__ServiceConfig__Group_19__0 )* ) ;
    public final void rule__ServiceConfig__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:983:1: ( ( ( rule__ServiceConfig__Group_19__0 )* ) )
            // InternalMy.g:984:1: ( ( rule__ServiceConfig__Group_19__0 )* )
            {
            // InternalMy.g:984:1: ( ( rule__ServiceConfig__Group_19__0 )* )
            // InternalMy.g:985:2: ( rule__ServiceConfig__Group_19__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_19()); 
            // InternalMy.g:986:2: ( rule__ServiceConfig__Group_19__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMy.g:986:3: rule__ServiceConfig__Group_19__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_19__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_19()); 

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
    // InternalMy.g:994:1: rule__ServiceConfig__Group__20 : rule__ServiceConfig__Group__20__Impl ;
    public final void rule__ServiceConfig__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:998:1: ( rule__ServiceConfig__Group__20__Impl )
            // InternalMy.g:999:2: rule__ServiceConfig__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__20__Impl();

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
    // InternalMy.g:1005:1: rule__ServiceConfig__Group__20__Impl : ( ( rule__ServiceConfig__Group_20__0 )? ) ;
    public final void rule__ServiceConfig__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1009:1: ( ( ( rule__ServiceConfig__Group_20__0 )? ) )
            // InternalMy.g:1010:1: ( ( rule__ServiceConfig__Group_20__0 )? )
            {
            // InternalMy.g:1010:1: ( ( rule__ServiceConfig__Group_20__0 )? )
            // InternalMy.g:1011:2: ( rule__ServiceConfig__Group_20__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_20()); 
            // InternalMy.g:1012:2: ( rule__ServiceConfig__Group_20__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMy.g:1012:3: rule__ServiceConfig__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getGroup_20()); 

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


    // $ANTLR start "rule__ServiceConfig__Group_7__0"
    // InternalMy.g:1021:1: rule__ServiceConfig__Group_7__0 : rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1 ;
    public final void rule__ServiceConfig__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1025:1: ( rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1 )
            // InternalMy.g:1026:2: rule__ServiceConfig__Group_7__0__Impl rule__ServiceConfig__Group_7__1
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
    // InternalMy.g:1033:1: rule__ServiceConfig__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1037:1: ( ( ',' ) )
            // InternalMy.g:1038:1: ( ',' )
            {
            // InternalMy.g:1038:1: ( ',' )
            // InternalMy.g:1039:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMy.g:1048:1: rule__ServiceConfig__Group_7__1 : rule__ServiceConfig__Group_7__1__Impl ;
    public final void rule__ServiceConfig__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1052:1: ( rule__ServiceConfig__Group_7__1__Impl )
            // InternalMy.g:1053:2: rule__ServiceConfig__Group_7__1__Impl
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
    // InternalMy.g:1059:1: rule__ServiceConfig__Group_7__1__Impl : ( ( rule__ServiceConfig__CountryAssignment_7_1 ) ) ;
    public final void rule__ServiceConfig__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1063:1: ( ( ( rule__ServiceConfig__CountryAssignment_7_1 ) ) )
            // InternalMy.g:1064:1: ( ( rule__ServiceConfig__CountryAssignment_7_1 ) )
            {
            // InternalMy.g:1064:1: ( ( rule__ServiceConfig__CountryAssignment_7_1 ) )
            // InternalMy.g:1065:2: ( rule__ServiceConfig__CountryAssignment_7_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getCountryAssignment_7_1()); 
            // InternalMy.g:1066:2: ( rule__ServiceConfig__CountryAssignment_7_1 )
            // InternalMy.g:1066:3: rule__ServiceConfig__CountryAssignment_7_1
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
    // InternalMy.g:1075:1: rule__ServiceConfig__Group_8__0 : rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1 ;
    public final void rule__ServiceConfig__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1079:1: ( rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1 )
            // InternalMy.g:1080:2: rule__ServiceConfig__Group_8__0__Impl rule__ServiceConfig__Group_8__1
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
    // InternalMy.g:1087:1: rule__ServiceConfig__Group_8__0__Impl : ( 'pricingsystem' ) ;
    public final void rule__ServiceConfig__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1091:1: ( ( 'pricingsystem' ) )
            // InternalMy.g:1092:1: ( 'pricingsystem' )
            {
            // InternalMy.g:1092:1: ( 'pricingsystem' )
            // InternalMy.g:1093:2: 'pricingsystem'
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemKeyword_8_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getPricingsystemKeyword_8_0()); 

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
    // InternalMy.g:1102:1: rule__ServiceConfig__Group_8__1 : rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2 ;
    public final void rule__ServiceConfig__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1106:1: ( rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2 )
            // InternalMy.g:1107:2: rule__ServiceConfig__Group_8__1__Impl rule__ServiceConfig__Group_8__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMy.g:1114:1: rule__ServiceConfig__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1118:1: ( ( ':' ) )
            // InternalMy.g:1119:1: ( ':' )
            {
            // InternalMy.g:1119:1: ( ':' )
            // InternalMy.g:1120:2: ':'
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
    // InternalMy.g:1129:1: rule__ServiceConfig__Group_8__2 : rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3 ;
    public final void rule__ServiceConfig__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1133:1: ( rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3 )
            // InternalMy.g:1134:2: rule__ServiceConfig__Group_8__2__Impl rule__ServiceConfig__Group_8__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMy.g:1141:1: rule__ServiceConfig__Group_8__2__Impl : ( ( rule__ServiceConfig__PricingsystemAssignment_8_2 ) ) ;
    public final void rule__ServiceConfig__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1145:1: ( ( ( rule__ServiceConfig__PricingsystemAssignment_8_2 ) ) )
            // InternalMy.g:1146:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_2 ) )
            {
            // InternalMy.g:1146:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_2 ) )
            // InternalMy.g:1147:2: ( rule__ServiceConfig__PricingsystemAssignment_8_2 )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_2()); 
            // InternalMy.g:1148:2: ( rule__ServiceConfig__PricingsystemAssignment_8_2 )
            // InternalMy.g:1148:3: rule__ServiceConfig__PricingsystemAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__PricingsystemAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_2()); 

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
    // InternalMy.g:1156:1: rule__ServiceConfig__Group_8__3 : rule__ServiceConfig__Group_8__3__Impl ;
    public final void rule__ServiceConfig__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1160:1: ( rule__ServiceConfig__Group_8__3__Impl )
            // InternalMy.g:1161:2: rule__ServiceConfig__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8__3__Impl();

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
    // InternalMy.g:1167:1: rule__ServiceConfig__Group_8__3__Impl : ( ( rule__ServiceConfig__Group_8_3__0 )* ) ;
    public final void rule__ServiceConfig__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1171:1: ( ( ( rule__ServiceConfig__Group_8_3__0 )* ) )
            // InternalMy.g:1172:1: ( ( rule__ServiceConfig__Group_8_3__0 )* )
            {
            // InternalMy.g:1172:1: ( ( rule__ServiceConfig__Group_8_3__0 )* )
            // InternalMy.g:1173:2: ( rule__ServiceConfig__Group_8_3__0 )*
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_8_3()); 
            // InternalMy.g:1174:2: ( rule__ServiceConfig__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMy.g:1174:3: rule__ServiceConfig__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServiceConfig__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getGroup_8_3()); 

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


    // $ANTLR start "rule__ServiceConfig__Group_8_3__0"
    // InternalMy.g:1183:1: rule__ServiceConfig__Group_8_3__0 : rule__ServiceConfig__Group_8_3__0__Impl rule__ServiceConfig__Group_8_3__1 ;
    public final void rule__ServiceConfig__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1187:1: ( rule__ServiceConfig__Group_8_3__0__Impl rule__ServiceConfig__Group_8_3__1 )
            // InternalMy.g:1188:2: rule__ServiceConfig__Group_8_3__0__Impl rule__ServiceConfig__Group_8_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8_3__1();

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
    // $ANTLR end "rule__ServiceConfig__Group_8_3__0"


    // $ANTLR start "rule__ServiceConfig__Group_8_3__0__Impl"
    // InternalMy.g:1195:1: rule__ServiceConfig__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1199:1: ( ( ',' ) )
            // InternalMy.g:1200:1: ( ',' )
            {
            // InternalMy.g:1200:1: ( ',' )
            // InternalMy.g:1201:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_8_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_8_3__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_8_3__1"
    // InternalMy.g:1210:1: rule__ServiceConfig__Group_8_3__1 : rule__ServiceConfig__Group_8_3__1__Impl ;
    public final void rule__ServiceConfig__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1214:1: ( rule__ServiceConfig__Group_8_3__1__Impl )
            // InternalMy.g:1215:2: rule__ServiceConfig__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__ServiceConfig__Group_8_3__1"


    // $ANTLR start "rule__ServiceConfig__Group_8_3__1__Impl"
    // InternalMy.g:1221:1: rule__ServiceConfig__Group_8_3__1__Impl : ( ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 ) ) ;
    public final void rule__ServiceConfig__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1225:1: ( ( ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 ) ) )
            // InternalMy.g:1226:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 ) )
            {
            // InternalMy.g:1226:1: ( ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 ) )
            // InternalMy.g:1227:2: ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_3_1()); 
            // InternalMy.g:1228:2: ( rule__ServiceConfig__PricingsystemAssignment_8_3_1 )
            // InternalMy.g:1228:3: rule__ServiceConfig__PricingsystemAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__PricingsystemAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemAssignment_8_3_1()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_8_3__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_12__0"
    // InternalMy.g:1237:1: rule__ServiceConfig__Group_12__0 : rule__ServiceConfig__Group_12__0__Impl rule__ServiceConfig__Group_12__1 ;
    public final void rule__ServiceConfig__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1241:1: ( rule__ServiceConfig__Group_12__0__Impl rule__ServiceConfig__Group_12__1 )
            // InternalMy.g:1242:2: rule__ServiceConfig__Group_12__0__Impl rule__ServiceConfig__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceConfig__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_12__1();

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
    // $ANTLR end "rule__ServiceConfig__Group_12__0"


    // $ANTLR start "rule__ServiceConfig__Group_12__0__Impl"
    // InternalMy.g:1249:1: rule__ServiceConfig__Group_12__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1253:1: ( ( ',' ) )
            // InternalMy.g:1254:1: ( ',' )
            {
            // InternalMy.g:1254:1: ( ',' )
            // InternalMy.g:1255:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_12_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_12_0()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_12__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_12__1"
    // InternalMy.g:1264:1: rule__ServiceConfig__Group_12__1 : rule__ServiceConfig__Group_12__1__Impl ;
    public final void rule__ServiceConfig__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1268:1: ( rule__ServiceConfig__Group_12__1__Impl )
            // InternalMy.g:1269:2: rule__ServiceConfig__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_12__1__Impl();

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
    // $ANTLR end "rule__ServiceConfig__Group_12__1"


    // $ANTLR start "rule__ServiceConfig__Group_12__1__Impl"
    // InternalMy.g:1275:1: rule__ServiceConfig__Group_12__1__Impl : ( ( rule__ServiceConfig__LanguageAssignment_12_1 ) ) ;
    public final void rule__ServiceConfig__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1279:1: ( ( ( rule__ServiceConfig__LanguageAssignment_12_1 ) ) )
            // InternalMy.g:1280:1: ( ( rule__ServiceConfig__LanguageAssignment_12_1 ) )
            {
            // InternalMy.g:1280:1: ( ( rule__ServiceConfig__LanguageAssignment_12_1 ) )
            // InternalMy.g:1281:2: ( rule__ServiceConfig__LanguageAssignment_12_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageAssignment_12_1()); 
            // InternalMy.g:1282:2: ( rule__ServiceConfig__LanguageAssignment_12_1 )
            // InternalMy.g:1282:3: rule__ServiceConfig__LanguageAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LanguageAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLanguageAssignment_12_1()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_12__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_19__0"
    // InternalMy.g:1291:1: rule__ServiceConfig__Group_19__0 : rule__ServiceConfig__Group_19__0__Impl rule__ServiceConfig__Group_19__1 ;
    public final void rule__ServiceConfig__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1295:1: ( rule__ServiceConfig__Group_19__0__Impl rule__ServiceConfig__Group_19__1 )
            // InternalMy.g:1296:2: rule__ServiceConfig__Group_19__0__Impl rule__ServiceConfig__Group_19__1
            {
            pushFollow(FOLLOW_11);
            rule__ServiceConfig__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_19__1();

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
    // $ANTLR end "rule__ServiceConfig__Group_19__0"


    // $ANTLR start "rule__ServiceConfig__Group_19__0__Impl"
    // InternalMy.g:1303:1: rule__ServiceConfig__Group_19__0__Impl : ( ',' ) ;
    public final void rule__ServiceConfig__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1307:1: ( ( ',' ) )
            // InternalMy.g:1308:1: ( ',' )
            {
            // InternalMy.g:1308:1: ( ',' )
            // InternalMy.g:1309:2: ','
            {
             before(grammarAccess.getServiceConfigAccess().getCommaKeyword_19_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCommaKeyword_19_0()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_19__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_19__1"
    // InternalMy.g:1318:1: rule__ServiceConfig__Group_19__1 : rule__ServiceConfig__Group_19__1__Impl ;
    public final void rule__ServiceConfig__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1322:1: ( rule__ServiceConfig__Group_19__1__Impl )
            // InternalMy.g:1323:2: rule__ServiceConfig__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_19__1__Impl();

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
    // $ANTLR end "rule__ServiceConfig__Group_19__1"


    // $ANTLR start "rule__ServiceConfig__Group_19__1__Impl"
    // InternalMy.g:1329:1: rule__ServiceConfig__Group_19__1__Impl : ( ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 ) ) ;
    public final void rule__ServiceConfig__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1333:1: ( ( ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 ) ) )
            // InternalMy.g:1334:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 ) )
            {
            // InternalMy.g:1334:1: ( ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 ) )
            // InternalMy.g:1335:2: ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_19_1()); 
            // InternalMy.g:1336:2: ( rule__ServiceConfig__ResourcesconfigAssignment_19_1 )
            // InternalMy.g:1336:3: rule__ServiceConfig__ResourcesconfigAssignment_19_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__ResourcesconfigAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigAssignment_19_1()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_19__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_20__0"
    // InternalMy.g:1345:1: rule__ServiceConfig__Group_20__0 : rule__ServiceConfig__Group_20__0__Impl rule__ServiceConfig__Group_20__1 ;
    public final void rule__ServiceConfig__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1349:1: ( rule__ServiceConfig__Group_20__0__Impl rule__ServiceConfig__Group_20__1 )
            // InternalMy.g:1350:2: rule__ServiceConfig__Group_20__0__Impl rule__ServiceConfig__Group_20__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_20__1();

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
    // $ANTLR end "rule__ServiceConfig__Group_20__0"


    // $ANTLR start "rule__ServiceConfig__Group_20__0__Impl"
    // InternalMy.g:1357:1: rule__ServiceConfig__Group_20__0__Impl : ( 'lotsconfig' ) ;
    public final void rule__ServiceConfig__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1361:1: ( ( 'lotsconfig' ) )
            // InternalMy.g:1362:1: ( 'lotsconfig' )
            {
            // InternalMy.g:1362:1: ( 'lotsconfig' )
            // InternalMy.g:1363:2: 'lotsconfig'
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigKeyword_20_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLotsconfigKeyword_20_0()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_20__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_20__1"
    // InternalMy.g:1372:1: rule__ServiceConfig__Group_20__1 : rule__ServiceConfig__Group_20__1__Impl rule__ServiceConfig__Group_20__2 ;
    public final void rule__ServiceConfig__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1376:1: ( rule__ServiceConfig__Group_20__1__Impl rule__ServiceConfig__Group_20__2 )
            // InternalMy.g:1377:2: rule__ServiceConfig__Group_20__1__Impl rule__ServiceConfig__Group_20__2
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_20__2();

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
    // $ANTLR end "rule__ServiceConfig__Group_20__1"


    // $ANTLR start "rule__ServiceConfig__Group_20__1__Impl"
    // InternalMy.g:1384:1: rule__ServiceConfig__Group_20__1__Impl : ( ':' ) ;
    public final void rule__ServiceConfig__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1388:1: ( ( ':' ) )
            // InternalMy.g:1389:1: ( ':' )
            {
            // InternalMy.g:1389:1: ( ':' )
            // InternalMy.g:1390:2: ':'
            {
             before(grammarAccess.getServiceConfigAccess().getColonKeyword_20_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getColonKeyword_20_1()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_20__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_20__2"
    // InternalMy.g:1399:1: rule__ServiceConfig__Group_20__2 : rule__ServiceConfig__Group_20__2__Impl ;
    public final void rule__ServiceConfig__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1403:1: ( rule__ServiceConfig__Group_20__2__Impl )
            // InternalMy.g:1404:2: rule__ServiceConfig__Group_20__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_20__2__Impl();

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
    // $ANTLR end "rule__ServiceConfig__Group_20__2"


    // $ANTLR start "rule__ServiceConfig__Group_20__2__Impl"
    // InternalMy.g:1410:1: rule__ServiceConfig__Group_20__2__Impl : ( ( rule__ServiceConfig__LotsconfigAssignment_20_2 ) ) ;
    public final void rule__ServiceConfig__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1414:1: ( ( ( rule__ServiceConfig__LotsconfigAssignment_20_2 ) ) )
            // InternalMy.g:1415:1: ( ( rule__ServiceConfig__LotsconfigAssignment_20_2 ) )
            {
            // InternalMy.g:1415:1: ( ( rule__ServiceConfig__LotsconfigAssignment_20_2 ) )
            // InternalMy.g:1416:2: ( rule__ServiceConfig__LotsconfigAssignment_20_2 )
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigAssignment_20_2()); 
            // InternalMy.g:1417:2: ( rule__ServiceConfig__LotsconfigAssignment_20_2 )
            // InternalMy.g:1417:3: rule__ServiceConfig__LotsconfigAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__LotsconfigAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getLotsconfigAssignment_20_2()); 

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
    // $ANTLR end "rule__ServiceConfig__Group_20__2__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // InternalMy.g:1426:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1430:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // InternalMy.g:1431:2: rule__Language__Group__0__Impl rule__Language__Group__1
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
    // InternalMy.g:1438:1: rule__Language__Group__0__Impl : ( () ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1442:1: ( ( () ) )
            // InternalMy.g:1443:1: ( () )
            {
            // InternalMy.g:1443:1: ( () )
            // InternalMy.g:1444:2: ()
            {
             before(grammarAccess.getLanguageAccess().getLanguageAction_0()); 
            // InternalMy.g:1445:2: ()
            // InternalMy.g:1445:3: 
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
    // InternalMy.g:1453:1: rule__Language__Group__1 : rule__Language__Group__1__Impl ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1457:1: ( rule__Language__Group__1__Impl )
            // InternalMy.g:1458:2: rule__Language__Group__1__Impl
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
    // InternalMy.g:1464:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1468:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // InternalMy.g:1469:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // InternalMy.g:1469:1: ( ( rule__Language__NameAssignment_1 ) )
            // InternalMy.g:1470:2: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // InternalMy.g:1471:2: ( rule__Language__NameAssignment_1 )
            // InternalMy.g:1471:3: rule__Language__NameAssignment_1
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
    // InternalMy.g:1480:1: rule__ReservationsConfig__Group__0 : rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1 ;
    public final void rule__ReservationsConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1484:1: ( rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1 )
            // InternalMy.g:1485:2: rule__ReservationsConfig__Group__0__Impl rule__ReservationsConfig__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMy.g:1492:1: rule__ReservationsConfig__Group__0__Impl : ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) ) ;
    public final void rule__ReservationsConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1496:1: ( ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) ) )
            // InternalMy.g:1497:1: ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) )
            {
            // InternalMy.g:1497:1: ( ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 ) )
            // InternalMy.g:1498:2: ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckAssignment_0()); 
            // InternalMy.g:1499:2: ( rule__ReservationsConfig__HasMoveOutCheckAssignment_0 )
            // InternalMy.g:1499:3: rule__ReservationsConfig__HasMoveOutCheckAssignment_0
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
    // InternalMy.g:1507:1: rule__ReservationsConfig__Group__1 : rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2 ;
    public final void rule__ReservationsConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1511:1: ( rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2 )
            // InternalMy.g:1512:2: rule__ReservationsConfig__Group__1__Impl rule__ReservationsConfig__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMy.g:1519:1: rule__ReservationsConfig__Group__1__Impl : ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? ) ;
    public final void rule__ReservationsConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1523:1: ( ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? ) )
            // InternalMy.g:1524:1: ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? )
            {
            // InternalMy.g:1524:1: ( ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )? )
            // InternalMy.g:1525:2: ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )?
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckAssignment_1()); 
            // InternalMy.g:1526:2: ( rule__ReservationsConfig__HasMoveInCheckAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMy.g:1526:3: rule__ReservationsConfig__HasMoveInCheckAssignment_1
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
    // InternalMy.g:1534:1: rule__ReservationsConfig__Group__2 : rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3 ;
    public final void rule__ReservationsConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1538:1: ( rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3 )
            // InternalMy.g:1539:2: rule__ReservationsConfig__Group__2__Impl rule__ReservationsConfig__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMy.g:1546:1: rule__ReservationsConfig__Group__2__Impl : ( 'minRequestAdvance' ) ;
    public final void rule__ReservationsConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1550:1: ( ( 'minRequestAdvance' ) )
            // InternalMy.g:1551:1: ( 'minRequestAdvance' )
            {
            // InternalMy.g:1551:1: ( 'minRequestAdvance' )
            // InternalMy.g:1552:2: 'minRequestAdvance'
            {
             before(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceKeyword_2()); 

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
    // InternalMy.g:1561:1: rule__ReservationsConfig__Group__3 : rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4 ;
    public final void rule__ReservationsConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1565:1: ( rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4 )
            // InternalMy.g:1566:2: rule__ReservationsConfig__Group__3__Impl rule__ReservationsConfig__Group__4
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
    // InternalMy.g:1573:1: rule__ReservationsConfig__Group__3__Impl : ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 ) ) ;
    public final void rule__ReservationsConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1577:1: ( ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 ) ) )
            // InternalMy.g:1578:1: ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 ) )
            {
            // InternalMy.g:1578:1: ( ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 ) )
            // InternalMy.g:1579:2: ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 )
            {
             before(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceAssignment_3()); 
            // InternalMy.g:1580:2: ( rule__ReservationsConfig__MinRequestAdvanceAssignment_3 )
            // InternalMy.g:1580:3: rule__ReservationsConfig__MinRequestAdvanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__MinRequestAdvanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceAssignment_3()); 

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
    // InternalMy.g:1588:1: rule__ReservationsConfig__Group__4 : rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5 ;
    public final void rule__ReservationsConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1592:1: ( rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5 )
            // InternalMy.g:1593:2: rule__ReservationsConfig__Group__4__Impl rule__ReservationsConfig__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMy.g:1600:1: rule__ReservationsConfig__Group__4__Impl : ( 'maxRequestAdvance' ) ;
    public final void rule__ReservationsConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1604:1: ( ( 'maxRequestAdvance' ) )
            // InternalMy.g:1605:1: ( 'maxRequestAdvance' )
            {
            // InternalMy.g:1605:1: ( 'maxRequestAdvance' )
            // InternalMy.g:1606:2: 'maxRequestAdvance'
            {
             before(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceKeyword_4()); 

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
    // InternalMy.g:1615:1: rule__ReservationsConfig__Group__5 : rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6 ;
    public final void rule__ReservationsConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1619:1: ( rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6 )
            // InternalMy.g:1620:2: rule__ReservationsConfig__Group__5__Impl rule__ReservationsConfig__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalMy.g:1627:1: rule__ReservationsConfig__Group__5__Impl : ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 ) ) ;
    public final void rule__ReservationsConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1631:1: ( ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 ) ) )
            // InternalMy.g:1632:1: ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 ) )
            {
            // InternalMy.g:1632:1: ( ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 ) )
            // InternalMy.g:1633:2: ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 )
            {
             before(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceAssignment_5()); 
            // InternalMy.g:1634:2: ( rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 )
            // InternalMy.g:1634:3: rule__ReservationsConfig__MaxRequestAdvanceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__MaxRequestAdvanceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceAssignment_5()); 

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
    // InternalMy.g:1642:1: rule__ReservationsConfig__Group__6 : rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7 ;
    public final void rule__ReservationsConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1646:1: ( rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7 )
            // InternalMy.g:1647:2: rule__ReservationsConfig__Group__6__Impl rule__ReservationsConfig__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalMy.g:1654:1: rule__ReservationsConfig__Group__6__Impl : ( 'statuslist' ) ;
    public final void rule__ReservationsConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1658:1: ( ( 'statuslist' ) )
            // InternalMy.g:1659:1: ( 'statuslist' )
            {
            // InternalMy.g:1659:1: ( 'statuslist' )
            // InternalMy.g:1660:2: 'statuslist'
            {
             before(grammarAccess.getReservationsConfigAccess().getStatuslistKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getStatuslistKeyword_6()); 

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
    // InternalMy.g:1669:1: rule__ReservationsConfig__Group__7 : rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8 ;
    public final void rule__ReservationsConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1673:1: ( rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8 )
            // InternalMy.g:1674:2: rule__ReservationsConfig__Group__7__Impl rule__ReservationsConfig__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalMy.g:1681:1: rule__ReservationsConfig__Group__7__Impl : ( ':' ) ;
    public final void rule__ReservationsConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1685:1: ( ( ':' ) )
            // InternalMy.g:1686:1: ( ':' )
            {
            // InternalMy.g:1686:1: ( ':' )
            // InternalMy.g:1687:2: ':'
            {
             before(grammarAccess.getReservationsConfigAccess().getColonKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getColonKeyword_7()); 

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
    // InternalMy.g:1696:1: rule__ReservationsConfig__Group__8 : rule__ReservationsConfig__Group__8__Impl ;
    public final void rule__ReservationsConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1700:1: ( rule__ReservationsConfig__Group__8__Impl )
            // InternalMy.g:1701:2: rule__ReservationsConfig__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__Group__8__Impl();

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
    // InternalMy.g:1707:1: rule__ReservationsConfig__Group__8__Impl : ( ( rule__ReservationsConfig__StatuslistAssignment_8 ) ) ;
    public final void rule__ReservationsConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1711:1: ( ( ( rule__ReservationsConfig__StatuslistAssignment_8 ) ) )
            // InternalMy.g:1712:1: ( ( rule__ReservationsConfig__StatuslistAssignment_8 ) )
            {
            // InternalMy.g:1712:1: ( ( rule__ReservationsConfig__StatuslistAssignment_8 ) )
            // InternalMy.g:1713:2: ( rule__ReservationsConfig__StatuslistAssignment_8 )
            {
             before(grammarAccess.getReservationsConfigAccess().getStatuslistAssignment_8()); 
            // InternalMy.g:1714:2: ( rule__ReservationsConfig__StatuslistAssignment_8 )
            // InternalMy.g:1714:3: rule__ReservationsConfig__StatuslistAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ReservationsConfig__StatuslistAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getReservationsConfigAccess().getStatuslistAssignment_8()); 

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


    // $ANTLR start "rule__Country__Group__0"
    // InternalMy.g:1723:1: rule__Country__Group__0 : rule__Country__Group__0__Impl rule__Country__Group__1 ;
    public final void rule__Country__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1727:1: ( rule__Country__Group__0__Impl rule__Country__Group__1 )
            // InternalMy.g:1728:2: rule__Country__Group__0__Impl rule__Country__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMy.g:1735:1: rule__Country__Group__0__Impl : ( ( rule__Country__NameAssignment_0 ) ) ;
    public final void rule__Country__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1739:1: ( ( ( rule__Country__NameAssignment_0 ) ) )
            // InternalMy.g:1740:1: ( ( rule__Country__NameAssignment_0 ) )
            {
            // InternalMy.g:1740:1: ( ( rule__Country__NameAssignment_0 ) )
            // InternalMy.g:1741:2: ( rule__Country__NameAssignment_0 )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment_0()); 
            // InternalMy.g:1742:2: ( rule__Country__NameAssignment_0 )
            // InternalMy.g:1742:3: rule__Country__NameAssignment_0
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
    // InternalMy.g:1750:1: rule__Country__Group__1 : rule__Country__Group__1__Impl rule__Country__Group__2 ;
    public final void rule__Country__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1754:1: ( rule__Country__Group__1__Impl rule__Country__Group__2 )
            // InternalMy.g:1755:2: rule__Country__Group__1__Impl rule__Country__Group__2
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
    // InternalMy.g:1762:1: rule__Country__Group__1__Impl : ( 'lang' ) ;
    public final void rule__Country__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1766:1: ( ( 'lang' ) )
            // InternalMy.g:1767:1: ( 'lang' )
            {
            // InternalMy.g:1767:1: ( 'lang' )
            // InternalMy.g:1768:2: 'lang'
            {
             before(grammarAccess.getCountryAccess().getLangKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getLangKeyword_1()); 

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
    // InternalMy.g:1777:1: rule__Country__Group__2 : rule__Country__Group__2__Impl rule__Country__Group__3 ;
    public final void rule__Country__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1781:1: ( rule__Country__Group__2__Impl rule__Country__Group__3 )
            // InternalMy.g:1782:2: rule__Country__Group__2__Impl rule__Country__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMy.g:1789:1: rule__Country__Group__2__Impl : ( ( rule__Country__LanguageAssignment_2 ) ) ;
    public final void rule__Country__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1793:1: ( ( ( rule__Country__LanguageAssignment_2 ) ) )
            // InternalMy.g:1794:1: ( ( rule__Country__LanguageAssignment_2 ) )
            {
            // InternalMy.g:1794:1: ( ( rule__Country__LanguageAssignment_2 ) )
            // InternalMy.g:1795:2: ( rule__Country__LanguageAssignment_2 )
            {
             before(grammarAccess.getCountryAccess().getLanguageAssignment_2()); 
            // InternalMy.g:1796:2: ( rule__Country__LanguageAssignment_2 )
            // InternalMy.g:1796:3: rule__Country__LanguageAssignment_2
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
    // InternalMy.g:1804:1: rule__Country__Group__3 : rule__Country__Group__3__Impl rule__Country__Group__4 ;
    public final void rule__Country__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1808:1: ( rule__Country__Group__3__Impl rule__Country__Group__4 )
            // InternalMy.g:1809:2: rule__Country__Group__3__Impl rule__Country__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMy.g:1816:1: rule__Country__Group__3__Impl : ( 'pricing' ) ;
    public final void rule__Country__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1820:1: ( ( 'pricing' ) )
            // InternalMy.g:1821:1: ( 'pricing' )
            {
            // InternalMy.g:1821:1: ( 'pricing' )
            // InternalMy.g:1822:2: 'pricing'
            {
             before(grammarAccess.getCountryAccess().getPricingKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getPricingKeyword_3()); 

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
    // InternalMy.g:1831:1: rule__Country__Group__4 : rule__Country__Group__4__Impl rule__Country__Group__5 ;
    public final void rule__Country__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1835:1: ( rule__Country__Group__4__Impl rule__Country__Group__5 )
            // InternalMy.g:1836:2: rule__Country__Group__4__Impl rule__Country__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMy.g:1843:1: rule__Country__Group__4__Impl : ( ':' ) ;
    public final void rule__Country__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1847:1: ( ( ':' ) )
            // InternalMy.g:1848:1: ( ':' )
            {
            // InternalMy.g:1848:1: ( ':' )
            // InternalMy.g:1849:2: ':'
            {
             before(grammarAccess.getCountryAccess().getColonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getColonKeyword_4()); 

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
    // InternalMy.g:1858:1: rule__Country__Group__5 : rule__Country__Group__5__Impl rule__Country__Group__6 ;
    public final void rule__Country__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1862:1: ( rule__Country__Group__5__Impl rule__Country__Group__6 )
            // InternalMy.g:1863:2: rule__Country__Group__5__Impl rule__Country__Group__6
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
    // InternalMy.g:1870:1: rule__Country__Group__5__Impl : ( '(' ) ;
    public final void rule__Country__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1874:1: ( ( '(' ) )
            // InternalMy.g:1875:1: ( '(' )
            {
            // InternalMy.g:1875:1: ( '(' )
            // InternalMy.g:1876:2: '('
            {
             before(grammarAccess.getCountryAccess().getLeftParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getLeftParenthesisKeyword_5()); 

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
    // InternalMy.g:1885:1: rule__Country__Group__6 : rule__Country__Group__6__Impl rule__Country__Group__7 ;
    public final void rule__Country__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1889:1: ( rule__Country__Group__6__Impl rule__Country__Group__7 )
            // InternalMy.g:1890:2: rule__Country__Group__6__Impl rule__Country__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Country__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__7();

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
    // InternalMy.g:1897:1: rule__Country__Group__6__Impl : ( ( rule__Country__PricingsystemAssignment_6 ) ) ;
    public final void rule__Country__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1901:1: ( ( ( rule__Country__PricingsystemAssignment_6 ) ) )
            // InternalMy.g:1902:1: ( ( rule__Country__PricingsystemAssignment_6 ) )
            {
            // InternalMy.g:1902:1: ( ( rule__Country__PricingsystemAssignment_6 ) )
            // InternalMy.g:1903:2: ( rule__Country__PricingsystemAssignment_6 )
            {
             before(grammarAccess.getCountryAccess().getPricingsystemAssignment_6()); 
            // InternalMy.g:1904:2: ( rule__Country__PricingsystemAssignment_6 )
            // InternalMy.g:1904:3: rule__Country__PricingsystemAssignment_6
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


    // $ANTLR start "rule__Country__Group__7"
    // InternalMy.g:1912:1: rule__Country__Group__7 : rule__Country__Group__7__Impl ;
    public final void rule__Country__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1916:1: ( rule__Country__Group__7__Impl )
            // InternalMy.g:1917:2: rule__Country__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__7__Impl();

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
    // $ANTLR end "rule__Country__Group__7"


    // $ANTLR start "rule__Country__Group__7__Impl"
    // InternalMy.g:1923:1: rule__Country__Group__7__Impl : ( ')' ) ;
    public final void rule__Country__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1927:1: ( ( ')' ) )
            // InternalMy.g:1928:1: ( ')' )
            {
            // InternalMy.g:1928:1: ( ')' )
            // InternalMy.g:1929:2: ')'
            {
             before(grammarAccess.getCountryAccess().getRightParenthesisKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Country__Group__7__Impl"


    // $ANTLR start "rule__ResourcesConfig__Group__0"
    // InternalMy.g:1939:1: rule__ResourcesConfig__Group__0 : rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1 ;
    public final void rule__ResourcesConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1943:1: ( rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1 )
            // InternalMy.g:1944:2: rule__ResourcesConfig__Group__0__Impl rule__ResourcesConfig__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:1951:1: rule__ResourcesConfig__Group__0__Impl : ( '(' ) ;
    public final void rule__ResourcesConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1955:1: ( ( '(' ) )
            // InternalMy.g:1956:1: ( '(' )
            {
            // InternalMy.g:1956:1: ( '(' )
            // InternalMy.g:1957:2: '('
            {
             before(grammarAccess.getResourcesConfigAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMy.g:1966:1: rule__ResourcesConfig__Group__1 : rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2 ;
    public final void rule__ResourcesConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1970:1: ( rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2 )
            // InternalMy.g:1971:2: rule__ResourcesConfig__Group__1__Impl rule__ResourcesConfig__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:1978:1: rule__ResourcesConfig__Group__1__Impl : ( ( rule__ResourcesConfig__HasImageAssignment_1 )? ) ;
    public final void rule__ResourcesConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1982:1: ( ( ( rule__ResourcesConfig__HasImageAssignment_1 )? ) )
            // InternalMy.g:1983:1: ( ( rule__ResourcesConfig__HasImageAssignment_1 )? )
            {
            // InternalMy.g:1983:1: ( ( rule__ResourcesConfig__HasImageAssignment_1 )? )
            // InternalMy.g:1984:2: ( rule__ResourcesConfig__HasImageAssignment_1 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageAssignment_1()); 
            // InternalMy.g:1985:2: ( rule__ResourcesConfig__HasImageAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMy.g:1985:3: rule__ResourcesConfig__HasImageAssignment_1
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
    // InternalMy.g:1993:1: rule__ResourcesConfig__Group__2 : rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3 ;
    public final void rule__ResourcesConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1997:1: ( rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3 )
            // InternalMy.g:1998:2: rule__ResourcesConfig__Group__2__Impl rule__ResourcesConfig__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:2005:1: rule__ResourcesConfig__Group__2__Impl : ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? ) ;
    public final void rule__ResourcesConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2009:1: ( ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? ) )
            // InternalMy.g:2010:1: ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? )
            {
            // InternalMy.g:2010:1: ( ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )? )
            // InternalMy.g:2011:2: ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotAssignment_2()); 
            // InternalMy.g:2012:2: ( rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMy.g:2012:3: rule__ResourcesConfig__HasOneStockPerSlotAssignment_2
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
    // InternalMy.g:2020:1: rule__ResourcesConfig__Group__3 : rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4 ;
    public final void rule__ResourcesConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2024:1: ( rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4 )
            // InternalMy.g:2025:2: rule__ResourcesConfig__Group__3__Impl rule__ResourcesConfig__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:2032:1: rule__ResourcesConfig__Group__3__Impl : ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? ) ;
    public final void rule__ResourcesConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2036:1: ( ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? ) )
            // InternalMy.g:2037:1: ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? )
            {
            // InternalMy.g:2037:1: ( ( rule__ResourcesConfig__IsConsumableAssignment_3 )? )
            // InternalMy.g:2038:2: ( rule__ResourcesConfig__IsConsumableAssignment_3 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableAssignment_3()); 
            // InternalMy.g:2039:2: ( rule__ResourcesConfig__IsConsumableAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMy.g:2039:3: rule__ResourcesConfig__IsConsumableAssignment_3
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
    // InternalMy.g:2047:1: rule__ResourcesConfig__Group__4 : rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5 ;
    public final void rule__ResourcesConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2051:1: ( rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5 )
            // InternalMy.g:2052:2: rule__ResourcesConfig__Group__4__Impl rule__ResourcesConfig__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:2059:1: rule__ResourcesConfig__Group__4__Impl : ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? ) ;
    public final void rule__ResourcesConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2063:1: ( ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? ) )
            // InternalMy.g:2064:1: ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? )
            {
            // InternalMy.g:2064:1: ( ( rule__ResourcesConfig__IsLoanAssignment_4 )? )
            // InternalMy.g:2065:2: ( rule__ResourcesConfig__IsLoanAssignment_4 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanAssignment_4()); 
            // InternalMy.g:2066:2: ( rule__ResourcesConfig__IsLoanAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMy.g:2066:3: rule__ResourcesConfig__IsLoanAssignment_4
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
    // InternalMy.g:2074:1: rule__ResourcesConfig__Group__5 : rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6 ;
    public final void rule__ResourcesConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2078:1: ( rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6 )
            // InternalMy.g:2079:2: rule__ResourcesConfig__Group__5__Impl rule__ResourcesConfig__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalMy.g:2086:1: rule__ResourcesConfig__Group__5__Impl : ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? ) ;
    public final void rule__ResourcesConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2090:1: ( ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? ) )
            // InternalMy.g:2091:1: ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? )
            {
            // InternalMy.g:2091:1: ( ( rule__ResourcesConfig__IsChargedAssignment_5 )? )
            // InternalMy.g:2092:2: ( rule__ResourcesConfig__IsChargedAssignment_5 )?
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedAssignment_5()); 
            // InternalMy.g:2093:2: ( rule__ResourcesConfig__IsChargedAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMy.g:2093:3: rule__ResourcesConfig__IsChargedAssignment_5
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
    // InternalMy.g:2101:1: rule__ResourcesConfig__Group__6 : rule__ResourcesConfig__Group__6__Impl ;
    public final void rule__ResourcesConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2105:1: ( rule__ResourcesConfig__Group__6__Impl )
            // InternalMy.g:2106:2: rule__ResourcesConfig__Group__6__Impl
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
    // InternalMy.g:2112:1: rule__ResourcesConfig__Group__6__Impl : ( ')' ) ;
    public final void rule__ResourcesConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2116:1: ( ( ')' ) )
            // InternalMy.g:2117:1: ( ')' )
            {
            // InternalMy.g:2117:1: ( ')' )
            // InternalMy.g:2118:2: ')'
            {
             before(grammarAccess.getResourcesConfigAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMy.g:2128:1: rule__LotsConfig__Group__0 : rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1 ;
    public final void rule__LotsConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2132:1: ( rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1 )
            // InternalMy.g:2133:2: rule__LotsConfig__Group__0__Impl rule__LotsConfig__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMy.g:2140:1: rule__LotsConfig__Group__0__Impl : ( () ) ;
    public final void rule__LotsConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2144:1: ( ( () ) )
            // InternalMy.g:2145:1: ( () )
            {
            // InternalMy.g:2145:1: ( () )
            // InternalMy.g:2146:2: ()
            {
             before(grammarAccess.getLotsConfigAccess().getLotsConfigAction_0()); 
            // InternalMy.g:2147:2: ()
            // InternalMy.g:2147:3: 
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
    // InternalMy.g:2155:1: rule__LotsConfig__Group__1 : rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2 ;
    public final void rule__LotsConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2159:1: ( rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2 )
            // InternalMy.g:2160:2: rule__LotsConfig__Group__1__Impl rule__LotsConfig__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMy.g:2167:1: rule__LotsConfig__Group__1__Impl : ( ( rule__LotsConfig__HasImageAssignment_1 )? ) ;
    public final void rule__LotsConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2171:1: ( ( ( rule__LotsConfig__HasImageAssignment_1 )? ) )
            // InternalMy.g:2172:1: ( ( rule__LotsConfig__HasImageAssignment_1 )? )
            {
            // InternalMy.g:2172:1: ( ( rule__LotsConfig__HasImageAssignment_1 )? )
            // InternalMy.g:2173:2: ( rule__LotsConfig__HasImageAssignment_1 )?
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageAssignment_1()); 
            // InternalMy.g:2174:2: ( rule__LotsConfig__HasImageAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMy.g:2174:3: rule__LotsConfig__HasImageAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LotsConfig__HasImageAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLotsConfigAccess().getHasImageAssignment_1()); 

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
    // InternalMy.g:2182:1: rule__LotsConfig__Group__2 : rule__LotsConfig__Group__2__Impl ;
    public final void rule__LotsConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2186:1: ( rule__LotsConfig__Group__2__Impl )
            // InternalMy.g:2187:2: rule__LotsConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LotsConfig__Group__2__Impl();

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
    // InternalMy.g:2193:1: rule__LotsConfig__Group__2__Impl : ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )? ) ;
    public final void rule__LotsConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2197:1: ( ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )? ) )
            // InternalMy.g:2198:1: ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )? )
            {
            // InternalMy.g:2198:1: ( ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )? )
            // InternalMy.g:2199:2: ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )?
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotAssignment_2()); 
            // InternalMy.g:2200:2: ( rule__LotsConfig__HasOneStockPerSlotAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMy.g:2200:3: rule__LotsConfig__HasOneStockPerSlotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LotsConfig__HasOneStockPerSlotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotAssignment_2()); 

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


    // $ANTLR start "rule__PricingSystem__Group__0"
    // InternalMy.g:2209:1: rule__PricingSystem__Group__0 : rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1 ;
    public final void rule__PricingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2213:1: ( rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1 )
            // InternalMy.g:2214:2: rule__PricingSystem__Group__0__Impl rule__PricingSystem__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMy.g:2221:1: rule__PricingSystem__Group__0__Impl : ( ( rule__PricingSystem__NameAssignment_0 ) ) ;
    public final void rule__PricingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2225:1: ( ( ( rule__PricingSystem__NameAssignment_0 ) ) )
            // InternalMy.g:2226:1: ( ( rule__PricingSystem__NameAssignment_0 ) )
            {
            // InternalMy.g:2226:1: ( ( rule__PricingSystem__NameAssignment_0 ) )
            // InternalMy.g:2227:2: ( rule__PricingSystem__NameAssignment_0 )
            {
             before(grammarAccess.getPricingSystemAccess().getNameAssignment_0()); 
            // InternalMy.g:2228:2: ( rule__PricingSystem__NameAssignment_0 )
            // InternalMy.g:2228:3: rule__PricingSystem__NameAssignment_0
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
    // InternalMy.g:2236:1: rule__PricingSystem__Group__1 : rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2 ;
    public final void rule__PricingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2240:1: ( rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2 )
            // InternalMy.g:2241:2: rule__PricingSystem__Group__1__Impl rule__PricingSystem__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMy.g:2248:1: rule__PricingSystem__Group__1__Impl : ( ':' ) ;
    public final void rule__PricingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2252:1: ( ( ':' ) )
            // InternalMy.g:2253:1: ( ':' )
            {
            // InternalMy.g:2253:1: ( ':' )
            // InternalMy.g:2254:2: ':'
            {
             before(grammarAccess.getPricingSystemAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getColonKeyword_1()); 

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
    // InternalMy.g:2263:1: rule__PricingSystem__Group__2 : rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3 ;
    public final void rule__PricingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2267:1: ( rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3 )
            // InternalMy.g:2268:2: rule__PricingSystem__Group__2__Impl rule__PricingSystem__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMy.g:2275:1: rule__PricingSystem__Group__2__Impl : ( 'currency' ) ;
    public final void rule__PricingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2279:1: ( ( 'currency' ) )
            // InternalMy.g:2280:1: ( 'currency' )
            {
            // InternalMy.g:2280:1: ( 'currency' )
            // InternalMy.g:2281:2: 'currency'
            {
             before(grammarAccess.getPricingSystemAccess().getCurrencyKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getCurrencyKeyword_2()); 

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
    // InternalMy.g:2290:1: rule__PricingSystem__Group__3 : rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4 ;
    public final void rule__PricingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2294:1: ( rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4 )
            // InternalMy.g:2295:2: rule__PricingSystem__Group__3__Impl rule__PricingSystem__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalMy.g:2302:1: rule__PricingSystem__Group__3__Impl : ( ( rule__PricingSystem__CurrencyAssignment_3 ) ) ;
    public final void rule__PricingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2306:1: ( ( ( rule__PricingSystem__CurrencyAssignment_3 ) ) )
            // InternalMy.g:2307:1: ( ( rule__PricingSystem__CurrencyAssignment_3 ) )
            {
            // InternalMy.g:2307:1: ( ( rule__PricingSystem__CurrencyAssignment_3 ) )
            // InternalMy.g:2308:2: ( rule__PricingSystem__CurrencyAssignment_3 )
            {
             before(grammarAccess.getPricingSystemAccess().getCurrencyAssignment_3()); 
            // InternalMy.g:2309:2: ( rule__PricingSystem__CurrencyAssignment_3 )
            // InternalMy.g:2309:3: rule__PricingSystem__CurrencyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__CurrencyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getCurrencyAssignment_3()); 

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
    // InternalMy.g:2317:1: rule__PricingSystem__Group__4 : rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5 ;
    public final void rule__PricingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2321:1: ( rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5 )
            // InternalMy.g:2322:2: rule__PricingSystem__Group__4__Impl rule__PricingSystem__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMy.g:2329:1: rule__PricingSystem__Group__4__Impl : ( ',' ) ;
    public final void rule__PricingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2333:1: ( ( ',' ) )
            // InternalMy.g:2334:1: ( ',' )
            {
            // InternalMy.g:2334:1: ( ',' )
            // InternalMy.g:2335:2: ','
            {
             before(grammarAccess.getPricingSystemAccess().getCommaKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getCommaKeyword_4()); 

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
    // InternalMy.g:2344:1: rule__PricingSystem__Group__5 : rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6 ;
    public final void rule__PricingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2348:1: ( rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6 )
            // InternalMy.g:2349:2: rule__PricingSystem__Group__5__Impl rule__PricingSystem__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalMy.g:2356:1: rule__PricingSystem__Group__5__Impl : ( 'taxSystem' ) ;
    public final void rule__PricingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2360:1: ( ( 'taxSystem' ) )
            // InternalMy.g:2361:1: ( 'taxSystem' )
            {
            // InternalMy.g:2361:1: ( 'taxSystem' )
            // InternalMy.g:2362:2: 'taxSystem'
            {
             before(grammarAccess.getPricingSystemAccess().getTaxSystemKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPricingSystemAccess().getTaxSystemKeyword_5()); 

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
    // InternalMy.g:2371:1: rule__PricingSystem__Group__6 : rule__PricingSystem__Group__6__Impl ;
    public final void rule__PricingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2375:1: ( rule__PricingSystem__Group__6__Impl )
            // InternalMy.g:2376:2: rule__PricingSystem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__Group__6__Impl();

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
    // InternalMy.g:2382:1: rule__PricingSystem__Group__6__Impl : ( ( rule__PricingSystem__TaxSystemAssignment_6 ) ) ;
    public final void rule__PricingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2386:1: ( ( ( rule__PricingSystem__TaxSystemAssignment_6 ) ) )
            // InternalMy.g:2387:1: ( ( rule__PricingSystem__TaxSystemAssignment_6 ) )
            {
            // InternalMy.g:2387:1: ( ( rule__PricingSystem__TaxSystemAssignment_6 ) )
            // InternalMy.g:2388:2: ( rule__PricingSystem__TaxSystemAssignment_6 )
            {
             before(grammarAccess.getPricingSystemAccess().getTaxSystemAssignment_6()); 
            // InternalMy.g:2389:2: ( rule__PricingSystem__TaxSystemAssignment_6 )
            // InternalMy.g:2389:3: rule__PricingSystem__TaxSystemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PricingSystem__TaxSystemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPricingSystemAccess().getTaxSystemAssignment_6()); 

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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMy.g:2398:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2402:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMy.g:2403:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMy.g:2410:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2414:1: ( ( ( '-' )? ) )
            // InternalMy.g:2415:1: ( ( '-' )? )
            {
            // InternalMy.g:2415:1: ( ( '-' )? )
            // InternalMy.g:2416:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMy.g:2417:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMy.g:2417:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalMy.g:2425:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2429:1: ( rule__EInt__Group__1__Impl )
            // InternalMy.g:2430:2: rule__EInt__Group__1__Impl
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
    // InternalMy.g:2436:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2440:1: ( ( RULE_INT ) )
            // InternalMy.g:2441:1: ( RULE_INT )
            {
            // InternalMy.g:2441:1: ( RULE_INT )
            // InternalMy.g:2442:2: RULE_INT
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
    // InternalMy.g:2452:1: rule__StatusList__Group__0 : rule__StatusList__Group__0__Impl rule__StatusList__Group__1 ;
    public final void rule__StatusList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2456:1: ( rule__StatusList__Group__0__Impl rule__StatusList__Group__1 )
            // InternalMy.g:2457:2: rule__StatusList__Group__0__Impl rule__StatusList__Group__1
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
    // InternalMy.g:2464:1: rule__StatusList__Group__0__Impl : ( '(' ) ;
    public final void rule__StatusList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2468:1: ( ( '(' ) )
            // InternalMy.g:2469:1: ( '(' )
            {
            // InternalMy.g:2469:1: ( '(' )
            // InternalMy.g:2470:2: '('
            {
             before(grammarAccess.getStatusListAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMy.g:2479:1: rule__StatusList__Group__1 : rule__StatusList__Group__1__Impl rule__StatusList__Group__2 ;
    public final void rule__StatusList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2483:1: ( rule__StatusList__Group__1__Impl rule__StatusList__Group__2 )
            // InternalMy.g:2484:2: rule__StatusList__Group__1__Impl rule__StatusList__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMy.g:2491:1: rule__StatusList__Group__1__Impl : ( ( rule__StatusList__StatusAssignment_1 ) ) ;
    public final void rule__StatusList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2495:1: ( ( ( rule__StatusList__StatusAssignment_1 ) ) )
            // InternalMy.g:2496:1: ( ( rule__StatusList__StatusAssignment_1 ) )
            {
            // InternalMy.g:2496:1: ( ( rule__StatusList__StatusAssignment_1 ) )
            // InternalMy.g:2497:2: ( rule__StatusList__StatusAssignment_1 )
            {
             before(grammarAccess.getStatusListAccess().getStatusAssignment_1()); 
            // InternalMy.g:2498:2: ( rule__StatusList__StatusAssignment_1 )
            // InternalMy.g:2498:3: rule__StatusList__StatusAssignment_1
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
    // InternalMy.g:2506:1: rule__StatusList__Group__2 : rule__StatusList__Group__2__Impl rule__StatusList__Group__3 ;
    public final void rule__StatusList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2510:1: ( rule__StatusList__Group__2__Impl rule__StatusList__Group__3 )
            // InternalMy.g:2511:2: rule__StatusList__Group__2__Impl rule__StatusList__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMy.g:2518:1: rule__StatusList__Group__2__Impl : ( ( rule__StatusList__Group_2__0 )* ) ;
    public final void rule__StatusList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2522:1: ( ( ( rule__StatusList__Group_2__0 )* ) )
            // InternalMy.g:2523:1: ( ( rule__StatusList__Group_2__0 )* )
            {
            // InternalMy.g:2523:1: ( ( rule__StatusList__Group_2__0 )* )
            // InternalMy.g:2524:2: ( rule__StatusList__Group_2__0 )*
            {
             before(grammarAccess.getStatusListAccess().getGroup_2()); 
            // InternalMy.g:2525:2: ( rule__StatusList__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMy.g:2525:3: rule__StatusList__Group_2__0
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
    // InternalMy.g:2533:1: rule__StatusList__Group__3 : rule__StatusList__Group__3__Impl ;
    public final void rule__StatusList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2537:1: ( rule__StatusList__Group__3__Impl )
            // InternalMy.g:2538:2: rule__StatusList__Group__3__Impl
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
    // InternalMy.g:2544:1: rule__StatusList__Group__3__Impl : ( ')' ) ;
    public final void rule__StatusList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2548:1: ( ( ')' ) )
            // InternalMy.g:2549:1: ( ')' )
            {
            // InternalMy.g:2549:1: ( ')' )
            // InternalMy.g:2550:2: ')'
            {
             before(grammarAccess.getStatusListAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMy.g:2560:1: rule__StatusList__Group_2__0 : rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1 ;
    public final void rule__StatusList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2564:1: ( rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1 )
            // InternalMy.g:2565:2: rule__StatusList__Group_2__0__Impl rule__StatusList__Group_2__1
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
    // InternalMy.g:2572:1: rule__StatusList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StatusList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2576:1: ( ( ',' ) )
            // InternalMy.g:2577:1: ( ',' )
            {
            // InternalMy.g:2577:1: ( ',' )
            // InternalMy.g:2578:2: ','
            {
             before(grammarAccess.getStatusListAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMy.g:2587:1: rule__StatusList__Group_2__1 : rule__StatusList__Group_2__1__Impl ;
    public final void rule__StatusList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2591:1: ( rule__StatusList__Group_2__1__Impl )
            // InternalMy.g:2592:2: rule__StatusList__Group_2__1__Impl
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
    // InternalMy.g:2598:1: rule__StatusList__Group_2__1__Impl : ( ( rule__StatusList__StatusAssignment_2_1 ) ) ;
    public final void rule__StatusList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2602:1: ( ( ( rule__StatusList__StatusAssignment_2_1 ) ) )
            // InternalMy.g:2603:1: ( ( rule__StatusList__StatusAssignment_2_1 ) )
            {
            // InternalMy.g:2603:1: ( ( rule__StatusList__StatusAssignment_2_1 ) )
            // InternalMy.g:2604:2: ( rule__StatusList__StatusAssignment_2_1 )
            {
             before(grammarAccess.getStatusListAccess().getStatusAssignment_2_1()); 
            // InternalMy.g:2605:2: ( rule__StatusList__StatusAssignment_2_1 )
            // InternalMy.g:2605:3: rule__StatusList__StatusAssignment_2_1
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
    // InternalMy.g:2614:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2618:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalMy.g:2619:2: rule__Status__Group__0__Impl rule__Status__Group__1
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
    // InternalMy.g:2626:1: rule__Status__Group__0__Impl : ( () ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2630:1: ( ( () ) )
            // InternalMy.g:2631:1: ( () )
            {
            // InternalMy.g:2631:1: ( () )
            // InternalMy.g:2632:2: ()
            {
             before(grammarAccess.getStatusAccess().getStatusAction_0()); 
            // InternalMy.g:2633:2: ()
            // InternalMy.g:2633:3: 
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
    // InternalMy.g:2641:1: rule__Status__Group__1 : rule__Status__Group__1__Impl ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2645:1: ( rule__Status__Group__1__Impl )
            // InternalMy.g:2646:2: rule__Status__Group__1__Impl
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
    // InternalMy.g:2652:1: rule__Status__Group__1__Impl : ( ( rule__Status__NameAssignment_1 ) ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2656:1: ( ( ( rule__Status__NameAssignment_1 ) ) )
            // InternalMy.g:2657:1: ( ( rule__Status__NameAssignment_1 ) )
            {
            // InternalMy.g:2657:1: ( ( rule__Status__NameAssignment_1 ) )
            // InternalMy.g:2658:2: ( rule__Status__NameAssignment_1 )
            {
             before(grammarAccess.getStatusAccess().getNameAssignment_1()); 
            // InternalMy.g:2659:2: ( rule__Status__NameAssignment_1 )
            // InternalMy.g:2659:3: rule__Status__NameAssignment_1
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


    // $ANTLR start "rule__SServiceName__NameAssignment_0"
    // InternalMy.g:2668:1: rule__SServiceName__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__SServiceName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2672:1: ( ( ruleEString ) )
            // InternalMy.g:2673:2: ( ruleEString )
            {
            // InternalMy.g:2673:2: ( ruleEString )
            // InternalMy.g:2674:3: ruleEString
            {
             before(grammarAccess.getSServiceNameAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSServiceNameAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SServiceName__NameAssignment_0"


    // $ANTLR start "rule__SServiceName__ServiceconfigAssignment_2"
    // InternalMy.g:2683:1: rule__SServiceName__ServiceconfigAssignment_2 : ( ruleServiceConfig ) ;
    public final void rule__SServiceName__ServiceconfigAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2687:1: ( ( ruleServiceConfig ) )
            // InternalMy.g:2688:2: ( ruleServiceConfig )
            {
            // InternalMy.g:2688:2: ( ruleServiceConfig )
            // InternalMy.g:2689:3: ruleServiceConfig
            {
             before(grammarAccess.getSServiceNameAccess().getServiceconfigServiceConfigParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConfig();

            state._fsp--;

             after(grammarAccess.getSServiceNameAccess().getServiceconfigServiceConfigParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SServiceName__ServiceconfigAssignment_2"


    // $ANTLR start "rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0"
    // InternalMy.g:2698:1: rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0 : ( ( 'closesOnPublicHolidays' ) ) ;
    public final void rule__ServiceConfig__ClosesOnPublicHolidaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2702:1: ( ( ( 'closesOnPublicHolidays' ) ) )
            // InternalMy.g:2703:2: ( ( 'closesOnPublicHolidays' ) )
            {
            // InternalMy.g:2703:2: ( ( 'closesOnPublicHolidays' ) )
            // InternalMy.g:2704:3: ( 'closesOnPublicHolidays' )
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysClosesOnPublicHolidaysKeyword_0_0()); 
            // InternalMy.g:2705:3: ( 'closesOnPublicHolidays' )
            // InternalMy.g:2706:4: 'closesOnPublicHolidays'
            {
             before(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysClosesOnPublicHolidaysKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysClosesOnPublicHolidaysKeyword_0_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getClosesOnPublicHolidaysClosesOnPublicHolidaysKeyword_0_0()); 

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
    // InternalMy.g:2717:1: rule__ServiceConfig__InventoryIsPublicAssignment_1 : ( ( 'inventoryIsPublic' ) ) ;
    public final void rule__ServiceConfig__InventoryIsPublicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2721:1: ( ( ( 'inventoryIsPublic' ) ) )
            // InternalMy.g:2722:2: ( ( 'inventoryIsPublic' ) )
            {
            // InternalMy.g:2722:2: ( ( 'inventoryIsPublic' ) )
            // InternalMy.g:2723:3: ( 'inventoryIsPublic' )
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventoryIsPublicKeyword_1_0()); 
            // InternalMy.g:2724:3: ( 'inventoryIsPublic' )
            // InternalMy.g:2725:4: 'inventoryIsPublic'
            {
             before(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventoryIsPublicKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventoryIsPublicKeyword_1_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getInventoryIsPublicInventoryIsPublicKeyword_1_0()); 

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
    // InternalMy.g:2736:1: rule__ServiceConfig__HasChartAssignment_2 : ( ( 'hasChart' ) ) ;
    public final void rule__ServiceConfig__HasChartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2740:1: ( ( ( 'hasChart' ) ) )
            // InternalMy.g:2741:2: ( ( 'hasChart' ) )
            {
            // InternalMy.g:2741:2: ( ( 'hasChart' ) )
            // InternalMy.g:2742:3: ( 'hasChart' )
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartHasChartKeyword_2_0()); 
            // InternalMy.g:2743:3: ( 'hasChart' )
            // InternalMy.g:2744:4: 'hasChart'
            {
             before(grammarAccess.getServiceConfigAccess().getHasChartHasChartKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getHasChartHasChartKeyword_2_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getHasChartHasChartKeyword_2_0()); 

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
    // InternalMy.g:2755:1: rule__ServiceConfig__CountInBusinessDaysAssignment_3 : ( ( 'countInBusinessDays' ) ) ;
    public final void rule__ServiceConfig__CountInBusinessDaysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2759:1: ( ( ( 'countInBusinessDays' ) ) )
            // InternalMy.g:2760:2: ( ( 'countInBusinessDays' ) )
            {
            // InternalMy.g:2760:2: ( ( 'countInBusinessDays' ) )
            // InternalMy.g:2761:3: ( 'countInBusinessDays' )
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCountInBusinessDaysKeyword_3_0()); 
            // InternalMy.g:2762:3: ( 'countInBusinessDays' )
            // InternalMy.g:2763:4: 'countInBusinessDays'
            {
             before(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCountInBusinessDaysKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCountInBusinessDaysKeyword_3_0()); 

            }

             after(grammarAccess.getServiceConfigAccess().getCountInBusinessDaysCountInBusinessDaysKeyword_3_0()); 

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
    // InternalMy.g:2774:1: rule__ServiceConfig__CountryAssignment_6 : ( ruleCountry ) ;
    public final void rule__ServiceConfig__CountryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2778:1: ( ( ruleCountry ) )
            // InternalMy.g:2779:2: ( ruleCountry )
            {
            // InternalMy.g:2779:2: ( ruleCountry )
            // InternalMy.g:2780:3: ruleCountry
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
    // InternalMy.g:2789:1: rule__ServiceConfig__CountryAssignment_7_1 : ( ruleCountry ) ;
    public final void rule__ServiceConfig__CountryAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2793:1: ( ( ruleCountry ) )
            // InternalMy.g:2794:2: ( ruleCountry )
            {
            // InternalMy.g:2794:2: ( ruleCountry )
            // InternalMy.g:2795:3: ruleCountry
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


    // $ANTLR start "rule__ServiceConfig__PricingsystemAssignment_8_2"
    // InternalMy.g:2804:1: rule__ServiceConfig__PricingsystemAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConfig__PricingsystemAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2808:1: ( ( ( ruleEString ) ) )
            // InternalMy.g:2809:2: ( ( ruleEString ) )
            {
            // InternalMy.g:2809:2: ( ( ruleEString ) )
            // InternalMy.g:2810:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_2_0()); 
            // InternalMy.g:2811:3: ( ruleEString )
            // InternalMy.g:2812:4: ruleEString
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_2_0()); 

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
    // $ANTLR end "rule__ServiceConfig__PricingsystemAssignment_8_2"


    // $ANTLR start "rule__ServiceConfig__PricingsystemAssignment_8_3_1"
    // InternalMy.g:2823:1: rule__ServiceConfig__PricingsystemAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConfig__PricingsystemAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2827:1: ( ( ( ruleEString ) ) )
            // InternalMy.g:2828:2: ( ( ruleEString ) )
            {
            // InternalMy.g:2828:2: ( ( ruleEString ) )
            // InternalMy.g:2829:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_3_1_0()); 
            // InternalMy.g:2830:3: ( ruleEString )
            // InternalMy.g:2831:4: ruleEString
            {
             before(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getServiceConfigAccess().getPricingsystemPricingSystemCrossReference_8_3_1_0()); 

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
    // $ANTLR end "rule__ServiceConfig__PricingsystemAssignment_8_3_1"


    // $ANTLR start "rule__ServiceConfig__LanguageAssignment_11"
    // InternalMy.g:2842:1: rule__ServiceConfig__LanguageAssignment_11 : ( ruleLanguage ) ;
    public final void rule__ServiceConfig__LanguageAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2846:1: ( ( ruleLanguage ) )
            // InternalMy.g:2847:2: ( ruleLanguage )
            {
            // InternalMy.g:2847:2: ( ruleLanguage )
            // InternalMy.g:2848:3: ruleLanguage
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__ServiceConfig__LanguageAssignment_11"


    // $ANTLR start "rule__ServiceConfig__LanguageAssignment_12_1"
    // InternalMy.g:2857:1: rule__ServiceConfig__LanguageAssignment_12_1 : ( ruleLanguage ) ;
    public final void rule__ServiceConfig__LanguageAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2861:1: ( ( ruleLanguage ) )
            // InternalMy.g:2862:2: ( ruleLanguage )
            {
            // InternalMy.g:2862:2: ( ruleLanguage )
            // InternalMy.g:2863:3: ruleLanguage
            {
             before(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLanguageLanguageParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__ServiceConfig__LanguageAssignment_12_1"


    // $ANTLR start "rule__ServiceConfig__ReservationsconfigAssignment_15"
    // InternalMy.g:2872:1: rule__ServiceConfig__ReservationsconfigAssignment_15 : ( ruleReservationsConfig ) ;
    public final void rule__ServiceConfig__ReservationsconfigAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2876:1: ( ( ruleReservationsConfig ) )
            // InternalMy.g:2877:2: ( ruleReservationsConfig )
            {
            // InternalMy.g:2877:2: ( ruleReservationsConfig )
            // InternalMy.g:2878:3: ruleReservationsConfig
            {
             before(grammarAccess.getServiceConfigAccess().getReservationsconfigReservationsConfigParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleReservationsConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getReservationsconfigReservationsConfigParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__ServiceConfig__ReservationsconfigAssignment_15"


    // $ANTLR start "rule__ServiceConfig__ResourcesconfigAssignment_18"
    // InternalMy.g:2887:1: rule__ServiceConfig__ResourcesconfigAssignment_18 : ( ruleResourcesConfig ) ;
    public final void rule__ServiceConfig__ResourcesconfigAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2891:1: ( ( ruleResourcesConfig ) )
            // InternalMy.g:2892:2: ( ruleResourcesConfig )
            {
            // InternalMy.g:2892:2: ( ruleResourcesConfig )
            // InternalMy.g:2893:3: ruleResourcesConfig
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleResourcesConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__ServiceConfig__ResourcesconfigAssignment_18"


    // $ANTLR start "rule__ServiceConfig__ResourcesconfigAssignment_19_1"
    // InternalMy.g:2902:1: rule__ServiceConfig__ResourcesconfigAssignment_19_1 : ( ruleResourcesConfig ) ;
    public final void rule__ServiceConfig__ResourcesconfigAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2906:1: ( ( ruleResourcesConfig ) )
            // InternalMy.g:2907:2: ( ruleResourcesConfig )
            {
            // InternalMy.g:2907:2: ( ruleResourcesConfig )
            // InternalMy.g:2908:3: ruleResourcesConfig
            {
             before(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourcesConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getResourcesconfigResourcesConfigParserRuleCall_19_1_0()); 

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
    // $ANTLR end "rule__ServiceConfig__ResourcesconfigAssignment_19_1"


    // $ANTLR start "rule__ServiceConfig__LotsconfigAssignment_20_2"
    // InternalMy.g:2917:1: rule__ServiceConfig__LotsconfigAssignment_20_2 : ( ruleLotsConfig ) ;
    public final void rule__ServiceConfig__LotsconfigAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2921:1: ( ( ruleLotsConfig ) )
            // InternalMy.g:2922:2: ( ruleLotsConfig )
            {
            // InternalMy.g:2922:2: ( ruleLotsConfig )
            // InternalMy.g:2923:3: ruleLotsConfig
            {
             before(grammarAccess.getServiceConfigAccess().getLotsconfigLotsConfigParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLotsConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getLotsconfigLotsConfigParserRuleCall_20_2_0()); 

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
    // $ANTLR end "rule__ServiceConfig__LotsconfigAssignment_20_2"


    // $ANTLR start "rule__Language__NameAssignment_1"
    // InternalMy.g:2932:1: rule__Language__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2936:1: ( ( ruleEString ) )
            // InternalMy.g:2937:2: ( ruleEString )
            {
            // InternalMy.g:2937:2: ( ruleEString )
            // InternalMy.g:2938:3: ruleEString
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
    // InternalMy.g:2947:1: rule__ReservationsConfig__HasMoveOutCheckAssignment_0 : ( ( 'hasMoveOutCheck' ) ) ;
    public final void rule__ReservationsConfig__HasMoveOutCheckAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2951:1: ( ( ( 'hasMoveOutCheck' ) ) )
            // InternalMy.g:2952:2: ( ( 'hasMoveOutCheck' ) )
            {
            // InternalMy.g:2952:2: ( ( 'hasMoveOutCheck' ) )
            // InternalMy.g:2953:3: ( 'hasMoveOutCheck' )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckHasMoveOutCheckKeyword_0_0()); 
            // InternalMy.g:2954:3: ( 'hasMoveOutCheck' )
            // InternalMy.g:2955:4: 'hasMoveOutCheck'
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckHasMoveOutCheckKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckHasMoveOutCheckKeyword_0_0()); 

            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveOutCheckHasMoveOutCheckKeyword_0_0()); 

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
    // InternalMy.g:2966:1: rule__ReservationsConfig__HasMoveInCheckAssignment_1 : ( ( 'hasMoveInCheck' ) ) ;
    public final void rule__ReservationsConfig__HasMoveInCheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2970:1: ( ( ( 'hasMoveInCheck' ) ) )
            // InternalMy.g:2971:2: ( ( 'hasMoveInCheck' ) )
            {
            // InternalMy.g:2971:2: ( ( 'hasMoveInCheck' ) )
            // InternalMy.g:2972:3: ( 'hasMoveInCheck' )
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckHasMoveInCheckKeyword_1_0()); 
            // InternalMy.g:2973:3: ( 'hasMoveInCheck' )
            // InternalMy.g:2974:4: 'hasMoveInCheck'
            {
             before(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckHasMoveInCheckKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckHasMoveInCheckKeyword_1_0()); 

            }

             after(grammarAccess.getReservationsConfigAccess().getHasMoveInCheckHasMoveInCheckKeyword_1_0()); 

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


    // $ANTLR start "rule__ReservationsConfig__MinRequestAdvanceAssignment_3"
    // InternalMy.g:2985:1: rule__ReservationsConfig__MinRequestAdvanceAssignment_3 : ( ruleEInt ) ;
    public final void rule__ReservationsConfig__MinRequestAdvanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:2989:1: ( ( ruleEInt ) )
            // InternalMy.g:2990:2: ( ruleEInt )
            {
            // InternalMy.g:2990:2: ( ruleEInt )
            // InternalMy.g:2991:3: ruleEInt
            {
             before(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getMinRequestAdvanceEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ReservationsConfig__MinRequestAdvanceAssignment_3"


    // $ANTLR start "rule__ReservationsConfig__MaxRequestAdvanceAssignment_5"
    // InternalMy.g:3000:1: rule__ReservationsConfig__MaxRequestAdvanceAssignment_5 : ( ruleEInt ) ;
    public final void rule__ReservationsConfig__MaxRequestAdvanceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3004:1: ( ( ruleEInt ) )
            // InternalMy.g:3005:2: ( ruleEInt )
            {
            // InternalMy.g:3005:2: ( ruleEInt )
            // InternalMy.g:3006:3: ruleEInt
            {
             before(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getMaxRequestAdvanceEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ReservationsConfig__MaxRequestAdvanceAssignment_5"


    // $ANTLR start "rule__ReservationsConfig__StatuslistAssignment_8"
    // InternalMy.g:3015:1: rule__ReservationsConfig__StatuslistAssignment_8 : ( ruleStatusList ) ;
    public final void rule__ReservationsConfig__StatuslistAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3019:1: ( ( ruleStatusList ) )
            // InternalMy.g:3020:2: ( ruleStatusList )
            {
            // InternalMy.g:3020:2: ( ruleStatusList )
            // InternalMy.g:3021:3: ruleStatusList
            {
             before(grammarAccess.getReservationsConfigAccess().getStatuslistStatusListParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatusList();

            state._fsp--;

             after(grammarAccess.getReservationsConfigAccess().getStatuslistStatusListParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ReservationsConfig__StatuslistAssignment_8"


    // $ANTLR start "rule__Country__NameAssignment_0"
    // InternalMy.g:3030:1: rule__Country__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Country__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3034:1: ( ( ruleEString ) )
            // InternalMy.g:3035:2: ( ruleEString )
            {
            // InternalMy.g:3035:2: ( ruleEString )
            // InternalMy.g:3036:3: ruleEString
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
    // InternalMy.g:3045:1: rule__Country__LanguageAssignment_2 : ( ruleLanguage ) ;
    public final void rule__Country__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3049:1: ( ( ruleLanguage ) )
            // InternalMy.g:3050:2: ( ruleLanguage )
            {
            // InternalMy.g:3050:2: ( ruleLanguage )
            // InternalMy.g:3051:3: ruleLanguage
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
    // InternalMy.g:3060:1: rule__Country__PricingsystemAssignment_6 : ( rulePricingSystem ) ;
    public final void rule__Country__PricingsystemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3064:1: ( ( rulePricingSystem ) )
            // InternalMy.g:3065:2: ( rulePricingSystem )
            {
            // InternalMy.g:3065:2: ( rulePricingSystem )
            // InternalMy.g:3066:3: rulePricingSystem
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
    // InternalMy.g:3075:1: rule__ResourcesConfig__HasImageAssignment_1 : ( ( 'hasImage' ) ) ;
    public final void rule__ResourcesConfig__HasImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3079:1: ( ( ( 'hasImage' ) ) )
            // InternalMy.g:3080:2: ( ( 'hasImage' ) )
            {
            // InternalMy.g:3080:2: ( ( 'hasImage' ) )
            // InternalMy.g:3081:3: ( 'hasImage' )
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageHasImageKeyword_1_0()); 
            // InternalMy.g:3082:3: ( 'hasImage' )
            // InternalMy.g:3083:4: 'hasImage'
            {
             before(grammarAccess.getResourcesConfigAccess().getHasImageHasImageKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getHasImageHasImageKeyword_1_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getHasImageHasImageKeyword_1_0()); 

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
    // InternalMy.g:3094:1: rule__ResourcesConfig__HasOneStockPerSlotAssignment_2 : ( ( 'hasOneStockPerSlot' ) ) ;
    public final void rule__ResourcesConfig__HasOneStockPerSlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3098:1: ( ( ( 'hasOneStockPerSlot' ) ) )
            // InternalMy.g:3099:2: ( ( 'hasOneStockPerSlot' ) )
            {
            // InternalMy.g:3099:2: ( ( 'hasOneStockPerSlot' ) )
            // InternalMy.g:3100:3: ( 'hasOneStockPerSlot' )
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 
            // InternalMy.g:3101:3: ( 'hasOneStockPerSlot' )
            // InternalMy.g:3102:4: 'hasOneStockPerSlot'
            {
             before(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 

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
    // InternalMy.g:3113:1: rule__ResourcesConfig__IsConsumableAssignment_3 : ( ( 'isConsumable' ) ) ;
    public final void rule__ResourcesConfig__IsConsumableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3117:1: ( ( ( 'isConsumable' ) ) )
            // InternalMy.g:3118:2: ( ( 'isConsumable' ) )
            {
            // InternalMy.g:3118:2: ( ( 'isConsumable' ) )
            // InternalMy.g:3119:3: ( 'isConsumable' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableIsConsumableKeyword_3_0()); 
            // InternalMy.g:3120:3: ( 'isConsumable' )
            // InternalMy.g:3121:4: 'isConsumable'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsConsumableIsConsumableKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsConsumableIsConsumableKeyword_3_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsConsumableIsConsumableKeyword_3_0()); 

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
    // InternalMy.g:3132:1: rule__ResourcesConfig__IsLoanAssignment_4 : ( ( 'isLoan' ) ) ;
    public final void rule__ResourcesConfig__IsLoanAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3136:1: ( ( ( 'isLoan' ) ) )
            // InternalMy.g:3137:2: ( ( 'isLoan' ) )
            {
            // InternalMy.g:3137:2: ( ( 'isLoan' ) )
            // InternalMy.g:3138:3: ( 'isLoan' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanIsLoanKeyword_4_0()); 
            // InternalMy.g:3139:3: ( 'isLoan' )
            // InternalMy.g:3140:4: 'isLoan'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsLoanIsLoanKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsLoanIsLoanKeyword_4_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsLoanIsLoanKeyword_4_0()); 

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
    // InternalMy.g:3151:1: rule__ResourcesConfig__IsChargedAssignment_5 : ( ( 'isCharged' ) ) ;
    public final void rule__ResourcesConfig__IsChargedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3155:1: ( ( ( 'isCharged' ) ) )
            // InternalMy.g:3156:2: ( ( 'isCharged' ) )
            {
            // InternalMy.g:3156:2: ( ( 'isCharged' ) )
            // InternalMy.g:3157:3: ( 'isCharged' )
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedIsChargedKeyword_5_0()); 
            // InternalMy.g:3158:3: ( 'isCharged' )
            // InternalMy.g:3159:4: 'isCharged'
            {
             before(grammarAccess.getResourcesConfigAccess().getIsChargedIsChargedKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getResourcesConfigAccess().getIsChargedIsChargedKeyword_5_0()); 

            }

             after(grammarAccess.getResourcesConfigAccess().getIsChargedIsChargedKeyword_5_0()); 

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


    // $ANTLR start "rule__LotsConfig__HasImageAssignment_1"
    // InternalMy.g:3170:1: rule__LotsConfig__HasImageAssignment_1 : ( ( 'hasImage' ) ) ;
    public final void rule__LotsConfig__HasImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3174:1: ( ( ( 'hasImage' ) ) )
            // InternalMy.g:3175:2: ( ( 'hasImage' ) )
            {
            // InternalMy.g:3175:2: ( ( 'hasImage' ) )
            // InternalMy.g:3176:3: ( 'hasImage' )
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageHasImageKeyword_1_0()); 
            // InternalMy.g:3177:3: ( 'hasImage' )
            // InternalMy.g:3178:4: 'hasImage'
            {
             before(grammarAccess.getLotsConfigAccess().getHasImageHasImageKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getHasImageHasImageKeyword_1_0()); 

            }

             after(grammarAccess.getLotsConfigAccess().getHasImageHasImageKeyword_1_0()); 

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
    // $ANTLR end "rule__LotsConfig__HasImageAssignment_1"


    // $ANTLR start "rule__LotsConfig__HasOneStockPerSlotAssignment_2"
    // InternalMy.g:3189:1: rule__LotsConfig__HasOneStockPerSlotAssignment_2 : ( ( 'hasOneStockPerSlot' ) ) ;
    public final void rule__LotsConfig__HasOneStockPerSlotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3193:1: ( ( ( 'hasOneStockPerSlot' ) ) )
            // InternalMy.g:3194:2: ( ( 'hasOneStockPerSlot' ) )
            {
            // InternalMy.g:3194:2: ( ( 'hasOneStockPerSlot' ) )
            // InternalMy.g:3195:3: ( 'hasOneStockPerSlot' )
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 
            // InternalMy.g:3196:3: ( 'hasOneStockPerSlot' )
            // InternalMy.g:3197:4: 'hasOneStockPerSlot'
            {
             before(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 

            }

             after(grammarAccess.getLotsConfigAccess().getHasOneStockPerSlotHasOneStockPerSlotKeyword_2_0()); 

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
    // $ANTLR end "rule__LotsConfig__HasOneStockPerSlotAssignment_2"


    // $ANTLR start "rule__PricingSystem__NameAssignment_0"
    // InternalMy.g:3208:1: rule__PricingSystem__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__PricingSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3212:1: ( ( ruleEString ) )
            // InternalMy.g:3213:2: ( ruleEString )
            {
            // InternalMy.g:3213:2: ( ruleEString )
            // InternalMy.g:3214:3: ruleEString
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


    // $ANTLR start "rule__PricingSystem__CurrencyAssignment_3"
    // InternalMy.g:3223:1: rule__PricingSystem__CurrencyAssignment_3 : ( ruleEString ) ;
    public final void rule__PricingSystem__CurrencyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3227:1: ( ( ruleEString ) )
            // InternalMy.g:3228:2: ( ruleEString )
            {
            // InternalMy.g:3228:2: ( ruleEString )
            // InternalMy.g:3229:3: ruleEString
            {
             before(grammarAccess.getPricingSystemAccess().getCurrencyEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPricingSystemAccess().getCurrencyEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PricingSystem__CurrencyAssignment_3"


    // $ANTLR start "rule__PricingSystem__TaxSystemAssignment_6"
    // InternalMy.g:3238:1: rule__PricingSystem__TaxSystemAssignment_6 : ( ruleEString ) ;
    public final void rule__PricingSystem__TaxSystemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3242:1: ( ( ruleEString ) )
            // InternalMy.g:3243:2: ( ruleEString )
            {
            // InternalMy.g:3243:2: ( ruleEString )
            // InternalMy.g:3244:3: ruleEString
            {
             before(grammarAccess.getPricingSystemAccess().getTaxSystemEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPricingSystemAccess().getTaxSystemEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PricingSystem__TaxSystemAssignment_6"


    // $ANTLR start "rule__StatusList__StatusAssignment_1"
    // InternalMy.g:3253:1: rule__StatusList__StatusAssignment_1 : ( ruleStatus ) ;
    public final void rule__StatusList__StatusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3257:1: ( ( ruleStatus ) )
            // InternalMy.g:3258:2: ( ruleStatus )
            {
            // InternalMy.g:3258:2: ( ruleStatus )
            // InternalMy.g:3259:3: ruleStatus
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
    // InternalMy.g:3268:1: rule__StatusList__StatusAssignment_2_1 : ( ruleStatus ) ;
    public final void rule__StatusList__StatusAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3272:1: ( ( ruleStatus ) )
            // InternalMy.g:3273:2: ( ruleStatus )
            {
            // InternalMy.g:3273:2: ( ruleStatus )
            // InternalMy.g:3274:3: ruleStatus
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
    // InternalMy.g:3283:1: rule__Status__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Status__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:3287:1: ( ( ruleEString ) )
            // InternalMy.g:3288:2: ( ruleEString )
            {
            // InternalMy.g:3288:2: ( ruleEString )
            // InternalMy.g:3289:3: ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000F0001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007C01000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001010000L});

}