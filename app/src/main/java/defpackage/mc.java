package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", l = {38}, m = "invokeSuspend")
public final class mc extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ Object C;

    public mc(z80<? super mc> z80Var) {
        super(3, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            Object obj2 = this.C;
            y81 y81Var = (y81) ((ig1) k33Var.w).f.d(pc.a);
            if (y81Var == null) {
                return sd5.a;
            }
            cr2 cr2Var = new cr2((dw2) obj2, ((ig1) k33Var.w).e, y81Var);
            this.B = null;
            this.A = 1;
            if (k33Var.e(cr2Var, this) == va0Var) {
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

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        mc mcVar = new mc(z80Var);
        mcVar.B = k33Var;
        mcVar.C = obj;
        return mcVar.i(sd5.a);
    }
}
