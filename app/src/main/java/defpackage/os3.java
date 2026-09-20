package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
public final class os3 extends px4 implements x81<ua0, z80<? super ms1>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ ns3 B;

    @if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ns3 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(ns3 ns3Var, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = ns3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new CQf(this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                OVbg<Float, JW> oVbg = this.B.h;
                Float f = new Float(1.0f);
                nb5 nb5VarE = hH.E(225, 0, nq0.a, 2);
                this.A = 1;
                if (OVbg.c(oVbg, f, nb5VarE, null, this, 12) == va0Var) {
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

    @if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ns3 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ns3 ns3Var, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.B = ns3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new F1(this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                OVbg<Float, JW> oVbg = this.B.i;
                Float f = new Float(1.0f);
                nb5 nb5VarE = hH.E(225, 0, nq0.QnHx.a, 2);
                this.A = 1;
                if (OVbg.c(oVbg, f, nb5VarE, null, this, 12) == va0Var) {
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
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ns3 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ns3 ns3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = ns3Var;
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
                OVbg<Float, JW> oVbg = this.B.g;
                Float f = new Float(1.0f);
                nb5 nb5VarE = hH.E(75, 0, nq0.QnHx.a, 2);
                this.A = 1;
                if (OVbg.c(oVbg, f, nb5VarE, null, this, 12) == va0Var) {
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
    public os3(ns3 ns3Var, z80<? super os3> z80Var) {
        super(2, z80Var);
        this.B = ns3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        os3 os3Var = new os3(this.B, z80Var);
        os3Var.A = obj;
        return os3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.A;
        ns3 ns3Var = this.B;
        fp1.k0(ua0Var, null, 0, new QnHx(ns3Var, null), 3);
        fp1.k0(ua0Var, null, 0, new CQf(ns3Var, null), 3);
        return fp1.k0(ua0Var, null, 0, new F1(ns3Var, null), 3);
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super ms1> z80Var) {
        return ((os3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
