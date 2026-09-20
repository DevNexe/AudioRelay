package j$.util.stream;

import j$.util.C1510i;
import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class I extends M implements InterfaceC1543e2 {
    I() {
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC1558h2, j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        p(Double.valueOf(d));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C1510i.d(((Double) this.b).doubleValue());
        }
        return null;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }
}
