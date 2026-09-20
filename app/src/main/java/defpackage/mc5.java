package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mc5 extends cx1 implements j81<oc5, sd5> {
    public final /* synthetic */ nc5 w;
    public final /* synthetic */ lc5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc5(nc5 nc5Var, lc5 lc5Var) {
        super(1);
        this.w = nc5Var;
        this.x = lc5Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(oc5 oc5Var) {
        oc5 oc5Var2 = oc5Var;
        nc5 nc5Var = this.w;
        sy4 sy4Var = nc5Var.a;
        lc5 lc5Var = this.x;
        synchronized (sy4Var) {
            if (oc5Var2.h()) {
                nc5Var.b.b(lc5Var, oc5Var2);
            } else {
                nc5Var.b.c(lc5Var);
            }
        }
        return sd5.a;
    }
}
