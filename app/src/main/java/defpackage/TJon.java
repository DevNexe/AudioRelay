package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class TJon {
    public final wb4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public TJon(wb4 wb4Var, boolean z, boolean z2, boolean z3) {
        this.a = wb4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static TJon a(TJon tJon, boolean z, boolean z2, int i) {
        wb4 wb4Var = (i & 1) != 0 ? tJon.a : null;
        if ((i & 2) != 0) {
            z = tJon.b;
        }
        boolean z3 = (i & 4) != 0 ? tJon.c : false;
        if ((i & 8) != 0) {
            z2 = tJon.d;
        }
        tJon.getClass();
        return new TJon(wb4Var, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TJon)) {
            return false;
        }
        TJon tJon = (TJon) obj;
        return this.a == tJon.a && this.b == tJon.b && this.c == tJon.c && this.d == tJon.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
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
        return i2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        return "PendingCaptureState(captureType=" + this.a + ", isLoadingServerService=" + this.b + ", cameBackFromSettings=" + this.c + ", isNavigatingToSettings=" + this.d + ")";
    }
}
