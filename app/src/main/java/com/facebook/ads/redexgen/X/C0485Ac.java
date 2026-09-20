package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0485Ac {
    public static byte[] A0F;
    public static String[] A0G = {"veEP335vIU", "oLB3f1kinZ5WOxb9JrKF9bI12rnC7Hj4", "JTOn230cVZ0r3ImY4sjYKOAnliXJWsYG", "qI3jAuZXuqqi9ieUnmB3HYz1RRsZ6ptY", "FV6PRsoISyO05pqLoteca44", "2aqdzlIyDZTOMtMqQXI", "yc78GsDKEqwKVvSYIw58zbgjS6oh7wuT", "vKvp49qN2fZ5TwJRBPfaEcKl4xZFQEWJ"};
    public long A00;
    public C0485Ac A01;
    public C0486Ad A02;
    public TrackGroupArray A03;
    public HU A04;
    public boolean A05;
    public boolean A06;
    public HU A07;
    public final VW A08;
    public final Object A09;
    public final InterfaceC0615Fv[] A0A;
    public final boolean[] A0B;
    public final InterfaceC0594Fa A0C;
    public final HT A0D;
    public final InterfaceC0503Au[] A0E;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{42, 66, 65, 70, 62, 45, 66, 79, 70, 76, 65, 37, 76, 73, 65, 66, 79, 50, 71, 84, 75, 81, 70, 2, 84, 71, 78, 71, 67, 85, 71, 2, 72, 67, 75, 78, 71, 70, 16};
    }

    static {
        A01();
    }

    public C0485Ac(InterfaceC0503Au[] interfaceC0503AuArr, long j, HT ht, HW hw, InterfaceC0594Fa interfaceC0594Fa, Object obj, C0486Ad c0486Ad) {
        this.A0E = interfaceC0503AuArr;
        this.A00 = j - c0486Ad.A03;
        this.A0D = ht;
        this.A0C = interfaceC0594Fa;
        this.A09 = IK.A01(obj);
        this.A02 = c0486Ad;
        this.A0A = new InterfaceC0615Fv[interfaceC0503AuArr.length];
        this.A0B = new boolean[interfaceC0503AuArr.length];
        VW vwA4Q = interfaceC0594Fa.A4Q(c0486Ad.A04, hw);
        this.A08 = c0486Ad.A02 != Long.MIN_VALUE ? new CK(vwA4Q, true, 0L, c0486Ad.A02) : vwA4Q;
    }

    private void A02(HU hu2) {
        int i = 0;
        while (true) {
            int i2 = hu2.A00;
            String[] strArr = A0G;
            if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "zTmDI2eB0pskJnfpVdGiT2gSjaG941UO";
            strArr2[3] = "GwIuNKKr0Vh704cWvV3fzSTRpdmwONBr";
            if (i < i2) {
                boolean zA00 = hu2.A00(i);
                HQ hqA00 = hu2.A01.A00(i);
                if (zA00 && hqA00 != null) {
                    hqA00.A59();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A03(HU hu2) {
        HU hu3 = this.A07;
        this.A07 = hu2;
        HU hu4 = this.A07;
        if (hu4 != null) {
            A02(hu4);
        }
    }

    private void A04(InterfaceC0615Fv[] interfaceC0615FvArr) {
        int i = 0;
        while (true) {
            InterfaceC0503Au[] interfaceC0503AuArr = this.A0E;
            if (i < interfaceC0503AuArr.length) {
                if (interfaceC0503AuArr[i].A7i() == 5 && this.A04.A00(i)) {
                    interfaceC0615FvArr[i] = new C1003Vb();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A05(InterfaceC0615Fv[] interfaceC0615FvArr) {
        int i = 0;
        while (true) {
            InterfaceC0503Au[] interfaceC0503AuArr = this.A0E;
            if (i < interfaceC0503AuArr.length) {
                if (interfaceC0503AuArr[i].A7i() == 5) {
                    interfaceC0615FvArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A71();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[SYNTHETIC] */
    public final long A0B(long j, boolean z, boolean[] zArr) {
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = false;
            if (i >= this.A04.A00) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z3 = true;
            }
            zArr2[i] = z3;
            i++;
        }
        A05(this.A0A);
        A03(this.A04);
        if (A0G[7].charAt(5) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[4] = "QjaNyuHuRXZwiIdLefV3JnB";
        strArr[5] = "qMpMOgpNZnnJVrHuPMC";
        HR hr = this.A04.A01;
        long jAEQ = this.A08.AEQ(hr.A01(), this.A0B, this.A0A, zArr, j);
        A04(this.A0A);
        this.A05 = false;
        int i2 = 0;
        while (true) {
            InterfaceC0615Fv[] interfaceC0615FvArr = this.A0A;
            if (i2 < interfaceC0615FvArr.length) {
                InterfaceC0615Fv interfaceC0615Fv = interfaceC0615FvArr[i2];
                if (A0G[7].charAt(5) != '9') {
                    String[] strArr2 = A0G;
                    strArr2[4] = "ECZNN42Owql1H3dvmIySnd1";
                    strArr2[5] = "Y1ZBsUrBheVlA6CxnB4";
                    if (interfaceC0615Fv != null) {
                        IK.A04(this.A04.A00(i2));
                        if (this.A0E[i2].A7i() != 5) {
                            this.A05 = true;
                        }
                    } else {
                        if (hr.A00(i2) == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        IK.A04(z2);
                    }
                } else {
                    A0G[0] = "F5cg";
                    if (interfaceC0615Fv != null) {
                        IK.A04(this.A04.A00(i2));
                        if (this.A0E[i2].A7i() != 5) {
                            this.A05 = true;
                        }
                    } else {
                        if (hr.A00(i2) == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        IK.A04(z2);
                    }
                }
                i2++;
            } else {
                return jAEQ;
            }
        }
    }

    public final long A0C(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long jA5t = this.A08.A5t();
        if (jA5t == Long.MIN_VALUE && z) {
            C0486Ad c0486Ad = this.A02;
            String[] strArr = A0G;
            if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A0G[0] = "Yxep602BeUF0L8l";
            return c0486Ad.A01;
        }
        return jA5t;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.ADr(((CK) this.A08).A05);
            } else {
                this.A0C.ADr(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e(A00(0, 17, 116), A00(17, 22, 121), e);
        }
    }

    public final void A0E(float f) throws AM {
        this.A06 = true;
        this.A03 = this.A08.A7h();
        A0I(f);
        long jA0A = A0A(this.A02.A03, false);
        this.A00 += this.A02.A03 - jA0A;
        this.A02 = this.A02.A01(jA0A);
    }

    public final void A0F(long j) {
        this.A08.A4A(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.ADi(A08(j));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A5t() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f) throws AM {
        HU huA0T = this.A0D.A0T(this.A0E, this.A03);
        if (huA0T.A01(this.A07)) {
            return false;
        }
        this.A04 = huA0T;
        for (HQ trackSelection : this.A04.A01.A01()) {
            if (trackSelection != null) {
                trackSelection.ABp(f);
            }
        }
        return true;
    }
}
