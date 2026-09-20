package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class vn5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(vn5.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(vn5.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(vn5.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(vn5.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<u05> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final u05 a(u05 u05Var, boolean z) {
        if (z) {
            return b(u05Var);
        }
        u05 u05Var2 = (u05) b.getAndSet(this, u05Var);
        if (u05Var2 == null) {
            return null;
        }
        return b(u05Var2);
    }

    public final u05 b(u05 u05Var) {
        if (u05Var.x.b() == 1) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return u05Var;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, u05Var);
        c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final u05 d() {
        u05 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.x.b() == 1) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long e(vn5 vn5Var) {
        int i = vn5Var.consumerIndex;
        int i2 = vn5Var.producerIndex;
        AtomicReferenceArray<u05> atomicReferenceArray = vn5Var.a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (vn5Var.blockingTasksInBuffer == 0) {
                break;
            }
            u05 u05Var = atomicReferenceArray.get(i3);
            if (u05Var != null) {
                if (u05Var.x.b() == 1) {
                    while (!atomicReferenceArray.compareAndSet(i3, u05Var, null)) {
                        if (atomicReferenceArray.get(i3) != u05Var) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        e.decrementAndGet(vn5Var);
                        a(u05Var, false);
                        return -1L;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return f(vn5Var, true);
    }

    public final long f(vn5 vn5Var, boolean z) {
        u05 u05Var;
        boolean z2;
        do {
            u05Var = (u05) vn5Var.lastScheduledTask;
            if (u05Var == null) {
                return -2L;
            }
            z2 = true;
            if (z) {
                if (!(u05Var.x.b() == 1)) {
                    return -2L;
                }
            }
            l15.e.getClass();
            long jNanoTime = System.nanoTime() - u05Var.w;
            long j = l15.a;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(vn5Var, u05Var, null)) {
                if (atomicReferenceFieldUpdater.get(vn5Var) != u05Var) {
                    z2 = false;
                    break;
                }
            }
        } while (!z2);
        a(u05Var, false);
        return -1L;
    }
}
