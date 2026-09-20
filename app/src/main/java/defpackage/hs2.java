package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hs2<T> extends r50<T> implements kp3 {
    public final us2<T> w;
    public final AtomicReference<CQf<T>> x = new AtomicReference<>();

    public static final class CQf<T> extends AtomicReference<QnHx<T>[]> implements ht2<T>, vl0 {
        public static final QnHx[] A = new QnHx[0];
        public static final QnHx[] B = new QnHx[0];
        public final AtomicReference<CQf<T>> x;
        public Throwable z;
        public final AtomicBoolean w = new AtomicBoolean();
        public final AtomicReference<vl0> y = new AtomicReference<>();

        public CQf(AtomicReference<CQf<T>> atomicReference) {
            this.x = atomicReference;
            lazySet(A);
        }

        @Override // defpackage.vl0
        public final void a() {
            AtomicReference<CQf<T>> atomicReference;
            getAndSet(B);
            do {
                atomicReference = this.x;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            bm0.c(this.y);
        }

        @Override // defpackage.ht2
        public final void b() {
            this.y.lazySet(bm0.DISPOSED);
            for (QnHx<T> qnHx : getAndSet(B)) {
                qnHx.w.b();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.y, vl0Var);
        }

        public final void d(QnHx<T> qnHx) {
            QnHx<T>[] qnHxArr;
            QnHx[] qnHxArr2;
            do {
                qnHxArr = get();
                int length = qnHxArr.length;
                if (length == 0) {
                    return;
                }
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
                qnHxArr2 = A;
                if (length != 1) {
                    qnHxArr2 = new QnHx[length - 1];
                    System.arraycopy(qnHxArr, 0, qnHxArr2, 0, i);
                    System.arraycopy(qnHxArr, i + 1, qnHxArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(qnHxArr, qnHxArr2));
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == B;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            for (QnHx<T> qnHx : get()) {
                qnHx.w.g(t);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.z = th;
            this.y.lazySet(bm0.DISPOSED);
            for (QnHx<T> qnHx : getAndSet(B)) {
                qnHx.w.onError(th);
            }
        }
    }

    public static final class QnHx<T> extends AtomicReference<CQf<T>> implements vl0 {
        public final ht2<? super T> w;

        public QnHx(ht2<? super T> ht2Var, CQf<T> cQf) {
            this.w = ht2Var;
            lazySet(cQf);
        }

        @Override // defpackage.vl0
        public final void a() {
            CQf<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.d(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == null;
        }
    }

    public hs2(us2<T> us2Var) {
        this.w = us2Var;
    }

    @Override // defpackage.r50
    public final void G(m70<? super vl0> m70Var) {
        CQf<T> cQf;
        boolean z;
        boolean z2;
        while (true) {
            AtomicReference<CQf<T>> atomicReference = this.x;
            cQf = atomicReference.get();
            z = false;
            if (cQf != null && !cQf.e()) {
                break;
            }
            CQf<T> cQf2 = new CQf<>(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(cQf, cQf2)) {
                    z2 = true;
                    break;
                } else if (atomicReference.get() != cQf) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                cQf = cQf2;
                break;
            }
        }
        if (!cQf.w.get() && cQf.w.compareAndSet(false, true)) {
            z = true;
        }
        try {
            m70Var.accept(cQf);
            if (z) {
                this.w.a(cQf);
            }
        } catch (Throwable th) {
            XTd3.w(th);
            throw uu0.d(th);
        }
    }

    @Override // defpackage.kp3
    public final void d(vl0 vl0Var) {
        AtomicReference<CQf<T>> atomicReference = this.x;
        CQf<T> cQf = (CQf) vl0Var;
        while (!atomicReference.compareAndSet(cQf, null) && atomicReference.get() == cQf) {
        }
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        CQf<T> cQf;
        boolean z;
        boolean z2;
        while (true) {
            AtomicReference<CQf<T>> atomicReference = this.x;
            cQf = atomicReference.get();
            z = false;
            if (cQf != null) {
                break;
            }
            CQf<T> cQf2 = new CQf<>(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(cQf, cQf2)) {
                    z2 = true;
                    break;
                } else if (atomicReference.get() != cQf) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                cQf = cQf2;
                break;
            }
        }
        QnHx<T> qnHx = new QnHx<>(ht2Var, cQf);
        ht2Var.c(qnHx);
        while (true) {
            QnHx<T>[] qnHxArr = cQf.get();
            if (qnHxArr == CQf.B) {
                break;
            }
            int length = qnHxArr.length;
            QnHx[] qnHxArr2 = new QnHx[length + 1];
            System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
            qnHxArr2[length] = qnHx;
            if (cQf.compareAndSet(qnHxArr, qnHxArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (qnHx.e()) {
                cQf.d(qnHx);
            }
        } else {
            Throwable th = cQf.z;
            if (th != null) {
                ht2Var.onError(th);
            } else {
                ht2Var.b();
            }
        }
    }
}
