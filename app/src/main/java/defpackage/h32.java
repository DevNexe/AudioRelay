package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.core.LifoInputStrategy$processInputs$2", f = "LifoInputStrategy.kt", l = {42}, m = "invokeSuspend")
public final class h32 extends px4 implements x81<ph3<Object, Object, Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ qo1<Object, Object, Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(qo1<Object, Object, Object> qo1Var, z80<? super h32> z80Var) {
        super(2, z80Var);
        this.C = qo1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        h32 h32Var = new h32(this.C, z80Var);
        h32Var.B = obj;
        return h32Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ph3 ph3Var = (ph3) this.B;
            yg0 yg0Var = new yg0();
            this.A = 1;
            if (this.C.a(ph3Var, yg0Var, this) == va0Var) {
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
    public final Object invoke(ph3<Object, Object, Object> ph3Var, z80<? super sd5> z80Var) {
        return ((h32) a(ph3Var, z80Var)).i(sd5.a);
    }
}
