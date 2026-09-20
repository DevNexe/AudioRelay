package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rg3<T> extends dw4<T> {
    public static final QnHx[] y = new QnHx[0];
    public static final QnHx[] z = new QnHx[0];
    public final AtomicReference<QnHx<T>[]> w = new AtomicReference<>(z);
    public Throwable x;

    public static final class QnHx<T> extends AtomicBoolean implements vl0 {
        public final ht2<? super T> w;
        public final rg3<T> x;

        public QnHx(ht2<? super T> ht2Var, rg3<T> rg3Var) {
            this.w = ht2Var;
            this.x = rg3Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (compareAndSet(false, true)) {
                this.x.H(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get();
        }
    }

    public final void H(QnHx<T> qnHx) {
        QnHx<T>[] qnHxArr;
        boolean z2;
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
            QnHx<T>[] qnHxArr2 = atomicReference.get();
            if (qnHxArr2 == y || qnHxArr2 == (qnHxArr = z)) {
                return;
            }
            int length = qnHxArr2.length;
            z2 = false;
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
            if (length != 1) {
                qnHxArr = new QnHx[length - 1];
                System.arraycopy(qnHxArr2, 0, qnHxArr, 0, i);
                System.arraycopy(qnHxArr2, i + 1, qnHxArr, i, (length - i) - 1);
            }
            do {
                if (atomicReference.compareAndSet(qnHxArr2, qnHxArr)) {
                    z2 = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr2);
        } while (!z2);
    }

    @Override // defpackage.ht2
    public final void b() {
        AtomicReference<QnHx<T>[]> atomicReference = this.w;
        QnHx<T>[] qnHxArr = atomicReference.get();
        QnHx<T>[] qnHxArr2 = y;
        if (qnHxArr == qnHxArr2) {
            return;
        }
        QnHx<T>[] andSet = atomicReference.getAndSet(qnHxArr2);
        for (QnHx<T> qnHx : andSet) {
            if (!qnHx.get()) {
                qnHx.w.b();
            }
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        if (this.w.get() == y) {
            vl0Var.a();
        }
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        for (QnHx<T> qnHx : this.w.get()) {
            if (!qnHx.get()) {
                qnHx.w.g(t);
            }
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        AtomicReference<QnHx<T>[]> atomicReference = this.w;
        QnHx<T>[] qnHxArr = atomicReference.get();
        QnHx<T>[] qnHxArr2 = y;
        if (qnHxArr == qnHxArr2) {
            m14.b(th);
            return;
        }
        this.x = th;
        QnHx<T>[] andSet = atomicReference.getAndSet(qnHxArr2);
        for (QnHx<T> qnHx : andSet) {
            if (qnHx.get()) {
                m14.b(th);
            } else {
                qnHx.w.onError(th);
            }
        }
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        boolean z2;
        QnHx<T> qnHx = new QnHx<>(ht2Var, this);
        ht2Var.c(qnHx);
        while (true) {
            AtomicReference<QnHx<T>[]> atomicReference = this.w;
            QnHx<T>[] qnHxArr = atomicReference.get();
            z2 = false;
            if (qnHxArr == y) {
                break;
            }
            int length = qnHxArr.length;
            QnHx<T>[] qnHxArr2 = new QnHx[length + 1];
            System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
            qnHxArr2[length] = qnHx;
            do {
                if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                    z2 = true;
                    break;
                }
            } while (atomicReference.get() == qnHxArr);
            if (z2) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            if (qnHx.get()) {
                H(qnHx);
            }
        } else {
            Throwable th = this.x;
            if (th != null) {
                ht2Var.onError(th);
            } else {
                ht2Var.b();
            }
        }
    }
}
