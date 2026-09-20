package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class lj1<E> implements List<E>, RandomAccess {
    public final List<E> w;

    public lj1(List<E> list) {
        this.w = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        return this.w.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.w.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.w.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.w.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return this.w.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.w.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.w.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.w.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.w.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.w.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.w.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.w.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        return this.w.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.w.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return this.w.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.w.toArray();
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.w.add(i, e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.w.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return this.w.listIterator(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.w.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.w.toArray(tArr);
    }
}
