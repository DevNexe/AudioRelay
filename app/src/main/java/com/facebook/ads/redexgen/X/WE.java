package com.facebook.ads.redexgen.X;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0535Cc {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final InterfaceC0538Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WD A02;
    public final C0679Ij A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 22, 97};
    }

    static {
        A01();
        A06 = new WF();
        A07 = C0695Iz.A08(A00(0, 3, 42));
    }

    public WE() {
        this(0L);
    }

    public WE(long j) {
        this.A01 = j;
        this.A02 = new WD(true);
        this.A03 = new C0679Ij(RCHTTPStatusCodes.SUCCESS);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A02.A4V(interfaceC0537Ce, new C0568Dw(0, 1));
        interfaceC0537Ce.A5D();
        interfaceC0537Ce.AEM(new C1041Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        int i = interfaceC0536Cd.read(this.A03.A00, 0, RCHTTPStatusCodes.SUCCESS);
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
        C0678Ii c0678Ii = new C0678Ii(c0679Ij.A00);
        int validFramesCount = 0;
        while (true) {
            interfaceC0536Cd.AD7(c0679Ij.A00, 0, 10);
            c0679Ij.A0Y(0);
            if (c0679Ij.A0G() != A07) {
                break;
            }
            c0679Ij.A0Z(3);
            int iA0D = c0679Ij.A0D();
            int length = iA0D + 10;
            validFramesCount += length;
            interfaceC0536Cd.A3K(iA0D);
        }
        interfaceC0536Cd.AEB();
        interfaceC0536Cd.A3K(validFramesCount);
        int i = validFramesCount;
        int i2 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i3 = 0;
        while (true) {
            interfaceC0536Cd.AD7(c0679Ij.A00, 0, 2);
            c0679Ij.A0Y(0);
            int validFramesSize = c0679Ij.A0I();
            if ((65526 & validFramesSize) != 65520) {
                i3 = 0;
                i2 = 0;
                interfaceC0536Cd.AEB();
                i++;
                if (i - validFramesCount >= 8192) {
                    return false;
                }
                interfaceC0536Cd.A3K(i);
            } else {
                i3++;
                if (i3 >= 4 && i2 > 188) {
                    return true;
                }
                interfaceC0536Cd.AD7(c0679Ij.A00, 0, 4);
                c0678Ii.A07(14);
                int iA04 = c0678Ii.A04(13);
                if (iA04 <= 6) {
                    return false;
                }
                int syncBytes = iA04 - 6;
                interfaceC0536Cd.A3K(syncBytes);
                i2 += iA04;
            }
        }
    }
}
