package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e13<K, V> extends qc<K> {
    public final a13<K, V> w;

    public e13(a13<K, V> a13Var) {
        this.w = a13Var;
    }

    @Override // defpackage.qc
    public final int a() {
        return this.w.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new f13(this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        a13<K, V> a13Var = this.w;
        if (!a13Var.containsKey(obj)) {
            return false;
        }
        a13Var.remove(obj);
        return true;
    }
}
