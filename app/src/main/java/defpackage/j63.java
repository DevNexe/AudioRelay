package defpackage;

import com.azefsw.audioconnect.player.ui.service.PlayerService;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerEventHandler$handleEvent$2", f = "PlayerEventHandler.kt", l = {}, m = "invokeSuspend")
public final class j63 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ l63 A;
    public final /* synthetic */ f63 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(l63 l63Var, f63 f63Var, z80<? super j63> z80Var) {
        super(2, z80Var);
        this.A = l63Var;
        this.B = f63Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new j63(this.A, this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        sr4 sr4Var = ((f63.LPt8Fixed) this.B).a;
        l63 l63Var = this.A;
        l63Var.getClass();
        boolean z = PlayerService.A;
        PlayerService.QnHx.a(l63Var.a, sr4Var.a.a);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((j63) a(ua0Var, z80Var)).i(sd5.a);
    }
}
