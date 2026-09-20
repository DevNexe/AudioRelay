package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l95 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f = 0.0d;
    public final double g = 0.0d;

    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r6 == 0.0d) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l95(double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.<init>(double, double, double, double, double):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l95)) {
            return false;
        }
        l95 l95Var = (l95) obj;
        return ur1.a(Double.valueOf(this.a), Double.valueOf(l95Var.a)) && ur1.a(Double.valueOf(this.b), Double.valueOf(l95Var.b)) && ur1.a(Double.valueOf(this.c), Double.valueOf(l95Var.c)) && ur1.a(Double.valueOf(this.d), Double.valueOf(l95Var.d)) && ur1.a(Double.valueOf(this.e), Double.valueOf(l95Var.e)) && ur1.a(Double.valueOf(this.f), Double.valueOf(l95Var.f)) && ur1.a(Double.valueOf(this.g), Double.valueOf(l95Var.g));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i4 = (i3 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i5 = (i4 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        return i5 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }
}
