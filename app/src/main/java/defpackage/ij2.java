package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.name.NameEditorInputHandler", f = "NameEditorInputHandler.kt", l = {38, 39, 40, 48}, m = "handleInput")
public final class ij2 extends b90 {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ hj2 C;
    public int D;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij2(hj2 hj2Var, z80<? super ij2> z80Var) {
        super(z80Var);
        this.C = hj2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, this);
    }
}
