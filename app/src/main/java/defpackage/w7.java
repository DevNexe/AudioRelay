package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl", f = "BallastViewModelImpl.kt", l = {290}, m = "filterQueued")
public final class w7 extends b90 {
    public do1.QnHx A;
    public /* synthetic */ Object B;
    public final /* synthetic */ v7<Object, Object, Object> C;
    public int D;
    public ph3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(v7<Object, Object, Object> v7Var, z80<? super w7> z80Var) {
        super(z80Var);
        this.C = v7Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return v7.j(this.C, null, this);
    }
}
