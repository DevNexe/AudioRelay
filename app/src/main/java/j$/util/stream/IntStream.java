package j$.util.stream;

import j$.util.AbstractC1509h;
import j$.util.C1467f;
import j$.util.C1510i;
import j$.util.C1511j;
import j$.util.C1519s;
import j$.util.InterfaceC1631t;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C1468a;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public interface IntStream extends InterfaceC1560i {

    public final /* synthetic */ class VivifiedWrapper implements IntStream {
        public final /* synthetic */ java.util.stream.IntStream a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object C(Supplier supplier, j$.util.function.C0 c0, BiConsumer biConsumer) {
            return this.a.collect(j$.util.function.K0.a(supplier), j$.util.function.B0.a(c0), C1468a.a(biConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean F(j$.util.function.P p) {
            return this.a.anyMatch(j$.util.function.O.a(p));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void S(j$.util.function.L l) {
            this.a.forEachOrdered(j$.util.function.K.a(l));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream T(IntFunction intFunction) {
            return S2.y(this.a.mapToObj(j$.util.function.M.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream W(IntFunction intFunction) {
            return convert(this.a.flatMap(j$.util.function.M.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void a0(j$.util.function.L l) {
            this.a.forEach(j$.util.function.K.a(l));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G asDoubleStream() {
            return E.y(this.a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC1581n0 asLongStream() {
            return C1573l0.y(this.a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1510i average() {
            return AbstractC1509h.b(this.a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G b0(j$.util.function.T t) {
            return E.y(this.a.mapToDouble(j$.util.function.S.a(t)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return S2.y(this.a.boxed());
        }

        @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC1581n0 d(j$.util.function.W w) {
            return C1573l0.y(this.a.mapToLong(j$.util.function.V.a(w)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream e0(j$.util.function.P p) {
            return convert(this.a.filter(j$.util.function.O.a(p)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return this.a.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1511j f0(j$.util.function.H h) {
            return AbstractC1509h.c(this.a.reduce(j$.util.function.G.a(h)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1511j findAny() {
            return AbstractC1509h.c(this.a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1511j findFirst() {
            return AbstractC1509h.c(this.a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream g0(j$.util.function.L l) {
            return convert(this.a.peek(j$.util.function.K.a(l)));
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC1560i
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ InterfaceC1631t iterator() {
            return j$.util.r.a(this.a.iterator());
        }

        @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ Iterator iterator() {
            return this.a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream k(j$.util.function.Z z) {
            return convert(this.a.map(j$.util.function.Y.a(z)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1511j max() {
            return AbstractC1509h.c(this.a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C1511j min() {
            return AbstractC1509h.c(this.a.min());
        }

        @Override // j$.util.stream.InterfaceC1560i
        public final /* synthetic */ InterfaceC1560i onClose(Runnable runnable) {
            return C1550g.y(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ IntStream parallel() {
            return convert(this.a.parallel());
        }

        @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ InterfaceC1560i parallel() {
            return C1550g.y(this.a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int r(int i, j$.util.function.H h) {
            return this.a.reduce(i, j$.util.function.G.a(h));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean s(j$.util.function.P p) {
            return this.a.allMatch(j$.util.function.O.a(p));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ IntStream sequential() {
            return convert(this.a.sequential());
        }

        @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ InterfaceC1560i sequential() {
            return C1550g.y(this.a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.a.sorted());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ j$.util.F spliterator() {
            return j$.util.D.f(this.a.spliterator());
        }

        @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.M.f(this.a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C1467f summaryStatistics() {
            this.a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean u(j$.util.function.P p) {
            return this.a.noneMatch(j$.util.function.O.a(p));
        }

        @Override // j$.util.stream.InterfaceC1560i
        public final /* synthetic */ InterfaceC1560i unordered() {
            return C1550g.y(this.a.unordered());
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.s(j$.util.function.N.b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.F(j$.util.function.N.b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return F.y(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C1577m0.y(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC1509h.f(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(java.util.function.Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.C(j$.util.function.J0.a(supplier), j$.util.function.A0.a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.e0(j$.util.function.N.b(intPredicate)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC1509h.g(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC1509h.g(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.W(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.a0(j$.util.function.J.a(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.S(j$.util.function.J.a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C1519s.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.k(j$.util.function.X.d(intUnaryOperator)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return F.y(IntStream.this.b0(j$.util.function.Q.b(intToDoubleFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C1577m0.y(IntStream.this.d(j$.util.function.U.a(intToLongFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.T(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC1509h.g(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC1509h.g(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.u(j$.util.function.N.b(intPredicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C1555h.y(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C1555h.y(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.g0(j$.util.function.J.a(intConsumer)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.r(i, j$.util.function.F.a(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC1509h.g(IntStream.this.f0(j$.util.function.F.a(intBinaryOperator)));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C1555h.y(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.E.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C1555h.y(IntStream.this.unordered());
        }
    }

    Object C(Supplier supplier, j$.util.function.C0 c0, BiConsumer biConsumer);

    boolean F(j$.util.function.P p);

    void S(j$.util.function.L l);

    Stream T(IntFunction intFunction);

    IntStream W(IntFunction intFunction);

    void a0(j$.util.function.L l);

    G asDoubleStream();

    InterfaceC1581n0 asLongStream();

    C1510i average();

    G b0(j$.util.function.T t);

    Stream boxed();

    long count();

    InterfaceC1581n0 d(j$.util.function.W w);

    IntStream distinct();

    IntStream e0(j$.util.function.P p);

    C1511j f0(j$.util.function.H h);

    C1511j findAny();

    C1511j findFirst();

    IntStream g0(j$.util.function.L l);

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    InterfaceC1631t iterator();

    IntStream k(j$.util.function.Z z);

    IntStream limit(long j);

    C1511j max();

    C1511j min();

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    IntStream parallel();

    int r(int i, j$.util.function.H h);

    boolean s(j$.util.function.P p);

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    j$.util.F spliterator();

    int sum();

    C1467f summaryStatistics();

    int[] toArray();

    boolean u(j$.util.function.P p);
}
