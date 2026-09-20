package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import defpackage.Md5A;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$updatePendingPurchaseQueue$1$1$1 extends cx1 implements j81<Map<String, ? extends StoreTransaction>, sd5> {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ Purchases this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$updatePendingPurchaseQueue$1$1$1(Purchases purchases, String str) {
        super(1);
        this.this$0 = purchases;
        this.$appUserID = str;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends StoreTransaction> map) {
        invoke2((Map<String, StoreTransaction>) map);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, StoreTransaction> map) {
        for (Map.Entry<String, StoreTransaction> entry : map.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            Md5A.h(new Object[]{value.getType(), key}, 2, RestoreStrings.QUERYING_PURCHASE_WITH_HASH, LogIntent.DEBUG);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens(map.keySet());
        Purchases purchases = this.this$0;
        purchases.postPurchases(purchases.deviceCache.getActivePurchasesNotInCache(map), this.this$0.getAllowSharingPlayStoreAccount(), this.this$0.getFinishTransactions(), this.$appUserID, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
    }
}
