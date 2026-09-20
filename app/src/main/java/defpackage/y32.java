package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class y32<E> extends ct<E> implements RandomAccess, Serializable {
    public final y32<E> A;
    public final y32<E> B;
    public E[] w;
    public final int x;
    public int y;
    public boolean z;

    public static final class QnHx<E> implements ListIterator<E>, jv1, Iterator {
        public final y32<E> w;
        public int x;
        public int y = -1;

        public QnHx(y32<E> y32Var, int i) {
            this.w = y32Var;
            this.x = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            int i = this.x;
            this.x = i + 1;
            this.w.add(i, e);
            this.y = -1;
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
            return this.x < this.w.y;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.x > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final E next() {
            int i = this.x;
            y32<E> y32Var = this.w;
            if (i >= y32Var.y) {
                throw new NoSuchElementException();
            }
            this.x = i + 1;
            this.y = i;
            return y32Var.w[y32Var.x + i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.x;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            int i = this.x;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.x = i2;
            this.y = i2;
            y32<E> y32Var = this.w;
            return y32Var.w[y32Var.x + i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.x - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            int i = this.y;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.w.b(i);
            this.x = this.y;
            this.y = -1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            int i = this.y;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.w.set(i, e);
        }
    }

    public y32(E[] eArr, int i, int i2, boolean z, y32<E> y32Var, y32<E> y32Var2) {
        this.w = eArr;
        this.x = i;
        this.y = i2;
        this.z = z;
        this.A = y32Var;
        this.B = y32Var2;
    }

    @Override // defpackage.ct
    public final int a() {
        return this.y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        f();
        e(this.x + this.y, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        f();
        int size = collection.size();
        c(this.x + this.y, size, collection);
        return size > 0;
    }

    @Override // defpackage.ct
    public final E b(int i) {
        f();
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        return h(this.x + i);
    }

    public final void c(int i, int i2, Collection collection) {
        y32<E> y32Var = this.A;
        if (y32Var != null) {
            y32Var.c(i, i2, collection);
            this.w = y32Var.w;
            this.y += i2;
        } else {
            g(i, i2);
            java.util.Iterator<E> it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.w[i + i3] = it.next();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        m(this.x, this.y);
    }

    public final void e(int i, E e) {
        y32<E> y32Var = this.A;
        if (y32Var == null) {
            g(i, 1);
            this.w[i] = e;
        } else {
            y32Var.e(i, e);
            this.w = y32Var.w;
            this.y++;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.w;
            int i = this.y;
            if (i == list.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    }
                    if (!ur1.a(eArr[this.x + i2], list.get(i2))) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        y32<E> y32Var;
        if (this.z || ((y32Var = this.B) != null && y32Var.z)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i2) {
        int i3 = this.y + i2;
        if (this.A != null) {
            throw new IllegalStateException();
        }
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.w;
        if (i3 > eArr.length) {
            int length = eArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.w = (E[]) Arrays.copyOf(eArr, i4);
        }
        E[] eArr2 = this.w;
        System.arraycopy(eArr2, i, eArr2, i + i2, (this.x + this.y) - i);
        this.y += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        return this.w[this.x + i];
    }

    public final E h(int i) {
        y32<E> y32Var = this.A;
        if (y32Var != null) {
            E eH = y32Var.h(i);
            this.y--;
            return eH;
        }
        E[] eArr = this.w;
        E e = eArr[i];
        int i2 = i + 1;
        int i3 = this.y;
        int i4 = this.x;
        System.arraycopy(eArr, i2, eArr, i, (i3 + i4) - i2);
        E[] eArr2 = this.w;
        int i5 = this.y;
        eArr2[(i4 + i5) - 1] = null;
        this.y = i5 - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.w;
        int i = this.y;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[this.x + i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.y; i++) {
            if (ur1.a(this.w[this.x + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return new QnHx(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.y - 1; i >= 0; i--) {
            if (ur1.a(this.w[this.x + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new QnHx(this, 0);
    }

    public final void m(int i, int i2) {
        y32<E> y32Var = this.A;
        if (y32Var != null) {
            y32Var.m(i, i2);
        } else {
            E[] eArr = this.w;
            int i3 = i + i2;
            System.arraycopy(eArr, i3, eArr, i, this.y - i3);
            E[] eArr2 = this.w;
            int i4 = this.y;
            for (int i5 = i4 - i2; i5 < i4; i5++) {
                eArr2[i5] = null;
            }
        }
        this.y -= i2;
    }

    public final int p(int i, int i2, Collection<? extends E> collection, boolean z) {
        y32<E> y32Var = this.A;
        if (y32Var != null) {
            int iP = y32Var.p(i, i2, collection, z);
            this.y -= iP;
            return iP;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.w[i5]) == z) {
                E[] eArr = this.w;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.w;
        int i7 = i2 + i;
        System.arraycopy(eArr2, i7, eArr2, i + i4, this.y - i7);
        E[] eArr3 = this.w;
        int i8 = this.y;
        for (int i9 = i8 - i6; i9 < i8; i9++) {
            eArr3[i9] = null;
        }
        this.y -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        f();
        return p(this.x, this.y, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        f();
        return p(this.x, this.y, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        f();
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        E[] eArr = this.w;
        int i3 = this.x;
        E e2 = eArr[i3 + i];
        eArr[i3 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        ck32.QnHx.a(i, i2, this.y);
        E[] eArr = this.w;
        int i3 = this.x + i;
        int i4 = i2 - i;
        boolean z = this.z;
        y32<E> y32Var = this.B;
        return new y32(eArr, i3, i4, z, this, y32Var == null ? this : y32Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.y;
        int i2 = this.x;
        if (length < i) {
            return (T[]) Arrays.copyOfRange(this.w, i2, i + i2, tArr.getClass());
        }
        System.arraycopy(this.w, i2, tArr, 0, (i + i2) - i2);
        int length2 = tArr.length;
        int i3 = this.y;
        if (length2 > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.w;
        int i = this.y;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[this.x + i2]);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.y;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
        return new QnHx(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        f();
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            e(this.x + i, e);
            return;
        }
        throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        f();
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            c(this.x + i, size, collection);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.w;
        int i = this.y;
        int i2 = this.x;
        int i3 = i + i2;
        AY.t(i3, eArr.length);
        return Arrays.copyOfRange(eArr, i2, i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y32(int i) {
        this(new Object[i], 0, 0, false, null, null);
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
