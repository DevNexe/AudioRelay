package defpackage;

import androidx.compose.foundation.gestures.GestureCancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {882}, m = "invokeSuspend")
public final class hn4 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ float D;
    public final /* synthetic */ ri2<Float> E;
    public final /* synthetic */ is4<Float> F;
    public final /* synthetic */ ua0 G;
    public final /* synthetic */ eo0 H;
    public final /* synthetic */ is4<j81<Float, sd5>> I;

    public static final class CQf extends cx1 implements j81<kt2, sd5> {
        public final /* synthetic */ ua0 w;
        public final /* synthetic */ eo0 x;
        public final /* synthetic */ is4<j81<Float, sd5>> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(ua0 ua0Var, eo0 eo0Var, is4<? extends j81<? super Float, sd5>> is4Var) {
            super(1);
            this.w = ua0Var;
            this.x = eo0Var;
            this.y = is4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt2 kt2Var) {
            long j = kt2Var.a;
            fp1.k0(this.w, null, 0, new in4(this.x, this.y, null), 3);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {887}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nd3, kt2, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ nd3 B;
        public /* synthetic */ long C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ float E;
        public final /* synthetic */ ri2<Float> F;
        public final /* synthetic */ is4<Float> G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(boolean z, float f, ri2<Float> ri2Var, is4<Float> is4Var, z80<? super QnHx> z80Var) {
            super(3, z80Var);
            this.D = z;
            this.E = f;
            this.F = ri2Var;
            this.G = is4Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            ri2<Float> ri2Var = this.F;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    nd3 nd3Var = this.B;
                    long j = this.C;
                    ri2Var.setValue(new Float((this.D ? this.E - kt2.c(j) : kt2.c(j)) - this.G.getValue().floatValue()));
                    this.A = 1;
                    if (nd3Var.u0(this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
            } catch (GestureCancellationException unused) {
                ri2Var.setValue(new Float(0.0f));
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nd3 nd3Var, kt2 kt2Var, z80<? super sd5> z80Var) {
            long j = kt2Var.a;
            QnHx qnHx = new QnHx(this.D, this.E, this.F, this.G, z80Var);
            qnHx.B = nd3Var;
            qnHx.C = j;
            return qnHx.i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hn4(boolean z, float f, ri2<Float> ri2Var, is4<Float> is4Var, ua0 ua0Var, eo0 eo0Var, is4<? extends j81<? super Float, sd5>> is4Var2, z80<? super hn4> z80Var) {
        super(2, z80Var);
        this.C = z;
        this.D = f;
        this.E = ri2Var;
        this.F = is4Var;
        this.G = ua0Var;
        this.H = eo0Var;
        this.I = is4Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        hn4 hn4Var = new hn4(this.C, this.D, this.E, this.F, this.G, this.H, this.I, z80Var);
        hn4Var.B = obj;
        return hn4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.C, this.D, this.E, this.F, null);
            CQf cQf = new CQf(this.G, this.H, this.I);
            this.A = 1;
            if (p05.d(l93Var, qnHx, cQf, this, 3) == va0Var) {
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
    public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
        return ((hn4) a(l93Var, z80Var)).i(sd5.a);
    }
}
