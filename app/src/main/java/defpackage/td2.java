package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.network.messages.MessageSenderBusImpl$messageStream$2", f = "MessageSenderBusImpl.kt", l = {}, m = "invokeSuspend")
public final class td2 extends px4 implements y81<nz0<? super ad2>, Throwable, z80<? super sd5>, Object> {
    public final /* synthetic */ ud2 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td2(ud2 ud2Var, z80<? super td2> z80Var) {
        super(3, z80Var);
        this.A = ud2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.a.setValue(gp2.a);
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<? super ad2> nz0Var, Throwable th, z80<? super sd5> z80Var) {
        return new td2(this.A, z80Var).i(sd5.a);
    }
}
