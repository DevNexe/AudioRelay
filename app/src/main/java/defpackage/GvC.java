package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler", f = "AndroidServerInputHandler.kt", l = {185, 186, 187}, m = "onResumed")
public final class GvC extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ AO9A B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GvC(AO9A ao9a, z80<? super GvC> z80Var) {
        super(z80Var);
        this.B = ao9a;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(null, this);
    }
}
