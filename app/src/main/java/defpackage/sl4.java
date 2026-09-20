package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class sl4<T> extends vk4<T> implements ml4<T> {
    public static final QnHx[] A = new QnHx[0];
    public static final QnHx[] B = new QnHx[0];
    public T y;
    public Throwable z;
    public final AtomicBoolean x = new AtomicBoolean();
    public final AtomicReference<QnHx<T>[]> w = new AtomicReference<>(A);

    public static final class QnHx<T> extends AtomicReference<sl4<T>> implements vl0 {
        public final ml4<? super T> w;

        public QnHx(ml4<? super T> ml4Var, sl4<T> sl4Var) {
            this.w = ml4Var;
            lazySet(sl4Var);
        }

        @Override // defpackage.vl0
        public final void a() {
            sl4<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.n(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == null;
        }
    }

    @Override // defpackage.ml4
    public final void c(vl0 vl0Var) {
        if (this.w.get() == B) {
            vl0Var.a();
        }
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        boolean z;
        QnHx<T> qnHx = new QnHx<>(ml4Var, this);
        ml4Var.c(qnHx);
        while (true) {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
            QnHx<T>[] qnHxArr = atomicReference.get();
            z = false;
            if (qnHxArr == B) {
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
            if (qnHx.e()) {
                n(qnHx);
            }
        } else {
            Throwable th = this.z;
            if (th != null) {
                ml4Var.onError(th);
            } else {
                ml4Var.onSuccess(this.y);
            }
        }
    }

    public final void n(QnHx<T> qnHx) {
        boolean z;
        QnHx<T>[] qnHxArr;
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
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
                qnHxArr = A;
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
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.x.compareAndSet(false, true)) {
            m14.b(th);
            return;
        }
        this.z = th;
        for (QnHx<T> qnHx : this.w.getAndSet(B)) {
            qnHx.w.onError(th);
        }
    }

    @Override // defpackage.ml4
    public final void onSuccess(T t) {
        if (t == null) {
            throw new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.x.compareAndSet(false, true)) {
            this.y = t;
            for (QnHx<T> qnHx : this.w.getAndSet(B)) {
                qnHx.w.onSuccess(t);
            }
        }
    }
}
