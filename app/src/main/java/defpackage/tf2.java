package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ te2 w;
    public final /* synthetic */ j81<ev3, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tf2(te2 te2Var, j81<? super ev3, sd5> j81Var, int i) {
        super(2);
        this.w = te2Var;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        hf2.j(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
