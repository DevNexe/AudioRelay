package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class J2 extends P2 implements j$.util.C {
    final /* synthetic */ K2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J2(K2 k2, int i, int i2, int i3, int i4) {
        super(k2, i, i2, i3, i4);
        this.g = k2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void f(int i, Object obj, Object obj2) {
        ((InterfaceC1494n) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.L g(Object obj, int i, int i2) {
        return j$.util.b0.j((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.P2
    final j$.util.L h(int i, int i2, int i3, int i4) {
        return new J2(this.g, i, i2, i3, i4);
    }
}
