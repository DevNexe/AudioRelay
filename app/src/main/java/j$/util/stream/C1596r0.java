package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1501t;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1596r0 extends AbstractC1600s0 implements InterfaceC1543e2 {
    final /* synthetic */ EnumC1604t0 c;
    final /* synthetic */ InterfaceC1501t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1596r0(InterfaceC1501t interfaceC1501t, EnumC1604t0 enumC1604t0) {
        super(enumC1604t0);
        this.c = enumC1604t0;
        this.d = interfaceC1501t;
    }

    @Override // j$.util.stream.AbstractC1600s0, j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        boolean zE = ((j$.util.function.r) this.d).e(d);
        EnumC1604t0 enumC1604t0 = this.c;
        if (zE == enumC1604t0.a) {
            this.a = true;
            this.b = enumC1604t0.b;
        }
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
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
