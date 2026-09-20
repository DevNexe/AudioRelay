package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class N2 extends P2 implements j$.util.I {
    final /* synthetic */ O2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N2(O2 o2, int i, int i2, int i3, int i4) {
        super(o2, i, i2, i3, i4);
        this.g = o2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void f(int i, Object obj, Object obj2) {
        ((InterfaceC1481g0) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.L g(Object obj, int i, int i2) {
        return j$.util.b0.l((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.P2
    final j$.util.L h(int i, int i2, int i3, int i4) {
        return new N2(this.g, i, i2, i3, i4);
    }
}
