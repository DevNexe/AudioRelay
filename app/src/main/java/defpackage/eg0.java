package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {551}, m = "invokeSuspend")
public final class eg0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<wm0, JW> B;
    public final /* synthetic */ float C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(OVbg<wm0, JW> oVbg, float f, z80<? super eg0> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
        this.C = f;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new eg0(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            wm0 wm0Var = new wm0(this.C);
            this.A = 1;
            if (this.B.e(wm0Var, this) == va0Var) {
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
        return ((eg0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
