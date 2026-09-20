package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sw0<K, V> extends e24<K, V> {
    public final HashMap<K, e24.F1<K, V>> A = new HashMap<>();

    @Override // defpackage.e24
    public final e24.F1<K, V> a(K k) {
        return this.A.get(k);
    }

    @Override // defpackage.e24
    public final V b(K k, V v) {
        e24.F1<K, V> f1A = a(k);
        if (f1A != null) {
            return f1A.x;
        }
        HashMap<K, e24.F1<K, V>> map = this.A;
        e24.F1<K, V> f1 = new e24.F1<>(k, v);
        this.z++;
        e24.F1<K, V> f2 = this.x;
        if (f2 == null) {
            this.w = f1;
            this.x = f1;
        } else {
            f2.y = f1;
            f1.z = f2;
            this.x = f1;
        }
        map.put(k, f1);
        return null;
    }

    @Override // defpackage.e24
    public final V c(K k) {
        V v = (V) super.c(k);
        this.A.remove(k);
        return v;
    }
}
