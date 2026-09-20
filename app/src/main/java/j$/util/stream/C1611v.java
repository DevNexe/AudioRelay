package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1611v extends C {
    public final /* synthetic */ int s;
    final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1611v(AbstractC1530c abstractC1530c, int i, Object obj, int i2) {
        super(abstractC1530c, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        switch (this.s) {
            case 0:
                return new C1607u(this, interfaceC1558h2, 0);
            case 1:
                return new C1607u(this, interfaceC1558h2, 4);
            case 2:
                return new C1607u(this, interfaceC1558h2, 5);
            case 3:
                return new C1607u(this, interfaceC1558h2, 6);
            case 4:
                return new X(this, interfaceC1558h2, 6);
            case 5:
                return new C1551g0(this, interfaceC1558h2, 4);
            case 6:
                return new T1(this, interfaceC1558h2, 5);
            default:
                return new C1592q(this, interfaceC1558h2);
        }
    }
}
