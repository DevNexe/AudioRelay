package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1026Wb implements InterfaceC0535Cc {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final InterfaceC0538Cf A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0537Ce A04;
    public InterfaceC0545Co A05;
    public InterfaceC1027Wc A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0539Cg A0A;
    public final Ch A0B;
    public final Ci A0C;
    public final C0679Ij A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, 18, 70, 93, 93, 18, 95, 83, 92, 75, 18, 80, 75, 70, 87, 65, 28, 0, 20, 4, 31, 11, 58, 61, 52};
    }

    static {
        A05();
        A0G = new C1028Wd();
        A0J = C0695Iz.A08(A04(32, 4, 79));
        A0H = C0695Iz.A08(A04(0, 4, 32));
        A0I = C0695Iz.A08(A04(28, 4, 74));
    }

    public C1026Wb() {
        this(0);
    }

    public C1026Wb(int i) {
        this(i, -9223372036854775807L);
    }

    public C1026Wb(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0679Ij(10);
        this.A0C = new Ci();
        this.A0A = new C0539Cg();
        this.A02 = -9223372036854775807L;
        this.A0B = new Ch();
    }

    private int A00(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            interfaceC0536Cd.AEB();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!interfaceC0536Cd.AD8(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            if (!A06(iA08, this.A01) || Ci.A00(iA08) == -1) {
                interfaceC0536Cd.AEt(1);
                this.A01 = 0;
                return 0;
            }
            Ci.A04(iA08, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7e(interfaceC0536Cd.A7F());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7e(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int iAEF = this.A05.AEF(interfaceC0536Cd, this.A00, true);
        if (iAEF == -1) {
            return -1;
        }
        this.A00 -= iAEF;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.AEH(this.A02 + ((this.A03 * 1000000) / ((long) this.A0C.A03)), 1, this.A0C.A02, 0, null);
        this.A03 += (long) this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C0679Ij c0679Ij, int i) {
        if (c0679Ij.A07() >= i + 4) {
            c0679Ij.A0Y(i);
            int iA08 = c0679Ij.A08();
            if (iA08 == A0J || iA08 == A0H) {
                return iA08;
            }
        }
        if (c0679Ij.A07() >= 40) {
            c0679Ij.A0Y(36);
            int iA09 = c0679Ij.A08();
            int i2 = A0I;
            if (iA09 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private InterfaceC1027Wc A02(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.AD7(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Ci.A04(this.A0D.A08(), this.A0C);
        return new Dh(interfaceC0536Cd.A6t(), interfaceC0536Cd.A7F(), this.A0C);
    }

    private InterfaceC1027Wc A03(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        C0679Ij c0679Ij = new C0679Ij(this.A0C.A02);
        interfaceC0536Cd.AD7(c0679Ij.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i = 36;
            }
        } else {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i = 13;
            }
        }
        int iA01 = A01(c0679Ij, i);
        int seekHeader2 = A0J;
        if (iA01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (iA01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (iA01 == seekHeader4) {
                    C0553Dg c0553DgA00 = C0553Dg.A00(interfaceC0536Cd.A6t(), interfaceC0536Cd.A7F(), this.A0C, c0679Ij);
                    interfaceC0536Cd.AEt(this.A0C.A02);
                    return c0553DgA00;
                }
                interfaceC0536Cd.AEB();
                return null;
            }
        }
        DN dnA01 = DN.A01(interfaceC0536Cd.A6t(), interfaceC0536Cd.A7F(), this.A0C, c0679Ij);
        if (dnA01 != null && !this.A0A.A03()) {
            interfaceC0536Cd.AEB();
            int seekHeader5 = i + 141;
            interfaceC0536Cd.A3K(seekHeader5);
            interfaceC0536Cd.AD7(this.A0D.A00, 0, 3);
            this.A0D.A0Y(0);
            C0539Cg c0539Cg = this.A0A;
            int seekHeader6 = this.A0D.A0G();
            c0539Cg.A04(seekHeader6);
        }
        int seekHeader7 = this.A0C.A02;
        interfaceC0536Cd.AEt(seekHeader7);
        if (dnA01 == null || dnA01.A8g()) {
            return dnA01;
        }
        int seekHeader8 = A0H;
        if (iA01 == seekHeader8) {
            return A02(interfaceC0536Cd);
        }
        return dnA01;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x004b A[EDGE_INSN: B:68:0x004b->B:23:0x004b BREAK  A[LOOP:0: B:18:0x003d->B:69:0x003d], SYNTHETIC] */
    private boolean A07(InterfaceC0536Cd interfaceC0536Cd, boolean z) throws InterruptedException, IOException {
        int iA00;
        String[] strArr;
        int i;
        int searchedBytes = 0;
        int searchLimitBytes = 0;
        int headerData = 0;
        int searchedBytes2 = 0;
        int i2 = z ? 16384 : 131072;
        interfaceC0536Cd.AEB();
        if (interfaceC0536Cd.A7F() == 0) {
            this.A07 = this.A0B.A00(interfaceC0536Cd, (this.A08 & 2) != 0 ? C0539Cg.A04 : null);
            Metadata metadata = this.A07;
            if (metadata != null) {
                this.A0A.A05(metadata);
            }
            headerData = (int) interfaceC0536Cd.A7A();
            if (!z) {
                interfaceC0536Cd.AEt(headerData);
            }
        }
        while (true) {
            if (!interfaceC0536Cd.AD8(this.A0D.A00, 0, 4, searchedBytes > 0)) {
                break;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            if (searchLimitBytes != 0) {
                boolean zA06 = A06(iA08, searchLimitBytes);
                String[] strArr2 = A0F;
                if (strArr2[2].length() == strArr2[5].length()) {
                    String[] strArr3 = A0F;
                    strArr3[2] = "nssPeb4tx";
                    strArr3[5] = "z93zYtEja";
                    if (zA06) {
                        iA00 = Ci.A00(iA08);
                        if (iA00 != -1) {
                            searchedBytes++;
                            if (searchedBytes == 1) {
                                Ci.A04(iA08, this.A0C);
                                strArr = A0F;
                                if (strArr[1].length() == strArr[4].length()) {
                                    String[] strArr4 = A0F;
                                    strArr4[0] = "7zrNMK9WlizC5ZgtVSnCLN45BdGxm2zl";
                                    strArr4[6] = "9rqhFN3Qk74SkJ0Nh6RYQs7QnFKhXl33";
                                    searchLimitBytes = iA08;
                                }
                            } else if (searchedBytes == 4) {
                                break;
                            }
                            interfaceC0536Cd.A3K(iA00 - 4);
                        }
                    }
                    i = searchedBytes2 + 1;
                    if (searchedBytes2 == i2) {
                        if (z) {
                            return false;
                        }
                        throw new C0488Af(A04(4, 24, 46));
                    }
                    searchedBytes = 0;
                    searchLimitBytes = 0;
                    if (z) {
                        interfaceC0536Cd.AEB();
                        interfaceC0536Cd.A3K(headerData + i);
                    } else {
                        interfaceC0536Cd.AEt(1);
                    }
                    searchedBytes2 = i;
                }
                throw new RuntimeException();
            }
            iA00 = Ci.A00(iA08);
            if (iA00 != -1) {
                i = searchedBytes2 + 1;
                if (searchedBytes2 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new C0488Af(A04(4, 24, 46));
                }
                searchedBytes = 0;
                searchLimitBytes = 0;
                if (z) {
                    interfaceC0536Cd.AEB();
                    interfaceC0536Cd.A3K(headerData + i);
                } else {
                    interfaceC0536Cd.AEt(1);
                }
                searchedBytes2 = i;
            } else {
                searchedBytes++;
                if (searchedBytes == 1) {
                    Ci.A04(iA08, this.A0C);
                    strArr = A0F;
                    if (strArr[1].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0F;
                    strArr5[0] = "7zrNMK9WlizC5ZgtVSnCLN45BdGxm2zl";
                    strArr5[6] = "9rqhFN3Qk74SkJ0Nh6RYQs7QnFKhXl33";
                    searchLimitBytes = iA08;
                } else if (searchedBytes == 4) {
                    break;
                    break;
                }
                interfaceC0536Cd.A3K(iA00 - 4);
            }
        }
        if (z) {
            interfaceC0536Cd.AEt(headerData + searchedBytes2);
        } else {
            interfaceC0536Cd.AEB();
        }
        this.A01 = searchLimitBytes;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A04 = interfaceC0537Ce;
        this.A05 = this.A04.AFD(0, 1);
        this.A04.A5D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0536Cd, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0536Cd);
            InterfaceC1027Wc interfaceC1027Wc = this.A06;
            if (interfaceC1027Wc == null || (!interfaceC1027Wc.A8g() && (this.A08 & 1) != 0)) {
                InterfaceC1027Wc interfaceC1027WcA02 = A02(interfaceC0536Cd);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = interfaceC1027WcA02;
            }
            this.A04.AEM(this.A06);
            this.A05.A5V(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0536Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return A07(interfaceC0536Cd, true);
    }
}
