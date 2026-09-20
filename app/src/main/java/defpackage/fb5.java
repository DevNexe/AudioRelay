package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fb5<K, V> extends eb5<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.y + 2;
        this.y = i;
        Object[] objArr = this.w;
        return new h92(objArr[i - 2], objArr[i - 1]);
    }
}
