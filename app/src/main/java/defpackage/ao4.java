package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
public final class ao4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<Float, JW> B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Ah<Float> D;
    public final /* synthetic */ h81<sd5> E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao4(OVbg<Float, JW> oVbg, boolean z, Ah<Float> ah, h81<sd5> h81Var, z80<? super ao4> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
        this.C = z;
        this.D = ah;
        this.E = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ao4(this.B, this.C, this.D, this.E, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<Float, JW> oVbg = this.B;
            Float f = new Float(this.C ? 1.0f : 0.0f);
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
        this.E.invoke();
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ao4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
