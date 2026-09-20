package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
public final class gy4 extends px4 implements y81<ua0, Float, z80<? super sd5>, Object> {
    public /* synthetic */ ua0 A;
    public /* synthetic */ float B;
    public final /* synthetic */ iy4<Object> C;

    @if0(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ iy4<Object> B;
        public final /* synthetic */ float C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(float f, iy4 iy4Var, z80 z80Var) {
            super(2, z80Var);
            this.B = iy4Var;
            this.C = f;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.C, this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                this.A = 1;
                iy4<Object> iy4Var = this.B;
                Object objA = iy4Var.j.a(new ky4(iy4Var, this.C), this);
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
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy4(iy4<Object> iy4Var, z80<? super gy4> z80Var) {
        super(3, z80Var);
        this.C = iy4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        fp1.k0(this.A, null, 0, new QnHx(this.B, this.C, null), 3);
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(ua0 ua0Var, Float f, z80<? super sd5> z80Var) {
        float fFloatValue = f.floatValue();
        gy4 gy4Var = new gy4(this.C, z80Var);
        gy4Var.A = ua0Var;
        gy4Var.B = fFloatValue;
        return gy4Var.i(sd5.a);
    }
}
