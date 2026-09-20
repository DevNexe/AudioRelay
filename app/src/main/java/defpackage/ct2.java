package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ct2<T> extends Z<T, T> {
    public final long x;
    public final TimeUnit y;
    public final c54 z;

    public static final class QnHx<T> extends AtomicReference<vl0> implements ht2<T>, vl0, Runnable {
        public vl0 A;
        public volatile boolean B;
        public boolean C;
        public final ht2<? super T> w;
        public final long x;
        public final TimeUnit y;
        public final c54.F1 z;

        public QnHx(eb4 eb4Var, long j, TimeUnit timeUnit, c54.F1 f1) {
            this.w = eb4Var;
            this.x = j;
            this.y = timeUnit;
            this.z = f1;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.A.a();
            this.z.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.C) {
                return;
            }
            this.C = true;
            this.w.b();
            this.z.a();
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
            return this.z.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.B || this.C) {
                return;
            }
            this.B = true;
            this.w.g(t);
            vl0 vl0Var = get();
            if (vl0Var != null) {
                vl0Var.a();
            }
            bm0.g(this, this.z.d(this, this.x, this.y));
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.C) {
                m14.b(th);
                return;
            }
            this.C = true;
            this.w.onError(th);
            this.z.a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.B = false;
        }
    }

    public ct2(vq2 vq2Var, TimeUnit timeUnit, c54 c54Var) {
        super(vq2Var);
        this.x = 100L;
        this.y = timeUnit;
        this.z = c54Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(new eb4(ht2Var), this.x, this.y, this.z.a()));
    }
}
