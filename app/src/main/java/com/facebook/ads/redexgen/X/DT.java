package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DT {
    public static String[] A05 = {"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    public int A01;
    public boolean A02;
    public final DU A03 = new DU();
    public final C0679Ij A04 = new C0679Ij(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (this.A01 + i < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            this.A01 = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public final DU A01() {
        return this.A03;
    }

    public final C0679Ij A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0679Ij c0679Ij = this.A04;
        c0679Ij.A00 = Arrays.copyOf(c0679Ij.A00, Math.max(65025, this.A04.A07()));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    public final boolean A05(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        boolean z;
        IK.A04(interfaceC0536Cd != null);
        if (this.A02) {
            this.A02 = false;
            this.A04.A0V();
        }
        while (!this.A02) {
            if (this.A00 < 0) {
                if (!this.A03.A03(interfaceC0536Cd, true)) {
                    return false;
                }
                int i = 0;
                int iA00 = this.A03.A01;
                if ((this.A03.A04 & 1) == 1 && this.A04.A07() == 0) {
                    iA00 += A00(0);
                    i = 0 + this.A01;
                }
                interfaceC0536Cd.AEt(iA00);
                this.A00 = i;
            }
            int i2 = this.A00;
            if (A05[6].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "i62czKk5b6JbVfHnToVx8x6tmuUA";
            strArr[4] = "gHUMWkXRCT33pqDj2b4VuW7lrrl9";
            int iA01 = A00(i2);
            int i3 = this.A00 + this.A01;
            if (iA01 > 0) {
                if (this.A04.A05() < this.A04.A07() + iA01) {
                    C0679Ij c0679Ij = this.A04;
                    c0679Ij.A00 = Arrays.copyOf(c0679Ij.A00, this.A04.A07() + iA01);
                }
                interfaceC0536Cd.readFully(this.A04.A00, this.A04.A07(), iA01);
                C0679Ij c0679Ij2 = this.A04;
                c0679Ij2.A0X(c0679Ij2.A07() + iA01);
                if (A05[6].length() != 3) {
                    String[] strArr2 = A05;
                    strArr2[2] = "ogc4gOivxDxoGYi1qiTHirlKhDSt";
                    strArr2[4] = "iMeJYowIkxr6AoX4GnZCWjRmsKkg";
                    if (this.A03.A09[i3 - 1] != 5) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    String[] strArr3 = A05;
                    strArr3[1] = "SEVCovcizG8fdEER6D9whRMhw9TrSTFd";
                    strArr3[0] = "7kPCM5e4Jglfu9vPSMMLzLJaJJkFOiUF";
                    if (this.A03.A09[i3 - 1] != 255) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this.A02 = z;
            }
            if (i3 == this.A03.A02) {
                i3 = -1;
            }
            this.A00 = i3;
        }
        return true;
    }
}
