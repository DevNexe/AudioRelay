package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class f92 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ l82 x;
        public final /* synthetic */ j81<k82, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, l82 l82Var, j81<? super k82, sd5> j81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = l82Var;
            this.y = j81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            f92.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ l82 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ j81<k82, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(l82 l82Var, int i, boolean z, j81<? super k82, sd5> j81Var) {
            super(3);
            this.w = l82Var;
            this.x = i;
            this.y = z;
            this.z = j81Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            wv wvVar2 = wvVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(wvVar2) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                q70.a(z00.a, g30Var2, 6);
                pg2.QnHx qnHx = pg2.QnHx.w;
                float f = 16;
                hH.i(gm4.g(qnHx, f), g30Var2, 6);
                l82 l82Var = this.w;
                Object[] objArr = {l82Var.a};
                f34 f34Var = x45.d;
                g30Var2.e(1157296644);
                boolean zI = g30Var2.I(l82Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new e92(l82Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                ri2 ri2VarE = g7.e(objArr, f34Var, (h81) objF, g30Var2);
                i82 i82Var = l82Var.c;
                boolean z = this.y;
                int i2 = this.x;
                if (z) {
                    g30Var2.e(1037857512);
                    da.CQf cQf2 = One.QnHx.k;
                    l82 l82Var2 = this.w;
                    j81<k82, sd5> j81Var = this.z;
                    g30Var2.e(693286680);
                    rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var2);
                    g30Var2.e(-1323940314);
                    ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                    jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                    ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                    a30.e.getClass();
                    yy1.QnHx qnHx2 = a30.QnHx.b;
                    sz szVarJ = S12N.j(qnHx);
                    if (!(g30Var2.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var2.s();
                    if (g30Var2.m()) {
                        g30Var2.l(qnHx2);
                    } else {
                        g30Var2.A();
                    }
                    g30Var2.u();
                    hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                    hH.u(g30Var2, ij0Var, a30.QnHx.d);
                    hH.u(g30Var2, jy1Var, a30.QnHx.f);
                    qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                    if (!(((double) 1.0f) > 0.0d)) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx3 = wo1.a;
                    mz1 mz1Var = new mz1(1.0f, true);
                    x45 x45Var = (x45) ri2VarE.getValue();
                    g30Var2.e(511388516);
                    boolean zI2 = g30Var2.I(ri2VarE) | g30Var2.I(j81Var);
                    Object objF2 = g30Var2.f();
                    if (zI2 || objF2 == c0132QnHx) {
                        objF2 = new a92(ri2VarE, j81Var);
                        g30Var2.B(objF2);
                    }
                    g30Var2.G();
                    int i3 = i2 & 112;
                    f92.d(mz1Var, l82Var2, x45Var, (j81) objF2, j81Var, g30Var2, i3 | ((i2 << 6) & 57344));
                    hH.i(gm4.k(qnHx, f), g30Var2, 6);
                    g30Var2.e(511388516);
                    boolean zI3 = g30Var2.I(j81Var) | g30Var2.I(ri2VarE);
                    Object objF3 = g30Var2.f();
                    if (zI3 || objF3 == c0132QnHx) {
                        objF3 = new b92(ri2VarE, j81Var);
                        g30Var2.B(objF3);
                    }
                    g30Var2.G();
                    f92.c(null, l82Var2, (h81) objF3, g30Var2, i3, 1);
                    ex0.d(g30Var2);
                    f92.b(wvVar2, i82Var, g30Var2, i & 14);
                    g30Var2.G();
                } else {
                    g30Var2.e(1037858321);
                    hx0 hx0Var = gm4.a;
                    l82 l82Var3 = this.w;
                    x45 x45Var2 = (x45) ri2VarE.getValue();
                    g30Var2.e(511388516);
                    boolean zI4 = g30Var2.I(ri2VarE);
                    j81<k82, sd5> j81Var2 = this.z;
                    boolean zI5 = zI4 | g30Var2.I(j81Var2);
                    Object objF4 = g30Var2.f();
                    if (zI5 || objF4 == c0132QnHx) {
                        objF4 = new c92(ri2VarE, j81Var2);
                        g30Var2.B(objF4);
                    }
                    g30Var2.G();
                    int i4 = (i2 & 112) | 6;
                    f92.d(hx0Var, l82Var3, x45Var2, (j81) objF4, this.z, g30Var2, i4 | ((i2 << 6) & 57344));
                    f92.b(wvVar2, i82Var, g30Var2, i & 14);
                    hH.i(gm4.g(qnHx, 8), g30Var2, 6);
                    l82 l82Var4 = this.w;
                    g30Var2.e(511388516);
                    boolean zI6 = g30Var2.I(j81Var2) | g30Var2.I(ri2VarE);
                    Object objF5 = g30Var2.f();
                    if (zI6 || objF5 == c0132QnHx) {
                        objF5 = new d92(ri2VarE, j81Var2);
                        g30Var2.B(objF5);
                    }
                    g30Var2.G();
                    f92.c(hx0Var, l82Var4, (h81) objF5, g30Var2, i4, 0);
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, l82 l82Var, j81<? super k82, sd5> j81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        pg2 pg2Var3;
        j30 j30VarQ = g30Var.q(-1369857625);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(l82Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            pg2Var3 = pg2Var2;
        } else {
            pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
            e40.CQf cQf = e40.a;
            bf bfVar = (bf) j30VarQ.E(p42.a);
            bfVar.getClass();
            j30VarQ.e(-1420833845);
            ri2<af> ri2Var = bfVar.a;
            af value = ri2Var.getValue();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(value);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = Boolean.valueOf(Float.compare(ri2Var.getValue().w, af.y.w) >= 0);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            boolean zBooleanValue = ((Boolean) objB0).booleanValue();
            j30VarQ.R(false);
            qu4.QnHx qnHx = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            a_.a(iZUl.b(qu4.QnHx.b, context, R.string.player_connect_by_address_tittle), pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, 981691863, new QnHx(l82Var, i3, zBooleanValue, j81Var)), j30VarQ, ((i3 << 3) & 112) | 1572864, 60);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var3, l82Var, j81Var, i, i2);
    }

    public static final void b(wv wvVar, i82 i82Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1824913815);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(i82Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            CO.b(wvVar, ur1.a(i82Var, i82.CQf.a), null, null, null, null, z00.c, j30VarQ, (i2 & 14) | 1572864, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new u82(wvVar, i82Var, i);
    }

    public static final void c(pg2 pg2Var, l82 l82Var, h81 h81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        j30 j30VarQ = g30Var.q(83151426);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(l82Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(h81Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            pg2Var2 = pg2Var;
        } else {
            pg2Var2 = i4 != 0 ? pg2.QnHx.w : pg2Var;
            e40.CQf cQf = e40.a;
            boolean z = l82Var.e;
            qu4.QnHx qnHx = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            ti.b(h81Var, iZUl.b(qu4.QnHx.b, context, R.string.player_connect_by_address_button).toUpperCase(((XX) f53.a.a().get(0)).a), z, pg2Var2, j30VarQ, ((i3 >> 6) & 14) | ((i3 << 9) & 7168), 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new v82(pg2Var2, l82Var, h81Var, i, i2);
    }

    public static final void d(pg2 pg2Var, l82 l82Var, x45 x45Var, j81 j81Var, j81 j81Var2, g30 g30Var, int i) {
        int i2;
        boolean z;
        j30 j30Var;
        j30 j30VarQ = g30Var.q(-1482564243);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(l82Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x45Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(j81Var2) ? 16384 : 8192;
        }
        if ((46811 & i2) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            i82 i82Var = l82Var.c;
            if (ur1.a(i82Var, i82.F1.a)) {
                z = false;
            } else {
                if (!ur1.a(i82Var, i82.CQf.a) && !ur1.a(i82Var, i82.QnHx.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            pg2 pg2VarB = xnX3.b(pg2Var.y(gm4.a), x45Var, j30VarQ);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(j81Var2) | j30VarQ.I(x45Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new w82(x45Var, j81Var2);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarA = cw1.a(pg2VarB, (j81) objB0);
            boolean z2 = l82Var.d;
            j30VarQ.e(511388516);
            boolean zI2 = j30VarQ.I(j81Var2) | j30VarQ.I(x45Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new x82(x45Var, j81Var2);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            jw1 jw1Var = new jw1(null, (j81) objB1, 61);
            qw1 qw1Var = new qw1(2, 2, 1);
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(j81Var);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new y82(j81Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            j30Var = j30VarQ;
            iw2.a(x45Var, (j81) objB2, pg2VarA, z2, false, null, null, z00.d, null, null, z, null, qw1Var, jw1Var, true, 0, null, null, null, j30Var, ((i2 >> 6) & 14) | 12582912, 24576, 494448);
        }
        tk3 tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new z82(pg2Var, l82Var, x45Var, j81Var, j81Var2, i);
    }
}
