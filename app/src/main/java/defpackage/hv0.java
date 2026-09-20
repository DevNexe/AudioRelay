package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hv0 extends c54 {
    public static final c54 d = j54.a;
    public final boolean b = false;
    public final Executor c;

    public static final class CQf extends AtomicReference<Runnable> implements Runnable, vl0 {
        public final av3 w;
        public final av3 x;

        public CQf(Runnable runnable) {
            super(runnable);
            this.w = new av3();
            this.x = new av3();
        }

        @Override // defpackage.vl0
        public final void a() {
            if (getAndSet(null) != null) {
                this.w.a();
                this.x.a();
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            av3 av3Var = this.x;
            av3 av3Var2 = this.w;
            bm0 bm0Var = bm0.DISPOSED;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    av3Var2.lazySet(bm0Var);
                    av3Var.lazySet(bm0Var);
                }
            }
        }
    }

    public static final class F1 extends c54.F1 implements Runnable {
        public final boolean w;
        public final Executor x;
        public volatile boolean z;
        public final AtomicInteger A = new AtomicInteger();
        public final h40 B = new h40();
        public final jh2<Runnable> y = new jh2<>();

        public static final class CQf extends AtomicInteger implements Runnable, vl0 {
            public final Runnable w;
            public final wl0 x;
            public volatile Thread y;

            public CQf(Runnable runnable, h40 h40Var) {
                this.w = runnable;
                this.x = h40Var;
            }

            @Override // defpackage.vl0
            public final void a() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            wl0 wl0Var = this.x;
                            if (wl0Var != null) {
                                wl0Var.d(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.y;
                        if (thread != null) {
                            thread.interrupt();
                            this.y = null;
                        }
                        set(4);
                        wl0 wl0Var2 = this.x;
                        if (wl0Var2 != null) {
                            wl0Var2.d(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // defpackage.vl0
            public final boolean e() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.y = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.y = null;
                        return;
                    }
                    try {
                        this.w.run();
                        this.y = null;
                        if (compareAndSet(1, 2)) {
                        } else {
                            while (i == i) {
                                Thread.yield();
                            }
                        }
                    } finally {
                        this.y = null;
                        if (compareAndSet(1, 2)) {
                            wl0 wl0Var = this.x;
                            if (wl0Var != null) {
                                wl0Var.d(this);
                            }
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: hv0$F1$F1, reason: collision with other inner class name */
        public final class RunnableC0141F1 implements Runnable {
            public final av3 w;
            public final Runnable x;

            public RunnableC0141F1(av3 av3Var, Runnable runnable) {
                this.w = av3Var;
                this.x = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vl0 vl0VarC = F1.this.c(this.x);
                av3 av3Var = this.w;
                av3Var.getClass();
                bm0.g(av3Var, vl0VarC);
            }
        }

        public static final class QnHx extends AtomicBoolean implements Runnable, vl0 {
            public final Runnable w;

            public QnHx(Runnable runnable) {
                this.w = runnable;
            }

            @Override // defpackage.vl0
            public final void a() {
                lazySet(true);
            }

            @Override // defpackage.vl0
            public final boolean e() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.w.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        public F1(Executor executor, boolean z) {
            this.x = executor;
            this.w = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.z) {
                return;
            }
            this.z = true;
            this.B.a();
            if (this.A.getAndIncrement() == 0) {
                this.y.clear();
            }
        }

        @Override // c54.F1
        public final vl0 c(Runnable runnable) {
            vl0 qnHx;
            boolean z = this.z;
            yr0 yr0Var = yr0.INSTANCE;
            if (z) {
                return yr0Var;
            }
            m14.c(runnable);
            if (this.w) {
                qnHx = new CQf(runnable, this.B);
                this.B.b(qnHx);
            } else {
                qnHx = new QnHx(runnable);
            }
            this.y.offer(qnHx);
            if (this.A.getAndIncrement() == 0) {
                try {
                    this.x.execute(this);
                } catch (RejectedExecutionException e) {
                    this.z = true;
                    this.y.clear();
                    m14.b(e);
                    return yr0Var;
                }
            }
            return qnHx;
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return c(runnable);
            }
            boolean z = this.z;
            yr0 yr0Var = yr0.INSTANCE;
            if (z) {
                return yr0Var;
            }
            av3 av3Var = new av3();
            av3 av3Var2 = new av3(av3Var);
            m14.c(runnable);
            a54 a54Var = new a54(new RunnableC0141F1(av3Var2, runnable), this.B);
            this.B.b(a54Var);
            Executor executor = this.x;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    a54Var.b(((ScheduledExecutorService) executor).schedule((Callable) a54Var, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.z = true;
                    m14.b(e);
                    return yr0Var;
                }
            } else {
                a54Var.b(new jm0(hv0.d.c(a54Var, j, timeUnit)));
            }
            bm0.g(av3Var, a54Var);
            return av3Var2;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jh2<Runnable> jh2Var = this.y;
            int iAddAndGet = 1;
            while (!this.z) {
                while (true) {
                    Runnable runnablePoll = jh2Var.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.z) {
                        jh2Var.clear();
                        return;
                    }
                }
                if (this.z) {
                    jh2Var.clear();
                    return;
                } else {
                    iAddAndGet = this.A.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            jh2Var.clear();
        }
    }

    public final class QnHx implements Runnable {
        public final CQf w;

        public QnHx(CQf cQf) {
            this.w = cQf;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CQf cQf = this.w;
            av3 av3Var = cQf.x;
            vl0 vl0VarB = hv0.this.b(cQf);
            av3Var.getClass();
            bm0.g(av3Var, vl0VarB);
        }
    }

    public hv0(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new F1(this.c, this.b);
    }

    @Override // defpackage.c54
    public final vl0 b(Runnable runnable) {
        Executor executor = this.c;
        m14.c(runnable);
        try {
            if (executor instanceof ExecutorService) {
                z44 z44Var = new z44(runnable);
                z44Var.b(((ExecutorService) executor).submit(z44Var));
                return z44Var;
            }
            if (this.b) {
                F1.CQf cQf = new F1.CQf(runnable, null);
                executor.execute(cQf);
                return cQf;
            }
            F1.QnHx qnHx = new F1.QnHx(runnable);
            executor.execute(qnHx);
            return qnHx;
        } catch (RejectedExecutionException e) {
            m14.b(e);
            return yr0.INSTANCE;
        }
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        m14.c(runnable);
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                z44 z44Var = new z44(runnable);
                z44Var.b(((ScheduledExecutorService) executor).schedule(z44Var, j, timeUnit));
                return z44Var;
            } catch (RejectedExecutionException e) {
                m14.b(e);
                return yr0.INSTANCE;
            }
        }
        CQf cQf = new CQf(runnable);
        vl0 vl0VarC = d.c(new QnHx(cQf), j, timeUnit);
        av3 av3Var = cQf.w;
        av3Var.getClass();
        bm0.g(av3Var, vl0VarC);
        return cQf;
    }

    @Override // defpackage.c54
    public final vl0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            y44 y44Var = new y44(runnable);
            y44Var.b(((ScheduledExecutorService) executor).scheduleAtFixedRate(y44Var, j, j2, timeUnit));
            return y44Var;
        } catch (RejectedExecutionException e) {
            m14.b(e);
            return yr0.INSTANCE;
        }
    }
}
