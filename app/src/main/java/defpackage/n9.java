package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.core.BasicViewModel$2", f = "BasicViewModel.kt", l = {38}, m = "invokeSuspend")
public final class n9 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ o9<Object, Object, Object> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(o9<Object, Object, Object> o9Var, z80<? super n9> z80Var) {
        super(2, z80Var);
        this.B = o9Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new n9(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            o9<Object, Object, Object> o9Var = this.B;
            v7<Object, Object, Object> v7Var = o9Var.a;
            bu0<Object, Object, Object> bu0Var = o9Var.b;
            this.A = 1;
            if (v7Var.m(bu0Var, this) == va0Var) {
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
        return ((n9) a(ua0Var, z80Var)).i(sd5.a);
    }
}
