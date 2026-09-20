package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fl4<T, R> extends vk4<R> {
    public final rl4<? extends T> w;
    public final i91<? super T, ? extends rl4<? extends R>> x;

    public static final class QnHx<T, R> extends AtomicReference<vl0> implements ml4<T>, vl0 {
        public final ml4<? super R> w;
        public final i91<? super T, ? extends rl4<? extends R>> x;

        /* JADX INFO: renamed from: fl4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0129QnHx<R> implements ml4<R> {
            public final AtomicReference<vl0> w;
            public final ml4<? super R> x;

            public C0129QnHx(AtomicReference<vl0> atomicReference, ml4<? super R> ml4Var) {
                this.w = atomicReference;
                this.x = ml4Var;
            }

            @Override // defpackage.ml4
            public final void c(vl0 vl0Var) {
                bm0.g(this.w, vl0Var);
            }

            @Override // defpackage.ml4
            public final void onError(Throwable th) {
                this.x.onError(th);
            }

            @Override // defpackage.ml4
            public final void onSuccess(R r) {
                this.x.onSuccess(r);
            }
        }

        public QnHx(ml4<? super R> ml4Var, i91<? super T, ? extends rl4<? extends R>> i91Var) {
            this.w = ml4Var;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            ml4<? super R> ml4Var = this.w;
            try {
                rl4<? extends R> rl4VarApply = this.x.apply(t);
                mq2.b(rl4VarApply, "The single returned by the mapper is null");
                rl4<? extends R> rl4Var = rl4VarApply;
                if (e()) {
                    return;
                }
                rl4Var.b(new C0129QnHx(this, ml4Var));
            } catch (Throwable th) {
                XTd3.w(th);
                ml4Var.onError(th);
            }
        }
    }

    public fl4(rl4<? extends T> rl4Var, i91<? super T, ? extends rl4<? extends R>> i91Var) {
        this.x = i91Var;
        this.w = rl4Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super R> ml4Var) {
        this.w.b(new QnHx(ml4Var, this.x));
    }
}
