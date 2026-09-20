package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vi extends cx1 implements y81<wu3, g30, Integer, sd5> {
    public final /* synthetic */ y81<wu3, g30, Integer, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vi(y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, int i) {
        super(3);
        this.w = y81Var;
        this.x = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
        wu3 wu3Var2 = wu3Var;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(wu3Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            this.w.invoke(wu3Var2, g30Var2, Integer.valueOf((iIntValue & 14) | ((this.x >> 6) & 112)));
        }
        return sd5.a;
    }
}
