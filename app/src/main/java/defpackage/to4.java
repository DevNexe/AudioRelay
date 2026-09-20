package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {477}, m = "performDecayFling")
public final class to4 extends b90 {
    public gl3 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ wo4 C;
    public int D;
    public wo4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to4(wo4 wo4Var, z80<? super to4> z80Var) {
        super(z80Var);
        this.C = wo4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(null, null, 0, 0.0f, false, this);
    }
}
