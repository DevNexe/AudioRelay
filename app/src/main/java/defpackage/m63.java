package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m63 {
    public final w40 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public m63(w40 w40Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = w40Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m63)) {
            return false;
        }
        m63 m63Var = (m63) obj;
        return ur1.a(this.a, m63Var.a) && this.b == m63Var.b && this.c == m63Var.c && this.d == m63Var.d && this.e == m63Var.e && this.f == m63Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        w40 w40Var = this.a;
        int iHashCode = (w40Var == null ? 0 : w40Var.hashCode()) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (i + r3) * 31;
        boolean z3 = this.d;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i3 = (i2 + r4) * 31;
        boolean z4 = this.e;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        int i4 = (i3 + r5) * 31;
        boolean z5 = this.f;
        return i4 + (z5 ? 1 : z5);
    }

    public final String toString() {
        return "PlayerFeatures(compressionFeature=" + this.a + ", hasMultiPayloadFeature=" + this.b + ", hasMessageFeature=" + this.c + ", hasStreamDataFeature=" + this.d + ", hasRetransmissionFeature=" + this.e + ", hasServerAudioConfigFeature=" + this.f + ")";
    }
}
