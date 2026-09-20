package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1475d0 implements InterfaceC1481g0 {
    public final /* synthetic */ InterfaceC1481g0 a;
    public final /* synthetic */ InterfaceC1481g0 b;

    public /* synthetic */ C1475d0(InterfaceC1481g0 interfaceC1481g0, InterfaceC1481g0 interfaceC1481g1) {
        this.a = interfaceC1481g0;
        this.b = interfaceC1481g1;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        this.a.accept(j);
        this.b.accept(j);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }
}
