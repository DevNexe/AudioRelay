package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
public final class ls4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ ms4 B;
    public final /* synthetic */ Ah<Float> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls4(ms4 ms4Var, Ah<Float> ah, z80<? super ls4> z80Var) {
        super(2, z80Var);
        this.B = ms4Var;
        this.C = ah;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ls4(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<Float, JW> oVbg = this.B.c;
            Float f = new Float(0.0f);
            Ah<Float> ah = this.C;
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
        return ((ls4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
