package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "Scrollable.kt", l = {578}, m = "invokeSuspend")
public final class y70 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ x70 B;
    public final /* synthetic */ dl3 C;
    public final /* synthetic */ dl3 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(x70 x70Var, dl3 dl3Var, dl3 dl3Var2, z80<? super y70> z80Var) {
        super(2, z80Var);
        this.B = x70Var;
        this.C = dl3Var;
        this.D = dl3Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new y70(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            if (this.B.e(this.C, this.D, this) == va0Var) {
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
        return ((y70) a(ua0Var, z80Var)).i(sd5.a);
    }
}
