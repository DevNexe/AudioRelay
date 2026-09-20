package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0535Cc {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    public static final InterfaceC0538Cf A09 = new W2();
    public long A00;
    public InterfaceC0537Ce A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0561Dp> A05;
    public final C0679Ij A06;
    public final C0691Iv A07;

    public W1() {
        this(new C0691Iv(0L));
    }

    public W1(C0691Iv c0691Iv) {
        this.A07 = c0691Iv;
        this.A06 = new C0679Ij(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A01 = interfaceC0537Ce;
        interfaceC0537Ce.AEM(new C1041Wq(-9223372036854775807L));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        long j;
        if (!interfaceC0536Cd.AD8(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int iA08 = this.A06.A08();
        if (iA08 == 441) {
            return -1;
        }
        if (iA08 == 442) {
            interfaceC0536Cd.AD7(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            interfaceC0536Cd.AEt((this.A06.A0E() & 7) + 14);
            return 0;
        }
        if (iA08 == 443) {
            interfaceC0536Cd.AD7(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            interfaceC0536Cd.AEt(this.A06.A0I() + 6);
            return 0;
        }
        if (((iA08 & (-256)) >> 8) != 1) {
            interfaceC0536Cd.AEt(1);
            return 0;
        }
        int i = iA08 & 255;
        C0561Dp c0561Dp = this.A05.get(i);
        if (!this.A02) {
            if (c0561Dp == null) {
                InterfaceC0554Di w9 = null;
                if (i == 189) {
                    w9 = new WG();
                    this.A03 = true;
                    this.A00 = interfaceC0536Cd.A7F();
                } else if ((i & 224) == 192) {
                    w9 = new W4();
                    this.A03 = true;
                    this.A00 = interfaceC0536Cd.A7F();
                } else if ((i & 240) == 224) {
                    w9 = new W9();
                    this.A04 = true;
                    this.A00 = interfaceC0536Cd.A7F();
                }
                if (w9 != null) {
                    w9.A4V(this.A01, new C0568Dw(i, 256));
                    c0561Dp = new C0561Dp(w9, this.A07);
                    this.A05.put(i, c0561Dp);
                }
            }
            if (this.A03) {
                boolean z = this.A04;
                if (A08[4].charAt(23) != 'N') {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[5] = "GuNYv8iGB9fWJbOt3uu3Za7wMxPGJegg";
                strArr[3] = "GUiTHbar7DdTUGk0lHWf4lwKJeXDLMXK";
                if (z) {
                    j = this.A00 + 8192;
                } else {
                    j = 1048576;
                }
            } else {
                j = 1048576;
            }
            if (interfaceC0536Cd.A7F() > j) {
                this.A02 = true;
                this.A01.A5D();
            }
        }
        interfaceC0536Cd.AD7(this.A06.A00, 0, 2);
        this.A06.A0Y(0);
        int iA0I = this.A06.A0I() + 6;
        if (A08[2].charAt(13) != 'B') {
            A08[2] = "LU8WC4TuN3WXFvWf57u6WvD8Lscdw8Rq";
            if (c0561Dp == null) {
                interfaceC0536Cd.AEt(iA0I);
            } else {
                this.A06.A0W(iA0I);
                interfaceC0536Cd.readFully(this.A06.A00, 0, iA0I);
                this.A06.A0Y(6);
                c0561Dp.A03(this.A06);
                C0679Ij c0679Ij = this.A06;
                c0679Ij.A0X(c0679Ij.A05());
            }
        } else if (c0561Dp == null) {
            interfaceC0536Cd.AEt(iA0I);
        } else {
            this.A06.A0W(iA0I);
            interfaceC0536Cd.readFully(this.A06.A00, 0, iA0I);
            this.A06.A0Y(6);
            c0561Dp.A03(this.A06);
            C0679Ij c0679Ij2 = this.A06;
            c0679Ij2.A0X(c0679Ij2.A05());
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A07.A08();
        for (int i = 0; i < this.A05.size(); i++) {
            this.A05.valueAt(i).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        interfaceC0536Cd.AD7(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        if (A08[7].length() == 3) {
            throw new RuntimeException();
        }
        A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
        interfaceC0536Cd.A3K(bArr[13] & 7);
        interfaceC0536Cd.AD7(bArr, 0, 3);
        return 1 == ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)));
    }
}
