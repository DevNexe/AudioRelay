package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1526b0 extends AbstractC1536d0 {
    AbstractC1526b0(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    @Override // j$.util.stream.AbstractC1530c
    final boolean J1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
