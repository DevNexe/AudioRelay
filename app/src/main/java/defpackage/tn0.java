package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tn0 extends cx1 implements j81<d93, sd5> {
    public final /* synthetic */ oh5 w;
    public final /* synthetic */ aw2 x;
    public final /* synthetic */ q94<an0> y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(oh5 oh5Var, aw2 aw2Var, jo joVar, boolean z) {
        super(1);
        this.w = oh5Var;
        this.x = aw2Var;
        this.y = joVar;
        this.z = z;
    }

    @Override // defpackage.j81
    public final sd5 invoke(d93 d93Var) {
        d93 d93Var2 = d93Var;
        Cz.f(this.w, d93Var2);
        long jA = Cz.A(d93Var2, false);
        float fD = this.x == aw2.Vertical ? kt2.d(jA) : kt2.c(jA);
        d93Var2.a();
        if (this.z) {
            fD *= -1;
        }
        this.y.H(new an0.CQf(fD, d93Var2.c));
        return sd5.a;
    }
}
