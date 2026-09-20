package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1", f = "CryptoJvm.kt", l = {66}, m = "invokeSuspend")
public final class tc0 extends px4 implements x81<ua0, z80<? super String>, Object> {
    public int A;

    public tc0(z80<? super tc0> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new tc0(z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            NUlFixed nUl = fp2.b;
            this.A = 1;
            obj = nUl.E(this);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return obj;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super String> z80Var) {
        return new tc0(z80Var).i(sd5.a);
    }
}
