package j$.util;

import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class Q implements InterfaceC1517p, InterfaceC1494n, Iterator {
    boolean a = false;
    double b;
    final /* synthetic */ C c;

    Q(C c) {
        this.c = c;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // j$.util.InterfaceC1636y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        while (hasNext()) {
            interfaceC1494n.accept(nextDouble());
        }
    }

    @Override // j$.util.InterfaceC1517p, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC1494n) {
            forEachRemaining((InterfaceC1494n) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(Q.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        forEachRemaining(new C1513l(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Double next() {
        if (!d0.a) {
            return Double.valueOf(nextDouble());
        }
        d0.a(Q.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.InterfaceC1517p
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
