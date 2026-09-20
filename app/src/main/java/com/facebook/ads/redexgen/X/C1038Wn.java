package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1038Wn extends Cq {
    public static byte[] A03;
    public static String[] A04 = {"Es", "iHC9pRtfoWLcycijntiJYXN2", "TuGPNLSlit", "098OJ58R6u", "VNifGSmWt2UpuuC8pFHITdWilQmWPSdD", "nPBEvfeprzzMECJ3xuyevnTK", "FVZwpUplP67oS0xaMKq2ljUJ3jrVNcvU", "q6VKpvb2t6NLzvXLeBGroGgfRiC5SSnv"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{77, 121, 104, 101, 99, 44, 106, 99, 126, 97, 109, 120, 44, 98, 99, 120, 44, 127, 121, 124, 124, 99, 126, 120, 105, 104, 54, 44, 99, 119, 102, 107, 109, 45, 101, 53, 51, 51, 47, 99, 110, 99, 117, 16, 4, 21, 24, 30, 94, 22, 70, 64, 64, 92, 28, 29, 16, 6, 49, 37, 52, 57, 63, 127, 61, 32, 100, 49, 125, 60, 49, 36, 61, 38, 50, 35, 46, 40, 104, 42, 55, 34, 32};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1038Wn(InterfaceC0545Co interfaceC0545Co) {
        super(interfaceC0545Co);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C0679Ij c0679Ij, long j) throws C0488Af {
        if (this.A00 == 2) {
            int iA04 = c0679Ij.A04();
            super.A00.AEG(c0679Ij, iA04);
            super.A00.AEH(j, 1, iA04, 0, null);
            return;
        }
        int iA0E = c0679Ij.A0E();
        if (iA0E == 0) {
            boolean z = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "UGwyap6YoK";
            strArr2[3] = "84lnx1SX4s";
            if (!z) {
                byte[] bArr = new byte[c0679Ij.A04()];
                c0679Ij.A0c(bArr, 0, bArr.length);
                Pair<Integer, Integer> pairA03 = IO.A03(bArr);
                Format format = Format.A07(null, A00(58, 15, 95), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArr), null, 0, null);
                super.A00.A5V(format);
                this.A01 = true;
                return;
            }
        }
        if (this.A00 == 10 && iA0E != 1) {
            return;
        }
        int iA05 = c0679Ij.A04();
        super.A00.AEG(c0679Ij, iA05);
        super.A00.AEH(j, 1, iA05, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bf, please report this as an issue */
    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C0679Ij c0679Ij) throws C1034Wj {
        String strA00;
        int i;
        if (!this.A02) {
            int iA0E = c0679Ij.A0E();
            this.A00 = (iA0E >> 4) & 15;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[3];
            int header = str.length();
            if (header != str2.length()) {
                throw new RuntimeException();
            }
            A04[0] = "2H";
            int i2 = this.A00;
            if (i2 == 2) {
                int header2 = iA0E >> 2;
                super.A00.A5V(Format.A07(null, A00(73, 10, 72), null, -1, -1, 1, A05[header2 & 3], null, null, 0, null));
                this.A01 = true;
            } else if (i2 == 7) {
                if (this.A00 == 7) {
                    strA00 = A00(28, 15, 13);
                } else {
                    strA00 = A00(43, 15, 126);
                }
                if ((iA0E & 1) == 1) {
                    i = 2;
                } else {
                    i = 3;
                }
                super.A00.A5V(Format.A06(null, strA00, null, -1, -1, 1, 8000, i, null, null, 0, null));
                this.A01 = true;
            } else if (A04[4].charAt(5) == 'S') {
                A04[0] = "kH";
                if (i2 == 8) {
                    if (this.A00 == 7) {
                        strA00 = A00(28, 15, 13);
                    } else {
                        strA00 = A00(43, 15, 126);
                    }
                    if ((iA0E & 1) == 1) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    super.A00.A5V(Format.A06(null, strA00, null, -1, -1, 1, 8000, i, null, null, 0, null));
                    this.A01 = true;
                } else if (i2 != 10) {
                    throw new C1034Wj(A00(0, 28, 3) + this.A00);
                }
            } else if (i2 == 8) {
                if (this.A00 == 7) {
                    strA00 = A00(28, 15, 13);
                } else {
                    strA00 = A00(43, 15, 126);
                }
                if ((iA0E & 1) == 1) {
                    i = 2;
                } else {
                    i = 3;
                }
                super.A00.A5V(Format.A06(null, strA00, null, -1, -1, 1, 8000, i, null, null, 0, null));
                this.A01 = true;
            } else if (i2 != 10) {
                throw new C1034Wj(A00(0, 28, 3) + this.A00);
            }
            this.A02 = true;
        } else {
            c0679Ij.A0Z(1);
        }
        return true;
    }
}
