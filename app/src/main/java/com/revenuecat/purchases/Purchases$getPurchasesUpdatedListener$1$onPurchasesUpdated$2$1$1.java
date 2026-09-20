package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import defpackage.cx1;
import defpackage.h81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2$1$1 extends cx1 implements h81<sd5> {
    final /* synthetic */ ProductChangeCallback $callback;
    final /* synthetic */ CustomerInfo $customerInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2$1$1(ProductChangeCallback productChangeCallback, CustomerInfo customerInfo) {
        super(0);
        this.$callback = productChangeCallback;
        this.$customerInfo = customerInfo;
    }

    @Override // defpackage.h81
    public /* bridge */ /* synthetic */ sd5 invoke() {
        invoke2();
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.onCompleted(null, this.$customerInfo);
    }
}
