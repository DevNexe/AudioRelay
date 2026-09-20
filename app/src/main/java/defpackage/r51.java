package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r51 implements m75 {
    public final float a = 0.5f;

    @Override // defpackage.m75
    public final float a(ij0 ij0Var, float f, float f2) {
        return C0239D.y(f, f2, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r51) && ur1.a(Float.valueOf(this.a), Float.valueOf(((r51) obj).a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return dj.b(new StringBuilder("FractionalThreshold(fraction="), this.a, ')');
    }
}
