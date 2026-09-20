package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
public final class ym4 extends px4 implements y81<ua0, Float, z80<? super sd5>, Object> {
    public /* synthetic */ float A;
    public final /* synthetic */ is4<j81<Float, sd5>> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ym4(is4<? extends j81<? super Float, sd5>> is4Var, z80<? super ym4> z80Var) {
        super(3, z80Var);
        this.B = is4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.B.getValue().invoke(new Float(this.A));
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(ua0 ua0Var, Float f, z80<? super sd5> z80Var) {
        float fFloatValue = f.floatValue();
        ym4 ym4Var = new ym4(this.B, z80Var);
        ym4Var.A = fFloatValue;
        return ym4Var.i(sd5.a);
    }
}
