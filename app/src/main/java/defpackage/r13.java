package defpackage;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r13<E> implements Iterator<E>, jv1, j$.util.Iterator {
    public Object w;
    public final Map<E, x32> x;
    public int y;

    public r13(Object obj, y03 y03Var) {
        this.w = obj;
        this.x = y03Var;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.y < this.x.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.w;
        this.y++;
        x32 x32Var = this.x.get(e);
        if (x32Var != null) {
            this.w = x32Var.b;
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
