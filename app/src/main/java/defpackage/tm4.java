package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tm4 implements eo0 {
    public final j81<Float, sd5> a;
    public final kz2 b = ps0.R(Boolean.FALSE);
    public final um4 c = new um4(this);
    public final zi2 d = new zi2();

    @if0(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", l = {1156}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ vi2 C;
        public final /* synthetic */ x81<qn0, z80<? super sd5>, Object> D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(vi2 vi2Var, x81<? super qn0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = vi2Var;
            this.D = x81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return tm4.this.new QnHx(this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            tm4 tm4Var = tm4.this;
            if (i == 0) {
                C0239D.H(obj);
                tm4Var.b.setValue(Boolean.TRUE);
                um4 um4Var = tm4Var.c;
                this.A = 1;
                vi2 vi2Var = this.C;
                x81<qn0, z80<? super sd5>, Object> x81Var = this.D;
                zi2 zi2Var = tm4Var.d;
                zi2Var.getClass();
                if (fp1.R(new yi2(vi2Var, zi2Var, x81Var, um4Var, null), this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            tm4Var.b.setValue(Boolean.FALSE);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public tm4(zm4 zm4Var) {
        this.a = zm4Var;
    }

    @Override // defpackage.eo0
    public final Object a(vi2 vi2Var, x81<? super qn0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(vi2Var, x81Var, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }
}
