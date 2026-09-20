package j$.util.stream;

import j$.util.C1512k;
import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class K extends M implements InterfaceC1553g2 {
    K() {
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C1512k.d(((Long) this.b).longValue());
        }
        return null;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }
}
