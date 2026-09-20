package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 implements yg2 {
    public static final hg0 w = new hg0();
    public static final Choreographer x;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ Choreographer.FrameCallback w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(F1 f1) {
            super(1);
            this.w = f1;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            hg0.x.removeFrameCallback(this.w);
            return sd5.a;
        }
    }

    public static final class F1 implements Choreographer.FrameCallback {
        public final /* synthetic */ wm<R> w;
        public final /* synthetic */ j81<Long, R> x;

        public F1(xm xmVar, j81 j81Var) {
            this.w = xmVar;
            this.x = j81Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object qnHx;
            hg0 hg0Var = hg0.w;
            try {
                qnHx = this.x.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                qnHx = new fq3.QnHx(th);
            }
            this.w.x(qnHx);
        }
    }

    @if0(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super Choreographer>, Object> {
        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return Choreographer.getInstance();
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super Choreographer> z80Var) {
            return new QnHx(z80Var).i(sd5.a);
        }
    }

    static {
        qh0 qh0Var = rl0.a;
        x = (Choreographer) fp1.s0(n72.a.I(), new QnHx(null));
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1 getKey() {
        return yg2.QnHx.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }

    @Override // defpackage.yg2
    public final <R> Object z(j81<? super Long, ? extends R> j81Var, z80<? super R> z80Var) {
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        F1 f1 = new F1(xmVar, j81Var);
        x.postFrameCallback(f1);
        xmVar.B(new CQf(f1));
        return xmVar.p();
    }
}
