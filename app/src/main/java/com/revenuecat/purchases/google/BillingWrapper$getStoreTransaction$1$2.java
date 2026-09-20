package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper$getStoreTransaction$1$2 extends cx1 implements j81<ProductType, sd5> {
    final /* synthetic */ j81<StoreTransaction, sd5> $completion;
    final /* synthetic */ String $presentedOffering;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingWrapper$getStoreTransaction$1$2(j81<? super StoreTransaction, sd5> j81Var, Purchase purchase, String str) {
        super(1);
        this.$completion = j81Var;
        this.$purchase = purchase;
        this.$presentedOffering = str;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(ProductType productType) {
        invoke2(productType);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductType productType) {
        this.$completion.invoke(PaymenTransactionConversionsKt.toStoreTransaction(this.$purchase, productType, this.$presentedOffering));
    }
}
