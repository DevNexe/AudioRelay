package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {87}, m = "invokeSuspend")
public final class vg3 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ nz0<Object> C;
    public final /* synthetic */ wg3<Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg3(nz0<Object> nz0Var, wg3<Object> wg3Var, z80<? super vg3> z80Var) {
        super(2, z80Var);
        this.C = nz0Var;
        this.D = wg3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        vg3 vg3Var = new vg3(this.C, this.D, z80Var);
        vg3Var.B = obj;
        return vg3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            wg3<Object> wg3Var = this.D;
            nk3<Object> nk3VarK = wg3Var.k(fp1.q0(ua0Var, wg3Var.w));
            this.A = 1;
            Object objA = rz0.a(this.C, nk3VarK, true, this);
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
        return ((vg3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
