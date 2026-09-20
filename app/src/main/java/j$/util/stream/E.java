package j$.util.stream;

import j$.util.AbstractC1509h;
import j$.util.C1466e;
import j$.util.C1510i;
import j$.util.C1515n;
import j$.util.InterfaceC1517p;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C1468a;
import j$.util.function.C1484i;
import j$.util.function.C1492m;
import j$.util.function.C1498p;
import j$.util.function.C1500s;
import j$.util.function.C1503v;
import j$.util.function.C1506y;
import j$.util.function.InterfaceC1486j;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1499q;
import j$.util.function.InterfaceC1501t;
import j$.util.function.InterfaceC1504w;
import j$.util.function.InterfaceC1507z;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ G y(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream D(InterfaceC1504w interfaceC1504w) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(C1503v.a(interfaceC1504w)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void J(InterfaceC1494n interfaceC1494n) {
        this.a.forEach(C1492m.a(interfaceC1494n));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i R(InterfaceC1486j interfaceC1486j) {
        return AbstractC1509h.b(this.a.reduce(C1484i.a(interfaceC1486j)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double U(double d, InterfaceC1486j interfaceC1486j) {
        return this.a.reduce(d, C1484i.a(interfaceC1486j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean V(InterfaceC1501t interfaceC1501t) {
        return this.a.noneMatch(C1500s.a(interfaceC1501t));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean Z(InterfaceC1501t interfaceC1501t) {
        return this.a.allMatch(C1500s.a(interfaceC1501t));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i average() {
        return AbstractC1509h.b(this.a.average());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G b(InterfaceC1494n interfaceC1494n) {
        return y(this.a.peek(C1492m.a(interfaceC1494n)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return S2.y(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return y(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i findAny() {
        return AbstractC1509h.b(this.a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i findFirst() {
        return AbstractC1509h.b(this.a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G h(InterfaceC1501t interfaceC1501t) {
        return y(this.a.filter(C1500s.a(interfaceC1501t)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G i(InterfaceC1499q interfaceC1499q) {
        return y(this.a.flatMap(C1498p.a(interfaceC1499q)));
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC1517p iterator() {
        return C1515n.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC1581n0 j(InterfaceC1507z interfaceC1507z) {
        return C1573l0.y(this.a.mapToLong(C1506y.a(interfaceC1507z)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j) {
        return y(this.a.limit(j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void m0(InterfaceC1494n interfaceC1494n) {
        this.a.forEachOrdered(C1492m.a(interfaceC1494n));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i max() {
        return AbstractC1509h.b(this.a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C1510i min() {
        return AbstractC1509h.b(this.a.min());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object o(Supplier supplier, j$.util.function.z0 z0Var, BiConsumer biConsumer) {
        return this.a.collect(j$.util.function.K0.a(supplier), j$.util.function.y0.a(z0Var), C1468a.a(biConsumer));
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i onClose(Runnable runnable) {
        return C1550g.y(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G p(j$.util.function.C c) {
        return y(this.a.map(j$.util.function.B.a(c)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return y(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i parallel() {
        return C1550g.y(this.a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream q(InterfaceC1499q interfaceC1499q) {
        return S2.y(this.a.mapToObj(C1498p.a(interfaceC1499q)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return y(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i sequential() {
        return C1550g.y(this.a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j) {
        return y(this.a.skip(j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return y(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C spliterator() {
        return j$.util.A.f(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.M.f(this.a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.G
    public final C1466e summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i unordered() {
        return C1550g.y(this.a.unordered());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean x(InterfaceC1501t interfaceC1501t) {
        return this.a.anyMatch(C1500s.a(interfaceC1501t));
    }
}
