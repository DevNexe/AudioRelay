package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CK implements VW, VX {
    public static String[] A06 = {"xZ98n6jXZ", "w0wM6S1AW5kwd8mBaLXb8IJFUPLi1ZSY", "", "5GeP1Ey0MjdLLaKEOlMigJbDmIHcG3Ps", "Q5WYazqpabUa99ZYxsI", "Gm0HQrfOciURdkrLDtJ", "cUS8ttxVNiquYZeS", "9hpvQN9G3pxye3p4YcQpNMMd2GK"};
    public long A00;
    public long A01;
    public long A02;
    public VX A03;
    public C1004Vc[] A04 = new C1004Vc[0];
    public final VW A05;

    public CK(VW vw, boolean z, long j, long j2) {
        this.A05 = vw;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C0506Ax A00(long j, C0506Ax c0506Ax) {
        long jA0E = C0695Iz.A0E(c0506Ax.A01, 0L, j - this.A01);
        long j2 = c0506Ax.A00;
        long j3 = this.A00;
        long jA0E2 = C0695Iz.A0E(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jA0E == c0506Ax.A01 && jA0E2 == c0506Ax.A00) {
            return c0506Ax;
        }
        return new C0506Ax(jA0E, jA0E2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Fw
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AAP(VW vw) {
        this.A03.AAP(this);
    }

    public static boolean A02(long j, HQ[] hqArr) {
        if (j != 0) {
            for (HQ hq : hqArr) {
                if (hq != null && !C0672Ic.A09(hq.A7P().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final boolean A4A(long j) {
        return this.A05.A4A(j);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A4p(long j, boolean z) {
        this.A05.A4p(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5e(long j, C0506Ax c0506Ax) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5e(j, A00(j, c0506Ax));
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5t() {
        long jA5t = this.A05.A5t();
        if (jA5t != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jA5t < j) {
                return jA5t;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A71() {
        long jA71 = this.A05.A71();
        if (jA71 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jA71 < j) {
                return jA71;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final TrackGroupArray A7h() {
        return this.A05.A7h();
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A9Y() throws IOException {
        this.A05.A9Y();
    }

    @Override // com.facebook.ads.redexgen.X.VX
    public final void ABw(VW vw) {
        this.A03.ABw(this);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADG(VX vx, long j) {
        this.A03 = vx;
        this.A05.ADG(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long ADb() {
        if (A03()) {
            long j = this.A02;
            this.A02 = -9223372036854775807L;
            long jADb = ADb();
            return jADb != -9223372036854775807L ? jADb : j;
        }
        long jADb2 = this.A05.ADb();
        String[] strArr = A06;
        if (strArr[7].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "JN4lYhgdVtJugUzGLO1";
        strArr2[4] = "V7PIoeFvQi5pkabjQnk";
        if (jADb2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        IK.A04(jADb2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jADb2 > discontinuityUs) {
            z = false;
        }
        IK.A04(z);
        return jADb2;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADi(long j) {
        this.A05.ADi(j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.facebook.ads.redexgen.X.VW
    public final long AEP(long j) {
        this.A02 = -9223372036854775807L;
        boolean z = false;
        for (C1004Vc c1004Vc : this.A04) {
            if (c1004Vc != null) {
                c1004Vc.A00();
            }
        }
        long jAEP = this.A05.AEP(j);
        if (jAEP == j) {
            z = true;
        } else if (jAEP >= this.A01) {
            long j2 = this.A00;
            if (j2 == Long.MIN_VALUE || jAEP <= j2) {
                z = true;
            }
        }
        IK.A04(z);
        return jAEP;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    @Override // com.facebook.ads.redexgen.X.VW
    public final long AEQ(HQ[] hqArr, boolean[] zArr, InterfaceC0615Fv[] interfaceC0615FvArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.A04 = new C1004Vc[interfaceC0615FvArr.length];
        InterfaceC0615Fv[] interfaceC0615FvArr2 = new InterfaceC0615Fv[interfaceC0615FvArr.length];
        int i = 0;
        while (true) {
            InterfaceC0615Fv interfaceC0615Fv = null;
            if (i >= interfaceC0615FvArr.length) {
                break;
            }
            C1004Vc[] c1004VcArr = this.A04;
            c1004VcArr[i] = (C1004Vc) interfaceC0615FvArr[i];
            if (c1004VcArr[i] != null) {
                interfaceC0615Fv = c1004VcArr[i].A01;
            }
            interfaceC0615FvArr2[i] = interfaceC0615Fv;
            i++;
        }
        long jAEQ = this.A05.AEQ(hqArr, zArr, interfaceC0615FvArr2, zArr2, j);
        if (A03()) {
            long j3 = this.A01;
            if (j == j3 && A02(j3, hqArr)) {
                j2 = jAEQ;
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.A02 = j2;
        if (jAEQ != j) {
            if (jAEQ >= this.A01) {
                long j4 = this.A00;
                z = j4 == Long.MIN_VALUE || jAEQ <= j4;
            }
        }
        IK.A04(z);
        for (int i2 = 0; i2 < interfaceC0615FvArr.length; i2++) {
            if (interfaceC0615FvArr2[i2] == null) {
                this.A04[i2] = null;
            } else if (interfaceC0615FvArr[i2] == null || this.A04[i2].A01 != interfaceC0615FvArr2[i2]) {
                this.A04[i2] = new C1004Vc(this, interfaceC0615FvArr2[i2]);
            }
            interfaceC0615FvArr[i2] = this.A04[i2];
        }
        return jAEQ;
    }
}
