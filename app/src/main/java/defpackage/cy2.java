package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy2 extends zo1 implements uy1 {
    public final ay2 x;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;
        public final /* synthetic */ vb2 x;
        public final /* synthetic */ cy2 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, vb2 vb2Var, cy2 cy2Var) {
            super(1);
            this.w = b43Var;
            this.x = vb2Var;
            this.y = cy2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            cy2 cy2Var = this.y;
            ay2 ay2Var = cy2Var.x;
            vb2 vb2Var = this.x;
            b43.QnHx.c(qnHx, this.w, vb2Var.p0(ay2Var.b(vb2Var.getLayoutDirection())), vb2Var.p0(cy2Var.x.d()));
            return sd5.a;
        }
    }

    public cy2(ay2 ay2Var) {
        super(wo1.a);
        this.x = ay2Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        jy1 layoutDirection = vb2Var.getLayoutDirection();
        ay2 ay2Var = this.x;
        boolean z = false;
        float f = 0;
        if (Float.compare(ay2Var.b(layoutDirection), f) >= 0 && Float.compare(ay2Var.d(), f) >= 0 && Float.compare(ay2Var.c(vb2Var.getLayoutDirection()), f) >= 0 && Float.compare(ay2Var.a(), f) >= 0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iP0 = vb2Var.p0(ay2Var.c(vb2Var.getLayoutDirection())) + vb2Var.p0(ay2Var.b(vb2Var.getLayoutDirection()));
        int iP1 = vb2Var.p0(ay2Var.a()) + vb2Var.p0(ay2Var.d());
        b43 b43VarY = ob2Var.y(FWT.F(-iP0, -iP1, j));
        return vb2Var.K(FWT.w(b43VarY.w + iP0, j), FWT.v(b43VarY.x + iP1, j), ds0.w, new QnHx(b43VarY, vb2Var, this));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        cy2 cy2Var = obj instanceof cy2 ? (cy2) obj : null;
        if (cy2Var == null) {
            return false;
        }
        return ur1.a(this.x, cy2Var.x);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return this.x.hashCode();
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
