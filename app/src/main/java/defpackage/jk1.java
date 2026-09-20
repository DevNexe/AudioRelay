package defpackage;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class jk1 extends ji3 {
    public final t12 g;

    public static final class CQf extends cx1 implements j81<bm2, P> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final P invoke(bm2 bm2Var) {
            return new P(bm2Var);
        }
    }

    public static final class F1 extends cx1 implements x81<ua0, P, e12> {
        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final e12 invoke(ua0 ua0Var, P p) {
            jk1 jk1Var = jk1.this;
            P_xB p_xB = new P_xB(jk1Var.f.a(), jk1Var.g(), jk1Var.f(), jk1Var.d.a(), new yiTP(jk1Var.f()));
            W8 w8 = jk1Var.a;
            return new e12(new CGo(p_xB, new vAt(w8.g(), new bar(w8.s()))), jk1Var.e.a(), ua0Var, p);
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<Context, bm2, ua0, g81> {
        public LPt8Fixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final g81 invoke(Context context, bm2 bm2Var, ua0 ua0Var) {
            bm2 bm2Var2 = bm2Var;
            ua0 ua0Var2 = ua0Var;
            jk1 jk1Var = jk1.this;
            return new g81(jk1Var.e.a(), mk1.w, new ok1(jk1Var), context, bm2Var2, ua0Var2);
        }
    }

    public static final class QnHx extends cx1 implements h81<EWe> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final EWe invoke() {
            jk1 jk1Var = jk1.this;
            return new EWe(jk1Var.a.s(), jk1Var.b.getContext(), jk1Var.a.e());
        }
    }

    public jk1(jl1 jl1Var, pk1 pk1Var, yl1 yl1Var, fn1 fn1Var, en1 en1Var, yl2 yl2Var, dm1 dm1Var) {
        super(jl1Var, pk1Var, yl1Var, fn1Var, en1Var, yl2Var, dm1Var);
        this.g = new t12();
    }

    @Override // defpackage.i04
    public final sq1 a() {
        return (sq1) this.g.a("sq1", new kk1(this));
    }

    @Override // defpackage.i04
    public final nq1 b() {
        return (nq1) this.g.a("nq1", new lk1(this));
    }

    @Override // defpackage.i04
    public final o71 c() {
        return new o71(this.f.a(), f(), this.c.c());
    }

    public final l04 d() {
        return new l04(r10.a, r10.b);
    }

    public final e61 e() {
        return new e61(CQf.w, new F1(), new LPt8Fixed());
    }

    public final gR2r f() {
        Context context = this.b.getContext();
        EWe eWeG = g();
        sm3 sm3VarE = this.a.e();
        return ur1.a(Settings.System.getString(context.getContentResolver(), "firebase.test.lab"), "true") ? new ck0(eWeG, sm3VarE) : new gR2r(eWeG, sm3VarE);
    }

    public final EWe g() {
        return (EWe) this.g.a("EWe", new QnHx());
    }
}
