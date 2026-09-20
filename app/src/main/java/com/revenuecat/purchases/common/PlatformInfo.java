package com.revenuecat.purchases.common;

import defpackage.bl2;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformInfo {
    private final String flavor;
    private final String version;

    public PlatformInfo(String str, String str2) {
        this.flavor = str;
        this.version = str2;
    }

    public static /* synthetic */ PlatformInfo copy$default(PlatformInfo platformInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformInfo.flavor;
        }
        if ((i & 2) != 0) {
            str2 = platformInfo.version;
        }
        return platformInfo.copy(str, str2);
    }

    public final String component1() {
        return this.flavor;
    }

    public final String component2() {
        return this.version;
    }

    public final PlatformInfo copy(String str, String str2) {
        return new PlatformInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformInfo)) {
            return false;
        }
        PlatformInfo platformInfo = (PlatformInfo) obj;
        return ur1.a(this.flavor, platformInfo.flavor) && ur1.a(this.version, platformInfo.version);
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.flavor.hashCode() * 31;
        String str = this.version;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlatformInfo(flavor=");
        sb.append(this.flavor);
        sb.append(", version=");
        return bl2.c(sb, this.version, ')');
    }
}
