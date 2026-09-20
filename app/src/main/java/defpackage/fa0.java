package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 {
    public static final uy2<List<Z7jl.CQf<e43>>, List<Z7jl.CQf<y81<String, g30, Integer, sd5>>>> a;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Z7jl w;
        public final /* synthetic */ List<Z7jl.CQf<y81<String, g30, Integer, sd5>>> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(Z7jl z7jl, List<Z7jl.CQf<y81<String, g30, Integer, sd5>>> list, int i) {
            super(2);
            this.w = z7jl;
            this.x = list;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            fa0.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx implements rb2 {
        public static final QnHx a = new QnHx();

        /* JADX INFO: renamed from: fa0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0127QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public final /* synthetic */ List<b43> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0127QnHx(ArrayList arrayList) {
                super(1);
                this.w = arrayList;
            }

            @Override // defpackage.j81
            public final sd5 invoke(b43.QnHx qnHx) {
                b43.QnHx qnHx2 = qnHx;
                List<b43> list = this.w;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    b43.QnHx.f(qnHx2, list.get(i), 0, 0);
                }
                return sd5.a;
            }
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).y(j));
            }
            return vb2Var.K(g70.h(j), g70.g(j), ds0.w, new C0127QnHx(arrayList));
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

    static {
        cs0 cs0Var = cs0.w;
        a = new uy2<>(cs0Var, cs0Var);
    }

    public static final void a(Z7jl z7jl, List<Z7jl.CQf<y81<String, g30, Integer, sd5>>> list, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-110905764);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z7jl.CQf<y81<String, g30, Integer, sd5>> cQf = list.get(i2);
            y81<String, g30, Integer, sd5> y81Var = cQf.a;
            QnHx qnHx = QnHx.a;
            j30VarQ.e(-1323940314);
            pg2.QnHx qnHx2 = pg2.QnHx.w;
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx3 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx2);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx3);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, qnHx, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            hH.u(j30VarQ, ti5Var, a30.QnHx.g);
            j30VarQ.h();
            szVarJ.invoke(new mm4(j30VarQ), j30VarQ, 0);
            j30VarQ.e(2058660585);
            j30VarQ.e(-72427749);
            y81Var.invoke(z7jl.subSequence(cQf.b, cQf.c).w, j30VarQ, 0);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z7jl, list, i);
    }

    public static final c25 b(c25 c25Var, Z7jl z7jl, w55 w55Var, ij0 ij0Var, e41.QnHx qnHx, boolean z, int i, int i2, List<Z7jl.CQf<e43>> list) {
        if (ur1.a(c25Var.a, z7jl) && ur1.a(c25Var.b, w55Var) && c25Var.d == z) {
            if (c25Var.e == i) {
                if (c25Var.c == i2 && ur1.a(c25Var.f, ij0Var)) {
                    if (ur1.a(c25Var.h, list) && c25Var.g == qnHx) {
                        return c25Var;
                    }
                }
            }
        }
        return new c25(z7jl, w55Var, i2, z, i, ij0Var, qnHx, list);
    }
}
