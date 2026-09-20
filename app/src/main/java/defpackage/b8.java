package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyStartSideJob$6", f = "BallastViewModelImpl.kt", l = {415, 418, 429, 432, 434}, m = "invokeSuspend")
public final class b8 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ v7<Object, Object, Object> B;
    public final /* synthetic */ String C;
    public final /* synthetic */ gk4.QnHx D;
    public final /* synthetic */ g04<Object, Object, Object> E;

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyStartSideJob$6$1", f = "BallastViewModelImpl.kt", l = {427}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ v7<Object, Object, Object> C;
        public final /* synthetic */ gk4.QnHx D;
        public final /* synthetic */ g04<Object, Object, Object> E;

        @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyStartSideJob$6$1$sideJobScope$2", f = "BallastViewModelImpl.kt", l = {422}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<Object, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ v7<Object, Object, Object> C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(v7<Object, Object, Object> v7Var, z80<? super CQf> z80Var) {
                super(2, z80Var);
                this.C = v7Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                CQf cQf = new CQf(this.C, z80Var);
                cQf.B = obj;
                return cQf;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    Object obj2 = this.B;
                    NUlFixed nUl = this.C.i;
                    this.A = 1;
                    if (nUl.p(obj2, this) == va0Var) {
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
                return ((CQf) a(obj, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: b8$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyStartSideJob$6$1$sideJobScope$1", f = "BallastViewModelImpl.kt", l = {421}, m = "invokeSuspend")
        public static final class C0046QnHx extends px4 implements x81<Object, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ v7<Object, Object, Object> C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0046QnHx(v7<Object, Object, Object> v7Var, z80<? super C0046QnHx> z80Var) {
                super(2, z80Var);
                this.C = v7Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0046QnHx c0046QnHx = new C0046QnHx(this.C, z80Var);
                c0046QnHx.B = obj;
                return c0046QnHx;
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
                return ((C0046QnHx) a(obj, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(v7<Object, Object, Object> v7Var, gk4.QnHx qnHx, g04<Object, Object, Object> g04Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = v7Var;
            this.D = qnHx;
            this.E = g04Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, this.E, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var = (ua0) this.B;
                v7<Object, Object, Object> v7Var = this.C;
                hk4 hk4Var = new hk4(v7Var.b(), new C0046QnHx(v7Var, null), new CQf(v7Var, null), v7Var.g.getValue(), ua0Var);
                x81<gk4<Object, Object, Object>, z80<? super sd5>, Object> x81Var = this.E.a;
                this.A = 1;
                if (x81Var.invoke(hk4Var, this) == va0Var) {
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
    public b8(v7<Object, Object, Object> v7Var, String str, gk4.QnHx qnHx, g04<Object, Object, Object> g04Var, z80<? super b8> z80Var) {
        super(2, z80Var);
        this.B = v7Var;
        this.C = str;
        this.D = qnHx;
        this.E = g04Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new b8(this.B, this.C, this.D, this.E, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x0084, CancellationException -> 0x00a3, TryCatch #2 {CancellationException -> 0x00a3, all -> 0x0084, blocks: (B:13:0x002c, B:14:0x0031, B:25:0x0066, B:27:0x006e, B:30:0x0080, B:31:0x0083, B:22:0x0056), top: B:51:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[Catch: all -> 0x0084, CancellationException -> 0x00a3, TryCatch #2 {CancellationException -> 0x00a3, all -> 0x0084, blocks: (B:13:0x002c, B:14:0x0031, B:25:0x0066, B:27:0x006e, B:30:0x0080, B:31:0x0083, B:22:0x0056), top: B:51:0x0012 }] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nj4 nj4Var;
        n7.MZ mz;
        h81<? extends s7<Object, Object, Object>> h81Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        String str = this.C;
        gk4.QnHx qnHx = this.D;
        v7<Object, Object, Object> v7Var = this.B;
        try {
            if (i != 0) {
                if (i == 1) {
                    C0239D.H(obj);
                } else if (i == 2) {
                    C0239D.H(obj);
                    nj4Var = v7Var.k;
                    h81Var = v7Var.e;
                    if (h81Var != null) {
                        ur1.e("host");
                        throw null;
                    }
                    mz = new n7.MZ(h81Var.invoke(), str, qnHx);
                    this.A = 3;
                    if (nj4Var.f(mz, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 3 && i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            nj4 nj4Var2 = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var2 = v7Var.e;
            if (h81Var2 == null) {
                ur1.e("host");
                throw null;
            }
            n7.ta taVar = new n7.ta(h81Var2.invoke(), str, qnHx);
            this.A = 1;
            if (nj4Var2.f(taVar, this) == va0Var) {
                return va0Var;
            }
            QnHx qnHx2 = new QnHx(v7Var, qnHx, this.E, null);
            this.A = 2;
            if (fp1.R(qnHx2, this) == va0Var) {
                return va0Var;
            }
            nj4Var = v7Var.k;
            h81Var = v7Var.e;
            if (h81Var != null) {
                ur1.e("host");
                throw null;
            }
            mz = new n7.MZ(h81Var.invoke(), str, qnHx);
            this.A = 3;
            if (nj4Var.f(mz, this) == va0Var) {
                return va0Var;
            }
            return sd5.a;
        } catch (CancellationException unused) {
            nj4 nj4Var3 = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var3 = v7Var.e;
            if (h81Var3 == null) {
                ur1.e("host");
                throw null;
            }
            n7.RBi rBi = new n7.RBi(h81Var3.invoke(), str, qnHx);
            this.A = 4;
            if (nj4Var3.f(rBi, this) == va0Var) {
                return va0Var;
            }
        } catch (Throwable th) {
            nj4 nj4Var4 = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var4 = v7Var.e;
            if (h81Var4 == null) {
                ur1.e("host");
                throw null;
            }
            n7.LPt6Fixed lPt6 = new n7.LPt6Fixed(h81Var4.invoke(), str, qnHx, th);
            this.A = 5;
            if (nj4Var4.f(lPt6, this) == va0Var) {
                return va0Var;
            }
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((b8) a(ua0Var, z80Var)).i(sd5.a);
    }
}
