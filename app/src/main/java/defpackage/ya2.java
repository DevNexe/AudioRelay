package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ya2<T> extends xa2<T> {
    public final im3 w;

    public static final class QnHx<T> extends AtomicReference<vl0> implements vl0 {
        public final gb2<? super T> w;

        public QnHx(gb2<? super T> gb2Var) {
            this.w = gb2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", QnHx.class.getSimpleName(), super.toString());
        }
    }

    public ya2(im3 im3Var) {
        this.w = im3Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        boolean z;
        vl0 andSet;
        QnHx qnHx = new QnHx(gb2Var);
        gb2Var.c(qnHx);
        try {
            this.w.g(qnHx);
        } catch (Throwable th) {
            XTd3.w(th);
            vl0 vl0Var = qnHx.get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || (andSet = qnHx.getAndSet(bm0Var)) == bm0Var) {
                z = false;
            } else {
                try {
                    qnHx.w.onError(th);
                    if (andSet != null) {
                        andSet.a();
                    }
                    z = true;
                } catch (Throwable th2) {
                    if (andSet != null) {
                        andSet.a();
                    }
                    throw th2;
                }
            }
            if (z) {
                return;
            }
            m14.b(th);
        }
    }
}
