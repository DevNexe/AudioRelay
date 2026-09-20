package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.OW8;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;
import defpackage.wu;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$restorePurchases$1$1 extends cx1 implements j81<List<? extends StoreTransaction>, sd5> {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ boolean $finishTransactions;
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$restorePurchases$1$1(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str, boolean z) {
        super(1);
        this.this$0 = purchases;
        this.$callback = receiveCustomerInfoCallback;
        this.$appUserID = str;
        this.$finishTransactions = z;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(List<? extends StoreTransaction> list) {
        invoke2((List<StoreTransaction>) list);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<StoreTransaction> list) {
        if (list.isEmpty()) {
            this.this$0.getCustomerInfo(this.$callback);
            return;
        }
        List listZ0 = wu.Z0(list, new Comparator() { // from class: com.revenuecat.purchases.Purchases$restorePurchases$1$1$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return OW8.m(Long.valueOf(((StoreTransaction) t).getPurchaseTime()), Long.valueOf(((StoreTransaction) t2).getPurchaseTime()));
            }
        });
        Purchases purchases = this.this$0;
        String str = this.$appUserID;
        boolean z = this.$finishTransactions;
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            purchases.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new Purchases$restorePurchases$1$1$2$1$1((StoreTransaction) it.next(), purchases, str, z, listZ0, receiveCustomerInfoCallback));
        }
    }
}
