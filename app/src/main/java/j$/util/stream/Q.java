package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class Q extends T implements InterfaceC1553g2 {
    final InterfaceC1481g0 b;

    Q(InterfaceC1481g0 interfaceC1481g0, boolean z) {
        super(z);
        this.b = interfaceC1481g0;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        this.b.accept(j);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }
}
