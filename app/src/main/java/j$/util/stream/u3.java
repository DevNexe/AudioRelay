package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class u3 extends x3 implements j$.util.C, InterfaceC1494n {
    double e;

    u3(j$.util.C c, long j, long j2) {
        super(c, j, j2);
    }

    u3(j$.util.C c, u3 u3Var) {
        super(c, u3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.e = d;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator r(Spliterator spliterator) {
        return new u3((j$.util.C) spliterator, this);
    }

    @Override // j$.util.stream.x3
    protected final void t(Object obj) {
        ((InterfaceC1494n) obj).accept(this.e);
    }

    @Override // j$.util.stream.x3
    protected final AbstractC1529b3 u() {
        return new Y2();
    }
}
