package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vo4 extends cx1 implements j81<rjr<Float, JW>, sd5> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ gl3 w;
    public final /* synthetic */ l64 x;
    public final /* synthetic */ gl3 y;
    public final /* synthetic */ wo4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo4(gl3 gl3Var, z64.CQf.C0230CQf c0230CQf, gl3 gl3Var2, wo4 wo4Var, boolean z, int i) {
        super(1);
        this.w = gl3Var;
        this.x = c0230CQf;
        this.y = gl3Var2;
        this.z = wo4Var;
        this.A = z;
        this.B = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(rjr<Float, JW> rjrVar) {
        rjr<Float, JW> rjrVar2 = rjrVar;
        float fFloatValue = rjrVar2.b().floatValue();
        gl3 gl3Var = this.w;
        float f = fFloatValue - gl3Var.w;
        l64 l64Var = this.x;
        float fA = l64Var.a(f);
        gl3Var.w = rjrVar2.b().floatValue();
        this.y.w = rjrVar2.c().floatValue();
        if (Math.abs(f - fA) > 0.5f) {
            rjrVar2.a();
        }
        wo4 wo4Var = this.z;
        ap4 ap4VarE = wo4Var.a.e();
        if (ap4VarE == null) {
            rjrVar2.a();
        } else {
            boolean zD = rjrVar2.d();
            int i = this.B;
            if (zD && this.A) {
                if (rjrVar2.c().floatValue() > 0.0f && ap4VarE.a() == i - 1) {
                    rjrVar2.a();
                } else if (rjrVar2.c().floatValue() < 0.0f && ap4VarE.a() == i) {
                    rjrVar2.a();
                }
            }
            if (rjrVar2.d() && wo4.b(wo4Var, rjrVar2, ap4VarE, i, new uo4(l64Var))) {
                rjrVar2.a();
            }
        }
        return sd5.a;
    }
}
