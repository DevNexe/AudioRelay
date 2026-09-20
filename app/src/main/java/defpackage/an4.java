package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", l = {204}, m = "invokeSuspend")
public final class an4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ tm4 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ h81<sd5> F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an4(tm4 tm4Var, float f, float f2, float f3, h81<sd5> h81Var, z80<? super an4> z80Var) {
        super(2, z80Var);
        this.B = tm4Var;
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new an4(this.B, this.C, this.D, this.E, this.F, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            float f = cn4.a;
            Object objA = this.B.a(vi2.Default, new en4(this.C, this.D, this.E, null), this);
            if (objA != obj2) {
                objA = sd5.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        h81<sd5> h81Var = this.F;
        if (h81Var != null) {
            h81Var.invoke();
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((an4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
