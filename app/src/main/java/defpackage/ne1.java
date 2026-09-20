package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", l = {138, 141}, m = "invokeSuspend")
public final class ne1 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public /* synthetic */ rg1 C;
    public final /* synthetic */ pe1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(pe1 pe1Var, z80<? super ne1> z80Var) {
        super(3, z80Var);
        this.D = pe1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k33] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r1 = this.A;
        try {
            if (r1 == 0) {
                C0239D.H(obj);
                k33 k33Var = (k33) this.B;
                rg1 rg1Var = this.C;
                this.B = k33Var;
                this.A = 1;
                Object objE = k33Var.e(rg1Var, this);
                r1 = k33Var;
                if (objE == va0Var) {
                    return va0Var;
                }
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.B;
                    C0239D.H(obj);
                    throw th;
                }
                k33 k33Var2 = (k33) this.B;
                C0239D.H(obj);
                r1 = k33Var2;
            }
            return sd5.a;
        } catch (Throwable th2) {
            Throwable thH = X.H(th2);
            gg1 gg1VarD = ((ve1) r1.w).d();
            this.B = thH;
            this.A = 2;
            if (pe1.a(this.D, thH, gg1VarD, this) == va0Var) {
                return va0Var;
            }
            throw thH;
        }
    }

    @Override // defpackage.y81
    public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
        ne1 ne1Var = new ne1(this.D, z80Var);
        ne1Var.B = k33Var;
        ne1Var.C = rg1Var;
        return ne1Var.i(sd5.a);
    }
}
