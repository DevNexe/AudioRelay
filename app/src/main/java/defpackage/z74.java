package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
public final class z74 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ is4<kt2> C;
    public final /* synthetic */ OVbg<kt2, Bd_> D;

    public static final class CQf implements nz0<kt2> {
        public final /* synthetic */ OVbg<kt2, Bd_> w;
        public final /* synthetic */ ua0 x;

        public CQf(OVbg<kt2, Bd_> oVbg, ua0 ua0Var) {
            this.w = oVbg;
            this.x = ua0Var;
        }

        @Override // defpackage.nz0
        public final Object f(kt2 kt2Var, z80 z80Var) {
            long j = kt2Var.a;
            OVbg<kt2, Bd_> oVbg = this.w;
            boolean zW = X.w(oVbg.d().a);
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (zW && X.w(j)) {
                if (!(kt2.d(oVbg.d().a) == kt2.d(j))) {
                    qr4 qr4VarK0 = fp1.k0(this.x, null, 0, new a84(oVbg, j, null), 3);
                    return qr4VarK0 == va0Var ? qr4VarK0 : sd5.a;
                }
            }
            Object objE = oVbg.e(new kt2(j), z80Var);
            return objE == va0Var ? objE : sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<kt2> {
        public final /* synthetic */ is4<kt2> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(is4<kt2> is4Var) {
            super(0);
            this.w = is4Var;
        }

        @Override // defpackage.h81
        public final kt2 invoke() {
            Bd_ bd_ = w74.a;
            return new kt2(this.w.getValue().a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z74(is4<kt2> is4Var, OVbg<kt2, Bd_> oVbg, z80<? super z74> z80Var) {
        super(2, z80Var);
        this.C = is4Var;
        this.D = oVbg;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        z74 z74Var = new z74(this.C, this.D, z80Var);
        z74Var.B = obj;
        return z74Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            d24 d24VarH0 = ps0.h0(new QnHx(this.C));
            CQf cQf = new CQf(this.D, ua0Var);
            this.A = 1;
            if (d24VarH0.a(cQf, this) == va0Var) {
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
        return ((z74) a(ua0Var, z80Var)).i(sd5.a);
    }
}
