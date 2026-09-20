package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public final class v9<T> extends tl3<T> {
    public static final Object[] B = new Object[0];
    public static final QnHx[] C = new QnHx[0];
    public long A;
    public final AtomicReference<T> w;
    public final AtomicReference<QnHx<T>[]> x;
    public final Lock y;
    public final Lock z;

    public static final class QnHx<T> implements vl0, pa3 {
        public tqO<T> A;
        public boolean B;
        public volatile boolean C;
        public long D;
        public final ht2<? super T> w;
        public final v9<T> x;
        public boolean y;
        public boolean z;

        public QnHx(ht2<? super T> ht2Var, v9<T> v9Var) {
            this.w = ht2Var;
            this.x = v9Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.C) {
                return;
            }
            this.C = true;
            this.x.G(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.C;
        }

        @Override // defpackage.pa3
        public final boolean test(T t) {
            if (this.C) {
                return false;
            }
            this.w.g(t);
            return false;
        }
    }

    public v9() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.y = reentrantReadWriteLock.readLock();
        this.z = reentrantReadWriteLock.writeLock();
        this.x = new AtomicReference<>(C);
        this.w = new AtomicReference<>();
    }

    public final void G(QnHx<T> qnHx) {
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
                qnHxArr = C;
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

    @Override // defpackage.tl3, defpackage.m70
    public final void accept(T t) {
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.z;
        lock.lock();
        this.A++;
        this.w.lazySet(t);
        lock.unlock();
        for (QnHx<T> qnHx : this.x.get()) {
            long j = this.A;
            if (!qnHx.C) {
                if (qnHx.B) {
                    qnHx.test(t);
                } else {
                    synchronized (qnHx) {
                        if (!qnHx.C) {
                            if (qnHx.D != j) {
                                if (qnHx.z) {
                                    tqO<T> tqo = qnHx.A;
                                    if (tqo == null) {
                                        tqo = new tqO<>();
                                        qnHx.A = tqo;
                                    }
                                    int i = tqo.c;
                                    if (i == 4) {
                                        Object[] objArr = new Object[5];
                                        tqo.b[4] = objArr;
                                        tqo.b = objArr;
                                        i = 0;
                                    }
                                    tqo.b[i] = t;
                                    tqo.c = i + 1;
                                } else {
                                    qnHx.y = true;
                                    qnHx.B = true;
                                    qnHx.test(t);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        r7 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r7 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0081, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r1 >= 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        r3 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        if (r3 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008a, code lost:
    
        r0.test(r3);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
    
        r7 = r7[4];
     */
    @Override // defpackage.vq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.ht2<? super T> r7) {
        /*
            r6 = this;
            v9$QnHx r0 = new v9$QnHx
            r0.<init>(r7, r6)
            r7.c(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<v9$QnHx<T>[]> r7 = r6.x
            java.lang.Object r1 = r7.get()
            v9$QnHx[] r1 = (v9.QnHx[]) r1
            int r2 = r1.length
            int r3 = r2 + 1
            v9$QnHx[] r3 = new v9.QnHx[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
        L1b:
            boolean r2 = r7.compareAndSet(r1, r3)
            r5 = 1
            if (r2 == 0) goto L24
            r7 = 1
            goto L2b
        L24:
            java.lang.Object r2 = r7.get()
            if (r2 == r1) goto L1b
            r7 = 0
        L2b:
            if (r7 == 0) goto L8
            boolean r7 = r0.C
            if (r7 == 0) goto L36
            r6.G(r0)
            goto L98
        L36:
            boolean r7 = r0.C
            if (r7 == 0) goto L3b
            goto L98
        L3b:
            monitor-enter(r0)
            boolean r7 = r0.C     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            goto L98
        L42:
            boolean r7 = r0.y     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            goto L98
        L48:
            v9<T> r7 = r0.x     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.locks.Lock r1 = r7.y     // Catch: java.lang.Throwable -> L99
            r1.lock()     // Catch: java.lang.Throwable -> L99
            long r2 = r7.A     // Catch: java.lang.Throwable -> L99
            r0.D = r2     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.atomic.AtomicReference<T> r7 = r7.w     // Catch: java.lang.Throwable -> L99
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L99
            r1.unlock()     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L60
            r1 = 1
            goto L61
        L60:
            r1 = 0
        L61:
            r0.z = r1     // Catch: java.lang.Throwable -> L99
            r0.y = r5     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L98
            r0.test(r7)
        L6b:
            boolean r7 = r0.C
            if (r7 == 0) goto L70
            goto L98
        L70:
            monitor-enter(r0)
            tqO<T> r7 = r0.A     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L79
            r0.z = r4     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            goto L98
        L79:
            r1 = 0
            r0.A = r1     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r7 = r7.a
        L7f:
            if (r7 == 0) goto L6b
            r1 = 0
        L82:
            r2 = 4
            if (r1 >= r2) goto L90
            r3 = r7[r1]
            if (r3 != 0) goto L8a
            goto L90
        L8a:
            r0.test(r3)
            int r1 = r1 + 1
            goto L82
        L90:
            r7 = r7[r2]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L7f
        L95:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            throw r7
        L98:
            return
        L99:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9.z(ht2):void");
    }
}
