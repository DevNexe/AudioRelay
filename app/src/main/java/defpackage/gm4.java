package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm4 {
    public static final hx0 a = b(1.0f);
    public static final hx0 b = new hx0(1, 1.0f, new fm4(1.0f));
    public static final hx0 c = a(1.0f);
    public static final ho5 d;
    public static final ho5 e;

    public static final class CQf extends cx1 implements j81<yo1, sd5> {
        public final /* synthetic */ float w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(float f) {
            super(1);
            this.w = f;
        }

        @Override // defpackage.j81
        public final sd5 invoke(yo1 yo1Var) {
            yo1Var.a.b(Float.valueOf(this.w), "fraction");
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<sp1, jy1, mp1> {
        public final /* synthetic */ One w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(One one) {
            super(2);
            this.w = one;
        }

        @Override // defpackage.x81
        public final mp1 invoke(sp1 sp1Var, jy1 jy1Var) {
            return new mp1(this.w.a(0L, sp1Var.a, jy1Var));
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<yo1, sd5> {
        public final /* synthetic */ One w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(One one, boolean z) {
            super(1);
            this.w = one;
            this.x = z;
        }

        @Override // defpackage.j81
        public final sd5 invoke(yo1 yo1Var) {
            eg5 eg5Var = yo1Var.a;
            eg5Var.b(this.w, "align");
            eg5Var.b(Boolean.valueOf(this.x), "unbounded");
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<yo1, sd5> {
        public final /* synthetic */ float w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(float f) {
            super(1);
            this.w = f;
        }

        @Override // defpackage.j81
        public final sd5 invoke(yo1 yo1Var) {
            yo1Var.a.b(Float.valueOf(this.w), "fraction");
            return sd5.a;
        }
    }

    static {
        da.QnHx qnHx = One.QnHx.n;
        new jm4(qnHx);
        new km4(qnHx);
        da.QnHx qnHx2 = One.QnHx.m;
        new jm4(qnHx2);
        new km4(qnHx2);
        da.CQf cQf = One.QnHx.k;
        new hm4(cQf);
        new im4(cQf);
        da.CQf cQf2 = One.QnHx.j;
        new hm4(cQf2);
        new im4(cQf2);
        d = c(One.QnHx.e, false);
        e = c(One.QnHx.a, false);
    }

    public static final hx0 a(float f) {
        return new hx0(3, f, new QnHx(f));
    }

    public static final hx0 b(float f) {
        return new hx0(2, f, new CQf(f));
    }

    public static final ho5 c(One one, boolean z) {
        return new ho5(3, z, new F1(one), one, new LPt8Fixed(one, z));
    }

    public static pg2 d(pg2 pg2Var) {
        return pg2Var.y(b);
    }

    public static pg2 e(pg2 pg2Var) {
        return pg2Var.y(c);
    }

    public static pg2 f(pg2 pg2Var) {
        return pg2Var.y(a);
    }

    public static final pg2 g(pg2 pg2Var, float f) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new lm4(0.0f, f, 0.0f, f, 5));
    }

    public static final pg2 h(pg2 pg2Var, float f) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new lm4(f, f, f, f, true));
    }

    public static final pg2 i(pg2 pg2Var, float f, float f2) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new lm4(f, f2, f, f2, true));
    }

    public static pg2 j(pg2 pg2Var, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 1) != 0 ? Float.NaN : f;
        float f6 = (i & 2) != 0 ? Float.NaN : f2;
        float f7 = (i & 4) != 0 ? Float.NaN : f3;
        float f8 = (i & 8) != 0 ? Float.NaN : f4;
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new lm4(f5, f6, f7, f8, true));
    }

    public static final pg2 k(pg2 pg2Var, float f) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new lm4(f, 0.0f, f, 0.0f, 10));
    }

    public static pg2 l(pg2 pg2Var, da daVar, int i) {
        ho5 ho5VarC;
        int i2 = i & 1;
        da daVar2 = One.QnHx.e;
        if (i2 != 0) {
            daVar = daVar2;
        }
        if (ur1.a(daVar, daVar2)) {
            ho5VarC = d;
        } else {
            ho5VarC = ur1.a(daVar, One.QnHx.a) ? e : c(daVar, false);
        }
        return pg2Var.y(ho5VarC);
    }
}
