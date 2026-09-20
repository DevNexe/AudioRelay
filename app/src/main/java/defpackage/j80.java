package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", f = "ContentNegotiation.kt", l = {202, 203}, m = "invokeSuspend")
public final class j80 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public final /* synthetic */ h80 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(h80 h80Var, z80<? super j80> z80Var) {
        super(3, z80Var);
        this.C = h80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        k33 k33Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                k33Var = this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        k33Var = this.B;
        ig1 ig1Var = (ig1) k33Var.w;
        Object objC = k33Var.c();
        this.B = k33Var;
        this.A = 1;
        obj = this.C.a(ig1Var, objC, this);
        if (obj == va0Var) {
            return va0Var;
        }
        if (obj == null) {
            return sd5.a;
        }
        this.B = null;
        this.A = 2;
        if (k33Var.e(obj, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        j80 j80Var = new j80(this.C, z80Var);
        j80Var.B = k33Var;
        return j80Var.i(sd5.a);
    }
}
