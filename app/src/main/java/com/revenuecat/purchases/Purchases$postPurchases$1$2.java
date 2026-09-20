package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$postPurchases$1$2 extends cx1 implements j81<PurchasesError, sd5> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ boolean $consumeAllTransactions;
    final /* synthetic */ x81<StoreTransaction, PurchasesError, sd5> $onError;
    final /* synthetic */ x81<StoreTransaction, CustomerInfo, sd5> $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Purchases$postPurchases$1$2(Purchases purchases, StoreTransaction storeTransaction, boolean z, boolean z2, String str, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var, x81<? super StoreTransaction, ? super PurchasesError, sd5> x81Var2) {
        super(1);
        this.this$0 = purchases;
        this.$purchase = storeTransaction;
        this.$allowSharingPlayStoreAccount = z;
        this.$consumeAllTransactions = z2;
        this.$appUserID = str;
        this.$onSuccess = x81Var;
        this.$onError = x81Var2;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError purchasesError) {
        this.this$0.postToBackend$purchases_latestDependenciesRelease(this.$purchase, null, this.$allowSharingPlayStoreAccount, this.$consumeAllTransactions, this.$appUserID, this.$onSuccess, this.$onError);
    }
}
