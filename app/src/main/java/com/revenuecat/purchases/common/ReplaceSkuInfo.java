package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.kg0;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplaceSkuInfo {
    private final StoreTransaction oldPurchase;
    private final Integer prorationMode;

    public ReplaceSkuInfo(StoreTransaction storeTransaction, Integer num) {
        this.oldPurchase = storeTransaction;
        this.prorationMode = num;
    }

    public static /* synthetic */ ReplaceSkuInfo copy$default(ReplaceSkuInfo replaceSkuInfo, StoreTransaction storeTransaction, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            storeTransaction = replaceSkuInfo.oldPurchase;
        }
        if ((i & 2) != 0) {
            num = replaceSkuInfo.prorationMode;
        }
        return replaceSkuInfo.copy(storeTransaction, num);
    }

    public final StoreTransaction component1() {
        return this.oldPurchase;
    }

    public final Integer component2() {
        return this.prorationMode;
    }

    public final ReplaceSkuInfo copy(StoreTransaction storeTransaction, Integer num) {
        return new ReplaceSkuInfo(storeTransaction, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceSkuInfo)) {
            return false;
        }
        ReplaceSkuInfo replaceSkuInfo = (ReplaceSkuInfo) obj;
        return ur1.a(this.oldPurchase, replaceSkuInfo.oldPurchase) && ur1.a(this.prorationMode, replaceSkuInfo.prorationMode);
    }

    public final StoreTransaction getOldPurchase() {
        return this.oldPurchase;
    }

    public final Integer getProrationMode() {
        return this.prorationMode;
    }

    public int hashCode() {
        int iHashCode = this.oldPurchase.hashCode() * 31;
        Integer num = this.prorationMode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ReplaceSkuInfo(oldPurchase=" + this.oldPurchase + ", prorationMode=" + this.prorationMode + ')';
    }

    public /* synthetic */ ReplaceSkuInfo(StoreTransaction storeTransaction, Integer num, int i, kg0 kg0Var) {
        this(storeTransaction, (i & 2) != 0 ? null : num);
    }
}
