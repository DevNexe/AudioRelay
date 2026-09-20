package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wr3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ o43 w;
    public final /* synthetic */ n43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr3(o43 o43Var, n43 n43Var) {
        super(1);
        this.w = o43Var;
        this.x = n43Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        n52Var2.b("old_id", this.w.a);
        n52Var2.b("new_id", this.x.a.a);
        return sd5.a;
    }
}
