package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a95 extends cx1 implements y81<lcO, g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a95(String str, int i) {
        super(3);
        this.w = str;
        this.x = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).l, g30Var2, (this.x >> 3) & 14, 0, 32766);
        return sd5.a;
    }
}
