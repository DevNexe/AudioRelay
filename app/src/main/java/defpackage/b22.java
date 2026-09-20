package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {95}, m = "invokeSuspend")
public final class b22 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ q12 B;
    public final /* synthetic */ float C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(q12 q12Var, float f, z80<? super b22> z80Var) {
        super(2, z80Var);
        this.B = q12Var;
        this.C = f;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new b22(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            if (a64.a(this.B, this.C, hH.w(0.0f, null, 7), this) == va0Var) {
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
        return ((b22) a(ua0Var, z80Var)).i(sd5.a);
    }
}
