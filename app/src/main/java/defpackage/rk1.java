package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk1 extends mi3 {
    public final t12 c;

    public static final class QnHx extends cx1 implements h81<LHM> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final LHM invoke() {
            return new LHM();
        }
    }

    public rk1(jl1 jl1Var, dm1 dm1Var, pk1 pk1Var) {
        super(jl1Var, dm1Var, pk1Var);
        this.c = new t12();
    }

    @Override // defpackage.zv0
    public final ylWC a() {
        return new ylWC(this.a.getContext());
    }

    @Override // defpackage.kX
    public final LHM b() {
        return (LHM) this.c.a("LHM", QnHx.w);
    }

    @Override // defpackage.zv0
    public final bewe c() {
        W8 w8 = this.b;
        return new bewe(w8.m(), new d7G(w8.l(), w8.m()));
    }
}
