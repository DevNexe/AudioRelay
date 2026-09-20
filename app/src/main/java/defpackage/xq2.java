package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class xq2<T> extends Z<T, T> implements ht2<T> {
    public static final QnHx[] G = new QnHx[0];
    public static final QnHx[] H = new QnHx[0];
    public volatile long A;
    public final CQf<T> B;
    public CQf<T> C;
    public int D;
    public Throwable E;
    public volatile boolean F;
    public final AtomicBoolean x;
    public final int y;
    public final AtomicReference<QnHx<T>[]> z;

    public static final class CQf<T> {
        public final T[] a;
        public volatile CQf<T> b;

        public CQf(int i) {
            this.a = (T[]) new Object[i];
        }
    }

    public static final class QnHx<T> extends AtomicInteger implements vl0 {
        public long A;
        public volatile boolean B;
        public final ht2<? super T> w;
        public final xq2<T> x;
        public CQf<T> y;
        public int z;

        public QnHx(ht2<? super T> ht2Var, xq2<T> xq2Var) {
            this.w = ht2Var;
            this.x = xq2Var;
            this.y = xq2Var.B;
        }

        @Override // defpackage.vl0
        public final void a() {
            boolean z;
            QnHx<T>[] qnHxArr;
            if (this.B) {
                return;
            }
            this.B = true;
            xq2<T> xq2Var = this.x;
            do {
                AtomicReference<QnHx<T>[]> atomicReference = xq2Var.z;
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
                    } else if (qnHxArr2[i] == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    qnHxArr = xq2.G;
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
            return this.B;
        }
    }

    public xq2(vq2 vq2Var) {
        super(vq2Var);
        this.y = 16;
        this.x = new AtomicBoolean();
        CQf<T> cQf = new CQf<>(16);
        this.B = cQf;
        this.C = cQf;
        this.z = new AtomicReference<>(G);
    }

    public final void G(QnHx<T> qnHx) {
        if (qnHx.getAndIncrement() != 0) {
            return;
        }
        long j = qnHx.A;
        int i = qnHx.z;
        CQf<T> cQf = qnHx.y;
        ht2<? super T> ht2Var = qnHx.w;
        int i2 = this.y;
        int iAddAndGet = 1;
        while (!qnHx.B) {
            boolean z = this.F;
            boolean z2 = this.A == j;
            if (z && z2) {
                qnHx.y = null;
                Throwable th = this.E;
                if (th != null) {
                    ht2Var.onError(th);
                    return;
                } else {
                    ht2Var.b();
                    return;
                }
            }
            if (z2) {
                qnHx.A = j;
                qnHx.z = i;
                qnHx.y = cQf;
                iAddAndGet = qnHx.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    cQf = cQf.b;
                    i = 0;
                }
                ht2Var.g(cQf.a[i]);
                i++;
                j++;
            }
        }
        qnHx.y = null;
    }

    @Override // defpackage.ht2
    public final void b() {
        this.F = true;
        for (QnHx<T> qnHx : this.z.getAndSet(H)) {
            G(qnHx);
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        int i = this.D;
        if (i == this.y) {
            CQf<T> cQf = new CQf<>(i);
            cQf.a[0] = t;
            this.D = 1;
            this.C.b = cQf;
            this.C = cQf;
        } else {
            this.C.a[i] = t;
            this.D = i + 1;
        }
        this.A++;
        for (QnHx<T> qnHx : this.z.get()) {
            G(qnHx);
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        this.E = th;
        this.F = true;
        for (QnHx<T> qnHx : this.z.getAndSet(H)) {
            G(qnHx);
        }
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        boolean z;
        QnHx<T> qnHx = new QnHx<>(ht2Var, this);
        ht2Var.c(qnHx);
        do {
            AtomicReference<QnHx<T>[]> atomicReference = this.z;
            QnHx<T>[] qnHxArr = atomicReference.get();
            if (qnHxArr == H) {
                break;
            }
            int length = qnHxArr.length;
            QnHx<T>[] qnHxArr2 = new QnHx[length + 1];
            System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
            qnHxArr2[length] = qnHx;
            while (true) {
                if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != qnHxArr) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        AtomicBoolean atomicBoolean = this.x;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            G(qnHx);
        } else {
            this.w.a(this);
        }
    }
}
