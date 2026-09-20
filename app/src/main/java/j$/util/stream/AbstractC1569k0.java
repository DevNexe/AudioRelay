package j$.util.stream;

import j$.util.C1508g;
import j$.util.C1510i;
import j$.util.C1512k;
import j$.util.InterfaceC1635x;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.InterfaceC1493m0;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1569k0 extends AbstractC1530c implements InterfaceC1581n0 {
    AbstractC1569k0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    AbstractC1569k0(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.I Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.I) {
            return (j$.util.I) spliterator;
        }
        if (!H3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        H3.a(AbstractC1530c.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final Object A(Supplier supplier, j$.util.function.F0 f0, BiConsumer biConsumer) {
        C1599s c1599s = new C1599s(biConsumer, 2);
        supplier.getClass();
        f0.getClass();
        return z1(new C1617w1(W2.LONG_VALUE, c1599s, f0, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final boolean B(InterfaceC1493m0 interfaceC1493m0) {
        return ((Boolean) z1(AbstractC1616w0.q1(interfaceC1493m0, EnumC1604t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 B1(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC1616w0.T0(abstractC1616w0, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC1530c
    final void C1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        InterfaceC1481g0 c1541e0;
        j$.util.I iQ1 = Q1(spliterator);
        if (interfaceC1558h2 instanceof InterfaceC1481g0) {
            c1541e0 = (InterfaceC1481g0) interfaceC1558h2;
        } else {
            if (H3.a) {
                H3.a(AbstractC1530c.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            interfaceC1558h2.getClass();
            c1541e0 = new C1541e0(0, interfaceC1558h2);
        }
        while (!interfaceC1558h2.h() && iQ1.o(c1541e0)) {
        }
    }

    @Override // j$.util.stream.AbstractC1530c
    final W2 D1() {
        return W2.LONG_VALUE;
    }

    public void G(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        z1(new Q(interfaceC1481g0, false));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final G M(j$.util.function.p0 p0Var) {
        p0Var.getClass();
        return new C1611v(this, V2.p | V2.n, p0Var, 5);
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator N1(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        return new k3(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 Q(j$.util.function.w0 w0Var) {
        w0Var.getClass();
        return new C1623y(this, V2.p | V2.n, w0Var, 2);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final IntStream X(j$.util.function.s0 s0Var) {
        s0Var.getClass();
        return new C1619x(this, V2.p | V2.n, s0Var, 5);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final Stream Y(InterfaceC1487j0 interfaceC1487j0) {
        interfaceC1487j0.getClass();
        return new C1615w(this, V2.p | V2.n, interfaceC1487j0, 2);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final boolean a(InterfaceC1493m0 interfaceC1493m0) {
        return ((Boolean) z1(AbstractC1616w0.q1(interfaceC1493m0, EnumC1604t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final G asDoubleStream() {
        return new C1627z(this, V2.p | V2.n, 2);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1510i average() {
        long[] jArr = (long[]) A(new C1525b(24), new C1525b(25), new C1525b(26));
        long j = jArr[0];
        return j > 0 ? C1510i.d(jArr[1] / j) : C1510i.a();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final Stream boxed() {
        return Y(new C1546f0(1));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final long count() {
        return ((AbstractC1569k0) Q(new C1525b(21))).sum();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).j0(new C1525b(22));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1512k e(InterfaceC1473c0 interfaceC1473c0) {
        interfaceC1473c0.getClass();
        return (C1512k) z1(new A1(W2.LONG_VALUE, interfaceC1473c0, 3));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 f(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1623y(this, 0, interfaceC1481g0, 5);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1512k findAny() {
        return (C1512k) z1(new H(false, W2.LONG_VALUE, C1512k.a(), new S1(20), new C1525b(11)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1512k findFirst() {
        return (C1512k) z1(new H(true, W2.LONG_VALUE, C1512k.a(), new S1(20), new C1525b(11)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 g(InterfaceC1487j0 interfaceC1487j0) {
        return new C1623y(this, V2.p | V2.n | V2.t, interfaceC1487j0, 3);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final boolean h0(InterfaceC1493m0 interfaceC1493m0) {
        return ((Boolean) z1(AbstractC1616w0.q1(interfaceC1493m0, EnumC1604t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final InterfaceC1635x iterator() {
        return j$.util.b0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 k0(InterfaceC1493m0 interfaceC1493m0) {
        interfaceC1493m0.getClass();
        return new C1623y(this, V2.t, interfaceC1493m0, 4);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 limit(long j) {
        if (j >= 0) {
            return AbstractC1616w0.p1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final long m(long j, InterfaceC1473c0 interfaceC1473c0) {
        interfaceC1473c0.getClass();
        return ((Long) z1(new M1(W2.LONG_VALUE, interfaceC1473c0, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1512k max() {
        return e(new C1546f0(0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1512k min() {
        return e(new S1(29));
    }

    @Override // j$.util.stream.AbstractC1616w0
    final A0 r1(long j, IntFunction intFunction) {
        return AbstractC1616w0.j1(j);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1616w0.p1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final InterfaceC1581n0 sorted() {
        return new B2(this);
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final j$.util.I spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final long sum() {
        return m(0L, new C1546f0(2));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1508g summaryStatistics() {
        return (C1508g) A(new S1(10), new C1546f0(3), new C1546f0(4));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final long[] toArray() {
        return (long[]) AbstractC1616w0.f1((D0) A1(new C1525b(23))).b();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final InterfaceC1560i unordered() {
        return !F1() ? this : new Y(this, V2.r, 1);
    }

    public void z(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        z1(new Q(interfaceC1481g0, true));
    }
}
