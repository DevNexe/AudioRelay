package com.google.protobuf;

import defpackage.ai2;
import j$.util.function.Consumer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class QX<K, V> implements ai2 {
    public volatile boolean a;
    public volatile int b;
    public CQf<K, V> c;

    public static class CQf<K, V> implements Map<K, V> {
        public final ai2 w;
        public final Map<K, V> x;

        /* JADX INFO: renamed from: com.google.protobuf.QX$CQf$CQf, reason: collision with other inner class name */
        public static class C0098CQf<E> implements Iterator<E>, j$.util.Iterator {
            public final ai2 w;
            public final Iterator<E> x;

            public C0098CQf(ai2 ai2Var, Iterator<E> it) {
                this.w = ai2Var;
                this.x = it;
            }

            public final boolean equals(Object obj) {
                return this.x.equals(obj);
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
                return this.x.hasNext();
            }

            public final int hashCode() {
                return this.x.hashCode();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final E next() {
                return this.x.next();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public final void remove() {
                ((QX) this.w).b();
                this.x.remove();
            }

            public final String toString() {
                return this.x.toString();
            }
        }

        public static class F1<E> implements Set<E> {
            public final ai2 w;
            public final Set<E> x;

            public F1(ai2 ai2Var, Set<E> set) {
                this.w = ai2Var;
                this.x = set;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean add(E e) {
                ((QX) this.w).b();
                return this.x.add(e);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean addAll(Collection<? extends E> collection) {
                ((QX) this.w).b();
                return this.x.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final void clear() {
                ((QX) this.w).b();
                this.x.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean contains(Object obj) {
                return this.x.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean containsAll(Collection<?> collection) {
                return this.x.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean equals(Object obj) {
                return this.x.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final int hashCode() {
                return this.x.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean isEmpty() {
                return this.x.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public final Iterator<E> iterator() {
                return new C0098CQf(this.w, this.x.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean remove(Object obj) {
                ((QX) this.w).b();
                return this.x.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                ((QX) this.w).b();
                return this.x.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                ((QX) this.w).b();
                return this.x.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return this.x.size();
            }

            @Override // java.util.Set, java.util.Collection
            public final Object[] toArray() {
                return this.x.toArray();
            }

            public final String toString() {
                return this.x.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) this.x.toArray(tArr);
            }
        }

        public static class QnHx<E> implements Collection<E> {
            public final ai2 w;
            public final Collection<E> x;

            public QnHx(ai2 ai2Var, Collection<E> collection) {
                this.w = ai2Var;
                this.x = collection;
            }

            @Override // java.util.Collection
            public final boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public final boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public final void clear() {
                ((QX) this.w).b();
                this.x.clear();
            }

            @Override // java.util.Collection
            public final boolean contains(Object obj) {
                return this.x.contains(obj);
            }

            @Override // java.util.Collection
            public final boolean containsAll(Collection<?> collection) {
                return this.x.containsAll(collection);
            }

            @Override // java.util.Collection
            public final boolean equals(Object obj) {
                return this.x.equals(obj);
            }

            @Override // java.util.Collection
            public final int hashCode() {
                return this.x.hashCode();
            }

            @Override // java.util.Collection
            public final boolean isEmpty() {
                return this.x.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<E> iterator() {
                return new C0098CQf(this.w, this.x.iterator());
            }

            @Override // java.util.Collection
            public final boolean remove(Object obj) {
                ((QX) this.w).b();
                return this.x.remove(obj);
            }

            @Override // java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                ((QX) this.w).b();
                return this.x.removeAll(collection);
            }

            @Override // java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                ((QX) this.w).b();
                return this.x.retainAll(collection);
            }

            @Override // java.util.Collection
            public final int size() {
                return this.x.size();
            }

            @Override // java.util.Collection
            public final Object[] toArray() {
                return this.x.toArray();
            }

            public final String toString() {
                return this.x.toString();
            }

            @Override // java.util.Collection
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) this.x.toArray(tArr);
            }
        }

        public CQf(ai2 ai2Var, LinkedHashMap linkedHashMap) {
            this.w = ai2Var;
            this.x = linkedHashMap;
        }

        @Override // java.util.Map
        public final void clear() {
            ((QX) this.w).b();
            this.x.clear();
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            return this.x.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            return this.x.containsValue(obj);
        }

        @Override // java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            return new F1(this.w, this.x.entrySet());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return this.x.equals(obj);
        }

        @Override // java.util.Map
        public final V get(Object obj) {
            return this.x.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return this.x.hashCode();
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            return this.x.isEmpty();
        }

        @Override // java.util.Map
        public final Set<K> keySet() {
            return new F1(this.w, this.x.keySet());
        }

        @Override // java.util.Map
        public final V put(K k, V v) {
            ((QX) this.w).b();
            Charset charset = SjP.a;
            k.getClass();
            v.getClass();
            return this.x.put(k, v);
        }

        @Override // java.util.Map
        public final void putAll(Map<? extends K, ? extends V> map) {
            ((QX) this.w).b();
            for (K k : map.keySet()) {
                Charset charset = SjP.a;
                k.getClass();
                map.get(k).getClass();
            }
            this.x.putAll(map);
        }

        @Override // java.util.Map
        public final V remove(Object obj) {
            ((QX) this.w).b();
            return this.x.remove(obj);
        }

        @Override // java.util.Map
        public final int size() {
            return this.x.size();
        }

        public final String toString() {
            return this.x.toString();
        }

        @Override // java.util.Map
        public final Collection<V> values() {
            return new QnHx(this.w, this.x.values());
        }
    }

    public static class QnHx<K, V> {
    }

    public QX() {
        throw null;
    }

    public final CQf<K, V> a(List<mw0t> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<mw0t> it = list.iterator();
        if (!it.hasNext()) {
            return new CQf<>(this, linkedHashMap);
        }
        it.next();
        throw null;
    }

    public final void b() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map<K, V> c() {
        if (this.b == 2) {
            synchronized (this) {
                if (this.b == 2) {
                    this.c = a(null);
                    this.b = 3;
                }
            }
        }
        return Collections.unmodifiableMap(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof QX) {
            return com5Fixed.i(c(), ((QX) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return com5Fixed.a(c());
    }
}
