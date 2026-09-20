package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m11<T> extends MZ<T, T> {

    public static final class QnHx<T> extends AtomicInteger implements v11<T>, mw4 {
        public volatile boolean A;
        public final AtomicLong B = new AtomicLong();
        public final AtomicReference<T> C = new AtomicReference<>();
        public final gw4<? super T> w;
        public mw4 x;
        public volatile boolean y;
        public Throwable z;

        public QnHx(gw4<? super T> gw4Var) {
            this.w = gw4Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                ps0.h(this.B, j);
                e();
            }
        }

        @Override // defpackage.gw4
        public final void b() {
            this.y = true;
            e();
        }

        public final boolean c(boolean z, boolean z2, gw4<?> gw4Var, AtomicReference<T> atomicReference) {
            if (this.A) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.z;
            if (th != null) {
                atomicReference.lazySet(null);
                gw4Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            gw4Var.b();
            return true;
        }

        @Override // defpackage.mw4
        public final void cancel() {
            if (this.A) {
                return;
            }
            this.A = true;
            this.x.cancel();
            if (getAndIncrement() == 0) {
                this.C.lazySet(null);
            }
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.x, mw4Var)) {
                this.x = mw4Var;
                this.w.d(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        public final void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            gw4<? super T> gw4Var = this.w;
            AtomicLong atomicLong = this.B;
            AtomicReference<T> atomicReference = this.C;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.y;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (c(z, z2, gw4Var, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    gw4Var.g(andSet);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (c(this.y, atomicReference.get() == null, gw4Var, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    ps0.c0(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            this.C.lazySet(t);
            e();
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            this.z = th;
            this.y = true;
            e();
        }
    }

    public m11(f11 f11Var) {
        super(f11Var);
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var));
    }
}
