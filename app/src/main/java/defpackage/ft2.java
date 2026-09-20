package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ft2<T, D> extends vq2<T> {
    public final Callable<? extends D> w;
    public final i91<? super D, ? extends us2<? extends T>> x;
    public final m70<? super D> y;
    public final boolean z;

    public static final class QnHx<T, D> extends AtomicBoolean implements ht2<T>, vl0 {
        public vl0 A;
        public final ht2<? super T> w;
        public final D x;
        public final m70<? super D> y;
        public final boolean z;

        public QnHx(ht2<? super T> ht2Var, D d, m70<? super D> m70Var, boolean z) {
            this.w = ht2Var;
            this.x = d;
            this.y = m70Var;
            this.z = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            d();
            this.A.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            boolean z = this.z;
            ht2<? super T> ht2Var = this.w;
            if (!z) {
                ht2Var.b();
                this.A.a();
                d();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.y.accept(this.x);
                } catch (Throwable th) {
                    XTd3.w(th);
                    ht2Var.onError(th);
                    return;
                }
            }
            this.A.a();
            ht2Var.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.A, vl0Var)) {
                this.A = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
            if (compareAndSet(false, true)) {
                try {
                    this.y.accept(this.x);
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            boolean z = this.z;
            ht2<? super T> ht2Var = this.w;
            if (!z) {
                ht2Var.onError(th);
                this.A.a();
                d();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.y.accept(this.x);
                } catch (Throwable th2) {
                    XTd3.w(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.A.a();
            ht2Var.onError(th);
        }
    }

    public ft2(r23 r23Var, i91 i91Var, CY cy, boolean z) {
        this.w = r23Var;
        this.x = i91Var;
        this.y = cy;
        this.z = z;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        m70<? super D> m70Var = this.y;
        yr0 yr0Var = yr0.INSTANCE;
        try {
            D dCall = this.w.call();
            try {
                us2<? extends T> us2VarApply = this.x.apply(dCall);
                mq2.b(us2VarApply, "The sourceSupplier returned a null ObservableSource");
                us2VarApply.a(new QnHx(ht2Var, dCall, m70Var, this.z));
            } catch (Throwable th) {
                XTd3.w(th);
                try {
                    m70Var.accept(dCall);
                    ht2Var.c(yr0Var);
                    ht2Var.onError(th);
                } catch (Throwable th2) {
                    XTd3.w(th2);
                    CompositeException compositeException = new CompositeException(th, th2);
                    ht2Var.c(yr0Var);
                    ht2Var.onError(compositeException);
                }
            }
        } catch (Throwable th3) {
            XTd3.w(th3);
            ht2Var.c(yr0Var);
            ht2Var.onError(th3);
        }
    }
}
