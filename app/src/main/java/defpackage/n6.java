package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends cx1 implements j81<zc5, sd5> {
    public final /* synthetic */ k6<hf1> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(k6<hf1> k6Var) {
        super(1);
        this.w = k6Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(zc5 zc5Var) throws Throwable {
        zc5 zc5Var2 = zc5Var;
        ye5 ye5Var = zc5Var2.j;
        k6<hf1> k6Var = this.w;
        ye5Var.b("x-ballast-connection-id", k6Var.e);
        zc5Var2.j.b("x-ballast-version", k6Var.d);
        return sd5.a;
    }
}
