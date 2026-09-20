package j$.util.concurrent;

import j$.util.AbstractC1514m;
import j$.util.C;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class z implements C {
    long a;
    final long b;
    final double c;
    final double d;

    z(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // j$.util.C, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.L
    public final void d(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                interfaceC1494n.accept(threadLocalRandomCurrent.c(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.Spliterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new z(j, j2, this.c, this.d);
    }

    @Override // j$.util.C, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
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
    public final boolean o(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        interfaceC1494n.accept(ThreadLocalRandom.current().c(this.c, this.d));
        this.a = j + 1;
        return true;
    }
}
