package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bv6 implements Map.Entry, Comparable {
    public final Comparable w;
    public Object x;
    public final /* synthetic */ fv6 y;

    public bv6(fv6 fv6Var, Comparable comparable, Object obj) {
        this.y = fv6Var;
        this.w = comparable;
        this.x = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.w.compareTo(((bv6) obj).w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.w;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.x;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.w;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.x;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = fv6.C;
        this.y.g();
        Object obj2 = this.x;
        this.x = obj;
        return obj2;
    }

    public final String toString() {
        return LPt6Fixed.a(String.valueOf(this.w), "=", String.valueOf(this.x));
    }
}
