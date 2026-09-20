package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class i3 extends X2 implements j$.util.F {
    i3(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        super(abstractC1616w0, spliterator, z);
    }

    i3(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        super(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.m(this, consumer);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: c */
    public final void d(j$.util.function.L l) {
        if (this.h != null || this.i) {
            while (o(l)) {
            }
            return;
        }
        l.getClass();
        h();
        C1559h3 c1559h3 = new C1559h3(l, 1);
        this.b.w1(this.d, c1559h3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.g(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        M2 m2 = new M2();
        this.h = m2;
        this.e = this.b.x1(new C1559h3(m2, 0));
        this.f = new C1520a(5, this);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: j */
    public final boolean o(j$.util.function.L l) {
        l.getClass();
        boolean zF = f();
        if (zF) {
            M2 m2 = (M2) this.h;
            long j = this.g;
            int iT = m2.t(j);
            l.accept((m2.c == 0 && iT == 0) ? ((int[]) m2.e)[(int) j] : ((int[][]) m2.f)[iT][(int) (j - m2.d[iT])]);
        }
        return zF;
    }

    @Override // j$.util.stream.X2
    final X2 k(Spliterator spliterator) {
        return new i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.F trySplit() {
        return (j$.util.F) super.trySplit();
    }
}
