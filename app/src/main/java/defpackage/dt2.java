package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class dt2<T> extends Z<T, T> {
    public final boolean A;
    public final long x;
    public final TimeUnit y;
    public final c54 z;

    public static final class QnHx<T> extends AtomicInteger implements ht2<T>, vl0, Runnable {
        public final boolean A;
        public final AtomicReference<T> B = new AtomicReference<>();
        public vl0 C;
        public volatile boolean D;
        public Throwable E;
        public volatile boolean F;
        public volatile boolean G;
        public boolean H;
        public final ht2<? super T> w;
        public final long x;
        public final TimeUnit y;
        public final c54.F1 z;

        public QnHx(ht2<? super T> ht2Var, long j, TimeUnit timeUnit, c54.F1 f1, boolean z) {
            this.w = ht2Var;
            this.x = j;
            this.y = timeUnit;
            this.z = f1;
            this.A = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.F = true;
            this.C.a();
            this.z.a();
            if (getAndIncrement() == 0) {
                this.B.lazySet(null);
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            this.D = true;
            d();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.C, vl0Var)) {
                this.C = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.B;
            ht2<? super T> ht2Var = this.w;
            int iAddAndGet = 1;
            while (!this.F) {
                boolean z = this.D;
                if (z && this.E != null) {
                    atomicReference.lazySet(null);
                    ht2Var.onError(this.E);
                    this.z.a();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.A) {
                        ht2Var.g(andSet);
                    }
                    ht2Var.b();
                    this.z.a();
                    return;
                }
                if (z2) {
                    if (this.G) {
                        this.H = false;
                        this.G = false;
                    }
                } else if (!this.H || this.G) {
                    ht2Var.g(atomicReference.getAndSet(null));
                    this.G = false;
                    this.H = true;
                    this.z.d(this, this.x, this.y);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.F;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.B.set(t);
            d();
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.E = th;
            this.D = true;
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.G = true;
            d();
        }
    }

    public dt2(vq2 vq2Var, long j, TimeUnit timeUnit, c54 c54Var) {
        super(vq2Var);
        this.x = j;
        this.y = timeUnit;
        this.z = c54Var;
        this.A = false;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x, this.y, this.z.a(), this.A));
    }
}
