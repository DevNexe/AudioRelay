package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t3G extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ nj1<jv2> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ j81<kv2, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t3G(nj1<jv2> nj1Var, boolean z, j81<? super kv2, sd5> j81Var, int i) {
        super(2);
        this.w = nj1Var;
        this.x = z;
        this.y = j81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        boolean z = this.x;
        j81<kv2, sd5> j81Var = this.y;
        Ix.f(this.w, z, j81Var, g30Var, i);
        return sd5.a;
    }
}
