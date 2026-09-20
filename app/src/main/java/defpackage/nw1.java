package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.compose.KeyboardInteractionsKt$scrollableWithKeyboard$1$1$1", f = "KeyboardInteractions.kt", l = {77}, m = "invokeSuspend")
public final class nw1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ m64 B;
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(m64 m64Var, int i, z80<? super nw1> z80Var) {
        super(2, z80Var);
        this.B = m64Var;
        this.C = i;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new nw1(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            m64 m64Var = this.B;
            if (a64.c(m64Var, this.C - m64Var.d(), this) == va0Var) {
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
        return ((nw1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
