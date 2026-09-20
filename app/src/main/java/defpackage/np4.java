package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class np4<K, V, E> implements Set<E>, ov1 {
    public final yp4<K, V> w;

    public np4(yp4<K, V> yp4Var) {
        this.w = yp4Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.w.size();
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
