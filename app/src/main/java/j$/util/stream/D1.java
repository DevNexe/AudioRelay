package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1478f;

/* JADX INFO: loaded from: classes2.dex */
final class D1 extends Q1 implements P1 {
    final /* synthetic */ Object b;
    final /* synthetic */ BiFunction c;
    final /* synthetic */ InterfaceC1478f d;

    D1(Object obj, BiFunction biFunction, InterfaceC1478f interfaceC1478f) {
        this.b = obj;
        this.c = biFunction;
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
    public final /* synthetic */ void accept(long j) {
        AbstractC1616w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.a = this.c.apply(this.a, obj);
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
        this.a = this.b;
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void k(P1 p1) {
        this.a = this.d.apply(this.a, ((D1) p1).a);
    }
}
