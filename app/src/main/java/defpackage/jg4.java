package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 {
    public final je4 a;
    public final long b;
    public final long c;
    public final el0.F1 d;

    public jg4(je4 je4Var, long j, long j2, el0.F1 f1) {
        this.a = je4Var;
        this.b = j;
        this.c = j2;
        this.d = f1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg4)) {
            return false;
        }
        jg4 jg4Var = (jg4) obj;
        return ur1.a(this.a, jg4Var.a) && this.b == jg4Var.b && gq0.e(this.c, jg4Var.c) && this.d == jg4Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.d.hashCode() + ((gq0.m(this.c) + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionTimer(session=" + this.a + ", disconnectTimestamp=" + this.b + ", initialDurationBeforeDisconnect=" + gq0.q(this.c) + ", disconnectReason=" + this.d + ")";
    }
}
