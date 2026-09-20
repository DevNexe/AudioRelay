package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper$onPurchasesUpdated$1$1 extends cx1 implements j81<StoreTransaction, sd5> {
    final /* synthetic */ List<Purchase> $notNullPurchasesList;
    final /* synthetic */ List<StoreTransaction> $storeTransactions;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingWrapper$onPurchasesUpdated$1$1(List<StoreTransaction> list, List<? extends Purchase> list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(StoreTransaction storeTransaction) {
        invoke2(storeTransaction);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        this.$storeTransactions.add(storeTransaction);
        if (this.$storeTransactions.size() != this.$notNullPurchasesList.size() || (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) == null) {
            return;
        }
        purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
    }
}
