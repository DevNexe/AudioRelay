package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1036Wl implements InterfaceC0535Cc {
    public static byte[] A0F;
    public static String[] A0G = {"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", "", "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    public static final InterfaceC0538Cf A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0537Ce A06;
    public C1038Wn A07;
    public C1033Wi A08;
    public boolean A09;
    public final C0679Ij A0C = new C0679Ij(4);
    public final C0679Ij A0B = new C0679Ij(9);
    public final C0679Ij A0E = new C0679Ij(11);
    public final C0679Ij A0D = new C0679Ij();
    public final C1035Wk A0A = new C1035Wk();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    static {
        A03();
        A0H = new C1037Wm();
        A0I = C0695Iz.A08(A01(0, 3, 9));
    }

    private C0679Ij A00(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (this.A02 > this.A0D.A05()) {
            C0679Ij c0679Ij = this.A0D;
            c0679Ij.A0b(new byte[Math.max(c0679Ij.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0536Cd.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AEM(new C1041Wq(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0D() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A04(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.AEt(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (!interfaceC0536Cd.ADc(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        C0679Ij c0679Ij = this.A0B;
        if (A0G[4].length() == 15) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
        strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
        c0679Ij.A0Y(0);
        this.A0B.A0Z(4);
        int iA0E = this.A0B.A0E();
        boolean z = (iA0E & 4) != 0;
        boolean hasAudio = (iA0E & 1) != 0;
        if (z && this.A07 == null) {
            this.A07 = new C1038Wn(this.A06.AFD(8, 1));
        }
        if (hasAudio && this.A08 == null) {
            this.A08 = new C1033Wi(this.A06.AFD(9, 2));
        }
        this.A06.A5D();
        this.A00 = (this.A0B.A08() - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A06(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC0536Cd), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0536Cd), this.A04 + this.A05);
        } else if (this.A03 == 18 && !this.A09) {
            this.A0A.A00(A00(interfaceC0536Cd), this.A05);
            long jA0D = this.A0A.A0D();
            if (jA0D != -9223372036854775807L) {
                this.A06.AEM(new C1041Wq(jA0D));
                this.A09 = true;
            }
        } else {
            int i = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            A0G[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            interfaceC0536Cd.AEt(i);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (!interfaceC0536Cd.ADc(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = (((long) (this.A0E.A0E() << 24)) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A06 = interfaceC0537Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        while (true) {
            int i = this.A01;
            if (i != 1) {
                if (i == 2) {
                    A04(interfaceC0536Cd);
                } else {
                    if (A0G[4].length() == 15) {
                        throw new RuntimeException();
                    }
                    A0G[4] = "ncW0XwKX3pgCRaaT";
                    if (i != 3) {
                        if (i == 4) {
                            if (A06(interfaceC0536Cd)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    A0G[7] = "5";
                                    return 0;
                                }
                                A0G[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A07(interfaceC0536Cd)) {
                        return -1;
                    }
                }
            } else if (!A05(interfaceC0536Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.AD7(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0536Cd.AD7(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0536Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int iA08 = this.A0C.A08();
        interfaceC0536Cd.AEB();
        interfaceC0536Cd.A3K(iA08);
        interfaceC0536Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        return this.A0C.A08() == 0;
    }
}
