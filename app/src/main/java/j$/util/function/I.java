package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements L {
    public final /* synthetic */ L a;
    public final /* synthetic */ L b;

    public /* synthetic */ I(L l, L l2) {
        this.a = l;
        this.b = l2;
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        this.a.accept(i);
        this.b.accept(i);
    }

    @Override // j$.util.function.L
    public final L n(L l) {
        l.getClass();
        return new I(this, l);
    }
}
