package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u82 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ wv w;
    public final /* synthetic */ i82 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(wv wvVar, i82 i82Var, int i) {
        super(2);
        this.w = wvVar;
        this.x = i82Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        f92.b(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
