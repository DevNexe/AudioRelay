package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class SjP<E> implements ListIterator<E>, jv1, Iterator {
    public int w;
    public int x;

    public SjP(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.w > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.w;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.w - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
