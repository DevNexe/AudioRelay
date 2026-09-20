package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp3 {
    public final float a;
    public final float b;
    public final float c;

    public lp3(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp3)) {
            return false;
        }
        lp3 lp3Var = (lp3) obj;
        if (!(this.a == lp3Var.a)) {
            return false;
        }
        if (this.b == lp3Var.b) {
            return (this.c > lp3Var.c ? 1 : (this.c == lp3Var.c ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResistanceConfig(basis=");
        sb.append(this.a);
        sb.append(", factorAtMin=");
        sb.append(this.b);
        sb.append(", factorAtMax=");
        return dj.b(sb, this.c, ')');
    }
}
