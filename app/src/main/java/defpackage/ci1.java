package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public final Boolean a;
    public final boolean b;
    public final Boolean c;
    public final boolean d;

    public ci1() {
        this(0);
    }

    public /* synthetic */ ci1(int i) {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci1)) {
            return false;
        }
        ci1 ci1Var = (ci1) obj;
        return ur1.a(this.a, ci1Var.a) && this.b == ci1Var.b && ur1.a(this.c, ci1Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Boolean bool2 = this.c;
        return i + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "State(shouldShowSetupCard=" + this.a + ", showUsbCard=" + this.b + ", isPhoneStatePermissionRequired=" + this.c + ")";
    }

    public ci1(Boolean bool, Boolean bool2, boolean z) {
        this.a = bool;
        this.b = z;
        this.c = bool2;
        this.d = bool == null;
    }
}
