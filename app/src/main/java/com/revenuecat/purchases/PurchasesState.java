package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import defpackage.dj;
import defpackage.ds0;
import defpackage.kg0;
import defpackage.ur1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final boolean firstTimeInForeground;
    private final ProductChangeCallback productChangeCallback;
    private final Map<String, PurchaseCallback> purchaseCallbacks;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z, boolean z2) {
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacks = map;
        this.productChangeCallback = productChangeCallback;
        this.appInBackground = z;
        this.firstTimeInForeground = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i & 2) != 0) {
            map = purchasesState.purchaseCallbacks;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            productChangeCallback = purchasesState.productChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i & 8) != 0) {
            z = purchasesState.appInBackground;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map2, productChangeCallback2, z3, z2);
    }

    public final Boolean component1() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacks;
    }

    public final ProductChangeCallback component3() {
        return this.productChangeCallback;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final boolean component5() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z, boolean z2) {
        return new PurchasesState(bool, map, productChangeCallback, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) obj;
        return ur1.a(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && ur1.a(this.purchaseCallbacks, purchasesState.purchaseCallbacks) && ur1.a(this.productChangeCallback, purchasesState.productChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final ProductChangeCallback getProductChangeCallback() {
        return this.productChangeCallback;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacks() {
        return this.purchaseCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int iHashCode = (this.purchaseCallbacks.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        ProductChangeCallback productChangeCallback = this.productChangeCallback;
        int iHashCode2 = (iHashCode + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31;
        boolean z = this.appInBackground;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode2 + r0) * 31;
        boolean z2 = this.firstTimeInForeground;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasesState(allowSharingPlayStoreAccount=");
        sb.append(this.allowSharingPlayStoreAccount);
        sb.append(", purchaseCallbacks=");
        sb.append(this.purchaseCallbacks);
        sb.append(", productChangeCallback=");
        sb.append(this.productChangeCallback);
        sb.append(", appInBackground=");
        sb.append(this.appInBackground);
        sb.append(", firstTimeInForeground=");
        return dj.c(sb, this.firstTimeInForeground, ')');
    }

    public /* synthetic */ PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, kg0 kg0Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? ds0.w : map, (i & 4) == 0 ? productChangeCallback : null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
    }
}
