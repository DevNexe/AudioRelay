package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class W implements j$.util.function.L {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC1558h2 b;

    public /* synthetic */ W(int i, InterfaceC1558h2 interfaceC1558h2) {
        this.a = i;
        this.b = interfaceC1558h2;
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        int i2 = this.a;
        InterfaceC1558h2 interfaceC1558h2 = this.b;
        switch (i2) {
            case 0:
                interfaceC1558h2.accept(i);
                break;
            default:
                ((X) interfaceC1558h2).a.accept(i);
                break;
        }
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        switch (this.a) {
            case 0:
                l.getClass();
                break;
            default:
                l.getClass();
                break;
        }
        return new j$.util.function.I(this, l);
    }
}
