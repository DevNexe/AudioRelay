package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0552Df {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0551De A04(C0679Ij c0679Ij) throws C0488Af {
        A0A(1, c0679Ij, false);
        long jA0K = c0679Ij.A0K();
        int iA0E = c0679Ij.A0E();
        long jA0K2 = c0679Ij.A0K();
        int iA0A = c0679Ij.A0A();
        int iA0A2 = c0679Ij.A0A();
        int iA0A3 = c0679Ij.A0A();
        int iA0E2 = c0679Ij.A0E();
        return new C0551De(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) Math.pow(2.0d, iA0E2 & 15), (int) Math.pow(2.0d, (iA0E2 & 240) >> 4), (c0679Ij.A0E() & 1) > 0, Arrays.copyOf(c0679Ij.A00, c0679Ij.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, 23, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, 15, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, 15, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, 20, 0, 19, 31, 27, 28, 21, 82, 16, 27, 6, 82, 19, 20, 6, 23, 0, 82, 31, 29, 22, 23, 1, 82, 28, 29, 6, 82, 1, 23, 6, 82, 19, 1, 82, 23, 10, 2, 23, 17, 6, 23, 22, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, 14, 90, 87, 94, 75, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 28, 14, 64, 65, 90, 14, 74, 75, 77, 65, 74, 79, 76, 66, 75, 20, 14, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, 20, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, 127, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, 18, 22, 19, 18, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int val) {
        int i = 0;
        while (val > 0) {
            i++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static C0549Db A02(DZ dz) throws C0488Af {
        long jA01;
        if (dz.A02(24) == 5653314) {
            int iA02 = dz.A02(16);
            int iA03 = dz.A02(24);
            long[] jArr = new long[iA03];
            boolean zA04 = dz.A04();
            if (!zA04) {
                boolean zA05 = dz.A04();
                for (int i = 0; i < jArr.length; i++) {
                    if (zA05) {
                        boolean isSparse = dz.A04();
                        if (isSparse) {
                            jArr[i] = dz.A02(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = dz.A02(5) + 1;
                    }
                }
            } else {
                int iA04 = dz.A02(5) + 1;
                int i2 = 0;
                while (i2 < i) {
                    int i3 = iA03 - i2;
                    int iA05 = dz.A02(A00(i3));
                    for (int i4 = 0; i4 < iA05; i4++) {
                        int i5 = jArr.length;
                        if (i2 >= i5) {
                            break;
                        }
                        jArr[i2] = iA04;
                        i2++;
                    }
                    iA04++;
                }
            }
            int iA06 = dz.A02(4);
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            A01[7] = "k7eMGEO3QgprNsh6neXNKI6AQGFtvYrM";
            if (iA06 <= 2) {
                if (iA06 == 1 || iA06 == 2) {
                    dz.A03(32);
                    dz.A03(32);
                    int iA07 = dz.A02(4) + 1;
                    dz.A03(1);
                    if (iA06 == 1) {
                        if (iA02 != 0) {
                            jA01 = A01(iA03, iA02);
                        } else {
                            jA01 = 0;
                        }
                    } else {
                        jA01 = ((long) iA03) * ((long) iA02);
                    }
                    long lookupValuesCount = iA07;
                    int lookupType = (int) (lookupValuesCount * jA01);
                    dz.A03(lookupType);
                }
                return new C0549Db(iA02, iA03, jArr, iA06, zA04);
            }
            throw new C0488Af(A05(228, 42, 25) + iA06);
        }
        throw new C0488Af(A05(38, 55, 54) + dz.A01());
    }

    public static C0550Dc A03(C0679Ij c0679Ij) throws C0488Af {
        A0A(3, c0679Ij, false);
        int len = (int) c0679Ij.A0K();
        String strA0S = c0679Ij.A0S(len);
        int len2 = strA0S.length();
        int i = 7 + 4 + len2;
        long jA0K = c0679Ij.A0K();
        int len3 = (int) jA0K;
        String[] strArr = new String[len3];
        int i2 = i + 4;
        for (int i3 = 0; i3 < jA0K; i3++) {
            int i4 = (int) c0679Ij.A0K();
            strArr[i3] = c0679Ij.A0S(i4);
            int i5 = strArr[i3].length();
            i2 = i2 + 4 + i5;
        }
        int i6 = c0679Ij.A0E();
        int i7 = i6 & 1;
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        A01[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        if (i7 != 0) {
            return new C0550Dc(strA0S, strArr, i2 + 1);
        }
        String vendor = A05(198, 30, 6);
        throw new C0488Af(vendor);
    }

    public static void A07(int mappingsCount, DZ dz) throws C0488Af {
        int iA02;
        int iA03 = dz.A02(6) + 1;
        for (int i = 0; i < iA03; i++) {
            int iA04 = dz.A02(16);
            if (iA04 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + iA04);
            } else {
                if (dz.A04()) {
                    iA02 = dz.A02(4) + 1;
                } else {
                    iA02 = 1;
                }
                boolean zA04 = dz.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (zA04) {
                    int iA05 = dz.A02(8) + 1;
                    for (int i2 = 0; i2 < iA05; i2++) {
                        int i3 = mappingsCount - 1;
                        dz.A03(A00(i3));
                        int i4 = mappingsCount - 1;
                        dz.A03(A00(i4));
                    }
                }
                int i5 = dz.A02(2);
                if (i5 == 0) {
                    if (iA02 > 1) {
                        for (int i6 = 0; i6 < mappingsCount; i6++) {
                            dz.A03(4);
                        }
                    }
                    for (int i7 = 0; i7 < iA02; i7++) {
                        dz.A03(8);
                        dz.A03(8);
                        dz.A03(8);
                    }
                } else {
                    throw new C0488Af(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A08(DZ dz) throws C0488Af {
        int iA02 = dz.A02(6) + 1;
        for (int floorType = 0; floorType < iA02; floorType++) {
            int iA03 = dz.A02(16);
            if (iA03 == 0) {
                dz.A03(8);
                dz.A03(16);
                dz.A03(16);
                dz.A03(6);
                dz.A03(8);
                int iA04 = dz.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < iA04; rangeBits++) {
                    dz.A03(8);
                }
            } else {
                if (iA03 != 1) {
                    throw new C0488Af(A05(114, 41, 126) + iA03);
                }
                int j = dz.A02(5);
                int i = -1;
                int[] iArr = new int[j];
                for (int i2 = 0; i2 < j; i2++) {
                    iArr[i2] = dz.A02(4);
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                int[] iArr2 = new int[i + 1];
                int i3 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i3 < length) {
                        iArr2[i3] = dz.A02(3) + 1;
                        int classSubclasses = dz.A02(2);
                        if (classSubclasses > 0) {
                            dz.A03(8);
                        }
                        for (int i4 = 0; i4 < (1 << classSubclasses); i4++) {
                            dz.A03(8);
                        }
                        i3++;
                    } else {
                        dz.A03(2);
                        int count = dz.A02(4);
                        int i5 = 0;
                        int i6 = 0;
                        for (int k = 0; k < j; k++) {
                            int rangeBits2 = iArr[k];
                            i5 += iArr2[rangeBits2];
                            while (i6 < i5) {
                                dz.A03(count);
                                i6++;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void A09(DZ dz) throws C0488Af {
        int iA02 = dz.A02(6) + 1;
        for (int classifications = 0; classifications < iA02; classifications++) {
            if (dz.A02(16) <= 2) {
                dz.A03(24);
                dz.A03(24);
                dz.A03(24);
                int iA03 = dz.A02(6) + 1;
                dz.A03(8);
                int[] iArr = new int[iA03];
                for (int i = 0; i < iA03; i++) {
                    int iA04 = 0;
                    int iA05 = dz.A02(3);
                    if (dz.A04()) {
                        iA04 = dz.A02(5);
                    }
                    int highBits = iA04 * 8;
                    iArr[i] = highBits + iA05;
                }
                for (int i2 = 0; i2 < iA03; i2++) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        int k = 1 << i3;
                        if ((iArr[i2] & k) != 0) {
                            dz.A03(8);
                        }
                    }
                }
            } else {
                throw new C0488Af(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i, C0679Ij c0679Ij, boolean z) throws C0488Af {
        if (c0679Ij.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C0488Af(A05(464, 18, 64) + c0679Ij.A04());
        }
        if (c0679Ij.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C0488Af(A05(93, 21, 10) + Integer.toHexString(i));
        }
        if (c0679Ij.A0E() != 118 || c0679Ij.A0E() != 111 || c0679Ij.A0E() != 114 || c0679Ij.A0E() != 98 || c0679Ij.A0E() != 105 || c0679Ij.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C0488Af(A05(10, 28, 24));
        }
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
        strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
        return true;
    }

    public static Dd[] A0B(DZ dz) {
        int iA02 = dz.A02(6) + 1;
        Dd[] ddArr = new Dd[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            ddArr[windowType] = new Dd(dz.A04(), dz.A02(16), dz.A02(16), dz.A02(8));
        }
        return ddArr;
    }

    public static Dd[] A0C(C0679Ij c0679Ij, int i) throws C0488Af {
        A0A(5, c0679Ij, false);
        int i2 = c0679Ij.A0E() + 1;
        DZ dz = new DZ(c0679Ij.A00);
        dz.A03(c0679Ij.A06() * 8);
        for (int i3 = 0; i3 < i2; i3++) {
            A02(dz);
        }
        int iA02 = dz.A02(6) + 1;
        for (int timeCount = 0; timeCount < iA02; timeCount++) {
            int i4 = dz.A02(16);
            if (i4 != 0) {
                throw new C0488Af(A05(311, 52, 110));
            }
        }
        A08(dz);
        A09(dz);
        A07(i, dz);
        Dd[] ddArrA0B = A0B(dz);
        if (dz.A04()) {
            return ddArrA0B;
        }
        throw new C0488Af(A05(155, 43, 69));
    }
}
