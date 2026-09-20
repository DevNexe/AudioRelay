package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", l = {35}, m = "invokeSuspend")
public final class lg1 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ue1 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(ue1 ue1Var, z80<? super lg1> z80Var) {
        super(3, z80Var);
        this.C = ue1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        jx jxVar;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jxVar = (jx) this.B;
            try {
                C0239D.H(obj);
                jxVar.h();
                return sd5.a;
            } catch (Throwable th) {
                th = th;
                try {
                    jxVar.e0(th);
                    throw th;
                } catch (Throwable th2) {
                    jxVar.h();
                    throw th2;
                }
            }
        }
        C0239D.H(obj);
        k33 k33Var = (k33) this.B;
        os1 os1Var = new os1(((ig1) k33Var.w).e);
        os1Var.r0(new ng1(((ms1) this.C.z.j(ms1.CQf.w)).r0(new og1(os1Var))));
        try {
            ((ig1) k33Var.w).e = os1Var;
            this.B = os1Var;
            this.A = 1;
            if (k33Var.d(this) == va0Var) {
                return va0Var;
            }
            jxVar = os1Var;
            jxVar.h();
            return sd5.a;
        } catch (Throwable th3) {
            th = th3;
            jxVar = os1Var;
            jxVar.e0(th);
            throw th;
        }
    }

    @Override // defpackage.y81
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        lg1 lg1Var = new lg1(this.C, z80Var);
        lg1Var.B = k33Var;
        return lg1Var.i(sd5.a);
    }
}
