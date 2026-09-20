package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.player.ui.service.PlayerService;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends gk3 {

    public static final class CQf extends cx1 implements h81<t83> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final t83 invoke() {
            dn1 dn1Var = dn1.this;
            return new t83(dn1Var.f.a(), new u63(dn1Var.d.c(), dn1Var.b.i(), dn1Var.e.b(), dn1Var.g.c()));
        }
    }

    public static final class F1 extends cx1 implements x81<bm2, sn4, l63> {
        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final l63 invoke(bm2 bm2Var, sn4 sn4Var) {
            dn1 dn1Var = dn1.this;
            return new l63(dn1Var.a.getContext(), dn1Var.g.a(), bm2Var, sn4Var);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<ji1> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final ji1 invoke() {
            dn1 dn1Var = dn1.this;
            I8O i8o = new I8O(dn1Var.b.l());
            W8 w8 = dn1Var.b;
            return new ji1(new ii1(i8o, new zh1(w8.l()), new s23(dn1Var.a.getContext(), w8.l())), dn1Var.f.a());
        }
    }

    public static final class NUlFixed extends cx1 implements y81<Context, sn4, j81<? super String, ? extends sd5>, ei1> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final ei1 invoke(Context context, sn4 sn4Var, j81<? super String, ? extends sd5> j81Var) {
            return new ei1(context, sn4Var, j81Var);
        }
    }

    public static final class QnHx extends cx1 implements j81<Context, ic2> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final ic2 invoke(Context context) {
            return new ic2(context);
        }
    }

    public static final class T23 extends cx1 implements j81<bm2, h73> {
        public static final T23 w = new T23();

        public T23() {
            super(1);
        }

        @Override // defpackage.j81
        public final h73 invoke(bm2 bm2Var) {
            return new h73(bm2Var);
        }
    }

    public static final class YKK extends cx1 implements h81<e04> {
        public YKK() {
            super(0);
        }

        @Override // defpackage.h81
        public final e04 invoke() {
            dn1 dn1Var = dn1.this;
            ny1 ny1Var = new ny1((ln2) dn1Var.d.c());
            e63 e63Var = dn1Var.d;
            cq4 cq4VarE = e63Var.e();
            Context context = dn1Var.a.getContext();
            W8 w8 = dn1Var.b;
            return new e04(new oz3(ny1Var, cq4VarE, new d7G(new cq4(context, w8.b()), e63Var.c()), new ny1((sd2) e63Var.j()), new ta2(e63Var.d()), new C0w(w8.e(), w8.l()), w8.c()), dn1Var.f.a());
        }
    }

    public static final class auxFixed extends cx1 implements x81<bm2, j81<? super mp2, ? extends sd5>, wy3> {
        public static final auxFixed w = new auxFixed();

        public auxFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final wy3 invoke(bm2 bm2Var, j81<? super mp2, ? extends sd5> j81Var) {
            return new wy3(bm2Var, j81Var);
        }
    }

    public static final class byN extends cx1 implements h81<x73> {
        public byN() {
            super(0);
        }

        @Override // defpackage.h81
        public final x73 invoke() {
            dn1 dn1Var = dn1.this;
            return new x73(new n73(dn1Var.b.l()), dn1Var.f.a());
        }
    }

    public dn1(pk1 pk1Var, jl1 jl1Var, nm1 nm1Var, yl1 yl1Var, rk1 rk1Var, en1 en1Var, ul1 ul1Var, jk1 jk1Var, yl2 yl2Var, dm1 dm1Var) {
        super(pk1Var, jl1Var, nm1Var, yl1Var, rk1Var, en1Var, ul1Var, jk1Var, yl2Var, dm1Var);
    }

    @Override // defpackage.jn
    public final n83 a() {
        return new n83(new CQf(), new F1(), new LPt8Fixed(), NUlFixed.w, new YKK(), auxFixed.w, T23.w, new byN());
    }

    @Override // defpackage.jn
    public final PlayerService.CQf b() {
        e63 e63Var = this.d;
        rn2 rn2VarC = e63Var.c();
        Ld ld = this.a;
        Context context = ld.getContext();
        rn2 rn2VarC2 = e63Var.c();
        ta2 ta2VarA = this.c.a();
        W8 w8 = this.b;
        return new PlayerService.CQf(rn2VarC, new tp2(context, rn2VarC2, new X1GO(ta2VarA, w8.r())), new v63(ld.getContext(), this.h.e()), new cl0(ld.getContext(), this.i.a(), new b83(e63Var.c()), w8.t()), new cq4(ld.getContext(), new b83(e63Var.c())), QnHx.w);
    }

    public final n04 c() {
        return new n04(v10.a);
    }
}
