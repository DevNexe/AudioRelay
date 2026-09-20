package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ll0 {
    public ThreadPoolExecutor a;
    public final ArrayDeque<bj3.QnHx> b = new ArrayDeque<>();
    public final ArrayDeque<bj3.QnHx> c = new ArrayDeque<>();
    public final ArrayDeque<bj3> d = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        if (this.a == null) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new of5(ur1.d(" Dispatcher", qf5.f), false));
        }
        return this.a;
    }

    public final void b(bj3.QnHx qnHx) {
        qnHx.x.decrementAndGet();
        ArrayDeque<bj3.QnHx> arrayDeque = this.c;
        synchronized (this) {
            if (!arrayDeque.remove(qnHx)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            c();
        }
        sd5 sd5Var = sd5.a;
        c();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r3 < 5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r1.remove();
        r2.x.incrementAndGet();
        r0.add(r2);
        r8.c.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r8 = this;
            byte[] r0 = defpackage.qf5.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.util.ArrayDeque<bj3$QnHx> r1 = r8.b     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La1
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La1
            bj3$QnHx r2 = (bj3.QnHx) r2     // Catch: java.lang.Throwable -> La1
            java.util.ArrayDeque<bj3$QnHx> r3 = r8.c     // Catch: java.lang.Throwable -> La1
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La1
            monitor-enter(r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            r4 = 64
            if (r3 < r4) goto L27
            goto L44
        L27:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.x     // Catch: java.lang.Throwable -> La1
            int r3 = r3.get()     // Catch: java.lang.Throwable -> La1
            monitor-enter(r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            r4 = 5
            if (r3 < r4) goto L33
            goto Le
        L33:
            r1.remove()     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.atomic.AtomicInteger r3 = r2.x     // Catch: java.lang.Throwable -> La1
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> La1
            r0.add(r2)     // Catch: java.lang.Throwable -> La1
            java.util.ArrayDeque<bj3$QnHx> r3 = r8.c     // Catch: java.lang.Throwable -> La1
            r3.add(r2)     // Catch: java.lang.Throwable -> La1
            goto Le
        L44:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> La1
            java.util.ArrayDeque<bj3$QnHx> r1 = r8.c     // Catch: java.lang.Throwable -> L9e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayDeque<bj3> r2 = r8.d     // Catch: java.lang.Throwable -> L9e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 + r2
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            sd5 r1 = defpackage.sd5.a     // Catch: java.lang.Throwable -> La1
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L5b:
            if (r2 >= r1) goto L9d
            int r3 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            bj3$QnHx r2 = (bj3.QnHx) r2
            java.util.concurrent.ExecutorService r4 = r8.a()
            bj3 r5 = defpackage.bj3.this
            rt2 r6 = r5.w
            ll0 r6 = r6.w
            byte[] r6 = defpackage.qf5.a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.lang.Throwable -> L77 java.util.concurrent.RejectedExecutionException -> L79
            r4.execute(r2)     // Catch: java.lang.Throwable -> L77 java.util.concurrent.RejectedExecutionException -> L79
            goto L93
        L77:
            r0 = move-exception
            goto L95
        L79:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L77
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L77
            r5.l(r6)     // Catch: java.lang.Throwable -> L77
            yl r4 = r2.w     // Catch: java.lang.Throwable -> L77
            r4.b(r6)     // Catch: java.lang.Throwable -> L77
            rt2 r4 = r5.w
            ll0 r4 = r4.w
            r4.b(r2)
        L93:
            r2 = r3
            goto L5b
        L95:
            rt2 r1 = r5.w
            ll0 r1 = r1.w
            r1.b(r2)
            throw r0
        L9d:
            return
        L9e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        La1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll0.c():void");
    }
}
