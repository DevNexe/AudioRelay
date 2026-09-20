package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class W extends AbstractC1514m implements I {
    W() {
    }

    @Override // j$.util.I, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.I
    /* JADX INFO: renamed from: b */
    public final void d(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
    }

    @Override // j$.util.I
    /* JADX INFO: renamed from: e */
    public final boolean o(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return false;
    }

    @Override // j$.util.I, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
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

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ I trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ L trySplit() {
        return null;
    }
}
