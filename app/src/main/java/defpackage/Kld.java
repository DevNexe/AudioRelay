package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Kld extends cx1 implements y81<kk2, g30, Integer, sd5> {
    public final /* synthetic */ tg w;
    public final /* synthetic */ j81<VV4, sd5> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ ri2<Boolean> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Kld(tg tgVar, j81<? super VV4, sd5> j81Var, int i, ri2<Boolean> ri2Var) {
        super(3);
        this.w = tgVar;
        this.x = j81Var;
        this.y = i;
        this.z = ri2Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(kk2 kk2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        if (this.z.getValue().booleanValue()) {
            tg tgVar = this.w;
            j81<VV4, sd5> j81Var = this.x;
            int i = this.y << 3;
            yh1.a(null, tgVar, j81Var, g30Var2, (i & 112) | 0 | (i & 896), 1);
        }
        return sd5.a;
    }
}
