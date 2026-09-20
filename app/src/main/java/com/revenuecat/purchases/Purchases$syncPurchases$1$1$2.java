package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import defpackage.Md5A;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$syncPurchases$1$1$2 extends cx1 implements j81<PurchasesError, sd5> {
    final /* synthetic */ StoreTransaction $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$syncPurchases$1$1$2(StoreTransaction storeTransaction) {
        super(1);
        this.$purchase = storeTransaction;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        Md5A.h(new Object[]{this.$purchase, purchasesError}, 2, PurchaseStrings.SYNCING_PURCHASES_ERROR_DETAILS, LogIntent.RC_ERROR);
    }
}
