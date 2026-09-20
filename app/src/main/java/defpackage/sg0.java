package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends cx1 implements j81<rjr<Float, JW>, sd5> {
    public final /* synthetic */ gl3 w;
    public final /* synthetic */ l64 x;
    public final /* synthetic */ gl3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(gl3 gl3Var, z64.CQf.C0230CQf c0230CQf, gl3 gl3Var2) {
        super(1);
        this.w = gl3Var;
        this.x = c0230CQf;
        this.y = gl3Var2;
    }

    @Override // defpackage.j81
    public final sd5 invoke(rjr<Float, JW> rjrVar) {
        rjr<Float, JW> rjrVar2 = rjrVar;
        float fFloatValue = rjrVar2.b().floatValue();
        gl3 gl3Var = this.w;
        float f = fFloatValue - gl3Var.w;
        float fA = this.x.a(f);
        gl3Var.w = rjrVar2.b().floatValue();
        this.y.w = rjrVar2.c().floatValue();
        if (Math.abs(f - fA) > 0.5f) {
            rjrVar2.a();
        }
        return sd5.a;
    }
}
