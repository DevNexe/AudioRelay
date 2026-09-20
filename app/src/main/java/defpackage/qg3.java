package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qg3<T> extends tl3<T> {
    public static final QnHx[] x = new QnHx[0];
    public final AtomicReference<QnHx<T>[]> w = new AtomicReference<>(x);

    public static final class QnHx<T> extends AtomicBoolean implements vl0 {
        public final ht2<? super T> w;
        public final qg3<T> x;

        public QnHx(ht2<? super T> ht2Var, qg3<T> qg3Var) {
            this.w = ht2Var;
            this.x = qg3Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (compareAndSet(false, true)) {
                this.x.G(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get();
        }
    }

    public final void G(QnHx<T> qnHx) {
        boolean z;
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
            QnHx<T>[] qnHxArr = atomicReference.get();
            QnHx<T>[] qnHxArr2 = x;
            if (qnHxArr == qnHxArr2) {
                return;
            }
            int length = qnHxArr.length;
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qnHxArr[i] == qnHx) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                qnHxArr2 = new QnHx[length - 1];
                System.arraycopy(qnHxArr, 0, qnHxArr2, 0, i);
                System.arraycopy(qnHxArr, i + 1, qnHxArr2, i, (length - i) - 1);
            }
            do {
                if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr);
        } while (!z);
    }

    @Override // defpackage.tl3, defpackage.m70
    public final void accept(T t) {
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        for (QnHx<T> qnHx : this.w.get()) {
            if (!qnHx.get()) {
                qnHx.w.g(t);
            }
        }
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        boolean z;
        QnHx<T> qnHx = new QnHx<>(ht2Var, this);
        ht2Var.c(qnHx);
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
            QnHx<T>[] qnHxArr = atomicReference.get();
            int length = qnHxArr.length;
            QnHx<T>[] qnHxArr2 = new QnHx[length + 1];
            z = false;
            System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
            qnHxArr2[length] = qnHx;
            do {
                if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr);
        } while (!z);
        if (qnHx.get()) {
            G(qnHx);
        }
    }
}
