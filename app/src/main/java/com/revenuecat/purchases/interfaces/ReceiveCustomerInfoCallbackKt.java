package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchaserInfo;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveCustomerInfoCallbackKt {
    public static final ReceiveCustomerInfoCallback toReceiveCustomerInfoCallback(final ReceivePurchaserInfoListener receivePurchaserInfoListener) {
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallbackKt.toReceiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                receivePurchaserInfoListener.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                receivePurchaserInfoListener.onReceived(new PurchaserInfo(customerInfo));
            }
        };
    }
}
