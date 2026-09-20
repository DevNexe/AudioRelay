package defpackage;

import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class roB extends cx1 implements j81<MW, MW> {
    public static final roB w = new roB();

    public roB() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    @Override // defpackage.j81
    public final MW invoke(MW mw) {
        int i;
        int i2;
        MW mw2 = mw;
        gq0.QnHx qnHx = gq0.x;
        long jY = mw2.a;
        if (!gq0.n(jY)) {
            long j = jY >> 1;
            long j2 = 2;
            long j3 = j * j2;
            boolean z = (((int) jY) & 1) == 0;
            long j4 = gq0.y;
            long j5 = gq0.z;
            if (z) {
                if (new o62(-2147483647L, 2147483647L).f(j)) {
                    jY = ps0.A(j3);
                } else if (j3 / j2 == j) {
                    jY = ps0.f(j3);
                } else {
                    long j6 = UtilsKt.MICROS_MULTIPLIER;
                    long j7 = j / j6;
                    long j8 = j7 * j2;
                    long jO = (((j - ps0.O(j7)) * j2) / j6) + j8;
                    if (j8 / j2 != j7 || (jO ^ j8) < 0) {
                        if (j < 0) {
                            i2 = -1;
                        } else {
                            i2 = j > 0 ? 1 : 0;
                        }
                        if (1 * i2 > 0) {
                            jY = j4;
                        } else {
                            jY = j5;
                        }
                    } else {
                        jY = ps0.y(AY.q(jO, new o62(-4611686018427387903L, 4611686018427387903L)));
                    }
                }
            } else if (j3 / j2 == j) {
                jY = ps0.y(AY.q(j3, new o62(-4611686018427387903L, 4611686018427387903L)));
            } else {
                if (j < 0) {
                    i = -1;
                } else {
                    i = j > 0 ? 1 : 0;
                }
                if (1 * i > 0) {
                    jY = j4;
                } else {
                    jY = j5;
                }
            }
        }
        return MW.a(mw2, ps0.p0(Math.min(gq0.g(jY), gq0.g(NB.a)), kq0.MILLISECONDS), null, 3, false, 26);
    }
}
