package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0699Jd {
    public double A00;
    public EnumC0705Jj A01;
    public EnumC0706Jk A02;
    public String A03;
    public String A04;

    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final C0699Jd A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C0699Jd A01(EnumC0705Jj enumC0705Jj) {
        this.A01 = enumC0705Jj;
        return this;
    }

    public final C0699Jd A02(EnumC0706Jk enumC0706Jk) {
        this.A02 = enumC0706Jk;
        return this;
    }

    public final C0699Jd A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C0699Jd A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C0699Jd A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C0699Jd A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C0700Je A07(C8U c8u) {
        return new C0700Je(c8u, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
