package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {445}, m = "invokeSuspend")
public final class y54 extends px4 implements x81<l64, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ z54 C;
    public final /* synthetic */ x81<w83, z80<? super sd5>, Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y54(z54 z54Var, x81<? super w83, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super y54> z80Var) {
        super(2, z80Var);
        this.C = z54Var;
        this.D = x81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        y54 y54Var = new y54(this.C, this.D, z80Var);
        y54Var.B = obj;
        return y54Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l64 l64Var = (l64) this.B;
            z54 z54Var = this.C;
            z54Var.b = l64Var;
            this.A = 1;
            if (this.D.invoke(z54Var, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
        return ((y54) a(l64Var, z80Var)).i(sd5.a);
    }
}
