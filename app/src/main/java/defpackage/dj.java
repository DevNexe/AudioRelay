package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj {
    public static boolean a(pg2.CQf cQf, j81 j81Var) {
        return ((Boolean) j81Var.invoke(cQf)).booleanValue();
    }

    public static String b(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String c(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "INVARIANT";
        }
        if (i == 2) {
            return "IN";
        }
        return i == 3 ? "OUT" : "null";
    }
}
