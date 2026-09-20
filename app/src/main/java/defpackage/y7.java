package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyHandleEvent$2", f = "BallastViewModelImpl.kt", l = {362, 365}, m = "invokeSuspend")
public final class y7 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public du0 A;
    public int B;
    public final /* synthetic */ v7<Object, Object, Object> C;
    public final /* synthetic */ bu0<Object, Object, Object> D;
    public final /* synthetic */ Object E;

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyHandleEvent$2$handlerScope$1", f = "BallastViewModelImpl.kt", l = {359}, m = "invokeSuspend")
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
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                Object obj2 = this.B;
                jo<ph3<Object, Object, Object>> joVar = this.C.f;
                ph3.QnHx qnHx = new ph3.QnHx(obj2);
                this.A = 1;
                if (joVar.p(qnHx, this) == va0Var) {
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
        public final Object invoke(Object obj, z80<? super sd5> z80Var) {
            return ((QnHx) a(obj, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(bu0 bu0Var, v7 v7Var, Object obj, z80 z80Var) {
        super(2, z80Var);
        this.C = v7Var;
        this.D = bu0Var;
        this.E = obj;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new y7(this.D, this.C, this.E, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        du0 du0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        Object obj2 = this.E;
        v7<Object, Object, Object> v7Var = this.C;
        if (i != 0) {
            if (i == 1) {
                du0Var = this.A;
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
        du0Var = new du0(v7Var.b(), new QnHx(v7Var, null));
        this.A = du0Var;
        this.B = 1;
        if (this.D.a(du0Var, obj2, this) == va0Var) {
            return va0Var;
        }
        du0Var.getClass();
        nj4 nj4Var = v7Var.k;
        h81<? extends s7<Object, Object, Object>> h81Var = v7Var.e;
        if (h81Var == null) {
            ur1.e("host");
            throw null;
        }
        n7.CQf cQf = new n7.CQf(h81Var.invoke(), obj2);
        this.A = null;
        this.B = 2;
        if (nj4Var.f(cQf, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((y7) a(ua0Var, z80Var)).i(sd5.a);
    }
}
