package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wh1<T> implements Set<T>, jv1 {
    public int w;
    public Object[] x = new Object[16];

    public static final class QnHx implements Iterator<T>, jv1, j$.util.Iterator {
        public int w;
        public final /* synthetic */ wh1<T> x;

        public QnHx(wh1<T> wh1Var) {
            this.x = wh1Var;
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
            return this.w < this.x.w;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            Object[] objArr = this.x.x;
            int i = this.w;
            this.w = i + 1;
            T t = (T) objArr[i];
            if (t != null) {
                return t;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int a(Object obj) {
        int i = this.w - 1;
        int iIdentityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.x[i3];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj2 == obj) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.x[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.w;
                    while (i5 < i6) {
                        Object obj4 = this.x[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.w;
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        int iA;
        if (this.w > 0) {
            iA = a(t);
            if (iA >= 0) {
                return false;
            }
        } else {
            iA = -1;
        }
        int i = -(iA + 1);
        int i2 = this.w;
        Object[] objArr = this.x;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, i, objArr2, i + 1, i2 - i);
            NPO.a0(this.x, objArr2, 0, 0, i, 6);
            this.x = objArr2;
        } else {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.x[i] = t;
        this.w++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            this.x[i2] = null;
        }
        this.w = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.w == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new QnHx(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t) {
        int iA;
        if (t == null || (iA = a(t)) < 0) {
            return false;
        }
        int i = this.w;
        if (iA < i - 1) {
            Object[] objArr = this.x;
            int i2 = iA + 1;
            System.arraycopy(objArr, i2, objArr, iA, i - i2);
        }
        int i3 = this.w - 1;
        this.w = i3;
        this.x[i3] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.w;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AY.Q(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AY.R(this, tArr);
    }
}
