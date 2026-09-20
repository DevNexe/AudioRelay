package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lf1 {
    public static final Dt<Bpm> a = new Dt<>("ApplicationPluginRegistry");

    public static final <B, F> F a(ue1 ue1Var, kf1<? extends B, F> kf1Var) {
        Bpm bpm = (Bpm) ue1Var.E.d(a);
        F f = bpm != null ? (F) bpm.d(kf1Var.getKey()) : null;
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("Plugin " + kf1Var + " is not installed. Consider using `install(" + kf1Var.getKey() + ")` in client config first.");
    }
}
