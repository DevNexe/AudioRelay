package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1608u0 implements E3 {
    final EnumC1604t0 a;
    final Supplier b;

    C1608u0(W2 w2, EnumC1604t0 enumC1604t0, C1584o c1584o) {
        this.a = enumC1604t0;
        this.b = c1584o;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        return V2.u | V2.r;
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        AbstractC1600s0 abstractC1600s0 = (AbstractC1600s0) this.b.get();
        abstractC1616w0.w1(spliterator, abstractC1600s0);
        return Boolean.valueOf(abstractC1600s0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.E3
    public final Object y(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        return (Boolean) new C1612v0(this, abstractC1616w0, spliterator).invoke();
    }
}
