package com.revenuecat.purchases.google;

import android.text.TextUtils;
import com.revenuecat.purchases.common.ReplaceSkuInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(com.android.billingclient.api.F1.QnHx qnHx, ReplaceSkuInfo replaceSkuInfo) {
        String purchaseToken = replaceSkuInfo.getOldPurchase().getPurchaseToken();
        Integer prorationMode = replaceSkuInfo.getProrationMode();
        int iIntValue = prorationMode != null ? prorationMode.intValue() : 0;
        if (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) {
            throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
        }
        qnHx.b = purchaseToken;
        qnHx.c = iIntValue;
    }
}
