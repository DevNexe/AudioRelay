package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ro6 extends sv6 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    public eo6 c;
    public eo6 d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final vm6 g;
    public final vm6 h;
    public final Object i;
    public final Semaphore j;

    public ro6(dq6 dq6Var) {
        super(dq6Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new vm6(this, "Thread death: Uncaught exception on worker thread");
        this.h = new vm6(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.dv6
    public final void e() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // defpackage.sv6
    public final boolean f() {
        return false;
    }

    public final void i() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object j(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ro6 ro6Var = this.a.j;
            dq6.h(ro6Var);
            ro6Var.m(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.i.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            bi6 bi6Var2 = this.a.i;
            dq6.h(bi6Var2);
            bi6Var2.i.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final en6 k(Callable callable) {
        g();
        en6 en6Var = new en6(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.i.b("Callable skipped the worker queue.");
            }
            en6Var.run();
        } else {
            p(en6Var);
        }
        return en6Var;
    }

    public final void l(Runnable runnable) {
        g();
        en6 en6Var = new en6(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(en6Var);
            eo6 eo6Var = this.d;
            if (eo6Var == null) {
                eo6 eo6Var2 = new eo6(this, "Measurement Network", this.f);
                this.d = eo6Var2;
                eo6Var2.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                synchronized (eo6Var.w) {
                    eo6Var.w.notifyAll();
                }
            }
        }
    }

    public final void m(Runnable runnable) {
        g();
        oa3.h(runnable);
        p(new en6(this, runnable, false, "Task exception on worker thread"));
    }

    public final void n(Runnable runnable) {
        g();
        p(new en6(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean o() {
        return Thread.currentThread() == this.c;
    }

    public final void p(en6 en6Var) {
        synchronized (this.i) {
            this.e.add(en6Var);
            eo6 eo6Var = this.c;
            if (eo6Var == null) {
                eo6 eo6Var2 = new eo6(this, "Measurement Worker", this.e);
                this.c = eo6Var2;
                eo6Var2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                synchronized (eo6Var.w) {
                    eo6Var.w.notifyAll();
                }
            }
        }
    }
}
