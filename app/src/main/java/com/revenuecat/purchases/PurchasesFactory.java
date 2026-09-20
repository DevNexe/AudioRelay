package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import defpackage.iv4;
import defpackage.kg0;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    public PurchasesFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PurchasesFactory(APIKeyValidator aPIKeyValidator) {
        this.apiKeyValidator = aPIKeyValidator;
    }

    private final ExecutorService createDefaultExecutor() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return (Application) applicationContext;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final Purchases createPurchases(PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url) {
        validateConfiguration(purchasesConfiguration);
        Application application = getApplication(purchasesConfiguration.getContext());
        AppConfig appConfig = new AppConfig(purchasesConfiguration.getContext(), purchasesConfiguration.getObserverMode(), platformInfo, url, purchasesConfiguration.getStore(), purchasesConfiguration.getDangerousSettings());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(ETagManager.Companion.initializeSharedPreferences(purchasesConfiguration.getContext()));
        ExecutorService service = purchasesConfiguration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher = new Dispatcher(service);
        Backend backend = new Backend(purchasesConfiguration.getApiKey(), dispatcher, new HTTPClient(appConfig, eTagManager));
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backend);
        DeviceCache deviceCache = new DeviceCache(defaultSharedPreferences, purchasesConfiguration.getApiKey(), null, null, 12, null);
        BillingAbstract billingAbstractCreateBilling = BillingFactory.INSTANCE.createBilling(purchasesConfiguration.getStore(), application, backend, deviceCache, purchasesConfiguration.getObserverMode());
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(purchasesConfiguration.getStore(), dispatcher);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, backend);
        return new Purchases(application, purchasesConfiguration.getAppUserID(), backend, billingAbstractCreateBilling, deviceCache, dispatcher, identityManager, subscriberAttributesManager, appConfig, new CustomerInfoHelper(deviceCache, backend, identityManager, null, 8, null), null, 1024, null);
    }

    public final void validateConfiguration(PurchasesConfiguration purchasesConfiguration) {
        if (!hasPermission(purchasesConfiguration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.".toString());
        }
        if (!(!iv4.s(purchasesConfiguration.getApiKey()))) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app".toString());
        }
        if (!(purchasesConfiguration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.".toString());
        }
        this.apiKeyValidator.validateAndLog(purchasesConfiguration.getApiKey(), purchasesConfiguration.getStore());
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i, kg0 kg0Var) {
        this((i & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
