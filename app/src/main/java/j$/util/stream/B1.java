package j$.util.stream;

import j$.util.C1510i;
import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1486j;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class B1 implements P1, InterfaceC1543e2 {
    private boolean a;
    private double b;
    final /* synthetic */ InterfaceC1486j c;

    B1(InterfaceC1486j interfaceC1486j) {
        this.c = interfaceC1486j;
    }

    @Override // j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
        } else {
            d = this.c.applyAsDouble(this.b, d);
        }
        this.b = d;
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
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? C1510i.a() : C1510i.d(this.b);
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final void k(P1 p1) {
        B1 b1 = (B1) p1;
        if (b1.a) {
            return;
        }
        accept(b1.b);
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
