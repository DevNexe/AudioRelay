package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1478f;
import j$.util.function.InterfaceC1494n;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class C1 extends Q1 implements P1, InterfaceC1543e2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.z0 c;
    final /* synthetic */ InterfaceC1478f d;

    C1(Supplier supplier, j$.util.function.z0 z0Var, InterfaceC1478f interfaceC1478f) {
        this.b = supplier;
        this.c = z0Var;
        this.d = interfaceC1478f;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void k(P1 p1) {
        this.a = this.d.apply(this.a, ((C1) p1).a);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.InterfaceC1543e2
    public final /* synthetic */ void p(Double d) {
        AbstractC1616w0.q0(this, d);
    }
}
