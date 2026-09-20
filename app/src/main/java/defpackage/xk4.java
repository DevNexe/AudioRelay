package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class xk4<T> extends vk4<T> implements ml4<T> {
    public static final QnHx[] B = new QnHx[0];
    public static final QnHx[] C = new QnHx[0];
    public Throwable A;
    public final rl4<? extends T> w;
    public final AtomicInteger x = new AtomicInteger();
    public final AtomicReference<QnHx<T>[]> y = new AtomicReference<>(B);
    public T z;

    public static final class QnHx<T> extends AtomicBoolean implements vl0 {
        public final ml4<? super T> w;
        public final xk4<T> x;

        public QnHx(ml4<? super T> ml4Var, xk4<T> xk4Var) {
            this.w = ml4Var;
            this.x = xk4Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (compareAndSet(false, true)) {
                this.x.n(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get();
        }
    }

    public xk4(vk4 vk4Var) {
        this.w = vk4Var;
    }

    @Override // defpackage.ml4
    public final void c(vl0 vl0Var) {
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        boolean z;
        QnHx<T> qnHx = new QnHx<>(ml4Var, this);
        ml4Var.c(qnHx);
        while (true) {
            AtomicReference<QnHx<T>[]> atomicReference = this.y;
            QnHx<T>[] qnHxArr = atomicReference.get();
            z = false;
            if (qnHxArr == C) {
                break;
            }
            int length = qnHxArr.length;
            QnHx<T>[] qnHxArr2 = new QnHx[length + 1];
            System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
            qnHxArr2[length] = qnHx;
            do {
                if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr);
            if (z) {
                z = true;
                break;
            }
        }
        if (z) {
            if (qnHx.get()) {
                n(qnHx);
            }
            if (this.x.getAndIncrement() == 0) {
                this.w.b(this);
                return;
            }
            return;
        }
        Throwable th = this.A;
        if (th != null) {
            ml4Var.onError(th);
        } else {
            ml4Var.onSuccess(this.z);
        }
    }

    public final void n(QnHx<T> qnHx) {
        boolean z;
        QnHx<T>[] qnHxArr;
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.y;
            QnHx<T>[] qnHxArr2 = atomicReference.get();
            int length = qnHxArr2.length;
            if (length == 0) {
                return;
            }
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qnHxArr2[i] == qnHx) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qnHxArr = B;
            } else {
                QnHx<T>[] qnHxArr3 = new QnHx[length - 1];
                System.arraycopy(qnHxArr2, 0, qnHxArr3, 0, i);
                System.arraycopy(qnHxArr2, i + 1, qnHxArr3, i, (length - i) - 1);
                qnHxArr = qnHxArr3;
            }
            do {
                if (atomicReference.compareAndSet(qnHxArr2, qnHxArr)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr2);
        } while (!z);
    }

    @Override // defpackage.ml4
    public final void onError(Throwable th) {
        this.A = th;
        for (QnHx<T> qnHx : this.y.getAndSet(C)) {
            if (!qnHx.get()) {
                qnHx.w.onError(th);
            }
        }
    }

    @Override // defpackage.ml4
    public final void onSuccess(T t) {
        this.z = t;
        for (QnHx<T> qnHx : this.y.getAndSet(C)) {
            if (!qnHx.get()) {
                qnHx.w.onSuccess(t);
            }
        }
    }
}
