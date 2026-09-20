package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne2 {
    public final boolean a;
    public final kj1<le2> b;

    public ne2(kj1 kj1Var, boolean z) {
        this.a = z;
        this.b = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return this.a == ne2Var.a && ur1.a(this.b, ne2Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public final String toString() {
        return "MicEffectSettings(areEnabled=" + this.a + ", effects=" + this.b + ")";
    }
}
