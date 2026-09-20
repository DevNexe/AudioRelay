package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p24 {

    @if0(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", l = {73}, m = "save")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public ve1 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return p24.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ve1 ve1Var, z80<? super ve1> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objP = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(objP);
            fk fkVarD = ve1Var.e().d();
            qnHx.z = ve1Var;
            qnHx.B = 1;
            objP = fkVarD.p(Long.MAX_VALUE, qnHx);
            if (objP == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ve1Var = qnHx.z;
            C0239D.H(objP);
        }
        return new q24(ve1Var.w, ve1Var.d(), ve1Var.e(), ac.h((hk) objP));
    }
}
