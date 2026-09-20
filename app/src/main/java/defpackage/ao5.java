package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ao5 {
    public static final String e = s52.e("WorkTimer");
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    public interface CQf {
        void a(String str);
    }

    public static class F1 implements Runnable {
        public final ao5 w;
        public final String x;

        public F1(ao5 ao5Var, String str) {
            this.w = ao5Var;
            this.x = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.w.d) {
                if (((F1) this.w.b.remove(this.x)) != null) {
                    CQf cQf = (CQf) this.w.c.remove(this.x);
                    if (cQf != null) {
                        cQf.a(this.x);
                    }
                } else {
                    s52.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.x), new Throwable[0]);
                }
            }
        }
    }

    public class QnHx implements ThreadFactory {
        public int w = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.w);
            this.w = this.w + 1;
            return threadNewThread;
        }
    }

    public ao5() {
        QnHx qnHx = new QnHx();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(qnHx);
    }

    public final void a(String str, CQf cQf) {
        synchronized (this.d) {
            s52.c().a(e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            F1 f1 = new F1(this, str);
            this.b.put(str, f1);
            this.c.put(str, cQf);
            this.a.schedule(f1, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            if (((F1) this.b.remove(str)) != null) {
                s52.c().a(e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
