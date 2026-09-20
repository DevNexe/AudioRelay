package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.listeners.IPurchasesResponseListener;
import defpackage.ah3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PurchasesResponseListenerProxy extends GenericListenerProxy {
    private static final String onQueryPurchasesResponseMethodName = "onQueryPurchasesResponse";
    private IPurchasesResponseListener _purchasesResponseListener;

    public PurchasesResponseListenerProxy(IPurchasesResponseListener iPurchasesResponseListener) {
        this._purchasesResponseListener = iPurchasesResponseListener;
    }

    public static Class<?> getProxyListenerClass() {
        return ah3.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() {
        return getProxyListenerClass();
    }

    public IPurchasesResponseListener getPurchasesResponseListener() {
        return this._purchasesResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals(onQueryPurchasesResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onQueryPurchasesResponse(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onQueryPurchasesResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        BillingResultBridge billingResultBridge = new BillingResultBridge(obj);
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PurchaseBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        IPurchasesResponseListener iPurchasesResponseListener = this._purchasesResponseListener;
        if (iPurchasesResponseListener != null) {
            iPurchasesResponseListener.onBillingResponse(billingResultBridge, arrayList);
        }
    }
}
