package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class W1 extends Z1 {
    W1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.Stream
    public final void H(Consumer consumer) {
        if (isParallel()) {
            super.H(consumer);
        } else {
            M1().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC1530c
    final boolean J1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.Z1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            M1().forEachRemaining(consumer);
        }
    }
}
