package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class QT extends zo1 implements uy1 {
    public final IlK x;
    public final float y;
    public final float z;

    public QT() {
        throw null;
    }

    public QT(ed1 ed1Var, float f, float f2) {
        super(wo1.a);
        this.x = ed1Var;
        this.y = f;
        this.z = f2;
        if (!((f >= 0.0f || wm0.a(f, Float.NaN)) && (f2 >= 0.0f || wm0.a(f2, Float.NaN)))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        IlK ilK = this.x;
        float f = this.y;
        boolean z = ilK instanceof ed1;
        b43 b43VarY = ob2Var.y(z ? g70.a(j, 0, 0, 0, 0, 11) : g70.a(j, 0, 0, 0, 0, 14));
        int iJ = b43VarY.J(ilK);
        if (iJ == Integer.MIN_VALUE) {
            iJ = 0;
        }
        int i = z ? b43VarY.x : b43VarY.w;
        int iG = (z ? g70.g(j) : g70.h(j)) - i;
        int iO = AY.o((!wm0.a(f, Float.NaN) ? vb2Var.p0(f) : 0) - iJ, 0, iG);
        float f2 = this.z;
        int iO2 = AY.o(((!wm0.a(f2, Float.NaN) ? vb2Var.p0(f2) : 0) - i) + iJ, 0, iG - iO);
        int iMax = z ? b43VarY.w : Math.max(b43VarY.w + iO + iO2, g70.j(j));
        int iMax2 = z ? Math.max(b43VarY.x + iO + iO2, g70.i(j)) : b43VarY.x;
        return vb2Var.K(iMax, iMax2, ds0.w, new yo(ilK, f, iO, iMax, iO2, b43VarY, iMax2));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        QT qt = obj instanceof QT ? (QT) obj : null;
        return qt != null && ur1.a(this.x, qt.x) && wm0.a(this.y, qt.y) && wm0.a(this.z, qt.z);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.z) + ry0.b(this.y, this.x.hashCode() * 31, 31);
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
        return "AlignmentLineOffset(alignmentLine=" + this.x + ", before=" + ((Object) wm0.c(this.y)) + ", after=" + ((Object) wm0.c(this.z)) + ')';
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
