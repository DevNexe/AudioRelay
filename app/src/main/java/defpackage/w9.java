package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public final class w9<T> extends dw4<T> {
    public static final Object[] C = new Object[0];
    public static final QnHx[] D = new QnHx[0];
    public static final QnHx[] E = new QnHx[0];
    public final AtomicReference<Throwable> A;
    public long B;
    public final AtomicReference<Object> w;
    public final AtomicReference<QnHx<T>[]> x;
    public final Lock y;
    public final Lock z;

    public static final class QnHx<T> implements vl0, tK0W.QnHx<Object> {
        public tK0W<Object> A;
        public boolean B;
        public volatile boolean C;
        public long D;
        public final ht2<? super T> w;
        public final w9<T> x;
        public boolean y;
        public boolean z;

        public QnHx(ht2<? super T> ht2Var, w9<T> w9Var) {
            this.w = ht2Var;
            this.x = w9Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.C) {
                return;
            }
            this.C = true;
            this.x.I(this);
        }

        public final void b(long j, Object obj) {
            if (this.C) {
                return;
            }
            if (!this.B) {
                synchronized (this) {
                    if (this.C) {
                        return;
                    }
                    if (this.D == j) {
                        return;
                    }
                    if (this.z) {
                        tK0W<Object> tk0w = this.A;
                        if (tk0w == null) {
                            tk0w = new tK0W<>();
                            this.A = tk0w;
                        }
                        tk0w.b(obj);
                        return;
                    }
                    this.y = true;
                    this.B = true;
                }
            }
            test(obj);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.C;
        }

        @Override // tK0W.QnHx, defpackage.pa3
        public final boolean test(Object obj) {
            return this.C || gq2.a(this.w, obj);
        }
    }

    public w9() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.y = reentrantReadWriteLock.readLock();
        this.z = reentrantReadWriteLock.writeLock();
        this.x = new AtomicReference<>(D);
        this.w = new AtomicReference<>();
        this.A = new AtomicReference<>();
    }

    public static <T> w9<T> H(T t) {
        w9<T> w9Var = new w9<>();
        AtomicReference<Object> atomicReference = w9Var.w;
        if (t == null) {
            throw new NullPointerException("defaultValue is null");
        }
        atomicReference.lazySet(t);
        return w9Var;
    }

    public final void I(QnHx<T> qnHx) {
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
                qnHxArr = D;
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

    @Override // defpackage.ht2
    public final void b() {
        int i;
        boolean z;
        AtomicReference<Throwable> atomicReference = this.A;
        uu0.QnHx qnHx = uu0.a;
        while (true) {
            if (!atomicReference.compareAndSet(null, qnHx)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            gq2 gq2Var = gq2.COMPLETE;
            AtomicReference<QnHx<T>[]> atomicReference2 = this.x;
            QnHx<T>[] qnHxArr = E;
            QnHx<T>[] andSet = atomicReference2.getAndSet(qnHxArr);
            if (andSet != qnHxArr) {
                Lock lock = this.z;
                lock.lock();
                this.B++;
                this.w.lazySet(gq2Var);
                lock.unlock();
            }
            for (QnHx<T> qnHx2 : andSet) {
                qnHx2.b(this.B, gq2Var);
            }
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        if (this.A.get() != null) {
            vl0Var.a();
        }
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (this.A.get() != null) {
            return;
        }
        Lock lock = this.z;
        lock.lock();
        this.B++;
        this.w.lazySet(t);
        lock.unlock();
        for (QnHx<T> qnHx : this.x.get()) {
            qnHx.b(this.B, t);
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        int i;
        boolean z;
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        AtomicReference<Throwable> atomicReference = this.A;
        while (true) {
            if (!atomicReference.compareAndSet(null, th)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            m14.b(th);
            return;
        }
        gq2.CQf cQf = new gq2.CQf(th);
        AtomicReference<QnHx<T>[]> atomicReference2 = this.x;
        QnHx<T>[] qnHxArr = E;
        QnHx<T>[] andSet = atomicReference2.getAndSet(qnHxArr);
        if (andSet != qnHxArr) {
            Lock lock = this.z;
            lock.lock();
            this.B++;
            this.w.lazySet(cQf);
            lock.unlock();
        }
        for (QnHx<T> qnHx : andSet) {
            qnHx.b(this.B, cQf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        r8.c(r0);
     */
    @Override // defpackage.vq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.ht2<? super T> r8) {
        /*
            r7 = this;
            w9$QnHx r0 = new w9$QnHx
            r0.<init>(r8, r7)
            r8.c(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<w9$QnHx<T>[]> r1 = r7.x
            java.lang.Object r2 = r1.get()
            w9$QnHx[] r2 = (w9.QnHx[]) r2
            w9$QnHx[] r3 = defpackage.w9.E
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L18
            r1 = 0
            goto L34
        L18:
            int r3 = r2.length
            int r6 = r3 + 1
            w9$QnHx[] r6 = new w9.QnHx[r6]
            java.lang.System.arraycopy(r2, r4, r6, r4, r3)
            r6[r3] = r0
        L22:
            boolean r3 = r1.compareAndSet(r2, r6)
            if (r3 == 0) goto L2a
            r1 = 1
            goto L31
        L2a:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L22
            r1 = 0
        L31:
            if (r1 == 0) goto L8
            r1 = 1
        L34:
            if (r1 == 0) goto L94
            boolean r8 = r0.C
            if (r8 == 0) goto L3f
            r7.I(r0)
            goto La7
        L3f:
            boolean r8 = r0.C
            if (r8 == 0) goto L44
            goto La7
        L44:
            monitor-enter(r0)
            boolean r8 = r0.C     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            goto La7
        L4b:
            boolean r8 = r0.y     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            goto La7
        L51:
            w9<T> r8 = r0.x     // Catch: java.lang.Throwable -> L91
            java.util.concurrent.locks.Lock r1 = r8.y     // Catch: java.lang.Throwable -> L91
            r1.lock()     // Catch: java.lang.Throwable -> L91
            long r2 = r8.B     // Catch: java.lang.Throwable -> L91
            r0.D = r2     // Catch: java.lang.Throwable -> L91
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.w     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L91
            r1.unlock()     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            r0.z = r1     // Catch: java.lang.Throwable -> L91
            r0.y = r5     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto La7
            boolean r8 = r0.test(r8)
            if (r8 == 0) goto L78
            goto La7
        L78:
            boolean r8 = r0.C
            if (r8 == 0) goto L7d
            goto La7
        L7d:
            monitor-enter(r0)
            tK0W<java.lang.Object> r8 = r0.A     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L86
            r0.z = r4     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            goto La7
        L86:
            r1 = 0
            r0.A = r1     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            r8.c(r0)
            goto L78
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        L91:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            throw r8
        L94:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.A
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            uu0$QnHx r1 = defpackage.uu0.a
            if (r0 != r1) goto La4
            r8.b()
            goto La7
        La4:
            r8.onError(r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9.z(ht2):void");
    }
}
