package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u50 {
    public final s50 a;
    public final Sb1 b;

    public u50(s50 s50Var, Sb1 sb1) {
        this.a = s50Var;
        this.b = sb1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return ur1.a(this.a, u50Var.a) && ur1.a(this.b, u50Var.b);
    }

    public final int hashCode() {
        s50 s50Var = this.a;
        int iHashCode = (s50Var == null ? 0 : s50Var.hashCode()) * 31;
        Sb1 sb1 = this.b;
        return iHashCode + (sb1 != null ? sb1.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectionAndAudioConfig(connection=" + this.a + ", audioConfig=" + this.b + ")";
    }
}
