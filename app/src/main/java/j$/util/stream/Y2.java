package j$.util.stream;

import j$.util.function.C1488k;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: loaded from: classes2.dex */
final class Y2 extends AbstractC1529b3 implements InterfaceC1494n {
    final double[] c = new double[128];

    Y2() {
    }

    @Override // j$.util.stream.AbstractC1529b3
    final void a(Object obj, long j) {
        InterfaceC1494n interfaceC1494n = (InterfaceC1494n) obj;
        for (int i = 0; i < j; i++) {
            interfaceC1494n.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }
}
