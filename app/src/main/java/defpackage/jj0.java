package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 implements ij0 {
    public final float w;
    public final float x;

    public jj0(float f, float f2) {
        this.w = f;
        this.x = f2;
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return f / getDensity();
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.x;
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return getDensity() * f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return ur1.a(Float.valueOf(this.w), Float.valueOf(jj0Var.w)) && ur1.a(Float.valueOf(this.x), Float.valueOf(jj0Var.x));
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.w;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.x) + (Float.floatToIntBits(this.w) * 31);
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return i / getDensity();
    }

    @Override // defpackage.ij0
    public final /* synthetic */ int p0(float f) {
        return hj0.a(f, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.w);
        sb.append(", fontScale=");
        return dj.b(sb, this.x, ')');
    }

    @Override // defpackage.ij0
    public final /* synthetic */ long v(long j) {
        return hj0.c(j, this);
    }

    @Override // defpackage.ij0
    public final /* synthetic */ long v0(long j) {
        return hj0.e(j, this);
    }

    @Override // defpackage.ij0
    public final /* synthetic */ float x0(long j) {
        return hj0.d(j, this);
    }
}
