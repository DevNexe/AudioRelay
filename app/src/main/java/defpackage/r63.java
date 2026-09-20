package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerInputHandler$getInitializeFlows$9", f = "PlayerInputHandler.kt", l = {93}, m = "invokeSuspend")
public final class r63 extends px4 implements x81<g63.CQf, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ gk4<g63, f63, h63> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r63(gk4<g63, f63, h63> gk4Var, z80<? super r63> z80Var) {
        super(2, z80Var);
        this.C = gk4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        r63 r63Var = new r63(this.C, z80Var);
        r63Var.B = obj;
        return r63Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            g63.CQf cQf = (g63.CQf) this.B;
            this.A = 1;
            if (this.C.n(cQf, this) == va0Var) {
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
    public final Object invoke(g63.CQf cQf, z80<? super sd5> z80Var) {
        return ((r63) a(cQf, z80Var)).i(sd5.a);
    }
}
