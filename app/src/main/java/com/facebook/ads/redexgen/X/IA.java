package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IA {
    public static String[] A00 = {"v79OOCD3rFDrBH3Sw8ccat0nkfR9Jk8K", "zaqJSCMgPr8q8xIyOc2JWspWFv3JOD4h", "Sqp2xVCvxFHsc", "s8GBWRpegr", "t6Y6wcH7Q091ZQl7CdWm1Bgnnklpnco", "XVr0n", "MY0M4GS8ICKTpGygoaRzgsCYiOraPhWK", "Pkt85Yo8hwIimoTAGZdJTyJAkZ2fE06T"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:36:0x0092 */
    public static long A00(C0654Hi c0654Hi, long j, long j2, InterfaceC0650He interfaceC0650He, byte[] bArr, @Nullable C0683In c0683In, int i, I9 i9) throws InterruptedException, IOException {
        InterfaceC0650He interfaceC0650HeA0W;
        InterfaceC0650He interfaceC0650HeA0W2;
        while (true) {
            if (c0683In != null) {
                c0683In.A01(i);
            }
            try {
                break;
            } catch (C0682Im unused) {
                C0695Iz.A0W(interfaceC0650HeA0W2);
            } catch (Throwable th) {
                C0695Iz.A0W(interfaceC0650HeA0W);
                throw th;
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0654Hi c0654Hi2 = new C0654Hi(c0654Hi.A04, c0654Hi.A06, j, (c0654Hi.A03 + j) - c0654Hi.A01, -1L, c0654Hi.A05, c0654Hi.A00 | 2);
        long jACw = interfaceC0650He.ACw(c0654Hi2);
        if (i9.A01 == -1 && jACw != -1) {
            i9.A01 = c0654Hi2.A01 + jACw;
        }
        long j3 = 0;
        while (j3 != j2) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i2 = interfaceC0650He.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (i2 == -1) {
                if (i9.A01 != -1) {
                    break;
                }
                i9.A01 = c0654Hi2.A01 + j3;
                break;
            }
            j3 += (long) i2;
            i9.A02 += (long) i2;
        }
        C0695Iz.A0W(interfaceC0650He);
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0654Hi c0654Hi) {
        return c0654Hi.A05 != null ? c0654Hi.A05 : A01(c0654Hi.A04);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005f A[SYNTHETIC] */
    public static void A03(C0654Hi c0654Hi, I4 i4, C0992Uq c0992Uq, byte[] bArr, @Nullable C0683In c0683In, int i, @Nullable I9 i9, @Nullable AtomicBoolean atomicBoolean, boolean z) throws InterruptedException, IOException {
        long left;
        long j;
        long jA5w;
        long j2;
        String[] strArr;
        I9 counters = i9;
        IK.A01(c0992Uq);
        IK.A01(bArr);
        if (counters != null) {
            A04(c0654Hi, i4, counters);
        } else {
            counters = new I9();
        }
        String key = A02(c0654Hi);
        long j3 = c0654Hi.A01;
        if (c0654Hi.A02 != -1) {
            left = c0654Hi.A02;
        } else {
            left = i4.A68(key);
        }
        while (true) {
            long j4 = 0;
            if (left != 0) {
                if (atomicBoolean != null) {
                    boolean z2 = atomicBoolean.get();
                    if (A00[5].length() != 1) {
                        A00[5] = "EAlW89nW7uOIImzUc5SW8CQaYz84C";
                        if (z2) {
                            throw new InterruptedException();
                        }
                        if (left != -1) {
                            j = left;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        jA5w = i4.A5w(key, j3, j);
                        if (jA5w <= 0) {
                            j2 = -jA5w;
                            strArr = A00;
                            if (strArr[6].length() != strArr[1].length()) {
                                A00[2] = "OFDha7Ysfl6kB";
                                jA5w = j2;
                                if (A00(c0654Hi, j3, j2, c0992Uq, bArr, c0683In, i, counters) < jA5w) {
                                    if (z || left == -1) {
                                        return;
                                    } else {
                                        throw new EOFException();
                                    }
                                }
                            }
                        }
                        j3 += jA5w;
                        if (left == -1) {
                            j4 = jA5w;
                        }
                        left -= j4;
                    }
                } else {
                    if (left != -1) {
                        j = left;
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    jA5w = i4.A5w(key, j3, j);
                    if (jA5w <= 0) {
                        j2 = -jA5w;
                        strArr = A00;
                        if (strArr[6].length() != strArr[1].length()) {
                            A00[2] = "OFDha7Ysfl6kB";
                            jA5w = j2;
                            if (A00(c0654Hi, j3, j2, c0992Uq, bArr, c0683In, i, counters) < jA5w) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    j3 += jA5w;
                    if (left == -1) {
                        j4 = jA5w;
                    }
                    left -= j4;
                }
                throw new RuntimeException();
            }
            return;
        }
    }

    public static void A04(C0654Hi c0654Hi, I4 i4, I9 i9) {
        long jA68;
        String strA02 = A02(c0654Hi);
        long j = c0654Hi.A01;
        if (c0654Hi.A02 != -1) {
            jA68 = c0654Hi.A02;
        } else {
            jA68 = i4.A68(strA02);
        }
        i9.A01 = jA68;
        if (A00[5].length() == 1) {
            throw new RuntimeException();
        }
        A00[4] = "nu";
        i9.A00 = 0L;
        i9.A02 = 0L;
        while (jA68 != 0) {
            long start = i4.A5w(strA02, j, jA68 != -1 ? jA68 : Long.MAX_VALUE);
            if (start > 0) {
                i9.A00 += start;
            } else {
                start = -start;
                if (start == Long.MAX_VALUE) {
                    return;
                }
            }
            j += start;
            if (jA68 == -1) {
                start = 0;
            }
            jA68 -= start;
        }
    }

    public static void A05(I4 i4, String str) {
        for (I8 i8 : i4.A5x(str)) {
            if (A00[2].length() != 13) {
                throw new RuntimeException();
            }
            A00[4] = "R4HmvLUlpWi57h";
            try {
                i4.ADx(i8);
            } catch (I2 unused) {
            }
        }
    }
}
