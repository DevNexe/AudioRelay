package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1619x extends AbstractC1531c0 {
    public final /* synthetic */ int s;
    final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1619x(AbstractC1530c abstractC1530c, int i, Object obj, int i2) {
        super(abstractC1530c, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // j$.util.stream.AbstractC1530c
    final InterfaceC1558h2 K1(int i, InterfaceC1558h2 interfaceC1558h2) {
        switch (this.s) {
            case 0:
                return new C1607u(this, interfaceC1558h2, 2);
            case 1:
                return new X(this, interfaceC1558h2, 1);
            case 2:
                return new X(this, interfaceC1558h2, 3);
            case 3:
                return new X(this, interfaceC1558h2, 7);
            case 4:
                return new X(this, interfaceC1558h2, 8);
            case 5:
                return new C1551g0(this, interfaceC1558h2, 3);
            case 6:
                return new T1(this, interfaceC1558h2, 3);
            default:
                return new C1592q(this, interfaceC1558h2);
        }
    }
}
