package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 {
    public final boolean a;
    public final float b;
    public final pt c = new pt(0.0f, 20.0f);

    public dg2(float f, boolean z) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg2)) {
            return false;
        }
        dg2 dg2Var = (dg2) obj;
        return this.a == dg2Var.a && ur1.a(Float.valueOf(this.b), Float.valueOf(dg2Var.b));
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
        return Float.floatToIntBits(this.b) + (r0 * 31);
    }

    public final String toString() {
        return "MicVolumeSettings(isEnabled=" + this.a + ", dbGain=" + this.b + ")";
    }
}
