package com.revenuecat.purchases.models;

import com.android.billingclient.api.SkuDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreProductHelpers {
    public static final SkuDetails getSkuDetails(StoreProduct storeProduct) {
        return new SkuDetails(storeProduct.getOriginalJson().toString());
    }
}
