package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te2 {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final float d;
    public final float e;
    public final boolean f;

    public te2(float f, float f2, long j, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te2)) {
            return false;
        }
        te2 te2Var = (te2) obj;
        return this.a == te2Var.a && this.b == te2Var.b && this.c == te2Var.c && ur1.a(Float.valueOf(this.d), Float.valueOf(te2Var.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(te2Var.e)) && this.f == te2Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        long j = this.c;
        int iB = ry0.b(this.e, ry0.b(this.d, (((i + r2) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
        boolean z3 = this.f;
        return iB + (z3 ? 1 : z3);
    }

    public final String toString() {
        return "MicNoiseRemovalSettings(isEnabled=" + this.a + ", isVoiceDetectionCutoffEnabled=" + this.b + ", voiceDetectionCutoffDurationMs=" + this.c + ", voiceDetectionThreshold=" + this.d + ", wetFactor=" + this.e + ", shouldShowPremiumRequired=" + this.f + ")";
    }
}
