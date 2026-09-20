package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1478f;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1621x1 extends Q1 implements P1, InterfaceC1553g2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.F0 c;
    final /* synthetic */ InterfaceC1478f d;

    C1621x1(Supplier supplier, j$.util.function.F0 f0, InterfaceC1478f interfaceC1478f) {
        this.b = supplier;
        this.c = f0;
        this.d = interfaceC1478f;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final /* synthetic */ void accept(double d) {
        AbstractC1616w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ void accept(int i) {
        AbstractC1616w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
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

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.P1
    public final void k(P1 p1) {
        this.a = this.d.apply(this.a, ((C1621x1) p1).a);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }
}
