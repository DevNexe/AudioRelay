package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class sw<R> extends vq2<R> {
    public final tx w;
    public final us2<? extends R> x;

    public static final class QnHx<R> extends AtomicReference<vl0> implements ht2<R>, nx, vl0 {
        public final ht2<? super R> w;
        public us2<? extends R> x;

        public QnHx(ht2<? super R> ht2Var, us2<? extends R> us2Var) {
            this.x = us2Var;
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.ht2
        public final void b() {
            us2<? extends R> us2Var = this.x;
            if (us2Var == null) {
                this.w.b();
            } else {
                this.x = null;
                us2Var.a(this);
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.g(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.ht2
        public final void g(R r) {
            this.w.g(r);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public sw(lx lxVar, bs2 bs2Var) {
        this.w = lxVar;
        this.x = bs2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var, this.x);
        ht2Var.c(qnHx);
        this.w.b(qnHx);
    }
}
