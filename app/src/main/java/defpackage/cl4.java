package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class cl4<E> extends SjP<E> {
    public final E y;

    public cl4(E e, int i) {
        super(i, 1);
        this.y = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.w++;
        return this.y;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.w--;
        return this.y;
    }
}
