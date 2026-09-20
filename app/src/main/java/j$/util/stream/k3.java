package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: loaded from: classes2.dex */
final class k3 extends X2 implements j$.util.I {
    k3(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        super(abstractC1616w0, spliterator, z);
    }

    k3(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        super(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC1514m.n(this, consumer);
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: b */
    public final void d(InterfaceC1481g0 interfaceC1481g0) {
        if (this.h != null || this.i) {
            while (o(interfaceC1481g0)) {
            }
            return;
        }
        interfaceC1481g0.getClass();
        h();
        j3 j3Var = new j3(interfaceC1481g0, 1);
        this.b.w1(this.d, j3Var);
        this.i = true;
    }

    @Override // j$.util.L
    /* JADX INFO: renamed from: e */
    public final boolean o(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        boolean zF = f();
        if (zF) {
            O2 o2 = (O2) this.h;
            long j = this.g;
            int iT = o2.t(j);
            interfaceC1481g0.accept((o2.c == 0 && iT == 0) ? ((long[]) o2.e)[(int) j] : ((long[][]) o2.f)[iT][(int) (j - o2.d[iT])]);
        }
        return zF;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1514m.h(this, consumer);
    }

    @Override // j$.util.stream.X2
    final void i() {
        O2 o2 = new O2();
        this.h = o2;
        this.e = this.b.x1(new j3(o2, 0));
        this.f = new C1520a(6, this);
    }

    @Override // j$.util.stream.X2
    final X2 k(Spliterator spliterator) {
        return new k3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.I trySplit() {
        return (j$.util.I) super.trySplit();
    }
}
