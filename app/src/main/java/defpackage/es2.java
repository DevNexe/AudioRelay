package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class es2<T> extends Z<T, T> {
    public final i91<? super Throwable, ? extends T> x;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public final i91<? super Throwable, ? extends T> x;
        public vl0 y;

        public QnHx(ht2<? super T> ht2Var, i91<? super Throwable, ? extends T> i91Var) {
            this.w = ht2Var;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            ht2<? super T> ht2Var = this.w;
            try {
                T tApply = this.x.apply(th);
                if (tApply != null) {
                    ht2Var.g(tApply);
                    ht2Var.b();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    ht2Var.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                ht2Var.onError(new CompositeException(th, th2));
            }
        }
    }

    public es2(jr2 jr2Var, m91.PRnFixed pRn) {
        super(jr2Var);
        this.x = pRn;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
