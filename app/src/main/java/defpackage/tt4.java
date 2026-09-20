package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tt4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ wu3 w;
    public final /* synthetic */ vy3 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt4(wu3 wu3Var, vy3 vy3Var, boolean z, int i) {
        super(2);
        this.w = wu3Var;
        this.x = vy3Var;
        this.y = z;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        vy3 vy3Var = this.x;
        boolean z = this.y;
        ut4.e(this.w, vy3Var, z, g30Var, i);
        return sd5.a;
    }
}
