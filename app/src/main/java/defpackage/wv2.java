package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv2 {
    public static final wv2 c = new wv2(128000, false);
    public final int a;
    public final boolean b;

    public wv2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv2)) {
            return false;
        }
        wv2 wv2Var = (wv2) obj;
        return this.a == wv2Var.a && this.b == wv2Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int i = this.a * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final String toString() {
        return "OpusBitrate(bitsPerSecond=" + this.a + ", requiresPremium=" + this.b + ")";
    }
}
