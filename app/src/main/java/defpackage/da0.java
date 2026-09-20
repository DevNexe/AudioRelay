package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ j45 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(j45 j45Var, boolean z, int i) {
        super(2);
        this.w = j45Var;
        this.x = z;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        m90.d(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
