package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Hvz extends z_Mm {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e = 4;

    public Hvz(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.z_Mm
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.z_Mm
    public final int b() {
        return this.e;
    }

    @Override // defpackage.z_Mm
    public final z_Mm c() {
        return new Hvz(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.z_Mm
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.z_Mm
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Hvz)) {
            return false;
        }
        Hvz hvz = (Hvz) obj;
        if (!(hvz.a == this.a)) {
            return false;
        }
        if (!(hvz.b == this.b)) {
            return false;
        }
        if (hvz.c == this.c) {
            return (hvz.d > this.d ? 1 : (hvz.d == this.d ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
