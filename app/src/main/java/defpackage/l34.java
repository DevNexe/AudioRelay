package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l34 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ bw4 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ y81<ay2, g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l34(bw4 bw4Var, int i, y81<? super ay2, ? super g30, ? super Integer, sd5> y81Var, int i2) {
        super(2);
        this.w = bw4Var;
        this.x = i;
        this.y = y81Var;
        this.z = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.y.invoke(new by2(0, 0, 0, this.w.j(this.x)), g30Var2, Integer.valueOf((this.z >> 6) & 112));
        }
        return sd5.a;
    }
}
