package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W4 implements InterfaceC0554Di {
    public static String[] A0C = {"KDszHDzXfqF59CRVRWftd3HVsRnCigSQ", "mt1wJ32vNuSPyEC341LvOqJuOPF0PUkp", "WrM", "XaAyFYRGYfBBBZw7eK", "eDOzUgm8HT4q1AQmalgqs20fTFsFJUGd", "BoW68Cbgp4ULkXl8fLSwM62hHrGuEs23", "bWE7L7mx05VAedoWHIxzCG4hfzqVFa", "OpD2t2SPaq7VaFKSNzknI6aN9MYETC"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC0545Co A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Ci A09;
    public final C0679Ij A0A;
    public final String A0B;

    public W4() {
        this(null);
    }

    public W4(String str) {
        this.A02 = 0;
        this.A0A = new C0679Ij(4);
        this.A0A.A00[0] = -1;
        this.A09 = new Ci();
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    private void A00(C0679Ij c0679Ij) {
        boolean z;
        byte[] bArr = c0679Ij.A00;
        int iA07 = c0679Ij.A07();
        for (int i = c0679Ij.A06(); i < iA07; i++) {
            boolean z2 = (bArr[i] & 255) == 255;
            if (this.A08) {
                byte b = bArr[i];
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[3] = "UcL2wMN6HBGwWkWL4B";
                strArr2[2] = "jB5";
                if ((b & 224) == 224) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.A08 = z2;
            String[] strArr3 = A0C;
            if (strArr3[1].charAt(29) != strArr3[4].charAt(29)) {
                if (z) {
                    c0679Ij.A0Y(i + 1);
                    this.A08 = false;
                    this.A0A.A00[1] = bArr[i];
                    this.A00 = 2;
                    this.A02 = 1;
                    return;
                }
            } else {
                String[] strArr4 = A0C;
                strArr4[5] = "AyJ6e7KDyRqb1r0P1KBKVEJakZlKMKHZ";
                strArr4[0] = "2ThmXJimQn9uK6mMidfBhWUlfDYnBKkO";
                if (z) {
                    c0679Ij.A0Y(i + 1);
                    this.A08 = false;
                    this.A0A.A00[1] = bArr[i];
                    this.A00 = 2;
                    this.A02 = 1;
                    return;
                }
            }
        }
        c0679Ij.A0Y(iA07);
    }

    private void A01(C0679Ij c0679Ij) {
        int iMin = Math.min(c0679Ij.A04(), this.A01 - this.A00);
        this.A05.AEG(c0679Ij, iMin);
        this.A00 += iMin;
        int i = this.A00;
        int i2 = this.A01;
        if (i < i2) {
            return;
        }
        this.A05.AEH(this.A04, 1, i2, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        String[] strArr = A0C;
        if (strArr[5].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "ScjCWzDsMvlE6C4iVMEuFqkFuKCicUAb";
        strArr2[4] = "udpHDrUjrNQxaJr25pS4UodeWrrvfUFS";
        this.A02 = 0;
    }

    private void A02(C0679Ij c0679Ij) {
        int iMin = Math.min(c0679Ij.A04(), 4 - this.A00);
        c0679Ij.A0c(this.A0A.A00, this.A00, iMin);
        this.A00 += iMin;
        if (this.A00 < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (Ci.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (((long) this.A09.A04) * 1000000) / ((long) this.A09.A03);
                this.A05.A5V(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AEG(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A48(C0679Ij c0679Ij) {
        while (c0679Ij.A04() > 0) {
            int i = this.A02;
            if (i == 0) {
                A00(c0679Ij);
            } else if (i != 1) {
                String[] strArr = A0C;
                if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[1] = "DlgSkZ7kUmj97mVCMXW7YS18xBC70U7G";
                strArr2[4] = "tybkSaN9ICkxBJ48s31m7V5Ixzqz2U6M";
                if (i == 2) {
                    A01(c0679Ij);
                }
            } else {
                A02(c0679Ij);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A4V(InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
        c0568Dw.A05();
        this.A06 = c0568Dw.A04();
        this.A05 = interfaceC0537Ce.AFD(c0568Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD4(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AEK() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
