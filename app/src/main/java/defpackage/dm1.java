package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dm1 extends qj3 {
    public final t12 d;

    public static final class CQf extends cx1 implements h81<md3> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final md3 invoke() {
            dm1 dm1Var = dm1.this;
            return new md3(new uc3(dm1Var.d(), dm1Var.b.e()), dm1Var.c.a());
        }
    }

    public static final class F1 extends cx1 implements a91<Context, sn4, md3, yf, hb3> {
        public F1() {
            super(4);
        }

        @Override // defpackage.a91
        public final hb3 I(Context context, sn4 sn4Var, md3 md3Var, yf yfVar) {
            return new hb3(dm1.this.d(), context, sn4Var, md3Var, yfVar);
        }
    }

    public static final class QnHx extends cx1 implements h81<yc3> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final yc3 invoke() {
            dm1 dm1Var = dm1.this;
            return new yc3((pa) dm1Var.d.a("pa", new bm1(dm1Var)), (yr3) dm1Var.d.a("yr3", new cm1(dm1Var)));
        }
    }

    public dm1(pk1 pk1Var, jl1 jl1Var, en1 en1Var) {
        super(pk1Var, jl1Var, en1Var);
        this.d = new t12();
    }

    @Override // defpackage.j04
    public final yc3 a() {
        return d();
    }

    public final o04 b() {
        return new o04(t10.a);
    }

    public final fd3 c() {
        return new fd3(new CQf(), new F1());
    }

    public final yc3 d() {
        return (yc3) this.d.a("yc3", new QnHx());
    }
}
