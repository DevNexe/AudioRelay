package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn3<T, R> implements i91 {
    public final /* synthetic */ sm3 w;

    public gn3(sm3 sm3Var) {
        this.w = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(coNFixed.Rectangle);
        }
        sm3 sm3Var = this.w;
        return new al4(new kl4(new il4(new en3(sm3Var, str)), new qe0()), new fn3(sm3Var, "ads_fragment_type"));
    }
}
