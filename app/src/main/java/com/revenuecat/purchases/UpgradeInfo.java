package com.revenuecat.purchases;

import defpackage.kg0;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class UpgradeInfo {
    private final String oldSku;
    private final Integer prorationMode;

    public UpgradeInfo(String str, Integer num) {
        this.oldSku = str;
        this.prorationMode = num;
    }

    public static /* synthetic */ UpgradeInfo copy$default(UpgradeInfo upgradeInfo, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeInfo.oldSku;
        }
        if ((i & 2) != 0) {
            num = upgradeInfo.prorationMode;
        }
        return upgradeInfo.copy(str, num);
    }

    public final String component1() {
        return this.oldSku;
    }

    public final Integer component2() {
        return this.prorationMode;
    }

    public final UpgradeInfo copy(String str, Integer num) {
        return new UpgradeInfo(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeInfo)) {
            return false;
        }
        UpgradeInfo upgradeInfo = (UpgradeInfo) obj;
        return ur1.a(this.oldSku, upgradeInfo.oldSku) && ur1.a(this.prorationMode, upgradeInfo.prorationMode);
    }

    public final String getOldSku() {
        return this.oldSku;
    }

    public final Integer getProrationMode() {
        return this.prorationMode;
    }

    public int hashCode() {
        int iHashCode = this.oldSku.hashCode() * 31;
        Integer num = this.prorationMode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "UpgradeInfo(oldSku=" + this.oldSku + ", prorationMode=" + this.prorationMode + ')';
    }

    public /* synthetic */ UpgradeInfo(String str, Integer num, int i, kg0 kg0Var) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
