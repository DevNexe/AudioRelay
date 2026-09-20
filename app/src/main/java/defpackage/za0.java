package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", l = {134}, m = "invokeSuspend")
public final class za0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ oj D;
    public final /* synthetic */ x81<Object, z80<? super sd5>, Object> E;
    public final /* synthetic */ oa0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public za0(boolean z, oj ojVar, x81<Object, ? super z80<? super sd5>, ? extends Object> x81Var, oa0 oa0Var, z80<? super za0> z80Var) {
        super(2, z80Var);
        this.C = z;
        this.D = ojVar;
        this.E = x81Var;
        this.F = oa0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        za0 za0Var = new za0(this.C, this.D, this.E, this.F, z80Var);
        za0Var.B = obj;
        return za0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        oj ojVar = this.D;
        try {
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var = (ua0) this.B;
                if (this.C) {
                    ojVar.b((ms1) ua0Var.g().j(ms1.CQf.w));
                }
                bp bpVar = new bp(ua0Var, ojVar);
                x81<Object, z80<? super sd5>, Object> x81Var = this.E;
                this.A = 1;
                if (x81Var.invoke(bpVar, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
        } catch (Throwable th) {
            md5 md5Var = rl0.b;
            oa0 oa0Var = this.F;
            if (!ur1.a(oa0Var, md5Var) && oa0Var != null) {
                throw th;
            }
            ojVar.l(th);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((za0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
