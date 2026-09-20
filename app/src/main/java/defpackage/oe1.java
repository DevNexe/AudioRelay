package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", l = {147, 148}, m = "invokeSuspend")
public final class oe1 extends px4 implements y81<u94, ig1, z80<? super ve1>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public /* synthetic */ ig1 C;
    public final /* synthetic */ pe1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe1(pe1 pe1Var, z80<? super oe1> z80Var) {
        super(3, z80Var);
        this.D = pe1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            u94 u94Var = (u94) this.B;
            ig1 ig1Var = this.C;
            this.B = null;
            this.A = 1;
            obj = u94Var.a(ig1Var, this);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ve1 ve1Var = (ve1) this.B;
                C0239D.H(obj);
                return ve1Var;
            }
            C0239D.H(obj);
        }
        ve1 ve1Var2 = (ve1) obj;
        qg1 qg1VarE = ve1Var2.e();
        this.B = ve1Var2;
        this.A = 2;
        return pe1.b(this.D, qg1VarE, this) == va0Var ? va0Var : ve1Var2;
    }

    @Override // defpackage.y81
    public final Object invoke(u94 u94Var, ig1 ig1Var, z80<? super ve1> z80Var) {
        oe1 oe1Var = new oe1(this.D, z80Var);
        oe1Var.B = u94Var;
        oe1Var.C = ig1Var;
        return oe1Var.i(sd5.a);
    }
}
