package j$.util;

import j$.util.function.UnaryOperator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public interface List<E> extends Collection<E> {

    /* JADX INFO: renamed from: j$.util.List$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.List list) {
            list.getClass();
            return new Z(16, list);
        }
    }

    void add(int i, E e);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean add(E e);

    boolean addAll(int i, java.util.Collection<? extends E> collection);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean addAll(java.util.Collection<? extends E> collection);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    void clear();

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean contains(Object obj);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean containsAll(java.util.Collection<?> collection);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean equals(Object obj);

    E get(int i);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    int hashCode();

    int indexOf(Object obj);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean isEmpty();

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    java.util.Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i);

    E remove(int i);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean removeAll(java.util.Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    boolean retainAll(java.util.Collection<?> collection);

    E set(int i, E e);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    int size();

    void sort(java.util.Comparator<? super E> comparator);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    Spliterator<E> spliterator();

    java.util.List<E> subList(int i, int i2);

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    Object[] toArray();

    @Override // java.util.Collection, j$.util.List, j$.util.Collection
    <T> T[] toArray(T[] tArr);
}
