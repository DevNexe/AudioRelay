package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC1478f;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class L1 extends Q1 implements P1, InterfaceC1548f2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.C0 c;
    final /* synthetic */ InterfaceC1478f d;

    L1(Supplier supplier, j$.util.function.C0 c0, InterfaceC1478f interfaceC1478f) {
        this.b = supplier;
        this.c = c0;
        this.d = interfaceC1478f;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        g((Integer) obj);
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

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        AbstractC1616w0.s0(this, num);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void k(P1 p1) {
        this.a = this.d.apply(this.a, ((L1) p1).a);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
