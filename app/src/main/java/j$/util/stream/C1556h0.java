package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1556h0 extends AbstractC1569k0 {
    C1556h0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.AbstractC1569k0, j$.util.stream.InterfaceC1581n0
    public final void G(InterfaceC1481g0 interfaceC1481g0) {
        if (isParallel()) {
            super.G(interfaceC1481g0);
        } else {
            AbstractC1569k0.Q1(M1()).d(interfaceC1481g0);
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

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC1581n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC1581n0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC1569k0, j$.util.stream.InterfaceC1581n0
    public final void z(InterfaceC1481g0 interfaceC1481g0) {
        if (isParallel()) {
            super.z(interfaceC1481g0);
        } else {
            AbstractC1569k0.Q1(M1()).d(interfaceC1481g0);
        }
    }
}
