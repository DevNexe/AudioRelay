package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zx2 extends zo1 implements uy1 {
    public final float A;
    public final boolean B;
    public final float x;
    public final float y;
    public final float z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 x;
        public final /* synthetic */ vb2 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, vb2 vb2Var) {
            super(1);
            this.x = b43Var;
            this.y = vb2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            zx2 zx2Var = zx2.this;
            boolean z = zx2Var.B;
            b43 b43Var = this.x;
            float f = zx2Var.y;
            float f2 = zx2Var.x;
            vb2 vb2Var = this.y;
            if (z) {
                b43.QnHx.f(qnHx2, b43Var, vb2Var.p0(f2), vb2Var.p0(f));
            } else {
                b43.QnHx.c(qnHx2, b43Var, vb2Var.p0(f2), vb2Var.p0(f));
            }
            return sd5.a;
        }
    }

    public zx2() {
        throw null;
    }

    public zx2(float f, float f2, float f3, float f4) {
        super(wo1.a);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        boolean z = true;
        this.B = true;
        if ((f < 0.0f && !wm0.a(f, Float.NaN)) || ((f2 < 0.0f && !wm0.a(f2, Float.NaN)) || ((f3 < 0.0f && !wm0.a(f3, Float.NaN)) || (f4 < 0.0f && !wm0.a(f4, Float.NaN))))) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        int iP0 = vb2Var.p0(this.z) + vb2Var.p0(this.x);
        int iP1 = vb2Var.p0(this.A) + vb2Var.p0(this.y);
        b43 b43VarY = ob2Var.y(FWT.F(-iP0, -iP1, j));
        return vb2Var.K(FWT.w(b43VarY.w + iP0, j), FWT.v(b43VarY.x + iP1, j), ds0.w, new QnHx(b43VarY, vb2Var));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        zx2 zx2Var = obj instanceof zx2 ? (zx2) obj : null;
        return zx2Var != null && wm0.a(this.x, zx2Var.x) && wm0.a(this.y, zx2Var.y) && wm0.a(this.z, zx2Var.z) && wm0.a(this.A, zx2Var.A) && this.B == zx2Var.B;
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return ry0.b(this.A, ry0.b(this.z, ry0.b(this.y, Float.floatToIntBits(this.x) * 31, 31), 31), 31) + (this.B ? 1231 : 1237);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.c(this, vb2Var, kz1Var, i);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int x(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.b(this, vb2Var, kz1Var, i);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
