package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", l = {217, 222, 225, 233, 240, 252}, m = "animateScrollToPage")
public final class ly2 extends b90 {
    public int A;
    public int B;
    public float C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ky2 E;
    public int F;
    public ky2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(ky2 ky2Var, z80<? super ly2> z80Var) {
        super(z80Var);
        this.E = ky2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.d(0, this);
    }
}
