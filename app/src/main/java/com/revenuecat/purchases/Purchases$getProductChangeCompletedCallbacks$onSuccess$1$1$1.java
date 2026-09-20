package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$getProductChangeCompletedCallbacks$onSuccess$1$1$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ ProductChangeCallback $productChangeCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$getProductChangeCompletedCallbacks$onSuccess$1$1$1(ProductChangeCallback productChangeCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$productChangeCallback = productChangeCallback;
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
        this.$productChangeCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
