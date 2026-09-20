package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hl4<T, R> extends vq2<R> {
    public final rl4<T> w;
    public final i91<? super T, ? extends us2<? extends R>> x;

    public static final class QnHx<T, R> extends AtomicReference<vl0> implements ht2<R>, ml4<T>, vl0 {
        public final ht2<? super R> w;
        public final i91<? super T, ? extends us2<? extends R>> x;

        public QnHx(ht2<? super R> ht2Var, i91<? super T, ? extends us2<? extends R>> i91Var) {
            this.w = ht2Var;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
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

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            try {
                us2<? extends R> us2VarApply = this.x.apply(t);
                mq2.b(us2VarApply, "The mapper returned a null Publisher");
                us2VarApply.a(this);
            } catch (Throwable th) {
                XTd3.w(th);
                this.w.onError(th);
            }
        }
    }

    public hl4(rl4<T> rl4Var, i91<? super T, ? extends us2<? extends R>> i91Var) {
        this.w = rl4Var;
        this.x = i91Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var, this.x);
        ht2Var.c(qnHx);
        this.w.b(qnHx);
    }
}
