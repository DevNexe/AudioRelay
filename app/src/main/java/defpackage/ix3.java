package defpackage;

import android.content.Context;
import android.os.Build;
import com.azefsw.audioconnect.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ix3 {

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(j81<? super ev3, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(ev3.T23.a);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fv3 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(fv3 fv3Var, int i) {
            super(2);
            this.w = fv3Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ix3.e(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ bv3 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(bv3 bv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = bv3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ix3.l((bv3.QnHx) this.w, this.x, g30Var2, this.y & 112);
            }
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ke w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FJCM(ke keVar, j81<? super ev3, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = keVar;
            this.x = j81Var;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            j81<ev3, sd5> j81Var = this.x;
            x81<g30, Integer, sd5> x81Var = this.y;
            ix3.f(this.w, j81Var, x81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt6Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt6Fixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ix3.h(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ bv3 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(bv3 bv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = bv3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ix3.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt9Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<qf4> w;
        public final /* synthetic */ nj1<Map<of4, gl0>> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt9Fixed(kj1<qf4> kj1Var, nj1<Map<of4, gl0>> nj1Var, int i) {
            super(2);
            this.w = kj1Var;
            this.x = nj1Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ix3.j(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class MZ extends cx1 implements j81<ev3, sd5> {
        public final /* synthetic */ ly3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MZ(ly3 ly3Var) {
            super(1);
            this.w = ly3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ev3 ev3Var) {
            this.w.g(ev3Var);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ nj1<vz4.QnHx> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(nj1<vz4.QnHx> nj1Var, int i) {
            super(2);
            this.w = nj1Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ix3.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PRnFixed(j81<? super ev3, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(new ev3.Xn1(1));
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ bv3 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(bv3 bv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = bv3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ix3.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class RBi extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ly3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RBi(ly3 ly3Var) {
            super(2);
            this.w = ly3Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                if (Build.VERSION.SDK_INT < 31) {
                    throw new IllegalStateException("The BLUETOOTH_CONNECT permission is only necessary on Android S+".toString());
                }
                pg2 pg2VarV = ps0.V(pg2.QnHx.w, 16, 0.0f, 2);
                g30Var2.e(1157296644);
                ly3 ly3Var = this.w;
                boolean zI = g30Var2.I(ly3Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new zx3(ly3Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                FWT.l(6, 0, g30Var2, pg2VarV, (j81) objF);
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fv3 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(fv3 fv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = fv3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ix3.d(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class Xn1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fv3 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ j81<ev3, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Xn1(fv3 fv3Var, x81<? super g30, ? super Integer, sd5> x81Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = fv3Var;
            this.x = x81Var;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            x81<g30, Integer, sd5> x81Var = this.x;
            j81<ev3, sd5> j81Var = this.y;
            ix3.i(this.w, x81Var, j81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<ev3, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ re2 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ bv3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(re2 re2Var, boolean z, boolean z2, bv3 bv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = re2Var;
            this.x = z;
            this.y = z2;
            this.z = bv3Var;
            this.A = j81Var;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ix3.c(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fv3 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(fv3 fv3Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = fv3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                fv3 fv3Var = this.w;
                if (fv3Var.q) {
                    ix3.n(null, fv3Var.l, this.x, g30Var2, (this.y << 3) & 896, 1);
                }
            }
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ fv3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(fv3 fv3Var) {
            super(3);
            this.w = fv3Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(693286680);
                pg2.QnHx qnHx = pg2.QnHx.w;
                CZ9P.byN byn = CZ9P.a;
                da.CQf cQf2 = One.QnHx.j;
                rb2 rb2VarA = uu3.a(byn, cQf2, g30Var2);
                g30Var2.e(-1323940314);
                jt4 jt4Var = r40.e;
                ij0 ij0Var = (ij0) g30Var2.E(jt4Var);
                jt4 jt4Var2 = r40.k;
                jy1 jy1Var = (jy1) g30Var2.E(jt4Var2);
                jt4 jt4Var3 = r40.o;
                ti5 ti5Var = (ti5) g30Var2.E(jt4Var3);
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
                a30.QnHx.F1 f1 = a30.QnHx.e;
                hH.u(g30Var2, rb2VarA, f1);
                a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
                hH.u(g30Var2, ij0Var, c0012QnHx);
                a30.QnHx.CQf cQf3 = a30.QnHx.f;
                hH.u(g30Var2, jy1Var, cQf3);
                a30.QnHx.NUlFixed nUl = a30.QnHx.g;
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, nUl, g30Var2), g30Var2, 2058660585, -678309503);
                xu3 xu3Var = xu3.a;
                fv3 fv3Var = this.w;
                kc4 kc4Var = fv3Var.i;
                g30Var2.e(542494955);
                if (kc4Var != null) {
                    ix3.q(fv3Var.i, g30Var2, 0);
                    sd5 sd5Var = sd5.a;
                }
                g30Var2.G();
                pq4.e(xu3Var, g30Var2, 6);
                float f = 16;
                pq4.a(f, g30Var2, 6);
                pg2 pg2VarB = xu3Var.b(qnHx, cQf2);
                g30Var2.e(733328855);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var2 = (jy1) g30Var2.E(jt4Var2);
                ti5 ti5Var2 = (ti5) g30Var2.E(jt4Var3);
                sz szVarJ2 = S12N.j(pg2VarB);
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
                qc0.c(0, szVarJ2, Xs.b(g30Var2, g30Var2, rb2VarC, f1, g30Var2, ij0Var2, c0012QnHx, g30Var2, jy1Var2, cQf3, g30Var2, ti5Var2, nUl, g30Var2), g30Var2, 2058660585, -2137368960);
                g30Var2.e(-915591608);
                wb4 wb4Var = fv3Var.f;
                if (wb4Var != null) {
                    ix3.s(wb4Var, fv3Var.c, g30Var2, 0);
                    sd5 sd5Var2 = sd5.a;
                }
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                hH.i(gm4.g(qnHx, f), g30Var2, 6);
                ix3.o(fv3Var.h, g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class ta extends cx1 implements y81<Boolean, g30, Integer, sd5> {
        public final /* synthetic */ kj1<qf4> w;
        public final /* synthetic */ nj1<Map<of4, gl0>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ta(kj1<qf4> kj1Var, nj1<Map<of4, gl0>> nj1Var) {
            super(3);
            this.w = kj1Var;
            this.x = nj1Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(Boolean bool, g30 g30Var, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.c(zBooleanValue) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                pg2.QnHx qnHx = pg2.QnHx.w;
                if (zBooleanValue) {
                    g30Var2.e(1116022012);
                    a_.b(ps0.V(qnHx, 16, 0.0f, 2), 0L, 0.0f, null, 0.0f, x10.c, g30Var2, 196614, 30);
                    g30Var2.G();
                } else {
                    g30Var2.e(1116022318);
                    g30Var2.e(-483455358);
                    rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
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
                    qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
                    int i = 0;
                    for (qf4 qf4Var : this.w) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ps0.j0();
                            throw null;
                        }
                        qf4 qf4Var2 = qf4Var;
                        g30Var2.e(-564440898);
                        if (i > 0) {
                            pq4.c(8, g30Var2, 6);
                        }
                        g30Var2.G();
                        ix3.r(qf4Var2, this.x.a.get(qf4Var2.a), g30Var2, 0);
                        i = i2;
                    }
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                }
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final class y extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i, j81 j81Var) {
            super(2);
            this.w = j81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ix3.g(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(bv3 bv3Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-244968630);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(bv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            if (!(bv3Var instanceof bv3.QnHx)) {
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(bv3Var, j81Var, i);
                return;
            }
            if (((bv3.QnHx) bv3Var).a) {
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new CQf(j81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                vQgK.a((h81) objB0, null, X.m(j30VarQ, -1419844287, new F1(bv3Var, j81Var, i2)), j30VarQ, 384, 2);
            }
        }
        tk3 tk3VarU2 = j30VarQ.U();
        if (tk3VarU2 == null) {
            return;
        }
        tk3VarU2.d = new LPt8Fixed(bv3Var, j81Var, i);
    }

    public static final void b(nj1<vz4.QnHx> nj1Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(2061315653);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(nj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            uy4 uy4Var = nj1Var.a.a;
            if (!(uy4Var instanceof hf4)) {
                throw new IllegalStateException(("Unknown error " + uy4Var).toString());
            }
            vb.a(uy4Var.getId(), hH.y(R.string.client_listener_title_error, new Object[]{Integer.valueOf(((hf4) uy4Var).a())}, j30VarQ), hH.x(R.string.client_listener_description_error, j30VarQ), ps0.V(pg2.QnHx.w, 16, 0.0f, 2), null, j30VarQ, 3072, 16);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(nj1Var, i);
    }

    public static final void c(re2 re2Var, boolean z, boolean z2, bv3 bv3Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-376081220);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(re2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(bv3Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 16384 : 8192;
        }
        if ((46811 & i2) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1655403181);
            if (z2) {
                int i3 = i2 >> 9;
                a(bv3Var, j81Var, j30VarQ, (i3 & 112) | (i3 & 14));
            }
            j30VarQ.R(false);
            if (re2Var != null && z) {
                hf2.d(re2Var.a, j81Var, j30VarQ, (i2 >> 9) & 112);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(re2Var, z, z2, bv3Var, j81Var, i);
    }

    public static final void d(fv3 fv3Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1783378424);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(fv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(733328855);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            le leVar = le.a;
            e(fv3Var, j30VarQ, i2 & 14);
            f(leVar, j81Var, X.m(j30VarQ, 1673437905, new auxFixed(fv3Var, j81Var, i2)), j30VarQ, (i2 & 112) | 390);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(fv3Var, j81Var, i);
    }

    public static final void e(fv3 fv3Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1342082203);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(fv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(ps0.V(pg2.QnHx.w, 16, 0.0f, 2), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1229940854, new byN(fv3Var)), j30VarQ, 196614, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new EQ(fv3Var, i);
    }

    public static final void f(ke keVar, j81<? super ev3, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1309356294);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(keVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            pg2 pg2VarT = hH.t(ps0.X(keVar.b(pg2.QnHx.w, One.QnHx.i), 0.0f, 0.0f, f + 32, 0.0f, 11), 0.0f, gc1.a / 2, 1);
            j30VarQ.e(693286680);
            rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarT);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -678309503);
            x81Var.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
            pq4.a(f, j30VarQ, 6);
            k(i3 & 112, 1, j30VarQ, null, j81Var);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new FJCM(keVar, j81Var, x81Var, i);
    }

    public static final void g(j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1728458091);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2 pg2VarV = ps0.V(pg2.QnHx.w, 16, 0.0f, 2);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new PRnFixed(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            a_.b(hr.c(pg2VarV, false, (h81) objB0, 7), 0L, 0.0f, null, 0.0f, x10.d, j30VarQ, 196608, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new y(i, j81Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-1986835447);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1409607987);
            Context context = (Context) j30VarQ.E(Ll.b);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            jy3 jy3Var = jy3.w;
            ky3 ky3Var = new ky3(context, sn4Var, bm2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(jy3Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(ky3Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(ly3.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            ly3 ly3Var = (ly3) ((ZUx) obj);
            j30VarQ.R(false);
            fv3 fv3Var = (fv3) ps0.t(ly3Var.f(), j30VarQ).getValue();
            sz szVarM = X.m(j30VarQ, 86109807, new RBi(ly3Var));
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(ly3Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new MZ(ly3Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            i(fv3Var, szVarM, (j81) objB1, j30VarQ, 48);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt6Fixed(i);
    }

    public static final void i(fv3 fv3Var, x81<? super g30, ? super Integer, sd5> x81Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        kj1<qf4> kj1Var;
        boolean z;
        int i3;
        j30 j30VarQ = g30Var.q(-1179083057);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(fv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            int i4 = (i2 << 6) & 57344;
            c(fv3Var.a, fv3Var.m, fv3Var.q, fv3Var.l, j81Var, j30VarQ, i4);
            pg2 pg2VarX = ob.x(pg2.QnHx.w, ob.w(0, j30VarQ, 1));
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarX);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            float f = 16;
            pq4.c(f, j30VarQ, 6);
            j30VarQ.e(1553465714);
            kc4 kc4Var = fv3Var.i;
            wb4 wb4Var = fv3Var.f;
            if (kc4Var != null && wb4Var != null) {
                d(fv3Var, j81Var, j30VarQ, (i2 & 14) | ((i2 >> 3) & 112));
                pq4.c(f, j30VarQ, 6);
            }
            j30VarQ.R(false);
            j30VarQ.e(1553465958);
            if (wb4Var == wb4.Microphone) {
                if (ur1.a(fv3Var.l, bv3.F1.a)) {
                    pq4.b(16, j30VarQ, 6);
                    x81Var.invoke(j30VarQ, Integer.valueOf((i2 >> 3) & 14));
                }
            }
            j30VarQ.R(false);
            nj1<vz4.QnHx> nj1Var = fv3Var.g;
            if (nj1Var != null) {
                j30VarQ.e(1553466274);
                pq4.b(16, j30VarQ, 6);
                b(nj1Var, j30VarQ, 0);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(1553466383);
                nj1<Map<of4, gl0>> nj1Var2 = fv3Var.k;
                if (nj1Var2 != null && (kj1Var = fv3Var.j) != null) {
                    j(kj1Var, nj1Var2, j30VarQ, 0);
                    Boolean bool = fv3Var.p;
                    if (!(bool != null ? bool.booleanValue() : false)) {
                        pq4.c(f, j30VarQ, 6);
                        g(j81Var, j30VarQ, (i2 >> 6) & 14);
                    }
                }
                j30VarQ.R(false);
            }
            pq4.c(32, j30VarQ, 6);
            j30VarQ.e(1553466910);
            if (ur1.a(fv3Var.r, Boolean.TRUE)) {
                i3 = 6;
                z = false;
                hf2.f(fv3Var.a, fv3Var.n, fv3Var.o, fv3Var.b, j81Var, j30VarQ, i4);
            } else {
                z = false;
                i3 = 6;
            }
            j30VarQ.R(z);
            pq4.c(f, j30VarQ, i3);
            j30VarQ.R(z);
            j30VarQ.R(z);
            j30VarQ.R(true);
            j30VarQ.R(z);
            j30VarQ.R(z);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new Xn1(fv3Var, x81Var, j81Var, i);
    }

    public static final void j(kj1<qf4> kj1Var, nj1<Map<of4, gl0>> nj1Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1424118911);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(nj1Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 16;
            pg2 pg2VarV = ps0.V(qnHx, 0.0f, f, 1);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarV);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            Uff4.a(R.string.server_connections_title, ps0.V(qnHx, f, 0.0f, 2), j30VarQ, 48, 0);
            pq4.c(f, j30VarQ, 6);
            pc0.b(Boolean.valueOf(kj1Var.isEmpty()), null, null, X.m(j30VarQ, 1187888279, new ta(kj1Var, nj1Var)), j30VarQ, 3072, 6);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt9Fixed(kj1Var, nj1Var, i);
    }

    public static final void k(int i, int i2, g30 g30Var, pg2 pg2Var, j81 j81Var) {
        pg2 pg2Var2;
        int i3;
        j30 j30VarQ = g30Var.q(-1840865583);
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
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            pg2 pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
            e40.CQf cQf = e40.a;
            long jK = ((rv) j30VarQ.E(sv.a)).k();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new hy3(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2Var2 = pg2Var3;
            gc1.a((h81) objB0, pg2Var2, null, null, jK, 0L, null, x10.b, j30VarQ, ((i3 << 3) & 112) | 12582912, 108);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new iy3(i, i2, pg2Var2, j81Var);
    }

    public static final void l(bv3.QnHx qnHx, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1120563420);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(qnHx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            ix4.a(null, null, 0L, 0L, null, 0.0f, X.m(j30VarQ, -1188163296, new mx3(qnHx, j81Var, i2)), j30VarQ, 1572864, 63);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new nx3(qnHx, j81Var, i);
    }

    public static final void m(boolean z, ej1 ej1Var, String str, h81 h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(445062881);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(ej1Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            hx0 hx0Var = gm4.a;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(h81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new ox3(h81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            float f = 16;
            pg2 pg2VarU = ps0.U(hr.c(hx0Var, false, (h81) objB0, 7), f, 8);
            da.CQf cQf2 = One.QnHx.k;
            j30VarQ.e(693286680);
            rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarU);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 0);
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            q70.a(X.m(j30VarQ, -871824504, new px3(ej1Var, i2)), j30VarQ, 6);
            pq4.a(f, j30VarQ, 6);
            int i3 = i2 >> 6;
            j55.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, i3 & 14, 0, 32766);
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
            }
            wo1.QnHx qnHx2 = wo1.a;
            hH.i(new mz1(1.0f, true), j30VarQ, 0);
            uh3.a(z, h81Var, null, false, null, null, j30VarQ, (i2 & 14) | (i3 & 112), 60);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new qx3(z, ej1Var, str, h81Var, i);
    }

    public static final void n(pg2 pg2Var, bv3 bv3Var, j81 j81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        pg2 pg2Var3;
        ej1 ej1VarE;
        j30 j30VarQ = g30Var.q(1847865259);
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
            i3 |= j30VarQ.I(bv3Var) ? 32 : 16;
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
            if (!(bv3Var instanceof bv3.QnHx)) {
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new rx3(pg2Var3, bv3Var, j81Var, i, i2);
                return;
            }
            bv3.QnHx qnHx = (bv3.QnHx) bv3Var;
            if (qnHx.b) {
                ej1VarE = ob.w;
                if (ej1VarE == null) {
                    ej1.QnHx qnHx2 = new ej1.QnHx("Outlined.BluetoothConnected");
                    int i5 = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(7.0f, 12.0f);
                    le3Var.h(-2.0f, -2.0f);
                    le3Var.h(-2.0f, 2.0f);
                    le3Var.h(2.0f, 2.0f);
                    le3Var.h(2.0f, -2.0f);
                    le3Var.b();
                    le3Var.i(17.71f, 7.71f);
                    le3Var.g(12.0f, 2.0f);
                    le3Var.f(-1.0f);
                    le3Var.n(7.59f);
                    le3Var.g(6.41f, 5.0f);
                    le3Var.g(5.0f, 6.41f);
                    le3Var.g(10.59f, 12.0f);
                    le3Var.g(5.0f, 17.59f);
                    le3Var.g(6.41f, 19.0f);
                    le3Var.g(11.0f, 14.41f);
                    le3Var.g(11.0f, 22.0f);
                    le3Var.f(1.0f);
                    le3Var.h(5.71f, -5.71f);
                    le3Var.h(-4.3f, -4.29f);
                    le3Var.h(4.3f, -4.29f);
                    le3Var.b();
                    le3Var.i(13.0f, 5.83f);
                    le3Var.h(1.88f, 1.88f);
                    le3Var.g(13.0f, 9.59f);
                    le3Var.g(13.0f, 5.83f);
                    le3Var.b();
                    le3Var.i(14.88f, 16.29f);
                    le3Var.g(13.0f, 18.17f);
                    le3Var.n(-3.76f);
                    le3Var.h(1.88f, 1.88f);
                    le3Var.b();
                    le3Var.i(19.0f, 10.0f);
                    le3Var.h(-2.0f, 2.0f);
                    le3Var.h(2.0f, 2.0f);
                    le3Var.h(2.0f, -2.0f);
                    le3Var.h(-2.0f, -2.0f);
                    le3Var.b();
                    qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarE = qnHx2.d();
                    ob.w = ej1VarE;
                }
            } else if (qnHx.c) {
                ej1VarE = ac.a;
                if (ej1VarE == null) {
                    ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.BluetoothSearching");
                    int i6 = sg5.a;
                    jq4 jq4Var2 = new jq4(yu.b);
                    le3 le3Var2 = new le3();
                    le3Var2.i(14.24f, 12.01f);
                    le3Var2.h(2.32f, 2.32f);
                    le3Var2.d(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
                    le3Var2.k(-0.16f, -1.59f, -0.43f, -2.31f);
                    le3Var2.h(-2.33f, 2.32f);
                    le3Var2.b();
                    le3Var2.i(19.53f, 6.71f);
                    le3Var2.h(-1.26f, 1.26f);
                    le3Var2.d(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
                    le3Var2.k(-0.36f, 2.82f, -0.98f, 4.02f);
                    le3Var2.h(1.2f, 1.2f);
                    le3Var2.d(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
                    le3Var2.d(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
                    le3Var2.b();
                    le3Var2.i(15.71f, 7.71f);
                    le3Var2.g(10.0f, 2.0f);
                    le3Var2.g(9.0f, 2.0f);
                    le3Var2.n(7.59f);
                    le3Var2.g(4.41f, 5.0f);
                    le3Var2.g(3.0f, 6.41f);
                    le3Var2.g(8.59f, 12.0f);
                    le3Var2.g(3.0f, 17.59f);
                    le3Var2.g(4.41f, 19.0f);
                    le3Var2.g(9.0f, 14.41f);
                    le3Var2.g(9.0f, 22.0f);
                    le3Var2.f(1.0f);
                    le3Var2.h(5.71f, -5.71f);
                    le3Var2.h(-4.3f, -4.29f);
                    le3Var2.h(4.3f, -4.29f);
                    le3Var2.b();
                    le3Var2.i(11.0f, 5.83f);
                    le3Var2.h(1.88f, 1.88f);
                    le3Var2.g(11.0f, 9.59f);
                    le3Var2.g(11.0f, 5.83f);
                    le3Var2.b();
                    le3Var2.i(12.88f, 16.29f);
                    le3Var2.g(11.0f, 18.17f);
                    le3Var2.n(-3.76f);
                    le3Var2.h(1.88f, 1.88f);
                    le3Var2.b();
                    qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var2.a);
                    ej1VarE = qnHx3.d();
                    ac.a = ej1VarE;
                }
            } else {
                ej1VarE = qe0.e();
            }
            long jK = ((rv) j30VarQ.E(sv.a)).k();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new sx3(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            gc1.a((h81) objB0, pg2Var3, null, null, jK, 0L, null, X.m(j30VarQ, -430796623, new ux3(ej1VarE)), j30VarQ, ((i3 << 3) & 112) | 12582912, 108);
        }
        tk3 tk3VarU2 = j30VarQ.U();
        if (tk3VarU2 == null) {
            return;
        }
        tk3VarU2.d = new vx3(pg2Var3, bv3Var, j81Var, i, i2);
    }

    public static final void o(cv3 cv3Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1812732684);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(cv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1518626539);
            boolean z = cv3Var instanceof cv3.QnHx;
            String strX = z ? hH.x(R.string.server_capture_latency, j30VarQ) : "";
            j30VarQ.R(false);
            j30VarQ.e(-1518626351);
            String strY = z ? hH.y(R.string.running_stats_milliseconds, new Object[]{Long.valueOf(((cv3.QnHx) cv3Var).a)}, j30VarQ) : "";
            j30VarQ.R(false);
            q70.a(X.m(j30VarQ, -325577527, new wx3(strX)), j30VarQ, 6);
            float f = 4;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(0.0f, f, 0.0f, f, 5), j30VarQ, 6);
            j55.b(strY, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new xx3(cv3Var, i);
    }

    public static final void p(ej1 ej1Var, int i, g30 g30Var, int i2) {
        int i3;
        j30 j30Var;
        j30 j30VarQ = g30Var.q(1959485697);
        if ((i2 & 14) == 0) {
            i3 = (j30VarQ.I(ej1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= j30VarQ.i(i) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(693286680);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -678309503);
            da.CQf cQf2 = One.QnHx.k;
            wo1.QnHx qnHx3 = wo1.a;
            rh1.a(ej1Var, null, new th5(cQf2), 0L, j30VarQ, (i3 & 14) | 48, 8);
            pq4.a(16, j30VarQ, 6);
            j30Var = j30VarQ;
            j55.b(hH.x(i, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30Var.E(sc5.a)).j, j30Var, 0, 0, 32766);
            O.g(j30Var, false, false, true, false);
            j30Var.R(false);
        }
        tk3 tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new yx3(ej1Var, i, i2);
    }

    public static final void q(kc4 kc4Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-430617631);
        if ((((i & 14) == 0 ? (j30VarQ.I(kc4Var) ? 4 : 2) | i : i) & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            j55.b(kc4Var.a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, XTd3.d(((rc5) j30VarQ.E(sc5.a)).g), j30VarQ, 0, 0, 32766);
            pq4.c(4, j30VarQ, 6);
            kj1<String> kj1Var = kc4Var.b;
            int i2 = 0;
            for (int size = kj1Var.size(); i2 < size; size = size) {
                j55.b(kj1Var.get(i2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                i2++;
                kj1Var = kj1Var;
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            e40.CQf cQf2 = e40.a;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ay3(kc4Var, i);
    }

    public static final void r(qf4 qf4Var, gl0 gl0Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1301998552);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(qf4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(gl0Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(ps0.V(pg2.QnHx.w, 16, 0.0f, 2), 0L, 0, null, 0.0f, X.m(j30VarQ, 753528025, new cy3(gl0Var, qf4Var)), j30VarQ, 196998, 26);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new dy3(qf4Var, gl0Var, i);
    }

    public static final void s(wb4 wb4Var, String str, g30 g30Var, int i) {
        int i2;
        ej1 ej1VarG;
        j30 j30VarQ = g30Var.q(-2133637713);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wb4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            int iOrdinal = wb4Var.ordinal();
            if (iOrdinal == 0) {
                ej1VarG = qLd.g();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ej1VarG = S12N.x;
                if (ej1VarG == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.CastConnected");
                    int i3 = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(1.0f, 18.0f);
                    le3Var.n(3.0f);
                    le3Var.f(3.0f);
                    le3Var.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                    le3Var.b();
                    le3Var.i(1.0f, 14.0f);
                    le3Var.n(2.0f);
                    le3Var.d(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
                    le3Var.f(2.0f);
                    le3Var.d(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
                    le3Var.b();
                    le3Var.i(1.0f, 10.0f);
                    le3Var.n(2.0f);
                    le3Var.d(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
                    le3Var.f(2.0f);
                    le3Var.d(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
                    le3Var.b();
                    le3Var.i(21.0f, 3.0f);
                    le3Var.g(3.0f, 3.0f);
                    le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    le3Var.n(3.0f);
                    le3Var.f(2.0f);
                    le3Var.g(3.0f, 5.0f);
                    le3Var.f(18.0f);
                    le3Var.n(14.0f);
                    le3Var.f(-7.0f);
                    le3Var.n(2.0f);
                    le3Var.f(7.0f);
                    le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    le3Var.g(23.0f, 5.0f);
                    le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    le3Var.b();
                    le3Var.i(5.0f, 7.0f);
                    le3Var.n(2.0f);
                    le3Var.f(12.0f);
                    le3Var.n(6.0f);
                    le3Var.f(-3.0f);
                    le3Var.n(2.0f);
                    le3Var.f(5.0f);
                    le3Var.g(19.0f, 7.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarG = qnHx.d();
                    S12N.x = ej1VarG;
                }
            }
            CO.c(str.length() > 0, null, us0.b(null, 3), null, null, X.m(j30VarQ, 515381383, new fy3(ej1VarG, str, i2)), j30VarQ, 196992, 26);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new gy3(wb4Var, str, i);
    }
}
