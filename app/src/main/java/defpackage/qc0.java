package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc0 {
    public static String a(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder b(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static void c(int i, sz szVar, mm4 mm4Var, g30 g30Var, int i2, int i3) {
        szVar.invoke(mm4Var, g30Var, Integer.valueOf(i));
        g30Var.e(i2);
        g30Var.e(i3);
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "ATTEMPT_MIGRATION";
        }
        if (i == 2) {
            return "NOT_GENERATED";
        }
        if (i == 3) {
            return "UNREGISTERED";
        }
        if (i == 4) {
            return "REGISTERED";
        }
        return i == 5 ? "REGISTER_ERROR" : "null";
    }
}
