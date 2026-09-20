package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rw extends qw {
    public final tx w;
    public final tx x;

    public static final class CQf extends AtomicReference<vl0> implements nx, vl0 {
        public final nx w;
        public final tx x;

        public CQf(nx nxVar, tx txVar) {
            this.w = nxVar;
            this.x = txVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            this.x.b(new QnHx(this, this.w));
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
            this.w.onError(th);
        }
    }

    public static final class QnHx implements nx {
        public final AtomicReference<vl0> w;
        public final nx x;

        public QnHx(AtomicReference<vl0> atomicReference, nx nxVar) {
            this.w = atomicReference;
            this.x = nxVar;
        }

        @Override // defpackage.nx
        public final void b() {
            this.x.b();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            bm0.g(this.w, vl0Var);
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.x.onError(th);
        }
    }

    public rw(qw qwVar, qw qwVar2) {
        this.w = qwVar;
        this.x = qwVar2;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new CQf(nxVar, this.x));
    }
}
