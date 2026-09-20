package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ax1<K, V> extends LinkedHashMap<K, V> {
    public final j81<K, V> w;
    public final j81<V, sd5> x;
    public final int y;

    public ax1(tt2.F1 f1, tt2.LPt8Fixed lPt8, int i) {
        super(10, 0.75f, true);
        this.w = f1;
        this.x = lPt8;
        this.y = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (this.y == 0) {
            return this.w.invoke(obj);
        }
        synchronized (this) {
            V v = (V) super.get(obj);
            if (v != null) {
                return v;
            }
            V vInvoke = this.w.invoke(obj);
            put(obj, vInvoke);
            return vInvoke;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> entry) {
        boolean z = super.size() > this.y;
        if (z) {
            this.x.invoke(entry.getValue());
        }
        return z;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return super.values();
    }
}
