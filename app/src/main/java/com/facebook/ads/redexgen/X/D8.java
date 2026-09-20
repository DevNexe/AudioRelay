package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D8 {
    public static byte[] A00;
    public static String[] A01 = {"vNU1Clptty9spXV3rmNWKqfECA0GCDno", "yQl7wYGB6utTXxK398wXXYrAeYZNPLId", "BVcq1q5Q", "NihUY4HxpsM0GkJJgFchlTfxDOIJFYzw", "lx4TwpHGLs68", "XI1Xq2FkjwcQfgB5bw70GFmYpaxAyyjl", "uRZmXRdJsodI", "Cygx2J1H2ENb6XLRYlHXnR1vUW4XHHOP"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{49, 37, 119, 106, 114, 102, 110, 115, 110, 115, 108, 88, 102, 114, 117, 113, 106, 120, 70, 121, 89, 110, 114, 106, 120, 121, 102, 114, 117, 73, 106, 113, 121, 102, 37, -112, -124, -42, -55, -47, -59, -51, -46, -51, -46, -53, -73, -59, -47, -44, -48, -55, -41, -83, -46, -89, -52, -39, -46, -49, -124, 71, 59, -115, -128, -120, 124, -124, -119, -124, -119, -126, 111, -124, -120, -128, -114, -113, 124, -120, -117, 95, -128, -121, -113, 124, 94, -125, 124, -119, -126, -128, -114, 59, -110, 120, -54, -67, -59, -71, -63, -58, -63, -58, -65, -85, -47, -58, -69, -64, -54, -57, -58, -63, -46, -71, -52, -63, -57, -58, -85, -71, -59, -56, -60, -67, -53, 120, 100, -105, -110, -112, 115, -124, -107, -106, -120, -107, -106, -76, -46, -39, -38, -35, -44, -39, -46, -117, -48, -49, -44, -33, -117, -41, -44, -34, -33, -91, -117, -48, -49, -44, -33, -117, -49, -38, -48, -34, -117, -39, -38, -33, -117, -34, -33, -52, -35, -33, -117, -30, -44, -33, -45, -117, -52, -117, -34, -28, -39, -50, -117, -34, -52, -40, -37, -41, -48, -103, -110, -73, -84, -72, -73, -68, -78, -68, -67, -82, -73, -67, 105, -68, -67, -85, -75, 105, -85, -72, -63, 105, -81, -72, -69, 105, -67, -69, -86, -84, -76, 105, 117, -109, -126, -124, -116, 65, -119, -126, -108, 65, -113, -112, 65, -108, -126, -114, -111, -115, -122, 65, -107, -126, -125, -115, -122, 65, -108, -118, -101, -122, 65, -118, -113, -121, -112, -109, -114, -126, -107, -118, -112, -113, -120, -95, -90, -88, -93, -93, -94, -91, -89, -104, -105, 83, -96, -104, -105, -100, -108, 83, -91, -108, -89, -104, 97, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -13, -13, -20, -21, -86, -9, -20, -21, -90, -75, -75, -79, -82, -88, -90, -71, -82, -76, -77, 116, -67, 114, -88, -90, -78, -86, -73, -90, 114, -78, -76, -71, -82, -76, -77, -78, -63, -63, -67, -70, -76, -78, -59, -70, -64, -65, -128, -55, 126, -66, -63, -123, 126, -76, -74, -78, 126, -121, -127, -119, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -77, -74, 122, 115, -68, -70, -70, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -85, -81, -93, -99, -91, -82, -93, -89, -97, 103, -82, -78, 109, -95, 124, -112, 127, -124, -118, 74, 78, -126, -117, -117, -126, -106, -123, -118, -112, 80, -126, -124, 84, -69, -49, -66, -61, -55, -119, -69, -58, -69, -67, -33, -13, -30, -25, -19, -83, -33, -21, -16, -85, -11, -32, 107, 127, 110, 115, 121, 57, 111, 107, 109, 61, -109, -89, -106, -101, -95, 97, -97, -94, 102, -109, 95, -98, -109, -90, -97, -65, -45, -62, -57, -51, -115, -53, -50, -61, -59, -68, -48, -65, -60, -54, -118, -51, -68, -46, -94, -74, -91, -86, -80, 112, -73, -81, -91, 111, -91, -75, -76, -87, -67, -84, -79, -73, 119, -66, -74, -84, 118, -84, -68, -69, 118, -80, -84, 109, -127, 112, 117, 123, 59, -126, 122, 112, 58, 112, -128, 127, 58, 116, 112, 71, 124, 126, 123, 114, 117, 120, 113, 73, 120, 110, 126, -119, -120, -119, 87, -32, -33, -32, -16, -124, -122, -113, -124, -43, -41, -32, -27, -110, -105, -104, -101, -109, 112, -93, -98, -100, -126, -104, -87, -108, 79, -94, -105, -98, -92, -101, -109, 79, -111, -108, 79, -97, -98, -94, -104, -93, -104, -91, -108, 101, 110, 101, 114, -119, -107, -112, -124, 67, -124, -105, -110, -112, 67, -116, -106, 67, -112, -124, -111, -121, -124, -105, -110, -107, -100, -50, -58, -43, -62, -100, -117, -99, -107, -99, -115, -110, -109, 74, -117, -98, -103, -105, 74, -109, -99, 74, -105, -117, -104, -114, -117, -98, -103, -100, -93, -51, -55, -49, -56, -108, -106, -125, -107, -59, -74, -65, -76, 113, -78, -59, -64, -66, 113, -70, -60, 113, -66, -78, -65, -75, -78, -59, -64, -61, -54, -48, -63, -44, -48, -39, -52, -57, -56, -77, -90, -95, -94, -84, 108, 112, -92, -83, -83, -52, -65, -70, -69, -59, -123, -73, -52, -71, -14, -27, -32, -31, -21, -85, -28, -31, -14, -33, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 85, -86, -99, -104, -103, -93, 99, -84, 97, -86, -94, -104, 98, -93, -94, 102, 98, -86, -92, 109};
    }

    static {
        A0J();
        A08 = C0695Iz.A08(A0I(696, 4, 97));
        A05 = C0695Iz.A08(A0I(662, 4, 88));
        A07 = C0695Iz.A08(A0I(692, 4, 90));
        A04 = C0695Iz.A08(A0I(636, 4, 39));
        A06 = C0695Iz.A08(A0I(666, 4, 31));
        A02 = C0695Iz.A08(A0I(606, 4, 0));
        A03 = C0695Iz.A08(A0I(632, 4, 95));
    }

    public static float A00(C0679Ij c0679Ij, int i) {
        c0679Ij.A0Y(i + 8);
        return c0679Ij.A0H() / c0679Ij.A0H();
    }

    public static int A01(C0679Ij c0679Ij) {
        int size = c0679Ij.A0E();
        int i = size & 127;
        while ((size & 128) == 128) {
            size = c0679Ij.A0E();
            i = (i << 7) | (size & 127);
        }
        return i;
    }

    public static int A02(C0679Ij c0679Ij) {
        c0679Ij.A0Y(16);
        int iA08 = c0679Ij.A08();
        if (iA08 == A05) {
            return 1;
        }
        int trackType = A08;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "sACqbdB9h4ZaSOP8RBXRhKf5pkODD9Ze";
        strArr[5] = "nfjFHkgcUdXk9ZZxpn0R0spMdbOfBjgH";
        if (iA08 == trackType) {
            return 2;
        }
        if (iA08 != A07 && iA08 != A04 && iA08 != A06 && iA08 != A02) {
            if (iA08 == A03) {
                return 4;
            }
            return -1;
        }
        String[] strArr2 = A01;
        if (strArr2[4].length() != strArr2[6].length()) {
            return 3;
        }
        String[] strArr3 = A01;
        strArr3[0] = "HjSYihfmO4Fjwo0SJsN86rpcIq24412o";
        strArr3[5] = "nDlBCf5sAdyqWE5fn1qZlgrWKnIrwKiA";
        return 3;
    }

    public static int A03(C0679Ij c0679Ij, int i, int i2) {
        int iA06 = c0679Ij.A06();
        while (iA06 - i < i2) {
            c0679Ij.A0Y(iA06);
            int iA08 = c0679Ij.A08();
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            if (c0679Ij.A08() == D3.A0S) {
                return iA06;
            }
            iA06 += iA08;
        }
        return -1;
    }

    public static long A04(C0679Ij c0679Ij) {
        int fullAtom = 8;
        c0679Ij.A0Y(8);
        int version = D3.A01(c0679Ij.A08());
        if (version != 0) {
            fullAtom = 16;
        }
        c0679Ij.A0Z(fullAtom);
        return c0679Ij.A0M();
    }

    public static Pair<long[], long[]> A05(C1025Wa c1025Wa) {
        WZ elst;
        long jA0L;
        if (c1025Wa == null || (elst = c1025Wa.A07(D3.A0O)) == null) {
            return Pair.create(null, null);
        }
        C0679Ij c0679Ij = elst.A00;
        c0679Ij.A0Y(8);
        int fullAtom = c0679Ij.A08();
        int iA01 = D3.A01(fullAtom);
        int iA0H = c0679Ij.A0H();
        long[] jArr = new long[iA0H];
        long[] jArr2 = new long[iA0H];
        for (int i = 0; i < iA0H; i++) {
            if (A01[2].length() != 8) {
                throw new RuntimeException();
            }
            A01[3] = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn";
            jArr[i] = iA01 == 1 ? c0679Ij.A0N() : c0679Ij.A0M();
            if (iA01 == 1) {
                jA0L = c0679Ij.A0L();
            } else {
                int i2 = c0679Ij.A08();
                jA0L = i2;
            }
            jArr2[i] = jA0L;
            int i3 = c0679Ij.A0U();
            if (i3 == 1) {
                c0679Ij.A0Z(2);
            } else {
                throw new IllegalArgumentException(A0I(272, 23, 49));
            }
        }
        Pair<long[], long[]> pairCreate = Pair.create(jArr, jArr2);
        String[] strArr = A01;
        if (strArr[1].charAt(19) == strArr[7].charAt(19)) {
            String[] strArr2 = A01;
            strArr2[0] = "0OgbcJvER11tVuU6ktzS5zcploLwLpnU";
            strArr2[5] = "Fpvfvil3v0kwqlJSCQAnqVBmdIeuMsHJ";
            return pairCreate;
        }
        throw new RuntimeException();
    }

    public static Pair<Long, String> A06(C0679Ij c0679Ij) {
        c0679Ij.A0Y(8);
        int iA01 = D3.A01(c0679Ij.A08());
        int version = iA01 == 0 ? 8 : 16;
        c0679Ij.A0Z(version);
        long jA0M = c0679Ij.A0M();
        int fullAtom = iA01 == 0 ? 4 : 8;
        c0679Ij.A0Z(fullAtom);
        int iA0I = c0679Ij.A0I();
        StringBuilder sb = new StringBuilder();
        sb.append(A0I(0, 0, 122));
        int version2 = iA0I >> 10;
        sb.append((char) ((version2 & 31) + 96));
        int version3 = iA0I >> 5;
        sb.append((char) ((version3 & 31) + 96));
        int version4 = iA0I & 31;
        sb.append((char) (version4 + 96));
        return Pair.create(Long.valueOf(jA0M), sb.toString());
    }

    public static Pair<String, byte[]> A07(C0679Ij c0679Ij, int i) {
        c0679Ij.A0Y(i + 8 + 4);
        c0679Ij.A0Z(1);
        A01(c0679Ij);
        c0679Ij.A0Z(2);
        int iA0E = c0679Ij.A0E();
        int flags = iA0E & 128;
        if (flags != 0) {
            c0679Ij.A0Z(2);
        }
        int flags2 = iA0E & 64;
        if (flags2 != 0) {
            int flags3 = c0679Ij.A0I();
            c0679Ij.A0Z(flags3);
        }
        int flags4 = iA0E & 32;
        if (flags4 != 0) {
            c0679Ij.A0Z(2);
        }
        c0679Ij.A0Z(1);
        A01(c0679Ij);
        int iA0E2 = c0679Ij.A0E();
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[5];
        int iCharAt = str.charAt(2);
        int flags5 = str2.charAt(2);
        if (iCharAt == flags5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "ipSJ7rerSzX8";
        strArr2[6] = "rVXKHnYgOQNY";
        String strA03 = C0672Ic.A03(iA0E2);
        String mimeType = A0I(482, 10, 92);
        if (!mimeType.equals(strA03)) {
            String mimeType2 = A0I(501, 13, 63);
            if (!mimeType2.equals(strA03)) {
                String mimeType3 = A0I(514, 16, 70);
                if (!mimeType3.equals(strA03)) {
                    c0679Ij.A0Z(12);
                    c0679Ij.A0Z(1);
                    int iA01 = A01(c0679Ij);
                    byte[] bArr = new byte[iA01];
                    c0679Ij.A0c(bArr, 0, iA01);
                    return Pair.create(strA03, bArr);
                }
            }
        }
        Pair<String, byte[]> pairCreate = Pair.create(strA03, null);
        if (A01[3].charAt(8) != 'p') {
            return pairCreate;
        }
        String[] strArr3 = A01;
        strArr3[1] = "09LVPMUcXpQFix5jag1XMCG3MLP6JHGE";
        strArr3[7] = "l6DCOVwnZaQMuPJJN9SXx5QHr45WFHuE";
        return pairCreate;
    }

    public static Pair<Integer, DP> A08(C0679Ij c0679Ij, int schemeInformationBoxPosition, int schemeInformationBoxSize) {
        int i = schemeInformationBoxPosition + 8;
        int i2 = -1;
        int childAtomSize = 0;
        String strA0S = null;
        Integer numValueOf = null;
        while (true) {
            int i3 = i - schemeInformationBoxPosition;
            if (A01[3].charAt(8) != 'p') {
                throw new RuntimeException();
            }
            A01[2] = "AMwqROlZ";
            if (i3 < schemeInformationBoxSize) {
                c0679Ij.A0Y(i);
                int iA08 = c0679Ij.A08();
                int iA09 = c0679Ij.A08();
                if (iA09 == D3.A0T) {
                    numValueOf = Integer.valueOf(c0679Ij.A08());
                } else if (iA09 == D3.A0z) {
                    c0679Ij.A0Z(4);
                    strA0S = c0679Ij.A0S(4);
                } else if (iA09 == D3.A0y) {
                    i2 = i;
                    childAtomSize = iA08;
                }
                i += iA08;
            } else {
                if (A0I(566, 4, 31).equals(strA0S) || A0I(558, 4, 36).equals(strA0S) || A0I(570, 4, 112).equals(strA0S) || A0I(562, 4, 123).equals(strA0S)) {
                    boolean z = true;
                    IK.A05(numValueOf != null, A0I(610, 22, 33));
                    IK.A05(i2 != -1, A0I(640, 22, 40));
                    DP dpA0D = A0D(c0679Ij, i2, childAtomSize, strA0S);
                    if (dpA0D == null) {
                        z = false;
                    }
                    IK.A05(z, A0I(670, 22, 79));
                    return Pair.create(numValueOf, dpA0D);
                }
                return null;
            }
        }
    }

    public static Pair<Integer, DP> A09(C0679Ij c0679Ij, int i, int i2) {
        Pair<Integer, DP> pairA08;
        int iA06 = c0679Ij.A06();
        while (iA06 - i < i2) {
            c0679Ij.A0Y(iA06);
            int iA08 = c0679Ij.A08();
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            if (c0679Ij.A08() == D3.A13 && (pairA08 = A08(c0679Ij, iA06, iA08)) != null) {
                return pairA08;
            }
            iA06 += iA08;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:87:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x015d A[SYNTHETIC] */
    public static D6 A0A(C0679Ij c0679Ij, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws C0488Af {
        int i3;
        int i4;
        String[] strArr;
        C0679Ij c0679Ij2 = c0679Ij;
        c0679Ij2.A0Y(12);
        int iA08 = c0679Ij2.A08();
        D6 d6 = new D6(iA08);
        for (int numberOfEntries = 0; numberOfEntries < iA08; numberOfEntries++) {
            int i5 = c0679Ij2.A06();
            int childStartPosition = c0679Ij2.A08();
            IK.A05(childStartPosition > 0, A0I(574, 32, 45));
            int iA09 = c0679Ij2.A08();
            if (iA09 == D3.A06 || iA09 == D3.A07 || iA09 == D3.A0R || iA09 == D3.A0l || iA09 == D3.A0X || iA09 == D3.A0W || iA09 == D3.A0s || iA09 == D3.A1S || iA09 == D3.A1T) {
                A0K(c0679Ij2, iA09, i5, childStartPosition, i, i2, drmInitData, d6, numberOfEntries);
            } else {
                if (iA09 == D3.A0k || iA09 == D3.A0Q || iA09 == D3.A04 || iA09 == D3.A0M || iA09 == D3.A0I || iA09 == D3.A0J || iA09 == D3.A0K) {
                    c0679Ij2 = c0679Ij2;
                    A0M(c0679Ij2, iA09, i5, childStartPosition, i, str, z, drmInitData, d6, numberOfEntries);
                } else {
                    int i6 = D3.A0L;
                    String[] strArr2 = A01;
                    if (strArr2[0].charAt(2) != strArr2[5].charAt(2)) {
                        String[] strArr3 = A01;
                        strArr3[1] = "aFNChY2Gp5UEShUqI2ZXHXvlMwnckVls";
                        strArr3[7] = "ICAWmHz3ZpXYA3N9yykXLnBWwAg7HORp";
                        if (iA09 != i6) {
                            if (iA09 == D3.A0v && iA09 != D3.A0w && iA09 != D3.A0a && iA09 != D3.A14 && iA09 != D3.A03) {
                                int i7 = D3.A05;
                                if (A01[3].charAt(8) != 'p') {
                                    A01[2] = "qFwSWgIL";
                                    if (iA09 != i7) {
                                        i3 = D3.A02;
                                        if (A01[2].length() != 8) {
                                            String[] strArr4 = A01;
                                            strArr4[0] = "Ao0TD4kH2iK3OLyPM25FC6RmFi2h7I9b";
                                            strArr4[5] = "OuNutSfPZXXgacWVKzm9oLRb1otwM5q4";
                                            if (iA09 != i3) {
                                                i4 = D3.A1O;
                                                strArr = A01;
                                                if (strArr[1].charAt(19) != strArr[7].charAt(19)) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr5 = A01;
                                                strArr5[0] = "AIk7lRaJ8E5MijNPplfsCP53DjqDD31L";
                                                strArr5[5] = "UZtf95QrnIyEi2GPpmv3pYGFcGVBr3II";
                                                if (iA09 != i4 || iA09 == D3.A1W || iA09 == D3.A18 || iA09 == D3.A09) {
                                                    c0679Ij2 = c0679Ij2;
                                                    i5 = i5;
                                                    childStartPosition = childStartPosition;
                                                    A0L(c0679Ij2, iA09, i5, childStartPosition, i, str, d6);
                                                } else if (iA09 == D3.A0A) {
                                                    String string = Integer.toString(i);
                                                    if (A01[2].length() != 8) {
                                                        d6.A02 = Format.A0B(string, A0I(315, 27, 67), null, -1, null);
                                                    } else {
                                                        String[] strArr6 = A01;
                                                        strArr6[4] = "I4VfvCwCFlYX";
                                                        strArr6[6] = "JqrGNuQTdpXg";
                                                        d6.A02 = Format.A0B(string, A0I(315, 27, 67), null, -1, null);
                                                    }
                                                }
                                            } else {
                                                c0679Ij2 = c0679Ij2;
                                                i5 = i5;
                                                childStartPosition = childStartPosition;
                                                A0L(c0679Ij2, iA09, i5, childStartPosition, i, str, d6);
                                            }
                                        }
                                    }
                                } else {
                                    A01[3] = "CalJSZVBpFQrcbMBJJxLaxIn8rHUlaUl";
                                    if (iA09 != i7) {
                                        i3 = D3.A02;
                                        if (A01[2].length() != 8) {
                                            String[] strArr7 = A01;
                                            strArr7[0] = "Ao0TD4kH2iK3OLyPM25FC6RmFi2h7I9b";
                                            strArr7[5] = "OuNutSfPZXXgacWVKzm9oLRb1otwM5q4";
                                            if (iA09 != i3) {
                                                i4 = D3.A1O;
                                                strArr = A01;
                                                if (strArr[1].charAt(19) != strArr[7].charAt(19)) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr8 = A01;
                                                strArr8[0] = "AIk7lRaJ8E5MijNPplfsCP53DjqDD31L";
                                                strArr8[5] = "UZtf95QrnIyEi2GPpmv3pYGFcGVBr3II";
                                                if (iA09 != i4) {
                                                    c0679Ij2 = c0679Ij2;
                                                    i5 = i5;
                                                    childStartPosition = childStartPosition;
                                                    A0L(c0679Ij2, iA09, i5, childStartPosition, i, str, d6);
                                                } else {
                                                    c0679Ij2 = c0679Ij2;
                                                    i5 = i5;
                                                    childStartPosition = childStartPosition;
                                                    A0L(c0679Ij2, iA09, i5, childStartPosition, i, str, d6);
                                                }
                                            } else {
                                                c0679Ij2 = c0679Ij2;
                                                i5 = i5;
                                                childStartPosition = childStartPosition;
                                                A0L(c0679Ij2, iA09, i5, childStartPosition, i, str, d6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        String[] strArr9 = A01;
                        strArr9[4] = "Sa7AXdU7dVgi";
                        strArr9[6] = "cU1MdBqtKcjZ";
                        if (iA09 != i6) {
                            if (iA09 == D3.A0v) {
                            }
                        }
                    }
                    c0679Ij2 = c0679Ij2;
                    A0M(c0679Ij2, iA09, i5, childStartPosition, i, str, z, drmInitData, d6, numberOfEntries);
                }
                throw new RuntimeException();
            }
            int i8 = i5 + childStartPosition;
            String[] strArr10 = A01;
            if (strArr10[4].length() != strArr10[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr11 = A01;
            strArr11[4] = "IGv93Dj7KDTv";
            strArr11[6] = "6A1iIS8N9vp3";
            c0679Ij2.A0Y(i8);
        }
        return d6;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    public static D7 A0B(C0679Ij c0679Ij) {
        long jA0M;
        int fixedOne;
        int a11;
        int durationByteCount;
        int length;
        int fixedOne2;
        c0679Ij.A0Y(8);
        int a00 = D3.A01(c0679Ij.A08());
        int version = a00 == 0 ? 8 : 16;
        c0679Ij.A0Z(version);
        int iA08 = c0679Ij.A08();
        c0679Ij.A0Z(4);
        int i = 1;
        int iA06 = c0679Ij.A06();
        int fullAtom = a00 == 0 ? 4 : 8;
        for (int a01 = 0; a01 < fullAtom; a01++) {
            int version2 = iA06 + a01;
            if (c0679Ij.A00[version2] != -1) {
                i = 0;
                break;
            }
        }
        if (i != 0) {
            c0679Ij.A0Z(fullAtom);
            jA0M = -9223372036854775807L;
        } else {
            jA0M = a00 == 0 ? c0679Ij.A0M() : c0679Ij.A0N();
            if (jA0M == 0) {
                jA0M = -9223372036854775807L;
            }
        }
        c0679Ij.A0Z(16);
        int fullAtom2 = c0679Ij.A08();
        int a02 = c0679Ij.A08();
        c0679Ij.A0Z(4);
        int trackId = c0679Ij.A08();
        int durationPosition = c0679Ij.A08();
        if (fullAtom2 == 0 && a02 == 65536) {
            int fixedOne3 = -65536;
            if (trackId == fixedOne3 && durationPosition == 0) {
                a11 = 90;
            } else if (fullAtom2 == 0) {
                durationByteCount = -65536;
                String[] strArr = A01;
                String str = strArr[4];
                String str2 = strArr[6];
                length = str.length();
                fixedOne2 = str2.length();
                if (length != fixedOne2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "i5DrkfhddIOc";
                strArr2[6] = "TqiRE9mqRyND";
                if (a02 != durationByteCount) {
                    fixedOne = -65536;
                    if (fullAtom2 != fixedOne) {
                        a11 = 0;
                    } else {
                        a11 = 0;
                    }
                } else {
                    fixedOne = -65536;
                    if (fullAtom2 != fixedOne) {
                        a11 = 0;
                    } else {
                        a11 = 0;
                    }
                }
            } else {
                fixedOne = -65536;
                if (fullAtom2 != fixedOne) {
                    a11 = 0;
                } else {
                    a11 = 0;
                }
            }
        } else if (fullAtom2 == 0) {
            durationByteCount = -65536;
            String[] strArr3 = A01;
            String str3 = strArr3[4];
            String str4 = strArr3[6];
            length = str3.length();
            fixedOne2 = str4.length();
            if (length != fixedOne2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A01;
            strArr4[4] = "i5DrkfhddIOc";
            strArr4[6] = "TqiRE9mqRyND";
            if (a02 != durationByteCount && trackId == 65536 && durationPosition == 0) {
                a11 = 270;
            } else {
                fixedOne = -65536;
                if (fullAtom2 != fixedOne && a02 == 0 && trackId == 0) {
                    int fixedOne4 = -65536;
                    if (durationPosition == fixedOne4) {
                        a11 = 180;
                    } else {
                        a11 = 0;
                    }
                } else {
                    a11 = 0;
                }
            }
        } else {
            fixedOne = -65536;
            if (fullAtom2 != fixedOne) {
                a11 = 0;
            } else {
                a11 = 0;
            }
        }
        return new D7(iA08, jA0M, a11);
    }

    public static DO A0C(C1025Wa c1025Wa, WZ wz, long j, DrmInitData drmInitData, boolean z, boolean z2) throws C0488Af {
        long jA0F;
        long j2 = j;
        C1025Wa c1025WaA06 = c1025Wa.A06(D3.A0d);
        int iA02 = A02(c1025WaA06.A07(D3.A0V).A00);
        if (iA02 == -1) {
            return null;
        }
        WZ wzA07 = c1025Wa.A07(D3.A1J);
        if (A01[3].charAt(8) != 'p') {
            throw new RuntimeException();
        }
        A01[2] = "QWUsjPBg";
        D7 d7A0B = A0B(wzA07.A00);
        if (j2 == -9223372036854775807L) {
            j2 = d7A0B.A02;
        }
        long jA04 = A04(wz.A00);
        if (j2 == -9223372036854775807L) {
            jA0F = -9223372036854775807L;
        } else {
            jA0F = C0695Iz.A0F(j2, 1000000L, jA04);
        }
        C1025Wa c1025WaA07 = c1025WaA06.A06(D3.A0h).A06(D3.A16);
        Pair<Long, String> pairA06 = A06(c1025WaA06.A07(D3.A0c).A00);
        D6 d6A0A = A0A(c1025WaA07.A07(D3.A1A).A00, d7A0B.A00, d7A0B.A01, (String) pairA06.second, drmInitData, z2);
        long[] editListDurations = null;
        long[] jArr = null;
        if (!z) {
            Pair<long[], long[]> pairA05 = A05(c1025Wa.A06(D3.A0N));
            editListDurations = (long[]) pairA05.first;
            jArr = (long[]) pairA05.second;
        }
        if (d6A0A.A02 == null) {
            return null;
        }
        return new DO(d7A0B.A00, iA02, ((Long) pairA06.first).longValue(), jA04, jA0F, d6A0A.A02, d6A0A.A01, d6A0A.A03, d6A0A.A00, editListDurations, jArr);
    }

    public static DP A0D(C0679Ij c0679Ij, int childPosition, int i, String str) {
        int constantIvSize = childPosition + 8;
        while (constantIvSize - childPosition < i) {
            c0679Ij.A0Y(constantIvSize);
            int defaultCryptByteBlock = c0679Ij.A08();
            if (c0679Ij.A08() == D3.A1G) {
                int version = D3.A01(c0679Ij.A08());
                boolean z = true;
                c0679Ij.A0Z(1);
                int i2 = 0;
                int i3 = 0;
                if (version == 0) {
                    c0679Ij.A0Z(1);
                } else {
                    int defaultSkipByteBlock = c0679Ij.A0E();
                    int patternByte = defaultSkipByteBlock & 240;
                    i2 = patternByte >> 4;
                    i3 = defaultSkipByteBlock & 15;
                }
                int version2 = c0679Ij.A0E();
                if (version2 != 1) {
                    z = false;
                }
                int iA0E = c0679Ij.A0E();
                byte[] bArr = new byte[16];
                int defaultPerSampleIvSize = bArr.length;
                c0679Ij.A0c(bArr, 0, defaultPerSampleIvSize);
                byte[] bArr2 = null;
                if (z && iA0E == 0) {
                    int iA0E2 = c0679Ij.A0E();
                    bArr2 = new byte[iA0E2];
                    c0679Ij.A0c(bArr2, 0, iA0E2);
                    if (A01[2].length() != 8) {
                        throw new RuntimeException();
                    }
                    A01[2] = "N18HcU44";
                }
                return new DP(z, str, iA0E, bArr, i2, i3, bArr2);
            }
            constantIvSize += defaultCryptByteBlock;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x044b  */
    /* JADX WARN: Code duplicated, block: B:186:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170 A[ADDED_TO_REGION, LOOP:1: B:54:0x0170->B:55:0x0172, LOOP_START, PHI: r5 r7
  0x0170: PHI (r5v22 'timestampTimeUnits' long) = (r5v16 'timestampTimeUnits' long), (r5v24 'timestampTimeUnits' long) binds: [B:53:0x016e, B:55:0x0172] A[DONT_GENERATE, DONT_INLINE]
  0x0170: PHI (r7v16 int) = (r7v15 int), (r7v18 int) binds: [B:53:0x016e, B:55:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172 A[LOOP:1: B:54:0x0170->B:55:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0180 A[ADDED_TO_REGION, LOOP:2: B:57:0x0180->B:59:0x0184, LOOP_START, PHI: r25 r26 r27
  0x0180: PHI (r25v6 int) = (r25v4 int), (r25v7 int) binds: [B:56:0x017e, B:59:0x0184] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r26v8 int) = (r26v4 int), (r26v9 int) binds: [B:56:0x017e, B:59:0x0184] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r27v5 int) = (r27v3 int), (r27v7 int) binds: [B:56:0x017e, B:59:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:90:0x0205  */
    /* JADX WARN: Code duplicated, block: B:93:0x0215 A[LOOP:8: B:91:0x020f->B:93:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    public static DR A0E(DO r38, C1025Wa c1025Wa, C0539Cg c0539Cg) throws C0488Af {
        D5 wx;
        WZ wzA07;
        C0679Ij c0679Ij;
        C0679Ij c0679Ij2;
        D4 d4;
        int iA0H;
        int iA0H2;
        int iA0H3;
        int iA0H4;
        int iA0H5;
        int iA08;
        int i;
        int sampleCount;
        boolean z;
        int remainingTimestampOffsetChanges;
        long j;
        String strA0I;
        DO r0;
        long[] jArr;
        int[] chunkSampleCounts;
        long[] jArr2;
        int[] iArr;
        long[] jArr3;
        int[] iArr2;
        long timestampTimeUnits;
        long jA0F;
        int i2;
        boolean z2;
        int i3;
        long[] jArr4;
        long timestampTimeUnits2;
        int i4;
        int remainingTimestampDeltaChanges;
        boolean z3;
        boolean z4;
        int timestampDeltaInTimeUnits;
        int nextSynchronizationSampleIndex;
        int timestampDeltaInTimeUnits2;
        int length;
        int nextSynchronizationSampleIndex2;
        WZ wzA08 = c1025Wa.A07(D3.A1C);
        if (wzA08 != null) {
            wx = new WY(wzA08);
        } else {
            WZ wzA09 = c1025Wa.A07(D3.A1E);
            if (wzA09 != null) {
                wx = new WX(wzA09);
            } else {
                throw new C0488Af(A0I(230, 42, 31));
            }
        }
        int maximumSize = wx.A7J();
        if (maximumSize == 0) {
            return new DR(r38, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        boolean z5 = false;
        WZ wzA010 = c1025Wa.A07(D3.A17);
        if (wzA010 == null) {
            z5 = true;
            int i5 = D3.A0B;
            if (A01[2].length() == 8) {
                String[] strArr = A01;
                strArr[4] = "tAZ8kw98eWsC";
                strArr[6] = "j06huWSmFoSN";
                wzA010 = c1025Wa.A07(i5);
                C0679Ij c0679Ij3 = wzA010.A00;
                C0679Ij c0679Ij4 = c1025Wa.A07(D3.A19).A00;
                C0679Ij stsc = c1025Wa.A07(D3.A1D).A00;
                wzA07 = c1025Wa.A07(D3.A1B);
                if (wzA07 != null) {
                    c0679Ij = wzA07.A00;
                } else {
                    c0679Ij = null;
                }
                WZ wzA011 = c1025Wa.A07(D3.A0C);
                c0679Ij2 = wzA011 != null ? wzA011.A00 : null;
                d4 = new D4(c0679Ij4, c0679Ij3, z5);
                stsc.A0Y(12);
                iA0H = stsc.A0H() - 1;
                iA0H2 = stsc.A0H();
                iA0H3 = stsc.A0H();
                iA0H4 = 0;
                iA0H5 = 0;
                iA08 = 0;
                if (c0679Ij2 != null) {
                    c0679Ij2.A0Y(12);
                    if (A01[2].length() != 8) {
                        A01[3] = "L0AwLnMzpUVZw0eA5xJMrWaPTFyNZJ4l";
                        iA0H5 = c0679Ij2.A0H();
                    } else {
                        String[] strArr2 = A01;
                        strArr2[0] = "QSMsFg5SqZ0MdGMo2pjKfVLErbdATzfM";
                        strArr2[5] = "0ZxnaUDgpQuXguOXfTzNI5lEB6qL53xV";
                        iA0H5 = c0679Ij2.A0H();
                    }
                }
                i = -1;
                sampleCount = 0;
                if (c0679Ij != null) {
                    c0679Ij.A0Y(12);
                    sampleCount = c0679Ij.A0H();
                    if (sampleCount > 0) {
                        int nextSynchronizationSampleIndex3 = c0679Ij.A0H();
                        i = nextSynchronizationSampleIndex3 - 1;
                        String[] strArr3 = A01;
                        String str = strArr3[4];
                        String str2 = strArr3[6];
                        length = str.length();
                        nextSynchronizationSampleIndex2 = str2.length();
                        if (length == nextSynchronizationSampleIndex2) {
                            A01[2] = "faWOqNa6";
                        }
                    } else {
                        c0679Ij = null;
                    }
                }
                if (wx.A8U()) {
                    if (!A0I(492, 9, 89).equals(r38.A07.A0O) && iA0H == 0 && iA0H5 == 0 && sampleCount == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                remainingTimestampOffsetChanges = 0;
                j = 0;
                strA0I = A0I(128, 11, 33);
                if (!z) {
                    jArr2 = new long[maximumSize];
                    iArr = new int[maximumSize];
                    jArr3 = new long[maximumSize];
                    iArr2 = new int[maximumSize];
                    timestampTimeUnits2 = 0;
                    i4 = 0;
                    for (remainingTimestampDeltaChanges = 0; remainingTimestampDeltaChanges < maximumSize; remainingTimestampDeltaChanges++) {
                        while (i4 == 0) {
                            IK.A04(d4.A02());
                            timestampTimeUnits2 = d4.A02;
                            i4 = d4.A01;
                        }
                        if (c0679Ij2 != null) {
                            while (iA0H4 == 0 && iA0H5 > 0) {
                                iA0H4 = c0679Ij2.A0H();
                                iA08 = c0679Ij2.A08();
                                iA0H5--;
                            }
                            iA0H4--;
                        }
                        jArr2[remainingTimestampDeltaChanges] = timestampTimeUnits2;
                        int timestampDeltaInTimeUnits3 = wx.ADd();
                        iArr[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits3;
                        timestampDeltaInTimeUnits = iArr[remainingTimestampDeltaChanges];
                        nextSynchronizationSampleIndex = remainingTimestampOffsetChanges;
                        if (timestampDeltaInTimeUnits > nextSynchronizationSampleIndex) {
                            remainingTimestampOffsetChanges = iArr[remainingTimestampDeltaChanges];
                        }
                        int timestampDeltaInTimeUnits4 = iA08;
                        jArr3[remainingTimestampDeltaChanges] = j + ((long) timestampDeltaInTimeUnits4);
                        if (c0679Ij == null) {
                            timestampDeltaInTimeUnits2 = 1;
                        } else {
                            timestampDeltaInTimeUnits2 = 0;
                        }
                        iArr2[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits2;
                        if (remainingTimestampDeltaChanges == i) {
                            iArr2[remainingTimestampDeltaChanges] = 1;
                            sampleCount--;
                            if (sampleCount > 0) {
                                int timestampDeltaInTimeUnits5 = c0679Ij.A0H();
                                i = timestampDeltaInTimeUnits5 - 1;
                            }
                        }
                        j += (long) iA0H3;
                        iA0H2--;
                        if (iA0H2 != 0 && iA0H > 0) {
                            iA0H2 = stsc.A0H();
                            iA0H3 = stsc.A08();
                            iA0H--;
                        }
                        int timestampDeltaInTimeUnits6 = iArr[remainingTimestampDeltaChanges];
                        timestampTimeUnits2 += (long) timestampDeltaInTimeUnits6;
                        i4--;
                    }
                    timestampTimeUnits = j + ((long) iA08);
                    if (iA0H4 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    IK.A03(z3);
                    while (iA0H5 > 0) {
                        if (c0679Ij2.A0H() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        IK.A03(z4);
                        c0679Ij2.A08();
                        iA0H5--;
                    }
                    if (sampleCount == 0 || iA0H2 != 0 || i4 != 0 || iA0H != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0I(198, 32, 71));
                        r0 = r38;
                        sb.append(r0.A00);
                        sb.append(A0I(94, 34, 86));
                        sb.append(sampleCount);
                        sb.append(A0I(0, 35, 3));
                        sb.append(iA0H2);
                        sb.append(A0I(35, 26, 98));
                        sb.append(i4);
                        sb.append(A0I(61, 33, 25));
                        sb.append(iA0H);
                        Log.w(strA0I, sb.toString());
                    } else {
                        r0 = r38;
                    }
                } else {
                    r0 = r38;
                    jArr = new long[d4.A05];
                    chunkSampleCounts = new int[d4.A05];
                    while (d4.A02()) {
                        jArr[d4.A00] = d4.A02;
                        chunkSampleCounts[d4.A00] = d4.A01;
                    }
                    DB dbA00 = DC.A00(C0695Iz.A05(r0.A07.A0A, r0.A07.A05), jArr, chunkSampleCounts, iA0H3);
                    jArr2 = dbA00.A04;
                    iArr = dbA00.A03;
                    remainingTimestampOffsetChanges = dbA00.A00;
                    jArr3 = dbA00.A05;
                    iArr2 = dbA00.A02;
                    timestampTimeUnits = dbA00.A01;
                }
                jA0F = C0695Iz.A0F(timestampTimeUnits, 1000000L, r0.A06);
                if (r0.A08 != null || c0539Cg.A03()) {
                    C0695Iz.A0a(jArr3, 1000000L, r0.A06);
                    return new DR(r38, jArr2, iArr, remainingTimestampOffsetChanges, jArr3, iArr2, jA0F);
                }
                if (r0.A08.length == 1 && r0.A03 == 1 && jArr3.length >= 2) {
                    long j2 = r0.A09[0];
                    long j3 = r0.A08[0];
                    long timestampTimeUnits3 = r0.A06;
                    long jA0F2 = j2 + C0695Iz.A0F(j3, timestampTimeUnits3, r0.A05);
                    if (A0N(jArr3, timestampTimeUnits, j2, jA0F2)) {
                        long j4 = j2 - jArr3[0];
                        long timestampTimeUnits4 = r0.A07.A0C;
                        long timestampTimeUnits5 = C0695Iz.A0F(j4, timestampTimeUnits4, r0.A06);
                        long jA0F3 = C0695Iz.A0F(timestampTimeUnits - jA0F2, r0.A07.A0C, r0.A06);
                        if ((timestampTimeUnits5 != 0 || jA0F3 != 0) && timestampTimeUnits5 <= 2147483647L && jA0F3 <= 2147483647L) {
                            int timestampDeltaInTimeUnits7 = (int) timestampTimeUnits5;
                            c0539Cg.A00 = timestampDeltaInTimeUnits7;
                            int timestampDeltaInTimeUnits8 = (int) jA0F3;
                            c0539Cg.A01 = timestampDeltaInTimeUnits8;
                            C0695Iz.A0a(jArr3, 1000000L, r0.A06);
                            return new DR(r38, jArr2, iArr, remainingTimestampOffsetChanges, jArr3, iArr2, jA0F);
                        }
                    }
                }
                if (r0.A08.length == 1 && r0.A08[0] == 0) {
                    long j5 = r0.A09[0];
                    for (int i6 = 0; i6 < jArr3.length; i6++) {
                        long j6 = jArr3[i6] - j5;
                        long editStartTime = r0.A06;
                        jArr3[i6] = C0695Iz.A0F(j6, 1000000L, editStartTime);
                    }
                    return new DR(r38, jArr2, iArr, remainingTimestampOffsetChanges, jArr3, iArr2, C0695Iz.A0F(timestampTimeUnits - j5, 1000000L, r0.A06));
                }
                boolean z6 = r0.A03 == 1;
                int nextSampleIndex = 0;
                if (A01[2].length() != 8) {
                    i2 = 0;
                    z2 = false;
                    i3 = 0;
                } else {
                    String[] strArr4 = A01;
                    strArr4[1] = "Y0WQDc4By6ZKUv50MYhXYaKvo73wTc1o";
                    strArr4[7] = "Jm7R3atyNmMw0aUGXjhXYWAr036NwYgB";
                    i2 = 0;
                    z2 = false;
                    i3 = 0;
                }
                while (i3 < r0.A08.length) {
                    long j7 = r0.A09[i3];
                    if (j7 != -1) {
                        long j8 = r0.A08[i3];
                        long j9 = r0.A06;
                        long editMediaTime = r0.A05;
                        long jA0F4 = C0695Iz.A0F(j8, j9, editMediaTime);
                        int iA0A = C0695Iz.A0A(jArr3, j7, true, true);
                        long[] offsets = jArr3;
                        int iA0A2 = C0695Iz.A0A(offsets, j7 + jA0F4, z6, false);
                        nextSampleIndex += iA0A2 - iA0A;
                        z2 |= i2 != iA0A;
                        i2 = iA0A2;
                    }
                    i3++;
                }
                boolean z7 = z2 | (nextSampleIndex != maximumSize);
                if (z7) {
                    long[] offsets2 = new long[nextSampleIndex];
                    jArr4 = offsets2;
                } else {
                    jArr4 = jArr2;
                }
                int[] iArr3 = z7 ? new int[nextSampleIndex] : iArr;
                String[] strArr5 = A01;
                if (strArr5[4].length() != strArr5[6].length()) {
                    if (z7) {
                        remainingTimestampOffsetChanges = 0;
                    }
                } else {
                    String[] strArr6 = A01;
                    strArr6[0] = "b1s07kiuWm4Sv6lyFuYOGmq6UfYY91Mt";
                    strArr6[5] = "5TFtKF5bzm86egGGGI715VMxkVJ0hxpg";
                    if (z7) {
                        remainingTimestampOffsetChanges = 0;
                    }
                }
                int[] iArr4 = z7 ? new int[nextSampleIndex] : iArr2;
                long[] jArr5 = new long[nextSampleIndex];
                long j10 = 0;
                int editedMaximumSize = 0;
                for (int i7 = 0; i7 < r0.A08.length; i7++) {
                    long timestampTimeUnits6 = r0.A09[i7];
                    long j11 = r0.A08[i7];
                    if (timestampTimeUnits6 != -1) {
                        long jA0F5 = C0695Iz.A0F(j11, r0.A06, r0.A05) + timestampTimeUnits6;
                        int sampleCount2 = C0695Iz.A0A(jArr3, timestampTimeUnits6, true, true);
                        int iA0A3 = C0695Iz.A0A(jArr3, jA0F5, z6, false);
                        if (z7) {
                            int i8 = iA0A3 - sampleCount2;
                            System.arraycopy(jArr2, sampleCount2, jArr4, editedMaximumSize, i8);
                            System.arraycopy(iArr, sampleCount2, iArr3, editedMaximumSize, i8);
                            System.arraycopy(iArr2, sampleCount2, iArr4, editedMaximumSize, i8);
                        }
                        if (sampleCount2 < iA0A3) {
                            int i9 = iArr4[editedMaximumSize] & 1;
                            if (A01[2].length() == 8) {
                                A01[2] = "0L8vuzYj";
                                if (i9 == 0) {
                                    Log.w(strA0I, A0I(139, 59, 105));
                                    throw new WW();
                                }
                            } else if (i9 == 0) {
                                Log.w(strA0I, A0I(139, 59, 105));
                                throw new WW();
                            }
                        }
                        while (sampleCount2 < iA0A3) {
                            long jA0F6 = C0695Iz.A0F(j10, 1000000L, r0.A05);
                            long j12 = jArr3[sampleCount2] - timestampTimeUnits6;
                            long ptsUs = r0.A06;
                            jArr5[editedMaximumSize] = jA0F6 + C0695Iz.A0F(j12, 1000000L, ptsUs);
                            if (z7) {
                                int i10 = iArr3[editedMaximumSize];
                                String[] strArr7 = A01;
                                if (strArr7[0].charAt(2) != strArr7[5].charAt(2)) {
                                    A01[2] = "F0gq9lor";
                                    if (i10 > remainingTimestampOffsetChanges) {
                                        remainingTimestampOffsetChanges = iArr[sampleCount2];
                                    }
                                } else {
                                    A01[2] = "ZJoOz8i1";
                                    if (i10 > remainingTimestampOffsetChanges) {
                                        remainingTimestampOffsetChanges = iArr[sampleCount2];
                                    }
                                }
                            }
                            editedMaximumSize++;
                            sampleCount2++;
                        }
                    }
                    j10 += j11;
                }
                return new DR(r38, jArr4, iArr3, remainingTimestampOffsetChanges, jArr5, iArr4, C0695Iz.A0F(j10, 1000000L, r0.A06));
            }
        } else {
            C0679Ij c0679Ij5 = wzA010.A00;
            C0679Ij c0679Ij6 = c1025Wa.A07(D3.A19).A00;
            C0679Ij stsc2 = c1025Wa.A07(D3.A1D).A00;
            wzA07 = c1025Wa.A07(D3.A1B);
            if (wzA07 != null) {
                c0679Ij = wzA07.A00;
            } else {
                c0679Ij = null;
            }
            WZ wzA012 = c1025Wa.A07(D3.A0C);
            if (wzA012 != null) {
            }
            d4 = new D4(c0679Ij6, c0679Ij5, z5);
            stsc2.A0Y(12);
            iA0H = stsc2.A0H() - 1;
            iA0H2 = stsc2.A0H();
            iA0H3 = stsc2.A0H();
            iA0H4 = 0;
            iA0H5 = 0;
            iA08 = 0;
            if (c0679Ij2 != null) {
                c0679Ij2.A0Y(12);
                if (A01[2].length() != 8) {
                    A01[3] = "L0AwLnMzpUVZw0eA5xJMrWaPTFyNZJ4l";
                    iA0H5 = c0679Ij2.A0H();
                } else {
                    String[] strArr8 = A01;
                    strArr8[0] = "QSMsFg5SqZ0MdGMo2pjKfVLErbdATzfM";
                    strArr8[5] = "0ZxnaUDgpQuXguOXfTzNI5lEB6qL53xV";
                    iA0H5 = c0679Ij2.A0H();
                }
            }
            i = -1;
            sampleCount = 0;
            if (c0679Ij != null) {
                c0679Ij.A0Y(12);
                sampleCount = c0679Ij.A0H();
                if (sampleCount > 0) {
                    int nextSynchronizationSampleIndex4 = c0679Ij.A0H();
                    i = nextSynchronizationSampleIndex4 - 1;
                    String[] strArr9 = A01;
                    String str3 = strArr9[4];
                    String str4 = strArr9[6];
                    length = str3.length();
                    nextSynchronizationSampleIndex2 = str4.length();
                    if (length == nextSynchronizationSampleIndex2) {
                        A01[2] = "faWOqNa6";
                    }
                } else {
                    c0679Ij = null;
                }
            }
            if (wx.A8U()) {
                if (!A0I(492, 9, 89).equals(r38.A07.A0O)) {
                    z = false;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            remainingTimestampOffsetChanges = 0;
            j = 0;
            strA0I = A0I(128, 11, 33);
            if (!z) {
                jArr2 = new long[maximumSize];
                iArr = new int[maximumSize];
                jArr3 = new long[maximumSize];
                iArr2 = new int[maximumSize];
                timestampTimeUnits2 = 0;
                i4 = 0;
                while (remainingTimestampDeltaChanges < maximumSize) {
                    while (i4 == 0) {
                        IK.A04(d4.A02());
                        timestampTimeUnits2 = d4.A02;
                        i4 = d4.A01;
                    }
                    if (c0679Ij2 != null) {
                        while (iA0H4 == 0) {
                            iA0H4 = c0679Ij2.A0H();
                            iA08 = c0679Ij2.A08();
                            iA0H5--;
                        }
                        iA0H4--;
                    }
                    jArr2[remainingTimestampDeltaChanges] = timestampTimeUnits2;
                    int timestampDeltaInTimeUnits9 = wx.ADd();
                    iArr[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits9;
                    timestampDeltaInTimeUnits = iArr[remainingTimestampDeltaChanges];
                    nextSynchronizationSampleIndex = remainingTimestampOffsetChanges;
                    if (timestampDeltaInTimeUnits > nextSynchronizationSampleIndex) {
                        remainingTimestampOffsetChanges = iArr[remainingTimestampDeltaChanges];
                    }
                    int timestampDeltaInTimeUnits10 = iA08;
                    jArr3[remainingTimestampDeltaChanges] = j + ((long) timestampDeltaInTimeUnits10);
                    if (c0679Ij == null) {
                        timestampDeltaInTimeUnits2 = 1;
                    } else {
                        timestampDeltaInTimeUnits2 = 0;
                    }
                    iArr2[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits2;
                    if (remainingTimestampDeltaChanges == i) {
                        iArr2[remainingTimestampDeltaChanges] = 1;
                        sampleCount--;
                        if (sampleCount > 0) {
                            int timestampDeltaInTimeUnits11 = c0679Ij.A0H();
                            i = timestampDeltaInTimeUnits11 - 1;
                        }
                    }
                    j += (long) iA0H3;
                    iA0H2--;
                    if (iA0H2 != 0) {
                    }
                    int timestampDeltaInTimeUnits12 = iArr[remainingTimestampDeltaChanges];
                    timestampTimeUnits2 += (long) timestampDeltaInTimeUnits12;
                    i4--;
                }
                timestampTimeUnits = j + ((long) iA08);
                if (iA0H4 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                IK.A03(z3);
                while (iA0H5 > 0) {
                    if (c0679Ij2.A0H() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    IK.A03(z4);
                    c0679Ij2.A08();
                    iA0H5--;
                }
                if (sampleCount == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A0I(198, 32, 71));
                    r0 = r38;
                    sb2.append(r0.A00);
                    sb2.append(A0I(94, 34, 86));
                    sb2.append(sampleCount);
                    sb2.append(A0I(0, 35, 3));
                    sb2.append(iA0H2);
                    sb2.append(A0I(35, 26, 98));
                    sb2.append(i4);
                    sb2.append(A0I(61, 33, 25));
                    sb2.append(iA0H);
                    Log.w(strA0I, sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A0I(198, 32, 71));
                    r0 = r38;
                    sb3.append(r0.A00);
                    sb3.append(A0I(94, 34, 86));
                    sb3.append(sampleCount);
                    sb3.append(A0I(0, 35, 3));
                    sb3.append(iA0H2);
                    sb3.append(A0I(35, 26, 98));
                    sb3.append(i4);
                    sb3.append(A0I(61, 33, 25));
                    sb3.append(iA0H);
                    Log.w(strA0I, sb3.toString());
                }
            } else {
                r0 = r38;
                jArr = new long[d4.A05];
                chunkSampleCounts = new int[d4.A05];
                while (d4.A02()) {
                    jArr[d4.A00] = d4.A02;
                    chunkSampleCounts[d4.A00] = d4.A01;
                }
                DB dbA01 = DC.A00(C0695Iz.A05(r0.A07.A0A, r0.A07.A05), jArr, chunkSampleCounts, iA0H3);
                jArr2 = dbA01.A04;
                iArr = dbA01.A03;
                remainingTimestampOffsetChanges = dbA01.A00;
                jArr3 = dbA01.A05;
                iArr2 = dbA01.A02;
                timestampTimeUnits = dbA01.A01;
            }
            jA0F = C0695Iz.A0F(timestampTimeUnits, 1000000L, r0.A06);
            if (r0.A08 != null) {
            }
            C0695Iz.A0a(jArr3, 1000000L, r0.A06);
            return new DR(r38, jArr2, iArr, remainingTimestampOffsetChanges, jArr3, iArr2, jA0F);
        }
        throw new RuntimeException();
    }

    public static Metadata A0F(WZ wz, boolean z) {
        if (z) {
            return null;
        }
        C0679Ij c0679Ij = wz.A00;
        c0679Ij.A0Y(8);
        while (c0679Ij.A04() >= 8) {
            int iA06 = c0679Ij.A06();
            int iA08 = c0679Ij.A08();
            int iA09 = c0679Ij.A08();
            int atomType = D3.A0g;
            if (iA09 == atomType) {
                c0679Ij.A0Y(iA06);
                return A0H(c0679Ij, iA06 + iA08);
            }
            int atomType2 = iA08 - 8;
            c0679Ij.A0Z(atomType2);
        }
        return null;
    }

    public static Metadata A0G(C0679Ij c0679Ij, int i) {
        c0679Ij.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (c0679Ij.A06() < i) {
            Metadata.Entry entryA01 = DG.A01(c0679Ij);
            if (entryA01 != null) {
                arrayList.add(entryA01);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(C0679Ij c0679Ij, int i) {
        c0679Ij.A0Z(12);
        while (c0679Ij.A06() < i) {
            int iA06 = c0679Ij.A06();
            int iA08 = c0679Ij.A08();
            int iA09 = c0679Ij.A08();
            int atomType = D3.A0Z;
            if (iA09 == atomType) {
                c0679Ij.A0Y(iA06);
                return A0G(c0679Ij, iA06 + iA08);
            }
            int atomType2 = iA08 - 8;
            c0679Ij.A0Z(atomType2);
        }
        return null;
    }

    public static void A0K(C0679Ij c0679Ij, int i, int i2, int i3, int i4, int width, DrmInitData drmInitData, D6 d6, int childPosition) throws C0488Af {
        DrmInitData drmInitDataA02 = drmInitData;
        int stereoMode = i;
        c0679Ij.A0Y(i2 + 8 + 8);
        c0679Ij.A0Z(16);
        int iA0I = c0679Ij.A0I();
        int iA0I2 = c0679Ij.A0I();
        boolean z = false;
        float fA00 = 1.0f;
        c0679Ij.A0Z(50);
        int iA06 = c0679Ij.A06();
        int height = D3.A0R;
        if (stereoMode == height) {
            Pair<Integer, DP> pairA09 = A09(c0679Ij, i2, i3);
            if (pairA09 != null) {
                stereoMode = ((Integer) pairA09.first).intValue();
                if (drmInitDataA02 == null) {
                    drmInitDataA02 = null;
                } else {
                    drmInitDataA02 = drmInitDataA02.A02(((DP) pairA09.second).A02);
                }
                d6.A03[childPosition] = (DP) pairA09.second;
            }
            c0679Ij.A0Y(iA06);
        }
        List<byte[]> listSingletonList = null;
        String strA0I = null;
        byte[] bArrA0O = null;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "nt1AbbZdLf7H";
        strArr[6] = "te59XVvfeUPr";
        int i5 = -1;
        while (iA06 - i2 < i3) {
            c0679Ij.A0Y(iA06);
            int iA07 = c0679Ij.A06();
            int iA08 = c0679Ij.A08();
            if (iA08 == 0 && c0679Ij.A06() - i2 == i3) {
                break;
            }
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            int iA09 = c0679Ij.A08();
            if (iA09 == D3.A08) {
                IK.A04(strA0I == null);
                strA0I = A0I(710, 9, 84);
                c0679Ij.A0Y(iA07 + 8);
                J1 j1A00 = J1.A00(c0679Ij);
                listSingletonList = j1A00.A04;
                d6.A00 = j1A00.A02;
                if (!z) {
                    fA00 = j1A00.A00;
                }
            } else if (iA09 == D3.A0Y) {
                IK.A04(strA0I == null);
                strA0I = A0I(719, 10, 122);
                c0679Ij.A0Y(iA07 + 8);
                J7 j7A00 = J7.A00(c0679Ij);
                listSingletonList = j7A00.A01;
                d6.A00 = j7A00.A00;
            } else if (iA09 == D3.A1U) {
                IK.A04(strA0I == null);
                strA0I = stereoMode == D3.A1S ? A0I(729, 19, 27) : A0I(748, 19, 50);
            } else if (iA09 == D3.A0D) {
                IK.A04(strA0I == null);
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "qKPn33WXRD1J";
                strArr2[6] = "UtAkzKHIBavs";
                strA0I = A0I(700, 10, 59);
            } else if (iA09 == D3.A0S) {
                IK.A04(strA0I == null);
                Pair<String, byte[]> pairA07 = A07(c0679Ij, iA07);
                strA0I = (String) pairA07.first;
                listSingletonList = Collections.singletonList((byte[]) pairA07.second);
            } else if (iA09 == D3.A0p) {
                fA00 = A00(c0679Ij, iA07);
                z = true;
            } else if (iA09 == D3.A1F) {
                bArrA0O = A0O(c0679Ij, iA07, iA08);
            } else if (iA09 == D3.A15) {
                int iA0E = c0679Ij.A0E();
                c0679Ij.A0Z(3);
                if (iA0E == 0) {
                    int iA0E2 = c0679Ij.A0E();
                    if (iA0E2 == 0) {
                        i5 = 0;
                    } else if (iA0E2 == 1) {
                        i5 = 1;
                    } else if (iA0E2 != 2) {
                        if (iA0E2 == 3) {
                            i5 = 3;
                        }
                    } else {
                        i5 = 2;
                    }
                }
            }
            iA06 += iA08;
        }
        if (strA0I == null) {
            return;
        }
        d6.A02 = Format.A04(Integer.toString(i4), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, width, fA00, bArrA0O, i5, null, drmInitDataA02);
    }

    public static void A0L(C0679Ij c0679Ij, int i, int i2, int i3, int i4, String str, D6 d6) throws C0488Af {
        String strA0I;
        c0679Ij.A0Y(i2 + 8 + 8);
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i == D3.A02) {
            strA0I = A0I(295, 20, 125);
        } else if (i == D3.A1O) {
            strA0I = A0I(388, 28, 56);
            int i5 = (i3 - 8) - 8;
            byte[] bArr = new byte[i5];
            c0679Ij.A0c(bArr, 0, i5);
            listSingletonList = Collections.singletonList(bArr);
        } else if (i == D3.A1W) {
            strA0I = A0I(367, 21, 68);
        } else if (i == D3.A18) {
            strA0I = A0I(295, 20, 125);
            j = 0;
        } else if (i == D3.A09) {
            strA0I = A0I(342, 25, 79);
            d6.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        d6.A02 = Format.A09(Integer.toString(i4), strA0I, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    public static void A0M(C0679Ij c0679Ij, int i, int i2, int i3, int channelCount, String str, boolean z, DrmInitData drmInitData, D6 d6, int i4) throws C0488Af {
        int childAtomType;
        int childPosition;
        String strA0I;
        int quickTimeSoundDescriptionVersion;
        int quickTimeSoundDescriptionVersion2;
        int quickTimeSoundDescriptionVersion3;
        int quickTimeSoundDescriptionVersion4;
        int quickTimeSoundDescriptionVersion5;
        int quickTimeSoundDescriptionVersion6;
        int quickTimeSoundDescriptionVersion7;
        int quickTimeSoundDescriptionVersion8;
        int quickTimeSoundDescriptionVersion9;
        int quickTimeSoundDescriptionVersion10;
        int quickTimeSoundDescriptionVersion11;
        byte[] bArr;
        int iA08;
        boolean z2;
        int iA09;
        int iA03;
        DrmInitData drmInitDataA02 = drmInitData;
        int iIntValue = i;
        c0679Ij.A0Y(i2 + 8 + 8);
        int iA0I = 0;
        if (z) {
            iA0I = c0679Ij.A0I();
            c0679Ij.A0Z(6);
        } else {
            c0679Ij.A0Z(8);
        }
        if (iA0I == 0 || iA0I == 1) {
            childAtomType = c0679Ij.A0I();
            c0679Ij.A0Z(6);
            childPosition = c0679Ij.A0F();
            if (iA0I == 1) {
                c0679Ij.A0Z(16);
            }
        } else if (iA0I == 2) {
            c0679Ij.A0Z(16);
            childPosition = (int) Math.round(c0679Ij.A03());
            childAtomType = c0679Ij.A0H();
            c0679Ij.A0Z(20);
        } else {
            return;
        }
        int atomType = c0679Ij.A06();
        if (iIntValue == D3.A0Q) {
            Pair<Integer, DP> pairA09 = A09(c0679Ij, i2, i3);
            if (pairA09 != null) {
                iIntValue = ((Integer) pairA09.first).intValue();
                if (drmInitDataA02 == null) {
                    drmInitDataA02 = null;
                } else {
                    Object obj = pairA09.second;
                    String[] strArr = A01;
                    String str2 = strArr[1];
                    String str3 = strArr[7];
                    int quickTimeSoundDescriptionVersion12 = str2.charAt(19);
                    if (quickTimeSoundDescriptionVersion12 == str3.charAt(19)) {
                        A01[3] = "pOqul1QRpDZUg5bU2yQQaQp61y123VtO";
                        drmInitDataA02 = drmInitDataA02.A02(((DP) obj).A02);
                    }
                }
                d6.A03[i4] = (DP) pairA09.second;
            }
            c0679Ij.A0Y(atomType);
            strA0I = null;
            if (iIntValue == D3.A04) {
                strA0I = A0I(426, 9, 31);
            } else {
                quickTimeSoundDescriptionVersion = D3.A0M;
                if (iIntValue == quickTimeSoundDescriptionVersion) {
                    strA0I = A0I(457, 10, 8);
                } else {
                    quickTimeSoundDescriptionVersion2 = D3.A0I;
                    if (iIntValue == quickTimeSoundDescriptionVersion2) {
                        strA0I = A0I(501, 13, 63);
                    } else {
                        quickTimeSoundDescriptionVersion3 = D3.A0K;
                        if (iIntValue != quickTimeSoundDescriptionVersion3) {
                            quickTimeSoundDescriptionVersion4 = D3.A0L;
                            if (iIntValue == quickTimeSoundDescriptionVersion4) {
                                strA0I = A0I(514, 16, 70);
                            } else {
                                quickTimeSoundDescriptionVersion5 = D3.A0J;
                                if (iIntValue == quickTimeSoundDescriptionVersion5) {
                                    strA0I = A0I(530, 28, 10);
                                } else {
                                    quickTimeSoundDescriptionVersion6 = D3.A0v;
                                    if (iIntValue == quickTimeSoundDescriptionVersion6) {
                                        strA0I = A0I(416, 10, 25);
                                    } else {
                                        quickTimeSoundDescriptionVersion7 = D3.A0w;
                                        if (iIntValue == quickTimeSoundDescriptionVersion7) {
                                            strA0I = A0I(445, 12, 124);
                                        } else {
                                            quickTimeSoundDescriptionVersion8 = D3.A0a;
                                            if (iIntValue != quickTimeSoundDescriptionVersion8) {
                                                quickTimeSoundDescriptionVersion9 = D3.A14;
                                                if (iIntValue == quickTimeSoundDescriptionVersion9) {
                                                    strA0I = A0I(492, 9, 89);
                                                } else {
                                                    quickTimeSoundDescriptionVersion10 = D3.A03;
                                                    if (iIntValue == quickTimeSoundDescriptionVersion10) {
                                                        strA0I = A0I(482, 10, 92);
                                                    } else {
                                                        quickTimeSoundDescriptionVersion11 = D3.A05;
                                                        if (iIntValue == quickTimeSoundDescriptionVersion11) {
                                                            strA0I = A0I(435, 10, 88);
                                                        }
                                                    }
                                                }
                                            } else {
                                                strA0I = A0I(492, 9, 89);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            strA0I = A0I(514, 16, 70);
                        }
                    }
                }
            }
            bArr = null;
            while (atomType - i2 < i3) {
                c0679Ij.A0Y(atomType);
                iA08 = c0679Ij.A08();
                if (iA08 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                IK.A05(z2, A0I(574, 32, 45));
                iA09 = c0679Ij.A08();
                if (iA09 != D3.A0S) {
                    if (iA09 == D3.A0S) {
                        iA03 = atomType;
                    } else {
                        iA03 = A03(c0679Ij, atomType, iA08);
                    }
                    if (iA03 != -1) {
                        Pair<String, byte[]> pairA07 = A07(c0679Ij, iA03);
                        strA0I = (String) pairA07.first;
                        bArr = (byte[]) pairA07.second;
                        if (A0I(467, 15, 48).equals(strA0I)) {
                            Pair<Integer, Integer> pairA03 = IO.A03(bArr);
                            childPosition = ((Integer) pairA03.first).intValue();
                            childAtomType = ((Integer) pairA03.second).intValue();
                        }
                    }
                } else {
                    if (iA09 == D3.A0S) {
                        iA03 = atomType;
                    } else {
                        iA03 = A03(c0679Ij, atomType, iA08);
                    }
                    if (iA03 != -1) {
                        Pair<String, byte[]> pairA08 = A07(c0679Ij, iA03);
                        strA0I = (String) pairA08.first;
                        bArr = (byte[]) pairA08.second;
                        if (A0I(467, 15, 48).equals(strA0I)) {
                            Pair<Integer, Integer> pairA04 = IO.A03(bArr);
                            childPosition = ((Integer) pairA04.first).intValue();
                            childAtomType = ((Integer) pairA04.second).intValue();
                        }
                    }
                }
                atomType += iA08;
            }
            if (d6.A02 == null) {
                return;
            } else {
                return;
            }
        }
        strA0I = null;
        if (iIntValue == D3.A04) {
            strA0I = A0I(426, 9, 31);
        } else {
            quickTimeSoundDescriptionVersion = D3.A0M;
            if (iIntValue == quickTimeSoundDescriptionVersion) {
                strA0I = A0I(457, 10, 8);
            } else {
                quickTimeSoundDescriptionVersion2 = D3.A0I;
                if (iIntValue == quickTimeSoundDescriptionVersion2) {
                    strA0I = A0I(501, 13, 63);
                } else {
                    quickTimeSoundDescriptionVersion3 = D3.A0K;
                    if (iIntValue != quickTimeSoundDescriptionVersion3) {
                        quickTimeSoundDescriptionVersion4 = D3.A0L;
                        if (iIntValue == quickTimeSoundDescriptionVersion4) {
                            strA0I = A0I(514, 16, 70);
                        } else {
                            quickTimeSoundDescriptionVersion5 = D3.A0J;
                            if (iIntValue == quickTimeSoundDescriptionVersion5) {
                                strA0I = A0I(530, 28, 10);
                            } else {
                                quickTimeSoundDescriptionVersion6 = D3.A0v;
                                if (iIntValue == quickTimeSoundDescriptionVersion6) {
                                    strA0I = A0I(416, 10, 25);
                                } else {
                                    quickTimeSoundDescriptionVersion7 = D3.A0w;
                                    if (iIntValue == quickTimeSoundDescriptionVersion7) {
                                        strA0I = A0I(445, 12, 124);
                                    } else {
                                        quickTimeSoundDescriptionVersion8 = D3.A0a;
                                        if (iIntValue != quickTimeSoundDescriptionVersion8) {
                                            quickTimeSoundDescriptionVersion9 = D3.A14;
                                            if (iIntValue == quickTimeSoundDescriptionVersion9) {
                                                strA0I = A0I(492, 9, 89);
                                            } else {
                                                quickTimeSoundDescriptionVersion10 = D3.A03;
                                                if (iIntValue == quickTimeSoundDescriptionVersion10) {
                                                    strA0I = A0I(482, 10, 92);
                                                } else {
                                                    quickTimeSoundDescriptionVersion11 = D3.A05;
                                                    if (iIntValue == quickTimeSoundDescriptionVersion11) {
                                                        strA0I = A0I(435, 10, 88);
                                                    }
                                                }
                                            }
                                        } else {
                                            strA0I = A0I(492, 9, 89);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        strA0I = A0I(514, 16, 70);
                    }
                }
            }
        }
        bArr = null;
        while (atomType - i2 < i3) {
            c0679Ij.A0Y(atomType);
            iA08 = c0679Ij.A08();
            if (iA08 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            IK.A05(z2, A0I(574, 32, 45));
            iA09 = c0679Ij.A08();
            if (iA09 != D3.A0S || (z && iA09 == D3.A1V)) {
                if (iA09 == D3.A0S) {
                    iA03 = atomType;
                } else {
                    iA03 = A03(c0679Ij, atomType, iA08);
                }
                if (iA03 != -1) {
                    Pair<String, byte[]> pairA010 = A07(c0679Ij, iA03);
                    strA0I = (String) pairA010.first;
                    bArr = (byte[]) pairA010.second;
                    if (A0I(467, 15, 48).equals(strA0I)) {
                        Pair<Integer, Integer> pairA05 = IO.A03(bArr);
                        childPosition = ((Integer) pairA05.first).intValue();
                        childAtomType = ((Integer) pairA05.second).intValue();
                    }
                }
            } else if (iA09 == D3.A0E) {
                int i5 = atomType + 8;
                if (A01[3].charAt(8) == 'p') {
                    String[] strArr2 = A01;
                    strArr2[0] = "HYOwJoQ2L6umAwimTza29CMlFS3ISf2h";
                    strArr2[5] = "FglgDO1LYQ1bVlWfctdCtrgF4dzfBOT4";
                    c0679Ij.A0Y(i5);
                    d6.A02 = BA.A07(c0679Ij, Integer.toString(channelCount), str, drmInitDataA02);
                }
            } else if (iA09 == D3.A0H) {
                c0679Ij.A0Y(atomType + 8);
                d6.A02 = BA.A08(c0679Ij, Integer.toString(channelCount), str, drmInitDataA02);
            } else if (iA09 == D3.A0G) {
                d6.A02 = Format.A07(Integer.toString(channelCount), strA0I, null, -1, -1, childAtomType, childPosition, null, drmInitDataA02, 0, str);
            } else if (iA09 == D3.A05) {
                bArr = new byte[iA08];
                c0679Ij.A0Y(atomType);
                c0679Ij.A0c(bArr, 0, iA08);
            }
            atomType += iA08;
        }
        if (d6.A02 == null || strA0I == null) {
            return;
        }
        int i6 = A0I(492, 9, 89).equals(strA0I) ? 2 : -1;
        String mimeType = Integer.toString(channelCount);
        d6.A02 = Format.A06(mimeType, strA0I, null, -1, -1, childAtomType, childPosition, i6, bArr != null ? Collections.singletonList(bArr) : null, drmInitDataA02, 0, str);
        return;
        throw new RuntimeException();
    }

    public static boolean A0N(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0695Iz.A06(3, 0, length);
        return jArr[0] <= j2 && j2 < jArr[latestDelayIndex] && jArr[C0695Iz.A06(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    public static byte[] A0O(C0679Ij c0679Ij, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c0679Ij.A0Y(i3);
            int iA08 = c0679Ij.A08();
            if (c0679Ij.A08() == D3.A0q) {
                return Arrays.copyOfRange(c0679Ij.A00, i3, i3 + iA08);
            }
            i3 += iA08;
        }
        return null;
    }
}
