package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class im4 extends cx1 implements j81<yo1, sd5> {
    public final /* synthetic */ One.F1 w;
    public final /* synthetic */ boolean x = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im4(da.CQf cQf) {
        super(1);
        this.w = cQf;
    }

    @Override // defpackage.j81
    public final sd5 invoke(yo1 yo1Var) {
        eg5 eg5Var = yo1Var.a;
        eg5Var.b(this.w, "align");
        eg5Var.b(Boolean.valueOf(this.x), "unbounded");
        return sd5.a;
    }
}
