package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 extends zo1 implements uy1 {
    public final j81<ij0, mp1> x;
    public final boolean y;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ vb2 x;
        public final /* synthetic */ b43 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(vb2 vb2Var, b43 b43Var) {
            super(1);
            this.x = vb2Var;
            this.y = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            ot2 ot2Var = ot2.this;
            long j = ot2Var.x.invoke(this.x).a;
            if (ot2Var.y) {
                b43.QnHx.g(qnHx2, this.y, (int) (j >> 32), mp1.a(j));
            } else {
                b43.QnHx.h(qnHx2, this.y, (int) (j >> 32), mp1.a(j), null, 12);
            }
            return sd5.a;
        }
    }

    public ot2(j81 j81Var) {
        super(wo1.a);
        this.x = j81Var;
        this.y = true;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(vb2Var, b43VarY));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ot2 ot2Var = obj instanceof ot2 ? (ot2) obj : null;
        return ot2Var != null && ur1.a(this.x, ot2Var.x) && this.y == ot2Var.y;
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + (this.y ? 1231 : 1237);
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
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.x);
        sb.append(", rtlAware=");
        return dj.c(sb, this.y, ')');
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
