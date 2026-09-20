package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$2", f = "BallastViewModelImpl.kt", l = {234}, m = "invokeSuspend")
public final class f8 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ v7<Object, Object, Object> B;

    public static final class CQf implements mz0<ph3<Object, Object, Object>> {
        public final /* synthetic */ mz0 w;
        public final /* synthetic */ v7 x;

        public static final class QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;
            public final /* synthetic */ v7 x;

            /* JADX INFO: renamed from: f8$CQf$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$2$invokeSuspend$$inlined$filter$1$2", f = "BallastViewModelImpl.kt", l = {224, 224}, m = "emit")
            public static final class C0125QnHx extends b90 {
                public int A;
                public Object B;
                public nz0 C;
                public /* synthetic */ Object z;

                public C0125QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return QnHx.this.f(null, this);
                }
            }

            public QnHx(nz0 nz0Var, v7 v7Var) {
                this.w = nz0Var;
                this.x = v7Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0125QnHx c0125QnHx;
                Object obj2;
                nz0 nz0Var;
                if (z80Var instanceof C0125QnHx) {
                    c0125QnHx = (C0125QnHx) z80Var;
                    int i = c0125QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0125QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0125QnHx = new C0125QnHx(z80Var);
                    }
                } else {
                    c0125QnHx = new C0125QnHx(z80Var);
                }
                Object objJ = c0125QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0125QnHx.A;
                if (i2 != 0) {
                    if (i2 == 1) {
                        nz0 nz0Var2 = c0125QnHx.C;
                        obj2 = c0125QnHx.B;
                        C0239D.H(objJ);
                        nz0Var = nz0Var2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(objJ);
                    }
                    return sd5.a;
                }
                C0239D.H(objJ);
                c0125QnHx.B = obj;
                nz0 nz0Var3 = this.w;
                c0125QnHx.C = nz0Var3;
                c0125QnHx.A = 1;
                objJ = v7.j(this.x, (ph3) obj, c0125QnHx);
                if (objJ == va0Var) {
                    return va0Var;
                }
                obj2 = obj;
                nz0Var = nz0Var3;
                if (((Boolean) objJ).booleanValue()) {
                    c0125QnHx.B = null;
                    c0125QnHx.C = null;
                    c0125QnHx.A = 2;
                    if (nz0Var.f(obj2, c0125QnHx) == va0Var) {
                        return va0Var;
                    }
                }
                return sd5.a;
            }
        }

        public CQf(ko koVar, v7 v7Var) {
            this.w = koVar;
            this.x = v7Var;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super ph3<Object, Object, Object>> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$2$inputStrategyScope$1", f = "BallastViewModelImpl.kt", l = {223}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<ph3<Object, Object, Object>, po1.QnHx, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ ph3 B;
        public /* synthetic */ po1.QnHx C;
        public final /* synthetic */ v7<Object, Object, Object> D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(v7<Object, Object, Object> v7Var, z80<? super QnHx> z80Var) {
            super(3, z80Var);
            this.D = v7Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ph3 ph3Var = this.B;
                po1.QnHx qnHx = this.C;
                boolean z = ph3Var instanceof ph3.QnHx;
                v7<Object, Object, Object> v7Var = this.D;
                if (z) {
                    ph3.QnHx qnHx2 = (ph3.QnHx) ph3Var;
                    Inputs inputs = qnHx2.b;
                    this.B = null;
                    this.A = 1;
                    if (v7.l(qnHx, v7Var, inputs, this, qnHx2.a) == va0Var) {
                        return va0Var;
                    }
                } else if (ph3Var instanceof ph3.CQf) {
                    kotlinx.coroutines.flow.QnHx qnHx3 = v7Var.g;
                    ph3.CQf cQf = (ph3.CQf) ph3Var;
                    cQf.getClass();
                    qnHx3.setValue(null);
                    cQf.getClass();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(ph3<Object, Object, Object> ph3Var, po1.QnHx qnHx, z80<? super sd5> z80Var) {
            QnHx qnHx2 = new QnHx(this.D, z80Var);
            qnHx2.B = ph3Var;
            qnHx2.C = qnHx;
            return qnHx2.i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(v7<Object, Object, Object> v7Var, z80<? super f8> z80Var) {
        super(2, z80Var);
        this.B = v7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new f8(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            v7<Object, Object, Object> v7Var = this.B;
            mz0 mz0VarO = kd.o(new CQf(kd.t(v7Var.f), v7Var), v7Var.c());
            ro1 ro1Var = new ro1(new QnHx(v7Var, null));
            po1<Object, Object, Object> po1VarH = v7Var.a.h();
            this.A = 1;
            if (po1VarH.b(ro1Var, mz0VarO, this) == va0Var) {
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
        return ((f8) a(ua0Var, z80Var)).i(sd5.a);
    }
}
