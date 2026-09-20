package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class i54 {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    public static final class QnHx implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(i54.d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    i54.d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        boolean zEquals;
        int i;
        boolean z;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        b = i;
        if (!a) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new q14("RxSchedulerPurge"));
            while (true) {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != scheduledExecutorService) {
                    z = false;
                    break;
                }
            }
            if (z) {
                QnHx qnHx = new QnHx();
                long j = b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(qnHx, j, j, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
