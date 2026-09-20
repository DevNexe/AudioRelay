package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl3 {
    public static final dl3 e = new dl3(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public dl3(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        return kt2.c(j) >= this.a && kt2.c(j) < this.c && kt2.d(j) >= this.b && kt2.d(j) < this.d;
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return X.a(f3, ((f4 - f5) / 2.0f) + f5);
    }

    public final boolean c(dl3 dl3Var) {
        return this.c > dl3Var.a && dl3Var.c > this.a && this.d > dl3Var.b && dl3Var.d > this.b;
    }

    public final dl3 d(float f, float f2) {
        return new dl3(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final dl3 e(long j) {
        return new dl3(kt2.c(j) + this.a, kt2.d(j) + this.b, kt2.c(j) + this.c, kt2.d(j) + this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl3)) {
            return false;
        }
        dl3 dl3Var = (dl3) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(dl3Var.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(dl3Var.b)) && ur1.a(Float.valueOf(this.c), Float.valueOf(dl3Var.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(dl3Var.d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + fp1.A0(this.a) + ", " + fp1.A0(this.b) + ", " + fp1.A0(this.c) + ", " + fp1.A0(this.d) + ')';
    }
}
