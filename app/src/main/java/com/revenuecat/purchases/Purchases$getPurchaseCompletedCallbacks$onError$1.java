package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$getPurchaseCompletedCallbacks$onError$1 extends cx1 implements x81<StoreTransaction, PurchasesError, sd5> {
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$getPurchaseCompletedCallbacks$onError$1(Purchases purchases) {
        super(2);
        this.this$0 = purchases;
    }

    @Override // defpackage.x81
    public /* bridge */ /* synthetic */ sd5 invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        invoke2(storeTransaction, purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        PurchaseCallback purchaseCallback = this.this$0.getPurchaseCallback(storeTransaction.getSkus().get(0));
        if (purchaseCallback != null) {
            this.this$0.dispatch(purchaseCallback, purchasesError);
        }
    }
}
