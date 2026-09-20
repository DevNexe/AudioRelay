package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XK implements InterfaceC0484Ab {
    public static byte[] A0A;
    public static String[] A0B = {"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final V9 A07;
    public final C0683In A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, -31, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, -31, -18, -55, -17};
    }

    static {
        A02();
    }

    public XK() {
        this(new V9(true, 65536));
    }

    @Deprecated
    public XK(V9 v9) {
        this(v9, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public XK(V9 v9, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(v9, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public XK(V9 v9, int i, int i2, int i3, int i4, int i5, boolean z, C0683In c0683In) {
        String strA01 = A01(21, 1, 103);
        String strA02 = A01(54, 19, 80);
        A03(i3, 0, strA02, strA01);
        String strA03 = A01(22, 32, 46);
        A03(i4, 0, strA03, strA01);
        String strA04 = A01(84, 11, 100);
        A03(i, i3, strA04, strA02);
        A03(i, i4, strA04, strA03);
        A03(i2, i, A01(73, 11, 106), strA04);
        this.A07 = v9;
        this.A06 = ((long) i) * 1000;
        this.A05 = ((long) i2) * 1000;
        this.A04 = ((long) i3) * 1000;
        this.A03 = ((long) i4) * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = c0683In;
    }

    private final int A00(XG[] xgArr, HR hr) {
        int iA01 = 0;
        for (int i = 0; i < xgArr.length; i++) {
            if (hr.A00(i) != null) {
                iA01 += C0695Iz.A01(xgArr[i].A7i());
            }
        }
        return iA01;
    }

    public static void A03(int i, int i2, String str, String str2) {
        IK.A05(i >= i2, str + A01(0, 21, 48) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        C0683In c0683In = this.A08;
        if (c0683In != null && this.A01) {
            c0683In.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final HW A5h() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final long A5m() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final void AC5() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final void ACR() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final void ACZ(XG[] xgArr, TrackGroupArray trackGroupArray, HR hr) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(xgArr, hr);
        }
        this.A00 = iA00;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final boolean AED() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final boolean AEl(long j, float f) {
        boolean z = true;
        boolean z2 = this.A07.A02() >= this.A00;
        boolean z3 = this.A01;
        long mediaDurationMinBufferUs = this.A06;
        if (f > 1.0f) {
            mediaDurationMinBufferUs = Math.min(C0695Iz.A0C(mediaDurationMinBufferUs, f), this.A05);
        }
        if (j < mediaDurationMinBufferUs) {
            boolean z4 = this.A09;
            if (A0B[1].charAt(1) == 't') {
                throw new RuntimeException();
            }
            A0B[5] = "Ppn0DE";
            if (!z4 && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        C0683In c0683In = this.A08;
        if (c0683In != null) {
            boolean z5 = this.A01;
            if (A0B[6].length() != 13) {
                String[] strArr = A0B;
                strArr[3] = "7hiTZk3TS6kdJpPH1OWD5iH5Lha";
                strArr[7] = "uWsgjDiVcVLtDVCTZxMR";
                if (z5 != z3) {
                    if (z5) {
                        c0683In.A00(0);
                    } else {
                        c0683In.A03(0);
                    }
                }
            } else {
                A0B[6] = "I9dScF5ijEM2hd";
                if (z5 != z3) {
                    if (z5) {
                        c0683In.A00(0);
                    } else {
                        c0683In.A03(0);
                    }
                }
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final boolean AEo(long j, float f, boolean z) {
        long jA0D = C0695Iz.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        if (A0B[6].length() == 13) {
            throw new RuntimeException();
        }
        A0B[6] = "eSzKm";
        return j2 <= 0 || jA0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0484Ab
    public final void onPrepared() {
        A04(false);
    }
}
