package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u31 extends cx1 implements j81<f31, sd5> {
    public final /* synthetic */ ri2<j21> A;
    public final /* synthetic */ ci2 B;
    public final /* synthetic */ ua0 w;
    public final /* synthetic */ ri2<Boolean> x;
    public final /* synthetic */ Cif y;
    public final /* synthetic */ ri2<f33> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(ua0 ua0Var, ri2<Boolean> ri2Var, Cif cif, ri2<f33> ri2Var2, ri2<j21> ri2Var3, ci2 ci2Var) {
        super(1);
        this.w = ua0Var;
        this.x = ri2Var;
        this.y = cif;
        this.z = ri2Var2;
        this.A = ri2Var3;
        this.B = ci2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(f31 f31Var) {
        Boolean boolValueOf = Boolean.valueOf(f31Var.c());
        ri2<Boolean> ri2Var = this.x;
        ri2Var.setValue(boolValueOf);
        boolean zA = v31.a(ri2Var);
        ua0 ua0Var = this.w;
        ci2 ci2Var = this.B;
        ri2<j21> ri2Var2 = this.A;
        if (zA) {
            fp1.k0(ua0Var, null, 4, new r31(this.y, this.z, null), 1);
            fp1.k0(ua0Var, null, 0, new s31(ci2Var, ri2Var2, null), 3);
        } else {
            fp1.k0(ua0Var, null, 0, new t31(ci2Var, ri2Var2, null), 3);
        }
        return sd5.a;
    }
}
