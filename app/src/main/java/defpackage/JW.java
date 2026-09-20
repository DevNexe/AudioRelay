package defpackage;

/* JADX INFO: renamed from: J€W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class JW extends z_Mm {
    public float a;
    public final int b = 1;

    public JW(float f) {
        this.a = f;
    }

    @Override // defpackage.z_Mm
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.z_Mm
    public final int b() {
        return this.b;
    }

    @Override // defpackage.z_Mm
    public final z_Mm c() {
        return new JW(0.0f);
    }

    @Override // defpackage.z_Mm
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.z_Mm
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JW) {
            return (((JW) obj).a > this.a ? 1 : (((JW) obj).a == this.a ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
