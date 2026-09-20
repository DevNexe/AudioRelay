package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x82 extends cx1 implements j81<iw1, sd5> {
    public final /* synthetic */ j81<k82, sd5> w;
    public final /* synthetic */ x45 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(x45 x45Var, j81 j81Var) {
        super(1);
        this.w = j81Var;
        this.x = x45Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(iw1 iw1Var) {
        this.w.invoke(new k82.F1(this.x.a.w));
        return sd5.a;
    }
}
