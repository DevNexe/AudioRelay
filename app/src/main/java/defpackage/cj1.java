package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj1 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ m80 A;
        public final /* synthetic */ float B;
        public final /* synthetic */ av C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ sy2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ One z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(sy2 sy2Var, String str, pg2 pg2Var, One one, m80 m80Var, float f, av avVar, int i, int i2) {
            super(2);
            this.w = sy2Var;
            this.x = str;
            this.y = pg2Var;
            this.z = one;
            this.A = m80Var;
            this.B = f;
            this.C = avVar;
            this.D = i;
            this.E = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            cj1.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1, this.E);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<o94, sd5> {
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(String str) {
            super(1);
            this.w = str;
        }

        @Override // defpackage.j81
        public final sd5 invoke(o94 o94Var) {
            o94 o94Var2 = o94Var;
            qv1<Object>[] qv1VarArr = l94.a;
            o94Var2.a(i94.a, Collections.singletonList(this.w));
            l94.a(o94Var2, 5);
            return sd5.a;
        }
    }

    public static final class QnHx implements rb2 {
        public static final QnHx a = new QnHx();

        /* JADX INFO: renamed from: cj1$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0066QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public static final C0066QnHx w = new C0066QnHx();

            public C0066QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
                return sd5.a;
            }
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            return vb2Var.K(g70.j(j), g70.i(j), ds0.w, C0066QnHx.w);
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

    public static final void a(sy2 sy2Var, String str, pg2 pg2Var, One one, m80 m80Var, float f, av avVar, g30 g30Var, int i, int i2) {
        j30 j30VarQ = g30Var.q(1142754848);
        int i3 = i2 & 4;
        pg2 pg2VarA = pg2.QnHx.w;
        pg2 pg2Var2 = i3 != 0 ? pg2VarA : pg2Var;
        One one2 = (i2 & 8) != 0 ? One.QnHx.e : one;
        m80 m80Var2 = (i2 & 16) != 0 ? m80.QnHx.a : m80Var;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        av avVar2 = (i2 & 64) != 0 ? null : avVar;
        j30VarQ.e(-816794123);
        if (str != null) {
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(str);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new F1(str);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2VarA = c94.a(pg2VarA, false, (j81) objB0);
        }
        j30VarQ.R(false);
        pg2 pg2VarY = ps0.Y(fp1.L(pg2Var2.y(pg2VarA)), sy2Var, one2, m80Var2, f2, avVar2, 2);
        QnHx qnHx = QnHx.a;
        j30VarQ.e(-1323940314);
        ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
        jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
        ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
        a30.e.getClass();
        yy1.QnHx qnHx2 = a30.QnHx.b;
        sz szVarJ = S12N.j(pg2VarY);
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
        hH.u(j30VarQ, qnHx, a30.QnHx.e);
        hH.u(j30VarQ, ij0Var, a30.QnHx.d);
        hH.u(j30VarQ, jy1Var, a30.QnHx.f);
        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2077995625);
        j30VarQ.R(false);
        j30VarQ.R(false);
        j30VarQ.R(true);
        j30VarQ.R(false);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(sy2Var, str, pg2Var2, one2, m80Var2, f2, avVar2, i, i2);
    }
}
