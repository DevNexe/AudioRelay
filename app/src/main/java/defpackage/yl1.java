package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl1 extends oj3 {
    public final t12 f;

    public static final class CQf extends cx1 implements h81<ud2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final ud2 invoke() {
            return new ud2();
        }
    }

    public static final class F1 extends cx1 implements h81<un2> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final un2 invoke() {
            return new un2(yl1.this.c());
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<xn2> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final xn2 invoke() {
            return new xn2();
        }
    }

    public static final class NUlFixed extends cx1 implements h81<pp2> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final pp2 invoke() {
            yl1 yl1Var = yl1.this;
            return new pp2(yl1Var.a.b(), yl1Var.c.a());
        }
    }

    public static final class QnHx extends cx1 implements h81<CWg> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final CWg invoke() {
            return new CWg();
        }
    }

    public static final class YKK extends cx1 implements h81<zb4> {
        public static final YKK w = new YKK();

        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final zb4 invoke() {
            return new zb4();
        }
    }

    public yl1(jl1 jl1Var, nm1 nm1Var, rk1 rk1Var, gn1 gn1Var, hn1 hn1Var) {
        super(jl1Var, nm1Var, rk1Var, gn1Var, hn1Var);
        this.f = new t12();
    }

    @Override // defpackage.yp1
    public final pp2 a() {
        return (pp2) this.f.a("pp2", new NUlFixed());
    }

    @Override // defpackage.yp1
    public final xn2 b() {
        return (xn2) this.f.a("xn2", LPt8Fixed.w);
    }

    @Override // defpackage.e63
    public final rn2 c() {
        return (rn2) this.f.a("rn2", new xl1(this));
    }

    @Override // defpackage.e63
    public final pp2 d() {
        return a();
    }

    @Override // defpackage.e63
    public final cq4 e() {
        rn2 rn2VarC = c();
        lj4 lj4Var = this.a;
        return new cq4(rn2VarC, new ot4(lj4Var.a(), lj4Var.b()));
    }

    @Override // defpackage.yp1
    public final zb4 f() {
        return (zb4) this.f.a("zb4", YKK.w);
    }

    @Override // defpackage.e63
    public final CWg g() {
        return (CWg) this.f.a("CWg", QnHx.w);
    }

    @Override // defpackage.yp1
    public final ud2 h() {
        return (ud2) this.f.a("ud2", CQf.w);
    }

    @Override // defpackage.e63
    public final un2 i() {
        return (un2) this.f.a("un2", new F1());
    }

    @Override // defpackage.e63
    public final ud2 j() {
        return h();
    }

    public final lf4 k() {
        rn2 rn2VarC = c();
        a62 a62Var = a62.a;
        return new lf4(rn2VarC);
    }
}
