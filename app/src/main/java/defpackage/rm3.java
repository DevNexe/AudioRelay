package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm3<T, R> implements i91 {
    public final /* synthetic */ sm3 w;

    public rm3(sm3 sm3Var) {
        this.w = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(Ytae.Single);
        }
        sm3 sm3Var = this.w;
        return new al4(new kl4(new il4(new pm3(sm3Var, str)), new kd()), new qm3(sm3Var, "ad_banner_strategy"));
    }
}
