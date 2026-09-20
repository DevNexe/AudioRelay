package j$.util.concurrent;

import j$.util.AbstractC1514m;
import j$.util.F;
import j$.util.function.Consumer;
import j$.util.function.L;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class A implements F {
    long a;
    final long b;
    final int c;
    final int d;

    A(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(L l) {
        l.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                l.accept(threadLocalRandomCurrent.d(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final A trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new A(j, j2, this.c, this.d);
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
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

    @Override // j$.util.L
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean o(L l) {
        l.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        l.accept(ThreadLocalRandom.current().d(this.c, this.d));
        this.a = j + 1;
        return true;
    }
}
