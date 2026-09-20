package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends dj3 {

    public static final class CQf extends cx1 implements j81<kw1, C> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final C invoke(kw1 kw1Var) {
            return new C(kw1Var);
        }
    }

    public static final class F1 extends cx1 implements h81<OMz> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final OMz invoke() {
            ul1 ul1Var = ul1.this;
            qc4 qc4VarP = ul1Var.a.a.p();
            cj3 cj3Var = ul1Var.a;
            return new OMz(new ae4(qc4VarP, cj3Var.a.i()), cj3Var.d.a());
        }
    }

    public static final class QnHx extends cx1 implements h81<C1444h2> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final C1444h2 invoke() {
            ul1 ul1Var = ul1.this;
            u7.QnHx qnHxA = ul1Var.a.d.a();
            cj3 cj3Var = ul1Var.a;
            ta2 ta2VarA = cj3Var.b.a();
            lj4 lj4Var = cj3Var.a;
            return new C1444h2(qnHxA, new t82(new F7(new X1GO(ta2VarA, lj4Var.r())), lj4Var.i()));
        }
    }

    public ul1(tl1 tl1Var) {
        super(tl1Var);
    }

    @Override // defpackage.fz
    public final xi5 a() {
        return new xi5(new QnHx(), CQf.w, new F1());
    }
}
