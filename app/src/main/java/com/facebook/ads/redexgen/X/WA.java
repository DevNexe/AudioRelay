package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WA implements InterfaceC0554Di {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0565Dt> A04;
    public final InterfaceC0545Co[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public WA(List<C0565Dt> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0545Co[list.size()];
    }

    private boolean A02(C0679Ij c0679Ij, int i) {
        if (c0679Ij.A04() == 0) {
            return false;
        }
        if (c0679Ij.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A48(C0679Ij c0679Ij) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0679Ij, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0679Ij, 0)) {
                return;
            }
            int iA06 = c0679Ij.A06();
            int iA04 = c0679Ij.A04();
            for (InterfaceC0545Co output : this.A05) {
                c0679Ij.A0Y(iA06);
                output.AEG(c0679Ij, iA04);
            }
            this.A01 += iA04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A4V(InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
        int i = 0;
        while (true) {
            InterfaceC0545Co[] interfaceC0545CoArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i < interfaceC0545CoArr.length) {
                C0565Dt c0565Dt = this.A04.get(i);
                c0568Dw.A05();
                InterfaceC0545Co interfaceC0545CoAFD = interfaceC0537Ce.AFD(c0568Dw.A03(), 3);
                interfaceC0545CoAFD.A5V(Format.A0A(c0568Dw.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c0565Dt.A02), c0565Dt.A01, null));
                this.A05[i] = interfaceC0545CoAFD;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD3() {
        if (this.A03) {
            for (InterfaceC0545Co interfaceC0545Co : this.A05) {
                interfaceC0545Co.AEH(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD4(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AEK() {
        this.A03 = false;
    }
}
