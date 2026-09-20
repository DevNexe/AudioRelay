package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WJ extends DY {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public C0548Da A01;
    public C0550Dc A02;
    public C0551De A03;
    public boolean A04;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C0548Da c0548Da) {
        if (!c0548Da.A04[A00(b, c0548Da.A00, 1)].A03) {
            return c0548Da.A02.A03;
        }
        return c0548Da.A02.A04;
    }

    private final C0548Da A02(C0679Ij c0679Ij) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0552Df.A04(c0679Ij);
            return null;
        }
        C0550Dc c0550Dc = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (c0550Dc == null) {
            this.A02 = C0552Df.A03(c0679Ij);
            return null;
        }
        byte[] bArr = new byte[c0679Ij.A07()];
        System.arraycopy(c0679Ij.A00, 0, bArr, 0, c0679Ij.A07());
        Dd[] ddArrA0C = C0552Df.A0C(c0679Ij, this.A03.A05);
        return new C0548Da(this.A03, this.A02, bArr, ddArrA0C, C0552Df.A00(ddArrA0C.length - 1));
    }

    public static void A05(C0679Ij c0679Ij, long j) {
        c0679Ij.A0X(c0679Ij.A07() + 4);
        c0679Ij.A00[c0679Ij.A07() - 4] = (byte) (j & 255);
        c0679Ij.A00[c0679Ij.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0679Ij.A00[c0679Ij.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0679Ij.A00[c0679Ij.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0679Ij c0679Ij) {
        try {
            return C0552Df.A0A(1, c0679Ij, true);
        } catch (C0488Af unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0679Ij c0679Ij) {
        if ((c0679Ij.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0679Ij.A00[0], this.A01);
        int i = this.A04 ? (this.A00 + iA01) / 4 : 0;
        A05(c0679Ij, i);
        this.A04 = true;
        this.A00 = iA01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C0551De c0551De = this.A03;
        this.A00 = c0551De != null ? c0551De.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0679Ij c0679Ij, long j, DX dx) throws InterruptedException, IOException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c0679Ij);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        dx.A00 = Format.A07(null, A03(0, 12, 111), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
