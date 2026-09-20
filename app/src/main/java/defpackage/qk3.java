package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk3 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final boolean e;
    public final long f;

    public qk3(double d, double d2, double d3, double d4, boolean z, long j) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = z;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk3)) {
            return false;
        }
        qk3 qk3Var = (qk3) obj;
        return ur1.a(Double.valueOf(this.a), Double.valueOf(qk3Var.a)) && ur1.a(Double.valueOf(this.b), Double.valueOf(qk3Var.b)) && ur1.a(Double.valueOf(this.c), Double.valueOf(qk3Var.c)) && ur1.a(Double.valueOf(this.d), Double.valueOf(qk3Var.d)) && this.e == qk3Var.e && this.f == qk3Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        boolean z = this.e;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        long j = this.f;
        return ((i3 + r0) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RecentStats(maxLatency=" + this.a + ", averagePacketLatency=" + this.b + ", latePacketPercent=" + this.c + ", packetLossPercent=" + this.d + ", hasOutOfOrderPackets=" + this.e + ", underflowCount=" + this.f + ")";
    }
}
