package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
public final class r12 extends px4 implements x81<l64, z80<? super sd5>, Object> {
    public final /* synthetic */ q12 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r12(q12 q12Var, int i, int i2, z80<? super r12> z80Var) {
        super(2, z80Var);
        this.A = q12Var;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new r12(this.A, this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.i(this.B, this.C);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
        return ((r12) a(l64Var, z80Var)).i(sd5.a);
    }
}
