package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ vp w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz3(int i, vp vpVar, boolean z) {
        super(2);
        this.w = vpVar;
        this.x = z;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        pz3.l(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
