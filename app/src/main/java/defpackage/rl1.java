package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.server.services.ServerService;

/* JADX INFO: loaded from: classes.dex */
public final class rl1 extends wi3 {

    public static final class CQf extends cx1 implements y81<Context, sn4, j81<? super rPO, ? extends sd5>, fcT> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final fcT invoke(Context context, sn4 sn4Var, j81<? super rPO, ? extends sd5> j81Var) {
            return new fcT(context, sn4Var, j81Var);
        }
    }

    public static final class F1 extends cx1 implements h81<ly3> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final ly3 invoke() {
            rl1 rl1Var = rl1.this;
            uc4 uc4VarI = rl1Var.c.i();
            xb4 xb4Var = rl1Var.c;
            ef4 ef4VarD = xb4Var.d();
            W8 w8 = rl1Var.b;
            return new ly3(new gx3(uc4VarI, new d7G(ef4VarD, new ot4(w8.a(), w8.b())), xb4Var.j(), new pb(rl1Var.a.getContext(), w8.l(), w8.n(), w8.q()), w8.h(), w8.f(), xb4Var.d(), w8.k(), xb4Var.o(), new ot4(w8.a(), w8.b()), xb4Var.f(), new se2(w8.l()), w8.c(), new yk5(new cl5(w8.r())), new gf2(w8.r()), new ie2(w8.l()), rl1Var.d.c(), rl1Var.g.a()), rl1Var.e.a());
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<Context, sn4, bm2, gv3> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final gv3 invoke(Context context, sn4 sn4Var, bm2 bm2Var) {
            return new gv3(context, sn4Var, bm2Var);
        }
    }

    public static final class QnHx extends cx1 implements h81<lQ> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final lQ invoke() {
            rl1 rl1Var = rl1.this;
            u7.QnHx qnHxA = rl1Var.e.a();
            I8O i8o = new I8O(rl1Var.b.l());
            xb4 xb4Var = rl1Var.c;
            return new lQ(qnHxA, new AO9A(i8o, xb4Var.d(), xb4Var.i()));
        }
    }

    public rl1(pk1 pk1Var, jl1 jl1Var, pm1 pm1Var, cl1 cl1Var, en1 en1Var, yl2 yl2Var, dm1 dm1Var) {
        super(pk1Var, jl1Var, pm1Var, cl1Var, en1Var, yl2Var, dm1Var);
        new t12();
    }

    @Override // defpackage.M2Wm
    public final ServerService.QnHx a() {
        xb4 xb4Var = this.c;
        return new ServerService.QnHx(xb4Var.d(), this.b.f(), this.g.a(), xb4Var.j(), this.f.e());
    }

    public final p04 b() {
        return new p04(s10.a);
    }

    public final j95 c() {
        return new j95(new QnHx(), CQf.w, new F1(), LPt8Fixed.w);
    }
}
