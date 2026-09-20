package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x8 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof x8) {
            return ur1.a(Float.valueOf(this.a), Float.valueOf(((x8) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
