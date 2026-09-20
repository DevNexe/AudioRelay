package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aq {
    public final String a;
    public final float b;

    public aq(float f, String str) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return ur1.a(this.a, aqVar.a) && ur1.a(Float.valueOf(this.b), Float.valueOf(aqVar.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartLine(label=" + this.a + ", yPosition=" + this.b + ")";
    }
}
