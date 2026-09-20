package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WG implements InterfaceC0554Di {
    public static String[] A0C = {"nJiMpwDCR7ZAmhQyp9AOHiC56UVcRx0k", "lCnqxh0y89Em7p481QheNATB6nErTPja", "EOgZonHCFyaPw1rQOdlgFposS9KMweND", "oVFhsCJtzutno5RzvIOwcHRYGNjJYB0M", "4", "S", "C7ZxqwSPJTae6vgKBRSPBAMVUD", "Gg5xSTo0LtnMpcaC7QBiBySoh1"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC0545Co A06;
    public String A07;
    public boolean A08;
    public final C0678Ii A09;
    public final C0679Ij A0A;
    public final String A0B;

    public WG() {
        this(null);
    }

    public WG(String str) {
        this.A09 = new C0678Ii(new byte[128]);
        this.A0A = new C0679Ij(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    private void A00() {
        this.A09.A07(0);
        B9 b9A09 = BA.A09(this.A09);
        if (this.A05 == null || b9A09.A00 != this.A05.A05) {
            this.A05 = Format.A07(this.A07, b9A09.A05, null, -1, -1, b9A09.A00, b9A09.A03, null, null, 0, this.A0B);
            this.A06.A5V(this.A05);
        } else {
            int i = b9A09.A03;
            Format format = this.A05;
            String[] strArr = A0C;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq";
            if (i != format.A0C || b9A09.A05 != this.A05.A0O) {
                this.A05 = Format.A07(this.A07, b9A09.A05, null, -1, -1, b9A09.A00, b9A09.A03, null, null, 0, this.A0B);
                this.A06.A5V(this.A05);
            }
        }
        this.A01 = b9A09.A01;
        this.A03 = (((long) b9A09.A02) * 1000000) / ((long) this.A05.A0C);
    }

    private boolean A01(C0679Ij c0679Ij) {
        while (true) {
            if (c0679Ij.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0679Ij.A0E() == 11;
            } else {
                int iA0E = c0679Ij.A0E();
                if (iA0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0E == 11;
            }
        }
    }

    private boolean A02(C0679Ij c0679Ij, byte[] bArr, int i) {
        int iMin = Math.min(c0679Ij.A04(), i - this.A00);
        c0679Ij.A0c(bArr, this.A00, iMin);
        this.A00 += iMin;
        return this.A00 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A48(C0679Ij c0679Ij) {
        while (c0679Ij.A04() > 0) {
            int i = this.A02;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(c0679Ij.A04(), this.A01 - this.A00);
                        this.A06.AEG(c0679Ij, iMin);
                        this.A00 += iMin;
                        int i2 = this.A00;
                        int i3 = this.A01;
                        if (i2 == i3) {
                            this.A06.AEH(this.A04, 1, i3, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    }
                } else if (A02(c0679Ij, this.A0A.A00, 128)) {
                    A00();
                    this.A0A.A0Y(0);
                    this.A06.AEG(this.A0A, 128);
                    this.A02 = 2;
                }
            } else if (A01(c0679Ij)) {
                this.A02 = 1;
                this.A0A.A00[0] = 11;
                this.A0A.A00[1] = 119;
                this.A00 = 2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A4V(InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
        c0568Dw.A05();
        this.A07 = c0568Dw.A04();
        this.A06 = interfaceC0537Ce.AFD(c0568Dw.A03(), 1);
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
