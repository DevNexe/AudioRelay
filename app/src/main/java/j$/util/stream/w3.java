package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class w3 extends x3 implements j$.util.I, InterfaceC1481g0 {
    long e;

    w3(j$.util.I i, long j, long j2) {
        super(i, j, j2);
    }

    w3(j$.util.I i, w3 w3Var) {
        super(i, w3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        this.e = j;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator r(Spliterator spliterator) {
        return new w3((j$.util.I) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void t(Object obj) {
        ((InterfaceC1481g0) obj).accept(this.e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC1529b3 u() {
        return new C1524a3();
    }
}
