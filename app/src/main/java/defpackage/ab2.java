package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ab2<T> extends xa2<T> {
    public final jb2<T> w;
    public final tx x;

    public static final class CQf<T> extends AtomicReference<vl0> implements nx, vl0 {
        public final gb2<? super T> w;
        public final jb2<T> x;

        public CQf(gb2<? super T> gb2Var, jb2<T> jb2Var) {
            this.w = gb2Var;
            this.x = jb2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            this.x.a(new QnHx(this.w, this));
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public static final class QnHx<T> implements gb2<T> {
        public final AtomicReference<vl0> w;
        public final gb2<? super T> x;

        public QnHx(gb2 gb2Var, AtomicReference atomicReference) {
            this.w = atomicReference;
            this.x = gb2Var;
        }

        @Override // defpackage.gb2
        public final void b() {
            this.x.b();
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            bm0.g(this.w, vl0Var);
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            this.x.onError(th);
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            this.x.onSuccess(t);
        }
    }

    public ab2(za2 za2Var, fx fxVar) {
        this.w = za2Var;
        this.x = fxVar;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.x.b(new CQf(gb2Var, this.w));
    }
}
