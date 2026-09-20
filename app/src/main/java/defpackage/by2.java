package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by2 implements ay2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public by2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ay2
    public final float a() {
        return this.d;
    }

    @Override // defpackage.ay2
    public final float b(jy1 jy1Var) {
        return jy1Var == jy1.Ltr ? this.a : this.c;
    }

    @Override // defpackage.ay2
    public final float c(jy1 jy1Var) {
        return jy1Var == jy1.Ltr ? this.c : this.a;
    }

    @Override // defpackage.ay2
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return wm0.a(this.a, by2Var.a) && wm0.a(this.b, by2Var.b) && wm0.a(this.c, by2Var.c) && wm0.a(this.d, by2Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) wm0.c(this.a)) + ", top=" + ((Object) wm0.c(this.b)) + ", end=" + ((Object) wm0.c(this.c)) + ", bottom=" + ((Object) wm0.c(this.d)) + ')';
    }
}
