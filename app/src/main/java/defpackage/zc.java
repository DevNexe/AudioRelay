package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.core.BootstrapInterceptor$start$1", f = "BootstrapInterceptor.kt", l = {24, 27, 30}, m = "invokeSuspend")
public final class zc extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ mz0<n7<Object, Object, Object>> B;
    public final /* synthetic */ ad<Object, Object, Object> C;
    public final /* synthetic */ k7<Object, Object, Object> D;

    public static final class QnHx implements mz0<Object> {
        public final /* synthetic */ mz0 w;

        /* JADX INFO: renamed from: zc$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0231QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: zc$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.copperleaf.ballast.core.BootstrapInterceptor$start$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "BootstrapInterceptor.kt", l = {224}, m = "emit")
            public static final class C0232QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0232QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return C0231QnHx.this.f(null, this);
                }
            }

            public C0231QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0232QnHx c0232QnHx;
                if (z80Var instanceof C0232QnHx) {
                    c0232QnHx = (C0232QnHx) z80Var;
                    int i = c0232QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0232QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0232QnHx = new C0232QnHx(z80Var);
                    }
                } else {
                    c0232QnHx = new C0232QnHx(z80Var);
                }
                Object obj2 = c0232QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0232QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    if (obj instanceof n7.SjP) {
                        c0232QnHx.A = 1;
                        if (this.w.f(obj, c0232QnHx) == va0Var) {
                            return va0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public QnHx(mz0 mz0Var) {
            this.w = mz0Var;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super Object> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new C0231QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc(mz0<? extends n7<Object, Object, Object>> mz0Var, ad<Object, Object, Object> adVar, k7<Object, Object, Object> k7Var, z80<? super zc> z80Var) {
        super(2, z80Var);
        this.B = mz0Var;
        this.C = adVar;
        this.D = k7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new zc(this.B, this.C, this.D, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ph3.QnHx qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                C0239D.H(obj);
            } else if (i == 2) {
                C0239D.H(obj);
                qnHx = new ph3.QnHx(obj);
                this.A = 3;
                if (this.D.Z(qnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        QnHx qnHx2 = new QnHx(this.B);
        this.A = 1;
        if (kd.l(qnHx2, this) == va0Var) {
            return va0Var;
        }
        j81<z80<? super Object>, Object> j81Var = this.C.a;
        this.A = 2;
        obj = j81Var.invoke(this);
        if (obj == va0Var) {
            return va0Var;
        }
        qnHx = new ph3.QnHx(obj);
        this.A = 3;
        if (this.D.Z(qnHx, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((zc) a(ua0Var, z80Var)).i(sd5.a);
    }
}
