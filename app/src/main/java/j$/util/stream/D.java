package j$.util.stream;

import j$.util.C1466e;
import j$.util.C1510i;
import j$.util.InterfaceC1517p;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1486j;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1499q;
import j$.util.function.InterfaceC1501t;
import j$.util.function.InterfaceC1504w;
import j$.util.function.InterfaceC1507z;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
abstract class D extends AbstractC1530c implements G {
    D(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    D(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.C Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.C) {
            return (j$.util.C) spliterator;
        }
        if (!H3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        H3.a(AbstractC1530c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 B1(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC1616w0.R0(abstractC1616w0, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC1530c
    final void C1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        InterfaceC1494n c1603t;
        j$.util.C cQ1 = Q1(spliterator);
        if (interfaceC1558h2 instanceof InterfaceC1494n) {
            c1603t = (InterfaceC1494n) interfaceC1558h2;
        } else {
            if (H3.a) {
                H3.a(AbstractC1530c.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            interfaceC1558h2.getClass();
            c1603t = new C1603t(0, interfaceC1558h2);
        }
        while (!interfaceC1558h2.h() && cQ1.o(c1603t)) {
        }
    }

    @Override // j$.util.stream.G
    public final IntStream D(InterfaceC1504w interfaceC1504w) {
        interfaceC1504w.getClass();
        return new C1619x(this, V2.p | V2.n, interfaceC1504w, 0);
    }

    @Override // j$.util.stream.AbstractC1530c
    final W2 D1() {
        return W2.DOUBLE_VALUE;
    }

    public void J(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        z1(new O(interfaceC1494n, false));
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator N1(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        return new C1554g3(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.stream.G
    public final C1510i R(InterfaceC1486j interfaceC1486j) {
        interfaceC1486j.getClass();
        return (C1510i) z1(new A1(W2.DOUBLE_VALUE, interfaceC1486j, 0));
    }

    @Override // j$.util.stream.G
    public final double U(double d, InterfaceC1486j interfaceC1486j) {
        interfaceC1486j.getClass();
        return ((Double) z1(new C1625y1(W2.DOUBLE_VALUE, interfaceC1486j, d))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final boolean V(InterfaceC1501t interfaceC1501t) {
        return ((Boolean) z1(AbstractC1616w0.m1(interfaceC1501t, EnumC1604t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final boolean Z(InterfaceC1501t interfaceC1501t) {
        return ((Boolean) z1(AbstractC1616w0.m1(interfaceC1501t, EnumC1604t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final C1510i average() {
        double[] dArr = (double[]) o(new C1525b(5), new C1525b(6), new C1525b(7));
        if (dArr[2] <= 0.0d) {
            return C1510i.a();
        }
        int i = AbstractC1580n.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return C1510i.d(d / dArr[2]);
    }

    @Override // j$.util.stream.G
    public final G b(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1611v(this, 0, interfaceC1494n, 3);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return q(new S1(16));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((AbstractC1569k0) j(new C1525b(4))).sum();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).l0(new C1525b(8));
    }

    @Override // j$.util.stream.G
    public final C1510i findAny() {
        return (C1510i) z1(new H(false, W2.DOUBLE_VALUE, C1510i.a(), new S1(19), new C1525b(10)));
    }

    @Override // j$.util.stream.G
    public final C1510i findFirst() {
        return (C1510i) z1(new H(true, W2.DOUBLE_VALUE, C1510i.a(), new S1(19), new C1525b(10)));
    }

    @Override // j$.util.stream.G
    public final G h(InterfaceC1501t interfaceC1501t) {
        interfaceC1501t.getClass();
        return new C1611v(this, V2.t, interfaceC1501t, 2);
    }

    @Override // j$.util.stream.G
    public final G i(InterfaceC1499q interfaceC1499q) {
        return new C1611v(this, V2.p | V2.n | V2.t, interfaceC1499q, 1);
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final InterfaceC1517p iterator() {
        return j$.util.b0.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final InterfaceC1581n0 j(InterfaceC1507z interfaceC1507z) {
        interfaceC1507z.getClass();
        return new C1623y(this, V2.p | V2.n, interfaceC1507z, 0);
    }

    @Override // j$.util.stream.G
    public final G limit(long j) {
        if (j >= 0) {
            return AbstractC1616w0.l1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public void m0(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        z1(new O(interfaceC1494n, true));
    }

    @Override // j$.util.stream.G
    public final C1510i max() {
        return R(new S1(15));
    }

    @Override // j$.util.stream.G
    public final C1510i min() {
        return R(new S1(14));
    }

    @Override // j$.util.stream.G
    public final Object o(Supplier supplier, j$.util.function.z0 z0Var, BiConsumer biConsumer) {
        C1599s c1599s = new C1599s(biConsumer, 0);
        supplier.getClass();
        z0Var.getClass();
        return z1(new C1617w1(W2.DOUBLE_VALUE, c1599s, z0Var, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final G p(j$.util.function.C c) {
        c.getClass();
        return new C1611v(this, V2.p | V2.n, c, 0);
    }

    @Override // j$.util.stream.G
    public final Stream q(InterfaceC1499q interfaceC1499q) {
        interfaceC1499q.getClass();
        return new C1615w(this, V2.p | V2.n, interfaceC1499q, 0);
    }

    @Override // j$.util.stream.AbstractC1616w0
    final A0 r1(long j, IntFunction intFunction) {
        return AbstractC1616w0.X0(j);
    }

    @Override // j$.util.stream.G
    public final G skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1616w0.l1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new C1630z2(this);
    }

    @Override // j$.util.stream.AbstractC1530c, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final j$.util.C spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) o(new C1525b(9), new C1525b(2), new C1525b(3));
        int i = AbstractC1580n.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.G
    public final C1466e summaryStatistics() {
        return (C1466e) o(new S1(8), new S1(17), new S1(18));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC1616w0.d1((B0) A1(new C1525b(1))).b();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final InterfaceC1560i unordered() {
        return !F1() ? this : new C1627z(this, V2.r, 0);
    }

    @Override // j$.util.stream.G
    public final boolean x(InterfaceC1501t interfaceC1501t) {
        return ((Boolean) z1(AbstractC1616w0.m1(interfaceC1501t, EnumC1604t0.ANY))).booleanValue();
    }
}
