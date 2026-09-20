package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj0 {
    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "OK";
        }
        return i == 2 ? "BAD_CONFIG" : "null";
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "FIRST_OR_DEFAULT";
        }
        if (i == 3) {
            return "LAST";
        }
        return i == 4 ? "SINGLE" : "null";
    }
}
