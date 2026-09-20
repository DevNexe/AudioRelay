package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x31 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ci2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(ci2 ci2Var, boolean z) {
        super(3);
        this.w = z;
        this.x = ci2Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-618949501);
        w31 w31Var = new w31((mo1) g30Var2.E(r40.j));
        wo1.QnHx qnHx = wo1.a;
        pg2 pg2VarA = f30.a(new a31(w31Var), wo1.a, new v31(this.x, this.w));
        g30Var2.G();
        return pg2VarA;
    }
}
