package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq4 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ADDING";
        }
        return i == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "BAD_CONFIG";
        }
        return i == 3 ? "AUTH_ERROR" : "null";
    }
}
