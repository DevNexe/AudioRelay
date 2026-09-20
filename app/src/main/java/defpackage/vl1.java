package defpackage;

import com.azefsw.audioconnect.root.ui.RootActivity;

/* JADX INFO: loaded from: classes.dex */
public final class vl1 extends lj3 {
    public final t12 i;

    public static final class CQf extends cx1 implements h81<o72> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final o72 invoke() {
            return new o72();
        }
    }

    public static final class F1 extends cx1 implements h81<if5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final if5 invoke() {
            vl1 vl1Var = vl1.this;
            return new if5(vl1Var.d.l(), vl1Var.a.a(), vl1Var.d.o(), vl1Var.g.b());
        }
    }

    public static final class QnHx extends cx1 implements j81<p72, d82> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final d82 invoke(p72 p72Var) {
            vl1 vl1Var = vl1.this;
            return new d82(vl1Var.f.a(), new v72(vl1Var.d.l()), p72Var);
        }
    }

    public vl1(sl1 sl1Var, pk1 pk1Var, yl1 yl1Var, jl1 jl1Var, fn1 fn1Var, en1 en1Var, jk1 jk1Var, dm1 dm1Var) {
        super(sl1Var, pk1Var, yl1Var, jl1Var, fn1Var, en1Var, jk1Var, dm1Var);
        this.i = new t12();
    }

    @Override // defpackage.f72
    public final RootActivity.QnHx a() {
        W8 w8 = this.d;
        return new RootActivity.QnHx(w8.s(), this.h.a(), w8.g());
    }

    @Override // defpackage.f72
    public final d7G b() {
        return new d7G(CQf.w, new QnHx());
    }

    @Override // defpackage.f72
    public final cq4 c() {
        return new cq4(this.e.a(), this.c.c());
    }

    @Override // defpackage.f72
    public final zr4 d() {
        return new zr4(this.d.l(), (if5) this.i.a("if5", new F1()));
    }

    @Override // defpackage.m04
    public final g03 e() {
        return new h03(this.b.getContext());
    }

    @Override // defpackage.k04
    public final cOm3Fixed f() {
        return new dt3(this.b.getContext());
    }
}
