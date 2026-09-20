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
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class cd1<T> implements List<T>, jv1, j$.util.List {
    public Object[] w = new Object[16];
    public long[] x = new long[16];
    public int y = -1;
    public int z;

    public final class CQf implements List<T>, jv1, j$.util.List {
        public final int w;
        public final int x;

        public CQf(int i, int i2) {
            this.w = i;
            this.x = i2;
        }

        @Override // java.util.List, j$.util.List
        public final void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, j$.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
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
        public final T get(int i) {
            return (T) cd1.this.w[i + this.w];
        }

        @Override // java.util.List, j$.util.List
        public final int indexOf(Object obj) {
            int i = this.w;
            int i2 = this.x;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!ur1.a(cd1.this.w[i3], obj)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean isEmpty() {
            return this.x - this.w == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public final Iterator<T> iterator() {
            int i = this.w;
            return cd1.this.new QnHx(i, i, this.x);
        }

        @Override // java.util.List, j$.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.x;
            int i2 = this.w;
            if (i2 > i) {
                return -1;
            }
            while (!ur1.a(cd1.this.w[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List, j$.util.List
        public final ListIterator<T> listIterator() {
            int i = this.w;
            return cd1.this.new QnHx(i, i, this.x);
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
        public final T remove(int i) {
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
        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
            throw null;
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, j$.util.List
        public final T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
        public final int size() {
            return this.x - this.w;
        }

        @Override // java.util.List, j$.util.List
        public final void sort(Comparator<? super T> comparator) {
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
        public final List<T> subList(int i, int i2) {
            int i3 = this.w;
            return cd1.this.new CQf(i + i3, i3 + i2);
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

        @Override // java.util.List, j$.util.List
        public final ListIterator<T> listIterator(int i) {
            int i2 = this.w;
            int i3 = this.x;
            return cd1.this.new QnHx(i + i2, i2, i3);
        }
    }

    public final long a() {
        long jB = Cz.b(Float.POSITIVE_INFINITY, false);
        int i = this.y + 1;
        int iJ = ps0.J(this);
        if (i <= iJ) {
            while (true) {
                long j = this.x[i];
                if (fp1.N(j, jB) < 0) {
                    jB = j;
                }
                if (Float.intBitsToFloat((int) (jB >> 32)) < 0.0f && fp1.g0(jB)) {
                    return jB;
                }
                if (i != iJ) {
                    i++;
                }
            }
        }
        return jB;
    }

    @Override // java.util.List, j$.util.List
    public final void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(T t, float f, boolean z, h81<sd5> h81Var) {
        int i = this.y;
        int i2 = i + 1;
        this.y = i2;
        Object[] objArr = this.w;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            this.w = Arrays.copyOf(objArr, length);
            this.x = Arrays.copyOf(this.x, length);
        }
        Object[] objArr2 = this.w;
        int i3 = this.y;
        objArr2[i3] = t;
        this.x[i3] = Cz.b(f, z);
        c();
        h81Var.invoke();
        this.y = i;
    }

    public final void c() {
        int i = this.y + 1;
        int iJ = ps0.J(this);
        if (i <= iJ) {
            while (true) {
                this.w[i] = null;
                if (i == iJ) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.z = this.y + 1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final void clear() {
        this.y = -1;
        c();
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
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
    public final T get(int i) {
        return (T) this.w[i];
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        int iJ = ps0.J(this);
        if (iJ < 0) {
            return -1;
        }
        int i = 0;
        while (!ur1.a(this.w[i], obj)) {
            if (i == iJ) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean isEmpty() {
        return this.z == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final Iterator<T> iterator() {
        return new QnHx(this, 0, 7);
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(Object obj) {
        for (int iJ = ps0.J(this); -1 < iJ; iJ--) {
            if (ur1.a(this.w[iJ], obj)) {
                return iJ;
            }
        }
        return -1;
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<T> listIterator() {
        return new QnHx(this, 0, 7);
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
    public final T remove(int i) {
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
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int size() {
        return this.z;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super T> comparator) {
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
    public final List<T> subList(int i, int i2) {
        return new CQf(i, i2);
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

    public final class QnHx implements ListIterator<T>, jv1, j$.util.Iterator {
        public int w;
        public final int x;
        public final int y;

        public QnHx(cd1 cd1Var, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? cd1Var.z : 0);
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w < this.y;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.w > this.x;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            Object[] objArr = cd1.this.w;
            int i = this.w;
            this.w = i + 1;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.w - this.x;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Object[] objArr = cd1.this.w;
            int i = this.w - 1;
            this.w = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.w - this.x) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public QnHx(int i, int i2, int i3) {
            this.w = i;
            this.x = i2;
            this.y = i3;
        }
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<T> listIterator(int i) {
        return new QnHx(this, i, 6);
    }
}
