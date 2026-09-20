package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class O extends T implements InterfaceC1543e2 {
    final InterfaceC1494n b;

    O(InterfaceC1494n interfaceC1494n, boolean z) {
        super(z);
        this.b = interfaceC1494n;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.b.accept(d);
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
