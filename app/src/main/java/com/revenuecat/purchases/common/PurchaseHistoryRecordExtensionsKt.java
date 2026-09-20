package com.revenuecat.purchases.common;

import com.android.billingclient.api.PurchaseHistoryRecord;
import defpackage.wu;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        String str = purchaseHistoryRecord.a().get(0);
        if (purchaseHistoryRecord.a().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        return str;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        return purchaseHistoryRecord.a();
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        StringBuilder sb = new StringBuilder("skus: ");
        sb.append(wu.M0(purchaseHistoryRecord.a(), null, "[", "]", null, 57));
        sb.append(", purchaseTime: ");
        JSONObject jSONObject = purchaseHistoryRecord.c;
        sb.append(jSONObject.optLong("purchaseTime"));
        sb.append(", purchaseToken: ");
        sb.append(jSONObject.optString("token", jSONObject.optString("purchaseToken")));
        return sb.toString();
    }
}
