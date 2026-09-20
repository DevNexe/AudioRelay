package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class X extends AbstractC1514m implements Spliterator {
    X() {
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
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
}
