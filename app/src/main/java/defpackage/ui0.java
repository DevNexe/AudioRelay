package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {148}, m = "awaitCancellation")
public final class ui0 extends b90 {
    public int A;
    public /* synthetic */ Object z;

    public ui0(z80<? super ui0> z80Var) {
        super(z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        S12N.c(this);
        return va0.COROUTINE_SUSPENDED;
    }
}
