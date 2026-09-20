package j$.util.stream;

import j$.util.AbstractC1509h;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C1468a;
import j$.util.function.C1470b;
import j$.util.function.C1476e;
import j$.util.function.C1480g;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1478f;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class S2 implements Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    private /* synthetic */ S2(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream y(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new S2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean E(Predicate predicate) {
        return this.a.anyMatch(j$.util.function.I0.a(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void H(Consumer consumer) {
        this.a.forEachOrdered(C1480g.a(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object I(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(j$.util.function.K0.a(supplier), C1468a.a(biConsumer), C1468a.a(biConsumer2));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream K(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(j$.util.function.M0.a(toIntFunction)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream L(Function function) {
        return y(this.a.map(j$.util.function.E.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream N(Function function) {
        return y(this.a.flatMap(j$.util.function.E.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional O(InterfaceC1478f interfaceC1478f) {
        return AbstractC1509h.a(this.a.reduce(C1476e.a(interfaceC1478f)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream c(Function function) {
        return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(j$.util.function.E.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean c0(Predicate predicate) {
        return this.a.allMatch(j$.util.function.I0.a(predicate));
    }

    @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1581n0 d0(Function function) {
        return C1573l0.y(this.a.flatMapToLong(j$.util.function.E.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return y(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof S2) {
            obj = ((S2) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC1509h.a(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC1509h.a(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(C1480g.a(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean i0(Predicate predicate) {
        return this.a.noneMatch(j$.util.function.I0.a(predicate));
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1581n0 j0(ToLongFunction toLongFunction) {
        return C1573l0.y(this.a.mapToLong(j$.util.function.N0.a(toLongFunction)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object l(Object obj, BiFunction biFunction, InterfaceC1478f interfaceC1478f) {
        return this.a.reduce(obj, C1470b.a(biFunction), C1476e.a(interfaceC1478f));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G l0(ToDoubleFunction toDoubleFunction) {
        return E.y(this.a.mapToDouble(j$.util.function.L0.a(toDoubleFunction)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return y(this.a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC1509h.a(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC1509h.a(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G n(Function function) {
        return E.y(this.a.flatMapToDouble(j$.util.function.E.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object o0(Object obj, InterfaceC1478f interfaceC1478f) {
        return this.a.reduce(obj, C1476e.a(interfaceC1478f));
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i onClose(Runnable runnable) {
        return C1550g.y(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i parallel() {
        return C1550g.y(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i sequential() {
        return C1550g.y(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return y(this.a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return y(this.a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return y(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.M.f(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream t(Predicate predicate) {
        return y(this.a.filter(j$.util.function.I0.a(predicate)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(j$.util.function.M.a(intFunction));
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i unordered() {
        return C1550g.y(this.a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream v(Consumer consumer) {
        return y(this.a.peek(C1480g.a(consumer)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object w(InterfaceC1576m interfaceC1576m) {
        return this.a.collect(C1572l.a(interfaceC1576m));
    }
}
