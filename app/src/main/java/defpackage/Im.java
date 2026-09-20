package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler", f = "AndroidServerInputHandler.kt", l = {221, 231}, m = "startServer")
public final class Im extends b90 {
    public VV4.LPt6Fixed A;
    public /* synthetic */ Object B;
    public final /* synthetic */ AO9A C;
    public int D;
    public AO9A z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Im(AO9A ao9a, z80<? super Im> z80Var) {
        super(z80Var);
        this.C = ao9a;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.g(null, null, this);
    }
}
