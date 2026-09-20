package j$.util.stream;

import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1478f;
import j$.util.function.InterfaceC1486j;

/* JADX INFO: loaded from: classes2.dex */
final class A1 extends AbstractC1616w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A1(W2 w2, Object obj, int i) {
        super(w2);
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new B1((InterfaceC1486j) obj);
            case 1:
                return new E1((InterfaceC1478f) obj);
            case 2:
                return new K1((j$.util.function.H) obj);
            default:
                return new O1((InterfaceC1473c0) obj);
        }
    }
}
