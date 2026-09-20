package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
abstract class A3 {
    protected final Spliterator a;
    protected final boolean b;
    private final long c;
    private final AtomicLong d;

    A3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    A3(Spliterator spliterator, A3 a3) {
        this.a = spliterator;
        this.b = a3.b;
        this.d = a3.d;
        this.c = a3.c;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    protected final long q(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    protected abstract Spliterator r(Spliterator spliterator);

    protected final z3 s() {
        if (this.d.get() > 0) {
            return z3.MAYBE_MORE;
        }
        return this.b ? z3.UNLIMITED : z3.NO_MORE;
    }

    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) m37trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.F m34trySplit() {
        return (j$.util.F) m37trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.I m35trySplit() {
        return (j$.util.I) m37trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.L m36trySplit() {
        return (j$.util.L) m37trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m37trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return r(spliteratorTrySplit);
    }
}
