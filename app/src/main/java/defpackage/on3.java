package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class on3<T, R> implements i91 {
    public final /* synthetic */ sm3 w;

    public on3(sm3 sm3Var) {
        this.w = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(A$Y4.OpenSL);
        }
        sm3 sm3Var = this.w;
        return new al4(new kl4(new il4(new mn3(sm3Var, str)), new eu()), new nn3(sm3Var, "default_audio_output"));
    }
}
