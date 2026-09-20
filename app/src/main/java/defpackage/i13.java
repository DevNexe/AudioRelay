package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i13<K, V> extends vDR<Map.Entry<? extends K, ? extends V>> implements mj1<Map.Entry<? extends K, ? extends V>> {
    public final y03<K, V> w;

    public i13(y03<K, V> y03Var) {
        this.w = y03Var;
    }

    @Override // defpackage.auxFixed
    public final int a() {
        y03<K, V> y03Var = this.w;
        y03Var.getClass();
        return y03Var.x;
    }

    @Override // defpackage.auxFixed, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        y03<K, V> y03Var = this.w;
        V v = y03Var.get(key);
        if (v != null) {
            return ur1.a(v, entry.getValue());
        }
        return entry.getValue() == null && y03Var.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new j13(this.w.w);
    }
}
