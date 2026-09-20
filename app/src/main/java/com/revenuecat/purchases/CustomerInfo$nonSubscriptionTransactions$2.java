package com.revenuecat.purchases;

import com.revenuecat.purchases.models.Transaction;
import defpackage.OW8;
import defpackage.cx1;
import defpackage.h81;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfo$nonSubscriptionTransactions$2 extends cx1 implements h81<List<? extends Transaction>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // defpackage.h81
    public final List<? extends Transaction> invoke() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject("non_subscriptions");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new Transaction(next, jSONArray.getJSONObject(i)));
            }
        }
        return wu.Z0(arrayList, new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return OW8.m(((Transaction) t).getPurchaseDate(), ((Transaction) t2).getPurchaseDate());
            }
        });
    }
}
