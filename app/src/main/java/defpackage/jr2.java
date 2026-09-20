package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class jr2<T> extends Z<T, T> {
    public final InterfaceC1443fH A;
    public final m70<? super T> x;
    public final m70<? super Throwable> y;
    public final InterfaceC1443fH z;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final InterfaceC1443fH A;
        public vl0 B;
        public boolean C;
        public final ht2<? super T> w;
        public final m70<? super T> x;
        public final m70<? super Throwable> y;
        public final InterfaceC1443fH z;

        public QnHx(ht2<? super T> ht2Var, m70<? super T> m70Var, m70<? super Throwable> m70Var2, InterfaceC1443fH interfaceC1443fH, InterfaceC1443fH interfaceC1443fH2) {
            this.w = ht2Var;
            this.x = m70Var;
            this.y = m70Var2;
            this.z = interfaceC1443fH;
            this.A = interfaceC1443fH2;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.B.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.C) {
                return;
            }
            try {
                this.z.run();
                this.C = true;
                this.w.b();
                try {
                    this.A.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                onError(th2);
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.B, vl0Var)) {
                this.B = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.B.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.C) {
                return;
            }
            try {
                this.x.accept(t);
                this.w.g(t);
            } catch (Throwable th) {
                XTd3.w(th);
                this.B.a();
                onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.C) {
                m14.b(th);
                return;
            }
            this.C = true;
            try {
                this.y.accept(th);
            } catch (Throwable th2) {
                XTd3.w(th2);
                th = new CompositeException(th, th2);
            }
            this.w.onError(th);
            try {
                this.A.run();
            } catch (Throwable th3) {
                XTd3.w(th3);
                m14.b(th3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr2(us2 us2Var, m70 m70Var, m70 m70Var2, InterfaceC1443fH interfaceC1443fH) {
        super(us2Var);
        m91.T23 t23 = m91.c;
        this.x = m70Var;
        this.y = m70Var2;
        this.z = interfaceC1443fH;
        this.A = t23;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x, this.y, this.z, this.A));
    }
}
