package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
public final class ly4 extends px4 implements x81<qn0, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ float B;
    public final /* synthetic */ iy4<Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly4(float f, iy4<Object> iy4Var, z80<? super ly4> z80Var) {
        super(2, z80Var);
        this.B = f;
        this.C = iy4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ly4 ly4Var = new ly4(this.B, this.C, z80Var);
        ly4Var.A = obj;
        return ly4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        ((qn0) this.A).a(this.B - ((Number) this.C.g.getValue()).floatValue());
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(qn0 qn0Var, z80<? super sd5> z80Var) {
        return ((ly4) a(qn0Var, z80Var)).i(sd5.a);
    }
}
