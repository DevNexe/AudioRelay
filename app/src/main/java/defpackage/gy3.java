package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ wb4 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy3(wb4 wb4Var, String str, int i) {
        super(2);
        this.w = wb4Var;
        this.x = str;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        ix3.s(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
