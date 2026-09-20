package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends vi3 {
    public final t12 E;

    public static final class CQf extends cx1 implements h81<ar8> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final ar8 invoke() {
            return new ar8();
        }
    }

    public static final class EQ extends cx1 implements h81<hl5> {
        public EQ() {
            super(0);
        }

        @Override // defpackage.h81
        public final hl5 invoke() {
            return new hl5(jl1.this.C.getContext());
        }
    }

    public static final class F1 extends cx1 implements h81<qb> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final qb invoke() {
            return new qb(jl1.this.C.getContext());
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<zb> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final zb invoke() {
            return new zb(jl1.this.C.getContext());
        }
    }

    public static final class NUlFixed extends cx1 implements h81<kc> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final kc invoke() {
            return new kc();
        }
    }

    public static final class QnHx extends cx1 implements h81<lKy3> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final lKy3 invoke() {
            jl1 jl1Var = jl1.this;
            return new lKy3(jl1Var.C.getContext(), jl1Var.B.a());
        }
    }

    public static final class T23 extends cx1 implements h81<uz4> {
        public static final T23 w = new T23();

        public T23() {
            super(0);
        }

        @Override // defpackage.h81
        public final uz4 invoke() {
            return new uz4();
        }
    }

    public static final class YKK extends cx1 implements h81<y50> {
        public static final YKK w = new YKK();

        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final y50 invoke() {
            return new y50();
        }
    }

    public static final class auxFixed extends cx1 implements h81<zh2> {
        public auxFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final zh2 invoke() {
            jl1 jl1Var = jl1.this;
            return new zh2(jl1Var.C.getContext(), (qc4) jl1Var.E.a("qc4", new ll1(jl1Var)));
        }
    }

    public static final class byN extends cx1 implements h81<df5> {
        public static final byN w = new byN();

        public byN() {
            super(0);
        }

        @Override // defpackage.h81
        public final df5 invoke() {
            return new df5();
        }
    }

    public jl1(ci ciVar, nm1 nm1Var, pk1 pk1Var) {
        super(ciVar, nm1Var, pk1Var);
        this.E = new t12();
    }

    public final zh2 A() {
        return (zh2) this.E.a("zh2", new auxFixed());
    }

    public final hl5 B() {
        return (hl5) this.E.a("hl5", new EQ());
    }

    public final lKy3 C() {
        return (lKy3) this.E.a("lKy3", new QnHx());
    }

    @Override // defpackage.lj4
    public final C0239D a() {
        return new C0239D();
    }

    @Override // defpackage.lj4
    public final E3F b() {
        return (E3F) this.E.a("E3F", new nl1(this));
    }

    @Override // defpackage.lj4
    public final uz4 c() {
        return (uz4) this.E.a("uz4", T23.w);
    }

    @Override // defpackage.W8
    public final ci d() {
        return this.A;
    }

    @Override // defpackage.W8
    public final sm3 e() {
        return (sm3) this.E.a("sm3", new ol1(this));
    }

    @Override // defpackage.lj4
    public final in2 f() {
        return (in2) this.E.a("in2", kl1.w);
    }

    @Override // defpackage.W8
    public final df5 g() {
        return (df5) this.E.a("df5", byN.w);
    }

    @Override // defpackage.W8
    public final qb h() {
        return (qb) this.E.a("qb", new F1());
    }

    @Override // defpackage.lj4
    public final y50 i() {
        return (y50) this.E.a("y50", YKK.w);
    }

    @Override // defpackage.lj4
    public final FWT j() {
        return new FWT();
    }

    @Override // defpackage.lj4
    public final po1K k() {
        return new po1K(C(), this.C.c());
    }

    @Override // defpackage.W8
    public final lKy3 l() {
        return C();
    }

    @Override // defpackage.W8
    public final F5TR m() {
        return new F5TR(this.C.getContext());
    }

    @Override // defpackage.W8
    public final zb n() {
        return (zb) this.E.a("zb", new LPt8Fixed());
    }

    @Override // defpackage.W8
    public final ss3 o() {
        return new ss3(e(), C());
    }

    @Override // defpackage.lj4
    public final qc4 p() {
        return (qc4) this.E.a("qc4", new ll1(this));
    }

    @Override // defpackage.W8
    public final kc q() {
        return (kc) this.E.a("kc", NUlFixed.w);
    }

    @Override // defpackage.lj4
    public final I8O r() {
        return new I8O(C());
    }

    @Override // defpackage.W8
    public final ar8 s() {
        return (ar8) this.E.a("ar8", CQf.w);
    }

    @Override // defpackage.W8
    public final lKy3 t() {
        return C();
    }

    @Override // defpackage.lj4
    public final v3A u() {
        return new v3A();
    }

    public final hc z() {
        return new hc(this.C.getContext(), q(), h());
    }
}
