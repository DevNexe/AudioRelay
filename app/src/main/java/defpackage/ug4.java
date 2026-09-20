package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug4 {
    public final boolean a;
    public final boolean b;

    public ug4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug4)) {
            return false;
        }
        ug4 ug4Var = (ug4) obj;
        return this.a == ug4Var.a && this.b == ug4Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        return "PrefValues(isUsbTetheringShortcutEnabled=" + this.a + ", isAnalyticsEnabled=" + this.b + ")";
    }
}
