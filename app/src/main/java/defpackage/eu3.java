package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eu3 extends cx1 implements y81<ke, g30, Integer, sd5> {
    public final /* synthetic */ y81<kk2, g30, Integer, sd5> w;
    public final /* synthetic */ kk2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eu3(y81<? super kk2, ? super g30, ? super Integer, sd5> y81Var, kk2 kk2Var) {
        super(3);
        this.w = y81Var;
        this.x = kk2Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(ke keVar, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            this.w.invoke(this.x, g30Var2, 8);
        }
        return sd5.a;
    }
}
