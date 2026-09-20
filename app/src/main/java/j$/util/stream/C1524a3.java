package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1524a3 extends AbstractC1529b3 implements InterfaceC1481g0 {
    final long[] c = new long[128];

    C1524a3() {
    }

    @Override // j$.util.stream.AbstractC1529b3
    public final void a(Object obj, long j) {
        InterfaceC1481g0 interfaceC1481g0 = (InterfaceC1481g0) obj;
        for (int i = 0; i < j; i++) {
            interfaceC1481g0.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }
}
