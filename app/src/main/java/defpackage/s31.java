package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {152, 156}, m = "invokeSuspend")
public final class s31 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public Object A;
    public int B;
    public final /* synthetic */ ri2<j21> C;
    public final /* synthetic */ ci2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(ci2 ci2Var, ri2 ri2Var, z80 z80Var) {
        super(2, z80Var);
        this.C = ri2Var;
        this.D = ci2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new s31(this.D, this.C, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ri2<j21> ri2Var;
        j21 j21Var;
        j21 j21Var2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        ci2 ci2Var = this.D;
        ri2<j21> ri2Var2 = this.C;
        if (i != 0) {
            if (i == 1) {
                ri2Var = (ri2) this.A;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j21Var2 = (j21) this.A;
                C0239D.H(obj);
            }
            j21Var = j21Var2;
            ri2Var2.setValue(j21Var);
            return sd5.a;
        }
        C0239D.H(obj);
        j21 value = ri2Var2.getValue();
        if (value != null) {
            k21 k21Var = new k21(value);
            if (ci2Var != null) {
                this.A = ri2Var2;
                this.B = 1;
                if (ci2Var.c(k21Var, this) == va0Var) {
                    return va0Var;
                }
            }
            ri2Var = ri2Var2;
        } else {
            j21Var = new j21();
            if (ci2Var != null) {
                this.A = j21Var;
                this.B = 2;
                if (ci2Var.c(j21Var, this) == va0Var) {
                    return va0Var;
                }
                j21Var2 = j21Var;
                j21Var = j21Var2;
            }
        }
        ri2Var2.setValue(j21Var);
        return sd5.a;
        ri2Var.setValue(null);
        j21Var = new j21();
        if (ci2Var != null) {
            this.A = j21Var;
            this.B = 2;
            if (ci2Var.c(j21Var, this) == va0Var) {
                return va0Var;
            }
            j21Var2 = j21Var;
            j21Var = j21Var2;
        }
        ri2Var2.setValue(j21Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((s31) a(ua0Var, z80Var)).i(sd5.a);
    }
}
