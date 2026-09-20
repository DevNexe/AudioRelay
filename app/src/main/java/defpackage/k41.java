package defpackage;

import j$.lang.Iterable$CC;
import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.AbstractC1616w0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k41 extends e41 implements List<d41>, jv1, j$.util.List {
    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final boolean addAll(int i, Collection<? extends d41> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean addAll(Collection<? extends d41> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof d41)) {
            return false;
        }
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k41)) {
            return false;
        }
        ((k41) obj).getClass();
        return ur1.a(null, null);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.List, j$.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d41)) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final Iterator<d41> iterator() {
        throw null;
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d41)) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<d41> listIterator() {
        throw null;
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<d41> listIterator(int i) {
        throw null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return AbstractC1616w0.v1(AbstractC1514m.s(this), true);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), true));
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // j$.util.List
    public final void replaceAll(UnaryOperator<d41> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator<d41> unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super d41> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(j$.util.List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return AbstractC1616w0.v1(AbstractC1514m.s(this), false);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), false));
    }

    @Override // java.util.List, j$.util.List
    public final List<d41> subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final Object[] toArray() {
        return AY.Q(this);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AY.R(this, tArr);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=null)";
    }
}
