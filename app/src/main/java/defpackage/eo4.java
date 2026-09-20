package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo4(int i, x81 x81Var, x81 x81Var2) {
        super(2);
        this.w = x81Var;
        this.x = x81Var2;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        jo4.c(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
