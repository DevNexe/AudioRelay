package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1488k implements InterfaceC1494n {
    public final /* synthetic */ InterfaceC1494n a;
    public final /* synthetic */ InterfaceC1494n b;

    public /* synthetic */ C1488k(InterfaceC1494n interfaceC1494n, InterfaceC1494n interfaceC1494n2) {
        this.a = interfaceC1494n;
        this.b = interfaceC1494n2;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        j$.time.a.c(this.a, this.b, d);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }
}
