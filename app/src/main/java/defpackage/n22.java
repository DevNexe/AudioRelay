package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n22 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public n22(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n22)) {
            return false;
        }
        n22 n22Var = (n22) obj;
        return ur1.a(this.a, n22Var.a) && ur1.a(this.b, n22Var.b) && ur1.a(this.c, n22Var.c) && ur1.a(this.d, n22Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Library(name=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", licenseName=");
        sb.append(this.c);
        sb.append(", licenseUrl=");
        return i5.b(sb, this.d, ")");
    }
}
