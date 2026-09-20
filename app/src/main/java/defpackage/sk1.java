package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 extends ni3 {

    public static final class CQf extends cx1 implements h81<xi1> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final xi1 invoke() {
            return new xi1();
        }
    }

    public static final class F1 extends cx1 implements h81<aq3> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final aq3 invoke() {
            return new aq3(sk1.this.e.g());
        }
    }

    public static final class QnHx extends cx1 implements h81<wp3> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final wp3 invoke() {
            sk1 sk1Var = sk1.this;
            return new wp3(sk1Var.e.c(), sk1Var.d.b());
        }
    }

    public sk1(Ld ld, W8 w8, py3 py3Var, kX kXVar, e63 e63Var) {
        super(ld, w8, py3Var, kXVar, e63Var);
    }

    @Override // defpackage.kg4
    public final Set<c73> a() {
        n60 n60VarD = this.c.d();
        Ld ld = this.a;
        tk5 tk5Var = new tk5(ld.getContext());
        pk5 pk5Var = new pk5(ld.getContext());
        e63 e63Var = this.e;
        ud2 ud2VarJ = e63Var.j();
        W8 w8 = this.b;
        return Th.u(new wk5(n60VarD, tk5Var, pk5Var, ud2VarJ, new pq2((h75) w8.j())), new x52(w8.m()), new ap2(ld.getContext(), e63Var.c(), w8.l()), new E97(ld.getContext(), new cCWu(w8.t(), new QnHx(), CQf.w, new F1()), new o23(ld.getContext())));
    }
}
