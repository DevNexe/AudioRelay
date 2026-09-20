package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl2 {
    public static int a(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static mm4 b(g30 g30Var, ti5 ti5Var, a30.QnHx.NUlFixed nUl, g30 g30Var2) {
        hH.u(g30Var, ti5Var, nUl);
        g30Var.h();
        return new mm4(g30Var2);
    }

    public static String c(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }
}
