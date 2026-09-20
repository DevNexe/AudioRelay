package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1521a0 extends AbstractC1536d0 {
    C1521a0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    @Override // j$.util.stream.AbstractC1530c
    final boolean J1() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1536d0, j$.util.stream.IntStream
    public final void S(j$.util.function.L l) {
        if (isParallel()) {
            super.S(l);
        } else {
            AbstractC1536d0.Q1(M1()).d(l);
        }
    }

    @Override // j$.util.stream.AbstractC1536d0, j$.util.stream.IntStream
    public final void a0(j$.util.function.L l) {
        if (isParallel()) {
            super.a0(l);
        } else {
            AbstractC1536d0.Q1(M1()).d(l);
        }
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
