package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc4 {
    public final x40 a;
    public final nh2 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gc4(x40 x40Var, nh2 nh2Var, boolean z, boolean z2, boolean z3) {
        this.a = x40Var;
        this.b = nh2Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc4)) {
            return false;
        }
        gc4 gc4Var = (gc4) obj;
        return ur1.a(this.a, gc4Var.a) && ur1.a(this.b, gc4Var.b) && this.c == gc4Var.c && this.d == gc4Var.d && this.e == gc4Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        x40 x40Var = this.a;
        int i = (x40Var == null ? 0 : x40Var.a) * 31;
        nh2 nh2Var = this.b;
        int iHashCode = (i + (nh2Var != null ? nh2Var.hashCode() : 0)) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = (iHashCode + r2) * 31;
        boolean z2 = this.d;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z3 = this.e;
        return i3 + (z3 ? 1 : z3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerFeatures(compressionFeature=");
        sb.append(this.a);
        sb.append(", multiPayloadFeature=");
        sb.append(this.b);
        sb.append(", hasMessageFeature=");
        sb.append(this.c);
        sb.append(", hasStreamDataFeature=");
        sb.append(this.d);
        sb.append(", hasServerAudioConfigFeature=");
        return Md5A.f(sb, this.e, ")");
    }
}
