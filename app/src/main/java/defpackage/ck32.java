package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ck32<E> extends auxFixed<E> implements List<E> {

    public class CQf implements Iterator<E>, jv1, j$.util.Iterator {
        public int w;

        public CQf() {
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
            return this.w < ck32.this.a();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.w;
            this.w = i + 1;
            return ck32.this.get(i);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class F1 extends ck32<E>.CQf implements ListIterator<E> {
        public F1(int i) {
            super();
            int iA = ck32.this.a();
            if (i < 0 || i > iA) {
                throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", iA));
            }
            this.w = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.w - 1;
            this.w = i;
            return ck32.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.w - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class QnHx {
        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbA = a42.a("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                sbA.append(i3);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(Md5A.e("fromIndex: ", i, " > toIndex: ", i2));
            }
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!ur1.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ur1.a(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new CQf();
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ur1.a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new F1(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new F1(i);
    }
}
