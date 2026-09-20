package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class Z2 extends AbstractC1529b3 implements j$.util.function.L {
    final int[] c = new int[128];

    Z2() {
    }

    @Override // j$.util.stream.AbstractC1529b3
    public final void a(Object obj, long j) {
        j$.util.function.L l = (j$.util.function.L) obj;
        for (int i = 0; i < j; i++) {
            l.accept(this.c[i]);
        }
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
