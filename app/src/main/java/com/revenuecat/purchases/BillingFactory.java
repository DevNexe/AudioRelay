package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.google.BillingWrapper;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            iArr[Store.PLAY_STORE.ordinal()] = 1;
            iArr[Store.AMAZON.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, Backend backend, DeviceCache deviceCache, boolean z) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application), new Handler(application.getMainLooper()), deviceCache);
        }
        if (i == 2) {
            try {
                Object objNewInstance = Class.forName("com.revenuecat.purchases.amazon.AmazonBilling").getConstructor(Context.class, Backend.class, DeviceCache.class, Boolean.TYPE, Handler.class).newInstance(application.getApplicationContext(), backend, deviceCache, Boolean.valueOf(z), new Handler(application.getMainLooper()));
                if (objNewInstance != null) {
                    return (BillingAbstract) objNewInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.common.BillingAbstract");
            } catch (ClassNotFoundException e) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e);
                throw e;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
