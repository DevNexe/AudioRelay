package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends zo1 implements uy1 {
    public final float x;
    public final float y;
    public final boolean z;

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
            nt2 nt2Var = nt2.this;
            boolean z = nt2Var.z;
            b43 b43Var = this.x;
            float f = nt2Var.y;
            float f2 = nt2Var.x;
            vb2 vb2Var = this.y;
            if (z) {
                b43.QnHx.f(qnHx2, b43Var, vb2Var.p0(f2), vb2Var.p0(f));
            } else {
                b43.QnHx.c(qnHx2, b43Var, vb2Var.p0(f2), vb2Var.p0(f));
            }
            return sd5.a;
        }
    }

    public nt2() {
        throw null;
    }

    public nt2(float f, float f2) {
        super(wo1.a);
        this.x = f;
        this.y = f2;
        this.z = true;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY, vb2Var));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nt2 nt2Var = obj instanceof nt2 ? (nt2) obj : null;
        return nt2Var != null && wm0.a(this.x, nt2Var.x) && wm0.a(this.y, nt2Var.y) && this.z == nt2Var.z;
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return ry0.b(this.y, Float.floatToIntBits(this.x) * 31, 31) + (this.z ? 1231 : 1237);
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
        StringBuilder sb = new StringBuilder("OffsetModifier(x=");
        sb.append((Object) wm0.c(this.x));
        sb.append(", y=");
        sb.append((Object) wm0.c(this.y));
        sb.append(", rtlAware=");
        return dj.c(sb, this.z, ')');
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
