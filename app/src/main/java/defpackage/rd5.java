package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rd5<T> extends n11<T> {
    public volatile boolean A;
    public Throwable B;
    public final AtomicReference<gw4<? super T>> C;
    public volatile boolean D;
    public final AtomicBoolean E;
    public final QnHx F;
    public final AtomicLong G;
    public boolean H;
    public final jr4<T> x;
    public final AtomicReference<Runnable> y;
    public final boolean z;

    public final class QnHx extends e9<T> {
        public QnHx() {
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                rd5 rd5Var = rd5.this;
                ps0.h(rd5Var.G, j);
                rd5Var.j();
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            if (rd5.this.D) {
                return;
            }
            rd5.this.D = true;
            Runnable andSet = rd5.this.y.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            rd5.this.C.lazySet(null);
            if (rd5.this.F.getAndIncrement() == 0) {
                rd5.this.C.lazySet(null);
                rd5 rd5Var = rd5.this;
                if (rd5Var.H) {
                    return;
                }
                rd5Var.x.clear();
            }
        }

        @Override // defpackage.uk4
        public final void clear() {
            rd5.this.x.clear();
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return rd5.this.x.isEmpty();
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            rd5.this.H = true;
            return 2;
        }

        @Override // defpackage.uk4
        public final T poll() {
            return rd5.this.x.poll();
        }
    }

    public rd5() {
        mq2.c(8, "capacityHint");
        this.x = new jr4<>(8);
        this.y = new AtomicReference<>(null);
        this.z = true;
        this.C = new AtomicReference<>();
        this.E = new AtomicBoolean();
        this.F = new QnHx();
        this.G = new AtomicLong();
    }

    @Override // defpackage.gw4
    public final void b() {
        if (this.A || this.D) {
            return;
        }
        this.A = true;
        Runnable andSet = this.y.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        j();
    }

    @Override // defpackage.gw4
    public final void d(mw4 mw4Var) {
        if (this.A || this.D) {
            mw4Var.cancel();
        } else {
            mw4Var.a(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        if (this.E.get() || !this.E.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            gw4Var.d(js0.INSTANCE);
            gw4Var.onError(illegalStateException);
        } else {
            gw4Var.d(this.F);
            this.C.set(gw4Var);
            if (this.D) {
                this.C.lazySet(null);
            } else {
                j();
            }
        }
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.A || this.D) {
            return;
        }
        this.x.offer(t);
        j();
    }

    public final boolean i(boolean z, boolean z2, boolean z3, gw4<? super T> gw4Var, jr4<T> jr4Var) {
        if (this.D) {
            jr4Var.clear();
            this.C.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.B != null) {
            jr4Var.clear();
            this.C.lazySet(null);
            gw4Var.onError(this.B);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.B;
        this.C.lazySet(null);
        if (th != null) {
            gw4Var.onError(th);
        } else {
            gw4Var.b();
        }
        return true;
    }

    public final void j() {
        long j;
        if (this.F.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        gw4<? super T> gw4Var = this.C.get();
        int iAddAndGet2 = 1;
        while (gw4Var == null) {
            iAddAndGet2 = this.F.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
            gw4Var = this.C.get();
            iAddAndGet = 1;
        }
        if (this.H) {
            jr4<T> jr4Var = this.x;
            int i = (this.z ? 1 : 0) ^ iAddAndGet;
            while (!this.D) {
                boolean z = this.A;
                if (i != 0 && z && this.B != null) {
                    jr4Var.clear();
                    this.C.lazySet(null);
                    gw4Var.onError(this.B);
                    return;
                }
                gw4Var.g(null);
                if (z) {
                    this.C.lazySet(null);
                    Throwable th = this.B;
                    if (th != null) {
                        gw4Var.onError(th);
                        return;
                    } else {
                        gw4Var.b();
                        return;
                    }
                }
                iAddAndGet = this.F.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.C.lazySet(null);
            return;
        }
        jr4<T> jr4Var2 = this.x;
        boolean z2 = !this.z;
        int iAddAndGet3 = 1;
        do {
            long j2 = this.G.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.A;
                T tPoll = jr4Var2.poll();
                boolean z4 = tPoll == null;
                j = j3;
                if (i(z2, z3, z4, gw4Var, jr4Var2)) {
                    return;
                }
                if (z4) {
                    break;
                }
                gw4Var.g(tPoll);
                j3 = j + 1;
            }
            if (j2 == j3 && i(z2, this.A, jr4Var2.isEmpty(), gw4Var, jr4Var2)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.G.addAndGet(-j);
            }
            iAddAndGet3 = this.F.addAndGet(-iAddAndGet3);
        } while (iAddAndGet3 != 0);
    }

    @Override // defpackage.gw4
    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.A || this.D) {
            m14.b(th);
            return;
        }
        this.B = th;
        this.A = true;
        Runnable andSet = this.y.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        j();
    }
}
