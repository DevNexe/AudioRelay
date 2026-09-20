package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ps4<T> implements ListIterator<T>, jv1, Iterator {
    public final wp4<T> w;
    public int x;
    public int y;

    public ps4(wp4<T> wp4Var, int i) {
        this.w = wp4Var;
        this.x = i - 1;
        this.y = wp4Var.c();
    }

    public final void a() {
        if (this.w.c() != this.y) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.x + 1;
        wp4<T> wp4Var = this.w;
        wp4Var.add(i, t);
        this.x++;
        this.y = wp4Var.c();
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
        return this.x < this.w.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.x >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        a();
        int i = this.x + 1;
        wp4<T> wp4Var = this.w;
        xp4.a(i, wp4Var.size());
        T t = wp4Var.get(i);
        this.x = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.x + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i = this.x;
        wp4<T> wp4Var = this.w;
        xp4.a(i, wp4Var.size());
        T t = wp4Var.get(this.x);
        this.x--;
        return t;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.x;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        int i = this.x;
        wp4<T> wp4Var = this.w;
        wp4Var.remove(i);
        this.x--;
        this.y = wp4Var.c();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.x;
        wp4<T> wp4Var = this.w;
        wp4Var.set(i, t);
        this.y = wp4Var.c();
    }
}
