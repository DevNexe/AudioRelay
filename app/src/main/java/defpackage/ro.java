package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
public final class ro extends px4 implements x81<nz0<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ so<Object, Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(so<Object, Object> soVar, z80<? super ro> z80Var) {
        super(2, z80Var);
        this.C = soVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ro roVar = new ro(this.C, z80Var);
        roVar.B = obj;
        return roVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0<? super Object> nz0Var = (nz0) this.B;
            this.A = 1;
            if (this.C.l(nz0Var, this) == va0Var) {
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
    public final Object invoke(nz0<Object> nz0Var, z80<? super sd5> z80Var) {
        return ((ro) a(nz0Var, z80Var)).i(sd5.a);
    }
}
