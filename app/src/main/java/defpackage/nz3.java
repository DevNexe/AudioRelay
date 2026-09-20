package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler", f = "RunningPlayerInputHandler.kt", l = {150}, m = "toggleMute")
public final class nz3 extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ oz3 B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz3(oz3 oz3Var, z80<? super nz3> z80Var) {
        super(z80Var);
        this.B = oz3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
