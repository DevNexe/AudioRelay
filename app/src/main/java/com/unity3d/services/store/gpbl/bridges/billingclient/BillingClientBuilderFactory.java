package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v4.BillingClientBridge;

/* JADX INFO: loaded from: classes3.dex */
public class BillingClientBuilderFactory {
    public static IBillingClientBuilderBridge getBillingClientBuilder(Context context) {
        return BillingClientBridge.isAvailable() ? BillingClientBridge.newBuilder(context) : com.unity3d.services.store.gpbl.bridges.billingclient.v3.BillingClientBridge.newBuilder(context);
    }
}
