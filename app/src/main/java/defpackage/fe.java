package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fe {
    public static final he a = new he(One.QnHx.a, false);
    public static final CQf b = CQf.a;

    public static final class CQf implements rb2 {
        public static final CQf a = new CQf();

        public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public static final QnHx w = new QnHx();

            public QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
                return sd5.a;
            }
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            return vb2Var.K(g70.j(j), g70.i(j), ds0.w, QnHx.w);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
            return qb2.c(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
            return qb2.d(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int d(yy1.byN byn, List list, int i) {
            return qb2.b(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
            return qb2.a(this, byn, list, i);
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, int i) {
            super(2);
            this.w = pg2Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            fe.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-211209833);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2Var);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
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
            hH.u(j30VarQ, b, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i3 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(1021196736);
            if (((i3 >> 9) & 14 & 11) == 2 && j30VarQ.t()) {
                j30VarQ.x();
            }
            O.g(j30VarQ, false, false, true, false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var, i);
    }

    public static final void b(b43.QnHx qnHx, b43 b43Var, ob2 ob2Var, jy1 jy1Var, int i, int i2, One one) {
        One one2;
        Object objB = ob2Var.B();
        ee eeVar = objB instanceof ee ? (ee) objB : null;
        long jA = ((eeVar == null || (one2 = eeVar.x) == null) ? one : one2).a(C0239D.e(b43Var.w, b43Var.x), C0239D.e(i, i2), jy1Var);
        b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
        qnHx.getClass();
        b43.QnHx.d(b43Var, jA, 0.0f);
    }

    public static final rb2 c(One one, boolean z, g30 g30Var) {
        rb2 rb2Var;
        g30Var.e(56522820);
        if (!ur1.a(one, One.QnHx.a) || z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            g30Var.e(511388516);
            boolean zI = g30Var.I(boolValueOf) | g30Var.I(one);
            Object objF = g30Var.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new he(one, z);
                g30Var.B(objF);
            }
            g30Var.G();
            rb2Var = (rb2) objF;
        } else {
            rb2Var = a;
        }
        g30Var.G();
        return rb2Var;
    }
}
