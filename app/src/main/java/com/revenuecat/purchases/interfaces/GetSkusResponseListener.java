package com.revenuecat.purchases.interfaces;

import com.android.billingclient.api.SkuDetails;
import com.revenuecat.purchases.PurchasesError;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface GetSkusResponseListener {
    void onError(PurchasesError purchasesError);

    void onReceived(List<? extends SkuDetails> list);
}
