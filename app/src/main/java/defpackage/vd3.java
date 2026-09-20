package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vd3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ri2<Integer> w;
    public final /* synthetic */ Object[] x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd3(ri2<Integer> ri2Var, Object[] objArr) {
        super(2);
        this.w = ri2Var;
        this.x = objArr;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            hz0.a(p10.a, new ud3(this.w, this.x), null, null, null, null, 0L, 0L, null, g30Var2, 6, 508);
        }
        return sd5.a;
    }
}
