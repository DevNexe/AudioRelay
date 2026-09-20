package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wa2 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ int w;
    public final /* synthetic */ w55 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(int i, w55 w55Var) {
        super(3);
        this.w = i;
        this.x = w55Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-1027014173);
        int i = this.w;
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        }
        if (i == Integer.MAX_VALUE) {
            pg2.QnHx qnHx = pg2.QnHx.w;
            g30Var2.G();
            return qnHx;
        }
        ij0 ij0Var = (ij0) g30Var2.E(r40.e);
        e41.QnHx qnHx2 = (e41.QnHx) g30Var2.E(r40.h);
        jy1 jy1Var = (jy1) g30Var2.E(r40.k);
        g30Var2.e(511388516);
        w55 w55Var = this.x;
        boolean zI = g30Var2.I(w55Var) | g30Var2.I(jy1Var);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objF == c0132QnHx) {
            objF = m57.f(w55Var, jy1Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        w55 w55Var2 = (w55) objF;
        g30Var2.e(511388516);
        boolean zI2 = g30Var2.I(qnHx2) | g30Var2.I(w55Var2);
        Object objF2 = g30Var2.f();
        if (zI2 || objF2 == c0132QnHx) {
            rq4 rq4Var = w55Var2.a;
            e41 e41Var = rq4Var.f;
            x41 x41Var = rq4Var.c;
            if (x41Var == null) {
                x41Var = x41.z;
            }
            v41 v41Var = rq4Var.d;
            int i2 = v41Var != null ? v41Var.a : 0;
            w41 w41Var = rq4Var.e;
            objF2 = qnHx2.a(e41Var, x41Var, i2, w41Var != null ? w41Var.a : 1);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        is4 is4Var = (is4) objF2;
        Object[] objArr = {ij0Var, qnHx2, w55Var, jy1Var, is4Var.getValue()};
        g30Var2.e(-568225417);
        boolean zI3 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            zI3 |= g30Var2.I(objArr[i3]);
        }
        Object objF3 = g30Var2.f();
        if (zI3 || objF3 == c0132QnHx) {
            objF3 = Integer.valueOf(sp1.b(u25.a(w55Var2, ij0Var, qnHx2, u25.a, 1)));
            g30Var2.B(objF3);
        }
        g30Var2.G();
        int iIntValue = ((Number) objF3).intValue();
        Object[] objArr2 = {ij0Var, qnHx2, w55Var, jy1Var, is4Var.getValue()};
        g30Var2.e(-568225417);
        boolean zI4 = false;
        for (int i4 = 0; i4 < 5; i4++) {
            zI4 |= g30Var2.I(objArr2[i4]);
        }
        Object objF4 = g30Var2.f();
        if (zI4 || objF4 == c0132QnHx) {
            StringBuilder sb = new StringBuilder();
            String str = u25.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objF4 = Integer.valueOf(sp1.b(u25.a(w55Var2, ij0Var, qnHx2, sb.toString(), 2)));
            g30Var2.B(objF4);
        }
        g30Var2.G();
        float fJ = ij0Var.j(((i - 1) * (((Number) objF4).intValue() - iIntValue)) + iIntValue);
        wo1.QnHx qnHx3 = wo1.a;
        lm4 lm4Var = new lm4(0.0f, Float.NaN, 0.0f, fJ, 5);
        g30Var2.G();
        return lm4Var;
    }
}
