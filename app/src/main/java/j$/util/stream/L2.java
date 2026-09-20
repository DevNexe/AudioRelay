package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class L2 extends P2 implements j$.util.F {
    final /* synthetic */ M2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L2(M2 m2, int i, int i2, int i3, int i4) {
        super(m2, i, i2, i3, i4);
        this.g = m2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void f(int i, Object obj, Object obj2) {
        ((j$.util.function.L) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.L g(Object obj, int i, int i2) {
        return j$.util.b0.k((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.P2
    final j$.util.L h(int i, int i2, int i3, int i4) {
        return new L2(this.g, i, i2, i3, i4);
    }
}
