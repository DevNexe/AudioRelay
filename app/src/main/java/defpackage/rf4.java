package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf4 {
    public final je4 a;
    public final long b;

    public rf4(je4 je4Var, long j) {
        this.a = je4Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf4)) {
            return false;
        }
        rf4 rf4Var = (rf4) obj;
        return ur1.a(this.a, rf4Var.a) && this.b == rf4Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionLatency(session=" + this.a + ", latencyMs=" + this.b + ")";
    }
}
