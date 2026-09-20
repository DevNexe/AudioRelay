package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd3 extends cx1 implements y81<ay2, g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object[] y;
    public final /* synthetic */ ri2<Integer> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd3(String str, String str2, Object[] objArr, ri2<Integer> ri2Var) {
        super(3);
        this.w = str;
        this.x = str2;
        this.y = objArr;
        this.z = ri2Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(ay2 ay2Var, g30 g30Var, Integer num) throws ClassNotFoundException {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            YKK.e(this.w, this.x, g30Var2, this.y[this.z.getValue().intValue()]);
        }
        return sd5.a;
    }
}
