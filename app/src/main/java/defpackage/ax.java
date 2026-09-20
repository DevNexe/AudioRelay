package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ax extends qw {
    public final tx w;
    public final InterfaceC1443fH x;

    public static final class QnHx extends AtomicInteger implements nx, vl0 {
        public final nx w;
        public final InterfaceC1443fH x;
        public vl0 y;

        public QnHx(nx nxVar, InterfaceC1443fH interfaceC1443fH) {
            this.w = nxVar;
            this.x = interfaceC1443fH;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
            d();
        }

        @Override // defpackage.nx
        public final void b() {
            this.w.b();
            d();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.x.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.w.onError(th);
            d();
        }
    }

    public ax(tx txVar, InterfaceC1443fH interfaceC1443fH) {
        this.w = txVar;
        this.x = interfaceC1443fH;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar, this.x));
    }
}
