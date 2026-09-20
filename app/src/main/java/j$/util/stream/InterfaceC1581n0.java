package j$.util.stream;

import j$.util.C1508g;
import j$.util.C1510i;
import j$.util.C1512k;
import j$.util.InterfaceC1635x;
import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.InterfaceC1493m0;
import j$.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1581n0 extends InterfaceC1560i {
    Object A(Supplier supplier, j$.util.function.F0 f0, BiConsumer biConsumer);

    boolean B(InterfaceC1493m0 interfaceC1493m0);

    void G(InterfaceC1481g0 interfaceC1481g0);

    G M(j$.util.function.p0 p0Var);

    InterfaceC1581n0 Q(j$.util.function.w0 w0Var);

    IntStream X(j$.util.function.s0 s0Var);

    Stream Y(InterfaceC1487j0 interfaceC1487j0);

    boolean a(InterfaceC1493m0 interfaceC1493m0);

    G asDoubleStream();

    C1510i average();

    Stream boxed();

    long count();

    InterfaceC1581n0 distinct();

    C1512k e(InterfaceC1473c0 interfaceC1473c0);

    InterfaceC1581n0 f(InterfaceC1481g0 interfaceC1481g0);

    C1512k findAny();

    C1512k findFirst();

    InterfaceC1581n0 g(InterfaceC1487j0 interfaceC1487j0);

    boolean h0(InterfaceC1493m0 interfaceC1493m0);

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    InterfaceC1635x iterator();

    InterfaceC1581n0 k0(InterfaceC1493m0 interfaceC1493m0);

    InterfaceC1581n0 limit(long j);

    long m(long j, InterfaceC1473c0 interfaceC1473c0);

    C1512k max();

    C1512k min();

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    InterfaceC1581n0 parallel();

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    InterfaceC1581n0 sequential();

    InterfaceC1581n0 skip(long j);

    InterfaceC1581n0 sorted();

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    j$.util.I spliterator();

    long sum();

    C1508g summaryStatistics();

    long[] toArray();

    void z(InterfaceC1481g0 interfaceC1481g0);
}
