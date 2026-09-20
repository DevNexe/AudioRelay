package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ov0 extends cx1 implements j81<t95.CQf<ts0>, lx0<sp1>> {
    public final /* synthetic */ nv0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(nv0 nv0Var) {
        super(1);
        this.w = nv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    @Override // defpackage.j81
    public final lx0<sp1> invoke(t95.CQf<ts0> cQf) {
        lx0<sp1> lx0Var;
        t95.CQf<ts0> cQf2 = cQf;
        ts0 ts0Var = ts0.PreEnter;
        ts0 ts0Var2 = ts0.Visible;
        boolean zB = cQf2.b(ts0Var, ts0Var2);
        nv0 nv0Var = this.w;
        if (zB) {
            io value = nv0Var.y.getValue();
            if (value != null) {
                lx0Var = value.c;
            } else {
                lx0Var = null;
            }
        } else if (cQf2.b(ts0Var2, ts0.PostExit)) {
            io value2 = nv0Var.z.getValue();
            if (value2 != null) {
                lx0Var = value2.c;
            } else {
                lx0Var = null;
            }
        } else {
            lx0Var = us0.e;
        }
        return lx0Var == null ? us0.e : lx0Var;
    }
}
