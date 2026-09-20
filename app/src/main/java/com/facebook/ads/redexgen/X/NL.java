package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NL {
    public int A00;
    public EnumC0769Ma A01;
    public NP A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C1075Xy A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public NL(C1075Xy c1075Xy, NP np) {
        this.A0C = c1075Xy;
        this.A02 = np;
    }

    public final NL A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final NL A0E(EnumC0769Ma enumC0769Ma) {
        this.A01 = enumC0769Ma;
        return this;
    }

    public final NL A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final NL A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final NL A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final NL A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final NL A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final NL A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final NL A0L(boolean z) {
        this.A0B = z;
        return this;
    }

    public final NM A0M() {
        return new NM(this, null);
    }
}
