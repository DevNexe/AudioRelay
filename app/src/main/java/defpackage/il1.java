package defpackage;

import android.media.projection.MediaProjection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class il1 extends ui3 {

    public static final class CQf extends cx1 implements j81<di, no2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ no2 invoke(di diVar) {
            return no2.a;
        }
    }

    public static final class F1 extends cx1 implements j81<MediaProjection, ac2> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final ac2 invoke(MediaProjection mediaProjection) {
            return new ac2(mediaProjection);
        }
    }

    public static final class QnHx extends cx1 implements j81<di, ke2> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final ke2 invoke(di diVar) {
            il1 il1Var = il1.this;
            return new ke2(new yk5(new cl5(il1Var.a.r())), new af2(new gf2(il1Var.a.r()), diVar));
        }
    }

    public il1(W8 w8, xb4 xb4Var, W w) {
        super(w8, xb4Var, w);
    }

    @Override // defpackage.kg4
    public final Set<if4> a() {
        xb4 xb4Var = this.b;
        Gf gfG = xb4Var.g();
        nb4 nb4VarM = xb4Var.m();
        W8 w8 = this.a;
        return Th.u(new yc(gfG, new ss3(new eg2(new Wh(nb4VarM, new se2(w8.l()), w8.m()), w8.j(), new hl1(this), new ig2(new ie2(w8.l())), new QnHx(), new jg2()), new cc2(new Wh(xb4Var.m(), new se2(w8.l()), w8.m()), w8.j(), new hl1(this), CQf.w, F1.w))), new baz(xb4Var.m()), new v1(w8.l(), xb4Var.d(), w8.q(), w8.n()));
    }
}
