package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class qs2<T> extends vk4<T> {
    public final us2<? extends T> w;
    public final T x = null;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public boolean A;
        public final ml4<? super T> w;
        public final T x;
        public vl0 y;
        public T z;

        public QnHx(ml4<? super T> ml4Var, T t) {
            this.w = ml4Var;
            this.x = t;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.A) {
                return;
            }
            this.A = true;
            T t = this.z;
            this.z = null;
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
            if (this.A) {
                return;
            }
            if (this.z == null) {
                this.z = t;
                return;
            }
            this.A = true;
            this.y.a();
            this.w.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.A) {
                m14.b(th);
            } else {
                this.A = true;
                this.w.onError(th);
            }
        }
    }

    public qs2(dr2 dr2Var) {
        this.w = dr2Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.a(new QnHx(ml4Var, this.x));
    }
}
