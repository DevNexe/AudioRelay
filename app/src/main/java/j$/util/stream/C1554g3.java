package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;

/* JADX INFO: renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1554g3 extends X2 implements j$.util.C {
    C1554g3(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        super(abstractC1616w0, spliterator, z);
    }

    C1554g3(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        super(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.l(this, consumer);
    }

    @Override // j$.util.L
    public final void d(InterfaceC1494n interfaceC1494n) {
        if (this.h != null || this.i) {
            while (o(interfaceC1494n)) {
            }
            return;
        }
        interfaceC1494n.getClass();
        h();
        C1549f3 c1549f3 = new C1549f3(interfaceC1494n, 1);
        this.b.w1(this.d, c1549f3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.f(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        K2 k2 = new K2();
        this.h = k2;
        this.e = this.b.x1(new C1549f3(k2, 0));
        this.f = new C1520a(4, this);
    }

    @Override // j$.util.stream.X2
    final X2 k(Spliterator spliterator) {
        return new C1554g3(this.b, spliterator, this.a);
    }

    @Override // j$.util.L
    public final boolean o(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        boolean zF = f();
        if (zF) {
            K2 k2 = (K2) this.h;
            long j = this.g;
            int iT = k2.t(j);
            interfaceC1494n.accept((k2.c == 0 && iT == 0) ? ((double[]) k2.e)[(int) j] : ((double[][]) k2.f)[iT][(int) (j - k2.d[iT])]);
        }
        return zF;
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.C trySplit() {
        return (j$.util.C) super.trySplit();
    }
}
