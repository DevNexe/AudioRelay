package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Bd_ extends z_Mm {
    public float a;
    public float b;
    public final int c = 2;

    public Bd_(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.z_Mm
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.z_Mm
    public final int b() {
        return this.c;
    }

    @Override // defpackage.z_Mm
    public final z_Mm c() {
        return new Bd_(0.0f, 0.0f);
    }

    @Override // defpackage.z_Mm
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.z_Mm
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Bd_)) {
            return false;
        }
        Bd_ bd_ = (Bd_) obj;
        if (bd_.a == this.a) {
            return (bd_.b > this.b ? 1 : (bd_.b == this.b ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
