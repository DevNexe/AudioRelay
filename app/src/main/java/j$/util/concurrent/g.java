package j$.util.concurrent;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class g extends q implements Spliterator {
    final ConcurrentHashMap i;
    long j;

    g(m[] mVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        m mVarF = f();
        if (mVarF == null) {
            return false;
        }
        consumer.p(new l(mVarF.b, mVarF.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            m mVarF = f();
            if (mVarF == null) {
                return;
            } else {
                consumer.p(new l(mVarF.b, mVarF.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        m[] mVarArr = this.a;
        int i4 = this.h;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new g(mVarArr, i4, i3, i2, j, this.i);
    }
}
