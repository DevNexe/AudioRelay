package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J7 {
    public static byte[] A02;
    public static String[] A03 = {"bNwv9DTrsFpr", "zbhYB7daSjPcuvBmkTZuqaAPzZ9zn8h", "FRkSQOtD666PiwdWpMANCzaC3fIlZstE", "hSncHK0YMcK7Os9UUgTo3Hp6GRz3gib", "Da8z6HvdaVwrG586sIxSQ6hlHOkGiutI", "7Q5nL4gzRbsCGic6ITFl05T54duLJG5D", "soaxh0FZrqdNmpGhlM75NEwupCBAn2wQ", "H3bjs2QdHQpI"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-22, 23, 23, 20, 23, -59, 21, 6, 23, 24, 14, 19, 12, -59, -19, -22, -5, -24, -59, 8, 20, 19, 11, 14, 12};
    }

    static {
        A02();
    }

    public J7(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static J7 A00(C0679Ij c0679Ij) throws C0488Af {
        try {
            c0679Ij.A0Z(21);
            int csdStartPosition = c0679Ij.A0E() & 3;
            int i = c0679Ij.A0E();
            int numberOfNalUnits = 0;
            int iA06 = c0679Ij.A06();
            int i2 = 0;
            while (true) {
                String[] strArr = A03;
                String str = strArr[7];
                String str2 = strArr[0];
                int length = str.length();
                int csdLength = str2.length();
                if (length != csdLength) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "tNmJvjDEnkcZ";
                strArr2[0] = "FarTxLmaqbLK";
                if (i2 < i) {
                    c0679Ij.A0Z(1);
                    int iA0I = c0679Ij.A0I();
                    for (int i3 = 0; i3 < iA0I; i3++) {
                        int iA0I2 = c0679Ij.A0I();
                        int csdLength2 = iA0I2 + 4;
                        numberOfNalUnits += csdLength2;
                        c0679Ij.A0Z(iA0I2);
                    }
                    i2++;
                } else {
                    c0679Ij.A0Y(iA06);
                    byte[] bArr = new byte[numberOfNalUnits];
                    int i4 = 0;
                    for (int bufferPosition = 0; bufferPosition < i; bufferPosition++) {
                        c0679Ij.A0Z(1);
                        int i5 = c0679Ij.A0I();
                        for (int i6 = 0; i6 < i5; i6++) {
                            int j = c0679Ij.A0I();
                            byte[] bArr2 = C0675If.A03;
                            int nalUnitLength = C0675If.A03.length;
                            System.arraycopy(bArr2, 0, bArr, i4, nalUnitLength);
                            int nalUnitLength2 = C0675If.A03.length;
                            int i7 = i4 + nalUnitLength2;
                            byte[] bArr3 = c0679Ij.A00;
                            int nalUnitLength3 = c0679Ij.A06();
                            System.arraycopy(bArr3, nalUnitLength3, bArr, i7, j);
                            i4 = i7 + j;
                            c0679Ij.A0Z(j);
                        }
                    }
                    return new J7(numberOfNalUnits == 0 ? null : Collections.singletonList(bArr), csdStartPosition + 1);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C0488Af(A01(0, 25, 121), e);
        }
    }
}
