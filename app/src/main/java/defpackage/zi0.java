package defpackage;

import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zi0<From, To> implements Set<To>, ov1 {
    public final Set<From> w;
    public final j81<From, To> x;
    public final j81<To, From> y;
    public final int z;

    public static final class QnHx implements Iterator<To>, jv1, j$.util.Iterator {
        public final Iterator<From> w;
        public final /* synthetic */ zi0<From, To> x;

        public QnHx(zi0<From, To> zi0Var) {
            this.x = zi0Var;
            this.w = zi0Var.w.iterator();
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
            return this.w.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final To next() {
            return (To) this.x.x.invoke(this.w.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.w.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zi0(Set<From> set, j81<? super From, ? extends To> j81Var, j81<? super To, ? extends From> j81Var2) {
        this.w = set;
        this.x = j81Var;
        this.y = j81Var2;
        this.z = set.size();
    }

    public final ArrayList a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(mu.w0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.y.invoke((To) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(To to) {
        return this.w.add(this.y.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends To> collection) {
        return this.w.addAll(a(collection));
    }

    public final ArrayList b(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(mu.w0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.x.invoke((From) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.contains(this.y.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return this.w.containsAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            ArrayList arrayListB = b(this.w);
            if (((Set) obj).containsAll(arrayListB) && arrayListB.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<To> iterator() {
        return new QnHx(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.w.remove(this.y.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        return this.w.removeAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return this.w.retainAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.z;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AY.Q(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AY.R(this, tArr);
    }

    public final String toString() {
        return b(this.w).toString();
    }
}
