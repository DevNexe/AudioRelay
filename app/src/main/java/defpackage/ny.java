package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ny {
    public double a;
    public double b;

    public ny(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        return ur1.a(Double.valueOf(this.a), Double.valueOf(nyVar.a)) && ur1.a(Double.valueOf(this.b), Double.valueOf(nyVar.b));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
