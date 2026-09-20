package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerInputHandler$getInitializeFlows$6", f = "PlayerInputHandler.kt", l = {79}, m = "invokeSuspend")
public final class q63 extends px4 implements x81<sr4, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ gk4<g63, f63, h63> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q63(gk4<g63, f63, h63> gk4Var, z80<? super q63> z80Var) {
        super(2, z80Var);
        this.C = gk4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        q63 q63Var = new q63(this.C, z80Var);
        q63Var.B = obj;
        return q63Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            f63.LPt8Fixed lPt8 = new f63.LPt8Fixed((sr4) this.B);
            this.A = 1;
            if (this.C.o(lPt8, this) == va0Var) {
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
    public final Object invoke(sr4 sr4Var, z80<? super sd5> z80Var) {
        return ((q63) a(sr4Var, z80Var)).i(sd5.a);
    }
}
