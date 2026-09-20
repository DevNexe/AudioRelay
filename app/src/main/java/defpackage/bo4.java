package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
public final class bo4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<Float, JW> B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Ah<Float> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo4(OVbg<Float, JW> oVbg, boolean z, Ah<Float> ah, z80<? super bo4> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
        this.C = z;
        this.D = ah;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new bo4(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<Float, JW> oVbg = this.B;
            Float f = new Float(this.C ? 1.0f : 0.8f);
            Ah<Float> ah = this.D;
            this.A = 1;
            if (OVbg.c(oVbg, f, ah, null, this, 12) == va0Var) {
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
        return ((bo4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
