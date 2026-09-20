package kotlinx.coroutines.scheduling;

import defpackage.Md5A;
import defpackage.O;
import defpackage.a15;
import defpackage.e15;
import defpackage.ex0;
import defpackage.ga1;
import defpackage.i5;
import defpackage.l15;
import defpackage.lf0;
import defpackage.mp3;
import defpackage.py4;
import defpackage.sd5;
import defpackage.u05;
import defpackage.ur1;
import defpackage.vn5;
import defpackage.yh3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements Executor, Closeable {
    public final ga1 A;
    public final ga1 B;
    public final mp3<C0159QnHx> C;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final int w;
    public final int x;
    public final long y;
    public final String z;
    public static final py4 G = new py4("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(QnHx.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(QnHx.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(QnHx.class, "_isTerminated");

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.QnHx$QnHx, reason: collision with other inner class name */
    public final class C0159QnHx extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(C0159QnHx.class, "workerCtl");
        public int A;
        public boolean B;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final vn5 w;
        volatile /* synthetic */ int workerCtl;
        public int x;
        public long y;
        public long z;

        public C0159QnHx() {
            throw null;
        }

        public C0159QnHx(int i) {
            setDaemon(true);
            this.w = new vn5();
            this.x = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = QnHx.G;
            this.A = yh3.w.d();
            f(i);
        }

        public final u05 a(boolean z) {
            boolean z2;
            u05 u05VarD;
            u05 u05VarE;
            u05 u05VarE2;
            boolean z3;
            if (this.x == 1) {
                z2 = true;
            } else {
                QnHx qnHx = QnHx.this;
                while (true) {
                    long j = qnHx.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        z3 = false;
                        break;
                    }
                    if (QnHx.E.compareAndSet(qnHx, j, j - 4398046511104L)) {
                        z3 = true;
                        break;
                    }
                }
                if (z3) {
                    this.x = 1;
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                if (z) {
                    vn5 vn5Var = this.w;
                    vn5Var.getClass();
                    u05VarD = (u05) vn5.b.getAndSet(vn5Var, null);
                    if (u05VarD == null) {
                        u05VarD = vn5Var.d();
                    }
                    if (u05VarD == null) {
                        u05VarD = QnHx.this.B.d();
                    }
                } else {
                    u05VarD = QnHx.this.B.d();
                }
                return u05VarD == null ? i(true) : u05VarD;
            }
            if (z) {
                boolean z4 = d(QnHx.this.w * 2) == 0;
                if (z4 && (u05VarE2 = e()) != null) {
                    return u05VarE2;
                }
                vn5 vn5Var2 = this.w;
                vn5Var2.getClass();
                u05 u05Var = (u05) vn5.b.getAndSet(vn5Var2, null);
                u05 u05VarD2 = u05Var == null ? vn5Var2.d() : u05Var;
                if (u05VarD2 != null) {
                    return u05VarD2;
                }
                if (!z4 && (u05VarE = e()) != null) {
                    return u05VarE;
                }
            } else {
                u05 u05VarE3 = e();
                if (u05VarE3 != null) {
                    return u05VarE3;
                }
            }
            return i(false);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.A;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.A = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final u05 e() {
            int iD = d(2);
            QnHx qnHx = QnHx.this;
            if (iD == 0) {
                u05 u05VarD = qnHx.A.d();
                return u05VarD != null ? u05VarD : qnHx.B.d();
            }
            u05 u05VarD2 = qnHx.B.d();
            return u05VarD2 != null ? u05VarD2 : qnHx.A.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(QnHx.this.z);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i) {
            int i2 = this.x;
            boolean z = i2 == 1;
            if (z) {
                QnHx.E.addAndGet(QnHx.this, 4398046511104L);
            }
            if (i2 != i) {
                this.x = i;
            }
            return z;
        }

        public final u05 i(boolean z) {
            long jF;
            int i = (int) (QnHx.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int iD = d(i);
            QnHx qnHx = QnHx.this;
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iD++;
                if (iD > i) {
                    iD = 1;
                }
                C0159QnHx c0159QnHxB = qnHx.C.b(iD);
                if (c0159QnHxB != null && c0159QnHxB != this) {
                    if (z) {
                        jF = this.w.e(c0159QnHxB.w);
                    } else {
                        vn5 vn5Var = this.w;
                        vn5 vn5Var2 = c0159QnHxB.w;
                        vn5Var.getClass();
                        u05 u05VarD = vn5Var2.d();
                        if (u05VarD != null) {
                            vn5Var.a(u05VarD, false);
                            jF = -1;
                        } else {
                            jF = vn5Var.f(vn5Var2, false);
                        }
                    }
                    if (jF == -1) {
                        vn5 vn5Var3 = this.w;
                        vn5Var3.getClass();
                        u05 u05Var = (u05) vn5.b.getAndSet(vn5Var3, null);
                        return u05Var == null ? vn5Var3.d() : u05Var;
                    }
                    if (jF > 0) {
                        jMin = Math.min(jMin, jF);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.z = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (QnHx.this.isTerminated() || this.x == 5) {
                        break loop0;
                    }
                    u05 u05VarA = a(this.B);
                    if (u05VarA != null) {
                        this.z = 0L;
                        int iB = u05VarA.x.b();
                        this.y = 0L;
                        if (this.x == 3) {
                            this.x = 2;
                        }
                        QnHx qnHx = QnHx.this;
                        if (iB != 0 && h(2) && !qnHx.h() && !qnHx.g(qnHx.controlState)) {
                            qnHx.h();
                        }
                        qnHx.getClass();
                        try {
                            u05VarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (iB != 0) {
                            QnHx.E.addAndGet(qnHx, -2097152L);
                            if (this.x == 5) {
                                break;
                            }
                            this.x = 4;
                            break;
                        }
                        break;
                    }
                    this.B = false;
                    if (this.z == 0) {
                        if (this.nextParkedWorker != QnHx.G) {
                            this.workerCtl = -1;
                            while (true) {
                                if (!(this.nextParkedWorker != QnHx.G) || this.workerCtl != -1 || QnHx.this.isTerminated() || this.x == 5) {
                                    break;
                                }
                                h(3);
                                Thread.interrupted();
                                if (this.y == 0) {
                                    this.y = System.nanoTime() + QnHx.this.y;
                                }
                                LockSupport.parkNanos(QnHx.this.y);
                                if (System.nanoTime() - this.y >= 0) {
                                    this.y = 0L;
                                    QnHx qnHx2 = QnHx.this;
                                    synchronized (qnHx2.C) {
                                        if (!qnHx2.isTerminated()) {
                                            if (((int) (qnHx2.controlState & 2097151)) > qnHx2.w) {
                                                if (D.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    f(0);
                                                    qnHx2.f(this, i, 0);
                                                    int andDecrement = (int) (QnHx.E.getAndDecrement(qnHx2) & 2097151);
                                                    if (andDecrement != i) {
                                                        C0159QnHx c0159QnHxB = qnHx2.C.b(andDecrement);
                                                        qnHx2.C.c(i, c0159QnHxB);
                                                        c0159QnHxB.f(i);
                                                        qnHx2.f(c0159QnHxB, andDecrement, i);
                                                    }
                                                    qnHx2.C.c(andDecrement, null);
                                                    sd5 sd5Var = sd5.a;
                                                    this.x = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            QnHx.this.e(this);
                        }
                    } else {
                        if (z) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.z);
                            this.z = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            h(5);
        }
    }

    public QnHx(int i, int i2, String str, long j) {
        this.w = i;
        this.x = i2;
        this.y = j;
        this.z = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(ex0.b("Core pool size ", i, " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(Md5A.e("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(ex0.b("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.A = new ga1();
        this.B = new ga1();
        this.parkedWorkersStack = 0L;
        this.C = new mp3<>(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public final int b() {
        synchronized (this.C) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.w) {
                return 0;
            }
            if (i >= this.x) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.C.b(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            C0159QnHx c0159QnHx = new C0159QnHx(i3);
            this.C.c(i3, c0159QnHx);
            if (!(i3 == ((int) (2097151 & E.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c0159QnHx.start();
            return i2 + 1;
        }
    }

    public final void c(Runnable runnable, a15 a15Var, boolean z) {
        u05 e15Var;
        u05 u05VarA;
        l15.e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof u05) {
            e15Var = (u05) runnable;
            e15Var.w = jNanoTime;
            e15Var.x = a15Var;
        } else {
            e15Var = new e15(runnable, jNanoTime, a15Var);
        }
        Thread threadCurrentThread = Thread.currentThread();
        C0159QnHx c0159QnHx = null;
        C0159QnHx c0159QnHx2 = threadCurrentThread instanceof C0159QnHx ? (C0159QnHx) threadCurrentThread : null;
        if (c0159QnHx2 != null && ur1.a(QnHx.this, this)) {
            c0159QnHx = c0159QnHx2;
        }
        if (c0159QnHx == null || c0159QnHx.x == 5 || (e15Var.x.b() == 0 && c0159QnHx.x == 2)) {
            u05VarA = e15Var;
        } else {
            c0159QnHx.B = true;
            u05VarA = c0159QnHx.w.a(e15Var, z);
        }
        if (u05VarA != null) {
            if (!(u05VarA.x.b() == 1 ? this.B.a(u05VarA) : this.A.a(u05VarA))) {
                throw new RejectedExecutionException(i5.b(new StringBuilder(), this.z, " was terminated"));
            }
        }
        boolean z2 = z && c0159QnHx != null;
        if (e15Var.x.b() == 0) {
            if (z2 || h() || g(this.controlState)) {
                return;
            }
            h();
            return;
        }
        long jAddAndGet = E.addAndGet(this, 2097152L);
        if (z2 || h() || g(jAddAndGet)) {
            return;
        }
        h();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        u05 u05VarD;
        boolean z;
        if (F.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0159QnHx c0159QnHx = threadCurrentThread instanceof C0159QnHx ? (C0159QnHx) threadCurrentThread : null;
            if (c0159QnHx == null || !ur1.a(QnHx.this, this)) {
                c0159QnHx = null;
            }
            synchronized (this.C) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C0159QnHx c0159QnHxB = this.C.b(i2);
                    if (c0159QnHxB != c0159QnHx) {
                        while (c0159QnHxB.isAlive()) {
                            LockSupport.unpark(c0159QnHxB);
                            c0159QnHxB.join(10000L);
                        }
                        vn5 vn5Var = c0159QnHxB.w;
                        ga1 ga1Var = this.B;
                        vn5Var.getClass();
                        u05 u05Var = (u05) vn5.b.getAndSet(vn5Var, null);
                        if (u05Var != null) {
                            ga1Var.a(u05Var);
                        }
                        do {
                            u05 u05VarD2 = vn5Var.d();
                            if (u05VarD2 == null) {
                                z = false;
                            } else {
                                ga1Var.a(u05VarD2);
                                z = true;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.B.b();
            this.A.b();
            while (true) {
                if (c0159QnHx != null) {
                    u05VarD = c0159QnHx.a(true);
                    if (u05VarD == null) {
                        u05VarD = this.A.d();
                        if (u05VarD == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    u05VarD = this.A.d();
                    if (u05VarD == null && (u05VarD = this.B.d()) == null) {
                        break;
                    }
                }
                try {
                    u05VarD.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0159QnHx != null) {
                c0159QnHx.h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void e(C0159QnHx c0159QnHx) {
        long j;
        int iB;
        if (c0159QnHx.c() != G) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iB = c0159QnHx.b();
            c0159QnHx.g(this.C.b((int) (2097151 & j)));
        } while (!D.compareAndSet(this, j, ((long) iB) | ((2097152 + j) & (-2097152))));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, l15.f, false);
    }

    public final void f(C0159QnHx c0159QnHx, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iB = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iB == i) {
                if (i2 == 0) {
                    Object objC = c0159QnHx.c();
                    while (true) {
                        if (objC == G) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        C0159QnHx c0159QnHx2 = (C0159QnHx) objC;
                        iB = c0159QnHx2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = c0159QnHx2.c();
                        }
                    }
                } else {
                    iB = i2;
                }
            }
            if (iB >= 0 && D.compareAndSet(this, j, j2 | ((long) iB))) {
                return;
            }
        }
    }

    public final boolean g(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.w;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        py4 py4Var;
        int iB;
        while (true) {
            long j = this.parkedWorkersStack;
            C0159QnHx c0159QnHxB = this.C.b((int) (2097151 & j));
            if (c0159QnHxB == null) {
                c0159QnHxB = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = c0159QnHxB.c();
                while (true) {
                    py4Var = G;
                    if (objC == py4Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C0159QnHx c0159QnHx = (C0159QnHx) objC;
                    iB = c0159QnHx.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c0159QnHx.c();
                }
                if (iB >= 0 && D.compareAndSet(this, j, ((long) iB) | j2)) {
                    c0159QnHxB.g(py4Var);
                }
            }
            if (c0159QnHxB == null) {
                return false;
            }
            if (C0159QnHx.D.compareAndSet(c0159QnHxB, -1, 0)) {
                LockSupport.unpark(c0159QnHxB);
                return true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.C.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            C0159QnHx c0159QnHxB = this.C.b(i6);
            if (c0159QnHxB != null) {
                int iC = c0159QnHxB.w.c();
                int iH = O.h(c0159QnHxB.x);
                if (iH == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iH == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iH == 2) {
                    i3++;
                } else if (iH == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iH == 4) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.z + '@' + lf0.a(this) + "[Pool Size {core = " + this.w + ", max = " + this.x + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.A.c() + ", global blocking queue size = " + this.B.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.w - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
