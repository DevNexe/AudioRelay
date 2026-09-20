package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import defpackage.cx1;
import defpackage.j81;
import defpackage.jl3;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2 extends cx1 implements j81<CustomerInfo, sd5> {
    final /* synthetic */ jl3<ProductChangeCallback> $productChangeListener;
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2(jl3<ProductChangeCallback> jl3Var, Purchases purchases) {
        super(1);
        this.$productChangeListener = jl3Var;
        this.this$0 = purchases;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo) {
        invoke2(customerInfo);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerInfo customerInfo) {
        ProductChangeCallback productChangeCallback = this.$productChangeListener.w;
        if (productChangeCallback != null) {
            this.this$0.dispatch(new Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2$1$1(productChangeCallback, customerInfo));
        }
    }
}
