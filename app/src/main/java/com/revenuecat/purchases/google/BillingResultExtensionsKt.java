package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(com.android.billingclient.api.NUlFixed nUl) {
        return nUl.a == 0;
    }

    public static final String toHumanReadableDescription(com.android.billingclient.api.NUlFixed nUl) {
        return "DebugMessage: " + nUl.b + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(nUl.a) + '.';
    }
}
