package com.google.protobuf;

import j$.util.function.Consumer;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class d_OZ<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int C = 0;
    public volatile d_OZ<K, V>.LPt8Fixed A;
    public final int w;
    public boolean z;
    public List<d_OZ<K, V>.CQf> x = Collections.emptyList();
    public Map<K, V> y = Collections.emptyMap();
    public Map<K, V> B = Collections.emptyMap();

    public class CQf implements Map.Entry<K, V>, Comparable<d_OZ<K, V>.CQf> {
        public final K w;
        public V x;

        public CQf() {
            throw null;
        }

        public CQf(K k, V v) {
            this.w = k;
            this.x = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.w.compareTo(((CQf) obj).w);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k = this.w;
            if (k == null) {
                zEquals = key == null;
            } else {
                zEquals = k.equals(key);
            }
            if (zEquals) {
                V v = this.x;
                Object value = entry.getValue();
                if (v == null) {
                    zEquals2 = value == null;
                } else {
                    zEquals2 = v.equals(value);
                }
                if (zEquals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.w;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.x;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.w;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.x;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = d_OZ.C;
            d_OZ.this.b();
            V v2 = this.x;
            this.x = v;
            return v2;
        }

        public final String toString() {
            return this.w + "=" + this.x;
        }
    }

    public class F1 implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {
        public int w = -1;
        public boolean x;
        public Iterator<Map.Entry<K, V>> y;

        public F1() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.y == null) {
                this.y = d_OZ.this.y.entrySet().iterator();
            }
            return this.y;
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
            int i = this.w + 1;
            d_OZ d_oz = d_OZ.this;
            if (i >= d_oz.x.size()) {
                return !d_oz.y.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            this.x = true;
            int i = this.w + 1;
            this.w = i;
            d_OZ d_oz = d_OZ.this;
            return i < d_oz.x.size() ? d_oz.x.get(this.w) : a().next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.x) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.x = false;
            int i = d_OZ.C;
            d_OZ d_oz = d_OZ.this;
            d_oz.b();
            if (this.w >= d_oz.x.size()) {
                a().remove();
                return;
            }
            int i2 = this.w;
            this.w = i2 - 1;
            d_oz.j(i2);
        }
    }

    public class LPt8Fixed extends AbstractSet<Map.Entry<K, V>> {
        public LPt8Fixed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            d_OZ.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            d_OZ.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d_OZ.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new F1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d_OZ.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return d_OZ.this.size();
        }
    }

    public static class QnHx {
        public static final C0102QnHx a = new C0102QnHx();
        public static final CQf b = new CQf();

        public static class CQf implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return QnHx.a;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.d_OZ$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0102QnHx implements Iterator<Object>, j$.util.Iterator {
            @Override // j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }
    }

    public d_OZ(int i) {
        this.w = i;
    }

    public final int a(K k) {
        int size = this.x.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.x.get(size).w);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.x.get(i2).w);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void b() {
        if (this.z) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i) {
        return this.x.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
        if (this.y.isEmpty()) {
            return;
        }
        this.y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.y.containsKey(comparable);
    }

    public final int e() {
        return this.x.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.A == null) {
            this.A = new LPt8Fixed();
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d_OZ)) {
            return super.equals(obj);
        }
        d_OZ d_oz = (d_OZ) obj;
        int size = size();
        if (size != d_oz.size()) {
            return false;
        }
        int iE = e();
        if (iE != d_oz.e()) {
            return entrySet().equals(d_oz.entrySet());
        }
        for (int i = 0; i < iE; i++) {
            if (!c(i).equals(d_oz.c(i))) {
                return false;
            }
        }
        if (iE != size) {
            return this.y.equals(d_oz.y);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.y.isEmpty() ? QnHx.b : this.y.entrySet();
    }

    public final SortedMap<K, V> g() {
        b();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.x.get(iA).x : this.y.get(comparable);
    }

    public void h() {
        if (this.z) {
            return;
        }
        this.y = this.y.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.y);
        this.B = this.B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.B);
        this.z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iE = e();
        int iHashCode = 0;
        for (int i = 0; i < iE; i++) {
            iHashCode += this.x.get(i).hashCode();
        }
        return this.y.size() > 0 ? iHashCode + this.y.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        b();
        int iA = a(k);
        if (iA >= 0) {
            return this.x.get(iA).setValue(v);
        }
        b();
        boolean zIsEmpty = this.x.isEmpty();
        int i = this.w;
        if (zIsEmpty && !(this.x instanceof ArrayList)) {
            this.x = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return g().put(k, v);
        }
        if (this.x.size() == i) {
            d_OZ<K, V>.CQf cQfRemove = this.x.remove(i - 1);
            g().put(cQfRemove.w, cQfRemove.x);
        }
        this.x.add(i2, new CQf(k, v));
        return null;
    }

    public final V j(int i) {
        b();
        V v = this.x.remove(i).x;
        if (!this.y.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<d_OZ<K, V>.CQf> list = this.x;
            Map.Entry<K, V> next = it.next();
            list.add(new CQf(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return j(iA);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y.size() + this.x.size();
    }
}
