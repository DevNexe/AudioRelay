package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler$onMediaProjectionStopped$1", f = "AndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class WXuy extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ AO9A A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WXuy(AO9A ao9a, z80<? super WXuy> z80Var) {
        super(2, z80Var);
        this.A = ao9a;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new WXuy(this.A, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.c.a(gf4.CQf.b);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((WXuy) a(ua0Var, z80Var)).i(sd5.a);
    }
}
