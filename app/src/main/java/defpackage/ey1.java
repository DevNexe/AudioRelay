package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends oMl {
    public final double a;
    public final long b;

    public ey1(double d, long j) {
        this.a = d;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey1)) {
            return false;
        }
        ey1 ey1Var = (ey1) obj;
        return ur1.a(Double.valueOf(this.a), Double.valueOf(ey1Var.a)) && this.b == ey1Var.b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Latencies(mean=");
        sb.append(this.a);
        sb.append(", max=");
        return hc2.a(sb, this.b, ")");
    }
}
