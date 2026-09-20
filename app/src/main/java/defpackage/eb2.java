package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class eb2<T> extends qw {
    public final jb2<T> w;
    public final i91<? super T, ? extends tx> x;

    public static final class QnHx<T> extends AtomicReference<vl0> implements gb2<T>, nx, vl0 {
        public final nx w;
        public final i91<? super T, ? extends tx> x;

        public QnHx(nx nxVar, i91<? super T, ? extends tx> i91Var) {
            this.w = nxVar;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.gb2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            bm0.g(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            try {
                tx txVarApply = this.x.apply(t);
                mq2.b(txVarApply, "The mapper returned a null CompletableSource");
                tx txVar = txVarApply;
                if (e()) {
                    return;
                }
                txVar.b(this);
            } catch (Throwable th) {
                XTd3.w(th);
                onError(th);
            }
        }
    }

    public eb2(db2 db2Var, gm3 gm3Var) {
        this.w = db2Var;
        this.x = gm3Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        QnHx qnHx = new QnHx(nxVar, this.x);
        nxVar.c(qnHx);
        this.w.a(qnHx);
    }
}
