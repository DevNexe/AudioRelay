package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import defpackage.Md5A;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$syncPurchases$1$1$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ StoreTransaction $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$syncPurchases$1$1$1(StoreTransaction storeTransaction) {
        super(0);
        this.$purchase = storeTransaction;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Md5A.h(new Object[]{this.$purchase}, 1, PurchaseStrings.PURCHASE_SYNCED, LogIntent.PURCHASE);
    }
}
