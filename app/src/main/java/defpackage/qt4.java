package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ kj1<gs4> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt4(kj1<gs4> kj1Var, int i) {
        super(2);
        this.w = kj1Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        ut4.d(this.w, g30Var, i);
        return sd5.a;
    }
}
