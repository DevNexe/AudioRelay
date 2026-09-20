package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$updatePendingPurchaseQueue$1$1$2 extends cx1 implements j81<PurchasesError, sd5> {
    public static final Purchases$updatePendingPurchaseQueue$1$1$2 INSTANCE = new Purchases$updatePendingPurchaseQueue$1$1$2();

    public Purchases$updatePendingPurchaseQueue$1$1$2() {
        super(1);
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.getMessage());
    }
}
