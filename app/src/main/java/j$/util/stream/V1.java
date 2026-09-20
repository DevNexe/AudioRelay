package j$.util.stream;

import j$.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
final class V1 extends Y1 {
    public final /* synthetic */ int s;
    final /* synthetic */ Function t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V1(AbstractC1530c abstractC1530c, int i, Function function, int i2) {
        super(abstractC1530c, i);
        this.s = i2;
        this.t = function;
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        switch (this.s) {
            case 0:
                return new T1(this, interfaceC1558h2, 2);
            default:
                return new T1(this, interfaceC1558h2, 6);
        }
    }
}
