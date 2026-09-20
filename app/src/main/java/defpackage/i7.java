package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.BallastInterceptor$start$1", f = "BallastInterceptor.kt", l = {40}, m = "invokeSuspend")
public final class i7 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ mz0<n7<Object, Object, Object>> B;
    public final /* synthetic */ j7<Object, Object, Object> C;
    public final /* synthetic */ k7<Object, Object, Object> D;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ j7<Object, Object, Object> w;
        public final /* synthetic */ k7<Object, Object, Object> x;

        public QnHx(j7<Object, Object, Object> j7Var, k7<Object, Object, Object> k7Var) {
            this.w = j7Var;
            this.x = k7Var;
        }

        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) {
            this.x.b();
            sd5 sd5VarB = this.w.b((n7) obj);
            return sd5VarB == va0.COROUTINE_SUSPENDED ? sd5VarB : sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i7(mz0<? extends n7<Object, Object, Object>> mz0Var, j7<Object, Object, Object> j7Var, k7<Object, Object, Object> k7Var, z80<? super i7> z80Var) {
        super(2, z80Var);
        this.B = mz0Var;
        this.C = j7Var;
        this.D = k7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new i7(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            QnHx qnHx = new QnHx(this.C, this.D);
            this.A = 1;
            if (this.B.a(qnHx, this) == va0Var) {
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
        return ((i7) a(ua0Var, z80Var)).i(sd5.a);
    }
}
