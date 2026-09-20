package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a74 implements yg2 {
    public static final a74 w = new a74();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @if0(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
    public static final class QnHx<R> extends px4 implements x81<ua0, z80<? super R>, Object> {
        public int A;
        public final /* synthetic */ j81<Long, R> B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super Long, ? extends R> j81Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                this.A = 1;
                if (S12N.e(16L, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return this.B.invoke(new Long(System.nanoTime()));
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, Object obj) {
            return ((QnHx) a(ua0Var, (z80) obj)).i(sd5.a);
        }
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1 getKey() {
        return yg2.QnHx.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }

    @Override // defpackage.yg2
    public final <R> Object z(j81<? super Long, ? extends R> j81Var, z80<? super R> z80Var) {
        qh0 qh0Var = rl0.a;
        return fp1.D0(n72.a, new QnHx(j81Var, null), z80Var);
    }
}
