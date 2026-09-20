package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ej1 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx3(ej1 ej1Var, int i, int i2) {
        super(2);
        this.w = ej1Var;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        ix3.p(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
