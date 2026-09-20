package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C1472c;
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
abstract class Z1 extends AbstractC1530c implements Stream {
    Z1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    Z1(AbstractC1530c abstractC1530c, int i) {
        super(abstractC1530c, i);
    }

    @Override // j$.util.stream.AbstractC1530c
    final F0 B1(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC1616w0.Q0(abstractC1616w0, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC1530c
    final void C1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        while (!interfaceC1558h2.h() && spliterator.a(interfaceC1558h2)) {
        }
    }

    @Override // j$.util.stream.AbstractC1530c
    final W2 D1() {
        return W2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final boolean E(Predicate predicate) {
        return ((Boolean) z1(AbstractC1616w0.s1(predicate, EnumC1604t0.ANY))).booleanValue();
    }

    public void H(Consumer consumer) {
        consumer.getClass();
        z1(new S(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Object I(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return z1(new C1617w1(W2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final IntStream K(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C1619x(this, V2.p | V2.n, toIntFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream L(Function function) {
        function.getClass();
        return new V1(this, V2.p | V2.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream N(Function function) {
        function.getClass();
        return new V1(this, V2.p | V2.n | V2.t, function, 1);
    }

    @Override // j$.util.stream.AbstractC1530c
    final Spliterator N1(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        return new C3(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.stream.Stream
    public final Optional O(InterfaceC1478f interfaceC1478f) {
        interfaceC1478f.getClass();
        return (Optional) z1(new A1(W2.REFERENCE, interfaceC1478f, 1));
    }

    @Override // j$.util.stream.Stream
    public final IntStream c(Function function) {
        function.getClass();
        return new C1619x(this, V2.p | V2.n | V2.t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final boolean c0(Predicate predicate) {
        return ((Boolean) z1(AbstractC1616w0.s1(predicate, EnumC1604t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((AbstractC1569k0) j0(new S1(1))).sum();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1581n0 d0(Function function) {
        function.getClass();
        return new C1623y(this, V2.p | V2.n | V2.t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, V2.m | V2.t);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) z1(new H(false, W2.REFERENCE, Optional.empty(), new S1(21), new C1525b(12)));
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) z1(new H(true, W2.REFERENCE, Optional.empty(), new S1(21), new C1525b(12)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        z1(new S(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final boolean i0(Predicate predicate) {
        return ((Boolean) z1(AbstractC1616w0.s1(predicate, EnumC1604t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final Iterator iterator() {
        return j$.util.b0.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1581n0 j0(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C1623y(this, V2.p | V2.n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object l(Object obj, BiFunction biFunction, InterfaceC1478f interfaceC1478f) {
        biFunction.getClass();
        interfaceC1478f.getClass();
        return z1(new C1617w1(W2.REFERENCE, interfaceC1478f, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final G l0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C1611v(this, V2.p | V2.n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC1616w0.t1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return O(new C1472c(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return O(new C1472c(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final G n(Function function) {
        function.getClass();
        return new C1611v(this, V2.p | V2.n | V2.t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object o0(Object obj, InterfaceC1478f interfaceC1478f) {
        interfaceC1478f.getClass();
        return z1(new C1617w1(W2.REFERENCE, interfaceC1478f, interfaceC1478f, obj, 2));
    }

    @Override // j$.util.stream.AbstractC1616w0
    final A0 r1(long j, IntFunction intFunction) {
        return AbstractC1616w0.P0(j, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1616w0.t1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new C2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream t(Predicate predicate) {
        predicate.getClass();
        return new C1615w(this, V2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new S1(0));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC1616w0.c1(A1(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final InterfaceC1560i unordered() {
        return !F1() ? this : new U1(this, V2.r);
    }

    @Override // j$.util.stream.Stream
    public final Stream v(Consumer consumer) {
        consumer.getClass();
        return new C1615w(this, 0, consumer, 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    @Override // j$.util.stream.Stream
    public final Object w(InterfaceC1576m interfaceC1576m) {
        Object objZ1;
        if (isParallel()) {
            C1568k c1568k = (C1568k) interfaceC1576m;
            if (!c1568k.b().contains(EnumC1564j.CONCURRENT) || (F1() && !c1568k.b().contains(EnumC1564j.UNORDERED))) {
                interfaceC1576m.getClass();
                C1568k c1568k2 = (C1568k) interfaceC1576m;
                Supplier supplierF = c1568k2.f();
                objZ1 = z1(new F1(W2.REFERENCE, c1568k2.c(), c1568k2.a(), supplierF, interfaceC1576m));
            } else {
                objZ1 = c1568k.f().get();
                forEach(new C1584o(5, c1568k.a(), objZ1));
            }
        } else {
            interfaceC1576m.getClass();
            C1568k c1568k3 = (C1568k) interfaceC1576m;
            Supplier supplierF2 = c1568k3.f();
            objZ1 = z1(new F1(W2.REFERENCE, c1568k3.c(), c1568k3.a(), supplierF2, interfaceC1576m));
        }
        C1568k c1568k4 = (C1568k) interfaceC1576m;
        return c1568k4.b().contains(EnumC1564j.IDENTITY_FINISH) ? objZ1 : c1568k4.e().apply(objZ1);
    }
}
