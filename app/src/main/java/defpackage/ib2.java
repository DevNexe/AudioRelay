package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class ib2<T> extends WE<T, T> {
    public final InterfaceC1443fH A;
    public final InterfaceC1443fH B;
    public final InterfaceC1443fH C;
    public final m70<? super vl0> x;
    public final m70<? super T> y;
    public final m70<? super Throwable> z;

    public static final class QnHx<T> implements gb2<T>, vl0 {
        public final gb2<? super T> w;
        public final ib2<T> x;
        public vl0 y;

        public QnHx(gb2<? super T> gb2Var, ib2<T> ib2Var) {
            this.w = gb2Var;
            this.x = ib2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            try {
                this.x.C.run();
            } catch (Throwable th) {
                XTd3.w(th);
                m14.b(th);
            }
            this.y.a();
            this.y = bm0.DISPOSED;
        }

        @Override // defpackage.gb2
        public final void b() {
            ib2<T> ib2Var = this.x;
            vl0 vl0Var = this.y;
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var) {
                return;
            }
            try {
                ib2Var.A.run();
                this.y = bm0Var;
                this.w.b();
                try {
                    ib2Var.B.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                d(th2);
            }
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            gb2<? super T> gb2Var = this.w;
            if (bm0.p(this.y, vl0Var)) {
                try {
                    this.x.x.accept(vl0Var);
                    this.y = vl0Var;
                    gb2Var.c(this);
                } catch (Throwable th) {
                    XTd3.w(th);
                    vl0Var.a();
                    this.y = bm0.DISPOSED;
                    yr0.c(th, gb2Var);
                }
            }
        }

        public final void d(Throwable th) {
            ib2<T> ib2Var = this.x;
            try {
                ib2Var.z.accept(th);
            } catch (Throwable th2) {
                XTd3.w(th2);
                th = new CompositeException(th, th2);
            }
            this.y = bm0.DISPOSED;
            this.w.onError(th);
            try {
                ib2Var.B.run();
            } catch (Throwable th3) {
                XTd3.w(th3);
                m14.b(th3);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            if (this.y == bm0.DISPOSED) {
                m14.b(th);
            } else {
                d(th);
            }
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            ib2<T> ib2Var = this.x;
            vl0 vl0Var = this.y;
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var) {
                return;
            }
            try {
                ib2Var.y.accept(t);
                this.y = bm0Var;
                this.w.onSuccess(t);
                try {
                    ib2Var.B.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                d(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib2(jb2 jb2Var, m70 m70Var, m70 m70Var2) {
        super(jb2Var);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        this.x = byn;
        this.y = m70Var;
        this.z = m70Var2;
        this.A = t23;
        this.B = t23;
        this.C = t23;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.w.a(new QnHx(gb2Var, this));
    }
}
