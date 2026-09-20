package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.buffersize.custom.CustomBufferSizeEditorInputHandler", f = "CustomBufferSizeEditorInputHandler.kt", l = {43, 46}, m = "save")
public final class wd0 extends b90 {
    public fo1 A;
    public xq0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ be0 D;
    public int E;
    public be0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(be0 be0Var, z80<? super wd0> z80Var) {
        super(z80Var);
        this.D = be0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, null, this);
    }
}
