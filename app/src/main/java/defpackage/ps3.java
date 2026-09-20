package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
public final class ps3 extends px4 implements x81<ua0, z80<? super ms1>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ ns3 B;

    @if0(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
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
                Float f = new Float(0.0f);
                nb5 nb5VarE = hH.E(150, 0, nq0.QnHx.a, 2);
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
    public ps3(ns3 ns3Var, z80<? super ps3> z80Var) {
        super(2, z80Var);
        this.B = ns3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ps3 ps3Var = new ps3(this.B, z80Var);
        ps3Var.A = obj;
        return ps3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return fp1.k0((ua0) this.A, null, 0, new QnHx(this.B, null), 3);
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super ms1> z80Var) {
        return ((ps3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
