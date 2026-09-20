package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf2 {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final float d;
    public final float e;

    public bf2(float f, float f2, long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf2)) {
            return false;
        }
        bf2 bf2Var = (bf2) obj;
        return this.a == bf2Var.a && this.b == bf2Var.b && this.c == bf2Var.c && ur1.a(Float.valueOf(this.d), Float.valueOf(bf2Var.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(bf2Var.e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        ?? r0 = z2 ? 1 : z2;
        long j = this.c;
        return Float.floatToIntBits(this.e) + ry0.b(this.d, (((i + r0) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31);
    }

    public final String toString() {
        return "MicNoiseRemoverConfig(isEnabled=" + this.a + ", isVoiceDetectionCutoffEnabled=" + this.b + ", voiceDetectionCutoffDurationMs=" + this.c + ", voiceDetectionThreshold=" + this.d + ", wetFactor=" + this.e + ")";
    }
}
