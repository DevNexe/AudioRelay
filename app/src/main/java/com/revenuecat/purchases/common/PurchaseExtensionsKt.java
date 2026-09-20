package com.revenuecat.purchases.common;

import com.android.billingclient.api.Purchase;
import defpackage.wu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstSku(Purchase purchase) {
        String str = purchase.b().get(0);
        if (purchase.b().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        return str;
    }

    public static final ArrayList<String> getListOfSkus(Purchase purchase) {
        return purchase.b();
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        return "skus: " + wu.M0(purchase.b(), null, "[", "]", null, 57) + ", orderId: " + purchase.c.optString("orderId") + ", purchaseToken: " + purchase.a();
    }
}
