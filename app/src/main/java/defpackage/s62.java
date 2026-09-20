package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s62<K, V> {
    public int d;
    public int f;
    public int g;
    public final sy4 a = new sy4((Object) null);
    public final int e = 16;
    public final HashMap<K, V> b = new HashMap<>(0, 0.75f);
    public final LinkedHashSet<K> c = new LinkedHashSet<>();

    public final V a(K k) {
        synchronized (this.a) {
            V v = this.b.get(k);
            if (v == null) {
                this.g++;
                return null;
            }
            this.c.remove(k);
            this.c.add(k);
            this.f++;
            return v;
        }
    }

    public final V b(K k, V v) {
        V vPut;
        Object objG0;
        V v2;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.a) {
            this.d = d() + 1;
            vPut = this.b.put(k, v);
            if (vPut != null) {
                this.d = d() - 1;
            }
            if (this.c.contains(k)) {
                this.c.remove(k);
            }
            this.c.add(k);
        }
        int i = this.e;
        while (true) {
            synchronized (this.a) {
                if (d() < 0 || ((this.b.isEmpty() && d() != 0) || this.b.isEmpty() != this.c.isEmpty())) {
                    break;
                }
                if (d() <= i || this.b.isEmpty()) {
                    objG0 = null;
                    v2 = null;
                } else {
                    objG0 = wu.G0(this.c);
                    v2 = this.b.get(objG0);
                    if (v2 == null) {
                        throw new IllegalStateException("inconsistent state");
                    }
                    HashMap<K, V> map = this.b;
                    sb5.c(map);
                    map.remove(objG0);
                    sb5.a(this.c).remove(objG0);
                    this.d = d() - 1;
                }
                sd5 sd5Var = sd5.a;
            }
            if (objG0 == null && v2 == null) {
                return vPut;
            }
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final V c(K k) {
        V vRemove;
        k.getClass();
        synchronized (this.a) {
            vRemove = this.b.remove(k);
            this.c.remove(k);
            if (vRemove != null) {
                this.d = d() - 1;
            }
            sd5 sd5Var = sd5.a;
        }
        return vRemove;
    }

    public final int d() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    public final String toString() {
        String str;
        synchronized (this.a) {
            int i = this.f;
            int i2 = this.g + i;
            str = "LruCache[maxSize=" + this.e + ",hits=" + this.f + ",misses=" + this.g + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
