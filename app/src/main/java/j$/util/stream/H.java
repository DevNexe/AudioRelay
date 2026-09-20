package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class H implements E3 {
    final boolean a;
    final Object b;
    final Predicate c;
    final Supplier d;

    H(boolean z, W2 w2, Object obj, S1 s1, C1525b c1525b) {
        this.a = z;
        this.b = obj;
        this.c = s1;
        this.d = c1525b;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        return V2.u | (this.a ? 0 : V2.r);
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        F3 f3 = (F3) this.d.get();
        abstractC1616w0.w1(spliterator, f3);
        Object obj = f3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.E3
    public final Object y(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        return new N(this, abstractC1616w0, spliterator).invoke();
    }
}
