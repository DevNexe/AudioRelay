package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0675If {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"Oi30oJFxUMFG0gOFP1qEoKnGUzBDTsvx", "3WD4gW2GQkEI5AwBfxSAXddooip3O", "Ouz028YKvSlJVOERB46zGmLFjnusBt99", "zuSd86snyfkH6Kt688AXpDWJmpjjYjYh", "jm5obH6VrXyDYReHZwz8l0mhz55kc4yf", "71eZjkBm8iWWJxdGvDt2NXp", "W8ZvrObejWqz7a9mktO8s2uWHHxOtI0w", "Nv5C13AVolnSAeqab8n4y7TwRlreXIzh"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-4, 15, 26, 3, 28, 23, 34, 3, 34, 23, 26, -41, -16, -25, -6, -14, -25, -27, -10, -25, -26, -94, -29, -11, -14, -25, -27, -10, -31, -12, -29, -10, -21, -15, -31, -21, -26, -27, -94, -8, -29, -18, -9, -25, -68, -94, -9, -22, -27, -26, -16, -80, -30, -9, -28, 7, -6, -11, -10, 0, -64, -7, -10, 7, -12};
    }

    static {
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int A02(byte[] bArr, int position) {
        int position2;
        synchronized (A05) {
            int iA03 = 0;
            int scratchEscapeCount = 0;
            while (iA03 < position) {
                iA03 = A03(bArr, iA03, position);
                if (iA03 < position) {
                    if (A01.length <= scratchEscapeCount) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[scratchEscapeCount] = iA03;
                    iA03 += 3;
                    scratchEscapeCount++;
                }
            }
            position2 = position - scratchEscapeCount;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < scratchEscapeCount; i3++) {
                int unescapedPosition = A01[i3] - i;
                System.arraycopy(bArr, i, bArr, i2, unescapedPosition);
                int i4 = i2 + unescapedPosition;
                int copyLength = i4 + 1;
                bArr[i4] = 0;
                i2 = copyLength + 1;
                bArr[copyLength] = 0;
                i += unescapedPosition + 3;
            }
            int remainingLength = position2 - i2;
            System.arraycopy(bArr, i, bArr, i2, remainingLength);
        }
        return position2;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public static int A04(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr;
        int limit = i2 - i;
        IK.A04(limit >= 0);
        String[] strArr2 = A02;
        if (strArr2[7].charAt(7) == strArr2[4].charAt(7)) {
            String[] strArr3 = A02;
            strArr3[6] = "PHOBqDmtHEL0W2nVKzmeMWYxoTm9mCET";
            strArr3[3] = "qKyyQO8AkkE9NBOuyY91tt3qWy60cHsV";
            if (limit == 0) {
                return i2;
            }
            if (A02[5].length() != 29) {
                A02[5] = "S61tfzcgNm58bvpOt";
                if (zArr != null) {
                    z3 = zArr[0];
                    strArr = A02;
                    if (strArr[7].charAt(7) != strArr[4].charAt(7)) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A02;
                    strArr4[6] = "55fmxhOEMutKpKC77r4Md8gvEpVf5AJr";
                    strArr4[3] = "C8cbl0pwE6ZZ2ZiTcRq9FxMeDjV9Xwky";
                    if (z3) {
                        A0B(zArr);
                        return i - 3;
                    }
                    if (limit <= 1 && zArr[1] && bArr[i] == 1) {
                        A0B(zArr);
                        return i - 2;
                    }
                    if (limit > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
                        A0B(zArr);
                        return i - 1;
                    }
                }
            } else if (zArr != null) {
                z3 = zArr[0];
                strArr = A02;
                if (strArr[7].charAt(7) != strArr[4].charAt(7)) {
                    throw new RuntimeException();
                }
                String[] strArr5 = A02;
                strArr5[6] = "55fmxhOEMutKpKC77r4Md8gvEpVf5AJr";
                strArr5[3] = "C8cbl0pwE6ZZ2ZiTcRq9FxMeDjV9Xwky";
                if (z3) {
                    A0B(zArr);
                    return i - 3;
                }
                if (limit <= 1) {
                }
                if (limit > 2) {
                    A0B(zArr);
                    return i - 1;
                }
            }
            int i4 = i2 - 1;
            String[] strArr6 = A02;
            if (strArr6[6].charAt(21) != strArr6[3].charAt(21)) {
                String[] strArr7 = A02;
                strArr7[6] = "uktgRDQdtpFh8EbCos18fWUkW81B3r6L";
                strArr7[3] = "mrDteKziaJnLJGchN7K4iHB0p5nXZEGM";
                i3 = i + 2;
            } else {
                i3 = i + 2;
            }
            while (i3 < i4) {
                if ((bArr[i3] & 254) == 0) {
                    if (bArr[i3 - 2] == 0 && bArr[i3 - 1] == 0 && bArr[i3] == 1) {
                        if (zArr != null) {
                            A0B(zArr);
                        }
                        int limit2 = i3 - 2;
                        String[] strArr8 = A02;
                        if (strArr8[6].charAt(21) != strArr8[3].charAt(21)) {
                            String[] strArr9 = A02;
                            strArr9[7] = "R0jBdFAV67GondLg32AWi8zsE1yw1KkW";
                            strArr9[4] = "2wkvt5tVRPNRTL1bJFfqOEJwxkS69Blm";
                            return limit2;
                        }
                    } else {
                        i3 -= 2;
                    }
                }
                i3 += 3;
            }
            if (zArr != null) {
                if (limit > 2) {
                    z = bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 1;
                } else if (limit == 2) {
                    z = zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 1;
                } else {
                    z = zArr[1] && bArr[i2 + (-1)] == 1;
                }
                zArr[0] = z;
                if (limit > 1) {
                    z2 = bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
                } else {
                    z2 = zArr[2] && bArr[i2 + (-1)] == 0;
                }
                zArr[1] = z2;
                zArr[2] = bArr[i2 + (-1)] == 0;
            }
            return i2;
        }
        throw new RuntimeException();
    }

    public static C0673Id A05(byte[] bArr, int i, int i2) {
        C0680Ik c0680Ik = new C0680Ik(bArr, i, i2);
        c0680Ik.A07(8);
        int picParameterSetId = c0680Ik.A04();
        int iA04 = c0680Ik.A04();
        c0680Ik.A06();
        boolean bottomFieldPicOrderInFramePresentFlag = c0680Ik.A0A();
        return new C0673Id(picParameterSetId, iA04, bottomFieldPicOrderInFramePresentFlag);
    }

    public static C0674Ie A06(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        C0680Ik c0680Ik = new C0680Ik(bArr, i, i2);
        c0680Ik.A07(8);
        int iA05 = c0680Ik.A05(8);
        c0680Ik.A07(16);
        int iA04 = c0680Ik.A04();
        int iA06 = 1;
        boolean zA0A = false;
        if (iA05 == 100 || iA05 == 110 || iA05 == 122 || iA05 == 244 || iA05 == 44 || iA05 == 83 || iA05 == 86 || iA05 == 118 || iA05 == 128 || iA05 == 138) {
            iA06 = c0680Ik.A04();
            if (iA06 == 3) {
                zA0A = c0680Ik.A0A();
            }
            c0680Ik.A04();
            c0680Ik.A04();
            c0680Ik.A06();
            if (c0680Ik.A0A()) {
                int i5 = iA06 != 3 ? 8 : 12;
                int i6 = 0;
                while (i6 < i5) {
                    if (c0680Ik.A0A()) {
                        A09(c0680Ik, i6 < 6 ? 16 : 64);
                    }
                    i6++;
                }
            }
        }
        int iA07 = c0680Ik.A04() + 4;
        int iA08 = c0680Ik.A04();
        int iA09 = 0;
        boolean zA0A2 = false;
        if (iA08 == 0) {
            iA09 = c0680Ik.A04() + 4;
        } else if (iA08 == 1) {
            zA0A2 = c0680Ik.A0A();
            c0680Ik.A03();
            c0680Ik.A03();
            long jA04 = c0680Ik.A04();
            for (int i7 = 0; i7 < jA04; i7++) {
                c0680Ik.A04();
            }
        } else {
            if (A02[1].length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "gg30aCps8xaKqlQpqNwqV8MpUTOLFqGh";
            strArr[2] = "6dq0Mx0u8Kgv53YJdcFQMlotDlRuazjf";
        }
        c0680Ik.A04();
        c0680Ik.A06();
        int iA010 = c0680Ik.A04() + 1;
        int iA011 = c0680Ik.A04() + 1;
        boolean zA0A3 = c0680Ik.A0A();
        int i8 = (2 - (zA0A3 ? 1 : 0)) * iA011;
        if (!zA0A3) {
            c0680Ik.A06();
        }
        c0680Ik.A06();
        int i9 = iA010 * 16;
        int i10 = i8 * 16;
        if (c0680Ik.A0A()) {
            int iA012 = c0680Ik.A04();
            int iA013 = c0680Ik.A04();
            int iA014 = c0680Ik.A04();
            int iA015 = c0680Ik.A04();
            if (iA06 == 0) {
                i3 = 1;
                i4 = 2 - (zA0A3 ? 1 : 0);
            } else {
                i3 = iA06 == 3 ? 1 : 2;
                i4 = (2 - (zA0A3 ? 1 : 0)) * (iA06 == 1 ? 2 : 1);
            }
            i9 -= (iA012 + iA013) * i3;
            i10 -= (iA014 + iA015) * i4;
        }
        float f = 1.0f;
        boolean zA0A4 = c0680Ik.A0A();
        String[] strArr2 = A02;
        if (strArr2[0].charAt(3) == strArr2[2].charAt(3)) {
            String[] strArr3 = A02;
            strArr3[6] = "jcRzMhbBY3Dw1JTLjGKCGc6YaVOjENSo";
            strArr3[3] = "o4pmI9swvtrYdLR0BRHjmVJPNciV1YNp";
            if (zA0A4) {
                boolean zA0A5 = c0680Ik.A0A();
                String[] strArr4 = A02;
                if (strArr4[0].charAt(3) == strArr4[2].charAt(3)) {
                    String[] strArr5 = A02;
                    strArr5[0] = "nxo01JuHYgIdSih3CNMvKr0vsuD4ByKM";
                    strArr5[2] = "Ktm0TZ4NHFdoOw88agihQWJn0ILc0Ki9";
                    if (zA0A5) {
                        int iA016 = c0680Ik.A05(8);
                        if (iA016 == 255) {
                            int iA017 = c0680Ik.A05(16);
                            int iA018 = c0680Ik.A05(16);
                            if (iA017 != 0 && iA018 != 0) {
                                f = iA017 / iA018;
                            }
                        } else {
                            float[] fArr = A04;
                            if (iA016 < fArr.length) {
                                f = fArr[iA016];
                            } else {
                                Log.w(A07(0, 11, 97), A07(11, 35, 53) + iA016);
                            }
                        }
                    }
                }
            }
            return new C0674Ie(iA04, i9, i10, f, zA0A, zA0A3, iA07, iA08, iA09, zA0A2);
        }
        throw new RuntimeException();
    }

    public static void A09(C0680Ik c0680Ik, int nextScale) {
        int i = 8;
        int deltaScale = 8;
        for (int i2 = 0; i2 < nextScale; i2++) {
            if (deltaScale != 0) {
                int deltaScale2 = c0680Ik.A03();
                deltaScale = ((deltaScale2 + i) + 256) % 256;
            }
            if (deltaScale != 0) {
                i = deltaScale;
            }
        }
    }

    public static void A0A(ByteBuffer byteBuffer) {
        int consecutiveZeros = byteBuffer.position();
        int offset = 0;
        for (int value = 0; value + 1 < consecutiveZeros; value++) {
            int i = byteBuffer.get(value) & 255;
            if (offset == 3) {
                if (i == 1 && (byteBuffer.get(value + 1) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(value - 3);
                    byteBufferDuplicate.limit(consecutiveZeros);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i == 0) {
                offset++;
            }
            if (i != 0) {
                offset = 0;
            }
        }
        byteBuffer.clear();
        if (A02[1].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "LhexrLoV7v0KAfJEyFTOZZKZaNSS1gs0";
        strArr[4] = "gpIVcqUVkpQz0S61taD9WNDesiV6owqm";
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0C(String str, byte b) {
        if (A07(46, 9, 52).equals(str) && (b & 31) == 6) {
            return true;
        }
        return A07(55, 10, 68).equals(str) && ((b & 126) >> 1) == 39;
    }
}
