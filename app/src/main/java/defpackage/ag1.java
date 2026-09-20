package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ag1 {
    public static final ag1 d = new ag1("HTTP", 2, 0);
    public static final ag1 e = new ag1("HTTP", 1, 1);
    public static final ag1 f = new ag1("HTTP", 1, 0);
    public static final ag1 g = new ag1("SPDY", 3, 0);
    public static final ag1 h = new ag1("QUIC", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    public ag1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag1)) {
            return false;
        }
        ag1 ag1Var = (ag1) obj;
        return ur1.a(this.a, ag1Var.a) && this.b == ag1Var.b && this.c == ag1Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
