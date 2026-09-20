package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {102}, m = "invokeSuspend")
public final class a84 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ OVbg<kt2, Bd_> B;
    public final /* synthetic */ long C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a84(OVbg<kt2, Bd_> oVbg, long j, z80<? super a84> z80Var) {
        super(2, z80Var);
        this.B = oVbg;
        this.C = j;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new a84(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<kt2, Bd_> oVbg = this.B;
            kt2 kt2Var = new kt2(this.C);
            hr4<kt2> hr4Var = w74.d;
            this.A = 1;
            if (OVbg.c(oVbg, kt2Var, hr4Var, null, this, 12) == va0Var) {
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
        return ((a84) a(ua0Var, z80Var)).i(sd5.a);
    }
}
