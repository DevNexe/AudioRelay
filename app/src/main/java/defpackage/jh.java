package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh extends cx1 implements y81<x81<? super g30, ? super Integer, ? extends sd5>, g30, Integer, sd5> {
    public final /* synthetic */ j81<sg, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(int i, j81 j81Var) {
        super(3);
        this.w = j81Var;
        this.x = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(x81<? super g30, ? super Integer, ? extends sd5> x81Var, g30 g30Var, Integer num) {
        x81<? super g30, ? super Integer, ? extends sd5> x81Var2 = x81Var;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(x81Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            fh.f(this.w, x81Var2, g30Var2, ((iIntValue << 3) & 112) | ((this.x >> 3) & 14));
        }
        return sd5.a;
    }
}
