package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j45 {
    public final qd5 a;
    public mt2 b;
    public j81<? super x45, sd5> c;
    public u45 d;
    public final kz2 e;
    public ys f;
    public x55 g;
    public vb1 h;
    public b31 i;
    public final kz2 j;
    public long k;
    public Integer l;
    public long m;
    public final kz2 n;
    public final kz2 o;
    public x45 p;
    public final auxFixed q;

    public static final class CQf extends cx1 implements j81<x45, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(x45 x45Var) {
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            j45 j45Var = j45.this;
            j45Var.d(true);
            j45Var.k();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            j45 j45Var = j45.this;
            j45Var.f();
            j45Var.k();
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<sd5> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            j45 j45Var = j45.this;
            j45Var.l();
            j45Var.k();
            return sd5.a;
        }
    }

    public static final class QnHx {
        public QnHx(j45 j45Var) {
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            j45 j45Var = j45.this;
            x45 x45VarE = j45.e(j45Var.j().a, Cz.a(0, j45Var.j().a.w.length()));
            j45Var.c.invoke(x45VarE);
            j45Var.p = x45.a(j45Var.p, null, x45VarE.b, 5);
            u45 u45Var = j45Var.d;
            if (u45Var != null) {
                u45Var.i = true;
            }
            return sd5.a;
        }
    }

    public static final class auxFixed implements g25 {
        public auxFixed() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.g25
        public final void a(long j) {
            boolean z;
            p55 p55VarC;
            u45 u45Var;
            p55 p55VarC2;
            p55 p55VarC3;
            j45 j45Var = j45.this;
            if (((eb1) j45Var.n.getValue()) != null) {
                return;
            }
            j45Var.n.setValue(eb1.SelectionEnd);
            j45Var.k();
            u45 u45Var2 = j45Var.d;
            if (u45Var2 == null || (p55VarC3 = u45Var2.c()) == null) {
                z = false;
            } else {
                long jC = p55VarC3.c(p55VarC3.a(j));
                float fD = kt2.d(jC);
                o55 o55Var = p55VarC3.a;
                int iG = o55Var.g(fD);
                if (kt2.c(jC) >= o55Var.h(iG) && kt2.c(jC) <= o55Var.i(iG)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z && (u45Var = j45Var.d) != null && (p55VarC2 = u45Var.c()) != null) {
                mt2 mt2Var = j45Var.b;
                float fD2 = kt2.d(p55VarC2.c(p55VarC2.a(X.a(0.0f, kt2.d(j)))));
                o55 o55Var2 = p55VarC2.a;
                int iA = mt2Var.a(o55Var2.e(o55Var2.g(fD2), false));
                vb1 vb1Var = j45Var.h;
                if (vb1Var != null) {
                    vb1Var.a();
                }
                x45 x45VarE = j45.e(j45Var.j().a, Cz.a(iA, iA));
                j45Var.h();
                j45Var.c.invoke(x45VarE);
                return;
            }
            if (j45Var.j().a.w.length() == 0) {
                return;
            }
            j45Var.h();
            u45 u45Var3 = j45Var.d;
            if (u45Var3 != null && (p55VarC = u45Var3.c()) != null) {
                int iB = p55VarC.b(j, true);
                j45.c(j45Var, j45Var.j(), iB, iB, false, o74.QnHx.b);
                j45Var.l = Integer.valueOf(iB);
            }
            j45Var.k = j;
            j45Var.o.setValue(new kt2(j));
            j45Var.m = kt2.b;
        }

        @Override // defpackage.g25
        public final void b() {
        }

        @Override // defpackage.g25
        public final void c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.g25
        public final void d(long j) {
            p55 p55VarC;
            j45 j45Var = j45.this;
            if (j45Var.j().a.w.length() == 0) {
                return;
            }
            j45Var.m = kt2.g(j45Var.m, j);
            u45 u45Var = j45Var.d;
            if (u45Var != null && (p55VarC = u45Var.c()) != null) {
                kt2 kt2Var = new kt2(kt2.g(j45Var.k, j45Var.m));
                kz2 kz2Var = j45Var.o;
                kz2Var.setValue(kt2Var);
                Integer num = j45Var.l;
                j45.c(j45Var, j45Var.j(), num != null ? num.intValue() : p55VarC.b(j45Var.k, false), p55VarC.b(((kt2) kz2Var.getValue()).a, false), false, o74.QnHx.b);
            }
            u45 u45Var2 = j45Var.d;
            if (u45Var2 == null) {
                return;
            }
            u45Var2.i = false;
        }

        @Override // defpackage.g25
        public final void onCancel() {
        }

        @Override // defpackage.g25
        public final void onStop() {
            j45 j45Var = j45.this;
            j45.b(j45Var, null);
            j45Var.o.setValue(null);
            u45 u45Var = j45Var.d;
            if (u45Var != null) {
                u45Var.i = true;
            }
            x55 x55Var = j45Var.g;
            if ((x55Var != null ? x55Var.c() : 0) == 2) {
                j45Var.n();
            }
            j45Var.l = null;
        }
    }

    public j45() {
        this(null);
    }

    public static final void a(j45 j45Var, kt2 kt2Var) {
        j45Var.o.setValue(kt2Var);
    }

    public static final void b(j45 j45Var, eb1 eb1Var) {
        j45Var.n.setValue(eb1Var);
    }

    public static final void c(j45 j45Var, x45 x45Var, int i, int i2, boolean z, o74 o74Var) {
        long jA;
        p55 p55VarC;
        mt2 mt2Var = j45Var.b;
        long j = x45Var.b;
        int i3 = s55.c;
        int iB = mt2Var.b((int) (j >> 32));
        mt2 mt2Var2 = j45Var.b;
        long j2 = x45Var.b;
        long jA2 = Cz.a(iB, mt2Var2.b(s55.c(j2)));
        u45 u45Var = j45Var.d;
        o55 o55Var = (u45Var == null || (p55VarC = u45Var.c()) == null) ? null : p55VarC.a;
        s55 s55Var = s55.b(jA2) ? null : new s55(jA2);
        if (o55Var != null) {
            jA = Cz.a(i, i2);
            if (s55Var != null || !ur1.a(o74Var, o74.QnHx.a)) {
                jA = o74Var.a(o55Var, jA, -1, z, s55Var);
            }
        } else {
            jA = Cz.a(0, 0);
        }
        long jA3 = Cz.a(j45Var.b.a((int) (jA >> 32)), j45Var.b.a(s55.c(jA)));
        if (s55.a(jA3, j2)) {
            return;
        }
        vb1 vb1Var = j45Var.h;
        if (vb1Var != null) {
            vb1Var.a();
        }
        j45Var.c.invoke(e(x45Var.a, jA3));
        u45 u45Var2 = j45Var.d;
        if (u45Var2 != null) {
            u45Var2.j.setValue(Boolean.valueOf(k45.b(j45Var, true)));
        }
        u45 u45Var3 = j45Var.d;
        if (u45Var3 == null) {
            return;
        }
        u45Var3.k.setValue(Boolean.valueOf(k45.b(j45Var, false)));
    }

    public static x45 e(Z7jl z7jl, long j) {
        return new x45(z7jl, j, (s55) null);
    }

    public final void d(boolean z) {
        if (s55.b(j().b)) {
            return;
        }
        ys ysVar = this.f;
        if (ysVar != null) {
            ysVar.a(C0239D.t(j()));
        }
        if (z) {
            int iD = s55.d(j().b);
            this.c.invoke(e(j().a, Cz.a(iD, iD)));
            m(hb1.None);
        }
    }

    public final void f() {
        if (s55.b(j().b)) {
            return;
        }
        ys ysVar = this.f;
        if (ysVar != null) {
            ysVar.a(C0239D.t(j()));
        }
        Z7jl z7jlA = C0239D.v(j(), j().a.w.length()).a(C0239D.u(j(), j().a.w.length()));
        int iE = s55.e(j().b);
        this.c.invoke(e(z7jlA, Cz.a(iE, iE)));
        m(hb1.None);
        qd5 qd5Var = this.a;
        if (qd5Var != null) {
            qd5Var.f = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    public final void g(kt2 kt2Var) {
        hb1 hb1Var;
        if (!s55.b(j().b)) {
            u45 u45Var = this.d;
            p55 p55VarC = u45Var != null ? u45Var.c() : null;
            int iD = (kt2Var == null || p55VarC == null) ? s55.d(j().b) : this.b.a(p55VarC.b(kt2Var.a, true));
            this.c.invoke(x45.a(j(), null, Cz.a(iD, iD), 5));
        }
        if (kt2Var == null) {
            hb1Var = hb1.None;
        } else {
            if (j().a.w.length() > 0) {
                hb1Var = hb1.Cursor;
            } else {
                hb1Var = hb1.None;
            }
        }
        m(hb1Var);
        k();
    }

    public final void h() {
        b31 b31Var;
        u45 u45Var = this.d;
        boolean z = false;
        if (u45Var != null && !u45Var.b()) {
            z = true;
        }
        if (z && (b31Var = this.i) != null) {
            b31Var.a();
        }
        this.p = j();
        u45 u45Var2 = this.d;
        if (u45Var2 != null) {
            u45Var2.i = true;
        }
        m(hb1.Selection);
    }

    public final long i(boolean z) {
        int iC;
        x45 x45VarJ = j();
        if (z) {
            long j = x45VarJ.b;
            int i = s55.c;
            iC = (int) (j >> 32);
        } else {
            iC = s55.c(x45VarJ.b);
        }
        u45 u45Var = this.d;
        p55 p55VarC = u45Var != null ? u45Var.c() : null;
        int iB = this.b.b(iC);
        boolean zF = s55.f(j().b);
        o55 o55Var = p55VarC.a;
        return X.a(X.u(o55Var, iB, z, zF), o55Var.d(o55Var.f(iB)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x45 j() {
        return (x45) this.e.getValue();
    }

    public final void k() {
        x55 x55Var;
        x55 x55Var2 = this.g;
        if ((x55Var2 != null ? x55Var2.c() : 0) != 1 || (x55Var = this.g) == null) {
            return;
        }
        x55Var.a();
    }

    public final void l() {
        Z7jl text;
        ys ysVar = this.f;
        if (ysVar == null || (text = ysVar.getText()) == null) {
            return;
        }
        Z7jl z7jlA = C0239D.v(j(), j().a.w.length()).a(text).a(C0239D.u(j(), j().a.w.length()));
        int length = text.length() + s55.e(j().b);
        this.c.invoke(e(z7jlA, Cz.a(length, length)));
        m(hb1.None);
        qd5 qd5Var = this.a;
        if (qd5Var != null) {
            qd5Var.f = true;
        }
    }

    public final void m(hb1 hb1Var) {
        u45 u45Var = this.d;
        if (u45Var != null) {
            u45Var.h.setValue(hb1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        NUlFixed nUl;
        dl3 dl3Var;
        float fD;
        float fD2;
        iy1 iy1Var;
        o55 o55Var;
        iy1 iy1Var2;
        o55 o55Var2;
        iy1 iy1Var3;
        F1 f1 = !s55.b(j().b) ? new F1() : null;
        boolean zB = s55.b(j().b);
        kz2 kz2Var = this.j;
        LPt8Fixed lPt8 = (zB || !((Boolean) kz2Var.getValue()).booleanValue()) ? null : new LPt8Fixed();
        if (((Boolean) kz2Var.getValue()).booleanValue()) {
            ys ysVar = this.f;
            if ((ysVar != null ? ysVar.getText() : null) != null) {
                nUl = new NUlFixed();
            } else {
                nUl = null;
            }
        } else {
            nUl = null;
        }
        long j = j().b;
        YKK ykk = s55.d(j) - s55.e(j) != j().a.w.length() ? new YKK() : null;
        x55 x55Var = this.g;
        if (x55Var != null) {
            u45 u45Var = this.d;
            if (u45Var != null) {
                iy1 iy1Var4 = u45Var.f;
                long jO = iy1Var4 != null ? iy1Var4.O(i(true)) : kt2.b;
                u45 u45Var2 = this.d;
                long jO2 = (u45Var2 == null || (iy1Var3 = u45Var2.f) == null) ? kt2.b : iy1Var3.O(i(false));
                u45 u45Var3 = this.d;
                if (u45Var3 == null || (iy1Var2 = u45Var3.f) == null) {
                    jO2 = jO2;
                    fD = 0.0f;
                } else {
                    p55 p55VarC = u45Var.c();
                    fD = kt2.d(iy1Var2.O(X.a(0.0f, (p55VarC == null || (o55Var2 = p55VarC.a) == null) ? 0.0f : o55Var2.c(AY.o((int) (j().b >> 32), 0, Math.max(0, j().a.w.length() - 1))).b)));
                }
                u45 u45Var4 = this.d;
                if (u45Var4 == null || (iy1Var = u45Var4.f) == null) {
                    fD2 = 0.0f;
                } else {
                    p55 p55VarC2 = u45Var.c();
                    fD2 = kt2.d(iy1Var.O(X.a(0.0f, (p55VarC2 == null || (o55Var = p55VarC2.a) == null) ? 0.0f : o55Var.c(AY.o(s55.c(j().b), 0, Math.max(0, j().a.w.length() - 1))).b)));
                }
                dl3Var = new dl3(Math.min(kt2.c(jO), kt2.c(jO2)), Math.min(fD, fD2), Math.max(kt2.c(jO), kt2.c(jO2)), (u45Var.a.f.getDensity() * 25) + Math.max(kt2.d(jO), kt2.d(jO2)));
            } else {
                dl3Var = dl3.e;
            }
            x55Var.b(dl3Var, f1, nUl, lPt8, ykk);
        }
    }

    public j45(qd5 qd5Var) {
        this.a = qd5Var;
        this.b = mt2.QnHx.a;
        this.c = CQf.w;
        this.e = ps0.R(new x45((String) null, 0L, 7));
        this.j = ps0.R(Boolean.TRUE);
        long j = kt2.b;
        this.k = j;
        this.m = j;
        this.n = ps0.R(null);
        this.o = ps0.R(null);
        this.p = new x45((String) null, 0L, 7);
        this.q = new auxFixed();
        new QnHx(this);
    }
}
