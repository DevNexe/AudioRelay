package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uGD extends cx1 implements y81<kk2, g30, Integer, sd5> {
    public final /* synthetic */ tg w;
    public final /* synthetic */ j81<VV4, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uGD(tg tgVar, j81<? super VV4, sd5> j81Var, int i) {
        super(3);
        this.w = tgVar;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(kk2 kk2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        Iyje iyje = this.w.f;
        Iyje.LPt8Fixed lPt8 = iyje instanceof Iyje.LPt8Fixed ? (Iyje.LPt8Fixed) iyje : null;
        if (lPt8 != null) {
            t0.a(lPt8, this.x, g30Var2, this.y & 112);
        }
        return sd5.a;
    }
}
