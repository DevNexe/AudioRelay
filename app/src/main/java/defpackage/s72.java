package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.main.ui.MainInputHandler", f = "MainInputHandler.kt", l = {28, 43}, m = "handleInput")
public final class s72 extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ v72 B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s72(v72 v72Var, z80<? super s72> z80Var) {
        super(z80Var);
        this.B = v72Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
