package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0628Gi {
    public static byte[] A00;
    public static String[] A01 = {"ijZd2SvY", "Ph5fJqf6OowbUT2cqzgcB298kDhnW2OX", "wB5WDB4JU6krUWdN", "eBmlwoifn7sQacvwvpCdDN7mM49lFTV9", "8TaUd8AxspPDe4hMAHd3njvqxnnZalZZ", "my8xvAbSAhbAvtjE", "sCujs14tvAISPjVlxjJqhwIZMpV4htIn", "ZuHVfppKLGIB3c7uxsgIg35bH7izaigq"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-52, -18, -22, -34, -3, -14, -11, 113, -127, 116, 94, -71, -77, -85, -90, -99, -75, -77, -70, -70, -77, -72, -79, 106, -68, -81, -73, -85, -77, -72, -82, -81, -68, 106, -71, -80, 106, -73, -85, -74, -80, -71, -68, -73, -81, -82, 106, -99, -113, -109, 106, -104, -117, -106, 106, -65, -72, -77, -66, 120};
    }

    static {
        A02();
        A03 = C0695Iz.A08(A01(11, 4, 102));
        A02 = C0695Iz.A08(A01(7, 4, 33));
    }

    public static int A00(C0679Ij c0679Ij) {
        int b = 0;
        while (c0679Ij.A04() != 0) {
            int iA0E = c0679Ij.A0E();
            String[] strArr = A01;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "2iVFcVRayhlXICIL";
            strArr2[5] = "cB88SmkuRLYvydLN";
            b += iA0E;
            if (iA0E != 255) {
                return b;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    public static void A03(long j, C0679Ij c0679Ij, InterfaceC0545Co[] interfaceC0545CoArr) {
        int countryCode;
        while (c0679Ij.A04() > 1) {
            int iA00 = A00(c0679Ij);
            int iA01 = A00(c0679Ij);
            int iA06 = c0679Ij.A06() + iA01;
            if (iA01 == -1 || iA01 > c0679Ij.A04()) {
                Log.w(A01(0, 7, 125), A01(15, 45, 62));
                iA06 = c0679Ij.A07();
            } else if (iA00 == 4 && iA01 >= 8) {
                int iA0E = c0679Ij.A0E();
                int iA0I = c0679Ij.A0I();
                int iA08 = 0;
                if (iA0I == 49) {
                    iA08 = c0679Ij.A08();
                }
                int iA0E2 = c0679Ij.A0E();
                if (iA0I == 47) {
                    c0679Ij.A0Z(1);
                }
                int ccCount = (iA0E == 181 && (iA0I == 49 || iA0I == 47) && iA0E2 == 3) ? 1 : 0;
                if (iA0I == 49) {
                    int countryCode2 = A03;
                    if (iA08 != countryCode2) {
                        int countryCode3 = A02;
                        if (iA08 == countryCode3) {
                            countryCode = 1;
                        } else {
                            countryCode = 0;
                        }
                    } else {
                        countryCode = 1;
                    }
                    ccCount &= countryCode;
                }
                if (ccCount != 0) {
                    int countryCode4 = c0679Ij.A0E();
                    c0679Ij.A0Z(1);
                    int i = (countryCode4 & 31) * 3;
                    int ccCount2 = c0679Ij.A06();
                    for (InterfaceC0545Co interfaceC0545Co : interfaceC0545CoArr) {
                        c0679Ij.A0Y(ccCount2);
                        interfaceC0545Co.AEG(c0679Ij, i);
                        interfaceC0545Co.AEH(j, 1, i, 0, null);
                    }
                }
            }
            c0679Ij.A0Y(iA06);
        }
    }
}
