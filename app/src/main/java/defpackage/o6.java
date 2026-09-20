package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends cx1 implements j81<ig1, sd5> {
    public final /* synthetic */ k6<hf1> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(k6<hf1> k6Var) {
        super(1);
        this.w = k6Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ig1 ig1Var) {
        ig1 ig1Var2 = ig1Var;
        k6<hf1> k6Var = this.w;
        hH.F(ig1Var2, "ws", k6Var.b, Integer.valueOf(k6Var.c), "/ballast/debugger", new n6(k6Var));
        String str = k6Var.e;
        if (str != null) {
            ig1Var2.a().e("x-ballast-connection-id", str.toString());
            sd5 sd5Var = sd5.a;
        }
        String str2 = k6Var.d;
        if (str2 != null) {
            ig1Var2.a().e("x-ballast-version", str2.toString());
            sd5 sd5Var2 = sd5.a;
        }
        return sd5.a;
    }
}
