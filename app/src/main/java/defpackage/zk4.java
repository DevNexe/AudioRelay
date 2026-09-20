package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zk4<T> extends vk4<T> {
    public final rl4<T> w;
    public final tx x;

    public static final class QnHx<T> extends AtomicReference<vl0> implements nx, vl0 {
        public final ml4<? super T> w;
        public final rl4<T> x;

        public QnHx(ml4<? super T> ml4Var, rl4<T> rl4Var) {
            this.w = ml4Var;
            this.x = rl4Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            this.x.b(new jq3(this, this.w));
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

    public zk4(vk4 vk4Var, tx txVar) {
        this.w = vk4Var;
        this.x = txVar;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.x.b(new QnHx(ml4Var, this.w));
    }
}
