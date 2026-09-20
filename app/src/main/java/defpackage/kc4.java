package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc4 {
    public final String a;
    public final kj1<String> b;

    public kc4(String str, kj1<String> kj1Var) {
        this.a = str;
        this.b = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc4)) {
            return false;
        }
        kc4 kc4Var = (kc4) obj;
        return ur1.a(this.a, kc4Var.a) && ur1.a(this.b, kc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerInfo(name=" + this.a + ", ipAddresses=" + this.b + ")";
    }
}
