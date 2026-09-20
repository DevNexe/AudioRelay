package j$.util.stream;

import j$.util.function.InterfaceC1486j;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1625y1 extends AbstractC1616w0 {
    final /* synthetic */ InterfaceC1486j h;
    final /* synthetic */ double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1625y1(W2 w2, InterfaceC1486j interfaceC1486j, double d) {
        super(w2);
        this.h = interfaceC1486j;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        return new C1629z1(this.i, this.h);
    }
}
