package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mn2 {
    public final Sb1 a;
    public final fc4 b;
    public final y63 c;

    public mn2(Sb1 sb1, fc4 fc4Var, y63 y63Var) {
        this.a = sb1;
        this.b = fc4Var;
        this.c = y63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn2)) {
            return false;
        }
        mn2 mn2Var = (mn2) obj;
        return ur1.a(this.a, mn2Var.a) && ur1.a(this.b, mn2Var.b) && ur1.a(this.c, mn2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkPlayerConfig(requestedAudioConfig=" + this.a + ", endpoint=" + this.b + ", options=" + this.c + ")";
    }
}
