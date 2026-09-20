package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class j11<T> extends MZ<T, T> {
    public final boolean A;
    public final InterfaceC1443fH B;
    public final int y;
    public final boolean z;

    public static final class QnHx<T> extends e9<T> implements v11<T> {
        public mw4 A;
        public volatile boolean B;
        public volatile boolean C;
        public Throwable D;
        public final AtomicLong E = new AtomicLong();
        public boolean F;
        public final gw4<? super T> w;
        public final tk4<T> x;
        public final boolean y;
        public final InterfaceC1443fH z;

        public QnHx(gw4<? super T> gw4Var, int i, boolean z, boolean z2, InterfaceC1443fH interfaceC1443fH) {
            this.w = gw4Var;
            this.z = interfaceC1443fH;
            this.y = z2;
            this.x = z ? new jr4<>(i) : new ir4<>(i);
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (this.F || !qw4.l(j)) {
                return;
            }
            ps0.h(this.E, j);
            f();
        }

        @Override // defpackage.gw4
        public final void b() {
            this.C = true;
            if (this.F) {
                this.w.b();
            } else {
                f();
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            if (this.B) {
                return;
            }
            this.B = true;
            this.A.cancel();
            if (this.F || getAndIncrement() != 0) {
                return;
            }
            this.x.clear();
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.x.clear();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.A, mw4Var)) {
                this.A = mw4Var;
                this.w.d(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        public final boolean e(boolean z, boolean z2, gw4<? super T> gw4Var) {
            if (this.B) {
                this.x.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.y) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.D;
                if (th != null) {
                    gw4Var.onError(th);
                } else {
                    gw4Var.b();
                }
                return true;
            }
            Throwable th2 = this.D;
            if (th2 != null) {
                this.x.clear();
                gw4Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            gw4Var.b();
            return true;
        }

        public final void f() {
            if (getAndIncrement() == 0) {
                tk4<T> tk4Var = this.x;
                gw4<? super T> gw4Var = this.w;
                int iAddAndGet = 1;
                while (!e(this.C, tk4Var.isEmpty(), gw4Var)) {
                    long j = this.E.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.C;
                        T tPoll = tk4Var.poll();
                        boolean z2 = tPoll == null;
                        if (e(z, z2, gw4Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        gw4Var.g(tPoll);
                        j2++;
                    }
                    if (j2 == j && e(this.C, tk4Var.isEmpty(), gw4Var)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.E.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.x.offer(t)) {
                if (this.F) {
                    this.w.g(null);
                    return;
                } else {
                    f();
                    return;
                }
            }
            this.A.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.z.run();
            } catch (Throwable th) {
                XTd3.w(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.x.isEmpty();
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.F = true;
            return 2;
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            this.D = th;
            this.C = true;
            if (this.F) {
                this.w.onError(th);
            } else {
                f();
            }
        }

        @Override // defpackage.uk4
        public final T poll() {
            return this.x.poll();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(f11 f11Var, int i) {
        super(f11Var);
        m91.T23 t23 = m91.c;
        this.y = i;
        this.z = true;
        this.A = false;
        this.B = t23;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var, this.y, this.z, this.A, this.B));
    }
}
