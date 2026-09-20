package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk4 extends zo1 implements uy1 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final long H;
    public final dj4 I;
    public final boolean J;
    public final long K;
    public final long L;
    public final qk4 M;
    public final float x;
    public final float y;
    public final float z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;
        public final /* synthetic */ rk4 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, rk4 rk4Var) {
            super(1);
            this.w = b43Var;
            this.x = rk4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx.h(qnHx, this.w, 0, 0, this.x.M, 4);
            return sd5.a;
        }
    }

    public rk4() {
        throw null;
    }

    public rk4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, dj4 dj4Var, boolean z, long j2, long j3) {
        super(wo1.a);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
        this.C = f6;
        this.D = f7;
        this.E = f8;
        this.F = f9;
        this.G = f10;
        this.H = j;
        this.I = dj4Var;
        this.J = z;
        this.K = j2;
        this.L = j3;
        this.M = new qk4(this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY, this));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        rk4 rk4Var = obj instanceof rk4 ? (rk4) obj : null;
        if (rk4Var == null) {
            return false;
        }
        if (!(this.x == rk4Var.x)) {
            return false;
        }
        if (!(this.y == rk4Var.y)) {
            return false;
        }
        if (!(this.z == rk4Var.z)) {
            return false;
        }
        if (!(this.A == rk4Var.A)) {
            return false;
        }
        if (!(this.B == rk4Var.B)) {
            return false;
        }
        if (!(this.C == rk4Var.C)) {
            return false;
        }
        if (!(this.D == rk4Var.D)) {
            return false;
        }
        if (!(this.E == rk4Var.E)) {
            return false;
        }
        if (!(this.F == rk4Var.F)) {
            return false;
        }
        if (!(this.G == rk4Var.G)) {
            return false;
        }
        int i = m95.c;
        return ((this.H > rk4Var.H ? 1 : (this.H == rk4Var.H ? 0 : -1)) == 0) && ur1.a(this.I, rk4Var.I) && this.J == rk4Var.J && ur1.a(null, null) && yu.c(this.K, rk4Var.K) && yu.c(this.L, rk4Var.L);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        int iB = ry0.b(this.G, ry0.b(this.F, ry0.b(this.E, ry0.b(this.D, ry0.b(this.C, ry0.b(this.B, ry0.b(this.A, ry0.b(this.z, ry0.b(this.y, Float.floatToIntBits(this.x) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = m95.c;
        long j = this.H;
        int iHashCode = (((((this.I.hashCode() + ((((int) (j ^ (j >>> 32))) + iB) * 31)) * 31) + (this.J ? 1231 : 1237)) * 31) + 0) * 31;
        int i2 = yu.i;
        return xc5.a(this.L) + F65.a(this.K, iHashCode, 31);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.c(this, vb2Var, kz1Var, i);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.x + ", scaleY=" + this.y + ", alpha = " + this.z + ", translationX=" + this.A + ", translationY=" + this.B + ", shadowElevation=" + this.C + ", rotationX=" + this.D + ", rotationY=" + this.E + ", rotationZ=" + this.F + ", cameraDistance=" + this.G + ", transformOrigin=" + ((Object) m95.b(this.H)) + ", shape=" + this.I + ", clip=" + this.J + ", renderEffect=null, ambientShadowColor=" + ((Object) yu.i(this.K)) + ", spotShadowColor=" + ((Object) yu.i(this.L)) + ')';
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
