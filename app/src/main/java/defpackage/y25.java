package defpackage;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public final class y25 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ long B;
    public final /* synthetic */ float w;
    public final /* synthetic */ long x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y25(float f, long j, x81<? super g30, ? super Integer, sd5> x81Var, int i, boolean z, long j2) {
        super(2);
        this.w = f;
        this.x = j;
        this.y = x81Var;
        this.z = i;
        this.A = z;
        this.B = j2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        q53 q53Var;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            jt4 jt4Var = sc5.a;
            w55 w55Var = ((rc5) g30Var2.E(jt4Var)).g;
            w55 w55Var2 = ((rc5) g30Var2.E(jt4Var)).l;
            int i = tq4.e;
            rq4 rq4Var = w55Var.a;
            long jA = rq4Var.a.a();
            rq4 rq4Var2 = w55Var2.a;
            long jA2 = rq4Var2.a.a();
            float f = this.w;
            long jR = hH.r(jA, jA2, f);
            h25 kvVar = (jR > yu.h ? 1 : (jR == yu.h ? 0 : -1)) != 0 ? new kv(jR) : h25.QnHx.a;
            e41 e41Var = (e41) tq4.a(f, rq4Var.f, rq4Var2.f);
            long jB = tq4.b(rq4Var.b, rq4Var2.b, f);
            x41 x41Var = rq4Var.c;
            if (x41Var == null) {
                x41Var = x41.z;
            }
            x41 x41Var2 = rq4Var2.c;
            if (x41Var2 == null) {
                x41Var2 = x41.z;
            }
            int i2 = x41Var2.w;
            int i3 = x41Var.w;
            x41 x41Var3 = new x41(AY.o(sy4.a(((double) (i2 - i3)) * ((double) f)) + i3, 1, AdError.NETWORK_ERROR_CODE));
            v41 v41Var = (v41) tq4.a(f, rq4Var.d, rq4Var2.d);
            w41 w41Var = (w41) tq4.a(f, rq4Var.e, rq4Var2.e);
            String str = (String) tq4.a(f, rq4Var.g, rq4Var2.g);
            long jB2 = tq4.b(rq4Var.h, rq4Var2.h, f);
            x8 x8Var = rq4Var.i;
            float f2 = x8Var != null ? x8Var.a : 0.0f;
            x8 x8Var2 = rq4Var2.i;
            float fY = C0239D.y(f2, x8Var2 != null ? x8Var2.a : 0.0f, f);
            a55 a55Var = a55.c;
            a55 a55Var2 = rq4Var.j;
            if (a55Var2 == null) {
                a55Var2 = a55Var;
            }
            a55 a55Var3 = rq4Var2.j;
            if (a55Var3 != null) {
                a55Var = a55Var3;
            }
            a55 a55Var4 = new a55(C0239D.y(a55Var2.a, a55Var.a, f), C0239D.y(a55Var2.b, a55Var.b, f));
            z42 z42Var = (z42) tq4.a(f, rq4Var.k, rq4Var2.k);
            long jR2 = hH.r(rq4Var.l, rq4Var2.l, f);
            a25 a25Var = (a25) tq4.a(f, rq4Var.m, rq4Var2.m);
            yi4 yi4Var = rq4Var.n;
            if (yi4Var == null) {
                yi4Var = new yi4();
            }
            yi4 yi4Var2 = rq4Var2.n;
            if (yi4Var2 == null) {
                yi4Var2 = new yi4();
            }
            yi4 yi4Var3 = new yi4(hH.r(yi4Var.a, yi4Var2.a, f), X.y(yi4Var.b, yi4Var2.b, f), C0239D.y(yi4Var.c, yi4Var2.c, f));
            q53 q53Var2 = rq4Var.o;
            if (q53Var2 == null && rq4Var2.o == null) {
                q53Var = null;
            } else {
                if (q53Var2 == null) {
                    q53Var2 = q53.a;
                }
                q53Var = q53Var2;
            }
            rq4 rq4Var3 = new rq4(kvVar, jB, x41Var3, v41Var, w41Var, e41Var, str, jB2, new x8(fY), a55Var4, z42Var, jR2, a25Var, yi4Var3, q53Var);
            int i4 = cz2.b;
            bz2 bz2Var = w55Var.b;
            q15 q15Var = bz2Var.a;
            bz2 bz2Var2 = w55Var2.b;
            q15 q15Var2 = (q15) tq4.a(f, q15Var, bz2Var2.a);
            d25 d25Var = (d25) tq4.a(f, bz2Var.b, bz2Var2.b);
            long jB3 = tq4.b(bz2Var.c, bz2Var2.c, f);
            b55 b55Var = bz2Var.d;
            if (b55Var == null) {
                b55Var = b55.c;
            }
            b55 b55Var2 = bz2Var2.d;
            if (b55Var2 == null) {
                b55Var2 = b55.c;
            }
            b55 b55Var3 = new b55(tq4.b(b55Var.a, b55Var2.a, f), tq4.b(b55Var.b, b55Var2.b, f));
            n53 n53Var = bz2Var.e;
            n53 n53Var2 = bz2Var2.e;
            if (n53Var == null && n53Var2 == null) {
                n53Var = null;
            } else {
                if (n53Var == null) {
                    n53Var = n53.b;
                }
                if (n53Var2 == null) {
                    n53Var2 = n53.b;
                }
                boolean z = n53Var.a;
                boolean z2 = n53Var2.a;
                if (z != z2) {
                    n53Var = new n53(((Boolean) tq4.a(f, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue());
                }
            }
            w55 w55Var3 = new w55(rq4Var3, new bz2(q15Var2, d25Var, jB3, b55Var3, n53Var, (l32) tq4.a(f, bz2Var.f, bz2Var2.f)));
            long j = this.B;
            if (this.A) {
                w55Var3 = w55.a(w55Var3, j, null, null, 262142);
            }
            e35.b(this.x, w55Var3, null, this.y, g30Var2, ((this.z >> 6) & 14) | 384, 0);
        }
        return sd5.a;
    }
}
