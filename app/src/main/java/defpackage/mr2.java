package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class mr2<T> extends vk4<T> implements p91<T> {
    public final us2<T> w;
    public final long x = 0;
    public final T y = null;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public long A;
        public boolean B;
        public final ml4<? super T> w;
        public final long x;
        public final T y;
        public vl0 z;

        public QnHx(ml4<? super T> ml4Var, long j, T t) {
            this.w = ml4Var;
            this.x = j;
            this.y = t;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.B) {
                return;
            }
            this.B = true;
            ml4<? super T> ml4Var = this.w;
            T t = this.y;
            if (t != null) {
                ml4Var.onSuccess(t);
            } else {
                ml4Var.onError(new NoSuchElementException());
            }
        }

        @Override // defpackage.ht2
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

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.B) {
                return;
            }
            long j = this.A;
            if (j != this.x) {
                this.A = j + 1;
                return;
            }
            this.B = true;
            this.z.a();
            this.w.onSuccess(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.B) {
                m14.b(th);
            } else {
                this.B = true;
                this.w.onError(th);
            }
        }
    }

    public mr2(us2 us2Var) {
        this.w = us2Var;
    }

    @Override // defpackage.p91
    public final vq2<T> a() {
        return new lr2(this.w, this.x, this.y);
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.a(new QnHx(ml4Var, this.x, this.y));
    }
}
