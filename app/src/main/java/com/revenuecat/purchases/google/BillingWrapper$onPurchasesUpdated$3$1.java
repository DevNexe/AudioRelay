package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import defpackage.cx1;
import defpackage.j81;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper$onPurchasesUpdated$3$1 extends cx1 implements j81<Purchase, CharSequence> {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    public BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    @Override // defpackage.j81
    public final CharSequence invoke(Purchase purchase) {
        return PurchaseExtensionsKt.toHumanReadableDescription(purchase);
    }
}
