package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dy3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ qf4 w;
    public final /* synthetic */ gl0 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(qf4 qf4Var, gl0 gl0Var, int i) {
        super(2);
        this.w = qf4Var;
        this.x = gl0Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        ix3.r(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
