package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ za3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb3(za3 za3Var) {
        super(1);
        this.w = za3Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        String message = ((za3.NUlFixed) this.w).a.getMessage();
        if (message != null) {
            n52Var2.b("error", message);
        }
        return sd5.a;
    }
}
