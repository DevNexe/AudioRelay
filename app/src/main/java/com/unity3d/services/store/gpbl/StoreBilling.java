package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import com.unity3d.services.store.listeners.IPurchaseHistoryResponseListener;
import com.unity3d.services.store.listeners.IPurchaseUpdatedResponseListener;
import com.unity3d.services.store.listeners.IPurchasesResponseListener;
import com.unity3d.services.store.listeners.ISkuDetailsResponseListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class StoreBilling {
    private final IBillingClient _billingClientBridge;

    public StoreBilling(Context context, IPurchaseUpdatedResponseListener iPurchaseUpdatedResponseListener) {
        this._billingClientBridge = BillingClientBuilderFactory.getBillingClientBuilder(context).setListener(new PurchaseUpdatedListenerProxy(iPurchaseUpdatedResponseListener)).enablePendingPurchases().build();
    }

    public void getPurchaseHistory(String str, int i, IPurchaseHistoryResponseListener iPurchaseHistoryResponseListener) {
        this._billingClientBridge.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListenerProxy(iPurchaseHistoryResponseListener, i));
    }

    public void getPurchases(String str, IPurchasesResponseListener iPurchasesResponseListener) {
        this._billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(iPurchasesResponseListener));
    }

    public void getSkuDetails(String str, ArrayList<String> arrayList, ISkuDetailsResponseListener iSkuDetailsResponseListener) {
        this._billingClientBridge.querySkuDetailsAsync(SkuDetailsParamsBridge.newBuilder().setSkuList(arrayList).setType(str).build(), new SkuDetailsResponseListenerProxy(iSkuDetailsResponseListener));
    }

    public void initialize(IBillingClientStateListener iBillingClientStateListener) {
        this._billingClientBridge.startConnection(new BillingClientStateListenerProxy(iBillingClientStateListener));
    }

    public int isFeatureSupported(String str) {
        boolean zIsReady;
        if (str.equals("inapp")) {
            zIsReady = this._billingClientBridge.isReady();
        } else {
            if (str.equals("subs")) {
                str = "subscriptions";
            }
            zIsReady = this._billingClientBridge.isFeatureSupported(str) == BillingResultResponseCode.OK;
        }
        return zIsReady ? 0 : -1;
    }
}
