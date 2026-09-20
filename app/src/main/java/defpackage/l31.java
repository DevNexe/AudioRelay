package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {105}, m = "invokeSuspend")
public final class l31 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public ri2 A;
    public int B;
    public final /* synthetic */ ri2<j21> C;
    public final /* synthetic */ ci2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(ci2 ci2Var, ri2 ri2Var, z80 z80Var) {
        super(2, z80Var);
        this.C = ri2Var;
        this.D = ci2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new l31(this.D, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ri2<j21> ri2Var;
        ri2<j21> ri2Var2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        if (i == 0) {
            C0239D.H(obj);
            ri2Var = this.C;
            j21 value = ri2Var.getValue();
            if (value != null) {
                k21 k21Var = new k21(value);
                ci2 ci2Var = this.D;
                if (ci2Var != null) {
                    this.A = ri2Var;
                    this.B = 1;
                    if (ci2Var.c(k21Var, this) == va0Var) {
                        return va0Var;
                    }
                    ri2Var2 = ri2Var;
                }
                ri2Var.setValue(null);
            }
            return sd5.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri2Var2 = this.A;
        C0239D.H(obj);
        ri2Var = ri2Var2;
        ri2Var.setValue(null);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((l31) a(ua0Var, z80Var)).i(sd5.a);
    }
}
