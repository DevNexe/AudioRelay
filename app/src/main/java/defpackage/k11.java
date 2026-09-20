package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class k11<T> extends MZ<T, T> implements m70<T> {
    public final k11 y;

    public static final class QnHx<T> extends AtomicLong implements v11<T>, mw4 {
        public final gw4<? super T> w;
        public final m70<? super T> x;
        public mw4 y;
        public boolean z;

        public QnHx(gw4 gw4Var, k11 k11Var) {
            this.w = gw4Var;
            this.x = k11Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                ps0.h(this, j);
            }
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.z) {
                return;
            }
            this.z = true;
            this.w.b();
        }

        @Override // defpackage.mw4
        public final void cancel() {
            this.y.cancel();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.y, mw4Var)) {
                this.y = mw4Var;
                this.w.d(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.z) {
                return;
            }
            if (get() != 0) {
                this.w.g(t);
                ps0.c0(this, 1L);
                return;
            }
            try {
                this.x.accept(t);
            } catch (Throwable th) {
                XTd3.w(th);
                cancel();
                onError(th);
            }
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.z) {
                m14.b(th);
            } else {
                this.z = true;
                this.w.onError(th);
            }
        }
    }

    public k11(a11<T> a11Var) {
        super(a11Var);
        this.y = this;
    }

    @Override // defpackage.m70
    public final void accept(T t) {
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var, this.y));
    }
}
