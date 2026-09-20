package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class uw extends qw {
    public final px w;

    public static final class QnHx extends AtomicReference<vl0> implements bx, vl0 {
        public final nx w;

        public QnHx(nx nxVar) {
            this.w = nxVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        public final void b() {
            vl0 andSet;
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || (andSet = getAndSet(bm0Var)) == bm0Var) {
                return;
            }
            try {
                this.w.b();
            } finally {
                if (andSet != null) {
                    andSet.a();
                }
            }
        }

        public final boolean c(Throwable th) {
            vl0 andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || (andSet = getAndSet(bm0Var)) == bm0Var) {
                return false;
            }
            try {
                this.w.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.a();
                }
            }
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

    public uw(px pxVar) {
        this.w = pxVar;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        QnHx qnHx = new QnHx(nxVar);
        nxVar.c(qnHx);
        try {
            this.w.d(qnHx);
        } catch (Throwable th) {
            XTd3.w(th);
            if (qnHx.c(th)) {
                return;
            }
            m14.b(th);
        }
    }
}
