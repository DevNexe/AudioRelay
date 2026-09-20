package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", l = {45}, m = "invokeSuspend")
public final class nc extends px4 implements y81<k33<qg1, sd5>, qg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ qg1 C;

    public nc(z80<? super nc> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            qg1 qg1Var = this.C;
            y81 y81Var = (y81) qg1Var.c().d().getAttributes().d(pc.b);
            if (y81Var == null) {
                return sd5.a;
            }
            fk fkVarD = qg1Var.d();
            la0 la0VarG = qg1Var.g();
            mc1 mc1VarA = qg1Var.a();
            List<String> list = rf1.a;
            String str = mc1VarA.get("Content-Length");
            xi0 xi0Var = new xi0(qg1Var.c(), xnX3.c(ha1.w, la0VarG, true, new C1646zj(str != null ? Long.valueOf(Long.parseLong(str)) : null, fkVarD, y81Var, null)).x, qg1Var);
            this.B = null;
            this.A = 1;
            if (k33Var.e(xi0Var, this) == va0Var) {
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
    public final Object invoke(k33<qg1, sd5> k33Var, qg1 qg1Var, z80<? super sd5> z80Var) {
        nc ncVar = new nc(z80Var);
        ncVar.B = k33Var;
        ncVar.C = qg1Var;
        return ncVar.i(sd5.a);
    }
}
