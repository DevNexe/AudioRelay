package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class s11<T> extends MZ<T, T> {
    public final T y;
    public final boolean z;

    public static final class QnHx<T> extends qi0<T> implements v11<T> {
        public mw4 A;
        public boolean B;
        public final T y;
        public final boolean z;

        public QnHx(gw4<? super T> gw4Var, T t, boolean z) {
            super(gw4Var);
            this.y = t;
            this.z = z;
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.B) {
                return;
            }
            this.B = true;
            T t = this.x;
            this.x = null;
            if (t == null) {
                t = this.y;
            }
            if (t != null) {
                e(t);
                return;
            }
            boolean z = this.z;
            gw4<? super T> gw4Var = this.w;
            if (z) {
                gw4Var.onError(new NoSuchElementException());
            } else {
                gw4Var.b();
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            set(4);
            this.x = null;
            this.A.cancel();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.A, mw4Var)) {
                this.A = mw4Var;
                this.w.d(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.B) {
                return;
            }
            if (this.x == null) {
                this.x = t;
                return;
            }
            this.B = true;
            this.A.cancel();
            this.w.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.B) {
                m14.b(th);
            } else {
                this.B = true;
                this.w.onError(th);
            }
        }
    }

    public s11(a11<T> a11Var, T t, boolean z) {
        super(a11Var);
        this.y = t;
        this.z = z;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var, this.y, this.z));
    }
}
