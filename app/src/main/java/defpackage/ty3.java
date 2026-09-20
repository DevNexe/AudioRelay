package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ty3 {
    public final String a;
    public final String b;
    public final mv2 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ty3(String str, String str2, mv2 mv2Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = mv2Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = mv2Var == mv2.WINDOWS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty3)) {
            return false;
        }
        ty3 ty3Var = (ty3) obj;
        return ur1.a(this.a, ty3Var.a) && ur1.a(this.b, ty3Var.b) && this.c == ty3Var.c && this.d == ty3Var.d && this.e == ty3Var.e && this.f == ty3Var.f && this.g == ty3Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iA = bl2.a(this.b, this.a.hashCode() * 31, 31);
        mv2 mv2Var = this.c;
        int iHashCode = (iA + (mv2Var == null ? 0 : mv2Var.hashCode())) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.e;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (i + r3) * 31;
        boolean z3 = this.f;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i3 = (i2 + r4) * 31;
        boolean z4 = this.g;
        return i3 + (z4 ? 1 : z4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerUi(name=");
        sb.append(this.a);
        sb.append(", ipAddress=");
        sb.append(this.b);
        sb.append(", os=");
        sb.append(this.c);
        sb.append(", isReconnecting=");
        sb.append(this.d);
        sb.append(", isConnecting=");
        sb.append(this.e);
        sb.append(", isConnected=");
        sb.append(this.f);
        sb.append(", isStoppingOrIdle=");
        return Md5A.f(sb, this.g, ")");
    }
}
