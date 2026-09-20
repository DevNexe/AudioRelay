package j$.util.concurrent;

import j$.util.AbstractC1514m;
import j$.util.I;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class B implements I {
    long a;
    final long b;
    final long c;
    final long d;

    B(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // j$.util.I, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void d(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                interfaceC1481g0.accept(threadLocalRandomCurrent.e(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean o(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        interfaceC1481g0.accept(ThreadLocalRandom.current().e(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final B trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new B(j, j2, this.c, this.d);
    }

    @Override // j$.util.I, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
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
}
