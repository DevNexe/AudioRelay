package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends zo1 implements mo0 {
    public final dj4 A;
    public cm4 B;
    public ew2 C;
    public final yu x;
    public final cg y;
    public final float z;

    public k5() {
        throw null;
    }

    public k5(yu yuVar, dj4 dj4Var) {
        super(wo1.a);
        this.x = yuVar;
        this.y = null;
        this.z = 1.0f;
        this.A = dj4Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        k5 k5Var = obj instanceof k5 ? (k5) obj : null;
        if (k5Var != null && ur1.a(this.x, k5Var.x) && ur1.a(this.y, k5Var.y)) {
            return ((this.z > k5Var.z ? 1 : (this.z == k5Var.z ? 0 : -1)) == 0) && ur1.a(this.A, k5Var.A);
        }
        return false;
    }

    public final int hashCode() {
        yu yuVar = this.x;
        int iA = (yuVar != null ? xc5.a(yuVar.a) : 0) * 31;
        cg cgVar = this.y;
        return this.A.hashCode() + ry0.b(this.z, (iA + (cgVar != null ? cgVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.mo0
    public final void o0(ez1 ez1Var) {
        el3.QnHx qnHx = el3.a;
        cg cgVar = this.y;
        yu yuVar = this.x;
        dj4 dj4Var = this.A;
        if (dj4Var == qnHx) {
            if (yuVar != null) {
                qo0.i(ez1Var, yuVar.a, 0L, 0L, 0.0f, null, 126);
            }
            if (cgVar != null) {
                qo0.h(ez1Var, cgVar, 0L, 0L, this.z, null, 118);
            }
        } else {
            ew2 ew2VarA = (cm4.a(ez1Var.d(), this.B) && ez1Var.getLayoutDirection() == null) ? this.C : dj4Var.a(ez1Var.d(), ez1Var.getLayoutDirection(), ez1Var);
            if (yuVar != null) {
                Cz.j(ez1Var, ew2VarA, yuVar.a);
            }
            if (cgVar != null) {
                Cz.i(ez1Var, ew2VarA, cgVar, this.z);
            }
            this.C = ew2VarA;
            this.B = new cm4(ez1Var.d());
        }
        ez1Var.B0();
    }

    public final String toString() {
        return "Background(color=" + this.x + ", brush=" + this.y + ", alpha = " + this.z + ", shape=" + this.A + ')';
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
