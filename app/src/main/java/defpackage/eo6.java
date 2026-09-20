package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class eo6 extends Thread {
    public final Object w;
    public final BlockingQueue x;
    public boolean y = false;
    public final /* synthetic */ ro6 z;

    public eo6(ro6 ro6Var, String str, BlockingQueue blockingQueue) {
        this.z = ro6Var;
        oa3.h(blockingQueue);
        this.w = new Object();
        this.x = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.z.i) {
            try {
                if (!this.y) {
                    this.z.j.release();
                    this.z.i.notifyAll();
                    ro6 ro6Var = this.z;
                    if (this == ro6Var.c) {
                        ro6Var.c = null;
                    } else if (this == ro6Var.d) {
                        ro6Var.d = null;
                    } else {
                        bi6 bi6Var = ro6Var.a.i;
                        dq6.h(bi6Var);
                        bi6Var.f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        bi6 bi6Var = this.z.a.i;
        dq6.h(bi6Var);
        bi6Var.i.c(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.z.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                en6 en6Var = (en6) this.x.poll();
                if (en6Var != null) {
                    Process.setThreadPriority(true != en6Var.x ? 10 : threadPriority);
                    en6Var.run();
                } else {
                    synchronized (this.w) {
                        try {
                            if (this.x.peek() == null) {
                                this.z.getClass();
                                try {
                                    this.w.wait(30000L);
                                } catch (InterruptedException e2) {
                                    b(e2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (this.z.i) {
                        if (this.x.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
