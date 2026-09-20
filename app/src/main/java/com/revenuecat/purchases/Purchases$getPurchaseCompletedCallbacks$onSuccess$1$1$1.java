package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$getPurchaseCompletedCallbacks$onSuccess$1$1$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ PurchaseCallback $purchaseCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$getPurchaseCompletedCallbacks$onSuccess$1$1$1(PurchaseCallback purchaseCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$purchaseCallback = purchaseCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$purchaseCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
