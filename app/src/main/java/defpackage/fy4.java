package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
public final class fy4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ iy4<Object> B;
    public final /* synthetic */ Map<Float, Object> C;
    public final /* synthetic */ lp3 D;
    public final /* synthetic */ ij0 E;
    public final /* synthetic */ x81<Object, Object, m75> F;
    public final /* synthetic */ float G;

    public static final class QnHx extends cx1 implements x81<Float, Float, Float> {
        public final /* synthetic */ Map<Float, Object> w;
        public final /* synthetic */ x81<Object, Object, m75> x;
        public final /* synthetic */ ij0 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Map<Float, Object> map, x81<Object, Object, ? extends m75> x81Var, ij0 ij0Var) {
            super(2);
            this.w = map;
            this.x = x81Var;
            this.y = ij0Var;
        }

        @Override // defpackage.x81
        public final Float invoke(Float f, Float f2) {
            float fFloatValue = f.floatValue();
            float fFloatValue2 = f2.floatValue();
            Float fValueOf = Float.valueOf(fFloatValue);
            Map<Float, Object> map = this.w;
            return Float.valueOf(this.x.invoke(t92.P(fValueOf, map), t92.P(Float.valueOf(fFloatValue2), map)).a(this.y, fFloatValue, fFloatValue2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fy4(iy4<Object> iy4Var, Map<Float, Object> map, lp3 lp3Var, ij0 ij0Var, x81<Object, Object, ? extends m75> x81Var, float f, z80<? super fy4> z80Var) {
        super(2, z80Var);
        this.B = iy4Var;
        this.C = map;
        this.D = lp3Var;
        this.E = ij0Var;
        this.F = x81Var;
        this.G = f;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new fy4(this.B, this.C, this.D, this.E, this.F, this.G, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            iy4<Object> iy4Var = this.B;
            Map<Float, ? extends Object> map = (Map) iy4Var.i.getValue();
            kz2 kz2Var = iy4Var.i;
            Map<Float, ? extends Object> map2 = this.C;
            kz2Var.setValue(map2);
            iy4Var.o.setValue(this.D);
            x81<Object, Object, m75> x81Var = this.F;
            ij0 ij0Var = this.E;
            iy4Var.m.setValue(new QnHx(map2, x81Var, ij0Var));
            iy4Var.n.setValue(Float.valueOf(ij0Var.b0(this.G)));
            this.A = 1;
            if (iy4Var.c(map, map2, this) == va0Var) {
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
        return ((fy4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
