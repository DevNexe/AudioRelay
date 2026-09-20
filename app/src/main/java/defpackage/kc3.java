package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ za3.YKK w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc3(za3.YKK ykk) {
        super(1);
        this.w = ykk;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        eb3 eb3Var = this.w.a;
        if (eb3Var instanceof eb3.QnHx) {
            n52Var2.b("type", "upgrade");
            n52Var2.b("plan", ((eb3.QnHx) eb3Var).a.f.a);
        } else if (eb3Var instanceof eb3.CQf) {
            n52Var2.b("type", "normal");
            n52Var2.b("plan", ((eb3.CQf) eb3Var).a.f.a);
        }
        return sd5.a;
    }
}
