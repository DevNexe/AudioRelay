package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf4 {
    public final of4 a;
    public final String b;
    public final String c;

    public qf4(of4 of4Var, String str, String str2) {
        this.a = of4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf4)) {
            return false;
        }
        qf4 qf4Var = (qf4) obj;
        return ur1.a(this.a, qf4Var.a) && ur1.a(this.b, qf4Var.b) && ur1.a(this.c, qf4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bl2.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", address=");
        return i5.b(sb, this.c, ")");
    }
}
