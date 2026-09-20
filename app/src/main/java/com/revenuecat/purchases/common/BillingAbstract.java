package com.revenuecat.purchases.common;

import android.app.Activity;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.j81;
import defpackage.sd5;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BillingAbstract {
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> list);
    }

    public interface StateListener {
        void onConnected();
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        billingAbstract.startConnectionOnMainThread(j);
    }

    public final void close() {
        setPurchasesUpdatedListener(null);
        endConnection();
    }

    public abstract void consumeAndSave(boolean z, StoreTransaction storeTransaction);

    public abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, j81<? super StoreTransaction, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2);

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String str, StoreProduct storeProduct, ReplaceSkuInfo replaceSkuInfo, String str2);

    public void normalizePurchaseData(String str, String str2, String str3, j81<? super String, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        j81Var.invoke(str);
    }

    public abstract void queryAllPurchases(String str, j81<? super List<StoreTransaction>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2);

    public abstract void queryPurchases(String str, j81<? super Map<String, StoreTransaction>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2);

    public abstract void querySkuDetailsAsync(ProductType productType, Set<String> set, j81<? super List<StoreProduct>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        synchronized (this) {
            this.purchasesUpdatedListener = purchasesUpdatedListener;
            sd5 sd5Var = sd5.a;
        }
        if (purchasesUpdatedListener != null) {
            startConnectionOnMainThread$default(this, 0L, 1, null);
        } else {
            endConnection();
        }
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long j);
}
