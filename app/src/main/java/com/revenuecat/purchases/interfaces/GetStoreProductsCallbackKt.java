package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreProductHelpers;
import defpackage.mu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetStoreProductsCallbackKt {
    public static final GetStoreProductsCallback toGetStoreProductsCallback(final GetSkusResponseListener getSkusResponseListener) {
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.interfaces.GetStoreProductsCallbackKt.toGetStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                getSkusResponseListener.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<StoreProduct> list) {
                GetSkusResponseListener getSkusResponseListener2 = getSkusResponseListener;
                List<StoreProduct> list2 = list;
                ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreProductHelpers.getSkuDetails((StoreProduct) it.next()));
                }
                getSkusResponseListener2.onReceived(arrayList);
            }
        };
    }
}
