package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract class B extends D {
    B(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    @Override // j$.util.stream.AbstractC1530c
    final boolean J1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }
}
