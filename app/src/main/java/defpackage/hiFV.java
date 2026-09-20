package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class hiFV implements yg2 {
    public final Choreographer w;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ Choreographer.FrameCallback x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(F1 f1) {
            super(1);
            this.x = f1;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            hiFV.this.w.removeFrameCallback(this.x);
            return sd5.a;
        }
    }

    public static final class F1 implements Choreographer.FrameCallback {
        public final /* synthetic */ wm<R> w;
        public final /* synthetic */ j81<Long, R> x;

        public F1(xm xmVar, hiFV hifv, j81 j81Var) {
            this.w = xmVar;
            this.x = j81Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object qnHx;
            try {
                qnHx = this.x.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                qnHx = new fq3.QnHx(th);
            }
            this.w.x(qnHx);
        }
    }

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ FO w;
        public final /* synthetic */ Choreographer.FrameCallback x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(FO fo, F1 f1) {
            super(1);
            this.w = fo;
            this.x = f1;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            FO fo = this.w;
            Choreographer.FrameCallback frameCallback = this.x;
            synchronized (fo.A) {
                fo.C.remove(frameCallback);
            }
            return sd5.a;
        }
    }

    public hiFV(Choreographer choreographer) {
        this.w = choreographer;
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
        la0.CQf cQfJ = z80Var.getContext().j(c90.QnHx.w);
        FO fo = cQfJ instanceof FO ? (FO) cQfJ : null;
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        F1 f1 = new F1(xmVar, this, j81Var);
        if (fo == null || !ur1.a(fo.y, this.w)) {
            this.w.postFrameCallback(f1);
            xmVar.B(new CQf(f1));
        } else {
            synchronized (fo.A) {
                fo.C.add(f1);
                if (!fo.F) {
                    fo.F = true;
                    fo.y.postFrameCallback(fo.G);
                }
                sd5 sd5Var = sd5.a;
            }
            xmVar.B(new QnHx(fo, f1));
        }
        return xmVar.p();
    }
}
