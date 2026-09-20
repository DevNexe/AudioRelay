package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1", f = "LazyListItemProviderImpl.kt", l = {54}, m = "invokeSuspend")
public final class r02 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ q12 B;
    public final /* synthetic */ ri2<pp1> C;

    public static final class CQf implements nz0<pp1> {
        public final /* synthetic */ ri2<pp1> w;

        public CQf(ri2<pp1> ri2Var) {
            this.w = ri2Var;
        }

        @Override // defpackage.nz0
        public final Object f(pp1 pp1Var, z80 z80Var) {
            this.w.setValue(pp1Var);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<pp1> {
        public final /* synthetic */ q12 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(q12 q12Var) {
            super(0);
            this.w = q12Var;
        }

        @Override // defpackage.h81
        public final pp1 invoke() {
            int iE = (this.w.e() / 30) * 30;
            return AY.V(Math.max(iE - 100, 0), iE + 30 + 100);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(q12 q12Var, ri2<pp1> ri2Var, z80<? super r02> z80Var) {
        super(2, z80Var);
        this.B = q12Var;
        this.C = ri2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new r02(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            d24 d24VarH0 = ps0.h0(new QnHx(this.B));
            CQf cQf = new CQf(this.C);
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
        return ((r02) a(ua0Var, z80Var)).i(sd5.a);
    }
}
