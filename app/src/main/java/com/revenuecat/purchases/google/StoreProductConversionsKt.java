package com.revenuecat.purchases.google;

import com.android.billingclient.api.SkuDetails;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.iv4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreProductConversionsKt {
    public static final StoreProduct toStoreProduct(SkuDetails skuDetails) {
        String strOptString = skuDetails.b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        ProductType productType = ProductTypeConversionsKt.toProductType(skuDetails.a());
        JSONObject jSONObject = skuDetails.b;
        String strOptString2 = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        long jOptLong = jSONObject.optLong("price_amount_micros");
        String strOptString3 = jSONObject.optString("price_currency_code");
        String strOptString4 = jSONObject.has("original_price") ? jSONObject.optString("original_price") : jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        long jOptLong2 = jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : jSONObject.optLong("price_amount_micros");
        String strOptString5 = jSONObject.optString("title");
        String strOptString6 = jSONObject.optString("description");
        String strOptString7 = jSONObject.optString("subscriptionPeriod");
        if (!(!iv4.s(strOptString7))) {
            strOptString7 = null;
        }
        String strOptString8 = jSONObject.optString("freeTrialPeriod");
        String str = iv4.s(strOptString8) ^ true ? strOptString8 : null;
        String strOptString9 = jSONObject.optString("introductoryPrice");
        String str2 = iv4.s(strOptString9) ^ true ? strOptString9 : null;
        long jOptLong3 = jSONObject.optLong("introductoryPriceAmountMicros");
        String strOptString10 = jSONObject.optString("introductoryPricePeriod");
        return new StoreProduct(strOptString, productType, strOptString2, jOptLong, strOptString3, strOptString4, jOptLong2, strOptString5, strOptString6, strOptString7, str, str2, jOptLong3, iv4.s(strOptString10) ^ true ? strOptString10 : null, jSONObject.optInt("introductoryPriceCycles"), jSONObject.optString("iconUrl"), new JSONObject(skuDetails.a));
    }
}
