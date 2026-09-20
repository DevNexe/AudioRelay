package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d33 {
    public final je4 a;
    public final long b;

    public d33(je4 je4Var, long j) {
        this.a = je4Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d33)) {
            return false;
        }
        d33 d33Var = (d33) obj;
        return ur1.a(this.a, d33Var.a) && this.b == d33Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PingResponse(session=" + this.a + ", requestTimestamp=" + this.b + ")";
    }
}
