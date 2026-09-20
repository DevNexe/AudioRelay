package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {406, 416}, m = "flingToIndex")
public final class so4 extends b90 {
    public l64 A;
    public int B;
    public float C;
    public /* synthetic */ Object D;
    public final /* synthetic */ wo4 E;
    public int F;
    public wo4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so4(wo4 wo4Var, z80<? super so4> z80Var) {
        super(z80Var);
        this.E = wo4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.d(null, 0, 0.0f, this);
    }
}
