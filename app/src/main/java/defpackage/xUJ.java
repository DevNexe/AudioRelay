package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler", f = "AndroidServerInputHandler.kt", l = {106, 111, 116, 128, 152}, m = "requestCapture")
public final class xUJ extends b90 {
    public wb4 A;
    public ffo B;
    public /* synthetic */ Object C;
    public final /* synthetic */ AO9A D;
    public int E;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xUJ(AO9A ao9a, z80<? super xUJ> z80Var) {
        super(z80Var);
        this.D = ao9a;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(null, null, this);
    }
}
