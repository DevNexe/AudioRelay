package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp {
    public final float a;
    public final float b;

    public xp(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(xpVar.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(xpVar.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "ChartDataEntry(index=" + this.a + ", value=" + this.b + ")";
    }
}
