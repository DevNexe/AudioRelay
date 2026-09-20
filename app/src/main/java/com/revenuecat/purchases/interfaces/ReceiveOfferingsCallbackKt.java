package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveOfferingsCallbackKt {
    public static final ReceiveOfferingsCallback toReceiveOfferingsCallback(final ReceiveOfferingsListener receiveOfferingsListener) {
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.interfaces.ReceiveOfferingsCallbackKt.toReceiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                receiveOfferingsListener.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                receiveOfferingsListener.onReceived(offerings);
            }
        };
    }
}
