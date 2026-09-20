package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ze3 {
    public static final ze3 d = new ze3(0.0f, new pt(0.0f, 0.0f), 0);
    public final float a;
    public final rt<Float> b;
    public final int c;

    public ze3(float f, rt<Float> rtVar, int i) {
        this.a = f;
        this.b = rtVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze3)) {
            return false;
        }
        ze3 ze3Var = (ze3) obj;
        return ((this.a > ze3Var.a ? 1 : (this.a == ze3Var.a ? 0 : -1)) == 0) && ur1.a(this.b, ze3Var.b) && this.c == ze3Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return qc0.a(sb, this.c, ')');
    }
}
