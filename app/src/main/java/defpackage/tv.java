package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tv {
    public static final su3 a;

    public static final class QnHx extends cx1 implements c91<Integer, int[], jy1, ij0, int[], sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(5);
        }

        @Override // defpackage.c91
        public final sd5 j0(Integer num, int[] iArr, jy1 jy1Var, ij0 ij0Var, int[] iArr2) {
            num.intValue();
            CZ9P.byN byn = CZ9P.a;
            CZ9P.b(iArr, iArr2, false);
            return sd5.a;
        }
    }

    static {
        CZ9P.byN byn = CZ9P.a;
        int i = oc0.a;
        a = new su3(0, new oc0.F1(One.QnHx.m), 2, QnHx.w);
    }

    public static final rb2 a(CZ9P.FJCM fjcm, da.QnHx qnHx, g30 g30Var) {
        su3 su3Var;
        g30Var.e(1089876336);
        g30Var.e(511388516);
        boolean zI = g30Var.I(fjcm) | g30Var.I(qnHx);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            if (ur1.a(fjcm, CZ9P.c) && ur1.a(qnHx, One.QnHx.m)) {
                su3Var = a;
            } else {
                float fA = fjcm.a();
                int i = oc0.a;
                su3Var = new su3(fA, new oc0.F1(qnHx), 2, new uv(fjcm));
            }
            objF = su3Var;
            g30Var.B(objF);
        }
        g30Var.G();
        rb2 rb2Var = (rb2) objF;
        g30Var.G();
        return rb2Var;
    }
}
