package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler", f = "AndroidServerInputHandler.kt", l = {83, 97}, m = "onPermissionStateUpdated")
public final class i4au extends b90 {
    public VV4.PRnFixed A;
    public /* synthetic */ Object B;
    public final /* synthetic */ AO9A C;
    public int D;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4au(AO9A ao9a, z80<? super i4au> z80Var) {
        super(z80Var);
        this.C = ao9a;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, null, this);
    }
}
