package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz4 {
    public final String a;
    public final vz4 b;

    public rz4(String str, vz4 vz4Var) {
        this.a = str;
        this.b = vz4Var;
    }

    public static rz4 a(rz4 rz4Var, vz4 vz4Var) {
        String str = rz4Var.a;
        rz4Var.getClass();
        return new rz4(str, vz4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz4)) {
            return false;
        }
        rz4 rz4Var = (rz4) obj;
        return ur1.a(this.a, rz4Var.a) && ur1.a(this.b, rz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = N.a("SystemReport(id=", i5.b(new StringBuilder("SystemId(id="), this.a, ")"), ", status=");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
