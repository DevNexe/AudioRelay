package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyHandleInput$2", f = "BallastViewModelImpl.kt", l = {324, 329, 331}, m = "invokeSuspend")
public final class a8 extends px4 implements x81<ua0, z80<? super Boolean>, Object> {
    public go1 A;
    public int B;
    public final /* synthetic */ v7<Object, Object, Object> C;
    public final /* synthetic */ po1.QnHx D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ xw<sd5> F;

    public static final class CQf extends cx1 implements j81<fk4<Object, Object, Object>, sd5> {
        public final /* synthetic */ v7<Object, Object, Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(v7<Object, Object, Object> v7Var) {
            super(1);
            this.w = v7Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(fk4<Object, Object, Object> fk4Var) {
            fk4<Object, Object, Object> fk4Var2 = fk4Var;
            v7<Object, Object, Object> v7Var = this.w;
            nj4 nj4Var = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var = v7Var.e;
            if (h81Var == null) {
                ur1.e("host");
                throw null;
            }
            nj4Var.e(new n7.Xn1(h81Var.invoke(), fk4Var2.a));
            v7Var.j.H(fk4Var2);
            return sd5.a;
        }
    }

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$safelyHandleInput$2$handlerScope$1", f = "BallastViewModelImpl.kt", l = {315, 316}, m = "invokeSuspend")
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
            n7.YKK ykk = new n7.YKK(h81Var.invoke(), obj2);
            this.B = obj2;
            this.A = 1;
            if (nj4Var.f(ykk, this) == va0Var) {
                return va0Var;
            }
            NUlFixed nUl = v7Var.i;
            this.B = null;
            this.A = 2;
            if (nUl.p(obj2, this) == va0Var) {
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
    public a8(po1.QnHx qnHx, v7 v7Var, Object obj, z80 z80Var, xw xwVar) {
        super(2, z80Var);
        this.C = v7Var;
        this.D = qnHx;
        this.E = obj;
        this.F = xwVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new a8(this.D, this.C, this.E, z80Var, this.F);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        xw<sd5> xwVar;
        go1 go1Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        Object obj2 = this.E;
        v7<Object, Object, Object> v7Var = this.C;
        try {
            if (i != 0) {
                if (i == 1) {
                    go1Var = this.A;
                    C0239D.H(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                xwVar = this.F;
                if (xwVar != null) {
                    return Boolean.valueOf(xwVar.L(sd5.a));
                }
                return null;
            }
            C0239D.H(obj);
            go1Var = new go1(v7Var.b(), this.D, v7Var.g, new QnHx(v7Var, null), new CQf(v7Var));
            eo1<Object, Object, Object> eo1VarI = v7Var.i();
            this.A = go1Var;
            this.B = 1;
            if (eo1VarI.a(go1Var, obj2, this) == va0Var) {
                return va0Var;
            }
            go1Var.b.close();
            nj4 nj4Var = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var = v7Var.e;
            if (h81Var == null) {
                ur1.e("host");
                throw null;
            }
            n7.EQ eq = new n7.EQ(h81Var.invoke(), obj2);
            this.A = null;
            this.B = 2;
            if (nj4Var.f(eq, this) == va0Var) {
                return va0Var;
            }
            xwVar = this.F;
            if (xwVar != null) {
                return Boolean.valueOf(xwVar.L(sd5.a));
            }
            return null;
        } catch (Throwable th) {
            nj4 nj4Var2 = v7Var.k;
            h81<? extends s7<Object, Object, Object>> h81Var2 = v7Var.e;
            if (h81Var2 == null) {
                ur1.e("host");
                throw null;
            }
            n7.FJCM fjcm = new n7.FJCM(h81Var2.invoke(), obj2, th);
            this.A = null;
            this.B = 3;
            if (nj4Var2.f(fjcm, this) == va0Var) {
                return va0Var;
            }
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super Boolean> z80Var) {
        return ((a8) a(ua0Var, z80Var)).i(sd5.a);
    }
}
