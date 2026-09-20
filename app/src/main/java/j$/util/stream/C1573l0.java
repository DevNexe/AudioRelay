package j$.util.stream;

import j$.util.AbstractC1509h;
import j$.util.C1508g;
import j$.util.C1510i;
import j$.util.C1512k;
import j$.util.C1633v;
import j$.util.InterfaceC1635x;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C1468a;
import j$.util.function.C1471b0;
import j$.util.function.C1479f0;
import j$.util.function.C1485i0;
import j$.util.function.C1491l0;
import j$.util.function.C1497o0;
import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.InterfaceC1493m0;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1573l0 implements InterfaceC1581n0 {
    public final /* synthetic */ LongStream a;

    private /* synthetic */ C1573l0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC1581n0 y(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C1577m0 ? ((C1577m0) longStream).a : new C1573l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ Object A(Supplier supplier, j$.util.function.F0 f0, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.K0.a(supplier), j$.util.function.E0.a(f0), C1468a.a(biConsumer));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ boolean B(InterfaceC1493m0 interfaceC1493m0) {
        return this.a.allMatch(C1491l0.a(interfaceC1493m0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ void G(InterfaceC1481g0 interfaceC1481g0) {
        this.a.forEach(C1479f0.a(interfaceC1481g0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ G M(j$.util.function.p0 p0Var) {
        return E.y(this.a.mapToDouble(C1497o0.a(p0Var)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 Q(j$.util.function.w0 w0Var) {
        return y(this.a.map(j$.util.function.v0.a(w0Var)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ IntStream X(j$.util.function.s0 s0Var) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(j$.util.function.r0.a(s0Var)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ Stream Y(InterfaceC1487j0 interfaceC1487j0) {
        return S2.y(this.a.mapToObj(C1485i0.a(interfaceC1487j0)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ boolean a(InterfaceC1493m0 interfaceC1493m0) {
        return this.a.noneMatch(C1491l0.a(interfaceC1493m0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ G asDoubleStream() {
        return E.y(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1510i average() {
        return AbstractC1509h.b(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ Stream boxed() {
        return S2.y(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 distinct() {
        return y(this.a.distinct());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1512k e(InterfaceC1473c0 interfaceC1473c0) {
        return AbstractC1509h.d(this.a.reduce(C1471b0.a(interfaceC1473c0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1573l0) {
            obj = ((C1573l0) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 f(InterfaceC1481g0 interfaceC1481g0) {
        return y(this.a.peek(C1479f0.a(interfaceC1481g0)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1512k findAny() {
        return AbstractC1509h.d(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1512k findFirst() {
        return AbstractC1509h.d(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 g(InterfaceC1487j0 interfaceC1487j0) {
        return y(this.a.flatMap(C1485i0.a(interfaceC1487j0)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ boolean h0(InterfaceC1493m0 interfaceC1493m0) {
        return this.a.anyMatch(C1491l0.a(interfaceC1493m0));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC1581n0, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1635x iterator() {
        return C1633v.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 k0(InterfaceC1493m0 interfaceC1493m0) {
        return y(this.a.filter(C1491l0.a(interfaceC1493m0)));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 limit(long j) {
        return y(this.a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ long m(long j, InterfaceC1473c0 interfaceC1473c0) {
        return this.a.reduce(j, C1471b0.a(interfaceC1473c0));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1512k max() {
        return AbstractC1509h.d(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ C1512k min() {
        return AbstractC1509h.d(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i onClose(Runnable runnable) {
        return C1550g.y(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i parallel() {
        return C1550g.y(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1581n0, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1581n0 parallel() {
        return y(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i sequential() {
        return C1550g.y(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1581n0, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1581n0 sequential() {
        return y(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 skip(long j) {
        return y(this.a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ InterfaceC1581n0 sorted() {
        return y(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC1581n0, j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ j$.util.I spliterator() {
        return j$.util.G.f(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.M.f(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final C1508g summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i unordered() {
        return C1550g.y(this.a.unordered());
    }

    @Override // j$.util.stream.InterfaceC1581n0
    public final /* synthetic */ void z(InterfaceC1481g0 interfaceC1481g0) {
        this.a.forEachOrdered(C1479f0.a(interfaceC1481g0));
    }
}
