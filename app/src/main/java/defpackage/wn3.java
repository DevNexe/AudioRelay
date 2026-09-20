package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wn3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public wn3(sm3 sm3Var, z61 z61Var) {
        this.w = z61Var;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new un3(sm3Var, str)), new fTO$()), new vn3(sm3Var, "full_screen_ad_strategy_config"));
    }
}
