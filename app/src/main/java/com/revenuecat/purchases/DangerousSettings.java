package com.revenuecat.purchases;

import defpackage.dj;
import defpackage.kg0;

/* JADX INFO: loaded from: classes3.dex */
public final class DangerousSettings {
    private final boolean autoSyncPurchases;

    public DangerousSettings() {
        this(false, 1, null);
    }

    public DangerousSettings(boolean z) {
        this.autoSyncPurchases = z;
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dangerousSettings.autoSyncPurchases;
        }
        return dangerousSettings.copy(z);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final DangerousSettings copy(boolean z) {
        return new DangerousSettings(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DangerousSettings) && this.autoSyncPurchases == ((DangerousSettings) obj).autoSyncPurchases;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public int hashCode() {
        boolean z = this.autoSyncPurchases;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return dj.c(new StringBuilder("DangerousSettings(autoSyncPurchases="), this.autoSyncPurchases, ')');
    }

    public /* synthetic */ DangerousSettings(boolean z, int i, kg0 kg0Var) {
        this((i & 1) != 0 ? true : z);
    }
}
