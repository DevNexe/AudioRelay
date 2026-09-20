package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class sx extends qw {
    public final tx w;
    public final i91<? super Throwable, ? extends tx> x;

    public static final class QnHx extends AtomicReference<vl0> implements nx, vl0 {
        public final nx w;
        public final i91<? super Throwable, ? extends tx> x;
        public boolean y;

        public QnHx(nx nxVar, i91<? super Throwable, ? extends tx> i91Var) {
            this.w = nxVar;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            bm0.g(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            boolean z = this.y;
            nx nxVar = this.w;
            if (z) {
                nxVar.onError(th);
                return;
            }
            this.y = true;
            try {
                tx txVarApply = this.x.apply(th);
                mq2.b(txVarApply, "The errorMapper returned a null CompletableSource");
                txVarApply.b(this);
            } catch (Throwable th2) {
                XTd3.w(th2);
                nxVar.onError(new CompositeException(th, th2));
            }
        }
    }

    public sx(tx txVar, i91<? super Throwable, ? extends tx> i91Var) {
        this.w = txVar;
        this.x = i91Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        QnHx qnHx = new QnHx(nxVar, this.x);
        nxVar.c(qnHx);
        this.w.b(qnHx);
    }
}
