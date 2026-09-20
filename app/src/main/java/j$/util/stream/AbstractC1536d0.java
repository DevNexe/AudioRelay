package j$.util.stream;

import j$.util.C1467f;
import j$.util.C1510i;
import j$.util.C1511j;
import j$.util.InterfaceC1631t;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1536d0 extends AbstractC1530c implements IntStream {
    AbstractC1536d0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    AbstractC1536d0(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.F Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.F) {
            return (j$.util.F) spliterator;
        }
        if (!H3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        H3.a(AbstractC1530c.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 B1(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC1616w0.S0(abstractC1616w0, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final Object C(Supplier supplier, j$.util.function.C0 c0, BiConsumer biConsumer) {
        C1599s c1599s = new C1599s(biConsumer, 1);
        supplier.getClass();
        c0.getClass();
        return z1(new C1617w1(W2.INT_VALUE, c1599s, c0, supplier, 4));
    }

    @Override // j$.util.stream.AbstractC1530c
    final void C1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        j$.util.function.L w;
        j$.util.F fQ1 = Q1(spliterator);
        if (interfaceC1558h2 instanceof j$.util.function.L) {
            w = (j$.util.function.L) interfaceC1558h2;
        } else {
            if (H3.a) {
                H3.a(AbstractC1530c.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            interfaceC1558h2.getClass();
            w = new W(0, interfaceC1558h2);
        }
        while (!interfaceC1558h2.h() && fQ1.o(w)) {
        }
    }

    @Override // j$.util.stream.AbstractC1530c
    final W2 D1() {
        return W2.INT_VALUE;
    }

    @Override // j$.util.stream.IntStream
    public final boolean F(j$.util.function.P p) {
        return ((Boolean) z1(AbstractC1616w0.o1(p, EnumC1604t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator N1(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        return new i3(abstractC1616w0, c1520a, z);
    }

    public void S(j$.util.function.L l) {
        l.getClass();
        z1(new P(l, true));
    }

    @Override // j$.util.stream.IntStream
    public final Stream T(IntFunction intFunction) {
        intFunction.getClass();
        return new C1615w(this, V2.p | V2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream W(IntFunction intFunction) {
        return new C1619x(this, V2.p | V2.n | V2.t, intFunction, 3);
    }

    public void a0(j$.util.function.L l) {
        l.getClass();
        z1(new P(l, false));
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new C1627z(this, V2.p | V2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1581n0 asLongStream() {
        return new Y(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.IntStream
    public final C1510i average() {
        long[] jArr = (long[]) C(new C1525b(17), new C1525b(18), new C1525b(19));
        long j = jArr[0];
        return j > 0 ? C1510i.d(jArr[1] / j) : C1510i.a();
    }

    @Override // j$.util.stream.IntStream
    public final G b0(j$.util.function.T t) {
        t.getClass();
        return new C1611v(this, V2.p | V2.n, t, 4);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return T(new S1(27));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC1569k0) d(new C1525b(16))).sum();
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1581n0 d(j$.util.function.W w) {
        w.getClass();
        return new C1623y(this, V2.p | V2.n, w, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).K(new C1525b(15));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e0(j$.util.function.P p) {
        p.getClass();
        return new C1619x(this, V2.t, p, 4);
    }

    @Override // j$.util.stream.IntStream
    public final C1511j f0(j$.util.function.H h) {
        h.getClass();
        return (C1511j) z1(new A1(W2.INT_VALUE, h, 2));
    }

    @Override // j$.util.stream.IntStream
    public final C1511j findAny() {
        return (C1511j) z1(new H(false, W2.INT_VALUE, C1511j.a(), new S1(22), new C1525b(13)));
    }

    @Override // j$.util.stream.IntStream
    public final C1511j findFirst() {
        return (C1511j) z1(new H(true, W2.INT_VALUE, C1511j.a(), new S1(22), new C1525b(13)));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream g0(j$.util.function.L l) {
        l.getClass();
        return new C1619x(this, 0, l, 1);
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final InterfaceC1631t iterator() {
        return j$.util.b0.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream k(j$.util.function.Z z) {
        z.getClass();
        return new C1619x(this, V2.p | V2.n, z, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC1616w0.n1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final C1511j max() {
        return f0(new S1(28));
    }

    @Override // j$.util.stream.IntStream
    public final C1511j min() {
        return f0(new S1(23));
    }

    @Override // j$.util.stream.IntStream
    public final int r(int i, j$.util.function.H h) {
        h.getClass();
        return ((Integer) z1(new I1(W2.INT_VALUE, h, i))).intValue();
    }

    @Override // j$.util.stream.AbstractC1616w0
    final A0 r1(long j, IntFunction intFunction) {
        return AbstractC1616w0.h1(j);
    }

    @Override // j$.util.stream.IntStream
    public final boolean s(j$.util.function.P p) {
        return ((Boolean) z1(AbstractC1616w0.o1(p, EnumC1604t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1616w0.n1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new A2(this);
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final j$.util.F spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return r(0, new S1(24));
    }

    @Override // j$.util.stream.IntStream
    public final C1467f summaryStatistics() {
        return (C1467f) C(new S1(9), new S1(25), new S1(26));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC1616w0.e1((C0) A1(new C1525b(20))).b();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u(j$.util.function.P p) {
        return ((Boolean) z1(AbstractC1616w0.o1(p, EnumC1604t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final InterfaceC1560i unordered() {
        return !F1() ? this : new Z(this, V2.r);
    }
}
