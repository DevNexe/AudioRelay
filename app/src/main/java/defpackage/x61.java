package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x61 {
    public final long a;
    public final long b;

    public x61(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x61)) {
            return false;
        }
        x61 x61Var = (x61) obj;
        return gq0.e(this.a, x61Var.a) && gq0.e(this.b, x61Var.b);
    }

    public final int hashCode() {
        return gq0.m(this.b) + (gq0.m(this.a) * 31);
    }

    public final String toString() {
        return "FullScreenAdConfig(minimumSessionLength=" + gq0.q(this.a) + ", waitTimeBeforeCaching=" + gq0.q(this.b) + ")";
    }
}
