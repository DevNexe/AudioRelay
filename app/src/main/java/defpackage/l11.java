package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class l11<T> extends MZ<T, T> {

    public static final class QnHx<T> extends AtomicLong implements v11<T>, mw4 {
        public final gw4<? super T> w;
        public mw4 x;
        public boolean y;

        public QnHx(gw4<? super T> gw4Var) {
            this.w = gw4Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                ps0.h(this, j);
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
            this.x.cancel();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.x, mw4Var)) {
                this.x = mw4Var;
                this.w.d(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.y) {
                return;
            }
            if (get() != 0) {
                this.w.g(t);
                ps0.c0(this, 1L);
            } else {
                this.x.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.y) {
                m14.b(th);
            } else {
                this.y = true;
                this.w.onError(th);
            }
        }
    }

    public l11(f11 f11Var) {
        super(f11Var);
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var));
    }
}
