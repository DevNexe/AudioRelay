package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {561}, m = "invokeSuspend")
public final class fg0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<wm0, JW> B;
    public final /* synthetic */ gg0 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ vp1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg0(OVbg<wm0, JW> oVbg, gg0 gg0Var, float f, vp1 vp1Var, z80<? super fg0> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
        this.C = gg0Var;
        this.D = f;
        this.E = vp1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new fg0(this.B, this.C, this.D, this.E, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        vp1 j21Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<wm0, JW> oVbg = this.B;
            float f = ((wm0) oVbg.e.getValue()).w;
            gg0 gg0Var = this.C;
            if (wm0.a(f, gg0Var.b)) {
                j21Var = new qd3(kt2.b);
            } else if (wm0.a(f, gg0Var.d)) {
                j21Var = new hd1();
            } else {
                j21Var = wm0.a(f, gg0Var.e) ? new j21() : null;
            }
            this.A = 1;
            if (zq0.a(oVbg, this.D, j21Var, this.E, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((fg0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
