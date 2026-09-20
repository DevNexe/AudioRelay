package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.locale.AndroidLanguageStore$getSelectionStream$2", f = "AndroidLanguageStore.kt", l = {34}, m = "invokeSuspend")
public final class luCz extends px4 implements x81<nz0<? super zx1>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ E3F C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luCz(E3F e3f, z80<? super luCz> z80Var) {
        super(2, z80Var);
        this.C = e3f;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        luCz lucz = new luCz(this.C, z80Var);
        lucz.B = obj;
        return lucz;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            zx1 zx1VarC = this.C.c();
            this.A = 1;
            if (nz0Var.f(zx1VarC, this) == va0Var) {
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
    public final Object invoke(nz0<? super zx1> nz0Var, z80<? super sd5> z80Var) {
        return ((luCz) a(nz0Var, z80Var)).i(sd5.a);
    }
}
