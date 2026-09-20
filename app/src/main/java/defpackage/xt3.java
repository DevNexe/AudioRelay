package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ il2 x;
    public final /* synthetic */ xv0 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt3(pg2 pg2Var, il2 il2Var, xv0 xv0Var, int i) {
        super(2);
        this.w = pg2Var;
        this.x = il2Var;
        this.y = xv0Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        il2 il2Var = this.x;
        xv0 xv0Var = this.y;
        yt3.b(this.w, il2Var, xv0Var, g30Var, i);
        return sd5.a;
    }
}
