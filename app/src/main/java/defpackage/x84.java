package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x84 implements o94, Iterable<Map.Entry<? extends n94<?>, ? extends Object>>, jv1 {
    public final LinkedHashMap w = new LinkedHashMap();
    public boolean x;
    public boolean y;

    @Override // defpackage.o94
    public final <T> void a(n94<T> n94Var, T t) {
        this.w.put(n94Var, t);
    }

    public final <T> boolean b(n94<T> n94Var) {
        return this.w.containsKey(n94Var);
    }

    public final <T> T c(n94<T> n94Var) {
        T t = (T) this.w.get(n94Var);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + n94Var + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        x84 x84Var = (x84) obj;
        return ur1.a(this.w, x84Var.w) && this.x == x84Var.x && this.y == x84Var.y;
    }

    public final int hashCode() {
        return (((this.w.hashCode() * 31) + (this.x ? 1231 : 1237)) * 31) + (this.y ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends n94<?>, ? extends Object>> iterator() {
        return this.w.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.x) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.y) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.w.entrySet()) {
            n94 n94Var = (n94) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(n94Var.a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return hH.v(this) + "{ " + ((Object) sb) + " }";
    }
}
