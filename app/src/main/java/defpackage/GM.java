package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GM {
    public static String a(String str, int i) {
        return str + i;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "None";
        }
        if (i == 2) {
            return "Loading";
        }
        if (i == 3) {
            return "Failed";
        }
        if (i == 4) {
            return "Displayed";
        }
        return i == 5 ? "Hidden" : "null";
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "ServerUpsell";
        }
        return i == 2 ? "MicNoiseSuppression" : "null";
    }
}
