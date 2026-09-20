package defpackage;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Md5A {
    public static int a(uy1 uy1Var, rr1 rr1Var, zq1 zq1Var, int i) {
        return uy1Var.J(new xr1(rr1Var, rr1Var.getLayoutDirection()), new yb2(zq1Var, 2, 2), FWT.n(i, 0, 13)).getHeight();
    }

    public static int b(uy1 uy1Var, rr1 rr1Var, zq1 zq1Var, int i) {
        return uy1Var.J(new xr1(rr1Var, rr1Var.getLayoutDirection()), new yb2(zq1Var, 2, 1), FWT.n(0, i, 7)).getWidth();
    }

    public static int c(uy1 uy1Var, rr1 rr1Var, zq1 zq1Var, int i) {
        return uy1Var.J(new xr1(rr1Var, rr1Var.getLayoutDirection()), new yb2(zq1Var, 1, 2), FWT.n(i, 0, 13)).getHeight();
    }

    public static int d(uy1 uy1Var, rr1 rr1Var, zq1 zq1Var, int i) {
        return uy1Var.J(new xr1(rr1Var, rr1Var.getLayoutDirection()), new yb2(zq1Var, 1, 1), FWT.n(0, i, 7)).getWidth();
    }

    public static String e(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String f(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void h(Object[] objArr, int i, String str, LogIntent logIntent) {
        LogWrapperKt.log(logIntent, String.format(str, Arrays.copyOf(objArr, i)));
    }
}
