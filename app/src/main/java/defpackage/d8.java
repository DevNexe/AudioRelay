package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$1", f = "BallastViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class d8 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ v7<Object, Object, Object> B;

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$1$1", f = "BallastViewModelImpl.kt", l = {206, 207}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<Object, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ v7<Object, Object, Object> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(v7<Object, Object, Object> v7Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = v7Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            Object obj2;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            v7<Object, Object, Object> v7Var = this.C;
            if (i != 0) {
                if (i == 1) {
                    obj2 = this.B;
                    C0239D.H(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            obj2 = this.B;
            nj4 nj4Var = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var = v7Var.e;
            if (h81Var == null) {
                ur1.e("host");
                throw null;
            }
            n7.LPt9Fixed lPt9 = new n7.LPt9Fixed(h81Var.invoke(), obj2);
            this.B = obj2;
            this.A = 1;
            if (nj4Var.f(lPt9, this) == va0Var) {
                return va0Var;
            }
            kotlinx.coroutines.flow.QnHx qnHx = v7Var.h;
            this.B = null;
            this.A = 2;
            qnHx.setValue(obj2);
            if (sd5.a == va0Var) {
                return va0Var;
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(Object obj, z80<? super sd5> z80Var) {
            return ((QnHx) a(obj, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(v7<Object, Object, Object> v7Var, z80<? super d8> z80Var) {
        super(2, z80Var);
        this.B = v7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        d8 d8Var = new d8(this.B, z80Var);
        d8Var.A = obj;
        return d8Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.A;
        v7<Object, Object, Object> v7Var = this.B;
        kd.r(new r01(new QnHx(v7Var, null), v7Var.g), ua0Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((d8) a(ua0Var, z80Var)).i(sd5.a);
    }
}
