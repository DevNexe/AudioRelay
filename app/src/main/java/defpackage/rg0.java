package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
public final class rg0 extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ tg0 B;
    public int C;
    public gl3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(tg0 tg0Var, z80<? super rg0> z80Var) {
        super(z80Var);
        this.B = tg0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, 0.0f, this);
    }
}
