package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", l = {126, 129}, m = "invokeSuspend")
public final class me1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ pe1 D;

    public static final class QnHx extends cx1 implements h81<Boolean> {
        public final /* synthetic */ pe1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pe1 pe1Var) {
            super(0);
            this.w = pe1Var;
        }

        @Override // defpackage.h81
        public final Boolean invoke() {
            return Boolean.valueOf(this.w.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(pe1 pe1Var, z80<? super me1> z80Var) {
        super(3, z80Var);
        this.D = pe1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k33] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r1 = this.A;
        pe1 pe1Var = this.D;
        try {
            if (r1 == 0) {
                C0239D.H(obj);
                k33 k33Var = (k33) this.B;
                Object obj2 = this.C;
                ((ig1) k33Var.w).f.f(te1.a, new QnHx(pe1Var));
                this.B = k33Var;
                this.A = 1;
                Object objE = k33Var.e(obj2, this);
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
            ig1 ig1Var = (ig1) r1.w;
            Dt<Boolean> dt = te1.a;
            se1 se1Var = new se1(ig1Var);
            this.B = thH;
            this.A = 2;
            if (pe1.a(pe1Var, thH, se1Var, this) == va0Var) {
                return va0Var;
            }
            throw thH;
        }
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        me1 me1Var = new me1(this.D, z80Var);
        me1Var.B = k33Var;
        me1Var.C = obj;
        return me1Var.i(sd5.a);
    }
}
