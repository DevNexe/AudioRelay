package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends yi3 {
    public final t12 c;

    public static final class CQf extends cx1 implements h81<r14> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final r14 invoke() {
            return new r14();
        }
    }

    public static final class QnHx extends cx1 implements h81<B1Vy> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final B1Vy invoke() {
            sl1 sl1Var = sl1.this;
            return new B1Vy(sl1Var.a, sl1Var.b);
        }
    }

    public sl1(tx0 tx0Var, kp kpVar) {
        super(tx0Var, kpVar);
        this.c = new t12();
    }

    @Override // defpackage.n8
    public final B1Vy a() {
        return (B1Vy) this.c.a("B1Vy", new QnHx());
    }

    public final r14 b() {
        return (r14) this.c.a("r14", CQf.w);
    }
}
