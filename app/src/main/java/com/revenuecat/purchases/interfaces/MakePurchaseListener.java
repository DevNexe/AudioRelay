package com.revenuecat.purchases.interfaces;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PurchaserInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface MakePurchaseListener extends PurchaseErrorListener {
    void onCompleted(Purchase purchase, PurchaserInfo purchaserInfo);
}
