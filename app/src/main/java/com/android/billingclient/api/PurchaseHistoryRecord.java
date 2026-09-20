package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHistoryRecord {
    public final String a;
    public final String b;
    public final JSONObject c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public final ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.a, purchaseHistoryRecord.a) && TextUtils.equals(this.b, purchaseHistoryRecord.b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return strValueOf.length() != 0 ? "PurchaseHistoryRecord. Json: ".concat(strValueOf) : new String("PurchaseHistoryRecord. Json: ");
    }
}
