package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ey<R> extends qw {
    public final Callable<R> w;
    public final i91<? super R, ? extends tx> x;
    public final m70<? super R> y;
    public final boolean z = true;

    public static final class QnHx<R> extends AtomicReference<Object> implements nx, vl0 {
        public final nx w;
        public final m70<? super R> x;
        public final boolean y;
        public vl0 z;

        public QnHx(nx nxVar, R r, m70<? super R> m70Var, boolean z) {
            super(r);
            this.w = nxVar;
            this.x = m70Var;
            this.y = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z.a();
            this.z = bm0.DISPOSED;
            d();
        }

        @Override // defpackage.nx
        public final void b() {
            this.z = bm0.DISPOSED;
            nx nxVar = this.w;
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
                    nxVar.onError(th);
                    return;
                }
            }
            nxVar.b();
            if (z) {
                return;
            }
            d();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
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

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.e();
        }

        @Override // defpackage.nx
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
            d();
        }
    }

    public ey(Callable callable, hMT hmt, sn2 sn2Var) {
        this.w = callable;
        this.x = hmt;
        this.y = sn2Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        m70<? super R> m70Var = this.y;
        boolean z = this.z;
        yr0 yr0Var = yr0.INSTANCE;
        try {
            R rCall = this.w.call();
            try {
                tx txVarApply = this.x.apply(rCall);
                mq2.b(txVarApply, "The completableFunction returned a null CompletableSource");
                txVarApply.b(new QnHx(nxVar, rCall, m70Var, z));
            } catch (Throwable th) {
                XTd3.w(th);
                if (z) {
                    try {
                        m70Var.accept(rCall);
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        CompositeException compositeException = new CompositeException(th, th2);
                        nxVar.c(yr0Var);
                        nxVar.onError(compositeException);
                        return;
                    }
                }
                nxVar.c(yr0Var);
                nxVar.onError(th);
                if (z) {
                    return;
                }
                try {
                    m70Var.accept(rCall);
                } catch (Throwable th3) {
                    XTd3.w(th3);
                    m14.b(th3);
                }
            }
        } catch (Throwable th4) {
            XTd3.w(th4);
            nxVar.c(yr0Var);
            nxVar.onError(th4);
        }
    }
}
