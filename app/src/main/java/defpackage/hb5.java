package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hb5<K, V> extends eb5<K, V, Map.Entry<K, V>> {
    public final d13<K, V> z;

    public hb5(d13<K, V> d13Var) {
        this.z = d13Var;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.y + 2;
        this.y = i;
        Object[] objArr = this.w;
        return new gi2(this.z, objArr[i - 2], objArr[i - 1]);
    }
}
