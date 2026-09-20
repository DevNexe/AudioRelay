package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class U extends AbstractC1514m implements C {
    U() {
    }

    @Override // j$.util.C, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.C
    public final void d(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
    }

    @Override // j$.util.C, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
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

    @Override // j$.util.C
    public final boolean o(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return false;
    }

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ C trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC1514m, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ L trySplit() {
        return null;
    }
}
