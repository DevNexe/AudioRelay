package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchaserInfo;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes3.dex */
public interface ReceivePurchaserInfoListener {
    void onError(PurchasesError purchasesError);

    void onReceived(PurchaserInfo purchaserInfo);
}
