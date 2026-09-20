package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ds5 {
    public String a;
    public final long b;
    public final HashMap c;

    public ds5(String str, long j, HashMap map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ds5 clone() {
        return new ds5(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds5)) {
            return false;
        }
        ds5 ds5Var = (ds5) obj;
        if (this.b == ds5Var.b && this.a.equals(ds5Var.a)) {
            return this.c.equals(ds5Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String string = this.c.toString();
        StringBuilder sbA = N.a("Event{name='", str, "', timestamp=");
        sbA.append(this.b);
        sbA.append(", params=");
        sbA.append(string);
        sbA.append("}");
        return sbA.toString();
    }
}
