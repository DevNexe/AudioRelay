package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$initialize$5", f = "PremiumInputHandler.kt", l = {145, 145}, m = "invokeSuspend")
public final class fc3 extends px4 implements x81<nz0<? super String>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc3(uc3 uc3Var, z80<? super fc3> z80Var) {
        super(2, z80Var);
        this.C = uc3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        fc3 fc3Var = new fc3(this.C, z80Var);
        fc3Var.B = obj;
        return fc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nz0Var = (nz0) this.B;
        this.B = nz0Var;
        this.A = 1;
        obj = uc3.c(this.C, this);
        if (obj == va0Var) {
            return va0Var;
        }
        this.B = null;
        this.A = 2;
        if (nz0Var.f(obj, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super String> nz0Var, z80<? super sd5> z80Var) {
        return ((fc3) a(nz0Var, z80Var)).i(sd5.a);
    }
}
