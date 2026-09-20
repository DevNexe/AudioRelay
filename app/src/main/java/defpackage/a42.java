package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a42 {
    public static StringBuilder a(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        }
        return i == 2 ? "DROP_WORK_REQUEST" : "null";
    }
}
