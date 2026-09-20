package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c92 extends cx1 implements j81<x45, sd5> {
    public final /* synthetic */ j81<k82, sd5> w;
    public final /* synthetic */ ri2<x45> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(ri2 ri2Var, j81 j81Var) {
        super(1);
        this.w = j81Var;
        this.x = ri2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(x45 x45Var) {
        x45 x45Var2 = x45Var;
        this.x.setValue(x45Var2);
        this.w.invoke(new k82.YKK(x45Var2.a.w));
        return sd5.a;
    }
}
