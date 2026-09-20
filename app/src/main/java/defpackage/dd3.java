package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dd3 {
    public final Boolean a;
    public final String b;

    public dd3() {
        this(null, null, 3);
    }

    public dd3(Boolean bool, String str, int i) {
        bool = (i & 1) != 0 ? null : bool;
        str = (i & 2) != 0 ? null : str;
        this.a = bool;
        this.b = str;
    }

    public final boolean a() {
        return ur1.a(this.a, Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd3)) {
            return false;
        }
        dd3 dd3Var = (dd3) obj;
        return ur1.a(this.a, dd3Var.a) && ur1.a(this.b, dd3Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumResponse(value=" + this.a + ", error=" + this.b + ")";
    }
}
