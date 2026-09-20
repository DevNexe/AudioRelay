package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class rx extends qw {
    public final InterfaceC1443fH A;
    public final InterfaceC1443fH B;
    public final InterfaceC1443fH C;
    public final tx w;
    public final m70<? super vl0> x;
    public final m70<? super Throwable> y;
    public final InterfaceC1443fH z;

    public final class QnHx implements nx, vl0 {
        public final nx w;
        public vl0 x;

        public QnHx(nx nxVar) {
            this.w = nxVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            try {
                rx.this.C.run();
            } catch (Throwable th) {
                XTd3.w(th);
                m14.b(th);
            }
            this.x.a();
        }

        @Override // defpackage.nx
        public final void b() {
            nx nxVar = this.w;
            rx rxVar = rx.this;
            if (this.x == bm0.DISPOSED) {
                return;
            }
            try {
                rxVar.z.run();
                rxVar.A.run();
                nxVar.b();
                try {
                    rxVar.B.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                nxVar.onError(th2);
            }
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            nx nxVar = this.w;
            try {
                rx.this.x.accept(vl0Var);
                if (bm0.p(this.x, vl0Var)) {
                    this.x = vl0Var;
                    nxVar.c(this);
                }
            } catch (Throwable th) {
                XTd3.w(th);
                vl0Var.a();
                this.x = bm0.DISPOSED;
                nxVar.c(yr0.INSTANCE);
                nxVar.onError(th);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            rx rxVar = rx.this;
            if (this.x == bm0.DISPOSED) {
                m14.b(th);
                return;
            }
            try {
                rxVar.y.accept(th);
                rxVar.A.run();
            } catch (Throwable th2) {
                XTd3.w(th2);
                th = new CompositeException(th, th2);
            }
            this.w.onError(th);
            try {
                rxVar.B.run();
            } catch (Throwable th3) {
                XTd3.w(th3);
                m14.b(th3);
            }
        }
    }

    public rx(tx txVar, m70 m70Var, m70 m70Var2, InterfaceC1443fH interfaceC1443fH, InterfaceC1443fH interfaceC1443fH2) {
        m91.T23 t23 = m91.c;
        this.w = txVar;
        this.x = m70Var;
        this.y = m70Var2;
        this.z = interfaceC1443fH;
        this.A = t23;
        this.B = t23;
        this.C = interfaceC1443fH2;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar));
    }
}
