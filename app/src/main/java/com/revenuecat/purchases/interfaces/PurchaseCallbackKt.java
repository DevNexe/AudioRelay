package com.revenuecat.purchases.interfaces;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchaserInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.PaymenTransactionConversionsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.sd5;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseCallbackKt {
    public static final PurchaseCallback toPurchaseCallback(final MakePurchaseListener makePurchaseListener) {
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.interfaces.PurchaseCallbackKt.toPurchaseCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                sd5 sd5Var;
                Purchase originalGooglePurchase = PaymenTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
                if (originalGooglePurchase != null) {
                    makePurchaseListener.onCompleted(originalGooglePurchase, new PurchaserInfo(customerInfo));
                    sd5Var = sd5.a;
                } else {
                    sd5Var = null;
                }
                if (sd5Var == null) {
                    throw new IllegalArgumentException("Couldn't find original Google purchase");
                }
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z) {
                makePurchaseListener.onError(purchasesError, z);
            }
        };
    }
}
