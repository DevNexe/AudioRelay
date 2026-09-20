package j$.util.stream;

import j$.util.function.InterfaceC1473c0;

/* JADX INFO: loaded from: classes2.dex */
final class M1 extends AbstractC1616w0 {
    final /* synthetic */ InterfaceC1473c0 h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M1(W2 w2, InterfaceC1473c0 interfaceC1473c0, long j) {
        super(w2);
        this.h = interfaceC1473c0;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        return new N1(this.i, this.h);
    }
}
