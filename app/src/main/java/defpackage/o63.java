package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerInputHandler$getInitializeFlows$2", f = "PlayerInputHandler.kt", l = {57}, m = "invokeSuspend")
public final class o63 extends px4 implements x81<eXk0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ gk4<g63, f63, h63> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(gk4<g63, f63, h63> gk4Var, z80<? super o63> z80Var) {
        super(2, z80Var);
        this.C = gk4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        o63 o63Var = new o63(this.C, z80Var);
        o63Var.B = obj;
        return o63Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            if (!ur1.a((eXk0) this.B, eXk0.QnHx.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f63.QnHx qnHx = f63.QnHx.a;
            this.A = 1;
            if (this.C.o(qnHx, this) == va0Var) {
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
    public final Object invoke(eXk0 exk0, z80<? super sd5> z80Var) {
        return ((o63) a(exk0, z80Var)).i(sd5.a);
    }
}
