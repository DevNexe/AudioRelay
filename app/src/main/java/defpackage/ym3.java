package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public ym3(sm3 sm3Var, LpT7Fixed lpT7) {
        this.w = lpT7;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new wm3(sm3Var, str)), new tt0()), new xm3(sm3Var, "ad_keywords"));
    }
}
