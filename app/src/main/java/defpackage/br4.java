package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class br4 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final nf0 a(g30 g30Var) {
        g30Var.e(904445851);
        ij0 ij0Var = (ij0) g30Var.E(r40.e);
        Float fValueOf = Float.valueOf(ij0Var.getDensity());
        g30Var.e(1157296644);
        boolean zI = g30Var.I(fValueOf);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new of0(new ar4(ij0Var));
            g30Var.B(objF);
        }
        g30Var.G();
        nf0 nf0Var = (nf0) objF;
        g30Var.G();
        return nf0Var;
    }
}
