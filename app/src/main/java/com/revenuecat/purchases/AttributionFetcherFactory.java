package com.revenuecat.purchases;

import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributionFetcherFactory {
    public static final AttributionFetcherFactory INSTANCE = new AttributionFetcherFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            iArr[Store.PLAY_STORE.ordinal()] = 1;
            iArr[Store.AMAZON.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AttributionFetcherFactory() {
    }

    public final DeviceIdentifiersFetcher createAttributionFetcher(Store store, Dispatcher dispatcher) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i == 1) {
            return new GoogleDeviceIdentifiersFetcher(dispatcher);
        }
        if (i == 2) {
            try {
                Object objNewInstance = Class.forName("com.revenuecat.purchases.amazon.attribution.AmazonDeviceIdentifiersFetcher").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance != null) {
                    return (DeviceIdentifiersFetcher) objNewInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher");
            } catch (ClassNotFoundException e) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e);
                throw e;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
