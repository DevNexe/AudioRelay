package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yv4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ x81<bw4, g70, sb2> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = x81Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            yv4.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ aw4 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(aw4 aw4Var) {
            super(0);
            this.w = aw4Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            gz1 gz1VarA = this.w.a();
            Iterator it = gz1VarA.e.entrySet().iterator();
            while (it.hasNext()) {
                ((gz1.QnHx) ((Map.Entry) it.next()).getValue()).d = true;
            }
            yy1 yy1Var = gz1VarA.a;
            if (!yy1Var.m0) {
                yy1Var.P(false);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ is4<aw4> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ri2 ri2Var) {
            super(1);
            this.w = ri2Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new zv4(this.w);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ aw4 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ x81<bw4, g70, sb2> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(aw4 aw4Var, pg2 pg2Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var, int i, int i2) {
            super(2);
            this.w = aw4Var;
            this.x = pg2Var;
            this.y = x81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yv4.b(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<yy1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx() {
            super(0);
            yy1.F1 f1 = yy1.p0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yy1] */
        @Override // defpackage.h81
        public final yy1 invoke() {
            return yy1.q0.invoke();
        }
    }

    public static final void a(pg2 pg2Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-1298353104);
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
            i3 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                objB0 = new aw4();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            int i5 = i3 << 3;
            b((aw4) objB0, pg2Var, x81Var, j30VarQ, (i5 & 112) | 8 | (i5 & 896), 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, x81Var, i, i2);
    }

    public static final void b(aw4 aw4Var, pg2 pg2Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var, g30 g30Var, int i, int i2) {
        j30 j30VarQ = g30Var.q(-511989831);
        if ((i2 & 2) != 0) {
            pg2Var = pg2.QnHx.w;
        }
        pg2 pg2Var2 = pg2Var;
        l40 l40VarR0 = fp1.r0(j30VarQ);
        pg2 pg2VarC = f30.c(j30VarQ, pg2Var2);
        ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
        jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
        ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
        yy1.F1 f1 = yy1.p0;
        j30VarQ.e(1886828752);
        if (!(j30VarQ.a instanceof jE)) {
            fp1.c0();
            throw null;
        }
        j30VarQ.v0();
        if (j30VarQ.K) {
            j30VarQ.l(new QnHx());
        } else {
            j30VarQ.A();
        }
        hH.u(j30VarQ, aw4Var, aw4Var.c);
        hH.u(j30VarQ, l40VarR0, aw4Var.d);
        a30.e.getClass();
        hH.u(j30VarQ, pg2VarC, a30.QnHx.c);
        hH.u(j30VarQ, x81Var, aw4Var.e);
        hH.u(j30VarQ, ij0Var, a30.QnHx.d);
        hH.u(j30VarQ, jy1Var, a30.QnHx.f);
        hH.u(j30VarQ, ti5Var, a30.QnHx.g);
        j30VarQ.R(true);
        j30VarQ.R(false);
        j30VarQ.e(-607848778);
        if (!j30VarQ.t()) {
            wq0.h(new F1(aw4Var), j30VarQ);
        }
        j30VarQ.R(false);
        ri2 ri2VarF0 = ps0.f0(aw4Var, j30VarQ);
        sd5 sd5Var = sd5.a;
        j30VarQ.e(1157296644);
        boolean zI = j30VarQ.I(ri2VarF0);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            objB0 = new LPt8Fixed(ri2VarF0);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        wq0.a(sd5Var, (j81) objB0, j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(aw4Var, pg2Var2, x81Var, i, i2);
    }
}
