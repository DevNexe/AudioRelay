package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ Cif w;
    public final /* synthetic */ pf x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(Cif cif, pf pfVar) {
        super(1);
        this.w = cif;
        this.x = pfVar;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        Cif cif = this.w;
        ui2<pf> ui2Var = ((kf) cif).a;
        pf pfVar = this.x;
        ui2Var.b(pfVar);
        return new mf(cif, pfVar);
    }
}
