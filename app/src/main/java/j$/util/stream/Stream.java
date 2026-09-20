package j$.util.stream;

import j$.util.AbstractC1509h;
import j$.util.function.C1474d;
import j$.util.function.InterfaceC1478f;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Stream<T> extends InterfaceC1560i {

    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof S2 ? ((S2) stream).a : new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.c0(j$.util.function.Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(Predicate predicate) {
            return Stream.this.E(j$.util.function.Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.I(j$.util.function.J0.a(supplier), j$.util.function.BiConsumer.VivifiedWrapper.convert(biConsumer), j$.util.function.BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.w(C1568k.d(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
            return convert(Stream.this.t(j$.util.function.Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return AbstractC1509h.e(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return AbstractC1509h.e(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.N(j$.util.function.Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
            return F.y(Stream.this.n(j$.util.function.Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream flatMapToInt(Function function) {
            return IntStream.Wrapper.convert(Stream.this.c(j$.util.function.Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream flatMapToLong(Function function) {
            return C1577m0.y(Stream.this.d0(j$.util.function.Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(j$.util.function.Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(Consumer consumer) {
            Stream.this.H(j$.util.function.Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j) {
            return convert(Stream.this.limit(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(Function function) {
            return convert(Stream.this.L(j$.util.function.Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return F.y(Stream.this.l0(j$.util.function.ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.K(j$.util.function.ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C1577m0.y(Stream.this.j0(j$.util.function.ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return AbstractC1509h.e(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return AbstractC1509h.e(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(Predicate predicate) {
            return Stream.this.i0(j$.util.function.Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C1555h.y(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C1555h.y(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
            return convert(Stream.this.v(j$.util.function.Consumer.VivifiedWrapper.convert(consumer)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.l(obj, j$.util.function.BiFunction.VivifiedWrapper.convert(biFunction), C1474d.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.o0(obj, C1474d.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return AbstractC1509h.e(Stream.this.O(C1474d.a(binaryOperator)));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C1555h.y(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j) {
            return convert(Stream.this.skip(j));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(j$.util.function.IntFunction.VivifiedWrapper.convert(intFunction));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C1555h.y(Stream.this.unordered());
        }
    }

    boolean E(j$.util.function.Predicate predicate);

    void H(j$.util.function.Consumer consumer);

    Object I(j$.util.function.Supplier supplier, j$.util.function.BiConsumer biConsumer, j$.util.function.BiConsumer biConsumer2);

    IntStream K(j$.util.function.ToIntFunction toIntFunction);

    Stream L(j$.util.function.Function function);

    Stream N(j$.util.function.Function function);

    j$.util.Optional O(InterfaceC1478f interfaceC1478f);

    IntStream c(j$.util.function.Function function);

    boolean c0(j$.util.function.Predicate predicate);

    long count();

    InterfaceC1581n0 d0(j$.util.function.Function function);

    Stream distinct();

    j$.util.Optional findAny();

    j$.util.Optional findFirst();

    void forEach(j$.util.function.Consumer consumer);

    boolean i0(j$.util.function.Predicate predicate);

    InterfaceC1581n0 j0(j$.util.function.ToLongFunction toLongFunction);

    Object l(Object obj, j$.util.function.BiFunction biFunction, InterfaceC1478f interfaceC1478f);

    G l0(j$.util.function.ToDoubleFunction toDoubleFunction);

    Stream limit(long j);

    j$.util.Optional max(Comparator comparator);

    j$.util.Optional min(Comparator comparator);

    G n(j$.util.function.Function function);

    Object o0(Object obj, InterfaceC1478f interfaceC1478f);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Stream t(j$.util.function.Predicate predicate);

    Object[] toArray();

    Object[] toArray(j$.util.function.IntFunction intFunction);

    Stream v(j$.util.function.Consumer consumer);

    Object w(InterfaceC1576m interfaceC1576m);
}
