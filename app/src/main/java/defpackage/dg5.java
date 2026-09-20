package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dg5 {
    public final String a;
    public final Object b;

    public dg5(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg5)) {
            return false;
        }
        dg5 dg5Var = (dg5) obj;
        return ur1.a(this.a, dg5Var.a) && ur1.a(this.b, dg5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return o5.d(sb, this.b, ')');
    }
}
