package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ i24 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ok2(i24 i24Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
        super(2);
        this.w = i24Var;
        this.x = x81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        lk2.b(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
