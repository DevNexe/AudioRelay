package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", f = "SuspendingPointerInputFilter.kt", l = {336}, m = "invokeSuspend")
public final class wx4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ qx4 C;
    public final /* synthetic */ x81<l93, z80<? super sd5>, Object> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wx4(qx4 qx4Var, x81<? super l93, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super wx4> z80Var) {
        super(2, z80Var);
        this.C = qx4Var;
        this.D = x81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        wx4 wx4Var = new wx4(this.C, this.D, z80Var);
        wx4Var.B = obj;
        return wx4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            qx4 qx4Var = this.C;
            qx4Var.F = ua0Var;
            this.A = 1;
            if (this.D.invoke(qx4Var, this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((wx4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
