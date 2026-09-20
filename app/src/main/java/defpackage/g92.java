package defpackage;

import j$.util.function.Consumer;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g92<K, V> {
    public g92<K, V>.CQf a;
    public g92<K, V>.F1 b;
    public g92<K, V>.NUlFixed c;

    public final class CQf implements Set<Map.Entry<K, V>> {
        public CQf() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            g92 g92Var = g92.this;
            int iD = g92Var.d();
            for (Map.Entry<K, V> entry : collection) {
                g92Var.g(entry.getKey(), entry.getValue());
            }
            return iD != g92Var.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g92.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            g92 g92Var = g92.this;
            int iE = g92Var.e(key);
            if (iE < 0) {
                return false;
            }
            Object objB = g92Var.b(iE, 1);
            Object value = entry.getValue();
            return objB == value || (objB != null && objB.equals(value));
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g92.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g92 g92Var = g92.this;
            int iHashCode = 0;
            for (int iD = g92Var.d() - 1; iD >= 0; iD--) {
                Object objB = g92Var.b(iD, 0);
                Object objB2 = g92Var.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g92.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new LPt8Fixed();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g92.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class F1 implements Set<K> {
        public F1() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g92.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g92.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapC = g92.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapC.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g92.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g92 g92Var = g92.this;
            int iHashCode = 0;
            for (int iD = g92Var.d() - 1; iD >= 0; iD--) {
                Object objB = g92Var.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g92.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new QnHx(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            g92 g92Var = g92.this;
            int iE = g92Var.e(obj);
            if (iE < 0) {
                return false;
            }
            g92Var.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapC = g92.this.c();
            int size = mapC.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapC.remove(it.next());
            }
            return size != mapC.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return g92.k(g92.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g92.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g92.this.l(0, tArr);
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g92 g92Var = g92.this;
            int iD = g92Var.d();
            Object[] objArr = new Object[iD];
            for (int i = 0; i < iD; i++) {
                objArr[i] = g92Var.b(i, 0);
            }
            return objArr;
        }
    }

    public final class LPt8Fixed implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, j$.util.Iterator, j$.util.Map.Entry {
        public int w;
        public boolean y = false;
        public int x = -1;

        public LPt8Fixed() {
            this.w = g92.this.d() - 1;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.y) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.x;
            g92 g92Var = g92.this;
            Object objB = g92Var.b(i, 0);
            if (!(key == objB || (key != null && key.equals(objB)))) {
                return false;
            }
            Object value = entry.getValue();
            Object objB2 = g92Var.b(this.x, 1);
            return value == objB2 || (value != null && value.equals(objB2));
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final K getKey() {
            if (!this.y) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) g92.this.b(this.x, 0);
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V getValue() {
            if (!this.y) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) g92.this.b(this.x, 1);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.x < this.w;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final int hashCode() {
            if (!this.y) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.x;
            g92 g92Var = g92.this;
            Object objB = g92Var.b(i, 0);
            Object objB2 = g92Var.b(this.x, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.x++;
            this.y = true;
            return this;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.y) {
                throw new IllegalStateException();
            }
            g92.this.h(this.x);
            this.x--;
            this.w--;
            this.y = false;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final V setValue(V v) {
            if (this.y) {
                return (V) g92.this.i(this.x, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class NUlFixed implements Collection<V> {
        public NUlFixed() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            g92.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return g92.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return g92.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new QnHx(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            g92 g92Var = g92.this;
            int iF = g92Var.f(obj);
            if (iF < 0) {
                return false;
            }
            g92Var.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            g92 g92Var = g92.this;
            int iD = g92Var.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (collection.contains(g92Var.b(i, 1))) {
                    g92Var.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            g92 g92Var = g92.this;
            int iD = g92Var.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (!collection.contains(g92Var.b(i, 1))) {
                    g92Var.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return g92.this.d();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g92.this.l(1, tArr);
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            g92 g92Var = g92.this;
            int iD = g92Var.d();
            Object[] objArr = new Object[iD];
            for (int i = 0; i < iD; i++) {
                objArr[i] = g92Var.b(i, 1);
            }
            return objArr;
        }
    }

    public final class QnHx<T> implements Iterator<T>, j$.util.Iterator {
        public final int w;
        public int x;
        public int y;
        public boolean z = false;

        public QnHx(int i) {
            this.w = i;
            this.x = g92.this.d();
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
            return this.y < this.x;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) g92.this.b(this.y, this.w);
            this.y++;
            this.z = true;
            return t;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.z) {
                throw new IllegalStateException();
            }
            int i = this.y - 1;
            this.y = i;
            this.x--;
            this.z = false;
            g92.this.h(i);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public final Object[] l(int i, Object[] objArr) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
