package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rn3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public rn3(sm3 sm3Var, x61 x61Var) {
        this.w = x61Var;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new pn3(sm3Var, str)), new bx0()), new qn3(sm3Var, "full_screen_ad_config"));
    }
}
