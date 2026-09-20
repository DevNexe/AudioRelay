package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
public final class h01 extends px4 implements y81<nz0<Object>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ x81<Object, z80<Object>, Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h01(x81<Object, ? super z80<Object>, ? extends Object> x81Var, z80<? super h01> z80Var) {
        super(3, z80Var);
        this.D = x81Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                nz0Var = this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nz0Var = this.B;
        Object obj2 = this.C;
        this.B = nz0Var;
        this.A = 1;
        obj = this.D.invoke(obj2, this);
        if (obj == va0Var) {
            return va0Var;
        }
        this.B = null;
        this.A = 2;
        if (nz0Var.f(obj, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<Object> nz0Var, Object obj, z80<? super sd5> z80Var) {
        h01 h01Var = new h01(this.D, z80Var);
        h01Var.B = nz0Var;
        h01Var.C = obj;
        return h01Var.i(sd5.a);
    }
}
