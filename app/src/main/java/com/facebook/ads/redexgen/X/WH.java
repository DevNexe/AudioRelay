package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WH implements InterfaceC0535Cc {
    public static byte[] A04;
    public static String[] A05 = {"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", "", "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    public static final InterfaceC0538Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WG A02;
    public final C0679Ij A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{15, 2, 117};
    }

    static {
        A01();
        A06 = new WI();
        A07 = C0695Iz.A08(A00(0, 3, 127));
    }

    public WH() {
        this(0L);
    }

    public WH(long j) {
        this.A01 = j;
        this.A02 = new WG();
        this.A03 = new C0679Ij(2786);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A02.A4V(interfaceC0537Ce, new C0568Dw(0, 1));
        interfaceC0537Ce.A5D();
        interfaceC0537Ce.AEM(new C1041Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        int i = interfaceC0536Cd.read(this.A03.A00, 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i);
        if (!this.A00) {
            this.A02.AD4(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A00 = false;
        this.A02.AEK();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        C0679Ij c0679Ij = new C0679Ij(10);
        int i = 0;
        while (true) {
            interfaceC0536Cd.AD7(c0679Ij.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            A05[5] = "IuOldmz1qGC5b";
            c0679Ij.A0Y(0);
            if (c0679Ij.A0G() != A07) {
                interfaceC0536Cd.AEB();
                interfaceC0536Cd.A3K(i);
                int startPosition = i;
                int i2 = 0;
                while (true) {
                    interfaceC0536Cd.AD7(c0679Ij.A00, 0, 5);
                    c0679Ij.A0Y(0);
                    if (c0679Ij.A0I() != 2935) {
                        i2 = 0;
                        interfaceC0536Cd.AEB();
                        startPosition++;
                        if (startPosition - i >= 8192) {
                            return false;
                        }
                        interfaceC0536Cd.A3K(startPosition);
                    } else {
                        i2++;
                        if (A05[5].length() != 29) {
                            String[] strArr = A05;
                            strArr[3] = "a4rI";
                            strArr[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (i2 >= 4) {
                                return true;
                            }
                        } else if (i2 >= 4) {
                            return true;
                        }
                        int iA05 = BA.A05(c0679Ij.A00);
                        if (iA05 == -1) {
                            return false;
                        }
                        int syncBytes = iA05 - 5;
                        interfaceC0536Cd.A3K(syncBytes);
                    }
                }
            } else {
                c0679Ij.A0Z(3);
                int iA0D = c0679Ij.A0D();
                int syncBytes2 = iA0D + 10;
                i += syncBytes2;
                interfaceC0536Cd.A3K(iA0D);
            }
        }
    }
}
