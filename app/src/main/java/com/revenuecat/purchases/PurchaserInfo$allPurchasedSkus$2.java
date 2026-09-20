package com.revenuecat.purchases;

import com.revenuecat.purchases.models.Transaction;
import defpackage.cx1;
import defpackage.h81;
import defpackage.mu;
import defpackage.og4;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaserInfo$allPurchasedSkus$2 extends cx1 implements h81<Set<? extends String>> {
    final /* synthetic */ PurchaserInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaserInfo$allPurchasedSkus$2(PurchaserInfo purchaserInfo) {
        super(0);
        this.this$0 = purchaserInfo;
    }

    @Override // defpackage.h81
    public final Set<? extends String> invoke() {
        List<Transaction> nonSubscriptionTransactions = this.this$0.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(mu.w0(nonSubscriptionTransactions, 10));
        Iterator<T> it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Transaction) it.next()).getProductIdentifier());
        }
        return og4.c0(wu.h1(arrayList), this.this$0.getAllExpirationDatesByProduct().keySet());
    }
}
