package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class I1 extends AbstractC1616w0 {
    final /* synthetic */ j$.util.function.H h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(W2 w2, j$.util.function.H h, int i) {
        super(w2);
        this.h = h;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC1616w0
    public final P1 u1() {
        return new J1(this.i, this.h);
    }
}
