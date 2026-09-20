package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerEventHandler", f = "AndroidServerEventHandler.kt", l = {65, 68}, m = "startServerService")
public final class PljG extends b90 {
    public cu0 A;
    public c8e.NUlFixed B;
    public /* synthetic */ Object C;
    public final /* synthetic */ fcT D;
    public int E;
    public fcT z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PljG(fcT fct, z80<? super PljG> z80Var) {
        super(z80Var);
        this.D = fct;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, null, this);
    }
}
