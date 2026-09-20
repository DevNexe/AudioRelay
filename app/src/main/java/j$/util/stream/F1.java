package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC1478f;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class F1 extends AbstractC1616w0 {
    final /* synthetic */ InterfaceC1478f h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ InterfaceC1576m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(W2 w2, InterfaceC1478f interfaceC1478f, BiConsumer biConsumer, Supplier supplier, InterfaceC1576m interfaceC1576m) {
        super(w2);
        this.h = interfaceC1478f;
        this.i = biConsumer;
        this.j = supplier;
        this.k = interfaceC1576m;
    }

    @Override // j$.util.stream.AbstractC1616w0, j$.util.stream.E3
    public final int P() {
        if (((C1568k) this.k).b().contains(EnumC1564j.UNORDERED)) {
            return V2.r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        return new G1(this.j, this.i, this.h);
    }
}
