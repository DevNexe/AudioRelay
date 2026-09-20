package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class df implements rg2, qu2 {
    public final ff w;
    public ff x;
    public iy1 y;

    public df(WFia wFia) {
        this.w = wFia;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.x = (ff) vg2Var.a(ef.a);
    }

    @Override // defpackage.qu2
    public final void l(iy1 iy1Var) {
        this.y = iy1Var;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
