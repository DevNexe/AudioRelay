package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {298}, m = "invokeSuspend")
public final class u90 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ Cif B;
    public final /* synthetic */ x45 C;
    public final /* synthetic */ u45 D;
    public final /* synthetic */ p55 E;
    public final /* synthetic */ mt2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(Cif cif, x45 x45Var, u45 u45Var, p55 p55Var, mt2 mt2Var, z80<? super u90> z80Var) {
        super(2, z80Var);
        this.B = cif;
        this.C = x45Var;
        this.D = u45Var;
        this.E = p55Var;
        this.F = mt2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new u90(this.B, this.C, this.D, this.E, this.F, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        dl3 dl3Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            c25 c25Var = this.D.a;
            o55 o55Var = this.E.a;
            this.A = 1;
            int iB = this.F.b(s55.d(this.C.b));
            if (iB < o55Var.a.a.length()) {
                dl3Var = o55Var.b(iB);
            } else if (iB != 0) {
                dl3Var = o55Var.b(iB - 1);
            } else {
                dl3Var = new dl3(0.0f, 0.0f, 1.0f, sp1.b(u25.a(c25Var.b, c25Var.f, c25Var.g, u25.a, 1)));
            }
            Object objA = this.B.a(dl3Var, this);
            if (objA != va0Var) {
                objA = sd5.a;
            }
            if (objA == va0Var) {
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
        return ((u90) a(ua0Var, z80Var)).i(sd5.a);
    }
}
