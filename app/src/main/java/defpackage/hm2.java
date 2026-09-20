package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends cx1 implements y81<kk2, g30, Integer, sd5> {
    public final /* synthetic */ y81<kk2, g30, Integer, sd5> w;
    public final /* synthetic */ im2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(sz szVar, im2 im2Var) {
        super(3);
        this.w = szVar;
        this.x = im2Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(kk2 kk2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        b5.a(false, new gm2(this.x), g30Var2, 0, 1);
        this.w.invoke(kk2Var, g30Var2, 8);
        return sd5.a;
    }
}
