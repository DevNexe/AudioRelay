package j$.util;

import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class P implements InterfaceC1635x, InterfaceC1481g0, Iterator {
    boolean a = false;
    long b;
    final /* synthetic */ I c;

    P(I i) {
        this.c = i;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // j$.util.InterfaceC1636y
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        while (hasNext()) {
            interfaceC1481g0.accept(nextLong());
        }
    }

    @Override // j$.util.InterfaceC1635x, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC1481g0) {
            forEachRemaining((InterfaceC1481g0) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(P.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        forEachRemaining(new C1632u(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Long next() {
        if (!d0.a) {
            return Long.valueOf(nextLong());
        }
        d0.a(P.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.InterfaceC1635x
    public final long nextLong() {
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
