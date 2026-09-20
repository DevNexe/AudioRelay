package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1565j0 extends AbstractC1569k0 {
    AbstractC1565j0(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    @Override // j$.util.stream.AbstractC1530c
    final boolean J1() {
        return false;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC1581n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC1581n0 sequential() {
        sequential();
        return this;
    }
}
