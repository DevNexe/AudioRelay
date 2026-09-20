package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h92<K, V> implements Map.Entry<K, V>, jv1 {
    public final K w;
    public final V x;

    public h92(K k, V v) {
        this.w = k;
        this.x = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && ur1.a(entry.getKey(), this.w) && ur1.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.w;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.w;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
