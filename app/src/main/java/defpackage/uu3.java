package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu3 {
    public static final su3 a;

    public static final class QnHx extends cx1 implements c91<Integer, int[], jy1, ij0, int[], sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(5);
        }

        @Override // defpackage.c91
        public final sd5 j0(Integer num, int[] iArr, jy1 jy1Var, ij0 ij0Var, int[] iArr2) {
            ij0 ij0Var2 = ij0Var;
            CZ9P.byN byn = CZ9P.a;
            byn.c(num.intValue(), ij0Var2, jy1Var, iArr, iArr2);
            return sd5.a;
        }
    }

    static {
        CZ9P.byN byn = CZ9P.a;
        int i = oc0.a;
        a = new su3(0, new oc0.NUlFixed(One.QnHx.j), 1, QnHx.w);
    }

    public static final rb2 a(CZ9P.LPt8Fixed lPt8, da.CQf cQf, g30 g30Var) {
        su3 su3Var;
        g30Var.e(-837807694);
        g30Var.e(511388516);
        boolean zI = g30Var.I(lPt8) | g30Var.I(cQf);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            if (ur1.a(lPt8, CZ9P.a) && ur1.a(cQf, One.QnHx.j)) {
                su3Var = a;
            } else {
                float fA = lPt8.a();
                int i = oc0.a;
                su3Var = new su3(fA, new oc0.NUlFixed(cQf), 1, new vu3(lPt8));
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
