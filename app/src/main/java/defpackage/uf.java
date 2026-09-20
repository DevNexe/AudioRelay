package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = {272}, m = "invokeSuspend")
public final class uf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ sf C;
    public final /* synthetic */ dl3 D;
    public final /* synthetic */ iy1 E;
    public final /* synthetic */ dl3 F;

    @if0(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", l = {267}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ sf B;
        public final /* synthetic */ dl3 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(sf sfVar, dl3 dl3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = sfVar;
            this.C = dl3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                qf qfVar = this.B.z;
                if (qfVar == null) {
                    ur1.e("responder");
                    throw null;
                }
                this.A = 1;
                if (qfVar.a(this.C, this) == va0Var) {
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
    public uf(sf sfVar, dl3 dl3Var, iy1 iy1Var, dl3 dl3Var2, z80<? super uf> z80Var) {
        super(2, z80Var);
        this.C = sfVar;
        this.D = dl3Var;
        this.E = iy1Var;
        this.F = dl3Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        uf ufVar = new uf(this.C, this.D, this.E, this.F, z80Var);
        ufVar.B = obj;
        return ufVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            sf sfVar = this.C;
            fp1.k0(ua0Var, null, 0, new QnHx(sfVar, this.F, null), 3);
            ff ffVar = sfVar.x;
            if (ffVar == null) {
                ffVar = sfVar.w;
            }
            this.A = 1;
            if (ffVar.a(this.D, this.E, this) == va0Var) {
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
        return ((uf) a(ua0Var, z80Var)).i(sd5.a);
    }
}
