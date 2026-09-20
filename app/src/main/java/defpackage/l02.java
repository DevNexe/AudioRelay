package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {266}, m = "invokeSuspend")
public final class l02 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ c43 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l02(c43 c43Var, z80<? super l02> z80Var) {
        super(2, z80Var);
        this.B = c43Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new l02(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        c43 c43Var = this.B;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<mp1, Bd_> oVbg = c43Var.b;
            mp1 mp1Var = new mp1(c43Var.c);
            this.A = 1;
            if (oVbg.e(mp1Var, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        c43Var.d.setValue(Boolean.FALSE);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((l02) a(ua0Var, z80Var)).i(sd5.a);
    }
}
