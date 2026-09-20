package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kn3<T, R> implements i91 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ sm3 x;

    public kn3(sm3 sm3Var, og ogVar) {
        this.w = ogVar;
        this.x = sm3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str.length() == 0) {
            return vk4.f(this.w);
        }
        sm3 sm3Var = this.x;
        return new al4(new kl4(new il4(new in3(sm3Var, str)), new FWT()), new jn3(sm3Var, "buffer_sizes"));
    }
}
