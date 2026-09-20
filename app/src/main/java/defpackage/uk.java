package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uk implements ij0 {
    public bi w = tr0.a;
    public po0 x;

    @Override // defpackage.ij0
    public final float Q(float f) {
        return f / getDensity();
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.w.getDensity().U();
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return getDensity() * f;
    }

    public final po0 c(j81<? super w70, sd5> j81Var) {
        po0 po0Var = new po0(j81Var);
        this.x = po0Var;
        return po0Var;
    }

    public final long d() {
        return this.w.d();
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.w.getDensity().getDensity();
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return i / getDensity();
    }

    @Override // defpackage.ij0
    public final /* synthetic */ int p0(float f) {
        return hj0.a(f, this);
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
