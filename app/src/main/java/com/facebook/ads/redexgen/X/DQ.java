package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DQ {
    public static String[] A0J = {"0EwfBQL8WgkraFIT5", "yqBIkqshgk6o8aGC7JXOfAcvQBpSEoIE", "Pb3yD9oBE", "Sy7y64hwk", "hrTCG", "uTsL", "1ofsGt0E1HxH4l7d5", "0"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public D9 A07;
    public DP A08;
    public C0679Ij A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    public final long A00(int i) {
        return this.A0F[i] + ((long) this.A0C[i]);
    }

    public final void A01() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void A02(int i) {
        C0679Ij c0679Ij = this.A09;
        if (c0679Ij != null) {
            int iA07 = c0679Ij.A07();
            if (A0J[6].length() == 21) {
                throw new RuntimeException();
            }
            A0J[3] = "O7sbivaH";
            if (iA07 < i) {
                this.A09 = new C0679Ij(i);
            }
        } else {
            this.A09 = new C0679Ij(i);
        }
        this.A01 = i;
        this.A0A = true;
        this.A0B = true;
        if (A0J[3].length() != 20) {
            A0J[1] = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg";
        }
    }

    public final void A03(int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i) {
            this.A0G = new long[i];
            this.A0E = new int[i];
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.A0D = new int[i3];
            this.A0C = new int[i3];
            this.A0F = new long[i3];
            this.A0I = new boolean[i3];
            this.A0H = new boolean[i3];
        }
    }

    public final void A04(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }

    public final void A05(C0679Ij c0679Ij) {
        c0679Ij.A0c(this.A09.A00, 0, this.A01);
        this.A09.A0Y(0);
        this.A0B = false;
    }
}
