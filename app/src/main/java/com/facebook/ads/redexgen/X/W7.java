package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W7 implements InterfaceC0554Di {
    public static byte[] A0E;
    public static String[] A0F = {"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    public long A00;
    public long A01;
    public InterfaceC0545Co A02;
    public C0559Dn A03;
    public String A04;
    public boolean A05;
    public final C0563Dr A0B;
    public final boolean[] A0D = new boolean[3];
    public final C0560Do A0A = new C0560Do(32, 128);
    public final C0560Do A08 = new C0560Do(33, 128);
    public final C0560Do A06 = new C0560Do(34, 128);
    public final C0560Do A07 = new C0560Do(39, 128);
    public final C0560Do A09 = new C0560Do(40, 128);
    public final C0679Ij A0C = new C0679Ij();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, 15, 7, -4, -6, 11, -4, -5, -73, -8, 10, 7, -4, -6, 11, -10, 9, -8, 11, 0, 6, -10, 0, -5, -6, -73, 13, -8, 3, 12, -4, -47, -73, 49, 36, 31, 32, 42, -22, 35, 32, 49, 30};
    }

    static {
        A02();
    }

    public W7(C0563Dr c0563Dr) {
        this.A0B = c0563Dr;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    /* JADX WARN: Code duplicated, block: B:77:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0212  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0212, please report this as an issue */
    public static Format A00(String str, C0560Do c0560Do, C0560Do c0560Do2, C0560Do c0560Do3) {
        int iA05;
        int aspectRatioIdc;
        byte[] bArr = new byte[c0560Do.A00 + c0560Do2.A00 + c0560Do3.A00];
        System.arraycopy(c0560Do.A01, 0, bArr, 0, c0560Do.A00);
        System.arraycopy(c0560Do2.A01, 0, bArr, c0560Do.A00, c0560Do2.A00);
        System.arraycopy(c0560Do3.A01, 0, bArr, c0560Do.A00 + c0560Do2.A00, c0560Do3.A00);
        C0680Ik c0680Ik = new C0680Ik(c0560Do2.A01, 0, c0560Do2.A00);
        c0680Ik.A07(44);
        int iA06 = c0680Ik.A05(3);
        c0680Ik.A06();
        c0680Ik.A07(88);
        c0680Ik.A07(8);
        int i = 0;
        for (int i2 = 0; i2 < iA06; i2++) {
            boolean zA0A = c0680Ik.A0A();
            int toSkip = A0F[1].charAt(1);
            if (toSkip == 68) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[0] = "O";
            strArr[3] = "1nR";
            if (zA0A) {
                i += 89;
            }
            if (c0680Ik.A0A()) {
                i += 8;
            }
        }
        c0680Ik.A07(i);
        if (iA06 > 0) {
            c0680Ik.A07((8 - iA06) * 2);
        }
        c0680Ik.A04();
        int iA04 = c0680Ik.A04();
        if (iA04 == 3) {
            c0680Ik.A06();
        }
        int iA07 = c0680Ik.A04();
        int iA08 = c0680Ik.A04();
        if (c0680Ik.A0A()) {
            int iA09 = c0680Ik.A04();
            int iA010 = c0680Ik.A04();
            int iA011 = c0680Ik.A04();
            int confWinBottomOffset = c0680Ik.A04();
            int confWinRightOffset = (iA04 == 1 || iA04 == 2) ? 2 : 1;
            int confWinLeftOffset = iA04 == 1 ? 2 : 1;
            iA07 -= (iA09 + iA010) * confWinRightOffset;
            int i3 = (iA011 + confWinBottomOffset) * confWinLeftOffset;
            String[] strArr2 = A0F;
            String str2 = strArr2[0];
            String str3 = strArr2[3];
            int confWinLeftOffset2 = str2.length();
            int subWidthC = str3.length();
            if (confWinLeftOffset2 == subWidthC) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0F;
            strArr3[0] = "C";
            strArr3[3] = "Xyf";
            iA08 -= i3;
        }
        c0680Ik.A04();
        c0680Ik.A04();
        int iA012 = c0680Ik.A04();
        for (int i4 = c0680Ik.A0A() ? 0 : iA06; i4 <= iA06; i4++) {
            c0680Ik.A04();
            c0680Ik.A04();
            c0680Ik.A04();
        }
        c0680Ik.A04();
        c0680Ik.A04();
        c0680Ik.A04();
        c0680Ik.A04();
        c0680Ik.A04();
        String[] strArr4 = A0F;
        if (strArr4[0].length() != strArr4[3].length()) {
            String[] strArr5 = A0F;
            strArr5[0] = "L";
            strArr5[3] = "SFB";
            c0680Ik.A04();
            if (c0680Ik.A0A() && c0680Ik.A0A()) {
                A05(c0680Ik);
            }
            c0680Ik.A07(2);
            if (c0680Ik.A0A()) {
                c0680Ik.A07(8);
                c0680Ik.A04();
                c0680Ik.A04();
                c0680Ik.A06();
            }
            A06(c0680Ik);
            if (c0680Ik.A0A()) {
                int ltRefPicPocLsbSpsLength = 0;
                while (true) {
                    int iA013 = c0680Ik.A04();
                    if (A0F[1].charAt(1) == 'D') {
                        throw new RuntimeException();
                    }
                    A0F[1] = "Ru3iiMNyUlnrUsoUUCHNe7f8PEwOWEdx";
                    if (ltRefPicPocLsbSpsLength >= iA013) {
                        break;
                    }
                    int i5 = iA012 + 4;
                    c0680Ik.A07(i5 + 1);
                    ltRefPicPocLsbSpsLength++;
                }
            }
            c0680Ik.A07(2);
            float f = 1.0f;
            if (c0680Ik.A0A()) {
                boolean zA0A2 = c0680Ik.A0A();
                if (A0F[6].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A0F[2] = "kAVLrXtqzQqcb3N";
                if (zA0A2) {
                    int log2MaxPicOrderCntLsbMinus4 = c0680Ik.A05(8);
                    if (A0F[1].charAt(1) != 'D') {
                        A0F[7] = "Q0asNNixqeMDgfrXMA3vs7CCA";
                        if (log2MaxPicOrderCntLsbMinus4 == 255) {
                            iA05 = c0680Ik.A05(16);
                            aspectRatioIdc = c0680Ik.A05(16);
                            if (iA05 != 0 && aspectRatioIdc != 0) {
                                f = iA05 / aspectRatioIdc;
                            }
                        } else if (log2MaxPicOrderCntLsbMinus4 < C0675If.A04.length) {
                            f = C0675If.A04[log2MaxPicOrderCntLsbMinus4];
                        } else {
                            Log.w(A01(0, 10, 32), A01(10, 35, 64) + log2MaxPicOrderCntLsbMinus4);
                        }
                    } else if (log2MaxPicOrderCntLsbMinus4 == 255) {
                        iA05 = c0680Ik.A05(16);
                        aspectRatioIdc = c0680Ik.A05(16);
                        if (iA05 != 0) {
                            f = iA05 / aspectRatioIdc;
                        }
                    } else if (log2MaxPicOrderCntLsbMinus4 < C0675If.A04.length) {
                        f = C0675If.A04[log2MaxPicOrderCntLsbMinus4];
                    } else {
                        Log.w(A01(0, 10, 32), A01(10, 35, 64) + log2MaxPicOrderCntLsbMinus4);
                    }
                }
            }
            return Format.A03(str, A01(45, 10, 100), null, -1, -1, iA07, iA08, -1.0f, Collections.singletonList(bArr), -1, f, null);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    private void A03(long j, int i, int i2, long j2) {
        String[] strArr;
        if (this.A05) {
            this.A03.A02(j, i);
        } else {
            this.A0A.A04(i2);
            this.A08.A04(i2);
            this.A06.A04(i2);
            if (this.A0A.A03() && this.A08.A03()) {
                C0560Do c0560Do = this.A06;
                String[] strArr2 = A0F;
                if (strArr2[5].length() == strArr2[4].length()) {
                    A0F[6] = "5brHzm0RAmJK5ZmRzslUlW25gn0hU7nI";
                    if (c0560Do.A03()) {
                        this.A02.A5V(A00(this.A04, this.A0A, this.A08, this.A06));
                        strArr = A0F;
                        if (strArr[5].length() == strArr[4].length()) {
                            A0F[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
                            this.A05 = true;
                        }
                    }
                } else if (c0560Do.A03()) {
                    this.A02.A5V(A00(this.A04, this.A0A, this.A08, this.A06));
                    strArr = A0F;
                    if (strArr[5].length() == strArr[4].length()) {
                        A0F[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
                        this.A05 = true;
                    }
                }
            }
            throw new RuntimeException();
        }
        if (this.A07.A04(i2)) {
            this.A0C.A0b(this.A07.A01, C0675If.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j2, this.A0C);
        }
        C0560Do c0560Do2 = this.A09;
        if (A0F[1].charAt(1) != 'D') {
            A0F[6] = "rXihwUdCpNaITwqC54bRxWTmSWKYNVR8";
            if (c0560Do2.A04(i2)) {
                this.A0C.A0b(this.A09.A01, C0675If.A02(this.A09.A01, this.A09.A00));
                this.A0C.A0Z(5);
                this.A0B.A02(j2, this.A0C);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A04(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A03(j, i, i2, j2);
        } else {
            this.A0A.A01(i2);
            this.A08.A01(i2);
            this.A06.A01(i2);
        }
        this.A07.A01(i2);
        this.A09.A01(i2);
    }

    public static void A05(C0680Ik c0680Ik) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!c0680Ik.A0A()) {
                    c0680Ik.A04();
                } else {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c0680Ik.A03();
                    }
                    for (int i3 = 0; i3 < iMin; i3++) {
                        c0680Ik.A03();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    public static void A06(C0680Ik c0680Ik) {
        int iA04 = c0680Ik.A04();
        boolean zA0A = false;
        int stRpsIdx = 0;
        for (int numNegativePics = 0; numNegativePics < iA04; numNegativePics++) {
            if (numNegativePics != 0) {
                zA0A = c0680Ik.A0A();
            }
            if (zA0A) {
                c0680Ik.A06();
                c0680Ik.A04();
                for (int i = 0; i <= stRpsIdx; i++) {
                    if (c0680Ik.A0A()) {
                        c0680Ik.A06();
                    }
                }
            } else {
                int numPositivePics = c0680Ik.A04();
                int iA05 = c0680Ik.A04();
                stRpsIdx = numPositivePics + iA05;
                for (int i2 = 0; i2 < numPositivePics; i2++) {
                    c0680Ik.A04();
                    c0680Ik.A06();
                }
                for (int i3 = 0; i3 < iA05; i3++) {
                    c0680Ik.A04();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    A0F[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    c0680Ik.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i, int i2) {
        if (this.A05) {
            this.A03.A04(bArr, i, i2);
        } else {
            this.A0A.A02(bArr, i, i2);
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A09.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A48(C0679Ij c0679Ij) {
        while (c0679Ij.A04() > 0) {
            int iA06 = c0679Ij.A06();
            int iA07 = c0679Ij.A07();
            byte[] bArr = c0679Ij.A00;
            this.A01 += (long) c0679Ij.A04();
            this.A02.AEG(c0679Ij, c0679Ij.A04());
            while (iA06 < iA07) {
                int iA04 = C0675If.A04(bArr, iA06, iA07, this.A0D);
                if (iA04 == iA07) {
                    A07(bArr, iA06, iA07);
                    return;
                }
                int iA00 = C0675If.A00(bArr, iA04);
                int nalUnitType = iA04 - iA06;
                if (nalUnitType > 0) {
                    A07(bArr, iA06, iA04);
                }
                int lengthToNalUnit = iA07 - iA04;
                long j = this.A01 - ((long) lengthToNalUnit);
                A03(j, lengthToNalUnit, nalUnitType < 0 ? -nalUnitType : 0, this.A00);
                long absolutePosition = this.A00;
                A04(j, lengthToNalUnit, iA00, absolutePosition);
                iA06 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A4V(InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
        c0568Dw.A05();
        this.A04 = c0568Dw.A04();
        this.A02 = interfaceC0537Ce.AFD(c0568Dw.A03(), 2);
        this.A03 = new C0559Dn(this.A02);
        this.A0B.A03(interfaceC0537Ce, c0568Dw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD4(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AEK() {
        C0675If.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
