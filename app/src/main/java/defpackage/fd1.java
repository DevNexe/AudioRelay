package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd1 implements uy1 {
    public final g45 w;
    public final int x;
    public final p95 y;
    public final h81<p55> z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ vb2 w;
        public final /* synthetic */ fd1 x;
        public final /* synthetic */ b43 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(vb2 vb2Var, fd1 fd1Var, b43 b43Var, int i) {
            super(1);
            this.w = vb2Var;
            this.x = fd1Var;
            this.y = b43Var;
            this.z = i;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            vb2 vb2Var = this.w;
            fd1 fd1Var = this.x;
            int i = fd1Var.x;
            p95 p95Var = fd1Var.y;
            p55 p55VarInvoke = fd1Var.z.invoke();
            o55 o55Var = p55VarInvoke != null ? p55VarInvoke.a : null;
            boolean z = this.w.getLayoutDirection() == jy1.Rtl;
            b43 b43Var = this.y;
            dl3 dl3VarA = JUCk.a(vb2Var, i, p95Var, o55Var, z, b43Var.w);
            aw2 aw2Var = aw2.Horizontal;
            int i2 = b43Var.w;
            g45 g45Var = fd1Var.w;
            g45Var.b(aw2Var, dl3VarA, this.z, i2);
            b43.QnHx.f(qnHx2, b43Var, sy4.c(-g45Var.a()), 0);
            return sd5.a;
        }
    }

    public fd1(g45 g45Var, int i, p95 p95Var, s90 s90Var) {
        this.w = g45Var;
        this.x = i;
        this.y = p95Var;
        this.z = s90Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(ob2Var.x(g70.g(j)) < g70.h(j) ? j : g70.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin = Math.min(b43VarY.w, g70.h(j));
        return vb2Var.K(iMin, b43VarY.x, ds0.w, new QnHx(vb2Var, this, b43VarY, iMin));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd1)) {
            return false;
        }
        fd1 fd1Var = (fd1) obj;
        return ur1.a(this.w, fd1Var.w) && this.x == fd1Var.x && ur1.a(this.y, fd1Var.y) && ur1.a(this.z, fd1Var.z);
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.d(this, vb2Var, kz1Var, i);
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + (((this.w.hashCode() * 31) + this.x) * 31)) * 31);
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.w + ", cursorOffset=" + this.x + ", transformedText=" + this.y + ", textLayoutResultProvider=" + this.z + ')';
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
