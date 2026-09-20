package com.revenuecat.purchases.google;

import com.android.billingclient.api.SkuDetails;
import defpackage.cx1;
import defpackage.j81;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper$querySkuDetailsAsync$1$1$1$1 extends cx1 implements j81<SkuDetails, CharSequence> {
    public static final BillingWrapper$querySkuDetailsAsync$1$1$1$1 INSTANCE = new BillingWrapper$querySkuDetailsAsync$1$1$1$1();

    public BillingWrapper$querySkuDetailsAsync$1$1$1$1() {
        super(1);
    }

    @Override // defpackage.j81
    public final CharSequence invoke(SkuDetails skuDetails) {
        return skuDetails.toString();
    }
}
