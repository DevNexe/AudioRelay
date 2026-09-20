package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.UtilsKt$postInput$1", f = "utils.kt", l = {80}, m = "invokeSuspend")
public final class pc3 extends px4 implements x81<gk4<za3, ya3, fb3>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc3(Object obj, z80 z80Var) {
        super(2, z80Var);
        this.C = obj;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        pc3 pc3Var = new pc3(this.C, z80Var);
        pc3Var.B = obj;
        return pc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            gk4 gk4Var = (gk4) this.B;
            this.A = 1;
            if (gk4Var.n(this.C, this) == va0Var) {
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
    public final Object invoke(gk4<za3, ya3, fb3> gk4Var, z80<? super sd5> z80Var) {
        return ((pc3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
