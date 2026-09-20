package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
public final class up4 extends px4 implements x81<qe3<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ la0 C;
    public final /* synthetic */ mz0<Object> D;

    @if0(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ mz0<Object> B;
        public final /* synthetic */ qe3<Object> C;

        public static final class QnHx implements nz0<Object> {
            public final /* synthetic */ qe3<Object> w;

            public QnHx(qe3<Object> qe3Var) {
                this.w = qe3Var;
            }

            @Override // defpackage.nz0
            public final Object f(Object obj, z80<? super sd5> z80Var) {
                this.w.setValue(obj);
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(mz0<Object> mz0Var, qe3<Object> qe3Var, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = mz0Var;
            this.C = qe3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new CQf(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                QnHx qnHx = new QnHx(this.C);
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
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx implements nz0<Object> {
        public final /* synthetic */ qe3<Object> w;

        public QnHx(qe3<Object> qe3Var) {
            this.w = qe3Var;
        }

        @Override // defpackage.nz0
        public final Object f(Object obj, z80<? super sd5> z80Var) {
            this.w.setValue(obj);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up4(la0 la0Var, mz0<Object> mz0Var, z80<? super up4> z80Var) {
        super(2, z80Var);
        this.C = la0Var;
        this.D = mz0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        up4 up4Var = new up4(this.C, this.D, z80Var);
        up4Var.B = obj;
        return up4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            qe3 qe3Var = (qe3) this.B;
            xr0 xr0Var = xr0.w;
            la0 la0Var = this.C;
            boolean zA = ur1.a(la0Var, xr0Var);
            mz0<Object> mz0Var = this.D;
            if (zA) {
                QnHx qnHx = new QnHx(qe3Var);
                this.A = 1;
                if (mz0Var.a(qnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                CQf cQf = new CQf(mz0Var, qe3Var, null);
                this.A = 2;
                if (fp1.D0(la0Var, cQf, this) == va0Var) {
                    return va0Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(qe3<Object> qe3Var, z80<? super sd5> z80Var) {
        return ((up4) a(qe3Var, z80Var)).i(sd5.a);
    }
}
