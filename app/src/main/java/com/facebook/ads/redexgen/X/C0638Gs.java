package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0638Gs {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0679Ij A07 = new C0679Ij();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0679Ij c0679Ij, int i) {
        int iA0G;
        if (i < 4) {
            return;
        }
        c0679Ij.A0Z(3);
        int i2 = i - 4;
        if ((c0679Ij.A0E() & 128) != 0) {
            if (i2 < 7 || (iA0G = c0679Ij.A0G()) < 4) {
                return;
            }
            this.A01 = c0679Ij.A0I();
            this.A00 = c0679Ij.A0I();
            this.A07.A0W(iA0G - 4);
            i2 -= 7;
        }
        int iA06 = this.A07.A06();
        int iA07 = this.A07.A07();
        if (iA06 < iA07 && i2 > 0) {
            int bytesToRead = Math.min(i2, iA07 - iA06);
            c0679Ij.A0c(this.A07.A00, iA06, bytesToRead);
            this.A07.A0Y(iA06 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0679Ij c0679Ij, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c0679Ij.A0I();
        this.A04 = c0679Ij.A0I();
        c0679Ij.A0Z(11);
        this.A02 = c0679Ij.A0I();
        this.A03 = c0679Ij.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0679Ij c0679Ij, int i) {
        if (i % 5 != 2) {
            return;
        }
        c0679Ij.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int r = 0; r < i2; r++) {
            int iA0E = c0679Ij.A0E();
            int iA0E2 = c0679Ij.A0E();
            int iA0E3 = c0679Ij.A0E();
            int iA0E4 = c0679Ij.A0E();
            int entryCount = c0679Ij.A0E();
            int i3 = (int) (((double) iA0E2) + (((double) (iA0E3 - 128)) * 1.402d));
            int cb = iA0E4 - 128;
            double d = ((double) iA0E2) - (((double) cb) * 0.34414d);
            int i4 = iA0E3 - 128;
            int i5 = (int) (d - (((double) i4) * 0.71414d));
            int i6 = iA0E4 - 128;
            int i7 = (int) (((double) iA0E2) + (((double) i6) * 1.772d));
            int[] iArr = this.A08;
            int i8 = C0695Iz.A06(i3, 0, 255);
            int i9 = (entryCount << 24) | (i8 << 16);
            int i10 = C0695Iz.A06(i5, 0, 255);
            int i11 = i9 | (i10 << 8);
            int i12 = C0695Iz.A06(i7, 0, 255);
            iArr[iA0E] = i11 | i12;
        }
        this.A06 = true;
    }

    public final GX A06() {
        int i;
        int i2;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07() || !this.A06) {
            return null;
        }
        this.A07.A0Y(0);
        int[] iArr = new int[this.A01 * this.A00];
        int i3 = 0;
        while (i3 < argbBitmapDataIndex) {
            int iA0E = this.A07.A0E();
            if (iA0E != 0) {
                int argbBitmapDataIndex = this.A08[iA0E];
                iArr[i3] = argbBitmapDataIndex;
                i3++;
            } else {
                int iA0E2 = this.A07.A0E();
                if (iA0E2 != 0) {
                    int switchBits = iA0E2 & 64;
                    if (switchBits == 0) {
                        i = iA0E2 & 63;
                    } else {
                        int color = iA0E2 & 63;
                        int i4 = color << 8;
                        int color2 = this.A07.A0E();
                        i = i4 | color2;
                    }
                    int runLength = iA0E2 & 128;
                    if (runLength == 0) {
                        i2 = 0;
                    } else {
                        int[] iArr2 = this.A08;
                        C0679Ij c0679Ij = this.A07;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[2];
                        int length = str.length();
                        int color3 = str2.length();
                        if (length != color3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A09;
                        strArr2[6] = "LobxqobSp0chhe0OZFFwjgoplyKrXQLj";
                        strArr2[2] = "nSlIIcYQrdb8UpaoVkH7kLQAXSG8FoO0";
                        int color4 = c0679Ij.A0E();
                        i2 = iArr2[color4];
                    }
                    int color5 = i3 + i;
                    Arrays.fill(iArr, i3, color5, i2);
                    i3 += i;
                } else {
                    continue;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        float f = this.A02;
        int i5 = this.A05;
        float f2 = f / i5;
        float f3 = this.A03;
        int i6 = this.A04;
        return new GX(bitmapCreateBitmap, f2, 0, f3 / i6, 0, this.A01 / i5, this.A00 / i6);
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
