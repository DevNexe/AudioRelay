package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class z40 extends c54 {
    public static final CQf c;
    public static final q14 d;
    public static final int e;
    public static final F1 f;
    public final AtomicReference<CQf> b;

    public static final class CQf {
        public final int a;
        public final F1[] b;
        public long c;

        public CQf(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new F1[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new F1(threadFactory);
            }
        }

        public final F1 a() {
            int i = this.a;
            if (i == 0) {
                return z40.f;
            }
            long j = this.c;
            this.c = 1 + j;
            return this.b[(int) (j % ((long) i))];
        }
    }

    public static final class F1 extends ko2 {
        public F1(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public static final class QnHx extends c54.F1 {
        public volatile boolean A;
        public final z32 w;
        public final h40 x;
        public final z32 y;
        public final F1 z;

        public QnHx(F1 f1) {
            this.z = f1;
            z32 z32Var = new z32();
            this.w = z32Var;
            h40 h40Var = new h40();
            this.x = h40Var;
            z32 z32Var2 = new z32();
            this.y = z32Var2;
            z32Var2.b(z32Var);
            z32Var2.b(h40Var);
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.A) {
                return;
            }
            this.A = true;
            this.y.a();
        }

        @Override // c54.F1
        public final vl0 c(Runnable runnable) {
            return this.A ? yr0.INSTANCE : this.z.g(runnable, 0L, TimeUnit.MILLISECONDS, this.w);
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.A ? yr0.INSTANCE : this.z.g(runnable, j, timeUnit, this.x);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.A;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        e = iAvailableProcessors;
        F1 f1 = new F1(new q14("RxComputationShutdown"));
        f = f1;
        f1.a();
        q14 q14Var = new q14(true, "RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())));
        d = q14Var;
        CQf cQf = new CQf(q14Var, 0);
        c = cQf;
        for (F1 f2 : cQf.b) {
            f2.a();
        }
    }

    public z40() {
        int i;
        boolean z;
        CQf cQf = c;
        this.b = new AtomicReference<>(cQf);
        CQf cQf2 = new CQf(d, e);
        while (true) {
            AtomicReference<CQf> atomicReference = this.b;
            if (!atomicReference.compareAndSet(cQf, cQf2)) {
                if (atomicReference.get() != cQf) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        for (F1 f1 : cQf2.b) {
            f1.a();
        }
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new QnHx(this.b.get().a());
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        F1 f1A = this.b.get().a();
        f1A.getClass();
        m14.c(runnable);
        z44 z44Var = new z44(runnable);
        ScheduledExecutorService scheduledExecutorService = f1A.w;
        try {
            z44Var.b(j <= 0 ? scheduledExecutorService.submit(z44Var) : scheduledExecutorService.schedule(z44Var, j, timeUnit));
            return z44Var;
        } catch (RejectedExecutionException e2) {
            m14.b(e2);
            return yr0.INSTANCE;
        }
    }

    @Override // defpackage.c54
    public final vl0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        F1 f1A = this.b.get().a();
        f1A.getClass();
        yr0 yr0Var = yr0.INSTANCE;
        if (j2 > 0) {
            y44 y44Var = new y44(runnable);
            try {
                y44Var.b(f1A.w.scheduleAtFixedRate(y44Var, j, j2, timeUnit));
                return y44Var;
            } catch (RejectedExecutionException e2) {
                m14.b(e2);
                return yr0Var;
            }
        }
        ScheduledExecutorService scheduledExecutorService = f1A.w;
        hp1 hp1Var = new hp1(runnable, scheduledExecutorService);
        try {
            hp1Var.b(j <= 0 ? scheduledExecutorService.submit(hp1Var) : scheduledExecutorService.schedule(hp1Var, j, timeUnit));
            return hp1Var;
        } catch (RejectedExecutionException e3) {
            m14.b(e3);
            return yr0Var;
        }
    }
}
