package io.ktor.utils.io.internal;

import defpackage.a42;
import defpackage.qc0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(QnHx.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(QnHx.class, "_availableForWrite$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(QnHx.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;
    public final int a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public QnHx(int i) {
        this.a = i;
        this._availableForWrite$internal = i;
    }

    public final void a(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.a) {
                StringBuilder sbA = a42.a("Completed read overflow: ", i2, " + ", i, " = ");
                sbA.append(i3);
                sbA.append(" > ");
                sbA.append(this.a);
                throw new IllegalArgumentException(sbA.toString());
            }
        } while (!c.compareAndSet(this, i2, i3));
    }

    public final void b(int i) {
        int i2;
        int i3;
        do {
            i2 = this._pendingToFlush;
            i3 = i2 + i;
            if (i3 > this.a) {
                StringBuilder sbA = a42.a("Complete write overflow: ", i2, " + ", i, " > ");
                sbA.append(this.a);
                throw new IllegalArgumentException(sbA.toString());
            }
        } while (!d.compareAndSet(this, i2, i3));
    }

    public final boolean c() {
        int andSet = d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return b.addAndGet(this, andSet) > 0;
    }

    public final boolean d() {
        return this._availableForWrite$internal == 0;
    }

    public final void e() {
        this._availableForRead$internal = this.a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.a;
    }

    public final boolean g() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.a) {
                return false;
            }
        } while (!c.compareAndSet(this, i, 0));
        return true;
    }

    public final int h(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForWrite$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!c.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingBufferCapacity[read: ");
        sb.append(this._availableForRead$internal);
        sb.append(", write: ");
        sb.append(this._availableForWrite$internal);
        sb.append(", flush: ");
        sb.append(this._pendingToFlush);
        sb.append(", capacity: ");
        return qc0.a(sb, this.a, ']');
    }
}
