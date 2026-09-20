package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xr1 implements vb2, ij0 {
    public final jy1 w;
    public final /* synthetic */ ij0 x;

    public xr1(ij0 ij0Var, jy1 jy1Var) {
        this.w = jy1Var;
        this.x = ij0Var;
    }

    @Override // defpackage.vb2
    public final sb2 K(int i, int i2, Map map, j81 j81Var) {
        return new ub2(i, i2, this, map, j81Var);
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return this.x.Q(f);
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.x.U();
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return this.x.b0(f);
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.x.getDensity();
    }

    @Override // defpackage.rr1
    public final jy1 getLayoutDirection() {
        return this.w;
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return this.x.j(i);
    }

    @Override // defpackage.ij0
    public final int p0(float f) {
        return this.x.p0(f);
    }

    @Override // defpackage.ij0
    public final long v(long j) {
        return this.x.v(j);
    }

    @Override // defpackage.ij0
    public final long v0(long j) {
        return this.x.v0(j);
    }

    @Override // defpackage.ij0
    public final float x0(long j) {
        return this.x.x0(j);
    }
}
