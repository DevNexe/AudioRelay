package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qr2<T, U> extends Z<T, U> {
    public final int A;
    public final i91<? super T, ? extends us2<? extends U>> x;
    public final boolean y;
    public final int z;

    public static final class CQf<T, U> extends AtomicInteger implements vl0, ht2<T> {
        public static final QnHx<?, ?>[] M = new QnHx[0];
        public static final QnHx<?, ?>[] N = new QnHx[0];
        public final int A;
        public volatile tk4<U> B;
        public volatile boolean C;
        public final s D = new s();
        public volatile boolean E;
        public final AtomicReference<QnHx<?, ?>[]> F;
        public vl0 G;
        public long H;
        public long I;
        public int J;
        public final ArrayDeque K;
        public int L;
        public final ht2<? super U> w;
        public final i91<? super T, ? extends us2<? extends U>> x;
        public final boolean y;
        public final int z;

        public CQf(int i, int i2, ht2 ht2Var, i91 i91Var, boolean z) {
            this.w = ht2Var;
            this.x = i91Var;
            this.y = z;
            this.z = i;
            this.A = i2;
            if (i != Integer.MAX_VALUE) {
                this.K = new ArrayDeque(i);
            }
            this.F = new AtomicReference<>(M);
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.E) {
                return;
            }
            this.E = true;
            if (f()) {
                s sVar = this.D;
                sVar.getClass();
                Throwable thB = uu0.b(sVar);
                if (thB == null || thB == uu0.a) {
                    return;
                }
                m14.b(thB);
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.C) {
                return;
            }
            this.C = true;
            h();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.G, vl0Var)) {
                this.G = vl0Var;
                this.w.c(this);
            }
        }

        public final boolean d() {
            if (this.E) {
                return true;
            }
            Throwable th = this.D.get();
            if (this.y || th == null) {
                return false;
            }
            f();
            s sVar = this.D;
            sVar.getClass();
            Throwable thB = uu0.b(sVar);
            if (thB != uu0.a) {
                this.w.onError(thB);
            }
            return true;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.E;
        }

        public final boolean f() {
            QnHx<?, ?>[] andSet;
            this.G.a();
            AtomicReference<QnHx<?, ?>[]> atomicReference = this.F;
            QnHx<?, ?>[] qnHxArr = atomicReference.get();
            QnHx<?, ?>[] qnHxArr2 = N;
            if (qnHxArr == qnHxArr2 || (andSet = atomicReference.getAndSet(qnHxArr2)) == qnHxArr2) {
                return false;
            }
            for (QnHx<?, ?> qnHx : andSet) {
                qnHx.getClass();
                bm0.c(qnHx);
            }
            return true;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.C) {
                return;
            }
            try {
                us2<? extends U> us2VarApply = this.x.apply(t);
                mq2.b(us2VarApply, "The mapper returned a null ObservableSource");
                us2<? extends U> us2Var = us2VarApply;
                if (this.z != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.L;
                        if (i == this.z) {
                            this.K.offer(us2Var);
                            return;
                        }
                        this.L = i + 1;
                    }
                }
                k(us2Var);
            } catch (Throwable th) {
                XTd3.w(th);
                this.G.a();
                onError(th);
            }
        }

        public final void h() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        /* JADX WARN: Code duplicated, block: B:113:0x00fb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x0103 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:90:0x0102 A[PHI: r4
  0x0102: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:77:0x00e1, B:89:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void i() {
            int size;
            boolean z;
            ht2<? super U> ht2Var = this.w;
            int iAddAndGet = 1;
            while (!d()) {
                tk4<U> tk4Var = this.B;
                int i = 0;
                if (tk4Var != null) {
                    while (!d()) {
                        U uPoll = tk4Var.poll();
                        if (uPoll != null) {
                            ht2Var.g(uPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.C;
                    tk4<U> tk4Var2 = this.B;
                    QnHx<?, ?>[] qnHxArr = this.F.get();
                    int length = qnHxArr.length;
                    if (this.z != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.K.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((tk4Var2 == null || tk4Var2.isEmpty()) && length == 0 && size == 0)) {
                        s sVar = this.D;
                        sVar.getClass();
                        Throwable thB = uu0.b(sVar);
                        if (thB != uu0.a) {
                            if (thB == null) {
                                ht2Var.b();
                                return;
                            } else {
                                ht2Var.onError(thB);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.I;
                        int i2 = this.J;
                        if (length <= i2 || qnHxArr[i2].w != j) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            for (int i3 = 0; i3 < length && qnHxArr[i2].w != j; i3++) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                            this.J = i2;
                            this.I = qnHxArr[i2].w;
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            if (d()) {
                                return;
                            }
                            QnHx<T, U> qnHx = qnHxArr[i2];
                            uk4<U> uk4Var = qnHx.z;
                            if (uk4Var != null) {
                                do {
                                    try {
                                        U uPoll2 = uk4Var.poll();
                                        if (uPoll2 == null) {
                                            z = qnHx.y;
                                            uk4<U> uk4Var2 = qnHx.z;
                                            if (z && (uk4Var2 == null || uk4Var2.isEmpty())) {
                                                j(qnHx);
                                                if (d()) {
                                                    return;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            i2++;
                                            if (i2 == length) {
                                                i2 = 0;
                                            }
                                        } else {
                                            ht2Var.g(uPoll2);
                                        }
                                    } catch (Throwable th) {
                                        XTd3.w(th);
                                        bm0.c(qnHx);
                                        s sVar2 = this.D;
                                        sVar2.getClass();
                                        uu0.a(sVar2, th);
                                        if (d()) {
                                            return;
                                        }
                                        j(qnHx);
                                        i++;
                                        i2++;
                                        if (i2 == length) {
                                        }
                                    }
                                } while (!d());
                                return;
                            }
                            z = qnHx.y;
                            uk4<U> uk4Var3 = qnHx.z;
                            if (z) {
                                j(qnHx);
                                if (d()) {
                                    return;
                                } else {
                                    i++;
                                }
                            }
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.J = i2;
                        this.I = qnHxArr[i2].w;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.z != Integer.MAX_VALUE) {
                        l(i);
                    }
                } else if (this.z != Integer.MAX_VALUE) {
                    l(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void j(QnHx<T, U> qnHx) {
            boolean z;
            QnHx<?, ?>[] qnHxArr;
            do {
                AtomicReference<QnHx<?, ?>[]> atomicReference = this.F;
                QnHx<?, ?>[] qnHxArr2 = atomicReference.get();
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
                    qnHxArr = M;
                } else {
                    QnHx<?, ?>[] qnHxArr3 = new QnHx[length - 1];
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

        /* JADX WARN: Code duplicated, block: B:28:0x005c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v8, types: [uk4] */
        public final void k(us2<? extends U> us2Var) {
            boolean z;
            boolean z2;
            boolean z3;
            do {
                z = false;
                if (!(us2Var instanceof Callable)) {
                    long j = this.H;
                    this.H = 1 + j;
                    QnHx<?, ?> qnHx = new QnHx<>(this, j);
                    while (true) {
                        AtomicReference<QnHx<?, ?>[]> atomicReference = this.F;
                        QnHx<?, ?>[] qnHxArr = atomicReference.get();
                        if (qnHxArr == N) {
                            bm0.c(qnHx);
                            break;
                        }
                        int length = qnHxArr.length;
                        QnHx<?, ?>[] qnHxArr2 = new QnHx[length + 1];
                        System.arraycopy(qnHxArr, 0, qnHxArr2, 0, length);
                        qnHxArr2[length] = qnHx;
                        while (true) {
                            if (atomicReference.compareAndSet(qnHxArr, qnHxArr2)) {
                                z2 = true;
                                break;
                            } else if (atomicReference.get() != qnHxArr) {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        us2Var.a(qnHx);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) us2Var).call();
                    if (objCall == null) {
                        z3 = true;
                    } else if (get() == 0 && compareAndSet(0, 1)) {
                        this.w.g(objCall);
                        if (decrementAndGet() != 0) {
                            i();
                        }
                        z3 = true;
                    } else {
                        tk4<U> tk4Var = this.B;
                        ?? r3 = tk4Var;
                        if (tk4Var == false) {
                            tk4<U> jr4Var = this.z == Integer.MAX_VALUE ? new jr4(this.A) : new ir4(this.z);
                            this.B = jr4Var;
                            r3 = jr4Var;
                        }
                        if (!r3.offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            z3 = true;
                        } else if (getAndIncrement() != 0) {
                            z3 = false;
                        } else {
                            i();
                            z3 = true;
                        }
                    }
                } catch (Throwable th) {
                    XTd3.w(th);
                    s sVar = this.D;
                    sVar.getClass();
                    uu0.a(sVar, th);
                    h();
                }
                if (!z3 || this.z == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    us2Var = (us2) this.K.poll();
                    if (us2Var == null) {
                        this.L--;
                        z = true;
                    }
                }
            } while (!z);
            h();
        }

        public final void l(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    us2<? extends U> us2Var = (us2) this.K.poll();
                    if (us2Var == null) {
                        this.L--;
                    } else {
                        k(us2Var);
                    }
                }
                i = i2;
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.C) {
                m14.b(th);
                return;
            }
            s sVar = this.D;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
            } else {
                this.C = true;
                h();
            }
        }
    }

    public static final class QnHx<T, U> extends AtomicReference<vl0> implements ht2<U> {
        public int A;
        public final long w;
        public final CQf<T, U> x;
        public volatile boolean y;
        public volatile uk4<U> z;

        public QnHx(CQf<T, U> cQf, long j) {
            this.w = j;
            this.x = cQf;
        }

        @Override // defpackage.ht2
        public final void b() {
            this.y = true;
            this.x.h();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var) && (vl0Var instanceof kh3)) {
                kh3 kh3Var = (kh3) vl0Var;
                int iL = kh3Var.l(7);
                if (iL == 1) {
                    this.A = iL;
                    this.z = kh3Var;
                    this.y = true;
                    this.x.h();
                    return;
                }
                if (iL == 2) {
                    this.A = iL;
                    this.z = kh3Var;
                }
            }
        }

        @Override // defpackage.ht2
        public final void g(U u) {
            if (this.A != 0) {
                this.x.h();
                return;
            }
            CQf<T, U> cQf = this.x;
            if (cQf.get() == 0 && cQf.compareAndSet(0, 1)) {
                cQf.w.g(u);
                if (cQf.decrementAndGet() == 0) {
                    return;
                }
            } else {
                uk4 jr4Var = this.z;
                if (jr4Var == null) {
                    jr4Var = new jr4(cQf.A);
                    this.z = jr4Var;
                }
                jr4Var.offer(u);
                if (cQf.getAndIncrement() != 0) {
                    return;
                }
            }
            cQf.i();
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            s sVar = this.x.D;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            CQf<T, U> cQf = this.x;
            if (!cQf.y) {
                cQf.f();
            }
            this.y = true;
            this.x.h();
        }
    }

    public qr2(us2 us2Var, i91 i91Var, int i, int i2) {
        super(us2Var);
        this.x = i91Var;
        this.y = false;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super U> ht2Var) {
        i91<? super T, ? extends us2<? extends U>> i91Var = this.x;
        us2<T> us2Var = this.w;
        if (ns2.a(us2Var, ht2Var, i91Var)) {
            return;
        }
        us2Var.a(new CQf(this.z, this.A, ht2Var, this.x, this.y));
    }
}
