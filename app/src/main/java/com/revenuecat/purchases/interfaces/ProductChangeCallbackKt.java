package com.revenuecat.purchases.interfaces;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchaserInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.PaymenTransactionConversionsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductChangeCallbackKt {
    public static final ProductChangeCallback toProductChangeCallback(final ProductChangeListener productChangeListener) {
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.interfaces.ProductChangeCallbackKt.toProductChangeCallback.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                sd5 sd5Var = null;
                if (storeTransaction == null) {
                    productChangeListener.onCompleted(null, new PurchaserInfo(customerInfo));
                    return;
                }
                Purchase originalGooglePurchase = PaymenTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
                if (originalGooglePurchase != null) {
                    productChangeListener.onCompleted(originalGooglePurchase, new PurchaserInfo(customerInfo));
                    sd5Var = sd5.a;
                }
                if (sd5Var == null) {
                    throw new IllegalArgumentException("Couldn't find original Google purchase");
                }
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z) {
                productChangeListener.onError(purchasesError, z);
            }
        };
    }
}
