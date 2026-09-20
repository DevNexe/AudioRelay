package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n25 extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ cg A;
    public final /* synthetic */ OVbg<Float, JW> w;
    public final /* synthetic */ mt2 x;
    public final /* synthetic */ x45 y;
    public final /* synthetic */ u45 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n25(OVbg<Float, JW> oVbg, mt2 mt2Var, x45 x45Var, u45 u45Var, cg cgVar) {
        super(1);
        this.w = oVbg;
        this.x = mt2Var;
        this.y = x45Var;
        this.z = u45Var;
        this.A = cgVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        o55 o55Var;
        w70 w70Var2 = w70Var;
        w70Var2.B0();
        float fN = AY.n(this.w.d().floatValue(), 0.0f, 1.0f);
        if (!(fN == 0.0f)) {
            long j = this.y.b;
            int i = s55.c;
            int iB = this.x.b((int) (j >> 32));
            p55 p55VarC = this.z.c();
            dl3 dl3Var = (p55VarC == null || (o55Var = p55VarC.a) == null) ? new dl3(0.0f, 0.0f, 0.0f, 0.0f) : o55Var.c(iB);
            float fB0 = w70Var2.b0(q25.a);
            float f = fB0 / 2;
            float f2 = dl3Var.a + f;
            float fE = cm4.e(w70Var2.d()) - f;
            if (f2 > fE) {
                f2 = fE;
            }
            w70Var2.T(this.A, X.a(f2, dl3Var.b), X.a(f2, dl3Var.d), (496 & 8) != 0 ? 0.0f : fB0, 0, null, (496 & 64) != 0 ? 1.0f : fN, null, (496 & 256) != 0 ? 3 : 0);
        }
        return sd5.a;
    }
}
