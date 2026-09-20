package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1627z extends C {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1627z(AbstractC1530c abstractC1530c, int i, int i2) {
        super(abstractC1530c, i);
        this.s = i2;
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        switch (this.s) {
            case 0:
                return interfaceC1558h2;
            case 1:
                return new X(this, interfaceC1558h2, 2);
            default:
                return new C1551g0(this, interfaceC1558h2, 0);
        }
    }
}
