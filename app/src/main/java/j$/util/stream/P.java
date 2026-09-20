package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class P extends T implements InterfaceC1548f2 {
    final j$.util.function.L b;

    P(j$.util.function.L l, boolean z) {
        super(z);
        this.b = l;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        this.b.accept(i);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        g((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        AbstractC1616w0.s0(this, num);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
