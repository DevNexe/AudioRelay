package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dn3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public dn3(sm3 sm3Var, w1L w1l) {
        this.w = w1l;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new bn3(sm3Var, str)), new xnX3()), new cn3(sm3Var, "ad_unit_ids"));
    }
}
