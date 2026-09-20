package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class ox extends qw {
    public final tx w;
    public final pa3<? super Throwable> x;

    public final class QnHx implements nx {
        public final nx w;

        public QnHx(nx nxVar) {
            this.w = nxVar;
        }

        @Override // defpackage.nx
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            this.w.c(vl0Var);
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            nx nxVar = this.w;
            try {
                if (ox.this.x.test(th)) {
                    nxVar.b();
                } else {
                    nxVar.onError(th);
                }
            } catch (Throwable th2) {
                XTd3.w(th2);
                nxVar.onError(new CompositeException(th, th2));
            }
        }
    }

    public ox(tx txVar) {
        m91.Xn1 xn1 = m91.f;
        this.w = txVar;
        this.x = xn1;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar));
    }
}
