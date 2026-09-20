package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vs3 {
    public static final nb5<Float> a = new nb5<>(15, nq0.QnHx.a, 2);

    public static final p53 a(boolean z, float f, long j, g30 g30Var, int i, int i2) {
        g30Var.e(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = yu.h;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        wm0 wm0Var = new wm0(f);
        g30Var.e(-3686552);
        boolean zI = g30Var.I(boolValueOf) | g30Var.I(wm0Var);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new p53(z, f, ri2VarF0);
            g30Var.B(objF);
        }
        g30Var.G();
        p53 p53Var = (p53) objF;
        g30Var.G();
        return p53Var;
    }
}
