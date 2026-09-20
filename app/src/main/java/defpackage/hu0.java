package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hu0 extends iu0 implements ti0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(hu0.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(hu0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public static final class CQf extends F1 {
        public final Runnable y;

        public CQf(Runnable runnable, long j) {
            super(j);
            this.y = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y.run();
        }

        @Override // hu0.F1
        public final String toString() {
            return super.toString() + this.y;
        }
    }

    public static abstract class F1 implements Runnable, Comparable<F1>, am0, j75 {
        private volatile Object _heap;
        public long w;
        public int x = -1;

        public F1(long j) {
            this.w = j;
        }

        @Override // defpackage.am0
        public final synchronized void a() {
            Object obj = this._heap;
            py4 py4Var = hn.B;
            if (obj == py4Var) {
                return;
            }
            LPt8Fixed lPt8 = obj instanceof LPt8Fixed ? (LPt8Fixed) obj : null;
            if (lPt8 != null) {
                synchronized (lPt8) {
                    Object obj2 = this._heap;
                    if ((obj2 instanceof i75 ? (i75) obj2 : null) != null) {
                        lPt8.c(this.x);
                    }
                }
            }
            this._heap = py4Var;
        }

        @Override // defpackage.j75
        public final void c(LPt8Fixed lPt8) {
            if (!(this._heap != hn.B)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = lPt8;
        }

        @Override // java.lang.Comparable
        public final int compareTo(F1 f1) {
            long j = this.w - f1.w;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final synchronized int d(long j, LPt8Fixed lPt8, hu0 hu0Var) {
            if (this._heap == hn.B) {
                return 2;
            }
            synchronized (lPt8) {
                try {
                    Object[] objArr = lPt8.a;
                    F1 f1 = (F1) (objArr != null ? objArr[0] : null);
                    if (hu0.z0(hu0Var)) {
                        return 1;
                    }
                    if (f1 == null) {
                        lPt8.b = j;
                    } else {
                        long j2 = f1.w;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - lPt8.b > 0) {
                            lPt8.b = j;
                        }
                    }
                    long j3 = this.w;
                    long j4 = lPt8.b;
                    if (j3 - j4 < 0) {
                        this.w = j4;
                    }
                    lPt8.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.j75
        public final void setIndex(int i) {
            this.x = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.w + ']';
        }
    }

    public static final class LPt8Fixed extends i75<F1> {
        public long b;

        public LPt8Fixed(long j) {
            this.b = j;
        }
    }

    public final class QnHx extends F1 {
        public final wm<sd5> y;

        public QnHx(long j, xm xmVar) {
            super(j);
            this.y = xmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y.N(hu0.this, sd5.a);
        }

        @Override // hu0.F1
        public final String toString() {
            return super.toString() + this.y;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean z0(hu0 hu0Var) {
        return hu0Var._isCompleted;
    }

    public void A0(Runnable runnable) {
        if (!B0(runnable)) {
            pg0.E.A0(runnable);
            return;
        }
        Thread threadQ0 = q0();
        if (Thread.currentThread() != threadQ0) {
            LockSupport.unpark(threadQ0);
        }
    }

    public final boolean B0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
                if (z) {
                    return true;
                }
            } else if (obj instanceof j52) {
                j52 j52Var = (j52) obj;
                int iA = j52Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                    j52 j52VarE = j52Var.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, j52VarE) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == hn.C) {
                    return false;
                }
                j52 j52Var2 = new j52(8, true);
                j52Var2.a((Runnable) obj);
                j52Var2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, j52Var2)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj);
                if (z) {
                    return true;
                }
            }
        }
    }

    public final boolean C0() {
        u0<kl0<?>> u0Var = this.A;
        if (!(u0Var == null || u0Var.b == u0Var.c)) {
            return false;
        }
        LPt8Fixed lPt8 = (LPt8Fixed) this._delayed;
        if (lPt8 != null && !lPt8.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof j52) {
                return ((j52) obj).d();
            }
            if (obj != hn.C) {
                return false;
            }
        }
        return true;
    }

    public final void D0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void E0(long j, F1 f1) {
        int iD;
        Thread threadQ0;
        j75 j75Var = null;
        if (this._isCompleted != 0) {
            iD = 1;
        } else {
            LPt8Fixed lPt8 = (LPt8Fixed) this._delayed;
            if (lPt8 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                LPt8Fixed lPt9 = new LPt8Fixed(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lPt9) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                lPt8 = (LPt8Fixed) this._delayed;
            }
            iD = f1.d(j, lPt8, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                x0(j, f1);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        LPt8Fixed lPt10 = (LPt8Fixed) this._delayed;
        if (lPt10 != null) {
            synchronized (lPt10) {
                j75[] j75VarArr = lPt10.a;
                j75Var = j75VarArr != null ? j75VarArr[0] : null;
            }
            j75Var = (F1) j75Var;
        }
        if (!(j75Var == f1) || Thread.currentThread() == (threadQ0 = q0())) {
            return;
        }
        LockSupport.unpark(threadQ0);
    }

    @Override // defpackage.ti0
    public am0 b(long j, Runnable runnable, la0 la0Var) {
        return ti0.QnHx.a(j, runnable, la0Var);
    }

    @Override // defpackage.ti0
    public final void f(long j, xm xmVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            QnHx qnHx = new QnHx(j2 + jNanoTime, xmVar);
            E0(jNanoTime, qnHx);
            xmVar.B(new im0(qnHx, 0));
        }
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        A0(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:103:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x00da A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:93:0x00d6, B:95:0x00da), top: B:109:0x00d6 }] */
    @Override // defpackage.gu0
    public final long i0() {
        Runnable runnable;
        long j;
        LPt8Fixed lPt8;
        Object obj;
        F1 f1;
        long jNanoTime;
        boolean z;
        F1 f1C;
        if (l0()) {
            return 0L;
        }
        LPt8Fixed lPt9 = (LPt8Fixed) this._delayed;
        if (lPt9 != null && !lPt9.b()) {
            long jNanoTime2 = System.nanoTime();
            do {
                synchronized (lPt9) {
                    Object[] objArr = lPt9.a;
                    Object obj2 = objArr != null ? objArr[0] : null;
                    if (obj2 == null) {
                        f1C = null;
                    } else {
                        F1 f2 = (F1) obj2;
                        f1C = ((jNanoTime2 - f2.w) > 0L ? 1 : ((jNanoTime2 - f2.w) == 0L ? 0 : -1)) >= 0 ? B0(f2) : false ? lPt9.c(0) : null;
                    }
                }
            } while (f1C != null);
        }
        while (true) {
            Object obj3 = this._queue;
            if (obj3 != null) {
                if (obj3 instanceof j52) {
                    j52 j52Var = (j52) obj3;
                    Object objF = j52Var.f();
                    if (objF != j52.g) {
                        runnable = (Runnable) objF;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
                    j52 j52VarE = j52Var.e();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, j52VarE) && atomicReferenceFieldUpdater.get(this) == obj3) {
                    }
                } else if (obj3 != hn.C) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj3, null)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        runnable = (Runnable) obj3;
                        break;
                    }
                }
            }
            runnable = null;
            break;
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        u0<kl0<?>> u0Var = this.A;
        if (u0Var != null) {
            if (u0Var.b == u0Var.c) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == 0) {
            return 0L;
        }
        Object obj4 = this._queue;
        if (obj4 == null) {
            lPt8 = (LPt8Fixed) this._delayed;
            if (lPt8 != null) {
                synchronized (lPt8) {
                    Object[] objArr2 = lPt8.a;
                    obj = objArr2 != null ? objArr2[0] : null;
                }
                f1 = (F1) obj;
                if (f1 != null) {
                    jNanoTime = f1.w - System.nanoTime();
                    if (jNanoTime < 0) {
                        return 0L;
                    }
                    return jNanoTime;
                }
            }
        } else if (obj4 instanceof j52) {
            if (!((j52) obj4).d()) {
                return 0L;
            }
            lPt8 = (LPt8Fixed) this._delayed;
            if (lPt8 != null) {
                synchronized (lPt8) {
                    Object[] objArr3 = lPt8.a;
                    if (objArr3 != null) {
                    }
                    f1 = (F1) obj;
                    if (f1 != null) {
                        jNanoTime = f1.w - System.nanoTime();
                        if (jNanoTime < 0) {
                            return 0L;
                        }
                        return jNanoTime;
                    }
                }
            }
        } else if (obj4 != hn.C) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.gu0
    public void shutdown() {
        F1 f1D;
        ThreadLocal<gu0> threadLocal = f75.a;
        f75.a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            py4 py4Var = hn.C;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, py4Var)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof j52) {
                    ((j52) obj).b();
                    break;
                }
                if (obj == py4Var) {
                    break;
                }
                j52 j52Var = new j52(8, true);
                j52Var.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, j52Var)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
                if (z) {
                    break;
                }
            }
        }
        while (i0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            LPt8Fixed lPt8 = (LPt8Fixed) this._delayed;
            if (lPt8 == null || (f1D = lPt8.d()) == null) {
                return;
            } else {
                x0(jNanoTime, f1D);
            }
        }
    }
}
