package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j32 extends oa0 implements Runnable, ti0 {
    public final /* synthetic */ ti0 A;
    public final i52<Runnable> B;
    public final Object C;
    private volatile int runningWorkers;
    public final oa0 y;
    public final int z;

    /* JADX WARN: Multi-variable type inference failed */
    public j32(oa0 oa0Var, int i) {
        this.y = oa0Var;
        this.z = i;
        ti0 ti0Var = oa0Var instanceof ti0 ? (ti0) oa0Var : null;
        this.A = ti0Var == null ? qg0.a : ti0Var;
        this.B = new i52<>();
        this.C = new Object();
    }

    @Override // defpackage.ti0
    public final am0 b(long j, Runnable runnable, la0 la0Var) {
        return this.A.b(j, runnable, la0Var);
    }

    @Override // defpackage.ti0
    public final void f(long j, xm xmVar) {
        this.A.f(j, xmVar);
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        this.B.a(runnable);
        boolean z = true;
        if (this.runningWorkers >= this.z) {
            return;
        }
        synchronized (this.C) {
            if (this.runningWorkers >= this.z) {
                z = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z) {
            this.y.g(this, this);
        }
    }

    @Override // defpackage.oa0
    public final void n(la0 la0Var, Runnable runnable) {
        this.B.a(runnable);
        boolean z = true;
        if (this.runningWorkers >= this.z) {
            return;
        }
        synchronized (this.C) {
            if (this.runningWorkers >= this.z) {
                z = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z) {
            this.y.n(this, this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnableD = this.B.d();
                if (runnableD != null) {
                    try {
                        runnableD.run();
                    } catch (Throwable th) {
                        ps0.K(xr0.w, th);
                    }
                    i++;
                    if (i >= 16 && this.y.o()) {
                        this.y.g(this, this);
                        return;
                    }
                }
            }
            synchronized (this.C) {
                this.runningWorkers--;
                if (this.B.c() == 0) {
                    return;
                }
                this.runningWorkers++;
                sd5 sd5Var = sd5.a;
            }
        }
    }

    @Override // defpackage.oa0
    public final oa0 v(int i) {
        throw null;
    }
}
