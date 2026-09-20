package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xq3 implements ta1 {
    public float A;
    public float B;
    public long C;
    public long D;
    public float E;
    public float F;
    public float G;
    public float H;
    public long I;
    public dj4 J;
    public boolean K;
    public ij0 L;
    public float w = 1.0f;
    public float x = 1.0f;
    public float y = 1.0f;
    public float z;

    public xq3() {
        long j = ua1.a;
        this.C = j;
        this.D = j;
        this.H = 8.0f;
        this.I = m95.b;
        this.J = el3.a;
        this.L = new jj0(1.0f, 1.0f);
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return f / getDensity();
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.L.U();
    }

    @Override // defpackage.ta1
    public final void Y(dj4 dj4Var) {
        this.J = dj4Var;
    }

    @Override // defpackage.ta1
    public final void b(float f) {
        this.y = f;
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.ta1
    public final void d0(long j) {
        this.C = j;
    }

    @Override // defpackage.ta1
    public final void e(float f) {
        this.F = f;
    }

    @Override // defpackage.ta1
    public final void f() {
    }

    @Override // defpackage.ta1
    public final void g(float f) {
        this.G = f;
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.L.getDensity();
    }

    @Override // defpackage.ta1
    public final void h(float f) {
        this.A = f;
    }

    @Override // defpackage.ta1
    public final void i(float f) {
        this.x = f;
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return i / getDensity();
    }

    @Override // defpackage.ta1
    public final void k(float f) {
        this.w = f;
    }

    @Override // defpackage.ta1
    public final void l0(boolean z) {
        this.K = z;
    }

    @Override // defpackage.ta1
    public final void m(float f) {
        this.z = f;
    }

    @Override // defpackage.ta1
    public final void o(float f) {
        this.H = f;
    }

    @Override // defpackage.ta1
    public final void p(float f) {
        this.E = f;
    }

    @Override // defpackage.ij0
    public final /* synthetic */ int p0(float f) {
        return hj0.a(f, this);
    }

    @Override // defpackage.ta1
    public final void q0(long j) {
        this.I = j;
    }

    @Override // defpackage.ta1
    public final void r(float f) {
        this.B = f;
    }

    @Override // defpackage.ta1
    public final void s0(long j) {
        this.D = j;
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
