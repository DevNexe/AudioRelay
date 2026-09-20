package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u01 implements mz0<Object> {
    public final /* synthetic */ mz0[] w;
    public final /* synthetic */ a91 x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nz0<Object>, Object[], z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ nz0 B;
        public /* synthetic */ Object[] C;
        public final /* synthetic */ a91 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(z80 z80Var, a91 a91Var) {
            super(3, z80Var);
            this.D = a91Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            nz0 nz0Var;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i != 0) {
                if (i == 1) {
                    nz0Var = this.B;
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
            nz0Var = this.B;
            Object[] objArr = this.C;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            this.B = nz0Var;
            this.A = 1;
            obj = this.D.I(obj2, obj3, obj4, this);
            if (obj == va0Var) {
                return va0Var;
            }
            this.B = null;
            this.A = 2;
            if (nz0Var.f(obj, this) == va0Var) {
                return va0Var;
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nz0<Object> nz0Var, Object[] objArr, z80<? super sd5> z80Var) {
            QnHx qnHx = new QnHx(z80Var, this.D);
            qnHx.B = nz0Var;
            qnHx.C = objArr;
            return qnHx.i(sd5.a);
        }
    }

    public u01(mz0[] mz0VarArr, a91 a91Var) {
        this.w = mz0VarArr;
        this.x = a91Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80 z80Var) throws Throwable {
        Object objE = qLd.e(z80Var, y01.w, new QnHx(null, this.x), nz0Var, this.w);
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }
}
