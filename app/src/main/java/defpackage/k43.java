package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k43 extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ g43 A;
    public final /* synthetic */ kl3<jy1> B;
    public final /* synthetic */ kl3<cm4> C;
    public final /* synthetic */ is4<Float> D;
    public final /* synthetic */ is4<Float> E;
    public final /* synthetic */ ri2<Float> F;
    public final /* synthetic */ py2 w;
    public final /* synthetic */ kl3<ew2> x;
    public final /* synthetic */ dj4 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k43(py2 py2Var, kl3 kl3Var, dj4 dj4Var, long j, g43 g43Var, kl3 kl3Var2, kl3 kl3Var3, t95.LPt8Fixed lPt8, t95.LPt8Fixed lPt9, ri2 ri2Var) {
        super(1);
        this.w = py2Var;
        this.x = kl3Var;
        this.y = dj4Var;
        this.z = j;
        this.A = g43Var;
        this.B = kl3Var2;
        this.C = kl3Var3;
        this.D = lPt8;
        this.E = lPt9;
        this.F = ri2Var;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, ew2] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, ew2] */
    /* JADX WARN: Type inference failed for: r15v2, types: [T, jy1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, cm4] */
    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        w70 w70Var2 = w70Var;
        is4<Float> is4Var = this.D;
        float fFloatValue = is4Var.getValue().floatValue();
        boolean z = 0.01f <= fFloatValue && fFloatValue <= 0.99f;
        py2 py2Var = this.w;
        if (z) {
            py2Var.b(is4Var.getValue().floatValue());
            dn dnVarB = w70Var2.e0().b();
            dnVarB.l(ps0.q0(w70Var2.d()), py2Var);
            w70Var2.B0();
            dnVarB.r();
        } else if (is4Var.getValue().floatValue() >= 0.99f) {
            w70Var2.B0();
        }
        is4<Float> is4Var2 = this.E;
        float fA = l43.a(is4Var2);
        boolean z2 = 0.01f <= fA && fA <= 0.99f;
        ri2<Float> ri2Var = this.F;
        kl3<cm4> kl3Var = this.C;
        kl3<jy1> kl3Var2 = this.B;
        kl3<ew2> kl3Var3 = this.x;
        if (z2) {
            py2Var.b(l43.a(is4Var2));
            dj4 dj4Var = this.y;
            long j = this.z;
            g43 g43Var = this.A;
            dn dnVarB2 = w70Var2.e0().b();
            dnVarB2.l(ps0.q0(w70Var2.d()), py2Var);
            kl3Var3.a = m57.d(w70Var2, dj4Var, j, g43Var, ri2Var.getValue().floatValue(), kl3Var3.a, kl3Var2.a, kl3Var.a);
            dnVarB2.r();
        } else if (l43.a(is4Var2) >= 0.99f) {
            kl3Var3.a = m57.d(w70Var2, this.y, this.z, this.A, ri2Var.getValue().floatValue(), kl3Var3.a, kl3Var2.a, kl3Var.a);
        }
        kl3Var.a = new cm4(w70Var2.d());
        kl3Var2.a = w70Var2.getLayoutDirection();
        return sd5.a;
    }
}
