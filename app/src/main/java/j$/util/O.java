package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class O implements InterfaceC1631t, j$.util.function.L, Iterator {
    boolean a = false;
    int b;
    final /* synthetic */ F c;

    O(F f) {
        this.c = f;
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // j$.util.InterfaceC1636y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.L l) {
        l.getClass();
        while (hasNext()) {
            l.accept(nextInt());
        }
    }

    @Override // j$.util.InterfaceC1631t, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.L) {
            forEachRemaining((j$.util.function.L) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(O.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        forEachRemaining(new C1518q(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Integer next() {
        if (!d0.a) {
            return Integer.valueOf(nextInt());
        }
        d0.a(O.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.InterfaceC1631t
    public final int nextInt() {
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
