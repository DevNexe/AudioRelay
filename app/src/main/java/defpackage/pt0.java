package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt0 extends u83 {
    public final xa4.CQf l;
    public final ry4 m;

    public static final class QnHx extends cx1 implements h81<pa4[]> {
        public final /* synthetic */ int w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pt0 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, String str, pt0 pt0Var) {
            super(0);
            this.w = i;
            this.x = str;
            this.y = pt0Var;
        }

        @Override // defpackage.h81
        public final pa4[] invoke() {
            int i = this.w;
            pa4[] pa4VarArr = new pa4[i];
            for (int i2 = 0; i2 < i; i2++) {
                pa4VarArr[i2] = FWT.r(this.x + '.' + this.y.e[i2], uv4.LPt8Fixed.a, new pa4[0], ua4.w);
            }
            return pa4VarArr;
        }
    }

    public pt0(String str, int i) {
        super(str, null, i);
        this.l = xa4.CQf.a;
        this.m = new ry4(new QnHx(i, str, this));
    }

    @Override // defpackage.u83, defpackage.pa4
    public final xa4 e() {
        return this.l;
    }

    @Override // defpackage.u83
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pa4)) {
            return false;
        }
        pa4 pa4Var = (pa4) obj;
        if (pa4Var.e() != xa4.CQf.a) {
            return false;
        }
        return ur1.a(this.a, pa4Var.a()) && ur1.a(bx0.d(this), bx0.d(pa4Var));
    }

    @Override // defpackage.u83
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        sa4 sa4Var = new sa4(this);
        int iHashCode2 = 1;
        while (sa4Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) sa4Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.u83, defpackage.pa4
    public final pa4 j(int i) {
        return ((pa4[]) this.m.getValue())[i];
    }

    @Override // defpackage.u83
    public final String toString() {
        return wu.M0(new ta4(this), ", ", bl2.c(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
