package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03835q {
    public final long A00;
    public final EnumC03825p A01;
    public final String A02;
    public final boolean A03;

    public C03835q(String str, boolean z, EnumC03825p enumC03825p) {
        this(str, z, enumC03825p, System.currentTimeMillis());
    }

    public C03835q(String str, boolean z, EnumC03825p enumC03825p, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC03825p;
        this.A00 = j;
    }

    public static C03835q A00() {
        return new C03835q("", true, EnumC03825p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC03825p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
