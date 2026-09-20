package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
public final class sz0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ mz0<Object> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(mz0<Object> mz0Var, z80<? super sz0> z80Var) {
        super(2, z80Var);
        this.B = mz0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new sz0(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            Object objA = this.B.a(hp2.w, this);
            if (objA != obj2) {
                objA = sd5.a;
            }
            if (objA == obj2) {
                return obj2;
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((sz0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
