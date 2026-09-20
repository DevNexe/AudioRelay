package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vm3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public vm3(sm3 sm3Var, Bs6V bs6V) {
        this.w = bs6V;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new tm3(sm3Var, str)), new ddf()), new um3(sm3Var, "ad_config"));
    }
}
