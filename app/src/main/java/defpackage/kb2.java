package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class kb2<T, U> extends WE<T, T> {
    public final jb2<U> x;
    public final jb2<? extends T> y;

    public static final class CQf<T, U> extends AtomicReference<vl0> implements gb2<T>, vl0 {
        public final gb2<? super T> w;
        public final F1<T, U> x = new F1<>(this);
        public final jb2<? extends T> y;
        public final QnHx<T> z;

        public CQf(gb2<? super T> gb2Var, jb2<? extends T> jb2Var) {
            this.w = gb2Var;
            this.y = jb2Var;
            this.z = jb2Var != null ? new QnHx<>(gb2Var) : null;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
            bm0.c(this.x);
            QnHx<T> qnHx = this.z;
            if (qnHx != null) {
                bm0.c(qnHx);
            }
        }

        @Override // defpackage.gb2
        public final void b() {
            bm0.c(this.x);
            bm0 bm0Var = bm0.DISPOSED;
            if (getAndSet(bm0Var) != bm0Var) {
                this.w.b();
            }
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            bm0.c(this.x);
            bm0 bm0Var = bm0.DISPOSED;
            if (getAndSet(bm0Var) != bm0Var) {
                this.w.onError(th);
            } else {
                m14.b(th);
            }
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            bm0.c(this.x);
            bm0 bm0Var = bm0.DISPOSED;
            if (getAndSet(bm0Var) != bm0Var) {
                this.w.onSuccess(t);
            }
        }
    }

    public static final class F1<T, U> extends AtomicReference<vl0> implements gb2<Object> {
        public final CQf<T, U> w;

        public F1(CQf<T, U> cQf) {
            this.w = cQf;
        }

        @Override // defpackage.gb2
        public final void b() {
            CQf<T, U> cQf = this.w;
            cQf.getClass();
            if (bm0.c(cQf)) {
                jb2<? extends T> jb2Var = cQf.y;
                if (jb2Var != null) {
                    jb2Var.a(cQf.z);
                } else {
                    cQf.w.onError(new TimeoutException());
                }
            }
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            CQf<T, U> cQf = this.w;
            cQf.getClass();
            if (bm0.c(cQf)) {
                cQf.w.onError(th);
            } else {
                m14.b(th);
            }
        }

        @Override // defpackage.gb2
        public final void onSuccess(Object obj) {
            CQf<T, U> cQf = this.w;
            cQf.getClass();
            if (bm0.c(cQf)) {
                jb2<? extends T> jb2Var = cQf.y;
                if (jb2Var != null) {
                    jb2Var.a(cQf.z);
                } else {
                    cQf.w.onError(new TimeoutException());
                }
            }
        }
    }

    public static final class QnHx<T> extends AtomicReference<vl0> implements gb2<T> {
        public final gb2<? super T> w;

        public QnHx(gb2<? super T> gb2Var) {
            this.w = gb2Var;
        }

        @Override // defpackage.gb2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }
    }

    public kb2(t11 t11Var, lb2 lb2Var, cb2 cb2Var) {
        super(t11Var);
        this.x = lb2Var;
        this.y = cb2Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        CQf cQf = new CQf(gb2Var, this.y);
        gb2Var.c(cQf);
        this.x.a(cQf.x);
        this.w.a(cQf);
    }
}
