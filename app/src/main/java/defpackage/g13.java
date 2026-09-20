package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g13<K, V> extends AbstractCollection<Object> implements kv1 {
    public final a13<K, V> w;

    public g13(a13<K, V> a13Var) {
        this.w = a13Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new h13(this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.w.B;
    }
}
