package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class w11<T> extends MZ<T, T> {
    public final long y;

    public static final class QnHx<T> extends AtomicBoolean implements v11<T>, mw4 {
        public long A;
        public final gw4<? super T> w;
        public final long x;
        public boolean y;
        public mw4 z;

        public QnHx(gw4<? super T> gw4Var, long j) {
            this.w = gw4Var;
            this.x = j;
            this.A = j;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                if (get() || !compareAndSet(false, true) || j < this.x) {
                    this.z.a(j);
                } else {
                    this.z.a(Long.MAX_VALUE);
                }
            }
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.y) {
                return;
            }
            this.y = true;
            this.w.b();
        }

        @Override // defpackage.mw4
        public final void cancel() {
            this.z.cancel();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.z, mw4Var)) {
                this.z = mw4Var;
                long j = this.x;
                gw4<? super T> gw4Var = this.w;
                if (j != 0) {
                    gw4Var.d(this);
                    return;
                }
                mw4Var.cancel();
                this.y = true;
                gw4Var.d(js0.INSTANCE);
                gw4Var.b();
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.y) {
                return;
            }
            long j = this.A;
            long j2 = j - 1;
            this.A = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.w.g(t);
                if (z) {
                    this.z.cancel();
                    b();
                }
            }
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.y) {
                m14.b(th);
                return;
            }
            this.y = true;
            this.z.cancel();
            this.w.onError(th);
        }
    }

    public w11(y11 y11Var) {
        super(y11Var);
        this.y = 1L;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var, this.y));
    }
}
