package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class lr2<T> extends Z<T, T> {
    public final long x;
    public final T y;
    public final boolean z;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public vl0 A;
        public long B;
        public boolean C;
        public final ht2<? super T> w;
        public final long x;
        public final T y;
        public final boolean z;

        public QnHx(ht2<? super T> ht2Var, long j, T t, boolean z) {
            this.w = ht2Var;
            this.x = j;
            this.y = t;
            this.z = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.A.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.C) {
                return;
            }
            this.C = true;
            ht2<? super T> ht2Var = this.w;
            T t = this.y;
            if (t == null && this.z) {
                ht2Var.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                ht2Var.g(t);
            }
            ht2Var.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.A, vl0Var)) {
                this.A = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.A.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.C) {
                return;
            }
            long j = this.B;
            if (j != this.x) {
                this.B = j + 1;
                return;
            }
            this.C = true;
            this.A.a();
            ht2<? super T> ht2Var = this.w;
            ht2Var.g(t);
            ht2Var.b();
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.C) {
                m14.b(th);
            } else {
                this.C = true;
                this.w.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lr2(us2 us2Var, long j, Object obj) {
        super(us2Var);
        this.x = j;
        this.y = obj;
        this.z = true;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x, this.y, this.z));
    }
}
