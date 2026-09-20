package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d72 {
    public static final n94<h81<kt2>> a = new n94<>("MagnifierPositionInRoot");

    public static pg2 a(j81 j81Var, e72 e72Var, j81 j81Var2) {
        pg2 pg2VarA;
        pg2.QnHx qnHx = pg2.QnHx.w;
        u62 u62Var = u62.w;
        wo1.QnHx qnHx2 = wo1.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if (!(i >= 28)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            pg2VarA = f30.a(qnHx, wo1.a, new c72(j81Var, u62Var, Float.NaN, j81Var2, i == 28 ? l53.a : m53.a, e72Var));
        } else {
            pg2VarA = qnHx;
        }
        return wo1.a(qnHx, pg2VarA);
    }
}
