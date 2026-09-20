package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he2 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "automatic_gain_control";
        }
        if (i == 2) {
            return "echo_canceller";
        }
        if (i == 3) {
            return "noise_suppressor";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "AutomaticGainControl";
        }
        if (i == 2) {
            return "EchoCanceller";
        }
        return i == 3 ? "NoiseSuppressor" : "null";
    }
}
