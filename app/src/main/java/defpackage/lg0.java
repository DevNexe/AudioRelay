package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements uj1 {
    public static final lg0 a = new lg0();

    public static final class QnHx implements vj1 {
        public final is4<Boolean> w;
        public final is4<Boolean> x;
        public final is4<Boolean> y;

        public QnHx(ri2 ri2Var, ri2 ri2Var2, ri2 ri2Var3) {
            this.w = ri2Var;
            this.x = ri2Var2;
            this.y = ri2Var3;
        }

        @Override // defpackage.vj1
        public final void b(ez1 ez1Var) {
            ez1Var.B0();
            if (this.w.getValue().booleanValue()) {
                qo0.i(ez1Var, yu.b(yu.b, 0.3f), 0L, ez1Var.d(), 0.0f, null, 122);
            } else if (this.x.getValue().booleanValue() || this.y.getValue().booleanValue()) {
                qo0.i(ez1Var, yu.b(yu.b, 0.1f), 0L, ez1Var.d(), 0.0f, null, 122);
            }
        }
    }

    @Override // defpackage.uj1
    public final vj1 a(wp1 wp1Var, g30 g30Var) {
        g30Var.e(1683566979);
        g30Var.e(-1692965168);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.R(Boolean.FALSE);
            g30Var.B(objF);
        }
        g30Var.G();
        ri2 ri2Var = (ri2) objF;
        wq0.d(wp1Var, new sd3(wp1Var, ri2Var, null), g30Var);
        g30Var.G();
        g30Var.e(1206586544);
        g30Var.e(-492369756);
        Object objF2 = g30Var.f();
        if (objF2 == c0132QnHx) {
            objF2 = ps0.R(Boolean.FALSE);
            g30Var.B(objF2);
        }
        g30Var.G();
        ri2 ri2Var2 = (ri2) objF2;
        wq0.d(wp1Var, new jd1(wp1Var, ri2Var2, null), g30Var);
        g30Var.G();
        ri2 ri2VarA = m21.a(wp1Var, g30Var, 0);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(wp1Var);
        Object objF3 = g30Var.f();
        if (zI || objF3 == c0132QnHx) {
            objF3 = new QnHx(ri2Var, ri2Var2, ri2VarA);
            g30Var.B(objF3);
        }
        g30Var.G();
        QnHx qnHx = (QnHx) objF3;
        g30Var.G();
        return qnHx;
    }
}
