package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t62<K, V> {
    public final LinkedHashMap<K, V> a;
    public int b;
    public final int c;
    public int d;
    public int e;

    public t62(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public V a(K k) {
        return null;
    }

    public final V b(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.a.get(k);
            if (v != null) {
                this.d++;
                return v;
            }
            this.e++;
            V vA = a(k);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                vPut = this.a.put(k, vA);
                if (vPut != null) {
                    this.a.put(k, vPut);
                } else {
                    this.b++;
                }
            }
            if (vPut != null) {
                return vPut;
            }
            d(this.c);
            return vA;
        }
    }

    public final V c(K k, V v) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.b++;
            vPut = this.a.put(k, v);
            if (vPut != null) {
                this.b--;
            }
        }
        d(this.c);
        return vPut;
    }

    public final void d(int i) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    break;
                }
                if (this.b > i && !this.a.isEmpty()) {
                    Map.Entry<K, V> next = this.a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.a.remove(key);
                    this.b--;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.d;
        i2 = this.e + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
