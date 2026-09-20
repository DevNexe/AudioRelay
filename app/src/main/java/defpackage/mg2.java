package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mg2 implements uy1 {
    public final long w;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ b43 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, b43 b43Var, int i2) {
            super(1);
            this.w = i;
            this.x = b43Var;
            this.y = i2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43 b43Var = this.x;
            b43.QnHx.c(qnHx, b43Var, sy4.c((this.w - b43Var.w) / 2.0f), sy4.c((this.y - b43Var.x) / 2.0f));
            return sd5.a;
        }
    }

    public mg2(long j) {
        this.w = j;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        int i = b43VarY.w;
        long j2 = this.w;
        int iMax = Math.max(i, vb2Var.p0(zm0.b(j2)));
        int iMax2 = Math.max(b43VarY.x, vb2Var.p0(zm0.a(j2)));
        return vb2Var.K(iMax, iMax2, ds0.w, new QnHx(iMax, b43VarY, iMax2));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        mg2 mg2Var = obj instanceof mg2 ? (mg2) obj : null;
        if (mg2Var == null) {
            return false;
        }
        int i = zm0.d;
        return this.w == mg2Var.w;
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        int i = zm0.d;
        long j = this.w;
        return (int) (j ^ (j >>> 32));
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
