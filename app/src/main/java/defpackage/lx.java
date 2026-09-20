package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lx extends qw {
    public final Iterable<? extends tx> w;

    public static final class QnHx extends AtomicBoolean implements nx {
        public final h40 w;
        public final nx x;
        public final AtomicInteger y;

        public QnHx(nx nxVar, h40 h40Var, AtomicInteger atomicInteger) {
            this.x = nxVar;
            this.w = h40Var;
            this.y = atomicInteger;
        }

        @Override // defpackage.nx
        public final void b() {
            if (this.y.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.x.b();
            }
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            this.w.b(vl0Var);
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.w.a();
            if (compareAndSet(false, true)) {
                this.x.onError(th);
            } else {
                m14.b(th);
            }
        }
    }

    public lx(Iterable<? extends tx> iterable) {
        this.w = iterable;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        h40 h40Var = new h40();
        nxVar.c(h40Var);
        try {
            Iterator<? extends tx> it = this.w.iterator();
            mq2.b(it, "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            QnHx qnHx = new QnHx(nxVar, h40Var, atomicInteger);
            while (!h40Var.x) {
                try {
                    if (!it.hasNext()) {
                        qnHx.b();
                        return;
                    }
                    if (h40Var.x) {
                        return;
                    }
                    try {
                        tx next = it.next();
                        mq2.b(next, "The iterator returned a null CompletableSource");
                        tx txVar = next;
                        if (h40Var.x) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        txVar.b(qnHx);
                    } catch (Throwable th) {
                        XTd3.w(th);
                        h40Var.a();
                        qnHx.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    XTd3.w(th2);
                    h40Var.a();
                    qnHx.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            XTd3.w(th3);
            nxVar.onError(th3);
        }
    }
}
