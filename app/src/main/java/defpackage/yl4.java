package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class yl4<T, U> extends vk4<T> {
    public final Callable<U> w;
    public final i91<? super U, ? extends rl4<? extends T>> x;
    public final m70<? super U> y;
    public final boolean z = true;

    public static final class QnHx<T, U> extends AtomicReference<Object> implements ml4<T>, vl0 {
        public final ml4<? super T> w;
        public final m70<? super U> x;
        public final boolean y;
        public vl0 z;

        public QnHx(ml4<? super T> ml4Var, U u, boolean z, m70<? super U> m70Var) {
            super(u);
            this.w = ml4Var;
            this.y = z;
            this.x = m70Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z.a();
            this.z = bm0.DISPOSED;
            b();
        }

        public final void b() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.x.accept(andSet);
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            }
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.e();
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.z = bm0.DISPOSED;
            boolean z = this.y;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.x.accept(andSet);
                } catch (Throwable th2) {
                    XTd3.w(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.w.onError(th);
            if (z) {
                return;
            }
            b();
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.z = bm0.DISPOSED;
            ml4<? super T> ml4Var = this.w;
            boolean z = this.y;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.x.accept(andSet);
                } catch (Throwable th) {
                    XTd3.w(th);
                    ml4Var.onError(th);
                    return;
                }
            }
            ml4Var.onSuccess(t);
            if (z) {
                return;
            }
            b();
        }
    }

    public yl4(ma maVar, om3 om3Var, sn2 sn2Var) {
        this.w = maVar;
        this.x = om3Var;
        this.y = sn2Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        yr0 yr0Var = yr0.INSTANCE;
        m70<? super U> m70Var = this.y;
        boolean z = this.z;
        try {
            U uCall = this.w.call();
            try {
                rl4<? extends T> rl4VarApply = this.x.apply(uCall);
                mq2.b(rl4VarApply, "The singleFunction returned a null SingleSource");
                rl4VarApply.b(new QnHx(ml4Var, uCall, z, m70Var));
            } catch (Throwable th) {
                th = th;
                XTd3.w(th);
                if (z) {
                    try {
                        m70Var.accept(uCall);
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                ml4Var.c(yr0Var);
                ml4Var.onError(th);
                if (z) {
                    return;
                }
                try {
                    m70Var.accept(uCall);
                } catch (Throwable th3) {
                    XTd3.w(th3);
                    m14.b(th3);
                }
            }
        } catch (Throwable th4) {
            XTd3.w(th4);
            ml4Var.c(yr0Var);
            ml4Var.onError(th4);
        }
    }
}
