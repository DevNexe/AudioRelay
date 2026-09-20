package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a54 extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, vl0 {
    public final Runnable w;
    public static final Object x = new Object();
    public static final Object y = new Object();
    public static final Object z = new Object();
    public static final Object A = new Object();

    public a54(Runnable runnable, wl0 wl0Var) {
        super(3);
        this.w = runnable;
        lazySet(0, wl0Var);
    }

    @Override // defpackage.vl0
    public final void a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = A;
            if (obj6 == obj || obj6 == (obj4 = y) || obj6 == (obj5 = z)) {
                break;
            }
            boolean z2 = get(2) != Thread.currentThread();
            if (z2) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z2);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = x) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((wl0) obj2).d(this);
    }

    public final void b(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == A) {
                return;
            }
            if (obj == y) {
                future.cancel(false);
                return;
            } else if (obj == z) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.vl0
    public final boolean e() {
        Object obj = get(0);
        return obj == x || obj == A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = z;
        Object obj3 = y;
        Object obj4 = x;
        Object obj5 = A;
        lazySet(2, Thread.currentThread());
        try {
            this.w.run();
        } catch (Throwable th) {
            try {
                m14.b(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((wl0) obj6).d(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((wl0) obj7).d(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(1), obj5)) {
        }
    }
}
