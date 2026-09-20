package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC1565j0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC1530c abstractC1530c, int i, int i2) {
        super(abstractC1530c, i);
        this.s = i2;
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        switch (this.s) {
            case 0:
                return new X(this, interfaceC1558h2, 0);
            default:
                return interfaceC1558h2;
        }
    }
}
