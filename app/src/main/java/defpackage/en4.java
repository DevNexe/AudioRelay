package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {927}, m = "invokeSuspend")
public final class en4 extends px4 implements x81<qn0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;

    public static final class QnHx extends cx1 implements j81<OVbg<Float, JW>, sd5> {
        public final /* synthetic */ qn0 w;
        public final /* synthetic */ gl3 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(qn0 qn0Var, gl3 gl3Var) {
            super(1);
            this.w = qn0Var;
            this.x = gl3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(OVbg<Float, JW> oVbg) {
            OVbg<Float, JW> oVbg2 = oVbg;
            float fFloatValue = oVbg2.d().floatValue();
            gl3 gl3Var = this.x;
            this.w.a(fFloatValue - gl3Var.w);
            gl3Var.w = oVbg2.d().floatValue();
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en4(float f, float f2, float f3, z80<? super en4> z80Var) {
        super(2, z80Var);
        this.C = f;
        this.D = f2;
        this.E = f3;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        en4 en4Var = new en4(this.C, this.D, this.E, z80Var);
        en4Var.B = obj;
        return en4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            qn0 qn0Var = (qn0) this.B;
            gl3 gl3Var = new gl3();
            float f = this.C;
            gl3Var.w = f;
            OVbg oVbgA = ps0.a(f);
            Float f2 = new Float(this.D);
            nb5<Float> nb5Var = cn4.g;
            Float f3 = new Float(this.E);
            QnHx qnHx = new QnHx(qn0Var, gl3Var);
            this.A = 1;
            if (oVbgA.b(f2, nb5Var, f3, qnHx, this) == va0Var) {
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
    public final Object invoke(qn0 qn0Var, z80<? super sd5> z80Var) {
        return ((en4) a(qn0Var, z80Var)).i(sd5.a);
    }
}
