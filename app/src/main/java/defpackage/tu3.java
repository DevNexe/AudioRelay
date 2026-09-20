package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tu3 {
    public float a;
    public boolean b;
    public oc0 c;

    public tu3() {
        this(0);
    }

    public tu3(int i) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu3)) {
            return false;
        }
        tu3 tu3Var = (tu3) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(tu3Var.a)) && this.b == tu3Var.b && ur1.a(this.c, tu3Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iFloatToIntBits + r1) * 31;
        oc0 oc0Var = this.c;
        return i + (oc0Var == null ? 0 : oc0Var.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }
}
