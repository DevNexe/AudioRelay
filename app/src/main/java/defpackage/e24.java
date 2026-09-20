package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e24<K, V> implements Iterable<Map.Entry<K, V>> {
    public F1<K, V> w;
    public F1<K, V> x;
    public final WeakHashMap<YKK<K, V>, Boolean> y = new WeakHashMap<>();
    public int z = 0;

    public static class CQf<K, V> extends NUlFixed<K, V> {
        public CQf(F1<K, V> f1, F1<K, V> f2) {
            super(f1, f2);
        }

        @Override // e24.NUlFixed
        public final F1<K, V> b(F1<K, V> f1) {
            return f1.y;
        }

        @Override // e24.NUlFixed
        public final F1<K, V> c(F1<K, V> f1) {
            return f1.z;
        }
    }

    public static class F1<K, V> implements Map.Entry<K, V> {
        public final K w;
        public final V x;
        public F1<K, V> y;
        public F1<K, V> z;

        public F1(K k, V v) {
            this.w = k;
            this.x = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F1)) {
                return false;
            }
            F1 f1 = (F1) obj;
            return this.w.equals(f1.w) && this.x.equals(f1.x);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.w;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.x;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.w.hashCode() ^ this.x.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.w + "=" + this.x;
        }
    }

    public class LPt8Fixed implements Iterator<Map.Entry<K, V>>, YKK<K, V> {
        public F1<K, V> w;
        public boolean x = true;

        public LPt8Fixed() {
        }

        @Override // e24.YKK
        public final void a(F1<K, V> f1) {
            F1<K, V> f2 = this.w;
            if (f1 == f2) {
                F1<K, V> f3 = f2.z;
                this.w = f3;
                this.x = f3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.x) {
                return e24.this.w != null;
            }
            F1<K, V> f1 = this.w;
            return (f1 == null || f1.y == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.x) {
                this.x = false;
                this.w = e24.this.w;
            } else {
                F1<K, V> f1 = this.w;
                this.w = f1 != null ? f1.y : null;
            }
            return this.w;
        }
    }

    public static abstract class NUlFixed<K, V> implements Iterator<Map.Entry<K, V>>, YKK<K, V> {
        public F1<K, V> w;
        public F1<K, V> x;

        public NUlFixed(F1<K, V> f1, F1<K, V> f2) {
            this.w = f2;
            this.x = f1;
        }

        @Override // e24.YKK
        public final void a(F1<K, V> f1) {
            F1<K, V> f1C = null;
            if (this.w == f1 && f1 == this.x) {
                this.x = null;
                this.w = null;
            }
            F1<K, V> f2 = this.w;
            if (f2 == f1) {
                this.w = b(f2);
            }
            F1<K, V> f3 = this.x;
            if (f3 == f1) {
                F1<K, V> f4 = this.w;
                if (f3 != f4 && f4 != null) {
                    f1C = c(f3);
                }
                this.x = f1C;
            }
        }

        public abstract F1<K, V> b(F1<K, V> f1);

        public abstract F1<K, V> c(F1<K, V> f1);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.x != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            F1<K, V> f1 = this.x;
            F1<K, V> f2 = this.w;
            this.x = (f1 == f2 || f2 == null) ? null : c(f1);
            return f1;
        }
    }

    public static class QnHx<K, V> extends NUlFixed<K, V> {
        public QnHx(F1<K, V> f1, F1<K, V> f2) {
            super(f1, f2);
        }

        @Override // e24.NUlFixed
        public final F1<K, V> b(F1<K, V> f1) {
            return f1.z;
        }

        @Override // e24.NUlFixed
        public final F1<K, V> c(F1<K, V> f1) {
            return f1.y;
        }
    }

    public interface YKK<K, V> {
        void a(F1<K, V> f1);
    }

    public F1<K, V> a(K k) {
        F1<K, V> f1 = this.w;
        while (f1 != null && !f1.w.equals(k)) {
            f1 = f1.y;
        }
        return f1;
    }

    public V b(K k, V v) {
        F1<K, V> f1A = a(k);
        if (f1A != null) {
            return f1A.x;
        }
        F1<K, V> f1 = new F1<>(k, v);
        this.z++;
        F1<K, V> f2 = this.x;
        if (f2 == null) {
            this.w = f1;
            this.x = f1;
            return null;
        }
        f2.y = f1;
        f1.z = f2;
        this.x = f1;
        return null;
    }

    public V c(K k) {
        F1<K, V> f1A = a(k);
        if (f1A == null) {
            return null;
        }
        this.z--;
        WeakHashMap<YKK<K, V>, Boolean> weakHashMap = this.y;
        if (!weakHashMap.isEmpty()) {
            Iterator<YKK<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(f1A);
            }
        }
        F1<K, V> f1 = f1A.z;
        if (f1 != null) {
            f1.y = f1A.y;
        } else {
            this.w = f1A.y;
        }
        F1<K, V> f2 = f1A.y;
        if (f2 != null) {
            f2.z = f1;
        } else {
            this.x = f1;
        }
        f1A.y = null;
        f1A.z = null;
        return f1A.x;
    }

    public final boolean equals(Object obj) {
        NUlFixed nUl;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        if (this.z != e24Var.z) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = e24Var.iterator();
        while (true) {
            nUl = (NUlFixed) it;
            if (!nUl.hasNext()) {
                break;
            }
            NUlFixed nUl2 = (NUlFixed) it2;
            if (!nUl2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) nUl.next();
            Object next = nUl2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (nUl.hasNext() || ((NUlFixed) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            NUlFixed nUl = (NUlFixed) it;
            if (!nUl.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) nUl.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        QnHx qnHx = new QnHx(this.w, this.x);
        this.y.put(qnHx, Boolean.FALSE);
        return qnHx;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            NUlFixed nUl = (NUlFixed) it;
            if (!nUl.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) nUl.next()).toString());
            if (nUl.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
