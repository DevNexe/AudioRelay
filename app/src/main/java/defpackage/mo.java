package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
public final class mo extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ nz0<Object> C;
    public final /* synthetic */ oo<Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(z80 z80Var, nz0 nz0Var, oo ooVar) {
        super(2, z80Var);
        this.C = nz0Var;
        this.D = ooVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        mo moVar = new mo(z80Var, this.C, this.D);
        moVar.B = obj;
        return moVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nk3<Object> nk3VarK = this.D.k((ua0) this.B);
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
        return ((mo) a(ua0Var, z80Var)).i(sd5.a);
    }
}
