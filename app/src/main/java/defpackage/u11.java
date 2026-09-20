package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class u11<T> extends vk4<T> implements n91<T> {
    public final a11<T> w;
    public final T x = null;

    public static final class QnHx<T> implements v11<T>, vl0 {
        public T A;
        public final ml4<? super T> w;
        public final T x;
        public mw4 y;
        public boolean z;

        public QnHx(ml4<? super T> ml4Var, T t) {
            this.w = ml4Var;
            this.x = t;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.cancel();
            this.y = qw4.CANCELLED;
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.z) {
                return;
            }
            this.z = true;
            this.y = qw4.CANCELLED;
            T t = this.A;
            this.A = null;
            if (t == null) {
                t = this.x;
            }
            ml4<? super T> ml4Var = this.w;
            if (t != null) {
                ml4Var.onSuccess(t);
            } else {
                ml4Var.onError(new NoSuchElementException());
            }
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.y, mw4Var)) {
                this.y = mw4Var;
                this.w.c(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y == qw4.CANCELLED;
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.z) {
                return;
            }
            if (this.A == null) {
                this.A = t;
                return;
            }
            this.z = true;
            this.y.cancel();
            this.y = qw4.CANCELLED;
            this.w.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.z) {
                m14.b(th);
                return;
            }
            this.z = true;
            this.y = qw4.CANCELLED;
            this.w.onError(th);
        }
    }

    public u11(q11 q11Var) {
        this.w = q11Var;
    }

    @Override // defpackage.n91
    public final s11 d() {
        return new s11(this.w, this.x, true);
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.e(new QnHx(ml4Var, this.x));
    }
}
