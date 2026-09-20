package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gs2<T> extends r50<T> implements is2<T> {
    public final us2<T> w;
    public final AtomicReference<CQf<T>> x;
    public final us2<T> y;

    public static final class CQf<T> implements ht2<T>, vl0 {
        public static final QnHx[] A = new QnHx[0];
        public static final QnHx[] B = new QnHx[0];
        public final AtomicReference<CQf<T>> w;
        public final AtomicReference<vl0> z = new AtomicReference<>();
        public final AtomicReference<QnHx<T>[]> x = new AtomicReference<>(A);
        public final AtomicBoolean y = new AtomicBoolean();

        public CQf(AtomicReference<CQf<T>> atomicReference) {
            this.w = atomicReference;
        }

        @Override // defpackage.vl0
        public final void a() {
            AtomicReference<CQf<T>> atomicReference;
            AtomicReference<QnHx<T>[]> atomicReference2 = this.x;
            QnHx<T>[] qnHxArr = B;
            if (atomicReference2.getAndSet(qnHxArr) != qnHxArr) {
                do {
                    atomicReference = this.w;
                    if (atomicReference.compareAndSet(this, null)) {
                        break;
                    }
                } while (atomicReference.get() == this);
                bm0.c(this.z);
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            AtomicReference<CQf<T>> atomicReference;
            do {
                atomicReference = this.w;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            for (QnHx<T> qnHx : this.x.getAndSet(B)) {
                qnHx.w.b();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.z, vl0Var);
        }

        public final void d(QnHx<T> qnHx) {
            boolean z;
            QnHx<T>[] qnHxArr;
            do {
                AtomicReference<QnHx<T>[]> atomicReference = this.x;
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
                    } else if (qnHxArr2[i].equals(qnHx)) {
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

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.get() == B;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            for (QnHx<T> qnHx : this.x.get()) {
                qnHx.w.g(t);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            AtomicReference<CQf<T>> atomicReference;
            do {
                atomicReference = this.w;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            QnHx<T>[] andSet = this.x.getAndSet(B);
            if (andSet.length == 0) {
                m14.b(th);
                return;
            }
            for (QnHx<T> qnHx : andSet) {
                qnHx.w.onError(th);
            }
        }
    }

    public static final class F1<T> implements us2<T> {
        public final AtomicReference<CQf<T>> w;

        public F1(AtomicReference<CQf<T>> atomicReference) {
            this.w = atomicReference;
        }

        @Override // defpackage.us2
        public final void a(ht2<? super T> ht2Var) {
            boolean z;
            CQf<T> cQf;
            boolean z2;
            QnHx<T> qnHx = new QnHx<>(ht2Var);
            ht2Var.c(qnHx);
            while (true) {
                AtomicReference<CQf<T>> atomicReference = this.w;
                CQf<T> cQf2 = atomicReference.get();
                boolean z3 = false;
                if (cQf2 == null || cQf2.e()) {
                    CQf<T> cQf3 = new CQf<>(atomicReference);
                    while (true) {
                        if (atomicReference.compareAndSet(cQf2, cQf3)) {
                            z = true;
                            break;
                        } else if (atomicReference.get() != cQf2) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        cQf = cQf3;
                    } else {
                        continue;
                    }
                } else {
                    cQf = cQf2;
                }
                while (true) {
                    AtomicReference<QnHx<T>[]> atomicReference2 = cQf.x;
                    QnHx<T>[] qnHxArr = atomicReference2.get();
                    if (qnHxArr == CQf.B) {
                        break;
                    }
                    int length = qnHxArr.length;
                    QnHx<T>[] qnHxArr2 = new QnHx[length + 1];
                    System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
                    qnHxArr2[length] = qnHx;
                    while (true) {
                        if (atomicReference2.compareAndSet(qnHxArr, qnHxArr2)) {
                            z2 = true;
                            break;
                        } else if (atomicReference2.get() != qnHxArr) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
                if (z3) {
                    break;
                }
            }
            if (qnHx.compareAndSet(null, cQf)) {
                return;
            }
            cQf.d(qnHx);
        }
    }

    public static final class QnHx<T> extends AtomicReference<Object> implements vl0 {
        public final ht2<? super T> w;

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((CQf) andSet).d(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == this;
        }
    }

    public gs2(F1 f1, ft2 ft2Var, AtomicReference atomicReference) {
        this.y = f1;
        this.w = ft2Var;
        this.x = atomicReference;
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
        if (!cQf.y.get() && cQf.y.compareAndSet(false, true)) {
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

    @Override // defpackage.is2
    public final us2<T> e() {
        return this.w;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.y.a(ht2Var);
    }
}
