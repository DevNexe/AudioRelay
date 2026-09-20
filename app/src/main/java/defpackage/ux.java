package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ux extends qw {
    public final tx w;
    public final c54 x;

    public static final class QnHx extends AtomicReference<vl0> implements nx, vl0, Runnable {
        public final nx w;
        public final av3 x = new av3();
        public final tx y;

        public QnHx(nx nxVar, tx txVar) {
            this.w = nxVar;
            this.y = txVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
            this.x.a();
        }

        @Override // defpackage.nx
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y.b(this);
        }
    }

    public ux(tx txVar, c54 c54Var) {
        this.w = txVar;
        this.x = c54Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        QnHx qnHx = new QnHx(nxVar, this.w);
        nxVar.c(qnHx);
        vl0 vl0VarB = this.x.b(qnHx);
        av3 av3Var = qnHx.x;
        av3Var.getClass();
        bm0.g(av3Var, vl0VarB);
    }
}
