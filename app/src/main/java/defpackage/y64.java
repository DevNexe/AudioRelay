package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y64 implements uy1 {
    public final m64 w;
    public final boolean x;
    public final boolean y;
    public final tw2 z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int x;
        public final /* synthetic */ b43 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, b43 b43Var) {
            super(1);
            this.x = i;
            this.y = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            y64 y64Var = y64.this;
            m64 m64Var = y64Var.w;
            kz2 kz2Var = m64Var.c;
            int i = this.x;
            kz2Var.setValue(Integer.valueOf(i));
            if (m64Var.d() > i) {
                m64Var.a.setValue(Integer.valueOf(i));
            }
            int iO = AY.o(y64Var.w.d(), 0, i);
            int i2 = y64Var.x ? iO - i : -iO;
            boolean z = y64Var.y;
            b43.QnHx.g(qnHx2, this.y, z ? 0 : i2, z ? i2 : 0);
            return sd5.a;
        }
    }

    public y64(m64 m64Var, boolean z, boolean z2, tw2 tw2Var) {
        this.w = m64Var;
        this.x = z;
        this.y = z2;
        this.z = tw2Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        boolean z = this.y;
        X.k(j, z ? aw2.Vertical : aw2.Horizontal);
        b43 b43VarY = ob2Var.y(g70.a(j, 0, z ? g70.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : g70.g(j), 5));
        int i = b43VarY.w;
        int iH = g70.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = b43VarY.x;
        int iG = g70.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = b43VarY.x - i2;
        int i4 = b43VarY.w - i;
        if (!z) {
            i3 = i4;
        }
        this.z.setEnabled(i3 != 0);
        return vb2Var.K(i, i2, ds0.w, new QnHx(i3, b43VarY));
    }

    @Override // defpackage.uy1
    public final int O(vb2 vb2Var, kz1 kz1Var, int i) {
        return kz1Var.c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y64)) {
            return false;
        }
        y64 y64Var = (y64) obj;
        return ur1.a(this.w, y64Var.w) && this.x == y64Var.x && this.y == y64Var.y && ur1.a(this.z, y64Var.z);
    }

    @Override // defpackage.uy1
    public final int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        return kz1Var.u(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = this.w.hashCode() * 31;
        boolean z = this.x;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.y;
        return this.z.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
    }

    @Override // defpackage.uy1
    public final int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        return kz1Var.W(i);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    public final String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.w + ", isReversed=" + this.x + ", isVertical=" + this.y + ", overscrollEffect=" + this.z + ')';
    }

    @Override // defpackage.uy1
    public final int x(vb2 vb2Var, kz1 kz1Var, int i) {
        return kz1Var.x(i);
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
