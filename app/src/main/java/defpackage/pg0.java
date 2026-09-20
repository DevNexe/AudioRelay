package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class pg0 extends hu0 implements Runnable {
    public static final pg0 E;
    public static final long F;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        pg0 pg0Var = new pg0();
        E = pg0Var;
        pg0Var.Z(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        F = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.hu0
    public final void A0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0(runnable);
    }

    public final synchronized void F0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            D0();
            notifyAll();
        }
    }

    @Override // defpackage.hu0, defpackage.ti0
    public final am0 b(long j, Runnable runnable, la0 la0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return cp2.w;
        }
        long jNanoTime = System.nanoTime();
        hu0.CQf cQf = new hu0.CQf(runnable, j2 + jNanoTime);
        E0(jNanoTime, cQf);
        return cQf;
    }

    @Override // defpackage.iu0
    public final Thread q0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "pg0");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        f75.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z = true;
                }
            }
            if (!z) {
                _thread = null;
                F0();
                if (C0()) {
                    return;
                }
                q0();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jI0 = i0();
                if (jI0 == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = F + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        F0();
                        if (C0()) {
                            return;
                        }
                        q0();
                        return;
                    }
                    if (jI0 > j2) {
                        jI0 = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jI0 > 0) {
                    int i2 = debugStatus;
                    if (i2 == 2 || i2 == 3) {
                        _thread = null;
                        F0();
                        if (C0()) {
                            return;
                        }
                        q0();
                        return;
                    }
                    LockSupport.parkNanos(this, jI0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            F0();
            if (!C0()) {
                q0();
            }
            throw th;
        }
    }

    @Override // defpackage.hu0, defpackage.gu0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.iu0
    public final void x0(long j, hu0.F1 f1) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
