package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vr2<T> extends vq2<T> {
    public final Iterable<? extends T> w;

    public static final class QnHx<T> extends g9<T> {
        public boolean A;
        public boolean B;
        public final ht2<? super T> w;
        public final Iterator<? extends T> x;
        public volatile boolean y;
        public boolean z;

        public QnHx(ht2<? super T> ht2Var, Iterator<? extends T> it) {
            this.w = ht2Var;
            this.x = it;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y = true;
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.A = true;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y;
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.A;
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.z = true;
            return 1;
        }

        @Override // defpackage.uk4
        public final T poll() {
            if (this.A) {
                return null;
            }
            boolean z = this.B;
            Iterator<? extends T> it = this.x;
            if (!z) {
                this.B = true;
            } else if (!it.hasNext()) {
                this.A = true;
                return null;
            }
            T next = it.next();
            mq2.b(next, "The iterator returned a null value");
            return next;
        }
    }

    public vr2(ArrayList arrayList) {
        this.w = arrayList;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        yr0 yr0Var = yr0.INSTANCE;
        try {
            Iterator<? extends T> it = this.w.iterator();
            try {
                if (!it.hasNext()) {
                    ht2Var.c(yr0Var);
                    ht2Var.b();
                    return;
                }
                QnHx qnHx = new QnHx(ht2Var, it);
                ht2Var.c(qnHx);
                if (qnHx.z) {
                    return;
                }
                while (!qnHx.y) {
                    try {
                        T next = qnHx.x.next();
                        mq2.b(next, "The iterator returned a null value");
                        qnHx.w.g(next);
                        if (qnHx.y) {
                            return;
                        }
                        try {
                            if (!qnHx.x.hasNext()) {
                                if (qnHx.y) {
                                    return;
                                }
                                qnHx.w.b();
                                return;
                            }
                        } catch (Throwable th) {
                            XTd3.w(th);
                            qnHx.w.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        qnHx.w.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                XTd3.w(th3);
                ht2Var.c(yr0Var);
                ht2Var.onError(th3);
            }
        } catch (Throwable th4) {
            XTd3.w(th4);
            ht2Var.c(yr0Var);
            ht2Var.onError(th4);
        }
    }
}
