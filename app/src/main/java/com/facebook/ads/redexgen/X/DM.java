package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DM {
    public static byte[] A00;
    public static String[] A01 = {"3vAPqkZTJ1VSon", "QUTM7SdDWyFumvZa4ixbAFeRkcyJbQtu", "xie3JnTyZ8PkMdNBWExCsKsV5Mn", "WzqQT7JP0s6wyXASN6VfDx7AAKIr1zQR", "8xy", "R913nsbqijjrVtiNLSpVoV0rL8armwI", "xGv", "6Jbm"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 31, 74, 25, 123, 47, 122, 42, 111, 59, 57, 106, 17, 69, 69, 20, 58, 110, 121, 26, 78, 91, 31, 10, 94, 74, 15, 125, 4, 113, 16, 69, 60, 94, 40, 54, 79, 45, 43, 101, 123, 102, 126, 80, 71, 82, 0, 116, 38, 100, 50, 70, 75, 88, 31, 88, 70, 83, 1, 102, 124, 96, 61, 20, 14, 18, 78, 63, 37, 57, 98, 112, 106, 118, 44, 94, 68, 88, 1, 83, 73, 85, 87, 60, 51, 51, 62, 111, 114, 54, 51, 18, 15, 75, 77, 112, 117, 33, 33};
        if (A01[3].charAt(26) != 'I') {
            throw new RuntimeException();
        }
        A01[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
    }

    static {
        A01();
        A02 = new int[]{C0695Iz.A08(A00(79, 4, 5)), C0695Iz.A08(A00(59, 4, 48)), C0695Iz.A08(A00(63, 4, 66)), C0695Iz.A08(A00(67, 4, 105)), C0695Iz.A08(A00(71, 4, 38)), C0695Iz.A08(A00(75, 4, 8)), C0695Iz.A08(A00(43, 4, 14)), C0695Iz.A08(A00(55, 4, 15)), C0695Iz.A08(A00(51, 4, 17)), C0695Iz.A08(A00(87, 4, 61)), C0695Iz.A08(A00(91, 4, 64)), C0695Iz.A08(A00(0, 4, 71)), C0695Iz.A08(A00(4, 4, 119)), C0695Iz.A08(A00(19, 4, 22)), C0695Iz.A08(A00(23, 4, 6)), C0695Iz.A08(A00(8, 4, 99)), C0695Iz.A08(A00(12, 4, 29)), C0695Iz.A08(A00(31, 4, 55)), C0695Iz.A08(A00(27, 4, 15)), C0695Iz.A08(A00(47, 4, 45)), C0695Iz.A08(A00(83, 4, 104)), C0695Iz.A08(A00(35, 4, 68)), C0695Iz.A08(A00(95, 4, 62)), C0695Iz.A08(A00(39, 4, 23))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == C0695Iz.A08(A00(16, 3, 54))) {
            return true;
        }
        int[] iArr = A02;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A01[5] = "EPRlEFMBD24k0biyd";
        for (int compatibleBrand : iArr) {
            if (compatibleBrand == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return A05(interfaceC0536Cd, true);
    }

    public static boolean A04(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return A05(interfaceC0536Cd, false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    public static boolean A05(InterfaceC0536Cd interfaceC0536Cd, boolean z) throws InterruptedException, IOException {
        long jA7F;
        long j;
        long jA6t = interfaceC0536Cd.A6t();
        long j2 = 4096;
        long j3 = -1;
        if (jA6t != -1) {
            if (A01[1].charAt(15) != 'a') {
                throw new RuntimeException();
            }
            A01[2] = "vvdTCZ7FTRFSeJf0jfXeHz2wpGr";
            if (jA6t <= 4096) {
                j2 = jA6t;
            }
        }
        int i = (int) j2;
        C0679Ij c0679Ij = new C0679Ij(64);
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < i) {
            int i3 = 8;
            c0679Ij.A0W(8);
            interfaceC0536Cd.AD7(c0679Ij.A00, 0, 8);
            long jA0M = c0679Ij.A0M();
            int atomDataSize = c0679Ij.A08();
            if (jA0M == 1) {
                i3 = 16;
                interfaceC0536Cd.AD7(c0679Ij.A00, 8, 8);
                c0679Ij.A0X(16);
                jA0M = c0679Ij.A0N();
            } else if (jA0M == 0) {
                long jA6t2 = interfaceC0536Cd.A6t();
                if (A01[5].length() != 5) {
                    String[] strArr = A01;
                    strArr[6] = "Cb1";
                    strArr[4] = "ZVm";
                    if (jA6t2 != j3) {
                        jA7F = jA6t2 - interfaceC0536Cd.A7F();
                        j = 8;
                        if (A01[7].length() != 4) {
                            jA0M = jA7F + j;
                        } else {
                            String[] strArr2 = A01;
                            strArr2[6] = "BrR";
                            strArr2[4] = "QIT";
                            jA0M = jA7F + j;
                        }
                    }
                } else if (jA6t2 != j3) {
                    jA7F = jA6t2 - interfaceC0536Cd.A7F();
                    j = 8;
                    if (A01[7].length() != 4) {
                        jA0M = jA7F + j;
                    } else {
                        String[] strArr3 = A01;
                        strArr3[6] = "BrR";
                        strArr3[4] = "QIT";
                        jA0M = jA7F + j;
                    }
                }
            }
            if (jA0M < i3) {
                return false;
            }
            i2 += i3;
            int headerSize = D3.A0j;
            if (atomDataSize == headerSize) {
                j3 = -1;
            } else {
                int headerSize2 = D3.A0i;
                if (atomDataSize != headerSize2) {
                    int headerSize3 = D3.A0m;
                    if (atomDataSize != headerSize3) {
                        if ((((long) i2) + jA0M) - ((long) i3) >= i) {
                            break;
                        }
                        int i4 = (int) (jA0M - ((long) i3));
                        i2 += i4;
                        int headerSize4 = D3.A0U;
                        if (atomDataSize == headerSize4) {
                            if (i4 >= 8) {
                                c0679Ij.A0W(i4);
                                interfaceC0536Cd.AD7(c0679Ij.A00, 0, i4);
                                int i5 = i4 / 4;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if (i6 == 1) {
                                        c0679Ij.A0Z(4);
                                    } else {
                                        int headerSize5 = c0679Ij.A08();
                                        if (A02(headerSize5)) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z2) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (i4 != 0) {
                            interfaceC0536Cd.A3K(i4);
                        }
                        j3 = -1;
                    }
                }
                z3 = true;
                break;
            }
        }
        return z2 && z == z3;
    }
}
