package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class A extends D {
    A(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void J(InterfaceC1494n interfaceC1494n) {
        if (isParallel()) {
            super.J(interfaceC1494n);
        } else {
            D.Q1(M1()).d(interfaceC1494n);
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

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void m0(InterfaceC1494n interfaceC1494n) {
        if (isParallel()) {
            super.m0(interfaceC1494n);
        } else {
            D.Q1(M1()).d(interfaceC1494n);
        }
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }
}
