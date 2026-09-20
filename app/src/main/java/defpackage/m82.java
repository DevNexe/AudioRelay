package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.ManualConnectionInputHandler", f = "ManualConnectionInputHandler.kt", l = {30, 31, 31, 32, 33, 34}, m = "handleInput")
public final class m82 extends b90 {
    public fo1 A;
    public String B;
    public /* synthetic */ Object C;
    public final /* synthetic */ t82 D;
    public int E;
    public t82 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m82(t82 t82Var, z80<? super m82> z80Var) {
        super(z80Var);
        this.D = t82Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, this);
    }
}
