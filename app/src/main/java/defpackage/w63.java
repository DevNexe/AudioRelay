package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w63 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public w63(String str, String str2, boolean z, int i, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w63)) {
            return false;
        }
        w63 w63Var = (w63) obj;
        return ur1.a(this.a, w63Var.a) && ur1.a(this.b, w63Var.b) && this.c == w63Var.c && this.d == w63Var.d && this.e == w63Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iA = bl2.a(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iA + r2) * 31;
        int i2 = this.d;
        int iH = (i + (i2 == 0 ? 0 : O.h(i2))) * 31;
        boolean z2 = this.e;
        return iH + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerNotificationState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isOnGoing=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(sN.b(this.d));
        sb.append(", isAndroid11MediaStyleEnabled=");
        return Md5A.f(sb, this.e, ")");
    }
}
