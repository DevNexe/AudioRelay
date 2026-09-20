package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {894}, m = "invokeSuspend")
public final class in4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ eo0 B;
    public final /* synthetic */ is4<j81<Float, sd5>> C;

    @if0(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<qn0, z80<? super sd5>, Object> {
        public /* synthetic */ Object A;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(z80Var);
            qnHx.A = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            ((qn0) this.A).a(0.0f);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(qn0 qn0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(qn0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public in4(eo0 eo0Var, is4<? extends j81<? super Float, sd5>> is4Var, z80<? super in4> z80Var) {
        super(2, z80Var);
        this.B = eo0Var;
        this.C = is4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new in4(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            vi2 vi2Var = vi2.UserInput;
            QnHx qnHx = new QnHx(null);
            this.A = 1;
            if (this.B.a(vi2Var, qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        this.C.getValue().invoke(new Float(0.0f));
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((in4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
