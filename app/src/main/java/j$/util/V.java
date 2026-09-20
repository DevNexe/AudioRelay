package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class V extends AbstractC1514m implements F {
    V() {
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.F
    /* JADX INFO: renamed from: c */
    public final void d(j$.util.function.L l) {
        l.getClass();
    }

    @Override // j$.util.F, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
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

    @Override // j$.util.F
    /* JADX INFO: renamed from: j */
    public final boolean o(j$.util.function.L l) {
        l.getClass();
        return false;
    }

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ F trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ L trySplit() {
        return null;
    }
}
