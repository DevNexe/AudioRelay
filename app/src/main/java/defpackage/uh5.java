package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uh5 implements uy1 {
    public final g45 w;
    public final int x;
    public final p95 y;
    public final h81<p55> z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ vb2 w;
        public final /* synthetic */ uh5 x;
        public final /* synthetic */ b43 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(vb2 vb2Var, uh5 uh5Var, b43 b43Var, int i) {
            super(1);
            this.w = vb2Var;
            this.x = uh5Var;
            this.y = b43Var;
            this.z = i;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            vb2 vb2Var = this.w;
            uh5 uh5Var = this.x;
            int i = uh5Var.x;
            p95 p95Var = uh5Var.y;
            p55 p55VarInvoke = uh5Var.z.invoke();
            o55 o55Var = p55VarInvoke != null ? p55VarInvoke.a : null;
            b43 b43Var = this.y;
            dl3 dl3VarA = JUCk.a(vb2Var, i, p95Var, o55Var, false, b43Var.w);
            aw2 aw2Var = aw2.Vertical;
            int i2 = b43Var.x;
            g45 g45Var = uh5Var.w;
            g45Var.b(aw2Var, dl3VarA, this.z, i2);
            b43.QnHx.f(qnHx2, b43Var, 0, sy4.c(-g45Var.a()));
            return sd5.a;
        }
    }

    public uh5(g45 g45Var, int i, p95 p95Var, s90 s90Var) {
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
        b43 b43VarY = ob2Var.y(g70.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(b43VarY.x, g70.g(j));
        return vb2Var.K(b43VarY.w, iMin, ds0.w, new QnHx(vb2Var, this, b43VarY, iMin));
    }

    @Override // defpackage.uy1
    public final /* synthetic */ int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return Md5A.a(this, vb2Var, kz1Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh5)) {
            return false;
        }
        uh5 uh5Var = (uh5) obj;
        return ur1.a(this.w, uh5Var.w) && this.x == uh5Var.x && ur1.a(this.y, uh5Var.y) && ur1.a(this.z, uh5Var.z);
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.w + ", cursorOffset=" + this.x + ", transformedText=" + this.y + ", textLayoutResultProvider=" + this.z + ')';
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
