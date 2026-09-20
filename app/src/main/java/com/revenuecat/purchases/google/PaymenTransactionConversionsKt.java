package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymenTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (!(storeTransaction.getPurchaseType() == PurchaseType.GOOGLE_PURCHASE)) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, String str) {
        String strOptString = purchase.c.optString("orderId");
        ArrayList<String> listOfSkus = PurchaseExtensionsKt.getListOfSkus(purchase);
        JSONObject jSONObject = purchase.c;
        return new StoreTransaction(strOptString, listOfSkus, productType, jSONObject.optLong("purchaseTime"), purchase.a(), PurchaseStateConversionsKt.toRevenueCatPurchaseState(jSONObject.optInt("purchaseState", 1) == 4 ? 2 : 1), Boolean.valueOf(jSONObject.optBoolean("autoRenewing")), purchase.b, new JSONObject(purchase.a), str, null, PurchaseType.GOOGLE_PURCHASE, null);
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType productType) {
        ArrayList<String> listOfSkus = PurchaseHistoryRecordExtensionsKt.getListOfSkus(purchaseHistoryRecord);
        long jOptLong = purchaseHistoryRecord.c.optLong("purchaseTime");
        JSONObject jSONObject = purchaseHistoryRecord.c;
        return new StoreTransaction(null, listOfSkus, productType, jOptLong, jSONObject.optString("token", jSONObject.optString("purchaseToken")), PurchaseState.UNSPECIFIED_STATE, null, purchaseHistoryRecord.b, new JSONObject(purchaseHistoryRecord.a), null, null, PurchaseType.GOOGLE_RESTORED_PURCHASE, null);
    }
}
