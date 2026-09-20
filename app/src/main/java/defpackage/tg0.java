package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg0 implements qy0 {
    public final nf0<Float> a;

    public tg0(nf0<Float> nf0Var) {
        this.a = nf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qy0
    public final Object a(z64.CQf.C0230CQf c0230CQf, float f, z80 z80Var) throws Throwable {
        rg0 rg0Var;
        gl3 gl3Var;
        if (z80Var instanceof rg0) {
            rg0Var = (rg0) z80Var;
            int i = rg0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg0Var.C = i - Integer.MIN_VALUE;
            } else {
                rg0Var = new rg0(this, z80Var);
            }
        } else {
            rg0Var = new rg0(this, z80Var);
        }
        Object obj = rg0Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = rg0Var.C;
        if (i2 == 0) {
            C0239D.H(obj);
            if (Math.abs(f) > 1.0f) {
                gl3 gl3Var2 = new gl3();
                gl3Var2.w = f;
                gl3 gl3Var3 = new gl3();
                AOdm aOdmI = fp1.i(0.0f, f, 28);
                sg0 sg0Var = new sg0(gl3Var3, c0230CQf, gl3Var2);
                rg0Var.z = gl3Var2;
                rg0Var.C = 1;
                if (kx4.b(aOdmI, this.a, sg0Var, rg0Var) == va0Var) {
                    return va0Var;
                }
                gl3Var = gl3Var2;
            }
            return new Float(f);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gl3Var = rg0Var.z;
        C0239D.H(obj);
        f = gl3Var.w;
        return new Float(f);
    }
}
