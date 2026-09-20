package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {121}, m = "invokeSuspend")
public final class em4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ dm4.QnHx B;
    public final /* synthetic */ long C;
    public final /* synthetic */ dm4 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(dm4.QnHx qnHx, long j, dm4 dm4Var, z80<? super em4> z80Var) {
        super(2, z80Var);
        this.B = qnHx;
        this.C = j;
        this.D = dm4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new em4(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        x81<? super sp1, ? super sp1, sd5> x81Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        dm4 dm4Var = this.D;
        dm4.QnHx qnHx = this.B;
        if (i == 0) {
            C0239D.H(obj);
            OVbg<sp1, Bd_> oVbg = qnHx.a;
            sp1 sp1Var = new sp1(this.C);
            Ah<sp1> ah = dm4Var.w;
            this.A = 1;
            obj = OVbg.c(oVbg, sp1Var, ah, null, this, 12);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        nSu nsu = (nSu) obj;
        if (nsu.b == 2 && (x81Var = dm4Var.y) != null) {
            x81Var.invoke(new sp1(qnHx.b), nsu.a.getValue());
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((em4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
