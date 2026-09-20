package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mx extends qw {
    public final tx w;
    public final c54 x;

    public static final class QnHx extends AtomicReference<vl0> implements nx, vl0, Runnable {
        public final nx w;
        public final c54 x;
        public Throwable y;

        public QnHx(nx nxVar, c54 c54Var) {
            this.w = nxVar;
            this.x = c54Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            bm0.g(this, this.x.b(this));
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.y = th;
            bm0.g(this, this.x.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.y;
            nx nxVar = this.w;
            if (th == null) {
                nxVar.b();
            } else {
                this.y = null;
                nxVar.onError(th);
            }
        }
    }

    public mx(tx txVar, rb1 rb1Var) {
        this.w = txVar;
        this.x = rb1Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar, this.x));
    }
}
