package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jq6 extends AtomicReference implements Runnable {
    public static final jl6 w = new jl6(0);
    public static final jl6 x = new jl6(0);

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        iq6 iq6Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof iq6;
            jl6 jl6Var = x;
            if (!z2) {
                if (runnable != jl6Var) {
                    break;
                }
            } else {
                iq6Var = (iq6) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == jl6Var || compareAndSet(runnable, jl6Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(iq6Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        jl6 jl6Var = x;
        jl6 jl6Var2 = w;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            iq6 iq6Var = new iq6(this);
            iq6Var.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, iq6Var)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(jl6Var2)) == jl6Var) {
                    }
                } finally {
                    if (((Runnable) getAndSet(jl6Var2)) == jl6Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !f();
            jl6 jl6Var = w;
            if (z) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, jl6Var)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, jl6Var)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, jl6Var)) {
                c(threadCurrentThread);
            }
            if (z) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == w) {
            str = "running=[DONE]";
        } else if (runnable instanceof iq6) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
